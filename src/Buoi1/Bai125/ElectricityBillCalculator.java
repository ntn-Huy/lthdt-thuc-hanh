package Buoi1.Bai125;

/**
 * Tinh tien dien sinh hoat theo bac thang (don gia gia dinh cho bai tap).
 */
public class ElectricityBillCalculator {
    private static final int TIER_1_LIMIT_KWH = 50;
    private static final int TIER_2_LIMIT_KWH = 100;
    private static final long TIER_1_PRICE = 1806; // dong/kWh
    private static final long TIER_2_PRICE = 1866;
    private static final long TIER_3_PRICE = 2167;
    private static final double VAT_RATE = 0.08;

    /**
     * @param usedKwh so kWh tieu thu trong thang (khong am)
     * @param includeVat true neu cong thue VAT
     * @return so tien phai tra (dong), da lam tron
     */
    public static long calculateBill(int usedKwh, boolean includeVat) {
        if (usedKwh < 0) {
            throw new IllegalArgumentException("So kWh khong duoc am");
        }
        long amount = costBeforeTax(usedKwh);
        return includeVat ? Math.round(amount * (1 + VAT_RATE)) : amount;
    }

    private static long costBeforeTax(int kwh) {
        int tier1 = Math.min(kwh, TIER_1_LIMIT_KWH);
        int tier2 = Math.min(Math.max(kwh - TIER_1_LIMIT_KWH, 0), TIER_2_LIMIT_KWH - TIER_1_LIMIT_KWH);
        int tier3 = Math.max(kwh - TIER_2_LIMIT_KWH, 0);
        return tier1 * TIER_1_PRICE + tier2 * TIER_2_PRICE + tier3 * TIER_3_PRICE;
    }

    public static void main(String[] args) {
        System.out.println(calculateBill(120, true));
        System.out.println(calculateBill(30, false));
    }
}
