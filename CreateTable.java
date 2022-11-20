import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

// import javax.sound.sampled.SourceDataLine;

public class CreateTable {
    private static String Driver = "com.mysql.jdbc.Driver";
    private static String url = "jdbc:mysql://localhost:3306/selectstmt";
    private static String User = "root";
    private static String pswd = "";
    private static String SELECT = "Select * from  staffdetails;";

    public static void main(String[] args) {

        Connection con = null;
        java.sql.Statement st = null;
        ResultSet rs = null;
        while (true) {
            // / created a while loop to get executed always and placed the risky code in
            // the try block

            try {
                Class.forName(Driver);
                con = DriverManager.getConnection(url, User, pswd);
                st = con.createStatement();

                // if (con != null) {
                // System.out.println("Database connected ");
                // }

                try (// Created a Scanner class object to take a refernce of keyboard ........
                Scanner sc = new Scanner(System.in)) {
                    int option;
                    System.out
                            .println("||==============================================================================||");
                    System.out.println("||           Welcome to database Tutorial                                     ||");
                    System.out
                            .println("||       1. to create a table                                                   ||");
                    System.out
                            .println("||       2. to insert a record in database                                      ||");
                    System.out
                            .println("||       3. to get information of all staff                                     ||");
                    System.out
                            .println("||       4. to get info of a staff                                              ||");
                    System.out
                            .println("||       5. Update information  of the staff                                    ||");
                    System.out
                            .println(
                                    "||               6. Delte a staff from the databse                                      ||");

                    System.out
                            .println("||==============================================================================||");
                    option = sc.nextInt();
                    switch (option) {

                        case 1:
                            System.out.println(" Do you really want to create a new table in the databse ");
                            System.out.println("Press Y   or N ");
                            String Choice = sc.nextLine();
                            if (Choice.equalsIgnoreCase("y")) {
                                System.out.println("Enter name for the table ");
                                String TableName = sc.nextLine();
                                System.out.println(" Enter the size for each coulumn");
                                int Size = sc.nextInt();

                            }

                            break;
                        case 2:

                            System.out.println(" you are inserting a new staff ");
                            System.out.println("\nEnter staff id\n ");
                            int id = sc.nextInt();
                            System.out.println("Enter name of the staff");
                            String EmpName = sc.next();
                            System.out.println("Enter Designation of the staff ");
                            String Desgination = sc.next();
                            System.out.println("Enter the city of the staff ");
                            String city = sc.next();
                            String INSERT = "insert into staffdetails2 values(" + "'" + id + "'" + "," + "'" + EmpName + "'"
                                    + "," + "'" + Desgination + "'" + "," + "'" + city + "');";

                            int Rowsaffected = st.executeUpdate(INSERT);
                            if (Rowsaffected > 0) {
                                System.out.println("Staff record saved succesfully");

                            }
                            break;

                        case 3:

                            System.out.println("Pls wait records are fetching...........     " +
                                    " Done ");
                            rs = st.executeQuery(SELECT);
                            while (rs.next()) {
                                System.out.println(rs.getInt("staff_id") + "  " + rs.getString("Name") + "  "
                                        + rs.getString("designation") + "  " + rs.getString("city"));

                            }
                            break;

                        case 4:
                            System.out.println("Enter ID  of the staff");
                            int ID = sc.nextInt();
                            String SEARCH_QEURY = "select  staff_id,Name,designation,city from staffdetails"
                                    + " where staff_id=" + ID + ";";
                            System.out.println("Searching staff in the  database................Found ");
                            ResultSet rt = st.executeQuery(SEARCH_QEURY);
                            while (rt.next()) {
                                System.out.println("Staff ID :" + "   " + rt.getInt("staff_id") + " \nStaff Name : :" + "  "
                                        + rt.getString("Name") + "\nStaff Designation"
                                        + "  " + rt.getString("designation") + "\nCity of the staff" + "   "
                                        + rt.getString("city"));

                            }

                            break;
                        case 5:
                            System.out.println("what you want to update " +
                                    "1 .Name " +
                                    "2 .Id" +
                                    "3 .Designation" +
                                    "4 .City");
                            int updateOption = sc.nextInt();
                            switch (updateOption) {
                                case 1:
                                    System.out.println("Enter existing name of the staff ");
                                    String ExistingName = sc.next();
                                    System.out.println("Enter updated Name of the staff ");
                                    String updatedName = sc.next();
                                    String UPDATE = "update staffdetails  set Name =" + updatedName + "where Name ="
                                            + ExistingName + ";";
                                    int upcount = st.executeUpdate(UPDATE);
                                    if (upcount > 0) {
                                        System.out.println("Staff Name updated succesfully ");
                                    } else {
                                        System.out.println("Staff could not be updated ");
                                    }

                                    break;

                                default:
                                    break;
                            }
                        case 6:
                            System.out.println(" Enter  name  of the staff to delete ");
                            int deletingid = sc.nextInt();
                            String DELETE_QEURY = "delete from staffdetails where 'Name'='" + deletingid + "';";
                            int deletRows = st.executeUpdate(DELETE_QEURY);
                            if (deletRows > 0) {
                                System.out.println(" Staff Deleted Succesfully");

                            } else {
                                System.out.println("Staff could not be deleted ");
                            }
                            break;

                        default:
                            break;
                    }
                }
            } catch (ClassNotFoundException e) {
                e.printStackTrace(); // this catch block is raised by the Class.forName() method

            } catch (SQLException e) { // this catch block is ascociated with the method defined in the try block get
                                       // connnection method
                e.printStackTrace();
            } catch (Exception e) { // this is just a back up excception is placed for to avoid any other exception
                                    // which can be raised
                e.printStackTrace();
            }
        finally{
             try {
                st.close();
                
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            try {
                con.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            
        }


        }

    }
}
