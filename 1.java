class Robot {
    public void work() {
        System.out.println("Я Robot – я просто працюю");
    }
}

class CoffeRobot extends Robot {
    @Override
    public void work() {
        System.out.println("Я CoffeRobot – я варю каву");
    }
}

class RobotDancer extends Robot {
    @Override
    public void work() {
        System.out.println("Я RobotDancer – я просто танцюю");
    }
}

class RobotCoocker extends Robot {
    @Override
    public void work() {
        System.out.println("Я RobotCoocker – я просто готую");
    }
}

public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot();
        CoffeRobot coffeRobot = new CoffeRobot();
        RobotDancer robotDancer = new RobotDancer();
        RobotCoocker robotCoocker = new RobotCoocker();

        robot.work();
        coffeRobot.work();
        robotDancer.work();
        robotCoocker.work();

        Robot[] robots = {robot, coffeRobot, robotDancer, robotCoocker};

        for (Robot r : robots) {
            r.work();
        }
    }
}