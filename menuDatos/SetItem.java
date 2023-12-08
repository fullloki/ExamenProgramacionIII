package menuDatos;
import java.awt.*;
import javax.swing.*;
import details.*;
/**
 * Clase para agregar la informacion de un tipo de producto.
 */
public class SetItem {
	Details style = new Details();
	/**
	 * Metodo que ordena la informacion
	 * @param jpItem - Parametro para el panel que mostrara los datos.
	 * @param imgName - Parametro para el nombre de la imagen.
	 * @param name - Parametro para el nombre del producto.
	 * @param desc - Parametro para la descripcion del producto.
	 * @param price - Parametro para el precio del producto.
	 */
	public void setItem(JPanel jpItem, String imgName, String name, String desc,String price) {
		jpItem.setLayout(null);
		jpItem.setBackground(new Color(13,13,13));
		JLabel imgItem = new JLabel();
		JLabel nameItem = new JLabel(name);
		JTextArea descItem = new JTextArea(desc);
		JLabel priceItem = new JLabel(price);
		imgItem.setIcon(new Imagens(imgName,190,150).imagen());
		imgItem.setBounds(0, 0, 190, 150);
		nameItem.setBounds(200, 10, 190, 20);
		descItem.setBounds(200, 30, 205,105);
		priceItem.setBounds(200, 140, 190, 20);
		style.ItemLabels(nameItem);
		style.ItemTextArea(descItem);
		style.ItemLabels(priceItem);
		jpItem.add(imgItem);
		jpItem.add(nameItem);
		jpItem.add(descItem);
		jpItem.add(priceItem);
	}
}
