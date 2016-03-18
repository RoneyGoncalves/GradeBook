package defalt;

/*Classe com vari�vel de inst�ncia courseName e m�todos get e set
 * para obter e configurar seu valor*/

public class GradeBook {
	
	private String courseName; //Vari�vel de inst�ncia courseName
	
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
