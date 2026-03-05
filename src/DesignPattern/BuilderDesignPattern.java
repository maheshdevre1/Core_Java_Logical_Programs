package DesignPattern;

class Building {
    // Required fields
    private final String foundation;
    private final String structure;

    // Optional fields
    private final int floors;
    private final boolean hasParking;
    private final boolean hasGarden;

    // Private constructor
    private Building(Builder builder) {
        this.foundation = builder.foundation;
        this.structure = builder.structure;
        this.floors = builder.floors;
        this.hasParking = builder.hasParking;
        this.hasGarden = builder.hasGarden;
    }

    // Builder class
    public static class Builder {
        private final String foundation;
        private final String structure;

        private int floors = 1; // default
        private boolean hasParking = false;
        private boolean hasGarden = false;

        public Builder(String foundation, String structure) {
            this.foundation = foundation;
            this.structure = structure;
        }

        public Builder floors(int floors) {
            this.floors = floors;
            return this;
        }

        public Builder hasParking(boolean hasParking) {
            this.hasParking = hasParking;
            return this;
        }

        public Builder hasGarden(boolean hasGarden) {
            this.hasGarden = hasGarden;
            return this;
        }

        public Building build() {
            return new Building(this);
        }
    }

    @Override
    public String toString() {
        return "Building [foundation=" + foundation +
               ", structure=" + structure +
               ", floors=" + floors +
               ", hasParking=" + hasParking +
               ", hasGarden=" + hasGarden + "]";
    }
}


public class BuilderDesignPattern {
	
	public static void main(String[] args) {
        Building myBuilding = new Building.Builder("Concrete", "Steel")
                                .floors(5)
                                .hasParking(true)
                                .hasGarden(true)
                                .build();

        System.out.println(myBuilding);

        // Another building with defaults
        Building simpleHouse = new Building.Builder("Bricks", "Wood").build();
        System.out.println(simpleHouse);
    }

}
