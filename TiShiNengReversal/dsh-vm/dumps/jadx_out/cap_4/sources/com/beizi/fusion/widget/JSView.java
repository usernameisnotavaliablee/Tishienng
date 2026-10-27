package com.beizi.fusion.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class JSView extends android.webkit.WebView {
    private static java.lang.String a = "JSView";
    private com.beizi.fusion.model.TaskBean.BackTaskArrayBean b;
    private int c;
    private android.content.Context d;

    @android.annotation.SuppressLint({"HandlerLeak"})
    private android.os.Handler e;




    static {
            return
    }

    public JSView(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public JSView(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r1 = 1
            r0.c = r1
            com.beizi.fusion.widget.JSView$1 r1 = new com.beizi.fusion.widget.JSView$1
            r1.<init>(r0)
            r0.e = r1
            r0.init()     // Catch: java.lang.Throwable -> L10
        L10:
            return
    }

    public JSView(android.content.Context r3, com.beizi.fusion.model.TaskBean.BackTaskArrayBean r4) {
            r2 = this;
            r0 = 0
            r1 = 0
            r2.<init>(r3, r0, r1)
            r2.d = r3
            r2.b = r4
            int r3 = r4.getRepeatCount()
            r2.c = r3
            return
    }

    static /* synthetic */ int a(com.beizi.fusion.widget.JSView r0) {
            int r0 = r0.c
            return r0
    }

    private void a() {
            r11 = this;
            android.content.Context r0 = r11.d
            com.beizi.fusion.events.EventCar r0 = com.beizi.fusion.events.EventCar.getInstance(r0)
            com.beizi.fusion.events.EventBean r1 = new com.beizi.fusion.events.EventBean
            java.lang.String r2 = com.beizi.fusion.c.b.b
            com.beizi.fusion.c.b r3 = com.beizi.fusion.c.b.a()
            java.lang.String r6 = r3.b()
            long r3 = java.lang.System.currentTimeMillis()
            java.lang.String r9 = java.lang.String.valueOf(r3)
            java.lang.String r10 = ""
            java.lang.String r3 = ""
            java.lang.String r4 = "510.500"
            java.lang.String r5 = ""
            java.lang.String r7 = ""
            java.lang.String r8 = ""
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r0.goRoad(r1)
            return
    }

    private void b() {
            r11 = this;
            android.content.Context r0 = r11.d     // Catch: java.lang.Exception -> L41
            com.beizi.fusion.events.EventCar r0 = com.beizi.fusion.events.EventCar.getInstance(r0)     // Catch: java.lang.Exception -> L41
            com.beizi.fusion.events.EventBean r1 = new com.beizi.fusion.events.EventBean     // Catch: java.lang.Exception -> L41
            java.lang.String r2 = com.beizi.fusion.c.b.b     // Catch: java.lang.Exception -> L41
            java.lang.String r3 = ""
            java.lang.String r4 = "510.200"
            java.lang.String r5 = ""
            com.beizi.fusion.c.b r6 = com.beizi.fusion.c.b.a()     // Catch: java.lang.Exception -> L41
            java.lang.String r6 = r6.b()     // Catch: java.lang.Exception -> L41
            java.lang.String r7 = ""
            java.lang.String r8 = ""
            long r9 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L41
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch: java.lang.Exception -> L41
            java.lang.String r10 = ""
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Exception -> L41
            r0.goRoad(r1)     // Catch: java.lang.Exception -> L41
            r0 = 1
            r11.clearCache(r0)     // Catch: java.lang.Exception -> L41
            r11.clearHistory()     // Catch: java.lang.Exception -> L41
            r11.clearFormData()     // Catch: java.lang.Exception -> L41
            r11.destroy()     // Catch: java.lang.Exception -> L41
            android.os.Handler r0 = r11.e     // Catch: java.lang.Exception -> L41
            if (r0 == 0) goto L41
            r1 = 0
            r0.removeCallbacksAndMessages(r1)     // Catch: java.lang.Exception -> L41
        L41:
            return
    }

    static /* synthetic */ void b(com.beizi.fusion.widget.JSView r0) {
            r0.b()
            return
    }

    static /* synthetic */ com.beizi.fusion.model.TaskBean.BackTaskArrayBean c(com.beizi.fusion.widget.JSView r0) {
            com.beizi.fusion.model.TaskBean$BackTaskArrayBean r0 = r0.b
            return r0
    }

    static /* synthetic */ android.content.Context d(com.beizi.fusion.widget.JSView r0) {
            android.content.Context r0 = r0.d
            return r0
    }

    static /* synthetic */ android.os.Handler e(com.beizi.fusion.widget.JSView r0) {
            android.os.Handler r0 = r0.e
            return r0
    }

    static /* synthetic */ void f(com.beizi.fusion.widget.JSView r0) {
            r0.a()
            return
    }

    public void init() {
            r3 = this;
            android.webkit.WebSettings r0 = r3.getSettings()
            r1 = 0
            r0.setSavePassword(r1)
            android.webkit.WebView.setWebContentsDebuggingEnabled(r1)
            r2 = 1
            r0.setJavaScriptEnabled(r2)
            r0.setJavaScriptCanOpenWindowsAutomatically(r1)
            r0.setAllowFileAccess(r1)
            r0.setAllowFileAccessFromFileURLs(r1)
            r0.setAllowUniversalAccessFromFileURLs(r1)
            com.beizi.fusion.widget.JSView$2 r0 = new com.beizi.fusion.widget.JSView$2
            r0.<init>(r3)
            r3.setWebChromeClient(r0)
            com.beizi.fusion.widget.JSView$3 r0 = new com.beizi.fusion.widget.JSView$3
            r0.<init>(r3)
            r3.setWebViewClient(r0)
            return
    }

    public void load() {
            r1 = this;
            com.beizi.fusion.model.TaskBean$BackTaskArrayBean r0 = r1.b
            if (r0 == 0) goto L1d
            java.lang.String r0 = r0.getContentUrl()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L1d
            com.beizi.fusion.model.TaskBean$BackTaskArrayBean r0 = r1.b
            java.lang.String r0 = r0.getContentUrl()
            r1.loadUrl(r0)
            int r0 = r1.c
            int r0 = r0 + (-1)
            r1.c = r0
        L1d:
            return
    }
}
