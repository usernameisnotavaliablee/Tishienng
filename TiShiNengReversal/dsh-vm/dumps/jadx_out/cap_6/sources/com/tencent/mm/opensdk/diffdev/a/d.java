package com.tencent.mm.opensdk.diffdev.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public enum d extends java.lang.Enum<com.tencent.mm.opensdk.diffdev.a.d> {
    public static final com.tencent.mm.opensdk.diffdev.a.d b = null;
    public static final com.tencent.mm.opensdk.diffdev.a.d c = null;
    public static final com.tencent.mm.opensdk.diffdev.a.d d = null;
    public static final com.tencent.mm.opensdk.diffdev.a.d e = null;
    public static final com.tencent.mm.opensdk.diffdev.a.d f = null;
    public static final com.tencent.mm.opensdk.diffdev.a.d g = null;
    private static final /* synthetic */ com.tencent.mm.opensdk.diffdev.a.d[] h = null;
    private int a;

    static {
            com.tencent.mm.opensdk.diffdev.a.d r0 = new com.tencent.mm.opensdk.diffdev.a.d
            r1 = 402(0x192, float:5.63E-43)
            java.lang.String r2 = "UUID_EXPIRED"
            r3 = 0
            r0.<init>(r2, r3, r1)
            com.tencent.mm.opensdk.diffdev.a.d.b = r0
            com.tencent.mm.opensdk.diffdev.a.d r1 = new com.tencent.mm.opensdk.diffdev.a.d
            r2 = 403(0x193, float:5.65E-43)
            java.lang.String r4 = "UUID_CANCELED"
            r5 = 1
            r1.<init>(r4, r5, r2)
            com.tencent.mm.opensdk.diffdev.a.d.c = r1
            com.tencent.mm.opensdk.diffdev.a.d r2 = new com.tencent.mm.opensdk.diffdev.a.d
            r4 = 404(0x194, float:5.66E-43)
            java.lang.String r6 = "UUID_SCANED"
            r7 = 2
            r2.<init>(r6, r7, r4)
            com.tencent.mm.opensdk.diffdev.a.d.d = r2
            com.tencent.mm.opensdk.diffdev.a.d r4 = new com.tencent.mm.opensdk.diffdev.a.d
            r6 = 405(0x195, float:5.68E-43)
            java.lang.String r8 = "UUID_CONFIRM"
            r9 = 3
            r4.<init>(r8, r9, r6)
            com.tencent.mm.opensdk.diffdev.a.d.e = r4
            com.tencent.mm.opensdk.diffdev.a.d r6 = new com.tencent.mm.opensdk.diffdev.a.d
            r8 = 408(0x198, float:5.72E-43)
            java.lang.String r10 = "UUID_KEEP_CONNECT"
            r11 = 4
            r6.<init>(r10, r11, r8)
            com.tencent.mm.opensdk.diffdev.a.d.f = r6
            com.tencent.mm.opensdk.diffdev.a.d r8 = new com.tencent.mm.opensdk.diffdev.a.d
            r10 = 500(0x1f4, float:7.0E-43)
            java.lang.String r12 = "UUID_ERROR"
            r13 = 5
            r8.<init>(r12, r13, r10)
            com.tencent.mm.opensdk.diffdev.a.d.g = r8
            r10 = 6
            com.tencent.mm.opensdk.diffdev.a.d[] r10 = new com.tencent.mm.opensdk.diffdev.a.d[r10]
            r10[r3] = r0
            r10[r5] = r1
            r10[r7] = r2
            r10[r9] = r4
            r10[r11] = r6
            r10[r13] = r8
            com.tencent.mm.opensdk.diffdev.a.d.h = r10
            return
    }

    d(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.a = r3
            return
    }

    public static com.tencent.mm.opensdk.diffdev.a.d valueOf(java.lang.String r1) {
            java.lang.Class<com.tencent.mm.opensdk.diffdev.a.d> r0 = com.tencent.mm.opensdk.diffdev.a.d.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.tencent.mm.opensdk.diffdev.a.d r1 = (com.tencent.mm.opensdk.diffdev.a.d) r1
            return r1
    }

    public static com.tencent.mm.opensdk.diffdev.a.d[] values() {
            com.tencent.mm.opensdk.diffdev.a.d[] r0 = com.tencent.mm.opensdk.diffdev.a.d.h
            java.lang.Object r0 = r0.clone()
            com.tencent.mm.opensdk.diffdev.a.d[] r0 = (com.tencent.mm.opensdk.diffdev.a.d[]) r0
            return r0
    }

    public int a() {
            r1 = this;
            int r0 = r1.a
            return r0
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "UUIDStatusCode:"
            r0.append(r1)
            int r1 = r2.a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
