
public class BallAddOption extends GameMovableElementAdapter{

	public BallAddOption(int x, int y) {
		super("Images/BallAdd40-40.jpg", x, y);

		setSpeedY(2);
		setSpeedX(0);
		setDownDirection();
		StopMoving();
	}

	public void CollideWith(GameElementAdapter element)
	{
		if ((element instanceof Bullet)||(element instanceof GBall))
		{
			this.StartMoving();
			return;
		}
		if (element instanceof GBar)
		{
			int CEntities = GGame.getcEntities();
			GameElementAdapter EntityArray[] = new GameElementAdapter[CEntities];
			EntityArray = GGame.getEntities();
			GameElementAdapter Ball_1 = EntityArray[2];
			GBall Ball_2 = new GBall(Ball_1.getX(), Ball_1.getY());
			GGame.addNewEntity(Ball_2);
			GBall.setNumBall(GBall.getNumBall()+1);
			GGame.replaceEntityByEntityArray(GBall.getNumBall()+1, Ball_2.getID());

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

}
