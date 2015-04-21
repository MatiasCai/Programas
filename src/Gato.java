import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
// importamos las librerias para poder usar list y arraylist. Lo de iterator no lo terminamos usando.

public class Gato {
	
	Double energia;
	List <Raton> ratonesComidos = new ArrayList<Raton> ();
		
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
			this.ratonesComidos.add(raton);
			System.out.println("Me comi un raton."+raton.nombre);
		} else {
			System.out.println("No tengo energía suficiente.");
		}				
	
		
//	Iterator<String> iteratorRatones = this.ratonesComidos.iterator();
//	while(iteratorRatones.hasNext()){
//		String elemento = iteratorRatones.next();
//		System.out.print(elemento+" / ");
	}
	
	public void mostrarRatones(){
		System.out.println("Ratones comidos:");
		for (Raton raton : ratonesComidos) {
			System.out.println(raton.nombre);
		}
	}
	
		
}

	
	

