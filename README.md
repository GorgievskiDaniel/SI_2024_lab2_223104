# Daniel Gjorgjievski 223104

## 2.Control Flow Graph

![Alt](https://github.com/GorgievskiDaniel/SI_2024_lab2_223104/blob/master/CFG.png?raw=true)

## 3.Цикломатска комплексност

Цикломатската комплексност на овој код е 10, формулата која ја користев за да го добијам резултатот е P+1, каде P е бројот на предикатни јазли. Во случајoв P=9, па затоа цикломатската комплексност на кодот изнесува 10.

## 4.Test cases според Every Branch критериум

[]

Item("Slika","DA",340,9.0),Payment=200

Item("Chinija","1233",400,15.0),Payment=350

Item("Guma","0104",40,0.0),Payment=55

Item("","05",300,20.0),Payment=160

Item("Tetratka",null,100,5.0),45

![Alt](https://github.com/GorgievskiDaniel/SI_2024_lab2_223104/blob/master/EveryBranch.png?raw=true)

## 5. Test cases според Multiple Condition критериумот

if (item.getPrice() > 300 && item.getDiscount() > 0 && item.getBarcode().charAt(0) == '0')

Можни услови :

F && X && X -> item.getPrice() < =300 , item.getDiscount() = anything, item.getBarcode().charAt(0)=anything

T && F && X ->item.getPrice() >=300 , item.getDiscount() <=0 , item.getBarcode().chatAt(0)=anything

T && T && T -> item.getPrice() >= 300, item.getDiscount() > 0 , item.getBarcode().charAt(0) == '0'
