package entidades;

import java.sql.Date;

public class MateriaPrima {
	private int idMateriaPrima;
	private int idPersonal;
	private Date fechaEntrada;
	private int cantidadEntrada;
	private String descripcion;
	private Date fechaSalida;
	private int cantidadSalida;
	private String notas;

	public MateriaPrima(){
	}
	
	public MateriaPrima(int idMateriaPrima, int idPersonal, Date fechaEntrada, int cantidadEntrada, String descripcion, Date fechaSalida, int cantidadSalida, String notas){
		this.idMateriaPrima = idMateriaPrima;
		this.idPersonal = idPersonal;
		this.fechaEntrada = fechaEntrada;
		this.cantidadEntrada = cantidadEntrada;
		this.descripcion = descripcion;
		this.fechaSalida = fechaSalida;
		this.cantidadSalida = cantidadSalida;
		this.notas = notas;
	}

	public int getIdMateriaPrima() {
		return idMateriaPrima;
	}

	public void setIdMateriaPrima(int idMateriaPrima) {
		this.idMateriaPrima = idMateriaPrima;
	}

	public int getIdPersonal() {
		return idPersonal;
	}

	public void setIdPersonal(int idPersonal) {
		this.idPersonal = idPersonal;
	}

	public Date getFechaEntrada() {
		return fechaEntrada;
	}

	public void setFechaEntrada(Date fechaEntrada) {
		this.fechaEntrada = fechaEntrada;
	}

	public int getCantidadEntrada() {
		return cantidadEntrada;
	}

	public void setCantidadEntrada(int cantidadEntrada) {
		this.cantidadEntrada = cantidadEntrada;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getFechaSalida() {
		return fechaSalida;
	}

	public void setFechaSalida(Date fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	public int getCantidadSalida() {
		return cantidadSalida;
	}

	public void setCantidadSalida(int cantidadSalida) {
		this.cantidadSalida = cantidadSalida;
	}

	public String getNotas() {
		return notas;
	}

	public void setNotas(String notas) {
		this.notas = notas;
	}
	
}
