package calculator;

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
	private JButton btnC, btnBack, btnMod, btnDiv, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnSub, btnAdd,
			btnPoint, btnEqual, btnRoot, btnPower, btnLog, btnSwithTheme, btnToScientific;
	private char opt = ' ';
	private boolean go = true;
	private boolean addWrite = true;
	private double val = 0; // vrednost prilikom racunanja
	private boolean isColored = false;
	private boolean isScientific = false;

}
