class BaseException extends Exception {
    public BaseException(String message) {
        super(message);
    }
}

class DerivedException extends BaseException {
    public DerivedException(String message) {
        super(message);
    }
}

public class question5 {
    public static void main(String[] args) {
        try {
            // Code that may throw exceptions
            throw new DerivedException("Derived Exception");
        } catch (DerivedException e) {
            System.out.println("Caught Derived Exception: " + e.getMessage());
        } catch (BaseException e) {
            System.out.println("Caught Base Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
