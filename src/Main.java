public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 20_897;
        int miles = service.calculate(price); // должно получиться 500
        System.out.println("Начислено " + miles + " бонусных единиц.");
    }
}