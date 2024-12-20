# Rellorcs Edis (for Android) by Thomas Springfeldt

A side-scroller created as part of a course (Game Development for Android 7.5hp, conducted
by Ulf Benjaminssson).

---

## Passing Grade Achievements:

1 - Implement and support at least three controllers

- There is support for physical gamepad, accelerometer gamepad, and virtual joystick.
- (Accelerometer support is commented out in MainActivity to not interfere with other input)

2 - Create a static "enemy"

- Spikes has been implemented.

3 - Create a dynamic collectible Entity

- A collectible coin has been added to the game.

4 - Create a HUD

- A HUD has been added that shows player health and collected/remaining coins.

5 - Replace our TestLevel with a level layout loaded from assets folder

- level layout is now loaded from plain text file

6 - Add audio

- BGM for level 1 and 2 added. Added FX for all important interactions:
- level start, jump, powerup pickup, coin pickup, take damage, game over, level goal

7 - Improve the Viewport by adding support for world-bounds

- Added Viewport::lookAtWithBounds

---

## Pass With Distinction Achievements:

1 - Implement player win

- Level goals are implemented (reaching the yellow box at the end of the level)
- A second level is added, clearing it will take the player to level 1

2 - Add 2 different power ups to the game

- SpaceJump added. Makes the player jump really high, wearing a space suit.
- Invincibility added. Makes the player invulnerable.

---

## Asset Credits:

- sprites - https://opengameart.org/content/platform-pack
- powerup sprites - https://opengameart.org/content/shining-coin-shining-health-shining-power-up-sprite-sheets
- sfx and bgm - Thomas Springfeldt