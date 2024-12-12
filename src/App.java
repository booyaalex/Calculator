import javax.swing.*;
import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
  private void createAndShowGUI() {
    //
    // frame
    //
    JFrame frame = new JFrame("Calculator");
    frame.setSize(new Dimension(500, 500));
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //
    // pnl_MainPanel
    //
    JPanel pnl_MainPanel = new JPanel();
    pnl_MainPanel.setLayout(new GridBagLayout());
    GridBagConstraints c = new GridBagConstraints();
    //
    // ftf_NumInput
    //
    JFormattedTextField ftf_NumInput = new JFormattedTextField();
    c.fill = GridBagConstraints.BOTH;
    c.gridx = 0;
    c.gridy = 0;
    c.gridwidth = 2;
    c.weightx = 0.5;
    c.weighty = 0.4;
    pnl_MainPanel.add(ftf_NumInput, c);
    //
    // btn_ResetButton
    //
    JButton btn_ResetButton = new JButton("AC");
    c.fill = GridBagConstraints.BOTH;
    c.gridx = 2;
    c.gridy = 0;
    c.gridwidth = 1;
    c.weightx = 0.0;
    c.weighty = 0.4;
    pnl_MainPanel.add(btn_ResetButton, c);
    //
    // btn_EqualsButton
    //
    JButton btn_EqualsButton = new JButton("=");
    c.fill = GridBagConstraints.BOTH;
    c.gridx = 3;
    c.gridy = 0;
    c.weightx = 0.0;
    c.weighty = 0.5;
    pnl_MainPanel.add(btn_EqualsButton, c);
    //
    // btn_OneButton
    //
    JButton btn_OneButton = new JButton("1");
    btn_OneButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        if(ftf_NumInput.getValue() == null) {
          ftf_NumInput.setValue("1");
        }
        else {
          ftf_NumInput.setValue(ftf_NumInput.getValue() + "1");
        }
      }
    });
    c.fill = GridBagConstraints.BOTH;
    c.gridx = 0;
    c.gridy = 1;
    c.gridwidth = 1;
    c.weightx = 0.6;
    c.weighty = 0.5;
    pnl_MainPanel.add(btn_OneButton, c);
    //
    // btn_TwoButton
    //
    JButton btn_TwoButton = new JButton("2");
    c.fill = GridBagConstraints.BOTH;
    c.gridx = 1;
    c.gridy = 1;
    c.weightx = 0.6;
    c.weighty = 0.5;
    pnl_MainPanel.add(btn_TwoButton, c);
    //
    // btn_ThreeButton
    //
    JButton btn_ThreeButton = new JButton("3");
    c.fill = GridBagConstraints.BOTH;
    c.gridx = 2;
    c.gridy = 1;
    c.weightx = 0.6;
    c.weighty = 0.5;
    pnl_MainPanel.add(btn_ThreeButton, c);
    //
    // btn_FourButton
    //
    JButton btn_FourButton = new JButton("4");
    c.fill = GridBagConstraints.BOTH;
    c.gridx = 0;
    c.gridy = 2;
    c.weightx = 0.6;
    c.weighty = 0.5;
    pnl_MainPanel.add(btn_FourButton, c);
    //
    // btn_FiveButton
    //
    JButton btn_FiveButton = new JButton("5");
    c.fill = GridBagConstraints.BOTH;
    c.gridx = 1;
    c.gridy = 2;
    c.weightx = 0.6;
    c.weighty = 0.5;
    pnl_MainPanel.add(btn_FiveButton, c);
    //
    // btn_SixButton
    //
    JButton btn_SixButton = new JButton("6");
    c.fill = GridBagConstraints.BOTH;
    c.gridx = 2;
    c.gridy = 2;
    c.weightx = 0.6;
    c.weighty = 0.5;
    pnl_MainPanel.add(btn_SixButton, c);
    //
    // btn_SevenButton
    //
    JButton btn_SevenButton = new JButton("7");
    c.fill = GridBagConstraints.BOTH;
    c.gridx = 0;
    c.gridy = 3;
    c.weightx = 0.6;
    c.weighty = 0.5;
    pnl_MainPanel.add(btn_SevenButton, c);
    //
    // btn_EightButton
    //
    JButton btn_EightButton = new JButton("8");
    c.fill = GridBagConstraints.BOTH;
    c.gridx = 1;
    c.gridy = 3;
    c.weightx = 0.6;
    c.weighty = 0.5;
    pnl_MainPanel.add(btn_EightButton, c);
    //
    // btn_NineButton
    //
    JButton btn_NineButton = new JButton("9");
    c.fill = GridBagConstraints.BOTH;
    c.gridx = 2;
    c.gridy = 3;
    c.weightx = 0.6;
    c.weighty = 0.5;
    pnl_MainPanel.add(btn_NineButton, c);
    //
    // btn_ZeroButton
    //
    JButton btn_ZeroButton = new JButton("0");
    c.fill = GridBagConstraints.BOTH;
    c.gridx = 0;
    c.gridy = 4;
    c.weightx = 0.6;
    c.weighty = 0.5;
    pnl_MainPanel.add(btn_ZeroButton, c);
    //
    // btn_DecimalButton
    //
    JButton btn_DecimalButton = new JButton(".");
    c.fill = GridBagConstraints.BOTH;
    c.gridx = 1;
    c.gridy = 4;
    c.weightx = 0.6;
    c.weighty = 0.5;
    pnl_MainPanel.add(btn_DecimalButton, c);
    //
    // btn_NegativeButton
    //
    JButton btn_NegativeButton = new JButton("+/-");
    c.fill = GridBagConstraints.BOTH;
    c.gridx = 2;
    c.gridy = 4;
    c.weightx = 0.6;
    c.weighty = 0.5;
    pnl_MainPanel.add(btn_NegativeButton, c);
    //
    // btn_AddButton
    //
    JButton btn_AddButton = new JButton("+");
    c.fill = GridBagConstraints.BOTH;
    c.gridx = 3;
    c.gridy = 1;
    c.weightx = 0.5;
    c.weighty = 0.5;
    pnl_MainPanel.add(btn_AddButton, c);
    //
    // btn_SubtractButton
    //
    JButton btn_SubtractButton = new JButton("-");
    c.fill = GridBagConstraints.BOTH;
    c.gridx = 3;
    c.gridy = 2;
    c.weightx = 0.5;
    c.weighty = 0.5;
    pnl_MainPanel.add(btn_SubtractButton, c);
    //
    // btn_MultiplyButton
    //
    JButton btn_MultiplyButton = new JButton("x");
    c.fill = GridBagConstraints.BOTH;
    c.gridx = 3;
    c.gridy = 3;
    c.weightx = 0.5;
    c.weighty = 0.5;
    pnl_MainPanel.add(btn_MultiplyButton, c);
    //
    // btn_DivideButton
    //
    JButton btn_DivideButton = new JButton("÷");
    c.fill = GridBagConstraints.BOTH;
    c.gridx = 3;
    c.gridy = 4;
    c.weightx = 0.5;
    c.weighty = 0.5;
    pnl_MainPanel.add(btn_DivideButton, c);

    // Display the window.
    frame.getContentPane().add(pnl_MainPanel);
    //frame.pack();
    frame.setVisible(true);
  }

  private static void typeNumber() {
    System.out.println("Double Test");
  }

  public static void main(String[] args) {
    App app = new App(); 
    javax.swing.SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        app.createAndShowGUI();
      }
    });
  }
}

/*
 * JButton subButton = new JButton("Subtract");
 * subButton.setBounds(100, 0, 100, 100);
 * frame.getContentPane().add(subButton);
 */