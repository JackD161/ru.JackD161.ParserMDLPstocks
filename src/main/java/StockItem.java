public class StockItem {
    private final String sgtin; // SGTIN
    private final String mnn; // МНН
    private final String tradeName; // Торговое найменование
    private final String financeType; // Тип финансирования
    private final String seria; // производственная серия
    private final String expireDate; // срок годности
    public StockItem(String sgtin, String mnn, String tradeName, String seria, String expireDate, String financeType) {
        this.sgtin = sgtin;
        this.mnn = mnn;
        this.tradeName = tradeName;
        this.seria = seria;
        this.expireDate = expireDate;
        this.financeType = financeType;
    }

    public String getSgtin() {
        return sgtin;
    }

    public String getMnn() {
        return mnn;
    }

    public String getTradeName() {
        return tradeName;
    }

    public String getFinanceType() {
        return financeType;
    }

    public String getSeria() {
        return seria;
    }
    public String getExpireDate() {
        return expireDate;
    }
}
