package frames;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CheckLoginUserFormat {

	/**
	 * Fais le test pour vérifier si le login utilisateur réspecte 
	 * les consignes 
	 */
	@Test
    @DisplayName("Test Correct login user format")
    void EmailValidFormat() {
        assertTrue(SignUpFrame.isEmailFormatValid("user@example.com"));
        assertTrue(SignUpFrame.isEmailFormatValid("john.doe123@domain.net"));
        assertFalse(SignUpFrame.isEmailFormatValid("userexample.com")); // Pas de @
        assertFalse(SignUpFrame.isEmailFormatValid("user@com")); // Domaine invalide
        assertFalse(SignUpFrame.isEmailFormatValid("@example.com")); // Pas de nom avant @
        assertFalse(SignUpFrame.isEmailFormatValid("user@.com")); // Domaine invalide
    }

	/**
	 * Fais le test si le mot de passe est sûr
	 * Strong password
	 * */
	@Test
	@DisplayName("Test Strong Password")
	void isPasswordUserStrong() {
		assertTrue(SignUpFrame.isPasswordFormatValid("StrongP@ss143"));
        assertFalse(SignUpFrame.isPasswordFormatValid("weakpass"));
        assertFalse(SignUpFrame.isPasswordFormatValid("Short1!"));
        assertFalse(SignUpFrame.isPasswordFormatValid("NoSpecialChar1"));
        assertFalse(SignUpFrame.isPasswordFormatValid("nouppercase1!"));
	}
}

