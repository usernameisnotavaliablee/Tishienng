package xyz.adscope.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public enum d extends java.lang.Enum<xyz.adscope.ad.d> implements xyz.adscope.common.v2.encrypt.impl.AesUtil.IAESConfig {
    public static final xyz.adscope.ad.d c = null;
    private static final /* synthetic */ xyz.adscope.ad.d[] d = null;
    private final java.lang.String a;
    private final java.lang.String b;

    static {
            xyz.adscope.ad.d r0 = new xyz.adscope.ad.d
            java.lang.String r1 = "@/.D>XVX5zhOdwj8"
            java.lang.String r2 = "\u007f}{y<usqomkigeca"
            java.lang.String r3 = "ASNP_AES"
            r4 = 0
            r0.<init>(r3, r4, r1, r2)
            xyz.adscope.ad.d.c = r0
            xyz.adscope.ad.d[] r0 = a()
            xyz.adscope.ad.d.d = r0
            return
    }

    d(java.lang.String r1, int r2, java.lang.String r3, java.lang.String r4) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.a = r3
            r0.b = r4
            return
    }

    private java.lang.String a(java.lang.String r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L1b
            r0.<init>(r3)     // Catch: java.lang.Exception -> L1b
            r0.reverse()     // Catch: java.lang.Exception -> L1b
            r3 = 0
        L9:
            int r1 = r0.length()     // Catch: java.lang.Exception -> L1b
            if (r3 >= r1) goto L1d
            char r1 = r0.charAt(r3)     // Catch: java.lang.Exception -> L1b
            int r1 = r1 - r3
            char r1 = (char) r1     // Catch: java.lang.Exception -> L1b
            r0.setCharAt(r3, r1)     // Catch: java.lang.Exception -> L1b
            int r3 = r3 + 1
            goto L9
        L1b:
            r3 = move-exception
            goto L22
        L1d:
            java.lang.String r3 = r0.toString()     // Catch: java.lang.Exception -> L1b
            return r3
        L22:
            xyz.adscope.common.v2.log.SDKLog.stack(r3)
            java.lang.String r3 = ""
            return r3
    }

    private static /* synthetic */ xyz.adscope.ad.d[] a() {
            r0 = 1
            xyz.adscope.ad.d[] r0 = new xyz.adscope.ad.d[r0]
            xyz.adscope.ad.d r1 = xyz.adscope.ad.d.c
            r2 = 0
            r0[r2] = r1
            return r0
    }

    public static xyz.adscope.ad.d valueOf(java.lang.String r1) {
            java.lang.Class<xyz.adscope.ad.d> r0 = xyz.adscope.ad.d.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            xyz.adscope.ad.d r1 = (xyz.adscope.ad.d) r1
            return r1
    }

    public static xyz.adscope.ad.d[] values() {
            xyz.adscope.ad.d[] r0 = xyz.adscope.ad.d.d
            java.lang.Object r0 = r0.clone()
            xyz.adscope.ad.d[] r0 = (xyz.adscope.ad.d[]) r0
            return r0
    }

    @Override // xyz.adscope.common.v2.encrypt.impl.AesUtil.IAESConfig
    public java.lang.String generateAesKey() {
            r1 = this;
            java.lang.String r0 = r1.a
            java.lang.String r0 = r1.a(r0)
            return r0
    }

    @Override // xyz.adscope.common.v2.encrypt.impl.AesUtil.IAESConfig
    public java.lang.String generateAesVector() {
            r1 = this;
            java.lang.String r0 = r1.b
            java.lang.String r0 = r1.a(r0)
            return r0
    }
}
