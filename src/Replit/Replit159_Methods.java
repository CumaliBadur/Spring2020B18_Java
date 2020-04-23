package Replit;

public class Replit159_Methods {
    public static void main(String[] args) {

        String terr = c_profits(100, 100);
        System.out.println(terr);

    }


    public static String c_profits(int buyPrice, int sellPrice) {
        //your code here
        String result = "";
        if (buyPrice < sellPrice) {
            result = "profit";
        } else if (buyPrice > sellPrice) {
            result = "loss";
        } else {

            result = "no loss";
        }
        return result;
    }
}

/* //your code here
        String result= (buyPricesellPrice)? "profit": (buyPricesellPrice)? "loss":"no loss";
         return result;
    }
}*/





/*Instructions from your teacher:
c_profits gets the buyPrice(int) and sellPrice(int) and determines if there was a profit or loss.
it returns a string value that can be "profit","loss","no loss"

for example:
c_profis(100,1500)
returns : "profit"

c_profis(20,5)
returns : "loss"

c_profis(100,100)
returns : "no loss"
*/