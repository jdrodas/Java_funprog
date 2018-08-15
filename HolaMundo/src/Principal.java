/*
Programa:       HolaMundo
Contacto:       Juan Dario Rodas - jdrodas@hotmail.com

Prop�sito:
----------
Demostrar el funcionamiento b�sico del Entorno Integrado de Desarrollo (IDE), realizando
las actividades de edici�n de c�digo, compilaci�n, depuraci�n y ejecuci�n de la aplicaci�n.
Visualizar informaci�n en la consola, en forma de cadena de caracteres.

*/
public class Principal {

	public static void main(String[] args) {

        //Comenzamos con la forma m�s b�sica de colocar informaci�n en consola.
        //Utilizamos el m�todo println de System.out
        //Escribe una cadena de caracteres, delimitada por las comillas dobles (")
		System.out.println("Hola Mundo!");

        //Esto mismo se puede lograr con el m�todo print() m�s el caracter especial \n
        // \n corresponde al salto de l�nea - tecla Intro/Retorno
        System.out.print("Hola Mundo!\n");
        
        //Aqui declaramos una variable tipo string
        String unaFrase;

        //Aqui le asignamos el valor inicial
        unaFrase = "Esta es una frase";

        //Aqui declaramos y asignamos en una sola sentencia
        String otraFrase = "Esta es otra frase";

        //aqui visualizamos las frases, una por l�nea
        System.out.println(unaFrase);
        System.out.println(otraFrase);

        //Una invocaci�n a print con solo el caracter especial \n 
        //genera un salto de l�nea
        System.out.print("\n");
        
        //Aqui podemos visualizar concatenando las frases con el operador + y
        //el caracter especial \n para el salto de l�nea
        System.out.println(unaFrase + "\n" + otraFrase + "\n");

	}

}