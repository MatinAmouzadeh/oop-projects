import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;


public class MElement extends JButton
{
	private String	ClassName;
	private String	ClassType;
	private String	ImageName;
	private String	DisplayName;
	private int		ID;
	
	
	public MElement(String ClassName , String ClassType , String ImageName)
	{
		setPreferredSize(new Dimension(45 , 45));
		setBackground(Color.LIGHT_GRAY);
		
		try
		{
			// Resize original Images to show as Tools
			BufferedImage image=ImageIO.read(getClass().getResource(ImageName));
			BufferedImage Image2=new BufferedImage(40 , 40 , 1);
			Graphics2D g=Image2.createGraphics();
			
			int newWidth=(int) ((.6)*image.getWidth());
			int newHeight=(int) ((.6)*image.getHeight());
			
			g.drawImage(image , 0 , 0 , newWidth , newHeight , null);
			g.dispose();
			
			setIcon(new ImageIcon(Image2));
		}
		catch (IOException ex)
		{
			// Show Error
		}
		
		this.ClassName=ClassName;
		this.ImageName=ImageName;
		this.ClassType=ClassType;
	}
	
	public String getSourceCode(int x , int y)
	{
		String Result="\n";
		Result+="game.setNextEntity(new "+ClassName;
		Result+="("+x+","+y;
		if (ClassType.length()==0)
			Result+="));";
		else if (ClassType.length()>0)
			Result+=","+ClassType+"));";
		
		return Result;
	}
	
	public String getDisplayName()
	{
		if (ClassType.length()>0)
			return ClassType;
		else
			return ClassName;
	}
	
	public int getID()
	{
		return ID;
	}
	
	public void setID(int ID)
	{
		this.ID=ID;
	}
	
}
