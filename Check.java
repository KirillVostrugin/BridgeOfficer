import java.util.Scanner;

public class Check {
    public static void check(){
        Scanner scanner = new Scanner(System.in);
        BridgeOfficer officer = new BridgeOfficer(15_000);

        while (true){
            officer.helloAndQuestion();
            if (!(scanner.hasNextInt())){
                String str = scanner.nextLine();
                if (str.equals("STOP")){
                    break;
                } else {
                    System.out.println("Incorrect value.");
                    System.out.println();
                    continue;
                }
            }
            int weight = scanner.nextInt();
            boolean canFirstTruckGo = officer.checkTruck(weight);
            System.out.println(officer.yesOrNo(canFirstTruckGo));
            System.out.println();
        }
    }
}
