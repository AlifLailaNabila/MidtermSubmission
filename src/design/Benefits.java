package design;

public class Benefits extends EmployeeInfo {

    public Benefits(int employeeId) {
        super(employeeId);
    }

    @Override
    public void yearlyTour(){
        System.out.println("No tour");
    }
    public void yearlyTour(String name){
        System.out.println("New employee name is Shama");
    }
}
