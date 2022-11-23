// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.GenericHID.RumbleType;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.RobotContainer;

public class DriveRobot extends CommandBase {
  /** Creates a new DriveRobot. */
  public DriveRobot() {
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(RobotContainer.m_Drivetrain);
  }
  Timer danceTime = new Timer();
  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    double joystickLeft = RobotContainer.xbox.getRawAxis(Constants.c_leftJoystickAxis);
    double joystickRight = RobotContainer.xbox.getRawAxis(Constants.c_rightJoystickAxis);

    double joystickTotal = Math.abs(joystickLeft)+Math.abs(joystickRight);
    SmartDashboard.putNumber("joystickTotal",joystickTotal);
    
    double outputLeft = -joystickLeft*Constants.c_speedcap;
    double outputRight = -joystickRight*Constants.c_speedcap;

    RobotContainer.xbox.setRumble(RumbleType.kLeftRumble, outputLeft);
    RobotContainer.xbox.setRumble(RumbleType.kLeftRumble, outputRight);

    SmartDashboard.putNumber("joystickLeft", joystickLeft);
    SmartDashboard.putNumber("joystickRight", joystickRight);
    SmartDashboard.putNumber("left speed", -joystickLeft*Constants.c_speedcap);
    SmartDashboard.putNumber("right speed", -joystickRight*Constants.c_speedcap);

    
    RobotContainer.m_Drivetrain.tankDrive(outputLeft, outputRight);

  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
