package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp(name="Hello World",group="Robot")
public class Hello_World extends LinearOpMode {
    public DcMotor leftMotor = null;
    public DcMotor rightMotor = null;

    //public Servo Claw=null;
    @Override
    public void runOpMode() {
        telemetry.addLine("Hello World");
        telemetry.update();
        leftMotor = hardwareMap.get(DcMotor.class, "MotorA");
        rightMotor = hardwareMap.get(DcMotor.class,"MotorB");

        leftMotor.setDirection(DcMotor.Direction.REVERSE);
        rightMotor.setDirection(DcMotor.Direction.FORWARD);

        leftMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        rightMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        leftMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        rightMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

        //Claw=hardwareMap.get(Servo.class,"Servo1");

        double leftSpeed;
        double rightSpeed;
        //double clawPosition=0;

        waitForStart();
        while (opModeIsActive()) {
            if (gamepad1.b) {
                telemetry.addData("gamepad1.b", gamepad1.b);
            }

            telemetry.addData("gamepad1.left_stick_y", gamepad1.left_stick_y);
            leftMotor.setPower(gamepad1.left_stick_y);
            telemetry.addData("gamepad1.right_stick_y", gamepad1.right_stick_y);
            rightMotor.setPower(gamepad1.right_stick_y);

            if  (gamepad1.right_bumper||gamepad1.left_bumper){
            //don't need    telemetry.addData("gamepad1.right_bumper",gamepad1.right_bumper);
                telemetry.addLine("claw closed");
                //clawPosition=0.7;
                //Claw.setPosition(clawPosition);
            }
            else if (gamepad1.right_bumper&&gamepad1.left_bumper){
                telemetry.addLine("Claw Opened");
                //clawPosition=0.3;
                //Claw.setPosition(clawPosition);
            }
            telemetry.update();
            sleep(50);

        }
    }
}
