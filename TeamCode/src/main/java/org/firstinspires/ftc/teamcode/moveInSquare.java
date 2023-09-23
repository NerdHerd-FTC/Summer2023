package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

@Autonomous()
public abstract class moveInSquare extends OpMode{

    private DcMotor frontLeftMotor;
    private DcMotor frontRightMotor;
    private DcMotor backLeftMotor;
    private DcMotor backRightMotor;
    @Override
    public void init() {
        telemetry.addLine("Program Initialized");
        telemetry.update();
    }

    public void loop() {
        frontLeftMotor.setPower(1);
        frontRightMotor.setPower(1);
    }
}
