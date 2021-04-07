package Composition;

public class PC {

    private Case lsCase;
    private Monitor monitor;
    private MotherBoard motherBoard;

    public PC(Case lsCase, Monitor monitor, MotherBoard motherBoard) {
        this.lsCase = lsCase;
        this.monitor = monitor;
        this.motherBoard = motherBoard;
    }

    public Case getLsCase() {
        return lsCase;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public MotherBoard getMotherBoard() {
        return motherBoard;
    }
}
