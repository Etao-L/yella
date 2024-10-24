import java.util.*;

public class Yella {
	public static void main(String[] args){
		{
			System.out.println("Hello World");
		}
		
		{
			System.out.print("Choose: ");
			System.out.print("\n Searching 1");
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			
			switch(choice){
			case 1:
			    System.out.println(" Hey : " + choice);
			    break;
			default:
			    System.out.println("No choice made, going to default. ");
			}
		}
	}

}
