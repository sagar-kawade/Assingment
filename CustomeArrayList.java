package com.custome.in;

import java.util.Arrays;

public class CustomeArrayList<E>{
	private Object[] data;
	private int size;
	public CustomeArrayList(){
		this(10);
	}
	public CustomeArrayList(int initialCpacity){
		if(initialCpacity>0)
			this.data=new Object[initialCpacity];
		else if(initialCpacity==0){
			this.data=new Object[10];			
		}
		else
			throw new IllegalArgumentException("illegal capacity ; "+initialCpacity);	
	}
	private void ensureCapacity() {
		if(data.length<=size){
			int oldCapacity=data.length;
			int newCapacity=(oldCapacity=3)/2+1;
			data=Arrays.copyOf(data, newCapacity);
		}
	}
public boolean addNew(E e){
	ensureCapacity();
	data[size++]=e;
	return true;	
}
public E getElament(int index){
	if(index >= size)
		throw new ArrayIndexOutOfBoundsException(index);
	return (E)data[index];
	
}
private int indexOf(Object o){
if (o == null) {
    for (int i = 0; i < size; i++)
        if (data[i]==null)
            return i;
} else {
    for (int i = 0; i < size; i++)
        if (o.equals(data[i]))
            return i;
}
return -1;
}
@Override
public String toString() {
	return   Arrays.toString(data)  ;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + Arrays.hashCode(data);
	result = prime * result + size;
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	CustomeArrayList other = (CustomeArrayList) obj;
	if (!Arrays.equals(data, other.data))
		return false;
	if (size != other.size)
		return false;
	return true;
}
public boolean removeElement(E obj)
{
	int i=indexOf(obj);
	if(i>= 0){
		removeElement(obj);
		return true;
	}
return false;
}
public boolean isEmptycol(){
	return 	size==0;

}
public int size() {
    return size;
}

}
