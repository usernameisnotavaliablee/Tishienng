package xyz.adscope.amps.model.config.response;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class AuctionStrategyModel implements xyz.adscope.amps.model.inter.IDeepCopyModel<xyz.adscope.amps.model.config.response.AuctionStrategyModel> {
    private int auctionType;
    private java.lang.String customData;
    private int effectRate;
    private boolean isHit;
    private int isLastLook;
    private boolean isRaise;
    private boolean isUseLastLook;
    private int originEcpm;
    private int raiseSortPrice;
    private int secondPrice;
    private java.lang.String winPriceMax;
    private java.lang.String winPriceMin;

    public AuctionStrategyModel() {
            r0 = this;
            r0.<init>()
            return
    }

    private AuctionStrategyModel(xyz.adscope.amps.model.config.response.AuctionStrategyModel r2) {
            r1 = this;
            r1.<init>()
            int r0 = r2.getRaiseSortPrice()
            r1.raiseSortPrice = r0
            int r0 = r2.getEffectRate()
            r1.effectRate = r0
            int r0 = r2.getAuctionType()
            r1.auctionType = r0
            int r0 = r2.getIsLastLook()
            r1.isLastLook = r0
            java.lang.String r0 = r2.getWinPriceMin()
            r1.winPriceMin = r0
            java.lang.String r0 = r2.getWinPriceMax()
            r1.winPriceMax = r0
            int r0 = r2.getSecondPrice()
            r1.secondPrice = r0
            java.lang.String r0 = r2.getCustomData()
            r1.customData = r0
            int r0 = r2.getOriginEcpm()
            r1.originEcpm = r0
            boolean r0 = r2.isHit()
            r1.isHit = r0
            boolean r0 = r2.isRaise()
            r1.isRaise = r0
            boolean r2 = r2.isUseLastLook()
            r1.isUseLastLook = r2
            return
    }

    @Override // xyz.adscope.amps.model.inter.IDeepCopyModel
    public /* bridge */ /* synthetic */ xyz.adscope.amps.model.config.response.AuctionStrategyModel deepCopy() {
            r1 = this;
            xyz.adscope.amps.model.config.response.AuctionStrategyModel r0 = r1.deepCopy2()
            return r0
    }

    @Override // xyz.adscope.amps.model.inter.IDeepCopyModel
    /* renamed from: deepCopy, reason: avoid collision after fix types in other method */
    public xyz.adscope.amps.model.config.response.AuctionStrategyModel deepCopy2() {
            r1 = this;
            xyz.adscope.amps.model.config.response.AuctionStrategyModel r0 = new xyz.adscope.amps.model.config.response.AuctionStrategyModel
            r0.<init>(r1)
            return r0
    }

    public int getAuctionType() {
            r1 = this;
            int r0 = r1.auctionType
            return r0
    }

    public java.lang.String getCustomData() {
            r1 = this;
            java.lang.String r0 = r1.customData
            return r0
    }

    public int getEffectRate() {
            r1 = this;
            int r0 = r1.effectRate
            return r0
    }

    public int getIsLastLook() {
            r1 = this;
            int r0 = r1.isLastLook
            return r0
    }

    public int getOriginEcpm() {
            r1 = this;
            int r0 = r1.originEcpm
            return r0
    }

    public int getRaiseSortPrice() {
            r1 = this;
            int r0 = r1.raiseSortPrice
            return r0
    }

    public int getSecondPrice() {
            r1 = this;
            int r0 = r1.secondPrice
            return r0
    }

    public java.lang.String getWinPriceMax() {
            r1 = this;
            java.lang.String r0 = r1.winPriceMax
            return r0
    }

    public java.lang.String getWinPriceMin() {
            r1 = this;
            java.lang.String r0 = r1.winPriceMin
            return r0
    }

    public boolean isHit() {
            r1 = this;
            boolean r0 = r1.isHit
            return r0
    }

    public boolean isRaise() {
            r1 = this;
            boolean r0 = r1.isRaise
            return r0
    }

    public boolean isUseLastLook() {
            r1 = this;
            boolean r0 = r1.isUseLastLook
            return r0
    }

    public void setAuctionType(int r1) {
            r0 = this;
            r0.auctionType = r1
            return
    }

    public void setCustomData(java.lang.String r1) {
            r0 = this;
            r0.customData = r1
            return
    }

    public void setEffectRate(int r1) {
            r0 = this;
            r0.effectRate = r1
            return
    }

    public void setHit(boolean r1) {
            r0 = this;
            r0.isHit = r1
            return
    }

    public void setIsLastLook(int r1) {
            r0 = this;
            r0.isLastLook = r1
            return
    }

    public void setOriginEcpm(int r1) {
            r0 = this;
            r0.originEcpm = r1
            return
    }

    public void setRaise(boolean r1) {
            r0 = this;
            r0.isRaise = r1
            return
    }

    public void setRaiseSortPrice(int r1) {
            r0 = this;
            r0.raiseSortPrice = r1
            return
    }

    public void setSecondPrice(int r1) {
            r0 = this;
            r0.secondPrice = r1
            return
    }

    public void setUseLastLook(boolean r1) {
            r0 = this;
            r0.isUseLastLook = r1
            return
    }

    public void setWinPriceMax(java.lang.String r1) {
            r0 = this;
            r0.winPriceMax = r1
            return
    }

    public void setWinPriceMin(java.lang.String r1) {
            r0 = this;
            r0.winPriceMin = r1
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "{\"raiseSortPrice\":"
            r0.append(r1)
            int r1 = r2.raiseSortPrice
            r0.append(r1)
            java.lang.String r1 = ", \"effectRate\":"
            r0.append(r1)
            int r1 = r2.effectRate
            r0.append(r1)
            java.lang.String r1 = ", \"auctionType\":"
            r0.append(r1)
            int r1 = r2.auctionType
            r0.append(r1)
            java.lang.String r1 = ", \"isLastLook\":"
            r0.append(r1)
            int r1 = r2.isLastLook
            r0.append(r1)
            java.lang.String r1 = ", \"winPriceMin\":\""
            r0.append(r1)
            java.lang.String r1 = r2.winPriceMin
            r0.append(r1)
            java.lang.String r1 = "\", \"winPriceMax\":\""
            r0.append(r1)
            java.lang.String r1 = r2.winPriceMax
            r0.append(r1)
            java.lang.String r1 = "\", \"secondPrice\":"
            r0.append(r1)
            int r1 = r2.secondPrice
            r0.append(r1)
            java.lang.String r1 = ", \"customData\":\""
            r0.append(r1)
            java.lang.String r1 = r2.customData
            java.lang.String r1 = xyz.adscope.common.json.util.JsonUtil.addEscapeChar(r1)
            r0.append(r1)
            java.lang.String r1 = "\""
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
