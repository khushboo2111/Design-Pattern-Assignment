package Factory;

public class SessionFactory {

	public static SessionInterface getSession1(String session)
	{
		if(session.trim().equalsIgnoreCase("Session 1"))
		return new Session();
		else if(session.trim().equalsIgnoreCase("Session 2")) 
			return new Session2();
		else 
				return null;
		
	}
}
