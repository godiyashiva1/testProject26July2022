package JavaPackage;

import java.util.Hashtable;

public class HashTable1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtable<Integer,String> ht = new Hashtable<Integer,String>();
		ht.put(1, "Mon");
		ht.put(2, "Tus");
		ht.put(3, "Wed");
		
		System.out.println(ht.get(1));
		System.out.println(ht.get(2));
		System.out.println(ht.get(3));
	}

}
