package defalt;

/*Classe com construtor para inicializar o nome do curso (courseName)*/

public class GradeBook {
	
	private String courseName; //Vari�vel de inst�ncia courseName
	private String courseInstructorName; //Vari�vel de instancia para armazenar o nome do instrutor do curso
	
	//Construtor para inicializar courseName com um argumento String
	/*Colocando um construtor podemos criar v�rios objetos, na classe main,
	 * com inicializa��es diferentes.*/
	public GradeBook(String NameOfCourse, String NameOfCourseInstructor)
	{
		courseName = NameOfCourse; //Inicializa courseName
		courseInstructorName = NameOfCourseInstructor; //Inicializa courseInstructorname
	}
	
	//Metodo que Configura o nome do curso
	public void setCourseName(String NameOfCourse) //Aqui Name � passado como par�metro
	{
		courseName = NameOfCourse; //Aqui Name � passado como argumento
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
	
	//M�todo para apresentar a mensagem
	public void displayMessage()
	{
		//Chama getCourseName para obter o nome do curso
		System.out.printf("Welcome to the Grade Book for: %s!\n",getCourseName());
		//Apresenta o nome do instrutor do curso
		System.out.printf("This course is presented by: %s!",getCourseInstructorName());
	}

}//Fim da classe GradeBook
