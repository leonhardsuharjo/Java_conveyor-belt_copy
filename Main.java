public class Main {
    public static void main(String[] args) {
        int beltLength  = 5; // number of slots
        int numComponents = 2; // component types: A and B

        Belt   belt    = new Belt(beltLength, numComponents);
        Draw   draw    = new Draw(beltLength, numComponents);
        Worker workers = new Worker(numComponents, belt.belt);

        Simulation sim = new Simulation(belt, workers, draw);
        sim.runSimulation(100); // run 100 time steps
    }
}