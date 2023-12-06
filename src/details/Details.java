package details;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Details{
	public void appName(JLabel jl) {
		jl.setForeground(Color.WHITE);
		jl.setFont(new Font("Arial Rounded MT Bold",Font.BOLD,20));
	}
	//==================================================ESTILO DE LOS BOTONES CON BORDES ROJOS
	public void jbBorderRed(JButton jbtn) {
		jbtn.setBackground(Color.BLACK);
		jbtn.setForeground(Color.WHITE);
		jbtn.setFont(new Font("Arial Black",Font.PLAIN,11));
		//le da bordes redondos al boton (int radio,Color color,float grosor)
		jbtn.setBorder(new RoundedBorder(30,Color.RED,1.0f));
	}
	//==================================================ESTILO DE LOS BOTONES CON BORDES BLANCOS
	public void jbBorderWhite(JButton jbtn) {
		jbtn.setBackground(Color.BLACK);
		jbtn.setForeground(Color.WHITE);
		jbtn.setFont(new Font("Arial Black",Font.PLAIN,11));
		jbtn.setBorder(new RoundedBorder(12,Color.WHITE,2.5f));
	}
	//==================================================ESTILO, SECCION DE PRODUCTOS 
	public void fontProductsH1(JLabel jlabel) {
		jlabel.setBounds(65, 25, 500, 50);
		jlabel.setFont(new Font("Arial Rounded MT Bold",Font.BOLD,48));
		jlabel.setForeground(Color.WHITE);
	}
	//ESTILO DE FUENTE DE PARRAFOS, SECCION DE PRODUCTOS
	public void fontProductsP(JTextArea jta) {
		jta.setBounds(65, 120, 370, 170);
		jta.setOpaque(true);
	    jta.setBackground(Color.black);
	    jta.setEditable(false);
	    jta.setFont(new Font("Calibri", Font.PLAIN, 12));
		jta.setForeground(Color.white);
	}
	//==================================================ESTILO, SECCION DE CUPONES
	public void fontCouponsP(JTextArea jta) {
    	jta.setOpaque(true);
		jta.setLayout(null);
		jta.setEditable(false);
		jta.setBackground(Color.black);
		jta.setFont(new Font("Aptos", Font.BOLD, 12));
		jta.setForeground(Color.white);
		jta.setBounds(155, 60, 195, 90);
    }
	//ESTILO DE FUENTE PRECIO, SECCION DE CUPONES
    public void price(JLabel price) {
    	price.setHorizontalAlignment(SwingConstants.CENTER);
		price.setFont(new Font("Aptos", Font.BOLD, 35));
		price.setForeground(Color.white);
		price.setBounds(150, 0, 145, 40);
    }
  //==================================================ESTILO, SECCION DE MENU
	public void MenuButtonStyle(JButton jbtn) {
		jbtn.setBackground(null);
		jbtn.setForeground(new Color(166,166,166));
		jbtn.setFont(new Font("Times New Roman",Font.BOLD,18));
		jbtn.setBorder(new RoundedBorder(12,Color.DARK_GRAY,1.0f));
	}
    public void ItemLabels(JLabel jl) {
    	jl.setForeground(Color.WHITE);
    	jl.setFont(new Font("Times New Roman",Font.BOLD,18));
    }
    public void ItemTextArea(JTextArea jta) {
    	jta.setBackground(null);
    	jta.setForeground(Color.GRAY);
    	jta.setFont(new Font("Times New Roman",Font.PLAIN,18));
    }
  //==================================================ESTILO, SECCION ABOUT US
    public void About_H3(JLabel jl) {
		 jl.setFont(new Font("Arial Rounded MT",Font.BOLD,50));
		 jl.setHorizontalAlignment(SwingConstants.CENTER);
		 jl.setForeground(Color.WHITE);
		 jl.setBackground(Color.BLACK);
		 jl.setOpaque(true);
    }
    public void AboutBold_P(JLabel jl) {
		jl.setFont(new Font("Calibri",Font.BOLD,14));
		jl.setHorizontalAlignment(SwingConstants.CENTER);
		jl.setForeground(Color.WHITE);
		jl.setBackground(Color.BLACK);
		jl.setOpaque(true);
    }
    public void AboutPlain_P(JLabel jl) {
		jl.setFont(new Font("Calibri",Font.PLAIN,14));
		jl.setHorizontalAlignment(SwingConstants.CENTER);
		jl.setForeground(Color.WHITE);
		jl.setBackground(Color.BLACK);
		jl.setOpaque(true);
    }
    public void AboutTextArea(JTextArea jta) {
        jta.setOpaque(true);
        jta.setBackground(Color.BLACK);
        jta.setEditable(false);
        jta.setFont(new Font("Calibri", Font.PLAIN,12));
        jta.setForeground(Color.WHITE);
    }
  //==================================================ESTILO, LOGIN
	public void loginFont_H1(JLabel jl) {//<--titulo
		jl.setBackground(null);
		jl.setForeground(Color.WHITE); //Cambiar el color a la fuente
		jl.setFont(new Font ("Arial", Font.BOLD, 30));
	}
	public void loginFont_P(JLabel jl) {
		
		jl.setBackground(null);
		jl.setForeground(Color.WHITE);
		jl.setFont(new Font ("DM Sans", Font.PLAIN, 12));
	}
	public void loginJTextField(JTextField jtf) {
		jtf.setBorder(BorderFactory.createLineBorder(Color.RED));
		jtf.setBackground(Color.BLACK);
		jtf.setForeground(Color.WHITE);
		jtf.setCaretColor(Color.WHITE);
	}
	public void jbuttonLogIn(JButton jb) {
		jb.setBorder(null);
		jb.setFont(new Font("Arial",Font.BOLD,15));
		//jb.setEnabled(false);
	}
	public void jbuttonLogOut(JButton jb) {
		//jb.setEnabled(true);
		jb.setText("Iniciar sesion");
		jbBorderRed(jb);
	}
	//==================================================ESTILO, MENUBAR
	public void jmenuDetails(JMenu jmenu) {
		jmenu.setForeground(Color.WHITE);
	}
	public void jmItemsDetails(JMenuItem jmItem) {
		jmItem.setBackground(Color.DARK_GRAY);
		jmItem.setForeground(Color.WHITE);
		jmItem.setBorder(null);
	}
	//==================================================Estilo, Banco
	public void bankAdmindButtons(JButton jbtn) {
		jbtn.setForeground(Color.WHITE);
		jbtn.setFont(new Font ("DM Sans",Font.BOLD, 10));
		jbtn.setBackground(null);
		jbtn.setBorder(new RoundedBorder(12,Color.WHITE,1.0f));
	}
	public void bankManagerLabel(JLabel jl) {
		jl.setForeground(Color.WHITE);
		jl.setFont(new Font("Arial",Font.BOLD,14));
		jl.setBackground(null);
	}
	//@Jeremy
		/*============ METODOS PARA DARLE LA PERSONALIZACION  A LOS TEXTFIELD ================*/
		public void styleTextField (JTextField txtField) {
			txtField.setBorder(BorderFactory.createLineBorder(Color.RED));
			txtField.setBackground(Color.BLACK);
			txtField.setFont(new Font ("Arial", Font.ITALIC, 14));
			txtField.setForeground(new Color(153,153,153));
			txtField.setCaretColor(Color.WHITE);
		}
		//TEXTFIELD ESPECIAL PARA LA CAJA DE TEXTO DE LA CONTRASEÑA
		public void stylePasswordField (JPasswordField Password) {
			Password.setEchoChar((char) 0);
			styleTextField(Password);
		}
		//METODOS ADDSTYLEFONT Y REMOVESTYLEFONT SON DETALLES PARA LAS FUENTE DE LOS TEXFIELD
		public void addStyleFont (JTextField txtField) {
			txtField.setForeground(new Color(153,153,153));
			txtField.setFont(new Font ("Arial", Font.ITALIC, 14));
			txtField.setCaretColor(Color.WHITE);
		}
		//METODOS PARA DARLE PERSONALIZACION A LAS ETIQUETAS Y TEXTFIELD DE REGISTER
		public void removeStyleFont (JTextField txtField) {
			txtField.setForeground(Color.WHITE);
			txtField.setFont(new Font ("Arial", Font.PLAIN, 14));
			txtField.setCaretColor(Color.WHITE);
		}
		
		public void styleEtiquetaRegit (JLabel etiqueta) {
			etiqueta.setFont(new Font("Arial Black",Font.PLAIN,14));
			etiqueta.setForeground(Color.WHITE);
		}
		public void styleTitle (JLabel etiqTitulo) {
			etiqTitulo.setFont(new Font("Arial Black",Font.PLAIN,18));
			etiqTitulo.setForeground(Color.WHITE);
		}
		//METODO DE FOCUS EVENTS PARA LA ETIQUETAS
		/*public void focusEvent (JTextField txtField, String etiquetaDato) {
			txtField.addFocusListener(new FocusListener () {
				
				@Override
				public void focusGained(FocusEvent e) {
					//TODO
					
					if (txtField.getText().equals(etiquetaDato)) {
			            txtField.setText("");
				        removeStyleFont(txtField);
			          }
				}

				@Override
				public void focusLost(FocusEvent e) {
					//TODO 
					if (txtField.getText().isEmpty()) {
					    txtField.setText(etiquetaDato);
				        addStyleFont(txtField);
			          }
				}
			});
		}*/
		//METODO DE CONDICION DE CARTACTER DE UN TEXTFIELD Y ETIQUETA DE ADVERTENCIA
		public void conditionChar (JTextField fieldChar, int size, JLabel label) {
			fieldChar.addKeyListener( new KeyAdapter () {
				@Override
				public void keyTyped(KeyEvent e) {
					if(fieldChar.getText().length() >= size) {  //DICE QUE LA LONGITUD DE LA CADENA NO SUPERE EL LIMITE DE 10
						e.consume();
						label.setText("Máximo de 8-" + size + " carácter");
						label.setForeground(new Color (131,131,131));
						label.setFont(new Font("Century Gothic", Font.PLAIN, 12));
						label.setVisible(true);
					}else {
						label.setVisible(false);
					}
					
				}
			});
		}
		//@Jeremy
		/*=====================================================================================*/

}
