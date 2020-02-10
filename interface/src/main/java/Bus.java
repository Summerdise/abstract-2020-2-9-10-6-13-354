public class Bus implements TrainingFromWhToBj{
    @Override
    public void trafficTool(){
        System.out.println("大巴旅行");
    }

    @Override
    public int getCost(){
        return 300;
    }
}
