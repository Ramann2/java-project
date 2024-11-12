import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AttendanceCalculator {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Attendance Calculator");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel attendedLabel = new JLabel("Attended Classes:");
        attendedLabel.setBounds(30, 30, 150, 25);
        frame.add(attendedLabel);

        JLabel totalLabel = new JLabel("Total Classes:");
        totalLabel.setBounds(30, 70, 150, 25);
        frame.add(totalLabel);

        JLabel desiredLabel = new JLabel("Desired Percentage:");
        desiredLabel.setBounds(30, 110, 200, 25);
        frame.add(desiredLabel);

        JLabel resultLabel = new JLabel();
        resultLabel.setBounds(30, 190, 350, 50);
        frame.add(resultLabel);

        JTextField attendedField = new JTextField();
        attendedField.setBounds(200, 30, 150, 25);
        frame.add(attendedField);

        JTextField totalField = new JTextField();
        totalField.setBounds(200, 70, 150, 25);
        frame.add(totalField);

        JTextField desiredField = new JTextField();
        desiredField.setBounds(200, 110, 100, 25);
        frame.add(desiredField);

        JButton calculateButton = new JButton("Calculate");
        calculateButton.setBounds(150, 150, 120, 25);
        frame.add(calculateButton);

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int attended = Integer.parseInt(attendedField.getText());
                    int total = Integer.parseInt(totalField.getText());
                    int percentage = Integer.parseInt(desiredField.getText());

                    if (attended < 0 || total <= 0 || attended > total || percentage < 0 || percentage > 100) {
                        resultLabel.setText("Enter valid numbers!");
                        return;
                    }

                    double currentPercent = (double) attended / total * 100;

                    if (currentPercent >= percentage) {
                        int daysToBunk = calculateDaysToBunk(attended, total, percentage);
                        resultLabel.setText("You can bunk " + daysToBunk + " more days.");
                    } else {
                        int daysToAttend = calculateDaysToAttend(attended, total, percentage);
                        resultLabel.setText("You need to attend " + daysToAttend + " more classes.");
                    }
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Invalid input. Enter numbers only.");
                }
            }
        });

        frame.setVisible(true);
    }

    private static int calculateDaysToBunk(int attended, int total, int percentage) {
        return (int) Math.floor((100 * attended - percentage * total) / percentage);
    }

    private static int calculateDaysToAttend(int attended, int total, int percentage) {
        return (int) Math.ceil((percentage * total - 100 * attended) / (100 - percentage));
    }
}
