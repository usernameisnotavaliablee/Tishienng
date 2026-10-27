package com.bytedance.j.xt.cw;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class c {
    private static final java.lang.String[] c = null;
    private android.content.Context a;
    private org.json.JSONObject b;

    static {
            java.lang.String r0 = "aid"
            java.lang.String r1 = "update_version_code"
            java.lang.String r2 = "version_code"
            java.lang.String r3 = "manifest_version_code"
            java.lang.String[] r0 = new java.lang.String[]{r2, r3, r0, r1}
            com.bytedance.j.xt.cw.c.c = r0
            return
    }

    public c(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            r1.b = r0
            r1.a = r2
            return
    }

    private void a(org.json.JSONObject r4) {
            r3 = this;
            android.content.Context r0 = r3.a     // Catch: java.lang.Exception -> L1c
            java.lang.String r1 = "phone"
            java.lang.Object r0 = r0.getSystemService(r1)     // Catch: java.lang.Exception -> L1c
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0     // Catch: java.lang.Exception -> L1c
            if (r0 == 0) goto L2d
            java.lang.String r1 = r0.getNetworkOperatorName()     // Catch: java.lang.Exception -> L1c
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L1c
            if (r2 != 0) goto L1e
            java.lang.String r2 = "carrier"
            r4.put(r2, r1)     // Catch: java.lang.Exception -> L1c
            goto L1e
        L1c:
            r4 = move-exception
            goto L2e
        L1e:
            java.lang.String r0 = r0.getNetworkOperator()     // Catch: java.lang.Exception -> L1c
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L1c
            if (r1 != 0) goto L2d
            java.lang.String r1 = "mcc_mnc"
            r4.put(r1, r0)     // Catch: java.lang.Exception -> L1c
        L2d:
            return
        L2e:
            com.bytedance.sdk.component.utils.vl.j(r4)
            return
    }

    private java.lang.String b() {
            r2 = this;
            java.lang.String r0 = android.os.Build.VERSION.RELEASE
            java.lang.String r1 = "."
            boolean r1 = r0.contains(r1)
            if (r1 == 0) goto Lb
            return r0
        Lb:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = ".0"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }

    private void c(org.json.JSONObject r5) {
            r4 = this;
            android.content.Context r0 = r4.a     // Catch: java.lang.Exception -> L4a
            android.content.res.Resources r0 = r0.getResources()     // Catch: java.lang.Exception -> L4a
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()     // Catch: java.lang.Exception -> L4a
            int r1 = r0.densityDpi     // Catch: java.lang.Exception -> L4a
            r2 = 120(0x78, float:1.68E-43)
            if (r1 == r2) goto L21
            r2 = 240(0xf0, float:3.36E-43)
            if (r1 == r2) goto L1e
            r2 = 320(0x140, float:4.48E-43)
            if (r1 == r2) goto L1b
            java.lang.String r2 = "mdpi"
            goto L23
        L1b:
            java.lang.String r2 = "xhdpi"
            goto L23
        L1e:
            java.lang.String r2 = "hdpi"
            goto L23
        L21:
            java.lang.String r2 = "ldpi"
        L23:
            java.lang.String r3 = "density_dpi"
            r5.put(r3, r1)     // Catch: java.lang.Exception -> L4a
            java.lang.String r1 = "display_density"
            r5.put(r1, r2)     // Catch: java.lang.Exception -> L4a
            java.lang.String r1 = "resolution"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L4a
            r2.<init>()     // Catch: java.lang.Exception -> L4a
            int r3 = r0.heightPixels     // Catch: java.lang.Exception -> L4a
            r2.append(r3)     // Catch: java.lang.Exception -> L4a
            java.lang.String r3 = "x"
            r2.append(r3)     // Catch: java.lang.Exception -> L4a
            int r0 = r0.widthPixels     // Catch: java.lang.Exception -> L4a
            r2.append(r0)     // Catch: java.lang.Exception -> L4a
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Exception -> L4a
            r5.put(r1, r0)     // Catch: java.lang.Exception -> L4a
        L4a:
            return
    }

    public static com.bytedance.j.xt.cw.c d(android.content.Context r1) {
            com.bytedance.j.xt.cw.c r0 = new com.bytedance.j.xt.cw.c
            r0.<init>(r1)
            org.json.JSONObject r1 = r0.e()
            r0.h(r1)
            r0.c(r1)
            r0.j(r1)
            r0.k(r1)
            r0.i(r1)
            r0.a(r1)
            r0.n(r1)
            return r0
    }

    @android.annotation.SuppressLint({"MissingPermission"})
    private void h(org.json.JSONObject r4) {
            r3 = this;
            android.content.Context r0 = r3.a     // Catch: java.lang.Exception -> L67
            java.lang.String r0 = r0.getPackageName()     // Catch: java.lang.Exception -> L67
            android.content.Context r1 = r3.a     // Catch: java.lang.Exception -> L67
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch: java.lang.Exception -> L67
            r2 = 0
            android.content.pm.PackageInfo r0 = r1.getPackageInfo(r0, r2)     // Catch: java.lang.Exception -> L67
            android.content.pm.ApplicationInfo r0 = r0.applicationInfo     // Catch: java.lang.Exception -> L67
            if (r0 == 0) goto L24
            int r0 = r0.labelRes     // Catch: java.lang.Exception -> L67
            if (r0 <= 0) goto L24
            java.lang.String r1 = "display_name"
            android.content.Context r2 = r3.a     // Catch: java.lang.Exception -> L67
            java.lang.String r0 = r2.getString(r0)     // Catch: java.lang.Exception -> L67
            r4.put(r1, r0)     // Catch: java.lang.Exception -> L67
        L24:
            java.lang.String r0 = "sdk_version"
            r1 = 137(0x89, float:1.92E-43)
            r4.put(r0, r1)     // Catch: java.lang.Exception -> L67
            java.lang.String r0 = "sdk_version_name"
            java.lang.String r1 = "0.0.1-alpha.17-cloud"
            r4.put(r0, r1)     // Catch: java.lang.Exception -> L67
            java.lang.String r0 = "os"
            java.lang.String r1 = "Android"
            r4.put(r0, r1)     // Catch: java.lang.Exception -> L67
            java.lang.String r0 = "os_version"
            java.lang.String r1 = r3.b()     // Catch: java.lang.Exception -> L67
            r4.put(r0, r1)     // Catch: java.lang.Exception -> L67
            java.lang.String r0 = "os_api"
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L67
            r4.put(r0, r1)     // Catch: java.lang.Exception -> L67
            java.lang.String r0 = "device_model"
            java.lang.String r1 = android.os.Build.MODEL     // Catch: java.lang.Exception -> L67
            r4.put(r0, r1)     // Catch: java.lang.Exception -> L67
            java.lang.String r0 = "device_brand"
            java.lang.String r1 = android.os.Build.BRAND     // Catch: java.lang.Exception -> L67
            r4.put(r0, r1)     // Catch: java.lang.Exception -> L67
            java.lang.String r0 = "device_manufacturer"
            java.lang.String r1 = android.os.Build.MANUFACTURER     // Catch: java.lang.Exception -> L67
            r4.put(r0, r1)     // Catch: java.lang.Exception -> L67
            java.lang.String r0 = "cpu_abi"
            java.lang.String r1 = r3.l()     // Catch: java.lang.Exception -> L67
            r4.put(r0, r1)     // Catch: java.lang.Exception -> L67
        L67:
            return
    }

    private void i(org.json.JSONObject r3) {
            r2 = this;
            java.lang.String r0 = "access"
            android.content.Context r1 = r2.a     // Catch: org.json.JSONException -> Lc
            java.lang.String r1 = com.bytedance.j.xt.tl.e.b(r1)     // Catch: org.json.JSONException -> Lc
            r3.put(r0, r1)     // Catch: org.json.JSONException -> Lc
            return
        Lc:
            r3 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r3)
            return
    }

    private void j(org.json.JSONObject r3) {
            r2 = this;
            android.content.Context r0 = r2.a     // Catch: java.lang.Exception -> L4b
            android.content.res.Resources r0 = r0.getResources()     // Catch: java.lang.Exception -> L4b
            android.content.res.Configuration r0 = r0.getConfiguration()     // Catch: java.lang.Exception -> L4b
            java.util.Locale r0 = r0.locale     // Catch: java.lang.Exception -> L4b
            java.lang.String r0 = r0.getLanguage()     // Catch: java.lang.Exception -> L4b
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L4b
            if (r1 != 0) goto L1b
            java.lang.String r1 = "language"
            r3.put(r1, r0)     // Catch: java.lang.Exception -> L4b
        L1b:
            java.util.Locale r0 = java.util.Locale.getDefault()     // Catch: java.lang.Exception -> L4b
            java.lang.String r0 = r0.getCountry()     // Catch: java.lang.Exception -> L4b
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L4b
            if (r1 != 0) goto L2e
            java.lang.String r1 = "region"
            r3.put(r1, r0)     // Catch: java.lang.Exception -> L4b
        L2e:
            java.util.TimeZone r0 = java.util.TimeZone.getDefault()     // Catch: java.lang.Exception -> L4b
            int r0 = r0.getRawOffset()     // Catch: java.lang.Exception -> L4b
            r1 = 3600000(0x36ee80, float:5.044674E-39)
            int r0 = r0 / r1
            r1 = -12
            if (r0 >= r1) goto L40
            r0 = -12
        L40:
            r1 = 12
            if (r0 <= r1) goto L46
            r0 = 12
        L46:
            java.lang.String r1 = "timezone"
            r3.put(r1, r0)     // Catch: java.lang.Exception -> L4b
        L4b:
            return
    }

    private void k(org.json.JSONObject r4) {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            boolean r1 = com.bytedance.j.xt.tl.d.a()     // Catch: java.lang.Throwable -> L57
            if (r1 == 0) goto L11
            java.lang.String r1 = "MIUI-"
            r0.append(r1)     // Catch: java.lang.Throwable -> L57
            goto L3a
        L11:
            boolean r1 = com.bytedance.j.xt.tl.d.d()     // Catch: java.lang.Throwable -> L57
            if (r1 == 0) goto L1d
            java.lang.String r1 = "FLYME-"
            r0.append(r1)     // Catch: java.lang.Throwable -> L57
            goto L3a
        L1d:
            java.lang.String r1 = com.bytedance.j.xt.tl.d.b()     // Catch: java.lang.Throwable -> L57
            boolean r2 = com.bytedance.j.xt.tl.d.c(r1)     // Catch: java.lang.Throwable -> L57
            if (r2 == 0) goto L2c
            java.lang.String r2 = "EMUI-"
            r0.append(r2)     // Catch: java.lang.Throwable -> L57
        L2c:
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L57
            if (r2 != 0) goto L3a
            r0.append(r1)     // Catch: java.lang.Throwable -> L57
            java.lang.String r1 = "-"
            r0.append(r1)     // Catch: java.lang.Throwable -> L57
        L3a:
            java.lang.String r1 = android.os.Build.VERSION.INCREMENTAL     // Catch: java.lang.Throwable -> L57
            r0.append(r1)     // Catch: java.lang.Throwable -> L57
            int r1 = r0.length()     // Catch: java.lang.Throwable -> L57
            if (r1 <= 0) goto L4e
            java.lang.String r1 = "rom"
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L57
            r4.put(r1, r0)     // Catch: java.lang.Throwable -> L57
        L4e:
            java.lang.String r0 = "rom_version"
            java.lang.String r1 = com.bytedance.j.xt.tl.g.d()     // Catch: java.lang.Throwable -> L57
            r4.put(r0, r1)     // Catch: java.lang.Throwable -> L57
        L57:
            return
    }

    private java.lang.String l() {
            r5 = this;
            java.lang.String r0 = "unknown"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L22
            r1.<init>()     // Catch: java.lang.Exception -> L22
            java.lang.String[] r2 = android.os.Build.SUPPORTED_ABIS     // Catch: java.lang.Exception -> L22
            int r2 = r2.length     // Catch: java.lang.Exception -> L22
            if (r2 <= 0) goto L27
            r2 = 0
        Ld:
            java.lang.String[] r3 = android.os.Build.SUPPORTED_ABIS     // Catch: java.lang.Exception -> L22
            int r4 = r3.length     // Catch: java.lang.Exception -> L22
            if (r2 >= r4) goto L2e
            r4 = r3[r2]     // Catch: java.lang.Exception -> L22
            r1.append(r4)     // Catch: java.lang.Exception -> L22
            int r3 = r3.length     // Catch: java.lang.Exception -> L22
            int r3 = r3 + (-1)
            if (r2 == r3) goto L24
            java.lang.String r3 = ", "
            r1.append(r3)     // Catch: java.lang.Exception -> L22
            goto L24
        L22:
            r1 = move-exception
            goto L3e
        L24:
            int r2 = r2 + 1
            goto Ld
        L27:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L22
            java.lang.String r2 = android.os.Build.CPU_ABI     // Catch: java.lang.Exception -> L22
            r1.<init>(r2)     // Catch: java.lang.Exception -> L22
        L2e:
            java.lang.String r2 = r1.toString()     // Catch: java.lang.Exception -> L22
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> L22
            if (r2 == 0) goto L39
            return r0
        L39:
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Exception -> L22
            return r0
        L3e:
            com.bytedance.j.xt.tl.i.c(r1)
            return r0
    }

    private void n(org.json.JSONObject r6) {
            r5 = this;
            com.bytedance.j.xt.up.c r0 = com.bytedance.j.xt.e.d()
            if (r0 == 0) goto L42
            if (r6 == 0) goto L42
            java.util.Map r0 = r0.f()
            if (r0 == 0) goto L42
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> L37
            r1.<init>()     // Catch: java.lang.Exception -> L37
            java.util.Set r2 = r0.keySet()     // Catch: java.lang.Exception -> L37
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Exception -> L37
        L1b:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Exception -> L37
            if (r3 == 0) goto L39
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Exception -> L37
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Exception -> L37
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L37
            if (r4 != 0) goto L1b
            java.lang.Object r4 = r0.get(r3)     // Catch: java.lang.Exception -> L37
            if (r4 == 0) goto L1b
            r1.put(r3, r4)     // Catch: java.lang.Exception -> L37
            goto L1b
        L37:
            r6 = move-exception
            goto L3f
        L39:
            java.lang.String r0 = "custom"
            r6.put(r0, r1)     // Catch: java.lang.Exception -> L37
            return
        L3f:
            com.bytedance.j.xt.tl.i.c(r6)
        L42:
            return
    }

    public org.json.JSONObject e() {
            r1 = this;
            org.json.JSONObject r0 = r1.b
            return r0
    }

    public org.json.JSONObject f(java.lang.String r3) {
            r2 = this;
            org.json.JSONObject r0 = r2.b     // Catch: org.json.JSONException -> L8
            java.lang.String r1 = "device_id"
            r0.put(r1, r3)     // Catch: org.json.JSONException -> L8
            goto Lc
        L8:
            r3 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r3)
        Lc:
            org.json.JSONObject r3 = r2.b
            return r3
    }

    public org.json.JSONObject g(@androidx.annotation.Nullable java.util.Map<java.lang.String, java.lang.Object> r10) {
            r9 = this;
            java.lang.String r0 = "manifest_version_code"
            java.lang.String r1 = "version_code"
            java.lang.String r2 = "iid"
            if (r10 != 0) goto Lb
            org.json.JSONObject r10 = r9.b     // Catch: java.lang.Throwable -> L98
            return r10
        Lb:
            java.util.Set r3 = r10.entrySet()     // Catch: java.lang.Throwable -> L98
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L98
        L13:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L98
            if (r4 == 0) goto L3d
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L98
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch: java.lang.Throwable -> L98
            org.json.JSONObject r5 = r9.b     // Catch: java.lang.Throwable -> L98
            java.lang.Object r6 = r4.getKey()     // Catch: java.lang.Throwable -> L98
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L98
            boolean r5 = r5.has(r6)     // Catch: java.lang.Throwable -> L98
            if (r5 != 0) goto L13
            org.json.JSONObject r5 = r9.b     // Catch: java.lang.Throwable -> L98
            java.lang.Object r6 = r4.getKey()     // Catch: java.lang.Throwable -> L98
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L98
            java.lang.Object r4 = r4.getValue()     // Catch: java.lang.Throwable -> L98
            r5.put(r6, r4)     // Catch: java.lang.Throwable -> L98
            goto L13
        L3d:
            java.lang.String[] r3 = com.bytedance.j.xt.cw.c.c     // Catch: java.lang.Throwable -> L98
            int r4 = r3.length     // Catch: java.lang.Throwable -> L98
            r5 = 0
        L41:
            if (r5 >= r4) goto L67
            r6 = r3[r5]     // Catch: java.lang.Throwable -> L98
            boolean r7 = r10.containsKey(r6)     // Catch: java.lang.Throwable -> L98
            if (r7 == 0) goto L64
            java.lang.Object r7 = r10.get(r6)     // Catch: java.lang.Exception -> L5b java.lang.Throwable -> L98
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Exception -> L5b java.lang.Throwable -> L98
            int r7 = java.lang.Integer.parseInt(r7)     // Catch: java.lang.Exception -> L5b java.lang.Throwable -> L98
            org.json.JSONObject r8 = r9.b     // Catch: java.lang.Exception -> L5b java.lang.Throwable -> L98
            r8.put(r6, r7)     // Catch: java.lang.Exception -> L5b java.lang.Throwable -> L98
            goto L64
        L5b:
            org.json.JSONObject r7 = r9.b     // Catch: java.lang.Throwable -> L98
            java.lang.Object r8 = r10.get(r6)     // Catch: java.lang.Throwable -> L98
            r7.put(r6, r8)     // Catch: java.lang.Throwable -> L98
        L64:
            int r5 = r5 + 1
            goto L41
        L67:
            boolean r3 = r10.containsKey(r1)     // Catch: java.lang.Throwable -> L98
            if (r3 == 0) goto L82
            boolean r3 = r10.containsKey(r0)     // Catch: java.lang.Throwable -> L98
            if (r3 != 0) goto L82
            java.lang.Object r1 = r10.get(r1)     // Catch: java.lang.Throwable -> L98
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L98
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.Throwable -> L98
            org.json.JSONObject r3 = r9.b     // Catch: java.lang.Throwable -> L98
            r3.put(r0, r1)     // Catch: java.lang.Throwable -> L98
        L82:
            boolean r0 = r10.containsKey(r2)     // Catch: java.lang.Throwable -> L98
            if (r0 == 0) goto L98
            org.json.JSONObject r0 = r9.b     // Catch: java.lang.Throwable -> L98
            java.lang.String r1 = "udid"
            java.lang.Object r10 = r10.get(r2)     // Catch: java.lang.Throwable -> L98
            r0.put(r1, r10)     // Catch: java.lang.Throwable -> L98
            org.json.JSONObject r10 = r9.b     // Catch: java.lang.Throwable -> L98
            r10.remove(r2)     // Catch: java.lang.Throwable -> L98
        L98:
            org.json.JSONObject r10 = r9.b
            return r10
    }

    public org.json.JSONObject m(java.lang.String r3) {
            r2 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch: org.json.JSONException -> Le
            if (r0 != 0) goto L12
            org.json.JSONObject r0 = r2.b     // Catch: org.json.JSONException -> Le
            java.lang.String r1 = "user_id"
            r0.put(r1, r3)     // Catch: org.json.JSONException -> Le
            goto L12
        Le:
            r3 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r3)
        L12:
            org.json.JSONObject r3 = r2.b
            return r3
    }
}
