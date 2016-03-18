package defalt;

/*Classe com construtor para inicializar o nome do curso (courseName)*/

public class GradeBook {
	
	private String courseName; //Variável de instância courseName
	private String courseInstructorName; //Variável de instancia para armazenar o nome do instrutor do curso
	
	//Construtor para inicializar courseName com um argumento String
	/*Colocando um construtor podemos criar vários objetos, na classe main,
	 * com inicializações diferentes.*/
	public GradeBook(String NameOfCourse, String NameOfCourseInstructor)
	{
		courseName = NameOfCourse; //Inicializa courseName
		courseInstructorName = NameOfCourseInstructor; //Inicializa courseInstructorname
	}
	
	//Metodo que Configura o nome do curso
	public void setCourseName(String NameOfCourse) //Aqui Name é passado como parâmetro
	{
		courseName = NameOfCourse; //Aqui Name é passado como argumento
	}
	
	//Metodo que recupera o nome do curso
	public String getCourseName()
	{
		return courseName;
	}
	
	public void setCourseInstructorName(String NameOfCourseInstructorName)
	{
		courseInstructorName = NameOfCourseInstructorName;
	}
	
	public String getCourseInstructorName()
	{
		return courseInstructorName;
	}
	
	//Método para apresentar a mensagem
	public void displayMessage()
	{
		//Chama getCourseName para obter o nome do curso
		System.out.printf("Welcome to the Grade Book for: %s!\n",getCourseName());
		//Apresenta o nome do instrutor do curso
		System.out.printf("This course is presented by: %s!",getCourseInstructorName());
	}

}//Fim da classe GradeBook
