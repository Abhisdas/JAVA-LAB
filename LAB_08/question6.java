class TIME_Exception extends Exception {
    public TIME_Exception(String message) {
        super(message);
    }
}

class question6 {
    static void checkTime(int hours, int minutes, int seconds) throws TIME_Exception {
        if (hours < 0 || hours > 23) {
            throw new TIME_Exception("Invalid hours");
        }
        if (minutes < 0 || minutes > 59) {
            throw new TIME_Exception("Invalid minutes");
        }
        if (seconds < 0 || seconds > 59) {
            throw new TIME_Exception("Invalid seconds");
        }
    }

    public static void main(String[] args) {
        try {
            int hours = 10, minutes = 30, seconds = 45;
            checkTime(hours, minutes, seconds);
            System.out.println("Time is valid");
        } catch (TIME_Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
