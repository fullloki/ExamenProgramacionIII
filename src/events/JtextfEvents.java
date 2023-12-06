package events;
import java.awt.event.*;
import javax.swing.*;
import details.*;
public class JtextfEvents{
	private boolean name,ltName,user,pass,balance;
	Details style = new Details();
	public JtextfEvents() {
		
	}
	public JtextfEvents(JTextField jtfName,JTextField jtfLtName,JTextField jtfUser,JTextField jtfPass,JTextField jtfBalance,JButton btn) {
		
		jtfName.addKeyListener(new KeyAdapter() {
	       	public void keyReleased(KeyEvent e) {
	    		//name = true;
	    		if(jtfName.getText().equals(""))name = false;
	    		else name = true;
	    		habiliteButton(btn);
	           /* System.out.println(name);
	            System.out.println(ltName);
	            System.out.println(user);
	            System.out.println(pass);
	            System.out.println(balance);*/
	    	}
		});
		jtfLtName.addKeyListener(new KeyAdapter() {
	    	public void keyReleased(KeyEvent e) {
	    		//ltName = true;
	    		if(jtfLtName.getText().equals(""))ltName = false;
	    		else ltName = true;
	    		habiliteButton(btn);
	    	}
		});
		jtfUser.addKeyListener(new KeyAdapter() {
	    	public void keyReleased(KeyEvent e) {
	    		//user = true;
	    		if(jtfUser.getText().equals(""))user = false;
	    		else user = true;
	    		habiliteButton(btn);
	    	}
		});
		jtfPass.addKeyListener(new KeyAdapter() {
	    	public void keyReleased(KeyEvent e) {
	    		pass = true;
	    		if(jtfPass.getText().equals(""))pass = false;
	    		else pass = true;
	    		habiliteButton(btn);
	    	}
		});
		jtfBalance.addKeyListener(new KeyAdapter() {
	    	public void keyReleased(KeyEvent e) {
	    		//balance = true;
	    		if(jtfBalance.getText().equals(""))balance = false;
	    		else balance = true;
	    		habiliteButton(btn);
	    	}
		});
		
	}
	//METODO DE FOCUS EVENTS PARA LA ETIQUETAS
	public void focusEvent (JTextField txtField, String etiquetaDato) {
		txtField.addFocusListener(new FocusListener () {
			
			@Override
			public void focusGained(FocusEvent e) {
				//TODO
				
				if (txtField.getText().equals(etiquetaDato)) {
		            txtField.setText("");
			        style.removeStyleFont(txtField);
		          }
			}

			@Override
			public void focusLost(FocusEvent e) {
				//TODO 
				if (txtField.getText().isEmpty()) {
				    txtField.setText(etiquetaDato);
			       style.addStyleFont(txtField);
		          }
			}
		});
	}
	
    public void habiliteButton(JButton btn) {
    	if(name && ltName && user && pass && balance) {
    		btn.setEnabled(true);
    	}else btn.setEnabled(false);
    }

}
