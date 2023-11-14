package menuDatos;
import java.awt.*;
import javax.swing.*;
import details.*;
public class SetItem {
	Colors style = new Colors();
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
