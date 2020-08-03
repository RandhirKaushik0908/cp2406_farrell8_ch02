import javax.swing.*;

public class MinutesConversions {
    public static void main(String[] args)
    {
        String minuteString;
        float minute;
        float hours;
        float days;
        final float HOURS_CONVERSION_RATE = 60;
        final float DAYS_CONVERSION_RATE = 24;
        minuteString = JOptionPane.showInputDialog(null,"Enter the number of minutes",
                "Minutes", JOptionPane.INFORMATION_MESSAGE);
        minute = Float.parseFloat(minuteString);
        hours = minute / HOURS_CONVERSION_RATE;
        days = hours / DAYS_CONVERSION_RATE;
        JOptionPane.showMessageDialog(null, minute + " minutes equals " + hours + " hours and also "
        + days + " days.");
    }
}
