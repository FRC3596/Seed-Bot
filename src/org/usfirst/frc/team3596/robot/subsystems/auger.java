package org.usfirst.frc.team3596.robot.subsystems;

import org.usfirst.frc.team3596.robot.commands.augerOff;
import org.usfirst.frc.team3596.robot.RobotMap;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class auger extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	Talon _auger = new Talon(RobotMap.candyAuger);
	

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	
    	setDefaultCommand(new augerOff());	
    }
    
    public void On(){
    	
    	_auger.set(RobotMap.augerMaxspeed * -1);
    
    }
    
    public void Off(){
    	_auger.set(0);
    }
    
    
}



