// RobotBuilder Version: 1.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.
package org.usfirst.frc692.OffSeason2014.commands;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc692.OffSeason2014.Robot;
/**
 *
 */
public class  passShooterLimit extends Command {
    public passShooterLimit() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
	
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.shooter);
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    }
    // Called just before this Command runs the first time
    protected void initialize() {
        setTimeout(1.5);
        //shooter will continue until it has passed limit switch
        //ND 11/20/14
    }
    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        Robot.shooter.shootGo();
        //shooter shoots when for 1.5 seconds
        //ND 11/20/14
    }
    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return isTimedOut();
        //shooter ends after 1.5 seconds
        //ND 11/20/14
    }
    // Called once after isFinished returns true
    protected void end() {
        Robot.shooter.shootStop();
        //shooter stops after 1.5 seconds
        //ND 11/20/14
    }
    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
    /*
     * passes limit switch so that shooter can reset itself
     * AC 11/17/14
     */
}
