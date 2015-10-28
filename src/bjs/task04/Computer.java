package bjs.task04;

/**
 * Created by U-1 on 28.10.2015.
 */
abstract public class Computer {
    static final int CODE_SUCCESS = 0;

    protected String _computerType;
    protected String _processorType;
    protected Float _processorClockRateGHz;
    protected Float _randomAccessMemorySizeGb;

    //Default scope for methods and variables is "public" in Java unlike C++ where default scope is "private"
    Computer() {
    }

    Computer(float processorClockRateGHz, float randomAccessMemorySizeGb) {
        _processorClockRateGHz = processorClockRateGHz;
        _randomAccessMemorySizeGb = randomAccessMemorySizeGb;
    }

    abstract int powerOn();
    abstract void powerOff();

    @Override
    public String toString() {
        //toString() method defined for all existing Java objects and can be overridden for user-defined objects
        String result;
        result = "Computer type: " + _computerType + "\n";
        result += "Processor type: " + _processorType + "\n";

        //Use toString() method of the Float Java objects
        result += "Processor clock rate: " + _processorClockRateGHz.toString() + "\n";
        result += "Random access memory size: " + _randomAccessMemorySizeGb.toString()  + "\n";

        return result;
    }
}
