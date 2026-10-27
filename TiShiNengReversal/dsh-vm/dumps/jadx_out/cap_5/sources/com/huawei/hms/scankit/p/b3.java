package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public enum b3 extends java.lang.Enum<com.huawei.hms.scankit.p.b3> {
    public static final com.huawei.hms.scankit.p.b3 b = null;
    public static final com.huawei.hms.scankit.p.b3 c = null;
    public static final com.huawei.hms.scankit.p.b3 d = null;
    public static final com.huawei.hms.scankit.p.b3 e = null;
    private static final com.huawei.hms.scankit.p.b3[] f = null;
    private static final /* synthetic */ com.huawei.hms.scankit.p.b3[] g = null;
    private final int a;

    static {
            com.huawei.hms.scankit.p.b3 r0 = new com.huawei.hms.scankit.p.b3
            java.lang.String r1 = "L"
            r2 = 0
            r3 = 1
            r0.<init>(r1, r2, r3)
            com.huawei.hms.scankit.p.b3.b = r0
            com.huawei.hms.scankit.p.b3 r1 = new com.huawei.hms.scankit.p.b3
            java.lang.String r4 = "M"
            r1.<init>(r4, r3, r2)
            com.huawei.hms.scankit.p.b3.c = r1
            com.huawei.hms.scankit.p.b3 r4 = new com.huawei.hms.scankit.p.b3
            java.lang.String r5 = "Q"
            r6 = 2
            r7 = 3
            r4.<init>(r5, r6, r7)
            com.huawei.hms.scankit.p.b3.d = r4
            com.huawei.hms.scankit.p.b3 r5 = new com.huawei.hms.scankit.p.b3
            java.lang.String r8 = "H"
            r5.<init>(r8, r7, r6)
            com.huawei.hms.scankit.p.b3.e = r5
            r8 = 4
            com.huawei.hms.scankit.p.b3[] r9 = new com.huawei.hms.scankit.p.b3[r8]
            r9[r2] = r0
            r9[r3] = r1
            r9[r6] = r4
            r9[r7] = r5
            com.huawei.hms.scankit.p.b3.g = r9
            com.huawei.hms.scankit.p.b3[] r8 = new com.huawei.hms.scankit.p.b3[r8]
            r8[r2] = r1
            r8[r3] = r0
            r8[r6] = r5
            r8[r7] = r4
            com.huawei.hms.scankit.p.b3.f = r8
            return
    }

    b3(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.a = r3
            return
    }

    public static com.huawei.hms.scankit.p.b3 a(int r2) {
            if (r2 < 0) goto La
            com.huawei.hms.scankit.p.b3[] r0 = com.huawei.hms.scankit.p.b3.f
            int r1 = r0.length
            if (r2 >= r1) goto La
            r2 = r0[r2]
            return r2
        La:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r2.<init>()
            throw r2
    }

    public static com.huawei.hms.scankit.p.b3 valueOf(java.lang.String r1) {
            java.lang.Class<com.huawei.hms.scankit.p.b3> r0 = com.huawei.hms.scankit.p.b3.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.huawei.hms.scankit.p.b3 r1 = (com.huawei.hms.scankit.p.b3) r1
            return r1
    }

    public static com.huawei.hms.scankit.p.b3[] values() {
            com.huawei.hms.scankit.p.b3[] r0 = com.huawei.hms.scankit.p.b3.g
            java.lang.Object r0 = r0.clone()
            com.huawei.hms.scankit.p.b3[] r0 = (com.huawei.hms.scankit.p.b3[]) r0
            return r0
    }

    public int a() {
            r1 = this;
            int r0 = r1.a
            return r0
    }
}
