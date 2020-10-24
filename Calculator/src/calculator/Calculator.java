package calculator;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Calculator {

	private static final int WINDOW_WIDTH = 410;
	private static final int WINDOW_HEIGHT = 600;
	private static final int BUTTON_WIDTH = 80; // Button width
	private static final int BUTTON_HEIGHT = 70; // Button height
	private static final int MARGIN_X = 20;
	private static final int MARGIN_Y = 60;

	private JFrame window;
	private JTextField input;
	private JButton btnC, btnBack, btnMod, btnDiv, btnMul, btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9,
			btnSub, btnAdd, btnPoint, btnEqual, btnRoot, btnPower, btnLog, btnSwitchTheme, btnToScientific;
	private char opt = ' ';
	private boolean go = true;
	private boolean addWrite = true;
	private double val = 0; // vrednost prilikom racunanja
	private boolean isColoredSelected = false;
	private boolean isScientific = false;

	private Calculator() {

		window = new JFrame("Calculator");
		window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		window.setLocationRelativeTo(null);

		// podesavanje fonta za buttone
		Font btnFont = new Font("Arial", Font.BOLD, 28);
		Font smallTxtBtnFont = new Font("Arial", Font.PLAIN, 24);

		btnSwitchTheme = new JButton();
		btnSwitchTheme.setBounds(MARGIN_X, 30, 150, 18);
		btnSwitchTheme.setForeground(Color.WHITE);
		btnSwitchTheme.setBackground(Color.GREEN.brighter());
		btnSwitchTheme.setText("Promeni temu");
		btnSwitchTheme.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnSwitchTheme.addActionListener(event -> onSwitchTheme());
		window.add(btnSwitchTheme);

		window.setLayout(null);
		window.setResizable(false);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // If Click into The Red Button => End The Processus
		window.setVisible(true);
	}

	private void onSwitchTheme() {
		if (isColoredSelected) {
			btnSwitchTheme.setText("Oboji kalkulator");
			btnSwitchTheme.setBackground(Color.GREEN.brighter());
			btnSwitchTheme.setForeground(Color.WHITE);
			btnC.setBackground(null);
			btnBack.setBackground(null);
			btnMod.setBackground(null);
			btnDiv.setBackground(null);
			btnMul.setBackground(null);
			btnSub.setBackground(null);
			btnAdd.setBackground(null);
			btnRoot.setBackground(null);
			btnLog.setBackground(null);
			btnPower.setBackground(null);
			btnEqual.setBackground(null);
			btn0.setBackground(null);
			btn1.setBackground(null);
			btn2.setBackground(null);
			btn3.setBackground(null);
			btn4.setBackground(null);
			btn5.setBackground(null);
			btn6.setBackground(null);
			btn7.setBackground(null);
			btn8.setBackground(null);
			btn9.setBackground(null);
			btnPoint.setBackground(null);

			btnC.setForeground(Color.BLACK);
			btnBack.setForeground(Color.BLACK);
			btnMod.setForeground(Color.BLACK);
			btnDiv.setForeground(Color.BLACK);
			btnMul.setForeground(Color.BLACK);
			btnSub.setForeground(Color.BLACK);
			btnAdd.setForeground(Color.BLACK);
			btnEqual.setForeground(Color.BLACK);
			btnLog.setForeground(Color.BLACK);
			btnPower.setForeground(Color.BLACK);
			btnRoot.setForeground(Color.BLACK);

			isColoredSelected = false;
		} else {
			btnSwitchTheme.setText("Klasicni kalkulator");
			btnSwitchTheme.setBackground(null);
			btnSwitchTheme.setForeground(Color.BLACK);
			btnC.setBackground(Color.RED);
			btnBack.setBackground(Color.ORANGE);
			btnMod.setBackground(Color.GREEN);
			btnDiv.setBackground(Color.CYAN);
			btnMul.setBackground(Color.DARK_GRAY);
			btnSub.setBackground(Color.LIGHT_GRAY);
			btnAdd.setBackground(Color.MAGENTA);
			btnRoot.setBackground(Color.PINK);
			btnLog.setBackground(Color.PINK);
			btnPower.setBackground(Color.PINK);
			btnEqual.setBackground(Color.BLUE);
			btn0.setBackground(Color.WHITE);
			btn1.setBackground(Color.WHITE);
			btn2.setBackground(Color.WHITE);
			btn3.setBackground(Color.WHITE);
			btn4.setBackground(Color.WHITE);
			btn5.setBackground(Color.WHITE);
			btn6.setBackground(Color.WHITE);
			btn7.setBackground(Color.WHITE);
			btn8.setBackground(Color.WHITE);
			btn9.setBackground(Color.WHITE);
			btnPoint.setBackground(Color.WHITE);

			btnC.setForeground(Color.WHITE);
			btnBack.setForeground(Color.WHITE);

			btnMod.setForeground(Color.WHITE);
			btnDiv.setForeground(Color.WHITE);
			btnMul.setForeground(Color.WHITE);
			btnSub.setForeground(Color.WHITE);
			btnAdd.setForeground(Color.WHITE);
			btnEqual.setForeground(Color.WHITE);
			btnLog.setForeground(Color.WHITE);
			btnPower.setForeground(Color.WHITE);
			btnRoot.setForeground(Color.WHITE);
			isColoredSelected = true;
		}
	}

	public static void main(String[] args) {
		new Calculator();
	}

}
