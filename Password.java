import java.io.Console;
class Password{
	// MAIN METHOD
	public static void main(String args[]){
		// USING CONSOLE CLASS 
		Console con=System.console();
		System.out.print("Enter Password:	");
		// READING PASSWORD FROM THE CONSOLE
		String pass=new String(con.readPassword());
		// PRINTING THE PASSWORD FROM THE CONSOLE
		System.out.println("Password is " + pass);
	}
}
