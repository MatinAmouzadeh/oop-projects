
public class OverSizeOption extends GameMovableElementAdapter implements Runnable{

	private GameElementAdapter gBar;

	public OverSizeOption(int x, int y) {
		super("Images/OverSize40-40.jpg", x, y);

		setSpeedY(2);
		setSpeedX(0);
		setDownDirection();
		StopMoving();
	}

	public void CollideWith(GameElementAdapter element)
	{
		if ((element instanceof Bullet)||(element instanceof GBall))
		{
			StartMoving();
			return;
		}
		if (element instanceof GBar)
		{
			int CEntities = GGame.getcEntities();
			GameElementAdapter EntityArray[] = new GameElementAdapter[CEntities];
			EntityArray = GGame.getEntities();
			gBar = EntityArray[1];
			gBar.ChangeImage("Images/Bar1-200-20.jpg");

			Thread OptionalThread = new Thread(this);
			OptionalThread.start();

			this.Destroy();

			return;
		}
		// to collide with other elements
		this.goBack();
		this.StopMoving();

	}

	protected void CollideDownBorder()
	{
		super.CollideDownBorder();
		this.Destroy();
	}

	@Override
	public void run() {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		gBar.ChangeImage("Images/Bar2-150-15.jpg");
	}

}
