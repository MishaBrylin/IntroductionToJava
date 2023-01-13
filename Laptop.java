public class Laptop {
    

    private int ram;
    private int hdd;
    private String operatingSystem;
    private String colour;

    public Laptop(int ram,int hdd,String operatingSystem, String colour){
        this.ram=ram;
        this.hdd=hdd;
        this.operatingSystem=operatingSystem;
        this.colour=colour;
    }
    
    public int getRam() {
        return ram;
    }

    public int getHardDisk() {
        return hdd;
    }

    
    public String getOperatingSystem() {
        return operatingSystem;
    }

    
    public String getColour() {
        return colour;
    }

    @Override
    public String toString() {
	    return "Оперативная память " + ram + "гб, жесткий диск " + hdd + "гб, операционная система " + operatingSystem + ", цвет " + colour + "\n";
    }

    
}
