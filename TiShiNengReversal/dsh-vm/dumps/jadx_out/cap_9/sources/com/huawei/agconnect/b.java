package com.huawei.agconnect;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class b {
    public static final com.huawei.agconnect.b b = null;
    public static final com.huawei.agconnect.b c = null;
    public static final com.huawei.agconnect.b d = null;
    public static final com.huawei.agconnect.b e = null;
    public static final com.huawei.agconnect.b f = null;
    private final int a;

    static {
            com.huawei.agconnect.b r0 = new com.huawei.agconnect.b
            r1 = 0
            r0.<init>(r1)
            com.huawei.agconnect.b.b = r0
            com.huawei.agconnect.b r0 = new com.huawei.agconnect.b
            r1 = 1
            r0.<init>(r1)
            com.huawei.agconnect.b.c = r0
            com.huawei.agconnect.b r0 = new com.huawei.agconnect.b
            r1 = 2
            r0.<init>(r1)
            com.huawei.agconnect.b.d = r0
            com.huawei.agconnect.b r0 = new com.huawei.agconnect.b
            r1 = 3
            r0.<init>(r1)
            com.huawei.agconnect.b.e = r0
            com.huawei.agconnect.b r0 = new com.huawei.agconnect.b
            r1 = 4
            r0.<init>(r1)
            com.huawei.agconnect.b.f = r0
            return
    }

    private b(int r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    private int b(java.lang.Object... r1) {
            r0 = this;
            int r1 = java.util.Arrays.hashCode(r1)
            return r1
    }

    public java.lang.String a() {
            r2 = this;
            int r0 = r2.a
            r1 = 1
            if (r0 == r1) goto L1a
            r1 = 2
            if (r0 == r1) goto L17
            r1 = 3
            if (r0 == r1) goto L14
            r1 = 4
            if (r0 == r1) goto L11
            java.lang.String r0 = "UNKNOWN"
            return r0
        L11:
            java.lang.String r0 = "SG"
            return r0
        L14:
            java.lang.String r0 = "RU"
            return r0
        L17:
            java.lang.String r0 = "DE"
            return r0
        L1a:
            java.lang.String r0 = "CN"
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L19
            java.lang.Class<com.huawei.agconnect.b> r2 = com.huawei.agconnect.b.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L19
        L10:
            com.huawei.agconnect.b r5 = (com.huawei.agconnect.b) r5
            int r2 = r4.a
            int r5 = r5.a
            if (r2 != r5) goto L19
            return r0
        L19:
            return r1
    }

    public int hashCode() {
            r3 = this;
            int r0 = r3.a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r0
            int r0 = r3.b(r1)
            return r0
    }
}
