// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc5725.AmyCerberus.subsystems;

import org.usfirst.frc5725.AmyCerberus.RobotMap;
import org.usfirst.frc5725.AmyCerberus.commands.*;
import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.VictorSP;

import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class DriveTrain extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private final SpeedController leftFront = RobotMap.driveTrainLeftFront;
    private final SpeedController leftBack = RobotMap.driveTrainLeftBack;
    private final SpeedController rightFront = RobotMap.driveTrainRightFront;
    private final SpeedController rightBack = RobotMap.driveTrainRightBack;
    private final RobotDrive drive = RobotMap.driveTrainDrive;
    private final AnalogInput rangeFinder = RobotMap.driveTrainRangeFinder;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
     public double setPointForward = 0.21;
     public double setPointBack = 0.3;
     public double setPointMiddle = (setPointForward + setPointBack)/2;
     public double turnTime = 2.7;
     public double driveTime = 1.8;
     // Vision tracking variables
     // Variables likely with the most success to date(190,10,0.5,0.32)
 	 public double target = 160;
 	 public double precision = 10.0;
 	 public double delayTime = 0.7;
 	 public double stopTime = 2.0;
 	 private double turnAuto = 0.35;
 	 /* Separate Simultaneous turn and drive variables due to the need to go
 	 slower to read vision from the camera  */
 	 public double setPointForwardSim = 0.195;
 	 private double simAuto = 0.55;
 	 
 	 public boolean reversed = false;
     // speeds
     private double speedAuto = 0.65;
     private double backAuto = 0.5;
     private double speed = 1.0;
     private double timedSpeed = 0.7;
     private double slowVeer = 0.45;
     private double fastVeer = 0.55;
     
   
     

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        setDefaultCommand(new DriveWithJoystick());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }
    
    public void driveWithJoysticks(double rotate, double move)
    {
    	
    	if(reversed == false)
    	{
    		drive.arcadeDrive(rotate, move);	
    	}
    	else
    	{
    		drive.arcadeDrive(rotate, -move);
    	}
    	//System.out.print("Rotate: " + String.valueOf(rotate) + " ");
    	//System.out.print("Move: " + String.valueOf(move) + " ");
    	//System.out.println("Range Finder: " + String.valueOf(rangeFinder.getAverageVoltage()));
    }
    
    public void driveStraight()
    {
    	drive.tankDrive(speedAuto, -speedAuto);
    }
    public void driveStraightSim()
    {
    	drive.tankDrive(simAuto, -simAuto);
    }
    
    public void driveStraightBack()
    {
    	drive.tankDrive(-backAuto, backAuto);
    }
    
    public void driveLeft()
    {
    	drive.tankDrive(-turnAuto, -turnAuto);
    }
    
    public void driveRight()
    {
    	drive.tankDrive(turnAuto, turnAuto);
    }
    
    public void veerLeft()
    {
    	drive.tankDrive(slowVeer, -fastVeer);
    }
    
    public void veerRight()
    {
    	drive.tankDrive(fastVeer, -slowVeer);
    }
    
    //For the timed commands
    public void driveForwardTimed()
    {
    	drive.tankDrive(timedSpeed, -timedSpeed);
    }

    
    public double getDistanceToObject()
    {
    	//Rangefinder log code
    	//System.out.println("Range Finder: " + String.valueOf(rangeFinder.getAverageVoltage()));
    	return rangeFinder.getAverageVoltage();	
    }
    
    public void stop()
    {
    	drive.arcadeDrive(0, 0);
    }
    
    public void switchDirection()
    {
    	if(reversed == false)
    	{
    		reversed = true;
    	}
    	else
    	{
    		reversed = false;
    	}
    }
    
    
}

