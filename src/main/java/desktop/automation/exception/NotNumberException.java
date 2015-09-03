package desktop.automation.exception;

/**
 * @author Paul Brodner
 *
 */
public class NotNumberException extends Exception
{
    private static final long serialVersionUID = 1L;

    public NotNumberException(int number)
    {
        super("Number " + String.valueOf(number) + " is not a number");
    }
}
