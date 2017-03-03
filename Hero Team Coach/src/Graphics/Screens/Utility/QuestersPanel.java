package Graphics.Screens.Utility;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import Graphics.GameScreen;

public class QuestersPanel extends JPanel {
	
	public JLabel quester1Label;
	public JLabel quester2Label;
	public JLabel quester3Label;
	public JLabel quester4Label;
	public JLabel quester5Label;
	public JLabel quester6Label;
	
	public JLabel quester1NameLabel;
	public JLabel quester1ComLabel;
	public JLabel quester1SklLabel;
	public JLabel quester1IntLabel;
	public JLabel quester1PerLabel;
	public JLabel quester1ConditionLabel;
	
	public JLabel quester2NameLabel;
	public JLabel quester2ComLabel;
	public JLabel quester2SklLabel;
	public JLabel quester2IntLabel;
	public JLabel quester2PerLabel;
	public JLabel quester2ConditionLabel;
	
	public JLabel quester3NameLabel;
	public JLabel quester3ComLabel;
	public JLabel quester3SklLabel;
	public JLabel quester3IntLabel;
	public JLabel quester3PerLabel;
	public JLabel quester3ConditionLabel;
	
	public JLabel quester4NameLabel;
	public JLabel quester4ComLabel;
	public JLabel quester4SklLabel;
	public JLabel quester4IntLabel;
	public JLabel quester4PerLabel;
	public JLabel quester4ConditionLabel;
	
	public JLabel quester5NameLabel;
	public JLabel quester5ComLabel;
	public JLabel quester5SklLabel;
	public JLabel quester5IntLabel;
	public JLabel quester5PerLabel;
	public JLabel quester5ConditionLabel;
	
	public JLabel quester6NameLabel;
	public JLabel quester6ComLabel;
	public JLabel quester6SklLabel;
	public JLabel quester6IntLabel;
	public JLabel quester6PerLabel;
	public JLabel quester6ConditionLabel;
	

	private static final long serialVersionUID = 1L;

	public QuestersPanel() {
		
		super();
		setPreferredSize(new Dimension (250, 423));
		setBackground(GameScreen.backgroundColor);
		setBorder(new LineBorder(GameScreen.borderColor, 8, true));
		setLayout(new FlowLayout(FlowLayout.CENTER, 0, 3));
		
			JPanel titlePanel = new JPanel();
			titlePanel.setPreferredSize(new Dimension(220, 55));
			titlePanel.setBackground(Color.LIGHT_GRAY);
			add(titlePanel);
			
				JLabel titleLabel = new JLabel();
				titleLabel.setForeground(Color.white);
				titleLabel.setFont(new Font("System", Font.BOLD, 16));
				titleLabel.setText("<html>Name &nbsp &nbsp &nbsp &nbsp Com Skl Int Per<br>Condition </html>");
				titlePanel.add(titleLabel);
		
			JPanel quester1Panel = new JPanel();
			quester1Panel.setPreferredSize(new Dimension(220, 55));
			quester1Panel.setBackground(GameScreen.smallPanel);
			quester1Panel.setLayout(new FlowLayout(FlowLayout.LEFT, 1, 2));
			add(quester1Panel);
			
				JPanel quester1NamePanel = new JPanel();
				quester1NamePanel.setPreferredSize(new Dimension(95, 25));
				quester1NamePanel.setBorder(new LineBorder(Color.black, 1, false));
				quester1Panel.add(quester1NamePanel);
				
					quester1NameLabel = new JLabel();
					quester1NamePanel.add(quester1NameLabel);
				
				JPanel quester1CombatPanel = new JPanel();
				quester1CombatPanel.setPreferredSize(new Dimension(30, 25));
				quester1CombatPanel.setBorder(new LineBorder(Color.black, 1, false));
				quester1Panel.add(quester1CombatPanel);
				
					quester1ComLabel = new JLabel();
					quester1CombatPanel.add(quester1ComLabel);
				
				JPanel quester1SkillPanel = new JPanel();
				quester1SkillPanel.setPreferredSize(new Dimension(30, 25));
				quester1SkillPanel.setBorder(new LineBorder(Color.black, 1, false));
				quester1Panel.add(quester1SkillPanel);
				
					quester1SklLabel = new JLabel();
					quester1SkillPanel.add(quester1SklLabel);
				
				JPanel quester1IntPanel = new JPanel();
				quester1IntPanel.setPreferredSize(new Dimension(30, 25));
				quester1IntPanel.setBorder(new LineBorder(Color.black, 1, false));
				quester1Panel.add(quester1IntPanel);
				
					quester1IntLabel = new JLabel();
					quester1IntPanel.add(quester1IntLabel);
				
				JPanel quester1PerPanel = new JPanel();
				quester1PerPanel.setPreferredSize(new Dimension(30, 25));
				quester1PerPanel.setBorder(new LineBorder(Color.black, 1, false));
				quester1Panel.add(quester1PerPanel);
				
					quester1PerLabel = new JLabel();
					quester1PerPanel.add(quester1PerLabel);
				
				JPanel condition1Panel = new JPanel();
				condition1Panel.setPreferredSize(new Dimension (219, 25));
				condition1Panel.setBorder(new LineBorder(Color.black, 1, false));
				quester1Panel.add(condition1Panel);
				
					quester1ConditionLabel = new JLabel();
					condition1Panel.add(quester1ConditionLabel);
				
			
				quester1Label = new JLabel();
				quester1Panel.add(quester1Label);
			
			JPanel quester2Panel = new JPanel();
			quester2Panel.setPreferredSize(new Dimension(220, 55));
			quester2Panel.setBackground(GameScreen.mediumColor);
			quester2Panel.setLayout(new FlowLayout(FlowLayout.LEFT, 1, 2));
			add(quester2Panel);
			
				JPanel quester2NamePanel = new JPanel();
				quester2NamePanel.setPreferredSize(new Dimension(95, 25));
				quester2NamePanel.setBorder(new LineBorder(Color.black, 1, false));
				quester2Panel.add(quester2NamePanel);
				
					quester2NameLabel = new JLabel();
					quester2NamePanel.add(quester2NameLabel);
				
				JPanel quester2CombatPanel = new JPanel();
				quester2CombatPanel.setPreferredSize(new Dimension(30, 25));
				quester2CombatPanel.setBorder(new LineBorder(Color.black, 1, false));
				quester2Panel.add(quester2CombatPanel);
				
					quester2ComLabel = new JLabel();
					quester2CombatPanel.add(quester2ComLabel);	
				
				JPanel quester2SkillPanel = new JPanel();
				quester2SkillPanel.setPreferredSize(new Dimension(30, 25));
				quester2SkillPanel.setBorder(new LineBorder(Color.black, 1, false));
				quester2Panel.add(quester2SkillPanel);
				
					quester2SklLabel = new JLabel();
					quester2SkillPanel.add(quester2SklLabel);
				
				JPanel quester2IntPanel = new JPanel();
				quester2IntPanel.setPreferredSize(new Dimension(30, 25));
				quester2IntPanel.setBorder(new LineBorder(Color.black, 1, false));
				quester2Panel.add(quester2IntPanel);
				
					quester2IntLabel = new JLabel();
					quester2IntPanel.add(quester2IntLabel);
				
				JPanel quester2PerPanel = new JPanel();
				quester2PerPanel.setPreferredSize(new Dimension(30, 25));
				quester2PerPanel.setBorder(new LineBorder(Color.black, 1, false));
				quester2Panel.add(quester2PerPanel);
				
					quester2PerLabel = new JLabel();
					quester2PerPanel.add(quester2PerLabel);
				
				JPanel condition2Panel = new JPanel();
				condition2Panel.setPreferredSize(new Dimension (219, 25));
				condition2Panel.setBorder(new LineBorder(Color.black, 1, false));
				quester2Panel.add(condition2Panel);
				
					quester2ConditionLabel = new JLabel();
					condition2Panel.add(quester2ConditionLabel);
			
			
				quester2Label = new JLabel();
				quester2Panel.add(quester2Label);
			
			JPanel quester3Panel = new JPanel();
			quester3Panel.setPreferredSize(new Dimension(220, 55));
			quester3Panel.setBackground(GameScreen.smallPanel);
			quester3Panel.setLayout(new FlowLayout(FlowLayout.LEFT, 1, 2));
			add(quester3Panel);
			
				JPanel quester3NamePanel = new JPanel();
				quester3NamePanel.setPreferredSize(new Dimension(95, 25));
				quester3NamePanel.setBorder(new LineBorder(Color.black, 1, false));
				quester3Panel.add(quester3NamePanel);
				
					quester3NameLabel = new JLabel();
					quester3NamePanel.add(quester3NameLabel);
				
				JPanel quester3CombatPanel = new JPanel();
				quester3CombatPanel.setPreferredSize(new Dimension(30, 25));
				quester3CombatPanel.setBorder(new LineBorder(Color.black, 1, false));
				quester3Panel.add(quester3CombatPanel);
				
					quester3ComLabel = new JLabel();
					quester3CombatPanel.add(quester3ComLabel);
				
				JPanel quester3SkillPanel = new JPanel();
				quester3SkillPanel.setPreferredSize(new Dimension(30, 25));
				quester3SkillPanel.setBorder(new LineBorder(Color.black, 1, false));
				quester3Panel.add(quester3SkillPanel);
				
					quester3SklLabel = new JLabel();
					quester3SkillPanel.add(quester3SklLabel);
				
				JPanel quester3IntPanel = new JPanel();
				quester3IntPanel.setPreferredSize(new Dimension(30, 25));
				quester3IntPanel.setBorder(new LineBorder(Color.black, 1, false));
				quester3Panel.add(quester3IntPanel);
				
					quester3IntLabel = new JLabel();
					quester3IntPanel.add(quester3IntLabel);
				
				JPanel quester3PerPanel = new JPanel();
				quester3PerPanel.setPreferredSize(new Dimension(30, 25));
				quester3PerPanel.setBorder(new LineBorder(Color.black, 1, false));
				quester3Panel.add(quester3PerPanel);
				
					quester3PerLabel = new JLabel();
					quester3PerPanel.add(quester3PerLabel);
				
				JPanel condition3Panel = new JPanel();
				condition3Panel.setPreferredSize(new Dimension (219, 25));
				condition3Panel.setBorder(new LineBorder(Color.black, 1, false));
				quester3Panel.add(condition3Panel);
					
					quester3ConditionLabel = new JLabel();
					condition3Panel.add(quester3ConditionLabel);
			
				quester3Label = new JLabel();
				quester3Panel.add(quester3Label);
			
			JPanel quester4Panel = new JPanel();
			quester4Panel.setPreferredSize(new Dimension(220, 55));
			quester4Panel.setBackground(GameScreen.mediumColor);
			quester4Panel.setLayout(new FlowLayout(FlowLayout.LEFT, 1, 2));
			add(quester4Panel);
			
				JPanel quester4NamePanel = new JPanel();
				quester4NamePanel.setPreferredSize(new Dimension(95, 25));
				quester4NamePanel.setBorder(new LineBorder(Color.black, 1, false));
				quester4Panel.add(quester4NamePanel);
				
					quester4NameLabel = new JLabel();
					quester4NamePanel.add(quester4NameLabel);
				
				JPanel quester4CombatPanel = new JPanel();
				quester4CombatPanel.setPreferredSize(new Dimension(30, 25));
				quester4CombatPanel.setBorder(new LineBorder(Color.black, 1, false));
				quester4Panel.add(quester4CombatPanel);
				
					quester4ComLabel = new JLabel();
					quester4CombatPanel.add(quester4ComLabel);
				
				JPanel quester4SkillPanel = new JPanel();
				quester4SkillPanel.setPreferredSize(new Dimension(30, 25));
				quester4SkillPanel.setBorder(new LineBorder(Color.black, 1, false));
				quester4Panel.add(quester4SkillPanel);
				
					quester4SklLabel = new JLabel();
					quester4SkillPanel.add(quester4SklLabel);
				
				JPanel quester4IntPanel = new JPanel();
				quester4IntPanel.setPreferredSize(new Dimension(30, 25));
				quester4IntPanel.setBorder(new LineBorder(Color.black, 1, false));
				quester4Panel.add(quester4IntPanel);
				
					quester4IntLabel = new JLabel();
					quester4IntPanel.add(quester4IntLabel);
				
				JPanel quester4PerPanel = new JPanel();
				quester4PerPanel.setPreferredSize(new Dimension(30, 25));
				quester4PerPanel.setBorder(new LineBorder(Color.black, 1, false));
				quester4Panel.add(quester4PerPanel);
				
					quester4PerLabel = new JLabel();
					quester4PerPanel.add(quester4PerLabel);
				
				JPanel condition4Panel = new JPanel();
				condition4Panel.setPreferredSize(new Dimension (219, 25));
				condition4Panel.setBorder(new LineBorder(Color.black, 1, false));
				quester4Panel.add(condition4Panel);
				
					quester4ConditionLabel = new JLabel();
					condition4Panel.add(quester4ConditionLabel);
			
				quester4Label = new JLabel();
				quester4Panel.add(quester4Label);
			
			JPanel quester5Panel = new JPanel();
			quester5Panel.setPreferredSize(new Dimension(220, 55));
			quester5Panel.setBackground(GameScreen.smallPanel);
			quester5Panel.setLayout(new FlowLayout(FlowLayout.LEFT, 1, 2));
			add(quester5Panel);
			
				JPanel quester5NamePanel = new JPanel();
				quester5NamePanel.setPreferredSize(new Dimension(95, 25));
				quester5NamePanel.setBorder(new LineBorder(Color.black, 1, false));
				quester5Panel.add(quester5NamePanel);
				
					quester5NameLabel = new JLabel();
					quester5NamePanel.add(quester5NameLabel);
				
				JPanel quester5CombatPanel = new JPanel();
				quester5CombatPanel.setPreferredSize(new Dimension(30, 25));
				quester5CombatPanel.setBorder(new LineBorder(Color.black, 1, false));
				quester5Panel.add(quester5CombatPanel);
				
					quester5ComLabel = new JLabel();
					quester5CombatPanel.add(quester5ComLabel);
				
				JPanel quester5SkillPanel = new JPanel();
				quester5SkillPanel.setPreferredSize(new Dimension(30, 25));
				quester5SkillPanel.setBorder(new LineBorder(Color.black, 1, false));
				quester5Panel.add(quester5SkillPanel);
				
					quester5SklLabel = new JLabel();
					quester5SkillPanel.add(quester5SklLabel);
				
				JPanel quester5IntPanel = new JPanel();
				quester5IntPanel.setPreferredSize(new Dimension(30, 25));
				quester5IntPanel.setBorder(new LineBorder(Color.black, 1, false));
				quester5Panel.add(quester5IntPanel);
				
					quester5IntLabel = new JLabel();
					quester5IntPanel.add(quester5IntLabel);
				
				JPanel quester5PerPanel = new JPanel();
				quester5PerPanel.setPreferredSize(new Dimension(30, 25));
				quester5PerPanel.setBorder(new LineBorder(Color.black, 1, false));
				quester5Panel.add(quester5PerPanel);
				
					quester5PerLabel = new JLabel();
					quester5PerPanel.add(quester5PerLabel);
				
				JPanel condition5Panel = new JPanel();
				condition5Panel.setPreferredSize(new Dimension (219, 25));
				condition5Panel.setBorder(new LineBorder(Color.black, 1, false));
				quester5Panel.add(condition5Panel);
				
					quester5ConditionLabel = new JLabel();
					condition5Panel.add(quester5ConditionLabel);
			
				quester5Label = new JLabel();
				quester5Panel.add(quester5Label);
			
			JPanel quester6Panel = new JPanel();
			quester6Panel.setPreferredSize(new Dimension(220, 50));
			quester6Panel.setBackground(GameScreen.mediumColor);
			quester6Panel.setLayout(new FlowLayout(FlowLayout.LEFT, 1, 2));
			add(quester6Panel);
			
				JPanel quester6NamePanel = new JPanel();
				quester6NamePanel.setPreferredSize(new Dimension(95, 25));
				quester6NamePanel.setBorder(new LineBorder(Color.black, 1, false));
				quester6Panel.add(quester6NamePanel);
				
					quester6NameLabel = new JLabel();
					quester6NamePanel.add(quester6NameLabel);
				
				JPanel quester6CombatPanel = new JPanel();
				quester6CombatPanel.setPreferredSize(new Dimension(30, 25));
				quester6CombatPanel.setBorder(new LineBorder(Color.black, 1, false));
				quester6Panel.add(quester6CombatPanel);
				
					quester6ComLabel = new JLabel();
					quester6CombatPanel.add(quester6ComLabel);
				
				JPanel quester6SkillPanel = new JPanel();
				quester6SkillPanel.setPreferredSize(new Dimension(30, 25));
				quester6SkillPanel.setBorder(new LineBorder(Color.black, 1, false));
				quester6Panel.add(quester6SkillPanel);
				
					quester6SklLabel = new JLabel();
					quester6SkillPanel.add(quester6SklLabel);
				
				JPanel quester6IntPanel = new JPanel();
				quester6IntPanel.setPreferredSize(new Dimension(30, 25));
				quester6IntPanel.setBorder(new LineBorder(Color.black, 1, false));
				quester6Panel.add(quester6IntPanel);
				
					quester6IntLabel = new JLabel();
					quester6IntPanel.add(quester6IntLabel);
				
				JPanel quester6PerPanel = new JPanel();
				quester6PerPanel.setPreferredSize(new Dimension(30, 25));
				quester6PerPanel.setBorder(new LineBorder(Color.black, 1, false));
				quester6Panel.add(quester6PerPanel);
				
					quester6PerLabel = new JLabel();
					quester6PerPanel.add(quester6PerLabel);
				
				JPanel condition6Panel = new JPanel();
				condition6Panel.setPreferredSize(new Dimension (219, 25));
				condition6Panel.setBorder(new LineBorder(Color.black, 1, false));
				quester6Panel.add(condition6Panel);
				
					quester6ConditionLabel = new JLabel();
					condition6Panel.add(quester6ConditionLabel);
			
				quester6Label = new JLabel();
				quester6Panel.add(quester6Label);
		
	}

}
