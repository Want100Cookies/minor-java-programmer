# Bank API

# Customers [/customers]

## Get all customers [GET]

* Response 200 (application/json)

        [
            {
                "CustomerNumber": 1,
                "FirstName": "John",
                "LastName": "Doe",
                "DateOfBirth": "12-12-1989"
            },
            {
                ...
            }
        ]

## Create a customer [POST]

* Request (application/json)

        {
            "FirstName": "John",
            "LastName": "Doe",
            "DateOfBirth": "12-12-1989",
            "Address": {
                "Street": "Some street",
                "City": "Some city",
                "PostalCode": "1234AB",
                "Country": "The Netherlands"
            }
        }

* Response 201 (application/json)

        {
            "CustomerNumber": 1,
            "FirstName": "John",
            "LastName": "Doe",
            "DateOfBirth": "12-12-1989",
            "Address": {
                "Street": "Some street",
                "City": "Some city",
                "PostalCode": "1234AB",
                "Country": "The Netherlands"
            }
        }

# Single customer [/customers/{CustomerNumber}]

* Parameters:
    * CustomerNumber (int) - customer number of the customer

## Get a single customer [GET]

* Response 200 (application/json)

        {
            "CustomerNumber": 1,
            "FirstName": "John",
            "LastName": "Doe",
            "DateOfBirth": "12-12-1989",
            "Address": {
                "Street": "Some street",
                "City": "Some city",
                "PostalCode": "1234AB",
                "Country": "The Netherlands"
            }
        }

## Edit a single customer [PATCH]
Edit a customer with the given fields. No field is mandatory and if only provided a partial customer only those fields are updated.

* Request (application/json)

        {
            "CustomerNumber": 1,
            "FirstName": "John",
            "LastName": "Doe",
            "DateOfBirth": "12-12-1989",
            "Address": {
                "Street": "Some street",
                "City": "Some city",
                "PostalCode": "1234AB",
                "Country": "The Netherlands"
            }
        }

* Response 204

## Delete a customer [DELETE]

* Response 204

# All accounts for a single user [/customers/{CustomerNumber}/accounts]

* Parameters:
    * CustomerNumber (int) - customer number of the customer

## Get all accounts for the user [GET]

* Response 200 (application/json)

        [
            {
                "AccountNumber": 1,
                "AccountOpenedDate": "01-01-2017",
                "Balance": "689.55"
                "Type": "CheckingsAccount",
                "OverdraftLimit": "100",
                "InterestRate": null,
            },
            {
                ...
            }
        ]

## Create a new account for the user [POST]
Create a new account. An account can be of type `CheckingAccount` or `SavingsAccount`. Depending on the type an extra field is needed in the request. These are `OverdraftLimit` or `InterestRate` in this order.

### for a Checking Account

* Request (application/json)

        {
            "Type": "CheckingsAccount",
            "OverdraftLimit": "100",
        }

* Response 201 (application/json)

        {
            "AccountNumber": 1,
            "AccountOpenedDate": "01-01-2017",
            "Balance": "0.00"
            "Type": "CheckingsAccount",
            "OverdraftLimit": "100",
        }

### for a Savings Account

* Request (application/json)

        {
            "Type": "SavingsAccount",
            "InterestRate": "5.0",
        }

* Response 201 (application/json)

        {
            "AccountNumber": 1,
            "AccountOpenedDate": "01-01-2017",
            "Balance": "0"
            "Type": "SavingsAccount",
            "InterestRate": "5.0",
        }

# Deposit money onto a account [/customers/{CustomerNumber}/accounts/{AccountNumber}/deposit]

* Parameters:
    * CustomerNumber (int) - customer number of the customer
    * AccountNumber (int) - the number of the account

## Deposit [POST]

* Request (application/json)

        {
            "Amount": "10.00"
        }
