# SFIA-project
## Contents
#### [Requirements](https://github.com/keenan218/SFIA-project#requirements-1)
#### [Required Tech Stack](https://github.com/keenan218/SFIA-project#required-tech-stack-1)
#### [Objectives](https://github.com/keenan218/SFIA-project#objective-1)
##### - [CRUD](https://github.com/keenan218/SFIA-project#crud-1)
#### [Architecture](https://github.com/keenan218/SFIA-project#architecture-1)
##### - [Database Structure](https://github.com/keenan218/SFIA-project#database-structure-1)
##### - [CI Pipeline](https://github.com/keenan218/SFIA-project#ci-pipeline-1)
#### [Risk Assessment](https://github.com/keenan218/SFIA-project#risk-assessment-1)
#### [Front-End Design](https://github.com/keenan218/SFIA-project#front-end-design-1)
##### - [Known Issues](https://github.com/keenan218/SFIA-project#known-issues-1)


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
To adhere to CRUD, functionality will be added to allow the user to (if followed by '-' feature isn't implemented yet):
#### C - Create
- Create Wishlists
- Create entries into the wishlist.
- Create Accounts -

#### R - Read
- be able to read and view their list
- be able to view their accounts -

#### U - Update
- be able to edit entries they have made to the application
- be able to update their details -

#### D - Delete
- delete entries they have made in the list
- delete their accounts -


## Architecture

### Database Structure
#### Entity Relationship Diagram

Displayed below is my Entity Relationship Diagram (ERD). This shows the structure of the database, i.e. how my tables are laid out and how they link to one another. Displayed in the ERD you will see one-to-many relationships between Users and Wishlists and Wishlists and Entries.
![ERD](https://github.com/keenan218/SFIA-project/blob/master/ERD.png)
### CI Pipeline


## Risk Assessment

Risks become apparent on any project on any scale. They can arise from things you overlook, such as an extra layer of security you havent gotten round to implementing yet, or they can be external and out of your control, such as service providers going dark, or even things no-one has control over, potentially acts of nature that render hosting servers unusable for a certain amount of time.

This risk assessment assesses a risk by detailing what it is, what the consequences are if it so happens and the triggered reaction from us as the developers. It also assesses the severity of the risk, the likelihood of it happening, and whom is responsible if it does happen. Furthermore proposed mitigation is also addressed according to each risk.

The risk assessment was made on google sheets and can be accessed on this link - https://docs.google.com/spreadsheets/d/1deCTx0a3wwEZXrtYkFAwLKYbllitNZS0PWtYzJ_anMg/edit?usp=sharing

![Risk Assessment](https://github.com/keenan218/SFIA-project/blob/master/RA%20-%20Imgur.png)

## Front-End Design
Even though the project maybe in very early stages it still has all the necessary functionality. You are able to create multiple Wishlists, each containing multiple entries. You have the ability to read your wishlists, update and even delete entries. The app has a sign-up and a log-in page, however these are currently still a work in progress as I am still adding the functionality. 

#### Homepage
![Homepage](https://github.com/keenan218/SFIA-project/blob/master/homepage.png)

#### Sign up page
![Sign Up](https://github.com/keenan218/SFIA-project/blob/master/Sign%20up%20page.png) 

#### Log in page
![Log In](https://github.com/keenan218/SFIA-project/blob/master/log%20in%20page.png)

#### Create Wishlist
![create wishlist](https://github.com/keenan218/SFIA-project/blob/master/Create%20new%20wishlist%20page.png)

#### Create Entry page
![create entry](https://github.com/keenan218/SFIA-project/blob/master/Add%20entry%20page.png)

#### View wishlists
![view wishlists](https://github.com/keenan218/SFIA-project/blob/master/View%20wishlists%20page.png)

#### Update entry page 
![update entry](https://github.com/keenan218/SFIA-project/blob/master/update%20entry%20page.png) 

#### Delete entry page
![delete entry](https://github.com/keenan218/SFIA-project/blob/master/delete%20entry%20page.png)



### Known Issues
- One known issue is when a user goes to update an entry it updates the original entry but also creates a duplicate at the bottom of the list.
- Wishlists don't have a seperate ID to entries, because of this if you create a wishlist (this will have ID 1), then 5 entries, then another wishlist, this second wishlist will have the id of 7 as opposed to 2.
- When you try to create an account there is currently nowhere to store User data, and so it gives an error after you click the 'sign up' button

### Future Features
- The ability to successfully create a User account
- - This comes with the functionality of being able to update user details and delete your account.
- The ability to delete and update Wishlists, currently there is no way to do so.
