package com.example.rimtrack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.rimtrack.entity.DocumentCirculation;
import com.example.rimtrack.repository.DocumentCirculationRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/documents")
public class DocumentCirculationController {

    @Autowired
    private DocumentCirculationRepository documentCirculationRepository;

    @GetMapping("/getAllDocuments")
    public ResponseEntity<List<DocumentCirculation>> getAllDocuments() {
        List<DocumentCirculation> documents = documentCirculationRepository.findAll();
        return ResponseEntity.ok(documents);
    }

    @GetMapping("/getDocumentById/{id}")
    public ResponseEntity<DocumentCirculation> getDocumentById(@PathVariable("id") Long id) {
        Optional<DocumentCirculation> optionalDocument = documentCirculationRepository.findById(id);
        if (optionalDocument.isPresent()) {
            return ResponseEntity.ok(optionalDocument.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/createDocument")
    public ResponseEntity<DocumentCirculation> createDocument(@RequestBody DocumentCirculation document) {
        DocumentCirculation createdDocument = documentCirculationRepository.save(document);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdDocument);
    }

    @PutMapping("/updateDocument/{id}")
    public ResponseEntity<DocumentCirculation> updateDocument(@PathVariable("id") Long id, @RequestBody DocumentCirculation updatedDocument) {
        Optional<DocumentCirculation> optionalDocument = documentCirculationRepository.findById(id);
        if (optionalDocument.isPresent()) {
            DocumentCirculation existingDocument = optionalDocument.get();
            existingDocument.setDocumentNumber(updatedDocument.getDocumentNumber());
            existingDocument.setIssuingAuthority(updatedDocument.getIssuingAuthority());

            DocumentCirculation savedDocument = documentCirculationRepository.save(existingDocument);
            return ResponseEntity.ok(savedDocument);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/deleteDocument/{id}")
    public ResponseEntity<Void> deleteDocument(@PathVariable("id") Long id) {
        Optional<DocumentCirculation> optionalDocument = documentCirculationRepository.findById(id);
        if (optionalDocument.isPresent()) {
            documentCirculationRepository.delete(optionalDocument.get());
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}

