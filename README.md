# basic_spring_mvc
Got a basic setup of spring MVC in intellij.  Make a copy whilst it's fresh :(


Precious little information that helps with setting up a basic spring MVC project in intelliJ.  Most stuff seems to assume you are using eclipse or fully paid for intelliJ.  Even the udemy trainig stuff says that setting things up is a nightmare.

So.  Tried to bear the pain to produce a simple mvc project that I can repeat until I'm blue in the face.
One thing I can't easily document is which parts of what I'm playing with caused a "URI is not registered (settings|Lang & framework|schemas and DTDs)
However selecting "fetch External Resources" resolved whatever the issue was.  Not convinced it needed resolving, mind

Note that a "No spring webApplicationInitializer" was effectively a red herring. Didin't relate to the issues I had.
Main issues were failing to register that the return value of HelloWorldController dictates the page/JSP to move to

Basically?
==========
  create a project from maven webApp archetype (within intelliJ or directly)
  add a java folder (under src/main( and "Mark Directory as .." and choose option "Source folder"??
  ?? do something similar to get a test directory - src/test - question for another day ... ??
  thereafter can use create new/package (or create a class that includes the package as well as class name)
  need a certain amount of magic in WEB-INF
    create web.xml that refers to the "config" xml file that we want
    the desire "config" xml then tells spring what to scan for controllers etc and what to do with returned "view" names 
      (prefix says where they can be found - "/web-inf/view" - and what filename suffix = ".jsp" - they'll have

Other approaches are no doubt available.  I suspect that starting from a known, safe point will have LOTS of value ..
