package org.repackage.com.meizu.flyme.openidsdk;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
class OpenId {
    long a;
    java.lang.String b;
    java.lang.String c;
    int d;

    OpenId(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.c = r1
            return
    }

    void a(int r1) {
            r0 = this;
            r0.d = r1
            return
    }

    void a(long r1) {
            r0 = this;
            r0.a = r1
            return
    }

    void a(java.lang.String r1) {
            r0 = this;
            r0.b = r1
            return
    }

    boolean a() {
            r5 = this;
            long r0 = r5.a
            long r2 = java.lang.System.currentTimeMillis()
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    void b() {
            r2 = this;
            r0 = 0
            r2.a = r0
            return
    }
}
