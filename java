package Connect_DB;
import java.sql.*;
import java.util.*;
public class EData {
	
	public static void main(String[] args) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		java.sql.Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521","System","connect");	
		 
		 Statement st=con.createStatement();
		
		 boolean flag = true;
		do {
			 System.out.println("\n<- * Wel-Come To BAJAJ PVT. LTD. * ->\n");
			 System.out.println("Press -> 1 : Add Employee Details.");
			 System.out.println("Press -> 2 : View Employee Details.");
			 System.out.println("Press -> 3 : Update Employee Details.");
			 System.out.println("Press -> 4 : Delete Employee Details.");
			 System.out.println("\nEnter your Choice:-");
			 Scanner sc = new Scanner(System.in);
			 int ch=sc.nextInt();
			 //Use switch case to add employee Details
			 switch (ch) {
			case 1: {
				
				System.out.println("\n#* ADD the Employee Details *#\n");
				PreparedStatement ps=con.prepareStatement("INSERT INTO EMP(EMP_ID,EMP_NAME,EMP_SALARY, EMP_DEPT)VALUES(?,?,?,?)");
				System.out.println("Enter the employee details \n->EMP_ID,EMP_NAME,EMP_SALARY, EMP_DEPT\n -> Respectivly:-");
				int a=sc.nextInt();
				String b=sc.next();	
				int c=sc.nextInt();
				String d=sc.next();
				ps.setInt(1, a);
				ps.setString(2, b);
				ps.setLong(3, c);
				ps.setString(4, d);
				int n=ps.executeUpdate();
				if (n>0) {
					System.out.println("Data Inserted Successfully.....");
				} else {
					System.out.println("Not Data inserted into table...");
				}
				con.close();
				break;
			}
			case 2: {
				System.out.println("\n#** Shows All the Employee Details **#\n");
				ResultSet rs=st.executeQuery("SELECT * FROM EMP");
				System.out.println("\tE_ID     \tE_NAME     \t   E_SALARY  \t       E_DEPT");
				System.out.println("-----------------------------------------------------------------------------------");
				while (rs.next()) {
					System.out.println("\t"+   rs.getInt(1)+"    \t    "+rs.getString(2)+"    \t   "+rs.getInt(3)+"       \t      "+rs.getString(4));
				}
				rs.close();
				break;
			}
			case 3: {
				System.out.println("\n#*** Update the Employee Details *#\n");
				PreparedStatement ps=con.prepareStatement("UPDATE EMP SET EMP_ID=?,EMP_NAME=?,EMP_SALARY=?,EMP_DEPT=? WHERE EMP_ID=?");
				System.out.println("Enter the empoyee ID to change Details:-");
				int u=sc.nextInt();
				System.out.println("\nEnter the Update Deatails of an Employee...->");
				int p=sc.nextInt();
				String q=sc.next();	
				int r=sc.nextInt();
				String s=sc.next();
				ps.setInt(1, p);
				ps.setString(2, q);
				ps.setLong(3, r);
				ps.setString(4, s);
				ps.setInt(5, u);
				int n=ps.executeUpdate();
				if (n>0) {
					System.out.println("Data is Updated Successfully.....");
				} else {
					System.out.println(" Data is Not Updated into table...");
				}
				ps.close();
				break;
			}
			case 4: {
				System.out.println("\n#**** DELETE the Employee Details **#\n");
				PreparedStatement ps=con.prepareStatement("DELETE FROM EMP WHERE EMP_ID=?");
				System.out.println("\nEnter E_ID to DELETE Record...***");
				int u=sc.nextInt();
				ps.setInt(1, u);
				int n=ps.executeUpdate();
				if (n>0) {
					System.out.println("Employee record DELETE Successfully.....");
				} else {
					System.out.println(" 404...Record Not DELETED..");
				}
				ps.close();
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + ch);
			}
		} while (flag);
	}
}
