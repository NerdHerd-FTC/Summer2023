package org.firstinspires.ftc.teamcode;

//So much importings
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import org.firstinspires.ftc.teamcode.RobotAutoDriveByEncoder_Linear;
import org.firstinspires.ftc.robotcore.external.hardware.camera.WebcamName;
//These three import statements are have errors even though it is direct copy of the LearnJavaForFTC.pdf page 110
import org.firstinspires.ftc.vision.VisionPortal;
import org.firstinspires.ftc.vision.apriltag.AprilTagDetection;
import org.firstinspires.ftc.vision.apriltag.AprilTagProcessor;


@Autonomous()
public class moveInSquare extends OpMode{

    @Override
    public void init() {
        private AprilTagProcessor aprilTagProcessor;
        private VisionPortal visionPortal;
        telemetry.addLine("Program Initialized");
        telemetry.update();
    }

    //This had an error earlier for some reason but
    //now doesn't because of the abstract next to the public class
    @Override
    public void loop() {
        if(gamepad1.a) {

        }

    }
}
