package com.bytedance.adsdk.lottie;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public enum mi extends java.lang.Enum<com.bytedance.adsdk.lottie.mi> {
    public static final com.bytedance.adsdk.lottie.mi cw = null;
    public static final com.bytedance.adsdk.lottie.mi j = null;

    /* renamed from: r, reason: collision with root package name */
    private static final /* synthetic */ com.bytedance.adsdk.lottie.mi[] f1828r = null;
    public static final com.bytedance.adsdk.lottie.mi xt = null;

    /* renamed from: com.bytedance.adsdk.lottie.mi$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] j = null;

        static {
                com.bytedance.adsdk.lottie.mi[] r0 = com.bytedance.adsdk.lottie.mi.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.bytedance.adsdk.lottie.mi.AnonymousClass1.j = r0
                com.bytedance.adsdk.lottie.mi r1 = com.bytedance.adsdk.lottie.mi.xt     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.bytedance.adsdk.lottie.mi.AnonymousClass1.j     // Catch: java.lang.NoSuchFieldError -> L1d
                com.bytedance.adsdk.lottie.mi r1 = com.bytedance.adsdk.lottie.mi.cw     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.bytedance.adsdk.lottie.mi.AnonymousClass1.j     // Catch: java.lang.NoSuchFieldError -> L28
                com.bytedance.adsdk.lottie.mi r1 = com.bytedance.adsdk.lottie.mi.j     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                return
        }

        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    static {
            com.bytedance.adsdk.lottie.mi r0 = new com.bytedance.adsdk.lottie.mi
            java.lang.String r1 = "AUTOMATIC"
            r2 = 0
            r0.<init>(r1, r2)
            com.bytedance.adsdk.lottie.mi.j = r0
            com.bytedance.adsdk.lottie.mi r1 = new com.bytedance.adsdk.lottie.mi
            java.lang.String r3 = "HARDWARE"
            r4 = 1
            r1.<init>(r3, r4)
            com.bytedance.adsdk.lottie.mi.xt = r1
            com.bytedance.adsdk.lottie.mi r3 = new com.bytedance.adsdk.lottie.mi
            java.lang.String r5 = "SOFTWARE"
            r6 = 2
            r3.<init>(r5, r6)
            com.bytedance.adsdk.lottie.mi.cw = r3
            r5 = 3
            com.bytedance.adsdk.lottie.mi[] r5 = new com.bytedance.adsdk.lottie.mi[r5]
            r5[r2] = r0
            r5[r4] = r1
            r5[r6] = r3
            com.bytedance.adsdk.lottie.mi.f1828r = r5
            return
    }

    mi(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static com.bytedance.adsdk.lottie.mi valueOf(java.lang.String r1) {
            java.lang.Class<com.bytedance.adsdk.lottie.mi> r0 = com.bytedance.adsdk.lottie.mi.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.bytedance.adsdk.lottie.mi r1 = (com.bytedance.adsdk.lottie.mi) r1
            return r1
    }

    public static com.bytedance.adsdk.lottie.mi[] values() {
            com.bytedance.adsdk.lottie.mi[] r0 = com.bytedance.adsdk.lottie.mi.f1828r
            java.lang.Object r0 = r0.clone()
            com.bytedance.adsdk.lottie.mi[] r0 = (com.bytedance.adsdk.lottie.mi[]) r0
            return r0
    }

    public boolean j(int r5, boolean r6, int r7) {
            r4 = this;
            int[] r0 = com.bytedance.adsdk.lottie.mi.AnonymousClass1.j
            int r1 = r4.ordinal()
            r0 = r0[r1]
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L21
            r3 = 2
            if (r0 == r3) goto L20
            if (r6 == 0) goto L16
            r6 = 28
            if (r5 >= r6) goto L16
            return r2
        L16:
            r6 = 4
            if (r7 <= r6) goto L1a
            return r2
        L1a:
            r6 = 25
            if (r5 > r6) goto L1f
            return r2
        L1f:
            return r1
        L20:
            return r2
        L21:
            return r1
    }
}
