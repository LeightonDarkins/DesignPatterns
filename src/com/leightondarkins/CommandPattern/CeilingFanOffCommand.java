package com.leightondarkins.CommandPattern;

public class CeilingFanOffCommand implements Command {
    CeilingFan ceilingFan;
    int previousSpeed;

    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        previousSpeed = ceilingFan.getSpeed();
        ceilingFan.off();
    }

    @Override
    public void undo() {
        if (previousSpeed == CeilingFan.HIGH) {
            ceilingFan.high();
        } else if (previousSpeed == CeilingFan.MEDIUM) {
            ceilingFan.medium();
        } else if (previousSpeed == CeilingFan.LOW) {
            ceilingFan.low();
        } else if (previousSpeed == CeilingFan.OFF) {
            ceilingFan.off();
        }
    }
}