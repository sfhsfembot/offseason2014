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
import edu.wpi.first.wpilibj.DoubleSolenoid;
import org.usfirst.frc692.OffSeason2014.RobotMap;
import org.usfirst.frc692.OffSeason2014.commands.*;
import edu.wpi.first.wpilibj.command.Subsystem;
/**
 *
 */
public class PneumaticsForPasserPusher extends Subsystem {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    DoubleSolenoid passerPusher = RobotMap.pneumaticsForPasserPusherpasserPusher;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
	
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void passerPusherPush() 
    {
        passerPusher.set(DoubleSolenoid.Value.kForward);
    }
    //passer pushes 
    //ND 11/03/14
    
    public void passerPusherPull()
    {
        passerPusher.set(DoubleSolenoid.Value.kReverse);
    }
    //passer pulls
    //ND 11/03/14
    
    public void passerPusherStop()
    {
        passerPusher.set(DoubleSolenoid.Value.kOff);
    }
    //passer stops
    //ND 11/03/14
    }
