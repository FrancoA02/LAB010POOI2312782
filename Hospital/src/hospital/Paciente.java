package hospital;

public class Paciente {
    private int dni;
    private String nombre;
    private String apellido;
    private String direccion;
    private double peso;
    private double temperatura;
   
    
    public Paciente (int dni,String nombre,String apellido, String direccion, double peso, double temperatura) {
		this.dni = dni;
		this.nombre = nombre;
                this.apellido = apellido;
                this.direccion = direccion;
		this.peso = peso;
		this.temperatura = temperatura;
    }
    
    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
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

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }
   
    @Override
    	public String toString() {
		return 
				"\nNumero de dni: " + dni +
				"\nNombre: " + nombre + 
                                "\nApellido: " + apellido +
				"\nDireccion: " + direccion + 
				"\nPeso: " + peso +" Kg"+
				"\nTemperatura: " + temperatura +" C"+
                                "\n---------------------------";
	}
}
