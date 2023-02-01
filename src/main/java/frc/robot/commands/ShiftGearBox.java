// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.InstantCommand;
import frc.robot.subsystems.GearboxShift;

// NOTE:  Consider using this command inline, rather than writing a subclass.  For more
// information, see:
// https://docs.wpilib.org/en/stable/docs/software/commandbased/convenience-features.html
public class ShiftGearBox extends InstantCommand {

  private final GearboxShift m_gearboxShift;
  private boolean m_shiftHigh;
  public ShiftGearBox(boolean shiftHigh, GearboxShift subsystem) {
    m_shiftHigh = shiftHigh;
    m_gearboxShift = subsystem;
    addRequirements(m_gearboxShift);
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    if(m_shiftHigh){
      m_gearboxShift.myHighGear();
    }else{
      m_gearboxShift.myHighGear();
    }
  }

}
