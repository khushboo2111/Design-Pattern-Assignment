package LazyLoading;

public class JDBCImpl {


	private static JDBCImpl jdbc;
	private JDBCImpl()
	{
		
	}
	
	public static JDBCImpl getJDBCImpl()
	{
		synchronized(JDBCImpl.class){
		if(jdbc == null)
		{
		 jdbc = new JDBCImpl();
		}
		}
		return jdbc;
	}
	
}
