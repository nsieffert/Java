package exercise2;

class Arrays {

    int[] nums = {10, 23, 3, 4, 5, 2, 1};
    String[] greetings = {"hello", "howdy", "hallo", "hola", "bonjour", "ciao", "أهلا"};
    boolean[] binaries = {false, true, true, true, false, false, false, true, true, true, true, true, false, true, false, false, true, false};

    void printNums(int[] nums) {
        for (int num : nums) {
            System.out.println("Nums array: " + num);
        }
    }
        void printGreetings(String[] greetings) {
            for (String greeting : greetings) {
                System.out.println("Greetings array: " + greeting);
            }
        }
            void printBinaries() {
                for (boolean binary : binaries) {
                    System.out.println("Binaries array: " + binary);
                }

            }

    @Override
    public String toString() {
        return "Arrays{" +
                "nums=" + java.util.Arrays.toString(nums) +
                ", greetings=" + java.util.Arrays.toString(greetings) +
                ", binaries=" + java.util.Arrays.toString(binaries) +
                '}';
    }
}