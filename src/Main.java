public class Main {

    public static void main(String[] args) {

        double dog  = 8 ;
        var cat = 3.6 ;
        var paper = 763789  ;
/* Excersice 1*/
        System.out.println(" Step 1 . Initial all variables" + "\n");
        System.out.println("dog   = " + dog  + "\n"
                          +"cat   = " + cat  + "\n"
                          +"paper = " + paper + "\n"
        );

        dog = dog + 4  ;
        cat = cat + 4 ;
        paper = paper +4 ;

        System.out.println(" Step 2 . Add 4 to all variables" + "\n");
        System.out.println("dog   = " + dog  + "\n"
                +"cat   = " + cat  + "\n"
                +"paper = " + paper + "\n"
        );

        dog = dog - 3.5  ;
        cat = cat - 1.6 ;
        paper = paper - 7639 ;

        System.out.println(" Step 3 . Decrease all variables" + "\n");
        System.out.println("dog   = " + dog  + "\n"
                +"cat   = " + cat  + "\n"
                +"paper = " + paper + "\n"
        );
        /* Excersice 2*/

        var friend = 19;
        System.out.println("friend = " + friend  + "\n");
        friend = friend + 2 ;
        System.out.println("friend + 2 = " + friend  + "\n");
        friend = friend / 7  ;
        System.out.println("friend : 7 = " + friend  + "\n");
        var frog = 3.5;
        System.out.println("frog = " + frog  + "\n");
        frog = frog * 10 ;
        System.out.println("frog * 10 = " + frog  + "\n");
        frog = frog / 3.5  ;
        System.out.println("frog : 3.5 = " + frog  + "\n");
        frog = frog + 4  ;
        System.out.println("frog + 4 = " + frog  + "\n");

        /* Excersice 3*/
        var firstBoxerWheight = 78.2;
        var secondBoxerWheight = 82.7;
        System.out.println("Вес первого боксёра  = " + firstBoxerWheight  + " кг.\n"
                          + "Вес второго боксёра  = " + secondBoxerWheight + " кг.\n"
                          + "Вместе они весят     = " + ( firstBoxerWheight + secondBoxerWheight) + " кг.\n"
                          + "Разница в их весе    = " + ( secondBoxerWheight % firstBoxerWheight ) + " кг.\n"

        );
        /* var capacityLeft = liftingCapacity - stuffWeight; */
    }

}