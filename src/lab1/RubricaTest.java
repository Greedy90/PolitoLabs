package lab1;

public class RubricaTest {

	public static void main(String[] args) {
		Rubrica addressBook = new Rubrica("Moleskine");
		
		addressBook.insertEntry("Marco", "Terrinoni", "+33 (0)7 12 34 56");
		addressBook.insertEntry();
		addressBook.insertEntry("Kick my", "Ass", "123 456 678");
		addressBook.insertEntry("Lo", "llikng", "098 765 432");
		
		System.out.println(addressBook.getName());
		System.out.println(addressBook.giveFirst());
		System.out.println(addressBook.giveAt(2));
		System.out.println(addressBook.search("Lo"));
		System.out.println(addressBook.giveList());
	}

}
