package com.yxcorp.kuaishou.addfp.c.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class a {
    public a() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.String a() {
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.lang.String r1 = "XIAOMI"
            boolean r2 = r0.equalsIgnoreCase(r1)
            if (r2 != 0) goto Lc6
            java.lang.String r2 = android.os.Build.BRAND
            boolean r1 = r2.equalsIgnoreCase(r1)
            if (r1 != 0) goto Lc6
            java.lang.String r1 = "REDMI"
            boolean r1 = r2.equalsIgnoreCase(r1)
            if (r1 != 0) goto Lc6
            java.lang.String r1 = "MEITU"
            boolean r1 = r2.equalsIgnoreCase(r1)
            if (r1 != 0) goto Lc6
            java.lang.String r1 = "ro.miui.ui.version.name"
            java.lang.String r3 = ""
            java.lang.String r1 = a(r1, r3)
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto Lc6
            java.lang.String r1 = "BLACKSHARK"
            boolean r4 = r0.equalsIgnoreCase(r1)
            if (r4 != 0) goto Lc6
            boolean r1 = r2.equalsIgnoreCase(r1)
            if (r1 != 0) goto Lc6
            java.lang.String r1 = "SAMSUNG"
            boolean r4 = r0.equalsIgnoreCase(r1)
            if (r4 != 0) goto Lc3
            boolean r1 = r2.equalsIgnoreCase(r1)
            if (r1 != 0) goto Lc3
            java.lang.String r1 = "VIVO"
            boolean r4 = r0.equalsIgnoreCase(r1)
            if (r4 != 0) goto Lc0
            boolean r1 = r2.equalsIgnoreCase(r1)
            if (r1 != 0) goto Lc0
            java.lang.String r1 = "IQOO"
            boolean r1 = r2.equalsIgnoreCase(r1)
            if (r1 != 0) goto Lc0
            java.lang.String r1 = "ro.vivo.os.version"
            java.lang.String r1 = a(r1, r3)
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto Lc0
            java.lang.String r1 = "HUAWEI"
            boolean r4 = r0.equalsIgnoreCase(r1)
            if (r4 != 0) goto Lbd
            boolean r1 = r2.equalsIgnoreCase(r1)
            if (r1 != 0) goto Lbd
            java.lang.String r1 = "OPPO"
            boolean r4 = r0.equalsIgnoreCase(r1)
            if (r4 != 0) goto Lba
            boolean r1 = r2.equalsIgnoreCase(r1)
            if (r1 != 0) goto Lba
            java.lang.String r1 = "REALME"
            boolean r1 = r2.equalsIgnoreCase(r1)
            if (r1 != 0) goto Lba
            java.lang.String r1 = "ro.build.version.opporom"
            java.lang.String r1 = a(r1, r3)
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto Lba
            java.lang.String r1 = "ONEPLUS"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto Lba
            boolean r0 = r2.equalsIgnoreCase(r1)
            if (r0 != 0) goto Lba
            java.lang.String r0 = "HONOR"
            boolean r0 = r2.equalsIgnoreCase(r0)
            if (r0 == 0) goto Lb7
            java.lang.String r0 = "7"
            return r0
        Lb7:
            java.lang.String r0 = "0"
            return r0
        Lba:
            java.lang.String r0 = "5"
            return r0
        Lbd:
            java.lang.String r0 = "1"
            return r0
        Lc0:
            java.lang.String r0 = "2"
            return r0
        Lc3:
            java.lang.String r0 = "3"
            return r0
        Lc6:
            java.lang.String r0 = "4"
            return r0
    }

    public static java.lang.String a(int r7, java.lang.String r8) {
            com.yxcorp.kuaishou.addfp.KWEGIDDFP r0 = com.yxcorp.kuaishou.addfp.KWEGIDDFP.instance()
            android.content.Context r0 = r0.getParamContext()
            java.lang.String r1 = ""
            if (r0 != 0) goto Ld
            return r1
        Ld:
            java.lang.String r2 = new java.lang.String
            java.lang.String r3 = "U3lzdGVtQFNlY3VyZUBHbG9iYWw="
            r4 = 0
            byte[] r3 = android.util.Base64.decode(r3, r4)
            r2.<init>(r3)
            java.lang.String r3 = "@"
            java.lang.String[] r2 = r2.split(r3)
            r3 = r2[r4]
            r4 = 1
            r5 = r2[r4]
            r6 = 2
            r2 = r2[r6]
            if (r7 == 0) goto L55
            if (r7 == r4) goto L42
            if (r7 != r6) goto L40
            java.lang.String r7 = com.yxcorp.kuaishou.addfp.android.b.a.a(r0, r2, r8)
            boolean r2 = android.text.TextUtils.isEmpty(r7)
            if (r2 == 0) goto L67
            android.content.ContentResolver r7 = r0.getContentResolver()
            java.lang.String r7 = android.provider.Settings.Global.getString(r7, r8)
            goto L67
        L40:
            r7 = r1
            goto L67
        L42:
            java.lang.String r7 = com.yxcorp.kuaishou.addfp.android.b.a.a(r0, r5, r8)
            boolean r2 = android.text.TextUtils.isEmpty(r7)
            if (r2 == 0) goto L67
            android.content.ContentResolver r7 = r0.getContentResolver()
            java.lang.String r7 = android.provider.Settings.Secure.getString(r7, r8)
            goto L67
        L55:
            java.lang.String r7 = com.yxcorp.kuaishou.addfp.android.b.a.a(r0, r3, r8)
            boolean r2 = android.text.TextUtils.isEmpty(r7)
            if (r2 == 0) goto L67
            android.content.ContentResolver r7 = r0.getContentResolver()
            java.lang.String r7 = android.provider.Settings.System.getString(r7, r8)
        L67:
            if (r7 != 0) goto L6a
            return r1
        L6a:
            return r7
    }

    public static java.lang.String a(android.content.Context r8) {
            java.lang.String r0 = "k_w_o_d_out_dtt"
            java.lang.String r1 = a(r8, r0)     // Catch: java.lang.Throwable -> Ldd
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> Ldd
            java.lang.String r3 = "Lm91a2R0ZnQ="
            java.lang.String r4 = "android.permission.WRITE_EXTERNAL_STORAGE"
            java.lang.String r5 = "android.permission.READ_EXTERNAL_STORAGE"
            java.lang.String r6 = "KWE_N"
            java.lang.String r7 = ""
            if (r2 == 0) goto L44
            com.yxcorp.kuaishou.addfp.android.a.d r2 = com.yxcorp.kuaishou.addfp.android.a.d.a(r8)     // Catch: java.lang.Throwable -> Ldd
            boolean r2 = r2.b()     // Catch: java.lang.Throwable -> Ldd
            if (r2 != 0) goto L3f
            java.lang.String[] r2 = new java.lang.String[]{r5, r4}     // Catch: java.lang.Throwable -> Ldd
            boolean r2 = com.yxcorp.kuaishou.addfp.android.b.f.a(r8, r2)     // Catch: java.lang.Throwable -> Ldd
            if (r2 == 0) goto L41
            com.yxcorp.kuaishou.addfp.android.a.d r2 = com.yxcorp.kuaishou.addfp.android.a.d.a(r8)     // Catch: java.lang.Throwable -> Ldd
            java.lang.String r7 = r2.a(r3)     // Catch: java.lang.Throwable -> Ldd
            boolean r2 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> Ldd
            if (r2 != 0) goto L3f
            android.content.ContentResolver r2 = r8.getContentResolver()     // Catch: java.lang.Throwable -> L3f
            android.provider.Settings.System.putString(r2, r0, r7)     // Catch: java.lang.Throwable -> L3f
        L3f:
            r0 = r6
            goto L6a
        L41:
            java.lang.String r0 = "KWE_PN"
            goto L6a
        L44:
            com.yxcorp.kuaishou.addfp.android.a.d r0 = com.yxcorp.kuaishou.addfp.android.a.d.a(r8)     // Catch: java.lang.Throwable -> Ldd
            boolean r0 = r0.b()     // Catch: java.lang.Throwable -> Ldd
            if (r0 != 0) goto L3f
            java.lang.String[] r0 = new java.lang.String[]{r5, r4}     // Catch: java.lang.Throwable -> Ldd
            boolean r0 = com.yxcorp.kuaishou.addfp.android.b.f.a(r8, r0)     // Catch: java.lang.Throwable -> Ldd
            if (r0 == 0) goto L3f
            com.yxcorp.kuaishou.addfp.android.a.d r0 = com.yxcorp.kuaishou.addfp.android.a.d.a(r8)     // Catch: java.lang.Throwable -> Ldd
            java.lang.String r7 = r0.a(r3)     // Catch: java.lang.Throwable -> Ldd
            boolean r0 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> Ldd
            if (r0 == 0) goto L3f
            com.yxcorp.kuaishou.addfp.android.a.d.a(r8, r1)     // Catch: java.lang.Throwable -> Ldd
            goto L3f
        L6a:
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> Ldd
            if (r2 == 0) goto L77
            boolean r2 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> Ldd
            if (r2 == 0) goto L77
            goto Ldf
        L77:
            com.yxcorp.kuaishou.addfp.android.a.d r2 = com.yxcorp.kuaishou.addfp.android.a.d.a(r8)     // Catch: java.lang.Throwable -> Ldd
            java.util.LinkedHashMap r1 = r2.b(r1)     // Catch: java.lang.Throwable -> Ldd
            if (r1 == 0) goto L87
            int r2 = r1.size()     // Catch: java.lang.Throwable -> Ldd
            if (r2 != 0) goto L8f
        L87:
            com.yxcorp.kuaishou.addfp.android.a.d r8 = com.yxcorp.kuaishou.addfp.android.a.d.a(r8)     // Catch: java.lang.Throwable -> Ldd
            java.util.LinkedHashMap r1 = r8.b(r7)     // Catch: java.lang.Throwable -> Ldd
        L8f:
            if (r1 == 0) goto Ldb
            int r8 = r1.size()     // Catch: java.lang.Throwable -> Ldd
            if (r8 <= 0) goto Ldb
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Ldd
            java.util.Set r2 = r1.entrySet()     // Catch: java.lang.Throwable -> Ldd
            r8.<init>(r2)     // Catch: java.lang.Throwable -> Ldd
            int r1 = r1.size()     // Catch: java.lang.Throwable -> Ldd
            java.util.ListIterator r8 = r8.listIterator(r1)     // Catch: java.lang.Throwable -> Ldd
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Ldd
            r1.<init>()     // Catch: java.lang.Throwable -> Ldd
            r2 = 0
        Lae:
            boolean r3 = r8.hasPrevious()     // Catch: java.lang.Throwable -> Ldd
            if (r3 == 0) goto Ld0
            r3 = 10
            if (r2 >= r3) goto Ld0
            java.lang.Object r3 = r8.previous()     // Catch: java.lang.Throwable -> Lae
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Throwable -> Lae
            if (r3 == 0) goto Lcd
            java.lang.Object r4 = r3.getKey()     // Catch: java.lang.Throwable -> Lae
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> Lae
            java.lang.Object r3 = r3.getValue()     // Catch: java.lang.Throwable -> Lae
            r1.put(r4, r3)     // Catch: java.lang.Throwable -> Lae
        Lcd:
            int r2 = r2 + 1
            goto Lae
        Ld0:
            int r8 = r1.length()     // Catch: java.lang.Throwable -> Ldd
            if (r8 <= 0) goto Ldb
            java.lang.String r8 = r1.toString()     // Catch: java.lang.Throwable -> Ldd
            return r8
        Ldb:
            r6 = r0
            goto Ldf
        Ldd:
            java.lang.String r6 = "KWE_PE"
        Ldf:
            return r6
    }

    public static java.lang.String a(android.content.Context r0, java.lang.String r1) {
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch: java.lang.Throwable -> L9
            java.lang.String r0 = android.provider.Settings.System.getString(r0, r1)     // Catch: java.lang.Throwable -> L9
            return r0
        L9:
            java.lang.String r0 = ""
            return r0
    }

    public static java.lang.String a(java.lang.String r7, java.lang.String r8) {
            java.lang.String r0 = "android.os.SystemProperties"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L24
            java.lang.String r1 = "get"
            r2 = 2
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L24
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r5 = 0
            r3[r5] = r4     // Catch: java.lang.Exception -> L24
            r6 = 1
            r3[r6] = r4     // Catch: java.lang.Exception -> L24
            java.lang.reflect.Method r1 = r0.getMethod(r1, r3)     // Catch: java.lang.Exception -> L24
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L24
            r2[r5] = r7     // Catch: java.lang.Exception -> L24
            r2[r6] = r8     // Catch: java.lang.Exception -> L24
            java.lang.Object r7 = r1.invoke(r0, r2)     // Catch: java.lang.Exception -> L24
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Exception -> L24
            goto L25
        L24:
            r7 = 0
        L25:
            if (r7 != 0) goto L29
            java.lang.String r7 = ""
        L29:
            return r7
    }
}
