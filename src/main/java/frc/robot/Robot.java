package frc.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

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

  private static XboxController driver = new XboxController(0);

  private static final String kDefaultAuto = "Default";
  private static final String kCustomAuto = "My Auto";
  private String m_autoSelected;
  private final SendableChooser<String> m_chooser = new SendableChooser<>();

  @Override
  public void robotInit() {
    m_chooser.setDefaultOption("Default Auto", kDefaultAuto);
    m_chooser.addOption("My Auto", kCustomAuto);
    SmartDashboard.putData("Auto choices", m_chooser);
  }

  @Override
  public void robotPeriodic() {}
  
  @Override
  public void autonomousInit() {
    m_autoSelected = m_chooser.getSelected();
    System.out.println("Auto selected: " + m_autoSelected);
  }

  @Override
  public void autonomousPeriodic() {
    switch (m_autoSelected) {
      case kCustomAuto:
        break;
      case kDefaultAuto:
      default:
        break;
    }
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
