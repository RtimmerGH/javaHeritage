class Hangar{
    public static void main(String[] args) {
        Car peugeot205 = new Car("Peugeot", 20000);
        Car renaultMegane = new Car("Renault", 130000);
        Boat poseidon8000 = new Boat("Poseidon", 5000);
        Boat tritonAtlantis = new Boat("Triton", 14000);

        System.out.println(peugeot205.doStuff());
        System.out.println(renaultMegane.doStuff());
        System.out.println(poseidon8000.doStuff());
        System.out.println(tritonAtlantis.doStuff());
    }
}