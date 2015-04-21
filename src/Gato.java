public class Gato {
	
	Double energia;
	public Gato (Double unaEnergia){
		this.energia = unaEnergia;
	}
	
	public void correr (Double distancia){
		this.energia= this.energia - 0.5 * distancia;
	}
	public boolean meConvieneComerA_queEstaA (Raton raton,Double distanciaAGato){
		return 0.5 * distanciaAGato <= this.energia;
		
	}
	public void comerRaton (Raton raton){
		if (meConvieneComerA_queEstaA (raton,raton.distanciaAGato)){
			this.correr(raton.distanciaAGato);
			this.energia = this.energia + 12.0 + raton.peso;
			System.out.println("Me comi un raton.");
		} else {
			System.out.println("No tengo energía suficiente.");
		}				
		
		
	}

	
	
}

