package mypackage;
import java.util.Vector;
/**
* author thierry noumessi
*/
public class IntSet_sub_fixed extends Intset_fixed{
public  IntSet_sub_fixed(){
super(); }
@SuppressWarnings("unchecked")
@Override  public IntSet_sub_fixed clone(){
Intset_fixed s=new IntSet_sub_fixed();
s.els=(Vector<Integer>) els.clone();
return  (IntSet_sub_fixed) s; 
}
}