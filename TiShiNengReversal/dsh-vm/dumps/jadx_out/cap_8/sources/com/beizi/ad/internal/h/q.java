package com.beizi.ad.internal.h;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class q {
    public static java.lang.String a = ".AD_CLK_PT_DOWN_X.";

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f6901b = ".AD_CLK_PT_DOWN_Y.";

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.String f6902c = ".AD_CLK_PT_UP_X.";

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.String f6903d = ".AD_CLK_PT_UP_Y.";

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.String f6904e = ".SCRN_CLK_PT_DOWN_X.";

    /* renamed from: f, reason: collision with root package name */
    public static java.lang.String f6905f = ".SCRN_CLK_PT_DOWN_Y.";

    /* renamed from: g, reason: collision with root package name */
    public static java.lang.String f6906g = ".SCRN_CLK_PT_UP_X.";

    /* renamed from: h, reason: collision with root package name */
    public static java.lang.String f6907h = ".SCRN_CLK_PT_UP_Y.";

    /* renamed from: i, reason: collision with root package name */
    public static java.lang.String f6908i = ".UTC_TS.";

    /* renamed from: j, reason: collision with root package name */
    public static java.lang.String f6909j = ".AD_CLK_PT_DOWN_X_DP.";

    /* renamed from: k, reason: collision with root package name */
    public static java.lang.String f6910k = ".AD_CLK_PT_DOWN_Y_DP.";
    public static java.lang.String l = ".AD_CLK_PT_UP_X_DP.";
    public static java.lang.String m = ".AD_CLK_PT_UP_Y_DP.";
    public static java.lang.String n = ".SCRN_CLK_PT_DOWN_X_DP.";
    public static java.lang.String o = ".SCRN_CLK_PT_DOWN_Y_DP.";
    public static java.lang.String p = ".SCRN_CLK_PT_UP_X_DP.";
    public static java.lang.String q = ".SCRN_CLK_PT_UP_Y_DP.";
    public static java.lang.String r = ".EVENT_TS_START.";
    public static java.lang.String s = ".EVENT_TS_END.";
    public static java.lang.String t = ".VIDEO_DURATION.";
    public static java.lang.String u = "__CLT__";
    public static java.lang.String v = "__CLT-999__";

    static {
            return
    }

    public q() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.String a(android.content.Context r2, java.lang.String r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L31
            if (r0 != 0) goto L31
            java.lang.String r0 = "-999"
            boolean r0 = r3.equals(r0)     // Catch: java.lang.Throwable -> L31
            if (r0 != 0) goto L31
            java.lang.String r0 = "0"
            boolean r0 = r3.equals(r0)     // Catch: java.lang.Throwable -> L31
            if (r0 == 0) goto L17
            goto L31
        L17:
            double r0 = java.lang.Double.parseDouble(r3)     // Catch: java.lang.Throwable -> L31
            long r0 = (long) r0     // Catch: java.lang.Throwable -> L31
            float r0 = (float) r0     // Catch: java.lang.Throwable -> L31
            android.content.res.Resources r2 = r2.getResources()     // Catch: java.lang.Throwable -> L31
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()     // Catch: java.lang.Throwable -> L31
            float r2 = r2.density     // Catch: java.lang.Throwable -> L31
            float r0 = r0 / r2
            r2 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 + r2
            int r2 = (int) r0     // Catch: java.lang.Throwable -> L31
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> L31
            return r2
        L31:
            return r3
    }

    public static java.lang.String a(java.lang.String r0, com.beizi.ad.model.d r1, java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            java.lang.String r2 = com.beizi.ad.internal.h.q.a
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L1c
            java.lang.String r2 = r1.a()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L1c
            java.lang.String r2 = com.beizi.ad.internal.h.q.a
            java.lang.String r3 = r1.a()
            java.lang.String r0 = r0.replace(r2, r3)
        L1c:
            java.lang.String r2 = com.beizi.ad.internal.h.q.f6901b
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L38
            java.lang.String r2 = r1.b()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L38
            java.lang.String r2 = com.beizi.ad.internal.h.q.f6901b
            java.lang.String r3 = r1.b()
            java.lang.String r0 = r0.replace(r2, r3)
        L38:
            java.lang.String r2 = com.beizi.ad.internal.h.q.f6902c
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L54
            java.lang.String r2 = r1.e()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L54
            java.lang.String r2 = com.beizi.ad.internal.h.q.f6902c
            java.lang.String r3 = r1.e()
            java.lang.String r0 = r0.replace(r2, r3)
        L54:
            java.lang.String r2 = com.beizi.ad.internal.h.q.f6903d
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L70
            java.lang.String r2 = r1.f()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L70
            java.lang.String r2 = com.beizi.ad.internal.h.q.f6903d
            java.lang.String r3 = r1.f()
            java.lang.String r0 = r0.replace(r2, r3)
        L70:
            java.lang.String r2 = com.beizi.ad.internal.h.q.f6904e
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L8c
            java.lang.String r2 = r1.c()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L8c
            java.lang.String r2 = com.beizi.ad.internal.h.q.f6904e
            java.lang.String r3 = r1.c()
            java.lang.String r0 = r0.replace(r2, r3)
        L8c:
            java.lang.String r2 = com.beizi.ad.internal.h.q.f6905f
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto La8
            java.lang.String r2 = r1.d()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto La8
            java.lang.String r2 = com.beizi.ad.internal.h.q.f6905f
            java.lang.String r3 = r1.d()
            java.lang.String r0 = r0.replace(r2, r3)
        La8:
            java.lang.String r2 = com.beizi.ad.internal.h.q.f6906g
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto Lc4
            java.lang.String r2 = r1.g()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto Lc4
            java.lang.String r2 = com.beizi.ad.internal.h.q.f6906g
            java.lang.String r3 = r1.g()
            java.lang.String r0 = r0.replace(r2, r3)
        Lc4:
            java.lang.String r2 = com.beizi.ad.internal.h.q.f6907h
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto Le0
            java.lang.String r2 = r1.h()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto Le0
            java.lang.String r2 = com.beizi.ad.internal.h.q.f6907h
            java.lang.String r3 = r1.h()
            java.lang.String r0 = r0.replace(r2, r3)
        Le0:
            java.lang.String r2 = com.beizi.ad.internal.h.q.f6909j
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L106
            java.lang.String r2 = r1.a()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L106
            java.lang.String r2 = com.beizi.ad.internal.h.q.f6909j
            com.beizi.ad.internal.h r3 = com.beizi.ad.internal.h.a()
            android.content.Context r3 = r3.f6837j
            java.lang.String r4 = r1.a()
            java.lang.String r3 = a(r3, r4)
            java.lang.String r0 = r0.replace(r2, r3)
        L106:
            java.lang.String r2 = com.beizi.ad.internal.h.q.f6910k
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L12c
            java.lang.String r2 = r1.b()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L12c
            java.lang.String r2 = com.beizi.ad.internal.h.q.f6910k
            com.beizi.ad.internal.h r3 = com.beizi.ad.internal.h.a()
            android.content.Context r3 = r3.f6837j
            java.lang.String r4 = r1.b()
            java.lang.String r3 = a(r3, r4)
            java.lang.String r0 = r0.replace(r2, r3)
        L12c:
            java.lang.String r2 = com.beizi.ad.internal.h.q.l
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L152
            java.lang.String r2 = r1.e()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L152
            java.lang.String r2 = com.beizi.ad.internal.h.q.l
            com.beizi.ad.internal.h r3 = com.beizi.ad.internal.h.a()
            android.content.Context r3 = r3.f6837j
            java.lang.String r4 = r1.e()
            java.lang.String r3 = a(r3, r4)
            java.lang.String r0 = r0.replace(r2, r3)
        L152:
            java.lang.String r2 = com.beizi.ad.internal.h.q.m
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L178
            java.lang.String r2 = r1.f()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L178
            java.lang.String r2 = com.beizi.ad.internal.h.q.m
            com.beizi.ad.internal.h r3 = com.beizi.ad.internal.h.a()
            android.content.Context r3 = r3.f6837j
            java.lang.String r4 = r1.f()
            java.lang.String r3 = a(r3, r4)
            java.lang.String r0 = r0.replace(r2, r3)
        L178:
            java.lang.String r2 = com.beizi.ad.internal.h.q.n
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L19e
            java.lang.String r2 = r1.c()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L19e
            java.lang.String r2 = com.beizi.ad.internal.h.q.n
            com.beizi.ad.internal.h r3 = com.beizi.ad.internal.h.a()
            android.content.Context r3 = r3.f6837j
            java.lang.String r4 = r1.c()
            java.lang.String r3 = a(r3, r4)
            java.lang.String r0 = r0.replace(r2, r3)
        L19e:
            java.lang.String r2 = com.beizi.ad.internal.h.q.o
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L1c4
            java.lang.String r2 = r1.d()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L1c4
            java.lang.String r2 = com.beizi.ad.internal.h.q.o
            com.beizi.ad.internal.h r3 = com.beizi.ad.internal.h.a()
            android.content.Context r3 = r3.f6837j
            java.lang.String r4 = r1.d()
            java.lang.String r3 = a(r3, r4)
            java.lang.String r0 = r0.replace(r2, r3)
        L1c4:
            java.lang.String r2 = com.beizi.ad.internal.h.q.p
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L1ea
            java.lang.String r2 = r1.g()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L1ea
            java.lang.String r2 = com.beizi.ad.internal.h.q.p
            com.beizi.ad.internal.h r3 = com.beizi.ad.internal.h.a()
            android.content.Context r3 = r3.f6837j
            java.lang.String r4 = r1.g()
            java.lang.String r3 = a(r3, r4)
            java.lang.String r0 = r0.replace(r2, r3)
        L1ea:
            java.lang.String r2 = com.beizi.ad.internal.h.q.q
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L210
            java.lang.String r2 = r1.h()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L210
            java.lang.String r2 = com.beizi.ad.internal.h.q.q
            com.beizi.ad.internal.h r3 = com.beizi.ad.internal.h.a()
            android.content.Context r3 = r3.f6837j
            java.lang.String r1 = r1.h()
            java.lang.String r1 = a(r3, r1)
            java.lang.String r0 = r0.replace(r2, r1)
        L210:
            return r0
    }

    public static java.lang.String a(java.lang.String r2, com.beizi.ad.model.d r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, int r7) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto Lc8
            r0 = 2
            if (r7 == r0) goto L12
            r0 = 5
            if (r7 != r0) goto Ld
            goto L12
        Ld:
            java.lang.String r2 = a(r2, r3, r4, r5, r6)
            goto L63
        L12:
            com.beizi.ad.model.d r3 = new com.beizi.ad.model.d
            r3.<init>()
            java.lang.String r0 = com.beizi.ad.internal.h.q.u
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L3d
            java.lang.String r0 = "0"
            r3.a(r0)
            r3.b(r0)
            r3.c(r0)
            r3.d(r0)
            r3.e(r0)
            r3.f(r0)
            r3.g(r0)
            r3.h(r0)
            java.lang.String r2 = a(r2, r3, r4, r5, r6)
        L3d:
            java.lang.String r0 = com.beizi.ad.internal.h.q.v
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L63
            java.lang.String r0 = "-999"
            r3.a(r0)
            r3.b(r0)
            r3.c(r0)
            r3.d(r0)
            r3.e(r0)
            r3.f(r0)
            r3.g(r0)
            r3.h(r0)
            java.lang.String r2 = a(r2, r3, r4, r5, r6)
        L63:
            java.lang.String r3 = com.beizi.ad.internal.h.q.u
            boolean r3 = r2.contains(r3)
            if (r3 == 0) goto L75
            java.lang.String r3 = com.beizi.ad.internal.h.q.u
            java.lang.String r0 = java.lang.String.valueOf(r7)
            java.lang.String r2 = r2.replace(r3, r0)
        L75:
            java.lang.String r3 = com.beizi.ad.internal.h.q.v
            boolean r3 = r2.contains(r3)
            if (r3 == 0) goto L87
            java.lang.String r3 = com.beizi.ad.internal.h.q.v
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.String r2 = r2.replace(r3, r7)
        L87:
            java.lang.String r3 = com.beizi.ad.internal.h.q.f6908i
            boolean r3 = r2.contains(r3)
            if (r3 == 0) goto L9d
            java.lang.String r3 = com.beizi.ad.internal.h.q.f6908i
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.String r7 = java.lang.String.valueOf(r0)
            java.lang.String r2 = r2.replace(r3, r7)
        L9d:
            java.lang.String r3 = com.beizi.ad.internal.h.q.r
            boolean r3 = r2.contains(r3)
            if (r3 == 0) goto Lab
            java.lang.String r3 = com.beizi.ad.internal.h.q.r
            java.lang.String r2 = r2.replace(r3, r4)
        Lab:
            java.lang.String r3 = com.beizi.ad.internal.h.q.s
            boolean r3 = r2.contains(r3)
            if (r3 == 0) goto Lb9
            java.lang.String r3 = com.beizi.ad.internal.h.q.s
            java.lang.String r2 = r2.replace(r3, r5)
        Lb9:
            java.lang.String r3 = com.beizi.ad.internal.h.q.t
            boolean r3 = r2.contains(r3)
            if (r3 == 0) goto Lc7
            java.lang.String r3 = com.beizi.ad.internal.h.q.t
            java.lang.String r2 = r2.replace(r3, r6)
        Lc7:
            return r2
        Lc8:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "url must no null"
            r2.<init>(r3)
            throw r2
    }

    public static java.lang.String a(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto Lb7
            java.lang.String r0 = com.beizi.ad.internal.h.q.a
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L14
            java.lang.String r0 = com.beizi.ad.internal.h.q.a
            java.lang.String r1 = r1.replace(r0, r2)
        L14:
            java.lang.String r0 = com.beizi.ad.internal.h.q.f6901b
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L22
            java.lang.String r0 = com.beizi.ad.internal.h.q.f6901b
            java.lang.String r1 = r1.replace(r0, r3)
        L22:
            java.lang.String r0 = com.beizi.ad.internal.h.q.f6902c
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L30
            java.lang.String r0 = com.beizi.ad.internal.h.q.f6902c
            java.lang.String r1 = r1.replace(r0, r2)
        L30:
            java.lang.String r2 = com.beizi.ad.internal.h.q.f6903d
            boolean r2 = r1.contains(r2)
            if (r2 == 0) goto L3e
            java.lang.String r2 = com.beizi.ad.internal.h.q.f6903d
            java.lang.String r1 = r1.replace(r2, r3)
        L3e:
            java.lang.String r2 = com.beizi.ad.internal.h.q.f6904e
            boolean r2 = r1.contains(r2)
            if (r2 == 0) goto L4c
            java.lang.String r2 = com.beizi.ad.internal.h.q.f6904e
            java.lang.String r1 = r1.replace(r2, r4)
        L4c:
            java.lang.String r2 = com.beizi.ad.internal.h.q.f6905f
            boolean r2 = r1.contains(r2)
            if (r2 == 0) goto L5a
            java.lang.String r2 = com.beizi.ad.internal.h.q.f6905f
            java.lang.String r1 = r1.replace(r2, r5)
        L5a:
            java.lang.String r2 = com.beizi.ad.internal.h.q.f6906g
            boolean r2 = r1.contains(r2)
            if (r2 == 0) goto L68
            java.lang.String r2 = com.beizi.ad.internal.h.q.f6906g
            java.lang.String r1 = r1.replace(r2, r4)
        L68:
            java.lang.String r2 = com.beizi.ad.internal.h.q.f6907h
            boolean r2 = r1.contains(r2)
            if (r2 == 0) goto L76
            java.lang.String r2 = com.beizi.ad.internal.h.q.f6907h
            java.lang.String r1 = r1.replace(r2, r5)
        L76:
            java.lang.String r2 = com.beizi.ad.internal.h.q.f6908i
            boolean r2 = r1.contains(r2)
            if (r2 == 0) goto L8c
            java.lang.String r2 = com.beizi.ad.internal.h.q.f6908i
            long r3 = java.lang.System.currentTimeMillis()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r1 = r1.replace(r2, r3)
        L8c:
            java.lang.String r2 = com.beizi.ad.internal.h.q.r
            boolean r2 = r1.contains(r2)
            if (r2 == 0) goto L9a
            java.lang.String r2 = com.beizi.ad.internal.h.q.r
            java.lang.String r1 = r1.replace(r2, r6)
        L9a:
            java.lang.String r2 = com.beizi.ad.internal.h.q.s
            boolean r2 = r1.contains(r2)
            if (r2 == 0) goto La8
            java.lang.String r2 = com.beizi.ad.internal.h.q.s
            java.lang.String r1 = r1.replace(r2, r7)
        La8:
            java.lang.String r2 = com.beizi.ad.internal.h.q.t
            boolean r2 = r1.contains(r2)
            if (r2 == 0) goto Lb6
            java.lang.String r2 = com.beizi.ad.internal.h.q.t
            java.lang.String r1 = r1.replace(r2, r8)
        Lb6:
            return r1
        Lb7:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "url must no null"
            r1.<init>(r2)
            throw r1
    }

    public static java.lang.String a(java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, int r10) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L1b8
            r0 = 2
            if (r10 != r0) goto L23
            java.lang.String r0 = com.beizi.ad.internal.h.q.u
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L16
            java.lang.String r3 = "0"
            r4 = r3
            r5 = r4
            r6 = r5
        L16:
            java.lang.String r0 = com.beizi.ad.internal.h.q.v
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L23
            java.lang.String r3 = "-999"
            r4 = r3
            r5 = r4
            r6 = r5
        L23:
            java.lang.String r0 = com.beizi.ad.internal.h.q.a
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L31
            java.lang.String r0 = com.beizi.ad.internal.h.q.a
            java.lang.String r2 = r2.replace(r0, r3)
        L31:
            java.lang.String r0 = com.beizi.ad.internal.h.q.f6901b
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L3f
            java.lang.String r0 = com.beizi.ad.internal.h.q.f6901b
            java.lang.String r2 = r2.replace(r0, r4)
        L3f:
            java.lang.String r0 = com.beizi.ad.internal.h.q.f6902c
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L4d
            java.lang.String r0 = com.beizi.ad.internal.h.q.f6902c
            java.lang.String r2 = r2.replace(r0, r3)
        L4d:
            java.lang.String r0 = com.beizi.ad.internal.h.q.f6903d
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L5b
            java.lang.String r0 = com.beizi.ad.internal.h.q.f6903d
            java.lang.String r2 = r2.replace(r0, r4)
        L5b:
            java.lang.String r0 = com.beizi.ad.internal.h.q.f6904e
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L69
            java.lang.String r0 = com.beizi.ad.internal.h.q.f6904e
            java.lang.String r2 = r2.replace(r0, r5)
        L69:
            java.lang.String r0 = com.beizi.ad.internal.h.q.f6905f
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L77
            java.lang.String r0 = com.beizi.ad.internal.h.q.f6905f
            java.lang.String r2 = r2.replace(r0, r6)
        L77:
            java.lang.String r0 = com.beizi.ad.internal.h.q.f6906g
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L85
            java.lang.String r0 = com.beizi.ad.internal.h.q.f6906g
            java.lang.String r2 = r2.replace(r0, r5)
        L85:
            java.lang.String r0 = com.beizi.ad.internal.h.q.f6907h
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L93
            java.lang.String r0 = com.beizi.ad.internal.h.q.f6907h
            java.lang.String r2 = r2.replace(r0, r6)
        L93:
            java.lang.String r0 = com.beizi.ad.internal.h.q.f6909j
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto Lab
            java.lang.String r0 = com.beizi.ad.internal.h.q.f6909j
            com.beizi.ad.internal.h r1 = com.beizi.ad.internal.h.a()
            android.content.Context r1 = r1.f6837j
            java.lang.String r1 = a(r1, r3)
            java.lang.String r2 = r2.replace(r0, r1)
        Lab:
            java.lang.String r0 = com.beizi.ad.internal.h.q.f6910k
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto Lc3
            java.lang.String r0 = com.beizi.ad.internal.h.q.f6910k
            com.beizi.ad.internal.h r1 = com.beizi.ad.internal.h.a()
            android.content.Context r1 = r1.f6837j
            java.lang.String r1 = a(r1, r4)
            java.lang.String r2 = r2.replace(r0, r1)
        Lc3:
            java.lang.String r0 = com.beizi.ad.internal.h.q.l
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto Ldb
            java.lang.String r0 = com.beizi.ad.internal.h.q.l
            com.beizi.ad.internal.h r1 = com.beizi.ad.internal.h.a()
            android.content.Context r1 = r1.f6837j
            java.lang.String r3 = a(r1, r3)
            java.lang.String r2 = r2.replace(r0, r3)
        Ldb:
            java.lang.String r3 = com.beizi.ad.internal.h.q.m
            boolean r3 = r2.contains(r3)
            if (r3 == 0) goto Lf3
            java.lang.String r3 = com.beizi.ad.internal.h.q.m
            com.beizi.ad.internal.h r0 = com.beizi.ad.internal.h.a()
            android.content.Context r0 = r0.f6837j
            java.lang.String r4 = a(r0, r4)
            java.lang.String r2 = r2.replace(r3, r4)
        Lf3:
            java.lang.String r3 = com.beizi.ad.internal.h.q.n
            boolean r3 = r2.contains(r3)
            if (r3 == 0) goto L10b
            java.lang.String r3 = com.beizi.ad.internal.h.q.n
            com.beizi.ad.internal.h r4 = com.beizi.ad.internal.h.a()
            android.content.Context r4 = r4.f6837j
            java.lang.String r4 = a(r4, r5)
            java.lang.String r2 = r2.replace(r3, r4)
        L10b:
            java.lang.String r3 = com.beizi.ad.internal.h.q.o
            boolean r3 = r2.contains(r3)
            if (r3 == 0) goto L123
            java.lang.String r3 = com.beizi.ad.internal.h.q.o
            com.beizi.ad.internal.h r4 = com.beizi.ad.internal.h.a()
            android.content.Context r4 = r4.f6837j
            java.lang.String r4 = a(r4, r6)
            java.lang.String r2 = r2.replace(r3, r4)
        L123:
            java.lang.String r3 = com.beizi.ad.internal.h.q.p
            boolean r3 = r2.contains(r3)
            if (r3 == 0) goto L13b
            java.lang.String r3 = com.beizi.ad.internal.h.q.p
            com.beizi.ad.internal.h r4 = com.beizi.ad.internal.h.a()
            android.content.Context r4 = r4.f6837j
            java.lang.String r4 = a(r4, r5)
            java.lang.String r2 = r2.replace(r3, r4)
        L13b:
            java.lang.String r3 = com.beizi.ad.internal.h.q.q
            boolean r3 = r2.contains(r3)
            if (r3 == 0) goto L153
            java.lang.String r3 = com.beizi.ad.internal.h.q.q
            com.beizi.ad.internal.h r4 = com.beizi.ad.internal.h.a()
            android.content.Context r4 = r4.f6837j
            java.lang.String r4 = a(r4, r6)
            java.lang.String r2 = r2.replace(r3, r4)
        L153:
            java.lang.String r3 = com.beizi.ad.internal.h.q.u
            boolean r3 = r2.contains(r3)
            if (r3 == 0) goto L165
            java.lang.String r3 = com.beizi.ad.internal.h.q.u
            java.lang.String r4 = java.lang.String.valueOf(r10)
            java.lang.String r2 = r2.replace(r3, r4)
        L165:
            java.lang.String r3 = com.beizi.ad.internal.h.q.v
            boolean r3 = r2.contains(r3)
            if (r3 == 0) goto L177
            java.lang.String r3 = com.beizi.ad.internal.h.q.v
            java.lang.String r4 = java.lang.String.valueOf(r10)
            java.lang.String r2 = r2.replace(r3, r4)
        L177:
            java.lang.String r3 = com.beizi.ad.internal.h.q.f6908i
            boolean r3 = r2.contains(r3)
            if (r3 == 0) goto L18d
            java.lang.String r3 = com.beizi.ad.internal.h.q.f6908i
            long r4 = java.lang.System.currentTimeMillis()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r2 = r2.replace(r3, r4)
        L18d:
            java.lang.String r3 = com.beizi.ad.internal.h.q.r
            boolean r3 = r2.contains(r3)
            if (r3 == 0) goto L19b
            java.lang.String r3 = com.beizi.ad.internal.h.q.r
            java.lang.String r2 = r2.replace(r3, r7)
        L19b:
            java.lang.String r3 = com.beizi.ad.internal.h.q.s
            boolean r3 = r2.contains(r3)
            if (r3 == 0) goto L1a9
            java.lang.String r3 = com.beizi.ad.internal.h.q.s
            java.lang.String r2 = r2.replace(r3, r8)
        L1a9:
            java.lang.String r3 = com.beizi.ad.internal.h.q.t
            boolean r3 = r2.contains(r3)
            if (r3 == 0) goto L1b7
            java.lang.String r3 = com.beizi.ad.internal.h.q.t
            java.lang.String r2 = r2.replace(r3, r9)
        L1b7:
            return r2
        L1b8:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "url must no null"
            r2.<init>(r3)
            throw r2
    }

    public static void a(com.beizi.ad.model.c.j r8) {
            java.lang.String r0 = r8.d()
            boolean r8 = android.text.TextUtils.isEmpty(r0)
            if (r8 != 0) goto L2f
            java.lang.String r6 = ""
            java.lang.String r7 = ""
            java.lang.String r1 = ""
            java.lang.String r2 = ""
            java.lang.String r3 = ""
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r8 = a(r0, r1, r2, r3, r4, r5, r6, r7)
            com.beizi.ad.internal.i r0 = new com.beizi.ad.internal.i
            r0.<init>(r8)
            com.beizi.ad.lance.a.c r8 = com.beizi.ad.lance.a.c.b()
            java.util.concurrent.ExecutorService r8 = r8.f()
            r1 = 0
            java.lang.Void[] r1 = new java.lang.Void[r1]
            r0.executeOnExecutor(r8, r1)
        L2f:
            return
    }

    public static void b(com.beizi.ad.model.c.j r8) {
            java.lang.String r0 = r8.e()
            boolean r8 = android.text.TextUtils.isEmpty(r0)
            if (r8 != 0) goto L2f
            java.lang.String r6 = ""
            java.lang.String r7 = ""
            java.lang.String r1 = ""
            java.lang.String r2 = ""
            java.lang.String r3 = ""
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r8 = a(r0, r1, r2, r3, r4, r5, r6, r7)
            com.beizi.ad.internal.i r0 = new com.beizi.ad.internal.i
            r0.<init>(r8)
            com.beizi.ad.lance.a.c r8 = com.beizi.ad.lance.a.c.b()
            java.util.concurrent.ExecutorService r8 = r8.f()
            r1 = 0
            java.lang.Void[] r1 = new java.lang.Void[r1]
            r0.executeOnExecutor(r8, r1)
        L2f:
            return
    }

    public static void c(com.beizi.ad.model.c.j r8) {
            java.lang.String r0 = r8.f()
            boolean r8 = android.text.TextUtils.isEmpty(r0)
            if (r8 != 0) goto L2f
            java.lang.String r6 = ""
            java.lang.String r7 = ""
            java.lang.String r1 = ""
            java.lang.String r2 = ""
            java.lang.String r3 = ""
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r8 = a(r0, r1, r2, r3, r4, r5, r6, r7)
            com.beizi.ad.internal.i r0 = new com.beizi.ad.internal.i
            r0.<init>(r8)
            com.beizi.ad.lance.a.c r8 = com.beizi.ad.lance.a.c.b()
            java.util.concurrent.ExecutorService r8 = r8.f()
            r1 = 0
            java.lang.Void[] r1 = new java.lang.Void[r1]
            r0.executeOnExecutor(r8, r1)
        L2f:
            return
    }
}
