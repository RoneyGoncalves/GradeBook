package defalt;

import java.util.Scanner;

public class MainGradeBookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Cria um scanner para ler os dados inseridos pelo usuário
		Scanner input = new Scanner(System.in);
		
		//Cria um objeto para chamar os métodos da classe GradeBook
		GradeBook myGradeBook = new GradeBook();
		
		//Pede ao usuário que digite o nome do curso
		System.out.println("Please enter de Course Name: ");
		
		//Atribui o dado inserido pelo usuário a variável nameOfCourse utilizando o objeto input
		String nameOfCourse = input.nextLine();
		
		//Pula uma linha
		
		
		//Chama o método displayMessage da classe GradeBook, com o parâmetro name OfCourse, através do objeto myGradeBook
		myGradeBook.displayMessage(nameOfCourse);

	}//Fim do metodo main

}//Fim da classe MainGradeBookTest

/* Ao final deste programa o parâmetro courseName, do método displayMessage da classe
GradeBook, recebe o valor da variável nameOfCourse,
Que nesta Classe (Main) recebe o valor do objeto input que recebe o valor do dado 
inserido pelo usuário.
*/
