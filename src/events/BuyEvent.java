package events;
import javax.swing.*;
import appGUI.*;
import java.awt.event.*;
import details.*;
import logic.*;
/**
 * Clase con los eventos de COMPRAR.
 */
public class BuyEvent implements ActionListener{
	private ProductButtonBuy btn[];
	private ProductList pdtList;
	public Product p;
	private JLabel jlTotal;
	private JTextArea jta;
	private JButton jbBuy;
	private DataBus dataBus;
	private AccountList accList;
	//private JLabel icon;
	Details style = new Details();
	/**
	 * Constructor 
	 * @param btn. Parametro para acceder a los ProductButtonBuy.
	 * @param jta. Parametro para insertar informacion en la factura.
	 * @param jlTotal. Parametro para insertar total.
	 * @param jbBuy. Parametro para Habilitar y Desabilitar boton Comprar.
	 * @param dataBus. Parametro para volver al main despues de realizar compra.
	 */
	public BuyEvent(ProductButtonBuy btn[],JTextArea jta,JLabel jlTotal,JButton jbBuy,DataBus dataBus) {
		this.btn = btn;
		this.jta = jta;
		this.jlTotal = jlTotal;
		this.jbBuy = jbBuy;
		this.dataBus = dataBus;
		pdtList = new ProductList();
		accList = new AccountList();
		
	}

	public void actionPerformed(ActionEvent e) {
		String actionCommand = e.getActionCommand();
		String indexDelet;
		if(e.getSource() instanceof ProductButtonBuy) {
			for(int i = 0; i < 12; i++) {
				if(String.valueOf(i).equals(actionCommand)) {
					//AGREGA PRODUCTO A LA LISTA
					p = new Product(btn[i].nameProduct,btn[i].price,1);
					//VALIDA SI LA LISTA ESTA VACIA
					if(!pdtList.getList().isEmpty()) {
						//BUSCA EN LA LISTA
						pdtList.searcher(p);
						if(!pdtList.getExists()) {
							//SI NO EXISTE LO AGREGA Y HABILITA EL BORRAR
							pdtList.insert(p);
							btn[i].quit.setEnabled(true);
						}
					}else {//AGREGA EL PRIMER PRODUCTO
						pdtList.insert(p);
						btn[i].quit.setEnabled(true);
						jbBuy.setEnabled(true);
					}
					break;
				}
			}
			
		}else {
			//QUITAR PRODUCTO
			for(int i = 0; i < 12; i++) {
				indexDelet = "delet"+i;
				if(indexDelet.equals(actionCommand)) {
					deletProduct(i);
					pdtList.deletNode();
				}
			}
			
		}
		//QUITAR TODOS LOS PRODUCTOS
		if("Quitar Todo".equals(actionCommand)) {
			cleanFacture();
		}else if("BUY".equals(actionCommand)) {
			//CONFIRMAR COMPRA
			confirm();
		}
		//MOSTRAR LOS PRODUCTOS EN PANTALLA
		pdtList.display(jta);
		pdtList.total(jlTotal);
	}
	/**
	 * Metodo para comprar producto.
	 */
	public void buyProducts() {
		accList.readFile();
		//System.out.println(dataBus.getIndex());
		int x = dataBus.getIndex();//OBTENIENDO LA POSICION DEL USUARIO EN LA LISTA
		if(accList.getList().get(x).withdraw(pdtList.getTotal())) {
			//System.out.println("Compra satisfactoria");
			done();//COMPRA REALIZADA
		}else {
			//System.out.println("Monto insufuciente");
			noMoney();//COMPRA FALLIDA
		}
		accList.writeIFile();//ESCRIBE EN EL ARCHIVO
		showPanel(dataBus.main);//REGRESAR AL MAIN
		cleanFacture();//LIMPIAR 
		if(dataBus.resetFacture)cleanFacture();
	}
	/**
	 * Metodo para borrar producto.
	 * @param x. Parametro para asignar la posicion del producto en la lista.
	 */
	public void deletProduct(int x) {
		for(int i = 0; i < pdtList.getList().size(); i++) {
			if(btn[x].nameProduct.equals(pdtList.getList().get(i).name)) {
				pdtList.getList().get(i).subtract();
				if(pdtList.getList().get(i).amount==0) {
					btn[x].quit.setEnabled(false);
				}
			}
		}
	}
	/**
	 * Metodo para Habilitar boton de borrar un producto.
	 * @param x. Parametro para asignar la posicion del boton en el arreglo 
	 */
	public void enableDelet(int x) {
		for(int i = 0; i < pdtList.getList().size(); i++) {
			if(pdtList.getList().get(i).amount > 0) {
				btn[x].setEnabled(true);
			}
		}
	}
	/**
	 * Metodo para limpiar factura.
	 */
	public void cleanFacture() {
		jta.setText("");
		pdtList.deletList();
		jbBuy.setEnabled(false);
		for(int i = 0; i < 12; i++)btn[i].quit.setEnabled(false);
	}
	/**
	 * Metodo para volver al panel INICIO.
	 * @param p1. Parametro para asignar el panel a mostrar. 
	 */
	public void showPanel(JPanel p1){
		dataBus.content.setLayout(null);
		p1.setBounds(0, 0, 1050, 400);
		dataBus.content.removeAll();
		dataBus.content.add(p1);
		dataBus.content.revalidate();
		dataBus.content.repaint();
	}
	/**
	 * Metodo para confirmar compra.
	 */
	public void confirm() {
		String buttons[]= {"Confirmar","Cancelar"};
		int op = JOptionPane.showOptionDialog(null,"Confirmar la compra por B/."+Math.round(pdtList.getTotal()*100.0)/100.0, "Confirmar compra", 0,0,new Imagens("carrito.png",40,40).imagen(), buttons, this);
		if(op == JOptionPane.YES_OPTION) {
			buyProducts();
		}
		/*else if (op == JOptionPane.NO_OPTION) {
			//System.out.println("Cuenta abierta");
		}*/
	}
	/**
	 * Metodo para alerta de fondos insufucientes.
	 */
	public void noMoney() {
		String []ok={"ok"};
		JOptionPane.showOptionDialog(null,"No cuenta con el monto necesario para la compra de B/."+pdtList.getTotal(), "Fondos insuficiente", 0,
										JOptionPane.PLAIN_MESSAGE,new Imagens("sin-dinero.png",40,40).imagen(), ok, this);
	}
	/**
	 * Metodo para mensaje de compra realizada.
	 */
	public void done() {
		String []done={"Listo"};
		JOptionPane.showOptionDialog(null,"La compra se ha hecho satisfactoriamente", "Compra Realizada", 0,
										JOptionPane.PLAIN_MESSAGE,new Imagens("comprobado.png",40,40).imagen(), done, this);
	}
}
