public class Plane {
    private String planeType;
    private PlaneType planeModelType;


    public Plane(PlaneType planeModelType){
        this.planeModelType = planeModelType;
    }

    public String getPlaneType(){
        return this.planeType;
    }


}
