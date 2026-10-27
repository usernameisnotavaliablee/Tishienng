package com.bxkj.student.home.teaching.learning.detail.type;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class H5Fragment extends cn.bluemobi.dylan.base.BaseFragment {
    private java.lang.String j;
    private cn.bluemobi.dylan.smartwebview.SmartWebView k;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends android.webkit.WebViewClient {
        final /* synthetic */ com.bxkj.student.home.teaching.learning.detail.type.H5Fragment a;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: com.bxkj.student.home.teaching.learning.detail.type.H5Fragment$a$a, reason: collision with other inner class name */
        class C0092a implements android.webkit.ValueCallback<java.lang.String> {
            final /* synthetic */ com.bxkj.student.home.teaching.learning.detail.type.H5Fragment.a a;

            C0092a(com.bxkj.student.home.teaching.learning.detail.type.H5Fragment.a r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            public void a(java.lang.String r1) {
                    r0 = this;
                    return
            }

            @Override // android.webkit.ValueCallback
            public /* bridge */ /* synthetic */ void onReceiveValue(java.lang.String r1) {
                    r0 = this;
                    java.lang.String r1 = (java.lang.String) r1
                    r0.a(r1)
                    return
            }
        }

        a(com.bxkj.student.home.teaching.learning.detail.type.H5Fragment r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(android.webkit.WebView r2, java.lang.String r3) {
                r1 = this;
                com.bxkj.student.home.teaching.learning.detail.type.H5Fragment$a$a r3 = new com.bxkj.student.home.teaching.learning.detail.type.H5Fragment$a$a
                r3.<init>(r1)
                java.lang.String r0 = "(function(){var meta = document.createElement('meta');meta.content = 'width=device-width, initial-scale=1.0, maximum-scale=1.0,minimum-scale=1.0, user-scalable=no';meta.name = 'viewport';document.getElementsByTagName('head')[0].appendChild(meta);var body = document.getElementsByTagName('body')[0];body.style.cssText = 'width:100%;overflow-x:hidden;font-size:14px;margin:0;padding:10px;box-sizing:border-box;';var tb = document.getElementsByTagName('table');for (var k = 0; k < tb.length; k++){var nd = tb[k];nd.style.cssText += ';color:#101010;font-size: 14px;width:100%;overflow-x:hidden;';};var ps = document.getElementsByTagName('p');for (var j = 0; j < ps.length; j++){var nd = ps[j];var str = nd.innerHTML;str = str.replace(/&nbsp;/g, '');nd.innerHTML = str;nd.style.cssText += ';color:#101010;font-size: 14px;width:100%;overflow-x:hidden;';}})()"
                r2.evaluateJavascript(r0, r3)
                return
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(android.webkit.WebView r1, android.webkit.SslErrorHandler r2, android.net.http.SslError r3) {
                r0 = this;
                r2.proceed()
                return
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(android.webkit.WebView r3, java.lang.String r4) {
                r2 = this;
                java.lang.String r0 = "http://"
                boolean r0 = r4.startsWith(r0)
                r1 = 1
                if (r0 != 0) goto L25
                java.lang.String r0 = "https://"
                boolean r0 = r4.startsWith(r0)
                if (r0 == 0) goto L12
                goto L25
            L12:
                android.net.Uri r3 = android.net.Uri.parse(r4)
                java.lang.String r3 = r3.getScheme()
                java.lang.String r4 = "bilibili"
                boolean r3 = r4.equalsIgnoreCase(r3)
                if (r3 == 0) goto L23
                return r1
            L23:
                r3 = 0
                return r3
            L25:
                r3.loadUrl(r4)
                return r1
        }
    }

    public H5Fragment() {
            r0 = this;
            r0.<init>()
            return
    }

    private int N() {
            r3 = this;
            r0 = 0
            android.content.Context r1 = r3.g     // Catch: java.lang.Exception -> L11
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch: java.lang.Exception -> L11
            java.lang.String r2 = com.umeng.socialize.utils.ContextUtil.getPackageName()     // Catch: java.lang.Exception -> L11
            android.content.pm.PackageInfo r1 = r1.getPackageInfo(r2, r0)     // Catch: java.lang.Exception -> L11
            int r0 = r1.versionCode     // Catch: java.lang.Exception -> L11
        L11:
            return r0
    }

    public void b() {
            r0 = this;
            return
    }

    public void e() {
            r3 = this;
            android.os.Bundle r0 = r3.getArguments()
            java.lang.String r1 = "url"
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L16
            android.os.Bundle r0 = r3.getArguments()
            java.lang.String r0 = r0.getString(r1)
            r3.j = r0
        L16:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.bxkj.base.user.LoginUser r1 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r1 = r1.getToken()
            java.lang.String r2 = "token"
            r0.put(r2, r1)
            java.lang.String r1 = "Android"
            java.lang.String r2 = "channel"
            r0.put(r2, r1)
            int r1 = r3.N()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "version"
            r0.put(r2, r1)
            com.bxkj.base.user.LoginUser r1 = com.bxkj.base.user.LoginUser.getLoginUser()
            int r1 = r1.getUserType()
            r2 = 2
            if (r1 != r2) goto L4a
            java.lang.String r1 = "1"
            goto L4c
        L4a:
            java.lang.String r1 = "0"
        L4c:
            java.lang.String r2 = "type"
            r0.put(r2, r1)
            java.lang.String r1 = r3.j
            java.lang.String r2 = "https://player.bilibili.com/player.html"
            boolean r1 = r1.startsWith(r2)
            if (r1 == 0) goto L6a
            cn.bluemobi.dylan.smartwebview.SmartWebView r1 = r3.k
            android.webkit.WebView r1 = r1.getWebView()
            android.webkit.WebSettings r1 = r1.getSettings()
            java.lang.String r2 = "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/43.0.2357.134 Safari/537.36"
            r1.setUserAgentString(r2)
        L6a:
            cn.bluemobi.dylan.smartwebview.SmartWebView r1 = r3.k
            android.webkit.WebView r1 = r1.getWebView()
            java.lang.String r2 = r3.j
            r1.loadUrl(r2, r0)
            cn.bluemobi.dylan.smartwebview.SmartWebView r0 = r3.k
            android.webkit.WebView r0 = r0.getWebView()
            com.bxkj.student.home.teaching.learning.detail.type.H5Fragment$a r1 = new com.bxkj.student.home.teaching.learning.detail.type.H5Fragment$a
            r1.<init>(r3)
            r0.setWebViewClient(r1)
            return
    }

    protected void f(android.view.View r1) {
            r0 = this;
            r1 = 2131298538(0x7f0908ea, float:1.8215052E38)
            android.view.View r1 = r0.c(r1)
            cn.bluemobi.dylan.smartwebview.SmartWebView r1 = (cn.bluemobi.dylan.smartwebview.SmartWebView) r1
            r0.k = r1
            return
    }

    protected int i() {
            r1 = this;
            r0 = 2131492960(0x7f0c0060, float:1.8609387E38)
            return r0
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            return
    }
}
