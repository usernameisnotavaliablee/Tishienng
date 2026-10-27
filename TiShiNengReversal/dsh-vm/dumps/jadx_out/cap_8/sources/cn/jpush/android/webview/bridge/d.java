package cn.jpush.android.webview.bridge;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class d {

    /* renamed from: d, reason: collision with root package name */
    private static java.lang.String f2009d;
    private final java.lang.ref.WeakReference<android.app.Activity> a;

    /* renamed from: b, reason: collision with root package name */
    private final cn.jpush.android.d.d f2010b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f2011c;

    static {
            return
    }

    public d(android.content.Context r3, cn.jpush.android.d.d r4) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.f2011c = r0
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            android.app.Activity r3 = (android.app.Activity) r3
            r1.<init>(r3)
            r2.a = r1
            r2.f2010b = r4
            r2.f2011c = r0
            return
    }

    private void a(java.lang.String r4) {
            r3 = this;
            long r0 = java.lang.Long.parseLong(r4)     // Catch: java.lang.Exception -> L5 java.lang.Throwable -> L26
            goto L1d
        L5:
            java.lang.String r0 = "WebViewHelper"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L26
            r1.<init>()     // Catch: java.lang.Throwable -> L26
            java.lang.String r2 = "Invalid actionId from Web - "
            r1.append(r2)     // Catch: java.lang.Throwable -> L26
            r1.append(r4)     // Catch: java.lang.Throwable -> L26
            java.lang.String r4 = r1.toString()     // Catch: java.lang.Throwable -> L26
            cn.jpush.android.helper.Logger.e(r0, r4)     // Catch: java.lang.Throwable -> L26
            r0 = 1100(0x44c, double:5.435E-321)
        L1d:
            cn.jpush.android.d.d r4 = r3.f2010b     // Catch: java.lang.Throwable -> L26
            java.lang.String r4 = r4.f1757d     // Catch: java.lang.Throwable -> L26
            android.content.Context r2 = cn.jpush.android.local.JPushConstants.mApplicationContext     // Catch: java.lang.Throwable -> L26
            cn.jpush.android.helper.c.a(r4, r0, r2)     // Catch: java.lang.Throwable -> L26
        L26:
            return
    }

    @android.webkit.JavascriptInterface
    public void click(java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Web callback:click - actionId:"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = ", shouldClose:"
            r0.append(r1)
            r0.append(r4)
            java.lang.String r1 = ", shouldCancelNotification:"
            r0.append(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "WebViewHelper"
            cn.jpush.android.helper.Logger.d(r1, r0)
            r2.a(r3)     // Catch: java.lang.Throwable -> L4f
            boolean r3 = java.lang.Boolean.parseBoolean(r4)     // Catch: java.lang.Throwable -> L4f
            boolean r4 = java.lang.Boolean.parseBoolean(r5)     // Catch: java.lang.Throwable -> L4f
            if (r4 == 0) goto L3a
            android.content.Context r4 = cn.jpush.android.local.JPushConstants.mApplicationContext     // Catch: java.lang.Throwable -> L4f
            cn.jpush.android.d.d r5 = r2.f2010b     // Catch: java.lang.Throwable -> L4f
            cn.jpush.android.x.b.c(r4, r5)     // Catch: java.lang.Throwable -> L4f
        L3a:
            if (r3 == 0) goto L4f
            java.lang.ref.WeakReference<android.app.Activity> r3 = r2.a     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r3 = r3.get()     // Catch: java.lang.Throwable -> L4f
            if (r3 == 0) goto L4f
            java.lang.ref.WeakReference<android.app.Activity> r3 = r2.a     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r3 = r3.get()     // Catch: java.lang.Throwable -> L4f
            android.app.Activity r3 = (android.app.Activity) r3     // Catch: java.lang.Throwable -> L4f
            r3.finish()     // Catch: java.lang.Throwable -> L4f
        L4f:
            return
    }

    @android.webkit.JavascriptInterface
    public void close() {
            r2 = this;
            java.lang.ref.WeakReference<android.app.Activity> r0 = r2.a
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L1a
            java.lang.String r0 = "WebViewHelper"
            java.lang.String r1 = "Web callback:close"
            cn.jpush.android.helper.Logger.d(r0, r1)
            java.lang.ref.WeakReference<android.app.Activity> r0 = r2.a
            java.lang.Object r0 = r0.get()
            android.app.Activity r0 = (android.app.Activity) r0
            r0.finish()
        L1a:
            return
    }

    @android.webkit.JavascriptInterface
    public void createShortcut(java.lang.String r1, java.lang.String r2, java.lang.String r3) {
            r0 = this;
            return
    }

    @android.webkit.JavascriptInterface
    public void download(java.lang.String r3) {
            r2 = this;
            java.lang.ref.WeakReference<android.app.Activity> r0 = r2.a
            java.lang.Object r0 = r0.get()
            if (r0 != 0) goto L9
            return
        L9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Web callback:download - "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "WebViewHelper"
            cn.jpush.android.helper.Logger.d(r0, r3)
            return
    }

    @android.webkit.JavascriptInterface
    public void download(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            java.lang.ref.WeakReference<android.app.Activity> r0 = r1.a
            java.lang.Object r0 = r0.get()
            if (r0 != 0) goto L9
            return
        L9:
            r1.a(r2)
            r1.download(r3)
            android.content.Context r2 = cn.jpush.android.local.JPushConstants.mApplicationContext
            cn.jpush.android.d.d r3 = r1.f2010b
            cn.jpush.android.x.b.c(r2, r3)
            java.lang.ref.WeakReference<android.app.Activity> r2 = r1.a
            java.lang.Object r2 = r2.get()
            android.app.Activity r2 = (android.app.Activity) r2
            r2.finish()
            return
    }

    @android.webkit.JavascriptInterface
    public void download(java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "msgType from web: "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.String r0 = "WebViewHelper"
            cn.jpush.android.helper.Logger.v(r0, r5)
            r2.download(r3, r4)
            return
    }

    @android.webkit.JavascriptInterface
    public void executeMsgMessage(java.lang.String r1) {
            r0 = this;
            return
    }

    @android.webkit.JavascriptInterface
    public java.lang.String getDevInfo() {
            r1 = this;
            java.lang.String r0 = ""
            return r0
    }

    @android.webkit.JavascriptInterface
    public java.lang.String getNotificationInfo() {
            r1 = this;
            java.lang.String r0 = ""
            return r0
    }

    @android.webkit.JavascriptInterface
    public java.lang.String getTplData() {
            r3 = this;
            cn.jpush.android.d.d r0 = r3.f2010b
            java.lang.String r1 = "WebViewHelper"
            if (r0 != 0) goto Le
            java.lang.String r0 = "[getTplData] entity is null"
            cn.jpush.android.helper.Logger.w(r1, r0)
            java.lang.String r0 = ""
            return r0
        Le:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "[getTplData] js get template data: "
            r0.append(r2)
            cn.jpush.android.d.d r2 = r3.f2010b
            java.lang.String r2 = r2.bl
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            cn.jpush.android.helper.Logger.d(r1, r0)
            cn.jpush.android.d.d r0 = r3.f2010b
            java.lang.String r0 = r0.bl
            return r0
    }

    @android.webkit.JavascriptInterface
    public java.lang.String getTplExtraData() {
            r1 = this;
            java.lang.String r0 = ""
            return r0
    }

    @android.webkit.JavascriptInterface
    public void inAppClick(java.lang.String r6) {
            r5 = this;
            java.lang.String r0 = "WebViewHelper"
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L43
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L43
            java.lang.String r2 = "actionType"
            int r2 = r1.optInt(r2)     // Catch: java.lang.Throwable -> L43
            java.lang.String r3 = "param"
            java.lang.String r1 = r1.optString(r3)     // Catch: java.lang.Throwable -> L43
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L43
            r3.<init>()     // Catch: java.lang.Throwable -> L43
            java.lang.String r4 = "h5 click, actionType: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L43
            r3.append(r2)     // Catch: java.lang.Throwable -> L43
            java.lang.String r2 = ", actionKey: "
            r3.append(r2)     // Catch: java.lang.Throwable -> L43
            r3.append(r1)     // Catch: java.lang.Throwable -> L43
            java.lang.String r1 = ", param: "
            r3.append(r1)     // Catch: java.lang.Throwable -> L43
            r3.append(r6)     // Catch: java.lang.Throwable -> L43
            java.lang.String r6 = r3.toString()     // Catch: java.lang.Throwable -> L43
            cn.jpush.android.helper.Logger.d(r0, r6)     // Catch: java.lang.Throwable -> L43
            cn.jpush.android.o.a r6 = cn.jpush.android.o.a.a()     // Catch: java.lang.Throwable -> L43
            android.content.Context r1 = cn.jpush.android.local.JPushConstants.mApplicationContext     // Catch: java.lang.Throwable -> L43
            cn.jpush.android.d.d r2 = r5.f2010b     // Catch: java.lang.Throwable -> L43
            r6.d(r1, r2)     // Catch: java.lang.Throwable -> L43
            return
        L43:
            r6 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "h5 click failed, "
            r1.append(r2)
            java.lang.String r6 = r6.getMessage()
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            cn.jpush.android.helper.Logger.w(r0, r6)
            return
    }

    @android.webkit.JavascriptInterface
    public void onLoadCallback(java.lang.String r7) {
            r6 = this;
            java.lang.String r0 = "WebViewHelper"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2f
            r1.<init>()     // Catch: java.lang.Throwable -> L2f
            java.lang.String r2 = "onLoadCallback : "
            r1.append(r2)     // Catch: java.lang.Throwable -> L2f
            r1.append(r7)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L2f
            cn.jpush.android.helper.Logger.d(r0, r1)     // Catch: java.lang.Throwable -> L2f
            boolean r1 = r6.f2011c     // Catch: java.lang.Throwable -> L2f
            if (r1 == 0) goto L31
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2f
            r1.<init>()     // Catch: java.lang.Throwable -> L2f
            java.lang.String r2 = "js callback already, param: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L2f
            r1.append(r7)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r7 = r1.toString()     // Catch: java.lang.Throwable -> L2f
            cn.jpush.android.helper.Logger.d(r0, r7)     // Catch: java.lang.Throwable -> L2f
            return
        L2f:
            r7 = move-exception
            goto L8d
        L31:
            r1 = 1
            r6.f2011c = r1     // Catch: java.lang.Throwable -> L2f
            android.content.Context r2 = cn.jpush.android.local.JPushConstants.mApplicationContext     // Catch: java.lang.Throwable -> L2f
            if (r2 != 0) goto L50
            java.lang.ref.WeakReference<android.app.Activity> r3 = r6.a     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r3 = r3.get()     // Catch: java.lang.Throwable -> L2f
            if (r3 == 0) goto L50
            java.lang.ref.WeakReference<android.app.Activity> r2 = r6.a     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> L2f
            android.app.Activity r2 = (android.app.Activity) r2     // Catch: java.lang.Throwable -> L2f
            android.content.Context r2 = r2.getApplicationContext()     // Catch: java.lang.Throwable -> L2f
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)     // Catch: java.lang.Throwable -> L2f
        L50:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L2f
            r3.<init>(r7)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r7 = "statusCode"
            int r7 = r3.optInt(r7)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r4 = "msg"
            java.lang.String r3 = r3.optString(r4)     // Catch: java.lang.Throwable -> L2f
            if (r7 == 0) goto L7f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2f
            r4.<init>()     // Catch: java.lang.Throwable -> L2f
            java.lang.String r5 = "msg tpl load failed, code: "
            r4.append(r5)     // Catch: java.lang.Throwable -> L2f
            r4.append(r7)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r5 = ", errMsg: "
            r4.append(r5)     // Catch: java.lang.Throwable -> L2f
            r4.append(r3)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r3 = r4.toString()     // Catch: java.lang.Throwable -> L2f
            cn.jpush.android.helper.Logger.ww(r0, r3)     // Catch: java.lang.Throwable -> L2f
        L7f:
            cn.jpush.android.o.a r3 = cn.jpush.android.o.a.a()     // Catch: java.lang.Throwable -> L2f
            cn.jpush.android.d.d r4 = r6.f2010b     // Catch: java.lang.Throwable -> L2f
            if (r7 != 0) goto L88
            goto L89
        L88:
            r1 = 0
        L89:
            r3.a(r2, r4, r1)     // Catch: java.lang.Throwable -> L2f
            return
        L8d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "[onLoadCallback] parse param error. "
            r1.append(r2)
            java.lang.String r7 = r7.getMessage()
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            cn.jpush.android.helper.Logger.w(r0, r7)
            return
    }

    @android.webkit.JavascriptInterface
    public void reportData(java.lang.String r1) {
            r0 = this;
            return
    }

    @android.webkit.JavascriptInterface
    public void showTitleBar() {
            r1 = this;
            java.lang.ref.WeakReference<android.app.Activity> r0 = r1.a     // Catch: java.lang.Throwable -> L1d
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L1d
            if (r0 == 0) goto L1d
            java.lang.ref.WeakReference<android.app.Activity> r0 = r1.a     // Catch: java.lang.Throwable -> L1d
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L1d
            boolean r0 = r0 instanceof cn.jpush.android.ui.PushActivity     // Catch: java.lang.Throwable -> L1d
            if (r0 == 0) goto L1d
            java.lang.ref.WeakReference<android.app.Activity> r0 = r1.a     // Catch: java.lang.Throwable -> L1d
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L1d
            cn.jpush.android.ui.PushActivity r0 = (cn.jpush.android.ui.PushActivity) r0     // Catch: java.lang.Throwable -> L1d
            r0.showTitleBar()     // Catch: java.lang.Throwable -> L1d
        L1d:
            return
    }

    @android.webkit.JavascriptInterface
    public void showToast(java.lang.String r3) {
            r2 = this;
            java.lang.ref.WeakReference<android.app.Activity> r0 = r2.a
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L2e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Web callback:showToast - "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "WebViewHelper"
            cn.jpush.android.helper.Logger.d(r1, r0)
            java.lang.ref.WeakReference<android.app.Activity> r0 = r2.a
            java.lang.Object r0 = r0.get()
            android.content.Context r0 = (android.content.Context) r0
            r1 = 1
            android.widget.Toast r3 = android.widget.Toast.makeText(r0, r3, r1)
            r3.show()
        L2e:
            return
    }

    @android.webkit.JavascriptInterface
    public void startActivityByIntent(java.lang.String r4, java.lang.String r5) {
            r3 = this;
            android.content.Context r0 = cn.jpush.android.local.JPushConstants.mApplicationContext
            if (r0 != 0) goto L5
            return
        L5:
            android.content.Intent r1 = new android.content.Intent     // Catch: java.lang.Throwable -> L1f
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r2 = r0.getPackageName()     // Catch: java.lang.Throwable -> L1f
            r1.addCategory(r2)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r2 = "cn.jpush.android.EXTRA"
            r1.putExtra(r2, r5)     // Catch: java.lang.Throwable -> L1f
            r5 = 268435456(0x10000000, float:2.524355E-29)
            r1.setFlags(r5)     // Catch: java.lang.Throwable -> L1f
            r0.startActivity(r1)     // Catch: java.lang.Throwable -> L1f
            return
        L1f:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "Unhandle intent : "
            r5.append(r0)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.String r5 = "WebViewHelper"
            cn.jpush.android.helper.Logger.ee(r5, r4)
            return
    }

    @android.webkit.JavascriptInterface
    public void startActivityByName(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "activityName = "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "WebViewHelper"
            cn.jpush.android.helper.Logger.d(r1, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L21
            java.lang.String r0 = "The activity name is null or empty, Give up.."
            cn.jpush.android.helper.Logger.ee(r1, r0)     // Catch: java.lang.Throwable -> L42
        L21:
            android.content.Context r0 = cn.jpush.android.local.JPushConstants.mApplicationContext     // Catch: java.lang.Throwable -> L42
            if (r0 != 0) goto L26
            goto L42
        L26:
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L42
            android.content.Intent r1 = new android.content.Intent     // Catch: java.lang.Throwable -> L42
            r1.<init>(r0, r3)     // Catch: java.lang.Throwable -> L42
            java.lang.String r3 = "cn.jpush.android.ACTIVITY_PARAM"
            r1.putExtra(r3, r4)     // Catch: java.lang.Throwable -> L42
            r3 = 268435456(0x10000000, float:2.524355E-29)
            r1.setFlags(r3)     // Catch: java.lang.Throwable -> L42
            r0.startActivity(r1)     // Catch: java.lang.Throwable -> L42
            return
        L3d:
            java.lang.String r3 = "The activity name is invalid, Give up.."
            cn.jpush.android.helper.Logger.ee(r1, r3)     // Catch: java.lang.Throwable -> L42
        L42:
            return
    }

    @android.webkit.JavascriptInterface
    public void startMainActivity(java.lang.String r3) {
            r2 = this;
            java.lang.ref.WeakReference<android.app.Activity> r0 = r2.a
            java.lang.Object r0 = r0.get()
            android.content.Context r0 = (android.content.Context) r0
            if (r0 != 0) goto Lb
            return
        Lb:
            r1 = r0
            android.app.Activity r1 = (android.app.Activity) r1     // Catch: java.lang.Exception -> L15
            r1.finish()     // Catch: java.lang.Exception -> L15
            cn.jpush.android.ad.a.b(r0, r3)     // Catch: java.lang.Exception -> L15
            return
        L15:
            java.lang.String r3 = "WebViewHelper"
            java.lang.String r0 = "startMainActivity failed"
            cn.jpush.android.helper.Logger.ee(r3, r0)
            return
    }

    @android.webkit.JavascriptInterface
    public void startPushActivity(java.lang.String r4) {
            r3 = this;
            java.lang.String r0 = "WebViewHelper"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L41
            r1.<init>()     // Catch: java.lang.Throwable -> L41
            java.lang.String r2 = "[startPushActivity]:"
            r1.append(r2)     // Catch: java.lang.Throwable -> L41
            r1.append(r4)     // Catch: java.lang.Throwable -> L41
            java.lang.String r2 = ",activity:"
            r1.append(r2)     // Catch: java.lang.Throwable -> L41
            java.lang.ref.WeakReference<android.app.Activity> r2 = r3.a     // Catch: java.lang.Throwable -> L41
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> L41
            r1.append(r2)     // Catch: java.lang.Throwable -> L41
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L41
            cn.jpush.android.helper.Logger.d(r0, r1)     // Catch: java.lang.Throwable -> L41
            java.lang.ref.WeakReference<android.app.Activity> r0 = r3.a     // Catch: java.lang.Throwable -> L41
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L41
            if (r0 == 0) goto L41
            java.lang.ref.WeakReference<android.app.Activity> r0 = r3.a     // Catch: java.lang.Throwable -> L41
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L41
            boolean r0 = r0 instanceof cn.jpush.android.ui.PopWinActivity     // Catch: java.lang.Throwable -> L41
            if (r0 == 0) goto L41
            java.lang.ref.WeakReference<android.app.Activity> r0 = r3.a     // Catch: java.lang.Throwable -> L41
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L41
            cn.jpush.android.ui.PopWinActivity r0 = (cn.jpush.android.ui.PopWinActivity) r0     // Catch: java.lang.Throwable -> L41
            r0.startPushActivity(r4)     // Catch: java.lang.Throwable -> L41
        L41:
            return
    }

    @android.webkit.JavascriptInterface
    public void triggerNativeAction(java.lang.String r1) {
            r0 = this;
            java.lang.ref.WeakReference<android.app.Activity> r1 = r0.a
            java.lang.Object r1 = r1.get()
            android.content.Context r1 = (android.content.Context) r1
            return
    }
}
