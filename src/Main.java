
public class Main {

	public static void main(String[] args) {
		Gato tom = new Gato(20.0);
		Raton jerry = new Raton(5.0 , 10.0, "jerry");
		Raton jerry2 = new Raton(5.0 , 10.0, "jerry2");
		Raton jerry3 = new Raton(5.0 , 10.0, "jerry3");
		tom.comerRaton(jerry);
		tom.comerRaton(jerry2);
		tom.comerRaton(jerry3);
		//System.out.println(tom.ratonesComidos);
		tom.mostrarRatones();

	}

}
