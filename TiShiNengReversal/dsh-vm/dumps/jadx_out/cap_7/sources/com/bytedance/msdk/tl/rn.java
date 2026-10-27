package com.bytedance.msdk.tl;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class rn {
    private static java.lang.String cw = null;
    private static java.lang.String j = null;
    private static java.lang.String r = "ToolUtils";
    private static java.lang.String xt;

    static {
            return
    }

    public rn() {
            r1 = this;
            r1.<init>()
            return
    }

    public static synchronized java.lang.String cw() {
            java.lang.Class<com.bytedance.msdk.tl.rn> r0 = com.bytedance.msdk.tl.rn.class
            monitor-enter(r0)
            java.lang.String r1 = com.bytedance.msdk.tl.rn.cw     // Catch: java.lang.Throwable -> L44
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L44
            if (r1 == 0) goto L46
            android.content.Context r1 = com.bytedance.msdk.core.xt.getContext()     // Catch: java.lang.Throwable -> L44
            if (r1 == 0) goto L46
            java.lang.String r1 = j()     // Catch: java.lang.Throwable -> L2f
            android.content.Context r2 = com.bytedance.msdk.core.xt.getContext()     // Catch: java.lang.Throwable -> L2f
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch: java.lang.Throwable -> L2f
            r3 = 0
            android.content.pm.PackageInfo r1 = r2.getPackageInfo(r1, r3)     // Catch: java.lang.Throwable -> L2f
            int r2 = r1.versionCode     // Catch: java.lang.Throwable -> L2f
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> L2f
            com.bytedance.msdk.tl.rn.xt = r2     // Catch: java.lang.Throwable -> L2f
            java.lang.String r1 = r1.versionName     // Catch: java.lang.Throwable -> L2f
            com.bytedance.msdk.tl.rn.cw = r1     // Catch: java.lang.Throwable -> L2f
            goto L46
        L2f:
            r1 = move-exception
            java.lang.String r2 = com.bytedance.msdk.tl.rn.r     // Catch: java.lang.Throwable -> L44
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L44
            java.lang.String r4 = "ToolUtils getVersionName throws exception :"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L44
            r3.append(r1)     // Catch: java.lang.Throwable -> L44
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> L44
            com.bytedance.msdk.j.up.cw.r(r2, r1)     // Catch: java.lang.Throwable -> L44
            goto L46
        L44:
            r1 = move-exception
            goto L4a
        L46:
            java.lang.String r1 = com.bytedance.msdk.tl.rn.cw     // Catch: java.lang.Throwable -> L44
            monitor-exit(r0)
            return r1
        L4a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L44
            throw r1
    }

    private static java.lang.String cw(java.lang.String r2) {
            java.lang.String r0 = com.bytedance.msdk.tl.j.j(r2)
            if (r2 != 0) goto L17
            java.lang.String r2 = com.bytedance.msdk.tl.xt.j()
            java.lang.String r2 = r2.concat(r2)
            r0 = 8
            r1 = 24
            java.lang.String r2 = r2.substring(r0, r1)
            return r2
        L17:
            return r0
    }

    public static synchronized java.lang.String j() {
            java.lang.Class<com.bytedance.msdk.tl.rn> r0 = com.bytedance.msdk.tl.rn.class
            monitor-enter(r0)
            java.lang.String r1 = com.bytedance.msdk.tl.rn.j     // Catch: java.lang.Throwable -> L31
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L31
            if (r1 == 0) goto L33
            android.content.Context r1 = com.bytedance.msdk.core.xt.getContext()     // Catch: java.lang.Throwable -> L31
            if (r1 == 0) goto L33
            android.content.Context r1 = com.bytedance.msdk.core.xt.getContext()     // Catch: java.lang.Throwable -> L1c
            java.lang.String r1 = r1.getPackageName()     // Catch: java.lang.Throwable -> L1c
            com.bytedance.msdk.tl.rn.j = r1     // Catch: java.lang.Throwable -> L1c
            goto L33
        L1c:
            r1 = move-exception
            java.lang.String r2 = com.bytedance.msdk.tl.rn.r     // Catch: java.lang.Throwable -> L31
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L31
            java.lang.String r4 = "ToolUtils getPackageName throws exception :"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L31
            r3.append(r1)     // Catch: java.lang.Throwable -> L31
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> L31
            com.bytedance.msdk.j.up.cw.r(r2, r1)     // Catch: java.lang.Throwable -> L31
            goto L33
        L31:
            r1 = move-exception
            goto L37
        L33:
            java.lang.String r1 = com.bytedance.msdk.tl.rn.j     // Catch: java.lang.Throwable -> L31
            monitor-exit(r0)
            return r1
        L37:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L31
            throw r1
    }

    public static java.lang.String j(java.lang.String r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L1f
            int r0 = r2.length()
            r1 = 17
            if (r0 < r1) goto L1f
            r0 = 1
            java.lang.String r0 = r2.substring(r0, r1)
            java.lang.String r0 = cw(r0)
            java.lang.String r2 = r2.substring(r1)
            java.lang.String r2 = com.bytedance.msdk.tl.j.xt(r2, r0)
        L1f:
            return r2
    }

    public static java.lang.String j(byte[] r2) {
            r0 = 0
            if (r2 == 0) goto L1f
            int r1 = r2.length     // Catch: java.lang.Exception -> L1b
            if (r1 != 0) goto L7
            goto L1f
        L7:
            com.bytedance.sdk.component.panglearmor.g r1 = com.bytedance.sdk.component.panglearmor.g.j()     // Catch: java.lang.Exception -> L1b
            byte[] r2 = r1.xt(r2)     // Catch: java.lang.Exception -> L1b
            java.lang.String r2 = com.bytedance.sdk.openadsdk.core.rn.vl.xt(r2)     // Catch: java.lang.Exception -> L1b
            boolean r1 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> L1b
            if (r1 == 0) goto L1a
            return r0
        L1a:
            return r2
        L1b:
            r2 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r2)
        L1f:
            return r0
    }

    public static org.json.JSONObject j(org.json.JSONObject r8) {
            java.lang.String r0 = "cypher"
            java.lang.String r1 = "message"
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            if (r8 != 0) goto Lc
            goto L51
        Lc:
            r3 = 0
            java.lang.String r4 = com.bytedance.msdk.tl.j.j()     // Catch: java.lang.Throwable -> L47
            java.lang.String r5 = com.bytedance.msdk.tl.j.j(r4)     // Catch: java.lang.Throwable -> L47
            java.lang.String r6 = r8.toString()     // Catch: java.lang.Throwable -> L47
            java.lang.String r5 = com.bytedance.msdk.tl.j.j(r6, r5)     // Catch: java.lang.Throwable -> L47
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L47
            java.lang.String r7 = "2"
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L47
            r6.append(r4)     // Catch: java.lang.Throwable -> L47
            r6.append(r5)     // Catch: java.lang.Throwable -> L47
            java.lang.String r4 = r6.toString()     // Catch: java.lang.Throwable -> L47
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L47
            if (r5 != 0) goto L3c
            r2.put(r1, r4)     // Catch: java.lang.Throwable -> L47
            r4 = 2
            r2.put(r0, r4)     // Catch: java.lang.Throwable -> L47
            return r2
        L3c:
            java.lang.String r4 = r8.toString()     // Catch: java.lang.Throwable -> L47
            r2.put(r1, r4)     // Catch: java.lang.Throwable -> L47
            r2.put(r0, r3)     // Catch: java.lang.Throwable -> L47
            return r2
        L47:
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L51
            r2.put(r1, r8)     // Catch: java.lang.Throwable -> L51
            r2.put(r0, r3)     // Catch: java.lang.Throwable -> L51
        L51:
            return r2
    }

    public static boolean j(com.bytedance.sdk.component.g.xt r3) {
            r0 = 1
            if (r3 == 0) goto Le
            java.util.Map r1 = r3.cw()
            boolean r1 = com.bytedance.sdk.component.g.r.j.j(r1)
            if (r1 == 0) goto Le
            return r0
        Le:
            if (r3 == 0) goto L2f
            java.lang.String r1 = r3.r()
            if (r1 == 0) goto L2f
            java.lang.String r1 = r3.r()
            java.lang.String r2 = "{"
            boolean r1 = r1.startsWith(r2)
            if (r1 != 0) goto L2f
            java.lang.String r3 = r3.r()
            java.lang.String r1 = "}"
            boolean r3 = r3.endsWith(r1)
            if (r3 != 0) goto L2f
            return r0
        L2f:
            r3 = 0
            return r3
    }

    public static java.lang.String r() {
            java.lang.String r0 = "http.agent"
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch: java.lang.Exception -> L7
            goto L9
        L7:
            java.lang.String r0 = "unKnow"
        L9:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            if (r0 != 0) goto L13
            java.lang.String r0 = ""
            return r0
        L13:
            java.lang.String r2 = ";"
            int r3 = r0.lastIndexOf(r2)
            r4 = -1
            r5 = 1
            r6 = 0
            if (r3 == r4) goto L5e
            int r4 = r0.length()
            if (r4 <= r3) goto L5e
            int r3 = r3 + r5
            java.lang.String r4 = r0.substring(r6, r3)
            java.lang.String r0 = r0.substring(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r7 = " "
            r3.<init>(r7)
            java.util.Locale r7 = java.util.Locale.getDefault()
            java.lang.String r7 = r7.getLanguage()
            r3.append(r7)
            java.lang.String r7 = "-"
            r3.append(r7)
            java.util.Locale r7 = java.util.Locale.getDefault()
            java.lang.String r7 = r7.getCountry()
            r3.append(r7)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.String r2 = r4.concat(r2)
            java.lang.String r0 = r2.concat(r0)
        L5e:
            int r2 = r0.length()
            r3 = 0
        L63:
            if (r3 >= r2) goto L8a
            char r4 = r0.charAt(r3)
            r7 = 31
            if (r4 <= r7) goto L76
            r7 = 127(0x7f, float:1.78E-43)
            if (r4 < r7) goto L72
            goto L76
        L72:
            r1.append(r4)
            goto L87
        L76:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object[] r7 = new java.lang.Object[r5]
            r7[r6] = r4
            java.lang.String r4 = "\\u%04x"
            java.lang.String r4 = java.lang.String.format(r4, r7)
            r1.append(r4)
        L87:
            int r3 = r3 + 1
            goto L63
        L8a:
            java.lang.String r0 = r1.toString()
            return r0
    }

    private static byte[] r(java.lang.String r3) {
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r1 = 8192(0x2000, float:1.148E-41)
            r0.<init>(r1)
            r1 = 0
            java.util.zip.GZIPOutputStream r2 = new java.util.zip.GZIPOutputStream     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L25
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L25
            byte[] r3 = r3.getBytes()     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L20
            r2.write(r3)     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L20
            r2.close()     // Catch: java.io.IOException -> L18
            goto L2e
        L18:
            r3 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r3)
            goto L2e
        L1d:
            r3 = move-exception
            r1 = r2
            goto L33
        L20:
            r3 = move-exception
            r1 = r2
            goto L26
        L23:
            r3 = move-exception
            goto L33
        L25:
            r3 = move-exception
        L26:
            com.bytedance.sdk.component.utils.vl.j(r3)     // Catch: java.lang.Throwable -> L23
            if (r1 == 0) goto L2e
            r1.close()     // Catch: java.io.IOException -> L18
        L2e:
            byte[] r3 = r0.toByteArray()
            return r3
        L33:
            if (r1 == 0) goto L3d
            r1.close()     // Catch: java.io.IOException -> L39
            goto L3d
        L39:
            r0 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r0)
        L3d:
            throw r3
    }

    public static java.lang.String up() {
            java.security.SecureRandom r0 = new java.security.SecureRandom
            r0.<init>()
            r1 = 8
            byte[] r1 = new byte[r1]     // Catch: java.lang.Exception -> L11
            r0.nextBytes(r1)     // Catch: java.lang.Exception -> L11
            java.lang.String r0 = com.bytedance.msdk.tl.jy.j(r1)     // Catch: java.lang.Exception -> L11
            return r0
        L11:
            r0 = 0
            return r0
    }

    public static synchronized java.lang.String xt() {
            java.lang.Class<com.bytedance.msdk.tl.rn> r0 = com.bytedance.msdk.tl.rn.class
            monitor-enter(r0)
            java.lang.String r1 = com.bytedance.msdk.tl.rn.xt     // Catch: java.lang.Throwable -> L44
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L44
            if (r1 == 0) goto L46
            android.content.Context r1 = com.bytedance.msdk.core.xt.getContext()     // Catch: java.lang.Throwable -> L44
            if (r1 == 0) goto L46
            java.lang.String r1 = j()     // Catch: java.lang.Throwable -> L2f
            android.content.Context r2 = com.bytedance.msdk.core.xt.getContext()     // Catch: java.lang.Throwable -> L2f
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch: java.lang.Throwable -> L2f
            r3 = 0
            android.content.pm.PackageInfo r1 = r2.getPackageInfo(r1, r3)     // Catch: java.lang.Throwable -> L2f
            int r2 = r1.versionCode     // Catch: java.lang.Throwable -> L2f
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> L2f
            com.bytedance.msdk.tl.rn.xt = r2     // Catch: java.lang.Throwable -> L2f
            java.lang.String r1 = r1.versionName     // Catch: java.lang.Throwable -> L2f
            com.bytedance.msdk.tl.rn.cw = r1     // Catch: java.lang.Throwable -> L2f
            goto L46
        L2f:
            r1 = move-exception
            java.lang.String r2 = com.bytedance.msdk.tl.rn.r     // Catch: java.lang.Throwable -> L44
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L44
            java.lang.String r4 = "ToolUtils getVersionCode throws exception :"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L44
            r3.append(r1)     // Catch: java.lang.Throwable -> L44
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> L44
            com.bytedance.msdk.j.up.cw.r(r2, r1)     // Catch: java.lang.Throwable -> L44
            goto L46
        L44:
            r1 = move-exception
            goto L4a
        L46:
            java.lang.String r1 = com.bytedance.msdk.tl.rn.xt     // Catch: java.lang.Throwable -> L44
            monitor-exit(r0)
            return r1
        L4a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L44
            throw r1
    }

    public static byte[] xt(java.lang.String r1) {
            com.bytedance.sdk.component.panglearmor.g r0 = com.bytedance.sdk.component.panglearmor.g.j()
            byte[] r1 = r(r1)
            byte[] r1 = r0.j(r1)
            return r1
    }
}
