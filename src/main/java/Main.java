import io.javalin.Javalin;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Javalin app = Javalin.create().start(4100);

        app.get("/", ctx -> {
            ctx.result("Hi! Look at the README.md for instructions!");
        });

        app.get("/parameter", ctx -> {
            Map<String, String> parameterForJTE = Collections.singletonMap("name", "Viktor");
            ctx.render("parameter.jte", parameterForJTE);
        });
        
        app.get("/age", ctx -> {
            ctx.render("age.jte", Collections.singletonMap("age", 23));
        });
    }
}
