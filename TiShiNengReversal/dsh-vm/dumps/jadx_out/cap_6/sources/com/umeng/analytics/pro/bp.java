package com.umeng.analytics.pro;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class bp {
    private short[] a;
    private int b;

    public bp(int r2) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.b = r0
            short[] r2 = new short[r2]
            r1.a = r2
            return
    }

    private void d() {
            r4 = this;
            short[] r0 = r4.a
            int r1 = r0.length
            int r1 = r1 * 2
            short[] r1 = new short[r1]
            r2 = 0
            int r3 = r0.length
            java.lang.System.arraycopy(r0, r2, r1, r2, r3)
            r4.a = r1
            return
    }

    public short a() {
            r3 = this;
            short[] r0 = r3.a
            int r1 = r3.b
            int r2 = r1 + (-1)
            r3.b = r2
            short r0 = r0[r1]
            return r0
    }

    public void a(short r3) {
            r2 = this;
            short[] r0 = r2.a
            int r0 = r0.length
            int r1 = r2.b
            int r1 = r1 + 1
            if (r0 != r1) goto Lc
            r2.d()
        Lc:
            short[] r0 = r2.a
            int r1 = r2.b
            int r1 = r1 + 1
            r2.b = r1
            r0[r1] = r3
            return
    }

    public short b() {
            r2 = this;
            short[] r0 = r2.a
            int r1 = r2.b
            short r0 = r0[r1]
            return r0
    }

    public void c() {
            r1 = this;
            r0 = -1
            r1.b = r0
            return
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "<ShortStack vector:["
            r0.append(r1)
            r1 = 0
        Lb:
            short[] r2 = r3.a
            int r2 = r2.length
            if (r1 >= r2) goto L33
            if (r1 == 0) goto L17
            java.lang.String r2 = " "
            r0.append(r2)
        L17:
            int r2 = r3.b
            if (r1 != r2) goto L20
            java.lang.String r2 = ">>"
            r0.append(r2)
        L20:
            short[] r2 = r3.a
            short r2 = r2[r1]
            r0.append(r2)
            int r2 = r3.b
            if (r1 != r2) goto L30
            java.lang.String r2 = "<<"
            r0.append(r2)
        L30:
            int r1 = r1 + 1
            goto Lb
        L33:
            java.lang.String r1 = "]>"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
