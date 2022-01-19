public class Elevator {
    private int currentFloor = 1; //(текущий этаж)
    private int minFloor;
    private int maxFloor;
    public int floor;

    public Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;

    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void moveDown() {
        for (currentFloor = 1; currentFloor >= floor; currentFloor--) {
            System.out.println("лифт опускается " + currentFloor);
        }
        currentFloor = currentFloor < minFloor ? currentFloor - 1 : currentFloor;
    }

    public void moveUp() {
        for (currentFloor = 1; currentFloor <= floor; currentFloor++) {
            System.out.println("лифт поднимается " + currentFloor);
        }
        currentFloor = currentFloor > maxFloor ? currentFloor + 1 : currentFloor;
    }

    public void move(int floor) {
        this.floor = floor;
        if (floor <= maxFloor) {
            moveUp();
        } else if (floor >= minFloor) {
            moveDown();
        }
        if (floor > maxFloor || floor < minFloor) {
            System.out.println("сообщение об ошибке");
        }
    }


}
