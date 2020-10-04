import java.io.*;
import java.util.*;

public class arraylist
{
	double full_1by4 = 0.25;
	double full_3by4 = 0.75;
	int arrayLength = 4;
	static int a;
	int remove;
	int top = 0;
	static double length;
	static int arr[];
	
	public arraylist()
	{
		arr = new int[arrayLength];
	}
	public static void main(String[] args) {
		arraylist obj = new arraylist();
		obj.add(9);
		obj.add(7);
		obj.add(3);
		obj.add(2);
		obj.pop();
		obj.resize();
		assert(obj.toString()=="8");
		System.out.println(" ");
		System.out.println("Number of element in new array is:  " +a);
		assert(obj.size()==8);
		System.out.println("You reach to pro level bro..");
	}
	//adding the number in arr
	public void add(int e)
	{
		arr[top] = e;
		top++;
	}
	//pop or deleting the number from array
	public void pop()
	{
		top--;
		remove = arr[top];
		arr[top] = 0;
		int count = 0;
		for(int x = 0; x < arr[x]; x++) {
			count++;
		}
		a = count;
		length = (double)a/arrayLength;
		System.out.println("Element removed is: " +remove);
	}
	//resize the array, when 3/4 and 1/4 size
	public void resize()
	{
		if(length == full_1by4 ) {
			int newArray[] = new int[(arrayLength/2)*2];
			for(int x = 0; x < arr.length; x++) {
				newArray[x] = arr[x];
			}
			arr = newArray;
			arrayLength = arrayLength/2;
			for(int n : newArray) {
				System.out.print(n + " ");
				}	
		}
		else if(length == full_3by4) {
			int newArray[] = new int[arrayLength*2];
			for(int i = 0; i < arr.length; i++) {
				newArray[i] = arr[i];
			}
			arrayLength = arrayLength * 2;
			arr = newArray;
			for(int j : newArray) {
			System.out.print(j + " ");
			}
			//System.out.println();
		}
		else {
			System.out.println("ArrayIndexOutOfBoundRange");
		}
	}
	//resize the cap
	public int size()
	{
		return arrayLength;
	}
	//return cap in string form
	public String toString()
	{
		String s = Arrays.toString(arr);
		return s;
	}
}