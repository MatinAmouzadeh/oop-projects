public class TirBrick extends MultiLifeBrick
{
	public TirBrick(int x , int y)
	{
		super("Images/TirBrick3.jpg" , x , y , 3);
		destroyedScore=50;

		setNextImage("Images/TirBrick1.jpg");
		setNextImage("Images/TirBrick2.jpg");
		setNextImage("Images/TirBrick3.jpg");
	}

	public void CollideWith(GameElementAdapter element)
	{
		if (getLifes() == 1) {
			int CTirBrick = Levels.getCTirBrick()-1;
			Levels.setCTirBrick(CTirBrick);
		}

		if (element instanceof GBar)
		{
			GGame.IncreaseFires(30);
			GGame.IncreaseScore(destroyedScore);
			this.Destroy();
			return;
		}
		super.CollideWith(element);
	}

}
