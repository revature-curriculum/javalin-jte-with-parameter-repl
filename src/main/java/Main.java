import io.javalin.Javalin;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Javalin app = Javalin.create().start(4100);

        app.get("/", ctx -> {
            ctx.result("Hi! Look at the README.md for instructions!");
        });

        app.get("/parameter", ctx -> {
            ctx.render("parameter.jte", Collections.singletonMap("name", "Viktor"));
        });
        
    }
}
