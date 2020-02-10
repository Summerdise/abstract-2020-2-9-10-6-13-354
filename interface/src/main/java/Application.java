import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {
        int haveMoney = 300;
        TrainingFromWhToBj drive = new Drive();
        TrainingFromWhToBj bus = new Drive();
        TrainingFromWhToBj train = new Drive();
        TrainingFromWhToBj plane = new Drive();
        ArrayList<TrainingFromWhToBj> arrayList = new ArrayList<>();
        arrayList.add(drive);
        arrayList.add(bus);
        arrayList.add(train);
        arrayList.add(plane);
        for(int i=0;i<arrayList.size();i++){
            if(arrayList.get(i).getCost()<=haveMoney){
                arrayList.get(i).trafficTool();
            }
        }
    }
}
