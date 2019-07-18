package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList <T>{
private T[] t;
int size = 0;
	
	public ArrayList() {
		t= (T[])new Object[100];
		
		
	}
	
	public T get(int loc) throws IndexOutOfBoundsException {
		
		
		if(loc>=size) {
			throw new IndexOutOfBoundsException();
		}
		
		return t[loc];
	}
	
	public void add(T val) {
		t[size]=val;
		size ++;
		
	}
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		T[] t1 = (T[])new Object[t.length+1];
		if(loc>=size) {
			throw new IndexOutOfBoundsException();
		}
		for(int i = 0;i<loc;i++) {
			t1[i]=t[i];
			
		}
		t1[loc]=val;
		for(int i=loc;i<t.length;i++) {
			t1[i+1]=t[i];
		}
		t=t1;
		size ++;
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {
		t[loc]= val;
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		if(loc>=size) {
			throw new IndexOutOfBoundsException();
		}
		T[] t1 = (T[])new Object[t.length-1];
		for(int i = 0;i<loc;i++) {
			t1[i]=t[i];
			
		}
		
		for(int i=loc+1;i<t.length;i++) {
			t1[i-1]=t[i];
		}
		t =t1;
		size --;
	}
	
	public boolean contains(T val) {
		for(int i=0;i<t.length;i++) {
			if(t[i]==val) {
				return true;
			}
		}
		return false;
	}

	public int size() {
		
		
		// TODO Auto-generated method stub
		return size;
	}
}