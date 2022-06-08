# Colors
Personal project to let users select their name color through the use of Essentials (or other plugin with a /nick command).
Found on SpigotMC at https://www.spigotmc.org/resources/colors.98939/

## Syntax
`/color [player] <valid color code>` (does not use & or color names for now)

Example: `/color 5`, or `/color muzak23 a`

## Requirements
Requires the nick plugin to use the format `/nick (username) (nick)` and to allow colors (obviously).

## Permissions
`colors.base`: Base permission to let users use /color and all colors besides c and e

`colors.e`: Lets users use the e color (yellow). Reserved for moderators.

`colors.c`: Lets users use the c color (red). Reserved for administrators.

`colors.rainbow`: Lets users use the rainbow color!

`colors.other`: Lets users change other's colors. Also requires sub nodes such as `colors.other.base`.
