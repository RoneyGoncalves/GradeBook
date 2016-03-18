package defalt;

/*Classe com variável de instância courseName e métodos get e set
 * para obter e configurar seu valor*/

public class GradeBook {
	
	private String courseName; //Variável de instância courseName
	
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
