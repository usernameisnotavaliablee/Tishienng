package xyz.adscope.ad.publish.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public interface IBidding {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class Adn {
        public static final java.lang.String ADN_BD = "1018";
        public static final java.lang.String ADN_BZ = "6666";
        public static final java.lang.String ADN_CSJ = "1013";
        public static final java.lang.String ADN_GDT = "1012";
        public static final java.lang.String ADN_GM = "1022";
        public static final java.lang.String ADN_HW = "1020";
        public static final java.lang.String ADN_JD = "1021";
        public static final java.lang.String ADN_KS = "1019";
        public static final java.lang.String ADN_OTHER = "9999";
        public static final java.lang.String ADN_QM = "1030";

        public Adn() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class BidLoseReason {
        public static final java.lang.String LOAD_TIME_OUT = "2";
        public static final java.lang.String LOW_PRICE = "1";
        public static final java.lang.String OTHER = "999";

        public BidLoseReason() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class BiddingPriceBuilder {
        public static final java.lang.String ADN_ID = "adnId";
        public static final java.lang.String EXPECT_PRICE = "expectPrice";
        public static final java.lang.String LOSS_REASON = "lossReason";
        public static final java.lang.String SEC_HIGHEST_PRICE = "secHighPrice";
        public static final java.lang.String WIN_PRICE = "winPrice";

        public BiddingPriceBuilder() {
                r0 = this;
                r0.<init>()
                return
        }

        public static java.util.Map<java.lang.String, java.lang.String> buildLoseNoticeMap(int r2, int r3, java.lang.String r4, java.lang.String r5, int r6) {
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                java.lang.String r2 = java.lang.String.valueOf(r2)
                java.lang.String r1 = "winPrice"
                r0.put(r1, r2)
                java.lang.String r2 = java.lang.String.valueOf(r3)
                java.lang.String r3 = "secHighPrice"
                r0.put(r3, r2)
                java.lang.String r2 = "lossReason"
                r0.put(r2, r5)
                java.lang.String r2 = "adnId"
                r0.put(r2, r4)
                java.lang.String r2 = java.lang.String.valueOf(r6)
                java.lang.String r3 = "expectPrice"
                r0.put(r3, r2)
                return r0
        }

        public static java.util.Map<java.lang.String, java.lang.String> buildWinNoticeMap(int r2, int r3, java.lang.String r4, int r5) {
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                java.lang.String r2 = java.lang.String.valueOf(r2)
                java.lang.String r1 = "winPrice"
                r0.put(r1, r2)
                java.lang.String r2 = java.lang.String.valueOf(r3)
                java.lang.String r3 = "secHighPrice"
                r0.put(r3, r2)
                java.lang.String r2 = "adnId"
                r0.put(r2, r4)
                java.lang.String r2 = java.lang.String.valueOf(r5)
                java.lang.String r3 = "expectPrice"
                r0.put(r3, r2)
                return r0
        }
    }

    int getECPM();

    void notifyBidLose(java.util.Map<java.lang.String, java.lang.String> r1);

    void notifyBidWin(java.util.Map<java.lang.String, java.lang.String> r1);
}
