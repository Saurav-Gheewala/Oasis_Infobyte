# ATM Interface Project

## Technologies Used
- **Backend:** Spring Boot (Java)
- **Frontend:** React JS
- **Database:** MySQL

## Overview
This project is a secure ATM interface application developed during my internship as a Java Developer at **Oasis Infobyte**. The application handles various banking operations such as account creation, deposits, withdrawals, fund transfers, and transaction history viewing with a transaction accuracy of over 99%.

## Features
1. **User Account Creation**
   - Generates unique 10-digit account numbers.
   - Stores user details and PINs securely.

2. **Deposit Money**
   - Allows users to deposit money into their accounts.

3. **Withdraw Money**
   - Enables users to withdraw money from their accounts.

4. **Fund Transfer**
   - Users can transfer money to other accounts within the system.
   - Ensures the destination account exists before processing the transfer.

5. **Transaction History**
   - Users can view detailed logs of all their transactions.
   - Enhances transparency and account management.

## Security Measures
- **Transaction PIN:** Required for transaction-related operations (withdraw, transfer).
- **Data Storage:** All user information and transaction details are securely stored in a MySQL database.

## Technologies Used
- **Backend:** Spring Boot (Java)
- **Frontend:** React JS
- **Database:** MySQL

## Getting Started

### Prerequisites
- Java Development Kit (JDK)
- Node.js and npm
- MySQL Database

### Installation

1. **Clone the repository:**
    ```bash
    git clone https://github.com/yourusername/atm-interface.git
    ```

2. **Backend Setup:**
    - Navigate to the backend directory:
        ```bash
        cd atm-interface/backend
        ```
    - Install dependencies and build the project:
        ```bash
        ./mvnw clean install
        ```
    - Run the Spring Boot application:
        ```bash
        ./mvnw spring-boot:run
        ```

3. **Frontend Setup:**
    - Navigate to the frontend directory:
        ```bash
        cd ../frontend
        ```
    - Install dependencies:
        ```bash
        npm install
        ```
    - Start the React application:
        ```bash
        npm start
        ```

4. **Database Setup:**
    - Create a MySQL database and configure the application properties in `backend/src/main/resources/application.properties`:
        ```properties
        spring.datasource.url=jdbc:mysql://localhost:3306/atm_database
        spring.datasource.username=root
        spring.datasource.password=yourpassword
        ```
    - Run the SQL scripts to set up the initial database schema (if any).

## Usage
- Open your browser and navigate to `http://localhost:3000` to access the application.
- Use the provided interfaces to create accounts, perform deposits, withdrawals, transfers, and view transaction history.

## Contributing
- Fork the repository.
- Create a new branch (`git checkout -b feature-branch`).
- Make your changes.
- Commit your changes (`git commit -m 'Add new feature'`).
- Push to the branch (`git push origin feature-branch`).
- Create a pull request.

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Acknowledgements
- Special thanks to **Oasis Infobyte** for the opportunity to work on this project during my internship.

