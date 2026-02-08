package Javaforbegginers.tabelline;

public class MultiplicationTableRunner {

	public static void main(String[] args) {
		MultiplicationTable table = new MultiplicationTable();
		table.print();
		// se non inserisco niente mi stampa tabellina del 5.
		// se metto un altro parametro mi crea la tabellina del parametro scelto.
		// es. table.print(9);
		// se metto 3 parametri mi crea la tabellina del primo parametro scelto,
		// iniziando dal secondo parametro scelto e finendo con il terzo parametro
		// es. table.print(9,20,30);
		// scelto.
	}

}