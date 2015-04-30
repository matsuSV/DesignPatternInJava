package facade.runner;

import facade.facader.Librarian;

public class Executor {

	public static void main(String[] args) {

		String targetBook = "jojo";

		Librarian iincho = new Librarian();
		switch( iincho.searchBooks(targetBook) ) {
			case 0:
				System.out.println("( ˘•ω•˘ )");
				break;
			case 1:
				System.out.println("(´-ω-`)");
				break;
			case 2:
				System.out.println("(｀・ω・´)");
				break;
			default :
		}
	}
}
