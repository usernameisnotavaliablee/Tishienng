package xyz.adscope.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public interface a3 extends xyz.adscope.ad.m2<xyz.adscope.ad.y2> {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum a extends java.lang.Enum<xyz.adscope.ad.a3.a> implements xyz.adscope.ad.l2 {
        public static final xyz.adscope.ad.a3.a c = null;
        public static final xyz.adscope.ad.a3.a d = null;
        public static final xyz.adscope.ad.a3.a e = null;
        public static final xyz.adscope.ad.a3.a f = null;
        private static final /* synthetic */ xyz.adscope.ad.a3.a[] g = null;
        private final int a;
        private final java.lang.String b;

        static {
                xyz.adscope.ad.a3$a r0 = new xyz.adscope.ad.a3$a
                r1 = 501(0x1f5, float:7.02E-43)
                java.lang.String r2 = "ad exposure"
                java.lang.String r3 = "AD_EXPOSURE"
                r4 = 0
                r0.<init>(r3, r4, r1, r2)
                xyz.adscope.ad.a3.a.c = r0
                xyz.adscope.ad.a3$a r0 = new xyz.adscope.ad.a3$a
                r1 = 64
                java.lang.String r2 = "adn recognize"
                java.lang.String r3 = "ADN_RECOGNIZE"
                r4 = 1
                r0.<init>(r3, r4, r1, r2)
                xyz.adscope.ad.a3.a.d = r0
                xyz.adscope.ad.a3$a r0 = new xyz.adscope.ad.a3$a
                r1 = 67
                java.lang.String r2 = "ad view shown"
                java.lang.String r3 = "AD_VIEW_SHOWN"
                r4 = 2
                r0.<init>(r3, r4, r1, r2)
                xyz.adscope.ad.a3.a.e = r0
                xyz.adscope.ad.a3$a r0 = new xyz.adscope.ad.a3$a
                r1 = 68
                java.lang.String r2 = "ad view pause"
                java.lang.String r3 = "AD_VIEW_PAUSE"
                r4 = 3
                r0.<init>(r3, r4, r1, r2)
                xyz.adscope.ad.a3.a.f = r0
                xyz.adscope.ad.a3$a[] r0 = a()
                xyz.adscope.ad.a3.a.g = r0
                return
        }

        a(java.lang.String r1, int r2, int r3, java.lang.String r4) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.a = r3
                r0.b = r4
                return
        }

        private static /* synthetic */ xyz.adscope.ad.a3.a[] a() {
                r0 = 4
                xyz.adscope.ad.a3$a[] r0 = new xyz.adscope.ad.a3.a[r0]
                xyz.adscope.ad.a3$a r1 = xyz.adscope.ad.a3.a.c
                r2 = 0
                r0[r2] = r1
                xyz.adscope.ad.a3$a r1 = xyz.adscope.ad.a3.a.d
                r2 = 1
                r0[r2] = r1
                xyz.adscope.ad.a3$a r1 = xyz.adscope.ad.a3.a.e
                r2 = 2
                r0[r2] = r1
                xyz.adscope.ad.a3$a r1 = xyz.adscope.ad.a3.a.f
                r2 = 3
                r0[r2] = r1
                return r0
        }

        public static xyz.adscope.ad.a3.a valueOf(java.lang.String r1) {
                java.lang.Class<xyz.adscope.ad.a3$a> r0 = xyz.adscope.ad.a3.a.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                xyz.adscope.ad.a3$a r1 = (xyz.adscope.ad.a3.a) r1
                return r1
        }

        public static xyz.adscope.ad.a3.a[] values() {
                xyz.adscope.ad.a3$a[] r0 = xyz.adscope.ad.a3.a.g
                java.lang.Object r0 = r0.clone()
                xyz.adscope.ad.a3$a[] r0 = (xyz.adscope.ad.a3.a[]) r0
                return r0
        }

        @Override // xyz.adscope.ad.l2
        public int getEventCode() {
                r1 = this;
                int r0 = r1.a
                return r0
        }
    }

    void a(android.view.View r1);

    void a(xyz.adscope.ad.l2 r1, android.view.View r2);

    void b(android.view.View r1);

    void b(xyz.adscope.ad.l2 r1, android.view.View r2);
}
