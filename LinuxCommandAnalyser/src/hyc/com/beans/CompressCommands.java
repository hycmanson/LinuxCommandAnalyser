package hyc.com.beans;

public class CompressCommands implements LinuxCommands {
	private String[] allCommands = { "ar", "bunzip", "bzip", "bziprecover", "compress", "cpio", "dump", "gunzip",
			"gzexe", "gzip", "lha", "restore", "tar", "unarj", "unzip", "zip", "zipinfo" };
	private int howManyCommands;
	private String myName;

	public CompressCommands() {
		howManyCommands = 0;
		myName = "—πÀı±∏∑›√¸¡Ó";
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
		return myName + ": " + howManyCommands + " Ãı";
	}
}
