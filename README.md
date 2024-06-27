
<div style="text-align:center" >

# API SpringBoot:
##  Native API CRUD with MYSQL database integration:
### 🍃 This API created based on System Bank, follow graphic (ER) bellow:
</div>
<img src="./project/src/main/resources/assets/Captura de tela 2024-06-27 171038.png">

## In this image im detailing what the entities will look like and the relationships they will have with other entities, the cardinality points are aligned to demonstrate maximum precision about what this API will do.

### There some endpoints like:
## Account 
````
/api/account/return 
````
### Endpoint that returns all records from the database.



````
/api/account/return/{id}
````
### Endpoint that returns an unique value from the database.

````
/api/account/update/{id}
````
### Endpoint that update a new Account base on ID from the table tb_account in database.

````
/api/account/save 
````
### Endpoint that save new Account
----------------------------------------------------
## Next steps 
<div style="color:orange">

* Implements a new Entites ( )
* Create interface from the repository for better control ( )
* Verify and validade endpoints as well as input and ouputs from the database ( )
* Use security 2OAUTH dependency and JWT ( )
* Create repository with transactions ( ) 


![Static Badge](https://img.shields.io/badge/Build-onProcess-green)




