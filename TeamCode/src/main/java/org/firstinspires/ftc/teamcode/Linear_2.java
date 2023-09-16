package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.IMU;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.hardware.rev.RevHubOrientationOnRobot;
import org.firstinspires.ftc.robotcore.external.navigation.AngleUnit;

@TeleOp(name = "Linear")
public class Linear_2 extends LinearOpMode {


    @Override
    public void runOpMode() throws InterruptedException {
        DcMotor linearMotor = hardwareMap.get(DcMotor.class, "mLinear");
        linearMotor.setDirection(DcMotor.Direction.REVERSE);
         waitForStart();

         while (opModeIsActive()) {
             if (gamepad1.right_trigger >= 0.6){
                 linearMotor.setPower(gamepad1.right_trigger);
                 telemetry.addData("going up",linearMotor.getCurrentPosition());
             }
             else if (gamepad1.left_trigger >= 0.6){
                 linearMotor.setPower(-gamepad1.left_trigger);
                 telemetry.addData("going down",linearMotor.getCurrentPosition());
             }
             else{
                 linearMotor.setPower(0);
             }
             sleep(50);

        }
    }

}
