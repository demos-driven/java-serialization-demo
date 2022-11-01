# Java serialization demo

## Read binary file

```bash
xxd -b target/classes/default
```

Sample output:

```
00000000: 10101100 11101101 00000000 00000101 01110111 00010100  ....w.
00000006: 00000000 00000000 00100111 01100110 00000000 00001110  ..'f..
0000000c: 01001000 01100101 01101100 01101100 01101111 00100000  Hello
00000012: 01000011 01101111 01101101 01110000 01100001 01110011  Compas
00000018: 01110011 00100001 01110011 01110010 00000000 00001000  s!sr..
0000001e: 01000101 01101101 01110000 01101100 01101111 01111001  Employ
00000024: 01100101 01100101 11000010 01111011 01100111 11001100  ee.{g.
0000002a: 11101001 01000010 11011001 11110001 00000010 00000000  .B....
00000030: 00000010 01001001 00000000 00000010 01101001 01100100  .I..id
00000036: 01001100 00000000 00000100 01101110 01100001 01101101  L..nam
0000003c: 01100101 01110100 00000000 00010010 01001100 01101010  et..Lj
00000042: 01100001 01110110 01100001 00101111 01101100 01100001  ava/la
00000048: 01101110 01100111 00101111 01010011 01110100 01110010  ng/Str
0000004e: 01101001 01101110 01100111 00111011 01111000 01110000  ing;xp
00000054: 00000000 00000000 00000000 00000001 01110100 00000000  ....t.
0000005a: 00001011 01001100 01101001 01110100 01101111 01101110  .Liton
00000060: 01100111 00100000 01000100 01100101 01101110 01100111  g Deng
```