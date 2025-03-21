# TrackAPP_BE
Semplice BE per [github.com/GGNado/Flutter_Corso](https://github.com/GGNado/Flutter_Corso/tree/main/3-Flutter-Tracker-APP/track_app)


## API Endpoints

### Get All Expenses
- **URL:** `/api/expenses`
- **Method:** `GET`
- **Description:** Retrieves a list of all expenses.
- **Response:**
  - `200 OK` - Returns a list of expenses.

### Add a New Expense
- **URL:** `/api/expenses`
- **Method:** `POST`
- **Description:** Adds a new expense.
- **Request Body:**
  ```json
  {
    "id": "string",
    "nome": "string",
    "spesa": "number",
    "data": "string (LocalDate)",
    "categoria": "Categoria"
  }
  ```
- **Response:**
    - `200 OK` - Expense added successfully.

### Delete Expense by ID
- **URL:** `/api/expenses/{id}`
- **Method:** `DELETE`
- **Description:** Deletes an expense by its ID.
- **Path Variables:**
    - `id` (int) - The ID of the expense to delete.
- **Response:**
    - `200 OK` - Expense deleted successfully.

### Delete Expense by Name and Date
- **URL:** `/api/expenses/nome/{nome}/data/{data}`
- **Method:** `DELETE`
- **Description:** Deletes an expense by its name and date.
- **Path Variables:**
    - `nome` (string) - The name of the expense to delete.
    - `data` (string) - The date of the expense to delete.
- **Response:**
    - `200 OK` - Expense deleted successfully.

## Models

### ExpenseRequest
- **Fields:**
    - `id` (String)
    - `nome` (String)
    - `spesa` (double)
    - `data` (LocalDate)
    - `categoria` (Categoria)

### Expense
- **Fields:**
    - `id` (int)
    - `nome` (String)
    - `spesa` (double)
    - `data` (LocalDateTime)
    - `categoria` (Categoria)

### Categoria
- **Fields:**
    - `id` (int)
    - `nome` (String)
