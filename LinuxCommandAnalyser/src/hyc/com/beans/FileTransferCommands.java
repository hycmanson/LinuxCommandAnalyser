package hyc.com.beans;

public class FileTransferCommands implements LinuxCommands {
	private String[] allCommands = { "bye", "ftp", "ftpcount", "ftpshut", "ftpwho", "ncftp", "tftp", "uucico", "uucp",
			"uupick", "uuto" };
	private int howManyCommands;
	private String myName;

	public FileTransferCommands() {
		howManyCommands = 0;
		myName = "文件传输命令";
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
