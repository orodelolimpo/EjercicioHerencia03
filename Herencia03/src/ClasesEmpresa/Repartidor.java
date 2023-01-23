package ClasesEmpresa;

public class Repartidor extends Empleado  {
	protected String zona; //david ha puesto private
	protected String matricula;
	protected double KmInicioMes; 
	protected double KmFinales;
	protected double dietas;
	
	
	
	
	
	//• Constructor sin parámetros y constructor con todos los parámetros 
	//invocando a la superclase
	
	public Repartidor() {
		super();
		this.zona="";
		this.matricula="";
		this.KmFinales=0;
		this.KmInicioMes=0;
	}

//////



	public Repartidor(String nombre, String apellido, int edad, double salario, int antiguedad, String zona,
			String matricula, double kMInicioMes, double kmFinales, double dietas) {
		super(nombre, apellido, edad, salario, antiguedad);
		this.zona = zona;
		this.matricula = matricula;
		KmInicioMes = kMInicioMes;
		KmFinales = kmFinales;
		this.dietas = dietas;
	}
	
	///constructor de copia
	
	
	
	public Repartidor(Repartidor r) {
		super(r);//si no la pongo invoco al constructor vacío y si la pongo al de copia
		this.zona= r.zona;
		this.matricula= r.matricula;
		this.KmInicioMes=r.KmInicioMes;
		this.KmFinales=r.KmFinales;
		this.dietas=r.dietas;
		
		
	}

	@Override
	public String toString() {
		return "Repartidor [zona=" + zona + ", matricula=" + matricula + ", KmInicioMes=" + KmInicioMes + ", KmFinales="
				+ KmFinales + ", dietas=" + dietas + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad
				+ ", salario=" + salario + ", antiguedad=" + antiguedad + "]";
	}


//• Crea los getters y setter salvo el de dietas y kilómetros
	
	public String getZona() {
		return zona;
	}

	public void setZona(String zona) {
		this.zona = zona;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
//• Añade el método añadirDieta que se le pasa el importe de la dieta y 
//	se sumará al cómputo total, aunque la empresa sólo paga hasta un 
//	máximo de 25 euros por dieta, el resto lo debe asumir el empleado
	
	public void añadirDieta ( double dieta) {
		
		
		if (dieta <= 25) {
			this.dietas=this.dietas+dieta;
		}else {
			this.dietas=this.dietas+25; 
			
		}
	}
	
//• Añade el método actualizaKms que le pasa el nuevo valor del 
//	cuentakilómetros de la furgoneta, sólo deberá actualizarse si el dato 
//	actualizado es superior al anterior almacenado.
	
	public void actualizaKms (double kilometros) {
		if ( kilometros> this.KmFinales)
		{ this.KmFinales= kilometros;
		}
	}
	
	public void resetearKm () {
		this.KmInicioMes= this.KmFinales;
	}
//• Sobrescribe el método calculaSalario para calcular el salario del 
	
//	Repartidor, que se calcula como su salario base + los gastos que ha 
//	tenido en dietas y más 0.45*km por lo km que ha hecho en el mes. 
//	Los repartidores no disfrutan de trienios
	public double calculaSalario() {
		return this.salario+dietas+(0.45*(this.KmFinales-this.KmInicioMes));//si la variable fuese private pondríamos aqui get.this.kmFinales)
	}
}
