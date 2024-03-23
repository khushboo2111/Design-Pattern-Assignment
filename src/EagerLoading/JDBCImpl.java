package EagerLoading;

public class JDBCImpl {


	private static JDBCImpl jdbc = new JDBCImpl();
	
	
	public static JDBCImpl getJDBCImpl()
	{
		
		return jdbc;
	}
	
}
