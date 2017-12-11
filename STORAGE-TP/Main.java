import Storage.pack.Package;
import Storage.Storage;
import java.util.ArrayList;
import static Storage.pack.TypesOfPackage.*;


public class Main {

    public static void main(String[] args) {
        int x = 10, y = 10, z = 10;
        Storage s = Storage.getInstance(x, y, z);


        // TESTING
        // MANUALLY ADDING 5 PACKAGES TO STORAGE
            Package a = new Package(food, "aaaaaaa", 1, 1);
            Package b = new Package(food, "bbbbbbb", 2, 2);
            Package c = new Package(toys, "ccccccc", 3, 3);
            Package d = new Package(cloths, "ddddddd", 4, 4);
            Package e = new Package(toys, "eeeeeee", 5, 5);
            s.putPackage(4, 4, a);
            s.putPackage(7, 1, b);
            s.putPackage(1, 6, c);
            s.putPackage(5, 3, d);
            s.putPackage(3, 9, e);

        //FILLING 50% OF STORAGE WITH PACKAGES OF TYPE GUNS (PACKAGES HAS RANDOM PRIORITY AND PLACE IN OUR STORAGE)
            s.randomizeStorage();

        //TESTING METHOD getPackageByNumber
            Package p = s.getPackageByNumber(166);
            System.out.print("\n" + p.toString());

        //TESTING METHOD getHistoryOfPackage
            s.getHistoryOfOnePackage(1);

        //TESTING METHOD getPackagesByType
            ArrayList<Package> alp = s.getPackagesByType(toys);
            System.out.print("\n" + alp.toString());

        //TESTING METHOD getStatusOfStorage;
            s.getStatusOfStorage();

        }

}
