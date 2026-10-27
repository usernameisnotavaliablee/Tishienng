package com.huawei.secure.android.common.webview;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class d {
    private static final java.lang.String a = "UriUtil";

    public d() {
            r0 = this;
            r0.<init>()
            return
    }

    private static java.lang.String a(java.lang.String r1) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto Lf
            java.lang.String r1 = "UriUtil"
            java.lang.String r0 = "whiteListUrl is null"
            com.huawei.secure.android.common.util.e.r(r1, r0)
            r1 = 0
            return r1
        Lf:
            boolean r0 = android.webkit.URLUtil.isNetworkUrl(r1)
            if (r0 != 0) goto L16
            return r1
        L16:
            java.lang.String r1 = b(r1)
            return r1
    }

    @android.annotation.TargetApi(9)
    public static java.lang.String b(java.lang.String r4) {
            java.lang.String r0 = ""
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            java.lang.String r2 = "UriUtil"
            if (r1 == 0) goto L10
            java.lang.String r0 = "url is null"
            com.huawei.secure.android.common.util.e.r(r2, r0)
            return r4
        L10:
            boolean r1 = android.webkit.URLUtil.isNetworkUrl(r4)     // Catch: java.net.MalformedURLException -> L1c
            if (r1 != 0) goto L1e
            java.lang.String r4 = "url don't starts with http or https"
            com.huawei.secure.android.common.util.e.l(r2, r4)     // Catch: java.net.MalformedURLException -> L1c
            return r0
        L1c:
            r4 = move-exception
            goto L30
        L1e:
            java.lang.String r1 = "[\\\\#]"
            java.lang.String r3 = "/"
            java.lang.String r4 = r4.replaceAll(r1, r3)     // Catch: java.net.MalformedURLException -> L1c
            java.net.URL r1 = new java.net.URL     // Catch: java.net.MalformedURLException -> L1c
            r1.<init>(r4)     // Catch: java.net.MalformedURLException -> L1c
            java.lang.String r4 = r1.getHost()     // Catch: java.net.MalformedURLException -> L1c
            return r4
        L30:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "getHostByURI error  MalformedURLException : "
            r1.append(r3)
            java.lang.String r4 = r4.getMessage()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            com.huawei.secure.android.common.util.e.l(r2, r4)
            return r0
    }

    public static boolean c(java.lang.String r4, java.lang.String[] r5) {
            r0 = 0
            if (r5 == 0) goto L19
            int r1 = r5.length
            if (r1 != 0) goto L7
            goto L19
        L7:
            int r1 = r5.length
            r2 = 0
        L9:
            if (r2 >= r1) goto L18
            r3 = r5[r2]
            boolean r3 = d(r4, r3)
            if (r3 == 0) goto L15
            r4 = 1
            return r4
        L15:
            int r2 = r2 + 1
            goto L9
        L18:
            return r0
        L19:
            java.lang.String r4 = "UriUtil"
            java.lang.String r5 = "whitelist is null"
            com.huawei.secure.android.common.util.e.l(r4, r5)
            return r0
    }

    public static boolean d(java.lang.String r4, java.lang.String r5) {
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            r1 = 0
            if (r0 != 0) goto L81
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto Lf
            goto L81
        Lf:
            java.lang.String r0 = ".."
            boolean r0 = r4.contains(r0)
            if (r0 != 0) goto L81
            java.lang.String r0 = "@"
            boolean r0 = r4.contains(r0)
            if (r0 == 0) goto L20
            goto L81
        L20:
            boolean r0 = r5.equals(r4)
            r2 = 1
            if (r0 != 0) goto L80
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            java.lang.String r3 = "?"
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            boolean r0 = r4.startsWith(r0)
            if (r0 != 0) goto L80
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            java.lang.String r3 = "#"
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            boolean r0 = r4.startsWith(r0)
            if (r0 == 0) goto L56
            goto L80
        L56:
            java.lang.String r0 = "/"
            boolean r0 = r5.endsWith(r0)
            if (r0 != 0) goto L5f
            return r1
        L5f:
            android.net.Uri r0 = android.net.Uri.parse(r5)
            java.util.List r0 = r0.getPathSegments()
            android.net.Uri r3 = android.net.Uri.parse(r4)
            java.util.List r3 = r3.getPathSegments()
            int r3 = r3.size()
            int r0 = r0.size()
            int r3 = r3 - r0
            if (r3 == r2) goto L7b
            return r1
        L7b:
            boolean r4 = r4.startsWith(r5)
            return r4
        L80:
            return r2
        L81:
            return r1
    }

    public static boolean e(java.lang.String r4, java.lang.String[] r5) {
            r0 = 0
            if (r5 == 0) goto L19
            int r1 = r5.length
            if (r1 != 0) goto L7
            goto L19
        L7:
            int r1 = r5.length
            r2 = 0
        L9:
            if (r2 >= r1) goto L18
            r3 = r5[r2]
            boolean r3 = f(r4, r3)
            if (r3 == 0) goto L15
            r4 = 1
            return r4
        L15:
            int r2 = r2 + 1
            goto L9
        L18:
            return r0
        L19:
            java.lang.String r4 = "UriUtil"
            java.lang.String r5 = "whitelist is null"
            com.huawei.secure.android.common.util.e.l(r4, r5)
            return r0
    }

    public static boolean f(java.lang.String r3, java.lang.String r4) {
            java.lang.String r3 = b(r3)
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            java.lang.String r1 = "UriUtil"
            r2 = 0
            if (r0 != 0) goto L80
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L14
            goto L80
        L14:
            java.lang.String r4 = a(r4)
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L1f
            return r2
        L1f:
            boolean r0 = r4.equals(r3)
            if (r0 == 0) goto L27
            r3 = 1
            return r3
        L27:
            boolean r0 = r3.endsWith(r4)
            if (r0 == 0) goto L7f
            int r0 = r3.length()     // Catch: java.lang.Exception -> L4a java.lang.IndexOutOfBoundsException -> L4c
            int r4 = r4.length()     // Catch: java.lang.Exception -> L4a java.lang.IndexOutOfBoundsException -> L4c
            int r0 = r0 - r4
            java.lang.String r3 = r3.substring(r2, r0)     // Catch: java.lang.Exception -> L4a java.lang.IndexOutOfBoundsException -> L4c
            java.lang.String r4 = "."
            boolean r4 = r3.endsWith(r4)     // Catch: java.lang.Exception -> L4a java.lang.IndexOutOfBoundsException -> L4c
            if (r4 != 0) goto L43
            return r2
        L43:
            java.lang.String r4 = "^[A-Za-z0-9.-]+$"
            boolean r3 = r3.matches(r4)     // Catch: java.lang.Exception -> L4a java.lang.IndexOutOfBoundsException -> L4c
            return r3
        L4a:
            r3 = move-exception
            goto L4e
        L4c:
            r3 = move-exception
            goto L67
        L4e:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "Exception : "
            r4.append(r0)
            java.lang.String r3 = r3.getMessage()
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            com.huawei.secure.android.common.util.e.l(r1, r3)
            return r2
        L67:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "IndexOutOfBoundsException"
            r4.append(r0)
            java.lang.String r3 = r3.getMessage()
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            com.huawei.secure.android.common.util.e.l(r1, r3)
        L7f:
            return r2
        L80:
            java.lang.String r3 = "url or whitelist is null"
            com.huawei.secure.android.common.util.e.l(r1, r3)
            return r2
    }

    public static boolean g(java.lang.String r1, java.lang.String r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L1a
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto Ld
            goto L1a
        Ld:
            java.lang.String r1 = b(r1)
            java.lang.String r2 = a(r2)
            boolean r1 = android.text.TextUtils.equals(r1, r2)
            return r1
        L1a:
            r1 = 0
            return r1
    }

    public static boolean h(java.lang.String r4, java.lang.String[] r5) {
            r0 = 0
            if (r5 == 0) goto L19
            int r1 = r5.length
            if (r1 != 0) goto L7
            goto L19
        L7:
            int r1 = r5.length
            r2 = 0
        L9:
            if (r2 >= r1) goto L18
            r3 = r5[r2]
            boolean r3 = g(r4, r3)
            if (r3 == 0) goto L15
            r4 = 1
            return r4
        L15:
            int r2 = r2 + 1
            goto L9
        L18:
            return r0
        L19:
            java.lang.String r4 = "UriUtil"
            java.lang.String r5 = "whitelist is null"
            com.huawei.secure.android.common.util.e.l(r4, r5)
            return r0
    }
}
