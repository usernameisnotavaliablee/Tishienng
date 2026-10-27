package com.huawei.hms.hatool;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class n0 {
    private static com.huawei.hms.hatool.n0 b;
    private com.huawei.hms.hatool.n0.a a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a {
        java.lang.String a;
        java.lang.String b;
        long c;
        final /* synthetic */ com.huawei.hms.hatool.n0 d;

        a(com.huawei.hms.hatool.n0 r3) {
                r2 = this;
                r2.d = r3
                r2.<init>()
                r0 = 0
                r2.c = r0
                return
        }

        void a(long r2) {
                r1 = this;
                com.huawei.hms.hatool.n0 r0 = r1.d
                com.huawei.hms.hatool.n0$a r0 = com.huawei.hms.hatool.n0.a(r0)
                r0.c = r2
                return
        }

        void b(java.lang.String r2) {
                r1 = this;
                com.huawei.hms.hatool.n0 r0 = r1.d
                com.huawei.hms.hatool.n0$a r0 = com.huawei.hms.hatool.n0.a(r0)
                r0.b = r2
                return
        }

        void c(java.lang.String r2) {
                r1 = this;
                com.huawei.hms.hatool.n0 r0 = r1.d
                com.huawei.hms.hatool.n0$a r0 = com.huawei.hms.hatool.n0.a(r0)
                r0.a = r2
                return
        }
    }

    static {
            com.huawei.hms.hatool.n0 r0 = new com.huawei.hms.hatool.n0
            r0.<init>()
            com.huawei.hms.hatool.n0.b = r0
            return
    }

    public n0() {
            r1 = this;
            r1.<init>()
            com.huawei.hms.hatool.n0$a r0 = new com.huawei.hms.hatool.n0$a
            r0.<init>(r1)
            r1.a = r0
            return
    }

    static /* synthetic */ com.huawei.hms.hatool.n0.a a(com.huawei.hms.hatool.n0 r0) {
            com.huawei.hms.hatool.n0$a r0 = r0.a
            return r0
    }

    public static com.huawei.hms.hatool.n0 f() {
            com.huawei.hms.hatool.n0 r0 = com.huawei.hms.hatool.n0.b
            return r0
    }

    public java.lang.String b() {
            r1 = this;
            com.huawei.hms.hatool.n0$a r0 = r1.a
            java.lang.String r0 = r0.b
            return r0
    }

    public void c(java.lang.String r8, java.lang.String r9) {
            r7 = this;
            long r0 = r7.d()
            java.lang.String r8 = com.huawei.hms.hatool.l1.d(r8, r9)
            if (r8 == 0) goto L59
            boolean r9 = r8.isEmpty()
            if (r9 == 0) goto L11
            goto L59
        L11:
            r2 = 0
            r9 = 16
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L35
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.String r9 = c2.b.e(r9)
            java.lang.String r8 = com.huawei.hms.hatool.w.a(r8, r9)
            com.huawei.hms.hatool.n0$a r2 = r7.a
            r2.a(r0)
            com.huawei.hms.hatool.n0$a r0 = r7.a
            r0.c(r9)
            com.huawei.hms.hatool.n0$a r9 = r7.a
            r9.b(r8)
            return
        L35:
            long r2 = java.lang.System.currentTimeMillis()
            long r2 = r2 - r0
            r4 = 43200000(0x2932e00, double:2.1343636E-316)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L58
            java.lang.String r9 = c2.b.e(r9)
            java.lang.String r8 = com.huawei.hms.hatool.w.a(r8, r9)
            com.huawei.hms.hatool.n0$a r2 = r7.a
            r2.a(r0)
            com.huawei.hms.hatool.n0$a r0 = r7.a
            r0.c(r9)
            com.huawei.hms.hatool.n0$a r9 = r7.a
            r9.b(r8)
        L58:
            return
        L59:
            java.lang.String r8 = "WorkKeyHandler"
            java.lang.String r9 = "get rsa pubkey config error"
            com.huawei.hms.hatool.j1.l(r8, r9)
            return
    }

    public long d() {
            r2 = this;
            com.huawei.hms.hatool.n0$a r0 = r2.a
            long r0 = r0.c
            return r0
    }

    public java.lang.String e() {
            r1 = this;
            com.huawei.hms.hatool.n0$a r0 = r1.a
            java.lang.String r0 = r0.a
            return r0
    }
}
