package lecture.lab.lab01;
class Robot
{
    String robotName  ;
    Battery robotEnergy = new Battery();

    static int moveEnergy = 2;
    static int runEnergy = 5;

    void move(int i){
        robotEnergy.batterylevel = robotEnergy.batterylevel - (moveEnergy*i);
    }
    void run(int i){
        robotEnergy.batterylevel = robotEnergy.batterylevel - (runEnergy*i);
    }

}
public class Lab01_RobotTest {
    public static void main(String[] args) {
        Robot r = new Robot();
        r.robotEnergy.batterylevel = 100;
        r.move(10);
        r.run(5);
        System.out.println(r.robotEnergy.batterylevel);
    }
}
