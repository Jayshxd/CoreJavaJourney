package oop.interfaces;

public class MyCar {
    Engine engine;
    Brake brake;
    Media player = new CDPlayer();

    MyCar() {
        engine = new PowerEngine();
        brake = new PowerBrake();
    }

    MyCar(Engine engine, Brake brake) {
        this.engine = engine;
        this.brake = brake;
    }

    void start() {
        engine.start();
    }
    void stop() {
        engine.stop();
    }
    void accelerate() {
        engine.acc();
    }
    void brake(){
        brake.apply();
    }
    void startMedia(){
        player.start();
    }
    void stopMedia(){
        player.stop();
    }


}
