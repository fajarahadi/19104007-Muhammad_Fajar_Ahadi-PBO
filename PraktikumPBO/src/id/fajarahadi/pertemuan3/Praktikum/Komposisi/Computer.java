package id.fajarahadi.pertemuan3.Praktikum.Komposisi;

public class Computer {
    private String type;
    private Keyboard keyboard;
    private Mouse mouse;
    private Monitor monitor;
    private Cpu cpu;

    public Computer(String type) {
        this.type = type;
    }

    public void addComponent(Keyboard keyboard, Mouse mouse, Monitor monitor, Cpu cpu) {
        this.keyboard = keyboard;
        this.mouse = mouse;
        this.monitor = monitor;
        this.cpu = cpu;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }
}
