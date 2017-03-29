package org.usfirst.frc5725.AmyCerberus;

import org.opencv.core.Rect;
import org.opencv.imgproc.Imgproc;

import edu.wpi.cscore.UsbCamera;
import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.vision.VisionThread;
//import edu.wpi.first.wpilibj.vision.VisionPipeline;

public class Camera {
    // Vison tracking variables
	private VisionThread visionThread;
	private double centerX = 0.0;
	private final Object imgLock = new Object();
	private static final int IMG_WIDTH = 320;
	private static final int IMG_HEIGHT = 240;
	
	public Camera()
	{
		enableVisionThread();
	}
	
	public void enableVisionThread()
	{
	       UsbCamera camera1 = CameraServer.getInstance().startAutomaticCapture();
	       camera1.setResolution(IMG_WIDTH, IMG_HEIGHT);
	        
	        visionThread = new VisionThread(camera1, new GripPipeline(), pipeline -> {
	            if (!pipeline.filterContoursOutput().isEmpty()) {
	                Rect r = Imgproc.boundingRect(pipeline.filterContoursOutput().get(0));
	                synchronized (imgLock) {
	                    centerX = r.x + (r.width / 2);
	                    System.out.println("CenterX: " + String.valueOf(centerX));
	                }

	            }
	        });
	        visionThread.start();  
	}
	
	public double getCenterX() {
		return centerX;
	}
}
