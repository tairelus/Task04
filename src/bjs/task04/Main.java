package bjs.task04;

public class Main {

    public static void main(String[] args) {
	// write your code here
        DesktopComputer desktopComputer = new DesktopComputer("Windows 7, x64", "MyComputer");
        desktopComputer.powerOn();
        System.out.print(desktopComputer.toString());
        desktopComputer.powerOff();
    }
}
