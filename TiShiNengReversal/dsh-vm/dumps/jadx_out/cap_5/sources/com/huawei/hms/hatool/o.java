package com.huawei.hms.hatool;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class o {
    private static com.huawei.hms.hatool.o b;
    private static java.util.Map<java.lang.String, java.lang.Long> c;
    private android.content.Context a;

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.huawei.hms.hatool.o.c = r0
            return
    }

    public o() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.huawei.hms.hatool.o a() {
            com.huawei.hms.hatool.o r0 = h()
            return r0
    }

    private static synchronized com.huawei.hms.hatool.o h() {
            java.lang.Class<com.huawei.hms.hatool.o> r0 = com.huawei.hms.hatool.o.class
            monitor-enter(r0)
            com.huawei.hms.hatool.o r1 = com.huawei.hms.hatool.o.b     // Catch: java.lang.Throwable -> Lf
            if (r1 != 0) goto L11
            com.huawei.hms.hatool.o r1 = new com.huawei.hms.hatool.o     // Catch: java.lang.Throwable -> Lf
            r1.<init>()     // Catch: java.lang.Throwable -> Lf
            com.huawei.hms.hatool.o.b = r1     // Catch: java.lang.Throwable -> Lf
            goto L11
        Lf:
            r1 = move-exception
            goto L15
        L11:
            com.huawei.hms.hatool.o r1 = com.huawei.hms.hatool.o.b     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)
            return r1
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r1
    }

    private void i(android.content.Context r7) {
            r6 = this;
            java.lang.String r0 = com.huawei.hms.hatool.s0.j(r7)
            com.huawei.hms.hatool.y0.b(r0)
            com.huawei.hms.hatool.z0 r1 = com.huawei.hms.hatool.z0.b()
            boolean r1 = r1.a()
            java.lang.String r2 = "hmsSdk"
            if (r1 == 0) goto L44
            java.lang.String r1 = "global_v2"
            java.lang.String r3 = "app_ver"
            java.lang.String r4 = ""
            java.lang.String r5 = com.huawei.hms.hatool.l.b(r7, r1, r3, r4)
            com.huawei.hms.hatool.l.g(r7, r1, r3, r0)
            com.huawei.hms.hatool.y0.d(r5)
            boolean r7 = android.text.TextUtils.isEmpty(r5)
            if (r7 == 0) goto L2f
            java.lang.String r7 = "app ver is first save!"
            com.huawei.hms.hatool.j1.h(r2, r7)
            return
        L2f:
            boolean r7 = r5.equals(r0)
            if (r7 != 0) goto L43
            java.lang.String r7 = "the appVers are different!"
            com.huawei.hms.hatool.j1.h(r2, r7)
            com.huawei.hms.hatool.o r7 = a()
            java.lang.String r0 = "alltype"
            r7.g(r4, r0, r5)
        L43:
            return
        L44:
            java.lang.String r7 = "userManager.isUserUnlocked() == false"
            com.huawei.hms.hatool.j1.h(r2, r7)
            return
    }

    public void b(android.content.Context r2) {
            r1 = this;
            r1.a = r2
            r1.i(r2)
            com.huawei.hms.hatool.d1 r2 = com.huawei.hms.hatool.d1.e()
            com.huawei.hms.hatool.u r2 = r2.d()
            java.lang.String r0 = com.huawei.hms.hatool.s0.c()
            r2.q(r0)
            return
    }

    public void c(java.lang.String r3, int r4) {
            r2 = this;
            android.content.Context r0 = r2.a
            java.lang.String r1 = "hmsSdk"
            if (r0 != 0) goto Lc
            java.lang.String r3 = "onReport() null context or SDK was not init."
            com.huawei.hms.hatool.j1.l(r1, r3)
            return
        Lc:
            java.lang.String r0 = "onReport: Before calling runtaskhandler()"
            com.huawei.hms.hatool.j1.h(r1, r0)
            java.lang.String r4 = com.huawei.hms.hatool.q0.c(r4)
            java.lang.String r0 = com.huawei.hms.hatool.y0.m()
            r2.g(r3, r4, r0)
            return
    }

    public void d(java.lang.String r10, int r11, java.lang.String r12, org.json.JSONObject r13) {
            r9 = this;
            long r0 = java.lang.System.currentTimeMillis()
            r2 = 2
            if (r2 != r11) goto Ld
            java.lang.String r2 = "yyyy-MM-dd"
            long r0 = com.huawei.hms.hatool.q0.a(r2, r0)
        Ld:
            r7 = r0
            com.huawei.hms.hatool.b r2 = new com.huawei.hms.hatool.b
            java.lang.String r6 = com.huawei.hms.hatool.q0.c(r11)
            r5 = r10
            r3 = r12
            r4 = r13
            r2.<init>(r3, r4, r5, r6, r7)
            com.huawei.hms.hatool.e r10 = com.huawei.hms.hatool.e.d()
            r10.b(r2)
            return
    }

    public void e(java.lang.String r8, int r9, java.lang.String r10, org.json.JSONObject r11, long r12) {
            r7 = this;
            com.huawei.hms.hatool.a0 r0 = new com.huawei.hms.hatool.a0
            java.lang.String r2 = com.huawei.hms.hatool.q0.c(r9)
            java.lang.String r4 = r11.toString()
            r1 = r8
            r3 = r10
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5)
            r0.a()
            return
    }

    public void f(java.lang.String r9, java.lang.String r10) {
            r8 = this;
            boolean r0 = com.huawei.hms.hatool.c.b(r9, r10)
            java.lang.String r1 = "hmsSdk"
            if (r0 == 0) goto L2e
            long r2 = com.huawei.hms.hatool.c.k(r9, r10)
            long r4 = java.lang.System.currentTimeMillis()
            long r2 = r4 - r2
            r6 = 30000(0x7530, double:1.4822E-319)
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 <= 0) goto L28
            java.lang.String r0 = "begin to call onReport!"
            com.huawei.hms.hatool.j1.b(r1, r0)
            com.huawei.hms.hatool.c.a(r9, r10, r4)
            java.lang.String r0 = com.huawei.hms.hatool.y0.m()
            r8.g(r9, r10, r0)
            return
        L28:
            java.lang.String r9 = "autoReport timeout. interval < 30s "
            com.huawei.hms.hatool.j1.m(r1, r9)
            return
        L2e:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "auto report is closed tag:"
            r10.append(r0)
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            com.huawei.hms.hatool.j1.h(r1, r9)
            return
    }

    public void g(java.lang.String r4, java.lang.String r5, java.lang.String r6) {
            r3 = this;
            android.content.Context r0 = r3.a
            java.lang.String r1 = "hmsSdk"
            if (r0 != 0) goto Lc
            java.lang.String r4 = "onReport() null context or SDK was not init."
            com.huawei.hms.hatool.j1.l(r1, r4)
            return
        Lc:
            java.lang.String r0 = com.huawei.hms.hatool.b1.d(r0)
            boolean r2 = com.huawei.hms.hatool.c.f(r4, r5)
            if (r2 == 0) goto L33
            java.lang.String r2 = "WIFI"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L33
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "strNetworkType is :"
            r4.append(r5)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            com.huawei.hms.hatool.j1.h(r1, r4)
            return
        L33:
            java.lang.String r2 = "unknown"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L58
            java.lang.String r2 = "none"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L58
            java.lang.String r2 = "2G"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L58
            com.huawei.hms.hatool.i1 r0 = new com.huawei.hms.hatool.i1
            r0.<init>(r4, r5, r6)
            com.huawei.hms.hatool.e r4 = com.huawei.hms.hatool.e.d()
            r4.b(r0)
            return
        L58:
            java.lang.String r4 = "The network is bad."
            com.huawei.hms.hatool.j1.l(r1, r4)
            return
    }
}
