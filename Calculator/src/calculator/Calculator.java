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

		// button za promenu teme
		btnSwitchTheme = new JButton();
		btnSwitchTheme.setBounds(MARGIN_X, 30, 150, 18);
		btnSwitchTheme.setForeground(Color.WHITE);
		btnSwitchTheme.setBackground(Color.GREEN.brighter());
		btnSwitchTheme.setText("Promeni temu");
		btnSwitchTheme.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnSwitchTheme.addActionListener(event -> onSwitchTheme());
		window.add(btnSwitchTheme);

		// btn za dodatne scientific opcije
		btnToScientific = new JButton();
		btnSwitchTheme.setBounds(230, 30, 150, 18);
		btnSwitchTheme.setForeground(Color.WHITE);
		btnSwitchTheme.setBackground(Color.BLUE.brighter());
		btnSwitchTheme.setText("Naucni mod");
		btnSwitchTheme.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnSwitchTheme.addActionListener(event -> onScientificMode());

		int j = -1;
		int k = -1;

		int[] x = { MARGIN_X, MARGIN_X + 90, 200, 290, 380 };
		int[] y = { MARGIN_Y, MARGIN_Y + 100, MARGIN_Y + 180, MARGIN_Y + 260, MARGIN_Y + 340, MARGIN_Y + 420 };

		// input polje
		input = new JTextField("0");
		input.setBounds(x[0], y[0], 350, 70);
		input.setEditable(false);
		input.setBackground(Color.WHITE);
		input.setFont(new Font("Arial", Font.PLAIN, 33));
		window.add(input);

		// dugme za brisanje
		btnC = new JButton("C");
		btnC.setBounds(x[0], y[1], BUTTON_WIDTH, BUTTON_HEIGHT);
		btnC.setFont(btnFont);
		btnC.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnC.addActionListener(event -> {

			// possibly repaint font

			input.setText("0");
			opt = ' ';
			val = 0;
		});
		window.add(btnC);

		// dugme za brisanje jednog karaktera
		btnBack = new JButton("<-");
		btnBack.setBounds(x[1], y[1], BUTTON_WIDTH, BUTTON_HEIGHT);
		btnBack.setFont(btnFont);
		btnBack.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnBack.addActionListener(event -> {

			String currentText = input.getText();
			StringBuilder str = new StringBuilder();

			for (int i = 0; i < (currentText.length() - 1); i++) {
				str.append(currentText.charAt(i));
			}
			if (currentText.toString().equals("")) {
				input.setText("0");
			} else {
				input.setText(str.toString());
			}

		});
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

	private void onScientificMode() {
		if (isScientific) {
			window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
			btnRoot.setVisible(true);
			btnPower.setVisible(true);
			btnLog.setVisible(true);
			isScientific = false;
		} else {
			window.setSize(WINDOW_WIDTH + 80, WINDOW_HEIGHT);
			btnRoot.setVisible(false);
			btnPower.setVisible(false);
			btnLog.setVisible(false);
			isScientific = true;
		}

	}

	public static void main(String[] args) {
		new Calculator();
	}

}
