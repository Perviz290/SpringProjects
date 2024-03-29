 insert into users
  (username,password,enabled,role)
  values
  ('perviz','{noop}1234',1,'admin'),
  ('oktay96','{noop}1234',1,'manager'),
   ('ehsan15','{noop}1234',1,'cashier'),
  ('camil88','{noop}1234',1,'cashier');
 
  insert into authorities
  (username,authority) values
  ('perviz','admin'),
  ('perviz','get:all:product'),
  ('perviz','getallproduct:bycategoryid'),
  ('perviz','getone:product'),
  ('perviz','save:product'),
  ('oktay96','manager'),
  ('ehsan15','cashier'),
  ('camil88','cashier'),
  ('ehsan15','save:sale'),
  ('camil88','save:sale');
  
  
   insert into authoritylist
  (authority,description) values
  ('admin','adminlik hüququ'),
  ('manager','menecerlik hüququ'),
  ('cashier','cassirlik hüququ'),
  ('save:product','mehsul qeydiyati'),
  ('get:all:product','butun mehsullari gormek'),
  ('getallproduct:bycategoryid','category ile butun mehsullari gormek'),
  ('getone:product','secilen mehsulu gormek'),
  ('edit:product','secilen mehsulu redakte etmek'),
  ('delete:product','secilen mehsulu silmek'),
  ('edituser:password','yalniz parolu deyismek'),
  ('save:sale','barcoda gore satis save etmek');
     
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

insert into sales
(name,barcode,creator_username,price,cost,sale_date,quantity,percent,category_id)             
values
('paltar','4525368745','ehsan15','45.90','25','2023-01-20','2','20','1'),
('ayaqqabi','253645368745','camil88','22.00','15','2023-01-20','3','20','3');

insert into category
(name)             
values
('köynək'),
('şalvar'),
('ayaqqabi');

