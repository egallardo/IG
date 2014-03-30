package entidades;

public class Producto {
	private int idProducto;
	private String codigo;
	private String descripcion;
	private double precio;
	private String notas;
	
	public Producto(){
	}
	
	public Producto(int idProducto, String codigo, String descripcion, double precio, String notas){
		this.idProducto = idProducto;
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.precio = precio;
		this.notas = notas;
	}

	public int getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getNotas() {
		return notas;
	}

	public void setNotas(String notas) {
		this.notas = notas;
	}
	
	
}
