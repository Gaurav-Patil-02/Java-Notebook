package PracticeQue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class AddAndDisplay {

	public static void main(String[] args) {
		//Que 1
		ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(10, 5, 26, 35,10,36,25, 14, 25, 36));
		System.out.println(list1);

		Iterator itr = list1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//Que 2
		LinkedHashSet<Integer> set = new LinkedHashSet<>(list1);
		System.out.println(set);
		
		//Que 3
		List<String> list2 = new ArrayList<>(Arrays.asList("INDIA", "SWEDEN", "NORWAY", "SCOTLAND", "DENMARK" ));
		TreeSet<String> sort = new TreeSet<>(list2);
		System.out.println(sort);
		
		//Que 4
		LinkedList<String> list =  new LinkedList<>(Arrays.asList("Mumbai","Pune","Delhi", "Dhule", "Shirpur"));
		list.addFirst("NewDelhi");
		list.addLast("Surat");
		
		//Que 5
		HashSet<Integer> set1 = new HashSet<>(Arrays.asList(10,25,6,45,36));
		System.out.println(set1);
		set1.add(25);
		System.out.println(set1);
		
		//Que 6
		ArrayList<String> names =  new ArrayList<String>(Arrays.asList("Gaurav", "Somnath", "Chetan", "Somnath"));
		HashSet<String> set3 = new HashSet<>(names);
		System.out.println(set3);
		
		//Que 7 
		TreeSet<Integer> treeSet = new TreeSet<>(Arrays.asList(10,25,36,4,63,10,23));
		System.out.println(treeSet);
		
		//Que 8
		Iterator itr1 = treeSet.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
			
		//Que 9
		ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(10,25,3,52,63,10,25,52,36));
		ArrayList<Integer> freqList = new ArrayList<>(Arrays.asList(10,25,36,14,39,25)); 
		
		System.out.println(Collections.frequency(list3, freqList));
		
		
		
	}
}
