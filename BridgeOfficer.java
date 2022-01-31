public class BridgeOfficer {
    private int maxWeight;

    public BridgeOfficer(int maxWeight){
        this.maxWeight = maxWeight;
    }
    public void helloAndQuestion(){
        System.out.println("Hello! What is the weight of your truck?");
        System.out.println("Enter the weight of your truck:");
    }
    public boolean checkTruck(int weight){
        if (weight > maxWeight)
            return false;
        else return true;
    }
    public String yesOrNo (boolean check){
        if (check)
            return "You can go!";
        else return "You can't go here. Your truck is overweight.";
    }
}