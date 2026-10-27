package cn.jpush.android.ui;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class a extends android.webkit.WebViewClient {
    private final cn.jpush.android.d.d a;

    /* renamed from: b, reason: collision with root package name */
    private final android.content.Context f1944b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f1945c;

    /* renamed from: d, reason: collision with root package name */
    private java.lang.String f1946d;

    /* renamed from: e, reason: collision with root package name */
    private java.util.Queue<java.lang.String> f1947e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f1948f;

    public a(cn.jpush.android.d.d r3, android.content.Context r4) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.f1945c = r0
            java.lang.String r1 = ""
            r2.f1946d = r1
            r2.f1948f = r0
            r2.a = r3
            r2.f1944b = r4
            java.util.PriorityQueue r3 = new java.util.PriorityQueue
            r3.<init>()
            r2.f1947e = r3
            return
    }

    private boolean a(java.lang.String r10) {
            r9 = this;
            java.lang.String r0 = "android-app://"
            java.lang.String r1 = "JPushWebViewClient"
            r2 = 0
            boolean r3 = r10.startsWith(r0)     // Catch: java.lang.Throwable -> L19
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L1d
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L19
            r6 = 22
            if (r3 < r6) goto L1b
            r3 = 2
            android.content.Intent r3 = cn.jpush.android.ad.a.a(r10, r3)     // Catch: java.lang.Throwable -> L19
            goto L21
        L19:
            r0 = move-exception
            goto L7a
        L1b:
            r3 = r4
            goto L21
        L1d:
            android.content.Intent r3 = cn.jpush.android.ad.a.a(r10, r5)     // Catch: java.lang.Throwable -> L19
        L21:
            android.content.Context r6 = r9.f1944b     // Catch: java.lang.Throwable -> L19
            if (r6 == 0) goto L78
            if (r3 == 0) goto L78
            android.content.pm.PackageManager r6 = r6.getPackageManager()     // Catch: java.lang.Throwable -> L19
            if (r6 == 0) goto L48
            android.content.pm.ResolveInfo r6 = r6.resolveActivity(r3, r2)     // Catch: java.lang.Throwable -> L19
            if (r6 != 0) goto L48
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L19
            r0.<init>()     // Catch: java.lang.Throwable -> L19
            java.lang.String r3 = "open deeplink intent can be not resolved, url: "
            r0.append(r3)     // Catch: java.lang.Throwable -> L19
            r0.append(r10)     // Catch: java.lang.Throwable -> L19
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L19
            cn.jpush.android.helper.Logger.w(r1, r0)     // Catch: java.lang.Throwable -> L19
            return r5
        L48:
            java.lang.String r6 = "android.intent.category.BROWSABLE"
            r3.addCategory(r6)     // Catch: java.lang.Throwable -> L19
            boolean r0 = r10.startsWith(r0)     // Catch: java.lang.Throwable -> L19
            if (r0 != 0) goto L56
            r3.setComponent(r4)     // Catch: java.lang.Throwable -> L19
        L56:
            android.content.Intent r0 = cn.jpush.android.ad.a.a(r10, r2)     // Catch: java.lang.Throwable -> L19
            r3 = 268435456(0x10000000, float:2.524355E-29)
            r0.setFlags(r3)     // Catch: java.lang.Throwable -> L19
            android.content.Context r3 = r9.f1944b     // Catch: java.lang.Throwable -> L19
            r3.startActivity(r0)     // Catch: java.lang.Throwable -> L19
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L19
            r0.<init>()     // Catch: java.lang.Throwable -> L19
            java.lang.String r3 = "h5 open deeplink success, url: "
            r0.append(r3)     // Catch: java.lang.Throwable -> L19
            r0.append(r10)     // Catch: java.lang.Throwable -> L19
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L19
            cn.jpush.android.helper.Logger.d(r1, r0)     // Catch: java.lang.Throwable -> L19
        L78:
            r2 = 1
            goto L9a
        L7a:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "[openDeeplink] Bad URI "
            r3.append(r4)
            r3.append(r10)
            java.lang.String r10 = ": "
            r3.append(r10)
            java.lang.String r10 = r0.getMessage()
            r3.append(r10)
            java.lang.String r10 = r3.toString()
            cn.jpush.android.helper.Logger.w(r1, r10)
        L9a:
            if (r2 == 0) goto La0
            r0 = 976(0x3d0, double:4.82E-321)
        L9e:
            r6 = r0
            goto La3
        La0:
            r0 = 977(0x3d1, double:4.827E-321)
            goto L9e
        La3:
            cn.jpush.android.d.d r10 = r9.a
            byte r5 = r10.ai
            if (r5 != 0) goto Lb1
            java.lang.String r10 = r10.f1757d
            android.content.Context r0 = r9.f1944b
            cn.jpush.android.helper.c.a(r10, r6, r0)
            goto Lba
        Lb1:
            java.lang.String r3 = r10.f1757d
            java.lang.String r4 = ""
            android.content.Context r8 = r9.f1944b
            cn.jpush.android.helper.c.a(r3, r4, r5, r6, r8)
        Lba:
            return r2
    }

    public void a(boolean r1) {
            r0 = this;
            r0.f1948f = r1
            return
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(android.webkit.WebView r1, java.lang.String r2) {
            r0 = this;
            super.onLoadResource(r1, r2)
            return
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(android.webkit.WebView r1, java.lang.String r2) {
            r0 = this;
            super.onPageFinished(r1, r2)
            r0.f1946d = r2
            return
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(android.webkit.WebView r1, java.lang.String r2, android.graphics.Bitmap r3) {
            r0 = this;
            super.onPageStarted(r1, r2, r3)
            return
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(android.webkit.WebView r1, int r2, java.lang.String r3, java.lang.String r4) {
            r0 = this;
            super.onReceivedError(r1, r2, r3, r4)
            return
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(android.webkit.WebView r1, android.webkit.WebResourceRequest r2, android.webkit.WebResourceError r3) {
            r0 = this;
            super.onReceivedError(r1, r2, r3)
            return
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(android.webkit.WebView r1, android.webkit.WebResourceRequest r2, android.webkit.WebResourceResponse r3) {
            r0 = this;
            super.onReceivedHttpError(r1, r2, r3)
            return
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(android.webkit.WebView r2, android.webkit.SslErrorHandler r3, android.net.http.SslError r4) {
            r1 = this;
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "onReceivedSslError stop show:"
            r4.append(r0)
            java.lang.String r2 = r2.getUrl()
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            java.lang.String r4 = "JPushWebViewClient"
            cn.jpush.android.helper.Logger.ww(r4, r2)
            r3.cancel()
            return
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(android.webkit.WebView r20, java.lang.String r21) {
            r19 = this;
            r0 = r19
            r1 = r21
            java.lang.String r2 = "direct="
            java.lang.String r3 = "mailto"
            android.content.Context r4 = r20.getContext()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Url vaule is :"
            r5.append(r6)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "JPushWebViewClient"
            cn.jpush.android.helper.Logger.i(r6, r5)
            r5 = 1
            android.webkit.WebSettings r7 = r20.getSettings()     // Catch: java.lang.Throwable -> L1aa
            r8 = 0
            r7.setSavePassword(r8)     // Catch: java.lang.Throwable -> L1aa
            cn.jpush.android.ad.a.a(r20)     // Catch: java.lang.Throwable -> L1aa
            java.util.Locale r7 = java.util.Locale.ENGLISH     // Catch: java.lang.Throwable -> L1aa
            java.lang.String r9 = "{\"url\":\"%s\"}"
            java.lang.Object[] r10 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L1aa
            r10[r8] = r1     // Catch: java.lang.Throwable -> L1aa
            java.lang.String r7 = java.lang.String.format(r7, r9, r10)     // Catch: java.lang.Throwable -> L1aa
            java.lang.String r9 = ".mp3"
            boolean r9 = r1.endsWith(r9)     // Catch: java.lang.Throwable -> L1aa
            java.lang.String r10 = "android.intent.action.VIEW"
            if (r9 == 0) goto L5b
            android.content.Intent r2 = new android.content.Intent     // Catch: java.lang.Throwable -> L1aa
            r2.<init>(r10)     // Catch: java.lang.Throwable -> L1aa
            android.net.Uri r1 = android.net.Uri.parse(r1)     // Catch: java.lang.Throwable -> L1aa
            java.lang.String r3 = "audio/*"
            r2.setDataAndType(r1, r3)     // Catch: java.lang.Throwable -> L1aa
            android.content.Context r1 = r20.getContext()     // Catch: java.lang.Throwable -> L1aa
            r1.startActivity(r2)     // Catch: java.lang.Throwable -> L1aa
            return r5
        L5b:
            java.lang.String r9 = ".mp4"
            boolean r9 = r1.endsWith(r9)     // Catch: java.lang.Throwable -> L1aa
            if (r9 != 0) goto L193
            java.lang.String r9 = ".3gp"
            boolean r9 = r1.endsWith(r9)     // Catch: java.lang.Throwable -> L1aa
            if (r9 == 0) goto L6d
            goto L193
        L6d:
            java.lang.String r9 = ".apk"
            boolean r9 = r1.endsWith(r9)     // Catch: java.lang.Throwable -> L1aa
            if (r9 == 0) goto L86
            android.content.Intent r2 = new android.content.Intent     // Catch: java.lang.Throwable -> L1aa
            android.net.Uri r1 = android.net.Uri.parse(r1)     // Catch: java.lang.Throwable -> L1aa
            r2.<init>(r10, r1)     // Catch: java.lang.Throwable -> L1aa
            android.content.Context r1 = r20.getContext()     // Catch: java.lang.Throwable -> L1aa
            r1.startActivity(r2)     // Catch: java.lang.Throwable -> L1aa
            return r5
        L86:
            java.lang.String r9 = "http"
            boolean r9 = r1.startsWith(r9)     // Catch: java.lang.Throwable -> L1aa
            r10 = 1016(0x3f8, double:5.02E-321)
            if (r9 == 0) goto Lb0
            cn.jpush.android.d.d r1 = r0.a     // Catch: java.lang.Throwable -> L1aa
            byte r13 = r1.ai     // Catch: java.lang.Throwable -> L1aa
            if (r13 != 0) goto L9e
            java.lang.String r1 = r1.f1757d     // Catch: java.lang.Throwable -> L1aa
            android.content.Context r2 = r0.f1944b     // Catch: java.lang.Throwable -> L1aa
            cn.jpush.android.helper.c.a(r1, r10, r7, r2)     // Catch: java.lang.Throwable -> L1aa
            goto Laf
        L9e:
            java.lang.String r11 = r1.f1757d     // Catch: java.lang.Throwable -> L1aa
            java.lang.String r12 = ""
            android.content.Context r1 = r0.f1944b     // Catch: java.lang.Throwable -> L1aa
            r17 = 0
            r14 = 1016(0x3f8, double:5.02E-321)
            r16 = r1
            r18 = r7
            cn.jpush.android.helper.c.a(r11, r12, r13, r14, r16, r17, r18)     // Catch: java.lang.Throwable -> L1aa
        Laf:
            return r8
        Lb0:
            boolean r9 = r1.startsWith(r3)     // Catch: java.lang.Throwable -> L1aa
            if (r9 == 0) goto L18e
            int r9 = r1.lastIndexOf(r2)     // Catch: java.lang.Throwable -> L1aa
            java.lang.String r12 = "?"
            if (r9 >= 0) goto Lea
            boolean r9 = r1.startsWith(r3)     // Catch: java.lang.Throwable -> L1aa
            if (r9 != 0) goto Lea
            int r9 = r1.indexOf(r12)     // Catch: java.lang.Throwable -> L1aa
            if (r9 <= 0) goto Ldc
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1aa
            r9.<init>()     // Catch: java.lang.Throwable -> L1aa
            r9.append(r1)     // Catch: java.lang.Throwable -> L1aa
            java.lang.String r1 = "&direct=false"
        Ld4:
            r9.append(r1)     // Catch: java.lang.Throwable -> L1aa
            java.lang.String r1 = r9.toString()     // Catch: java.lang.Throwable -> L1aa
            goto Le7
        Ldc:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1aa
            r9.<init>()     // Catch: java.lang.Throwable -> L1aa
            r9.append(r1)     // Catch: java.lang.Throwable -> L1aa
            java.lang.String r1 = "?direct=false"
            goto Ld4
        Le7:
            r1.lastIndexOf(r2)     // Catch: java.lang.Throwable -> L1aa
        Lea:
            int r2 = r1.indexOf(r12)     // Catch: java.lang.Throwable -> L1aa
            java.lang.String r8 = r1.substring(r8, r2)     // Catch: java.lang.Throwable -> L1aa
            java.lang.String r1 = r1.substring(r2)     // Catch: java.lang.Throwable -> L1aa
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1aa
            r2.<init>()     // Catch: java.lang.Throwable -> L1aa
            java.lang.String r9 = "Uri: "
            r2.append(r9)     // Catch: java.lang.Throwable -> L1aa
            r2.append(r8)     // Catch: java.lang.Throwable -> L1aa
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L1aa
            cn.jpush.android.helper.Logger.v(r6, r2)     // Catch: java.lang.Throwable -> L1aa
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1aa
            r2.<init>()     // Catch: java.lang.Throwable -> L1aa
            java.lang.String r9 = "QueryString: "
            r2.append(r9)     // Catch: java.lang.Throwable -> L1aa
            r2.append(r1)     // Catch: java.lang.Throwable -> L1aa
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L1aa
            cn.jpush.android.helper.Logger.v(r6, r2)     // Catch: java.lang.Throwable -> L1aa
            boolean r2 = r8.startsWith(r3)     // Catch: java.lang.Throwable -> L1aa
            if (r2 == 0) goto L168
            java.lang.String r2 = ":"
            java.lang.String[] r2 = r8.split(r2)     // Catch: java.lang.Throwable -> L1aa
            int r3 = r2.length     // Catch: java.lang.Throwable -> L1aa
            r8 = 2
            if (r3 != r8) goto L168
            java.lang.String r3 = "title="
            int r3 = r1.indexOf(r3)     // Catch: java.lang.Throwable -> L1aa
            int r3 = r3 + 6
            java.lang.String r8 = "&content="
            int r8 = r1.indexOf(r8)     // Catch: java.lang.Throwable -> L1aa
            java.lang.String r3 = r1.substring(r3, r8)     // Catch: java.lang.Throwable -> L1aa
            int r8 = r8 + 9
            java.lang.String r1 = r1.substring(r8)     // Catch: java.lang.Throwable -> L1aa
            r2 = r2[r5]     // Catch: java.lang.Throwable -> L1aa
            java.lang.String[] r2 = new java.lang.String[]{r2}     // Catch: java.lang.Throwable -> L1aa
            android.content.Intent r8 = new android.content.Intent     // Catch: java.lang.Throwable -> L1aa
            java.lang.String r9 = "android.intent.action.SEND"
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L1aa
            java.lang.String r9 = "plain/text"
            r8.setType(r9)     // Catch: java.lang.Throwable -> L1aa
            java.lang.String r9 = "android.intent.extra.EMAIL"
            r8.putExtra(r9, r2)     // Catch: java.lang.Throwable -> L1aa
            java.lang.String r2 = "android.intent.extra.SUBJECT"
            r8.putExtra(r2, r3)     // Catch: java.lang.Throwable -> L1aa
            java.lang.String r2 = "android.intent.extra.TEXT"
            r8.putExtra(r2, r1)     // Catch: java.lang.Throwable -> L1aa
            goto L169
        L168:
            r8 = 0
        L169:
            if (r8 == 0) goto L16e
            r4.startActivity(r8)     // Catch: java.lang.Throwable -> L1aa
        L16e:
            cn.jpush.android.d.d r1 = r0.a     // Catch: java.lang.Throwable -> L1aa
            byte r13 = r1.ai     // Catch: java.lang.Throwable -> L1aa
            if (r13 != 0) goto L17c
            java.lang.String r1 = r1.f1757d     // Catch: java.lang.Throwable -> L1aa
            android.content.Context r2 = r0.f1944b     // Catch: java.lang.Throwable -> L1aa
            cn.jpush.android.helper.c.a(r1, r10, r7, r2)     // Catch: java.lang.Throwable -> L1aa
            goto L18d
        L17c:
            java.lang.String r11 = r1.f1757d     // Catch: java.lang.Throwable -> L1aa
            java.lang.String r12 = ""
            android.content.Context r1 = r0.f1944b     // Catch: java.lang.Throwable -> L1aa
            r17 = 0
            r14 = 1016(0x3f8, double:5.02E-321)
            r16 = r1
            r18 = r7
            cn.jpush.android.helper.c.a(r11, r12, r13, r14, r16, r17, r18)     // Catch: java.lang.Throwable -> L1aa
        L18d:
            return r5
        L18e:
            boolean r1 = r0.a(r1)     // Catch: java.lang.Throwable -> L1aa
            return r1
        L193:
            android.content.Intent r2 = new android.content.Intent     // Catch: java.lang.Throwable -> L1aa
            r2.<init>(r10)     // Catch: java.lang.Throwable -> L1aa
            android.net.Uri r1 = android.net.Uri.parse(r1)     // Catch: java.lang.Throwable -> L1aa
            java.lang.String r3 = "video/*"
            r2.setDataAndType(r1, r3)     // Catch: java.lang.Throwable -> L1aa
            android.content.Context r1 = r20.getContext()     // Catch: java.lang.Throwable -> L1aa
            r1.startActivity(r2)     // Catch: java.lang.Throwable -> L1aa
            return r5
        L1aa:
            java.lang.String r1 = "Invalid url"
            cn.jpush.android.helper.Logger.e(r6, r1)
            return r5
    }
}
