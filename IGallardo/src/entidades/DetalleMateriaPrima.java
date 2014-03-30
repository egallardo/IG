package entidades;

public class DetalleMateriaPrima {
	private int idDetMatPrima;
	private int idMateriaPrima;
	private String MateriaPrima;
	private String Descripcion;
	private int CantidadQuedan;
	
	public DetalleMateriaPrima(){
	}

	public DetalleMateriaPrima(int idDetMatPrima, int idMateriaPrima,
			String materiaPrima, String descripcion, int cantidadQuedan) {

		this.idDetMatPrima = idDetMatPrima;
		this.idMateriaPrima = idMateriaPrima;
		this.MateriaPrima = materiaPrima;
		this.Descripcion = descripcion;
		this.CantidadQuedan = cantidadQuedan;
	}

	public int getIdDetMatPrima() {
		return idDetMatPrima;
	}

	public void setIdDetMatPrima(int idDetMatPrima) {
		this.idDetMatPrima = idDetMatPrima;
	}

	public int getIdMateriaPrima() {
		return idMateriaPrima;
	}

	public void setIdMateriaPrima(int idMateriaPrima) {
		this.idMateriaPrima = idMateriaPrima;
	}

	public String getMateriaPrima() {
		return MateriaPrima;
	}

	public void setMateriaPrima(String materiaPrima) {
		MateriaPrima = materiaPrima;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	public int getCantidadQuedan() {
		return CantidadQuedan;
	}

	public void setCantidadQuedan(int cantidadQuedan) {
		CantidadQuedan = cantidadQuedan;
	}
	
	
	
	
}
