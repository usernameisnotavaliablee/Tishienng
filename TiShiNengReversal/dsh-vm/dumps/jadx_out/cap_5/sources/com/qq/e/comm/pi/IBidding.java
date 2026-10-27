package com.qq.e.comm.pi;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public interface IBidding extends com.qq.e.comm.pi.IBiddingLoss {
    public static final java.lang.String ADN_ID = "adnId";
    public static final java.lang.String EXPECT_COST_PRICE = "expectCostPrice";
    public static final java.lang.String HIGHEST_LOSS_PRICE = "highestLossPrice";
    public static final java.lang.String LOSS_REASON = "lossReason";
    public static final java.lang.String WIN_PRICE = "winPrice";

    @java.lang.Deprecated
    void sendLossNotification(int r1, int r2, java.lang.String r3);

    @java.lang.Deprecated
    void sendWinNotification(int r1);

    void sendWinNotification(java.util.Map<java.lang.String, java.lang.Object> r1);

    void setBidECPM(int r1);
}
