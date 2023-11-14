package appGUI;

import java.awt.*;
import javax.swing.*;
import details.*;

public class SectionHorary extends JPanel{

	public JPanel panel1;
	public SectionHorary() {
			panel1();
			etiquetas();
		}
		private void panel1() {
			setLayout(null);
			setBackground(Color.BLACK);
			this.setOpaque(true);
		}
		public void horaryText(JLabel label,Font font,Color color) {
			label.setFont(font);
			label.setForeground(color);
			label.setBackground(Color.BLACK);
			label.setOpaque(true);
		}
		private void etiquetas() {
			JLabel etiqueta1 = new JLabel ();
			etiqueta1.setText("CONOCE NUESTRO");
			etiqueta1.setBounds(400,7,250,30);
			horaryText(etiqueta1,new Font("Bahnschrift",Font.PLAIN,24),Color.WHITE);
			this.add(etiqueta1);
			
			JLabel etiqueta2 = new JLabel ();
			etiqueta2.setText("HORARIO");
			etiqueta2.setBounds(375,40,300,50);
			horaryText(etiqueta2,new Font("Arial Black",Font.BOLD,48),new Color(197,90,17));
			this.add(etiqueta2);
			
			JLabel etiqueta3 = new JLabel ();
			etiqueta3.setText("TELEFONO");
			etiqueta3.setBounds(100,60,200,20);
			horaryText(etiqueta3,new Font("Arial Black",Font.BOLD,24),new Color(197,90,17));
			this.add(etiqueta3);
			
			JLabel etiqueta4 = new JLabel ();
			etiqueta4.setText("DIRECCION");
			etiqueta4.setBounds(760,60,200,20);
			horaryText(etiqueta4,new Font("Arial Black",Font.BOLD,24),new Color(197,90,17));
			this.add( etiqueta4);
			
			JLabel etiqueta5 = new JLabel ();
			etiqueta5.setText("7575-6777");
			etiqueta5.setBounds(135,95,90,30);
			horaryText(etiqueta5,new Font("Calibri",Font.PLAIN,18),Color.WHITE);
			this.add(etiqueta5);
			
			JLabel etiqueta6 = new JLabel ();
			etiqueta6.setText("6824-5303");
			etiqueta6.setBounds(135,120,90,30);
			horaryText(etiqueta6,new Font("Calibri",Font.PLAIN,18),Color.WHITE);
			this.add(etiqueta6);
			
			JLabel etiqueta7 = new JLabel ();
			etiqueta7.setText("LUNES A VIERNES");
			etiqueta7.setBounds(435,95,200,30);
			horaryText(etiqueta7,new Font("Calibri",Font.PLAIN,18),Color.WHITE);
			this.add(etiqueta7);
			
			JLabel etiqueta8 = new JLabel ();
			etiqueta8.setText("7:00 AM - 7:30 PM");
			etiqueta8.setBounds(432,120,200,30);
			horaryText(etiqueta8,new Font("Calibri",Font.PLAIN,18),new Color(127,127,127));
			this.add(etiqueta8);
			
			JLabel etiqueta9 = new JLabel ();
			etiqueta9.setText("SABADOS A DOMINGOS");
			etiqueta9.setBounds(412,160,200,30);
			horaryText(etiqueta9,new Font("Calibri",Font.PLAIN,18),Color.WHITE);
			this.add(etiqueta9);
			
			JLabel etiqueta10 = new JLabel ();
			etiqueta10.setText("10:00 AM - 8:00 PM");
			etiqueta10.setBounds(430,185,200,30);
			horaryText(etiqueta10,new Font("Calibri",Font.PLAIN,18),new Color(127,127,127));
			this.add(etiqueta10);
			
			JLabel etiqueta11 = new JLabel ();
			etiqueta11.setText("AVENIDA LAS ACACIAS, AL LADO DEL SOJO MALL.");
			etiqueta11.setBounds(650,95,400,30);
			horaryText(etiqueta11,new Font("Calibri",Font.PLAIN,18),Color.WHITE);
			this.add(etiqueta11);
			
			JLabel etiqueta12 = new JLabel ();
			etiqueta12.setText("AVENIDA TRANSISIMICA, AL FRENTE DE UDELAS.");
			etiqueta12.setBounds(650,120,400,30);
			horaryText(etiqueta12,new Font("Calibri",Font.PLAIN,18),Color.WHITE);
			this.add(etiqueta12);
			
		    JLabel etiqueta13 = new JLabel();
		    etiqueta13.setOpaque(true);
		    etiqueta13.setBackground(Color.BLACK);
		    etiqueta13.setBounds(700,60,640,480);
		    etiqueta13.setIcon(new Imagens("food2.png",340,220).imagen());
			this.add(etiqueta13);
			
		    JLabel etiqueta14 = new JLabel();
		    etiqueta14.setOpaque(true);
		    etiqueta14.setBackground(Color.BLACK);
		    etiqueta14.setBounds(0,60,640,480);
		    etiqueta14.setIcon(new Imagens("food1.png",340,220).imagen());
		    this.add(etiqueta14);
		}
}
