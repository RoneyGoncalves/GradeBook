package defalt;

import java.util.Scanner;

public class MainGradeBookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Cria um scanner para ler os dados inseridos pelo usu�rio
		Scanner input = new Scanner(System.in);
		
		//Cria um objeto para chamar os m�todos da classe GradeBook
		GradeBook myGradeBook = new GradeBook();
		
		//Pede ao usu�rio que digite o nome do curso
		System.out.println("Please enter de Course Name: ");
		
		//Atribui o dado inserido pelo usu�rio a vari�vel nameOfCourse utilizando o objeto input
		String nameOfCourse = input.nextLine();
		
		//Pula uma linha
		
		
		//Chama o m�todo displayMessage da classe GradeBook, com o par�metro name OfCourse, atrav�s do objeto myGradeBook
		myGradeBook.displayMessage(nameOfCourse);

	}//Fim do metodo main

}//Fim da classe MainGradeBookTest

/* Ao final deste programa o par�metro courseName, do m�todo displayMessage da classe
GradeBook, recebe o valor da vari�vel nameOfCourse,
Que nesta Classe (Main) recebe o valor do objeto input que recebe o valor do dado 
inserido pelo usu�rio.
*/
