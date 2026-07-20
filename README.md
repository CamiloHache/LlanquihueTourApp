![Duoc UC](https://www.duoc.cl/wp-content/uploads/2022/09/logo-0.png)

# Llanquihue Tour App - Sistema de Gestión Unificada (Semana 8)

Breve descripción del sistema 
## 🛠️ Clases e Interfaces Utilizadas

El sistema implementa los siguientes componentes clave orientados a objetos:

*   **`model.Registrable`**: Interfaz base que define el contrato común del sistema mediante el método `mostrarResumen()`.
*   **`model.GuiaTuristico`**: Clase que representa al personal de guía e implementa la interfaz `Registrable`.
*   **`model.Vehiculo`**: Clase que gestiona las unidades de transporte e implementa la interfaz `Registrable`.
*   **`model.ColaboradorExterno`**: Clase para prestadores de servicios externos vinculados a la agencia.
*   **`data.GestorEntidades`**: Clase controladora encargada de almacenar la colección dinámica unificada (`List<Registrable>`) y procesar la diferenciación de tipos en tiempo de ejecución.

## 🚀 Lógica de Diferenciación (`instanceof`)

Para cumplir con las operaciones específicas de cada entidad dentro de una misma colección genérica, el sistema utiliza de manera explícita el operador **`instanceof`**. Esto permite validar el tipo de objeto real y aplicar filtros lógicos personalizados antes de realizar la conversión de tipo (casting) segura para acceder a los atributos exclusivos de cada clase.


## 🧱 Organización de Paquetes y Arquitectura



Para asegurar una separación estricta de responsabilidades según la pauta, el proyecto se encuentra estructurado bajo la siguiente jerarquía de paquetes:



```text

LlanquihueTourApp/
├── resources/
│   └── tours.txt                           
├── src/
│    ├── data/
│    │    ├── GestorDatos.java              
│    │    ├── GestorEntidades.java           
│    │    └── GestorServicios.java          
│    ├── ui/
│    │   └── Main.java                      
│    ├── model/
│    │   ├── ColaboradorExterno.java          
│    │   ├── ExcursionCultural.java         
│    │   ├── GuiaTuristico.java                      
│    │   ├── PaseoLacustre.java         
│    │   ├── Registrable.java            # Interface abstracta para los servicios y rutas             
│    │   ├── RutaGastronomica.java          
│    │   ├── ServicioTuristico.java         
│    │   ├── Tour.java 
│    │   └── Vehiculo.java                      
│    └── utils/
│        └── Validador.java                 
│
└── README.md
```

## 💻 Instrucciones para Ejecutar el Programa

1. Abra el proyecto en **IntelliJ IDEA**.
2. Asegúrese de que la estructura de paquetes esté correctamente reconocida (`app`, `data`, `model`, `utils`).
3. Localice el archivo `Main.java` dentro del paquete `app`.
4. Haga clic derecho sobre el archivo y seleccione **Run 'Main.main()'**.
5. Se desplegará una interfaz gráfica interactiva (`JOptionPane`) que le permitirá:
    * Ingresar nuevos registros de forma dinámica.
    * Mostrar el catálogo total unificado.
    * Visualizar el procesamiento polimórfico y el filtrado por consola.

- **Camilo Hidalgo Aranda** - Estudiante de Analista programador de DUOC UC para el ramo Desarrollo Orientado a Objetos I 

Video explicativo: https://drive.google.com/file/d/1jaLoGB_cnQwb30Im_Ev6rCltbtfD1jEE/view?usp=sharing