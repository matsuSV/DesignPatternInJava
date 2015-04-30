package facade.implementor;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import facade.abstractor.Library;

public class CityLibrary extends Library {

	private String[] books;

	private Map<String, Boolean> lendingList;

	public CityLibrary() {
		this.books = new String[]{  "Insect Illustrated Encyclopedia",
									"Mystery Novel",
									"Picture Book",
									"Historiography",
									"Mathematical Document" };

		this.lendingList = new HashMap<String, Boolean>();
		for (String book : books) {
			this.lendingList.put(book, false);
		}
	}

	@Override
	public boolean hasBooks(String bookname) {
		return Arrays.asList(this.books).contains(bookname);
	}

	@Override
	public boolean isLending(String bookname) {
		return this.lendingList.get(bookname);
	}
}
