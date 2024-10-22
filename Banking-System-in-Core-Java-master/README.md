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

Here's a simplified representation of the system architecture:



±--------------------+ ±--------------------+ | User Interface | | Application Logic | |---------------------| |---------------------| | - Splash | | - Data Handling | | - ViewCustomer |<----->| - Business Logic | | - ViewOne | ±--------------------+ | - WithdrawMoney | | ±--------------------+ | | v ±--------------------+ | Database | |---------------------| | - File Storage | | (Bank.dat) | ±--------------------+




### Example Interaction Flow

1. **User searches for a customer**:
   - The `ViewCustomer` component sends a request to the application logic to load customer records.
   - The application logic reads the records from `Bank.dat` and displays them in a table.

2. **User withdraws money**:
   - The `WithdrawMoney` component captures the withdrawal details and sends them to the application logic.
   - The application logic updates the customer's balance and saves the updated records back to `Bank.dat`.
