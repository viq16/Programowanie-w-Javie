package Storage.pack.coordinates;

public class Coordinates {
    private int w;
    private int l;
    private int h;

    /*
     *Constructor with 3 parameters: w-width, l-length, h-height
     */
    public Coordinates(int w, int l, int h) {
        this.w = w;
        this.l = l;
        this.h = h;
    }

    /*
     *Set new coordinates: w-width, l-length, h-height
     */
    public void setCoordinatesWLH(int w,int l, int h){
        this.w = w;
        this.l = l;
        this.h = h;
    }

    /*
     *checks if Coordinates are not wrong  -> {-1,-1,-1}
     */
    public boolean areCordsProper(){
        boolean check=true;
        if(this.w == -1){
            check=false;
        }
        return check;
    }

    /*
     *toString method
     */
    @Override
    public String toString() {
        return "Coordinates{" +
                "w=" + w +
                ", l=" + l +
                ", h=" + h +
                '}';
    }

    /*
     *get methods
     */
    public int getW() {
        return w;
    }

    public int getL() {
        return l;
    }

    public int getH() { return h; }
}
