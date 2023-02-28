package com.javaprogramto.collections.set.add;// Java program to fix java.lang.ClassCastException
// in TreeSet using Comparator

import java.util.Comparator;
import java.util.TreeSet;

class friendsMarks {
	// class field
	String name;
	String nickName;
	int marks;

	// parameterised constructor
	public friendsMarks(String name, String nickName,
						int marks)
	{
		this.name = name;
		this.nickName = nickName;
		this.marks = marks;
	}

	// getter for name
	public String getName() { return name; }

	// setter for name
	public void setName(String name) { this.name = name; }

	// getter for marks
	public int getMarks() { return marks; }

	// setter for marks
	public void setMarks(int marks) { this.marks = marks; }

	// getter for nickname
	public String getNickName() { return nickName; }

	// setter for nickname
	public void setNickName(String nickName)
	{
		this.nickName = nickName;
	}

	//@Override toString method
	public String toString()
	{
		return "friendsMarks{"
			+ "name='" + name + '\'' + ", nickName='"
			+ nickName + '\'' + ", marks=" + marks + '}';
	}
}

// for comparing names
class nameCompare implements Comparator<friendsMarks> {

	@Override
	public int compare(friendsMarks friend1,
					friendsMarks friend2)
	{
		return friend1.getName().compareTo(
			friend2.getName());
	}
}

// for comparing marks
class marksCompare implements Comparator<friendsMarks> {

	@Override
	public int compare(friendsMarks f1, friendsMarks f2)
	{
		if (f1.getMarks() > f2.getMarks()) {
			return 1;
		}
		else {
			return -1;
		}
	}
}

// for comparing nick name
class nickNameCompare implements Comparator<friendsMarks> {

	@Override
	public int compare(friendsMarks obj1, friendsMarks obj2)
	{
		return obj1.getNickName().compareTo(
			obj2.getNickName());
	}
}
public class TreeSetCustomObjectComparator {

	public static void main(String[] args)
	{

		// Creating TreeSet
		// and we have to pass Comparator object
		// of marksCompare class
		// in the TreeSet constructor
		// so that we can sort according to the marks
		TreeSet<friendsMarks> treeSet
			= new TreeSet<>(new marksCompare());

		// adding elements to TreeSet
		treeSet.add(new friendsMarks("Raushan", "Chamgader", 99));
		treeSet.add(new friendsMarks("Yashdeep", "Dopa", 95));
		treeSet.add(new friendsMarks("Rupesh", "Gian", 92));
		treeSet.add(new friendsMarks("Shivam", "Gorilla", 47));
		treeSet.add(new friendsMarks("Sarthak", "Nagin", 78));
		treeSet.add(new friendsMarks("Sonika", "Chipkali", 67));
		treeSet.add(new friendsMarks("Himanshu", "Lalten", 57));

		System.out.println("Sorting on the basis of marks");

		// Displaying using loop
		for (friendsMarks tree : treeSet)
			System.out.println(tree);

		// Creating TreeSet
		// and we have to pass Comparator object
		// of nameCompare class
		// in the TreeSet constructor
		// so that we can sort according to the name
		TreeSet<friendsMarks> treeSet1
			= new TreeSet<>(new nameCompare());

		// adding elements to TreeSet
		treeSet1.add(new friendsMarks("Raushan", "Chamgader", 99));
		treeSet1.add(new friendsMarks("Yashdeep", "Dopa", 95));
		treeSet1.add(new friendsMarks("Rupesh", "Gian", 92));
		treeSet1.add(new friendsMarks("Shivam", "Gorilla", 47));
		treeSet1.add(new friendsMarks("Sarthak", "Nagin", 78));
		treeSet1.add(new friendsMarks("Sonika", "Chipkali", 67));
		treeSet1.add(new friendsMarks("Himanshu", "Lalten", 57));

		// Displaying using loop
		System.out.println("\n\nSorting on the basis of name");

		for (friendsMarks tree : treeSet1)
			System.out.println(tree);

		// Creating TreeSet
		// and we have to pass Comparator object
		// of nickNameCompare class
		// in the TreeSet constructor
		// so that we can sort according to the nickname
		TreeSet<friendsMarks> treeSet2
			= new TreeSet<>(new nickNameCompare());

		// adding elements to TreeSet
		treeSet2.add(new friendsMarks("Raushan", "Chamgader", 99));
		treeSet2.add(new friendsMarks("Yashdeep", "Dopa", 95));
		treeSet2.add(new friendsMarks("Rupesh", "Gian", 92));
		treeSet2.add(new friendsMarks("Shivam", "Gorilla", 47));
		treeSet2.add(new friendsMarks("Sarthak", "Nagin", 78));
		treeSet2.add(new friendsMarks("Sonika", "Chipkali", 67));
		treeSet2.add(new friendsMarks("Himanshu", "Lalten", 57));

		// Displaying using loop
		System.out.println("Sorting on the basis of nick-name");

		for (friendsMarks tree : treeSet2)
			System.out.println(tree);
	}
}
