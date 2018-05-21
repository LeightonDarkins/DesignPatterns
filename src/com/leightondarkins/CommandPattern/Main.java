package com.leightondarkins.CommandPattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("CommandPattern");

//        Basic Command Pattern

        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light();
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);

        System.out.println(remoteControl.toString());

        System.out.println("Living Room Light Is On: " + livingRoomLight.isOn());


        remoteControl.onButtonPushed(0);

        System.out.println("Living Room Light Is On: " + livingRoomLight.isOn());

        remoteControl.offButtonPushed(0);

        System.out.println("Living Room Light Is On: " + livingRoomLight.isOn());

        remoteControl.undoButtonWashPushed();

        System.out.println("Living Room Light Is On: " + livingRoomLight.isOn());

//        Commands Using State
//
//        RemoteControl remoteControl = new RemoteControl();
//
//        CeilingFan ceilingFan = new CeilingFan("Living Room");
//        CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
//        CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(ceilingFan);
//        CeilingFanLowCommand ceilingFanLow = new CeilingFanLowCommand(ceilingFan);
//        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);
//
//        remoteControl.setCommand(0, ceilingFanHigh, ceilingFanOff);
//        remoteControl.setCommand(1, ceilingFanMedium, ceilingFanOff);
//        remoteControl.setCommand(2, ceilingFanLow, ceilingFanOff);
//
//        System.out.println(remoteControl.toString());
//
//        System.out.println(ceilingFan.getSpeed());
//
//        remoteControl.onButtonPushed(0);
//        System.out.println(remoteControl.toString());
//
//        System.out.println(ceilingFan.getSpeed());
//
//        remoteControl.onButtonPushed(2);
//        System.out.println(remoteControl.toString());
//
//        System.out.println(ceilingFan.getSpeed());
//
//        remoteControl.undoButtonWashPushed();
//        System.out.println(remoteControl.toString());
//
//        System.out.println(ceilingFan.getSpeed());

//        Macro Command Pattern

//        RemoteControl remoteControl = new RemoteControl();
//
//        Light light = new Light();
//        LightOnCommand lightOn = new LightOnCommand(light);
//        LightOffCommand lightOff = new LightOffCommand(light);
//
//        CeilingFan ceilingFan = new CeilingFan("Living Room");
//        CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
//        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);
//
//        Command[] partyOn = {lightOn, ceilingFanHigh};
//        Command[] partyOff = {lightOff, ceilingFanOff};
//        MacroCommand partyOnMacro = new MacroCommand(partyOn);
//        MacroCommand partyOffMacro = new MacroCommand(partyOff);
//
//        remoteControl.setCommand(0, partyOnMacro, partyOffMacro);
//
//        System.out.println(remoteControl.toString());
//
//        remoteControl.onButtonPushed(0);
//
//        System.out.println(remoteControl.toString());
//        System.out.println(light.isOn());
//        System.out.println(ceilingFan.getSpeed());
//
//        remoteControl.offButtonPushed(0);
//
//        System.out.println(remoteControl.toString());
//        System.out.println(light.isOn());
//        System.out.println(ceilingFan.getSpeed());
//
//        remoteControl.undoButtonWashPushed();
//
//        System.out.println(remoteControl.toString());
//        System.out.println(light.isOn());
//        System.out.println(ceilingFan.getSpeed());

//        Command Pattern With Lambdas
//        only works where the command interface has only one method .execute() in this case...

//        RemoteControl remoteControl = new RemoteControl();
//
//        Light light = new Light();
//        remoteControl.setCommand(0, light::on, light::off);
//        remoteControl.setCommand(1, () -> { light.on(); }, () -> { light.off(); });
//
//        remoteControl.onButtonPushed(0);
//
//        System.out.println(remoteControl.toString());
//        System.out.println(light.isOn());
    }
}
