![Duoc UC](https://www.duoc.cl/wp-content/uploads/2022/09/logo-0.png)

# Llanquihue Tour App - Semana 5 (Sumativa)

## Descripción del Proyecto

**Llanquihue Tour App** es un ecosistema modular avanzado en Java para la gestión automatizada de catálogos y personal de la agencia de turismo Llanquihue Tour, ubicada en la Región de Los Lagos.

## 🧱 Organización de Paquetes y Arquitectura

Para asegurar una separación estricta de responsabilidades según la pauta sumativa de la semana 5, el proyecto se encuentra estructurado bajo la siguiente jerarquía de paquetes:



```text

LlanquihueTourApp/
├── resources/
│   └── tours.txt            # Archivo plano con datos de Tours y Guías (delimitado por |)
├── src/
│    ├── iu/
│    │   └── Main.java        # Clase ejecutable con menú interactivo por consola
│    ├── model/
│    │   ├── Guia.java        # Modelo de la entidad Guía de Turismo
│    │   └── Tour.java        # Modelo Tour con la Composición fuerte de Guia
│    ├── data/
│    │   └── GestorDatos.java # Servicio que administra el parseo de datos (split por pipe)
│    └── util/
│        └── Validador.java   # Utilidades lógicas para validar restricciones de negocio
│
└── README.md
```

## ⚙️ Criterios y Buenas Prácticas Aplicados

 
### 1.- Organización Modular (Criterio 1): Código estructurado limpiamente en 4 paquetes funcionales independientes (iu, model, data, util), subsanando de raíz cualquier error de organización de entregas anteriores.

### 2.- Encapsulamiento POO (Criterio 2): Clases desarrolladas con buenas prácticas de programación orientada a objetos (POO), incluyendo atributos privados, constructores parametrizados, getters, setters y el método toString() sobreescrito.

### 3.- Composición de Objetos (Criterio 3): Relación fuerte HAS-A. Cada tour cuenta con una referencia obligatoria a un objeto de tipo Guia como atributo de composición interna. No puede existir un tour sin un guía responsable.

### 4.- Colecciones y Persistencia (Criterio 4): Lector basado en BufferedReader que procesa el archivo plano delimitado por el caracter pipe | (split("\\|")) y carga un ArrayList<Tour> de forma dinámica y controlada.

### 5.- Robustez y Validación (Criterio 2/4): Exclusiones controladas mediante la clase de utilidad Validador dentro de bloques seguros try-catch para evitar que datos vacíos o valores numéricos negativos corrompan el sistema.

## 🚀 Instrucciones de Ejecución

### 1.- Abra el proyecto en su IDE de preferencia (IntelliJ IDEA o Cursor).

### 2.- Verifique la ubicación del archivo tours.txt dentro del directorio resources/ en la raíz de la aplicación.

### 3.- Diríjase a src/iu/Main.java y ejecute el método main.

### 4.- Utilice el menú interactivo para desplegar el catálogo de tours, el detalle de sus guías asociados o ejecutar filtros lógicos de precio y tipo de viaje.
## Autor

- **Camilo Hidalgo Aranda** - Estudiante de Analista programador de DUOC UC para el ramo Desarrollo Orientado a Objetos I 
## Estado del Proyecto

- **Completado / Funcional** (Actividad Sumativa semana 5)