package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import userinterfaces.HomePage;

public class PrincipalPageQuestions implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean message= HomePage.PAGEPRINCIPAL.resolveFor(actor).getText().contains("pickanis");
        return message;
    }
    public static PrincipalPageQuestions landing() {
        return new PrincipalPageQuestions();
    }
}
