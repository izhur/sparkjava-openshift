import static spark.Spark.*;

public class Main {
    public static void main(String[] args) {
    	
    	staticFileLocation("/public");
        get("/hello", (req, res) -> "Hello World");
    }
}