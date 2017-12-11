package Storage.pack;
import java.util.Date;

public interface UnitInterface {
     void setDescription(String d);
     void setPriority(int p);
     void setMoves(int p);
     void setDate(Date d);
     void setNumber(int n);
     String getDescription();
     int getMoves();
     Date getDate();
     int getNumber();
     int getPriority();
     TypesOfPackage getType();
    void setType(TypesOfPackage e);
}
