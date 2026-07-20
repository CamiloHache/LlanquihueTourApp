![Duoc UC](https://www.duoc.cl/wp-content/uploads/2022/09/logo-0.png)
# 🧠 Evaluación Final Transversal – Desarrollo Orientado a Objetos I
# Llanquihue Tour App 
## 👤 Autor del proyecto
- **Nombre completo:** Camilo Hidalgo Aranda
- **Carrera:** Analista Programador
- **Ramo:** Desarrollo Orientado a Objetos I
- **Profesor:** Pablo Vilches Valenzuela
- **Sede:** Sede virtual

---

## 📘 Descripción general del sistema
Este proyecto corresponde a la Evaluación Final Transversal de la asignatura *Desarrollo Orientado a Objetos I*. Se presenta una solución informática modular y escalable para **Llanquihue Tour** (en un principio, se pensó en hacer un proyecto nuevo desde cero, pero en función de la consulta que se levantó en el foro, se decidió a aplicar los cambios en el mismo cuerpo del proyecto que venimos trabajando todo el bimestre), un sistema unificado diseñado para la gestión integral de servicios turísticos, asignación de guías, control de vehículos de transporte y registro de colaboradores externos.

La arquitectura del sistema resuelve las necesidades del dominio real aplicando estrictamente los pilares de la Programación Orientada a Objetos:
*   **Encapsulamiento y Composición:** Uso de atributos privados con acceso controlado mediante getters/setters, integrando objetos complejos como `Rut` y `Direccion` dentro de las entidades del dominio para modelar relaciones del tipo "tiene un".
*   **Herencia:** Una jerarquía base robusta donde las clases específicas de servicios (`PaseoLacustre`, `RutaGastronomica`, `ExcursionCultural`) heredan y extienden el comportamiento de la clase base `ServicioTuristico`.
*   **Polimorfismo e Interfaces:** Centralización del comportamiento mediante la interfaz común `Registrable` y el uso de listas polimórficas dinámicas (`List<Registrable>`) gestionadas por la clase controladora `GestorEntidades`.
*   **Manejo de Archivos y Robustez:** Persistencia basada en la lectura y parsing de archivos planos `.txt` con lógica de descarte y control de excepciones, sumada a validaciones en tiempo real (`Validador`) para los datos capturados a través de la interfaz gráfica interactiva implementada con `JOptionPane`.

---

## 🧱 Estructura general del proyecto
```text

LlanquihueTourApp/
├── resources/
│   └── tours.txt                           
├── src/
│    ├── app/                           # Clase principal con el método main que orquesta el flujo de la aplicación
│    │   └── Main.java 
│    ├── data/                          # Clases controladoras de colecciones y carga/lectura de archivos persistentes (.txt)
│    │    ├── GestorDatos.java              
│    │    ├── GestorEntidades.java           
│    │    └── GestorServicios.java                              
│    ├── model/                         # Clases de dominio (Rut, Direccion, Vehiculo, ColaboradorExterno, ServicioTuristico y sub-clases)
│    │   ├── ColaboradorExterno.java          
│    │   ├── Direccion.java                    
│    │   ├── ExcursionCultural.java         
│    │   ├── GuiaTuristico.java                      
│    │   ├── PaseoLacustre.java         
│    │   ├── Registrable.java            
│    │   ├── Rut.java
│    │   ├── RutaGastronomica.java          
│    │   ├── ServicioTuristico.java         
│    │   ├── Tour.java 
│    │   └── Vehiculo.java                      
│    └── utils/                         # Clases utilitarias y centralización de validaciones lógicas del sistema
│        └── Validador.java                 
└── README.md
```

(Nota de arquitectura: Para mantener la consistencia y la compatibilidad con el repositorio histórico, las interfaces y las clases y las nuevas clases de dominio coexisten dentro del paquete model, asegurando el desacoplamiento).

## ⚙️ Instrucciones para clonar y ejecutar el programa

1. Clonar el respositorio desde **GitHub**.
git clone [https://github.com/CamiloHache/LlanquihueTourApp.git](https://github.com/CamiloHache/LlanquihueTourEFT.git)
2. Verifica que el archivo tours.txt esté correctamente ubicado dentro del directorio resources/.
3. Ejecuta el archivo Main.java desde el paquete app.
4. Interactúe con el sistema a través del menú gráfico desplegado mediante componentes JOptionPane.
   Repositorio GitHub: https://github.com/CamiloHache/LlanquihueTourApp
   Fecha de entrega: 19/07/2026

© Duoc UC | Escuela de Informática y Telecomunicaciones | Evaluación Final Transversal EFT 

---
Video explicativo: 