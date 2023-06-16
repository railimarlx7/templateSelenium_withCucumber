#language: pt
Funcionalidade: : Login to HRM Application


  @ValidCredentials
  Cenario: Login with valid credentials
    Dado User is on HRMLogin page
    Quando User enters username as "Admin" and password as "admin123"
    Entao User should be able to login sucessfully and new page open