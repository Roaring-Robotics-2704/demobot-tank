// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;
<<<<<<< Updated upstream
import edu.wpi.first.wpilibj.Timer;
=======
>>>>>>> Stashed changes
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

<<<<<<< Updated upstream
=======

>>>>>>> Stashed changes

    SmartDashboard.putNumber("joystickLeft", joystickLeft);
    SmartDashboard.putNumber("joystickRight", joystickRight);
    SmartDashboard.putNumber("left speed", -joystickLeft*Constants.c_speedcap);
    SmartDashboard.putNumber("right speed", -joystickRight*Constants.c_speedcap);

    
    RobotContainer.m_Drivetrain.tankDrive(-joystickLeft*Constants.c_speedcap, -joystickRight*Constants.c_speedcap);

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
