package Enum;

public enum RealDirection {
    FRONT("front") {
        @Override
        public void show() {
            System.out.println("front");
        }
    },
    BEHIND("behind") {
        @Override
        public void show() {
            System.out.println("behind");
        }
    },
    LEFT("left") {
        @Override
        public void show() {
            System.out.println("left");
        }
    },
    RIGHT("right"){
        @Override
        public void show() {
            System.out.println("right");
        }
    };

    private String name;
    private RealDirection(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void show();
}
