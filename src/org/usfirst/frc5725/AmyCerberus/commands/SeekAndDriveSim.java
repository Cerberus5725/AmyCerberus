// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc5725.AmyCerberus.commands;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc5725.AmyCerberus.Robot;

/**
 *
 */
public class SeekAndDriveSim extends Command {

	private boolean finish = false;
	private double precision = Robot.driveTrain.precision;
	private double target = Robot.driveTrain.target;
	private double delayTime = Robot.driveTrain.delayTime;
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS
 
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
    public SeekAndDriveSim() {

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.driveTrain);

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	while (Robot.driveTrain.getDistanceToObject() > Robot.driveTrain.setPointForwardSim && Math.abs(Robot.oi.getxBoxOne().getX()) < 0.1 && Math.abs(Robot.oi.getxBoxOne().getY()) < 0.1)
    	{
        	double center = Robot.camera.getCenterX();
        	double distanceToTarget = target - center; 
        	// If not aiming at the target 
    		if(Math.abs(distanceToTarget) > precision && Math.abs(Robot.oi.getxBoxOne().getX()) < 0.1 && Math.abs(Robot.oi.getxBoxOne().getY()) < 0.1)
    		{
    			center = Robot.camera.getCenterX();
    			distanceToTarget = target - center;
    			//Logs
    			//System.out.println("Set Target: " + String.valueOf(target));
        		System.out.println("Center of Object: " + String.valueOf(center));
        		System.out.println("Distance to Target: " + String.valueOf(distanceToTarget));
        		System.out.println("Range Finder: " + String.valueOf(Robot.driveTrain.getDistanceToObject()));

    			// Turn based on the value from above.  Eventually distanceToObject 
    			//Will come from vision tracking
        		//Delays the look
        		Timer.delay(delayTime);
        		if(distanceToTarget > 0)
        		{
        			// TurnLeft
        			//Robot.driveTrain.driveLeft();
        			Robot.driveTrain.veerLeft();
        			
        		}
        		else if(distanceToTarget < 0)
        		{
        			// TurnRight
        			//Robot.driveTrain.driveRight();
        			Robot.driveTrain.veerRight();
        		}
    		}	
    		else
    		{
    		Robot.driveTrain.driveStraightSim();
    		}

    	}
    	finish = true;
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return finish;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.driveTrain.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
