package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class l2 {
    private final int a;
    private final int b;

    public l2() {
            r1 = this;
            r1.<init>()
            return
    }

    public int a() {
            r1 = this;
            int r0 = r1.b
            return r0
    }

    public int b() {
            r1 = this;
            int r0 = r1.a
            return r0
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof com.huawei.hms.scankit.p.l2
            r1 = 0
            if (r0 == 0) goto L15
            com.huawei.hms.scankit.p.l2 r4 = (com.huawei.hms.scankit.p.l2) r4
            int r0 = r3.a
            int r2 = r4.a
            if (r0 != r2) goto L15
            int r0 = r3.b
            int r4 = r4.b
            if (r0 != r4) goto L15
            r4 = 1
            return r4
        L15:
            return r1
    }

    public int hashCode() {
            r2 = this;
            int r0 = r2.a
            int r0 = r0 * 32713
            int r1 = r2.b
            int r0 = r0 + r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = "x"
            r0.append(r1)
            int r1 = r2.b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
