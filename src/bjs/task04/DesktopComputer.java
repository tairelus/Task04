package bjs.task04;

/**
 * Created by U-1 on 28.10.2015.
 */
public class DesktopComputer extends Computer {
    private int _fixedMemorySizeGb;
    private String _computerName;
    private String _operationSystem;

    DesktopComputer(String operationSystem, String computerName) {
        //call base class constructor. Something like copy constructors in C++
        super(3.10f, 8.00f);

        _computerType = "PC";
        _operationSystem = operationSystem;
        _computerName = computerName;
    }

    int powerOn(){
        _processorType = "Intel Core i5-2400 CPU";
        _fixedMemorySizeGb = 1000;

        return CODE_SUCCESS;
    }

    void powerOff(){
        System.out.println("\nSystem \"" + _computerName + "\" is shut down.");
    }

    @Override
    public String toString() {
        //Another usage of the "super" keyword. We can refer to base class.
        // Multiple inheritance is not allowed in Java, so single "super" keyword is enough
        String result = super.toString();

        result += "Fixed memory size: " + _fixedMemorySizeGb + "\n";
        result += "Operation system: " + _operationSystem + "\n";
        result += "Computer name: " + _computerName + "\n";

        return result;
    }
}
