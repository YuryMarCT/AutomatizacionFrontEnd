# language: es
  # autor: Yury Marcela
  # correo: yumacoto@gmail.com

Característica: Yo como usuario de la aplicación gastaging.siigo
  requiero realizar un inicio de sesión en la aplicación
  para garantizar el correcto funcionamiento del inicio de sesión

  @Regresion
  Esquema del escenario: Inicio de sesión exitoso
    Dado que el "usuario" ingresa a la url
    Cuando se autentica con sus credenciales "<Usuario>""<Contraseña>"
    Entonces vemos la pagina principal de gastanging.siigo

    Ejemplos:
      | Usuario                         | Contraseña               |
      | retoautomationsiigo@yopmail.com | T4b4ck0ff1c3P455w0rd658* |
