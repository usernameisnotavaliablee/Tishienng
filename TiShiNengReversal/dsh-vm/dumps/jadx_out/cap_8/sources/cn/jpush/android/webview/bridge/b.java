package cn.jpush.android.webview.bridge;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class b extends android.webkit.WebChromeClient {
    private final java.lang.String a;

    /* renamed from: b, reason: collision with root package name */
    private cn.jpush.android.webview.bridge.c f2005b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f2006c;

    public b(java.lang.String r2, java.lang.Class r3) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "InjectedChromeClient"
            r1.a = r0
            cn.jpush.android.webview.bridge.c r0 = new cn.jpush.android.webview.bridge.c
            r0.<init>(r2, r3)
            r1.f2005b = r0
            return
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsAlert(android.webkit.WebView r1, java.lang.String r2, java.lang.String r3, android.webkit.JsResult r4) {
            r0 = this;
            r4.confirm()
            r1 = 1
            return r1
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsPrompt(android.webkit.WebView r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, android.webkit.JsPromptResult r5) {
            r0 = this;
            r1 = 1
            return r1
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(android.webkit.WebView r3, int r4) {
            r2 = this;
            android.webkit.WebSettings r0 = r3.getSettings()
            r1 = 0
            r0.setSavePassword(r1)
            android.webkit.WebSettings r0 = r3.getSettings()
            r1 = 1
            r0.setMixedContentMode(r1)
            super.onProgressChanged(r3, r4)
            return
    }
}
