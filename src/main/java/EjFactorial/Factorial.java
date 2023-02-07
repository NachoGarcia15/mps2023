package EjFactorial;
/*
    Comentario
*/
public class Factorial {
    public int compute(int value){
        int result = 1;
        if (value < 0) {
            throw new NegativeValueException("El numero "+value+" es negativo");

        } else if ((value == 0) || (value == 1)){
            result = 1;
        } else if (value == 2){
            result = 2;
        } else{
            result = value * compute(value - 1);
        }
        return result;
    }
    void g(){
        //dfgdfg
    }
}
/*Maven
-------
•	mvn compile, compila el proyecto.
•	mvn clean, borra los archivos compilados.
•	mvn test, compila el proyecto y ejecuta los tests.
•	mvn package, compila el proyecto y los empaqueta en un archivo .jar.

Git
---
•	git init, inicializa un proyecto en local.
•	git status, muestra los archivos modificados y añadidos para el próximo commit.
•	git add <file>, añade el cambio (creación, modificación, eliminación) para el próximo commit.
•	git commit, crea un commit (confirmación de cambios) de los cambios añadidos. Se abrirá un editor de texto donde se puede especificar en la primera línea el título y en la tercera y consiguientes (separación de una línea por párrafo), la descripción. Con la flag -m podemos indicar el texto directamente el título, o descripción con cada -m más que hagamos. Por ejemplo:
git commit -m “Titulo” -m “Descripcion”
CUIDADO, si no pones -m se abrirá VIM, puedes escapar con ESC + : + q!.
•	git log, muestra el historial de commits.
•	git branch, muestra las ramas del repositorio.
•	git checkout -b <rama> / git branch <rama>, crea una rama y se cambia a esta.

 */
