package com.bytedance.adsdk.ugeno.yoga;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public enum up extends java.lang.Enum<com.bytedance.adsdk.ugeno.yoga.up> {
    public static final com.bytedance.adsdk.ugeno.yoga.up cw = null;
    public static final com.bytedance.adsdk.ugeno.yoga.up j = null;

    /* renamed from: m, reason: collision with root package name */
    private static final /* synthetic */ com.bytedance.adsdk.ugeno.yoga.up[] f2053m = null;

    /* renamed from: r, reason: collision with root package name */
    public static final com.bytedance.adsdk.ugeno.yoga.up f2054r = null;
    public static final com.bytedance.adsdk.ugeno.yoga.up xt = null;
    private final int up;

    static {
            com.bytedance.adsdk.ugeno.yoga.up r0 = new com.bytedance.adsdk.ugeno.yoga.up
            java.lang.String r1 = "COLUMN"
            r2 = 0
            r0.<init>(r1, r2, r2)
            com.bytedance.adsdk.ugeno.yoga.up.j = r0
            com.bytedance.adsdk.ugeno.yoga.up r0 = new com.bytedance.adsdk.ugeno.yoga.up
            java.lang.String r1 = "COLUMN_REVERSE"
            r2 = 1
            r0.<init>(r1, r2, r2)
            com.bytedance.adsdk.ugeno.yoga.up.xt = r0
            com.bytedance.adsdk.ugeno.yoga.up r0 = new com.bytedance.adsdk.ugeno.yoga.up
            java.lang.String r1 = "ROW"
            r2 = 2
            r0.<init>(r1, r2, r2)
            com.bytedance.adsdk.ugeno.yoga.up.cw = r0
            com.bytedance.adsdk.ugeno.yoga.up r0 = new com.bytedance.adsdk.ugeno.yoga.up
            java.lang.String r1 = "ROW_REVERSE"
            r2 = 3
            r0.<init>(r1, r2, r2)
            com.bytedance.adsdk.ugeno.yoga.up.f2054r = r0
            com.bytedance.adsdk.ugeno.yoga.up[] r0 = xt()
            com.bytedance.adsdk.ugeno.yoga.up.f2053m = r0
            return
    }

    up(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.up = r3
            return
    }

    public static com.bytedance.adsdk.ugeno.yoga.up j(int r2) {
            if (r2 == 0) goto L24
            r0 = 1
            if (r2 == r0) goto L21
            r0 = 2
            if (r2 == r0) goto L1e
            r0 = 3
            if (r2 != r0) goto Le
            com.bytedance.adsdk.ugeno.yoga.up r2 = com.bytedance.adsdk.ugeno.yoga.up.f2054r
            return r2
        Le:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unknown enum value: "
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r2 = r1.concat(r2)
            r0.<init>(r2)
            throw r0
        L1e:
            com.bytedance.adsdk.ugeno.yoga.up r2 = com.bytedance.adsdk.ugeno.yoga.up.cw
            return r2
        L21:
            com.bytedance.adsdk.ugeno.yoga.up r2 = com.bytedance.adsdk.ugeno.yoga.up.xt
            return r2
        L24:
            com.bytedance.adsdk.ugeno.yoga.up r2 = com.bytedance.adsdk.ugeno.yoga.up.j
            return r2
    }

    public static com.bytedance.adsdk.ugeno.yoga.up j(java.lang.String r2) {
            r2.getClass()
            int r0 = r2.hashCode()
            r1 = -1
            switch(r0) {
                case -1781065991: goto L2d;
                case -1354837162: goto L22;
                case -207799939: goto L17;
                case 113114: goto Lc;
                default: goto Lb;
            }
        Lb:
            goto L37
        Lc:
            java.lang.String r0 = "row"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L15
            goto L37
        L15:
            r1 = 3
            goto L37
        L17:
            java.lang.String r0 = "row_reverse"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L20
            goto L37
        L20:
            r1 = 2
            goto L37
        L22:
            java.lang.String r0 = "column"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L2b
            goto L37
        L2b:
            r1 = 1
            goto L37
        L2d:
            java.lang.String r0 = "column_reverse"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L36
            goto L37
        L36:
            r1 = 0
        L37:
            switch(r1) {
                case 0: goto L4f;
                case 1: goto L4c;
                case 2: goto L49;
                case 3: goto L46;
                default: goto L3a;
            }
        L3a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unknown enum value: "
            java.lang.String r2 = r1.concat(r2)
            r0.<init>(r2)
            throw r0
        L46:
            com.bytedance.adsdk.ugeno.yoga.up r2 = com.bytedance.adsdk.ugeno.yoga.up.cw
            return r2
        L49:
            com.bytedance.adsdk.ugeno.yoga.up r2 = com.bytedance.adsdk.ugeno.yoga.up.f2054r
            return r2
        L4c:
            com.bytedance.adsdk.ugeno.yoga.up r2 = com.bytedance.adsdk.ugeno.yoga.up.j
            return r2
        L4f:
            com.bytedance.adsdk.ugeno.yoga.up r2 = com.bytedance.adsdk.ugeno.yoga.up.xt
            return r2
    }

    public static com.bytedance.adsdk.ugeno.yoga.up valueOf(java.lang.String r1) {
            java.lang.Class<com.bytedance.adsdk.ugeno.yoga.up> r0 = com.bytedance.adsdk.ugeno.yoga.up.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.bytedance.adsdk.ugeno.yoga.up r1 = (com.bytedance.adsdk.ugeno.yoga.up) r1
            return r1
    }

    public static com.bytedance.adsdk.ugeno.yoga.up[] values() {
            com.bytedance.adsdk.ugeno.yoga.up[] r0 = com.bytedance.adsdk.ugeno.yoga.up.f2053m
            java.lang.Object r0 = r0.clone()
            com.bytedance.adsdk.ugeno.yoga.up[] r0 = (com.bytedance.adsdk.ugeno.yoga.up[]) r0
            return r0
    }

    private static /* synthetic */ com.bytedance.adsdk.ugeno.yoga.up[] xt() {
            r0 = 4
            com.bytedance.adsdk.ugeno.yoga.up[] r0 = new com.bytedance.adsdk.ugeno.yoga.up[r0]
            com.bytedance.adsdk.ugeno.yoga.up r1 = com.bytedance.adsdk.ugeno.yoga.up.j
            r2 = 0
            r0[r2] = r1
            com.bytedance.adsdk.ugeno.yoga.up r1 = com.bytedance.adsdk.ugeno.yoga.up.xt
            r2 = 1
            r0[r2] = r1
            com.bytedance.adsdk.ugeno.yoga.up r1 = com.bytedance.adsdk.ugeno.yoga.up.cw
            r2 = 2
            r0[r2] = r1
            com.bytedance.adsdk.ugeno.yoga.up r1 = com.bytedance.adsdk.ugeno.yoga.up.f2054r
            r2 = 3
            r0[r2] = r1
            return r0
    }

    public int j() {
            r1 = this;
            int r0 = r1.up
            return r0
    }
}
