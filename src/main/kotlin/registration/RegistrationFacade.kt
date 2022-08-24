package registration

class RegistrationFacade {
    private val registeredUsers: MutableList<User> = mutableListOf()

    fun register(user: User) {
        registeredUsers.add(user)
    }

    fun isUserRegistered(user: User): Boolean {
        return registeredUsers.contains(user)
    }

}
