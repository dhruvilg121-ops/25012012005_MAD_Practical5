# Android Login & Registration App (Jetpack Compose)

**Student Name:** Dhruvil Gandhi  
**Enrollment Number:** 25012012005  

---

## 📌 Project Overview

This Android application demonstrates modern UI development using **Jetpack Compose** and **Material Design 3**. It implements clean, reactive state management for both **Login** and **Registration** workflows with smooth in-app screen navigation.

---

## 🚀 Key Features

* **Jetpack Compose UI**: Built entirely with declarative UI components (`Column`, `OutlinedTextField`, `Button`, `Text`).
* **State Management**: Uses `remember` and `mutableStateOf` to handle user input state reactively.
* **Navigation Compose**: Seamlessly switches between the Login screen and the Registration screen using `NavHost` and `NavController`.
* **Secure Inputs**: Features hidden password text transformation (`PasswordVisualTransformation`) and tailored keyboard options (`KeyboardType.Email`).

---

## 🛠️ Dependencies Required (`build.gradle.kts`)

Ensure you have the Jetpack Compose and Navigation dependencies included:

```kotlin
implementation("androidx.activity:activity-compose:1.9.0")
implementation(platform("androidx.compose:compose-bom:2024.05.00"))
implementation("androidx.compose.ui:ui")
implementation("androidx.compose.material3:material3")
implementation("androidx.navigation:navigation-compose:2.7.7")
