package hyc.com.beans;

public class NetworkCommands implements LinuxCommands {
	private String[] allCommands = { "dip", "getty", "mingetty", "ppp-off", "smbma", "telnet", "uulog", "uustat", "cu",
			"dnsconf", "efax", "httpd", "ifconfig", "mesg", "minicom", "nc", "netconf", "netstat", "ping", "pppstats",
			"setserial", "shapecfg", "statserial", "talk", "Tcpdump", "testparm", "traceroute", "tty", "uuname",
			"wall", "write", "ytalk", "arpwatch", "apachectl", "smbclient", "pppsetup" };
	private int howManyCommands;
	private String myName;

	public NetworkCommands() {
		howManyCommands = 0;
		myName = "ÍøÂçÍ¨Ñ¶ÃüÁî";
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
		return myName + ": " + howManyCommands + " Ìõ";
	}
}
