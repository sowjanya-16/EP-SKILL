
package com.klu.insert;
import java.sql.PreparedStatement;
import com.klu.Bean.StudentBean;
import com.klu.Connections.DBUtil;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
public class StudentInsertion {
     public int StudentInsert(StudentBean student) throws ClassNotFoundException, SQLException{
    	Connection con=DBUtil.DBConnection();
    		PreparedStatement ps=con.prepareStatement("Insert into student values(?,?,?)");
    		ps.setInt(1, student.getRegno());
    		ps.setString(2, student.getName());
    		ps.setString(3, student.getEmail());
    		int i=ps.executeUpdate();
    		System.out.println(i+"records inserted");
    		return i;
     }
    	public int StudentDelete(StudentBean student) throws ClassNotFoundException, SQLException{
        	Connection con=DBUtil.DBConnection();  
    		PreparedStatement ps1=con.prepareStatement("Delete from student where Regno=?");
    		ps1.setInt(1, student.getRegno());
    		int i=ps1.executeUpdate();
    		System.out.println(i+"record deleted");
    		return i;
    		
    	}
    	public int StudentUpdate(StudentBean student) throws ClassNotFoundException, SQLException{
        	Connection con=DBUtil.DBConnection();
        	PreparedStatement ps2=con.prepareStatement("Update student set name=? where Regno=?");
        	ps2.setString(1,student.getName());
    		ps2.setInt(2, student.getRegno());
    		int i=ps2.executeUpdate();
    		System.out.println(i+"record updated");
    		return i;
    	}
    	public void StudentDisplay(StudentBean student) throws ClassNotFoundException, SQLException{
        	Connection con=DBUtil.DBConnection();
        	PreparedStatement ps=con.prepareStatement("Select * from StudentBean");
        	ResultSet rs=ps.executeQuery();
        	while(rs.next())
        	{
        		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
        	}
    }
}