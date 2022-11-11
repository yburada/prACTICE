package password;

class Authhonticator{
	public String validate(String Username, String Password) {
		if(Username.equals("havishya")) {
			if(Password.equals("yogesh143")) {
				return "---System Unlocked---";
			}
			else {
				return "---INVALID PASSWORD---";
			}
		}
		else {
			return "---INVALID USERNAME---";
		}
		
	}
}
