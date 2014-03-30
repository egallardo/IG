package entidades;

public class PedidoDetalle {
	private int idPedido;
	private int idProducto;
	private String descripcion;
	private int cantidad;
	private double precio;
	
	public PedidoDetalle(){
	}
	
	public PedidoDetalle(int idPedido, int idProducto, String descripcion, int cantidad, double precio){
		this.idPedido = idPedido;
		this.idProducto = idProducto;
		this.descripcion = descripcion;
		this.cantidad = cantidad;
		this.precio = precio;
	}

	public int getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}

	public int getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
	
}
