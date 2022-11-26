// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.DigitalSource;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {


public final class drivemotor {
    public static final int c_frontleftDriveMotor = 4;
    public static final int c_frontrightDriveMotor = 2;
    public static final int c_backleftDriveMotor = 3;
    public static final int c_backrightDriveMotor = 1;
}
public final class pid {
    public static final double pgain = 0;
    public static final double igain = 0;
    public static final double dgain = 0;
}

    public static int c_joystick = 0;

    
    public static final int c_elevatorMotor = 0;
    public static final DigitalSource encoderpin1 = null;
    public static final DigitalSource encoderpin2 = null;
    public static int c_leftJoystickAxis = 1;
    public static int c_rightJoystickAxis = 5;
    
    public static double c_speedcap = 0.80;//0.75 speed is good. y of xbox times this number.
}
