class Battery {
    int level;
    static int width = 5;
    static int length = 10;

    void charge(int amount) {
        level = level + amount;
    }

    void use(int amount) {
        level = level - amount;
    }

    static void printSize() {
        System.out.println("폭 : " + width + ", 높이 : " + length);
    }
}