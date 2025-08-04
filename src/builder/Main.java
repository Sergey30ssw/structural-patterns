package builder;

public class Main {
    public static void main(String[] args) {
        GamingPC budgetPC = new GamingPC.Builder("Intel i5", "RTX 4060")
                .ram(16)
                .ssd(512)
                .build();

        GamingPC premiumPC = new GamingPC.Builder("Intel i9", "RTX 5090")
                .ram(64)
                .ssd(2000)
                .liquidCooling(true)
                .rgbLighting(true)
                .build();

        System.out.println("Budget PC:");
        System.out.println(budgetPC);

        System.out.println("\nPremium PC:");
        System.out.println(premiumPC);
    }
}