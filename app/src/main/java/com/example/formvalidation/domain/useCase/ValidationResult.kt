package com.example.formvalidation.domain.useCase

data class ValidationResult(
    val successful: Boolean,
    val errorMessage: String? = null
)
