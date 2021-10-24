This is a Bank Api project build using [spring boot]()
## Getting Started

First, run the application in your IDE to test the api use:

```bash
localhost:8080/api/api/register
```
To register  

```bash
localhost:8080/api/login
```
To login

```bash
localhost:8080/customers/add
```
More information about the new user

```bash
localhost:8080/accounts/add/usernumber
```
Register an account with the user number usernumber is an integer

```bash
localhost:8080/accounts/transfer/usernumber
```
Perform a transaction between two accounts usernumber is an integer

```bash
localhost:8080/api/token/refresh
```
Refresh token once expired

```bash
localhost:8080/accounts/transactions/accountNumber
```
List transactions accountNumber is an integer