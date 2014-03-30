package entidades;

import java.sql.Date;

public class Pedido {
	private int idPedido;
	private Date fecha;
	private String referencia;
	private Date fechaFactura;
	private int idCliente;

	public Pedido(){
	}
	
	public Pedido(int idPedido, Date fecha, String referencia, Date fechaFactura, int idCliente){
		this.idPedido = idPedido;
		this.fecha = fecha;
		this.referencia = referencia;
		this.fechaFactura = fechaFactura;
		this.idCliente = idCliente;
	}

	public int getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public Date getFechaFactura() {
		return fechaFactura;
	}

	public void setFechaFactura(Date fechaFactura) {
		this.fechaFactura = fechaFactura;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	
	
}
