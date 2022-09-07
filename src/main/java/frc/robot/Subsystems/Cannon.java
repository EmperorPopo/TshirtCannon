// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Cannon extends SubsystemBase {
  /** Creates a new Cannon. */
  CANSparkMax cannonMotor;
  public Cannon() {
    cannonMotor = new CANSparkMax(1, MotorType.kBrushless);
  }

  public void setPosition(double position) {
    double encoderCount = cannonMotor.get() + position;
    while (cannonMotor.get() < encoderCount) {
      cannonMotor.set(1.0);
    }
    cannonMotor.set(0.0);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
