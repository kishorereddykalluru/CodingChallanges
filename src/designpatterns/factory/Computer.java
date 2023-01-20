package designpatterns.factory;

public abstract class Computer {
    public abstract String getCPU();
    public abstract String getRAM();
    public abstract String getHDD();

    @Override
    public String toString() {
        return "Computer{RAM "+this.getRAM()+"CPU "+this.getCPU() + "HDD "+this.getHDD() + "}";
    }
}
