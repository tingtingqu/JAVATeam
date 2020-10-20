package main;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;


public class Import {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filepath="E:\\github\\import.txt";
	    
		ArrayList<Person> list_txt=new ArrayList<Person>();
		list_txt=readTxtFile(filepath); 
        //printArray(array);
		System.out.println("表格数据：\n"+list_txt);
   
}
public static ArrayList readTxtFile(String filePath) {

ArrayList list=new ArrayList();

try {
	//List<String> list=new ArrayList<String>();
    File file = new File(filePath);
if(file.isFile() && file.exists()) {//gbk
  InputStreamReader read = new InputStreamReader(new FileInputStream(file), "gbk");
  BufferedReader bufferedReader = new BufferedReader(read);
  String lineTxt = null;
  int line=0;
  while ((lineTxt = bufferedReader.readLine()) != null) {
	  String[] person_txt=lineTxt.split("\\s+");  
if(line>0) {
	Person person=new Person(); person.setNu(person_txt[0]);
    person.setName(person_txt[1]);
    person.setMath(Integer.parseInt(person_txt[2]));
    person.setChinese(Integer.parseInt(person_txt[3]));
    person.setEnglish(Integer.parseInt(person_txt[4]));
    list.add(lineTxt);
}
       line++;
  }
read.close();
   
 
} else {
  System.out.println("文件不存在!");
}
} catch (Exception e) {
System.out.println("文件读取错误!");
}
return list;

}

	
	
}


