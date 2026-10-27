package com.ss.android.downloadlib.addownload;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class d {
    public d() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.String a(com.ss.android.j.j.cw.b r1) {
            java.lang.String r0 = r1.ch()     // Catch: org.json.JSONException -> L1a
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: org.json.JSONException -> L1a
            if (r0 != 0) goto L1e
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L1a
            java.lang.String r1 = r1.ch()     // Catch: org.json.JSONException -> L1a
            r0.<init>(r1)     // Catch: org.json.JSONException -> L1a
            java.lang.String r1 = "clickid"
            java.lang.String r1 = r0.optString(r1)     // Catch: org.json.JSONException -> L1a
            return r1
        L1a:
            r1 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r1)
        L1e:
            r1 = 0
            return r1
    }

    public static int b(@androidx.annotation.NonNull com.ss.android.downloadlib.addownload.o.i r10, boolean r11, com.ss.android.socialbase.appdownloader.e r12) {
            if (r12 == 0) goto Lae
            java.lang.String r0 = r12.M()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lae
            android.content.Context r0 = r12.getContext()
            if (r0 != 0) goto L14
            goto Lae
        L14:
            java.lang.String r0 = r12.M()     // Catch: java.lang.Throwable -> L1d
            int r0 = c(r12, r0)     // Catch: java.lang.Throwable -> L1d
            goto L28
        L1d:
            r0 = move-exception
            u2.a r1 = com.ss.android.downloadlib.addownload.m.w()
            java.lang.String r2 = "redirectSavePathIfPossible"
            r1.j(r0, r2)
            r0 = 4
        L28:
            r12.N(r0)
            if (r0 != 0) goto L35
            com.ss.android.downloadlib.b$f r0 = new com.ss.android.downloadlib.b$f
            r0.<init>()
            r12.G(r0)
        L35:
            boolean r0 = r12.Q()
            if (r0 != 0) goto L43
            com.ss.android.downloadlib.b$k r0 = new com.ss.android.downloadlib.b$k
            r0.<init>()
            r12.G(r0)
        L43:
            com.ss.android.socialbase.appdownloader.f r0 = com.ss.android.socialbase.appdownloader.f.L()
            int r0 = r0.h(r12)
            com.ss.android.xt.j.xt.b r1 = d(r10, r0)
            com.ss.android.downloadlib.addownload.o$f r2 = com.ss.android.downloadlib.addownload.o.f.c()
            r2.l(r1)
            r1.b(r0)
            long r2 = java.lang.System.currentTimeMillis()
            r1.C0(r2)
            r2 = 0
            r1.z(r2)
            org.json.JSONObject r1 = r12.R()
            com.ss.android.socialbase.downloader.jy.j r1 = com.ss.android.socialbase.downloader.jy.j.j(r1)
            boolean r2 = i(r12, r1, r0)
            if (r2 != 0) goto Lad
            com.ss.android.j.j.cw.b r2 = r10.b
            boolean r2 = r2.qv()
            if (r2 == 0) goto Lad
            com.ss.android.j.j.cw.b r2 = r10.b
            java.lang.String r2 = r2.gx()
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 == 0) goto L8d
            java.lang.String r2 = "download_start_toast_text"
            java.lang.String r2 = r1.cw(r2)
        L8d:
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 == 0) goto L9c
            if (r11 == 0) goto L99
            java.lang.String r11 = "已开始下载，可在\"我的\"里查看管理"
        L97:
            r2 = r11
            goto L9c
        L99:
            java.lang.String r11 = "已开始下载"
            goto L97
        L9c:
            r7 = r2
            v2.w r3 = com.ss.android.downloadlib.addownload.m.d()
            android.content.Context r5 = r12.getContext()
            com.ss.android.j.j.cw.b r6 = r10.b
            r8 = 0
            r9 = 0
            r4 = 2
            r3.j(r4, r5, r6, r7, r8, r9)
        Lad:
            return r0
        Lae:
            r10 = 0
            return r10
    }

    private static int c(com.ss.android.socialbase.appdownloader.e r5, java.lang.String r6) {
            org.json.JSONObject r0 = r5.R()
            com.ss.android.socialbase.downloader.jy.j r0 = com.ss.android.socialbase.downloader.jy.j.j(r0)
            java.lang.String r1 = "download_dir"
            org.json.JSONObject r1 = r0.r(r1)
            if (r1 == 0) goto Lc4
            java.lang.String r2 = "dir_name"
            java.lang.String r1 = r1.optString(r2)
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L1e
            goto Lc4
        L1e:
            java.lang.String r1 = r5.R0()
            java.lang.String r2 = r5.x()
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 == 0) goto L35
            java.lang.String r2 = r5.G0()
            r3 = 1
            java.lang.String r2 = com.ss.android.socialbase.appdownloader.b.t(r6, r1, r2, r3)
        L35:
            int r3 = r2.length()
            r4 = 255(0xff, float:3.57E-43)
            if (r3 <= r4) goto L46
            int r3 = r2.length()
            int r3 = r3 - r4
            java.lang.String r2 = r2.substring(r3)
        L46:
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 == 0) goto L4d
            r1 = r2
        L4d:
            java.lang.String r3 = r5.o()
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 == 0) goto L5b
            java.lang.String r3 = com.ss.android.socialbase.appdownloader.b.L()
        L5b:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            java.lang.String r3 = java.io.File.separator
            r4.append(r3)
            java.lang.String r1 = com.ss.android.socialbase.appdownloader.b.s(r1, r0)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            com.ss.android.socialbase.appdownloader.f r3 = com.ss.android.socialbase.appdownloader.f.L()
            android.content.Context r4 = r5.getContext()
            com.ss.android.socialbase.downloader.ae.cw r6 = r3.j(r4, r6)
            if (r6 == 0) goto L9c
            boolean r3 = r6.ag()
            if (r3 == 0) goto L9c
            java.lang.String r0 = r6.qv()
            r5.m(r0)
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L9a
            java.lang.String r6 = r6.hl()     // Catch: java.lang.Throwable -> L9a
            r0.<init>(r6)     // Catch: java.lang.Throwable -> L9a
            r5.K(r0)     // Catch: java.lang.Throwable -> L9a
        L9a:
            r5 = 0
            return r5
        L9c:
            if (r6 != 0) goto Lbc
            com.ss.android.socialbase.appdownloader.f r3 = com.ss.android.socialbase.appdownloader.f.L()
            java.lang.String r4 = r5.G0()
            java.lang.String r2 = r3.m(r2, r4)
            java.lang.String r3 = "application/vnd.android.package-archive"
            boolean r2 = r3.equalsIgnoreCase(r2)
            if (r2 == 0) goto Lbc
            int r6 = com.ss.android.socialbase.appdownloader.j.c(r0)
            if (r6 != 0) goto Lbb
            r5.m(r1)
        Lbb:
            return r6
        Lbc:
            if (r6 == 0) goto Lc1
            r5 = 8
            return r5
        Lc1:
            r5 = 9
            return r5
        Lc4:
            r5 = -1
            return r5
    }

    private static com.ss.android.xt.j.xt.b d(com.ss.android.downloadlib.addownload.o.i r4, int r5) {
            com.ss.android.xt.j.xt.b r0 = new com.ss.android.xt.j.xt.b
            com.ss.android.j.j.cw.b r1 = r4.b
            com.ss.android.j.j.cw.g r2 = r4.c
            com.ss.android.j.j.cw.c r3 = r4.d
            r0.<init>(r1, r2, r3, r5)
            com.ss.android.socialbase.downloader.jy.j r5 = com.ss.android.socialbase.downloader.jy.j.j(r5)
            java.lang.String r1 = "download_event_opt"
            r2 = 1
            int r5 = r5.j(r1, r2)
            if (r5 <= r2) goto L38
            com.ss.android.j.j.cw.b r4 = r4.b     // Catch: java.lang.Throwable -> L38
            java.lang.String r4 = r4.s()     // Catch: java.lang.Throwable -> L38
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L38
            if (r5 != 0) goto L38
            android.content.Context r5 = com.ss.android.downloadlib.addownload.m.getContext()     // Catch: java.lang.Throwable -> L38
            android.content.pm.PackageManager r5 = r5.getPackageManager()     // Catch: java.lang.Throwable -> L38
            r1 = 0
            android.content.pm.PackageInfo r4 = r5.getPackageInfo(r4, r1)     // Catch: java.lang.Throwable -> L38
            if (r4 == 0) goto L34
            goto L35
        L34:
            r2 = 0
        L35:
            r0.E0(r2)     // Catch: java.lang.Throwable -> L38
        L38:
            return r0
    }

    public static java.lang.String e(com.ss.android.socialbase.downloader.ae.cw r2) {
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            java.lang.String r2 = r2.h()     // Catch: java.lang.Exception -> L1a
            boolean r1 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> L1a
            if (r1 != 0) goto L1e
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> L1a
            r1.<init>(r2)     // Catch: java.lang.Exception -> L1a
            java.lang.String r2 = "notification_jump_url"
            java.lang.String r2 = r1.optString(r2, r0)     // Catch: java.lang.Exception -> L1a
            return r2
        L1a:
            r2 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r2)
        L1e:
            return r0
    }

    public static boolean f(int r1) {
            r0 = 1
            if (r1 == 0) goto L8
            if (r1 != r0) goto L6
            goto L8
        L6:
            r1 = 0
            return r1
        L8:
            return r0
    }

    public static boolean g(com.ss.android.j.j.cw.b r1) {
            boolean r0 = r1.x()
            if (r0 == 0) goto L12
            boolean r0 = r1 instanceof com.ss.android.xt.j.j.a
            if (r0 == 0) goto L12
            int r1 = r1.la()
            r0 = 1
            if (r1 != r0) goto L12
            return r0
        L12:
            r1 = 0
            return r1
    }

    public static boolean h(com.ss.android.j.j.cw.b r0, v2.h r1) {
            boolean r0 = r0.x()
            if (r0 == 0) goto La
            if (r1 == 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    private static boolean i(com.ss.android.socialbase.appdownloader.e r11, @androidx.annotation.NonNull com.ss.android.socialbase.downloader.jy.j r12, int r13) {
            java.lang.String r11 = "ah_plans"
            org.json.JSONArray r11 = r12.up(r11)
            r0 = 0
            if (r11 == 0) goto Lc6
            int r1 = r11.length()
            if (r1 != 0) goto L11
            goto Lc6
        L11:
            int r1 = r11.length()
            r2 = 0
            r4 = r2
            r3 = 0
        L18:
            r5 = 1
            if (r3 >= r1) goto Lae
            org.json.JSONObject r6 = r11.optJSONObject(r3)
            if (r6 == 0) goto Laa
            java.lang.String r7 = "type"
            java.lang.String r7 = r6.optString(r7)
            java.lang.String r8 = "plan_c"
            if (r7 == r8) goto L31
            boolean r9 = com.ss.android.socialbase.appdownloader.m.b.f(r6)
            if (r9 == 0) goto Laa
        L31:
            r7.getClass()
            int r9 = r7.hashCode()
            r10 = -1
            switch(r9) {
                case -985763637: goto L88;
                case -985763636: goto L7d;
                case -985763635: goto L74;
                case -985763634: goto L69;
                case -985763633: goto L5e;
                case -985763632: goto L53;
                case -985763631: goto L48;
                case -985763630: goto L3d;
                default: goto L3c;
            }
        L3c:
            goto L92
        L3d:
            java.lang.String r8 = "plan_h"
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L46
            goto L92
        L46:
            r10 = 7
            goto L92
        L48:
            java.lang.String r8 = "plan_g"
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L51
            goto L92
        L51:
            r10 = 6
            goto L92
        L53:
            java.lang.String r8 = "plan_f"
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L5c
            goto L92
        L5c:
            r10 = 5
            goto L92
        L5e:
            java.lang.String r8 = "plan_e"
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L67
            goto L92
        L67:
            r10 = 4
            goto L92
        L69:
            java.lang.String r8 = "plan_d"
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L72
            goto L92
        L72:
            r10 = 3
            goto L92
        L74:
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L7b
            goto L92
        L7b:
            r10 = 2
            goto L92
        L7d:
            java.lang.String r8 = "plan_b"
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L86
            goto L92
        L86:
            r10 = 1
            goto L92
        L88:
            java.lang.String r8 = "plan_a"
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L91
            goto L92
        L91:
            r10 = 0
        L92:
            switch(r10) {
                case 0: goto La1;
                case 1: goto La1;
                case 2: goto L9f;
                case 3: goto Lae;
                case 4: goto La1;
                case 5: goto La1;
                case 6: goto L96;
                case 7: goto Lae;
                default: goto L95;
            }
        L95:
            goto Laa
        L96:
            com.ss.android.socialbase.appdownloader.d r6 = com.ss.android.socialbase.appdownloader.j.A(r6, r12)
            int r6 = r6.b
            if (r6 != 0) goto Laa
            goto Lae
        L9f:
            r4 = r6
            goto Laa
        La1:
            com.ss.android.socialbase.appdownloader.d r6 = com.ss.android.socialbase.appdownloader.j.d(r6, r12)
            int r6 = r6.b
            if (r6 != 0) goto Laa
            goto Lae
        Laa:
            int r3 = r3 + 1
            goto L18
        Lae:
            if (r4 == 0) goto Lc6
            java.lang.String r11 = "show_unknown_source_on_startup"
            int r11 = r4.optInt(r11)
            if (r11 != r5) goto Lc6
            android.content.Context r11 = com.ss.android.socialbase.downloader.downloader.cw.nd()
            com.ss.android.socialbase.appdownloader.d r12 = new com.ss.android.socialbase.appdownloader.d
            r12.<init>()
            boolean r11 = com.ss.android.socialbase.appdownloader.j.q(r11, r2, r4, r13, r12)
            return r11
        Lc6:
            return r0
    }

    public static java.lang.String j(com.ss.android.j.j.cw.b r1) {
            java.lang.String r0 = r1.ch()     // Catch: org.json.JSONException -> L1a
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: org.json.JSONException -> L1a
            if (r0 != 0) goto L1e
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L1a
            java.lang.String r1 = r1.ch()     // Catch: org.json.JSONException -> L1a
            r0.<init>(r1)     // Catch: org.json.JSONException -> L1a
            java.lang.String r1 = "intent_extra"
            java.lang.String r1 = r0.optString(r1)     // Catch: org.json.JSONException -> L1a
            return r1
        L1a:
            r1 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r1)
        L1e:
            r1 = 0
            return r1
    }

    public static boolean k(int r2) {
            r0 = 2
            r1 = 1
            if (r2 == r0) goto L9
            if (r2 != r1) goto L7
            goto L9
        L7:
            r2 = 0
            return r2
        L9:
            return r1
    }

    public static boolean l(com.ss.android.j.j.cw.b r1) {
            if (r1 == 0) goto Lb
            int r1 = r1.la()
            r0 = 2
            if (r1 != r0) goto Lb
            r1 = 1
            return r1
        Lb:
            r1 = 0
            return r1
    }
}
