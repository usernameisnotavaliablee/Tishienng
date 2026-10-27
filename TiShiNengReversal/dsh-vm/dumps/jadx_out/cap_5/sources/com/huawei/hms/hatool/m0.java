package com.huawei.hms.hatool;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class m0 {
    private boolean a;
    private int b;

    public m0() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.a = r0
            r0 = 4
            r1.b = r0
            return
    }

    private static java.lang.String a() {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "FormalHASDK_2.2.0.314"
            r0.append(r1)
            java.lang.String r1 = com.huawei.hms.hatool.x0.a()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public void b(int r1) {
            r0 = this;
            java.lang.System.lineSeparator()
            java.lang.System.lineSeparator()
            a()
            java.lang.System.lineSeparator()
            r0.b = r1
            r1 = 1
            r0.a = r1
            return
    }

    public void c(int r1, java.lang.String r2, java.lang.String r3) {
            r0 = this;
            return
    }

    public void d(int r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            java.lang.String r3 = "=> "
            r0.append(r3)
            r0.append(r4)
            java.lang.String r3 = r0.toString()
            java.lang.String r4 = "FormalHASDK"
            r1.c(r2, r4, r3)
            return
    }

    public boolean e(int r2) {
            r1 = this;
            boolean r0 = r1.a
            if (r0 == 0) goto La
            int r0 = r1.b
            if (r2 < r0) goto La
            r2 = 1
            return r2
        La:
            r2 = 0
            return r2
    }
}
