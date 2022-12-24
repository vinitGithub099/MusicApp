# Online Music Downloader and Player

## A Java Low Level Design Application following SOLID Principle
This application allows you to listen to your favourite music online. It first checks to see whether
the music has already been downloaded; if not, it searches for available servers (Mediator Design
pattern searches for and returns available servers). Music begins downloading if it finds any
available servers. Downloaded music is saved in a virtual storage-space of a single instance
(Singleton Design Pattern). Music begins playing as soon as the download is finished. If the music
has already been downloaded, it simply begins playing (Proxy Design Pattern verifies the same.).
A music can be in two states: Play and Pause. If the user commands play twice while a song is
already playing, nothing happens (State Design Pattern).


### Contributers:
Twinshu Parmar https://github.com/twi05 <br>
Vinit Kumbhare https://github.com/vinitGithub099<br>
Kartik Gamot https://github.com/kart027