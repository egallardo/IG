package entidades;

public class Factura {
	private int idPedido;
	private String cliente;
	
	public Factura(){
	}
	
	public Factura(int idPedido, String cliente){
		this.idPedido = idPedido;
		this.cliente = cliente;
	}

	public int getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	
}
