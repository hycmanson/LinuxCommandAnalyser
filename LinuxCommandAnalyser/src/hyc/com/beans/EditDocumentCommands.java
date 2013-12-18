package hyc.com.beans;

public class EditDocumentCommands implements LinuxCommands {
	private String[] allCommands = { "col", "colrm", "comm", "csplit", "ed", "egrep", "fgrep", "fmt", "fold", "grep",
			"ispell", "jed", "join", "look", "mtype", "pico", "rgrep", "sed", "sort", "spell", "tr", "uniq", "wc" };
	private int howManyCommands;
	private String myName;

	public EditDocumentCommands() {
		howManyCommands = 0;
		myName = "ÎÄµµ±à¼­ÃüÁî";
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
