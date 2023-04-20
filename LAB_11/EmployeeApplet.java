import java.applet.Applet;
import java.awt.*;

public class EmployeeApplet extends Applet {

    private String employeeId;
    private String employeeName;

    @Override
    public void init() {
        employeeId = getParameter("Employee_ID");
        employeeName = getParameter("EMP_Name");
    }

    @Override
    public void paint(Graphics g) {
        g.drawString("Employee ID: " + employeeId, 50, 50);
        g.drawString("Employee Name: " + employeeName, 50, 70);
    }

}
