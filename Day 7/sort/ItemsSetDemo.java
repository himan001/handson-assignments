package com.hsbc.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ItemsSetDemo {

	public class SortItemByNameAssending implements Comparator<Item>{

		@Override
		public int compare(Item o1, Item o2) {
			// TODO Auto-generated method stub
			return o1.getName().compareTo(o2.getName());
		}
		
	}
	public class SortItemByNameDescending implements Comparator<Item>{

		@Override
		public int compare(Item o1, Item o2) {
			// TODO Auto-generated method stub
			return o2.getName().compareTo(o1.getName());
		}
		
	}
	
	public class SortItemByPriceAssending implements Comparator<Item>{

		@Override
		public int compare(Item o1, Item o2) {
			// TODO Auto-generated method stub
			if(o1.getPrice()<o2.getPrice())
				return -1;
			if(o1.getPrice()>o2.getPrice())
				return 1;
			return 0;
		}
		
	}
	public class SortItemByPriceDescending implements Comparator<Item>{

		@Override
		public int compare(Item o1, Item o2) {
			// TODO Auto-generated method stub
			if(o1.getPrice()<o2.getPrice())
				return 1;
			if(o1.getPrice()>o2.getPrice())
				return -1;
			return 0;
		}
		
	}
	public class SortItemByRatingAssending implements Comparator<Item>{

		@Override
		public int compare(Item o1, Item o2) {
			// TODO Auto-generated method stub
			
			if(o1.getRatings()<o2.getRatings())
				return -1;
			if(o1.getRatings()>o2.getRatings())
				return 1;
			return 0;
		}
		
	}
	public class SortItemByRatingDescending implements Comparator<Item>{

		@Override
		public int compare(Item o1, Item o2) {
			// TODO Auto-generated method stub
			if(o1.getRatings()<o2.getRatings())
				return 1;
			if(o1.getRatings()>o2.getRatings())
				return -1;
			return 0;		}
		
	}
	public static void main(String[] args) {
		List<Item> items = new ArrayList<Item>();
		items.add(new Item(1, "Phone", 30000, 4.2));
		items.add(new Item(2, "Laptop", 40000, 4.1));
		items.add(new Item(3, "TV", 20000, 4.3));
		items.add(new Item(4, "Ipad", 50000, 4.4));

		Collections.sort(items);
		System.out.println("===================================");
		for(Item item : items) {
			System.out.println(item);
		}
		
		ItemsSetDemo itemsSet = new ItemsSetDemo();
		
		Collections.sort(items, itemsSet.new SortItemByNameAssending());
		
		System.out.println("===================================");
		for(Item item : items) {
			System.out.println(item);
		}
		Collections.sort(items, itemsSet.new SortItemByNameDescending());
		System.out.println("===================================");
		for(Item item : items) {
			System.out.println(item);
		}
		Collections.sort(items, itemsSet.new SortItemByPriceAssending());
		System.out.println("===================================");
		for(Item item : items) {
			System.out.println(item);
		}
		Collections.sort(items, itemsSet.new SortItemByPriceDescending());
		System.out.println("===================================");
		for(Item item : items) {
			System.out.println(item);
		}
		Collections.sort(items, itemsSet.new SortItemByRatingAssending());
		System.out.println("===================================");
		for(Item item : items) {
			System.out.println(item);
		}
		Collections.sort(items, itemsSet.new SortItemByRatingDescending());
		System.out.println("===================================");
		for(Item item : items) {
			System.out.println(item);
		}
		
	}

}
