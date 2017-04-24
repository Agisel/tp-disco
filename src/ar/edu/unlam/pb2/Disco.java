package ar.edu.unlam.pb2;

public class Disco {
	//atributos
	private Double radioInterior;
	private Double radioExterior;
	
	//constructor, que es lo que se va a cambiar en el test, y pide que se pueda cambiar el radio int y ext
	public Disco(Double radioInterior,Double radioExterior){
	this.radioInterior= radioInterior;
	this.radioExterior= radioExterior;
	}
	
	//metodos
	

	public Double calculaPerimetroInterior(){
		Double perimetroInterior;
		perimetroInterior= 2*Math.PI*radioInterior;
		return perimetroInterior;
	}
	
	public Double calculaPerimetroExterior(){
		Double perimetroExterior;
		perimetroExterior= 2*Math.PI*radioExterior;
		return perimetroExterior;
	}
	
	public Double calcularSuperficie(){
		Double superficie; 
		superficie = Math.PI*Math.pow(radioExterior, 2.0);
		return superficie;
	}
	
}



