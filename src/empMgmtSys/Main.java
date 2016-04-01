package empMgmtSys;

import java.sql.SQLException;
import java.util.*;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		System.out.println("Choose one option from following : ");
		System.out.println("1) create a new employee data ");
		System.out.println("2) read a employee  data");
		System.out.println("3) update a employee data");
		System.out.println("4) delete a employee data");
		System.out.println("5) Exit.");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		

		Empcondition empcondition = new Empcondition();
		empcondition.conditon(i);

	}
}
