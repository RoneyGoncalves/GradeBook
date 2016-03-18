package defalt;

import java.util.Scanner;

public class MainGradeBookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Cria um scanner para obter entrada de dados pelo usu�rio
		Scanner input = new Scanner(System.in);
		
		//Cria um objeto para acessar a classe GradeBook
		GradeBook myGradeBook = new GradeBook();
		
		//Exibe o valor inicial da vari�vel courseName da classe GradeBook
		System.out.printf("Initial courseName is: %s \n\n",myGradeBook.getCourseName());
		
		//Solicita ao usu�rio que insira o nome do curso
		System.out.println("Please Enter your Course Name: ");
		String theName = input.nextLine();// L� o que o usu�rio digitou e atribui a vari�vel theName
		myGradeBook.setCourseName(theName);/*Configura o nome do curso, aqui a vari�vel 
		theName � passada como argumento para o m�todo setCourseName, que na classe GradeBook
		� atribuido ao par�metro Name, que � atribuido a vari�vel de inst�ncia courseName*/
		System.out.println();//Pula uma linha
		
		//Exibe a mensagem de boas vindas com o m�todo displayMessage
		myGradeBook.displayMessage();
	}//Fim do metodo main

}//Fim da classe MainGradeBookTest

