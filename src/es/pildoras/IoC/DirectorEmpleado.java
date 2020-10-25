package es.pildoras.IoC;

public class DirectorEmpleado implements Empleados {

	
		// creacioón de campo tipo creacionInforme
	
	
	private CreacionInformes informeNuevo;
	
	public DirectorEmpleado(CreacionInformes informeNuevo)
	{
		this.informeNuevo=informeNuevo;
	}
	
	
	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Gestionar la plantilla de la empresa";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe creado por el Director: " + informeNuevo.getInforme();
	}


	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}
	
	private String email;
	
	private String nombreEmpresa;
	
	
}
