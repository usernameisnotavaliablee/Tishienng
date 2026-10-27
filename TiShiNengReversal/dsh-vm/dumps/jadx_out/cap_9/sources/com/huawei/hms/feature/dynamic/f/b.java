package com.huawei.hms.feature.dynamic.f;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class b {
    public static final char[] a = null;
    public static final char[] b = null;

    static {
            r0 = 16
            char[] r1 = new char[r0]
            r1 = {x0012: FILL_ARRAY_DATA , data: [48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102} // fill-array
            com.huawei.hms.feature.dynamic.f.b.a = r1
            char[] r0 = new char[r0]
            r0 = {x0026: FILL_ARRAY_DATA , data: [48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70} // fill-array
            com.huawei.hms.feature.dynamic.f.b.b = r0
            return
    }

    public b() {
            r0 = this;
            r0.<init>()
            return
    }

    public static char[] a(byte[] r1) {
            r0 = 0
            char[] r1 = a(r1, r0)
            return r1
    }

    public static char[] a(byte[] r0, boolean r1) {
            if (r1 == 0) goto L5
            char[] r1 = com.huawei.hms.feature.dynamic.f.b.b
            goto L7
        L5:
            char[] r1 = com.huawei.hms.feature.dynamic.f.b.a
        L7:
            char[] r0 = a(r0, r1)
            return r0
    }

    public static char[] a(byte[] r7, char[] r8) {
            int r0 = r7.length
            int r1 = r0 << 1
            char[] r1 = new char[r1]
            r2 = 0
            r3 = 0
        L7:
            if (r2 >= r0) goto L20
            int r4 = r3 + 1
            r5 = r7[r2]
            r6 = r5 & 240(0xf0, float:3.36E-43)
            int r6 = r6 >>> 4
            char r6 = r8[r6]
            r1[r3] = r6
            int r3 = r3 + 2
            r5 = r5 & 15
            char r5 = r8[r5]
            r1[r4] = r5
            int r2 = r2 + 1
            goto L7
        L20:
            return r1
    }

    public static java.lang.String b(byte[] r1, boolean r2) {
            java.lang.String r0 = new java.lang.String
            char[] r1 = a(r1, r2)
            r0.<init>(r1)
            return r0
    }
}
