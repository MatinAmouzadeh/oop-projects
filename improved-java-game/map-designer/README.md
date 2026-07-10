# Map Designer Module

## فارسی

### معرفی

این پوشه شامل ابزار طراحی نقشه / مرحله برای بازی Paranoid است.

این ابزار برای چیدن عناصر مختلف بازی روی صفحه استفاده می‌شود و می‌تواند به تولید یا طراحی مراحل بازی کمک کند.

بخش Map Designer از پروژه آموزشی اصلی نگه داشته شده و کنار نسخه بهبودیافته بازی قرار گرفته است.

---

### اعتباردهی

نسخه اولیه این ابزار مربوط به پروژه آموزشی Java / OOP از استاد **GholamAli Irani** و مجموعه **AsenaTechAcademy** است.

من این بخش را به عنوان ابزار کمکی برای پروژه بازی نگه داشته‌ام تا ساختار کامل‌تر پروژه مشخص باشد.

منبع اصلی:

https://github.com/AsenaTechAcademy/Irani-OOP-in-Java-gGames-Paranoid-MapDesigner

پروفایل استاد:

https://github.com/GholamaliIrani

Maintained in this repository by:

Matin Amouzadeh  
https://github.com/MatinAmouzadeh

---

### کاربرد

Map Designer برای طراحی و چیدن عناصر مرحله استفاده می‌شود.

این ابزار می‌تواند عناصر مختلفی مثل آجر، بتن، قلب، دشمن، آیتم‌ها و سایر اجزای بازی را روی نقشه قرار دهد و به ساخت مرحله کمک کند.

---

### ساختار فایل‌ها

```text
map-designer/
├── README.md
└── src/
    ├── Images/
    ├── GMap.java
    ├── MElement.java
    ├── Sprite.java
    └── SpriteStore.java
```

---

### کلاس‌های مهم

- `GMap.java`  
  کلاس اصلی ابزار طراحی نقشه

- `MElement.java`  
  مدل عنصر قابل قرارگیری روی نقشه

- `Sprite.java`  
  کلاس مربوط به نمایش تصویر

- `SpriteStore.java`  
  کلاس مدیریت و بارگذاری تصاویر

---

### نحوه اجرا

از داخل پوشه `map-designer/src` اجرا کنید:

```bash
cd improved-java-game/map-designer/src
javac *.java
java GMap
```

یا در IDE، فایل `GMap.java` را اجرا کنید.

---

### نکته

این بخش بیشتر به عنوان ابزار کمکی طراحی مرحله کنار پروژه نگه داشته شده است. تغییرات اصلی من روی بخش `game/` انجام شده است.

---

## English

### Overview

This folder contains the map / level designer tool for the Paranoid game.

The tool is used to place different game elements on the screen and can help with creating or designing game levels.

The Map Designer module is kept from the original educational project and included next to the improved game version.

---

### Attribution

The original version of this tool belongs to the educational Java / OOP project by **GholamAli Irani** and **AsenaTechAcademy**.

I kept this module as a helper tool for the game project and to preserve the complete project structure.

Original source:

https://github.com/AsenaTechAcademy/Irani-OOP-in-Java-gGames-Paranoid-MapDesigner

Instructor profile:

https://github.com/GholamaliIrani

Maintained in this repository by:

Matin Amouzadeh  
https://github.com/MatinAmouzadeh

---

### Purpose

The Map Designer is used to design and place level elements.

It can help place elements such as bricks, concrete blocks, hearts, enemies, items, and other game components on a map.

---

### File Structure

```text
map-designer/
├── README.md
└── src/
    ├── Images/
    ├── GMap.java
    ├── MElement.java
    ├── Sprite.java
    └── SpriteStore.java
```

---

### Important Classes

- `GMap.java`  
  Main class of the map designer tool

- `MElement.java`  
  Model class for map elements

- `Sprite.java`  
  Handles image rendering

- `SpriteStore.java`  
  Handles image loading and caching

---

### How to Run

Run the tool from inside the `map-designer/src` folder:

```bash
cd improved-java-game/map-designer/src
javac *.java
java GMap
```

You can also run `GMap.java` using an IDE.

---

### Note

This module is kept mainly as a helper tool for level design. My main modifications were made in the `game/` module.
