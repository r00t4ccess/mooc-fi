
import java.util.ArrayList;
import java.util.HashMap;


public class Main {

    public static void main(String[] args) {
        // the following is the same sample program shown in ex 8.13 description
        
        LicensePlate li1 = new LicensePlate("FI", "ABC-123");
        LicensePlate li2 = new LicensePlate("FI", "UXE-465");
        LicensePlate li3 = new LicensePlate("D", "B WQ-431");
        LicensePlate li4 = new LicensePlate("D", "B TY-781");
        LicensePlate li5 = new LicensePlate("D", "B WE-451");

        ArrayList<LicensePlate> finnishPlates = new ArrayList<>();
        finnishPlates.add(li1);
        finnishPlates.add(li2);

        LicensePlate newLi = new LicensePlate("FI", "ABC-123");
        if (!finnishPlates.contains(newLi)) {
            finnishPlates.add(newLi);
        }
        //System.out.println("Finnish: " + finnishPlates);
        // if the equals-method hasn't been overwritten, the same license number will be added to the list againg
        
        VehicleRegistry owners = new VehicleRegistry();
//        HashMap<LicensePlate, String> owners = new HashMap<>();
        owners.add(li1, "Arto");
        owners.add(li3, "Jürgen");
//
//        System.out.println("owners:");
//        System.out.println(owners.get(new LicensePlate("FI", "ABC-123")));
//        System.out.println(owners.get(new LicensePlate("D", "B WQ-431")));
        // if the hasCode-method hasn't been overwritten, the owners won't be found


        owners.add(li2, "kimmi");
        owners.add(li4, "kimmi");
        owners.add(li5, "Arto");
        owners.remove(li1);

        
        owners.printOwners();
    }
}
