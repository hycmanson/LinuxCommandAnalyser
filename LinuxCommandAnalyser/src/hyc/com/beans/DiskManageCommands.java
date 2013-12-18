package hyc.com.beans;

public class DiskManageCommands implements LinuxCommands {
	private String[] allCommands = { "cd", "df", "dirs", "du", "edquota", "eject", "lndir", "ls", "mcd", "mdeltree",
			"mdu", "mkdir", "mlabel", "mmd", "mmount", "mrd", "mzip", "pwd", "quota", "quotacheck", "quotaoff",
			"quotaon", "repquota", "rmdir", "rmt", "stat", "Tree", "umount" };
	private int howManyCommands;
	private String myName;

	public DiskManageCommands() {
		howManyCommands = 0;
		myName = "¥≈≈Ãπ‹¿Ì√¸¡Ó";
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
