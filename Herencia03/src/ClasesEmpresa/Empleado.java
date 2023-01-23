package ClasesEmpresa;


public class Empleado {
//	La clase empleado tiene los siguientes atributos. Colócales el modificador 
//	de acceso protected:
//	• Nombre de tipo String
//	• Apellido de tipo String
//	• Edad de tipo int
//	• Salario de tipo double
//	• Antigüedad en años de tipo int
	
	protected String nombre;
	protected String apellido;
	protected int edad;
	protected double salario;
	protected int antiguedad;
	
	
	
	//Método:  Constructor sin parámetros
	
	public Empleado() {
		super();
		this.nombre = "";
		this.apellido = "";
		this.edad = 0;
		this.salario = 0;
		this.antiguedad = 0;
	
	}
	//Método: • Constructor con los cuatro parámetros

	public Empleado(String nombre, String apellido, int edad, double salario, int antiguedad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.salario = salario;
		this.antiguedad = antiguedad;
	}
	
	
	//Método: • Constructor de copia
	
	public Empleado(Empleado i) {
		super();//si lo pongo estoy invocando a la clase objetc//se puede marcar
		this.nombre = i.nombre;
		this.apellido = i.apellido;
		this.edad = i.edad;
		this.salario = i.salario;
		this.antiguedad = i.antiguedad;
	
	}

	

	//getters y setters
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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}


	
	//• Sobreescribe el método toString

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", salario=" + salario
				+ ", antiguedad=" + antiguedad + "]";
	}
	// Métodos:
	
	public double calculaTrienios() {
		
		int numTrienios =this.antiguedad/3;
		if(numTrienios>5) {
		
			return 0.08*numTrienios*this.salario;
		}else if (numTrienios >0){
		
			return 0.05*numTrienios*this.salario;
		}
		
		return 0;
	}
	
	//• CalculaSalario. Devolverá la cantidad de salario del empleado 
    //sumándole lo que se lelva por trienios
	
	public double calculaSalario() {
		
		return this.salario+this.calculaTrienios();
		
		
	}
	
}
