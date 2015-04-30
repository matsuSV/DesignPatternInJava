package facade.facader;

import facade.implementor.CityLibrary;

public class Librarian {

	private static final int NON_EXIST_BOOK   = 0;
	private static final int LENDING_BOOK     = 1;
	private static final int NON_LENDING_BOOK = 2;

	public int searchBooks(String bookname) {
		CityLibrary cityLibrary = new CityLibrary();
		int result = NON_EXIST_BOOK;
		if( cityLibrary.hasBooks(bookname) ) {
			if( cityLibrary.isLending(bookname) ) {
				result = LENDING_BOOK;
			} else {
				result = NON_LENDING_BOOK;
			}
		}
		return result;
	}
}
