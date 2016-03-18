package defalt;

import java.util.Scanner;

public class MainGradeBookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Cria um scanner para obter entrada de dados pelo usuário
		Scanner input = new Scanner(System.in);
		
		//Cria um objeto para acessar a classe GradeBook
		GradeBook myGradeBook = new GradeBook();
		
		//Exibe o valor inicial da variável courseName da classe GradeBook
		System.out.printf("Initial courseName is: %s \n\n",myGradeBook.getCourseName());
		
		//Solicita ao usuário que insira o nome do curso
		System.out.println("Please Enter your Course Name: ");
		String theName = input.nextLine();// Lê o que o usuário digitou e atribui a variável theName
		myGradeBook.setCourseName(theName);/*Configura o nome do curso, aqui a variável 
		theName é passada como argumento para o método setCourseName, que na classe GradeBook
		é atribuido ao parâmetro Name, que é atribuido a variável de instância courseName*/
		System.out.println();//Pula uma linha
		
		//Exibe a mensagem de boas vindas com o método displayMessage
		myGradeBook.displayMessage();
	}//Fim do metodo main

}//Fim da classe MainGradeBookTest

