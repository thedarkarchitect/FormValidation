package com.example.formvalidation.presentation

import com.example.formvalidation.domain.useCase.ValidateRepeatedPassword

sealed class RegistrationFormEvent{
    data class EmailChanged(val email: String) : RegistrationFormEvent()
    data class PasswordChanged(val password: String) : RegistrationFormEvent()
    data class RepeatedPasswordChanged(val repeatedPassword: String) : RegistrationFormEvent()
    data class AcceptedTerms(val isAccepted: Boolean) : RegistrationFormEvent()
    data object Submit: RegistrationFormEvent()

}
