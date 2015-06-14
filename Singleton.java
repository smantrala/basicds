class Singleton
{

	private static final Singleton x = new Singletion();

	private Singleton()
	{
	}

	public static Singleton getSingleton()
	{
		return x;
	}

}