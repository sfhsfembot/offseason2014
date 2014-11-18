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
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.SpeedController;
import org.usfirst.frc692.OffSeason2014.RobotMap;
import org.usfirst.frc692.OffSeason2014.commands.*;
import edu.wpi.first.wpilibj.command.Subsystem;
/**
 *
 */
public class Shooter extends Subsystem {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    SpeedController shooterVictor = RobotMap.shootershooterVictor;
    DigitalInput shooterSwitch = RobotMap.shootershooterSwitch;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
	
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void shootGo()
    {
        shooterVictor.set(1.0);
    }
    //shooter shoots forward with full power 
    //ND 11/03/14
    
    public void shootStop()
    {
        shooterVictor.set(0.0);
    }
    //shooter stops shooting
    //ND 11/03/14
    
    public boolean isShooterLimitPressed()
    {
        if(shooterSwitch.get() == false)
        {
            return true; 
        }
        else
        {
            return false;
        }
        // .get() means that the code will run if the limit is pressed -- add
        // return !x for it to run when not pressed
        // AC 11/17/14
        // checks to see when the shooter limit is pressed
        // AC 11/17/14 
    }
    
    
}
