package details;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Imagens {
	private String imgName;
	private int width,height;
	public Imagens(String imgName,int width,int height) {
		this.imgName = imgName;
		this.width = width;
		this.height = height;
	}
	public String getImgName() {
		return imgName;
	}
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	//CAMBIAR DIRECCION DE RUTA DE IMAGEN
	public ImageIcon imagen() {
		ImageIcon png1 = new ImageIcon("C:\\Users\\HomeWork\\OneDrive\\tareas de asbel\\JAVA\\Proyecto-JAVA\\img\\"+getImgName());
		ImageIcon img = new ImageIcon(png1.getImage().getScaledInstance(getWidth(), getHeight(), Image.SCALE_SMOOTH));
		return img;
	}
}
