package com.leightondarkins.CommandPattern;

import java.rmi.Remote;

public class Main {
    public static void main(String[] args) {
        System.out.println("CommandPattern");

        Light livingRoomLight = new Light();
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

        RemoteControl remoteControl = new RemoteControl();

        System.out.println(remoteControl.toString());

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);

        System.out.println(remoteControl.toString());

        System.out.println("Living Room Light Is On: " + livingRoomLight.isOn());


        remoteControl.onButtonPushed(0);

        System.out.println("Living Room Light Is On: " + livingRoomLight.isOn());

        remoteControl.offButtonPushed(0);

        System.out.println("Living Room Light Is On: " + livingRoomLight.isOn());

        remoteControl.undoButtonWashPushed();

        System.out.println("Living Room Light Is On: " + livingRoomLight.isOn());
    }
}
