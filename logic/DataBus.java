package logic;
import javax.swing.*;
/**
 * Clase para pasar parametros entre clases
 */
public class DataBus {
	public JPanel main;
	public JPanel content;
	private int index;
	public JButton jbtn;
	public boolean resetFacture;
	public DataBus(JButton jbtn,JPanel main,JPanel content,int index,boolean resetFacture) {
		this.jbtn = jbtn;
		this.main = main;
		this.index = index;
		this.content = content;
		this.resetFacture = resetFacture;
	}
	public DataBus() {
		
	}
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
}
