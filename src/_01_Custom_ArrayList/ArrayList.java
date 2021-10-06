package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList <T>{
	T[] data;
	public ArrayList() {
		data = (T[]) new Object[0];
	}
	
	public T get(int loc) throws IndexOutOfBoundsException {
		if(loc>=data.length || loc<0) {
			throw new IndexOutOfBoundsException();
		}
		return data[loc];
	}
	
	public void add(T val) {
		T[] temp = (T[]) new Object[data.length+1];
		for(int i = 0; i<data.length; i++){
			temp[i] = data[i];
		}
		temp[temp.length-1] = val;
		data = temp;
	}
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		T[] temp = (T[]) new Object[data.length+1];
		int index = 0;
		for(int i = 0; i<temp.length; i++) {
			if(i==loc) {
				temp[i] = val;
			}
			else {
				temp[i] = data[index];
				index++;
			}
		}
		data = temp;
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {
		data[loc] = val;
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		if(loc>=data.length || loc<0) {
			throw new IndexOutOfBoundsException();
		}
		T[] temp = (T[]) new Object[data.length-1];
		int index = 0;
		for (int i = 0; i < data.length; i++) {
			if(!(i==loc)) {
				temp[index]=data[i];
				index++;
			}
		}
		data = temp;
	}
	
	public boolean contains(T val) {
		for(int i = 0; i<data.length; i++) {
			if(data[i].equals(val)) {
				return true;
			}
		}
		return false;
	}

	public int size() {
		// TODO Auto-generated method stub
		return data.length;
	}
}