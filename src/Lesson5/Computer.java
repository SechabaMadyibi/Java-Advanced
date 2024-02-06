package Lesson5;

public class Computer {
    PowerState state;

    public enum PowerState {
        OFF("Power is off"),
        ON("The powers usage is high"),
        SUSPEND("The power usage is low");
        private String description;

        private PowerState(String d) {
            description = d;
        }

        public String getDescription() {
            return description;
        }
    }

    public PowerState getState() {
        return state;
    }

    public void setState(PowerState state) {
        this.state = state;
    }
}
