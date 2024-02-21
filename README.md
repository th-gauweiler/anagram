# anagram

```
$ java -jar anagram-1.0-SNAPSHOT.jar cli
Hello and welcome to Anagram!
switched to interactive mode
use f1 to check if two words are anagram, e.g. f1 ( 'ab' , 'ba' )
use f2 to get historical anagrams of a word, e.g. f2 ( 'ab' )
use blanks for separate the tokens as shown above!
use exit to terminate the program
>f1 ( 'aab' , 'aba' )
aab and aba are anagrams
>f1 ( 'aab' , 'aba' )
aab and aba are anagrams
>f1 ( 'aab' , 'bac' )
aab and bac are not anagrams
>f1 ( 'aab' , 'baa' )
aab and baa are anagrams
>f2 ( 'aab' )
f2(aab) = [aba, baa]
>f2 ( 'aba' )
f2(aba) = [aab, baa]
>f2 ( 'bac' )
f2(bac) = []
>exit
