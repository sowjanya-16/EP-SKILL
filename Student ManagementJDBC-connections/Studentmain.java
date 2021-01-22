
package com.klu.main;

import java.sql.SQLException;
import java.util.Scanner;

import com.klu.Bean.StudentBean;
import com.klu.insert.StudentInsertion;

public class Studentmain {
  public static void main(String[] args) throws ClassNotFoundException,SQLException {
	  Scanner sc=new Scanner(System.in);
	  StudentBean sb=new StudentBean();
	  sb.setRegno(1905);
	  sb.setName("satwika");
	  sb.setEmail("sat@gmail.com");
	  StudentInsertion si=new StudentInsertion();
	  System.out.println("1.insert data");
	  System.out.println("2.delete data");
	  System.out.println("3.update data");
	  System.out.println("enter your option:");
	  int option=sc.nextInt();
	  switch (option){
	  case 1:
	  
	  try {
	  int i=si.StudentInsert(sb);
	  if(i>0)
	  {
		  System.out.println("insertion is successful");
	  }
	  else
	  {
		  System.out.println("insertion is fail");
	  }
	  }
	  catch(Exception e)
	  {
		  System.out.println(e);
	  }
	  case 2:
		  
		  try {
		  sb.setRegno(1193);
		  int i=si.StudentDelete(sb);
		  if(i>0)
		  {
			  System.out.println("Deletion is successful");
		  }
		  else
		  {
			  System.out.println("Deletion is fail");
		  }
		  }
		  catch(Exception e)
		  {
			  System.out.println(e);
		  }
       case 3:
		  
		  try {
		  sb.setName("Poojitha");
		  sb.setRegno(1905);
		  int i=si.StudentUpdate(sb);
		  if(i>0)
		  {
			  System.out.println("updation is successful");
		  }
		  else
		  {
			  System.out.println("updation is fail");
		  }
		  }
		  catch(Exception e)
		  {
			  System.out.println(e);
		  }
	  }
	  
  }
}

