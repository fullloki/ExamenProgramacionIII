package details;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 * Clase con todos los detalles y estilos del programa.
 */
public class Details{
	/**
	 * Metodo que le estilo al nombre del restaurante.
	 * @param jl. Parametro que modifica un label con el nombre del restaurante en INICIO.
	 */
	public void appName(JLabel jl) {
		jl.setForeground(Color.WHITE);
		jl.setFont(new Font("Arial Rounded MT Bold",Font.BOLD,20));
	}
	/**
	 * ESTILO DE LOS BOTONES CON BORDES ROJOS
	 * @param jbtn. Parametro para darle bordes rojos a un boton.
	 */
	public void jbBorderRed(JButton jbtn) {
		jbtn.setBackground(Color.BLACK);
		jbtn.setForeground(Color.WHITE);
		jbtn.setFont(new Font("Arial Black",Font.PLAIN,11));
		//le da bordes redondos al boton (int radio,Color color,float grosor)
		jbtn.setBorder(new RoundedBorder(30,Color.RED,1.0f));
	}
	/**
	 * ESTILO DE LOS BOTONES CON BORDES BLANCOS
	 * @param jbtn. Parametro para darle bordes blancos a un boton.
	 */
	public void jbBorderWhite(JButton jbtn) {
		jbtn.setBackground(Color.BLACK);
		jbtn.setForeground(Color.WHITE);
		jbtn.setFont(new Font("Arial Black",Font.PLAIN,11));
		jbtn.setBorder(new RoundedBorder(12,Color.WHITE,2.5f));
	}
	 
	/**
	 * ESTILO, SECCION DE PRODUCTOS. 
	 * @param jlabel. Parametro para modificar titulo en INICIO.
	 */
	public void fontProductsH1(JLabel jlabel) {
		jlabel.setBounds(65, 25, 500, 50);
		jlabel.setFont(new Font("Arial Rounded MT Bold",Font.BOLD,48));
		jlabel.setForeground(Color.WHITE);
	}
	/**
	 * ESTILO, SECCION DE PRODUCTOS. 
	 * @param jta. Parametro para modificar parrafos en un TextArea en INICIO.
	 */
	public void fontProductsP(JTextArea jta) {
		jta.setBounds(65, 120, 370, 170);
		jta.setOpaque(true);
	    jta.setBackground(Color.black);
	    jta.setEditable(false);
	    jta.setFont(new Font("Calibri", Font.PLAIN, 12));
		jta.setForeground(Color.white);
	}
	/**
	 * ESTILO, SECCION DE CUPONES.
	 * @param jta. Parametro modificar informacion del cupon.
	 */
	public void fontCouponsP(JTextArea jta) {
    	jta.setOpaque(true);
		jta.setLayout(null);
		jta.setEditable(false);
		jta.setBackground(Color.black);
		jta.setFont(new Font("Aptos", Font.BOLD, 12));
		jta.setForeground(Color.white);
		jta.setBounds(155, 60, 195, 90);
    }
	/**
	 * ESTILO, SECCION DE CUPONES.
	 * @param price. Parametro para modificar precios del cupon.
	 */
    public void price(JLabel price) {
    	price.setHorizontalAlignment(SwingConstants.CENTER);
		price.setFont(new Font("Aptos", Font.BOLD, 35));
		price.setForeground(Color.white);
		price.setBounds(150, 0, 145, 40);
    }
    /**
     * ESTILO, SECCION DE MENU.
     * @param jbtn. Parametro para el estilo de los botones en el MENU.
     */
	public void MenuButtonStyle(JButton jbtn) {
		jbtn.setBackground(null);
		jbtn.setForeground(new Color(166,166,166));
		jbtn.setFont(new Font("Times New Roman",Font.BOLD,18));
		jbtn.setBorder(new RoundedBorder(12,Color.DARK_GRAY,1.0f));
	}
	/**
	 * ESTILO, SECCION DE MENU.
	 * @param jl. Parametro para el estilo del titulo y precio del producto en el MENU.
	 */
    public void ItemLabels(JLabel jl) {
    	jl.setForeground(Color.WHITE);
    	jl.setFont(new Font("Times New Roman",Font.BOLD,18));
    }
    /**
     * ESTILO, SECCION DE MENU.
     * @param jta. Parametro para darle estilo a la informacion del producto en el Menu.
     */
    public void ItemTextArea(JTextArea jta) {
    	jta.setBackground(null);
    	jta.setForeground(Color.GRAY);
    	jta.setFont(new Font("Times New Roman",Font.PLAIN,18));
    }
    /**
     * ESTILO, SECCION ABOUT US
     * @param jl. Parametro para darle estilo al titulo en ACERCA DE.
     */
    public void About_H3(JLabel jl) {
		 jl.setFont(new Font("Arial Rounded MT",Font.BOLD,50));
		 jl.setHorizontalAlignment(SwingConstants.CENTER);
		 jl.setForeground(Color.WHITE);
		 jl.setBackground(Color.BLACK);
		 jl.setOpaque(true);
    }
    /**
     * ESTILO, SECCION ABOUT US
     * @param jl. Parametro para darle estilo al Subtitulo en ACERCA DE.
     */
    public void AboutBold_P(JLabel jl) {
		jl.setFont(new Font("Calibri",Font.BOLD,14));
		jl.setHorizontalAlignment(SwingConstants.CENTER);
		jl.setForeground(Color.WHITE);
		jl.setBackground(Color.BLACK);
		jl.setOpaque(true);
    }
    /**
     * ESTILO, SECCION ABOUT US
     * @param jl. Parametro para darle estilo al texto con los integrantes en ACERCA DE.
     */
    public void AboutPlain_P(JLabel jl) {
		jl.setFont(new Font("Calibri",Font.PLAIN,14));
		jl.setHorizontalAlignment(SwingConstants.CENTER);
		jl.setForeground(Color.WHITE);
		jl.setBackground(Color.BLACK);
		jl.setOpaque(true);
    }
    /**
     * ESTILO, SECCION ABOUT US
     * @param jta. Parametro para darle estilo al parrafo en ACERCA DE.
     */
    public void AboutTextArea(JTextArea jta) {
        jta.setOpaque(true);
        jta.setBackground(Color.BLACK);
        jta.setEditable(false);
        jta.setFont(new Font("Calibri", Font.PLAIN,12));
        jta.setForeground(Color.WHITE);
    }
    /**
     * ESTILO, LOGIN
     * @param jl. Parametro para darle estilo al titulo en el LOGIN.
     */
	public void loginFont_H1(JLabel jl) {//<--titulo
		jl.setBackground(null);
		jl.setForeground(Color.WHITE); //Cambiar el color a la fuente
		jl.setFont(new Font ("Arial", Font.BOLD, 30));
	}
	/**
	 * ESTILO, LOGIN
	 * @param jl. Parametro para darle estilo a la describcion de los textField en el LOGIN.
	 */
	public void loginFont_P(JLabel jl) {
		jl.setBackground(null);
		jl.setForeground(Color.WHITE);
		jl.setFont(new Font ("DM Sans", Font.PLAIN, 12));
	}
	/**
	 * ESTILO, LOGIN
	 * @param jtf. Parametro para darle estilo al texto dentro del textField en el LOGIN.
	 */
	public void loginJTextField(JTextField jtf) {
		jtf.setBorder(BorderFactory.createLineBorder(Color.RED));
		jtf.setBackground(Color.BLACK);
		jtf.setForeground(Color.WHITE);
		jtf.setCaretColor(Color.WHITE);
	}
	/**
	 * ESTILO, LOGIN
	 * @param jb. Parametro para darle estilo al boton de ingresar.
	 */
	public void jbuttonLogIn(JButton jb) {
		jb.setBorder(null);
		jb.setFont(new Font("Arial",Font.BOLD,15));
		//jb.setEnabled(false);
	}
	/**
	 * ESTILO, LOGIN
	 * @param jb. Parametro que le da estilo al boton Iniciar sesion.
	 */
	public void jbuttonLogOut(JButton jb) {
		//jb.setEnabled(true);
		jb.setText("Iniciar sesion");
		jbBorderRed(jb);
	}
	/**
	 * ESTILO, MENUBAR
	 * @param jmenu. Parametro para el estilo de texto en el JMenu.
	 */
	public void jmenuDetails(JMenu jmenu) {
		jmenu.setForeground(Color.WHITE);
	}
	/**
	 * ESTILO, MENUBAR
	 * @param jmItem. Parametro para el estilo de los JMenuItems.
	 */
	public void jmItemsDetails(JMenuItem jmItem) {
		jmItem.setBackground(Color.DARK_GRAY);
		jmItem.setForeground(Color.WHITE);
		jmItem.setBorder(null);
	}
	//==================================================
	/**
	 * ESTILO, BANCO
	 * @param jbtn. Parametro para el estilo de los botones en ADMINISTRACION.
	 */
	public void bankAdmindButtons(JButton jbtn) {
		jbtn.setForeground(Color.WHITE);
		jbtn.setFont(new Font ("DM Sans",Font.BOLD, 10));
		jbtn.setBackground(null);
		jbtn.setBorder(new RoundedBorder(12,Color.WHITE,1.0f));
	}
	/**
	 * ESTILO, LOGIN
	 * @param txtField. Parametro para darle estilo a los textfields.
	 */
	public void styleTextField (JTextField txtField) {
		txtField.setBorder(BorderFactory.createLineBorder(Color.RED));
		txtField.setBackground(Color.BLACK);
		txtField.setFont(new Font ("Arial", Font.ITALIC, 14));
		txtField.setForeground(new Color(153,153,153));
		txtField.setCaretColor(Color.WHITE);
	}
	/**
	 * ESTILO, LOGIN
	 * TEXTFIELD ESPECIAL PARA LA CAJA DE TEXTO DE LA CONTRASEÑA.
	 * @param Password. Parametro para estilo de contraseña.
	 */
	public void stylePasswordField (JPasswordField Password) {
		Password.setEchoChar((char) 0);
		styleTextField(Password);
	}
	/**
	 * ESTILO, LOGIN
	 * METODOS ADDSTYLEFONT Y REMOVESTYLEFONT SON DETALLES PARA LAS FUENTE DE LOS TEXFIELD.
	 * @param txtField. Parametro para stilo antes de insertar texto en el textField.
	 */
	public void addStyleFont (JTextField txtField) {
		txtField.setForeground(new Color(153,153,153));
		txtField.setFont(new Font ("Arial", Font.ITALIC, 14));
		txtField.setCaretColor(Color.WHITE);
	}
	/**
	 * ESTILO, LOGIN
	 * METODOS ADDSTYLEFONT Y REMOVESTYLEFONT SON DETALLES PARA LAS FUENTE DE LOS TEXFIELD.
	 * @param txtField. Parametro para stilo al insertar texto en el textField.
	 */
	public void removeStyleFont (JTextField txtField) {
		txtField.setForeground(Color.WHITE);
		txtField.setFont(new Font ("Arial", Font.PLAIN, 14));
		txtField.setCaretColor(Color.WHITE);
	}
	/**
	 * ESTILO, LOGIN, REGISTER
	 * @param etiqueta. Parametro para darle estilo a las etiquetas en el registro
	 */
	public void styleEtiquetaRegit (JLabel etiqueta) {
		etiqueta.setFont(new Font("Arial Black",Font.PLAIN,14));
		etiqueta.setForeground(Color.WHITE);
	}
	/**
	 * ESTILO, LOGIN, REGISTER
	 * @param etiqTitulo. Parametro para darle estilo al titulo en el REGISTRO.
	 */
	public void styleTitle (JLabel etiqTitulo) {
		etiqTitulo.setFont(new Font("Arial Black",Font.PLAIN,18));
		etiqTitulo.setForeground(Color.WHITE);
	}
	/**
	 * METODO DE CONDICION DE CARTACTER DE UN TEXTFIELD Y ETIQUETA DE ADVERTENCIA
	 * @param fieldChar. Parametro para limitar textField.
	 * @param size. Parametro para asignar el numero de caracteres permitidos.
	 * @param label. Parametro para asignar alerta.
	 */
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
}
