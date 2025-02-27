# selenium-pom-testng-demo

## Implementación y Pruebas usando Page Object Model (POM)
### Instrucciones:


1. #### Configuración del Proyecto

   * Configura un nuevo proyecto Java utilizando TestNG y Selenium.

2. #### Implementación de la Clase POM - LoginPage.java

   * Refleja la estructura y funcionalidades de LoginPage.java del ejercicio anterior.
   * Asegúrate de incluir los métodos para:
     * **Ingresar el nombre de usuario** (enterUsername(String username)).
     * **Ingresar la contraseña** (enterPassword(String password)).
     * **Hacer clic en el botón de inicio de sesión** (clickLoginButton()).
     * **Obtener el mensaje de error** (getErrorMessage()).

3. #### Implementación de las Pruebas - LoginTest.java

   * Crea las pruebas automatizadas utilizando TestNG.
     * **Test de inicio de sesión exitoso:** Llama a los métodos del objeto LoginPage para ingresar las credenciales válidas y verificar que el usuario sea redirigido correctamente.
     * **Test de inicio de sesión fallido:** Ingreso de credenciales inválidas, clic en el botón de inicio de sesión y validación del mensaje de error.
   * Usa las aserciones de TestNG para verificar los resultados de cada prueba.
