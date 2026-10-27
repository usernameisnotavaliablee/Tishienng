package com.bytedance.adsdk.xt.xt.r;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public enum j extends java.lang.Enum<com.bytedance.adsdk.xt.xt.r.j> implements com.bytedance.adsdk.xt.xt.r.up {
    public static final com.bytedance.adsdk.xt.xt.r.j cw = null;
    public static final com.bytedance.adsdk.xt.xt.r.j j = null;

    /* renamed from: r, reason: collision with root package name */
    private static final java.util.Map<java.lang.String, com.bytedance.adsdk.xt.xt.r.j> f2068r = null;
    private static final /* synthetic */ com.bytedance.adsdk.xt.xt.r.j[] up = null;
    public static final com.bytedance.adsdk.xt.xt.r.j xt = null;

    static {
            com.bytedance.adsdk.xt.xt.r.j r0 = new com.bytedance.adsdk.xt.xt.r.j
            java.lang.String r1 = "TRUE"
            r2 = 0
            r0.<init>(r1, r2)
            com.bytedance.adsdk.xt.xt.r.j.j = r0
            com.bytedance.adsdk.xt.xt.r.j r0 = new com.bytedance.adsdk.xt.xt.r.j
            java.lang.String r1 = "FALSE"
            r3 = 1
            r0.<init>(r1, r3)
            com.bytedance.adsdk.xt.xt.r.j.xt = r0
            com.bytedance.adsdk.xt.xt.r.j r0 = new com.bytedance.adsdk.xt.xt.r.j
            java.lang.String r1 = "NULL"
            r3 = 2
            r0.<init>(r1, r3)
            com.bytedance.adsdk.xt.xt.r.j.cw = r0
            com.bytedance.adsdk.xt.xt.r.j[] r0 = j()
            com.bytedance.adsdk.xt.xt.r.j.up = r0
            java.util.HashMap r0 = new java.util.HashMap
            r1 = 128(0x80, float:1.8E-43)
            r0.<init>(r1)
            com.bytedance.adsdk.xt.xt.r.j.f2068r = r0
            com.bytedance.adsdk.xt.xt.r.j[] r0 = values()
            int r1 = r0.length
        L32:
            if (r2 >= r1) goto L46
            r3 = r0[r2]
            java.util.Map<java.lang.String, com.bytedance.adsdk.xt.xt.r.j> r4 = com.bytedance.adsdk.xt.xt.r.j.f2068r
            java.lang.String r5 = r3.name()
            java.lang.String r5 = r5.toLowerCase()
            r4.put(r5, r3)
            int r2 = r2 + 1
            goto L32
        L46:
            return
    }

    j(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static com.bytedance.adsdk.xt.xt.r.j j(java.lang.String r1) {
            java.util.Map<java.lang.String, com.bytedance.adsdk.xt.xt.r.j> r0 = com.bytedance.adsdk.xt.xt.r.j.f2068r
            java.lang.String r1 = r1.toLowerCase()
            java.lang.Object r1 = r0.get(r1)
            com.bytedance.adsdk.xt.xt.r.j r1 = (com.bytedance.adsdk.xt.xt.r.j) r1
            return r1
    }

    private static /* synthetic */ com.bytedance.adsdk.xt.xt.r.j[] j() {
            r0 = 3
            com.bytedance.adsdk.xt.xt.r.j[] r0 = new com.bytedance.adsdk.xt.xt.r.j[r0]
            com.bytedance.adsdk.xt.xt.r.j r1 = com.bytedance.adsdk.xt.xt.r.j.j
            r2 = 0
            r0[r2] = r1
            com.bytedance.adsdk.xt.xt.r.j r1 = com.bytedance.adsdk.xt.xt.r.j.xt
            r2 = 1
            r0[r2] = r1
            com.bytedance.adsdk.xt.xt.r.j r1 = com.bytedance.adsdk.xt.xt.r.j.cw
            r2 = 2
            r0[r2] = r1
            return r0
    }

    public static com.bytedance.adsdk.xt.xt.r.j valueOf(java.lang.String r1) {
            java.lang.Class<com.bytedance.adsdk.xt.xt.r.j> r0 = com.bytedance.adsdk.xt.xt.r.j.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.bytedance.adsdk.xt.xt.r.j r1 = (com.bytedance.adsdk.xt.xt.r.j) r1
            return r1
    }

    public static com.bytedance.adsdk.xt.xt.r.j[] values() {
            com.bytedance.adsdk.xt.xt.r.j[] r0 = com.bytedance.adsdk.xt.xt.r.j.up
            java.lang.Object r0 = r0.clone()
            com.bytedance.adsdk.xt.xt.r.j[] r0 = (com.bytedance.adsdk.xt.xt.r.j[]) r0
            return r0
    }
}
