public class Truck extends WheeledTransport {
    public Truck(String modelName) {
        super(modelName, 6);
    }
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
}