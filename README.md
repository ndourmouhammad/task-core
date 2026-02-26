# Task Core - Module Métier et Persistance

Ce projet est le module central (bibliothèque) de l'application **Mini Task Manager**. Il contient la logique métier et la couche d'accès aux données, et est conçu pour être injecté comme dépendance dans l'API principale.

##  Rôle dans l'architecture
Dans le cadre de notre pipeline CI/CD (Projet DevOps - L3GL), ce module est agnostique de toute interface web. Il gère uniquement :
* Les entités JPA (`Task`, `TaskStatus`).
* La communication avec la base de données MySQL (`TaskRepository`).
* Les règles de gestion et la logique métier (`TaskService`).

## Technologies
* **Java 17**
* **Spring Boot (Data JPA)**
* **MySQL Connector**
* **Lombok**
* **Maven** (Publication sur Nexus)

##  Versioning et Publication (Nexus)
Ce module suit un versioning strict (de `0.0.1-SNAPSHOT` à `0.3.0` RELEASE). Il n'est pas exécutable directement (pas de plugin Spring Boot Maven).

Pour compiler et publier ce module sur le gestionnaire d'artefacts local (Nexus) :
```bash
mvn clean install -DskipTests  # Installation en local
mvn deploy -DskipTests         # Publication sur Nexus