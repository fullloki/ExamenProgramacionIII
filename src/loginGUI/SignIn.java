package loginGUI;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;
import details.*;
import events.*;
/**
 * Clase con la interfaz de iniciar sesion
 */
@SuppressWarnings("serial")
public class SignIn extends JPanel {
    protected JLabel lbTitle, lbSubTitle;
    protected JLabel lbUser, lbPassword;
    protected JLabel lbImagen1, lbImagen2, lbImagen3, lbImagen4, lbImagen5, lbVinculo, lbWarning;
    protected JTextField txtUser;
    protected JPasswordField txtPassword;
    protected JButton btnIngresar;
    protected JLabel lbMsg;
    protected JLabel lbFondo;
    protected boolean user;
    public JLabel lbHiperVinculo;
    public JLabel lbInicio;

   // private Image imagen;
    Details style = new Details();
    Register register = new Register();
    JtextfEvents event = new JtextfEvents();
	//CONTRUCTOR
	public SignIn () {
		
		this.setLayout(null);
		this.setSize(800,420);
		this.setVisible(true);
		lbFondo = new JLabel();
		lbFondo.setBounds(0, 0, 800, 420);
		lbFondo.setIcon(new Imagens("fondoblack.jpg",800,420).imagen());
		iniComponent ();
		this.add(lbFondo);
		
	}
	
	//METODO QUE INVOCA TODOS LOS COMPONENTES
	private void iniComponent () {
		etiquetasIni ();
		textField();
		setBotonIngresar ();
		etiquetaIcon ();
		etiquetaVinculo ();
	}
	
	//METODO DONDE CONTIENE TODOS LAS ETIQUETAS DE DATOS
	private void etiquetasIni () {
	    lbTitle = new JLabel ("Te damos la bienvenida");
		lbSubTitle = new JLabel ("Inicia sesión");
		lbUser = new JLabel ("Usuario: ");
		lbPassword = new JLabel ("Contraseña: ");
		lbVinculo = new JLabel ("¿Es tu primera vez? ");
	    lbWarning = new JLabel ();
	    lbMsg = new JLabel("",SwingConstants.CENTER);
	    
		lbTitle.setBounds(115,20,280,60);
		lbTitle.setFont(new Font("Arial",Font.PLAIN,24));
		lbTitle.setForeground(Color.WHITE);
			
		lbSubTitle.setBounds(160,50,170,60);
		lbSubTitle.setFont(new Font("Arial Black",Font.PLAIN,24));
		lbSubTitle.setForeground(Color.WHITE);
			
		lbUser.setBounds (100,100,300,30);
		lbUser.setFont(new Font("Arial Black",Font.PLAIN,14));
		lbUser.setForeground(Color.WHITE);
			
		lbPassword.setBounds (100,190,300,30);
		lbPassword.setFont(new Font("Arial Black",Font.PLAIN,14));
		lbPassword.setForeground(Color.WHITE);
			
	    lbVinculo.setBounds(100,278,130,20);
	    lbVinculo.setFont(new Font("Arial",Font.PLAIN,14));
		lbVinculo.setForeground(new Color(153,153,153));
	    
		lbWarning.setBounds(100,170, 300,20);
		lbMsg.setBounds(100,257,300,20);
		style.loginFont_P(lbMsg);
	    add(lbTitle);
	    add(lbSubTitle);
	    add(lbUser);
	    add(lbPassword);
	    add(lbVinculo);
	    add(lbWarning);
	    add(lbMsg);
	}
	
	//METODO QUE TIENE LOS TEXTFIELD
	private void textField () {
		txtUser = new JTextField (" Usuario");
		txtPassword = new JPasswordField (" Contraseña");
		//txtField = new Details ();
			
		style.styleTextField(txtUser);
	    style.stylePasswordField(txtPassword);
		event.focusEvent(txtUser, " Usuario");
		style.conditionChar(txtUser, 12, lbWarning);
		//txtPassword.addFocusListener(passFocusEvent);
		focusEventPass(txtPassword);
		
		txtUser.setBounds(100,130,300,40); //100,130,300,40
		txtPassword.setBounds (100,220,300,40); //100,210,300,40
		this.add(txtUser);
		this.add(txtPassword);
	}
	/**
	 * METODO DE EVENTO DE FOCUS PARA PASSWORD **EXCLUSIVO PARA ESTE JTEXTFIELD**
	 * @param txtPassword - Parametro para estilo de insertar contraseña.
	 */
	private void focusEventPass (JPasswordField txtPassword) {
		txtPassword.addFocusListener(new FocusListener () {
			@Override
			public void focusGained(FocusEvent e) {
				// TODO 
	  	        if (String.valueOf(txtPassword.getPassword()).equals(" Contraseña")) {
	  	  	        txtPassword.setText("");
	  	  	        txtPassword.setEchoChar('\u25cf');
	  	  	        style.removeStyleFont(txtPassword);
	  	  	     }
			}
			@Override
			public void focusLost(FocusEvent e) {
				// TODO 
	  			if (String.valueOf(txtPassword.getPassword()).isEmpty()) {
	  	  	        txtPassword.setText(" Contraseña");
	  	  	        txtPassword.setEchoChar((char) 0);
	  	  	        style.addStyleFont(txtPassword);
	  	  	     }
			}
			
		});
	}
		
  	//METODO PARA LOS ICONOS
  	private void etiquetaIcon () {  			
  		lbImagen1 = new JLabel ();
  		lbImagen2 = new JLabel ();
  		lbImagen3 = new JLabel ();
  		lbImagen4 = new JLabel ();
  		lbImagen5 = new JLabel ();
  		lbInicio = new JLabel ();
  		
  		boolean eyes = true;
        boolean not_eyes = false;
        
  		lbImagen1.setBounds(410,135,26,26);
  		SetImageLabel (lbImagen1, "username.png");
  		lbImagen2.setBounds(410,227,24,24);
  		SetImageLabel(lbImagen2, "ver.png");
  		lbImagen3.setBounds(410,227,24,24);
  		SetImageLabel(lbImagen3, "nover.png");
  		lbImagen4.setBounds(490,50,300,300);	
  		SetImageLabel(lbImagen4, "Hamburguesita.png");
  		lbImagen5.setBounds(490, 30, 100, 100); 	
  		SetImageLabel(lbImagen5, "Hello.png");
  		
  		//lbInicio.setBounds(30,20,32,32);
  		//SetImageLabel (lbInicio, "inicio.png");
  		

  		
  		lbImagen3.setVisible(false);
  		eventIconEyes(lbImagen2, eyes);
        eventIconEyes (lbImagen3, not_eyes);  
        
  		add(lbImagen1);
  		add(lbImagen2);
  		add(lbImagen3);
  		add(lbImagen4);
  		add(lbImagen5);
  		//add(lbInicio);
  	}
  	/**
  	 * METODO PARA INSERTAR IMAGEN
  	 * @param label - Parametro para insertar la imagen.
  	 * @param root - Parametro con la ruta.
  	 */
  	private void SetImageLabel (JLabel label, String root){
  		label.setIcon(new Imagens(root,label.getWidth(),label.getHeight()).imagen());
  		this.repaint();
  	}
  	/**
  	 * METODO DE ICONO DE VER Y NO VER
  	 * @param ver - Parametro con la imagen.
  	 * @param validar_dato - Parametro con la validacion
  	 */
    private void eventIconEyes (JLabel ver, boolean validar_dato){
        ver.addMouseListener(new MouseAdapter (){
            @Override
            public void mouseClicked (MouseEvent e) {
            	desbloqueaField (txtPassword, validar_dato);
           }
        });
    } 
    /**
     * METODO PARA QUITAR Y PONER LOS CARACTERES EN EL JPASSWORDFIELD **EXCLUSIVOS DE ESAS ETIQUETAS**
     * @param txtPassword - Parametro para asignar: ocultar o ver contraseña. 
     * @param validar - Parametro de validacion.
     */
   public void desbloqueaField (JPasswordField txtPassword, boolean validar){    
	   if (validar){
         txtPassword.setEchoChar('\0');
         lbImagen2.setVisible (false);
         lbImagen3.setVisible(true);

       }else{
            txtPassword.setEchoChar('\u25cf');
            lbImagen2.setVisible (true);
            lbImagen3.setVisible(false);
       }
   }
  		 
  	private void setBotonIngresar () {
  		btnIngresar = new JButton ("Ingresar");
  		Details button = new Details ();
  			
  		button.jbBorderRed(btnIngresar);
  		btnIngresar.setBounds(260,300,140,50);
  			
  		this.add(btnIngresar);;
  	}
    private void etiquetaVinculo () {
        lbHiperVinculo = new JLabel ();
        String etiqueta = "<html><u>Regístrate<u><html>";
        lbHiperVinculo.setBounds(230,278,80,20);
        lbHiperVinculo.setFont(new Font ("Arial", Font.BOLD, 14));
        lbHiperVinculo.setForeground(new Color(153,153,153));
        lbHiperVinculo.setText(etiqueta);
        this.add(lbHiperVinculo);
    }
	public JTextField getJtfUser() {
		return txtUser;
	}
	public JTextField getJtfPass() {
		return txtPassword;
	}
	public JLabel getJLMsg() {
		return lbMsg;
	}
	public JButton getJBInit() {
		return btnIngresar;
	}

}
