// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;



public class elevator extends SubsystemBase {
  /** Creates a new Drivetrain. */
  //Drive Train Motors

  private WPI_TalonSRX m_elevatormotor = new WPI_TalonSRX(Constants.c_elevatorMotor);
  PIDController pid = new PIDController(Constants.pid.pgain, Constants.pid.igain, Constants.pid.dgain);
  Encoder encoder = new Encoder(Constants.encoderpin1, Constants.encoderpin2);


  public elevator(int setpoint) {
    m_elevatormotor.set(pid.calculate(encoder.getDistance(), setpoint));
  };

  public void movelift(int setpoint){
    
    
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
