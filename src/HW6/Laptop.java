package HW6;

import java.util.Objects;

public class Laptop {

    private String brand;
    private String display;
    private String CPU;
    private String RAM;
    private String disk;
    private String OS;
    private String color;
    private String price;

    public Laptop(String brand,String display,String CPU,String RAM,String disk, String OS, String color, String price){

        this.brand = brand;
        this.display = display;
        this.CPU = CPU;
        this.RAM = RAM;
        this.disk = disk;
        this.OS = OS;
        this.color = color;
        this.price = price;
    }


    public String getBrand(){
        return brand;
    }

    public String getDisplay(){
        return display;
    }

    public String getCPU() {
        return CPU;
    }

    public String getRAM(){
        return RAM;
    }

    public String getDisk(){
        return disk;
    }

    public String getOS() {return OS;}

    public String getColor() {return color;}

    public String getPrice() {return price;}


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return Objects.equals(brand, laptop.brand) && Objects.equals(display, laptop.display) && Objects.equals(CPU, laptop.CPU) && Objects.equals(RAM, laptop.RAM) && Objects.equals(disk, laptop.disk) && Objects.equals(OS, laptop.OS) && Objects.equals(color, laptop.color ) && Objects.equals(price, laptop.price);
    }

    @Override
    public int hashCode() {
        return 6 * this.brand.hashCode() + 12 * this.display.hashCode() + 3 * this.CPU.hashCode() + 8 * this.RAM.hashCode() + 3 * this.disk.hashCode() + 8 * this.OS.hashCode() + 8 * this.color.hashCode()  + 8 * this.price.hashCode();
    }

    @Override
    public String toString () {
        return String.format("Модель: %s,  Размер экрана: %s, Процессор: %s, ОЗУ: %s, ЖД: %s, ОС: %s, Цвет: %s, Цена: %s $.\n", this.brand, this.display,this.CPU, this.RAM, this.disk, this.OS, this.color, this.price);
    }
}
