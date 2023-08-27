package com.bean;

import java.util.Collections;
import java.util.Set;

public class CollectionsEmptySet {

	public static void main(String[] args) {
		
		/*
		 * Collections.emptyList(), the Collections class in Java also provides an emptySet() method to obtain an immutable empty set
		 */
		Set<String> emptySet = Collections.emptySet();

	        System.out.println("Empty Set: " + emptySet);
	        System.out.println("Size of Empty Set: " + emptySet.size());
	}
/*
* we use Collections.emptySet() to obtain an immutable empty set. Just like with the empty list example,
* attempting to add elements to this set will result in an UnsupportedOperationException since the set is designed to be read-only.

*This method is useful in scenarios where you need to pass an empty set to methods, return an empty set from methods,
*or assign an empty set to a variable without creating a new instance each time.
*/
}
