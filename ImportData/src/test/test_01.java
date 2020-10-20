package test;



import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import main.Person;
import main.Read_Sort;
import main.Sort;

public class test_01 {
	@Test
public void test_read_sort() {
		
		Read_Sort read=new Read_Sort();
		ArrayList<Person> p=new ArrayList<Person>();
		Person person1=new Person("202000358054","ÇúæÃæÃ",90,80,85);
		Person person2=new Person("202000358016","³ÂÏşÃÈ",90,85,88);
		Person person3=new Person("202000358055","ÈÃĞ¢µÏ",90,80,83);
		
		  p.add(person1);
		  p.add(person2);
		  p.add(person3);
		  int[] f1={263,255,253};
		  read.set_Sort_Interface(new Sort());
		 assertArrayEquals(f1,read.readsort(p));
		 
		
		
	}

}
