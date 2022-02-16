package cs3560FinalProject;

public class Backroomlocation {
    private String backroomLocationID;
    private short atcapacity;
    
    public Backroomlocation(String backroomLocationID, short atcapacity)
    {
        this.backroomLocationID = backroomLocationID;
        this.atcapacity = atcapacity;
    }
    
    // getters
    public String getBackroomLocationID()
    {
        return backroomLocationID;
    }
    
    public short getAtCapacity()
    {
        return atcapacity;
    }
}