package com.ss.android.downloadlib.addownload.compliance;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
class a {
    public a() {
            r1 = this;
            r1.<init>()
            return
    }

    public static void a(int r2, long r3) {
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "error_code"
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> Lf
            r0.putOpt(r1, r2)     // Catch: java.lang.Exception -> Lf
            goto L13
        Lf:
            r2 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r2)
        L13:
            com.ss.android.downloadlib.r.b r2 = com.ss.android.downloadlib.r.b.a()
            com.ss.android.downloadlib.addownload.o$f r1 = com.ss.android.downloadlib.addownload.o.f.c()
            com.ss.android.downloadlib.addownload.o$i r3 = r1.r(r3)
            java.lang.String r4 = "lp_compliance_error"
            r2.x(r4, r0, r3)
            return
    }

    public static void b(int r2, com.ss.android.downloadlib.addownload.o.i r3) {
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "error_code"
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> Lf
            r0.putOpt(r1, r2)     // Catch: java.lang.Exception -> Lf
            goto L13
        Lf:
            r2 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r2)
        L13:
            com.ss.android.downloadlib.r.b r2 = com.ss.android.downloadlib.r.b.a()
            java.lang.String r1 = "lp_compliance_error"
            r2.x(r1, r0, r3)
            return
    }

    public static void c(java.lang.String r1, long r2) {
            com.ss.android.downloadlib.addownload.o$f r0 = com.ss.android.downloadlib.addownload.o.f.c()
            com.ss.android.downloadlib.addownload.o$i r2 = r0.r(r2)
            boolean r3 = r2.b()
            if (r3 != 0) goto L1c
            com.ss.android.j.j.cw.g r3 = r2.c
            r3.j(r1)
            com.ss.android.downloadlib.r.b r1 = com.ss.android.downloadlib.r.b.a()
            java.lang.String r3 = "lp_app_dialog_click"
            r1.w(r3, r2)
        L1c:
            return
    }

    public static void d(java.lang.String r1, com.ss.android.downloadlib.addownload.o.i r2) {
            com.ss.android.downloadlib.r.b r0 = com.ss.android.downloadlib.r.b.a()
            r0.w(r1, r2)
            return
    }

    public static void e(java.lang.String r2, org.json.JSONObject r3, long r4) {
            com.ss.android.downloadlib.r.b r0 = com.ss.android.downloadlib.r.b.a()
            com.ss.android.downloadlib.addownload.o$f r1 = com.ss.android.downloadlib.addownload.o.f.c()
            com.ss.android.downloadlib.addownload.o$i r4 = r1.r(r4)
            r0.x(r2, r3, r4)
            return
    }

    public static void f(java.lang.String r1, long r2) {
            r0 = 0
            e(r1, r0, r2)
            return
    }
}
