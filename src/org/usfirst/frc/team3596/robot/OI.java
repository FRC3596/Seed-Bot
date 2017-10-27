package org.usfirst.frc.team3596.robot;

import org.usfirst.frc.team3596.robot.commands.augerOn;
import org.usfirst.frc.team3596.robot.commands.flapperOn;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {

	Joystick driveJoy = new Joystick(0);
	Button  button_X = new JoystickButton(driveJoy, 1),
			button_A = new JoystickButton(driveJoy, 2),
			button_B = new JoystickButton(driveJoy, 3),
			button_Y = new JoystickButton(driveJoy, 4),
			button_LB = new JoystickButton(driveJoy, 5),
			button_RB = new JoystickButton(driveJoy, 6),
			button_LT = new JoystickButton(driveJoy, 7),
			button_RT = new JoystickButton(driveJoy, 8);
	public OI(){
		
	button_X.toggleWhenActive(new flapperOn());
	button_B.toggleWhenActive(new augerOn());	
		
	}
	
	public Joystick getJoystick() {
		return driveJoy;
	}
	
}
