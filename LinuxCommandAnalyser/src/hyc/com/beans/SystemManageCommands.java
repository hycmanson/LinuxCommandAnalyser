package hyc.com.beans;

public class SystemManageCommands implements LinuxCommands {
	private String[] allCommands = { "adduser", "chfn", "chsh", "date", "exit", "finger", "free", "fwhois", "gitps",
			"groupdel", "groupmod", "halt", "id", "kill", "last", "lastb", "login", "logname", "logout", "logrotate",
			"newgrp", "nice", "procinfo", "ps", "pstree", "reboot", "renice", "rlogin", "rsh", "rwho", "screen",
			"shutdown", "sliplogin", "su", "sudo", "suspend", "swatch", "tload", "top", "uname", "useradd", "userconf",
			"userdel", "usermod", "vlock", "who", "whoami", "whois" };
	private int howManyCommands;
	private String myName;

	public SystemManageCommands() {
		howManyCommands = 0;
		myName = "系统管理命令";
	}

	public boolean isACommand(String cmd) {
		for (int i = 0; i < allCommands.length; i++) {
			if (cmd.indexOf(allCommands[i]) != -1) {
				howManyCommands++;
				return true;
			}
		}
		return false;
	}

	public int getHowManyCommands() {
		return howManyCommands;
	}

	public String getMyName() {
		return myName;
	}

	public String toString() {
		// TODO Auto-generated method stub
		return myName + ": " + howManyCommands + " 条";
	}
}
