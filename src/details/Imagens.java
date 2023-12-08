package details;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
/**
 * Clase para insertar las imagenes.
 */
public class Imagens{
	private String imgName;
	private int width,height;
	/**
	 * Contructor para asignar la imagen.
	 * @param imgName. Parametro para el nombre de la imagen.
	 * @param width. Parametro para el ancho de la imagen. 
	 * @param height. Parametro para el alto de la imagen.
	 */
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
	/**
	 * METODO PARA ASIGNAR LA IMAGEN A UN COMPONENTE.
	 * @return Devel la imagen asignada.
	 */
	public Icon imagen() {
		ImageIcon png1 = new ImageIcon("src/img/"+getImgName());
		ImageIcon img = new ImageIcon(png1.getImage().getScaledInstance(getWidth(), getHeight(), Image.SCALE_SMOOTH));
		return img;
	}
}
