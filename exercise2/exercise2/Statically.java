package exercise2;

public class Statically {
    private String glue = "Epoxy";
    public String jello = "Jello";

    public Statically(String glue, String jello) {
        this.glue = glue;
        this.jello = jello;
    }

    public String getGlue() {
        return glue;
    }

    public String getJello() {
        return jello;
    }

    public static int moveAndShake(int x, int y) {
        int moveShake = x * y;
        System.out.println("Never stagnate in life.  Be agile, change, and improve...");
        return moveShake;
    }

    public static int stubborn(int a, int b) {
        int stubs = a + b;
       Statically.moveAndShake(1, 2);
            System.out.println("Please don't make me change... I just don't like it...");
        return stubs;
    }


    public static int explain(int c, int d) {
        int expl = c + d;
        Statically.stubborn(1, 2);
        System.out.println("epoxy");
        System.out.println(
                "Static keyword in Java is used to show you don't need to create an instance of the class. Static in javascript means the function is a utility type function that should not be instantiated but rather used as a template or just called to perform a function."
        );
        return expl;
    }
}



