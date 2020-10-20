package main;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Read_Sort implements Read_Sort_Interface{
	
	Sort_Interface si;
	
	public void set_Sort_Interface(Sort_Interface si) {
		this.si=si;
		
	}

	@Override
	public int[] readsort(ArrayList list) {
		// TODO Auto-generated method stub
		
		
		int[] array=read(list);
		
		return sort(array);
		
		
	}
	
	public int[] read(ArrayList<Person> p) {
		  int []num=new int[p.size()];
		  // TODO Auto-generated method stub
		  for(int i=0;i<p.size();i++) {
		     num[i]=p.get(i).getMath()+p.get(i).getChinese()+p.get(i).getEnglish();
		     System.out.println(num[i]);
		    }
		  return num;
		 }
	public int[] sort( int[] array) {
		
		return si.sort(array);
		
	}

}
