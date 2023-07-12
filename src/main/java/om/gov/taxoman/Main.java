package om.gov.taxoman;

import om.gov.taxoman.entity.Department;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        //3. add the connection then after connection word click alt&Enter add con alt&enter
        try {
            List<Department> departments = new ArrayList<>();

            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
            PreparedStatement ps= conn.prepareStatement("select department_id, department_name, manager_id,location_id from departments");

            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()){
                int departmentId=resultSet.getInt(1);
                String departmentName=resultSet.getString(2);
                int managerId=resultSet.getInt(3);
                int locationID=resultSet.getInt(4);

                Department department = new Department();
                department.setId(departmentId);
                department.setDepartmentName(departmentName);
                department.setManagerId(managerId);
                department.setLocationId(locationID);

                departments.add(department);

            }

            for(int i =0; i< departments.size(); i++){
                System.out.println(departments.get(i));
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}