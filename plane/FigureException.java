package by.it.lanevich.plane;

public class FigureException extends Exception {
    public FigureException() {
    }

    public FigureException(String message) {
        super("ОШИБКА: "+message);
    }

    public FigureException(String message, Throwable cause) {
        super("ОШИБКА: "+message, cause);
    }

    public FigureException(Throwable cause) {
        super(cause);
    }
    public FigureException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super("ОШИБКА: "+message, cause, enableSuppression, writableStackTrace);
    }
}
