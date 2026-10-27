package com.bytedance.adsdk.ugeno.yoga;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public enum ws extends java.lang.Enum<com.bytedance.adsdk.ugeno.yoga.ws> {
    public static final com.bytedance.adsdk.ugeno.yoga.ws cw = null;
    public static final com.bytedance.adsdk.ugeno.yoga.ws j = null;
    private static final /* synthetic */ com.bytedance.adsdk.ugeno.yoga.ws[] up = null;
    public static final com.bytedance.adsdk.ugeno.yoga.ws xt = null;

    /* renamed from: r, reason: collision with root package name */
    private final int f2063r;

    static {
            com.bytedance.adsdk.ugeno.yoga.ws r0 = new com.bytedance.adsdk.ugeno.yoga.ws
            java.lang.String r1 = "NO_WRAP"
            r2 = 0
            r0.<init>(r1, r2, r2)
            com.bytedance.adsdk.ugeno.yoga.ws.j = r0
            com.bytedance.adsdk.ugeno.yoga.ws r0 = new com.bytedance.adsdk.ugeno.yoga.ws
            java.lang.String r1 = "WRAP"
            r2 = 1
            r0.<init>(r1, r2, r2)
            com.bytedance.adsdk.ugeno.yoga.ws.xt = r0
            com.bytedance.adsdk.ugeno.yoga.ws r0 = new com.bytedance.adsdk.ugeno.yoga.ws
            java.lang.String r1 = "WRAP_REVERSE"
            r2 = 2
            r0.<init>(r1, r2, r2)
            com.bytedance.adsdk.ugeno.yoga.ws.cw = r0
            com.bytedance.adsdk.ugeno.yoga.ws[] r0 = xt()
            com.bytedance.adsdk.ugeno.yoga.ws.up = r0
            return
    }

    ws(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.f2063r = r3
            return
    }

    public static com.bytedance.adsdk.ugeno.yoga.ws j(int r2) {
            if (r2 == 0) goto L1e
            r0 = 1
            if (r2 == r0) goto L1b
            r0 = 2
            if (r2 != r0) goto Lb
            com.bytedance.adsdk.ugeno.yoga.ws r2 = com.bytedance.adsdk.ugeno.yoga.ws.cw
            return r2
        Lb:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unknown enum value: "
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r2 = r1.concat(r2)
            r0.<init>(r2)
            throw r0
        L1b:
            com.bytedance.adsdk.ugeno.yoga.ws r2 = com.bytedance.adsdk.ugeno.yoga.ws.xt
            return r2
        L1e:
            com.bytedance.adsdk.ugeno.yoga.ws r2 = com.bytedance.adsdk.ugeno.yoga.ws.j
            return r2
    }

    public static com.bytedance.adsdk.ugeno.yoga.ws j(java.lang.String r2) {
            r2.getClass()
            int r0 = r2.hashCode()
            r1 = -1
            switch(r0) {
                case -1039592053: goto L22;
                case 3657802: goto L17;
                case 491642861: goto Lc;
                default: goto Lb;
            }
        Lb:
            goto L2c
        Lc:
            java.lang.String r0 = "wrap_reverse"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L15
            goto L2c
        L15:
            r1 = 2
            goto L2c
        L17:
            java.lang.String r0 = "wrap"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L20
            goto L2c
        L20:
            r1 = 1
            goto L2c
        L22:
            java.lang.String r0 = "nowrap"
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
            com.bytedance.adsdk.ugeno.yoga.ws r2 = com.bytedance.adsdk.ugeno.yoga.ws.cw
            return r2
        L3e:
            com.bytedance.adsdk.ugeno.yoga.ws r2 = com.bytedance.adsdk.ugeno.yoga.ws.xt
            return r2
        L41:
            com.bytedance.adsdk.ugeno.yoga.ws r2 = com.bytedance.adsdk.ugeno.yoga.ws.j
            return r2
    }

    public static com.bytedance.adsdk.ugeno.yoga.ws valueOf(java.lang.String r1) {
            java.lang.Class<com.bytedance.adsdk.ugeno.yoga.ws> r0 = com.bytedance.adsdk.ugeno.yoga.ws.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.bytedance.adsdk.ugeno.yoga.ws r1 = (com.bytedance.adsdk.ugeno.yoga.ws) r1
            return r1
    }

    public static com.bytedance.adsdk.ugeno.yoga.ws[] values() {
            com.bytedance.adsdk.ugeno.yoga.ws[] r0 = com.bytedance.adsdk.ugeno.yoga.ws.up
            java.lang.Object r0 = r0.clone()
            com.bytedance.adsdk.ugeno.yoga.ws[] r0 = (com.bytedance.adsdk.ugeno.yoga.ws[]) r0
            return r0
    }

    private static /* synthetic */ com.bytedance.adsdk.ugeno.yoga.ws[] xt() {
            r0 = 3
            com.bytedance.adsdk.ugeno.yoga.ws[] r0 = new com.bytedance.adsdk.ugeno.yoga.ws[r0]
            com.bytedance.adsdk.ugeno.yoga.ws r1 = com.bytedance.adsdk.ugeno.yoga.ws.j
            r2 = 0
            r0[r2] = r1
            com.bytedance.adsdk.ugeno.yoga.ws r1 = com.bytedance.adsdk.ugeno.yoga.ws.xt
            r2 = 1
            r0[r2] = r1
            com.bytedance.adsdk.ugeno.yoga.ws r1 = com.bytedance.adsdk.ugeno.yoga.ws.cw
            r2 = 2
            r0[r2] = r1
            return r0
    }

    public int j() {
            r1 = this;
            int r0 = r1.f2063r
            return r0
    }
}
