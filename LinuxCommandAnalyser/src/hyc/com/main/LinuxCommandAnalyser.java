package hyc.com.main;

import hyc.com.beans.CompressCommands;
import hyc.com.beans.DiskMaintainCommands;
import hyc.com.beans.DiskManageCommands;
import hyc.com.beans.EditDocumentCommands;
import hyc.com.beans.FileManageCommands;
import hyc.com.beans.FileTransferCommands;
import hyc.com.beans.LinuxCommands;
import hyc.com.beans.MailCommands;
import hyc.com.beans.NetworkCommands;
import hyc.com.beans.SystemManageCommands;
import hyc.com.beans.SystemSettingsCommands;

import java.awt.BorderLayout;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class LinuxCommandAnalyser extends JFrame implements ActionListener {
	private JPanel panelTop;
	private JPanel panelButtom;
	private TextField inputCommand;
	private JButton analyseBtn;
	private TextArea showLogTA;
	private JPanel contentpane;
	private ArrayList<LinuxCommands> linuxCommands;

	public LinuxCommandAnalyser() {
		linuxCommands = new ArrayList<LinuxCommands>();
		linuxCommands.add(new CompressCommands());
		linuxCommands.add(new DiskMaintainCommands());
		linuxCommands.add(new DiskManageCommands());
		linuxCommands.add(new EditDocumentCommands());
		linuxCommands.add(new FileManageCommands());
		linuxCommands.add(new FileTransferCommands());
		linuxCommands.add(new MailCommands());
		linuxCommands.add(new NetworkCommands());
		linuxCommands.add(new SystemManageCommands());
		linuxCommands.add(new SystemSettingsCommands());

		panelTop = new JPanel();
		panelButtom = new JPanel();
		inputCommand = new TextField("", 100);
		analyseBtn = new JButton("分析");
		showLogTA = new TextArea(40, 120);
		contentpane = (JPanel) getContentPane();

		contentpane.add(panelTop, BorderLayout.NORTH);
		contentpane.add(panelButtom, BorderLayout.CENTER);
		analyseBtn.addActionListener(this);

		panelTop.add(inputCommand);
		panelTop.add(analyseBtn);
		panelButtom.add(showLogTA);
	}

	public void actionPerformed(ActionEvent event) {
		JButton button = (JButton) event.getSource();
		if (button.getText().equals("分析")) {
			Analyse(inputCommand.getText());
			showLogTA.setText(showResult());
		}
	}

	public final static void main(String[] args) {
		JFrame frame = new LinuxCommandAnalyser();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1024, 768);
		frame.setVisible(true);
	}

	private void Analyse(String command) {
		String[] cmds = command.split(" | ");
		for (int i = 0; i < cmds.length; i++) {
			for (int j = 0; j < linuxCommands.size(); j++) {
				linuxCommands.get(j).isACommand(cmds[i]);
			}
		}
	}

	private String showResult() {
		StringBuilder rtn = new StringBuilder();
		int howManyCmdsAreThere = 0;
		for (int i = 0; i < linuxCommands.size(); i++) {
			howManyCmdsAreThere += linuxCommands.get(i).getHowManyCommands();
			rtn.append(linuxCommands.get(i).toString()).append('\n');
		}
		rtn.append("一共输入  ").append(howManyCmdsAreThere).append("  条合法命令！");
		return rtn.toString();
	}
}