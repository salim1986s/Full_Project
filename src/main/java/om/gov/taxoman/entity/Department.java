package om.gov.taxoman.entity;

public class Department {



    private int id;
    private String departmentName;
    private int managerId;
    private int locationId;

    public Department() {
    }

    public Department(int id, String departmentName, int managerId, int locationId) {
        this.id = id;
        this.departmentName = departmentName;
        this.managerId = managerId;
        this.locationId = locationId;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", departmentName='" + departmentName + '\'' +
                ", managerId=" + managerId +
                ", locationId=" + locationId +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public int getManagerId() {
        return managerId;
    }

    public void setManagerId(int managerId) {
        this.managerId = managerId;
    }

    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }
}
