package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Register {
    public static final Target REGISTER = Target.the("search box").locatedBy("//*[@class = 'mat-button-wrapper']");
    public static final Target TYPE = Target.the("search box").locatedBy("//*[@class = 'mat-select-placeholder mat-select-min-line ng-tns-c117-42 ng-star-inserted']");
    public static final Target TYPE_DOCUMENT = Target.the("search box").locatedBy("//*[@class = 'mat-option-text']");
    public static final Target NUMBER_DOCUMENT = Target.the("search box").locatedBy("//*[@class = 'mat-input-element mat-form-field-autofill-control ng-tns-c114-43 ng-pristine ng-invalid cdk-text-field-autofill-monitored ng-touched']");

}
