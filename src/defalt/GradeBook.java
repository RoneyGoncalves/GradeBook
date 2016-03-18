package defalt;

/*Classe com construtor para inicializar o nome do curso (courseName)*/

public class GradeBook {
	
	private String courseName; //Variável de instância courseName
	
	//Construtor para inicializar courseName com um argumento String
	/*Colocando um construtor podemos criar vários objetos, na classe main,
	 * com inicializações diferentes.*/
	public GradeBook(String Name)
	{
		courseName = Name; //Inicializa courseName
	}
	
	//Metodo que Configura o nome do curso
	public void setCourseName(String Name) //Aqui Name é passado como parâmetro
	{
		courseName = Name; //Aqui Name é passado como argumento
	}
	
	//Metodo que recupera o nome do curso
	public String getCourseName()
	{
		return courseName;
	}
	
	//Método para apresentar a mensagem
	public void displayMessage()
	{
		//Chama getCourseName para obter o nome do curso
		System.out.printf("Welcome to the Grade Book for: \n%s!\n",getCourseName());
	}

}//Fim da classe GradeBook
