# Development Journal

## Phase 1 — The Inheritance Trap

Creating the `SwimmerFlyer` class felt clunky because inheritance made each hero's movement behavior part of the class hierarchy. A `FlyingHero` knows how to fly and a `SwimmingHero` knows how to swim, but a hero that needs both abilities does not fit neatly into either class.

To make `SwimmerFlyer` work, I had to put both movement behaviors into the new class. This creates redundant code and makes the design harder to maintain. If I wanted to create more combinations of abilities, I would poentiallyt need to create even more subclasses.

This approach is considered brittle because changes to the hierarchy can affect many classes. Inheritance also makes it difficult to mix and match behaviors because a class is tied to the behavior it inherits. A hero cannot easily switch from one movement type to another without creating or changing its class.

## Phase 2: Implementing the Strategy Pattern

Moving from inheritance to composition changed the relationship between the Hero and its movement ability. Instead of the Hero having to be a FlyingHero or SwimmingHero, the Hero now has a MovementStrategy that controls how it moves. This makes the movement behavior more flexible because I can give a Hero a different strategy without creating another subclass.

If I wanted to add a Teleport ability, it would be easier with this version. I could create a new TeleportMove class that implements MovementStrategy without changing the Hero class or creating another Hero subclass. This makes the code easier to expand and mix different behaviors.

## Phase 3: Dynamic Behavior

I did not find switching the behavior at runtime very difficult. The setMovementStrategy method made it possible to replace the Hero's movement strategy without creating a new Hero object.

Compared to Phase 1, this approach feels much more flexible. In Phase 1, changing a movement ability meant creating or changing subclasses, which affected the identity of the object. With the Strategy Pattern, I can keep the same Hero and simply swap its movement capability depending on what is happening in the game.