![Duoc UC](https://www.duoc.cl/wp-content/uploads/2022/09/logo-0.png)

# Llanquihue Tour App - Semana 7 (Formativa)

## Descripción del Proyecto

Este proyecto es una aplicación de consola en Java desarrollada para la asignatura de Desarrollo Orientado a Objetos I en Duoc UC. El sistema gestiona catálogos de tours y servicios turísticos mediante programación modular y arquitectura de paquetes.

## 🚀 Novedades de la Semana 7: Polimorfismo y Colecciones Genéricas
En esta entrega se integró el concepto de **Polimorfismo Dinámico en tiempo de ejecución** y **Colecciones Polimórficas**, permitiendo desacoplar la interfaz de usuario de las subclases específicas.

### Componentes clave implementados:
* **Superclase `ServicioTuristico`:** Define los atributos comunes (`nombre`, `duracionHoras`) y el método polimórfico base `mostrarInformacion()`.
* **Subclases Especializadas:** `RutaGastronomica`, `PaseoLacustre` y `ExcursionCultural` aplican la anotación `@Override` para sobrescribir el comportamiento y desplegar sus atributos únicos.
* **Colección Genérica:** Implementación de un `ArrayList<ServicioTuristico>` en la clase `GestorServicios` para almacenar de forma unificada múltiples tipos de servicios.
* **Recorrido Polimórfico:** En la interfaz de usuario (`ui.Main`), se recorre la lista polimórfica utilizando referencias exclusivas de la superclase.

## 🧱 Organización de Paquetes y Arquitectura



Para asegurar una separación estricta de responsabilidades según la pauta, el proyecto se encuentra estructurado bajo la siguiente jerarquía de paquetes:



```text

LlanquihueTourApp/
├── resources/
│   └── tours.txt            # Archivo plano con datos de Tours y Guías (delimitado por |)
├── src/
│    ├── data/
│    │    ├── GestorDatos.java              # Servicio que administra el parseo de datos (split por pipe)
│    │    └── GestorServicios.java          # Servicio donde se instancian los objetos mediante un método
│    ├── ui/
│    │   └── Main.java                      # Clase ejecutable con menú interactivo por consola
│    ├── model/
│    │   ├── ExcursionCultural.java         # Clase hija que hereda de la clase ServicioTuristico 
│    │   ├── Guia.java                      # Modelo de la entidad Guía de Turismo
│    │   ├── PaseoLacustre.java             # Clase hija que hereda de la clase ServicioTuristico
│    │   ├── RutaGastronomica.java          # Clase hija que hereda de la clase ServicioTuristico
│    │   ├── ServicioTuristico.java         # SuperClase padre sin instanciación
│    │   └── Tour.java                      # Modelo Tour con la Composición fuerte de Guia
│    └── util/
│        └── Validador.java                 # Utilidades lógicas para validar restricciones de negocio
│
└── README.md
```

## 🛠️ Instrucciones de Ejecución
1. Abra el proyecto en **IntelliJ IDEA Ultimate**.
2. Asegúrese de que el archivo `resources/tours.txt` se encuentre en la raíz del proyecto.
3. Ejecute la clase `Main` ubicada en el paquete `ui`.
4. Al iniciar, la consola desplegará automáticamente la **Demostración de Polimorfismo de la Semana 7** antes de dar paso al menú interactivo principal.


- **Camilo Hidalgo Aranda** - Estudiante de Analista programador de DUOC UC para el ramo Desarrollo Orientado a Objetos I 
