 insert into users
  (username,password,enabled,role)
  values
  ('admin','{noop}admin',1,'admin'),
 ('nicat','{noop}12',1,'cashier');
 
  insert into authorities
  (username,authority) values
  ('admin','author'),
  ('nicat','cashier');

  
  














