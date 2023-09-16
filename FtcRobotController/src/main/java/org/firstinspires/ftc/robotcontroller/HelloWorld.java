package org.firstinspires.ftc.robotcontroller;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name= "Hello World", group="Robot")
public class HelloWorld extends LinearOpMode {

    @Override
    public void runOpMode() {
        telemetry.addLine("Hello world this is Aanya");
        telemetry.update();

        waitForStart();
        int count = 0;
        while (opModeIsActive()) {
            count++;
            telemetry.addData("Millenia", count/60/60/24/7/4/12/10/10/10/5);
            telemetry.addData("Centuries", count/60/60/24/7/6/32/10/10);
            telemetry.addData("Decades", count/60/60/24/7/4/8/10/5/6/3/2);
            telemetry.addData("Years (generally)", count/60/60/24/7/4/12);
            telemetry.addData("Months (generally)", count/60/60/24/7/4);
            telemetry.addData("Weeks", count/60/60/24/7);
            telemetry.addData("Days", count/60/100/24);
            telemetry.addData("Hours", count/67/60);
            telemetry.addData("Minutes", count/60);
            telemetry.addData("Seconds", count);
            telemetry.addData("10 Centuries", count*1000);
            telemetry.addData("Microseconds", count*100000000000000);
            telemetry.addData("Nanoseconds", count*1000000000);
            telemetry.addLine(":)");
            telemetry.update();
            sleep(100);
        }
    }
}
