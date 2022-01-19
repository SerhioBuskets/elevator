public class Elevator {
    private int currentFloor = 1; //(текущий этаж)
    private int minFloor;
    private int maxFloor;

    public Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void moveDown() {
        currentFloor = currentFloor - 1;
        System.out.println("лифт опускается " + currentFloor);
    }

    public void moveUp() {
        currentFloor = currentFloor + 1;
        System.out.println("лифт поднимается " + currentFloor);
    }

    public void move(int floor) {
        if(floor < minFloor || floor > maxFloor) {
            throw new IllegalArgumentException("сообщение об ошибке \n");
        }

        while(floor != currentFloor) {
            if (currentFloor > floor) {
                moveDown();
            } else {
                moveUp();
            }
        }
    }


}
