# SCALA-ETL-CSV-Postgres
Load data from CSV , Transform using Scala and load to Posgres in local machine with the support of Spark installed in Windows
![image](https://github.com/user-attachments/assets/fb792a62-4ddb-4191-a849-507fe65304f4)

# Pre-Requisites

# 1. Spark and Hadoop in Windows machine

# 2. Running Postgres DB in Windows Machine

# 3. IntelliJ community edition

# 4. Scala and SBT configured

# Project Structure

![image](https://github.com/user-attachments/assets/77261709-266a-4434-b948-9cdf63c42273)

# Config - Case Object-  DB Configuration is defined
# ETL- Trait - All ETL methods are defined without implementation
# ETLAPP- Entry Point
# ETLProcess- All ETL methods are implemented
# ETLUtils- Object with Spark Configuration and Postgres DB Configuration



# Source csv is in a folder 

![image](https://github.com/user-attachments/assets/a95c0bef-3a46-4e4c-9399-af764f304aa1)


![image](https://github.com/user-attachments/assets/3ee26114-5bd9-4e5d-aa6a-ce0a50323bf4)


# Postgres DB in my local machine

![image](https://github.com/user-attachments/assets/b73dfb05-e714-497a-b6b9-3f624cc794f6)

# This is the destination table to keep data

![image](https://github.com/user-attachments/assets/2aed6ec1-ee05-4d5a-9403-aed6339bc60a)

# Build file with Postgress  Spark  versions
![image](https://github.com/user-attachments/assets/cb03911d-284d-4830-b635-69957609ec4a)


# Ready to run application

Run -- ETLAPP--- > This App will pull csv file from source the input folder  --> Add additional column after transformation  --> Store transformed CSV in OutputTranformeddata folder  --> Same data will be stored in Postgress DB--> PostgresDB Schema--> NewEmployee table

No records in table
![image](https://github.com/user-attachments/assets/163dd24f-4ebb-4351-8377-aeae4d51db25)

Transformed CSV are generated in output folder
![image](https://github.com/user-attachments/assets/0dad9963-f1c7-4ffb-ba48-b7de997b0ec0)

Transformed data is loaded in Datbase

![image](https://github.com/user-attachments/assets/dcd72424-b8f4-4f8c-b54e-6a82941e41fd)


Next we will try incriment load after adding more records in csv


![image](https://github.com/user-attachments/assets/8762a5f2-aafb-41a9-b575-6c7c2b980e0b)


Running App with updated CSV Data 

Latest data incrimentally loaded in table

![image](https://github.com/user-attachments/assets/957bf9ee-7d54-41ef-ba62-eee3337797ad)


Note: This is a basic example . All CDC is not applied in this demo

