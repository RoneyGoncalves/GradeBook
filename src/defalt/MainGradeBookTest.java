package defalt;

import java.util.Scanner;

public class MainGradeBookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Cria dois objetos com argumentos de inicializa��o diferentes 
		 para a vari�vel de inst�ncia courseName da classe GradeBook*/
		GradeBook gradeBook1 = new GradeBook("Fuck of Java programing 1");
		GradeBook gradeBook2 = new GradeBook("Java fucking you, second chapter!");
		
		/*Exibe o valor inicial da vari�vel courseName dentro de cada objeto criado acima
		 chamando o m�todo getCourseName*/
		System.out.printf("Object gradeBook1 couseName is: \n%s\n!",gradeBook1.getCourseName());
		System.out.printf("Object gradeBook1 courseName is: \n%s\n",gradeBook2.getCourseName());
		
	}//Fim do metodo main

}//Fim da classe MainGradeBookTest

