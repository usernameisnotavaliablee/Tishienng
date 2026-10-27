package com.huawei.secure.android.common.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class k {
    static final java.lang.String a = "file:///android_res/";

    public k() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean a(java.lang.String r0) {
            boolean r0 = android.webkit.URLUtil.isAboutUrl(r0)
            return r0
    }

    public static boolean b(java.lang.String r0) {
            boolean r0 = android.webkit.URLUtil.isAssetUrl(r0)
            return r0
    }

    public static boolean c(java.lang.String r0) {
            boolean r0 = android.webkit.URLUtil.isContentUrl(r0)
            return r0
    }

    public static boolean d(java.lang.String r0) {
            boolean r0 = android.webkit.URLUtil.isDataUrl(r0)
            return r0
    }

    public static boolean e(java.lang.String r0) {
            boolean r0 = android.webkit.URLUtil.isFileUrl(r0)
            return r0
    }

    public static boolean f(java.lang.String r0) {
            boolean r0 = android.webkit.URLUtil.isHttpUrl(r0)
            return r0
    }

    public static boolean g(java.lang.String r0) {
            boolean r0 = android.webkit.URLUtil.isHttpsUrl(r0)
            return r0
    }

    public static boolean h(java.lang.String r0) {
            boolean r0 = android.webkit.URLUtil.isJavaScriptUrl(r0)
            return r0
    }

    public static boolean i(java.lang.String r0) {
            boolean r0 = android.webkit.URLUtil.isNetworkUrl(r0)
            return r0
    }

    public static boolean j(java.lang.String r1) {
            if (r1 == 0) goto Lc
            java.lang.String r0 = "file:///android_res/"
            boolean r1 = r1.startsWith(r0)
            if (r1 == 0) goto Lc
            r1 = 1
            return r1
        Lc:
            r1 = 0
            return r1
    }

    public static boolean k(java.lang.String r0) {
            boolean r0 = android.webkit.URLUtil.isValidUrl(r0)
            return r0
    }
}
