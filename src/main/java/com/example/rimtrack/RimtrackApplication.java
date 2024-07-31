package com.example.rimtrack;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.example.rimtrack.entity.MapPoint;
import com.example.rimtrack.repository.MapPointRepository;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class RimtrackApplication {
	@Bean
	CommandLineRunner runner(MapPointRepository mapPointRepository) {
		return args -> {

			MapPoint point1 = new MapPoint("branche 1", "au sain GM-SOFT", "POI", 31.6341, -8.0024); // Casablanca
MapPoint point2 = new MapPoint("branche 2", "au sain GM-SOFT", "Nature", 34.0181, -6.8326); // Marrakech
MapPoint point3 = new MapPoint("branche 3", "au sain GM-SOFT", "Boutique", 33.5731, -7.5898); // Rabat
MapPoint point4 = new MapPoint("branche 4", "au sain GM-SOFT", "POI", 32.3373, -6.3534); // beni mellal
mapPointRepository.save(point1);
			mapPointRepository.save(point2);
			mapPointRepository.save(point3);
			mapPointRepository.save(point4);

		};
	}
	public static void main(String[] args) {
		SpringApplication.run(RimtrackApplication.class, args);
		//BCryptPasswordEncoder bCryptPasswordEncoder=new BCryptPasswordEncoder();
		//String password= bCryptPasswordEncoder.encode("fayssal2003");//encrypt password
		//System.out.println(password);
	}

}
