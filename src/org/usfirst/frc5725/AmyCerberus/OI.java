// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc5725.AmyCerberus;

import org.usfirst.frc5725.AmyCerberus.commands.*;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.*;
import org.usfirst.frc5725.AmyCerberus.subsystems.*;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);

    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.

    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:

    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());

    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());

    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());


    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public JoystickButton driveToDistance;
    public JoystickButton driveBackToDistance;
    public JoystickButton follow;
    public JoystickButton toggleDirection;
    public JoystickButton latchOpenManual;
    public JoystickButton latchCloseManual;
    public JoystickButton cameraSwitch;
    public Joystick xBoxOne;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public OI() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

        xBoxOne = new Joystick(0);
        
        cameraSwitch = new JoystickButton(xBoxOne, 2);
        cameraSwitch.whenPressed(new CameraSwitch());
        latchCloseManual = new JoystickButton(xBoxOne, 6);
        latchCloseManual.whileHeld(new latchCloseManual());
        latchOpenManual = new JoystickButton(xBoxOne, 5);
        latchOpenManual.whileHeld(new latchOpenManual());
        toggleDirection = new JoystickButton(xBoxOne, 3);
        toggleDirection.whenPressed(new SwitchDirection());
        follow = new JoystickButton(xBoxOne, 8);
        follow.whenPressed(new follow());
        driveBackToDistance = new JoystickButton(xBoxOne, 1);
        driveBackToDistance.whenPressed(new AutoReverse());
        driveToDistance = new JoystickButton(xBoxOne, 4);
        driveToDistance.whenPressed(new AutoDrop());


        // SmartDashboard Buttons
        SmartDashboard.putData("Autonomous Command", new AutonomousCommand());
        SmartDashboard.putData("DriveWithJoystick", new DriveWithJoystick());
        SmartDashboard.putData("driveToDistance", new driveToDistance());
        SmartDashboard.putData("HDriveJoystick", new HDriveJoystick());
        SmartDashboard.putData("driveBackToDistance", new driveBackToDistance());
        SmartDashboard.putData("follow", new follow());
        SmartDashboard.putData("Climb", new Climb());
        SmartDashboard.putData("SwitchDirection", new SwitchDirection());
        SmartDashboard.putData("latchClose", new latchClose());
        SmartDashboard.putData("latchOpen", new latchOpen());
        SmartDashboard.putData("AutoDrop", new AutoDrop());
        SmartDashboard.putData("AutoReverse", new AutoReverse());
        SmartDashboard.putData("latchOpenManual", new latchOpenManual());
        SmartDashboard.putData("latchCloseManual", new latchCloseManual());
        SmartDashboard.putData("autoForwardBack", new autoForwardBack());
        SmartDashboard.putData("kickForward", new kickForward());
        SmartDashboard.putData("CameraSwitch", new CameraSwitch());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    public Joystick getxBoxOne() {
        return xBoxOne;
    }


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
}
