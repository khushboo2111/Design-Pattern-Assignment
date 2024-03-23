package EagerLoading;

public class Main {

	public static void main(String args[]) {
	JDBCImpl jdbc = JDBCImpl.getJDBCImpl();
	System.out.println(jdbc.hashCode());
	
	JDBCImpl jdbc1 = JDBCImpl.getJDBCImpl();
	System.out.println(jdbc1.hashCode());
	
	
	
	}
	
	
}
