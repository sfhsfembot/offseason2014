// RobotBuilder Version: 1.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.
package org.usfirst.frc692.OffSeason2014.subsystems;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import org.usfirst.frc692.OffSeason2014.RobotMap;
import org.usfirst.frc692.OffSeason2014.commands.*;
import edu.wpi.first.wpilibj.command.Subsystem;
/**
 *
 */
public class DriveTrain extends Subsystem {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    SpeedController leftDriveForward1 = RobotMap.driveTrainleftDriveForward1;
    SpeedController leftDriveRear2 = RobotMap.driveTrainleftDriveRear2;
    SpeedController rightDriveForward3 = RobotMap.driveTrainrightDriveForward3;
    SpeedController rightDriveRear4 = RobotMap.driveTrainrightDriveRear4;
    RobotDrive robotDrive = RobotMap.driveTrainrobotDrive;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
        setDefaultCommand(new driveWithTwoJoysticks());
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
	
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void takeJoystickAxisValues(double LeftDrive, double RightDrive)
    {
        robotDrive.tankDrive(LeftDrive, RightDrive);
    }
    
    public void autonMoveForward() {
        robotDrive.drive(1.0, 0.0);
    }
    // robot goes with no curve 100% forward
    // ND 12/8/14
    
    public void autonStop() {
        robotDrive.drive(0.0, 0.0);
    }
    // robot stops with no curve
    // ND 12/8/14
}
