# E-Bank Application

## Description

La digitalisation des services bancaires est devenue incontournable pour offrir aux clients une expérience fluide et accessible. Cette application e-bank vise à fournir une plateforme sécurisée et intuitive permettant aux utilisateurs de gérer leurs comptes bancaires et d'effectuer des opérations financières en ligne.

## Fonctionnalités

- Création de comptes bancaires
- Consultation des soldes et historiques de transactions
- Fermeture de comptes bancaires
- Consultation des informations de la carte bancaire
- Activation et désactivation de la carte bancaire
- Blocage de la carte bancaire en cas de perte ou de vol
- Transferts internes entre comptes du même utilisateur
- Transferts externes vers des comptes dans d'autres banques
- Gestion des bénéficiaires

## Prérequis

- Java 11 ou supérieur
- Maven
- MySQL
- Node.js et npm
- Angular CLI

## Installation

### Backend



 Accédez au répertoire du projet
    ```bash
    cd e-bank-backend
    ```

 Configurez la base de données dans `application.properties`
    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/ebank
    spring.datasource.username=root
    spring.datasource.password=root
    ```

 Compilez et démarrez le backend
    ```bash
    mvn clean install
    mvn spring-boot:run
    ```

### Frontend



## Utilisation

Accédez à `http://localhost:4200` dans votre navigateur pour utiliser l'application e-bank.

## Architecture

### Backend

- **Spring Boot** : Framework principal pour le backend
- **JPA/Hibernate** : Gestion des données
- **MySQL** : Base de données

### Frontend

- **Angular** : Framework principal pour le frontend
- **HTML/CSS** : Structure et style des pages
- **TypeScript** : Langage de programmation

## API Endpoints

### Comptes

- **GET /api/accounts** : Liste tous les comptes
- **POST /api/accounts** : Crée un nouveau compte
- **GET /api/accounts/{id}** : Récupère un compte par ID
- **DELETE /api/accounts/{id}** : Supprime un compte par ID

### Transactions

- **GET /api/transactions** : Liste toutes les transactions
- **POST /api/transactions** : Crée une nouvelle transaction
- **GET /api/transactions/{id}** : Récupère une transaction par ID

### Cartes Bancaires

- **GET /api/cards** : Liste toutes les cartes
- **POST /api/cards** : Crée une nouvelle carte
- **GET /api/cards/{id}** : Récupère une carte par ID
- **DELETE /api/cards/{id}** : Supprime une carte par ID

## Contributions

Les contributions sont les bienvenues ! Veuillez ouvrir une issue pour discuter de ce que vous aimeriez changer.

## Licence

Ce projet est sous licence MIT. Voir le fichier [LICENSE](LICENSE) pour plus de détails.

## Contact

mekayssi chaimaa - [mekayssichaimaaenaa@gmail.com]

Lien du projet : [https://github.com/chaimaaenaa/E-Bank-Solution.git]
