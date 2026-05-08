# parcial-1
Sistema de Atención de Clientes FIFO - Banco

## Descripción del proyecto
Este proyecto consiste en una aplicación desarrollada en Java que simula el sistema de atención de clientes en una ventanilla bancaria utilizando la estructura de datos FIFO (First In, First Out).
El sistema permite registrar clientes en una cola de espera y atenderlos respetando estrictamente el orden de llegada.
La aplicación fue desarrollada usando la interfaz Queue de Java y la implementación LinkedList.
--- 
# Objetivo del proyecto
Implementar una cola FIFO en Java aplicando:
- Estructuras de datos
- Programación orientada a objetos
- Validaciones
- Manejo de excepciones
- Menú interactivo en consola
- Pruebas unitarias básicas
---
# Funcionalidades del sistema
El programa permite:
1. Agregar clientes a la cola
2. Atender al siguiente cliente
3. Ver el próximo cliente en espera
4. Mostrar todos los clientes en cola
5. Consultar la cantidad de clientes en espera
6. Vaciar completamente la cola
7. salrir

Estructura del proyecto

Cliente.java
BancoCola.java
Main.java
BancoColaTest.java
README.md

Explicación de las clases
Cliente.java

Representa un cliente del banco.

Contiene:

nombre
identificación
tipo de transacción
hora de llegada
prioridad

También incluye:

constructor
getters
validaciones
método toString()
BancoCola.java

Contiene toda la lógica de la cola FIFO.

Funciones principales:

agregar clientes
atender clientes
mostrar cola
verificar tamaño
vaciar cola
Main.java

Clase principal del programa.

Contiene:

menú interactivo
Scanner
captura de datos
interacción con el usuario
manejo de errores
BancoColaTest.java

Clase de pruebas unitarias usando JUnit.

Permite probar:

encolar clientes
desencolar clientes
verificar cola vacía
Validaciones implementadas

El sistema valida:

nombres vacíos
identificación solo numérica
entradas inválidas
cola vacía al atender clientes

Ejemplo:
Error: La identificación debe tener solo números

Capturas de pantalla de la ejecución del menú:

<img width="1366" height="768" alt="image" src="https://github.com/user-attachments/assets/d6d5b97a-b5bd-4218-b510-9d54aee4983e" />
<img width="1366" height="768" alt="image" src="https://github.com/user-attachments/assets/240fc47a-e916-4d52-95b3-48e67040fadc" />
<img width="1366" height="768" alt="image" src="https://github.com/user-attachments/assets/b8c9f272-e8a4-4813-b8fe-874a8403b118" />

DIAGRAMA UML
<img width="1683" height="934" alt="ChatGPT Image 7 may 2026, 09_39_03 p m" src="https://github.com/user-attachments/assets/51c17e0a-7426-4c89-a21f-2848d9f52b53" />

