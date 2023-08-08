package code;

public interface CodeVerify {
	
	int getSecurityCode();
	boolean isCodeCorrect(int secCodeToCheck);
}
