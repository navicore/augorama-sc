* route matching is done 100% from root like "children" routing
* node routing has "sharding" boolean (root naturally is usually the only one set to *true*)
* all attrs are settable individually on any node (safe document based config for later)
* each node can have a list of prototypes (boolean for clone - delegate will use async msging to prototype actor - this will require child and state ops dsl for when response comes back from prototype about what to do)

# paths:

/actors/  (implicit root actor)
/actors/<name>
/actors/<name>/<name> (as in instance name: /actors/thermometer/1234)
/function/<name>           (as in /function/sum)

# actors

## functions

* builtins
* set by api
  * Scala
  * R
  * other

## config

statePlans: list of name/path/function
childrenPaths: list of name/path
prototypes: list of paths to inherit statePlans and childrenPaths


TODO: how to avoid multiple parsing
* by having every set of childrenPaths registered to root?
* just passing around the parsed form and only serializing for sharding? (**** probably this)
