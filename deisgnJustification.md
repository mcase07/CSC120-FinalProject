## Design Justification
Design justification (including a brief discussion of at least one alternative you considered)
One of the things we considered for this design was the possibility of doing if else statements in our main class. We have a class for each of our locations, with each method that a player can perform in each place contained within the respective class. Each of the locations are subclasses of the Building class because they have similar architectures, needing a name and a showOptions() method that shows all of the methods that can be performed in each subclass (inhereting one from Building, exit()).

In the Player class, there are primarily attributes and a couple of modifiers