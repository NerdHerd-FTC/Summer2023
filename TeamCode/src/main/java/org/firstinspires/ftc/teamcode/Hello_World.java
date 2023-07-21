package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name="Hello World",group="Robot")
public class Hello_World extends LinearOpMode {
    @Override
    public void runOpMode() {
        telemetry.addLine("Hello World");
        telemetry.update();
        waitForStart();
        while (opModeIsActive()) {
            if (gamepad1.b) {
                telemetry.addData("gamepad1.b", gamepad1.b);
            }
            if (Math.abs(gamepad1.left_stick_x) >= 0.5) {
                telemetry.addData("gamepad1.left_stick_x", gamepad1.left_stick_x);
            }
            if  (gamepad1.right_bumper||gamepad1.left_bumper){
            //don't need    telemetry.addData("gamepad1.right_bumper",gamepad1.right_bumper);
                telemetry.addLine("claw closed");
            }
            else if (gamepad1.right_bumper&&gamepad1.left_bumper){
                telemetry.addLine("Claw Opened");
            }
            telemetry.update();

        }
    }
}
