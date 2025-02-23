package nbradham.mcProgrammer;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.border.TitledBorder;

final class Programmer {

	private static final byte B_CORD_L = 4;

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			JFrame frame = new JFrame("MC Programmer");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setLayout(new BorderLayout());
			JPanel originPane = new JPanel(), goPane = new JPanel(new FlowLayout(FlowLayout.LEADING));
			originPane.setBorder(new TitledBorder("Origin Pos (Bit 0 of Address 0)"));
			JTextField xField = new JTextField(B_CORD_L), yField = new JTextField(B_CORD_L),
					zField = new JTextField(B_CORD_L);
			originPane.add(new JLabel("X:"));
			originPane.add(xField);
			originPane.add(new JLabel("Y:"));
			originPane.add(yField);
			originPane.add(new JLabel("Z:"));
			originPane.add(zField);
			frame.add(originPane, BorderLayout.BEFORE_FIRST_LINE);
			JTextArea codeArea = new JTextArea(20, 30);
			frame.add(new JScrollPane(codeArea), BorderLayout.CENTER);
			JLabel statLabel = new JLabel("Ready.");
			JButton goButton = new JButton("Write");
			goButton.addActionListener((e) -> statLabel.setText("Testing status update."));
			goPane.add(goButton);
			goPane.add(statLabel);
			frame.add(goPane, BorderLayout.AFTER_LAST_LINE);
			frame.pack();
			frame.setVisible(true);
		});
	}
}