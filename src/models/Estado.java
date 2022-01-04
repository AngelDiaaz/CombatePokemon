package models;

public class Estado {
	
	//Propiedades
	private String estado;
	

	//Constructores
	public Estado(String estado) {
		super();
		this.estado = estado;
	}
	
	
	//Getters y setters
	public String getEstado(Estado Estado) {
		String estado = "sin efecto";
		
		switch (Estado.estado.toLowerCase()) {
		case "confuso":
			estado = "confuso";
			break;
		case "maldito":
			estado = "maldito";
			break;
		case "enamorado":
			estado = "enamorado";
			break;
		case "atrapado":
			estado = "atrapado";
			break;
		case "drenado":
			estado = "drenado";
			break;
		case "canto mortal":
			estado = "canto mortal";
			break;
		case "paralizado":
			estado = "paralizado";
			break;
		case "envenenado":
			estado = "envenenado";
			break;
		case "gravemente envenenado":
			estado = "gravemente envenenado";
			break;
		case "congelado":
			estado = "congelado";
			break;
		case "dormido":
			estado = "dormido";
			break;
		case "quemado":
			estado = "quemado";
			break;
		}
		return estado;
	}
	
	
}
	

