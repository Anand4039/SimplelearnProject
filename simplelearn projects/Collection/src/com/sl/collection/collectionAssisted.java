package com.sl.collection;
import java.util.*;
public class collectionAssisted {
	public static void main(String[] args) {
		//creating arraylist
		System.out.println("ArrayList");
		ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
		list.add("Ravi");//Adding object in arraylist  
		list.add("Vijay");  
		list.add("Ravi");  
		list.add("Ajay");  
		//Traversing list through Iterator  
		Iterator itr=list.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		
		//creating vector
	      System.out.println("\n");
	      System.out.println("Vector");
	      Vector<String> v=new Vector<String>();  
	      v.add("Ayush");  
	      v.add("Amit");  
	      v.add("Ashish");  
	      v.add("Garima");  
	      Iterator<String> itr1=v.iterator();  
	      while(itr1.hasNext()){  
	      System.out.println(itr1.next());  
	      }  
		
		//creating linkedlist
	      System.out.println("\n");
	      System.out.println("LinkedList");
	      LinkedList<String> al=new LinkedList<String>();  
	      al.add("Ra");  
	      al.add("Vi");  
	      al.add("Ra");  
	      al.add("Aj");  
	      Iterator<String> itr2=al.iterator();  
	      while(itr.hasNext()){  
	      System.out.println(itr2.next());  
	      }  
	       
	       //creating hashset
	       System.out.println("\n");
	       System.out.println("HashSet");
	       HashSet<String> set=new HashSet<String>();  
	       set.add("Ravi");  
	       set.add("Vijay");  
	       set.add("Ravi");  
	       set.add("Ajay");  
	       //Traversing elements  
	       Iterator<String> itr3=set.iterator();  
	       while(itr.hasNext()){  
	       System.out.println(itr3.next());  
	       }  
	       
	       //creating linkedhashset
	       System.out.println("\n");
	       System.out.println("LinkedHashSet");
	       LinkedHashSet<String> set1=new LinkedHashSet<String>();  
	       set1.add("Ravi");  
	       set1.add("Vijay");  
	       set1.add("Ravi");  
	       set1.add("Ajay");  
	       Iterator<String> itr4=set1.iterator();  
	       while(itr.hasNext()){  
	       System.out.println(itr4.next());  
	       }  
	      	} 
	      }  


