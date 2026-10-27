package com.umeng.commonsdk.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class d {
    public d() {
            r0 = this;
            r0.<init>()
            return
    }

    public static org.json.JSONObject a() {
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "a_pr"
            java.lang.String r2 = android.os.Build.PRODUCT     // Catch: java.lang.Exception -> Le4
            r0.put(r1, r2)     // Catch: java.lang.Exception -> Le4
            java.lang.String r1 = "a_bl"
            java.lang.String r2 = android.os.Build.BOOTLOADER     // Catch: java.lang.Exception -> Le4
            r0.put(r1, r2)     // Catch: java.lang.Exception -> Le4
            java.lang.String r1 = "a_rv"
            java.lang.String r2 = android.os.Build.getRadioVersion()     // Catch: java.lang.Exception -> Le4
            r0.put(r1, r2)     // Catch: java.lang.Exception -> Le4
            java.lang.String r1 = "a_fp"
            java.lang.String r2 = android.os.Build.FINGERPRINT     // Catch: java.lang.Exception -> Le4
            r0.put(r1, r2)     // Catch: java.lang.Exception -> Le4
            java.lang.String r1 = "a_hw"
            java.lang.String r2 = android.os.Build.HARDWARE     // Catch: java.lang.Exception -> Le4
            r0.put(r1, r2)     // Catch: java.lang.Exception -> Le4
            java.lang.String r1 = "a_host"
            java.lang.String r2 = android.os.Build.HOST     // Catch: java.lang.Exception -> Le4
            r0.put(r1, r2)     // Catch: java.lang.Exception -> Le4
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch: java.lang.Exception -> Le4
            r1.<init>()     // Catch: java.lang.Exception -> Le4
            r2 = 0
            r3 = 0
        L38:
            java.lang.String[] r4 = android.os.Build.SUPPORTED_32_BIT_ABIS     // Catch: java.lang.Exception -> Le4
            int r5 = r4.length     // Catch: java.lang.Exception -> Le4
            if (r3 >= r5) goto L45
            r4 = r4[r3]     // Catch: java.lang.Exception -> Le4
            r1.put(r4)     // Catch: java.lang.Exception -> Le4
            int r3 = r3 + 1
            goto L38
        L45:
            int r3 = r1.length()     // Catch: java.lang.Exception -> Le4
            if (r3 <= 0) goto L50
            java.lang.String r3 = "a_s32"
            r0.put(r3, r1)     // Catch: java.lang.Exception -> Le4
        L50:
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch: java.lang.Exception -> Le4
            r1.<init>()     // Catch: java.lang.Exception -> Le4
            r3 = 0
        L56:
            java.lang.String[] r4 = android.os.Build.SUPPORTED_64_BIT_ABIS     // Catch: java.lang.Exception -> Le4
            int r5 = r4.length     // Catch: java.lang.Exception -> Le4
            if (r3 >= r5) goto L63
            r4 = r4[r3]     // Catch: java.lang.Exception -> Le4
            r1.put(r4)     // Catch: java.lang.Exception -> Le4
            int r3 = r3 + 1
            goto L56
        L63:
            int r3 = r1.length()     // Catch: java.lang.Exception -> Le4
            if (r3 <= 0) goto L6e
            java.lang.String r3 = "a_s64"
            r0.put(r3, r1)     // Catch: java.lang.Exception -> Le4
        L6e:
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch: java.lang.Exception -> Le4
            r1.<init>()     // Catch: java.lang.Exception -> Le4
        L73:
            java.lang.String[] r3 = android.os.Build.SUPPORTED_ABIS     // Catch: java.lang.Exception -> Le4
            int r4 = r3.length     // Catch: java.lang.Exception -> Le4
            if (r2 >= r4) goto L80
            r3 = r3[r2]     // Catch: java.lang.Exception -> Le4
            r1.put(r3)     // Catch: java.lang.Exception -> Le4
            int r2 = r2 + 1
            goto L73
        L80:
            int r2 = r1.length()     // Catch: java.lang.Exception -> Le4
            if (r2 <= 0) goto L8b
            java.lang.String r2 = "a_sa"
            r0.put(r2, r1)     // Catch: java.lang.Exception -> Le4
        L8b:
            java.lang.String r1 = "a_ta"
            java.lang.String r2 = android.os.Build.TAGS     // Catch: java.lang.Exception -> Le4
            r0.put(r1, r2)     // Catch: java.lang.Exception -> Le4
            java.lang.String r1 = "a_uk"
            java.lang.String r2 = "unknown"
            r0.put(r1, r2)     // Catch: java.lang.Exception -> Le4
            java.lang.String r1 = "a_user"
            java.lang.String r2 = android.os.Build.USER     // Catch: java.lang.Exception -> Le4
            r0.put(r1, r2)     // Catch: java.lang.Exception -> Le4
            java.lang.String r1 = "a_cpu1"
            java.lang.String r2 = android.os.Build.CPU_ABI     // Catch: java.lang.Exception -> Le4
            r0.put(r1, r2)     // Catch: java.lang.Exception -> Le4
            java.lang.String r1 = "a_cpu2"
            java.lang.String r2 = android.os.Build.CPU_ABI2     // Catch: java.lang.Exception -> Le4
            r0.put(r1, r2)     // Catch: java.lang.Exception -> Le4
            java.lang.String r1 = "a_ra"
            java.lang.String r2 = android.os.Build.RADIO     // Catch: java.lang.Exception -> Le4
            r0.put(r1, r2)     // Catch: java.lang.Exception -> Le4
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> Le4
            r2 = 23
            if (r1 < r2) goto Ld6
            java.lang.String r1 = "a_bos"
            java.lang.String r2 = com.umeng.commonsdk.internal.e.a()     // Catch: java.lang.Exception -> Le4
            r0.put(r1, r2)     // Catch: java.lang.Exception -> Le4
            java.lang.String r1 = "a_pre"
            int r2 = com.bytedance.pangle.transform.c.a()     // Catch: java.lang.Exception -> Le4
            r0.put(r1, r2)     // Catch: java.lang.Exception -> Le4
            java.lang.String r1 = "a_sp"
            java.lang.String r2 = l.r.a()     // Catch: java.lang.Exception -> Le4
            r0.put(r1, r2)     // Catch: java.lang.Exception -> Le4
        Ld6:
            java.lang.String r1 = "a_cn"
            java.lang.String r2 = android.os.Build.VERSION.CODENAME     // Catch: java.lang.Exception -> Le4
            r0.put(r1, r2)     // Catch: java.lang.Exception -> Le4
            java.lang.String r1 = "a_intl"
            java.lang.String r2 = android.os.Build.VERSION.INCREMENTAL     // Catch: java.lang.Exception -> Le4
            r0.put(r1, r2)     // Catch: java.lang.Exception -> Le4
        Le4:
            return r0
    }

    public static void a(android.content.Context r11) {
            java.lang.String r0 = "walle"
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L40
            java.lang.String r3 = "[internal] workEvent send envelope"
            r4 = 0
            r2[r4] = r3     // Catch: java.lang.Exception -> L40
            com.umeng.commonsdk.statistics.common.ULog.i(r0, r2)     // Catch: java.lang.Exception -> L40
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: java.lang.Exception -> L40
            r6.<init>()     // Catch: java.lang.Exception -> L40
            java.lang.String r2 = "i_sdk_v"
            java.lang.String r3 = "1.2.0"
            r6.put(r2, r3)     // Catch: java.lang.Exception -> L40
            org.json.JSONObject r7 = d(r11)     // Catch: java.lang.Exception -> L40
            java.lang.String r8 = com.umeng.commonsdk.statistics.UMServerURL.PATH_ANALYTICS     // Catch: java.lang.Exception -> L40
            java.lang.String r9 = "i"
            java.lang.String r10 = "1.2.0"
            r5 = r11
            org.json.JSONObject r11 = com.umeng.commonsdk.framework.UMEnvelopeBuild.buildEnvelopeWithExtHeader(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Exception -> L3c
            if (r11 == 0) goto L3f
            java.lang.String r2 = "exception"
            boolean r11 = r11.has(r2)     // Catch: java.lang.Exception -> L3c
            if (r11 != 0) goto L3f
            java.lang.Object[] r11 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L3c
            java.lang.String r1 = "[internal] workEvent send envelope back, result is ok"
            r11[r4] = r1     // Catch: java.lang.Exception -> L3c
            com.umeng.commonsdk.statistics.common.ULog.i(r0, r11)     // Catch: java.lang.Exception -> L3c
            return
        L3c:
            r0 = move-exception
        L3d:
            r11 = r0
            goto L43
        L3f:
            return
        L40:
            r0 = move-exception
            r5 = r11
            goto L3d
        L43:
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r5, r11)
            return
    }

    private static void a(android.content.Context r2, org.json.JSONObject r3) {
            if (r2 == 0) goto L4e
            android.content.Context r2 = r2.getApplicationContext()
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)
            android.content.pm.PackageManager r2 = r2.getPackageManager()
            if (r2 == 0) goto L4e
            if (r3 != 0) goto L17
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
        L17:
            java.lang.String r0 = "android.hardware.location.gps"
            boolean r0 = r2.hasSystemFeature(r0)
            java.lang.String r1 = "gp"
            a(r3, r1, r0)
            java.lang.String r0 = "android.hardware.touchscreen"
            boolean r0 = r2.hasSystemFeature(r0)
            java.lang.String r1 = "to"
            a(r3, r1, r0)
            java.lang.String r0 = "android.hardware.telephony"
            boolean r0 = r2.hasSystemFeature(r0)
            java.lang.String r1 = "mo"
            a(r3, r1, r0)
            java.lang.String r0 = "android.hardware.camera"
            boolean r0 = r2.hasSystemFeature(r0)
            java.lang.String r1 = "ca"
            a(r3, r1, r0)
            java.lang.String r0 = "android.hardware.camera.flash"
            boolean r2 = r2.hasSystemFeature(r0)
            java.lang.String r0 = "fl"
            a(r3, r0, r2)
        L4e:
            return
    }

    private static void a(org.json.JSONObject r1, java.lang.String r2, boolean r3) {
            if (r1 == 0) goto L13
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L13
            if (r3 == 0) goto Lf
            r3 = 1
            r1.put(r2, r3)     // Catch: java.lang.Exception -> L13
            return
        Lf:
            r3 = 0
            r1.put(r2, r3)     // Catch: java.lang.Exception -> L13
        L13:
            return
    }

    private static org.json.JSONObject b() {
            java.lang.String r0 = "rev"
            r1 = 0
            com.umeng.commonsdk.internal.utils.d$a r2 = com.umeng.commonsdk.internal.utils.d.a()     // Catch: java.lang.Exception -> L85
            if (r2 == 0) goto L85
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Exception -> L85
            r3.<init>()     // Catch: java.lang.Exception -> L85
            java.lang.String r1 = "pro"
            java.lang.String r4 = r2.a     // Catch: java.lang.Exception -> L83
            r3.put(r1, r4)     // Catch: java.lang.Exception -> L83
            java.lang.String r1 = "pla"
            java.lang.String r4 = r2.b     // Catch: java.lang.Exception -> L83
            r3.put(r1, r4)     // Catch: java.lang.Exception -> L83
            java.lang.String r1 = "cpus"
            int r4 = r2.c     // Catch: java.lang.Exception -> L83
            r3.put(r1, r4)     // Catch: java.lang.Exception -> L83
            java.lang.String r1 = "fea"
            java.lang.String r4 = r2.d     // Catch: java.lang.Exception -> L83
            r3.put(r1, r4)     // Catch: java.lang.Exception -> L83
            java.lang.String r1 = "imp"
            java.lang.String r4 = r2.e     // Catch: java.lang.Exception -> L83
            r3.put(r1, r4)     // Catch: java.lang.Exception -> L83
            java.lang.String r1 = "arc"
            java.lang.String r4 = r2.f     // Catch: java.lang.Exception -> L83
            r3.put(r1, r4)     // Catch: java.lang.Exception -> L83
            java.lang.String r1 = "var"
            java.lang.String r4 = r2.g     // Catch: java.lang.Exception -> L83
            r3.put(r1, r4)     // Catch: java.lang.Exception -> L83
            java.lang.String r1 = "par"
            java.lang.String r4 = r2.h     // Catch: java.lang.Exception -> L83
            r3.put(r1, r4)     // Catch: java.lang.Exception -> L83
            java.lang.String r1 = r2.i     // Catch: java.lang.Exception -> L83
            r3.put(r0, r1)     // Catch: java.lang.Exception -> L83
            java.lang.String r1 = "har"
            java.lang.String r4 = r2.j     // Catch: java.lang.Exception -> L83
            r3.put(r1, r4)     // Catch: java.lang.Exception -> L83
            java.lang.String r1 = r2.k     // Catch: java.lang.Exception -> L83
            r3.put(r0, r1)     // Catch: java.lang.Exception -> L83
            java.lang.String r0 = "ser"
            java.lang.String r1 = r2.l     // Catch: java.lang.Exception -> L83
            r3.put(r0, r1)     // Catch: java.lang.Exception -> L83
            java.lang.String r0 = "cur_cpu"
            java.lang.String r1 = com.umeng.commonsdk.internal.utils.d.d()     // Catch: java.lang.Exception -> L83
            r3.put(r0, r1)     // Catch: java.lang.Exception -> L83
            java.lang.String r0 = "max_cpu"
            java.lang.String r1 = com.umeng.commonsdk.internal.utils.d.b()     // Catch: java.lang.Exception -> L83
            r3.put(r0, r1)     // Catch: java.lang.Exception -> L83
            java.lang.String r0 = "min_cpu"
            java.lang.String r1 = com.umeng.commonsdk.internal.utils.d.c()     // Catch: java.lang.Exception -> L83
            r3.put(r0, r1)     // Catch: java.lang.Exception -> L83
            java.lang.String r0 = "ts"
            long r1 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L83
            r3.put(r0, r1)     // Catch: java.lang.Exception -> L83
            return r3
        L83:
            r1 = r3
        L85:
            return r1
    }

    public static void b(android.content.Context r3) {
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "[internal] begin by stateful--->>>"
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = "walle"
            com.umeng.commonsdk.statistics.common.ULog.i(r1, r0)
            if (r3 == 0) goto L12
            j(r3)
        L12:
            return
    }

    private static void b(android.content.Context r4, org.json.JSONObject r5) {
            java.lang.String r0 = "_dsk_s"
            java.lang.String r1 = "_thm_z"
            java.lang.String r2 = "_gdf_r"
            if (r4 == 0) goto L45
            java.lang.String r4 = com.umeng.commonsdk.internal.utils.k.a(r4)
            boolean r3 = android.text.TextUtils.isEmpty(r4)
            if (r3 != 0) goto L45
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Exception -> L45
            r3.<init>(r4)     // Catch: java.lang.Exception -> L45
            if (r5 != 0) goto L1e
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Exception -> L45
            r5.<init>()     // Catch: java.lang.Exception -> L45
        L1e:
            boolean r4 = r3.has(r2)     // Catch: java.lang.Exception -> L45
            if (r4 == 0) goto L2b
            java.lang.Object r4 = r3.opt(r2)     // Catch: java.lang.Exception -> L45
            r5.put(r2, r4)     // Catch: java.lang.Exception -> L45
        L2b:
            boolean r4 = r3.has(r1)     // Catch: java.lang.Exception -> L45
            if (r4 == 0) goto L38
            java.lang.Object r4 = r3.opt(r1)     // Catch: java.lang.Exception -> L45
            r5.put(r1, r4)     // Catch: java.lang.Exception -> L45
        L38:
            boolean r4 = r3.has(r0)     // Catch: java.lang.Exception -> L45
            if (r4 == 0) goto L45
            java.lang.Object r4 = r3.opt(r0)     // Catch: java.lang.Exception -> L45
            r5.put(r0, r4)     // Catch: java.lang.Exception -> L45
        L45:
            return
    }

    public static void c(android.content.Context r3) {
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "[internal] begin by stateful--->>>"
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = "walle"
            com.umeng.commonsdk.statistics.common.ULog.i(r1, r0)
            if (r3 == 0) goto L19
            boolean r0 = com.umeng.commonsdk.framework.UMEnvelopeBuild.getTransmissionSendFlag()
            if (r0 != 0) goto L16
            goto L19
        L16:
            j(r3)
        L19:
            return
    }

    public static org.json.JSONObject d(android.content.Context r4) {
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            if (r4 == 0) goto L117
            android.content.Context r4 = r4.getApplicationContext()
            android.content.Context r4 = com.stub.StubApp.getOrigApplicationContext(r4)
            java.lang.String r2 = "inner_rs"
            boolean r2 = com.umeng.commonsdk.config.FieldManager.allow(r2)     // Catch: java.lang.Exception -> L2e
            if (r2 == 0) goto L32
            org.json.JSONArray r2 = k(r4)     // Catch: java.lang.Exception -> L2e
            if (r2 == 0) goto L32
            int r3 = r2.length()     // Catch: java.lang.Exception -> L2e
            if (r3 <= 0) goto L32
            java.lang.String r3 = "rs"
            r1.put(r3, r2)     // Catch: java.lang.Exception -> L2e
            goto L32
        L2e:
            r2 = move-exception
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r4, r2)
        L32:
            java.lang.String r2 = "inner_batt2"
            boolean r2 = com.umeng.commonsdk.config.FieldManager.allow(r2)     // Catch: java.lang.Exception -> L4c
            if (r2 == 0) goto L50
            org.json.JSONArray r2 = l(r4)     // Catch: java.lang.Exception -> L4c
            if (r2 == 0) goto L50
            int r3 = r2.length()     // Catch: java.lang.Exception -> L4c
            if (r3 <= 0) goto L50
            java.lang.String r3 = "by"
            r1.put(r3, r2)     // Catch: java.lang.Exception -> L4c
            goto L50
        L4c:
            r2 = move-exception
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r4, r2)
        L50:
            a(r4, r1)     // Catch: java.lang.Exception -> L54
            goto L58
        L54:
            r2 = move-exception
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r4, r2)
        L58:
            b(r4, r1)     // Catch: java.lang.Exception -> L5c
            goto L60
        L5c:
            r2 = move-exception
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r4, r2)
        L60:
            java.lang.String r2 = "inner_build2"
            boolean r2 = com.umeng.commonsdk.config.FieldManager.allow(r2)     // Catch: java.lang.Exception -> L7a
            if (r2 == 0) goto L7e
            org.json.JSONObject r2 = a()     // Catch: java.lang.Exception -> L7a
            if (r2 == 0) goto L7e
            int r3 = r2.length()     // Catch: java.lang.Exception -> L7a
            if (r3 <= 0) goto L7e
            java.lang.String r3 = "build"
            r1.put(r3, r2)     // Catch: java.lang.Exception -> L7a
            goto L7e
        L7a:
            r2 = move-exception
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r4, r2)
        L7e:
            org.json.JSONObject r2 = e(r4)     // Catch: java.lang.Exception -> L90
            if (r2 == 0) goto L94
            int r3 = r2.length()     // Catch: java.lang.Exception -> L90
            if (r3 <= 0) goto L94
            java.lang.String r3 = "scr"
            r1.put(r3, r2)     // Catch: java.lang.Exception -> L90
            goto L94
        L90:
            r2 = move-exception
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r4, r2)
        L94:
            org.json.JSONObject r2 = f(r4)     // Catch: java.lang.Exception -> La6
            if (r2 == 0) goto Laa
            int r3 = r2.length()     // Catch: java.lang.Exception -> La6
            if (r3 <= 0) goto Laa
            java.lang.String r3 = "sinfo"
            r1.put(r3, r2)     // Catch: java.lang.Exception -> La6
            goto Laa
        La6:
            r2 = move-exception
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r4, r2)
        Laa:
            org.json.JSONArray r2 = g(r4)     // Catch: java.lang.Exception -> Lbc
            if (r2 == 0) goto Lc0
            int r3 = r2.length()     // Catch: java.lang.Exception -> Lbc
            if (r3 <= 0) goto Lc0
            java.lang.String r3 = "input"
            r1.put(r3, r2)     // Catch: java.lang.Exception -> Lbc
            goto Lc0
        Lbc:
            r2 = move-exception
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r4, r2)
        Lc0:
            java.lang.String r2 = "inner_appls"
            boolean r2 = com.umeng.commonsdk.config.FieldManager.allow(r2)     // Catch: java.lang.Exception -> Lda
            if (r2 == 0) goto Lde
            org.json.JSONArray r2 = h(r4)     // Catch: java.lang.Exception -> Lda
            if (r2 == 0) goto Lde
            int r3 = r2.length()     // Catch: java.lang.Exception -> Lda
            if (r3 <= 0) goto Lde
            java.lang.String r3 = "appls"
            r1.put(r3, r2)     // Catch: java.lang.Exception -> Lda
            goto Lde
        Lda:
            r2 = move-exception
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r4, r2)
        Lde:
            org.json.JSONObject r2 = i(r4)     // Catch: java.lang.Exception -> Lf0
            if (r2 == 0) goto Lf4
            int r3 = r2.length()     // Catch: java.lang.Exception -> Lf0
            if (r3 <= 0) goto Lf4
            java.lang.String r3 = "mem"
            r1.put(r3, r2)     // Catch: java.lang.Exception -> Lf0
            goto Lf4
        Lf0:
            r2 = move-exception
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r4, r2)
        Lf4:
            java.lang.String r2 = "inner_cpu2"
            boolean r2 = com.umeng.commonsdk.config.FieldManager.allow(r2)     // Catch: java.lang.Exception -> L10d
            if (r2 == 0) goto L10d
            org.json.JSONObject r2 = b()     // Catch: java.lang.Exception -> L10d
            if (r2 == 0) goto L10d
            int r3 = r2.length()     // Catch: java.lang.Exception -> L10d
            if (r3 <= 0) goto L10d
            java.lang.String r3 = "cpu"
            r1.put(r3, r2)     // Catch: java.lang.Exception -> L10d
        L10d:
            java.lang.String r2 = "inner"
            r0.put(r2, r1)     // Catch: org.json.JSONException -> L113
            goto L117
        L113:
            r1 = move-exception
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r4, r1)
        L117:
            return r0
    }

    public static org.json.JSONObject e(android.content.Context r5) {
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            if (r5 == 0) goto L3d
            java.lang.String r1 = "a_st_h"
            int r2 = com.umeng.commonsdk.internal.utils.a.c(r5)     // Catch: java.lang.Exception -> L39
            r0.put(r1, r2)     // Catch: java.lang.Exception -> L39
            java.lang.String r1 = "a_nav_h"
            int r2 = com.umeng.commonsdk.internal.utils.a.d(r5)     // Catch: java.lang.Exception -> L39
            r0.put(r1, r2)     // Catch: java.lang.Exception -> L39
            android.content.res.Resources r1 = r5.getResources()     // Catch: java.lang.Exception -> L39
            if (r1 == 0) goto L3d
            android.content.res.Resources r1 = r5.getResources()     // Catch: java.lang.Exception -> L39
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()     // Catch: java.lang.Exception -> L39
            if (r1 == 0) goto L3d
            java.lang.String r2 = "a_den"
            float r3 = r1.density     // Catch: java.lang.Exception -> L39
            double r3 = (double) r3     // Catch: java.lang.Exception -> L39
            r0.put(r2, r3)     // Catch: java.lang.Exception -> L39
            java.lang.String r2 = "a_dpi"
            int r1 = r1.densityDpi     // Catch: java.lang.Exception -> L39
            r0.put(r2, r1)     // Catch: java.lang.Exception -> L39
            return r0
        L39:
            r1 = move-exception
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r5, r1)
        L3d:
            return r0
    }

    public static org.json.JSONObject f(android.content.Context r5) {
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            if (r5 == 0) goto Lac
            android.content.Context r5 = r5.getApplicationContext()
            android.content.Context r5 = com.stub.StubApp.getOrigApplicationContext(r5)
            java.lang.String r1 = r5.getPackageName()
            java.lang.String r2 = "a_fit"
            long r3 = com.umeng.commonsdk.internal.utils.a.a(r5, r1)     // Catch: java.lang.Exception -> L44
            r0.put(r2, r3)     // Catch: java.lang.Exception -> L44
            java.lang.String r2 = "a_alut"
            long r3 = com.umeng.commonsdk.internal.utils.a.b(r5, r1)     // Catch: java.lang.Exception -> L44
            r0.put(r2, r3)     // Catch: java.lang.Exception -> L44
            java.lang.String r2 = "a_c"
            java.lang.String r3 = com.umeng.commonsdk.internal.utils.a.c(r5, r1)     // Catch: java.lang.Exception -> L44
            r0.put(r2, r3)     // Catch: java.lang.Exception -> L44
            java.lang.String r2 = "a_uid"
            int r1 = com.umeng.commonsdk.internal.utils.a.d(r5, r1)     // Catch: java.lang.Exception -> L44
            r0.put(r2, r1)     // Catch: java.lang.Exception -> L44
            boolean r1 = com.umeng.commonsdk.internal.utils.a.a()     // Catch: java.lang.Exception -> L44
            java.lang.String r2 = "a_root"
            if (r1 == 0) goto L46
            r1 = 1
            r0.put(r2, r1)     // Catch: java.lang.Exception -> L44
            goto L4a
        L44:
            r1 = move-exception
            goto La9
        L46:
            r1 = 0
            r0.put(r2, r1)     // Catch: java.lang.Exception -> L44
        L4a:
            java.lang.String r1 = "tf"
            java.lang.String r2 = com.umeng.commonsdk.internal.utils.a.b()     // Catch: java.lang.Exception -> L44
            r0.put(r1, r2)     // Catch: java.lang.Exception -> L44
            java.lang.String r1 = "s_fs"
            float r2 = com.umeng.commonsdk.internal.utils.a.a(r5)     // Catch: java.lang.Exception -> L44
            double r2 = (double) r2     // Catch: java.lang.Exception -> L44
            r0.put(r1, r2)     // Catch: java.lang.Exception -> L44
            java.lang.String r1 = "a_meid"
            java.lang.String r2 = com.umeng.commonsdk.statistics.common.DeviceConfig.getMeid(r5)     // Catch: java.lang.Exception -> L44
            r0.put(r1, r2)     // Catch: java.lang.Exception -> L44
            java.lang.String r1 = "a_imsi"
            java.lang.String r2 = com.umeng.commonsdk.statistics.common.DeviceConfig.getImsi(r5)     // Catch: java.lang.Exception -> L44
            r0.put(r1, r2)     // Catch: java.lang.Exception -> L44
            java.lang.String r1 = "st"
            long r2 = com.umeng.commonsdk.internal.utils.a.c()     // Catch: java.lang.Exception -> L44
            r0.put(r1, r2)     // Catch: java.lang.Exception -> L44
            java.lang.String r1 = com.umeng.commonsdk.statistics.common.DeviceConfig.getSimICCID(r5)     // Catch: java.lang.Exception -> L44
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L44
            if (r2 != 0) goto L87
            java.lang.String r2 = "a_iccid"
            r0.put(r2, r1)     // Catch: java.lang.Exception -> L87
        L87:
            java.lang.String r1 = com.umeng.commonsdk.statistics.common.DeviceConfig.getSecondSimIMEi(r5)     // Catch: java.lang.Exception -> L44
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L44
            if (r2 != 0) goto L96
            java.lang.String r2 = "a_simei"
            r0.put(r2, r1)     // Catch: java.lang.Exception -> L96
        L96:
            java.lang.String r1 = "hn"
            java.lang.String r2 = com.umeng.commonsdk.internal.utils.a.d()     // Catch: java.lang.Exception -> L44
            r0.put(r1, r2)     // Catch: java.lang.Exception -> L44
            java.lang.String r1 = "ts"
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L44
            r0.put(r1, r2)     // Catch: java.lang.Exception -> L44
            goto Lac
        La9:
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r5, r1)
        Lac:
            return r0
    }

    public static org.json.JSONArray g(android.content.Context r6) {
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            if (r6 == 0) goto L4e
            android.content.Context r6 = r6.getApplicationContext()
            android.content.Context r6 = com.stub.StubApp.getOrigApplicationContext(r6)
            java.util.List r1 = com.umeng.commonsdk.internal.utils.a.f(r6)
            if (r1 == 0) goto L4e
            java.util.Iterator r1 = r1.iterator()
        L19:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L4e
            java.lang.Object r2 = r1.next()
            android.view.inputmethod.InputMethodInfo r2 = (android.view.inputmethod.InputMethodInfo) r2
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L49
            r3.<init>()     // Catch: java.lang.Throwable -> L49
            java.lang.String r4 = "a_id"
            java.lang.String r5 = r2.getId()     // Catch: java.lang.Throwable -> L49
            r3.put(r4, r5)     // Catch: java.lang.Throwable -> L49
            java.lang.String r4 = "a_pn"
            java.lang.String r2 = r2.getPackageName()     // Catch: java.lang.Throwable -> L49
            r3.put(r4, r2)     // Catch: java.lang.Throwable -> L49
            java.lang.String r2 = "ts"
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L49
            r3.put(r2, r4)     // Catch: java.lang.Throwable -> L49
            r0.put(r3)     // Catch: java.lang.Throwable -> L49
            goto L19
        L49:
            r2 = move-exception
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r6, r2)
            goto L19
        L4e:
            return r0
    }

    public static org.json.JSONArray h(android.content.Context r6) {
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            if (r6 == 0) goto L52
            android.content.Context r6 = r6.getApplicationContext()
            android.content.Context r6 = com.stub.StubApp.getOrigApplicationContext(r6)
            java.util.List r1 = com.umeng.commonsdk.internal.utils.a.g(r6)
            if (r1 == 0) goto L52
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L52
            java.util.Iterator r1 = r1.iterator()
        L1f:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L52
            java.lang.Object r2 = r1.next()
            com.umeng.commonsdk.internal.utils.a$a r2 = (com.umeng.commonsdk.internal.utils.a.C0049a) r2
            if (r2 == 0) goto L1f
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Exception -> L4d
            r3.<init>()     // Catch: java.lang.Exception -> L4d
            java.lang.String r4 = "a_pn"
            java.lang.String r5 = r2.a     // Catch: java.lang.Exception -> L4d
            r3.put(r4, r5)     // Catch: java.lang.Exception -> L4d
            java.lang.String r4 = "a_la"
            java.lang.String r2 = r2.b     // Catch: java.lang.Exception -> L4d
            r3.put(r4, r2)     // Catch: java.lang.Exception -> L4d
            java.lang.String r2 = "ts"
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L4d
            r3.put(r2, r4)     // Catch: java.lang.Exception -> L4d
            r0.put(r3)     // Catch: java.lang.Exception -> L4d
            goto L1f
        L4d:
            r2 = move-exception
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r6, r2)
            goto L1f
        L52:
            return r0
    }

    public static org.json.JSONObject i(android.content.Context r5) {
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            if (r5 == 0) goto L31
            android.content.Context r5 = r5.getApplicationContext()
            android.content.Context r5 = com.stub.StubApp.getOrigApplicationContext(r5)
            android.app.ActivityManager$MemoryInfo r1 = com.umeng.commonsdk.internal.utils.a.h(r5)
            if (r1 == 0) goto L31
            java.lang.String r2 = "t"
            long r3 = r1.totalMem     // Catch: java.lang.Exception -> L2d
            r0.put(r2, r3)     // Catch: java.lang.Exception -> L2d
            java.lang.String r2 = "f"
            long r3 = r1.availMem     // Catch: java.lang.Exception -> L2d
            r0.put(r2, r3)     // Catch: java.lang.Exception -> L2d
            java.lang.String r1 = "ts"
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L2d
            r0.put(r1, r2)     // Catch: java.lang.Exception -> L2d
            return r0
        L2d:
            r1 = move-exception
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r5, r1)
        L31:
            return r0
    }

    private static void j(android.content.Context r13) {
            com.umeng.commonsdk.framework.UMLogDataProtocol$UMBusinessType r0 = com.umeng.commonsdk.framework.UMLogDataProtocol.UMBusinessType.U_INTERNAL     // Catch: java.lang.Throwable -> L1e
            boolean r0 = com.umeng.commonsdk.framework.UMEnvelopeBuild.isReadyBuild(r13, r0)     // Catch: java.lang.Throwable -> L1e
            if (r0 == 0) goto L21
            com.umeng.commonsdk.internal.b r0 = com.umeng.commonsdk.internal.b.a(r13)     // Catch: java.lang.Throwable -> L1e
            com.umeng.commonsdk.internal.c r3 = r0.a()     // Catch: java.lang.Throwable -> L1e
            r4 = 0
            r5 = 5000(0x1388, double:2.4703E-320)
            r2 = 32769(0x8001, float:4.5919E-41)
            r1 = r13
            com.umeng.commonsdk.framework.UMWorkDispatch.sendEvent(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L1b
            goto L22
        L1b:
            r0 = move-exception
        L1c:
            r13 = r0
            goto L3f
        L1e:
            r0 = move-exception
            r1 = r13
            goto L1c
        L21:
            r1 = r13
        L22:
            java.lang.String r13 = "MobclickRT"
            java.lang.String r0 = "--->>> 冷启动：5秒后触发2号数据仓遗留信封检查动作。"
            com.umeng.commonsdk.debug.UMRTLog.e(r13, r0)     // Catch: java.lang.Throwable -> L1b
            com.umeng.commonsdk.internal.b r13 = com.umeng.commonsdk.internal.b.a(r1)     // Catch: java.lang.Throwable -> L1b
            com.umeng.commonsdk.internal.c r9 = r13.a()     // Catch: java.lang.Throwable -> L1b
            r10 = 0
            r11 = 5000(0x1388, double:2.4703E-320)
            r8 = 32787(0x8013, float:4.5944E-41)
            r7 = r1
            com.umeng.commonsdk.framework.UMWorkDispatch.sendEvent(r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L3c
            return
        L3c:
            r0 = move-exception
            r1 = r7
            goto L1c
        L3f:
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r1, r13)
            return
    }

    private static org.json.JSONArray k(android.content.Context r7) {
            r0 = 0
            if (r7 == 0) goto Lc7
            android.content.Context r1 = r7.getApplicationContext()     // Catch: java.lang.Throwable -> L8f
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)     // Catch: java.lang.Throwable -> L8f
            java.lang.String r2 = "activity"
            java.lang.Object r1 = r1.getSystemService(r2)     // Catch: java.lang.Throwable -> L8f
            android.app.ActivityManager r1 = (android.app.ActivityManager) r1     // Catch: java.lang.Throwable -> L8f
            if (r1 == 0) goto Lc7
            r2 = 2147483647(0x7fffffff, float:NaN)
            java.util.List r1 = r1.getRunningServices(r2)     // Catch: java.lang.Throwable -> L8f
            if (r1 == 0) goto Lc7
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Throwable -> L8f
            if (r2 != 0) goto Lc7
            r2 = 0
        L25:
            int r3 = r1.size()     // Catch: java.lang.Throwable -> L8f
            if (r2 >= r3) goto L97
            java.lang.Object r3 = r1.get(r2)     // Catch: java.lang.Throwable -> L8f
            if (r3 == 0) goto L94
            java.lang.Object r3 = r1.get(r2)     // Catch: java.lang.Throwable -> L8f
            android.app.ActivityManager$RunningServiceInfo r3 = (android.app.ActivityManager.RunningServiceInfo) r3     // Catch: java.lang.Throwable -> L8f
            android.content.ComponentName r3 = r3.service     // Catch: java.lang.Throwable -> L8f
            if (r3 == 0) goto L94
            java.lang.Object r3 = r1.get(r2)     // Catch: java.lang.Throwable -> L8f
            android.app.ActivityManager$RunningServiceInfo r3 = (android.app.ActivityManager.RunningServiceInfo) r3     // Catch: java.lang.Throwable -> L8f
            android.content.ComponentName r3 = r3.service     // Catch: java.lang.Throwable -> L8f
            java.lang.String r3 = r3.getClassName()     // Catch: java.lang.Throwable -> L8f
            if (r3 == 0) goto L94
            java.lang.Object r3 = r1.get(r2)     // Catch: java.lang.Throwable -> L8f
            android.app.ActivityManager$RunningServiceInfo r3 = (android.app.ActivityManager.RunningServiceInfo) r3     // Catch: java.lang.Throwable -> L8f
            android.content.ComponentName r3 = r3.service     // Catch: java.lang.Throwable -> L8f
            java.lang.String r3 = r3.getPackageName()     // Catch: java.lang.Throwable -> L8f
            if (r3 == 0) goto L94
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L8f org.json.JSONException -> L94
            r3.<init>()     // Catch: java.lang.Throwable -> L8f org.json.JSONException -> L94
            java.lang.String r4 = "sn"
            java.lang.Object r5 = r1.get(r2)     // Catch: java.lang.Throwable -> L8f org.json.JSONException -> L94
            android.app.ActivityManager$RunningServiceInfo r5 = (android.app.ActivityManager.RunningServiceInfo) r5     // Catch: java.lang.Throwable -> L8f org.json.JSONException -> L94
            android.content.ComponentName r5 = r5.service     // Catch: java.lang.Throwable -> L8f org.json.JSONException -> L94
            java.lang.String r5 = r5.getClassName()     // Catch: java.lang.Throwable -> L8f org.json.JSONException -> L94
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L8f org.json.JSONException -> L94
            r3.put(r4, r5)     // Catch: java.lang.Throwable -> L8f org.json.JSONException -> L94
            java.lang.String r4 = "pn"
            java.lang.Object r5 = r1.get(r2)     // Catch: java.lang.Throwable -> L8f org.json.JSONException -> L94
            android.app.ActivityManager$RunningServiceInfo r5 = (android.app.ActivityManager.RunningServiceInfo) r5     // Catch: java.lang.Throwable -> L8f org.json.JSONException -> L94
            android.content.ComponentName r5 = r5.service     // Catch: java.lang.Throwable -> L8f org.json.JSONException -> L94
            java.lang.String r5 = r5.getPackageName()     // Catch: java.lang.Throwable -> L8f org.json.JSONException -> L94
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L8f org.json.JSONException -> L94
            r3.put(r4, r5)     // Catch: java.lang.Throwable -> L8f org.json.JSONException -> L94
            if (r0 != 0) goto L91
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L8f org.json.JSONException -> L94
            r4.<init>()     // Catch: java.lang.Throwable -> L8f org.json.JSONException -> L94
            r0 = r4
            goto L91
        L8f:
            r1 = move-exception
            goto Lc4
        L91:
            r0.put(r3)     // Catch: java.lang.Throwable -> L8f org.json.JSONException -> L94
        L94:
            int r2 = r2 + 1
            goto L25
        L97:
            if (r0 == 0) goto Lc7
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L8f
            r1.<init>()     // Catch: java.lang.Throwable -> L8f
            java.lang.String r2 = "ts"
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L8f org.json.JSONException -> Lac
            r1.put(r2, r3)     // Catch: java.lang.Throwable -> L8f org.json.JSONException -> Lac
            java.lang.String r2 = "ls"
            r1.put(r2, r0)     // Catch: java.lang.Throwable -> L8f org.json.JSONException -> Lac
        Lac:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L8f
            r2.<init>()     // Catch: java.lang.Throwable -> L8f
            java.lang.String r3 = "sers"
            r2.put(r3, r1)     // Catch: java.lang.Throwable -> L8f org.json.JSONException -> Lb6
        Lb6:
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L8f
            r1.<init>()     // Catch: java.lang.Throwable -> L8f
            r1.put(r2)     // Catch: java.lang.Throwable -> Lc0
            r0 = r1
            goto Lc7
        Lc0:
            r0 = move-exception
            r6 = r1
            r1 = r0
            r0 = r6
        Lc4:
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r7, r1)
        Lc7:
            return r0
    }

    private static org.json.JSONArray l(android.content.Context r2) {
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            java.lang.String r2 = com.umeng.commonsdk.internal.utils.j.a(r2)
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 != 0) goto L17
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> L17
            r1.<init>(r2)     // Catch: java.lang.Exception -> L17
            r0.put(r1)     // Catch: java.lang.Exception -> L17
        L17:
            return r0
    }
}
