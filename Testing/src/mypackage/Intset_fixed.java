package mypackage;
import java.util.Vector;
/**
* author thierry noumessi
*/
public class Intset_fixed {
	
protected Vector<Integer> els; 


public  void mcdc(int a,int b){
	int x;//
	if((a==0)&&(b>a))
		x=b/ 1;	
	else
	x=b/a;
}

public  Intset_fixed(){
	
els = new Vector<Integer>(); 
}
public Intset_fixed(Intset_fixed s){
	
this.els=s.els;

} 
public void insert (int x) {
	
Integer y = new Integer(x);
//if (getIndex(y) == 0) els.add(y);
/*23*/if (getIndex(y) ==-1) els.add(y);

}
 
public void remove (int x) {
int i = getIndex(new Integer(x));
/*29*/if (i ==-1) return;
els.set(i, els.lastElement( ));
/*31*/els.remove(els.size( ) - 1); 

}
public boolean isIn (int x) {
	
return getIndex(new Integer(x)) >= 0;

}
private int getIndex (Integer x) {
	
for (int i=0;i< els.size( ); i++)
if (x.equals(els.get(i))) return i;
return -1; 
}

public int size( ){
return els.size( );
}

public int choose ( ) throws EmptyException {
if (els.size( ) <= 0) throw new EmptyException("IntSet.choose");
//if (els.size( ) < 0) throw new EmptyException("IntSet.choose");

return  (int) els.lastElement(); 
}

Intset_fixed (Vector<Integer> v) { els = v; }

public Intset_fixed clone(){
return new Intset_fixed(this); 
}

@Override
public String toString() {
return "IntSet els=" + els ;
}

@Override
public boolean equals(Object o){
	
if(!(o instanceof Intset_fixed))
return false;
Intset_fixed s=(Intset_fixed)o;
return s.els.equals(els);

}

public class EmptyException extends RuntimeException{
	
private static final long serialVersionUID = 1L;
EmptyException(String s){
super(s);
}
/*EmptyException(){
super();
  }*/
 }


}             
