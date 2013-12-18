package hyc.com.beans;

public class FileManageCommands implements LinuxCommands {
	private String[] allCommands = { "diff", "diffstat", "file", "find", "git", "gitview", "ln", "locate", "lsattr",
			"mattrib", "mc", "mcopy", "mdel", "mktemp", "mmove", "mread", "mren", "mshowfat", "mtools", "mtoolstest",
			"mv", "od", "paste", "patch", "rcp", "rhmask", "rm", "slocate", "split", "tee", "tmpwatch", "touch",
			"umask", "whereis", "which", "cat", "chattr", "chgrp", "chmod", "chown", "cksum", "cmp", "cp", "cut",
			"indent" };
	private int howManyCommands;
	private String myName;

	public FileManageCommands() {
		howManyCommands = 0;
		myName = "文件管理命令";
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
