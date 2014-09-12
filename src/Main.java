import java.util.ArrayList;


public class Main {
public int searchdepth;
public ArrayList<Route> roads=new ArrayList<Route>();
	
	public static void main(String[] args) {
		makeroutes(args[0]);
		findDestination(args[1],args[2]);
		printOut();
	}
	private static void makeroutes(String string) {
        System.out.println(string);

	}
	private static void findDestination(String start, String end) {
        System.out.println(start);
        System.out.println(end);
	}
	private static void printOut() {
		// TODO Auto-generated method stub

	}
	
}

