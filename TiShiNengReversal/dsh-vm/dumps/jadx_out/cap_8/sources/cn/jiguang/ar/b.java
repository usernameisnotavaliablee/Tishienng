package cn.jiguang.ar;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class b {
    public b() {
            r1 = this;
            r1.<init>()
            return
    }

    private static android.os.StatFs a(java.io.File r3, android.content.Context r4) {
            boolean r0 = cn.jiguang.av.a.d()
            r1 = 0
            java.lang.String r2 = "SentryUtils"
            if (r0 == 0) goto L1f
            java.io.File r3 = b(r3, r4)
            if (r3 == 0) goto L19
            android.os.StatFs r4 = new android.os.StatFs
            java.lang.String r3 = r3.getPath()
            r4.<init>(r3)
            return r4
        L19:
            java.lang.String r3 = "Not possible to read external files directory"
        L1b:
            cn.jiguang.w.f.f(r2, r3)
            return r1
        L1f:
            java.lang.String r3 = "External storage is not mounted or emulated."
            goto L1b
    }

    private static java.lang.Float a(android.content.Intent r4) {
            r0 = 0
            java.lang.String r1 = "level"
            r2 = -1
            int r1 = r4.getIntExtra(r1, r2)     // Catch: java.lang.Exception -> L1f
            java.lang.String r3 = "scale"
            int r4 = r4.getIntExtra(r3, r2)     // Catch: java.lang.Exception -> L1f
            if (r1 == r2) goto L21
            if (r4 != r2) goto L13
            goto L21
        L13:
            float r1 = (float) r1     // Catch: java.lang.Exception -> L1f
            float r4 = (float) r4     // Catch: java.lang.Exception -> L1f
            float r1 = r1 / r4
            r4 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 * r4
            java.lang.Float r4 = java.lang.Float.valueOf(r1)     // Catch: java.lang.Exception -> L1f
            return r4
        L1f:
            r4 = move-exception
            goto L22
        L21:
            return r0
        L22:
            java.lang.String r1 = "SentryUtils"
            java.lang.String r2 = "Error getting device battery level."
            cn.jiguang.w.f.a(r1, r2, r4)
            return r0
    }

    private static java.lang.Long a(android.app.ActivityManager.MemoryInfo r2) {
            long r0 = r2.totalMem
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            return r2
    }

    private static java.lang.Long a(android.os.StatFs r4) {
            long r0 = b(r4)     // Catch: java.lang.Exception -> Lf
            long r2 = d(r4)     // Catch: java.lang.Exception -> Lf
            long r2 = r2 * r0
            java.lang.Long r4 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Exception -> Lf
            return r4
        Lf:
            r4 = move-exception
            java.lang.String r0 = "SentryUtils"
            java.lang.String r1 = "Error getting total internal storage amount."
            cn.jiguang.w.f.a(r0, r1, r4)
            r4 = 0
            return r4
    }

    public static java.lang.String a(java.lang.String r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            java.lang.String r1 = ""
            if (r0 == 0) goto L9
            return r1
        L9:
            java.lang.String r0 = "cn.jpush.im"
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L14
            java.lang.String r2 = "JMessage"
            return r2
        L14:
            java.lang.String r0 = "cn.jiguang.analytics"
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L1f
            java.lang.String r2 = "JAnalysis"
            return r2
        L1f:
            java.lang.String r0 = "cn.jiguang.share"
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L2a
            java.lang.String r2 = "JShare"
            return r2
        L2a:
            java.lang.String r0 = "cn.jiguang.union.ads"
            boolean r0 = r2.contains(r0)
            if (r0 != 0) goto L90
            java.lang.String r0 = "cn.jiguang.ads"
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L3b
            goto L90
        L3b:
            java.lang.String r0 = "cn.jiguang.verifysdk"
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L46
            java.lang.String r2 = "JVerification"
            return r2
        L46:
            java.lang.String r0 = "cn.jiguang.jmlinksdk"
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L51
            java.lang.String r2 = "JMlink"
            return r2
        L51:
            java.lang.String r0 = "cn.jiguang.junion"
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L5c
            java.lang.String r2 = "JUnion"
            return r2
        L5c:
            java.lang.String r0 = "cn.jiguang.portrait"
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L67
            java.lang.String r2 = "JPortrait"
            return r2
        L67:
            java.lang.String r0 = "cn.jpush.android"
            boolean r0 = r2.contains(r0)
            if (r0 != 0) goto L8d
            java.lang.String r0 = "cn.jpush"
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L78
            goto L8d
        L78:
            java.lang.String r0 = "cn.jiguang.common"
            boolean r0 = r2.contains(r0)
            if (r0 != 0) goto L8a
            java.lang.String r0 = "cn.jiguang"
            boolean r2 = r2.contains(r0)
            if (r2 == 0) goto L89
            goto L8a
        L89:
            return r1
        L8a:
            java.lang.String r2 = "JCore"
            return r2
        L8d:
            java.lang.String r2 = "JPush"
            return r2
        L90:
            java.lang.String r2 = "JAd"
            return r2
    }

    public static org.json.JSONObject a() {
            java.lang.String r0 = "5.0.1"
            java.lang.String r1 = "version"
            java.lang.String r2 = "name"
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: org.json.JSONException -> L3f
            r3.<init>()     // Catch: org.json.JSONException -> L3f
            java.lang.String r4 = "sentry.java.android"
            r3.put(r2, r4)     // Catch: org.json.JSONException -> L3f
            r3.put(r1, r0)     // Catch: org.json.JSONException -> L3f
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch: org.json.JSONException -> L3f
            r4.<init>()     // Catch: org.json.JSONException -> L3f
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: org.json.JSONException -> L3f
            r5.<init>()     // Catch: org.json.JSONException -> L3f
            java.lang.String r6 = "maven:io.sentry:sentry"
            r5.put(r2, r6)     // Catch: org.json.JSONException -> L3f
            r5.put(r1, r0)     // Catch: org.json.JSONException -> L3f
            r4.put(r5)     // Catch: org.json.JSONException -> L3f
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: org.json.JSONException -> L3f
            r5.<init>()     // Catch: org.json.JSONException -> L3f
            java.lang.String r6 = "maven:io.sentry:sentry-android-core"
            r5.put(r2, r6)     // Catch: org.json.JSONException -> L3f
            r5.put(r1, r0)     // Catch: org.json.JSONException -> L3f
            r4.put(r5)     // Catch: org.json.JSONException -> L3f
            java.lang.String r0 = "packages"
            r3.put(r0, r4)     // Catch: org.json.JSONException -> L3f
            return r3
        L3f:
            r0 = move-exception
            java.lang.String r1 = "SentryUtils"
            java.lang.String r2 = "Error getting SDK version."
            cn.jiguang.w.f.a(r1, r2, r0)
            r0 = 0
            return r0
    }

    public static org.json.JSONObject a(android.content.Context r5) {
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L3b
            r0.<init>()     // Catch: org.json.JSONException -> L3b
            android.util.Pair r1 = cn.jiguang.v.a.d(r5)     // Catch: org.json.JSONException -> L3b
            java.lang.String r2 = "app_build"
            java.lang.Object r3 = r1.second     // Catch: org.json.JSONException -> L3b
            java.lang.Long r3 = (java.lang.Long) r3     // Catch: org.json.JSONException -> L3b
            long r3 = r3.longValue()     // Catch: org.json.JSONException -> L3b
            java.lang.String r3 = java.lang.Long.toString(r3)     // Catch: org.json.JSONException -> L3b
            r0.put(r2, r3)     // Catch: org.json.JSONException -> L3b
            java.lang.String r2 = "app_identifier"
            java.lang.String r3 = cn.jiguang.av.o.a(r5)     // Catch: org.json.JSONException -> L3b
            r0.put(r2, r3)     // Catch: org.json.JSONException -> L3b
            java.lang.String r2 = "app_name"
            java.lang.String r5 = cn.jiguang.av.a.i(r5)     // Catch: org.json.JSONException -> L3b
            r0.put(r2, r5)     // Catch: org.json.JSONException -> L3b
            java.lang.String r5 = "app_start_time"
            java.util.Date r2 = cn.jiguang.a.a.f242i     // Catch: org.json.JSONException -> L3b
            r0.put(r5, r2)     // Catch: org.json.JSONException -> L3b
            java.lang.String r5 = "app_version"
            java.lang.Object r1 = r1.first     // Catch: org.json.JSONException -> L3b
            r0.put(r5, r1)     // Catch: org.json.JSONException -> L3b
            return r0
        L3b:
            r5 = move-exception
            java.lang.String r0 = "SentryUtils"
            java.lang.String r1 = "Error getting App."
            cn.jiguang.w.f.a(r0, r1, r5)
            r5 = 0
            return r5
    }

    private static long b(android.os.StatFs r2) {
            long r0 = r2.getBlockSizeLong()
            return r0
    }

    private static java.io.File b(java.io.File r5, android.content.Context r6) {
            java.io.File[] r6 = j(r6)
            r0 = 0
            if (r6 == 0) goto L2f
            if (r5 == 0) goto Le
            java.lang.String r5 = r5.getAbsolutePath()
            goto Lf
        Le:
            r5 = r0
        Lf:
            int r1 = r6.length
            r2 = 0
        L11:
            if (r2 >= r1) goto L36
            r3 = r6[r2]
            if (r3 != 0) goto L18
            goto L2b
        L18:
            if (r5 == 0) goto L2e
            boolean r4 = r5.isEmpty()
            if (r4 == 0) goto L21
            goto L2e
        L21:
            java.lang.String r4 = r3.getAbsolutePath()
            boolean r4 = r4.contains(r5)
            if (r4 == 0) goto L2e
        L2b:
            int r2 = r2 + 1
            goto L11
        L2e:
            return r3
        L2f:
            java.lang.String r5 = "SentryUtils"
            java.lang.String r6 = "Not possible to read getExternalFilesDirs"
            cn.jiguang.w.f.f(r5, r6)
        L36:
            return r0
    }

    private static java.lang.Boolean b(android.content.Intent r2) {
            java.lang.String r0 = "plugged"
            r1 = -1
            int r2 = r2.getIntExtra(r0, r1)     // Catch: java.lang.Exception -> L14
            r0 = 1
            if (r2 == r0) goto Lf
            r1 = 2
            if (r2 != r1) goto Le
            goto Lf
        Le:
            r0 = 0
        Lf:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Exception -> L14
            return r2
        L14:
            r2 = move-exception
            java.lang.String r0 = "SentryUtils"
            java.lang.String r1 = "Error getting device charging state."
            cn.jiguang.w.f.a(r0, r1, r2)
            r2 = 0
            return r2
    }

    private static java.lang.String b() {
            java.lang.String r0 = android.os.Build.CPU_ABI
            return r0
    }

    public static org.json.JSONObject b(android.content.Context r4) {
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L28
            r0.<init>()     // Catch: org.json.JSONException -> L28
            java.lang.String r1 = cn.jiguang.v.a.a(r4)     // Catch: org.json.JSONException -> L28
            java.lang.String r4 = cn.jiguang.d.a.b(r4)     // Catch: org.json.JSONException -> L28
            java.lang.String r2 = "id"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: org.json.JSONException -> L28
            r3.<init>()     // Catch: org.json.JSONException -> L28
            r3.append(r1)     // Catch: org.json.JSONException -> L28
            java.lang.String r1 = "|"
            r3.append(r1)     // Catch: org.json.JSONException -> L28
            r3.append(r4)     // Catch: org.json.JSONException -> L28
            java.lang.String r4 = r3.toString()     // Catch: org.json.JSONException -> L28
            r0.put(r2, r4)     // Catch: org.json.JSONException -> L28
            return r0
        L28:
            r4 = move-exception
            java.lang.String r0 = "SentryUtils"
            java.lang.String r1 = "Error getting user."
            cn.jiguang.w.f.a(r0, r1, r4)
            r4 = 0
            return r4
    }

    private static int c(android.os.StatFs r0) {
            int r0 = r0.getBlockSize()
            return r0
    }

    private static java.lang.Float c(android.content.Intent r2) {
            java.lang.String r0 = "temperature"
            r1 = -1
            int r2 = r2.getIntExtra(r0, r1)     // Catch: java.lang.Exception -> L12
            if (r2 == r1) goto L1a
            float r2 = (float) r2     // Catch: java.lang.Exception -> L12
            r0 = 1092616192(0x41200000, float:10.0)
            float r2 = r2 / r0
            java.lang.Float r2 = java.lang.Float.valueOf(r2)     // Catch: java.lang.Exception -> L12
            return r2
        L12:
            r2 = move-exception
            java.lang.String r0 = "SentryUtils"
            java.lang.String r1 = "Error getting battery temperature."
            cn.jiguang.w.f.a(r0, r1, r2)
        L1a:
            r2 = 0
            return r2
    }

    private static java.lang.String c() {
            java.lang.String r0 = android.os.Build.CPU_ABI2
            return r0
    }

    public static org.json.JSONObject c(android.content.Context r6) {
            r0 = 0
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L18
            r1.<init>()     // Catch: org.json.JSONException -> L18
            r2 = 1005(0x3ed, float:1.408E-42)
            boolean r2 = cn.jiguang.f.b.c(r2)     // Catch: org.json.JSONException -> L18
            if (r2 == 0) goto L1b
            java.lang.String r2 = "archs"
            org.json.JSONArray r3 = d()     // Catch: org.json.JSONException -> L18
            r1.put(r2, r3)     // Catch: org.json.JSONException -> L18
            goto L1b
        L18:
            r6 = move-exception
            goto L170
        L1b:
            java.lang.String r2 = "name"
            java.lang.String r3 = cn.jiguang.av.a.y(r6)     // Catch: org.json.JSONException -> L18
            r1.put(r2, r3)     // Catch: org.json.JSONException -> L18
            java.lang.String r2 = "manufacturer"
            cn.jiguang.av.a r3 = cn.jiguang.av.a.a()     // Catch: org.json.JSONException -> L18
            java.lang.String r3 = r3.u(r6)     // Catch: org.json.JSONException -> L18
            r1.put(r2, r3)     // Catch: org.json.JSONException -> L18
            java.lang.String r2 = "brand"
            cn.jiguang.av.a r3 = cn.jiguang.av.a.a()     // Catch: org.json.JSONException -> L18
            java.lang.String r3 = r3.s(r6)     // Catch: org.json.JSONException -> L18
            r1.put(r2, r3)     // Catch: org.json.JSONException -> L18
            java.lang.String r2 = "family"
            java.lang.String r3 = g(r6)     // Catch: org.json.JSONException -> L18
            r1.put(r2, r3)     // Catch: org.json.JSONException -> L18
            java.lang.String r2 = "model"
            cn.jiguang.av.a r3 = cn.jiguang.av.a.a()     // Catch: org.json.JSONException -> L18
            java.lang.String r3 = r3.r(r6)     // Catch: org.json.JSONException -> L18
            r1.put(r2, r3)     // Catch: org.json.JSONException -> L18
            java.lang.String r2 = "model_id"
            java.lang.String r3 = android.os.Build.ID     // Catch: org.json.JSONException -> L18
            r1.put(r2, r3)     // Catch: org.json.JSONException -> L18
            android.content.Intent r2 = f(r6)     // Catch: org.json.JSONException -> L18
            if (r2 == 0) goto L7c
            java.lang.String r3 = "battery_level"
            java.lang.Float r4 = a(r2)     // Catch: org.json.JSONException -> L18
            r1.put(r3, r4)     // Catch: org.json.JSONException -> L18
            java.lang.String r3 = "charging"
            java.lang.Boolean r4 = b(r2)     // Catch: org.json.JSONException -> L18
            r1.put(r3, r4)     // Catch: org.json.JSONException -> L18
            java.lang.String r3 = "battery_temperature"
            java.lang.Float r2 = c(r2)     // Catch: org.json.JSONException -> L18
            r1.put(r3, r2)     // Catch: org.json.JSONException -> L18
        L7c:
            java.lang.String r2 = "online"
            boolean r3 = cn.jiguang.av.n.a()     // Catch: org.json.JSONException -> L18
            r1.put(r2, r3)     // Catch: org.json.JSONException -> L18
            java.lang.String r2 = "orientation"
            cn.jiguang.ak.b$a r3 = h(r6)     // Catch: org.json.JSONException -> L18
            r1.put(r2, r3)     // Catch: org.json.JSONException -> L18
            java.lang.String r2 = "simulator"
            java.lang.Boolean r3 = i(r6)     // Catch: org.json.JSONException -> L18
            r1.put(r2, r3)     // Catch: org.json.JSONException -> L18
            r2 = 1016(0x3f8, float:1.424E-42)
            boolean r2 = cn.jiguang.f.b.c(r2)     // Catch: org.json.JSONException -> L18
            if (r2 == 0) goto Lbc
            android.app.ActivityManager$MemoryInfo r2 = e(r6)     // Catch: org.json.JSONException -> L18
            if (r2 == 0) goto Lbc
            java.lang.String r3 = "memory_size"
            java.lang.Long r4 = a(r2)     // Catch: org.json.JSONException -> L18
            r1.put(r3, r4)     // Catch: org.json.JSONException -> L18
            java.lang.String r3 = "free_memory"
            long r4 = r2.availMem     // Catch: org.json.JSONException -> L18
            r1.put(r3, r4)     // Catch: org.json.JSONException -> L18
            java.lang.String r3 = "low_memory"
            boolean r2 = r2.lowMemory     // Catch: org.json.JSONException -> L18
            r1.put(r3, r2)     // Catch: org.json.JSONException -> L18
        Lbc:
            java.io.File r2 = r6.getExternalFilesDir(r0)     // Catch: org.json.JSONException -> L18
            if (r2 == 0) goto Ldd
            android.os.StatFs r3 = new android.os.StatFs     // Catch: org.json.JSONException -> L18
            java.lang.String r4 = r2.getPath()     // Catch: org.json.JSONException -> L18
            r3.<init>(r4)     // Catch: org.json.JSONException -> L18
            java.lang.String r4 = "storage_size"
            java.lang.Long r5 = a(r3)     // Catch: org.json.JSONException -> L18
            r1.put(r4, r5)     // Catch: org.json.JSONException -> L18
            java.lang.String r4 = "free_storage"
            java.lang.Long r3 = h(r3)     // Catch: org.json.JSONException -> L18
            r1.put(r4, r3)     // Catch: org.json.JSONException -> L18
        Ldd:
            r3 = 1018(0x3fa, float:1.427E-42)
            boolean r3 = cn.jiguang.f.b.c(r3)     // Catch: org.json.JSONException -> L18
            if (r3 == 0) goto Lfd
            android.os.StatFs r2 = a(r2, r6)     // Catch: org.json.JSONException -> L18
            if (r2 == 0) goto Lfd
            java.lang.String r3 = "external_storage_size"
            java.lang.Long r4 = i(r2)     // Catch: org.json.JSONException -> L18
            r1.put(r3, r4)     // Catch: org.json.JSONException -> L18
            java.lang.String r3 = "external_free_storage"
            java.lang.Long r2 = j(r2)     // Catch: org.json.JSONException -> L18
            r1.put(r3, r2)     // Catch: org.json.JSONException -> L18
        Lfd:
            cn.jiguang.av.a r2 = cn.jiguang.av.a.a()     // Catch: org.json.JSONException -> L18
            java.lang.String r2 = r2.j(r6)     // Catch: org.json.JSONException -> L18
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: org.json.JSONException -> L18
            if (r3 != 0) goto L121
            java.lang.String r3 = "\\*"
            java.lang.String[] r2 = r2.split(r3)     // Catch: org.json.JSONException -> L18
            java.lang.String r3 = "screen_width_pixels"
            r4 = 0
            r4 = r2[r4]     // Catch: java.lang.Throwable -> L121
            r1.put(r3, r4)     // Catch: java.lang.Throwable -> L121
            java.lang.String r3 = "screen_height_pixels"
            r4 = 1
            r2 = r2[r4]     // Catch: java.lang.Throwable -> L121
            r1.put(r3, r2)     // Catch: java.lang.Throwable -> L121
        L121:
            android.util.DisplayMetrics r2 = k(r6)     // Catch: org.json.JSONException -> L18
            if (r2 == 0) goto L136
            java.lang.String r3 = "screen_density"
            float r4 = r2.density     // Catch: org.json.JSONException -> L18
            double r4 = (double) r4     // Catch: org.json.JSONException -> L18
            r1.put(r3, r4)     // Catch: org.json.JSONException -> L18
            java.lang.String r3 = "screen_dpi"
            int r2 = r2.densityDpi     // Catch: org.json.JSONException -> L18
            r1.put(r3, r2)     // Catch: org.json.JSONException -> L18
        L136:
            java.lang.String r2 = "boot_time"
            cn.jiguang.av.a r3 = cn.jiguang.av.a.a()     // Catch: org.json.JSONException -> L18
            java.lang.String r3 = r3.x(r6)     // Catch: org.json.JSONException -> L18
            r1.put(r2, r3)     // Catch: org.json.JSONException -> L18
            java.lang.String r2 = "timezone"
            cn.jiguang.av.a r3 = cn.jiguang.av.a.a()     // Catch: org.json.JSONException -> L18
            java.lang.String r3 = r3.v(r6)     // Catch: org.json.JSONException -> L18
            r1.put(r2, r3)     // Catch: org.json.JSONException -> L18
            java.lang.String r2 = "id"
            java.lang.String r3 = cn.jiguang.d.a.i(r6)     // Catch: org.json.JSONException -> L18
            r1.put(r2, r3)     // Catch: org.json.JSONException -> L18
            java.lang.String r2 = "language"
            cn.jiguang.av.a r3 = cn.jiguang.av.a.a()     // Catch: org.json.JSONException -> L18
            java.lang.String r6 = r3.t(r6)     // Catch: org.json.JSONException -> L18
            r1.put(r2, r6)     // Catch: org.json.JSONException -> L18
            java.lang.String r6 = "connection_type"
            java.lang.String r2 = cn.jiguang.av.n.c()     // Catch: org.json.JSONException -> L18
            r1.put(r6, r2)     // Catch: org.json.JSONException -> L18
            return r1
        L170:
            java.lang.String r1 = "SentryUtils"
            java.lang.String r2 = "Error getting Device."
            cn.jiguang.w.f.a(r1, r2, r6)
            return r0
    }

    private static long d(android.os.StatFs r2) {
            long r0 = r2.getBlockCountLong()
            return r0
    }

    private static org.json.JSONArray d() {
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            java.lang.String[] r1 = android.os.Build.SUPPORTED_ABIS
            int r2 = r1.length
            r3 = 0
        L9:
            if (r3 >= r2) goto L13
            r4 = r1[r3]
            r0.put(r4)
            int r3 = r3 + 1
            goto L9
        L13:
            return r0
    }

    public static org.json.JSONObject d(android.content.Context r3) {
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L38
            r0.<init>()     // Catch: org.json.JSONException -> L38
            java.lang.String r1 = "build"
            java.lang.String r2 = android.os.Build.DISPLAY     // Catch: org.json.JSONException -> L38
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L38
            java.lang.String r1 = "kernel_version"
            java.lang.String r2 = cn.jiguang.av.a.e()     // Catch: org.json.JSONException -> L38
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L38
            java.lang.String r1 = "name"
            java.lang.String r2 = "Android"
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L38
            java.lang.String r1 = "rooted"
            cn.jiguang.av.a r2 = cn.jiguang.av.a.a()     // Catch: org.json.JSONException -> L38
            boolean r2 = r2.m(r3)     // Catch: org.json.JSONException -> L38
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L38
            java.lang.String r1 = "version"
            cn.jiguang.av.a r2 = cn.jiguang.av.a.a()     // Catch: org.json.JSONException -> L38
            java.lang.String r3 = r2.w(r3)     // Catch: org.json.JSONException -> L38
            r0.put(r1, r3)     // Catch: org.json.JSONException -> L38
            return r0
        L38:
            r3 = move-exception
            java.lang.String r0 = "SentryUtils"
            java.lang.String r1 = "Error getting OperatingSystem."
            cn.jiguang.w.f.a(r0, r1, r3)
            r3 = 0
            return r3
    }

    private static int e(android.os.StatFs r0) {
            int r0 = r0.getBlockCount()
            return r0
    }

    private static android.app.ActivityManager.MemoryInfo e(android.content.Context r4) {
            java.lang.String r0 = "Error getting MemoryInfo."
            java.lang.String r1 = "SentryUtils"
            r2 = 0
            java.lang.String r3 = "activity"
            java.lang.Object r4 = r4.getSystemService(r3)     // Catch: java.lang.Exception -> L18
            android.app.ActivityManager r4 = (android.app.ActivityManager) r4     // Catch: java.lang.Exception -> L18
            android.app.ActivityManager$MemoryInfo r3 = new android.app.ActivityManager$MemoryInfo     // Catch: java.lang.Exception -> L18
            r3.<init>()     // Catch: java.lang.Exception -> L18
            if (r4 == 0) goto L1a
            r4.getMemoryInfo(r3)     // Catch: java.lang.Exception -> L18
            return r3
        L18:
            r4 = move-exception
            goto L1e
        L1a:
            cn.jiguang.w.f.c(r1, r0)     // Catch: java.lang.Exception -> L18
            return r2
        L1e:
            cn.jiguang.w.f.a(r1, r0, r4)
            return r2
    }

    private static long f(android.os.StatFs r2) {
            long r0 = r2.getAvailableBlocksLong()
            return r0
    }

    private static android.content.Intent f(android.content.Context r6) {
            android.content.IntentFilter r2 = new android.content.IntentFilter
            java.lang.String r0 = "android.intent.action.BATTERY_CHANGED"
            r2.<init>(r0)
            r4 = 0
            r5 = 0
            r1 = 0
            r3 = 0
            r0 = r6
            android.content.Intent r6 = cn.jiguang.av.q.a(r0, r1, r2, r3, r4, r5)
            return r6
    }

    private static int g(android.os.StatFs r0) {
            int r0 = r0.getAvailableBlocks()
            return r0
    }

    private static java.lang.String g(android.content.Context r2) {
            cn.jiguang.av.a r0 = cn.jiguang.av.a.a()     // Catch: java.lang.Exception -> L19
            java.lang.String r2 = r0.r(r2)     // Catch: java.lang.Exception -> L19
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> L19
            if (r0 != 0) goto L21
            java.lang.String r0 = " "
            r1 = -1
            java.lang.String[] r2 = r2.split(r0, r1)     // Catch: java.lang.Exception -> L19
            r0 = 0
            r2 = r2[r0]     // Catch: java.lang.Exception -> L19
            return r2
        L19:
            r2 = move-exception
            java.lang.String r0 = "SentryUtils"
            java.lang.String r1 = "Error getting device family."
            cn.jiguang.w.f.a(r0, r1, r2)
        L21:
            r2 = 0
            return r2
    }

    private static cn.jiguang.ak.b.a h(android.content.Context r4) {
            java.lang.String r0 = "SentryUtils"
            r1 = 0
            android.content.res.Resources r4 = r4.getResources()     // Catch: java.lang.Exception -> L1c
            android.content.res.Configuration r4 = r4.getConfiguration()     // Catch: java.lang.Exception -> L1c
            int r4 = r4.orientation     // Catch: java.lang.Exception -> L1c
            cn.jiguang.ak.b$a r4 = cn.jiguang.ak.b.a(r4)     // Catch: java.lang.Exception -> L1c
            if (r4 != 0) goto L1b
            java.lang.String r2 = "No device orientation available (ORIENTATION_SQUARE|ORIENTATION_UNDEFINED)"
            cn.jiguang.w.f.f(r0, r2)     // Catch: java.lang.Exception -> L19
            return r1
        L19:
            r1 = move-exception
            goto L20
        L1b:
            return r4
        L1c:
            r4 = move-exception
            r3 = r1
            r1 = r4
            r4 = r3
        L20:
            java.lang.String r2 = "Error getting device orientation."
            cn.jiguang.w.f.a(r0, r2, r1)
            return r4
    }

    private static java.lang.Long h(android.os.StatFs r4) {
            long r0 = b(r4)     // Catch: java.lang.Exception -> Lf
            long r2 = f(r4)     // Catch: java.lang.Exception -> Lf
            long r2 = r2 * r0
            java.lang.Long r4 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Exception -> Lf
            return r4
        Lf:
            r4 = move-exception
            java.lang.String r0 = "SentryUtils"
            java.lang.String r1 = "Error getting unused internal storage amount."
            cn.jiguang.w.f.a(r0, r1, r4)
            r4 = 0
            return r4
    }

    private static java.lang.Boolean i(android.content.Context r6) {
            java.lang.String r0 = "generic"
            java.lang.String r1 = android.os.Build.BRAND     // Catch: java.lang.Exception -> Ld1
            boolean r1 = r1.startsWith(r0)     // Catch: java.lang.Exception -> Ld1
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L14
            java.lang.String r1 = android.os.Build.DEVICE     // Catch: java.lang.Exception -> Ld1
            boolean r1 = r1.startsWith(r0)     // Catch: java.lang.Exception -> Ld1
            if (r1 != 0) goto L39
        L14:
            java.lang.String r1 = android.os.Build.FINGERPRINT     // Catch: java.lang.Exception -> Ld1
            boolean r0 = r1.startsWith(r0)     // Catch: java.lang.Exception -> Ld1
            if (r0 != 0) goto L39
            java.lang.String r0 = "unknown"
            boolean r0 = r1.startsWith(r0)     // Catch: java.lang.Exception -> Ld1
            if (r0 != 0) goto L39
            java.lang.String r0 = android.os.Build.HARDWARE     // Catch: java.lang.Exception -> Ld1
            java.lang.String r1 = "goldfish"
            boolean r1 = r0.contains(r1)     // Catch: java.lang.Exception -> Ld1
            if (r1 != 0) goto L39
            java.lang.String r1 = "ranchu"
            boolean r0 = r0.contains(r1)     // Catch: java.lang.Exception -> Ld1
            if (r0 == 0) goto L37
            goto L39
        L37:
            r0 = 0
            goto L3a
        L39:
            r0 = 1
        L3a:
            cn.jiguang.av.a r1 = cn.jiguang.av.a.a()     // Catch: java.lang.Exception -> Ld1
            java.lang.String r1 = r1.n(r6)     // Catch: java.lang.Exception -> Ld1
            boolean r4 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> Ld1
            java.lang.String r5 = "google_sdk"
            if (r4 != 0) goto L87
            if (r0 != 0) goto L86
            java.lang.String r0 = "sdk_google"
            boolean r0 = r1.contains(r0)     // Catch: java.lang.Exception -> Ld1
            if (r0 != 0) goto L86
            boolean r0 = r1.contains(r5)     // Catch: java.lang.Exception -> Ld1
            if (r0 != 0) goto L86
            java.lang.String r0 = "sdk"
            boolean r0 = r1.contains(r0)     // Catch: java.lang.Exception -> Ld1
            if (r0 != 0) goto L86
            java.lang.String r0 = "sdk_x86"
            boolean r0 = r1.contains(r0)     // Catch: java.lang.Exception -> Ld1
            if (r0 != 0) goto L86
            java.lang.String r0 = "vbox86p"
            boolean r0 = r1.contains(r0)     // Catch: java.lang.Exception -> Ld1
            if (r0 != 0) goto L86
            java.lang.String r0 = "emulator"
            boolean r0 = r1.contains(r0)     // Catch: java.lang.Exception -> Ld1
            if (r0 != 0) goto L86
            java.lang.String r0 = "simulator"
            boolean r0 = r1.contains(r0)     // Catch: java.lang.Exception -> Ld1
            if (r0 == 0) goto L84
            goto L86
        L84:
            r0 = 0
            goto L87
        L86:
            r0 = 1
        L87:
            cn.jiguang.av.a r1 = cn.jiguang.av.a.a()     // Catch: java.lang.Exception -> Ld1
            java.lang.String r1 = r1.u(r6)     // Catch: java.lang.Exception -> Ld1
            boolean r4 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> Ld1
            if (r4 != 0) goto La3
            if (r0 != 0) goto La2
            java.lang.String r0 = "Genymotion"
            boolean r0 = r1.contains(r0)     // Catch: java.lang.Exception -> Ld1
            if (r0 == 0) goto La0
            goto La2
        La0:
            r0 = 0
            goto La3
        La2:
            r0 = 1
        La3:
            cn.jiguang.av.a r1 = cn.jiguang.av.a.a()     // Catch: java.lang.Exception -> Ld1
            java.lang.String r6 = r1.r(r6)     // Catch: java.lang.Exception -> Ld1
            boolean r1 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Exception -> Ld1
            if (r1 != 0) goto Lcc
            if (r0 != 0) goto Lcb
            boolean r0 = r6.contains(r5)     // Catch: java.lang.Exception -> Ld1
            if (r0 != 0) goto Lcb
            java.lang.String r0 = "Emulator"
            boolean r0 = r6.contains(r0)     // Catch: java.lang.Exception -> Ld1
            if (r0 != 0) goto Lcb
            java.lang.String r0 = "Android SDK built for x86"
            boolean r6 = r6.contains(r0)     // Catch: java.lang.Exception -> Ld1
            if (r6 == 0) goto Lca
            goto Lcb
        Lca:
            r2 = 0
        Lcb:
            r0 = r2
        Lcc:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Exception -> Ld1
            return r6
        Ld1:
            r6 = move-exception
            java.lang.String r0 = "SentryUtils"
            java.lang.String r1 = "Error checking whether application is running in an emulator."
            cn.jiguang.w.f.b(r0, r1, r6)
            r6 = 0
            return r6
    }

    private static java.lang.Long i(android.os.StatFs r4) {
            long r0 = b(r4)     // Catch: java.lang.Exception -> Lf
            long r2 = d(r4)     // Catch: java.lang.Exception -> Lf
            long r2 = r2 * r0
            java.lang.Long r4 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Exception -> Lf
            return r4
        Lf:
            r4 = move-exception
            java.lang.String r0 = "SentryUtils"
            java.lang.String r1 = "Error getting total external storage amount."
            cn.jiguang.w.f.a(r0, r1, r4)
            r4 = 0
            return r4
    }

    private static java.lang.Long j(android.os.StatFs r4) {
            long r0 = b(r4)     // Catch: java.lang.Exception -> Lf
            long r2 = f(r4)     // Catch: java.lang.Exception -> Lf
            long r2 = r2 * r0
            java.lang.Long r4 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Exception -> Lf
            return r4
        Lf:
            r4 = move-exception
            java.lang.String r0 = "SentryUtils"
            java.lang.String r1 = "Error getting unused external storage amount."
            cn.jiguang.w.f.a(r0, r1, r4)
            r4 = 0
            return r4
    }

    private static java.io.File[] j(android.content.Context r1) {
            r0 = 0
            java.io.File[] r1 = r1.getExternalFilesDirs(r0)
            return r1
    }

    private static android.util.DisplayMetrics k(android.content.Context r2) {
            android.content.res.Resources r2 = r2.getResources()     // Catch: java.lang.Exception -> L9
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()     // Catch: java.lang.Exception -> L9
            return r2
        L9:
            r2 = move-exception
            java.lang.String r0 = "SentryUtils"
            java.lang.String r1 = "Error getting DisplayMetrics."
            cn.jiguang.w.f.a(r0, r1, r2)
            r2 = 0
            return r2
    }
}
