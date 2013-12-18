package hyc.com.beans;

public class MailCommands implements LinuxCommands {
	private String[] allCommands = { "archive", "ctlinnd", "elm", "getlist", "inncheck", "mail", "messages",
			"metamail", "mutt", "nntpget", "pine", "slrn" };
	private int howManyCommands;
	private String myName;

	public MailCommands() {
		howManyCommands = 0;
		myName = "ÓÊ¼şÃüÁî";
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
