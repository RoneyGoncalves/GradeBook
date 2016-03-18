package defalt;

public class MainGradeBookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Cria dois objetos com argumentos de inicialização diferentes 
		 para a variável de instância courseName e courseInstructorName da classe GradeBook*/
		GradeBook gradeBook1 = new GradeBook("Fuck of Java programing 1","Baracho");
		GradeBook gradeBook2 = new GradeBook("Java fucking you, second chapter!","Barachinho");
		
		/*Exibe o valor inicial das variáveis de instância dentro de cada objeto*/
		System.out.printf("Object gradeBook1 couseName is: %s!\n",gradeBook1.getCourseName());
		System.out.printf("and couseInstructorName is: %s!\n",gradeBook1.getCourseInstructorName());
		System.out.println(); //Pula uma linha
		System.out.printf("Object gradeBook1 courseName is: %s!\n",gradeBook2.getCourseName());
		System.out.printf("and couseInstructorName is: %s!\n",gradeBook2.getCourseInstructorName());
		
	}//Fim do metodo main

}//Fim da classe MainGradeBookTest

