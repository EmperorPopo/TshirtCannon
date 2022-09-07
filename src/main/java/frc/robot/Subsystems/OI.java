// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Subsystems;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.Button;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.Robot;
import frc.robot.Commands.Shoot;

/** Add your docs here. */
public class OI {

    XboxController driver;
    XboxController operator;

    public static JoystickButton A, B, X, Y, LB, RB, LM, RM;
    public static JoystickButton A2, B2, X2, Y2, LB2, RB2;
    public static Button leftTrig;
    public static Button rightTrig;
    public static Button leftTrig2;
    public static Button rightTrig2;


    Command aCommandOn, aCommandOff, bCommandOn, bCommandOff, xCommandOn, xCommandOff, yCommandOn, yCommandOff;
    Command lbCommandOn, lbCommandOff, rbCommandOn, rbCommandOff, rtCommandOn, rtCommandOff, ltCommandOn, ltCommandOff;
    Command lmCommandOn, lmCommandOff, rmCommandOn, rmCommandOff; 

    Command aCommandOn2, aCommandOff2, bCommandOn2, bCommandOff2, xCommandOn2, xCommandOff2, yCommandOn2, yCommandOff2;
    Command lbCommandOn2, lbCommandOff2, rbCommandOn2, rbCommandOff2, rtCommandOn2, rtCommandOff2, ltCommandOn2, ltCommandOff2;
    Command lmCommandOn2, lmCommandOff2; 

    
    public OI() {
        //New Controller input
        this.driver = Robot.driver;
        this.operator = Robot.operator;

        A = new JoystickButton(driver, 1);
		B = new JoystickButton(driver, 2);
	    X = new JoystickButton(driver, 3);
		Y = new JoystickButton(driver, 4);
        LB = new JoystickButton(driver, 5);
        RB = new JoystickButton(driver, 6);
        LM = new JoystickButton(driver, 7);
        RM = new JoystickButton(driver, 8);

        rightTrig = new Button() {
			@Override
			public boolean get() {
				return driver.getRawAxis(3) > 0.75;
			}
		};
		leftTrig = new Button() {
			@Override
			public boolean get() {
				return driver.getRawAxis(2) > 0.75;
			}
		};

        A2 = new JoystickButton(operator, 1);
		B2 = new JoystickButton(operator, 2);
	    X2 = new JoystickButton(operator, 3);
		Y2 = new JoystickButton(operator, 4);
        LB2 = new JoystickButton(operator, 5);
        RB2 = new JoystickButton(operator, 6);

        rightTrig2 = new Button() {
			@Override
			public boolean get() {
				return operator.getRawAxis(3) > 0.75;
			}
		};
		leftTrig2 = new Button() {
			@Override
			public boolean get() {
				return operator.getRawAxis(2) > 0.75;
			}
		};




        //A COMMAND: Manually move elevator Up.
        aCommandOn = new Shoot(0.2);
        aCommandOff = new Shoot(-0.0);

        A.whenPressed(aCommandOn);
        A.whenReleased(aCommandOff);

    }

    

}
