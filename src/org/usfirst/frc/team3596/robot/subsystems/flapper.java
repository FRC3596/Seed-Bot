package org.usfirst.frc.team3596.robot.subsystems;

import org.usfirst.frc.team3596.robot.RobotMap;
import org.usfirst.frc.team3596.robot.commands.flapperOff;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class flapper extends Subsystem {
//The class flapper is reffering to the spinning flaps near the bottom of the robot.
	
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	Talon flapper = new Talon(3);
	
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	
    	setDefaultCommand(new flapperOff());	
    	
    }
    
    public void On() {
    	
    	flapper.set(RobotMap.flapperMaxspeed * 1);
    	
    }
    
    public void Off(){
    	flapper.set(0);
    }
    
}



