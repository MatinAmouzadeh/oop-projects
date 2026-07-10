public class Main
{
	public static void main(String[] args)
	{
		GGame game=new GGame();
		Thread T = new Thread(game);
		T.start();

	}// end of main
}
