function checkPasswordStrength(password) {
    const strengthIndicators = document.querySelectorAll(".strength-indicator");

    const criteria = {
        uppercase: /[A-Z]/,
        lowercase: /[a-z]/,
        special: /[!@#$%^&*()_+\-=\[\]{};':"\\|,.<>\/?]+/,
        number: /[0-9]/
    };

    for (const indicator of strengthIndicators) {
        const criterion = indicator.classList[1];
        const verboseMessages = {
            uppercase: "At least one uppercase character",
            lowercase: "At least one lowercase character",
            special: "At least one special character",
            number: "At least one number"
        };

        if (password.match(criteria[criterion])) {
            indicator.textContent = "✔️ " + verboseMessages[criterion];
            indicator.classList.add("strong");
        } else {
            indicator.textContent = "❌ " + verboseMessages[criterion];
            indicator.classList.remove("strong");
        }
    }
}

function validateForm() {
    const password = document.getElementById("password").value;
    const confirmPassword = document.getElementById("confirm-password").value;
    const messageElement = document.getElementById("message");

    if (password !== confirmPassword) {
        messageElement.textContent = "Passwords do not match. Please make sure your passwords match.";
        return false;
    }

    // Reset the message when passwords match
    messageElement.textContent = "";
    return true;
}