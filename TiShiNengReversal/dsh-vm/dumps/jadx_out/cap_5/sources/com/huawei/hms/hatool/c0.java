package com.huawei.hms.hatool;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class c0 {
    private static com.huawei.hms.hatool.c0 b;
    private android.content.Context a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class a extends com.huawei.hms.hatool.m {
        java.lang.String a;
        java.lang.String b;

        public a(java.lang.String r1, java.lang.String r2) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                return
        }

        @Override // com.huawei.hms.hatool.m
        public java.lang.String c() {
                r2 = this;
                java.lang.String r0 = r2.a
                java.lang.String r1 = r2.b
                java.lang.String r0 = com.huawei.hms.hatool.r1.d(r0, r1)
                return r0
        }

        @Override // com.huawei.hms.hatool.m
        public java.lang.String d(java.lang.String r1) {
                r0 = this;
                java.lang.String r1 = y1.d.b(r1)
                return r1
        }

        @Override // com.huawei.hms.hatool.m
        public java.lang.String f() {
                r2 = this;
                java.lang.String r0 = r2.a
                java.lang.String r1 = r2.b
                java.lang.String r0 = com.huawei.hms.hatool.r1.g(r0, r1)
                return r0
        }

        @Override // com.huawei.hms.hatool.m
        public java.lang.String g() {
                r2 = this;
                java.lang.String r0 = r2.a
                java.lang.String r1 = r2.b
                java.lang.String r0 = com.huawei.hms.hatool.r1.j(r0, r1)
                return r0
        }

        @Override // com.huawei.hms.hatool.m
        public int h() {
                r4 = this;
                java.lang.String r0 = r4.a
                java.lang.String r1 = r4.b
                boolean r0 = com.huawei.hms.hatool.r1.k(r0, r1)
                r1 = 0
                if (r0 == 0) goto Ld
                r0 = 4
                goto Le
            Ld:
                r0 = 0
            Le:
                java.lang.String r2 = r4.a
                java.lang.String r3 = r4.b
                boolean r2 = com.huawei.hms.hatool.r1.e(r2, r3)
                if (r2 == 0) goto L19
                r1 = 2
            L19:
                r0 = r0 | r1
                java.lang.String r1 = r4.a
                java.lang.String r2 = r4.b
                boolean r1 = com.huawei.hms.hatool.r1.h(r1, r2)
                r0 = r0 | r1
                return r0
        }
    }

    public c0() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.huawei.hms.hatool.c0 a() {
            java.lang.Class<com.huawei.hms.hatool.c0> r0 = com.huawei.hms.hatool.c0.class
            monitor-enter(r0)
            com.huawei.hms.hatool.c0 r1 = com.huawei.hms.hatool.c0.b     // Catch: java.lang.Throwable -> Lf
            if (r1 != 0) goto L11
            com.huawei.hms.hatool.c0 r1 = new com.huawei.hms.hatool.c0     // Catch: java.lang.Throwable -> Lf
            r1.<init>()     // Catch: java.lang.Throwable -> Lf
            com.huawei.hms.hatool.c0.b = r1     // Catch: java.lang.Throwable -> Lf
            goto L11
        Lf:
            r1 = move-exception
            goto L15
        L11:
            com.huawei.hms.hatool.c0 r1 = com.huawei.hms.hatool.c0.b     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return r1
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r1
    }

    public java.lang.String b(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            android.content.Context r0 = r1.a
            java.lang.String r2 = com.huawei.hms.hatool.z.a(r0, r2, r3)
            return r2
    }

    public java.lang.String c(boolean r5) {
            r4 = this;
            java.lang.String r0 = ""
            if (r5 != 0) goto L5
            return r0
        L5:
            java.lang.String r5 = com.huawei.hms.hatool.y0.i()
            boolean r1 = android.text.TextUtils.isEmpty(r5)
            if (r1 == 0) goto L35
            android.content.Context r5 = r4.a
            java.lang.String r1 = "global_v2"
            java.lang.String r2 = "uuid"
            java.lang.String r5 = com.huawei.hms.hatool.l.b(r5, r1, r2, r0)
            boolean r3 = android.text.TextUtils.isEmpty(r5)
            if (r3 == 0) goto L32
            java.util.UUID r5 = java.util.UUID.randomUUID()
            java.lang.String r5 = r5.toString()
            java.lang.String r3 = "-"
            java.lang.String r5 = r5.replace(r3, r0)
            android.content.Context r0 = r4.a
            com.huawei.hms.hatool.l.g(r0, r1, r2, r5)
        L32:
            com.huawei.hms.hatool.y0.p(r5)
        L35:
            return r5
    }

    public void d(android.content.Context r2) {
            r1 = this;
            android.content.Context r0 = r1.a
            if (r0 != 0) goto L6
            r1.a = r2
        L6:
            return
    }

    public java.lang.String e(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            android.content.Context r0 = r1.a
            java.lang.String r2 = com.huawei.hms.hatool.z.b(r0, r2, r3)
            return r2
    }

    public com.huawei.hms.hatool.b0 f(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            com.huawei.hms.hatool.c0$a r0 = new com.huawei.hms.hatool.c0$a
            r0.<init>(r2, r3)
            android.content.Context r2 = r1.a
            com.huawei.hms.hatool.b0 r2 = r0.b(r2)
            return r2
    }

    public java.lang.String g(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            java.lang.String r1 = com.huawei.hms.hatool.q.f(r1, r2)
            return r1
    }

    public android.util.Pair<java.lang.String, java.lang.String> h(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            boolean r2 = com.huawei.hms.hatool.r1.f(r2, r3)
            if (r2 == 0) goto L56
            com.huawei.hms.hatool.d1 r2 = com.huawei.hms.hatool.d1.e()
            com.huawei.hms.hatool.u r2 = r2.d()
            java.lang.String r2 = r2.F()
            com.huawei.hms.hatool.d1 r3 = com.huawei.hms.hatool.d1.e()
            com.huawei.hms.hatool.u r3 = r3.d()
            java.lang.String r3 = r3.H()
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L31
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L2b
            goto L31
        L2b:
            android.util.Pair r0 = new android.util.Pair
            r0.<init>(r2, r3)
            return r0
        L31:
            android.content.Context r2 = r1.a
            android.util.Pair r2 = com.huawei.hms.hatool.m1.l(r2)
            com.huawei.hms.hatool.d1 r3 = com.huawei.hms.hatool.d1.e()
            com.huawei.hms.hatool.u r3 = r3.d()
            java.lang.Object r0 = r2.first
            java.lang.String r0 = (java.lang.String) r0
            r3.w(r0)
            com.huawei.hms.hatool.d1 r3 = com.huawei.hms.hatool.d1.e()
            com.huawei.hms.hatool.u r3 = r3.d()
            java.lang.Object r0 = r2.second
            java.lang.String r0 = (java.lang.String) r0
            r3.y(r0)
            return r2
        L56:
            android.util.Pair r2 = new android.util.Pair
            java.lang.String r3 = ""
            r2.<init>(r3, r3)
            return r2
    }

    public java.lang.String i(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            java.lang.String r1 = com.huawei.hms.hatool.q.e(r1, r2)
            return r1
    }
}
