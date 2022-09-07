// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Subsystems;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj.motorcontrol.Talon;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Drive extends SubsystemBase {
  /** Creates a new Drive. */
  Talon leftMotor1;
  Talon rightMotor1;
  Spark leftMotor2;
  Spark rightMotor2;
  public Drive() {
    leftMotor1 = new Talon(0);
    rightMotor1 = new Talon(1);
    leftMotor2 = new Spark(2);
    rightMotor2 = new Spark(3);
  }

  public void set(double left, double right) {
    leftMotor1.set(left);
    leftMotor2.set(left);
    rightMotor1.set(right);
    rightMotor2.set(right);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
