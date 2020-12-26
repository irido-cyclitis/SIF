# .SIF - Standard Image Format

2x2 pixels image "Size: 12 bytes + 4 bytes = 16 bytes" <br>
![](https://i.imgur.com/7T9MvdS.png)

Content of a file: img.sif . values outside 32...126 range displayed in italics as *[byte value]*:

2x2.x#*[145]*d*[24]*dd* *[28]* *[145]*dd-

A 1024x1024 image will be 3.145738 MB.<br>
A 500x500 image will be 258 KB.<br>
A 4096x4096 image will be 26.777216 MB.<br>
A 10000x10000 image will be 112 MB.<br>

Every Pixel will take 3 bytes of storage + A prefix will draw **int**x**int** pixel plane. The software "under dev." will convert the decimal char to RGB and insert it in the plane from left to right.

Every pixel has it's RGB Color, So I converted the RGB values as Decimal values. The image above is Decimal to ASCII.

The image is easy to read "by a software" and can be shrinked!
