# Shopping List App – Kotlin

**Shopping List App** is an Android application developed using Kotlin, designed to help users create and manage their shopping lists efficiently. The app allows users to add, edit, and remove items, providing a simple and intuitive interface for organizing shopping tasks.

---

## 🛠️ Technologies Used

- **Language:** Kotlin
- **Platform:** Android
- **Architecture:** Model-View-ViewModel (MVVM)
- **Libraries & Tools:** Android SDK, RecyclerView, LiveData, ViewModel

---

## 📂 Project Structure

ShoppingListApp/
├── app/src/main/java/com/example/shoppinglist/
│ ├── MainActivity.kt # Main activity handling UI and interactions
│ ├── ShoppingListViewModel.kt # ViewModel for managing shopping list data
│ └── models/
│ └── ShoppingItem.kt # Data model for shopping list items
├── app/src/main/res/
│ ├── layout/ # XML layouts for activities and fragments
│ └── values/ # Resource files for strings, colors, etc.
└── build.gradle.kts # Project dependencies and configuration

yaml
Copiar
Editar

---

## 🚀 Features

- **Add Items:** Users can add new items to their shopping list.
- **Edit Items:** Modify existing items to update quantities or details.
- **Remove Items:** Delete items from the list when no longer needed.
- **Persistent Storage:** Utilizes Room Database to store shopping list data persistently.
- **User-Friendly Interface:** Simple and clean UI for easy navigation and interaction.
