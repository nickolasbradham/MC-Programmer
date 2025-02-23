package nbradham.mcProgrammer;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

final class Programmer {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			JFrame frame = new JFrame("MC Programmer");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.pack();
			frame.setVisible(true);
		});
	}
}