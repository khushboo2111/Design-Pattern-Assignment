package Factory;

public class Main {

	public static void main(String[] args)
	{
		SessionInterface session = SessionFactory.getSession1("Session 1");
		session.getSession();
	}
}
