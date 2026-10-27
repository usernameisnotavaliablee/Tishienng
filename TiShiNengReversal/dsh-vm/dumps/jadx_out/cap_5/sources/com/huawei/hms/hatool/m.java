package com.huawei.hms.hatool;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public abstract class m {
    public m() {
            r0 = this;
            r0.<init>()
            return
    }

    private com.huawei.hms.hatool.b0 a(int r3) {
            r2 = this;
            if (r3 == 0) goto L14
            java.lang.String r3 = r2.j()
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L16
            com.huawei.hms.hatool.b0 r0 = new com.huawei.hms.hatool.b0
            com.huawei.hms.hatool.d0 r1 = com.huawei.hms.hatool.d0.b
            r0.<init>(r1, r3)
            return r0
        L14:
            java.lang.String r3 = ""
        L16:
            com.huawei.hms.hatool.b0 r0 = new com.huawei.hms.hatool.b0
            com.huawei.hms.hatool.d0 r1 = com.huawei.hms.hatool.d0.d
            r0.<init>(r1, r3)
            return r0
    }

    private com.huawei.hms.hatool.b0 e(int r3) {
            r2 = this;
            r3 = r3 & 4
            if (r3 == 0) goto L16
            java.lang.String r3 = r2.j()
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L18
            com.huawei.hms.hatool.b0 r0 = new com.huawei.hms.hatool.b0
            com.huawei.hms.hatool.d0 r1 = com.huawei.hms.hatool.d0.b
            r0.<init>(r1, r3)
            return r0
        L16:
            java.lang.String r3 = ""
        L18:
            com.huawei.hms.hatool.b0 r0 = new com.huawei.hms.hatool.b0
            com.huawei.hms.hatool.d0 r1 = com.huawei.hms.hatool.d0.d
            r0.<init>(r1, r3)
            return r0
    }

    private boolean i() {
            r2 = this;
            com.huawei.hms.hatool.d1 r0 = com.huawei.hms.hatool.d1.e()
            com.huawei.hms.hatool.u r0 = r0.d()
            java.lang.String r1 = r0.x()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L19
            java.lang.String r1 = com.huawei.hms.hatool.s0.c()
            r0.q(r1)
        L19:
            java.lang.String r0 = r0.x()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r0 = r0 ^ 1
            return r0
    }

    private java.lang.String j() {
            r2 = this;
            com.huawei.hms.hatool.d1 r0 = com.huawei.hms.hatool.d1.e()
            com.huawei.hms.hatool.u r0 = r0.d()
            java.lang.String r1 = r0.r()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L19
            java.lang.String r1 = com.huawei.hms.hatool.m1.k()
            r0.k(r1)
        L19:
            java.lang.String r0 = r0.r()
            return r0
    }

    public com.huawei.hms.hatool.b0 b(android.content.Context r3) {
            r2 = this;
            java.lang.String r3 = r2.g()
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L12
            com.huawei.hms.hatool.b0 r0 = new com.huawei.hms.hatool.b0
            com.huawei.hms.hatool.d0 r1 = com.huawei.hms.hatool.d0.b
            r0.<init>(r1, r3)
            return r0
        L12:
            java.lang.String r3 = r2.c()
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L24
            com.huawei.hms.hatool.b0 r0 = new com.huawei.hms.hatool.b0
            com.huawei.hms.hatool.d0 r1 = com.huawei.hms.hatool.d0.a
            r0.<init>(r1, r3)
            return r0
        L24:
            boolean r3 = r2.i()
            java.lang.String r0 = r2.f()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L48
            if (r3 == 0) goto L3c
            com.huawei.hms.hatool.b0 r3 = new com.huawei.hms.hatool.b0
            com.huawei.hms.hatool.d0 r1 = com.huawei.hms.hatool.d0.c
            r3.<init>(r1, r0)
            return r3
        L3c:
            com.huawei.hms.hatool.b0 r3 = new com.huawei.hms.hatool.b0
            com.huawei.hms.hatool.d0 r1 = com.huawei.hms.hatool.d0.b
            java.lang.String r0 = r2.d(r0)
            r3.<init>(r1, r0)
            return r3
        L48:
            if (r3 == 0) goto L53
            int r3 = r2.h()
            com.huawei.hms.hatool.b0 r3 = r2.a(r3)
            return r3
        L53:
            int r3 = r2.h()
            com.huawei.hms.hatool.b0 r3 = r2.e(r3)
            return r3
    }

    public abstract java.lang.String c();

    public abstract java.lang.String d(java.lang.String r1);

    public abstract java.lang.String f();

    public abstract java.lang.String g();

    public abstract int h();
}
