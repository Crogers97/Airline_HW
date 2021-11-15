public class Pilot {
    private String name;
    private String rank;
    private String PLNumber;

    public Pilot(String name, String rank, String PLNumber){
        this.name= name;
        this.rank = rank;
        this.PLNumber = PLNumber;
    }

    public String getPLNumber(){
        return this.PLNumber;
    }
}
