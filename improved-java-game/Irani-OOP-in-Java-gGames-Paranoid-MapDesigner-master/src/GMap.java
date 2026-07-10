import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferStrategy;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class GMap
{
	// Rubber is active tool in first
	int				iActiveTool		=-1;
	// step of Grid
	int				StepWidth		=20;
	// all drawn elements on the map
	RuntimeElement	MapElements[]	=new RuntimeElement[1000];
	int				cMapElements	=0;
	
	// images of elements on the map that load once
	Sprite			sprite[]		=new Sprite[100];
	Sprite			rubberSprit;
	int				csprit			=0;
	
	JFrame			frmMain;
	JPanel			Tools;
	Canvas			can;
	BufferStrategy	canbuffer;
	Graphics		graphics;
	
	JTextArea		Output;
	JLabel			activeTool;
	
	// Tools of Project
	MElement		rubber;
	MElement		ToolsElements[]	=new MElement[20];
	int				cToolsElements	=0;
	
	
	private String	ImageNames[]	= { "Images/Beton_20_20.jpg", "Images/Beton_20_40.jpg",
			"Images/Beton_20_60.jpg", "Images/Beton_40_20.jpg", "Images/Beton_60_20.jpg",
			
			"Images/Brick_20_20.jpg", "Images/Brick_20_40.jpg", "Images/Brick_20_60.jpg",
			"Images/Brick_40_20.jpg", "Images/Brick_60_20.jpg",
			
			"Images/LifeBrick.jpg", "Images/SekkeBrick10.jpg", "Images/SekkeBrick30.jpg",
			"Images/TirBrick.jpg",
			
			"Images/Bad.gif", "Images/Hearts.gif", "Images/MMSekkeBrick30.jpg" };
	
	
	private String	ClassNames[]	= { "Beton", "Beton", "Beton", "Beton", "Beton",
									
									"Brick", "Brick", "Brick", "Brick", "Brick",
									
									"LifeBrick", "SekkeBrick10", "SekkeBrick30", "TirBrick",
									
									"GBad", "GHeart", "MovingSekkeBrick30" };
	
	private String	ClassTypes[]	= { "Beton.Beton_20_20", "Beton.Beton_20_40",
			"Beton.Beton_20_60", "Beton.Beton_40_20", "Beton.Beton_60_20",
			
			"Brick.Brick_20_20", "Brick.Brick_20_40", "Brick.Brick_20_60", "Brick.Brick_40_20",
			"Brick.Brick_60_20",
			
			"", "", "", "", "", "", "" };
	
	public GMap()
	{
		// Main frame
		frmMain=new JFrame();
		frmMain.setTitle("GGames.Paraniod.GMap Designer");
		frmMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMain.setBounds(200 , 20 , 1300 , 640);
		frmMain.setLayout(new FlowLayout());
		frmMain.setResizable(false);
		
		
		// Tools Panel
		Tools=new JPanel();
		Tools.setBackground(Color.WHITE);
		Tools.setPreferredSize(new Dimension(100 , 600));
		frmMain.getContentPane().add(Tools);
		Tools.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		
		// Canvas
		can=new Canvas();
		can.setPreferredSize(new Dimension(800 , 600));
		can.setBackground(Color.BLACK);
		frmMain.getContentPane().add(can);
		can.setIgnoreRepaint(true);
		
		MouseHandler mm=new MouseHandler();
		can.addMouseMotionListener(mm);
		can.addMouseListener(mm);
		
		
		// Output Area
		Output=new JTextArea();
		Output.setPreferredSize(new Dimension(360 , 600));
		Output.setBackground(Color.RED);
		frmMain.getContentPane().add(Output);
		
		
		// Elements in Tools Bar
		activeTool=new JLabel();
		activeTool.setPreferredSize(new Dimension(120 , 15));
		activeTool.setFont(new Font("Times" , Font.BOLD , 10));
		activeTool.setText("Rubber");
		activeTool.setForeground(Color.RED);
		Tools.add(activeTool);
		
		
		// firstly add Rubber then...
		rubber=new MElement("Rubber" , "" , "Images/Rubber.jpg");
		rubber.setID(-1);
		rubber.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				GMap.this.activeTool.setText("Rubber");
				iActiveTool=-1;
			}
		});
		Tools.add(rubber);
		rubberSprit=SpriteStore.get().getSprite("Images/Rubber.jpg");
		
		
		
		// add other tools
		for (int i=0 ; i<ImageNames.length ; i++)
		{
			ToolsElements[i]=new MElement(ClassNames[i] , ClassTypes[i] , ImageNames[i]);
			ToolsElements[i].setID(i);
			sprite[csprit++]=SpriteStore.get().getSprite(ImageNames[i]);
			
			final int ii=i;
			ToolsElements[i].addActionListener(new ActionListener()
			{
				@Override
				public void actionPerformed(ActionEvent arg0)
				{
					GMap.this.activeTool.setText(ToolsElements[ii].getDisplayName());
					iActiveTool=ii;
				}
			});
			Tools.add(ToolsElements[i]);
		}
		
		frmMain.setVisible(true);
	}// end of Constructor
	
	private class RuntimeElement
	{
		public int	x , y , iTool;
		
		public RuntimeElement(int x , int y , int iActiveTool)
		{
			this.x=x;
			this.y=y;
			this.iTool=iActiveTool;
		}
	}
	
	private void drawGrid(Graphics g)
	{
		for (int i=0 ; i<800 ; i+=StepWidth)
			g.drawLine(i , 0 , i , 600);
		for (int i=0 ; i<600 ; i+=StepWidth)
			g.drawLine(0 , i , 800 , i);
	}
	
	private void Write_Output()
	{
		String SSS="";
		for (int i=0 ; i<cMapElements ; i++)
			SSS+=ToolsElements[MapElements[i].iTool].getSourceCode(MapElements[i].x ,
					MapElements[i].y);
		
		Output.setText(SSS);
	}
	
	protected void MouseAction(MouseEvent e , int action)
	{
		// action=0 move, action=1 click
		int curX=0;
		int curY=0;
		
		can.createBufferStrategy(2);
		canbuffer=can.getBufferStrategy();
		
		graphics=canbuffer.getDrawGraphics();
		
		drawGrid(graphics);
		curX=e.getX()-(e.getX()%StepWidth);
		curY=e.getY()-(e.getY()%StepWidth);
		
		
		if (action==1&&iActiveTool!=-1) // click
			MapElements[cMapElements++]=new RuntimeElement(curX , curY , iActiveTool);
		
		if (action==1&&iActiveTool==-1) // click (Tools=Rubber)
			for (int i=0 ; i<cMapElements ; i++)
				if (MapElements[i].x==curX&&MapElements[i].y==curY)
					MapElements[i]=MapElements[--cMapElements];
		
		if (action==1)
			Write_Output();
		
		
		// Draw elements on can
		for (int i=0 ; i<cMapElements ; i++)
			sprite[MapElements[i].iTool].draw(graphics , MapElements[i].x , MapElements[i].y);
		
		if (action==0) // move
			if (iActiveTool>=0)
				sprite[iActiveTool].draw(graphics , curX , curY);
			else
				rubberSprit.draw(graphics , curX , curY);
		
		
		canbuffer.show();
		graphics.dispose();
		
	}// ///
	
	
	
	private class MouseHandler implements MouseListener , MouseMotionListener
	{
		@Override
		public void mouseMoved(MouseEvent e)
		{
			MouseAction(e , 0);
		}
		
		@Override
		public void mouseClicked(MouseEvent e)
		{
			MouseAction(e , 1);
		}
		
		@Override
		public void mouseDragged(MouseEvent arg0)
		{
		}
		
		@Override
		public void mouseEntered(MouseEvent arg0)
		{
		}
		
		@Override
		public void mouseExited(MouseEvent arg0)
		{
		}
		
		@Override
		public void mousePressed(MouseEvent arg0)
		{
		}
		
		@Override
		public void mouseReleased(MouseEvent arg0)
		{
		}
		
	}
	
	public static void main(String[] args)
	{
		JFrame.setDefaultLookAndFeelDecorated(true);
		new GMap();
	}
}