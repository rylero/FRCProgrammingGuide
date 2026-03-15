import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix6.hardware.TalonFX;
import com.ctre.phoenix6.controls.DutyCycleOut;

public class RollerSubsystem extends SubsystemBase {
    private final TalonFX motor = new TalonFX(0);
    private final DutyCycleOut request = new DutyCycleOut(0);

    public RollerSubsystem() {
    }

    public Command spin() {
        return runEnd(
            () -> motor.setControl(request.withOutput(0.5)),
            () -> motor.setControl(request.withOutput(0))
        );
    }
}
