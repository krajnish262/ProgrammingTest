package com.example.selfprogrammingtest;

abstract class Machine {
    int weight;

    void start() {
        System.out.println("machine is running");
    }
}

abstract class ElectronicDevice extends Machine {
    String colors;
    int dimension[];

}

class Camera {
    private String Compny;
    private int megaPixel;

    public Camera(String compny, int megaPixel) {
        Compny = compny;
        this.megaPixel = megaPixel;
    }

    void run() {
        System.out.println(this.Compny + " " + this.megaPixel + " " + " camera is running");
    }
}

class AudioDevice {
    void run() {
        System.out.println("Audio player is running");
    }
}

class SimCard {
    private String compny;

    public SimCard(String compny) {
        this.compny = compny;
    }

    void run() {
        System.out.println(this.compny + " " + "sim card is running");
    }
}

class ExternalMemory {
    private int memory;

    public ExternalMemory(int memory) {
        this.memory = memory;
    }

    void run() {
        System.out.println(this.memory + " " + " Gb is external memory is running");
    }
}

class TouchScreen {
    private String compny;
    private String resolution;

    public TouchScreen(String compny, String resolution) {
        this.compny = compny;
        this.resolution = resolution;
    }

    void run() {
        System.out.println(this.compny + " " + this.resolution + " Touch screen is running");
    }
}

interface CameraFeatures {
    void cameraFeatureName();

}

interface Webbrowser {
    void webBrowserName();

}

abstract class SmartPhone extends ElectronicDevice implements CameraFeatures, Webbrowser {
    String IMEI_Number;

}

interface MobileOs {
    void OsName();

}

abstract class AndroidMobile extends SmartPhone implements MobileOs {


    public void webBrowserName() {
        System.out.println("Chrome browser is running");
    }


    public void OsName() {
        System.out.println("Android Os is running");

    }
}

interface ThirdpartyUi {
    void UiFeatures();
}

class SamsungGalaxy8 extends AndroidMobile implements ThirdpartyUi {
    int weight = 200;
    String colors = "silver";
    int[] dimension = {120, 70, 100};
    private SimCard simCard;
    private ExternalMemory externalMemory;
    private final String IMEI_Number = "11223344556677";
    private final Camera camera;
    private final AudioDevice audioDevice;
    private final TouchScreen touchScreen;

    SamsungGalaxy8(SimCard simCard, ExternalMemory externalMemory) {
        this.simCard = simCard;
        this.externalMemory = externalMemory;
        this.camera = new Camera("Sony", 48);
        this.audioDevice = new AudioDevice();
        this.touchScreen = new TouchScreen("Mi LED Screen", "Full HD");
    }

    void start() {
        System.out.println("mobile is started");
        this.OsName();
        this.webBrowserName();
        this.touchScreen.run();
    }

    @Override
    public void cameraFeatureName() {
        System.out.println("Samsung Camera feature is running");

    }

    @Override
    public void UiFeatures() {
        System.out.println("Samsung touch ui feature is running");

    }

    void startCamera() {
        this.cameraFeatureName();
        this.camera.run();
    }

    void startBrowser() {
        this.webBrowserName();


    }

    void startAudio() {
        this.audioDevice.run();
    }

    String getIMEI() {
        return this.IMEI_Number;

    }
}

public class OopsTest {
    public static void main(String[] args) {
        SimCard simCard = new SimCard("Airtel");
        ExternalMemory externalMemory = new ExternalMemory(128);
        SamsungGalaxy8 samsungGalaxy8 = new SamsungGalaxy8(simCard, externalMemory);
        samsungGalaxy8.start();
        samsungGalaxy8.startAudio();
        samsungGalaxy8.startBrowser();
        samsungGalaxy8.startCamera();

    }
}
