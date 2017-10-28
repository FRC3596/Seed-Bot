package org.usfirst.frc.team3596.robot.subsystems;

import org.usfirst.frc.team3596.robot.commands.drivetrainEnabled;
import org.usfirst.frc.team3596.robot.RobotMap;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Joystick;

/**
 *
 */
public class drivetrain extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	
	//PWM IMPUTS
	public Talon leftDrive = new Talon(0);
	public Talon rightDrive = new Talon(1);
	
	
	public RobotDrive _driveTrain = new RobotDrive(leftDrive, rightDrive);
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand())
    	setDefaultCommand(new drivetrainEnabled());
    } 
    public void Drive(Joystick driveJoy){
    	_driveTrain.tankDrive(driveJoy.getRawAxis(1) * -1 * RobotMap.driveMaxspeed, driveJoy.getRawAxis(3) * -1 * RobotMap.driveMaxspeed);
    }
    public void EndDrive(){
    	_driveTrain.tankDrive(0,0);
    }
		
}

