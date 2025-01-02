import javax.swing.*;

import com.formdev.flatlaf.intellijthemes.*;

import java.awt.*;
import java.awt.event.*;

public class App {
  private void createGUI() {
    JFrame frame = new JFrame("Calculator");
    frame.setSize(new Dimension(500, 500));
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    FlatDarkPurpleIJTheme.setup();

    //
    // INITIALIZE COMPONENTS
    //
    pnl_MainPanel = new JPanel();
    ftf_NumInput = new JFormattedTextField();
    btn_ResetButton = new JButton();
    btn_EqualsButton = new JButton();
    btn_OneButton = new JButton();
    btn_TwoButton = new JButton();
    btn_ThreeButton = new JButton();
    btn_FourButton = new JButton();
    btn_FiveButton = new JButton();
    btn_SixButton = new JButton();
    btn_SevenButton = new JButton();
    btn_EightButton = new JButton();
    btn_NineButton = new JButton();
    btn_ZeroButton = new JButton();
    btn_DecimalButton = new JButton();
    btn_NegativeButton = new JButton();
    btn_AddButton = new JButton();
    btn_SubtractButton = new JButton();
    btn_MultiplyButton = new JButton();
    btn_DivideButton = new JButton();
    //
    // COMPONENT PROPERTIES
    //
    pnl_MainPanel.setLayout(new GridBagLayout());
    c.fill = GridBagConstraints.BOTH;

    ftf_NumInput.setValue("0");
    c.gridx = 0;
    c.gridy = 0;
    c.gridwidth = 2;
    c.weightx = 0.5;
    c.weighty = 0.4;
    pnl_MainPanel.add(ftf_NumInput, c);

    btn_ResetButton.setText("AC");
    c.gridx = 2;
    c.gridwidth = 1;
    pnl_MainPanel.add(btn_ResetButton, c);

    btn_EqualsButton.setText("=");
    c.gridx = 3;
    pnl_MainPanel.add(btn_EqualsButton, c);

    btn_OneButton.setText("1");
    c.gridx = 0;
    c.gridy = 1;
    c.weighty = 0.5;
    pnl_MainPanel.add(btn_OneButton, c);

    btn_TwoButton.setText("2");
    c.gridx = 1;
    pnl_MainPanel.add(btn_TwoButton, c);

    btn_ThreeButton.setText("3");
    c.gridx = 2;
    pnl_MainPanel.add(btn_ThreeButton, c);

    btn_AddButton.setText("+");
    c.gridx = 3;
    pnl_MainPanel.add(btn_AddButton, c);

    btn_FourButton.setText("4");
    c.gridx = 0;
    c.gridy = 2;
    pnl_MainPanel.add(btn_FourButton, c);

    btn_FiveButton.setText("5");
    c.gridx = 1;
    pnl_MainPanel.add(btn_FiveButton, c);

    btn_SixButton.setText("6");
    c.gridx = 2;
    pnl_MainPanel.add(btn_SixButton, c);

    btn_SubtractButton.setText("-");
    c.gridx = 3;
    pnl_MainPanel.add(btn_SubtractButton, c);

    btn_SevenButton.setText("7");
    c.gridx = 0;
    c.gridy = 3;
    pnl_MainPanel.add(btn_SevenButton, c);

    btn_EightButton.setText("8");
    c.gridx = 1;
    pnl_MainPanel.add(btn_EightButton, c);

    btn_NineButton.setText("9");
    c.gridx = 2;
    pnl_MainPanel.add(btn_NineButton, c);

    btn_MultiplyButton.setText("x");
    c.gridx = 3;
    pnl_MainPanel.add(btn_MultiplyButton, c);

    btn_DecimalButton.setText(".");
    c.gridx = 0;
    c.gridy = 4;
    pnl_MainPanel.add(btn_DecimalButton, c);

    btn_ZeroButton.setText("0");
    c.gridx = 1;
    pnl_MainPanel.add(btn_ZeroButton, c);

    btn_NegativeButton.setText("+/-");
    c.gridx = 2;
    pnl_MainPanel.add(btn_NegativeButton, c);

    btn_DivideButton.setText("÷");
    c.gridx = 3;
    pnl_MainPanel.add(btn_DivideButton, c);
    //
    // SHOW APPLICATION
    //
    frame.getContentPane().add(pnl_MainPanel);
    frame.setVisible(true);
  }

  private void setInputs() {
    //
    // NUMBER BUTTONS
    //
    JButton[] NumberButtons = { btn_OneButton, btn_TwoButton, btn_ThreeButton, btn_FourButton, btn_FiveButton,
        btn_SixButton, btn_SevenButton, btn_EightButton, btn_NineButton, btn_ZeroButton };
    for (JButton btn_NumButton : NumberButtons) {
      btn_NumButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          displayedString += btn_NumButton.getText();
          displayedNumber = Double.parseDouble(displayedString);
          ftf_NumInput.setText(displayedString);

          // Check for new calculation
          if (firstNumber != 0.0 && currentStep == 0) {
            firstNumber = 0.0;
            secondNumber = 0.0;
            currentOperator = 0;
          }
        }
      });
    }
    //
    // OPERATOR BUTTONS
    //
    JButton[] OperatorButtons = { btn_AddButton, btn_SubtractButton, btn_MultiplyButton, btn_DivideButton };
    for (JButton btn_OpButton : OperatorButtons) {
      btn_OpButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          switch (currentStep++) {
            case 0:
              firstNumber = displayedNumber;
              displayedString = "";
              displayedNumber = 0.0;
              break;
            case 1:
              secondNumber = displayedNumber;
              displayedString = "";
              displayedNumber = 0.0;

              resultNumber = operateNumbers(firstNumber, secondNumber, currentOperator);
              currentStep = 1;
              firstNumber = resultNumber;

              ftf_NumInput.setText(resultNumber.toString());
              break;
          }

          if (btn_OpButton.getText() == "+") {
            currentOperator = 0;
          } else if (btn_OpButton.getText() == "-") {
            currentOperator = 1;
          } else if (btn_OpButton.getText() == "x") {
            currentOperator = 2;
          } else if (btn_OpButton.getText() == "÷") {
            currentOperator = 3;
          }
        }
      });
    }
    //
    // EQUALS BUTTON
    //
    btn_EqualsButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        switch (currentStep) {
          case 0:
            firstNumber = displayedNumber;
            resultNumber = operateNumbers(firstNumber, secondNumber, currentOperator);
            break;
          case 1:
            secondNumber = displayedNumber;
            resultNumber = operateNumbers(firstNumber, secondNumber, currentOperator);
            break;
        }
        currentStep = 0;
        firstNumber = resultNumber;
        displayedString = "";
        displayedNumber = resultNumber;
        ftf_NumInput.setText(resultNumber.toString());
      }
    });
    //
    // DECIMAL BUTTON
    //
    btn_DecimalButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        if (displayedString == "") {
          displayedString += "0.";
        } else {
          displayedString += ".";
        }
        displayedNumber = Double.parseDouble(displayedString);
        ftf_NumInput.setText(displayedString);

        // Check for new calculation
        if (firstNumber != 0.0 && currentStep == 0) {
          firstNumber = 0.0;
          secondNumber = 0.0;
        }
      }
    });
    //
    // NEGATIVE BUTTON
    //
    btn_NegativeButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        if (displayedString == "" && firstNumber == 0.0 || displayedNumber == 0.0) {
          return;
        }

        if (displayedNumber < 0.0) {
          if (displayedString == "") {

            displayedString = ftf_NumInput.getText().substring(1);
          } else {
            displayedString = displayedString.substring(1);
          }
        } else {
          if (displayedString == "") {
            displayedString = "-" + ftf_NumInput.getText();
          } else {
            displayedString = "-" + displayedString;
          }
        }
        displayedNumber = Double.parseDouble(displayedString);
        ftf_NumInput.setText(displayedString);
        ftf_NumInput.getValue();

        // Check for new calculation
        if (firstNumber != 0.0 && currentStep == 0) {
          firstNumber = 0.0;
          secondNumber = 0.0;
        }
      }
    });
    //
    // RESET BUTTON
    //
    btn_ResetButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        displayedString = "";
        displayedNumber = 0.0;
        firstNumber = 0.0;
        secondNumber = 0.0;
        resultNumber = 0.0;
        currentOperator = 0;
        currentStep = 0;
        ftf_NumInput.setText("0");
      }
    });
  }

  private static Double operateNumbers(Double firstNum, Double secondNum, Integer operator) {
    double result = 0;
    switch (operator) {
      case 0:
        result = firstNum + secondNum;
        break;
      case 1:
        result = firstNum - secondNum;
        break;
      case 2:
        result = firstNum * secondNum;
        break;
      case 3:
        result = firstNum / secondNum;
        break;
    }
    System.out.println(result);
    return result;
  }

  public static void main(String[] args) {
    App app = new App();
    javax.swing.SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        app.createGUI();
        app.setInputs();
      }
    });
  }

  private static GridBagConstraints c = new GridBagConstraints();

  private JPanel pnl_MainPanel;
  private JFormattedTextField ftf_NumInput;
  private JButton btn_ResetButton;
  private JButton btn_EqualsButton;
  private JButton btn_OneButton;
  private JButton btn_TwoButton;
  private JButton btn_ThreeButton;
  private JButton btn_FourButton;
  private JButton btn_FiveButton;
  private JButton btn_SixButton;
  private JButton btn_SevenButton;
  private JButton btn_EightButton;
  private JButton btn_NineButton;
  private JButton btn_ZeroButton;
  private JButton btn_DecimalButton;
  private JButton btn_NegativeButton;
  private JButton btn_AddButton;
  private JButton btn_SubtractButton;
  private JButton btn_MultiplyButton;
  private JButton btn_DivideButton;

  private String displayedString = "";
  private Double displayedNumber = 0.0;
  private Double firstNumber = 0.0;
  private Double secondNumber = 0.0;
  private Double resultNumber = 0.0;
  private Integer currentOperator = 0;
  private Integer currentStep = 0;
}
