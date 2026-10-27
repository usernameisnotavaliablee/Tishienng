package xyz.adscope.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public enum c extends java.lang.Enum<xyz.adscope.ad.c> {
    public static final xyz.adscope.ad.c c = null;
    public static final xyz.adscope.ad.c d = null;
    public static final xyz.adscope.ad.c e = null;
    public static final xyz.adscope.ad.c f = null;
    public static final xyz.adscope.ad.c g = null;
    public static final xyz.adscope.ad.c h = null;
    public static final xyz.adscope.ad.c i = null;
    private static final /* synthetic */ xyz.adscope.ad.c[] j = null;
    private final java.lang.String a;
    private final java.lang.String b;

    static {
            xyz.adscope.ad.c r0 = new xyz.adscope.ad.c
            java.lang.String r1 = "banner"
            java.lang.String r2 = "4"
            java.lang.String r3 = "BANNER"
            r4 = 0
            r0.<init>(r3, r4, r1, r2)
            xyz.adscope.ad.c.c = r0
            xyz.adscope.ad.c r0 = new xyz.adscope.ad.c
            java.lang.String r1 = "native"
            java.lang.String r2 = "3"
            java.lang.String r3 = "NATIVE"
            r4 = 1
            r0.<init>(r3, r4, r1, r2)
            xyz.adscope.ad.c.d = r0
            xyz.adscope.ad.c r0 = new xyz.adscope.ad.c
            java.lang.String r1 = "UNIFIED"
            r2 = 2
            java.lang.String r3 = "unified"
            java.lang.String r4 = ""
            r0.<init>(r1, r2, r3, r4)
            xyz.adscope.ad.c.e = r0
            xyz.adscope.ad.c r0 = new xyz.adscope.ad.c
            java.lang.String r1 = "interstitial"
            java.lang.String r2 = "2"
            java.lang.String r3 = "INTERSTITIAL"
            r5 = 3
            r0.<init>(r3, r5, r1, r2)
            xyz.adscope.ad.c.f = r0
            xyz.adscope.ad.c r0 = new xyz.adscope.ad.c
            r1 = 4
            java.lang.String r2 = "video"
            java.lang.String r3 = "VIDEO"
            r0.<init>(r3, r1, r2, r4)
            xyz.adscope.ad.c.g = r0
            xyz.adscope.ad.c r0 = new xyz.adscope.ad.c
            java.lang.String r1 = "splash"
            java.lang.String r2 = "1"
            java.lang.String r3 = "SPLASH"
            r5 = 5
            r0.<init>(r3, r5, r1, r2)
            xyz.adscope.ad.c.h = r0
            xyz.adscope.ad.c r0 = new xyz.adscope.ad.c
            java.lang.String r1 = "S2S"
            r2 = 6
            r0.<init>(r1, r2, r1, r4)
            xyz.adscope.ad.c.i = r0
            xyz.adscope.ad.c[] r0 = a()
            xyz.adscope.ad.c.j = r0
            return
    }

    c(java.lang.String r1, int r2, java.lang.String r3, java.lang.String r4) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.a = r3
            r0.b = r4
            return
    }

    private static /* synthetic */ xyz.adscope.ad.c[] a() {
            r0 = 7
            xyz.adscope.ad.c[] r0 = new xyz.adscope.ad.c[r0]
            xyz.adscope.ad.c r1 = xyz.adscope.ad.c.c
            r2 = 0
            r0[r2] = r1
            xyz.adscope.ad.c r1 = xyz.adscope.ad.c.d
            r2 = 1
            r0[r2] = r1
            xyz.adscope.ad.c r1 = xyz.adscope.ad.c.e
            r2 = 2
            r0[r2] = r1
            xyz.adscope.ad.c r1 = xyz.adscope.ad.c.f
            r2 = 3
            r0[r2] = r1
            xyz.adscope.ad.c r1 = xyz.adscope.ad.c.g
            r2 = 4
            r0[r2] = r1
            xyz.adscope.ad.c r1 = xyz.adscope.ad.c.h
            r2 = 5
            r0[r2] = r1
            xyz.adscope.ad.c r1 = xyz.adscope.ad.c.i
            r2 = 6
            r0[r2] = r1
            return r0
    }

    public static xyz.adscope.ad.c valueOf(java.lang.String r1) {
            java.lang.Class<xyz.adscope.ad.c> r0 = xyz.adscope.ad.c.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            xyz.adscope.ad.c r1 = (xyz.adscope.ad.c) r1
            return r1
    }

    public static xyz.adscope.ad.c[] values() {
            xyz.adscope.ad.c[] r0 = xyz.adscope.ad.c.j
            java.lang.Object r0 = r0.clone()
            xyz.adscope.ad.c[] r0 = (xyz.adscope.ad.c[]) r0
            return r0
    }

    public java.lang.String b() {
            r1 = this;
            java.lang.String r0 = r1.b
            return r0
    }

    public java.lang.String c() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }
}
