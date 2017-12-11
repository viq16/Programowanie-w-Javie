package Storage.pack;

import Storage.pack.coordinates.Coordinates;
import java.util.ArrayList;
import java.util.Date;

public class Package implements UnitInterface {
    private TypesOfPackage type;
    private String description;
    private int countOfMoves;
    private Date addedDate;
    private int number;
    private int priority;
    private Coordinates cords;
    private ArrayList<Coordinates> historyOfMoves;

    public Package(TypesOfPackage t, String description, int number, int priority) {
        this.type=t;
        this.description = description;
        this.addedDate = new Date();
        this.countOfMoves=0;
        this.number = number;
        this.priority = priority;
        this.historyOfMoves=new ArrayList<>();
    }

    @Override
    public void setDescription(String d) {
        this.description=d;
    }

    @Override
    public void setPriority(int p) {
        this.priority=p;
    }

    @Override
    public void setMoves(int p) {
        this.countOfMoves=p;
    }

    @Override
    public void setDate(Date d) {
        this.addedDate=d;
    }

    @Override
    public void setNumber(int n) {
        this.number=n;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public int getMoves() {
        return this.countOfMoves;
    }

    @Override
    public Date getDate() {
        return this.addedDate;
    }

    @Override
    public int getNumber() {
        return this.number;
    }

    @Override
    public int getPriority() {
        return this.priority;
    }

    @Override
    public TypesOfPackage getType() {
        return this.type;
    }

    @Override
    public void setType(TypesOfPackage e) {
        this.type=e;
    }

    @Override
    public String toString() {
        return "\nPackage{" +
                "\ntype=" + type +
                ", \ndescription='" + description + '\'' +
                ", \ncountOfMoves=" + countOfMoves +
                ", \naddedDate=" + addedDate +
                ", \nnumber=" + number +
                ", \npriority=" + priority +
                ", \ncords=" + cords.toString() +
                ", \nhistoryOfMoves=" + historyOfMoves +
                '}';
    }


    public void setCoordinates(int x, int y, int z){
        this.cords= new Coordinates(x,y,z);
        this.setHistoryOfMoves(this.cords);
    }
    public Coordinates getCoordniates(){
        return this.cords;
    }

    private void setHistoryOfMoves(Coordinates c) {
        this.historyOfMoves.add(c);
    }

    public ArrayList<Coordinates> getHistoryOfMoves()
    {
        return this.historyOfMoves;
    }
}
