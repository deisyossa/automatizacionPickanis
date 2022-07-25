package exceptions;

public class NonExistentField extends AssertionError{
        public NonExistentField(String message, Throwable throwable) {
            super(message, throwable);
        }
}
