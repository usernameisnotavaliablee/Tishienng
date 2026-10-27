package xyz.adscope.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public interface h4 extends xyz.adscope.ad.m2<xyz.adscope.ad.g4> {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum a extends java.lang.Enum<xyz.adscope.ad.h4.a> implements xyz.adscope.ad.l2 {
        public static final xyz.adscope.ad.h4.a c = null;
        public static final xyz.adscope.ad.h4.a d = null;
        public static final xyz.adscope.ad.h4.a e = null;
        public static final xyz.adscope.ad.h4.a f = null;
        public static final xyz.adscope.ad.h4.a g = null;
        public static final xyz.adscope.ad.h4.a h = null;
        private static final /* synthetic */ xyz.adscope.ad.h4.a[] i = null;
        private final int a;
        private final java.lang.String b;

        static {
                xyz.adscope.ad.h4$a r0 = new xyz.adscope.ad.h4$a
                r1 = 542(0x21e, float:7.6E-43)
                java.lang.String r2 = "play_start"
                java.lang.String r3 = "VIDEO_START"
                r4 = 0
                r0.<init>(r3, r4, r1, r2)
                xyz.adscope.ad.h4.a.c = r0
                xyz.adscope.ad.h4$a r0 = new xyz.adscope.ad.h4$a
                r1 = 33
                java.lang.String r2 = "play_process"
                java.lang.String r3 = "VIDEO_PROCESS"
                r4 = 1
                r0.<init>(r3, r4, r1, r2)
                xyz.adscope.ad.h4.a.d = r0
                xyz.adscope.ad.h4$a r0 = new xyz.adscope.ad.h4$a
                r1 = 555(0x22b, float:7.78E-43)
                java.lang.String r2 = "play_end"
                java.lang.String r3 = "VIDEO_FINISHED"
                r4 = 2
                r0.<init>(r3, r4, r1, r2)
                xyz.adscope.ad.h4.a.e = r0
                xyz.adscope.ad.h4$a r0 = new xyz.adscope.ad.h4$a
                r1 = 557(0x22d, float:7.8E-43)
                java.lang.String r2 = "video play valid"
                java.lang.String r3 = "VIDEO_PLAY_VALID"
                r4 = 3
                r0.<init>(r3, r4, r1, r2)
                xyz.adscope.ad.h4.a.f = r0
                xyz.adscope.ad.h4$a r0 = new xyz.adscope.ad.h4$a
                r1 = 556(0x22c, float:7.79E-43)
                java.lang.String r2 = "video play error"
                java.lang.String r3 = "VIDEO_ERROR"
                r4 = 4
                r0.<init>(r3, r4, r1, r2)
                xyz.adscope.ad.h4.a.g = r0
                xyz.adscope.ad.h4$a r0 = new xyz.adscope.ad.h4$a
                r1 = 558(0x22e, float:7.82E-43)
                java.lang.String r2 = "video prepared"
                java.lang.String r3 = "VIDEO_PREPARED"
                r4 = 5
                r0.<init>(r3, r4, r1, r2)
                xyz.adscope.ad.h4.a.h = r0
                xyz.adscope.ad.h4$a[] r0 = a()
                xyz.adscope.ad.h4.a.i = r0
                return
        }

        a(java.lang.String r1, int r2, int r3, java.lang.String r4) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.a = r3
                r0.b = r4
                return
        }

        private static /* synthetic */ xyz.adscope.ad.h4.a[] a() {
                r0 = 6
                xyz.adscope.ad.h4$a[] r0 = new xyz.adscope.ad.h4.a[r0]
                xyz.adscope.ad.h4$a r1 = xyz.adscope.ad.h4.a.c
                r2 = 0
                r0[r2] = r1
                xyz.adscope.ad.h4$a r1 = xyz.adscope.ad.h4.a.d
                r2 = 1
                r0[r2] = r1
                xyz.adscope.ad.h4$a r1 = xyz.adscope.ad.h4.a.e
                r2 = 2
                r0[r2] = r1
                xyz.adscope.ad.h4$a r1 = xyz.adscope.ad.h4.a.f
                r2 = 3
                r0[r2] = r1
                xyz.adscope.ad.h4$a r1 = xyz.adscope.ad.h4.a.g
                r2 = 4
                r0[r2] = r1
                xyz.adscope.ad.h4$a r1 = xyz.adscope.ad.h4.a.h
                r2 = 5
                r0[r2] = r1
                return r0
        }

        public static xyz.adscope.ad.h4.a valueOf(java.lang.String r1) {
                java.lang.Class<xyz.adscope.ad.h4$a> r0 = xyz.adscope.ad.h4.a.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                xyz.adscope.ad.h4$a r1 = (xyz.adscope.ad.h4.a) r1
                return r1
        }

        public static xyz.adscope.ad.h4.a[] values() {
                xyz.adscope.ad.h4$a[] r0 = xyz.adscope.ad.h4.a.i
                java.lang.Object r0 = r0.clone()
                xyz.adscope.ad.h4$a[] r0 = (xyz.adscope.ad.h4.a[]) r0
                return r0
        }

        @Override // xyz.adscope.ad.l2
        public int getEventCode() {
                r1 = this;
                int r0 = r1.a
                return r0
        }
    }

    void a(xyz.adscope.ad.l2 r1, int r2);

    void d(xyz.adscope.ad.l2 r1);

    void e(xyz.adscope.ad.l2 r1);

    void f(xyz.adscope.ad.l2 r1);
}
