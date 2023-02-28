package com.javaprogramto.collections.set.add;// Java program to fix java.lang.ClassCastException
// in TreeSet using Comparator

import java.util.Comparator;
import java.util.TreeSet;

class FriendsMarks2 implements Comparable<FriendsMarks2> {
	// class field
	String name;
	String nickName;
	Integer marks;

	// parameterised constructor
	public FriendsMarks2(String name, String nickName,
						Integer marks)
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
	public Integer getMarks() { return marks; }

	// setter for marks
	public void setMarks(Integer marks) { this.marks = marks; }

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
		return "FriendsMarks2{"
			+ "name='" + name + '\'' + ", nickName='"
			+ nickName + '\'' + ", marks=" + marks + '}';
	}

	@Override
	public int compareTo(FriendsMarks2 o) {
		return this.marks.compareTo(o.marks);
	}
}

public class TreeSetCustomObjectComparable {

	public static void main(String[] args)
	{

		// Creating TreeSet
		// and we have to pass Comparator object
		// of marksCompare class
		// in the TreeSet constructor
		// so that we can sort according to the marks
		TreeSet<FriendsMarks2> treeSet
			= new TreeSet<>();

		// adding elements to TreeSet
		treeSet.add(new FriendsMarks2("Raushan", "Chamgader", 99));
		treeSet.add(new FriendsMarks2("Yashdeep", "Dopa", 95));
		treeSet.add(new FriendsMarks2("Rupesh", "Gian", 92));
		treeSet.add(new FriendsMarks2("Shivam", "Gorilla", 47));
		treeSet.add(new FriendsMarks2("Sarthak", "Nagin", 78));
		treeSet.add(new FriendsMarks2("Sonika", "Chipkali", 67));
		treeSet.add(new FriendsMarks2("Himanshu", "Lalten", 57));

		System.out.println("Sorting on the basis of marks");

		// Displaying using loop
		for (FriendsMarks2 tree : treeSet) {
			System.out.println(tree);
		}


	}
}
