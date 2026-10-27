package com.beizi.ad.internal.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
class b {



    public b() {
            r1 = this;
            r1.<init>()
            return
    }

    private static void a(android.webkit.WebView r5, android.net.Uri r6) {
            java.lang.String r0 = "cb"
            java.lang.String r0 = r6.getQueryParameter(r0)
            java.lang.String r1 = "url"
            java.lang.String r6 = r6.getQueryParameter(r1)
            android.content.Context r1 = r5.getContext()
            r2 = 0
            if (r1 == 0) goto L43
            android.content.Context r1 = r5.getContext()
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            if (r1 == 0) goto L43
            if (r6 != 0) goto L20
            goto L43
        L20:
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r6 = android.net.Uri.decode(r6)
            android.net.Uri r6 = android.net.Uri.parse(r6)
            java.lang.String r3 = "android.intent.action.VIEW"
            r1.<init>(r3, r6)
            r6 = 268435456(0x10000000, float:2.524355E-29)
            r1.setFlags(r6)
            android.content.Context r6 = r5.getContext()
            android.content.pm.PackageManager r6 = r6.getPackageManager()
            android.content.ComponentName r6 = r1.resolveActivity(r6)
            if (r6 == 0) goto L43
            r2 = 1
        L43:
            java.util.LinkedList r6 = new java.util.LinkedList
            r6.<init>()
            android.util.Pair r1 = new android.util.Pair
            java.lang.String r3 = "caller"
            java.lang.String r4 = "MayDeepLink"
            r1.<init>(r3, r4)
            r6.add(r1)
            android.util.Pair r1 = new android.util.Pair
            java.lang.String r3 = "mayDeepLink"
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r1.<init>(r3, r2)
            r6.add(r1)
            a(r5, r0, r6)
            return
    }

    private static void a(android.webkit.WebView r2, java.lang.String r3, java.util.List<android.util.Pair<java.lang.String, java.lang.String>> r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "cb="
            r0.append(r1)
            if (r3 == 0) goto Ld
            goto Lf
        Ld:
            java.lang.String r3 = "-1"
        Lf:
            r0.append(r3)
            if (r4 == 0) goto L49
            java.util.Iterator r3 = r4.iterator()
        L18:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L49
            java.lang.Object r4 = r3.next()
            android.util.Pair r4 = (android.util.Pair) r4
            java.lang.Object r1 = r4.first
            if (r1 == 0) goto L18
            java.lang.Object r1 = r4.second
            if (r1 == 0) goto L18
            java.lang.String r1 = "&"
            r0.append(r1)
            java.lang.Object r1 = r4.first
            java.lang.String r1 = (java.lang.String) r1
            r0.append(r1)
            java.lang.String r1 = "="
            r0.append(r1)
            java.lang.Object r4 = r4.second
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r4 = android.net.Uri.encode(r4)
            r0.append(r4)
            goto L18
        L49:
            java.lang.String r3 = r0.toString()
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r0 = 0
            r4[r0] = r3
            java.lang.String r3 = "javascript:window.sdkjs.client.result(\"%s\")"
            java.lang.String r3 = java.lang.String.format(r3, r4)
            r4 = 0
            r2.evaluateJavascript(r3, r4)
            return
    }

    private static void a(com.beizi.ad.internal.view.AdWebView r5, android.net.Uri r6) {
            java.lang.String r0 = "cb"
            java.lang.String r0 = r6.getQueryParameter(r0)
            java.lang.String r1 = "index"
            java.lang.String r6 = r6.getQueryParameter(r1)
            int r6 = java.lang.Integer.parseInt(r6)
            boolean r6 = r5.loadAdAt(r6)
            if (r6 == 0) goto L29
            com.beizi.ad.internal.view.AdViewImpl r6 = r5.adViewImpl
            boolean r1 = r6 instanceof com.beizi.ad.internal.view.InterstitialAdViewImpl
            if (r1 == 0) goto L27
            com.beizi.ad.internal.view.InterstitialAdViewImpl r6 = (com.beizi.ad.internal.view.InterstitialAdViewImpl) r6
            com.beizi.ad.AdActivity$a r6 = r6.getAdImplementation()
            com.beizi.ad.internal.activity.b r6 = (com.beizi.ad.internal.activity.b) r6
            r6.g()
        L27:
            r6 = 1
            goto L2a
        L29:
            r6 = 0
        L2a:
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            android.util.Pair r2 = new android.util.Pair
            java.lang.String r3 = "caller"
            java.lang.String r4 = "GotoPage"
            r2.<init>(r3, r4)
            r1.add(r2)
            android.util.Pair r2 = new android.util.Pair
            java.lang.String r3 = "success"
            java.lang.String r6 = java.lang.String.valueOf(r6)
            r2.<init>(r3, r6)
            r1.add(r2)
            a(r5, r0, r1)
            return
    }

    static void a(com.beizi.ad.internal.view.AdWebView r3, java.lang.String r4) {
            android.net.Uri r4 = android.net.Uri.parse(r4)
            java.lang.String r0 = r4.getHost()
            java.lang.String r1 = "GotoPage"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L14
            a(r3, r4)
            return
        L14:
            java.lang.String r1 = "SendMsg"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L20
            b(r3, r4)
            return
        L20:
            java.lang.String r1 = "CallNo"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L2c
            c(r3, r4)
            return
        L2c:
            java.lang.String r1 = "ClosePage"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L38
            d(r3, r4)
            return
        L38:
            java.lang.String r1 = "GetDeviceID"
            boolean r2 = r1.equals(r0)
            if (r2 == 0) goto L44
            d(r3, r4)
            return
        L44:
            java.lang.String r2 = "Download"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L50
            e(r3, r4)
            return
        L50:
            java.lang.String r2 = "PingClick"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L5c
            f(r3, r4)
            return
        L5c:
            java.lang.String r2 = "PingConvertion"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L68
            g(r3, r4)
            return
        L68:
            java.lang.String r2 = "GetCommonInfo"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L71
            goto Ld4
        L71:
            java.lang.String r2 = "MayDeepLink"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L7d
            a(r3, r4)
            return
        L7d:
            java.lang.String r2 = "DeepLink"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L8f
            boolean r0 = r3.getUserInteraction()
            if (r0 == 0) goto Ld4
            b(r3, r4)
            return
        L8f:
            java.lang.String r2 = "ExternalBrowser"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto La1
            boolean r0 = r3.getUserInteraction()
            if (r0 == 0) goto Ld4
            c(r3, r4)
            return
        La1:
            java.lang.String r2 = "InternalBrowser"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto Lb3
            boolean r0 = r3.getUserInteraction()
            if (r0 == 0) goto Ld4
            h(r3, r4)
            return
        Lb3:
            java.lang.String r2 = "RecordEvent"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto Lbf
            i(r3, r4)
            return
        Lbf:
            java.lang.String r2 = "DispatchAppEvent"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto Lcb
            j(r3, r4)
            return
        Lcb:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Ld4
            d(r3, r4)
        Ld4:
            return
    }

    private static void b(android.webkit.WebView r5, android.net.Uri r6) {
            java.lang.String r0 = "cb"
            java.lang.String r0 = r6.getQueryParameter(r0)
            java.lang.String r1 = "url"
            java.lang.String r6 = r6.getQueryParameter(r1)
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            android.util.Pair r2 = new android.util.Pair
            java.lang.String r3 = "caller"
            java.lang.String r4 = "DeepLink"
            r2.<init>(r3, r4)
            r1.add(r2)
            android.content.Context r2 = r5.getContext()
            if (r2 == 0) goto L46
            if (r6 != 0) goto L26
            goto L46
        L26:
            android.content.Intent r2 = new android.content.Intent     // Catch: android.content.ActivityNotFoundException -> L42
            java.lang.String r3 = "android.intent.action.VIEW"
            java.lang.String r6 = android.net.Uri.decode(r6)     // Catch: android.content.ActivityNotFoundException -> L42
            android.net.Uri r6 = android.net.Uri.parse(r6)     // Catch: android.content.ActivityNotFoundException -> L42
            r2.<init>(r3, r6)     // Catch: android.content.ActivityNotFoundException -> L42
            r6 = 268435456(0x10000000, float:2.524355E-29)
            r2.setFlags(r6)     // Catch: android.content.ActivityNotFoundException -> L42
            android.content.Context r6 = r5.getContext()     // Catch: android.content.ActivityNotFoundException -> L42
            r6.startActivity(r2)     // Catch: android.content.ActivityNotFoundException -> L42
            return
        L42:
            a(r5, r0, r1)
            return
        L46:
            a(r5, r0, r1)
            return
    }

    private static void b(com.beizi.ad.internal.view.AdWebView r4, android.net.Uri r5) {
            java.lang.String r0 = "cb"
            java.lang.String r0 = r5.getQueryParameter(r0)
            java.lang.String r1 = "msg"
            r5.getQueryParameter(r1)
            java.lang.String r1 = "receiver"
            r5.getQueryParameter(r1)
            java.util.LinkedList r5 = new java.util.LinkedList
            r5.<init>()
            android.util.Pair r1 = new android.util.Pair
            java.lang.String r2 = "caller"
            java.lang.String r3 = "SendMsg"
            r1.<init>(r2, r3)
            r5.add(r1)
            android.util.Pair r1 = new android.util.Pair
            java.lang.String r2 = "success"
            r3 = 0
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r1.<init>(r2, r3)
            r5.add(r1)
            a(r4, r0, r5)
            return
    }

    private static void c(android.webkit.WebView r2, android.net.Uri r3) {
            java.lang.String r0 = "url"
            java.lang.String r3 = r3.getQueryParameter(r0)
            android.content.Context r0 = r2.getContext()
            if (r0 == 0) goto L41
            if (r3 == 0) goto L41
            java.lang.String r0 = "http"
            boolean r0 = r3.startsWith(r0)
            if (r0 != 0) goto L17
            goto L41
        L17:
            android.content.Intent r0 = new android.content.Intent     // Catch: android.content.ActivityNotFoundException -> L33
            java.lang.String r1 = "android.intent.action.VIEW"
            java.lang.String r3 = android.net.Uri.decode(r3)     // Catch: android.content.ActivityNotFoundException -> L33
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch: android.content.ActivityNotFoundException -> L33
            r0.<init>(r1, r3)     // Catch: android.content.ActivityNotFoundException -> L33
            r3 = 268435456(0x10000000, float:2.524355E-29)
            r0.setFlags(r3)     // Catch: android.content.ActivityNotFoundException -> L33
            android.content.Context r3 = r2.getContext()     // Catch: android.content.ActivityNotFoundException -> L33
            r3.startActivity(r0)     // Catch: android.content.ActivityNotFoundException -> L33
            return
        L33:
            android.content.Context r2 = r2.getContext()
            int r3 = com.beizi.fusion.R.string.beizi_action_cant_be_completed
            r0 = 0
            android.widget.Toast r2 = android.widget.Toast.makeText(r2, r3, r0)
            r2.show()
        L41:
            return
    }

    private static void c(com.beizi.ad.internal.view.AdWebView r4, android.net.Uri r5) {
            java.lang.String r0 = "cb"
            java.lang.String r0 = r5.getQueryParameter(r0)
            java.lang.String r1 = "receiver"
            r5.getQueryParameter(r1)
            java.util.LinkedList r5 = new java.util.LinkedList
            r5.<init>()
            android.util.Pair r1 = new android.util.Pair
            java.lang.String r2 = "caller"
            java.lang.String r3 = "CallNo"
            r1.<init>(r2, r3)
            r5.add(r1)
            android.util.Pair r1 = new android.util.Pair
            java.lang.String r2 = "success"
            r3 = 0
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r1.<init>(r2, r3)
            r5.add(r1)
            a(r4, r0, r5)
            return
    }

    private static void d(android.webkit.WebView r4, android.net.Uri r5) {
            java.lang.String r0 = "cb"
            java.lang.String r5 = r5.getQueryParameter(r0)
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            android.util.Pair r1 = new android.util.Pair
            java.lang.String r2 = "caller"
            java.lang.String r3 = "GetDeviceID"
            r1.<init>(r2, r3)
            r0.add(r1)
            android.util.Pair r1 = new android.util.Pair
            java.lang.String r2 = "idname"
            java.lang.String r3 = "imei"
            r1.<init>(r2, r3)
            r0.add(r1)
            a(r4, r5, r0)
            return
    }

    private static void d(com.beizi.ad.internal.view.AdWebView r4, android.net.Uri r5) {
            java.lang.String r0 = "cb"
            java.lang.String r5 = r5.getQueryParameter(r0)
            com.beizi.ad.internal.view.AdViewImpl r0 = r4.adViewImpl
            android.os.Handler r0 = r0.getMyHandler()
            com.beizi.ad.internal.view.b$1 r1 = new com.beizi.ad.internal.view.b$1
            r1.<init>(r4)
            r0.post(r1)
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            android.util.Pair r1 = new android.util.Pair
            java.lang.String r2 = "caller"
            java.lang.String r3 = "ClosePage"
            r1.<init>(r2, r3)
            r0.add(r1)
            android.util.Pair r1 = new android.util.Pair
            java.lang.String r2 = "success"
            r3 = 1
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r1.<init>(r2, r3)
            r0.add(r1)
            a(r4, r5, r0)
            return
    }

    private static void e(com.beizi.ad.internal.view.AdWebView r4, android.net.Uri r5) {
            java.lang.String r0 = "url"
            java.lang.String r0 = r5.getQueryParameter(r0)
            java.lang.String r1 = "cb"
            java.lang.String r5 = r5.getQueryParameter(r1)
            android.content.Intent r1 = new android.content.Intent     // Catch: java.lang.Exception -> L2a
            java.lang.String r2 = "android.intent.action.VIEW"
            java.lang.String r0 = android.net.Uri.decode(r0)     // Catch: java.lang.Exception -> L2a
            android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch: java.lang.Exception -> L2a
            r1.<init>(r2, r0)     // Catch: java.lang.Exception -> L2a
            r0 = 268435456(0x10000000, float:2.524355E-29)
            r1.setFlags(r0)     // Catch: java.lang.Exception -> L2a
            if (r4 == 0) goto L38
            android.content.Context r0 = r4.getContext()     // Catch: java.lang.Exception -> L2a
            r0.startActivity(r1)     // Catch: java.lang.Exception -> L2a
            goto L38
        L2a:
            android.content.Context r0 = r4.getContext()
            int r1 = com.beizi.fusion.R.string.beizi_action_cant_be_completed
            r2 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r1, r2)
            r0.show()
        L38:
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            android.util.Pair r1 = new android.util.Pair
            java.lang.String r2 = "caller"
            java.lang.String r3 = "Download"
            r1.<init>(r2, r3)
            r0.add(r1)
            android.util.Pair r1 = new android.util.Pair
            java.lang.String r2 = "success"
            r3 = 1
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r1.<init>(r2, r3)
            r0.add(r1)
            a(r4, r5, r0)
            return
    }

    private static void f(com.beizi.ad.internal.view.AdWebView r4, android.net.Uri r5) {
            java.lang.String r0 = "url"
            java.lang.String r0 = r5.getQueryParameter(r0)
            java.lang.String r1 = "cb"
            java.lang.String r5 = r5.getQueryParameter(r1)
            com.beizi.ad.internal.view.AdViewImpl r1 = r4.adViewImpl
            r1.pingClick(r0)
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            android.util.Pair r1 = new android.util.Pair
            java.lang.String r2 = "caller"
            java.lang.String r3 = "PingClick"
            r1.<init>(r2, r3)
            r0.add(r1)
            android.util.Pair r1 = new android.util.Pair
            java.lang.String r2 = "success"
            r3 = 1
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r1.<init>(r2, r3)
            r0.add(r1)
            a(r4, r5, r0)
            return
    }

    private static void g(com.beizi.ad.internal.view.AdWebView r4, android.net.Uri r5) {
            java.lang.String r0 = "url"
            java.lang.String r0 = r5.getQueryParameter(r0)
            java.lang.String r1 = "cb"
            java.lang.String r5 = r5.getQueryParameter(r1)
            com.beizi.ad.internal.view.AdViewImpl r1 = r4.adViewImpl
            r1.pingConvert(r0)
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            android.util.Pair r1 = new android.util.Pair
            java.lang.String r2 = "caller"
            java.lang.String r3 = "PingConvertion"
            r1.<init>(r2, r3)
            r0.add(r1)
            android.util.Pair r1 = new android.util.Pair
            java.lang.String r2 = "success"
            r3 = 1
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r1.<init>(r2, r3)
            r0.add(r1)
            a(r4, r5, r0)
            return
    }

    @android.annotation.SuppressLint({"SetJavaScriptEnabled"})
    private static void h(com.beizi.ad.internal.view.AdWebView r4, android.net.Uri r5) {
            java.lang.String r0 = "url"
            java.lang.String r5 = r5.getQueryParameter(r0)
            android.content.Context r0 = r4.getContext()
            if (r0 == 0) goto L9a
            if (r5 == 0) goto L9a
            java.lang.String r0 = "http"
            boolean r0 = r5.startsWith(r0)
            if (r0 != 0) goto L18
            goto L9a
        L18:
            java.lang.String r5 = android.net.Uri.decode(r5)
            java.lang.Class r0 = com.beizi.ad.AdActivity.a()
            android.content.Intent r1 = new android.content.Intent
            android.content.Context r2 = r4.getContext()
            r1.<init>(r2, r0)
            r0 = 268435456(0x10000000, float:2.524355E-29)
            r1.setFlags(r0)
            java.lang.String r0 = "ACTIVITY_TYPE"
            java.lang.String r2 = "BROWSER"
            r1.putExtra(r0, r2)
            android.webkit.WebView r0 = new android.webkit.WebView
            android.content.Context r2 = r4.getContext()
            r0.<init>(r2)
            com.beizi.ad.internal.h.x.a(r0)
            java.util.LinkedList<android.webkit.WebView> r2 = com.beizi.ad.internal.activity.a.a
            r2.add(r0)
            java.util.Map r2 = com.beizi.ad.lance.a.j.a()
            r0.loadUrl(r5, r2)
            com.beizi.ad.internal.view.AdViewImpl r5 = r4.adViewImpl
            com.beizi.ad.internal.view.AdViewImpl$c r5 = r5.getBrowserStyle()
            if (r5 == 0) goto L7f
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r2 = ""
            r5.append(r2)
            int r0 = r0.hashCode()
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            java.lang.String r0 = "bridgeid"
            r1.putExtra(r0, r5)
            java.util.ArrayList<android.util.Pair<java.lang.String, com.beizi.ad.internal.view.AdViewImpl$c>> r0 = com.beizi.ad.internal.view.AdViewImpl.c.a
            android.util.Pair r2 = new android.util.Pair
            com.beizi.ad.internal.view.AdViewImpl r3 = r4.adViewImpl
            com.beizi.ad.internal.view.AdViewImpl$c r3 = r3.getBrowserStyle()
            r2.<init>(r5, r3)
            r0.add(r2)
        L7f:
            android.content.Context r5 = r4.getContext()     // Catch: android.content.ActivityNotFoundException -> L87
            r5.startActivity(r1)     // Catch: android.content.ActivityNotFoundException -> L87
            return
        L87:
            android.content.Context r4 = r4.getContext()
            int r5 = com.beizi.fusion.R.string.beizi_action_cant_be_completed
            r0 = 0
            android.widget.Toast r4 = android.widget.Toast.makeText(r4, r5, r0)
            r4.show()
            java.util.LinkedList<android.webkit.WebView> r4 = com.beizi.ad.internal.activity.a.a
            r4.remove()
        L9a:
            return
    }

    private static void i(com.beizi.ad.internal.view.AdWebView r2, android.net.Uri r3) {
            java.lang.String r0 = "url"
            java.lang.String r3 = r3.getQueryParameter(r0)
            if (r3 == 0) goto L31
            java.lang.String r0 = "http"
            boolean r0 = r3.startsWith(r0)
            if (r0 != 0) goto L11
            goto L31
        L11:
            android.webkit.WebView r0 = new android.webkit.WebView
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1)
            com.beizi.ad.internal.view.b$2 r1 = new com.beizi.ad.internal.view.b$2
            r1.<init>()
            r0.setWebViewClient(r1)
            java.util.Map r1 = com.beizi.ad.lance.a.j.a()
            r0.loadUrl(r3, r1)
            r3 = 8
            r0.setVisibility(r3)
            r2.addView(r0)
        L31:
            return
    }

    private static void j(com.beizi.ad.internal.view.AdWebView r2, android.net.Uri r3) {
            java.lang.String r0 = "event"
            java.lang.String r0 = r3.getQueryParameter(r0)
            java.lang.String r1 = "data"
            java.lang.String r3 = r3.getQueryParameter(r1)
            com.beizi.ad.internal.view.AdViewImpl r2 = r2.adViewImpl
            com.beizi.ad.internal.c r2 = r2.getAdDispatcher()
            r2.a(r0, r3)
            return
    }
}
