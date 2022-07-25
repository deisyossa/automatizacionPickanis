package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Register implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        Click.on(userinterfaces.Register.REGISTER);
        Click.on(userinterfaces.Register.TYPE);
        Click.on(userinterfaces.Register.TYPE_DOCUMENT);
        Enter.theValue("123055").into(userinterfaces.Register.NUMBER_DOCUMENT);

    }
    public static Register inPackanis(){
        return Tasks.instrumented(Register.class);
    }
}
