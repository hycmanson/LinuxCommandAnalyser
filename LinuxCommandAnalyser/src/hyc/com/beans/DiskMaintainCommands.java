package hyc.com.beans;

public class DiskMaintainCommands implements LinuxCommands {
	private String[] allCommands = { "badblocks", "cfdisk", "dd", "fdisk", "fsck", "fsconf", "hdparm", "losetup",
			"mbadblocks", "mformat", "mkbootdisk", "mkdosfs", "mkfs", "mkinitrd", "mkisofs", "mkswap", "mpartition",
			"sfdisk", "swapoff", "swapon", "symlinks", "sync" };
	private int howManyCommands;
	private String myName;

	public DiskMaintainCommands() {
		howManyCommands = 0;
		myName = "¥≈≈ÃŒ¨ª§√¸¡Ó";
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
