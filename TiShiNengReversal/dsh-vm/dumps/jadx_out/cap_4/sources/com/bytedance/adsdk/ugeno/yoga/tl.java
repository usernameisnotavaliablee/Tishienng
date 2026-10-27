package com.bytedance.adsdk.ugeno.yoga;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public enum tl extends java.lang.Enum<com.bytedance.adsdk.ugeno.yoga.tl> {
    public static final com.bytedance.adsdk.ugeno.yoga.tl cw = null;
    public static final com.bytedance.adsdk.ugeno.yoga.tl j = null;
    private static final /* synthetic */ com.bytedance.adsdk.ugeno.yoga.tl[] up = null;
    public static final com.bytedance.adsdk.ugeno.yoga.tl xt = null;

    /* renamed from: r, reason: collision with root package name */
    private final int f2052r;

    static {
            com.bytedance.adsdk.ugeno.yoga.tl r0 = new com.bytedance.adsdk.ugeno.yoga.tl
            java.lang.String r1 = "UNDEFINED"
            r2 = 0
            r0.<init>(r1, r2, r2)
            com.bytedance.adsdk.ugeno.yoga.tl.j = r0
            com.bytedance.adsdk.ugeno.yoga.tl r0 = new com.bytedance.adsdk.ugeno.yoga.tl
            java.lang.String r1 = "EXACTLY"
            r2 = 1
            r0.<init>(r1, r2, r2)
            com.bytedance.adsdk.ugeno.yoga.tl.xt = r0
            com.bytedance.adsdk.ugeno.yoga.tl r0 = new com.bytedance.adsdk.ugeno.yoga.tl
            java.lang.String r1 = "AT_MOST"
            r2 = 2
            r0.<init>(r1, r2, r2)
            com.bytedance.adsdk.ugeno.yoga.tl.cw = r0
            com.bytedance.adsdk.ugeno.yoga.tl[] r0 = j()
            com.bytedance.adsdk.ugeno.yoga.tl.up = r0
            return
    }

    tl(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.f2052r = r3
            return
    }

    public static com.bytedance.adsdk.ugeno.yoga.tl j(int r2) {
            if (r2 == 0) goto L1e
            r0 = 1
            if (r2 == r0) goto L1b
            r0 = 2
            if (r2 != r0) goto Lb
            com.bytedance.adsdk.ugeno.yoga.tl r2 = com.bytedance.adsdk.ugeno.yoga.tl.cw
            return r2
        Lb:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unknown enum value: "
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r2 = r1.concat(r2)
            r0.<init>(r2)
            throw r0
        L1b:
            com.bytedance.adsdk.ugeno.yoga.tl r2 = com.bytedance.adsdk.ugeno.yoga.tl.xt
            return r2
        L1e:
            com.bytedance.adsdk.ugeno.yoga.tl r2 = com.bytedance.adsdk.ugeno.yoga.tl.j
            return r2
    }

    private static /* synthetic */ com.bytedance.adsdk.ugeno.yoga.tl[] j() {
            r0 = 3
            com.bytedance.adsdk.ugeno.yoga.tl[] r0 = new com.bytedance.adsdk.ugeno.yoga.tl[r0]
            com.bytedance.adsdk.ugeno.yoga.tl r1 = com.bytedance.adsdk.ugeno.yoga.tl.j
            r2 = 0
            r0[r2] = r1
            com.bytedance.adsdk.ugeno.yoga.tl r1 = com.bytedance.adsdk.ugeno.yoga.tl.xt
            r2 = 1
            r0[r2] = r1
            com.bytedance.adsdk.ugeno.yoga.tl r1 = com.bytedance.adsdk.ugeno.yoga.tl.cw
            r2 = 2
            r0[r2] = r1
            return r0
    }

    public static com.bytedance.adsdk.ugeno.yoga.tl valueOf(java.lang.String r1) {
            java.lang.Class<com.bytedance.adsdk.ugeno.yoga.tl> r0 = com.bytedance.adsdk.ugeno.yoga.tl.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.bytedance.adsdk.ugeno.yoga.tl r1 = (com.bytedance.adsdk.ugeno.yoga.tl) r1
            return r1
    }

    public static com.bytedance.adsdk.ugeno.yoga.tl[] values() {
            com.bytedance.adsdk.ugeno.yoga.tl[] r0 = com.bytedance.adsdk.ugeno.yoga.tl.up
            java.lang.Object r0 = r0.clone()
            com.bytedance.adsdk.ugeno.yoga.tl[] r0 = (com.bytedance.adsdk.ugeno.yoga.tl[]) r0
            return r0
    }
}
