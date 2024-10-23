# Banking System in Core Java

Internet is being widely used as means of communication and referred as window to the world. People now rely on the internet to search for information, to purchase merchandise and to be informed of different services provided by an organization. Most of the companies (emerging/existing) invest on their websites to promote themselves and the products & services they offer.  As a result, one can purchase a product or utilize a service from any organization of their choice whenever they wish regardless of their location, which is all just a click away.

The use of internet services is not limited to informative or commercial sector but in recent years it extended to banking sector. Now, many banks globally facilitated their customers with Internet Banking System to manage their accounts.


Hardware and Software Requirements 
Hardware Requirements: 

Processor: Intel Pentium based system

Processor speed:  250 MHz to 833MHz

RAM SPEED:  1GB 

Software Requirements: 

FRONT END: HTML, JAVA SCRIPT

Technologies: CORE JAVA

DATABASE: SQL

Operating System: Windows XP/7/8/10


visit more projects - https://projectworlds.in

demo- https://projectworlds.in/java-projects-with-source-code/banking-system-in-java-with-source-code/

---
### Major Components

1. **User Interface (UI)**:
   - **Components**:
     - `Splash`: Displays a splash screen when the application starts.
     - `ViewCustomer`: Displays all account holders in a table format.
     - `ViewOne`: Allows navigation through individual customer records.
     - `WithdrawMoney`: Handles the withdrawal of money from a customer's account.
   - **Interaction**: These components interact with the user, capturing input and displaying information.

2. **Application Logic**:
   - **Components**:
     - **Data Handling**: Methods for loading, displaying, and updating customer records (`populateArray`, `findRec`, `editRec`, `editFile`).
     - **Business Logic**: Processes user actions such as viewing records and withdrawing money.
   - **Interaction**: This layer processes user inputs, performs necessary computations, and updates the UI accordingly.

3. **Database**:
   - **Components**:
     - **File Storage**: Uses a file (`Bank.dat`) to store customer records.
   - **Interaction**: The application logic reads from and writes to this file to persist data.

4. **APIs**:
   - **Components**:
     - **Internal APIs**: Methods within the application that handle data operations and business logic.
   - **Interaction**: These methods are called by the UI components to perform actions like loading records, saving updates, and processing withdrawals.

### Interactions

1. **Data Flow**:
   - **User Input**: Users interact with the UI components to perform actions such as viewing customer records or withdrawing money.
   - **Processing**: The application logic processes these inputs, performs necessary computations, and updates the data.
   - **Data Storage**: Updated data is saved back to the file (`Bank.dat`).

2. **Communication Protocols**:
   - **Internal Method Calls**: UI components call methods in the application logic to perform actions and retrieve data.
   - **File I/O**: The application logic uses file input/output operations to read from and write to `Bank.dat`.

3. **Integration Points**:
   - **File Operations**: The application interacts with the file system to persist customer data.

### Architecture Diagram



+---------------------+       +---------------------+
|      User Interface |       |   Application Logic |
|---------------------|       |---------------------|
| - Splash            |       | - Data Handling     |
| - ViewCustomer      |<----->| - Business Logic    |
| - ViewOne           |       +---------------------+
| - WithdrawMoney     |               |
+---------------------+               |
                                       |
                                       v
                             +---------------------+
                             |      Database       |
                             |---------------------|
                             | - File Storage      |
                             |   (Bank.dat)        |
                             +---------------------+



### Example Interaction Flow

1. **User searches for a customer**:
   - The `ViewCustomer` component sends a request to the application logic to load customer records.
   - The application logic reads the records from `Bank.dat` and displays them in a table.

2. **User withdraws money**:
   - The `WithdrawMoney` component captures the withdrawal details and sends them to the application logic.
   - The application logic updates the customer's balance and saves the updated records back to `Bank.dat`.


### Detailed Explanation of Core Components and Modules

The Banking System consists of several core components and modules that work together to provide a comprehensive internet banking solution. Below is a breakdown of these components:



## 1. User Interface (UI) Module

**Description**:  
This module is responsible for the front-end interactions. It is designed using **HTML** and **JavaScript** to facilitate user-friendly navigation and operations.

**Key Features**:
- **Dashboard for account management**: Users can easily view and manage their account details.
- **Transaction history display**: A section where users can view a detailed list of their past transactions.


## 2. Core Banking Logic Module

**Description**:  
This module contains the main business logic of the banking system, implemented in **Core Java**.

**Key Features**:
- **Customer account management**: Allows for the creation, deletion, and updating of customer accounts.
- **Transaction processing**: Handles deposits, withdrawals, and money transfers between accounts.



## 3. Database Module

**Description**:  
This module manages data storage and retrieval using **SQL**. It handles all database operations to ensure data integrity and security.

**Key Features**:
- **Transaction records management**: Stores details of all financial transactions performed within the system.
- **Account information storage**: Keeps customer and account information in a secure and organized manner.



## 4. Security Module

**Description**:  
This module implements various security features to protect user data and transactions.

**Key Features**:
- **Encryption of sensitive data**: Ensures that passwords and other sensitive information are securely stored and transferred.
- **Session management**: Protects the system from unauthorized access by managing user sessions effectively.
- **Input validation**: Prevents security vulnerabilities such as SQL injection by validating all input.


## Code Snippets and Examples

This section highlights important parts of the Java banking system application, specifically focusing on account creation and money withdrawal functionalities.

---


### WithdrawMoney.java

This class handles the withdrawal of money from existing accounts.

**Main Benefits**:
1. **Graphical User Interface (GUI)**:  
   Designed using **Swing** to create an intuitive interface for users to input withdrawal details.

2. **Account Information Retrieval**:  
   Automatically retrieves and displays account details (e.g., account holder name, balance) when the account number is entered.

3. **Input Validation**:  
   Ensures that:
   - Fields such as account number and withdrawal amount are not empty.
   - The withdrawal amount does not exceed the available balance.
   
4. **Data Handling**:  
   Loads account records from a file (**Bank.dat**) and updates these records after a successful withdrawal.

5. **Balance Management**:  
   Updates the account balance after each withdrawal, ensuring accurate financial management.

6. **Error Handling**:  
   Displays informative error messages in case of invalid inputs, such as:
   - Nonexistent account numbers.
   - Insufficient funds.
   
7. **Data Persistence**:  
   Ensures that changes (like updated balances) are saved back to the file, allowing for persistence across application sessions.

8. **User-Friendly Experience**:  
   Offers buttons to save or cancel the operation, contributing to a better user experience.

---

These examples demonstrate how the Java banking system provides a robust, user-friendly experience while maintaining data integrity and security.



