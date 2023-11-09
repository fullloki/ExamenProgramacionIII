package details;
/*import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import javax.swing.border.Border;*/
import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
public class RoundedBorder implements Border{
	private int radius;
	//private Color favColor = Color.decode("#0099DD");
	private Color favColor;//color
	private float thickness;//grosor
	
	public RoundedBorder(int radius,Color favColor,float thickness){
		this.radius = radius;
		this.favColor = favColor;
		this.thickness = thickness;
	}
	
	public Insets getBorderInsets(Component c) {
		//return new Insets(this.radius+1,this.radius+1,this.radius+2,this.radius);
		return new Insets(0,0,0,0);
	}
	
	public boolean isBorderOpaque() {
		return false;
	}
	@Override
	public void paintBorder(Component c,Graphics g,int x,int y, int width,int height) {
		//g.drawRoundRect(x, y, width-1, height-1, radius, radius);
		  Graphics2D g2=(Graphics2D) g;
		  g2.setColor(favColor);
		  //Esto modifica el grosor
		  g2.setStroke(new BasicStroke(thickness));//3.0f
		  //Esto mejora (alisa) es aspecto de renderizado del borde
		  g2.setRenderingHints(new RenderingHints(
		                       RenderingHints.KEY_ANTIALIASING,
		                       RenderingHints.VALUE_ANTIALIAS_ON));
		  g2.drawRoundRect(x+1,y+1,width-3,height-3,radius,radius);
		
	}
}