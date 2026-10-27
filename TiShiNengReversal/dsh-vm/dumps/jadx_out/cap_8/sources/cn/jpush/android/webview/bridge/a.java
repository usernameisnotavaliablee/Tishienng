package cn.jpush.android.webview.bridge;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class a extends cn.jpush.android.webview.bridge.b {
    private android.widget.ProgressBar a;

    /* renamed from: b, reason: collision with root package name */
    private android.widget.TextView f2004b;

    public a(java.lang.String r1, java.lang.Class r2, android.widget.ProgressBar r3, android.widget.TextView r4) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.a = r3
            r0.f2004b = r4
            if (r3 == 0) goto Le
            r1 = 100
            r3.setMax(r1)
        Le:
            android.widget.TextView r1 = r0.f2004b
            if (r1 == 0) goto L1d
            r2 = 1
            r1.setSingleLine(r2)
            android.widget.TextView r1 = r0.f2004b
            android.text.TextUtils$TruncateAt r2 = android.text.TextUtils.TruncateAt.END
            r1.setEllipsize(r2)
        L1d:
            return
    }

    @Override // cn.jpush.android.webview.bridge.b, android.webkit.WebChromeClient
    public boolean onJsAlert(android.webkit.WebView r1, java.lang.String r2, java.lang.String r3, android.webkit.JsResult r4) {
            r0 = this;
            boolean r1 = super.onJsAlert(r1, r2, r3, r4)
            return r1
    }

    @Override // cn.jpush.android.webview.bridge.b, android.webkit.WebChromeClient
    public boolean onJsPrompt(android.webkit.WebView r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, android.webkit.JsPromptResult r5) {
            r0 = this;
            boolean r1 = super.onJsPrompt(r1, r2, r3, r4, r5)
            return r1
    }

    @Override // cn.jpush.android.webview.bridge.b, android.webkit.WebChromeClient
    public void onProgressChanged(android.webkit.WebView r3, int r4) {
            r2 = this;
            super.onProgressChanged(r3, r4)
            android.widget.ProgressBar r0 = r2.a
            if (r0 == 0) goto L1a
            r1 = 100
            if (r1 != r4) goto L11
            r4 = 8
            r0.setVisibility(r4)
            goto L1a
        L11:
            r1 = 0
            r0.setVisibility(r1)
            android.widget.ProgressBar r0 = r2.a
            r0.setProgress(r4)
        L1a:
            android.widget.TextView r4 = r2.f2004b
            if (r4 == 0) goto L5a
            java.lang.String r4 = r3.getTitle()
            if (r4 == 0) goto L5a
            java.lang.String r4 = r3.getTitle()
            android.widget.TextView r0 = r2.f2004b
            java.lang.CharSequence r0 = r0.getText()
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L5a
            java.lang.String r4 = r3.getTitle()
            java.lang.String r0 = "http"
            boolean r0 = r4.startsWith(r0)
            if (r0 != 0) goto L5a
            java.lang.String r0 = "android-app://"
            boolean r0 = r4.startsWith(r0)
            if (r0 != 0) goto L5a
            java.lang.String r0 = "file://"
            boolean r4 = r4.startsWith(r0)
            if (r4 == 0) goto L51
            goto L5a
        L51:
            android.widget.TextView r4 = r2.f2004b
            java.lang.String r3 = r3.getTitle()
            r4.setText(r3)
        L5a:
            return
    }
}
