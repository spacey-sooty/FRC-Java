package frc.robot;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.TimedRobot;

public class Robot extends TimedRobot {
private static WPI_TalonSRX shooterMotor1 = new WPI_TalonSRX(4);
private static WPI_TalonSRX shooterMotor2 = new WPI_TalonSRX(12);

private static WPI_VictorSPX intakeMotor = new WPI_VictorSPX(11);

private static WPI_TalonSRX DrivebaseLeft1 = new WPI_TalonSRX(3);
private static WPI_TalonSRX DrivebaseLeft2 = new WPI_TalonSRX(7);
private static WPI_TalonSRX DrivebaseLeft3 = new WPI_TalonSRX(16);

private static WPI_TalonSRX DrivebaseRight1 = new WPI_TalonSRX(1);
private static WPI_TalonSRX DrivebaseRight2 = new WPI_TalonSRX(5);
private static WPI_TalonSRX DrivebaseRight3 = new WPI_TalonSRX(6);

private static Compressor compressor = new Compressor(6, edu.wpi.first.wpilibj.PneumaticsModuleType.CTREPCM);
private static DoubleSolenoid solenoid = new DoubleSolenoid(6, edu.wpi.first.wpilibj.PneumaticsModuleType.CTREPCM, 0, 1);

private static XboxController driver = new XboxController(0);

@Override
  public void robotInit() {
    compressor.isEnabled();
  }

  @Override
  public void robotPeriodic() {}
  
  @Override
  public void autonomousInit() {
    shooterMotor1.set(ControlMode.PercentOutput, 0.95);
    shooterMotor2.set(ControlMode.PercentOutput, 0.95);
  }

  @Override
  public void autonomousPeriodic() {
    DrivebaseLeft1.set(ControlMode.PercentOutput, 0.4);
    DrivebaseLeft2.set(ControlMode.PercentOutput, 0.4);
    DrivebaseLeft3.set(ControlMode.PercentOutput, 0.4);
    DrivebaseRight1.set(ControlMode.PercentOutput, 0.4);
    DrivebaseRight2.set(ControlMode.PercentOutput, 0.4);
    DrivebaseRight3.set(ControlMode.PercentOutput, 0.4);
  }

  @Override
  public void teleopInit() {}

  @Override
  public void teleopPeriodic() {}

  @Override
  public void disabledInit() {}

  @Override
  public void disabledPeriodic() {}

  @Override
  public void testInit() {}

  @Override
  public void testPeriodic() {}
}
