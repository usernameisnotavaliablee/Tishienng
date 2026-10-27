package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class h6 {
    private com.huawei.hms.scankit.p.u4 a;
    private com.huawei.hms.scankit.p.b3 b;
    private com.huawei.hms.scankit.p.b8 c;
    private int d;
    private com.huawei.hms.scankit.p.c0 e;

    public h6() {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.d = r0
            return
    }

    public static boolean a(int r1) {
            if (r1 < 0) goto L8
            r0 = 8
            if (r1 >= r0) goto L8
            r1 = 1
            return r1
        L8:
            r1 = 0
            return r1
    }

    public com.huawei.hms.scankit.p.c0 a() {
            r1 = this;
            com.huawei.hms.scankit.p.c0 r0 = r1.e
            return r0
    }

    public void a(com.huawei.hms.scankit.p.b3 r1) {
            r0 = this;
            r0.b = r1
            return
    }

    public void a(com.huawei.hms.scankit.p.b8 r1) {
            r0 = this;
            r0.c = r1
            return
    }

    public void a(com.huawei.hms.scankit.p.c0 r1) {
            r0 = this;
            r0.e = r1
            return
    }

    public void a(com.huawei.hms.scankit.p.u4 r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public void b(int r1) {
            r0 = this;
            r0.d = r1
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 200(0xc8, float:2.8E-43)
            r0.<init>(r1)
            java.lang.String r1 = "<<\n"
            r0.append(r1)
            java.lang.String r1 = " mode: "
            r0.append(r1)
            com.huawei.hms.scankit.p.u4 r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = "\n ecLevel: "
            r0.append(r1)
            com.huawei.hms.scankit.p.b3 r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = "\n version: "
            r0.append(r1)
            com.huawei.hms.scankit.p.b8 r1 = r2.c
            r0.append(r1)
            java.lang.String r1 = "\n maskPattern: "
            r0.append(r1)
            int r1 = r2.d
            r0.append(r1)
            java.lang.String r1 = ">>\n"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
