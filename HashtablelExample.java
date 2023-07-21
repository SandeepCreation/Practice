package com.Collection;

import java.util.Hashtable;

class Temp
{
	int i;
	public Temp(int i){
		this.i = i; 
		}
	public int hashCode()
	{
		return i;
	}
	public String toString()
	{
		return i+"";
	}
}

public class HashtablelExample {
	public static void main(String[] args) {
		Hashtable<Temp, String> ht = new Hashtable<Temp, String>(25);		
		ht.put(new Temp(5), "A");
		ht.put(new Temp(2), "B");
		ht.put(new Temp(6), "C");
		ht.put(new Temp(15), "D");
		ht.put(new Temp(23), "E");
		ht.put(new Temp(16), "F");
		System.out.println(ht);
		System.out.println(ht.size());
		
	}
}
