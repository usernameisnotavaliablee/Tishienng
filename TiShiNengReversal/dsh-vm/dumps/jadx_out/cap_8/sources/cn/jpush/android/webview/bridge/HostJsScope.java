package cn.jpush.android.webview.bridge;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class HostJsScope {
    private static cn.jpush.android.webview.bridge.d a;

    public HostJsScope() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void click(android.webkit.WebView r0, java.lang.String r1, java.lang.String r2, java.lang.String r3) {
            cn.jpush.android.webview.bridge.d r0 = cn.jpush.android.webview.bridge.HostJsScope.a
            if (r0 != 0) goto L5
            return
        L5:
            r0.click(r1, r2, r3)
            return
    }

    public static void close(android.webkit.WebView r0) {
            cn.jpush.android.webview.bridge.d r0 = cn.jpush.android.webview.bridge.HostJsScope.a
            if (r0 != 0) goto L5
            return
        L5:
            r0.close()
            return
    }

    public static void createShortcut(android.webkit.WebView r0, java.lang.String r1, java.lang.String r2, java.lang.String r3) {
            cn.jpush.android.webview.bridge.d r0 = cn.jpush.android.webview.bridge.HostJsScope.a
            if (r0 != 0) goto L5
            return
        L5:
            r0.createShortcut(r1, r2, r3)
            return
    }

    public static void download(android.webkit.WebView r0, java.lang.String r1) {
            cn.jpush.android.webview.bridge.d r0 = cn.jpush.android.webview.bridge.HostJsScope.a
            if (r0 != 0) goto L5
            return
        L5:
            r0.download(r1)
            return
    }

    public static void download(android.webkit.WebView r0, java.lang.String r1, java.lang.String r2) {
            cn.jpush.android.webview.bridge.d r0 = cn.jpush.android.webview.bridge.HostJsScope.a
            if (r0 != 0) goto L5
            return
        L5:
            r0.download(r1, r2)
            return
    }

    public static void download(android.webkit.WebView r0, java.lang.String r1, java.lang.String r2, java.lang.String r3) {
            cn.jpush.android.webview.bridge.d r0 = cn.jpush.android.webview.bridge.HostJsScope.a
            if (r0 != 0) goto L5
            return
        L5:
            r0.download(r1, r2, r3)
            return
    }

    public static void executeMsgMessage(android.webkit.WebView r0, java.lang.String r1) {
            cn.jpush.android.webview.bridge.d r0 = cn.jpush.android.webview.bridge.HostJsScope.a
            if (r0 != 0) goto L5
            return
        L5:
            r0.executeMsgMessage(r1)
            return
    }

    public static java.lang.String getDevInfo(android.webkit.WebView r0) {
            cn.jpush.android.webview.bridge.d r0 = cn.jpush.android.webview.bridge.HostJsScope.a
            if (r0 == 0) goto L9
            java.lang.String r0 = r0.getDevInfo()
            return r0
        L9:
            java.lang.String r0 = ""
            return r0
    }

    public static java.lang.String getNotificationInfo(android.webkit.WebView r0) {
            cn.jpush.android.webview.bridge.d r0 = cn.jpush.android.webview.bridge.HostJsScope.a
            if (r0 == 0) goto L9
            java.lang.String r0 = r0.getNotificationInfo()
            return r0
        L9:
            java.lang.String r0 = ""
            return r0
    }

    public static java.lang.String getTplData(android.webkit.WebView r0) {
            cn.jpush.android.webview.bridge.d r0 = cn.jpush.android.webview.bridge.HostJsScope.a
            if (r0 == 0) goto L9
            java.lang.String r0 = r0.getTplData()
            return r0
        L9:
            java.lang.String r0 = ""
            return r0
    }

    public static java.lang.String getTplExtraData(android.webkit.WebView r0) {
            cn.jpush.android.webview.bridge.d r0 = cn.jpush.android.webview.bridge.HostJsScope.a
            if (r0 == 0) goto L9
            java.lang.String r0 = r0.getTplExtraData()
            return r0
        L9:
            java.lang.String r0 = ""
            return r0
    }

    public static void inAppClick(android.webkit.WebView r0, java.lang.String r1) {
            cn.jpush.android.webview.bridge.d r0 = cn.jpush.android.webview.bridge.HostJsScope.a
            if (r0 == 0) goto L7
            r0.inAppClick(r1)
        L7:
            return
    }

    public static void onLoadCallback(android.webkit.WebView r0, java.lang.String r1) {
            cn.jpush.android.webview.bridge.d r0 = cn.jpush.android.webview.bridge.HostJsScope.a
            if (r0 == 0) goto L7
            r0.onLoadCallback(r1)
        L7:
            return
    }

    public static void reportData(android.webkit.WebView r0, java.lang.String r1) {
            cn.jpush.android.webview.bridge.d r0 = cn.jpush.android.webview.bridge.HostJsScope.a
            if (r0 == 0) goto L7
            r0.reportData(r1)
        L7:
            return
    }

    public static void setWebViewHelper(cn.jpush.android.webview.bridge.d r0) {
            if (r0 != 0) goto L3
            return
        L3:
            cn.jpush.android.webview.bridge.HostJsScope.a = r0
            return
    }

    public static void showTitleBar(android.webkit.WebView r0) {
            cn.jpush.android.webview.bridge.d r0 = cn.jpush.android.webview.bridge.HostJsScope.a
            if (r0 == 0) goto L7
            r0.showTitleBar()
        L7:
            return
    }

    public static void showToast(android.webkit.WebView r0, java.lang.String r1) {
            cn.jpush.android.webview.bridge.d r0 = cn.jpush.android.webview.bridge.HostJsScope.a
            if (r0 != 0) goto L5
            return
        L5:
            r0.showToast(r1)
            return
    }

    public static void startActivityByIntent(android.webkit.WebView r0, java.lang.String r1, java.lang.String r2) {
            cn.jpush.android.webview.bridge.d r0 = cn.jpush.android.webview.bridge.HostJsScope.a
            if (r0 != 0) goto L5
            return
        L5:
            r0.startActivityByIntent(r1, r2)
            return
    }

    public static void startActivityByName(android.webkit.WebView r0, java.lang.String r1, java.lang.String r2) {
            cn.jpush.android.webview.bridge.d r0 = cn.jpush.android.webview.bridge.HostJsScope.a
            if (r0 != 0) goto L5
            return
        L5:
            r0.startActivityByName(r1, r2)
            return
    }

    public static void startActivityByNameWithSystemAlert(android.webkit.WebView r0, java.lang.String r1, java.lang.String r2) {
            cn.jpush.android.api.SystemAlertHelper.startActivityByName(r0, r1, r2)
            return
    }

    public static void startMainActivity(android.webkit.WebView r0, java.lang.String r1) {
            cn.jpush.android.webview.bridge.d r0 = cn.jpush.android.webview.bridge.HostJsScope.a
            if (r0 != 0) goto L5
            return
        L5:
            r0.startMainActivity(r1)
            return
    }

    public static void startPushActivity(android.webkit.WebView r0, java.lang.String r1) {
            cn.jpush.android.webview.bridge.d r0 = cn.jpush.android.webview.bridge.HostJsScope.a
            if (r0 == 0) goto L7
            r0.startPushActivity(r1)
        L7:
            return
    }

    public static void triggerNativeAction(android.webkit.WebView r0, java.lang.String r1) {
            cn.jpush.android.webview.bridge.d r0 = cn.jpush.android.webview.bridge.HostJsScope.a
            if (r0 != 0) goto L5
            return
        L5:
            r0.triggerNativeAction(r1)
            return
    }
}
