package com.huawei.hms.hatool;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class t0 {
    private static com.huawei.hms.hatool.t0 c;
    private java.lang.String a;
    private java.lang.String b;

    public t0() {
            r0 = this;
            r0.<init>()
            return
    }

    private java.lang.String b(java.lang.String r3) {
            r2 = this;
            boolean r0 = r2.i()
            if (r0 == 0) goto Ld
            java.lang.String r0 = "analytics_keystore"
            java.lang.String r0 = z1.h.d(r0, r3)
            goto Lf
        Ld:
            java.lang.String r0 = ""
        Lf:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L52
            java.lang.String r0 = "hmsSdk"
            java.lang.String r1 = "deCrypt work key first"
            com.huawei.hms.hatool.j1.h(r0, r1)
            java.lang.String r0 = r2.h()
            java.lang.String r3 = com.huawei.hms.hatool.r0.b(r3, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L41
            r3 = 16
            java.lang.String r3 = c2.b.e(r3)
            java.lang.String r0 = r2.c(r3)
            r2.f(r0)
            boolean r0 = r2.i()
            if (r0 == 0) goto L40
            com.huawei.hms.hatool.n1.i()
        L40:
            return r3
        L41:
            boolean r0 = r2.i()
            if (r0 == 0) goto L51
            java.lang.String r0 = r2.c(r3)
            r2.f(r0)
            com.huawei.hms.hatool.n1.i()
        L51:
            return r3
        L52:
            return r0
    }

    private java.lang.String c(java.lang.String r2) {
            r1 = this;
            boolean r0 = r1.i()
            if (r0 == 0) goto Ld
            java.lang.String r0 = "analytics_keystore"
            java.lang.String r2 = z1.h.g(r0, r2)
            return r2
        Ld:
            java.lang.String r0 = r1.h()
            java.lang.String r2 = com.huawei.hms.hatool.r0.d(r2, r0)
            return r2
    }

    private java.lang.String e() {
            r4 = this;
            android.content.Context r0 = com.huawei.hms.hatool.y0.q()
            java.lang.String r1 = "PrivacyData"
            java.lang.String r2 = ""
            java.lang.String r3 = "Privacy_MY"
            java.lang.String r0 = com.huawei.hms.hatool.l.b(r0, r3, r1, r2)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L22
            r0 = 16
            java.lang.String r0 = c2.b.e(r0)
            java.lang.String r1 = r4.c(r0)
            r4.f(r1)
            return r0
        L22:
            java.lang.String r0 = r4.b(r0)
            return r0
    }

    private boolean f(java.lang.String r5) {
            r4 = this;
            java.lang.String r0 = "refresh sp aes key"
            java.lang.String r1 = "hmsSdk"
            com.huawei.hms.hatool.j1.h(r1, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto L14
            java.lang.String r5 = "refreshLocalKey(): encrypted key is empty"
            com.huawei.hms.hatool.j1.h(r1, r5)
            r5 = 0
            return r5
        L14:
            android.content.Context r0 = com.huawei.hms.hatool.y0.q()
            java.lang.String r1 = "PrivacyData"
            java.lang.String r2 = "Privacy_MY"
            com.huawei.hms.hatool.l.g(r0, r2, r1, r5)
            android.content.Context r5 = com.huawei.hms.hatool.y0.q()
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.String r3 = "flashKeyTime"
            com.huawei.hms.hatool.l.f(r5, r2, r3, r0)
            r5 = 1
            return r5
    }

    public static com.huawei.hms.hatool.t0 g() {
            com.huawei.hms.hatool.t0 r0 = com.huawei.hms.hatool.t0.c
            if (r0 != 0) goto L7
            j()
        L7:
            com.huawei.hms.hatool.t0 r0 = com.huawei.hms.hatool.t0.c
            return r0
    }

    private java.lang.String h() {
            r1 = this;
            java.lang.String r0 = r1.b
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L13
            com.huawei.hms.hatool.n1 r0 = new com.huawei.hms.hatool.n1
            r0.<init>()
            java.lang.String r0 = r0.a()
            r1.b = r0
        L13:
            java.lang.String r0 = r1.b
            return r0
    }

    private boolean i() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    private static synchronized void j() {
            java.lang.Class<com.huawei.hms.hatool.t0> r0 = com.huawei.hms.hatool.t0.class
            monitor-enter(r0)
            com.huawei.hms.hatool.t0 r1 = com.huawei.hms.hatool.t0.c     // Catch: java.lang.Throwable -> Lf
            if (r1 != 0) goto L11
            com.huawei.hms.hatool.t0 r1 = new com.huawei.hms.hatool.t0     // Catch: java.lang.Throwable -> Lf
            r1.<init>()     // Catch: java.lang.Throwable -> Lf
            com.huawei.hms.hatool.t0.c = r1     // Catch: java.lang.Throwable -> Lf
            goto L11
        Lf:
            r1 = move-exception
            goto L13
        L11:
            monitor-exit(r0)
            return
        L13:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r1
    }

    public java.lang.String a() {
            r1 = this;
            java.lang.String r0 = r1.a
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto Le
            java.lang.String r0 = r1.e()
            r1.a = r0
        Le:
            java.lang.String r0 = r1.a
            return r0
    }

    public void d() {
            r2 = this;
            r0 = 16
            java.lang.String r0 = c2.b.e(r0)
            java.lang.String r1 = r2.c(r0)
            boolean r1 = r2.f(r1)
            if (r1 == 0) goto L12
            r2.a = r0
        L12:
            return
    }
}
