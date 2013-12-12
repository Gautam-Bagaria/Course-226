import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JTextArea;


public class ProjectMain {
		
		static String MaxProcode ;
		static JTextArea t1;
		static ArrayList<Integer>list1 = new ArrayList<Integer>();
		static ArrayList<String>list2 = new ArrayList<String>();
		static ArrayList<Float>Percentage = new ArrayList<Float>();
		static ArrayList<Float>RelativePer = new ArrayList<Float>();
		static ArrayList<Integer>ItemNumber = new ArrayList<Integer>();
		static ArrayList<Integer>orderNos = new ArrayList<Integer>();
		static ArrayList<String>confidence = new ArrayList<String>();
		static ArrayList<String>confidenceCopy = new ArrayList<String>();
		static ArrayList<Integer>COUNT = new ArrayList<Integer>();
		static ArrayList<String>AllPCodes = new ArrayList<String>();
		static ArrayList<String>AllPNames = new ArrayList<String>();
		static ArrayList<String>AllCodeNames = new ArrayList<String>();
		static ArrayList<String>RESULT = new ArrayList<>();
		static ProjectQueries Q1;
		public static void main(String[] args) throws SQLException, ClassNotFoundException 
		{
			// TODO Auto-generated method stub
			ProjectDBConnection CC = new ProjectDBConnection();
			CC.ConnectionCon();
			Q1 = new ProjectQueries();
			ProjectGUI g = new ProjectGUI();
			//g.main_gui();
			PreparedStatement abc1 = ProjectDBConnection.con.prepareStatement("SELECT SUM( quantityOrdered ) gautam, productCode FROM orderdetails WHERE productCode IN (SELECT DISTINCT productCode FROM orderdetails) GROUP BY productCode");
			ResultSet rs1 = abc1.executeQuery();
			
			while(rs1.next())
			{
				int ProductCount = rs1.getInt(1);
				list1.add(ProductCount);
				String ProductCode = rs1.getString(2);
				list2.add(ProductCode);
			}
			// list1 contains ProductCount
			// list2 contains ProductCode
			int total=0;
			for(int i=0;i<list1.size();i++)
			{
				total=total+list1.get(i);
			}
			System.out.println(total);
			
			for(int i=0;i<list1.size();i++)
			{
				float per=0;
				per=(float)(list1.get(i)*100)/total;
				Percentage.add(per);
				
			}
			float tempMax=0;
			//Percentage contains percentage sale of each product
			
			for(int i=0;i<Percentage.size();i++)
			{
				float a = Percentage.get(i);
				
				if(tempMax<a)
				{
					tempMax = a;
					
				}
					
			}
			//tempMax contains max %		
			
			float tempMin=100;
			for(int i=0;i<Percentage.size();i++)
			{
				float a = Percentage.get(i);
				
				if(tempMin>a)
				{
					tempMin = a;
				}
			}
			
			//tempMin contains min %
			for(int i=0;i<Percentage.size();i++)
			{
				float abc = Percentage.get(i);
				abc= (abc/tempMax)*100;
				RelativePer.add(abc);
			}
			//RelativePer contains the Relative Percentage sold based on max percentage obtained
			System.out.println("max "+tempMax);
			System.out.println("min "+tempMin);
			System.out.println("this is percentage of each item" +Percentage);
			System.out.println("this is relative percentage of each item "+ RelativePer);
		
			int pos = 0;
			//find out the position of the max %, this will be used to find the ProductCode from list1
			for(int i=0;i<Percentage.size();i++)
			{
				if(Percentage.get(i)==tempMax)
				{
					pos = i;
				}
			}
			
			// now we get the confidence product
			MaxProcode = list2.get(pos);
					
			System.out.println(MaxProcode +" Sold Max"  );
			rs1.close();
					
			//Now find the orderNumber where the max sold productCode appears.
			
			//System.out.println(MaxConfiName +" is the support for "+MaxProName);
			
			PreparedStatement abc6 = ProjectDBConnection.con.prepareStatement("SELECT productCode, productName FROM `products` ");
			ResultSet rs6 = abc6.executeQuery();
			String allNamesCodes;
			while(rs6.next())
			{
				allNamesCodes = rs6.getString(1);
				AllPCodes.add(allNamesCodes);
				allNamesCodes = rs6.getString(2);
				AllPNames.add(allNamesCodes);
			}
			
			String CodeName;
			for(int i=0; i<AllPCodes.size();i++)
			{
				CodeName = AllPNames.get(i)+"  -  "+AllPCodes.get(i);
				AllCodeNames.add(CodeName);
			}
			g.gui();
			System.out.println(AllCodeNames);
		}
		// TODO Auto-generated method stub

	}

