//Binary numbers : start with a 0b prefix

int xInt = 0b10101111
assert xInt == 175

short xShort = 0b11001001
assert xShort == 201 as short

byte xByte = 0b11
assert xByte == 3 as byte

long xLong = 0b101101101101
assert xLong == 2925l

BigInteger xBigInteger = 0b111100100001
assert xBigInteger == 3873g

int xNegativeInt = -0b10101111
assert xNegativeInt == -175

//Octal numbers are specified in the the format of 0 followed by octal digits.

int oInt = 077
assert oInt == 63

short oShort = 011
assert oShort == 9 as short

byte oByte = 032
assert oByte == 26 as byte

long oLong = 0246
assert oLong == 166l

BigInteger oBigInteger = 01111
assert oBigInteger == 585g

int oNegativeInt = -077
assert oNegativeInt == -63

//Hexadecimal numbers are specified in the  format of 0x followed by hex digits


int hInt = 0x77
assert hInt == 119

short hShort = 0xaa
assert hShort == 170 as short

byte hByte = 0x3a
assert hByte == 58 as byte

long hLong = 0xffff
assert hLong == 65535l

BigInteger hBigInteger = 0xaaaa
assert hBigInteger == 43690g

Double hDouble = new Double('0x1.0p0')
assert hDouble == 1.0d

int hNegativeInt = -0x77
assert hNegativeInt == -119

//decimal numbers  

// primitive types
float  f = 1.234
double d = 2.345

// infinite precision
BigDecimal bd =  3.456

//use of underscore  in large number values
long creditCardNumber = 1234_5678_9012_3456L
long socialSecurityNumbers = 999_99_9999L
double monetaryAmount = 12_345_132.12

