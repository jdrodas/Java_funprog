/*
Programa:       HolaMundo
Contacto:       Juan Dario Rodas - jdrodas@hotmail.com

Propósito:
----------
Demostrar el funcionamiento básico del Entorno Integrado de Desarrollo (IDE), realizando
las actividades de edición de código, compilación, depuración y ejecución de la aplicación.
Visualizar información en la consola, en forma de cadena de caracteres.

*/
public class Principal {

	public static void main(String[] args) {

        //Comenzamos con la forma más básica de colocar información en consola.
        //Utilizamos el método println de System.out
        //Escribe una cadena de caracteres, delimitada por las comillas dobles (")
		System.out.println("Hola Mundo!");

        //Esto mismo se puede lograr con el método print() más el caracter especial \n
        // \n corresponde al salto de línea - tecla Intro/Retorno
        System.out.print("Hola Mundo!\n");
        
        //Aqui declaramos una variable tipo string
        String unaFrase;

        //Aqui le asignamos el valor inicial
        unaFrase = "Esta es una frase";

        //Aqui declaramos y asignamos en una sola sentencia
        String otraFrase = "Esta es otra frase";

        //aqui visualizamos las frases, una por línea
        System.out.println(unaFrase);
        System.out.println(otraFrase);

        //Una invocación a print con solo el caracter especial \n 
        //genera un salto de línea
        System.out.print("\n");
        
        //Aqui podemos visualizar concatenando las frases con el operador + y
        //el caracter especial \n para el salto de línea
        System.out.println(unaFrase + "\n" + otraFrase + "\n");

	}

}