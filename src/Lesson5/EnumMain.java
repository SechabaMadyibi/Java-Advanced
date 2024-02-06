package Lesson5;

public class EnumMain {
    public static void main(String[] args) {
        Computer comp = new Computer();
        comp.setState(Computer.PowerState.ON);
        System.out.println("current state "+ comp.getState());
        System.out.println("description "+ comp.getState().getDescription());
    }
}
