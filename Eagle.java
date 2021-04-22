public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }
 
    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }

	@Override
	public void ascend(int meters) {
		altitude += meters;
		System.out.printf("%s flies upward, altitude : %d%n", this.getName(), this.getAltitude());
	}

	@Override
	public void descend(int meters) {
		if (altitude - meters < 0) {
			System.out.printf("Ouch!!!%n");
		} else {
			altitude -= meters;
			System.out.printf("%s flies downward, altitude : %d%n", this.getName(), this.getAltitude());
		}
	}

	@Override
	public void glide() {
		System.out.printf("It glides into the air.%n");
	}

	@Override
	public void land() {
		if (altitude > 1) {
			System.out.printf("%s is too high, it can't lands.%n", this.getName());
		} else {
			System.out.printf("%s lands on the ground.%n", this.getName());
		}
	}

	@Override
	public void takeOff() {
		System.out.printf("%s takes off in the sky.%n", this.getName());
	}
}
