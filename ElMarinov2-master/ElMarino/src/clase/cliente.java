package clase;

public class cliente {
	private String  Idcliente;
	private String nombre;
	private String apellido;
	private String direccion;
	private String correo;
	private String telefono;
	private String contraseña;
	public cliente(String idcliente, String nombre, String apellido, String direccion, String correo, String telefono,
			String contraseña) {
	
		Idcliente = idcliente;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.correo = correo;
		this.telefono = telefono;
		this.contraseña = contraseña;
	}
	public String getIdcliente() {
		return Idcliente;
	}
	public void setIdcliente(String idcliente) {
		Idcliente = idcliente;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	
	
	
}
