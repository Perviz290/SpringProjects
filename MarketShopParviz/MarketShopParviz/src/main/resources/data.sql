 insert into users
  (username,password,enabled,role)
  values
  ('admin','{noop}admin',1,'admin'),
 ('nicat','{noop}12',1,'cashier');
 
  insert into authorities
  (username,authority) values
  ('admin','admin'),
  ('nicat','cashier');

  
 insert into managers
(name,surname,username,creator_username,phone_number,mail,birthday)             
values
('oktay','oktayli','oktay1','1','develop','010-787-25-25','oktay1@mail.com','1995-11-24'),
('elgiz','elgizli','elgiz1','1','develop','020-878-25-25','elgiz@mail.com','1997-05-13'),
('camil','camilli','camil1','2','code','030-979-25-25','camil1@mail.com','1993-11-11'),
('izett','izetli','izet1','2','code','040-585-25-25','izzet1@mail.com','1995-12-11');















