This file will contain documentation for all commands available in your game.

Note:  It's a good idea to also make this list available inside the game, in response to a `HELP` command.

Note: We decided to not make this list available inside the game because the player can only use certain commands based on their location. Since that's the case, we clearly tell the user when they can use what commands using the showOptions() method. 

When the game first begins, the initial "command" to start the game is to enter your name (case sensitive)
The rest of the commands throughout the game are not case sensitive. 

When the player's location is...
Home:
    + EAST - takes the player to the cafe
    + WEST - takes the player to the book store
    + NORTH - takes the player to the hair salon
    + SOUTH - takes the player to the nail salon
    + END - ends the game

Cafe:
    + BUY SOMETHING - lets the player order something from the menu
    + SIT DOWN - lets a player sit down 
    + GET UP - lets a player stand up
    + EXIT - takes the player back home

Book Store:
    + CHOOSE A BOOK - lets a player select a book and choose whether to buy it
    + RETURN A BOOK - lets a player return a book 
    + SIT DOWN - lets a player sit down 
    + GET UP - lets a player stand up
    + EXIT - takes the player back home

Hair Salon:
    + WASH - lets a player get their hair washed
    + DRY - lets a player get their hair dried
    + STYLE - lets a player get their hair styled
    + CUT - lets a player get their hair cut
    + EXIT - takes the player back home

Nail Salon:
    + MANICURE - lets a player get a manicure
    + PEDICURE - lets a player get a pedicure
    + BOTH - lets a player get both a manicure and a pedicure
    + EXIT - takes the player back home

# SPOILER ALERT

If your game includes challenges that must be overcome to win, also list them below.

Not challenges to overcome necessarily but, a player can only get their hair cut three times before they're bald!
