package frc.robot.subsystem.spinnyboi;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import frc.robot.config.Config;
import frc.robot.subsystem.BitBucketSubsystem;
import frc.robot.utils.talonutils.MotorUtils;



public class SpinnyBoiSubsystem extends BitBucketSubsystem {
    
    WPI_TalonSRX motor;
    
    public SpinnyBoiSubsystem(Config config) {
        super(config);
    }

    public void initialize() {
        super.initialize();
        motor = MotorUtils.makeSRX(config.spinnyboi.spinner);
    }

	public void testInit() {

    }
	
	public void testPeriodic() {

    }
	
	public void diagnosticsCheck() {

    }

    @Override
    public void periodic(float deltaTime) {
        updateBaseDashboard();
    }

    public void rotationControl(){
        //Rotate the wheel 3 - 5 times

        
    }

    public void postitionControl(){
        //Rotate the wheel to the color specified by the FMS
    }

    @Override
    public void dashboardPeriodic(float deltaTime) {
        // TODO Auto-generated method stub

    }

    public void disable(){
        motor.set(0);
    }

}