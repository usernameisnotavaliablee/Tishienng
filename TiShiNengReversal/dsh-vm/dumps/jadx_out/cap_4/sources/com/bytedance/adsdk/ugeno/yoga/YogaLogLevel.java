package com.bytedance.adsdk.ugeno.yoga;

@com.bytedance.adsdk.ugeno.yoga.j.j
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public enum YogaLogLevel extends java.lang.Enum<com.bytedance.adsdk.ugeno.yoga.YogaLogLevel> {
    public static final com.bytedance.adsdk.ugeno.yoga.YogaLogLevel cw = null;
    public static final com.bytedance.adsdk.ugeno.yoga.YogaLogLevel j = null;

    /* renamed from: m, reason: collision with root package name */
    public static final com.bytedance.adsdk.ugeno.yoga.YogaLogLevel f2040m = null;

    /* renamed from: r, reason: collision with root package name */
    public static final com.bytedance.adsdk.ugeno.yoga.YogaLogLevel f2041r = null;
    private static final /* synthetic */ com.bytedance.adsdk.ugeno.yoga.YogaLogLevel[] tl = null;
    public static final com.bytedance.adsdk.ugeno.yoga.YogaLogLevel up = null;
    public static final com.bytedance.adsdk.ugeno.yoga.YogaLogLevel xt = null;
    private final int ae;

    static {
            com.bytedance.adsdk.ugeno.yoga.YogaLogLevel r0 = new com.bytedance.adsdk.ugeno.yoga.YogaLogLevel
            java.lang.String r1 = "ERROR"
            r2 = 0
            r0.<init>(r1, r2, r2)
            com.bytedance.adsdk.ugeno.yoga.YogaLogLevel.j = r0
            com.bytedance.adsdk.ugeno.yoga.YogaLogLevel r0 = new com.bytedance.adsdk.ugeno.yoga.YogaLogLevel
            java.lang.String r1 = "WARN"
            r2 = 1
            r0.<init>(r1, r2, r2)
            com.bytedance.adsdk.ugeno.yoga.YogaLogLevel.xt = r0
            com.bytedance.adsdk.ugeno.yoga.YogaLogLevel r0 = new com.bytedance.adsdk.ugeno.yoga.YogaLogLevel
            java.lang.String r1 = "INFO"
            r2 = 2
            r0.<init>(r1, r2, r2)
            com.bytedance.adsdk.ugeno.yoga.YogaLogLevel.cw = r0
            com.bytedance.adsdk.ugeno.yoga.YogaLogLevel r0 = new com.bytedance.adsdk.ugeno.yoga.YogaLogLevel
            java.lang.String r1 = "DEBUG"
            r2 = 3
            r0.<init>(r1, r2, r2)
            com.bytedance.adsdk.ugeno.yoga.YogaLogLevel.f2041r = r0
            com.bytedance.adsdk.ugeno.yoga.YogaLogLevel r0 = new com.bytedance.adsdk.ugeno.yoga.YogaLogLevel
            java.lang.String r1 = "VERBOSE"
            r2 = 4
            r0.<init>(r1, r2, r2)
            com.bytedance.adsdk.ugeno.yoga.YogaLogLevel.up = r0
            com.bytedance.adsdk.ugeno.yoga.YogaLogLevel r0 = new com.bytedance.adsdk.ugeno.yoga.YogaLogLevel
            java.lang.String r1 = "FATAL"
            r2 = 5
            r0.<init>(r1, r2, r2)
            com.bytedance.adsdk.ugeno.yoga.YogaLogLevel.f2040m = r0
            com.bytedance.adsdk.ugeno.yoga.YogaLogLevel[] r0 = j()
            com.bytedance.adsdk.ugeno.yoga.YogaLogLevel.tl = r0
            return
    }

    YogaLogLevel(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.ae = r3
            return
    }

    @com.bytedance.adsdk.ugeno.yoga.j.j
    public static com.bytedance.adsdk.ugeno.yoga.YogaLogLevel fromInt(int r2) {
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
            com.bytedance.adsdk.ugeno.yoga.YogaLogLevel r2 = com.bytedance.adsdk.ugeno.yoga.YogaLogLevel.f2040m
            return r2
        L14:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unknown enum value: "
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r2 = r1.concat(r2)
            r0.<init>(r2)
            throw r0
        L24:
            com.bytedance.adsdk.ugeno.yoga.YogaLogLevel r2 = com.bytedance.adsdk.ugeno.yoga.YogaLogLevel.up
            return r2
        L27:
            com.bytedance.adsdk.ugeno.yoga.YogaLogLevel r2 = com.bytedance.adsdk.ugeno.yoga.YogaLogLevel.f2041r
            return r2
        L2a:
            com.bytedance.adsdk.ugeno.yoga.YogaLogLevel r2 = com.bytedance.adsdk.ugeno.yoga.YogaLogLevel.cw
            return r2
        L2d:
            com.bytedance.adsdk.ugeno.yoga.YogaLogLevel r2 = com.bytedance.adsdk.ugeno.yoga.YogaLogLevel.xt
            return r2
        L30:
            com.bytedance.adsdk.ugeno.yoga.YogaLogLevel r2 = com.bytedance.adsdk.ugeno.yoga.YogaLogLevel.j
            return r2
    }

    private static /* synthetic */ com.bytedance.adsdk.ugeno.yoga.YogaLogLevel[] j() {
            r0 = 6
            com.bytedance.adsdk.ugeno.yoga.YogaLogLevel[] r0 = new com.bytedance.adsdk.ugeno.yoga.YogaLogLevel[r0]
            com.bytedance.adsdk.ugeno.yoga.YogaLogLevel r1 = com.bytedance.adsdk.ugeno.yoga.YogaLogLevel.j
            r2 = 0
            r0[r2] = r1
            com.bytedance.adsdk.ugeno.yoga.YogaLogLevel r1 = com.bytedance.adsdk.ugeno.yoga.YogaLogLevel.xt
            r2 = 1
            r0[r2] = r1
            com.bytedance.adsdk.ugeno.yoga.YogaLogLevel r1 = com.bytedance.adsdk.ugeno.yoga.YogaLogLevel.cw
            r2 = 2
            r0[r2] = r1
            com.bytedance.adsdk.ugeno.yoga.YogaLogLevel r1 = com.bytedance.adsdk.ugeno.yoga.YogaLogLevel.f2041r
            r2 = 3
            r0[r2] = r1
            com.bytedance.adsdk.ugeno.yoga.YogaLogLevel r1 = com.bytedance.adsdk.ugeno.yoga.YogaLogLevel.up
            r2 = 4
            r0[r2] = r1
            com.bytedance.adsdk.ugeno.yoga.YogaLogLevel r1 = com.bytedance.adsdk.ugeno.yoga.YogaLogLevel.f2040m
            r2 = 5
            r0[r2] = r1
            return r0
    }

    public static com.bytedance.adsdk.ugeno.yoga.YogaLogLevel valueOf(java.lang.String r1) {
            java.lang.Class<com.bytedance.adsdk.ugeno.yoga.YogaLogLevel> r0 = com.bytedance.adsdk.ugeno.yoga.YogaLogLevel.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.bytedance.adsdk.ugeno.yoga.YogaLogLevel r1 = (com.bytedance.adsdk.ugeno.yoga.YogaLogLevel) r1
            return r1
    }

    public static com.bytedance.adsdk.ugeno.yoga.YogaLogLevel[] values() {
            com.bytedance.adsdk.ugeno.yoga.YogaLogLevel[] r0 = com.bytedance.adsdk.ugeno.yoga.YogaLogLevel.tl
            java.lang.Object r0 = r0.clone()
            com.bytedance.adsdk.ugeno.yoga.YogaLogLevel[] r0 = (com.bytedance.adsdk.ugeno.yoga.YogaLogLevel[]) r0
            return r0
    }
}
