# Sleekadmin Bootstrap 4 Template
Bootstrap 4, CSS 3, HTML 5, Material Design Admin dashboard template

### [View live demo](http://sleekadmin.surge.sh/Sleek/index.html)

# Preview

![Sleekadmin dashboard template preview](http://sleekadmin.surge.sh/img/heroImage.png)

# Overview
Sleekadmin is a full-featured, multipurpose, premium bootstrap admin template built with Bootstrap 4 Framework, HTML5, CSS and JQuery.

It is a fully responsive bootstrap admin dashboard template that comes with a huge collection of reusable UI components & plugins.

# Template Features:

- 4 Deferent Home Version
- Based on Bootstrap 4
- HTML5, CSS3, jQuery
- Fontawesome Icons
- Clean UI Elements
- Ecommerce friendly
- Vector maps
- JSGrid & Datatables


### Changelog 
#### V 1.0.0
Initial Release

### Author
Code resource [Techadam]


Pour lier les autres contrôleurs Spring Boot (CRUD) avec le tableau de bord Sleekadmin, vous devez effectuer les étapes suivantes :

Créez vos contrôleurs Spring Boot avec les opérations CRUD (Create, Read, Update, Delete) pour les entités que vous souhaitez gérer dans le tableau de bord.

Assurez-vous d'ajouter les dépendances nécessaires à votre projet Spring Boot pour la gestion des contrôleurs, telles que Spring MVC.

Créez les routes (endpoints) correspondantes dans vos contrôleurs pour gérer les différentes opérations CRUD. Par exemple, vous pouvez avoir des routes pour créer une entité, récupérer une entité par son ID, mettre à jour une entité et supprimer une entité.

Dans votre tableau de bord Sleekadmin, vous devez modifier le code HTML/CSS/JavaScript pour ajouter des liens ou des boutons qui correspondent aux différentes fonctionnalités CRUD que vous souhaitez exposer dans le tableau de bord.

Par exemple, vous pouvez ajouter un lien dans le menu de navigation du tableau de bord pour accéder à une page de liste des entités.
Sur la page de liste des entités, vous pouvez afficher les données récupérées à partir de votre contrôleur Spring Boot, en utilisant des boucles ou des appels AJAX pour récupérer les données et les afficher dans le tableau.
Utilisez des requêtes AJAX pour communiquer avec vos contrôleurs Spring Boot et effectuer les opérations CRUD. Par exemple, lorsque vous cliquez sur un bouton de suppression dans le tableau de bord, vous pouvez envoyer une requête AJAX au contrôleur correspondant pour supprimer l'entité.

Vous pouvez utiliser des bibliothèques JavaScript telles que jQuery ou Axios pour faciliter les requêtes AJAX.
Assurez-vous que votre application Spring Boot est en cours d'exécution et que vos contrôleurs sont correctement configurés avec les annotations appropriées, telles que @RestController pour les contrôleurs RESTful.

Testez votre application en accédant au tableau de bord Sleekadmin et en utilisant les fonctionnalités CRUD pour interagir avec vos contrôleurs Spring Boot.

Il est important de noter que la façon exacte de lier les contrôleurs Spring Boot avec le tableau de bord Sleekadmin peut varier en fonction de la structure de votre projet et des exigences spécifiques de votre application. Les étapes mentionnées ci-dessus vous donnent une idée générale de ce qui est impliqué pour lier les deux.