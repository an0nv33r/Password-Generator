# Password-Generator

This project is a **Java Console Application** to generate Random passwords and perform a password strength check.

It is designed to create strong, randomized passwords for enhanced security. The project uses a combination of letters, numbers, and special characters to generate unique passwords that are difficult to guess or crack. Users can customize the password length and complexity to meet their specific needs.

It also includes a password strength checker feature that checks for the overall strength of the entered password. Although, I know it is not very straightforward to use as many people do not know how to use it. But I assure you that with the phase of my learning process, I will create a **GUI (Graphical User Interface)** for the application.

# Usage

- Clone the github repository.

- Open the project in the IDE you want to use.

- Click on **src** folder.

- Click on **Main** file, now run it

_(If you get any error make sure that : Before running the **Main** file you had assigned **jdk** to the project in the project settings on your IDE.)_

# Functionalities:

### 1. Generating a Password:

- The user must answer by **Yes or No** the questions to know if he desires to use Uppercase/Lowercase letters, Numbers, or Symbols. The user then enters the desired length of the password. Soon after entering the desired length, The randomly generated password is then displayed on the console.

### 2. Checking a Password's Strength:

- The Strength check is based on the following criteria:

- The password uses Uppercase Letters.
- The password uses Lowercase Letters.
- The password uses Numbers.
- The password uses Symbols.
- The length of the password is 8 or more (8 is often the minimum required length for a decent password).
- The length of the password is 16 or more (16 is considered to be the minimum length for a good password).
- These are used to calculate a score for the password used to know what message to display to the user **_weak/medium/good/great_** password.

### 3- Displaying Useful Information:

- This is a minor feature that displays on the console information for the user about password security **(Avoid using the same password twice/ Avoid character repetition, keyboard patterns, dictionary words, letter or number sequences, etc.)**

# Additional Information

- JDK (Oracle OpenJDK version 17.0.6)
