package JavaHashSet;

import java.util.HashSet;

public class EvenNumberHashSetExUsingUsingUnionofSets {

	public static void main(String[] args) {

		HashSet<Integer> evenNumbers = new HashSet<>();
        evenNumbers.add(2);
        evenNumbers.add(4);
        System.out.println("HashSet1: " + evenNumbers);

        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(3);
        System.out.println("HashSet2: " + numbers);

        // Union of two set Using addAll method
        numbers.addAll(evenNumbers);
        System.out.println("Union is: " + numbers);
	}

}
