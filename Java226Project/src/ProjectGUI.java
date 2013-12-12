import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collections;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class ProjectGUI {
	
	static JList list;
	static JScrollPane sp;
	static Frame f;
	static JPanel p1;
	static JTextArea t1,t2,t3,t4,t5,t6;
	
	
	public static void add_gui()
	{
		Frame f1 = new Frame();
		f1.setTitle("modify data");
		f1.setSize(800,500);
		f1.setLocation(200,200);
		JPanel p2 = new JPanel();
		p2.setLayout(null);
		
		JLabel label1 = new JLabel( "CustomerID");
		label1.setBounds( 10, 35, 350, 20 );
		p2.add( label1 );
		
		final JTextArea txt1 = new JTextArea();
		txt1.setBounds(110, 35, 200, 20);
		p2.add(txt1);
		
		JLabel label2 = new JLabel( "CustomerFName");
		label2.setBounds( 10, 65, 350, 20 );
		p2.add( label2 );
				
		final JTextArea txt2 = new JTextArea();
		txt2.setBounds(110, 65, 200, 20);
		p2.add(txt2);
		
		JLabel label3 = new JLabel( "CustomerLName");
		label3.setBounds( 10, 95, 350, 20 );
		p2.add( label3 );
		
		final JTextArea txt3 = new JTextArea();
		txt3.setBounds(110, 95, 200, 20);
		p2.add(txt3);
		
		JLabel label4 = new JLabel( "Phone");
		label4.setBounds( 10, 125, 350, 20 );
		p2.add( label4 );
		
		final JTextArea txt4 = new JTextArea();
		txt4.setBounds(110, 125, 200, 20);
		p2.add(t4);
		
		JLabel label5 = new JLabel( "Address");
		label5.setBounds( 10, 155, 350, 20 );
		p2.add( label5 );
		
		final JTextArea txt5 = new JTextArea();
		txt5.setBounds(110, 155, 200, 20);
		p2.add(txt5);
		
		JButton add = new JButton();
		add.setText("Add Entry");
		add.setBounds(60, 350, 120, 20);
		p2.add(add);
		
		JButton delete = new JButton();
		delete.setText("Delete Entry");
		delete.setBounds(60, 380, 120, 20);
		p2.add(delete);
		
		JButton update = new JButton();
		update.setText("Update Entry");
		update.setBounds(60, 410, 120, 20);
		p2.add(update);
		
		add.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e)
			{
				// TODO Auto-generated method stub
				
				try {
					PreparedStatement select_Cust;
					select_Cust = ProjectDBConnection.con.prepareStatement("INSERT INTO `customers`(`customerNumber`, `contactLastName`) VALUES ('"+txt1.getText()+"','"+txt2.getText()+"')"); 
					int rs1 = select_Cust.executeUpdate();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		
		delete.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				// TODO Auto-generated method stub
				PreparedStatement select_Cust;
				try {
					select_Cust = ProjectDBConnection.con.prepareStatement("DELETE FROM `customers` WHERE customerNumber = '"+txt1.getText().toString()+"'");
					int rs1 = select_Cust.executeUpdate();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} 
				
			}
		});
		
		update.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				// TODO Auto-generated method stub
				try {
					PreparedStatement select_Cust;
					select_Cust = ProjectDBConnection.con.prepareStatement("UPDATE `customers` SET contactLastName = '"+txt2.getText()+"' WHERE customerNumber ='1'"); 
					int rs1 = select_Cust.executeUpdate();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		
		f1.add(p2);
		f1.show();
	}
	
	public static void main_gui()
	{
		f = new Frame();
		f.setTitle("MAIN GUI");
		f.setSize(800,500);
		f.setLocation(200, 200);
		
		p1 = new JPanel();
		p1.setLayout(null);
		
		JLabel label1 = new JLabel( "CustomerID");
		label1.setBounds( 10, 35, 350, 20 );
		p1.add( label1 );
		
		t1 = new JTextArea();
		t1.setBounds(100, 35, 200, 20);
		p1.add(t1);
		
		JLabel label2 = new JLabel( "CustomerName");
		label2.setBounds( 10, 65, 350, 20 );
		p1.add( label2 );
				
		t2 = new JTextArea();
		t2.setBounds(100, 65, 200, 20);
		p1.add(t2);
		
		JLabel label3 = new JLabel( "ProductID");
		label3.setBounds( 10, 95, 350, 20 );
		p1.add( label3 );
		
		t3 = new JTextArea();
		t3.setBounds(100, 95, 200, 20);
		p1.add(t3);
		
		JLabel label4 = new JLabel( "ProductName");
		label4.setBounds( 10, 125, 350, 20 );
		p1.add( label4 );
		
		t4 = new JTextArea();
		t4.setBounds(100, 125, 200, 20);
		p1.add(t4);
		
		JLabel label5 = new JLabel( "ProductPrice");
		label5.setBounds( 10, 155, 350, 20 );
		p1.add( label5 );
		
		t5 = new JTextArea();
		t5.setBounds(100, 155, 200, 20);
		p1.add(t5);
		
		
		
		JButton modify = new JButton();
		modify.setText("Delete Entry");
		modify.setBounds(60, 380, 120, 20);
		p1.add(modify);
		
		
		
		JButton search = new JButton();
		search.setText("Search");
		search.setBounds(400, 430, 100, 20);
		p1.add(search);
		
		final JTextArea text_result = new JTextArea();
		text_result.setBounds(370, 25, 400, 400);
		JScrollPane sp1 = new JScrollPane(text_result);
		sp1.setBounds(370, 25, 400, 400);
		p1.add(sp1);
		
				
		JButton exit = new JButton();
		exit.setText("exit");
		exit.setBounds(520, 430, 60, 20);
		p1.add(exit);
		
		modify.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				add_gui();
				
			}
		});
		
		exit.addActionListener(new ActionListener() 
		{
			
			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				// TODO Auto-generated method stub
				System.exit(0);
				
			}
		});
		
		search.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				try {
					ProjectMain.RESULT.clear();
					text_result.setText("");
					ProjectMain.Q1.SelectCust();
					for(int i=0; i<= ProjectMain.RESULT.size();i++)
					{
						String res = ProjectMain.RESULT.get(i);
						text_result.append(res+"\n");
					}
					
					
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		f.add(p1);
		f.show();
	}
	public static void gui() 
	{
		Frame f = new Frame();
		
		JPanel panel1;
		f.setTitle("Context Based Mining Extraction");
		f.setSize( 800, 300 );
		f.setLocation(200, 200);
			
		panel1 = new JPanel();
		panel1.setLayout( null );

		JLabel labelTopItem = new JLabel( "The max sold item is "+ProjectMain.MaxProcode );
		labelTopItem.setBounds( 10, 15, 200, 20 );
		panel1.add( labelTopItem );
		
		JLabel label2 = new JLabel( "Enter the product code to find its support product" );
		label2.setBounds( 370, 55, 400, 20 );
		panel1.add( label2 );
		
		JLabel label1 = new JLabel( "List of all Product Names - Product Code" );
		label1.setBounds( 10, 35, 350, 20 );
		panel1.add( label1 );
		
		JList list = new JList(ProjectMain.AllCodeNames.toArray());
		list.setBounds( 10, 55,350, 200 );
		JScrollPane sp = new JScrollPane(list);
		sp.setBounds( 10, 55, 350, 200 );
		panel1.add( sp );
		
		ProjectMain.t1 = new JTextArea();
		ProjectMain.t1.setBounds(370, 75, 400, 20);
		panel1.add(ProjectMain.t1);
		
		JLabel label3 = new JLabel( "The Support product is " );
		label3.setBounds( 370, 105, 400, 20 );
		panel1.add( label3 );
		
		final JTextArea t2 = new JTextArea();
		t2.setBounds(370, 125, 400, 100);
		JScrollPane sp1 = new JScrollPane(t2);
		sp1.setBounds(370, 125, 400, 100);
		panel1.add(sp1);
		
		JButton ok = new JButton();
		ok.setText("ok");
		ok.setBounds(400, 230, 50, 20);
		panel1.add(ok);
		
		JButton exit = new JButton();
		exit.setText("exit");
		exit.setBounds(470, 230, 60, 20);
		panel1.add(exit);
		
		ok.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				try{
				PreparedStatement abc2 = ProjectDBConnection.con.prepareStatement("SELECT orderNumber from orderdetails WHERE productCode = '"+ProjectMain.t1.getText()+"'");
				ResultSet rs2 = abc2.executeQuery();
				while(rs2.next())
				{
					int orderNum = rs2.getInt(1);
					ProjectMain.orderNos.add(orderNum);
				}
			//	System.out.println(orderNos);
				// orderNos contains all the orderNumber which have the maximum sold productCode
				
				//find all the products which were sold with those orderNumber
				for(int i=0;i<ProjectMain.orderNos.size();i++)
				{
					int ordernum = ProjectMain.orderNos.get(i);
					PreparedStatement abc3 = ProjectDBConnection.con.prepareStatement("SELECT productCode from orderdetails WHERE orderNumber ='"+ordernum+"'");
					ResultSet rs3 = abc3.executeQuery();
					while(rs3.next())
					{
						String abc = rs3.getString(1);
						if(abc.equals(ProjectMain.t1.getText())==false)
						{
							ProjectMain.confidence.add(abc);
						}
					}
				}
				Collections.sort(ProjectMain.confidence);
			//	System.out.println(confidence);
				int xyz =0;
				int counts=0;
				int count=1;
				String confi = null;
				//Now find which product was sold maximum times, this product will be support
				while(xyz<ProjectMain.confidence.size()-1)
				{
				
					confi = ProjectMain.confidence.get(xyz);
					String confi1 = ProjectMain.confidence.get(xyz+1);
					if(confi.trim().equals(confi1.trim()))
					{
						count++;
						
						xyz++;
						
					}
					else
					{
						ProjectMain.COUNT.add(count);
						xyz=xyz+1;
						ProjectMain.confidenceCopy.add(confi);
					//	System.out.println(count);
						count=1;
					}
				}
				ProjectMain.COUNT.add(count);
				xyz=xyz+1;
				ProjectMain.confidenceCopy.add(confi);
				//System.out.println(count);
				//Find the max sold product, get its position and find the product.
				int maxConfi;
				
				int tempMaxconfi=0;
				int tempMaxconfi1=0;
				int tempMaxconfi2=0;
				int tempMaxconfi3=0;
				
				int maxConfiPos = 0;
				int maxConfiPos1 = 0;
				int maxConfiPos2 = 0;
				int maxConfiPos3 = 0;
				int flag=0;
				int flag1=0;
				int flag2=0;
				for(int i=0;i<ProjectMain.COUNT.size();i++)
				{
					maxConfi=ProjectMain.COUNT.get(i);
					flag=0;
					flag1=0;
					flag2=0;
					if(tempMaxconfi<maxConfi)
					{
						tempMaxconfi=maxConfi;
						maxConfiPos=i;
						flag=1;
						
					}
					if(((tempMaxconfi1<maxConfi) && (flag==0)))
					{
						tempMaxconfi1=maxConfi;
						maxConfiPos1=i;
						flag1=1;
					}
					if(((tempMaxconfi2<maxConfi) && (flag1==0) && (flag==0)))
					{
						tempMaxconfi2=maxConfi;
						maxConfiPos2=i;
						flag2=1;
					}
					if(((tempMaxconfi3<maxConfi) && (flag2==0) && (flag1==0) && (flag==0)))
					{
						tempMaxconfi3=maxConfi;
						maxConfiPos3=i;
					}
					
					
				}
				System.out.println(ProjectMain.confidenceCopy);
				System.out.println(maxConfiPos);
				String Maxconfi=ProjectMain.confidenceCopy.get(maxConfiPos );
				String Maxconfi1=ProjectMain.confidenceCopy.get(maxConfiPos1);
				String Maxconfi2=ProjectMain.confidenceCopy.get(maxConfiPos2);
				String Maxconfi3=ProjectMain.confidenceCopy.get(maxConfiPos3);
				System.out.println(Maxconfi +" is the support for "+ProjectMain.t1.getText());
				System.out.println(Maxconfi1 +" is the support for "+ProjectMain.t1.getText());
				System.out.println(Maxconfi2 +" is the support for "+ProjectMain.t1.getText());
				System.out.println(Maxconfi3 +" is the support for "+ProjectMain.t1.getText());
				PreparedStatement abc4 = ProjectDBConnection.con.prepareStatement("SELECT productName FROM `products` WHERE productCode='"+ProjectMain.t1.getText()+"'");
				ResultSet rs4 = abc4.executeQuery();
				String MaxProName = null;
				while(rs4.next())
				{
					MaxProName = rs4.getString(1);
				}
				
				PreparedStatement abc5 = ProjectDBConnection.con.prepareStatement("SELECT productName FROM `products` WHERE productCode='"+Maxconfi+"'");
				ResultSet rs5 = abc5.executeQuery();
				String MaxConfiName = null;
				while(rs5.next())
				{
					MaxConfiName = rs5.getString(1);
				}
				PreparedStatement abc6 = ProjectDBConnection.con.prepareStatement("SELECT productName FROM `products` WHERE productCode='"+Maxconfi1+"'");
				ResultSet rs6 = abc6.executeQuery();
				String MaxConfiName1 = null;
				while(rs6.next())
				{
					MaxConfiName1 = rs6.getString(1);
				}
				PreparedStatement abc7 = ProjectDBConnection.con.prepareStatement("SELECT productName FROM `products` WHERE productCode='"+Maxconfi2+"'");
				ResultSet rs7 = abc7.executeQuery();
				String MaxConfiName2 = null;
				while(rs7.next())
				{
					MaxConfiName2 = rs7.getString(1);
				}
				PreparedStatement abc8 = ProjectDBConnection.con.prepareStatement("SELECT productName FROM `products` WHERE productCode='"+Maxconfi3+"'");
				ResultSet rs8 = abc8.executeQuery();
				String MaxConfiName3 = null;
				while(rs8.next())
				{
					MaxConfiName3 = rs8.getString(1);
				}
				t2.setText(MaxConfiName +" is the support for "+MaxProName);
				t2.append("\n"+MaxConfiName1 +" is the support for "+MaxProName);
				t2.append("\n"+MaxConfiName2 +" is the support for "+MaxProName);
				t2.append("\n"+MaxConfiName3 +" is the support for "+MaxProName);
				t2.append("\n"+MaxConfiName1 +" is the support for "+MaxProName);
				t2.append("\n"+MaxConfiName2 +" is the support for "+MaxProName);
				t2.append("\n"+MaxConfiName3 +" is the support for "+MaxProName);
				t2.append("\n"+MaxConfiName1 +" is the support for "+MaxProName);
				t2.append("\n"+MaxConfiName2 +" is the support for "+MaxProName);
				t2.append("\n"+MaxConfiName3 +" is the support for "+MaxProName);
				ProjectMain.list1.clear(); 
				ProjectMain.list2.clear();
				ProjectMain.Percentage.clear() ;
				ProjectMain.RelativePer.clear() ;
				ProjectMain.ItemNumber.clear() ;
				ProjectMain.orderNos.clear() ;
				ProjectMain.confidence.clear() ;
				ProjectMain.confidenceCopy.clear() ;
				ProjectMain.COUNT.clear();
				ProjectMain.AllPCodes.clear() ;
				ProjectMain.AllPNames.clear();
				ProjectMain.AllCodeNames.clear() ;
				}
				catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				
				
				
			}
		});
		
		exit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				System.exit(0);
				
			}
		});
		f.add(panel1);
		f.show();
	}

}
