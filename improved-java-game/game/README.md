# Game Module

## فارسی

### معرفی

این پوشه شامل بخش اصلی بازی **Improved Java Paranoid Game** است.

این بازی در سبک Brick Breaker / Arkanoid ساخته شده و با Java، Swing و AWT پیاده‌سازی شده است. بازیکن با استفاده از نوار پایین صفحه توپ را کنترل می‌کند و باید آجرها، موانع و عناصر مختلف مرحله را از بین ببرد.

---

### اعتباردهی

نسخه اولیه این بازی یک پروژه آموزشی Java / OOP از استاد **GholamAli Irani** و مجموعه **AsenaTechAcademy** بوده است.

من این نسخه را برای تمرین بیشتر، اضافه کردن قابلیت‌های جدید، مرتب‌سازی مراحل و آماده‌سازی پروژه برای GitHub توسعه داده‌ام.

منبع اصلی:

https://github.com/AsenaTechAcademy/Irani-OOP-in-Java-gGame-Paranoid

پروفایل استاد:

https://github.com/GholamaliIrani

Modified and improved by:

Matin Amouzadeh  
https://github.com/MatinAmouzadeh

---

### قابلیت‌های بازی

- کنترل نوار بازیکن با کیبورد
- حرکت توپ و برخورد با عناصر مختلف
- آجرهای قابل تخریب
- موانع بتنی
- سیستم امتیازدهی
- سیستم جان
- تیراندازی
- دشمن‌ها و آیتم‌های متحرک
- چند مرحله / نقشه مختلف
- آیتم‌های کمکی و قابلیت‌های گیم‌پلی

---

### تغییرات من در این بخش

تغییرات اصلی من روی همین بخش انجام شده است.

مهم‌ترین تغییرات:

- اضافه کردن اجرای مبتنی بر `Thread`
- اضافه کردن چند Map / Level جدید
- مرتب‌سازی ترتیب مراحل
- اضافه کردن قابلیت چندتوپه شدن
- اضافه کردن قابلیت افزایش اندازه نوار پایین بازی
- اضافه کردن و تغییر برخی آیتم‌ها و قابلیت‌های گیم‌پلی
- مرتب‌سازی فایل‌های بازی برای قرار گرفتن در GitHub

---

### ساختار فایل‌ها

```text
game/
├── README.md
└── src/
    ├── Images/
    ├── Sounds/
    ├── classdiagram/
    ├── Main.java
    ├── GGame.java
    ├── GBall.java
    ├── GBar.java
    ├── Brick.java
    ├── Beton.java
    ├── Levels.java
    └── ...
```

---

### کلاس‌های مهم

- `Main.java`  
  نقطه شروع اجرای بازی

- `GGame.java`  
  کلاس اصلی مدیریت بازی، پنجره، حلقه بازی، برخوردها و عناصر بازی

- `Levels.java`  
  مدیریت مراحل و نقشه‌های بازی

- `GBall.java`  
  مدیریت توپ و حرکت آن

- `GBar.java`  
  مدیریت نوار بازیکن و کنترل‌های کیبورد

- `Brick.java` و `Beton.java`  
  عناصر تخریب‌پذیر و مانع‌های بازی

- `GameElementAdapter.java`  
  کلاس پایه برای عناصر بازی

- `GameMovableElementAdapter.java`  
  کلاس پایه برای عناصر متحرک بازی

---

### نحوه اجرا

از داخل پوشه `game/src` اجرا کنید:

```bash
cd improved-java-game/game/src
javac *.java
java Main
```

یا در IDEهایی مثل Eclipse / IntelliJ IDEA، فایل `Main.java` را اجرا کنید.

---

### نکته اجرایی

چون پروژه از مسیرهای نسبی مثل `Images/...` و `Sounds/...` استفاده می‌کند، بهتر است اجرای برنامه از داخل پوشه `src` انجام شود.

---

### وضعیت

این بخش یک پروژه آموزشی و تمرینی برای یادگیری مفاهیم OOP، Game Loop، Thread، برخوردها، event handling، کار با تصویر و صدا در Java است.

---

## English

### Overview

This folder contains the main game module of **Improved Java Paranoid Game**.

The game is a Brick Breaker / Arkanoid-style Java game implemented with Java, Swing, and AWT. The player controls a paddle at the bottom of the screen and uses the ball to destroy bricks, obstacles, and other level elements.

---

### Attribution

The original version of this game is an educational Java / OOP project by **GholamAli Irani** and **AsenaTechAcademy**.

I modified and improved this version for additional practice, gameplay extension, level organization, and GitHub publication.

Original source:

https://github.com/AsenaTechAcademy/Irani-OOP-in-Java-gGame-Paranoid

Instructor profile:

https://github.com/GholamaliIrani

Modified and improved by:

Matin Amouzadeh  
https://github.com/MatinAmouzadeh

---

### Game Features

- Keyboard-controlled player paddle
- Ball movement and collision handling
- Destroyable bricks
- Concrete obstacles
- Scoring system
- Lives system
- Shooting / bullet feature
- Enemies and moving items
- Multiple maps / levels
- Helper items and gameplay features

---

### My Changes in This Module

Most of my changes were made in this module.

Main changes:

- Added threaded execution
- Added several new maps / levels
- Organized level order and progression
- Added multi-ball gameplay
- Added paddle size increase feature
- Added and modified some gameplay items and features
- Organized game files for GitHub publication

---

### File Structure

```text
game/
├── README.md
└── src/
    ├── Images/
    ├── Sounds/
    ├── classdiagram/
    ├── Main.java
    ├── GGame.java
    ├── GBall.java
    ├── GBar.java
    ├── Brick.java
    ├── Beton.java
    ├── Levels.java
    └── ...
```

---

### Important Classes

- `Main.java`  
  Application entry point

- `GGame.java`  
  Main game manager class responsible for the window, game loop, collisions, and game entities

- `Levels.java`  
  Handles game maps and levels

- `GBall.java`  
  Handles ball movement and collision logic

- `GBar.java`  
  Handles the player paddle and keyboard controls

- `Brick.java` and `Beton.java`  
  Game blocks and obstacles

- `GameElementAdapter.java`  
  Base class for game elements

- `GameMovableElementAdapter.java`  
  Base class for movable game elements

---

### How to Run

Run the project from inside the `game/src` folder:

```bash
cd improved-java-game/game/src
javac *.java
java Main
```

You can also run `Main.java` using an IDE such as Eclipse or IntelliJ IDEA.

---

### Runtime Note

Because the project uses relative paths such as `Images/...` and `Sounds/...`, it is recommended to run the application from inside the `src` folder.

---

### Status

This module is an educational and practice project for learning OOP, game loops, threading, collision handling, event handling, image handling, and sound handling in Java.
