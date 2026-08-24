# Development Journal

## Phase 1 — The Inheritance Trap

Creating the `SwimmerFlyer` class felt clunky because inheritance made each hero's movement behavior part of the class hierarchy. A `FlyingHero` knows how to fly and a `SwimmingHero` knows how to swim, but a hero that needs both abilities does not fit neatly into either class.

To make `SwimmerFlyer` work, I had to put both movement behaviors into the new class. This creates redundant code and makes the design harder to maintain. If I wanted to create more combinations of abilities, I would poentiallyt need to create even more subclasses.

This approach is considered brittle because changes to the hierarchy can affect many classes. Inheritance also makes it difficult to mix and match behaviors because a class is tied to the behavior it inherits. A hero cannot easily switch from one movement type to another without creating or changing its class.
