package com.bytedance.adsdk.ugeno.yoga;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public enum jy extends java.lang.Enum<com.bytedance.adsdk.ugeno.yoga.jy> {
    public static final com.bytedance.adsdk.ugeno.yoga.jy cw = null;
    public static final com.bytedance.adsdk.ugeno.yoga.jy j = null;
    private static final /* synthetic */ com.bytedance.adsdk.ugeno.yoga.jy[] up = null;
    public static final com.bytedance.adsdk.ugeno.yoga.jy xt = null;

    /* renamed from: r, reason: collision with root package name */
    private final int f2047r;

    static {
            com.bytedance.adsdk.ugeno.yoga.jy r0 = new com.bytedance.adsdk.ugeno.yoga.jy
            java.lang.String r1 = "STATIC"
            r2 = 0
            r0.<init>(r1, r2, r2)
            com.bytedance.adsdk.ugeno.yoga.jy.j = r0
            com.bytedance.adsdk.ugeno.yoga.jy r0 = new com.bytedance.adsdk.ugeno.yoga.jy
            java.lang.String r1 = "RELATIVE"
            r2 = 1
            r0.<init>(r1, r2, r2)
            com.bytedance.adsdk.ugeno.yoga.jy.xt = r0
            com.bytedance.adsdk.ugeno.yoga.jy r0 = new com.bytedance.adsdk.ugeno.yoga.jy
            java.lang.String r1 = "ABSOLUTE"
            r2 = 2
            r0.<init>(r1, r2, r2)
            com.bytedance.adsdk.ugeno.yoga.jy.cw = r0
            com.bytedance.adsdk.ugeno.yoga.jy[] r0 = xt()
            com.bytedance.adsdk.ugeno.yoga.jy.up = r0
            return
    }

    jy(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.f2047r = r3
            return
    }

    public static com.bytedance.adsdk.ugeno.yoga.jy j(int r2) {
            if (r2 == 0) goto L1e
            r0 = 1
            if (r2 == r0) goto L1b
            r0 = 2
            if (r2 != r0) goto Lb
            com.bytedance.adsdk.ugeno.yoga.jy r2 = com.bytedance.adsdk.ugeno.yoga.jy.cw
            return r2
        Lb:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unknown enum value: "
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r2 = r1.concat(r2)
            r0.<init>(r2)
            throw r0
        L1b:
            com.bytedance.adsdk.ugeno.yoga.jy r2 = com.bytedance.adsdk.ugeno.yoga.jy.xt
            return r2
        L1e:
            com.bytedance.adsdk.ugeno.yoga.jy r2 = com.bytedance.adsdk.ugeno.yoga.jy.j
            return r2
    }

    public static com.bytedance.adsdk.ugeno.yoga.jy j(java.lang.String r2) {
            r2.getClass()
            int r0 = r2.hashCode()
            r1 = -1
            switch(r0) {
                case -892481938: goto L22;
                case -554435892: goto L17;
                case 1728122231: goto Lc;
                default: goto Lb;
            }
        Lb:
            goto L2c
        Lc:
            java.lang.String r0 = "absolute"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L15
            goto L2c
        L15:
            r1 = 2
            goto L2c
        L17:
            java.lang.String r0 = "relative"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L20
            goto L2c
        L20:
            r1 = 1
            goto L2c
        L22:
            java.lang.String r0 = "static"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L2b
            goto L2c
        L2b:
            r1 = 0
        L2c:
            switch(r1) {
                case 0: goto L41;
                case 1: goto L3e;
                case 2: goto L3b;
                default: goto L2f;
            }
        L2f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unknown enum value: "
            java.lang.String r2 = r1.concat(r2)
            r0.<init>(r2)
            throw r0
        L3b:
            com.bytedance.adsdk.ugeno.yoga.jy r2 = com.bytedance.adsdk.ugeno.yoga.jy.cw
            return r2
        L3e:
            com.bytedance.adsdk.ugeno.yoga.jy r2 = com.bytedance.adsdk.ugeno.yoga.jy.xt
            return r2
        L41:
            com.bytedance.adsdk.ugeno.yoga.jy r2 = com.bytedance.adsdk.ugeno.yoga.jy.j
            return r2
    }

    public static com.bytedance.adsdk.ugeno.yoga.jy valueOf(java.lang.String r1) {
            java.lang.Class<com.bytedance.adsdk.ugeno.yoga.jy> r0 = com.bytedance.adsdk.ugeno.yoga.jy.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.bytedance.adsdk.ugeno.yoga.jy r1 = (com.bytedance.adsdk.ugeno.yoga.jy) r1
            return r1
    }

    public static com.bytedance.adsdk.ugeno.yoga.jy[] values() {
            com.bytedance.adsdk.ugeno.yoga.jy[] r0 = com.bytedance.adsdk.ugeno.yoga.jy.up
            java.lang.Object r0 = r0.clone()
            com.bytedance.adsdk.ugeno.yoga.jy[] r0 = (com.bytedance.adsdk.ugeno.yoga.jy[]) r0
            return r0
    }

    private static /* synthetic */ com.bytedance.adsdk.ugeno.yoga.jy[] xt() {
            r0 = 3
            com.bytedance.adsdk.ugeno.yoga.jy[] r0 = new com.bytedance.adsdk.ugeno.yoga.jy[r0]
            com.bytedance.adsdk.ugeno.yoga.jy r1 = com.bytedance.adsdk.ugeno.yoga.jy.j
            r2 = 0
            r0[r2] = r1
            com.bytedance.adsdk.ugeno.yoga.jy r1 = com.bytedance.adsdk.ugeno.yoga.jy.xt
            r2 = 1
            r0[r2] = r1
            com.bytedance.adsdk.ugeno.yoga.jy r1 = com.bytedance.adsdk.ugeno.yoga.jy.cw
            r2 = 2
            r0[r2] = r1
            return r0
    }

    public int j() {
            r1 = this;
            int r0 = r1.f2047r
            return r0
    }
}
