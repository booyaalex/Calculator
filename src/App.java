import javax.swing.*;
import java.awt.*;

public class App {
  private void createGUI() {
    JFrame frame = new JFrame("Calculator");
    frame.setSize(new Dimension(500, 500));
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //
    // INITIALIZE COMPONENTS
    //
    JPanel pnl_MainPanel = new JPanel();
    JFormattedTextField ftf_NumInput = new JFormattedTextField();
    /* 
    JButton btn_ResetButton = new JButton();
    JButton btn_EqualsButton = new JButton();
    JButton btn_OneButton = new JButton();
    JButton btn_TwoButton = new JButton();
    JButton btn_ThreeButton = new JButton();
    JButton btn_FourButton = new JButton();
    JButton btn_FiveButton = new JButton();
    JButton btn_SixButton = new JButton();
    JButton btn_SevenButton = new JButton();
    JButton btn_EightButton = new JButton();
    JButton btn_NineButton = new JButton();
    JButton btn_ZeroButton = new JButton();
    JButton btn_DecimalButton = new JButton();
    JButton btn_NegativeButton = new JButton();
    JButton btn_AddButton = new JButton();
    JButton btn_SubtractButton = new JButton();
    JButton btn_MultiplyButton = new JButton();
    JButton btn_DivideButton = new JButton();
    */
    //
    // COMPONENT PROPERTIES
    //
    pnl_MainPanel.setLayout(new GridBagLayout());
    
    ftf_NumInput.setValue("");
      c.gridx = 0;
      c.gridy = 0;
      c.gridwidth = 2;
      c.weightx = 0.5;
      c.weighty = 0.4;
    pnl_MainPanel.add(ftf_NumInput, c);
    
  }

  public static void main(String[] args) {
    App app = new App(); 
    javax.swing.SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        app.createGUI();
      }
    });
  }

  private static GridBagConstraints c = new GridBagConstraints();

  /* 
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
  private JButton btn_SevemButton;
  private JButton btn_EightButton;
  private JButton btn_NineButton;
  private JButton btn_ZeroButton;
  private JButton btn_DecimalButton;
  private JButton btn_NegativeButton;
  private JButton btn_AddButton;
  private JButton btn_SubtractButton;
  private JButton btn_MultiplyButton;
  private JButton btn_DivideButton;
  */
}
