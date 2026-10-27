package com.kuaishou.weapon.p0;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class bh {
    private static java.lang.String a;
    private static java.lang.String b;


    public bh() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String a() {
            r0 = 0
            return r0
    }

    private static java.lang.String a(android.accessibilityservice.AccessibilityServiceInfo r2) {
            java.lang.String r2 = r2.getId()
            java.lang.String r0 = "/"
            int r0 = r2.lastIndexOf(r0)
            if (r0 <= 0) goto L11
            r1 = 0
            java.lang.String r2 = r2.substring(r1, r0)
        L11:
            return r2
    }

    public static java.lang.String a(android.content.Context r0) {
            com.kwad.sdk.e.b r0 = com.kwad.sdk.e.b.Mo()     // Catch: java.lang.Throwable -> Ld
            java.lang.String r0 = r0.Mc()     // Catch: java.lang.Throwable -> Ld
            java.lang.String r0 = c(r0)     // Catch: java.lang.Throwable -> Ld
            return r0
        Ld:
            java.lang.String r0 = "RISK_EXCEPTION_HAPPEN"
            return r0
    }

    public static java.lang.String a(android.content.Context r0, int r1) {
            r0 = 1
            if (r1 != r0) goto L10
            com.kwad.sdk.e.b r0 = com.kwad.sdk.e.b.Mo()     // Catch: java.lang.Throwable -> L1d
            java.lang.String r0 = r0.Mf()     // Catch: java.lang.Throwable -> L1d
            java.lang.String r0 = c(r0)     // Catch: java.lang.Throwable -> L1d
            return r0
        L10:
            com.kwad.sdk.e.b r0 = com.kwad.sdk.e.b.Mo()     // Catch: java.lang.Throwable -> L1d
            java.lang.String r0 = r0.Mc()     // Catch: java.lang.Throwable -> L1d
            java.lang.String r0 = c(r0)     // Catch: java.lang.Throwable -> L1d
            return r0
        L1d:
            java.lang.String r0 = "RISK_EXCEPTION_HAPPEN"
            return r0
    }

    public static java.lang.String a(java.lang.String r6) {
            java.lang.String r0 = "android.os.SystemProperties"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r1 = "get"
            r2 = 1
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L1f
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r5 = 0
            r3[r5] = r4     // Catch: java.lang.Throwable -> L1f
            java.lang.reflect.Method r1 = r0.getMethod(r1, r3)     // Catch: java.lang.Throwable -> L1f
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L1f
            r2[r5] = r6     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r6 = r1.invoke(r0, r2)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L1f
            return r6
        L1f:
            r6 = 0
            return r6
    }

    public static java.lang.reflect.Method a(java.lang.Class<?> r0, java.lang.String r1, java.lang.Class<?>... r2) {
            java.lang.reflect.Method r0 = b(r0, r1, r2)     // Catch: java.lang.Throwable -> L9
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.Throwable -> La
            return r0
        L9:
            r0 = 0
        La:
            return r0
    }

    public static void a(android.content.Context r3, java.lang.String r4, java.util.Map<java.lang.String, java.lang.String> r5) {
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L7
            goto L4d
        L7:
            java.lang.String r0 = "re_po_rt"
            com.kuaishou.weapon.p0.h r0 = com.kuaishou.weapon.p0.h.a(r3, r0)
            java.lang.String r1 = "l_p_l_s"
            r2 = 1
            int r0 = r0.c(r1, r2)
            if (r0 != 0) goto L17
            goto L4d
        L17:
            com.kuaishou.weapon.p0.cm r0 = new com.kuaishou.weapon.p0.cm     // Catch: java.lang.Throwable -> L4d
            java.lang.String r1 = com.kuaishou.weapon.p0.ck.l     // Catch: java.lang.Throwable -> L4d
            r0.<init>(r4, r1)     // Catch: java.lang.Throwable -> L4d
            org.json.JSONObject r4 = r0.a(r3)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r0 = "module_section"
            if (r5 == 0) goto L35
            int r1 = r5.size()     // Catch: java.lang.Throwable -> L4d
            if (r1 <= 0) goto L35
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L4d
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L4d
            r4.put(r0, r1)     // Catch: java.lang.Throwable -> L4d
            goto L3d
        L35:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L4d
            r5.<init>()     // Catch: java.lang.Throwable -> L4d
            r4.put(r0, r5)     // Catch: java.lang.Throwable -> L4d
        L3d:
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L4d
            com.kuaishou.weapon.p0.n r5 = com.kuaishou.weapon.p0.n.a()     // Catch: java.lang.Throwable -> L4d
            com.kuaishou.weapon.p0.bh$1 r0 = new com.kuaishou.weapon.p0.bh$1     // Catch: java.lang.Throwable -> L4d
            r0.<init>(r3, r4)     // Catch: java.lang.Throwable -> L4d
            r5.a(r0)     // Catch: java.lang.Throwable -> L4d
        L4d:
            return
    }

    public static boolean a(android.content.Context r1, java.lang.String r2) {
            r0 = 0
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch: java.lang.Throwable -> La
            r1.getApplicationInfo(r2, r0)     // Catch: java.lang.Throwable -> La
            r1 = 1
            return r1
        La:
            return r0
    }

    public static double b() {
            r0 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            com.kwad.sdk.e.b r2 = com.kwad.sdk.e.b.Mo()     // Catch: java.lang.Throwable -> L28
            java.lang.String r2 = r2.getLocation()     // Catch: java.lang.Throwable -> L28
            java.lang.String r2 = c(r2)     // Catch: java.lang.Throwable -> L28
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L28
            if (r3 != 0) goto L28
            java.lang.String r3 = "RISK"
            boolean r3 = r2.startsWith(r3)     // Catch: java.lang.Throwable -> L28
            if (r3 == 0) goto L1d
            goto L28
        L1d:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L28
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L28
            java.lang.String r2 = "latitude"
            double r0 = r3.getDouble(r2)     // Catch: java.lang.Throwable -> L28
        L28:
            return r0
    }

    public static int b(java.lang.String r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L18
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L18
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L18
            java.lang.String r2 = "userSet"
            boolean r2 = r0.getBoolean(r2)     // Catch: java.lang.Throwable -> L18
            if (r2 == 0) goto L17
            r2 = 1
            return r2
        L17:
            return r1
        L18:
            r2 = -2
            return r2
    }

    public static java.lang.String b(android.content.Context r0) {
            com.kwad.sdk.e.b r0 = com.kwad.sdk.e.b.Mo()     // Catch: java.lang.Throwable -> Ld
            java.lang.String r0 = r0.Mc()     // Catch: java.lang.Throwable -> Ld
            java.lang.String r0 = c(r0)     // Catch: java.lang.Throwable -> Ld
            return r0
        Ld:
            java.lang.String r0 = "RISK_EXCEPTION_HAPPEN"
            return r0
    }

    public static java.lang.String b(android.content.Context r0, int r1) {
            r0 = 1
            if (r1 != r0) goto L10
            com.kwad.sdk.e.b r0 = com.kwad.sdk.e.b.Mo()     // Catch: java.lang.Throwable -> L1d
            java.lang.String r0 = r0.Mf()     // Catch: java.lang.Throwable -> L1d
            java.lang.String r0 = c(r0)     // Catch: java.lang.Throwable -> L1d
            return r0
        L10:
            com.kwad.sdk.e.b r0 = com.kwad.sdk.e.b.Mo()     // Catch: java.lang.Throwable -> L1d
            java.lang.String r0 = r0.Mc()     // Catch: java.lang.Throwable -> L1d
            java.lang.String r0 = c(r0)     // Catch: java.lang.Throwable -> L1d
            return r0
        L1d:
            java.lang.String r0 = "RISK_EXCEPTION_HAPPEN"
            return r0
    }

    public static java.lang.reflect.Method b(java.lang.Class<?> r2, java.lang.String r3, java.lang.Class<?>... r4) {
            java.lang.reflect.Method r0 = r2.getMethod(r3, r4)     // Catch: java.lang.Throwable -> L7
            if (r0 == 0) goto L8
            return r0
        L7:
        L8:
            if (r2 == 0) goto L18
            java.lang.reflect.Method r0 = r2.getDeclaredMethod(r3, r4)     // Catch: java.lang.NoSuchMethodException -> L13
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.NoSuchMethodException -> L13
            return r0
        L13:
            java.lang.Class r2 = r2.getSuperclass()
            goto L8
        L18:
            java.lang.NoSuchMethodException r2 = new java.lang.NoSuchMethodException
            r2.<init>()
            throw r2
    }

    public static double c() {
            r0 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            com.kwad.sdk.e.b r2 = com.kwad.sdk.e.b.Mo()     // Catch: java.lang.Throwable -> L28
            java.lang.String r2 = r2.getLocation()     // Catch: java.lang.Throwable -> L28
            java.lang.String r2 = c(r2)     // Catch: java.lang.Throwable -> L28
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L28
            if (r3 != 0) goto L28
            java.lang.String r3 = "RISK"
            boolean r3 = r2.startsWith(r3)     // Catch: java.lang.Throwable -> L28
            if (r3 == 0) goto L1d
            goto L28
        L1d:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L28
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L28
            java.lang.String r2 = "longitude"
            double r0 = r3.getDouble(r2)     // Catch: java.lang.Throwable -> L28
        L28:
            return r0
    }

    public static java.lang.String c(android.content.Context r0) {
            com.kwad.sdk.e.b r0 = com.kwad.sdk.e.b.Mo()     // Catch: java.lang.Throwable -> Ld
            java.lang.String r0 = r0.Mc()     // Catch: java.lang.Throwable -> Ld
            java.lang.String r0 = c(r0)     // Catch: java.lang.Throwable -> Ld
            return r0
        Ld:
            java.lang.String r0 = "RISK_EXCEPTION_HAPPEN"
            return r0
    }

    public static java.lang.String c(java.lang.String r2) {
            java.lang.String r0 = ""
            boolean r1 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L2c
            if (r1 == 0) goto L9
            return r0
        L9:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L2c
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r2 = "errorCode"
            int r2 = r1.getInt(r2)     // Catch: java.lang.Throwable -> L2c
            if (r2 != 0) goto L1d
            java.lang.String r2 = "value"
            java.lang.String r2 = r1.getString(r2)     // Catch: java.lang.Throwable -> L2c
            return r2
        L1d:
            r1 = 3
            if (r2 != r1) goto L23
            java.lang.String r2 = "RISK_GET_FIELD_EMPTY"
            return r2
        L23:
            r1 = 1
            if (r2 != r1) goto L29
            java.lang.String r2 = "RISK_AUTH_FAILED"
            return r2
        L29:
            java.lang.String r2 = "RISK_EXCEPTION_HAPPEN"
            return r2
        L2c:
            return r0
    }

    public static java.lang.String d() {
            com.kwad.sdk.e.b r0 = com.kwad.sdk.e.b.Mo()     // Catch: java.lang.Throwable -> L41
            java.lang.String r0 = r0.Mk()     // Catch: java.lang.Throwable -> L41
            java.lang.String r0 = c(r0)     // Catch: java.lang.Throwable -> L41
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L41
            if (r1 != 0) goto L40
            java.lang.String r1 = "RISK"
            boolean r1 = r0.startsWith(r1)     // Catch: java.lang.Throwable -> L41
            if (r1 == 0) goto L1b
            goto L40
        L1b:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L41
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L41
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L41
            r0.<init>()     // Catch: java.lang.Throwable -> L41
            java.lang.String r2 = "cellId"
            java.lang.String r2 = r1.getString(r2)     // Catch: java.lang.Throwable -> L41
            r0.append(r2)     // Catch: java.lang.Throwable -> L41
            java.lang.String r2 = ", "
            r0.append(r2)     // Catch: java.lang.Throwable -> L41
            java.lang.String r2 = "lac"
            java.lang.String r1 = r1.getString(r2)     // Catch: java.lang.Throwable -> L41
            r0.append(r1)     // Catch: java.lang.Throwable -> L41
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L41
        L40:
            return r0
        L41:
            java.lang.String r0 = "RISK_EXCEPTION_HAPPEN"
            return r0
    }

    public static java.lang.String d(android.content.Context r0) {
            com.kwad.sdk.e.b r0 = com.kwad.sdk.e.b.Mo()     // Catch: java.lang.Throwable -> Ld
            java.lang.String r0 = r0.Mh()     // Catch: java.lang.Throwable -> Ld
            java.lang.String r0 = c(r0)     // Catch: java.lang.Throwable -> Ld
            return r0
        Ld:
            java.lang.String r0 = "RISK_EXCEPTION_HAPPEN"
            return r0
    }

    public static java.lang.String e() {
            com.kwad.sdk.e.b r0 = com.kwad.sdk.e.b.Mo()     // Catch: java.lang.Throwable -> L18
            java.lang.String r0 = r0.Mm()     // Catch: java.lang.Throwable -> L18
            java.lang.String r0 = c(r0)     // Catch: java.lang.Throwable -> L18
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L17
            java.lang.String r1 = "RISK"
            r0.startsWith(r1)     // Catch: java.lang.Throwable -> L18
        L17:
            return r0
        L18:
            java.lang.String r0 = "RISK_EXCEPTION_HAPPEN"
            return r0
    }

    public static java.lang.String e(android.content.Context r0) {
            com.kwad.sdk.e.b r0 = com.kwad.sdk.e.b.Mo()     // Catch: java.lang.Throwable -> Ld
            java.lang.String r0 = r0.getIccId()     // Catch: java.lang.Throwable -> Ld
            java.lang.String r0 = c(r0)     // Catch: java.lang.Throwable -> Ld
            return r0
        Ld:
            java.lang.String r0 = "RISK_EXCEPTION_HAPPEN"
            return r0
    }

    public static java.lang.String f(android.content.Context r0) {
            com.kwad.sdk.e.b r0 = com.kwad.sdk.e.b.Mo()     // Catch: java.lang.Throwable -> Ld
            java.lang.String r0 = r0.Md()     // Catch: java.lang.Throwable -> Ld
            java.lang.String r0 = c(r0)     // Catch: java.lang.Throwable -> Ld
            return r0
        Ld:
            java.lang.String r0 = "RISK_EXCEPTION_HAPPEN"
            return r0
    }

    public static org.json.JSONArray f() {
            r0 = 0
            com.kwad.sdk.e.b r1 = com.kwad.sdk.e.b.Mo()     // Catch: java.lang.Throwable -> L57
            java.lang.String r1 = r1.Ml()     // Catch: java.lang.Throwable -> L57
            java.lang.String r1 = c(r1)     // Catch: java.lang.Throwable -> L57
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L57
            if (r2 != 0) goto L57
            java.lang.String r2 = "RISK"
            boolean r2 = r1.startsWith(r2)     // Catch: java.lang.Throwable -> L57
            if (r2 == 0) goto L1c
            goto L57
        L1c:
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L57
            r2.<init>()     // Catch: java.lang.Throwable -> L57
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L57
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L57
            r1 = 0
        L27:
            int r4 = r3.length()     // Catch: java.lang.Throwable -> L57
            if (r1 >= r4) goto L56
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L57
            r4.<init>()     // Catch: java.lang.Throwable -> L57
            java.lang.String r5 = "1"
            org.json.JSONObject r6 = r3.getJSONObject(r1)     // Catch: java.lang.Throwable -> L57
            java.lang.String r7 = "ssid"
            java.lang.String r6 = r6.getString(r7)     // Catch: java.lang.Throwable -> L57
            r4.put(r5, r6)     // Catch: java.lang.Throwable -> L57
            java.lang.String r5 = "2"
            org.json.JSONObject r6 = r3.getJSONObject(r1)     // Catch: java.lang.Throwable -> L57
            java.lang.String r7 = "bssid"
            java.lang.String r6 = r6.getString(r7)     // Catch: java.lang.Throwable -> L57
            r4.put(r5, r6)     // Catch: java.lang.Throwable -> L57
            r2.put(r4)     // Catch: java.lang.Throwable -> L57
            int r1 = r1 + 1
            goto L27
        L56:
            return r2
        L57:
            return r0
    }

    public static java.lang.String g() {
            com.kwad.sdk.e.b r0 = com.kwad.sdk.e.b.Mo()     // Catch: java.lang.Throwable -> Ld
            java.lang.String r0 = r0.getIp()     // Catch: java.lang.Throwable -> Ld
            java.lang.String r0 = c(r0)     // Catch: java.lang.Throwable -> Ld
            return r0
        Ld:
            java.lang.String r0 = "RISK_GET_FIELD_EMPTY"
            return r0
    }

    public static boolean g(android.content.Context r2) {
            r0 = 0
            android.content.ContentResolver r2 = r2.getContentResolver()     // Catch: java.lang.Throwable -> Lf
            java.lang.String r1 = "adb_enabled"
            int r2 = android.provider.Settings.Secure.getInt(r2, r1, r0)     // Catch: java.lang.Throwable -> Lf
            if (r2 <= 0) goto Lf
            r2 = 1
            return r2
        Lf:
            return r0
    }

    public static java.lang.String h() {
            com.kwad.sdk.e.b r0 = com.kwad.sdk.e.b.Mo()     // Catch: java.lang.Throwable -> Ld
            java.lang.String r0 = r0.Me()     // Catch: java.lang.Throwable -> Ld
            java.lang.String r0 = c(r0)     // Catch: java.lang.Throwable -> Ld
            return r0
        Ld:
            java.lang.String r0 = "RISK_GET_FIELD_EMPTY"
            return r0
    }

    public static boolean h(android.content.Context r2) {
            r0 = 0
            android.content.ContentResolver r2 = r2.getContentResolver()     // Catch: java.lang.Throwable -> Lf
            java.lang.String r1 = "adb_enabled"
            int r2 = android.provider.Settings.Secure.getInt(r2, r1, r0)     // Catch: java.lang.Throwable -> Lf
            if (r2 <= 0) goto Lf
            r2 = 1
            return r2
        Lf:
            return r0
    }

    public static java.lang.String i() {
            java.util.Locale r0 = java.util.Locale.getDefault()     // Catch: java.lang.Throwable -> L21
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L21
            r1.<init>()     // Catch: java.lang.Throwable -> L21
            java.lang.String r2 = r0.getLanguage()     // Catch: java.lang.Throwable -> L21
            r1.append(r2)     // Catch: java.lang.Throwable -> L21
            java.lang.String r2 = "-"
            r1.append(r2)     // Catch: java.lang.Throwable -> L21
            java.lang.String r0 = r0.getCountry()     // Catch: java.lang.Throwable -> L21
            r1.append(r0)     // Catch: java.lang.Throwable -> L21
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L21
            return r0
        L21:
            java.lang.String r0 = ""
            return r0
    }

    public static java.lang.String i(android.content.Context r3) {
            java.lang.String r0 = "input_method"
            java.lang.Object r3 = r3.getSystemService(r0)     // Catch: java.lang.Exception -> L4d
            android.view.inputmethod.InputMethodManager r3 = (android.view.inputmethod.InputMethodManager) r3     // Catch: java.lang.Exception -> L4d
            java.util.List r3 = r3.getInputMethodList()     // Catch: java.lang.Exception -> L4d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L4d
            r0.<init>()     // Catch: java.lang.Exception -> L4d
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Exception -> L4d
        L15:
            boolean r1 = r3.hasNext()     // Catch: java.lang.Exception -> L4d
            java.lang.String r2 = ";"
            if (r1 == 0) goto L2e
            java.lang.Object r1 = r3.next()     // Catch: java.lang.Exception -> L4d
            android.view.inputmethod.InputMethodInfo r1 = (android.view.inputmethod.InputMethodInfo) r1     // Catch: java.lang.Exception -> L4d
            java.lang.String r1 = r1.getId()     // Catch: java.lang.Exception -> L4d
            r0.append(r1)     // Catch: java.lang.Exception -> L4d
            r0.append(r2)     // Catch: java.lang.Exception -> L4d
            goto L15
        L2e:
            boolean r3 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L4d
            if (r3 == 0) goto L37
            java.lang.String r3 = "RISK_GET_FIELD_EMPTY"
            return r3
        L37:
            java.lang.String r3 = r0.toString()     // Catch: java.lang.Exception -> L4d
            boolean r0 = r3.endsWith(r2)     // Catch: java.lang.Exception -> L4d
            if (r0 == 0) goto L4c
            int r0 = r3.length()     // Catch: java.lang.Exception -> L4d
            int r0 = r0 + (-1)
            r1 = 0
            java.lang.String r3 = r3.substring(r1, r0)     // Catch: java.lang.Exception -> L4d
        L4c:
            return r3
        L4d:
            java.lang.String r3 = "RISK_EXCEPTION_HAPPEN"
            return r3
    }

    public static java.lang.String j() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto L10
            android.os.LocaleList r0 = com.kuaishou.weapon.p0.b0.a()
            r1 = 0
            java.util.Locale r0 = androidx.core.os.f.a(r0, r1)
            goto L14
        L10:
            java.util.Locale r0 = java.util.Locale.getDefault()
        L14:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r0.getLanguage()
            r1.append(r2)
            java.lang.String r2 = "-"
            r1.append(r2)
            java.lang.String r0 = r0.getCountry()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }

    public static java.lang.String j(android.content.Context r11) {
            java.lang.String r0 = "-"
            java.lang.String r1 = ";"
            java.lang.String r2 = ""
            if (r11 == 0) goto Lbd
            android.content.pm.PackageManager r3 = r11.getPackageManager()     // Catch: java.lang.Throwable -> Lbd
            android.content.ContentResolver r4 = r11.getContentResolver()     // Catch: java.lang.Throwable -> Lbd
            java.lang.String r5 = "default_input_method"
            java.lang.String r4 = android.provider.Settings.Secure.getString(r4, r5)     // Catch: java.lang.Throwable -> Lbd
            java.lang.String r5 = "null"
            if (r4 != 0) goto L1b
            r4 = r5
        L1b:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lbd
            r6.<init>()     // Catch: java.lang.Throwable -> Lbd
            r6.append(r2)     // Catch: java.lang.Throwable -> Lbd
            java.lang.String r7 = "1="
            r6.append(r7)     // Catch: java.lang.Throwable -> Lbd
            r6.append(r4)     // Catch: java.lang.Throwable -> Lbd
            r6.append(r1)     // Catch: java.lang.Throwable -> Lbd
            java.lang.String r4 = r6.toString()     // Catch: java.lang.Throwable -> Lbd
            java.lang.String r6 = "input_method"
            java.lang.Object r11 = r11.getSystemService(r6)     // Catch: java.lang.Throwable -> Lbd
            android.view.inputmethod.InputMethodManager r11 = (android.view.inputmethod.InputMethodManager) r11     // Catch: java.lang.Throwable -> Lbd
            if (r11 == 0) goto Lbc
            java.util.List r11 = r11.getEnabledInputMethodList()     // Catch: java.lang.Throwable -> Lbd
            if (r11 == 0) goto Lbc
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lbd
            r6.<init>()     // Catch: java.lang.Throwable -> Lbd
            r6.append(r4)     // Catch: java.lang.Throwable -> Lbd
            java.lang.String r4 = "2="
            r6.append(r4)     // Catch: java.lang.Throwable -> Lbd
            java.lang.String r4 = r6.toString()     // Catch: java.lang.Throwable -> Lbd
            java.util.Iterator r11 = r11.iterator()     // Catch: java.lang.Throwable -> Lbd
            r6 = -1
        L58:
            boolean r7 = r11.hasNext()     // Catch: java.lang.Throwable -> Lbd
            if (r7 == 0) goto Lbc
            java.lang.Object r7 = r11.next()     // Catch: java.lang.Throwable -> Lbd
            android.view.inputmethod.InputMethodInfo r7 = (android.view.inputmethod.InputMethodInfo) r7     // Catch: java.lang.Throwable -> Lbd
            java.lang.String r8 = r7.getPackageName()     // Catch: java.lang.Throwable -> Lbd
            if (r8 != 0) goto L6b
            r8 = r5
        L6b:
            java.lang.String r7 = r7.getSettingsActivity()     // Catch: java.lang.Throwable -> Lbd
            if (r7 != 0) goto L72
            r7 = r5
        L72:
            r9 = 0
            if (r3 == 0) goto L8e
            boolean r10 = r8.equals(r5)     // Catch: java.lang.Exception -> L8e java.lang.Throwable -> Lbd
            if (r10 != 0) goto L8e
            boolean r10 = r7.equals(r5)     // Catch: java.lang.Exception -> L8e java.lang.Throwable -> Lbd
            if (r10 != 0) goto L8e
            android.content.ComponentName r10 = new android.content.ComponentName     // Catch: java.lang.Exception -> L8e java.lang.Throwable -> Lbd
            r10.<init>(r8, r7)     // Catch: java.lang.Exception -> L8e java.lang.Throwable -> Lbd
            android.content.pm.ActivityInfo r10 = r3.getActivityInfo(r10, r9)     // Catch: java.lang.Exception -> L8e java.lang.Throwable -> Lbd
            if (r10 == 0) goto L8e
            int r6 = r10.launchMode     // Catch: java.lang.Exception -> L8e java.lang.Throwable -> Lbd
        L8e:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lbd
            r10.<init>()     // Catch: java.lang.Throwable -> Lbd
            r10.append(r4)     // Catch: java.lang.Throwable -> Lbd
            r10.append(r8)     // Catch: java.lang.Throwable -> Lbd
            r10.append(r0)     // Catch: java.lang.Throwable -> Lbd
            r10.append(r7)     // Catch: java.lang.Throwable -> Lbd
            r10.append(r0)     // Catch: java.lang.Throwable -> Lbd
            java.lang.String r4 = "%d"
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> Lbd
            r8 = 1
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch: java.lang.Throwable -> Lbd
            r8[r9] = r7     // Catch: java.lang.Throwable -> Lbd
            java.lang.String r4 = java.lang.String.format(r4, r8)     // Catch: java.lang.Throwable -> Lbd
            r10.append(r4)     // Catch: java.lang.Throwable -> Lbd
            r10.append(r1)     // Catch: java.lang.Throwable -> Lbd
            java.lang.String r4 = r10.toString()     // Catch: java.lang.Throwable -> Lbd
            goto L58
        Lbc:
            return r4
        Lbd:
            return r2
    }

    public static java.lang.String k() {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ANDROID_"
            r0.<init>(r1)
            java.lang.String r1 = android.os.Build.VERSION.RELEASE
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public static java.lang.String k(android.content.Context r3) {
            android.content.ContentResolver r0 = r3.getContentResolver()     // Catch: java.lang.Throwable -> L24
            java.lang.String r1 = "accessibility_enabled"
            r2 = 0
            int r0 = android.provider.Settings.Secure.getInt(r0, r1, r2)     // Catch: java.lang.Throwable -> L24
            r1 = 1
            if (r0 == r1) goto L11
            java.lang.String r3 = "RISK_SWITCH_CLOSED"
            return r3
        L11:
            android.content.ContentResolver r3 = r3.getContentResolver()     // Catch: java.lang.Throwable -> L24
            java.lang.String r0 = "enabled_accessibility_services"
            java.lang.String r3 = android.provider.Settings.Secure.getString(r3, r0)     // Catch: java.lang.Throwable -> L24
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L24
            if (r0 == 0) goto L23
            java.lang.String r3 = "RISK_GET_FIELD_EMPTY"
        L23:
            return r3
        L24:
            java.lang.String r3 = "RISK_EXCEPTION_HAPPEN"
            return r3
    }

    public static java.lang.String l() {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = android.os.Build.MANUFACTURER
            r0.append(r1)
            java.lang.String r1 = "("
            r0.append(r1)
            java.lang.String r1 = android.os.Build.MODEL
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public static java.lang.String l(android.content.Context r5) {
            java.lang.String r0 = "accessibility"
            java.lang.Object r5 = r5.getSystemService(r0)
            android.view.accessibility.AccessibilityManager r5 = (android.view.accessibility.AccessibilityManager) r5
            r0 = 0
            if (r5 != 0) goto Lc
            return r0
        Lc:
            java.util.List r5 = r5.getInstalledAccessibilityServiceList()     // Catch: java.lang.Exception -> L43
            if (r5 == 0) goto L44
            int r1 = r5.size()     // Catch: java.lang.Exception -> L43
            if (r1 <= 0) goto L44
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L43
            r1.<init>()     // Catch: java.lang.Exception -> L43
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Exception -> L41
        L21:
            boolean r2 = r5.hasNext()     // Catch: java.lang.Exception -> L41
            if (r2 == 0) goto L45
            java.lang.Object r2 = r5.next()     // Catch: java.lang.Exception -> L41
            android.accessibilityservice.AccessibilityServiceInfo r2 = (android.accessibilityservice.AccessibilityServiceInfo) r2     // Catch: java.lang.Exception -> L41
            java.lang.String r2 = a(r2)     // Catch: java.lang.Exception -> L41
            int r3 = r1.indexOf(r2)     // Catch: java.lang.Exception -> L41
            r4 = -1
            if (r3 != r4) goto L21
            r1.append(r2)     // Catch: java.lang.Exception -> L41
            java.lang.String r2 = "|"
            r1.append(r2)     // Catch: java.lang.Exception -> L41
            goto L21
        L41:
            goto L45
        L43:
        L44:
            r1 = r0
        L45:
            if (r1 != 0) goto L48
            return r0
        L48:
            int r5 = r1.length()
            if (r5 <= 0) goto L57
            int r5 = r1.length()
            int r5 = r5 + (-1)
            r1.deleteCharAt(r5)
        L57:
            java.lang.String r5 = r1.toString()
            return r5
    }

    private static java.lang.String m() {
            java.lang.String r0 = "ANDROID_PHONE"
            return r0
    }

    public static java.lang.String m(android.content.Context r5) {
            java.lang.String r0 = "accessibility"
            java.lang.Object r5 = r5.getSystemService(r0)
            android.view.accessibility.AccessibilityManager r5 = (android.view.accessibility.AccessibilityManager) r5
            r0 = 0
            if (r5 != 0) goto Lc
            return r0
        Lc:
            boolean r1 = r5.isEnabled()     // Catch: java.lang.Exception -> L6b
            if (r1 == 0) goto L49
            r1 = -1
            java.util.List r5 = r5.getEnabledAccessibilityServiceList(r1)     // Catch: java.lang.Exception -> L6b
            if (r5 == 0) goto L49
            int r2 = r5.size()     // Catch: java.lang.Exception -> L6b
            if (r2 <= 0) goto L49
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L6b
            r2.<init>()     // Catch: java.lang.Exception -> L6b
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Exception -> L47
        L28:
            boolean r3 = r5.hasNext()     // Catch: java.lang.Exception -> L47
            if (r3 == 0) goto L4a
            java.lang.Object r3 = r5.next()     // Catch: java.lang.Exception -> L47
            android.accessibilityservice.AccessibilityServiceInfo r3 = (android.accessibilityservice.AccessibilityServiceInfo) r3     // Catch: java.lang.Exception -> L47
            java.lang.String r3 = a(r3)     // Catch: java.lang.Exception -> L47
            int r4 = r2.indexOf(r3)     // Catch: java.lang.Exception -> L47
            if (r4 != r1) goto L28
            r2.append(r3)     // Catch: java.lang.Exception -> L47
            java.lang.String r3 = "|"
            r2.append(r3)     // Catch: java.lang.Exception -> L47
            goto L28
        L47:
            r0 = r2
            goto L6b
        L49:
            r2 = r0
        L4a:
            if (r2 != 0) goto L4d
            return r0
        L4d:
            int r5 = r2.length()     // Catch: java.lang.Exception -> L47
            if (r5 <= 0) goto L6c
            int r5 = r2.length()     // Catch: java.lang.Exception -> L47
            int r5 = r5 + (-1)
            char r5 = r2.charAt(r5)     // Catch: java.lang.Exception -> L47
            r0 = 124(0x7c, float:1.74E-43)
            if (r5 != r0) goto L6c
            int r5 = r2.length()     // Catch: java.lang.Exception -> L47
            int r5 = r5 + (-1)
            r2.deleteCharAt(r5)     // Catch: java.lang.Exception -> L47
            goto L6c
        L6b:
            r2 = r0
        L6c:
            java.lang.String r5 = r2.toString()
            return r5
    }

    public static java.lang.String n(android.content.Context r0) {
            java.lang.String r0 = "RISK_EXCEPTION_HAPPEN"
            return r0
    }

    public static java.lang.String o(android.content.Context r0) {
            java.lang.String r0 = "RISK_GET_FIELD_EMPTY"
            return r0
    }

    public static java.lang.String p(android.content.Context r0) {
            java.lang.String r0 = "RISK_AUTH_FAILED"
            return r0
    }

    public static java.lang.String q(android.content.Context r3) {
            java.lang.String r0 = com.kuaishou.weapon.p0.bh.a     // Catch: java.lang.Throwable -> L27
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L27
            if (r0 == 0) goto L27
            android.content.pm.PackageManager r0 = r3.getPackageManager()     // Catch: java.lang.Throwable -> L27
            java.lang.String r1 = r3.getPackageName()     // Catch: java.lang.Throwable -> L27
            r2 = 0
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r1, r2)     // Catch: java.lang.Throwable -> L27
            android.content.pm.ApplicationInfo r1 = r0.applicationInfo     // Catch: java.lang.Throwable -> L27
            android.content.pm.PackageManager r3 = r3.getPackageManager()     // Catch: java.lang.Throwable -> L27
            java.lang.CharSequence r3 = r1.loadLabel(r3)     // Catch: java.lang.Throwable -> L27
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L27
            com.kuaishou.weapon.p0.bh.b = r3     // Catch: java.lang.Throwable -> L27
            java.lang.String r3 = r0.versionName     // Catch: java.lang.Throwable -> L27
            com.kuaishou.weapon.p0.bh.a = r3     // Catch: java.lang.Throwable -> L27
        L27:
            java.lang.String r3 = com.kuaishou.weapon.p0.bh.a
            return r3
    }

    public static java.lang.String r(android.content.Context r0) {
            java.lang.String r0 = com.kuaishou.weapon.p0.bh.b
            return r0
    }

    public static java.lang.String s(android.content.Context r0) {
            java.lang.String r0 = r0.getPackageName()     // Catch: java.lang.Throwable -> L5
            return r0
        L5:
            java.lang.String r0 = ""
            return r0
    }

    @android.annotation.TargetApi(23)
    public static int t(android.content.Context r1) {
            com.kwad.sdk.e.b r1 = com.kwad.sdk.e.b.Mo()     // Catch: java.lang.Throwable -> L22
            java.lang.String r1 = r1.Mi()     // Catch: java.lang.Throwable -> L22
            java.lang.String r1 = c(r1)     // Catch: java.lang.Throwable -> L22
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L22
            if (r0 != 0) goto L20
            java.lang.String r0 = "RISK"
            boolean r0 = r1.startsWith(r0)     // Catch: java.lang.Throwable -> L22
            if (r0 == 0) goto L1b
            goto L20
        L1b:
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.Throwable -> L22
            return r1
        L20:
            r1 = -1
            return r1
        L22:
            r1 = -2
            return r1
    }

    @android.annotation.TargetApi(22)
    public static int u(android.content.Context r1) {
            com.kwad.sdk.e.b r1 = com.kwad.sdk.e.b.Mo()     // Catch: java.lang.Throwable -> L22
            java.lang.String r1 = r1.Mj()     // Catch: java.lang.Throwable -> L22
            java.lang.String r1 = c(r1)     // Catch: java.lang.Throwable -> L22
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L22
            if (r0 != 0) goto L20
            java.lang.String r0 = "RISK"
            boolean r0 = r1.startsWith(r0)     // Catch: java.lang.Throwable -> L22
            if (r0 == 0) goto L1b
            goto L20
        L1b:
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.Throwable -> L22
            return r1
        L20:
            r1 = -1
            return r1
        L22:
            r1 = -2
            return r1
    }

    public static java.lang.String v(android.content.Context r0) {
            java.lang.String r0 = "RISK_GET_FIELD_EMPTY"
            return r0
    }

    public static java.lang.String w(android.content.Context r0) {
            com.kwad.sdk.e.b r0 = com.kwad.sdk.e.b.Mo()     // Catch: java.lang.Throwable -> Ld
            java.lang.String r0 = r0.getOaid()     // Catch: java.lang.Throwable -> Ld
            java.lang.String r0 = c(r0)     // Catch: java.lang.Throwable -> Ld
            return r0
        Ld:
            java.lang.String r0 = ""
            return r0
    }

    public static java.lang.String x(android.content.Context r29) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            android.content.pm.PackageManager r1 = r29.getPackageManager()     // Catch: java.lang.Exception -> L5e
            java.lang.String r2 = "android.hardware.camera"
            java.lang.String r3 = "android.hardware.camera.autofocus"
            java.lang.String r4 = "android.hardware.camera.flash"
            java.lang.String r5 = "android.hardware.location"
            java.lang.String r6 = "android.hardware.location.gps"
            java.lang.String r7 = "android.hardware.location.network"
            java.lang.String r8 = "android.hardware.microphone"
            java.lang.String r9 = "android.hardware.sensor.compass"
            java.lang.String r10 = "android.hardware.sensor.accelerometer"
            java.lang.String r11 = "android.hardware.sensor.light"
            java.lang.String r12 = "android.hardware.sensor.proximity"
            java.lang.String r13 = "android.hardware.telephony"
            java.lang.String r14 = "android.hardware.telephony.cdma"
            java.lang.String r15 = "android.hardware.telephony.gsm"
            java.lang.String r16 = "android.hardware.touchscreen"
            java.lang.String r17 = "android.hardware.touchscreen.multitouch"
            java.lang.String r18 = "android.hardware.touchscreen.multitouch.distinct"
            java.lang.String r19 = "android.hardware.camera.front"
            java.lang.String r20 = "android.hardware.wifi"
            java.lang.String r21 = "android.hardware.bluetooth"
            java.lang.String r22 = "android.hardware.nfc"
            java.lang.String r23 = "android.hardware.fingerprint"
            java.lang.String r24 = "android.hardware.biometrics.face"
            java.lang.String r25 = "android.hardware.screen.portrait"
            java.lang.String r26 = "android.hardware.screen.landscape"
            java.lang.String r27 = "android.hardware.faketouch"
            java.lang.String r28 = "android.hardware.audio.output"
            java.lang.String[] r2 = new java.lang.String[]{r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28}     // Catch: java.lang.Exception -> L5e
            r3 = 0
        L44:
            r4 = 27
            if (r3 >= r4) goto L5e
            r4 = r2[r3]     // Catch: java.lang.Exception -> L5e
            boolean r4 = r1.hasSystemFeature(r4)     // Catch: java.lang.Exception -> L5e
            if (r4 == 0) goto L56
            java.lang.String r4 = "1"
            r0.append(r4)     // Catch: java.lang.Exception -> L5e
            goto L5b
        L56:
            java.lang.String r4 = "0"
            r0.append(r4)     // Catch: java.lang.Exception -> L5e
        L5b:
            int r3 = r3 + 1
            goto L44
        L5e:
            java.lang.String r0 = r0.toString()
            return r0
    }

    public static java.lang.String y(android.content.Context r6) {
            java.lang.String r0 = ""
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L3a
            r1.<init>()     // Catch: java.lang.Exception -> L3a
            org.json.JSONObject r6 = z(r6)     // Catch: java.lang.Exception -> L3a
            if (r6 == 0) goto L3a
            java.util.Iterator r2 = r6.keys()     // Catch: java.lang.Exception -> L3a
            if (r2 == 0) goto L3a
            r3 = r0
        L14:
            boolean r4 = r2.hasNext()     // Catch: java.lang.Exception -> L3a
            if (r4 == 0) goto L35
            java.lang.Object r4 = r2.next()     // Catch: java.lang.Exception -> L3a
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Exception -> L3a
            java.lang.String r5 = r6.getString(r4)     // Catch: java.lang.Exception -> L3a
            r1.append(r3)     // Catch: java.lang.Exception -> L3a
            java.lang.String r3 = ";"
            r1.append(r4)     // Catch: java.lang.Exception -> L3a
            java.lang.String r4 = "="
            r1.append(r4)     // Catch: java.lang.Exception -> L3a
            r1.append(r5)     // Catch: java.lang.Exception -> L3a
            goto L14
        L35:
            java.lang.String r6 = r1.toString()     // Catch: java.lang.Exception -> L3a
            return r6
        L3a:
            return r0
    }

    private static org.json.JSONObject z(android.content.Context r10) {
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L83
            r0.<init>()     // Catch: java.lang.Exception -> L83
            java.lang.String r1 = com.kuaishou.weapon.p0.WeaponHI.sUserId     // Catch: java.lang.Exception -> L83
            java.lang.String r2 = m()     // Catch: java.lang.Exception -> L83
            java.lang.String r3 = com.kuaishou.weapon.p0.WeaponHI.sChannel     // Catch: java.lang.Exception -> L83
            java.lang.String r4 = l()     // Catch: java.lang.Exception -> L83
            java.lang.String r5 = k()     // Catch: java.lang.Exception -> L83
            java.lang.String r6 = "userId"
            boolean r7 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L83
            java.lang.String r8 = "UTF-8"
            java.lang.String r9 = ""
            if (r7 == 0) goto L23
            r1 = r9
            goto L27
        L23:
            java.lang.String r1 = java.net.URLEncoder.encode(r1, r8)     // Catch: java.lang.Exception -> L83
        L27:
            r0.put(r6, r1)     // Catch: java.lang.Exception -> L83
            java.lang.String r1 = "platform"
            boolean r6 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> L83
            if (r6 == 0) goto L34
            r2 = r9
            goto L38
        L34:
            java.lang.String r2 = java.net.URLEncoder.encode(r2, r8)     // Catch: java.lang.Exception -> L83
        L38:
            r0.put(r1, r2)     // Catch: java.lang.Exception -> L83
            java.lang.String r1 = "channel"
            boolean r2 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L83
            if (r2 == 0) goto L45
            r2 = r9
            goto L49
        L45:
            java.lang.String r2 = java.net.URLEncoder.encode(r3, r8)     // Catch: java.lang.Exception -> L83
        L49:
            r0.put(r1, r2)     // Catch: java.lang.Exception -> L83
            java.lang.String r1 = "re_po_rt"
            com.kuaishou.weapon.p0.h r10 = com.kuaishou.weapon.p0.h.a(r10, r1)     // Catch: java.lang.Exception -> L82
            java.lang.String r1 = "a1_p_s_p_s"
            boolean r10 = r10.e(r1)     // Catch: java.lang.Exception -> L82
            java.lang.String r1 = "sysver"
            java.lang.String r2 = "mod"
            if (r10 == 0) goto L7c
            boolean r10 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Exception -> L82
            if (r10 == 0) goto L66
            r10 = r9
            goto L6a
        L66:
            java.lang.String r10 = java.net.URLEncoder.encode(r4, r8)     // Catch: java.lang.Exception -> L82
        L6a:
            r0.put(r2, r10)     // Catch: java.lang.Exception -> L82
            boolean r10 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Exception -> L82
            if (r10 == 0) goto L74
            goto L78
        L74:
            java.lang.String r9 = java.net.URLEncoder.encode(r5, r8)     // Catch: java.lang.Exception -> L82
        L78:
            r0.put(r1, r9)     // Catch: java.lang.Exception -> L82
            return r0
        L7c:
            r0.put(r2, r9)     // Catch: java.lang.Exception -> L82
            r0.put(r1, r9)     // Catch: java.lang.Exception -> L82
        L82:
            return r0
        L83:
            r10 = 0
            return r10
    }
}
