# Serenity Template

**Autor**: GhulyIU

Este proyecto contiene la estructura para armar un proyecto en Serenity

## Requisitos

Antes de ejecutar las pruebas deben de tener los siguiente programas instalados:

- **Java 11 o superior**: [Descargar aquí](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
- **Maven**: [Descargar aquí](https://maven.apache.org/download.cgi)
- **IntelliJ IDEA o Eclipse** (recomendado con plugins de Cucumber y Gherkin).

## Pasos para ejecutar

1. **Instalar dependencias**:

   Ejecuta el siguiente comando para instalar las dependencias necesarias:

   `mvn clean install`


2. **Edita el contenido**:

   Una vez instaladas las dependencias, edita el contenido en este orden:

   - **Features/**: Define el comportamiento del negocio en lenguaje Gherkin.
   - **Stepdefinitions/**: Mapea los pasos de Gherkin hacia los métodos de Java.
   - **Steps/**: Escribe la lógica de las acciones y las validaciones (Assertions).
   - **Pages/**: Registra los selectores e interacciones básicas con la interfaz.
   - **Model/**: Define las clases de datos u objetos de negocio
   - **Utils/** Implementa funciones de ayuda reutilizables


      No modifiques otros directorios o archivos para asegurar la estabilidad del framework y la correcta generación de los reportes de Serenity.


2. **Ejecutar las pruebas y generar el reporte**:

   Una vez instaladas las dependencias, ejecutar el siguiente comando:

   `mvn clean verify`


      Este comando realizará las siguientes acciones:
   
       - Ejecutará las pruebas
       - Generará un reporte visual en formato **HTML** que podrás abrir en tu navegador.


3. **Accede al archivo resultante**:

   Una vez que las pruebas hayan finalizado, el archivo HTML del reporte generado se encontrará en la siguiente ruta:

   `target\site\serenity\index.html`

   o puedes abrirlo directamente desde la terminal con el siguiente comando:

   `start target/site/serenity/index.html`

   Finalmente, se abrira el reporte en el navegador preterminado.
