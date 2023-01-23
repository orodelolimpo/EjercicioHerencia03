package ClasesEmpresa;

public class Comercial extends Empleado {

	
//	
	private int numVentas;
	private static double importeVenta=45.90;
	
	
//	• Un constructor sin parámetros que establezca el numero de ventas 
//	en 0
	public Comercial() {
		super();
		this.numVentas=0;
		
	}


	
//	• Otro constructor que establezca todos los atributos, incluidos los 
//	heredados de la superclase.
	

	public Comercial(String nombre, String apellido, int edad, double salario, int antiguedad, int numVentas) {
		super(nombre, apellido, edad, salario, antiguedad);
		this.numVentas = numVentas;//debería ponerse a 0 por lógica si comienza por primera vez estará en 0
	}


//	• Sobrescribe el método toString para mostrar por pantalla los datos 
//	de un Comercial.
	
	
	@Override
	public String toString() {
		return "Comercial [numVentas=" + numVentas + ", getNombre()=" + getNombre() + ", getApellido()=" + getApellido()
				+ ", getEdad()=" + getEdad() + ", getSalario()=" + getSalario() + ", getAntiguedad()=" + getAntiguedad()
				+ ", calculaTrienios()=" + calculaTrienios() + ", calculaSalario()=" + calculaSalario() + "]";
	}

	public void contabilizaVentas(int ventasDia) {
	
		int numeroVentas =0;
		
		if (numeroVentas<=7) {
			numeroVentas=ventasDia;
		}else if (numeroVentas>7) {
			numeroVentas=7;
		}
		
		this.numVentas=this.numVentas+numeroVentas;
		
		if (this.numVentas >25) {
			this.numVentas=25;
		
		}
	}
	//• Añade el método reseteaContadorVentas que coloca el contador de 
	//ventas a 0.	
	public void reseteaContadorVentas () {
		this.numVentas=0;
		
	}
//	
//	• Sobrescribe el método calculaSalario para que además del salario 
//	calculado se le añada la cantidad ganada en comisiones
	public double calculaSalario() {
		return super.calculaSalario()+this.numVentas*importeVenta;
	}
	
	
}