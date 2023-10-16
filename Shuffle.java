package demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Shuffle {
	public static void main(String[] args) {
		List<Integer> hs=new ArrayList<>();
		hs.add(1);
		hs.add(2);
		hs.add(3);
		hs.add(4);
		hs.add(5);
		hs.add(6);
		hs.add(7);
		
		Collections.shuffle(hs);
		Integer[] shufArray=hs.toArray(new Integer[hs.size()]);
		for(int i:shufArray)
		System.out.print(i +" ");
	}

}
