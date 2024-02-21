# anagram

```
User@DESKTOP-R53SSAR MINGW64 ~/IdeaProjects/anagram/build/libs (main)
$ java -jar anagram-1.0-SNAPSHOT.jar compare 'abb' 'bab'
Hello and welcome to Anagram!
abb and bab are anagrams

User@DESKTOP-R53SSAR MINGW64 ~/IdeaProjects/anagram/build/libs (main)
$ java -jar anagram-1.0-SNAPSHOT.jar compare 'abb' 'bac'
Hello and welcome to Anagram!
abb and bac are not anagrams

User@DESKTOP-R53SSAR MINGW64 ~/IdeaProjects/anagram/build/libs (main)
$ java -jar anagram-1.0-SNAPSHOT.jar printAll 'abb'
Hello and welcome to Anagram!
all anagrams for abb:
abb abb bab bba bab bba

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

