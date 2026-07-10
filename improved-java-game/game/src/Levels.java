public abstract class Levels
{
	public static final int	FinalLevel	=10;

	private static int level = 1;

	private static int cBeton = 0;

	private static int cTirBrick = 0;

	public static int getLevel() {
		return level;
	}

	public static void SetLevel(GGame game , int theLevel)
	{
		level = 1;
		if (theLevel==1)
		{
			// configs of Level 1
			PlayerInfo p=new PlayerInfo();
			p.setLives(3);
			p.setFires(0);
			p.setScore(0);
			p.setPlayerName("M.A");
			p.setCurrentLevel(1);

			game.setPlayerInfo(p);
			LoadMap(game , 1);
		}

		else if (theLevel<=FinalLevel)
		{
			PlayerInfo p=game.getPlayerInfo();
			p.setCurrentLevel(p.getCurrentLevel()+1);
			game.setPlayerInfo(p);
			LoadMap(game , theLevel);
		}

	}


	public static int getCBeton() {
		return cBeton;
	}

	public static void setCBeton(int cBeton) {
		Levels.cBeton = cBeton;
	}

	public static int getCTirBrick() {
		return cTirBrick;
	}

	public static void setCTirBrick(int cTirBrick) {
		Levels.cTirBrick = cTirBrick;
	}


	private static void LoadMap(GGame game , int level)
	{
		if (level==1)
			LoadMap1(game);
		if (level==2)
			LoadMap2(game);
		if (level==3)
			LoadMap3(game);
		if (level==4)
			LoadMap4(game);
		if (level==5)
			LoadMap5(game);
		if (level==6)
			LoadMap6(game);
		if (level==7)
			LoadMap7(game);
		if (level==8)
			LoadMap8(game);
		if (level==9)
			LoadMap9(game);
		if (level==10)
			LoadMap10(game);
	}


	private static void LoadMap6(GGame game)
	{
		game.clearEntities();
		// Static parts
		game.setNextEntity(new GBackground(0 , 0 , 3));
		game.setNextEntity(new GBar(300 , 560));
		game.setNextEntity(new GBall(365 , 540));

		cBeton = 0;
		// Other Elements (from MAP)


		game.setNextEntity(new MovingSekkeBrick30(220 , 60));
		game.setNextEntity(new MovingSekkeBrick30(280 , 60));
		game.setNextEntity(new MovingSekkeBrick30(340 , 60));
		game.setNextEntity(new MovingSekkeBrick30(400 , 60));
		game.setNextEntity(new MovingSekkeBrick30(460 , 60));
		game.setNextEntity(new MovingSekkeBrick30(520 , 60));
		game.setNextEntity(new MovingSekkeBrick30(580 , 60));
		game.setNextEntity(new GBad(120 , 100));
		game.setNextEntity(new GBad(200 , 100));
		game.setNextEntity(new GBad(280 , 100));
		game.setNextEntity(new GBad(360 , 100));
		game.setNextEntity(new GBad(440 , 100));
		game.setNextEntity(new GBad(520 , 100));
		game.setNextEntity(new GBad(600 , 100));
		game.setNextEntity(new GBad(660 , 100));
		game.setNextEntity(new GHeart(120 , 200));
		game.setNextEntity(new GHeart(260 , 200));
		game.setNextEntity(new BallAddOption(380 , 200));
		game.setNextEntity(new GHeart(500 , 200));
		game.setNextEntity(new GHeart(620 , 200));
		game.setNextEntity(new Beton(100 , 280 , Beton.Beton_20_60));
		cBeton++;
		game.setNextEntity(new Beton(100 , 340 , Beton.Beton_20_60));
		cBeton++;
		game.setNextEntity(new Beton(180 , 280 , Beton.Beton_20_60));
		cBeton++;
		game.setNextEntity(new Beton(180 , 340 , Beton.Beton_20_60));
		cBeton++;
		game.setNextEntity(new Beton(260 , 280 , Beton.Beton_20_60));
		cBeton++;
		game.setNextEntity(new Beton(260 , 340 , Beton.Beton_20_60));
		cBeton++;
		game.setNextEntity(new Beton(340 , 280 , Beton.Beton_20_60));
		cBeton++;
		game.setNextEntity(new Beton(340 , 340 , Beton.Beton_20_60));
		cBeton++;
		game.setNextEntity(new Beton(420 , 280 , Beton.Beton_20_60));
		cBeton++;
		game.setNextEntity(new Beton(420 , 340 , Beton.Beton_20_60));
		cBeton++;
		game.setNextEntity(new Beton(500 , 280 , Beton.Beton_20_60));
		cBeton++;
		game.setNextEntity(new Beton(500 , 340 , Beton.Beton_20_60));
		cBeton++;
		game.setNextEntity(new Beton(580 , 280 , Beton.Beton_20_60));
		cBeton++;
		game.setNextEntity(new Beton(580 , 340 , Beton.Beton_20_60));
		cBeton++;
		game.setNextEntity(new Beton(660 , 280 , Beton.Beton_20_60));
		cBeton++;
		game.setNextEntity(new Beton(660 , 340 , Beton.Beton_20_60));
		cBeton++;
	}

	private static void LoadMap1(GGame game)
	{
		game.clearEntities();
		// Static parts
		game.setNextEntity(new GBackground(0 , 0 , 3));
		game.setNextEntity(new GBar(300 , 560));
		game.setNextEntity(new GBall(365 , 540));

		// Other Elements (from MAP)

		game.setNextEntity(new Brick(0,40,Brick.Brick_20_60));
		game.setNextEntity(new Brick(60,40,Brick.Brick_20_60));
		game.setNextEntity(new Brick(80,100,Brick.Brick_40_20));
		game.setNextEntity(new Brick(20,100,Brick.Brick_40_20));
		game.setNextEntity(new Brick(120,40,Brick.Brick_20_60));
		game.setNextEntity(new Brick(40,120,Brick.Brick_20_20));
		game.setNextEntity(new Brick(80,120,Brick.Brick_20_20));
		game.setNextEntity(new Brick(160,60,Brick.Brick_20_60));
		game.setNextEntity(new Brick(160,40,Brick.Brick_20_20));
		game.setNextEntity(new Brick(160,120,Brick.Brick_20_20));
		game.setNextEntity(new Brick(180,40,Brick.Brick_40_20));
		game.setNextEntity(new Brick(180,80,Brick.Brick_40_20));
		game.setNextEntity(new Brick(180,120,Brick.Brick_40_20));
		game.setNextEntity(new Brick(240,40,Brick.Brick_20_60));
		game.setNextEntity(new Brick(240,100,Brick.Brick_20_40));
		game.setNextEntity(new Brick(340,40,Brick.Brick_40_20));
		game.setNextEntity(new Brick(300,80,Brick.Brick_20_20));
		game.setNextEntity(new Brick(260,120,Brick.Brick_40_20));
		game.setNextEntity(new Brick(340,120,Brick.Brick_40_20));
		game.setNextEntity(new Brick(320,60,Brick.Brick_20_60));
		game.setNextEntity(new Brick(380,60,Brick.Brick_20_20));
		game.setNextEntity(new Brick(380,100,Brick.Brick_20_20));
		game.setNextEntity(new Brick(420,60,Brick.Brick_20_60));
		game.setNextEntity(new Brick(500,60,Brick.Brick_20_60));
		game.setNextEntity(new Brick(440,120,Brick.Brick_60_20));
		game.setNextEntity(new Brick(440,40,Brick.Brick_60_20));
		game.setNextEntity(new Brick(380,120,Brick.Brick_20_20));
		game.setNextEntity(new Brick(380,40,Brick.Brick_20_20));
		game.setNextEntity(new Brick(540,80,Brick.Brick_20_60));
		game.setNextEntity(new Brick(560,60,Brick.Brick_40_20));
		game.setNextEntity(new Brick(580,40,Brick.Brick_20_20));
		game.setNextEntity(new Brick(600,80,Brick.Brick_20_60));
		game.setNextEntity(new Brick(620,40,Brick.Brick_20_20));
		game.setNextEntity(new Brick(620,60,Brick.Brick_40_20));
		game.setNextEntity(new Brick(660,80,Brick.Brick_20_60));
		game.setNextEntity(new GBad(440,60));
		game.setNextEntity(new GHeart(340,80));
		game.setNextEntity(new Brick(700,60,Brick.Brick_20_60));
		game.setNextEntity(new Brick(720,40,Brick.Brick_40_20));
		game.setNextEntity(new Brick(720,80,Brick.Brick_40_20));
		game.setNextEntity(new Brick(720,120,Brick.Brick_40_20));
		game.setNextEntity(new Brick(700,40,Brick.Brick_20_20));
		game.setNextEntity(new Brick(700,120,Brick.Brick_20_20));
		game.setNextEntity(new MovingSekkeBrick30(600,180));
		game.setNextEntity(new MovingSekkeBrick30(60,180));
		game.setNextEntity(new MovingSekkeBrick30(360,180));
	}

	private static void LoadMap2(GGame game)
	{
		game.clearEntities();
		// Static parts
		game.setNextEntity(new GBackground(0 , 0 , 0));
		game.setNextEntity(new GBar(300 , 560));
		game.setNextEntity(new GBall(365 , 540));

		cBeton = 0;
		cTirBrick = 0;

		// Other Elements (from MAP)

		game.setNextEntity(new GBad(700 , 400));
		game.setNextEntity(new MovingSekkeBrick30(700 , 50));
		game.setNextEntity(new GHeart(60 , 120));
		game.setNextEntity(new TirBrick(700 , 100));
		cTirBrick++;


		game.setNextEntity(new Brick(200 , 200 , Brick.Brick_60_20));
		game.setNextEntity(new Brick(260 , 200 , Brick.Brick_60_20));
		game.setNextEntity(new Brick(320 , 200 , Brick.Brick_60_20));
		game.setNextEntity(new Brick(380 , 200 , Brick.Brick_60_20));
		game.setNextEntity(new Brick(440 , 200 , Brick.Brick_60_20));
		game.setNextEntity(new Brick(500 , 200 , Brick.Brick_60_20));
		game.setNextEntity(new Brick(560 , 200 , Brick.Brick_60_20));
		game.setNextEntity(new Brick(620 , 200 , Brick.Brick_60_20));
		game.setNextEntity(new Brick(140 , 200 , Brick.Brick_60_20));
		game.setNextEntity(new Brick(100 , 180 , Brick.Brick_60_20));
		game.setNextEntity(new Brick(160 , 180 , Brick.Brick_60_20));
		game.setNextEntity(new Brick(220 , 180 , Brick.Brick_60_20));
		game.setNextEntity(new Brick(280 , 180 , Brick.Brick_60_20));
		game.setNextEntity(new Brick(340 , 180 , Brick.Brick_60_20));
		game.setNextEntity(new Brick(400 , 180 , Brick.Brick_60_20));
		game.setNextEntity(new Brick(460 , 180 , Brick.Brick_60_20));
		game.setNextEntity(new Brick(520 , 180 , Brick.Brick_60_20));
		game.setNextEntity(new Brick(580 , 180 , Brick.Brick_60_20));
		game.setNextEntity(new Brick(640 , 180 , Brick.Brick_60_20));
		game.setNextEntity(new Brick(600 , 220 , Brick.Brick_60_20));
		game.setNextEntity(new Brick(540 , 220 , Brick.Brick_60_20));
		game.setNextEntity(new Brick(480 , 220 , Brick.Brick_60_20));
		game.setNextEntity(new Brick(420 , 220 , Brick.Brick_60_20));
		game.setNextEntity(new Brick(360 , 220 , Brick.Brick_60_20));
		game.setNextEntity(new Brick(300 , 220 , Brick.Brick_60_20));
		game.setNextEntity(new Brick(240 , 220 , Brick.Brick_60_20));
		game.setNextEntity(new Brick(180 , 220 , Brick.Brick_60_20));
		game.setNextEntity(new Brick(220 , 240 , Brick.Brick_60_20));
		game.setNextEntity(new Brick(280 , 240 , Brick.Brick_60_20));
		game.setNextEntity(new Brick(340 , 240 , Brick.Brick_60_20));
		game.setNextEntity(new Brick(400 , 240 , Brick.Brick_60_20));
		game.setNextEntity(new Brick(460 , 240 , Brick.Brick_60_20));
		game.setNextEntity(new Brick(520 , 240 , Brick.Brick_60_20));
		game.setNextEntity(new Brick(580 , 240 , Brick.Brick_60_20));
		game.setNextEntity(new TirBrick(360 , 140));
		cTirBrick++;
		game.setNextEntity(new SekkeBrick10(320 , 140));
		game.setNextEntity(new SekkeBrick10(280 , 140));
		game.setNextEntity(new SekkeBrick10(440 , 140));
		game.setNextEntity(new SekkeBrick10(480 , 140));
		game.setNextEntity(new Beton(280 , 120 , Beton.Beton_60_20));
		cBeton++;
		game.setNextEntity(new Beton(340 , 120 , Beton.Beton_60_20));
		cBeton++;
		game.setNextEntity(new Beton(400 , 120 , Beton.Beton_60_20));
		cBeton++;
		game.setNextEntity(new Beton(460 , 120 , Beton.Beton_60_20));
		cBeton++;
		game.setNextEntity(new Beton(260 , 120 , Beton.Beton_20_60));
		cBeton++;
		game.setNextEntity(new Beton(520 , 120 , Beton.Beton_20_60));
		cBeton++;
		game.setNextEntity(new Brick(260 , 260 , Brick.Brick_60_20));
		game.setNextEntity(new Brick(320 , 260 , Brick.Brick_60_20));
		game.setNextEntity(new Brick(380 , 260 , Brick.Brick_60_20));
		game.setNextEntity(new Brick(440 , 260 , Brick.Brick_60_20));
		game.setNextEntity(new Brick(500 , 260 , Brick.Brick_60_20));
		game.setNextEntity(new Brick(560 , 260 , Brick.Brick_60_20));
		game.setNextEntity(new Brick(120 , 200 , Brick.Brick_20_20));
		game.setNextEntity(new Brick(140 , 220 , Brick.Brick_40_20));
		game.setNextEntity(new Brick(160 , 240 , Brick.Brick_60_20));
		game.setNextEntity(new Brick(200 , 260 , Brick.Brick_60_20));
		game.setNextEntity(new Brick(180 , 260 , Brick.Brick_20_20));
		game.setNextEntity(new TirBrick(400 , 140));
		cTirBrick++;
	}

	private static void LoadMap4(GGame game) {
		game.clearEntities();
		// Static parts
		game.setNextEntity(new GBackground(0 , 0 , 1));
		game.setNextEntity(new GBar(300 , 560));
		game.setNextEntity(new GBall(365 , 540));

		cBeton = 0;
		cTirBrick = 0;

		// Other Elements (from MAP)

		game.setNextEntity(new Brick(60,200,Brick.Brick_20_60));
		game.setNextEntity(new Brick(60,260,Brick.Brick_20_60));
		game.setNextEntity(new Brick(60,320,Brick.Brick_20_60));
		game.setNextEntity(new Brick(80,360,Brick.Brick_60_20));
		game.setNextEntity(new Brick(140,360,Brick.Brick_60_20));
		game.setNextEntity(new Brick(200,360,Brick.Brick_60_20));
		game.setNextEntity(new Brick(260,320,Brick.Brick_20_60));
		game.setNextEntity(new Brick(260,260,Brick.Brick_20_60));
		game.setNextEntity(new Brick(260,200,Brick.Brick_20_60));
		game.setNextEntity(new Brick(80,180,Brick.Brick_60_20));
		game.setNextEntity(new Brick(200,180,Brick.Brick_60_20));
		game.setNextEntity(new Brick(140,180,Brick.Brick_60_20));
		game.setNextEntity(new Brick(100,160,Brick.Brick_60_20));
		game.setNextEntity(new Brick(180,160,Brick.Brick_60_20));
		game.setNextEntity(new Brick(160,160,Brick.Brick_20_20));
		game.setNextEntity(new Brick(120,140,Brick.Brick_60_20));
		game.setNextEntity(new Brick(180,140,Brick.Brick_40_20));
		game.setNextEntity(new Brick(160,120,Brick.Brick_40_20));
		game.setNextEntity(new Brick(140,120,Brick.Brick_20_20));
		game.setNextEntity(new Brick(160,100,Brick.Brick_20_20));
		game.setNextEntity(new Brick(60,180,Brick.Brick_20_20));
		game.setNextEntity(new Brick(260,180,Brick.Brick_20_20));
		game.setNextEntity(new Brick(140,300,Brick.Brick_20_60));
		game.setNextEntity(new Brick(180,300,Brick.Brick_20_60));
		game.setNextEntity(new Brick(140,280,Brick.Brick_60_20));
		game.setNextEntity(new Brick(100,220,Brick.Brick_20_40));
		game.setNextEntity(new Brick(120,220,Brick.Brick_20_40));
		game.setNextEntity(new Brick(200,220,Brick.Brick_20_40));
		game.setNextEntity(new Brick(220,220,Brick.Brick_20_40));
		game.setNextEntity(new OverSizeOption(80,40));
		game.setNextEntity(new Brick(160,40,Brick.Brick_20_20));
		game.setNextEntity(new OverSizeOption(120,40));
		game.setNextEntity(new Brick(260,140,Brick.Brick_20_40));
		game.setNextEntity(new GHeart(100,300));
		game.setNextEntity(new GHeart(220,300));
		game.setNextEntity(new Beton(300,300,Beton.Beton_60_20));
		cBeton++;
		game.setNextEntity(new Beton(340,280,Beton.Beton_40_20));
		cBeton++;
		game.setNextEntity(new Beton(620,260,Beton.Beton_20_20));
		cBeton++;
		game.setNextEntity(new Beton(580,260,Beton.Beton_20_20));
		cBeton++;
		game.setNextEntity(new Beton(600,260,Beton.Beton_20_20));
		cBeton++;
		game.setNextEntity(new Beton(400,220,Beton.Beton_40_20));
		cBeton++;
		game.setNextEntity(new Beton(500,300,Beton.Beton_40_20));
		cBeton++;
		game.setNextEntity(new Beton(540,300,Beton.Beton_40_20));
		cBeton++;
		game.setNextEntity(new Beton(580,300,Beton.Beton_40_20));
		cBeton++;
		game.setNextEntity(new Beton(620,300,Beton.Beton_20_40));
		cBeton++;
		game.setNextEntity(new Beton(620,340,Beton.Beton_20_40));
		cBeton++;
		game.setNextEntity(new Beton(540,380,Beton.Beton_40_20));
		cBeton++;
		game.setNextEntity(new Beton(540,340,Beton.Beton_40_20));
		cBeton++;
		game.setNextEntity(new Beton(580,360,Beton.Beton_40_20));
		cBeton++;
		game.setNextEntity(new Beton(460,360,Beton.Beton_60_20));
		cBeton++;
		game.setNextEntity(new Beton(520,360,Beton.Beton_20_20));
		cBeton++;
		game.setNextEntity(new Beton(340,340,Beton.Beton_40_20));
		cBeton++;
		game.setNextEntity(new Beton(380,360,Beton.Beton_20_20));
		cBeton++;
		game.setNextEntity(new Beton(400,360,Beton.Beton_60_20));
		cBeton++;
		game.setNextEntity(new Beton(360,300,Beton.Beton_60_20));
		cBeton++;
		game.setNextEntity(new Beton(440,300,Beton.Beton_60_20));
		cBeton++;
		game.setNextEntity(new Beton(420,300,Beton.Beton_20_20));
		cBeton++;
		game.setNextEntity(new Beton(300,360,Beton.Beton_40_20));
		cBeton++;
		game.setNextEntity(new Beton(340,380,Beton.Beton_40_20));
		cBeton++;
		game.setNextEntity(new Beton(300,320,Beton.Beton_20_40));
		cBeton++;
		game.setNextEntity(new Beton(600,280,Beton.Beton_20_20));
		cBeton++;
		game.setNextEntity(new Beton(360,260,Beton.Beton_40_20));
		cBeton++;
		game.setNextEntity(new Beton(380,240,Beton.Beton_40_20));
		cBeton++;
		game.setNextEntity(new Beton(480,220,Beton.Beton_40_20));
		cBeton++;
		game.setNextEntity(new Beton(440,220,Beton.Beton_40_20));
		cBeton++;
		game.setNextEntity(new Beton(520,280,Beton.Beton_40_20));
		cBeton++;
		game.setNextEntity(new Beton(520,260,Beton.Beton_40_20));
		cBeton++;
		game.setNextEntity(new Beton(500,240,Beton.Beton_40_20));
		cBeton++;
		game.setNextEntity(new GBad(420,240));
		game.setNextEntity(new Beton(640,360,Beton.Beton_20_20));
		cBeton++;
		game.setNextEntity(new Brick(280,60,Brick.Brick_20_20));
		game.setNextEntity(new Brick(320,20,Brick.Brick_20_20));
		game.setNextEntity(new Brick(260,100,Brick.Brick_20_20));


		game.setNextEntity(new Brick(160,60,Brick.Brick_20_20));
		game.setNextEntity(new LifeBrick(600,60));
		game.setNextEntity(new Brick(580,100,Brick.Brick_20_20));
		game.setNextEntity(new Brick(560,120,Brick.Brick_20_20));
		game.setNextEntity(new Brick(640,100,Brick.Brick_20_20));
		game.setNextEntity(new Brick(660,120,Brick.Brick_20_20));
		game.setNextEntity(new Brick(640,40,Brick.Brick_20_20));
		game.setNextEntity(new Brick(660,20,Brick.Brick_20_20));
		game.setNextEntity(new Brick(580,40,Brick.Brick_20_20));
		game.setNextEntity(new Brick(560,20,Brick.Brick_20_20));
		game.setNextEntity(new Brick(560,60,Brick.Brick_20_20));
		game.setNextEntity(new Brick(660,60,Brick.Brick_20_20));
		game.setNextEntity(new Brick(660,80,Brick.Brick_20_20));
		game.setNextEntity(new Brick(560,80,Brick.Brick_20_20));
		game.setNextEntity(new Brick(600,120,Brick.Brick_20_20));
		game.setNextEntity(new Brick(620,120,Brick.Brick_20_20));
		game.setNextEntity(new Brick(600,20,Brick.Brick_20_20));
		game.setNextEntity(new Brick(620,20,Brick.Brick_20_20));
		game.setNextEntity(new TirBrick(580,320));
		cTirBrick++;
		game.setNextEntity(new TirBrick(500,320));
		cTirBrick++;
		game.setNextEntity(new TirBrick(480,260));
		cTirBrick++;
		game.setNextEntity(new TirBrick(460,320));
		cTirBrick++;
		game.setNextEntity(new TirBrick(380,320));
		cTirBrick++;
		game.setNextEntity(new TirBrick(420,320));
		cTirBrick++;
		game.setNextEntity(new SekkeBrick10(440,180));
		game.setNextEntity(new Brick(160,80,Brick.Brick_20_20));
		game.setNextEntity(new Beton(680,320,Beton.Beton_20_20));
		cBeton++;
		game.setNextEntity(new Beton(720,280,Beton.Beton_20_20));
		cBeton++;
		game.setNextEntity(new Beton(740,220,Beton.Beton_20_20));
		cBeton++;
	}

	private static void LoadMap3(GGame game)
	{
		game.clearEntities();
		// Static parts
		game.setNextEntity(new GBackground(0 , 0 , 1));
		game.setNextEntity(new GBar(300 , 560));
		game.setNextEntity(new GBall(365 , 540));

		cBeton = 0;
		cTirBrick = 0;

		// Other Elements (from MAP)

		game.setNextEntity(new Beton(220 , 240 , Beton.Beton_60_20));
		cBeton++;
		game.setNextEntity(new Beton(280 , 240 , Beton.Beton_60_20));
		cBeton++;
		game.setNextEntity(new Beton(340 , 240 , Beton.Beton_60_20));
		cBeton++;
		game.setNextEntity(new Beton(400 , 240 , Beton.Beton_60_20));
		cBeton++;
		game.setNextEntity(new Beton(460 , 240 , Beton.Beton_60_20));
		cBeton++;
		game.setNextEntity(new Beton(520 , 240 , Beton.Beton_60_20));
		cBeton++;
		game.setNextEntity(new Beton(160 , 240 , Beton.Beton_60_20));
		cBeton++;
		game.setNextEntity(new Beton(580 , 240 , Beton.Beton_60_20));
		cBeton++;
		game.setNextEntity(new Beton(180 , 220 , Beton.Beton_60_20));
		cBeton++;
		game.setNextEntity(new Beton(240 , 220 , Beton.Beton_60_20));
		cBeton++;
		game.setNextEntity(new Beton(300 , 220 , Beton.Beton_60_20));
		cBeton++;
		game.setNextEntity(new Beton(360 , 220 , Beton.Beton_60_20));
		cBeton++;
		game.setNextEntity(new Beton(420 , 220 , Beton.Beton_60_20));
		cBeton++;
		game.setNextEntity(new Beton(480 , 220 , Beton.Beton_60_20));
		cBeton++;
		game.setNextEntity(new Beton(540 , 220 , Beton.Beton_60_20));
		cBeton++;
		game.setNextEntity(new Beton(280 , 160 , Beton.Beton_20_60));
		cBeton++;
		game.setNextEntity(new Beton(260 , 160 , Beton.Beton_20_60));
		cBeton++;
		game.setNextEntity(new TirBrick(300 , 180));
		cTirBrick++;
		game.setNextEntity(new TirBrick(340 , 180));
		cTirBrick++;
		game.setNextEntity(new TirBrick(380 , 180));
		cTirBrick++;
		game.setNextEntity(new TirBrick(420 , 180));
		cTirBrick++;
		game.setNextEntity(new TirBrick(460 , 180));
		cTirBrick++;
		game.setNextEntity(new Beton(500 , 160 , Beton.Beton_20_60));
		cBeton++;
		game.setNextEntity(new Beton(520 , 160 , Beton.Beton_20_60));
		cBeton++;
		game.setNextEntity(new Beton(300 , 160 , Beton.Beton_60_20));
		cBeton++;
		game.setNextEntity(new Beton(360 , 160 , Beton.Beton_60_20));
		cBeton++;
		game.setNextEntity(new Beton(420 , 160 , Beton.Beton_60_20));
		cBeton++;
		game.setNextEntity(new Beton(480 , 160 , Beton.Beton_20_20));
		cBeton++;
		game.setNextEntity(new LifeBrick(380 , 120));
		game.setNextEntity(new Beton(320 , 140 , Beton.Beton_60_20));
		cBeton++;
		game.setNextEntity(new Beton(320 , 120 , Beton.Beton_60_20));
		cBeton++;
		game.setNextEntity(new Beton(340 , 100 , Beton.Beton_60_20));
		cBeton++;
		game.setNextEntity(new Beton(420 , 140 , Beton.Beton_60_20));
		cBeton++;
		game.setNextEntity(new Beton(420 , 120 , Beton.Beton_60_20));
		cBeton++;
		game.setNextEntity(new Beton(400 , 100 , Beton.Beton_60_20));
		cBeton++;
		game.setNextEntity(new Beton(360 , 80 , Beton.Beton_60_20));
		game.setNextEntity(new Brick(140 , 260 , Brick.Brick_60_20));
		game.setNextEntity(new Brick(200 , 260 , Brick.Brick_60_20));
		game.setNextEntity(new Brick(260 , 260 , Brick.Brick_60_20));
		game.setNextEntity(new Brick(320 , 260 , Brick.Brick_60_20));
		game.setNextEntity(new Brick(380 , 260 , Brick.Brick_60_20));
		game.setNextEntity(new Brick(440 , 260 , Brick.Brick_60_20));
		game.setNextEntity(new Brick(500 , 260 , Brick.Brick_60_20));
		game.setNextEntity(new Brick(560 , 260 , Brick.Brick_60_20));
		game.setNextEntity(new Brick(620 , 260 , Brick.Brick_60_20));
	}


	private static void LoadMap5(GGame game)
	{
		game.clearEntities();
		// Static parts
		game.setNextEntity(new GBackground(0 , 0 , 1));
		game.setNextEntity(new GBar(300 , 560));
		game.setNextEntity(new GBall(365 , 540));

		cBeton = 0;
		cTirBrick = 0;

		// Other Elements (from MAP)

		game.setNextEntity(new LifeBrick(200 , 200));
		game.setNextEntity(new LifeBrick(240 , 200));
		game.setNextEntity(new LifeBrick(280 , 200));
		game.setNextEntity(new LifeBrick(320 , 200));
		game.setNextEntity(new LifeBrick(360 , 200));
		game.setNextEntity(new LifeBrick(400 , 200));
		game.setNextEntity(new LifeBrick(440 , 200));
		game.setNextEntity(new LifeBrick(480 , 200));
		game.setNextEntity(new LifeBrick(520 , 200));
		game.setNextEntity(new LifeBrick(560 , 200));
		game.setNextEntity(new TirBrick(200 , 160));

		game.setNextEntity(new TirBrick(240 , 160));
		cTirBrick++;
		game.setNextEntity(new TirBrick(280 , 160));
		cTirBrick++;
		game.setNextEntity(new TirBrick(320 , 160));
		cTirBrick++;
		game.setNextEntity(new TirBrick(360 , 160));
		cTirBrick++;
		game.setNextEntity(new TirBrick(400 , 160));
		cTirBrick++;
		game.setNextEntity(new TirBrick(440 , 160));
		cTirBrick++;
		game.setNextEntity(new TirBrick(480 , 160));
		cTirBrick++;
		game.setNextEntity(new TirBrick(520 , 160));
		cTirBrick++;
		game.setNextEntity(new TirBrick(560 , 160));
		cTirBrick++;
		game.setNextEntity(new Beton(120 , 240 , Beton.Beton_60_20));
		cBeton++;
		game.setNextEntity(new Beton(180 , 240 , Beton.Beton_60_20));
		cBeton++;
		game.setNextEntity(new Beton(240 , 240 , Beton.Beton_60_20));
		cBeton++;
		game.setNextEntity(new Beton(300 , 240 , Beton.Beton_60_20));
		cBeton++;
		game.setNextEntity(new Beton(360 , 240 , Beton.Beton_60_20));
		cBeton++;
		game.setNextEntity(new Beton(420 , 240 , Beton.Beton_60_20));
		cBeton++;
		game.setNextEntity(new Beton(480 , 240 , Beton.Beton_60_20));
		cBeton++;
		game.setNextEntity(new Beton(540 , 240 , Beton.Beton_60_20));
		cBeton++;
		game.setNextEntity(new Beton(600 , 240 , Beton.Beton_60_20));
		cBeton++;
		game.setNextEntity(new Beton(660 , 240 , Beton.Beton_60_20));
		cBeton++;
		game.setNextEntity(new Beton(660 , 140 , Beton.Beton_60_20));
		cBeton++;
		game.setNextEntity(new Beton(600 , 140 , Beton.Beton_60_20));
		cBeton++;
		game.setNextEntity(new Beton(540 , 140 , Beton.Beton_60_20));
		cBeton++;
		game.setNextEntity(new Beton(480 , 140 , Beton.Beton_60_20));
		cBeton++;
		game.setNextEntity(new Beton(420 , 140 , Beton.Beton_60_20));
		cBeton++;
		game.setNextEntity(new Beton(360 , 140 , Beton.Beton_60_20));
		cBeton++;
		game.setNextEntity(new Beton(300 , 140 , Beton.Beton_60_20));
		cBeton++;
		game.setNextEntity(new Beton(240 , 140 , Beton.Beton_60_20));
		cBeton++;
		game.setNextEntity(new Beton(180 , 140 , Beton.Beton_60_20));
		cBeton++;
		game.setNextEntity(new Beton(120 , 140 , Beton.Beton_60_20));
		cBeton++;
	}


	private static void LoadMap8(GGame game)
	{
		game.clearEntities();
		// Static elements
		game.setNextEntity(new GBackground(0 , 0 , 3));
		game.setNextEntity(new GBar(300 , 550));
		game.setNextEntity(new GBall(365 , 530));

		cBeton = 0;
		cTirBrick = 0;

		// Other Elements (from MAP)


		game.setNextEntity(new Beton(80 , 160 , Beton.Beton_20_60));
		cBeton++;
		game.setNextEntity(new Beton(80 , 220 , Beton.Beton_20_60));
		cBeton++;
		game.setNextEntity(new Beton(80 , 280 , Beton.Beton_20_60));
		cBeton++;
		game.setNextEntity(new Beton(80 , 340 , Beton.Beton_20_60));
		cBeton++;
		game.setNextEntity(new Beton(100 , 160 , Beton.Beton_20_60));
		cBeton++;
		game.setNextEntity(new Beton(100 , 220 , Beton.Beton_20_60));
		cBeton++;
		game.setNextEntity(new Beton(100 , 280 , Beton.Beton_20_60));
		cBeton++;
		game.setNextEntity(new Beton(100 , 340 , Beton.Beton_20_60));
		cBeton++;
		game.setNextEntity(new Beton(160 , 340 , Beton.Beton_20_60));
		cBeton++;
		game.setNextEntity(new Beton(160 , 280 , Beton.Beton_20_60));
		cBeton++;
		game.setNextEntity(new Beton(160 , 220 , Beton.Beton_20_60));
		cBeton++;
		game.setNextEntity(new Beton(180 , 220 , Beton.Beton_20_60));
		cBeton++;
		game.setNextEntity(new Beton(180 , 280 , Beton.Beton_20_60));
		cBeton++;
		game.setNextEntity(new Beton(180 , 340 , Beton.Beton_20_60));
		cBeton++;
		game.setNextEntity(new Beton(140 , 200 , Beton.Beton_20_20));
		cBeton++;
		game.setNextEntity(new Beton(200 , 240 , Beton.Beton_20_20));
		cBeton++;
		game.setNextEntity(new Beton(200 , 220 , Beton.Beton_20_20));
		cBeton++;
		game.setNextEntity(new Beton(220 , 220 , Beton.Beton_20_20));
		cBeton++;
		game.setNextEntity(new Beton(220 , 200 , Beton.Beton_20_20));
		cBeton++;
		game.setNextEntity(new Beton(240 , 200 , Beton.Beton_20_20));
		cBeton++;
		game.setNextEntity(new Beton(100 , 100 , Beton.Beton_20_60));
		cBeton++;
		game.setNextEntity(new Beton(80 , 100 , Beton.Beton_20_60));
		cBeton++;
		game.setNextEntity(new Beton(100 , 40 , Beton.Beton_20_60));
		cBeton++;
		game.setNextEntity(new Beton(80 , 40 , Beton.Beton_20_60));
		cBeton++;
		game.setNextEntity(new Beton(280 , 280 , Beton.Beton_20_60));
		cBeton++;
		game.setNextEntity(new Beton(300 , 340 , Beton.Beton_20_60));
		cBeton++;
		game.setNextEntity(new Beton(300 , 280 , Beton.Beton_20_60));
		cBeton++;
		game.setNextEntity(new Beton(280 , 340 , Beton.Beton_20_40));
		cBeton++;
		game.setNextEntity(new Beton(300 , 240 , Beton.Beton_20_40));
		cBeton++;
		game.setNextEntity(new Beton(280 , 260 , Beton.Beton_20_20));
		cBeton++;
		game.setNextEntity(new Beton(320 , 240 , Beton.Beton_60_20));
		cBeton++;
		game.setNextEntity(new Beton(320 , 260 , Beton.Beton_20_20));
		cBeton++;
		game.setNextEntity(new Beton(420 , 340 , Beton.Beton_20_60));
		cBeton++;
		game.setNextEntity(new Beton(420 , 280 , Beton.Beton_20_60));
		cBeton++;
		game.setNextEntity(new Beton(440 , 280 , Beton.Beton_20_60));
		cBeton++;
		game.setNextEntity(new Beton(440 , 340 , Beton.Beton_20_40));
		cBeton++;
		game.setNextEntity(new Beton(340 , 360 , Beton.Beton_60_20));
		cBeton++;
		game.setNextEntity(new Beton(340 , 380 , Beton.Beton_60_20));
		cBeton++;
		game.setNextEntity(new Beton(320 , 360 , Beton.Beton_20_40));
		cBeton++;
		game.setNextEntity(new Beton(400 , 360 , Beton.Beton_20_40));
		cBeton++;
		game.setNextEntity(new Beton(380 , 240 , Beton.Beton_40_20));
		cBeton++;
		game.setNextEntity(new Beton(420 , 240 , Beton.Beton_20_40));
		cBeton++;
		game.setNextEntity(new Beton(340 , 220 , Beton.Beton_60_20));
		cBeton++;
		game.setNextEntity(new Beton(440 , 220 , Beton.Beton_20_60));
		cBeton++;
		game.setNextEntity(new Beton(440 , 380 , Beton.Beton_20_20));
		cBeton++;
		game.setNextEntity(new Beton(460 , 360 , Beton.Beton_20_20));
		cBeton++;
		game.setNextEntity(new Beton(480 , 360 , Beton.Beton_20_20));
		cBeton++;
		game.setNextEntity(new Beton(480 , 340 , Beton.Beton_20_20));
		cBeton++;
		game.setNextEntity(new Beton(460 , 380 , Beton.Beton_20_20));
		cBeton++;
		game.setNextEntity(new Beton(400 , 260 , Beton.Beton_20_20));
		cBeton++;
		game.setNextEntity(new Beton(520 , 340 , Beton.Beton_20_60));
		cBeton++;
		game.setNextEntity(new Beton(520 , 280 , Beton.Beton_20_60));
		cBeton++;
		game.setNextEntity(new Beton(520 , 240 , Beton.Beton_20_40));
		cBeton++;
		game.setNextEntity(new Beton(540 , 340 , Beton.Beton_20_60));
		cBeton++;
		game.setNextEntity(new Beton(540 , 280 , Beton.Beton_20_60));
		cBeton++;
		game.setNextEntity(new Beton(560 , 260 , Beton.Beton_20_20));
		cBeton++;
		game.setNextEntity(new Beton(560 , 240 , Beton.Beton_20_20));
		cBeton++;
		game.setNextEntity(new Beton(580 , 240 , Beton.Beton_20_20));
		cBeton++;
		game.setNextEntity(new Beton(580 , 260 , Beton.Beton_60_20));
		cBeton++;
		game.setNextEntity(new Beton(640 , 280 , Beton.Beton_20_60));
		cBeton++;
		game.setNextEntity(new Beton(640 , 340 , Beton.Beton_20_60));
		cBeton++;
		game.setNextEntity(new Beton(660 , 280 , Beton.Beton_20_60));
		cBeton++;
		game.setNextEntity(new Beton(660 , 340 , Beton.Beton_20_60));
		cBeton++;
		game.setNextEntity(new Beton(600 , 240 , Beton.Beton_40_20));
		cBeton++;
		game.setNextEntity(new Beton(640 , 260 , Beton.Beton_20_20));
		cBeton++;
		game.setNextEntity(new Beton(700 , 340 , Beton.Beton_20_60));
		cBeton++;
		game.setNextEntity(new Beton(700 , 280 , Beton.Beton_20_60));
		cBeton++;
		game.setNextEntity(new Beton(720 , 340 , Beton.Beton_20_60));
		cBeton++;
		game.setNextEntity(new Beton(720 , 280 , Beton.Beton_20_60));
		cBeton++;
		// game.setNextEntity(new Beton(740 , 380 , Beton.Beton_20_20));
		game.setNextEntity(new Beton(700 , 180 , Beton.Beton_40_20));
		cBeton++;
		game.setNextEntity(new Beton(700 , 200 , Beton.Beton_40_20));
		cBeton++;
		game.setNextEntity(new Beton(700 , 260 , Beton.Beton_40_20));
		cBeton++;
		game.setNextEntity(new Brick(140 , 340 , Brick.Brick_20_60));
		game.setNextEntity(new Brick(120 , 340 , Brick.Brick_20_60));
		game.setNextEntity(new Brick(140 , 280 , Brick.Brick_20_60));
		game.setNextEntity(new Brick(120 , 280 , Brick.Brick_20_60));
		game.setNextEntity(new Brick(140 , 220 , Brick.Brick_20_60));
		game.setNextEntity(new Brick(120 , 220 , Brick.Brick_20_60));
		game.setNextEntity(new Brick(200 , 340 , Brick.Brick_20_60));
		game.setNextEntity(new Brick(200 , 280 , Brick.Brick_20_60));
		game.setNextEntity(new Brick(20 , 260 , Brick.Brick_60_20));
		game.setNextEntity(new Brick(0 , 240 , Brick.Brick_60_20));
		game.setNextEntity(new Brick(20 , 220 , Brick.Brick_60_20));
		game.setNextEntity(new Brick(0 , 200 , Brick.Brick_60_20));
		game.setNextEntity(new Brick(20 , 180 , Brick.Brick_60_20));
		game.setNextEntity(new Brick(0 , 260 , Brick.Brick_20_20));
		game.setNextEntity(new Brick(60 , 240 , Brick.Brick_20_20));
		game.setNextEntity(new Brick(0 , 220 , Brick.Brick_20_20));
		game.setNextEntity(new Brick(60 , 200 , Brick.Brick_20_20));
		game.setNextEntity(new Brick(0 , 180 , Brick.Brick_20_20));
		game.setNextEntity(new Brick(680 , 280 , Brick.Brick_20_20));
		game.setNextEntity(new Brick(680 , 300 , Brick.Brick_20_20));
		game.setNextEntity(new Brick(680 , 320 , Brick.Brick_20_20));
		game.setNextEntity(new Brick(680 , 340 , Brick.Brick_20_20));
		game.setNextEntity(new Brick(680 , 360 , Brick.Brick_20_20));
		game.setNextEntity(new Brick(680 , 380 , Brick.Brick_20_20));
		game.setNextEntity(new Brick(480 , 380 , Brick.Brick_20_20));
		game.setNextEntity(new Brick(500 , 380 , Brick.Brick_20_20));
		game.setNextEntity(new Brick(500 , 360 , Brick.Brick_20_20));
		game.setNextEntity(new Brick(500 , 340 , Brick.Brick_20_20));
		game.setNextEntity(new Brick(460 , 340 , Brick.Brick_20_20));
		game.setNextEntity(new Brick(460 , 320 , Brick.Brick_60_20));
		game.setNextEntity(new Brick(460 , 300 , Brick.Brick_60_20));
		game.setNextEntity(new Brick(460 , 280 , Brick.Brick_60_20));
		game.setNextEntity(new Brick(460 , 260 , Brick.Brick_60_20));
		game.setNextEntity(new Brick(460 , 240 , Brick.Brick_60_20));
		game.setNextEntity(new Brick(460 , 220 , Brick.Brick_60_20));
		game.setNextEntity(new Brick(540 , 240 , Brick.Brick_20_40));
		game.setNextEntity(new Brick(520 , 220 , Brick.Brick_60_20));
		game.setNextEntity(new Brick(580 , 220 , Brick.Brick_60_20));
		game.setNextEntity(new Brick(640 , 220 , Brick.Brick_20_40));
		game.setNextEntity(new Brick(660 , 220 , Brick.Brick_20_60));
		game.setNextEntity(new Brick(680 , 220 , Brick.Brick_20_60));
		game.setNextEntity(new Brick(700 , 220 , Brick.Brick_20_40));
		game.setNextEntity(new Brick(720 , 220 , Brick.Brick_20_40));
		game.setNextEntity(new Brick(0 , 280 , Brick.Brick_60_20));
		game.setNextEntity(new Brick(20 , 300 , Brick.Brick_60_20));
		game.setNextEntity(new Brick(0 , 320 , Brick.Brick_60_20));
		game.setNextEntity(new Brick(20 , 340 , Brick.Brick_60_20));
		game.setNextEntity(new Brick(0 , 360 , Brick.Brick_60_20));
		game.setNextEntity(new Brick(20 , 380 , Brick.Brick_60_20));
		game.setNextEntity(new Brick(0 , 380 , Brick.Brick_20_20));
		game.setNextEntity(new Brick(0 , 340 , Brick.Brick_20_20));
		game.setNextEntity(new Brick(0 , 300 , Brick.Brick_20_20));
		game.setNextEntity(new Brick(60 , 280 , Brick.Brick_20_20));
		game.setNextEntity(new Brick(60 , 320 , Brick.Brick_20_20));
		game.setNextEntity(new Brick(60 , 360 , Brick.Brick_20_20));
		game.setNextEntity(new Brick(220 , 320 , Brick.Brick_20_60));
		game.setNextEntity(new Brick(240 , 300 , Brick.Brick_20_60));
		game.setNextEntity(new Brick(220 , 260 , Brick.Brick_20_60));
		game.setNextEntity(new Brick(240 , 240 , Brick.Brick_20_60));
		game.setNextEntity(new Brick(260 , 320 , Brick.Brick_20_60));
		game.setNextEntity(new Brick(260 , 260 , Brick.Brick_20_60));
		game.setNextEntity(new Brick(240 , 360 , Brick.Brick_20_20));
		game.setNextEntity(new Brick(220 , 380 , Brick.Brick_60_20));
		game.setNextEntity(new Brick(280 , 380 , Brick.Brick_20_20));
		game.setNextEntity(new Brick(200 , 260 , Brick.Brick_20_20));
		game.setNextEntity(new Brick(220 , 240 , Brick.Brick_20_20));
		game.setNextEntity(new Brick(260 , 240 , Brick.Brick_40_20));
		game.setNextEntity(new Brick(240 , 220 , Brick.Brick_40_20));
		game.setNextEntity(new Brick(280 , 220 , Brick.Brick_60_20));
		game.setNextEntity(new Brick(160 , 200 , Brick.Brick_60_20));
		game.setNextEntity(new Brick(400 , 220 , Brick.Brick_40_20));
		game.setNextEntity(new Brick(560 , 380 , Brick.Brick_60_20));
		game.setNextEntity(new Brick(580 , 360 , Brick.Brick_60_20));
		game.setNextEntity(new Brick(560 , 340 , Brick.Brick_60_20));
		game.setNextEntity(new Brick(580 , 320 , Brick.Brick_60_20));
		game.setNextEntity(new Brick(560 , 300 , Brick.Brick_60_20));
		game.setNextEntity(new Brick(580 , 280 , Brick.Brick_60_20));
		game.setNextEntity(new Brick(560 , 280 , Brick.Brick_20_20));
		game.setNextEntity(new Brick(560 , 320 , Brick.Brick_20_20));
		game.setNextEntity(new Brick(620 , 300 , Brick.Brick_20_20));
		game.setNextEntity(new Brick(620 , 340 , Brick.Brick_20_20));
		game.setNextEntity(new Brick(560 , 360 , Brick.Brick_20_20));
		game.setNextEntity(new Brick(620 , 380 , Brick.Brick_20_20));
		game.setNextEntity(new Brick(760 , 380 , Brick.Brick_40_20));
		game.setNextEntity(new Brick(740 , 360 , Brick.Brick_60_20));
		game.setNextEntity(new Brick(740 , 340 , Brick.Brick_60_20));
		game.setNextEntity(new Brick(740 , 320 , Brick.Brick_60_20));
		game.setNextEntity(new Brick(740 , 300 , Brick.Brick_60_20));
		game.setNextEntity(new Brick(740 , 280 , Brick.Brick_60_20));
		game.setNextEntity(new Brick(740 , 260 , Brick.Brick_60_20));
		game.setNextEntity(new Brick(740 , 240 , Brick.Brick_60_20));
		game.setNextEntity(new Brick(740 , 220 , Brick.Brick_60_20));
		game.setNextEntity(new Brick(740 , 200 , Brick.Brick_60_20));
		game.setNextEntity(new Brick(740 , 180 , Brick.Brick_60_20));
		game.setNextEntity(new Brick(260 , 200 , Brick.Brick_60_20));
		game.setNextEntity(new Brick(320 , 200 , Brick.Brick_60_20));
		game.setNextEntity(new Brick(380 , 200 , Brick.Brick_60_20));
		game.setNextEntity(new Brick(440 , 200 , Brick.Brick_60_20));
		game.setNextEntity(new Brick(500 , 200 , Brick.Brick_60_20));
		game.setNextEntity(new Brick(560 , 200 , Brick.Brick_60_20));
		game.setNextEntity(new Brick(620 , 200 , Brick.Brick_60_20));
		game.setNextEntity(new Brick(680 , 200 , Brick.Brick_20_20));
		game.setNextEntity(new Brick(140 , 180 , Brick.Brick_60_20));
		game.setNextEntity(new Brick(200 , 180 , Brick.Brick_60_20));
		game.setNextEntity(new Brick(260 , 180 , Brick.Brick_60_20));
		game.setNextEntity(new Brick(320 , 180 , Brick.Brick_60_20));
		game.setNextEntity(new Brick(380 , 180 , Brick.Brick_60_20));
		game.setNextEntity(new Brick(440 , 180 , Brick.Brick_60_20));
		game.setNextEntity(new Brick(500 , 180 , Brick.Brick_60_20));
		game.setNextEntity(new Brick(560 , 180 , Brick.Brick_60_20));
		game.setNextEntity(new Brick(640 , 180 , Brick.Brick_60_20));
		game.setNextEntity(new Brick(620 , 180 , Brick.Brick_20_20));
		game.setNextEntity(new SekkeBrick10(320 , 280));
		game.setNextEntity(new OverSizeOption(360 , 280));
		game.setNextEntity(new SekkeBrick10(380 , 320));
		game.setNextEntity(new SekkeBrick10(340 , 320));
		game.setNextEntity(new Brick(340 , 260 , Brick.Brick_60_20));
		game.setNextEntity(new Brick(400 , 280 , Brick.Brick_20_40));
		game.setNextEntity(new Brick(320 , 320 , Brick.Brick_20_40));
		game.setNextEntity(new Brick(0 , 400 , Brick.Brick_60_20));
		game.setNextEntity(new Brick(60 , 400 , Brick.Brick_60_20));
		game.setNextEntity(new Brick(120 , 400 , Brick.Brick_60_20));
		game.setNextEntity(new Brick(180 , 400 , Brick.Brick_60_20));
		game.setNextEntity(new Brick(240 , 400 , Brick.Brick_60_20));
		game.setNextEntity(new Brick(300 , 400 , Brick.Brick_60_20));
		game.setNextEntity(new Brick(360 , 400 , Brick.Brick_60_20));
		game.setNextEntity(new Brick(420 , 400 , Brick.Brick_60_20));
		game.setNextEntity(new Brick(480 , 400 , Brick.Brick_60_20));
		game.setNextEntity(new Brick(540 , 400 , Brick.Brick_60_20));
		game.setNextEntity(new Brick(600 , 400 , Brick.Brick_60_20));
		game.setNextEntity(new Brick(660 , 400 , Brick.Brick_60_20));
		game.setNextEntity(new Brick(720 , 400 , Brick.Brick_60_20));
		game.setNextEntity(new Brick(780 , 400 , Brick.Brick_20_20));
		game.setNextEntity(new Brick(120 , 180 , Brick.Brick_20_40));
		game.setNextEntity(new LifeBrick(80 , 0));
		game.setNextEntity(new LifeBrick(700 , 140));
		game.setNextEntity(new LifeBrick(360 , 0));
		game.setNextEntity(new SekkeBrick10(40 , 140));
		game.setNextEntity(new SekkeBrick10(0 , 140));
		game.setNextEntity(new SekkeBrick10(40 , 100));
		game.setNextEntity(new SekkeBrick10(0 , 100));
		game.setNextEntity(new SekkeBrick10(40 , 60));
		game.setNextEntity(new SekkeBrick10(0 , 60));
		game.setNextEntity(new SekkeBrick10(40 , 20));
		game.setNextEntity(new SekkeBrick10(0 , 20));
		game.setNextEntity(new TirBrick(360 , 40));
		cTirBrick++;
		game.setNextEntity(new SekkeBrick30(340 , 0));
		game.setNextEntity(new SekkeBrick30(340 , 20));
		game.setNextEntity(new SekkeBrick30(340 , 40));
		game.setNextEntity(new SekkeBrick30(340 , 60));
		game.setNextEntity(new SekkeBrick30(340 , 80));
		game.setNextEntity(new SekkeBrick30(360 , 80));
		game.setNextEntity(new SekkeBrick30(380 , 80));
		game.setNextEntity(new SekkeBrick30(400 , 80));
		game.setNextEntity(new SekkeBrick30(400 , 60));
		game.setNextEntity(new SekkeBrick30(400 , 40));
		game.setNextEntity(new SekkeBrick30(400 , 20));
		game.setNextEntity(new SekkeBrick30(400 , 0));
		game.setNextEntity(new SekkeBrick30(0 , 0));
		game.setNextEntity(new SekkeBrick30(20 , 0));
		game.setNextEntity(new SekkeBrick30(40 , 0));
		game.setNextEntity(new SekkeBrick30(60 , 0));
		game.setNextEntity(new TirBrick(160 , 140));
		cTirBrick++;
		game.setNextEntity(new TirBrick(660 , 140));
		cTirBrick++;
		game.setNextEntity(new SekkeBrick10(120 , 140));
		game.setNextEntity(new SekkeBrick10(200 , 140));
		game.setNextEntity(new SekkeBrick10(240 , 140));
		game.setNextEntity(new SekkeBrick10(280 , 140));
		game.setNextEntity(new SekkeBrick10(320 , 140));
		game.setNextEntity(new SekkeBrick10(360 , 140));
		game.setNextEntity(new SekkeBrick10(400 , 140));
		game.setNextEntity(new SekkeBrick10(440 , 140));
		game.setNextEntity(new SekkeBrick10(480 , 140));
		game.setNextEntity(new SekkeBrick10(520 , 140));
		game.setNextEntity(new SekkeBrick10(560 , 140));
		game.setNextEntity(new SekkeBrick10(740 , 140));
		game.setNextEntity(new SekkeBrick30(780 , 140));
		game.setNextEntity(new SekkeBrick30(780 , 160));
		game.setNextEntity(new LifeBrick(620 , 140));
		game.setNextEntity(new SekkeBrick30(600 , 140));
		game.setNextEntity(new SekkeBrick30(600 , 160));

	}

	private static void LoadMap9(GGame game)
	{
		game.clearEntities();
		// Static elements
		game.setNextEntity(new GBackground(0 , 0 , 3));
		game.setNextEntity(new GBar(300 , 550));
		game.setNextEntity(new GBall(365 , 530));

		cBeton = 0;
		cTirBrick = 0;

		// Other Elements (from MAP)

		game.setNextEntity(new Beton(0,40,Beton.Beton_20_60));
		cBeton++;
		game.setNextEntity(new Beton(60,40,Beton.Beton_20_60));
		cBeton++;
		game.setNextEntity(new Beton(120,40,Beton.Beton_20_60));
		cBeton++;
		game.setNextEntity(new Beton(180,40,Beton.Beton_20_60));
		cBeton++;
		game.setNextEntity(new Beton(240,40,Beton.Beton_20_60));
		cBeton++;
		game.setNextEntity(new Beton(300,40,Beton.Beton_20_60));
		cBeton++;
		game.setNextEntity(new Beton(360,40,Beton.Beton_20_60));
		cBeton++;
		game.setNextEntity(new Beton(420,40,Beton.Beton_20_60));
		cBeton++;
		game.setNextEntity(new Beton(480,40,Beton.Beton_20_60));
		cBeton++;
		game.setNextEntity(new Beton(540,40,Beton.Beton_20_60));
		cBeton++;
		game.setNextEntity(new Beton(600,40,Beton.Beton_20_60));
		cBeton++;
		game.setNextEntity(new Beton(660,40,Beton.Beton_20_60));
		cBeton++;
		game.setNextEntity(new Beton(720,40,Beton.Beton_20_60));
		cBeton++;
		game.setNextEntity(new Beton(780,40,Beton.Beton_20_60));
		cBeton++;
		game.setNextEntity(new Beton(20,20,Beton.Beton_40_20));
		cBeton++;
		game.setNextEntity(new Beton(80,100,Beton.Beton_40_20));
		cBeton++;
		game.setNextEntity(new Beton(140,20,Beton.Beton_40_20));
		cBeton++;
		game.setNextEntity(new Beton(200,100,Beton.Beton_40_20));
		cBeton++;
		game.setNextEntity(new Beton(260,20,Beton.Beton_40_20));
		cBeton++;
		game.setNextEntity(new Beton(320,100,Beton.Beton_40_20));
		cBeton++;
		game.setNextEntity(new Beton(380,20,Beton.Beton_40_20));
		cBeton++;
		game.setNextEntity(new Beton(440,100,Beton.Beton_40_20));
		cBeton++;
		game.setNextEntity(new Beton(500,20,Beton.Beton_40_20));
		cBeton++;
		game.setNextEntity(new Beton(560,100,Beton.Beton_40_20));
		cBeton++;
		game.setNextEntity(new Beton(620,20,Beton.Beton_40_20));
		cBeton++;
		game.setNextEntity(new Beton(680,100,Beton.Beton_40_20));
		cBeton++;
		game.setNextEntity(new Beton(740,20,Beton.Beton_40_20));
		cBeton++;
		game.setNextEntity(new LifeBrick(320,40));
		game.setNextEntity(new LifeBrick(440,40));

		game.setNextEntity(new TirBrick(380,40));
		cTirBrick++;
		game.setNextEntity(new TirBrick(500,40));
		cTirBrick++;
		game.setNextEntity(new TirBrick(260,40));
		cTirBrick++;
		game.setNextEntity(new GHeart(60,0));
		game.setNextEntity(new GHeart(700,0));
		game.setNextEntity(new SekkeBrick10(200,60));
		game.setNextEntity(new SekkeBrick10(80,60));
		game.setNextEntity(new SekkeBrick10(560,60));
		game.setNextEntity(new SekkeBrick10(680,60));
		game.setNextEntity(new GBad(60,120));
		game.setNextEntity(new GBad(180,120));
		game.setNextEntity(new GBad(300,120));
		game.setNextEntity(new GBad(420,120));
		game.setNextEntity(new GBad(540,120));
		game.setNextEntity(new GBad(660,120));
		game.setNextEntity(new SekkeBrick30(20,40));
		game.setNextEntity(new SekkeBrick30(40,60));
		game.setNextEntity(new SekkeBrick30(140,40));
		game.setNextEntity(new SekkeBrick30(160,60));
		game.setNextEntity(new SekkeBrick30(620,40));
		game.setNextEntity(new SekkeBrick30(640,60));
		game.setNextEntity(new SekkeBrick30(740,40));
		game.setNextEntity(new SekkeBrick30(760,60));
		game.setNextEntity(new TirBrick(20,80));
		cTirBrick++;
		game.setNextEntity(new TirBrick(140,80));
		cTirBrick++;
		game.setNextEntity(new TirBrick(740,80));
		cTirBrick++;
		game.setNextEntity(new TirBrick(620,80));
		cTirBrick++;
		game.setNextEntity(new Brick(0,160,Brick.Brick_60_20));
		game.setNextEntity(new Brick(60,200,Brick.Brick_60_20));
		game.setNextEntity(new Brick(120,240,Brick.Brick_60_20));
		game.setNextEntity(new Brick(180,280,Brick.Brick_60_20));
		game.setNextEntity(new Brick(240,320,Brick.Brick_60_20));
		game.setNextEntity(new Brick(300,360,Brick.Brick_60_20));
		game.setNextEntity(new Brick(740,160,Brick.Brick_60_20));
		game.setNextEntity(new Brick(680,200,Brick.Brick_60_20));
		game.setNextEntity(new Brick(620,240,Brick.Brick_60_20));
		game.setNextEntity(new Brick(560,280,Brick.Brick_60_20));
		game.setNextEntity(new Brick(500,320,Brick.Brick_60_20));
		game.setNextEntity(new Brick(440,360,Brick.Brick_60_20));
		game.setNextEntity(new Beton(280,340,Beton.Beton_40_20));
		cBeton++;
		game.setNextEntity(new Beton(100,220,Beton.Beton_40_20));
		cBeton++;
		game.setNextEntity(new Beton(40,180,Beton.Beton_40_20));
		cBeton++;
		game.setNextEntity(new Beton(160,260,Beton.Beton_40_20));
		cBeton++;
		game.setNextEntity(new Beton(220,300,Beton.Beton_40_20));
		cBeton++;
		game.setNextEntity(new Brick(380,400,Brick.Brick_40_20));
		game.setNextEntity(new Beton(360,380,Beton.Beton_20_20));
		cBeton++;
		game.setNextEntity(new Beton(420,380,Beton.Beton_20_20));
		cBeton++;
		game.setNextEntity(new Beton(480,340,Beton.Beton_40_20));
		cBeton++;
		game.setNextEntity(new Beton(540,300,Beton.Beton_40_20));
		cBeton++;
		game.setNextEntity(new Beton(600,260,Beton.Beton_40_20));
		cBeton++;
		game.setNextEntity(new Beton(660,220,Beton.Beton_40_20));
		cBeton++;
		game.setNextEntity(new Beton(720,180,Beton.Beton_40_20));
		cBeton++;
		game.setNextEntity(new BallAddOption(380,200));
		game.setNextEntity(new MovingSekkeBrick30(240,200));
		game.setNextEntity(new MovingSekkeBrick30(540,200));
		game.setNextEntity(new SekkeBrick10(360,340));
		game.setNextEntity(new SekkeBrick10(400,340));
		game.setNextEntity(new SekkeBrick10(440,280));
		game.setNextEntity(new SekkeBrick10(480,240));
		game.setNextEntity(new SekkeBrick10(320,280));
		game.setNextEntity(new SekkeBrick10(280,240));
		game.setNextEntity(new GBad(120,280));
		game.setNextEntity(new GBad(620,280));
		game.setNextEntity(new TirBrick(60,220));
		cTirBrick++;
		game.setNextEntity(new TirBrick(700,220));
		cTirBrick++;
		game.setNextEntity(new TirBrick(0,180));
		cTirBrick++;
		game.setNextEntity(new TirBrick(760,180));
		cTirBrick++;
	}

	private static void LoadMap7(GGame game)
	{
		game.clearEntities();
		// Static elements
		game.setNextEntity(new GBackground(0 , 0 , 3));
		game.setNextEntity(new GBar(300 , 550));
		game.setNextEntity(new GBall(365 , 530));

		cBeton = 0;
		cTirBrick = 0;

		// Other Elements (from MAP)

		game.setNextEntity(new Beton(340,0,Beton.Beton_20_60));
		cBeton++;
		game.setNextEntity(new Beton(400,0,Beton.Beton_20_60));
		cBeton++;
		game.setNextEntity(new Beton(460,0,Beton.Beton_20_60));
		cBeton++;
		game.setNextEntity(new Beton(520,0,Beton.Beton_20_60));
		cBeton++;
		game.setNextEntity(new Beton(580,0,Beton.Beton_20_60));
		cBeton++;
		game.setNextEntity(new Beton(640,0,Beton.Beton_20_60));
		cBeton++;
		game.setNextEntity(new Beton(700,0,Beton.Beton_20_60));
		cBeton++;
		game.setNextEntity(new Beton(760,0,Beton.Beton_20_60));
		cBeton++;
		game.setNextEntity(new Beton(280,0,Beton.Beton_20_60));
		cBeton++;
		game.setNextEntity(new Beton(220,0,Beton.Beton_20_60));
		cBeton++;
		game.setNextEntity(new Beton(160,0,Beton.Beton_20_60));
		cBeton++;
		game.setNextEntity(new Beton(100,0,Beton.Beton_20_60));
		cBeton++;
		game.setNextEntity(new Beton(40,0,Beton.Beton_20_60));
		cBeton++;
		game.setNextEntity(new Beton(40,60,Beton.Beton_20_60));
		cBeton++;
		game.setNextEntity(new Beton(100,60,Beton.Beton_20_60));
		cBeton++;
		game.setNextEntity(new Beton(40,120,Beton.Beton_20_60));
		cBeton++;
		game.setNextEntity(new Beton(440,160,Beton.Beton_60_20));
		cBeton++;
		game.setNextEntity(new Beton(120,100,Beton.Beton_60_20));
		cBeton++;
		game.setNextEntity(new Beton(160,60,Beton.Beton_20_40));
		cBeton++;
		game.setNextEntity(new Beton(220,60,Beton.Beton_20_40));
		cBeton++;
		game.setNextEntity(new Beton(220,100,Beton.Beton_60_20));
		cBeton++;
		game.setNextEntity(new Beton(280,60,Beton.Beton_20_60));
		cBeton++;
		game.setNextEntity(new Beton(340,60,Beton.Beton_20_60));
		cBeton++;
		game.setNextEntity(new Beton(360,100,Beton.Beton_60_20));
		cBeton++;
		game.setNextEntity(new Beton(520,60,Beton.Beton_20_60));
		cBeton++;
		game.setNextEntity(new Beton(460,100,Beton.Beton_60_20));
		cBeton++;
		game.setNextEntity(new Beton(600,100,Beton.Beton_60_20));
		cBeton++;
		game.setNextEntity(new Beton(700,60,Beton.Beton_20_40));
		cBeton++;
		game.setNextEntity(new Beton(400,60,Beton.Beton_20_40));
		cBeton++;
		game.setNextEntity(new Beton(460,60,Beton.Beton_20_40));
		cBeton++;
		game.setNextEntity(new Beton(580,60,Beton.Beton_20_60));
		cBeton++;
		game.setNextEntity(new Beton(640,60,Beton.Beton_20_40));
		cBeton++;
		game.setNextEntity(new Beton(760,60,Beton.Beton_20_60));
		cBeton++;
		game.setNextEntity(new Beton(700,100,Beton.Beton_60_20));
		cBeton++;
		game.setNextEntity(new Beton(120,160,Beton.Beton_60_20));
		cBeton++;
		game.setNextEntity(new Beton(560,160,Beton.Beton_60_20));
		cBeton++;
		game.setNextEntity(new Beton(240,160,Beton.Beton_60_20));
		cBeton++;
		game.setNextEntity(new Beton(680,160,Beton.Beton_60_20));
		cBeton++;
		game.setNextEntity(new Beton(360,160,Beton.Beton_60_20));
		cBeton++;
		game.setNextEntity(new Brick(60,160,Brick.Brick_60_20));
		game.setNextEntity(new Brick(180,160,Brick.Brick_60_20));
		game.setNextEntity(new Brick(300,160,Brick.Brick_60_20));
		game.setNextEntity(new Brick(500,160,Brick.Brick_60_20));
		game.setNextEntity(new Brick(620,160,Brick.Brick_60_20));
		game.setNextEntity(new Brick(740,160,Brick.Brick_60_20));
		game.setNextEntity(new Brick(420,160,Brick.Brick_20_20));
		game.setNextEntity(new SekkeBrick10(120,0));
		game.setNextEntity(new SekkeBrick10(120,60));
		game.setNextEntity(new SekkeBrick10(240,0));
		game.setNextEntity(new SekkeBrick10(240,60));
		game.setNextEntity(new SekkeBrick10(360,0));
		game.setNextEntity(new SekkeBrick10(360,60));
		game.setNextEntity(new SekkeBrick10(720,0));
		game.setNextEntity(new SekkeBrick10(720,60));
		game.setNextEntity(new SekkeBrick10(600,0));
		game.setNextEntity(new SekkeBrick10(600,60));
		game.setNextEntity(new SekkeBrick10(480,0));
		game.setNextEntity(new SekkeBrick10(480,60));
		game.setNextEntity(new SekkeBrick30(120,40));
		game.setNextEntity(new SekkeBrick30(140,40));
		game.setNextEntity(new SekkeBrick30(240,40));
		game.setNextEntity(new SekkeBrick30(260,40));
		game.setNextEntity(new SekkeBrick30(360,40));
		game.setNextEntity(new SekkeBrick30(380,40));
		game.setNextEntity(new SekkeBrick30(480,40));
		game.setNextEntity(new SekkeBrick30(500,40));
		game.setNextEntity(new SekkeBrick30(600,40));
		game.setNextEntity(new SekkeBrick30(620,40));
		game.setNextEntity(new SekkeBrick30(740,40));
		game.setNextEntity(new SekkeBrick30(720,40));
		game.setNextEntity(new GBad(0,200));
		game.setNextEntity(new GBad(80,200));
		game.setNextEntity(new GBad(160,200));
		game.setNextEntity(new GBad(240,200));
		game.setNextEntity(new GBad(320,200));
		game.setNextEntity(new GBad(400,200));
		game.setNextEntity(new GBad(480,200));
		game.setNextEntity(new GBad(560,200));
		game.setNextEntity(new GBad(640,200));
		game.setNextEntity(new GBad(720,200));
		game.setNextEntity(new TirBrick(0,0));
		cTirBrick++;
		game.setNextEntity(new TirBrick(0,40));
		cTirBrick++;
		game.setNextEntity(new TirBrick(0,140));
		cTirBrick++;
		game.setNextEntity(new LifeBrick(0,80));
		game.setNextEntity(new GHeart(60,0));
		game.setNextEntity(new GHeart(60,40));
		game.setNextEntity(new GHeart(300,0));
		game.setNextEntity(new GHeart(300,40));
		game.setNextEntity(new GHeart(540,0));
		game.setNextEntity(new GHeart(540,40));
		game.setNextEntity(new SekkeBrick30(780,0));
		game.setNextEntity(new SekkeBrick30(780,20));
		game.setNextEntity(new SekkeBrick30(780,40));
		game.setNextEntity(new SekkeBrick30(780,60));
		game.setNextEntity(new SekkeBrick30(780,80));
		game.setNextEntity(new SekkeBrick30(780,100));
		game.setNextEntity(new SekkeBrick30(60,100));
		game.setNextEntity(new SekkeBrick30(80,100));
		game.setNextEntity(new SekkeBrick30(180,100));
		game.setNextEntity(new SekkeBrick30(200,100));
		game.setNextEntity(new SekkeBrick30(300,100));
		game.setNextEntity(new SekkeBrick30(320,100));
		game.setNextEntity(new SekkeBrick30(420,100));
		game.setNextEntity(new SekkeBrick30(440,100));
		game.setNextEntity(new SekkeBrick30(540,100));
		game.setNextEntity(new SekkeBrick30(560,100));
		game.setNextEntity(new SekkeBrick30(660,100));
		game.setNextEntity(new SekkeBrick30(680,100));
		game.setNextEntity(new SekkeBrick10(180,0));
		game.setNextEntity(new SekkeBrick10(180,60));
		game.setNextEntity(new SekkeBrick10(420,0));
		game.setNextEntity(new SekkeBrick10(420,60));
		game.setNextEntity(new SekkeBrick10(660,0));
		game.setNextEntity(new SekkeBrick10(660,60));
		game.setNextEntity(new Brick(660,40,Brick.Brick_40_20));
		game.setNextEntity(new Brick(420,40,Brick.Brick_40_20));
		game.setNextEntity(new Brick(180,40,Brick.Brick_40_20));
		game.setNextEntity(new Brick(60,80,Brick.Brick_40_20));
		game.setNextEntity(new Brick(300,80,Brick.Brick_40_20));
		game.setNextEntity(new Brick(540,80,Brick.Brick_40_20));
		game.setNextEntity(new TirBrick(60,120));
		cTirBrick++;
		game.setNextEntity(new TirBrick(760,120));
		cTirBrick++;
		game.setNextEntity(new Brick(60,200,Brick.Brick_20_60));
		game.setNextEntity(new Brick(140,200,Brick.Brick_20_60));
		game.setNextEntity(new Brick(220,200,Brick.Brick_20_60));
		game.setNextEntity(new Brick(300,200,Brick.Brick_20_60));
		game.setNextEntity(new Brick(380,200,Brick.Brick_20_60));
		game.setNextEntity(new Brick(460,200,Brick.Brick_20_60));
		game.setNextEntity(new Brick(540,200,Brick.Brick_20_60));
		game.setNextEntity(new Brick(620,200,Brick.Brick_20_60));
		game.setNextEntity(new Brick(700,200,Brick.Brick_20_60));
		game.setNextEntity(new Brick(40,260,Brick.Brick_60_20));
		game.setNextEntity(new Brick(120,260,Brick.Brick_60_20));
		game.setNextEntity(new Brick(200,260,Brick.Brick_60_20));
		game.setNextEntity(new Brick(280,260,Brick.Brick_60_20));
		game.setNextEntity(new Brick(360,260,Brick.Brick_60_20));
		game.setNextEntity(new Brick(440,260,Brick.Brick_60_20));
		game.setNextEntity(new Brick(520,260,Brick.Brick_60_20));
		game.setNextEntity(new Brick(600,260,Brick.Brick_60_20));
		game.setNextEntity(new Brick(680,260,Brick.Brick_60_20));
		game.setNextEntity(new LifeBrick(60,280));
		game.setNextEntity(new LifeBrick(120,280));
		game.setNextEntity(new LifeBrick(620,280));
		game.setNextEntity(new LifeBrick(680,280));
		game.setNextEntity(new MovingSekkeBrick30(220,340));
		game.setNextEntity(new MovingSekkeBrick30(360,340));
		game.setNextEntity(new MovingSekkeBrick30(500,340));
		game.setNextEntity(new BallAddOption(180,120));
		game.setNextEntity(new OverSizeOption(420,120));
		game.setNextEntity(new BallAddOption(660,120));
		game.setNextEntity(new Brick(0,380,Brick.Brick_60_20));
		game.setNextEntity(new Brick(140,380,Brick.Brick_60_20));
		game.setNextEntity(new Brick(280,380,Brick.Brick_60_20));
		game.setNextEntity(new Brick(420,380,Brick.Brick_60_20));
		game.setNextEntity(new Brick(560,380,Brick.Brick_60_20));
		game.setNextEntity(new Brick(700,380,Brick.Brick_60_20));
	}

	private static void LoadMap10(GGame game)
	{
		game.clearEntities();
		// Static elements
		game.setNextEntity(new GBackground(0 , 0 , 3));
		game.setNextEntity(new GBar(300 , 550));
		game.setNextEntity(new GBall(365 , 530));

		cBeton = 0;
		cTirBrick = 0;

		// Other Elements (from MAP)

		game.setNextEntity(new TirBrick(0,0));
		cTirBrick++;
		game.setNextEntity(new TirBrick(680,80));
		cTirBrick++;
		game.setNextEntity(new TirBrick(80,80));
		cTirBrick++;
		game.setNextEntity(new TirBrick(320,320));
		cTirBrick++;
		game.setNextEntity(new TirBrick(160,160));
		cTirBrick++;
		game.setNextEntity(new TirBrick(440,320));
		cTirBrick++;
		game.setNextEntity(new TirBrick(240,240));
		cTirBrick++;
		game.setNextEntity(new TirBrick(600,160));
		cTirBrick++;
		game.setNextEntity(new TirBrick(760,0));
		cTirBrick++;
		game.setNextEntity(new TirBrick(520,240));
		cTirBrick++;
		game.setNextEntity(new SekkeBrick10(380,0));
		game.setNextEntity(new SekkeBrick10(440,0));
		game.setNextEntity(new SekkeBrick10(500,0));
		game.setNextEntity(new SekkeBrick10(560,0));
		game.setNextEntity(new SekkeBrick10(620,0));
		game.setNextEntity(new SekkeBrick10(680,0));
		game.setNextEntity(new SekkeBrick10(320,0));
		game.setNextEntity(new SekkeBrick10(260,0));
		game.setNextEntity(new SekkeBrick10(200,0));
		game.setNextEntity(new SekkeBrick10(140,0));
		game.setNextEntity(new SekkeBrick10(80,0));
		game.setNextEntity(new SekkeBrick30(40,0));
		game.setNextEntity(new SekkeBrick30(60,0));
		game.setNextEntity(new SekkeBrick30(40,20));
		game.setNextEntity(new SekkeBrick30(60,20));
		game.setNextEntity(new SekkeBrick30(720,0));
		game.setNextEntity(new SekkeBrick30(740,0));
		game.setNextEntity(new SekkeBrick30(740,20));
		game.setNextEntity(new SekkeBrick30(720,20));
		game.setNextEntity(new SekkeBrick30(660,0));
		game.setNextEntity(new SekkeBrick30(660,20));
		game.setNextEntity(new SekkeBrick30(600,0));
		game.setNextEntity(new SekkeBrick30(600,20));
		game.setNextEntity(new SekkeBrick30(540,0));
		game.setNextEntity(new SekkeBrick30(540,20));
		game.setNextEntity(new SekkeBrick30(480,0));
		game.setNextEntity(new SekkeBrick30(480,20));
		game.setNextEntity(new SekkeBrick30(420,0));
		game.setNextEntity(new SekkeBrick30(420,20));
		game.setNextEntity(new SekkeBrick30(360,20));
		game.setNextEntity(new SekkeBrick30(360,0));
		game.setNextEntity(new SekkeBrick30(300,20));
		game.setNextEntity(new SekkeBrick30(300,0));
		game.setNextEntity(new SekkeBrick30(240,20));
		game.setNextEntity(new SekkeBrick30(240,0));
		game.setNextEntity(new SekkeBrick30(180,20));
		game.setNextEntity(new SekkeBrick30(180,0));
		game.setNextEntity(new SekkeBrick30(120,0));
		game.setNextEntity(new SekkeBrick30(120,20));
		game.setNextEntity(new SekkeBrick10(40,40));
		game.setNextEntity(new SekkeBrick10(120,120));
		game.setNextEntity(new SekkeBrick10(200,200));
		game.setNextEntity(new SekkeBrick10(280,280));
		game.setNextEntity(new SekkeBrick10(380,360));
		game.setNextEntity(new SekkeBrick10(480,280));
		game.setNextEntity(new SekkeBrick10(560,200));
		game.setNextEntity(new SekkeBrick10(640,120));
		game.setNextEntity(new SekkeBrick10(720,40));
		game.setNextEntity(new SekkeBrick10(380,40));
		game.setNextEntity(new SekkeBrick10(380,80));
		game.setNextEntity(new SekkeBrick10(380,120));
		game.setNextEntity(new SekkeBrick10(380,160));
		game.setNextEntity(new SekkeBrick10(380,200));
		game.setNextEntity(new SekkeBrick10(380,240));
		game.setNextEntity(new SekkeBrick10(380,280));
		game.setNextEntity(new SekkeBrick10(380,320));
		game.setNextEntity(new SekkeBrick10(180,40));
		game.setNextEntity(new SekkeBrick10(220,80));
		game.setNextEntity(new SekkeBrick10(260,120));
		game.setNextEntity(new SekkeBrick10(300,160));
		game.setNextEntity(new SekkeBrick10(340,200));
		game.setNextEntity(new SekkeBrick10(420,200));
		game.setNextEntity(new SekkeBrick10(460,160));
		game.setNextEntity(new SekkeBrick10(500,120));
		game.setNextEntity(new SekkeBrick10(540,80));
		game.setNextEntity(new SekkeBrick10(580,40));
		game.setNextEntity(new SekkeBrick10(460,40));
		game.setNextEntity(new SekkeBrick10(420,80));
		game.setNextEntity(new SekkeBrick10(340,80));
		game.setNextEntity(new SekkeBrick10(300,40));
		game.setNextEntity(new SekkeBrick10(420,360));
		game.setNextEntity(new SekkeBrick10(340,360));
		game.setNextEntity(new SekkeBrick10(380,400));
		game.setNextEntity(new SekkeBrick10(680,160));
		game.setNextEntity(new SekkeBrick10(720,200));
		game.setNextEntity(new SekkeBrick10(760,240));
		game.setNextEntity(new SekkeBrick10(600,240));
		game.setNextEntity(new SekkeBrick10(640,280));
		game.setNextEntity(new SekkeBrick10(680,320));
		game.setNextEntity(new SekkeBrick10(720,360));
		game.setNextEntity(new SekkeBrick10(760,400));
		game.setNextEntity(new SekkeBrick10(760,80));
		game.setNextEntity(new SekkeBrick10(0,80));
		game.setNextEntity(new SekkeBrick10(80,160));
		game.setNextEntity(new SekkeBrick10(40,200));
		game.setNextEntity(new SekkeBrick10(0,240));
		game.setNextEntity(new SekkeBrick10(160,240));
		game.setNextEntity(new SekkeBrick10(120,280));
		game.setNextEntity(new SekkeBrick10(80,320));
		game.setNextEntity(new SekkeBrick10(40,360));
		game.setNextEntity(new SekkeBrick10(0,400));
		game.setNextEntity(new SekkeBrick10(520,320));
		game.setNextEntity(new SekkeBrick10(520,320));
		game.setNextEntity(new SekkeBrick10(240,320));
		game.setNextEntity(new OverSizeOption(180,120));
		game.setNextEntity(new BallAddOption(300,240));
		game.setNextEntity(new BallAddOption(460,240));
		game.setNextEntity(new OverSizeOption(580,120));
	}
}