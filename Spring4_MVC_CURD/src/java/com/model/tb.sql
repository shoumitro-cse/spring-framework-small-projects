create table employee (  
    id int(10) primary key auto_increment,  
    name varchar(100),  
    salary int(10)  
); 

##jdbc:mysql://localhost:3306/std?zeroDateTimeBehavior=convertToNull