package com.bytedance.adsdk.ugeno.yoga;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public enum m extends java.lang.Enum<com.bytedance.adsdk.ugeno.yoga.m> {
    public static final com.bytedance.adsdk.ugeno.yoga.m cw = null;
    public static final com.bytedance.adsdk.ugeno.yoga.m j = null;

    /* renamed from: m, reason: collision with root package name */
    public static final com.bytedance.adsdk.ugeno.yoga.m f2048m = null;

    /* renamed from: r, reason: collision with root package name */
    public static final com.bytedance.adsdk.ugeno.yoga.m f2049r = null;
    private static final /* synthetic */ com.bytedance.adsdk.ugeno.yoga.m[] tl = null;
    public static final com.bytedance.adsdk.ugeno.yoga.m up = null;
    public static final com.bytedance.adsdk.ugeno.yoga.m xt = null;
    private final int ae;

    static {
            com.bytedance.adsdk.ugeno.yoga.m r0 = new com.bytedance.adsdk.ugeno.yoga.m
            java.lang.String r1 = "FLEX_START"
            r2 = 0
            r0.<init>(r1, r2, r2)
            com.bytedance.adsdk.ugeno.yoga.m.j = r0
            com.bytedance.adsdk.ugeno.yoga.m r0 = new com.bytedance.adsdk.ugeno.yoga.m
            java.lang.String r1 = "CENTER"
            r2 = 1
            r0.<init>(r1, r2, r2)
            com.bytedance.adsdk.ugeno.yoga.m.xt = r0
            com.bytedance.adsdk.ugeno.yoga.m r0 = new com.bytedance.adsdk.ugeno.yoga.m
            java.lang.String r1 = "FLEX_END"
            r2 = 2
            r0.<init>(r1, r2, r2)
            com.bytedance.adsdk.ugeno.yoga.m.cw = r0
            com.bytedance.adsdk.ugeno.yoga.m r0 = new com.bytedance.adsdk.ugeno.yoga.m
            java.lang.String r1 = "SPACE_BETWEEN"
            r2 = 3
            r0.<init>(r1, r2, r2)
            com.bytedance.adsdk.ugeno.yoga.m.f2049r = r0
            com.bytedance.adsdk.ugeno.yoga.m r0 = new com.bytedance.adsdk.ugeno.yoga.m
            java.lang.String r1 = "SPACE_AROUND"
            r2 = 4
            r0.<init>(r1, r2, r2)
            com.bytedance.adsdk.ugeno.yoga.m.up = r0
            com.bytedance.adsdk.ugeno.yoga.m r0 = new com.bytedance.adsdk.ugeno.yoga.m
            java.lang.String r1 = "SPACE_EVENLY"
            r2 = 5
            r0.<init>(r1, r2, r2)
            com.bytedance.adsdk.ugeno.yoga.m.f2048m = r0
            com.bytedance.adsdk.ugeno.yoga.m[] r0 = xt()
            com.bytedance.adsdk.ugeno.yoga.m.tl = r0
            return
    }

    m(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.ae = r3
            return
    }

    public static com.bytedance.adsdk.ugeno.yoga.m j(int r2) {
            if (r2 == 0) goto L30
            r0 = 1
            if (r2 == r0) goto L2d
            r0 = 2
            if (r2 == r0) goto L2a
            r0 = 3
            if (r2 == r0) goto L27
            r0 = 4
            if (r2 == r0) goto L24
            r0 = 5
            if (r2 != r0) goto L14
            com.bytedance.adsdk.ugeno.yoga.m r2 = com.bytedance.adsdk.ugeno.yoga.m.f2048m
            return r2
        L14:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unknown enum value: "
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r2 = r1.concat(r2)
            r0.<init>(r2)
            throw r0
        L24:
            com.bytedance.adsdk.ugeno.yoga.m r2 = com.bytedance.adsdk.ugeno.yoga.m.up
            return r2
        L27:
            com.bytedance.adsdk.ugeno.yoga.m r2 = com.bytedance.adsdk.ugeno.yoga.m.f2049r
            return r2
        L2a:
            com.bytedance.adsdk.ugeno.yoga.m r2 = com.bytedance.adsdk.ugeno.yoga.m.cw
            return r2
        L2d:
            com.bytedance.adsdk.ugeno.yoga.m r2 = com.bytedance.adsdk.ugeno.yoga.m.xt
            return r2
        L30:
            com.bytedance.adsdk.ugeno.yoga.m r2 = com.bytedance.adsdk.ugeno.yoga.m.j
            return r2
    }

    public static com.bytedance.adsdk.ugeno.yoga.m j(java.lang.String r2) {
            r2.getClass()
            int r0 = r2.hashCode()
            r1 = -1
            switch(r0) {
                case -1364013995: goto L43;
                case -932331738: goto L38;
                case -814425728: goto L2d;
                case 1384876188: goto L22;
                case 1682480591: goto L17;
                case 1744442261: goto Lc;
                default: goto Lb;
            }
        Lb:
            goto L4d
        Lc:
            java.lang.String r0 = "flex_end"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L15
            goto L4d
        L15:
            r1 = 5
            goto L4d
        L17:
            java.lang.String r0 = "space_between"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L20
            goto L4d
        L20:
            r1 = 4
            goto L4d
        L22:
            java.lang.String r0 = "flex_start"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L2b
            goto L4d
        L2b:
            r1 = 3
            goto L4d
        L2d:
            java.lang.String r0 = "space_evenly"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L36
            goto L4d
        L36:
            r1 = 2
            goto L4d
        L38:
            java.lang.String r0 = "space_around"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L41
            goto L4d
        L41:
            r1 = 1
            goto L4d
        L43:
            java.lang.String r0 = "center"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L4c
            goto L4d
        L4c:
            r1 = 0
        L4d:
            switch(r1) {
                case 0: goto L6b;
                case 1: goto L68;
                case 2: goto L65;
                case 3: goto L62;
                case 4: goto L5f;
                case 5: goto L5c;
                default: goto L50;
            }
        L50:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unknown enum value: "
            java.lang.String r2 = r1.concat(r2)
            r0.<init>(r2)
            throw r0
        L5c:
            com.bytedance.adsdk.ugeno.yoga.m r2 = com.bytedance.adsdk.ugeno.yoga.m.cw
            return r2
        L5f:
            com.bytedance.adsdk.ugeno.yoga.m r2 = com.bytedance.adsdk.ugeno.yoga.m.f2049r
            return r2
        L62:
            com.bytedance.adsdk.ugeno.yoga.m r2 = com.bytedance.adsdk.ugeno.yoga.m.j
            return r2
        L65:
            com.bytedance.adsdk.ugeno.yoga.m r2 = com.bytedance.adsdk.ugeno.yoga.m.f2048m
            return r2
        L68:
            com.bytedance.adsdk.ugeno.yoga.m r2 = com.bytedance.adsdk.ugeno.yoga.m.up
            return r2
        L6b:
            com.bytedance.adsdk.ugeno.yoga.m r2 = com.bytedance.adsdk.ugeno.yoga.m.xt
            return r2
    }

    public static com.bytedance.adsdk.ugeno.yoga.m valueOf(java.lang.String r1) {
            java.lang.Class<com.bytedance.adsdk.ugeno.yoga.m> r0 = com.bytedance.adsdk.ugeno.yoga.m.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.bytedance.adsdk.ugeno.yoga.m r1 = (com.bytedance.adsdk.ugeno.yoga.m) r1
            return r1
    }

    public static com.bytedance.adsdk.ugeno.yoga.m[] values() {
            com.bytedance.adsdk.ugeno.yoga.m[] r0 = com.bytedance.adsdk.ugeno.yoga.m.tl
            java.lang.Object r0 = r0.clone()
            com.bytedance.adsdk.ugeno.yoga.m[] r0 = (com.bytedance.adsdk.ugeno.yoga.m[]) r0
            return r0
    }

    private static /* synthetic */ com.bytedance.adsdk.ugeno.yoga.m[] xt() {
            r0 = 6
            com.bytedance.adsdk.ugeno.yoga.m[] r0 = new com.bytedance.adsdk.ugeno.yoga.m[r0]
            com.bytedance.adsdk.ugeno.yoga.m r1 = com.bytedance.adsdk.ugeno.yoga.m.j
            r2 = 0
            r0[r2] = r1
            com.bytedance.adsdk.ugeno.yoga.m r1 = com.bytedance.adsdk.ugeno.yoga.m.xt
            r2 = 1
            r0[r2] = r1
            com.bytedance.adsdk.ugeno.yoga.m r1 = com.bytedance.adsdk.ugeno.yoga.m.cw
            r2 = 2
            r0[r2] = r1
            com.bytedance.adsdk.ugeno.yoga.m r1 = com.bytedance.adsdk.ugeno.yoga.m.f2049r
            r2 = 3
            r0[r2] = r1
            com.bytedance.adsdk.ugeno.yoga.m r1 = com.bytedance.adsdk.ugeno.yoga.m.up
            r2 = 4
            r0[r2] = r1
            com.bytedance.adsdk.ugeno.yoga.m r1 = com.bytedance.adsdk.ugeno.yoga.m.f2048m
            r2 = 5
            r0[r2] = r1
            return r0
    }

    public int j() {
            r1 = this;
            int r0 = r1.ae
            return r0
    }
}
