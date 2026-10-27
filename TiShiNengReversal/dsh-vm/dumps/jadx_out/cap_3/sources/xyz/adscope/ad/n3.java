package xyz.adscope.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public interface n3 extends xyz.adscope.ad.m2<xyz.adscope.ad.m3> {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum a extends java.lang.Enum<xyz.adscope.ad.n3.a> implements xyz.adscope.ad.l2 {
        public static final xyz.adscope.ad.n3.a c = null;
        public static final xyz.adscope.ad.n3.a d = null;
        public static final xyz.adscope.ad.n3.a e = null;
        public static final xyz.adscope.ad.n3.a f = null;
        public static final xyz.adscope.ad.n3.a g = null;
        private static final /* synthetic */ xyz.adscope.ad.n3.a[] h = null;
        private final int a;
        private final java.lang.String b;

        static {
                xyz.adscope.ad.n3$a r0 = new xyz.adscope.ad.n3$a
                java.lang.String r1 = "click_interactive_trigger"
                java.lang.String r2 = "CLICK_INTERACTIVE_TRIGGER"
                r3 = 0
                r0.<init>(r2, r3, r3, r1)
                xyz.adscope.ad.n3.a.c = r0
                xyz.adscope.ad.n3$a r0 = new xyz.adscope.ad.n3$a
                r1 = 1
                java.lang.String r2 = "gesture_interactive_trigger"
                java.lang.String r4 = "GESTURE_INTERACTIVE_TRIGGER"
                r0.<init>(r4, r1, r1, r2)
                xyz.adscope.ad.n3.a.d = r0
                xyz.adscope.ad.n3$a r0 = new xyz.adscope.ad.n3$a
                r1 = 2
                java.lang.String r2 = "shake_interactive_trigger"
                java.lang.String r4 = "SHAKE_INTERACTIVE_TRIGGER"
                r0.<init>(r4, r1, r1, r2)
                xyz.adscope.ad.n3.a.e = r0
                xyz.adscope.ad.n3$a r0 = new xyz.adscope.ad.n3$a
                r1 = 3
                java.lang.String r2 = "euler_interactive_trigger"
                java.lang.String r4 = "EULER_INTERACTIVE_TRIGGER"
                r0.<init>(r4, r1, r1, r2)
                xyz.adscope.ad.n3.a.f = r0
                xyz.adscope.ad.n3$a r0 = new xyz.adscope.ad.n3$a
                r1 = 4
                java.lang.String r2 = "optimize_interactive_trigger"
                java.lang.String r4 = "OPTIMIZE_INTERACTIVE_TRIGGER"
                r0.<init>(r4, r1, r3, r2)
                xyz.adscope.ad.n3.a.g = r0
                xyz.adscope.ad.n3$a[] r0 = a()
                xyz.adscope.ad.n3.a.h = r0
                return
        }

        a(java.lang.String r1, int r2, int r3, java.lang.String r4) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.a = r3
                r0.b = r4
                return
        }

        private static /* synthetic */ xyz.adscope.ad.n3.a[] a() {
                r0 = 5
                xyz.adscope.ad.n3$a[] r0 = new xyz.adscope.ad.n3.a[r0]
                xyz.adscope.ad.n3$a r1 = xyz.adscope.ad.n3.a.c
                r2 = 0
                r0[r2] = r1
                xyz.adscope.ad.n3$a r1 = xyz.adscope.ad.n3.a.d
                r2 = 1
                r0[r2] = r1
                xyz.adscope.ad.n3$a r1 = xyz.adscope.ad.n3.a.e
                r2 = 2
                r0[r2] = r1
                xyz.adscope.ad.n3$a r1 = xyz.adscope.ad.n3.a.f
                r2 = 3
                r0[r2] = r1
                xyz.adscope.ad.n3$a r1 = xyz.adscope.ad.n3.a.g
                r2 = 4
                r0[r2] = r1
                return r0
        }

        public static xyz.adscope.ad.n3.a valueOf(java.lang.String r1) {
                java.lang.Class<xyz.adscope.ad.n3$a> r0 = xyz.adscope.ad.n3.a.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                xyz.adscope.ad.n3$a r1 = (xyz.adscope.ad.n3.a) r1
                return r1
        }

        public static xyz.adscope.ad.n3.a[] values() {
                xyz.adscope.ad.n3$a[] r0 = xyz.adscope.ad.n3.a.h
                java.lang.Object r0 = r0.clone()
                xyz.adscope.ad.n3$a[] r0 = (xyz.adscope.ad.n3.a[]) r0
                return r0
        }

        @Override // xyz.adscope.ad.l2
        public int getEventCode() {
                r1 = this;
                int r0 = r1.a
                return r0
        }
    }

    void a(android.view.View r1, xyz.adscope.ad.n3.a r2);
}
