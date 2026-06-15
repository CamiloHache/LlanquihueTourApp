![Duoc UC](https://www.duoc.cl/wp-content/uploads/2022/09/logo-0.png)

# Llanquihue Tour App

## Descripción del Proyecto

**Llanquihue Tour** es una aplicación desarrollada en Java que permite cargar, almacenar y visualizar un catálogo de tours turísticos desde un archivo de texto. El sistema trabaja con una colección dinámica de objetos, permitiendo recorrer la información cargada y aplicar filtros según el precio de cada tour.

El proyecto simula una solución básica para la gestión de servicios turísticos, utilizando conceptos fundamentales de programación orientada a objetos, lectura de archivos y manejo de listas dinámicas.

## Objetivo

El objetivo principal del proyecto es implementar una aplicación Java capaz de:

- Leer datos desde un archivo externo.
- Crear objetos a partir de la información leída.
- Almacenar los datos en una colección dinámica.
- Mostrar el catálogo completo de tours.
- Filtrar tours según un criterio de precio.

## Tecnologías Utilizadas

- Java
- Programación Orientada a Objetos (POO)
- Lectura de archivos con BufferedReader y FileReader
- Manejo de colecciones con ArrayList
- Organización del código mediante paquetes estructurados

## Estructura del Proyecto

```text
LlanquihueTourApp/
│
├── src/
│   ├── data/
│   │   └── GestorDatos.java   # Lógica de lectura y parsing del archivo .txt
│   ├── model/
│   │   └── Tour.java          # Clase modelo de datos encapsulada
│   └── ui/
│       └── Main.java          # Clase principal ejecutable y punto de entrada
│
├── resources/
│   └── tours.txt              # Archivo plano con los datos de los tours
│
└── README.md
```

## Descripción de Componentes

### Main.java

Clase principal del programa ubicada en el paquete ui. Se encarga de iniciar la aplicación, coordinar la carga de datos invocando al gestor, desplegar el catálogo completo en la consola mediante bucles e implementar el filtro lógico para visualizar únicamente los tours cuyo valor supere el umbral establecido.

### Tour.java

Clase modelo del paquete model que representa una entidad de tour turístico. Aplica el principio de encapsulamiento mediante atributos privados para el nombre, el tipo y el precio, exponiendo sus respectivos métodos constructores, getters, setters y la sobrescritura del método toString().

### GestorDatos.java

Clase del paquete data encargada de centralizar la persistencia y lectura física de datos. Implementa flujos de entrada de texto para abrir el archivo, remover espacios innecesarios con .trim(), segmentar la cadena de caracteres mediante el delimitador de punto y coma con .split(";") e instanciar dinámicamente la colección.

### tours.txt

Archivo plano de configuración alojado en el directorio de recursos. Define el set de datos inicial del negocio estructurado por registros separados por saltos de línea.

**Formato utilizado:**
Nombre del tour;Tipo de tour;Precio

**Ejemplo de registros:**
Gastronomía Local;Gastronómico;48000
Crucero Lagos;Navegación;85000
Ruta de los Volcanes;Aventura;75000

## Funcionamiento del Programa

Al ejecutar la aplicación, el sistema realiza secuencialmente los siguientes procesos:

1. Instancia el componente de persistencia (GestorDatos).
2. Lee los flujos de texto de resources/tours.txt.
3. Tokeniza y convierte cada línea del archivo en un objeto de tipo Tour.
4. Almacena de forma indexada cada instancia dentro de un ArrayList<Tour>.
5. Recorre el catálogo completo imprimiendo el estado de los objetos.
6. Evalúa mediante estructuras condicionales los elementos que superan los $60.000.

## Ejemplo de Salida en Consola

----- CARGANDO DATOS DE LLANQUIHUE TOUR -----

[Catálogo Completo de Tours]:
Tour{nombreTour='Ruta de los Volcanes', tipoTour='Aventura', precio=85000}
Tour{nombreTour='Isla de Chiloé', tipoTour='Cultural', precio=62000}
Tour{nombreTour='Crucero Lagos', tipoTour='Navegación', precio=95000}
Tour{nombreTour='Gastronomía Local', tipoTour='Gastronómico', precio=48000}
Tour{nombreTour='Saltos del Petrohué', tipoTour='Naturaleza', precio=30000}

[Filtro] - Tours con valor superior a $60000:
- Ruta de los Volcanes (Aventura) -> $85000
- Isla de Chiloé (Cultural) -> $62000
- Crucero Lagos (Navegación) -> $95000

## Conceptos Aplicados

- **Abstracción y Encapsulamiento:** Ocultamiento de propiedades a través del modificador private.
- **Colecciones Genéricas Dinámicas:** Operaciones con estructuras de datos mutables (ArrayList).
- **Parsing de Archivos de Texto:** Procesamiento de cadenas con delimitadores tipográficos.
- **Estructura de Control de Flujo:** Iteraciones complejas mediante bucles de repetición for-each.
- **Modularidad Arquitectónica:** Separación limpia de responsabilidades lógicas en capas (ui, data, model).

## Requisitos para Ejecutar

- **Entorno de Ejecución:** Java Development Kit (JDK 17 o superior).
- **IDE Recomendado:** IntelliJ IDEA (con soporte de compilación nativo).
- **Estructura:** Mantener el directorio raíz resources con su archivo plano homónimo.

## Cómo Ejecutar el Proyecto

1. Clona el repositorio desde tu terminal de control de versiones.
2. Abre la raíz del directorio en IntelliJ IDEA.
3. Asegúrate de que las rutas relativas apunten correctamente al directorio resources.
4. Ejecuta el archivo ejecutable principal Main.java.

## Autor

- **Camilo Hidalgo Aranda** - Estudiante de Analista programador de DUOC UC para el ramo Desarrollo Orientado a Objetos I 
## Estado del Proyecto

- **Completado / Funcional** (Actividad Formativa Semana 4)