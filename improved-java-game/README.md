# Improved Java Paranoid Game

## فارسی

### معرفی پروژه

این پروژه نسخه‌ای بهبودیافته از یک بازی آموزشی Java / OOP در سبک بازی‌های Brick Breaker / Arkanoid است.

در این بازی، بازیکن با کنترل یک نوار در پایین صفحه، توپ را به سمت آجرها، موانع و آیتم‌های مختلف هدایت می‌کند. بازی شامل توپ، نوار بازیکن، آجرها، موانع بتنی، آیتم‌های کمکی، جان، تیر، دشمن، امتیازدهی و چند مرحله مختلف است.

این پروژه شامل دو بخش اصلی است:

- `game/` — بخش اصلی بازی
- `map-designer/` — ابزار طراحی نقشه / مرحله برای بازی

---

### منبع اصلی و اعتباردهی

این پروژه از صفر توسط من نوشته نشده است.

نسخه اولیه این پروژه یک پروژه آموزشی Java / OOP از استاد **GholamAli Irani** و مجموعه **AsenaTechAcademy** بوده است.

من این نسخه را برای تمرین بیشتر در برنامه‌نویسی شیءگرا، اضافه کردن قابلیت‌های جدید، مرتب‌سازی پروژه و انتشار تمیزتر در GitHub توسعه داده‌ام.

منابع اصلی:

- Original game project:  
  https://github.com/AsenaTechAcademy/Irani-OOP-in-Java-gGame-Paranoid

- Original map designer project:  
  https://github.com/AsenaTechAcademy/Irani-OOP-in-Java-gGames-Paranoid-MapDesigner

- Instructor GitHub profile:  
  https://github.com/GholamaliIrani

Modified and improved by:

- Matin Amouzadeh  
  https://github.com/MatinAmouzadeh

---

### ساختار پروژه

```text
improved-java-game/
├── game/
│   ├── README.md
│   └── src/
│       ├── Images/
│       ├── Sounds/
│       ├── classdiagram/
│       └── *.java
│
├── map-designer/
│   ├── README.md
│   └── src/
│       ├── Images/
│       └── *.java
│
└── README.md
```

---

### بخش‌های پروژه

#### بخش Game

پوشه `game/` شامل خود بازی اصلی است.

این بخش شامل منطق اجرای بازی، حلقه بازی، مدیریت برخوردها، کنترل توپ، کنترل نوار بازیکن، مدیریت مراحل، امتیازدهی، جان‌ها، صداها، تصاویر و آیتم‌های گیم‌پلی است.

#### بخش Map Designer

پوشه `map-designer/` شامل ابزار طراحی نقشه یا مرحله برای بازی است.

این ابزار برای چیدن عناصر مختلف بازی روی صفحه استفاده می‌شود و می‌تواند در ساخت یا طراحی مراحل بازی کمک کند.

---

### تغییرات و بهبودهای من

تغییرات اصلی من روی بخش `game/` انجام شده است.

مهم‌ترین تغییرات:

- اضافه کردن اجرای مبتنی بر `Thread` برای بخش اصلی بازی
- اضافه کردن چند نقشه / مرحله جدید
- مرتب‌سازی ترتیب مراحل بازی
- اضافه کردن قابلیت چندتوپه شدن بازی
- اضافه کردن قابلیت افزایش اندازه نوار پایین بازی
- اضافه کردن و تغییر برخی آیتم‌ها و قابلیت‌های گیم‌پلی
- مرتب‌سازی فایل‌ها و assetهای پروژه برای انتشار در GitHub
- نگه داشتن بخش Map Designer به عنوان ابزار کمکی طراحی مرحله

---

### تکنولوژی‌ها و مفاهیم استفاده‌شده

- Java
- Object-Oriented Programming
- Java Swing
- Java AWT
- Thread
- Game Loop
- Collision Detection
- Keyboard Event Handling
- Sprite / Image Handling
- Sound Handling
- Level Design

---

### نحوه اجرا

برای اجرای بخش اصلی بازی:

```bash
cd improved-java-game/game/src
javac *.java
java Main
```

برای اجرای ابزار طراحی نقشه:

```bash
cd improved-java-game/map-designer/src
javac *.java
java GMap
```

نکته: این پروژه از مسیرهای نسبی مثل `Images/...` و `Sounds/...` استفاده می‌کند. بنابراین بهتر است هر بخش از داخل پوشه `src` همان بخش اجرا شود تا فایل‌های تصویری و صوتی به‌درستی شناسایی شوند.

---

### وضعیت پروژه

این پروژه یک پروژه آموزشی و تمرینی است.

هدف اصلی آن تمرین مفاهیم برنامه‌نویسی شیءگرا، ساختار بازی‌های ساده، مدیریت برخوردها، کار با Thread، کار با تصویر و صدا و طراحی مرحله در Java است.

این پروژه production-ready نیست، اما برای تمرین OOP، تحلیل کد و توسعه قابلیت‌های جدید مناسب است.

---

## English

### Project Overview

This project is an improved version of an educational Java / OOP game inspired by classic Brick Breaker / Arkanoid-style games.

In this game, the player controls a paddle at the bottom of the screen and keeps the ball moving to destroy bricks, obstacles, and other game elements. The game includes a ball, paddle, bricks, concrete blocks, helper items, lives, bullets, enemies, scoring, and multiple levels.

This project contains two main parts:

- `game/` — the main game
- `map-designer/` — a map / level designer tool for the game

---

### Original Source and Attribution

This project was not written from scratch by me.

The original version is an educational Java / OOP project by **GholamAli Irani** and **AsenaTechAcademy**.

I modified and improved this version as part of my object-oriented programming practice, gameplay extension, project organization, and GitHub portfolio improvement.

Original sources:

- Original game project:  
  https://github.com/AsenaTechAcademy/Irani-OOP-in-Java-gGame-Paranoid

- Original map designer project:  
  https://github.com/AsenaTechAcademy/Irani-OOP-in-Java-gGames-Paranoid-MapDesigner

- Instructor GitHub profile:  
  https://github.com/GholamaliIrani

Modified and improved by:

- Matin Amouzadeh  
  https://github.com/MatinAmouzadeh

---

### Project Structure

```text
improved-java-game/
├── game/
│   ├── README.md
│   └── src/
│       ├── Images/
│       ├── Sounds/
│       ├── classdiagram/
│       └── *.java
│
├── map-designer/
│   ├── README.md
│   └── src/
│       ├── Images/
│       └── *.java
│
└── README.md
```

---

### Project Parts

#### Game

The `game/` folder contains the main game implementation.

It includes the game logic, game loop, collision handling, ball movement, paddle control, level management, scoring, lives, sounds, images, and gameplay items.

#### Map Designer

The `map-designer/` folder contains a simple tool for designing maps and levels.

It is used to place different game elements on the screen and can help with creating or designing game levels.

---

### My Improvements

Most of my changes were made in the `game/` module.

Main improvements:

- Added threaded execution for the main game
- Added several new maps / levels
- Organized the level order
- Added multi-ball gameplay
- Added paddle size increase feature
- Added and modified some gameplay items and features
- Organized project files and assets for GitHub publication
- Kept the Map Designer as a helper tool for level design

---

### Technologies and Concepts

- Java
- Object-Oriented Programming
- Java Swing
- Java AWT
- Thread
- Game Loop
- Collision Detection
- Keyboard Event Handling
- Sprite / Image Handling
- Sound Handling
- Level Design

---

### How to Run

To run the main game:

```bash
cd improved-java-game/game/src
javac *.java
java Main
```

To run the map designer tool:

```bash
cd improved-java-game/map-designer/src
javac *.java
java GMap
```

Note: This project uses relative paths such as `Images/...` and `Sounds/...`. It is recommended to run each application from inside its own `src` folder so the image and sound files can be loaded correctly.

---

### Project Status

This is an educational and practice project.

Its main purpose is to practice object-oriented programming, simple game structure, collision management, threading, image and sound handling, and level design in Java.

This project is not production-ready, but it is useful for OOP practice, code analysis, and adding new gameplay features.
