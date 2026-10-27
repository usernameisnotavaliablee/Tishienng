package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public abstract class p4 {
    private final int a;
    private final int b;

    protected p4(int r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    public final int a() {
            r1 = this;
            int r0 = r1.b
            return r0
    }

    public abstract com.huawei.hms.scankit.p.p4 a(int r1, int r2, int r3, int r4);

    public abstract byte[] a(int r1, byte[] r2);

    public abstract byte[] b();

    public final int c() {
            r1 = this;
            int r0 = r1.a
            return r0
    }

    public final java.lang.String toString() {
            r7 = this;
            int r0 = r7.a
            byte[] r1 = new byte[r0]
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r3 = r7.b
            int r0 = r0 + 1
            int r3 = r3 * r0
            r2.<init>(r3)
            r0 = 0
            r3 = 0
        L11:
            int r4 = r7.b
            if (r3 >= r4) goto L47
            byte[] r1 = r7.a(r3, r1)
            r4 = 0
        L1a:
            int r5 = r7.a
            if (r4 >= r5) goto L3f
            r5 = r1[r4]
            r5 = r5 & 255(0xff, float:3.57E-43)
            r6 = 64
            if (r5 >= r6) goto L29
            r5 = 35
            goto L39
        L29:
            r6 = 128(0x80, float:1.8E-43)
            if (r5 >= r6) goto L30
            r5 = 43
            goto L39
        L30:
            r6 = 192(0xc0, float:2.69E-43)
            if (r5 >= r6) goto L37
            r5 = 46
            goto L39
        L37:
            r5 = 32
        L39:
            r2.append(r5)
            int r4 = r4 + 1
            goto L1a
        L3f:
            r4 = 10
            r2.append(r4)
            int r3 = r3 + 1
            goto L11
        L47:
            java.lang.String r0 = r2.toString()
            return r0
    }
}
