package mypackage;
import static org.junit.Assert.*;

import java.util.Vector;

import mypackage.Intset_fixed.EmptyException;

import org.junit.Before;
import org.junit.Test;
/*
* @author Thierry Noumessi
* 
* This class shows that the contract of using
* the clone() method is respected
* in both super and sub class
* 
*/
public class IntSet_fixedText {
private Intset_fixed is= new Intset_fixed();
private Intset_fixed isn=new IntSet_sub_fixed();
private Intset_fixed is1= new Intset_fixed();
private Intset_fixed isn2=new IntSet_sub_fixed();
@Before  // Set up - Called before every test method.
public void setUp() {
is.insert(10); 
isn.insert(15); 

}
//begin test fo the intset
@Test //Test of x.clone().equals(x) for the super intset
public void test_Inset_equals() { 
assertEquals("this test passes. According to the clone contract it should return true",true, is.clone().equals(is));
}
@Test //test of x.clone().getClass() == x.getClass()
public void test_Inset_Getclass() {
//assertEquals("this test passes. According to the clone contract it should return true",true, is.clone().getClass()==is.getClass());
}
@Test //x.clone()!=x
public void test_Inset_clone() {     
//assertEquals("the contract says that this should be false, ",true, is.clone()!=is);
}
//end test for the intset
//begin test fot the intset_sub
@Test //test of x.clone().getClass() == x.getClass()
public void test_Inset_sub_Getclass() {
//assertEquals("this test fails. According to the clone contract it should return true",true, isn.clone().getClass()==isn.getClass());
}
@Test  //Test of x.clone().equals(x). 
public void test_Inset_sub_equals() { 
//x.clone().equals(x)
assertEquals("this test passes. According to the clone contract it should return true",true, isn.clone().equals(isn));
}
@Test //x.clone()!=x
public void test_Inset_sub_clone() {   
/*assertEquals("the documentation says that should be false, ",true, 
isn.clone()!=isn); */      
}
@Test //x.choose()
public void test_Inset_empty1() {   
/*assertEquals("the documentation says that should be false, ",true, 
is.choose()==10);  */     
	is1.insert(0);
	is1.insert(0);
} 
@Test //x.choose()
public void test_Inset_empt51() {   
	
assertEquals("the documentation says that should be false, ",false, is.choose()==100);   
//is1.choose();

}
@Test (expected=EmptyException.class) //x.choose()
public void test_Inset_empty2() throws EmptyException {   
	
	is1.choose();
}

@Test //(expected=EmptyException.class) //x.choose()
public void test_Inset_mcdc() {  
	is.mcdc(0,5);
	is.mcdc(5,5);
	is.mcdc(0,2);
	

}

@Test  //x.choose()
public void test_Inset_sub_size3() {   
	 Intset_fixed iss= new Intset_fixed();
	iss.size();
}
@Test //x.choose()
public void test_Inset_isin() {   
assertEquals("the documentation says that should be false, ",true, 
is.isIn(10));       
}
@Test //x.choose()
public void test_Inset_isin2() {   
assertEquals("the documentation says that should be false, ",false, 
is.isIn(1));  
is.insert(9);
is.insert(9);
/*assertEquals("the documentation says that should be false, ",true, 
is.size()==2);  */
Intset_fixed p=new Intset_fixed(new Vector<Integer>());
p.toString();
String s="52";
p.equals(s);
is.remove(9);
is.remove(89);
}
/*@Test //insert

public void test_Inset_insert() { 
is.insert(5);
is.insert(5);
assertFalse("the documentation says that should be true, ", 
is.size()==2);  
}*/
// end test for the intset_sub
} 