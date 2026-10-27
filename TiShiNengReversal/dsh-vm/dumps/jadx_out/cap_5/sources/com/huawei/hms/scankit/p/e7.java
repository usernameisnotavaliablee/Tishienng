package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public enum e7 extends java.lang.Enum<com.huawei.hms.scankit.p.e7> {
    public static final com.huawei.hms.scankit.p.e7 a = null;
    public static final com.huawei.hms.scankit.p.e7 b = null;
    public static final com.huawei.hms.scankit.p.e7 c = null;
    private static final /* synthetic */ com.huawei.hms.scankit.p.e7[] d = null;

    static {
            com.huawei.hms.scankit.p.e7 r0 = new com.huawei.hms.scankit.p.e7
            java.lang.String r1 = "FORCE_NONE"
            r2 = 0
            r0.<init>(r1, r2)
            com.huawei.hms.scankit.p.e7.a = r0
            com.huawei.hms.scankit.p.e7 r1 = new com.huawei.hms.scankit.p.e7
            java.lang.String r3 = "FORCE_SQUARE"
            r4 = 1
            r1.<init>(r3, r4)
            com.huawei.hms.scankit.p.e7.b = r1
            com.huawei.hms.scankit.p.e7 r3 = new com.huawei.hms.scankit.p.e7
            java.lang.String r5 = "FORCE_RECTANGLE"
            r6 = 2
            r3.<init>(r5, r6)
            com.huawei.hms.scankit.p.e7.c = r3
            r5 = 3
            com.huawei.hms.scankit.p.e7[] r5 = new com.huawei.hms.scankit.p.e7[r5]
            r5[r2] = r0
            r5[r4] = r1
            r5[r6] = r3
            com.huawei.hms.scankit.p.e7.d = r5
            return
    }

    e7(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static com.huawei.hms.scankit.p.e7 valueOf(java.lang.String r1) {
            java.lang.Class<com.huawei.hms.scankit.p.e7> r0 = com.huawei.hms.scankit.p.e7.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.huawei.hms.scankit.p.e7 r1 = (com.huawei.hms.scankit.p.e7) r1
            return r1
    }

    public static com.huawei.hms.scankit.p.e7[] values() {
            com.huawei.hms.scankit.p.e7[] r0 = com.huawei.hms.scankit.p.e7.d
            java.lang.Object r0 = r0.clone()
            com.huawei.hms.scankit.p.e7[] r0 = (com.huawei.hms.scankit.p.e7[]) r0
            return r0
    }
}
