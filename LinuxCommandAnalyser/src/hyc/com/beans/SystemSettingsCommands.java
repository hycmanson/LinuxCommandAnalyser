package hyc.com.beans;

public class SystemSettingsCommands implements LinuxCommands {
	private String[] allCommands = { "alias", "apmd", "aumix", "bind", "chkconfig", "chroot", "clock", "crontab",
			"declare", "depmod", "dircolors", "dmesg", "enable", "eval", "export", "fbset", "grpconv", "grpunconv",
			"hwclock", "insmod", "kbdconfig", "lilo", "liloconfig", "lsmod", "minfo", "mkkickstart", "modinfo",
			"modprobe", "mouseconfig", "ntsysv", "passwd", "pwconv", "pwunconv", "rdate", "resize", "rmmod", "rpm",
			"set", "setconsole", "setenv", "setup", "sndconfig", "timeconfig", "ulimit", "unalias", "unset" };
	private int howManyCommands;
	private String myName;

	public SystemSettingsCommands() {
		howManyCommands = 0;
		myName = "系统设置命令";
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
