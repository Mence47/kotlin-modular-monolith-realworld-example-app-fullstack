package registration

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class RegistrationTest {

    @Test
    fun `New user can sign up`() {
        val registrationFacade = RegistrationFacade()

        val newUser: User = User()
        registrationFacade.register(newUser)

        assertTrue(registrationFacade.isUserRegistered(newUser))
    }
}

