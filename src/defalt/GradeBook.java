package defalt;

/*Classe com construtor para inicializar o nome do curso (courseName)*/

public class GradeBook {
	
	private String courseName; //Vari�vel de inst�ncia courseName
	
	//Construtor para inicializar courseName com um argumento String
	/*Colocando um construtor podemos criar v�rios objetos, na classe main,
	 * com inicializa��es diferentes.*/
	public GradeBook(String Name)
	{
		courseName = Name; //Inicializa courseName
	}
	
	//Metodo que Configura o nome do curso
	public void setCourseName(String Name) //Aqui Name � passado como par�metro
	{
		courseName = Name; //Aqui Name � passado como argumento
	}
	
	//Metodo que recupera o nome do curso
	public String getCourseName()
	{
		return courseName;
	}
	
	//M�todo para apresentar a mensagem
	public void displayMessage()
	{
		//Chama getCourseName para obter o nome do curso
		System.out.printf("Welcome to the Grade Book for: \n%s!\n",getCourseName());
	}

}//Fim da classe GradeBook
