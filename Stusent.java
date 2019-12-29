package com.custome.in;

public class Stusent {
int id;
String name;
public Stusent(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + id;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
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
	Stusent other = (Stusent) obj;
	if (id != other.id)
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	return true;
}

@Override
public String toString() {
	return   id +" "+ name ;
}

static void print(){
	Stusent s1=new Stusent(10, "jonh");
CustomeArrayList<Stusent> cs=new CustomeArrayList<>();
cs.addNew(s1);
cs.addNew(new Stusent(20, "Rohn"));
cs.addNew(new Stusent(22, "shon"));
cs.addNew(new Stusent(23, "aain"));
cs.addNew(new Stusent(44, "mohn"));
cs.addNew(new Stusent(20, "dohn"));
System.out.println(cs.isEmptycol());
//System.out.println(cs.removeElement(s1));
System.out.println(cs.getElament(2));
System.out.println(cs);
System.out.println(cs.size());

CustomeArrayList<Integer> csi=new CustomeArrayList<>();
csi.addNew(10);
csi.addNew(22);
csi.addNew(11);
csi.addNew(12);
csi.addNew(15);
csi.addNew(10);
System.out.println(csi);
System.out.println(csi.size());

}
public static void main(String[] args) {
	print();
}
	
	
}
