package _06_vault;

public class SecretAgent {
	int findCode(Vault vault) {
		int code = -1;
		for (int i = 0; i < 1000001; i++) {
			if (vault.tryCode(i)) {
				code = i;
			}
		}
		return code;
	}
}
