Netflix tips
The Circle  
good for a coach to watch
mob with the chat bot...

Apple:   coach of british football Ted Lasso
Young Royals ←- swedish Netflix (youth series)

LINK to Emily Bache's Samman Learning Hour using Cyber-dojo.org for TDD
Master Coding with Cyber-Dojo: Step-by-Step TDD Practice
Days of Christmas in Python


TODO:
Diamond kata for
using different types of asserts
weakest assertion that still moves forward

To say: 
do kata so many times that you know it in your sleep

session 0
https://cyber-dojo.org/kata/edit/wn6GvU

TDD
pitput that we want
copy paste and print


make it in as few lines as possible


opt 0: copy paste and print

option 1: TDD small steps
option 2: bad sln early and refactor to improve it
write a test that checks that I get 
op3 fake it til you make it


COach can do a session 0

-----
IDEAS
1) seeing the kata and the code
this is not a kata that I would choose for a a beginner when teaching the strength of TDD
one way to do this
write an Approval Test Test
then do iterative refactoring
bad but correct implemetnation like Samuel  described in option 2 earlier
could ALMOST always stay green 

example you could do small utilitiy functions 
and you could to Tratitional TDD on the utility function
Double LOop TDD  
the outerloop would be      Fake it til you make it 

a good way to show and teach getting a working product FIRST
it is not the shortest sln
it works but it is bad (because it is not short)

2) two things a) wrong  code  and b) the test 
situation 
did one test for 1st day
the second test you wrote
   then there was a promlem with the test
COULD BRING THEIR attention to way these tests are entangled.

then you implemented another test that 
CANNOT pass WITH hte second test 
stop after they wrote the test

and ask them to something that might be problematic
what do you see
```java
public class Myclass {
public static String answer() {
        return """
                    On the first day of Christmas
                    My true love gave to me:
                    A partridge in a pear tree.
        
                    On the second day of Christmas
                    My true love gave to me:
                    Two turtle doves and
                    A partridge in a pear tree.""";
            } }
```
  DESIGN thing:  did not follow **OPen Closed  principle**
 open for extension and closed for modifiation

I changed something    and now I need to change all my tests
**dependacy inversion** 

DESIGN OF the CODE


we wrote all the code in this answer method
 rather than having all 

3) the assertion is too strong

`void copy_first_2_days() {`
...
` assertEquals(expected, actual);`
a different assertion could be:
assertContains(expected, actual)

there are many types of Asserts!!!!
assert  greaterThan or smallerThan or ...

TODO: 
Diamond kata for 
using different types of asserts


