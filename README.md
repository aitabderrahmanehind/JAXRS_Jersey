# TP7-JAX-RS - Gestion de Comptes Bancaires

Ce projet est une application web basée sur Spring Boot qui expose une API RESTful pour la gestion de comptes bancaires. Il utilise JAX-RS avec l'implémentation Jersey pour la création des services web.

## Structure du Projet

Le projet est organisé de la manière suivante :

```
.
├── pom.xml                # Fichier de configuration Maven
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           └── tp7jaxrs
│   │   │               ├── tp7jaxRsApplication.java  # Classe principale de l'application Spring Boot
│   │   │               ├── Config
│   │   │               │   └── MyConfig.java         # Configuration de Jersey
│   │   │               ├── Controllers
│   │   │               │   └── CompteRestJaxRSAPI.java # Contrôleur REST JAX-RS
│   │   │               ├── entities
│   │   │               │   ├── Compte.java           # Entité JPA Compte
│   │   │               │   └── TypeCompte.java       # Enum pour le type de compte
│   │   │               └── repositories
│   │   │                   └── CompteRepository.java # Repository Spring Data JPA
│   │   └── resources
│   │       └── application.properties # Fichier de propriétés de l'application
│   └── test                     # Tests de l'application
...
```

## Fonctionnalités

L'application fournit des opérations CRUD (Create, Read, Update, Delete) pour la gestion des comptes bancaires.

### API Endpoints

L'API est accessible via le chemin de base `/banque`. Elle supporte les formats JSON et XML pour les requêtes et les réponses.

| Méthode HTTP | Endpoint                 | Description                               |
|--------------|--------------------------|-------------------------------------------|
| `GET`        | `/comptes`               | Récupérer la liste de tous les comptes.   |
| `GET`        | `/comptes/{id}`          | Récupérer un compte par son identifiant.  |
| `POST`       | `/comptes`               | Créer un nouveau compte.                  |
| `PUT`        | `/comptes/{id}`          | Mettre à jour un compte existant.         |
| `DELETE`     | `/comptes/{id}`          | Supprimer un compte par son identifiant.  |

#### Exemple de corps de requête (POST / PUT) en JSON :
```json
{
    "solde": 1500.75,
    "dateCreation": "2025-11-08",
    "type": "COURANT"
}
```

## Technologies Utilisées

- **Framework:** Spring Boot 3
- **Services Web:** JAX-RS (Jersey)
- **Accès aux données:** Spring Data JPA
- **Base de données:** H2 (In-Memory)
- **Serialization:** Jackson (JSON), JAXB (XML)
- **Utilitaires:** Lombok
- **Gestion de projet:** Maven

## Comment Exécuter le Projet

1.  **Prérequis:**
    - JDK 17 ou supérieur
    - Maven 3.6 ou supérieur

2.  **Cloner le dépôt :**
    ```bash
    git clone <url-du-depot>
    cd tp7jaxrs
    ```

3.  **Lancer l'application :**
    Vous pouvez lancer l'application en utilisant le wrapper Maven fourni :
    ```bash
    ./mvnw spring-boot:run
    ```
    Ou via votre IDE en exécutant la méthode `main` de la classe `tp7jaxRsApplication`.

4.  **Accéder à l'application :**
    L'application démarrera sur le port `8082`. Vous pouvez utiliser un client REST (comme Postman ou curl) pour interagir avec l'API aux endpoints listés ci-dessus.

    Par exemple, pour obtenir la liste des comptes :
    ```bash
    curl -X GET http://localhost:8082/banque/comptes
    ```
