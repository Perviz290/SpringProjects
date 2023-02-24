 insert into users
  (username,password,enabled,role)
  values
  ('admin','{noop}admin',1,'admin'),
  ('oktay96','{noop}1234',1,'manager'),
  ('camil88','{noop}1234',1,'cashier');
 
 
  insert into authorities
  (username,authority) values
  ('admin','admin'),
  ('oktay96','manager'),
  ('camil88','cashier');
  

  
 insert into managers
(name,surname,birthday,mail,phone_number,username)             
values
('oktay','oktayli','1995-11-24','oktay1@mail.com','010-787-25-25','oktay96');

insert into cashiers
(name,surname,birthday,mail,phone_number,username)             
values
('camil','camilli','1996-10-20','camilli@mail.com','050-858-25-25','camil88');
				 

insert into products
(name,barcode,price,cost,register_date,update_date,quantity,percent,category_id)             
values
('paltar','4525368745','45.90','25','2023-01-20','2023-02-20','3','20','1'),
('ayaqqabi','253645368745','22.00','15','2023-01-20','2023-02-20','3','20','3');


insert into category
(name)             
values
('köynək'),
('şalvar'),
('ayaqqabi');




