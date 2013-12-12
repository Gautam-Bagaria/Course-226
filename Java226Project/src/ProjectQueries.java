import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class ProjectQueries {

	public static void SelectCust() throws SQLException
	{
		if(ProjectGUI.t1.getText().isEmpty() == false)
		{
			PreparedStatement select_Cust = ProjectDBConnection.con.prepareStatement("SELECT * FROM customers WHERE customerNumber = '"+ProjectGUI.t1.getText().toString()+"'");
			ResultSet rs1 = select_Cust.executeQuery();
			while(rs1.next())
			{
				String cust_lname = rs1.getString(2);
				String cust_fname = rs1.getString(3);
				String cust_name = cust_lname+cust_fname;
				ProjectMain.RESULT.add(cust_name);
			}
		}
		if(ProjectGUI.t2.getText().isEmpty() == false)
		{
			String test = "%"+ProjectGUI.t2.getText().toString()+"%";
			PreparedStatement select_Cust = ProjectDBConnection.con.prepareStatement("SELECT * FROM customers WHERE contactLastName LIKE '"+test+"'");
			ResultSet rs1 = select_Cust.executeQuery();
			while(rs1.next())
			{
				String cust_lname = rs1.getString(2);
				String cust_fname = rs1.getString(3);
				String cust_name = cust_lname+cust_fname;
				ProjectMain.RESULT.add(cust_name);
			}
		}
		if(ProjectGUI.t3.getText().isEmpty() == false)
		{
			PreparedStatement select_Cust = ProjectDBConnection.con.prepareStatement("SELECT * FROM products WHERE productCode = '"+ProjectGUI.t3.getText().toString()+"'");
			ResultSet rs1 = select_Cust.executeQuery();
			while(rs1.next())
			{
				String prod_name = rs1.getString(2);
				String prod_d = rs1.getString(6);
				String prod_q = rs1.getString(7);
				String prod_p = rs1.getString(9);
				String prod = "======================================================";
				ProjectMain.RESULT.add(prod_name);
				ProjectMain.RESULT.add(prod_d);
				ProjectMain.RESULT.add(prod_q);
				ProjectMain.RESULT.add(prod_p);
				ProjectMain.RESULT.add(prod);
			}
		}
		if(ProjectGUI.t4.getText().isEmpty() == false)
		{
			
			String test = "%"+ProjectGUI.t4.getText().toString()+"%";
			System.out.println(test);
			PreparedStatement select_Cust = ProjectDBConnection.con.prepareStatement("SELECT * FROM products WHERE productName LIKE '"+test+"'");
			ResultSet rs1 = select_Cust.executeQuery();
			while(rs1.next())
			{
				String prod_name = rs1.getString(1);
				String prod_d = rs1.getString(6);
				String prod_q = rs1.getString(7);
				String prod_p = rs1.getString(9);
				String prod = "======================================================";
				ProjectMain.RESULT.add(prod_name);
				ProjectMain.RESULT.add(prod_d);
				ProjectMain.RESULT.add(prod_q);
				ProjectMain.RESULT.add(prod_p);
				ProjectMain.RESULT.add(prod);
			}
		}
		if(ProjectGUI.t5.getText().isEmpty() == false)
		{
			String test = ProjectGUI.t5.getText();
			PreparedStatement select_Cust = ProjectDBConnection.con.prepareStatement("SELECT * FROM products WHERE MSRP = '"+test+"'");
			ResultSet rs1 = select_Cust.executeQuery();
			while(rs1.next())
			{
				String prod_name = rs1.getString(1);
				String prod_p = rs1.getString(2);
				String prod_d = rs1.getString(6);
				String prod_q = rs1.getString(7);
				
				String prod = "======================================================";
				ProjectMain.RESULT.add(prod_name);
				ProjectMain.RESULT.add(prod_p);
				ProjectMain.RESULT.add(prod_q);
				ProjectMain.RESULT.add(prod_d);
				ProjectMain.RESULT.add(prod);
			}
		}
				
	}
	
	
}
