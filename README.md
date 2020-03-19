# rot2137
Bizarre rots with weird numbers.

#### Warning
[TableRot2137](https://github.com/PinkLolicorn/rot2137/blob/master/src/main/java/pl/daffit/rot2137/impl/TableRot2137.java) is currently borked, because [TableRotED](https://github.com/PinkLolicorn/rot2137/blob/master/src/main/java/pl/daffit/rot2137/TableRotED.java) implementation isn't ideal (it is borked too).

### Example
```java
UnicodeRot2137 rot2137 = new UnicodeRot2137();
String result = rot2137.encode("Hello World!");
// output: ࢡ\u08BE\u08C5\u08C5\u08C8\u0879ࢰ\u08C8\u08CB\u08C5ࢽ\u087A
```

### Use with caution
This code produces strange outputs in Alien languages.