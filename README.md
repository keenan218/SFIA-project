# SFIA-project
## Contents


## Requirements
- Create a JIRA board containing user stories, use cases and the tasks needed to complete the project
- Documentation from the design phase describing the architecture that will be used
- A detailed Risk Assessment
- A relational database used to persistently store data for the project
- A functional application created in the OOP language
- Application must have a functioning front-end website and integrated API
- Code fully integrated into a Version Control System
- Code built through a CI server
- Application deployed to a cloud-based virtual machine

### Required Tech Stack
- Kanban board made on Jira
- Database: GCP Managed SQL Server
- Programming Language: java 
- Front-end: HTML, CSS and JavaScript
- Version Control: Git
- CI Server: CircleCI
- Cloud server: GCP virtual machine

## Objective
The objective of this project is to create a CRUD application, that encapsulates and integrates everything we have learnt during out short time at the academy. 
### CRUD
- Made up of 4 functions; Create, Read, Update and Delete.
To adhere to CRUD, functionality will be added to allow the user to:
#### C - Create
Users will:
- Create Accounts
- Enter userName
- Enter email
- Enter password
- Create entries into the list.
#### R - Read
Users will:
- be able to read and view their list
- be able to view their accounts 
#### U - Update
Users will:
- be able to update their details
- be able to edit entries they have made to the application
#### D - Delete
Users can:
- delete their accounts
- delete entries they have made in the list



I would also like to have functionality of a importance feature, this will allow the user to note that a specific task in the list is of higher urgency than another task.
A great functionality for a to-do/ wishlist hybrid so users can easily see which jobs they should do first. 


## Architecture

### Database Structure

### Entity Relationship Diagram

Displayed below is my Entity Relationship Diagram (ERD). This shows the structure of the database, i.e. how my tables are laid out and how they link to one another. Displayed in the ERD you will see one-to-many relationships between Users and Wishlists and Wishlists and Entries.
![ERD](https://github.com/keenan218/Fundamentals-project-1/blob/master/ERD.png)

### CI Pipeline


## Risk Assessment

Risks become apparent on any project on any scale. They can arise from things you overlook, such as an extra layer of security you havent gotten round to implementing yet, or they can be external and out of your control, such as service providers going dark, or even things no-one has control over, potentially acts of nature that render hosting servers unusable for a certain amount of time.

This risk assessment assesses a risk by detailing what it is, what the consequences are if it so happens and the triggered reaction from us as the developers. It also assesses the severity of the risk, the likelihood of it happening, and whom is responsible if it does happen. Furthermore proposed mitigation is also addressed according to each risk.

The risk assessment was made on google sheets and can be accessed on this link - https://docs.google.com/spreadsheets/d/1deCTx0a3wwEZXrtYkFAwLKYbllitNZS0PWtYzJ_anMg/edit?usp=sharing

![Risk Assessment](https://github.com/keenan218/Fundamentals-project-1/blob/master/risk_assessment.png)

## Front-End Design

### Known Issues
- One known issue is when a user goes to update an entry it updates the original entry but also creates a duplicate at the bottom of the list.
- Wishlists don't have a seperate ID to entries, because of this if you create a wishlist (this will have ID 1), then 5 entries, then another wishlist, this second wishlist will have the id of 7 as opposed to 2.
