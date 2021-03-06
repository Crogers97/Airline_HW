public enum CabinCrewType {

    CAPTAIN("Captain"),
    FIRSTOFFICER("First Officer"),
    PURSER("Purser"),
    FLIGHTATTENDANT("Flight Attendant");

    private final String rank;

    CabinCrewType(String rank){
        this.rank = rank;
    }

    public String getRank(){
        return this.rank;
    }

}
