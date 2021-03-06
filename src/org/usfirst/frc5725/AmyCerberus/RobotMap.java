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

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.VictorSP;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static SpeedController driveTrainLeftFront;
    public static SpeedController driveTrainLeftBack;
    public static SpeedController driveTrainRightFront;
    public static SpeedController driveTrainRightBack;
    public static RobotDrive driveTrainDrive;
    public static AnalogInput driveTrainRangeFinder;
    public static SpeedController hDrivehDrive;
    public static SpeedController climberclimberController;
    public static SpeedController latchDrive;
    public static Servo kickerKicker;
    public static Servo cameraRotatorCameraRotator;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveTrainLeftFront = new VictorSP(3);
        LiveWindow.addActuator("DriveTrain", "LeftFront", (VictorSP) driveTrainLeftFront);
        
        driveTrainLeftBack = new VictorSP(4);
        LiveWindow.addActuator("DriveTrain", "LeftBack", (VictorSP) driveTrainLeftBack);
        
        driveTrainRightFront = new VictorSP(5);
        LiveWindow.addActuator("DriveTrain", "RightFront", (VictorSP) driveTrainRightFront);
        
        driveTrainRightBack = new VictorSP(6);
        LiveWindow.addActuator("DriveTrain", "RightBack", (VictorSP) driveTrainRightBack);
        
        driveTrainDrive = new RobotDrive(driveTrainLeftFront, driveTrainLeftBack,
        driveTrainRightFront, driveTrainRightBack);
        
        driveTrainDrive.setSafetyEnabled(true);
        driveTrainDrive.setExpiration(0.1);
        driveTrainDrive.setSensitivity(0.5);
        driveTrainDrive.setMaxOutput(1.0);
        driveTrainDrive.setInvertedMotor(RobotDrive.MotorType.kFrontLeft, true);
        driveTrainDrive.setInvertedMotor(RobotDrive.MotorType.kRearLeft, true);
       
        driveTrainRangeFinder = new AnalogInput(2);
        LiveWindow.addSensor("DriveTrain", "RangeFinder", driveTrainRangeFinder);
        
        hDrivehDrive = new VictorSP(7);
        LiveWindow.addActuator("HDrive", "hDrive", (VictorSP) hDrivehDrive);
        
        climberclimberController = new VictorSP(8);
        LiveWindow.addActuator("Climber", "climberController", (VictorSP) climberclimberController);
        
        latchDrive = new VictorSP(9);
        LiveWindow.addActuator("Latch", "Drive", (VictorSP) latchDrive);
        //driveTrainDrive.setInvertedMotor(latchDrive, true);
        kickerKicker = new Servo(0);
        LiveWindow.addActuator("Kicker", "Kicker", kickerKicker);
        
        cameraRotatorCameraRotator = new Servo(1);
        LiveWindow.addActuator("CameraRotator", "CameraRotator", cameraRotatorCameraRotator);
        

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
