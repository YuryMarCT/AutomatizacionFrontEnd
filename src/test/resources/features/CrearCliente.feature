# language: es
  # autor: Yury Marcela
  # correo: yumacoto@gmail.com

Característica: Creación de clientes en gastaging.siigo
  Como usuario de la aplicación
  Quiero iniciar sesión y crear un cliente
  Para validar el correcto funcionamiento del proceso de registro de clientes

  @Regresion
  Esquema del escenario:  Registro exitoso de un nuevo cliente
    Dado que el "usuario" ingresa a la url
    Cuando se autentica con sus credenciales "<Usuario>""<Contraseña>"
    Y navega a la seccion de creacion de clientes
    Y completa el formulario de cliente con la siguiente información:
      | nombres | apellidos  | identiticacion | ciudad |
      | Yury M  | Colorado T | 124512641      | 05001  |
    Y envia el formulario para crear el tercero
    Entonces verificamos el registro exitoso del cliente en la lista de clientes

    Ejemplos:
      | Usuario                         | Contraseña               |
      | retoautomationsiigo@yopmail.com | T4b4ck0ff1c3P455w0rd658* |