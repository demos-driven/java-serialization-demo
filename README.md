# Java serialization demo

## Read binary file

```bash
xxd -b target/classes/simple
```

Sample output:

```
00000000: 10101100 11101101 00000000 00000101 01110111 00010100  ....w.
00000006: 00000000 00000000 00100111 01100110 00000000 00001110  ..'f..
0000000c: 01001000 01100101 01101100 01101100 01101111 00100000  Hello
00000012: 01000011 01101111 01101101 01110000 01100001 01110011  Compas
00000018: 01110011 00100001 01110011 01110010 00000000 00011100  s!sr..
0000001e: 01010011 01101001 01101101 01110000 01101100 01100101  Simple
00000024: 01010011 01100101 01110010 01101001 01100001 01101100  Serial
0000002a: 01101001 01111010 01100001 01110100 01101001 01101111  izatio
00000030: 01101110 00100100 01000101 01101101 01110000 01101100  n$Empl
00000036: 01101111 01111001 01100101 01100101 01101101 10111111  oyeem.
0000003c: 10001110 10010110 00111111 01110000 01101100 00000010  ..?pl.
00000042: 00000010 00000000 00000001 01001100 00000000 00000100  ...L..
00000048: 01101110 01100001 01101101 01100101 01110100 00000000  namet.
0000004e: 00010010 01001100 01101010 01100001 01110110 01100001  .Ljava
00000054: 00101111 01101100 01100001 01101110 01100111 00101111  /lang/
0000005a: 01010011 01110100 01110010 01101001 01101110 01100111  String
00000060: 00111011 01111000 01110000 01110100 00000000 00001011  ;xpt..
00000066: 01001100 01101001 01110100 01101111 01101110 01100111  Litong
0000006c: 00100000 01000100 01100101 01101110 01100111            Deng
```