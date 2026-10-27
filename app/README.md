# CampusHub – Assignment 2 (Android, Java + XML)

## Features
- Splash screen (logo + name) → Login after 2 seconds
- Login with validation (demo account: test@example.com / 123456)
- Register with name, email, password, confirm-password validation
- Forgot Password (simulated) → Reset Password with validation
- Dashboard: GridLayout of 6 module cards (icon + text)
- Profile: shows user info and Logout

## Navigation flow
Splash → Login → (Register → Login) | (Forgot Password → Reset Password → Login) | Dashboard → Profile → Logout → Login

## Technical points
- Layouts: LinearLayout, ConstraintLayout, GridLayout
- Resources: strings.xml, values-ur/strings.xml, values-night/colors.xml
- Input types: textEmailAddress, textPassword, textPersonName
- Explicit Intents between all Activities
- Authentication is simulated with hard-coded values