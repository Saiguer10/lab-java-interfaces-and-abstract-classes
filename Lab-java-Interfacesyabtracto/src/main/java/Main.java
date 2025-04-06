import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        // Big Decimal

        BigDecimal num1 = new BigDecimal("4.2545");
        System.out.println("Round to hundredth: " + BigDecimalOperation.roundToHundredth(num1));

        BigDecimal num2 = new BigDecimal("1.2345");
        System.out.println(" Invert and round to tenth: " + BigDecimalOperation.invertAndRoundToTenth(num2));

        BigDecimal num3 = new BigDecimal("-45.67");
        System.out.println(" Invert and round to tenth: " + BigDecimalOperation.invertAndRoundToTenth(num3));

        //  Vehicles

        Sedan sedan = new Sedan("Bmw", "Hyundai", "Tucson", 30000);
        UtilityVehicle suv = new UtilityVehicle("U567", "Mercedes", "Gle", 65000, true);
        Truck truck = new Truck("T520", "Volvo", "50245", 70000, 6.5);

        System.out.println(sedan.getInfo());
        System.out.println(suv.getInfo());
        System.out.println(truck.getInfo());


        // Video

        Movie movie = new Movie("Inception", 148, 8.8);
        TvSeries series = new TvSeries("Stranger Things", 600, 34);

        System.out.println(movie.getInfo());
        System.out.println(series.getInfo());

        // IntList

        IntList list1 = new IntArrayList();
        IntList list2 = new IntVector();

        for (int i = 0; i < 25; i++) {
            list1.add(i);
            list2.add(i);
        }

        System.out.println("IntArrayList get(10): " + list1.get(10));
        System.out.println("IntVector get(10): " + list2.get(10));

    }

}


