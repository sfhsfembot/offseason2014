// RobotBuilder Version: 1.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.
package org.usfirst.frc692.OffSeason2014;
    
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import java.util.Vector;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static SpeedController driveTrainleftDriveForward1;
    public static SpeedController driveTrainleftDriveRear2;
    public static SpeedController driveTrainrightDriveForward3;
    public static SpeedController driveTrainrightDriveRear4;
    public static RobotDrive driveTrainrobotDrive;
    public static SpeedController shootershooterVictor;
    public static DigitalInput shootershooterSwitch;
    public static SpeedController gatherergathererVictor;
    public static DoubleSolenoid gatherergathererPiston;
    public static Compressor pneumaticsairCompressor;
    public static DoubleSolenoid pneumaticsForDrivehighLowShift;
    public static DoubleSolenoid pneumaticsForPasserPusherpasserPusher;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveTrainleftDriveForward1 = new Victor(1, 1);
	LiveWindow.addActuator("DriveTrain", "leftDriveForward1", (Victor) driveTrainleftDriveForward1);
        
        driveTrainleftDriveRear2 = new Victor(1, 2);
	LiveWindow.addActuator("DriveTrain", "leftDriveRear2", (Victor) driveTrainleftDriveRear2);
        
        driveTrainrightDriveForward3 = new Victor(1, 3);
	LiveWindow.addActuator("DriveTrain", "rightDriveForward3", (Victor) driveTrainrightDriveForward3);
        
        driveTrainrightDriveRear4 = new Victor(1, 4);
	LiveWindow.addActuator("DriveTrain", "rightDriveRear4", (Victor) driveTrainrightDriveRear4);
        
        driveTrainrobotDrive = new RobotDrive(driveTrainleftDriveForward1, driveTrainleftDriveRear2,
              driveTrainrightDriveForward3, driveTrainrightDriveRear4);
	
        driveTrainrobotDrive.setSafetyEnabled(true);
        driveTrainrobotDrive.setExpiration(0.1);
        driveTrainrobotDrive.setSensitivity(0.5);
        driveTrainrobotDrive.setMaxOutput(1.0);
        shootershooterVictor = new Victor(1, 5);
	LiveWindow.addActuator("Shooter", "shooterVictor", (Victor) shootershooterVictor);
        
        shootershooterSwitch = new DigitalInput(1, 2);
	LiveWindow.addSensor("Shooter", "shooterSwitch", shootershooterSwitch);
        
        gatherergathererVictor = new Victor(1, 6);
	LiveWindow.addActuator("Gatherer", "gathererVictor", (Victor) gatherergathererVictor);
        
        gatherergathererPiston = new DoubleSolenoid(1, 5, 6);      
	
        
        pneumaticsairCompressor = new Compressor(1, 1, 1, 1);
	
        
        pneumaticsForDrivehighLowShift = new DoubleSolenoid(1, 1, 2);      
	
        
        pneumaticsForPasserPusherpasserPusher = new DoubleSolenoid(1, 3, 4);      
	
        
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
