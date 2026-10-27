package cn.jpush.android.ui;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class c extends cn.jpush.android.local.ProxyActivityAction {
    public static cn.jpush.android.webview.bridge.d a;

    /* renamed from: b, reason: collision with root package name */
    private int f1952b;

    /* renamed from: c, reason: collision with root package name */
    private cn.jpush.android.d.d f1953c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f1954d;

    /* renamed from: e, reason: collision with root package name */
    private java.lang.String f1955e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f1956f;

    /* renamed from: g, reason: collision with root package name */
    private android.webkit.WebView f1957g;

    /* renamed from: h, reason: collision with root package name */
    private android.widget.RelativeLayout f1958h;

    /* renamed from: i, reason: collision with root package name */
    private android.widget.TextView f1959i;

    /* renamed from: j, reason: collision with root package name */
    private android.widget.ImageButton f1960j;

    /* renamed from: k, reason: collision with root package name */
    private android.widget.ProgressBar f1961k;
    private cn.jpush.android.ui.a l;
    private android.view.View.OnClickListener m;




    static {
            return
    }

    public c() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f1952b = r0
            r1.f1954d = r0
            r1.f1956f = r0
            cn.jpush.android.ui.c$2 r0 = new cn.jpush.android.ui.c$2
            r0.<init>(r1)
            r1.m = r0
            return
    }

    static /* synthetic */ android.webkit.WebView a(cn.jpush.android.ui.c r0) {
            android.webkit.WebView r0 = r0.f1957g
            return r0
    }

    private cn.jpush.android.d.d a(android.app.Activity r4, android.content.Intent r5) {
            r3 = this;
            android.content.Intent r0 = r4.getIntent()
            cn.jpush.android.d.d r0 = cn.jpush.android.x.b.b(r4, r0)
            if (r0 == 0) goto Lb
            return r0
        Lb:
            java.lang.String r0 = "parse entity form plugin plateform"
            java.lang.String r1 = "PushActivityImpl"
            cn.jpush.android.helper.Logger.dd(r1, r0)
            android.net.Uri r0 = r5.getData()
            if (r0 == 0) goto L21
            android.net.Uri r0 = r5.getData()
            java.lang.String r0 = r0.toString()
            goto L22
        L21:
            r0 = 0
        L22:
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 == 0) goto L38
            android.os.Bundle r2 = r5.getExtras()
            if (r2 == 0) goto L38
            android.os.Bundle r5 = r5.getExtras()
            java.lang.String r0 = "JMessageExtra"
            java.lang.String r0 = r5.getString(r0)
        L38:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r2 = "content:"
            r5.append(r2)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            cn.jpush.android.helper.Logger.d(r1, r5)
            java.lang.String r5 = ""
            cn.jpush.android.d.d r4 = cn.jpush.android.ac.d.a(r4, r0, r5)
            return r4
    }

    private void a(android.app.Activity r4, cn.jpush.android.d.d r5) {
            r3 = this;
            java.lang.String r0 = "PushActivityImpl"
            if (r5 == 0) goto L2d
            int r1 = r5.r
            if (r1 == 0) goto L25
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid msg type to show - "
            r1.append(r2)
            int r2 = r5.r
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            cn.jpush.android.helper.Logger.w(r0, r1)
            cn.jpush.android.x.b.c(r4, r5)
            r4.finish()
            return
        L25:
            r0 = 1
            r4.setRequestedOrientation(r0)
            r3.b(r4, r5)
            return
        L2d:
            java.lang.String r5 = "Null message entity! Close PushActivity!"
            cn.jpush.android.helper.Logger.ww(r0, r5)
            r4.finish()
            return
    }

    private void b() {
            r5 = this;
            r0 = 2
            java.lang.Object[] r1 = new java.lang.Object[r0]
            cn.jpush.android.webview.bridge.d r2 = cn.jpush.android.ui.c.a
            r3 = 0
            r1[r3] = r2
            r2 = 1
            java.lang.String r4 = "JPushWeb"
            r1[r2] = r4
            java.lang.Class[] r0 = new java.lang.Class[r0]
            java.lang.Class<java.lang.Object> r4 = java.lang.Object.class
            r0[r3] = r4
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r0[r2] = r3
            android.webkit.WebView r2 = r5.f1957g     // Catch: java.lang.Throwable -> L1f
            java.lang.String r3 = "addJavascriptInterface"
            cn.jpush.android.ad.k.a(r2, r3, r0, r1)     // Catch: java.lang.Throwable -> L1f
            return
        L1f:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "addJavascriptInterface failed:"
            r1.append(r2)
            java.lang.String r0 = r0.toString()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "PushActivityImpl"
            cn.jpush.android.helper.Logger.e(r1, r0)
            return
    }

    private void b(android.app.Activity r5) {
            r4 = this;
            android.content.Intent r0 = r5.getIntent()
            java.lang.String r1 = "PushActivityImpl"
            if (r0 == 0) goto L68
            android.content.Intent r0 = r5.getIntent()     // Catch: java.lang.Throwable -> L45
            boolean r0 = cn.jpush.android.x.b.a(r5, r0)     // Catch: java.lang.Throwable -> L45
            if (r0 != 0) goto L13
            return
        L13:
            android.content.Intent r0 = r5.getIntent()     // Catch: java.lang.Throwable -> L45
            java.lang.String r2 = "from_way"
            r3 = 0
            boolean r0 = r0.getBooleanExtra(r2, r3)     // Catch: java.lang.Throwable -> L45
            r4.f1954d = r0     // Catch: java.lang.Throwable -> L45
            android.content.Intent r0 = r5.getIntent()     // Catch: java.lang.Throwable -> L45
            cn.jpush.android.d.d r0 = r4.a(r5, r0)     // Catch: java.lang.Throwable -> L45
            r4.f1953c = r0     // Catch: java.lang.Throwable -> L45
            if (r0 == 0) goto L47
            java.lang.String r2 = r0.f1757d     // Catch: java.lang.Throwable -> L45
            r4.f1955e = r2     // Catch: java.lang.Throwable -> L45
            java.lang.String r0 = r0.bh     // Catch: java.lang.Throwable -> L45
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L45
            r0 = r0 ^ 1
            r4.f1956f = r0     // Catch: java.lang.Throwable -> L45
            cn.jpush.android.d.d r0 = r4.f1953c     // Catch: java.lang.Throwable -> L45
            r4.a(r5, r0)     // Catch: java.lang.Throwable -> L45
            cn.jpush.android.d.d r0 = r4.f1953c     // Catch: java.lang.Throwable -> L45
            cn.jpush.android.k.a.a(r5, r0)     // Catch: java.lang.Throwable -> L45
            return
        L45:
            r0 = move-exception
            goto L50
        L47:
            java.lang.String r0 = "Warning，null message entity! Close PushActivity!"
            cn.jpush.android.helper.Logger.ww(r1, r0)     // Catch: java.lang.Throwable -> L45
            r5.finish()     // Catch: java.lang.Throwable -> L45
            return
        L50:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Extra data is not serializable!"
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            cn.jpush.android.helper.Logger.ee(r1, r0)
        L64:
            r5.finish()
            return
        L68:
            java.lang.String r0 = "PushActivity get NULL intent!"
            cn.jpush.android.helper.Logger.ww(r1, r0)
            goto L64
    }

    private void b(android.app.Activity r8, cn.jpush.android.d.d r9) {
            r7 = this;
            java.lang.String r0 = "Action: processShow"
            java.lang.String r1 = "PushActivityImpl"
            cn.jpush.android.helper.Logger.i(r1, r0)
            if (r9 != 0) goto L12
            java.lang.String r9 = "Null message entity! Close PushActivity!"
            cn.jpush.android.helper.Logger.ww(r1, r9)
        Le:
            r8.finish()
            return
        L12:
            int r0 = r9.ae
            if (r0 != 0) goto Lab
            int r0 = r9.ac
            r7.f1952b = r0
            android.content.res.Resources r0 = r8.getResources()
            java.lang.String r2 = "layout"
            java.lang.String r3 = r8.getPackageName()
            java.lang.String r4 = "jpush_webview_layout"
            int r0 = r0.getIdentifier(r4, r2, r3)
            if (r0 != 0) goto L32
            java.lang.String r9 = "Please add layout resource jpush_webview_layout.xml to res/layout !"
        L2e:
            cn.jpush.android.helper.Logger.ee(r1, r9)
            goto Le
        L32:
            r8.setContentView(r0)
            java.lang.String r0 = r9.Z
            boolean r2 = cn.jpush.android.ad.a.c(r0)
            if (r2 != 0) goto L41
            cn.jpush.android.x.b.c(r8, r9)
            goto Le
        L41:
            java.lang.String r2 = r9.ab
            boolean r3 = r9.s
            if (r3 == 0) goto L8d
            android.content.res.Resources r3 = r8.getResources()
            java.lang.String r4 = "id"
            java.lang.String r5 = r8.getPackageName()
            java.lang.String r6 = "actionbarLayoutId"
            int r3 = r3.getIdentifier(r6, r4, r5)
            if (r3 != 0) goto L5c
            java.lang.String r9 = "Please use default code in jpush_webview_layout.xml!"
            goto L2e
        L5c:
            android.view.View r1 = r8.findViewById(r3)
            if (r1 == 0) goto L8d
            r7.a(r8, r1, r9)
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 != 0) goto L88
            java.io.File r1 = new java.io.File
            java.lang.String r3 = "file://"
            java.lang.String r4 = ""
            java.lang.String r3 = r2.replace(r3, r4)
            r1.<init>(r3)
            boolean r1 = r1.exists()
            if (r1 == 0) goto L88
            boolean r1 = r7.f1954d
            if (r1 != 0) goto L88
            android.webkit.WebView r0 = r7.f1957g
            r0.loadUrl(r2)
            goto L8d
        L88:
            android.webkit.WebView r1 = r7.f1957g
            r1.loadUrl(r0)
        L8d:
            boolean r0 = r7.f1954d
            if (r0 != 0) goto Lab
            boolean r0 = r7.f1956f
            if (r0 != 0) goto Lab
            byte r3 = r9.ai
            if (r3 != 0) goto La1
            java.lang.String r9 = r7.f1955e
            r0 = 1000(0x3e8, double:4.94E-321)
            cn.jpush.android.helper.c.a(r9, r0, r8)
            goto Lab
        La1:
            java.lang.String r1 = r9.f1757d
            java.lang.String r2 = ""
            r4 = 1000(0x3e8, double:4.94E-321)
            r6 = r8
            cn.jpush.android.helper.c.a(r1, r2, r3, r4, r6)
        Lab:
            return
    }

    private void c(android.app.Activity r3) {
            r2 = this;
            android.view.Window r0 = r3.getWindow()     // Catch: java.lang.Throwable -> L1f
            android.view.WindowManager$LayoutParams r0 = r0.getAttributes()     // Catch: java.lang.Throwable -> L1f
            int r1 = r0.flags     // Catch: java.lang.Throwable -> L1f
            r1 = r1 & (-1025(0xfffffffffffffbff, float:NaN))
            r0.flags = r1     // Catch: java.lang.Throwable -> L1f
            android.view.Window r1 = r3.getWindow()     // Catch: java.lang.Throwable -> L1f
            r1.setAttributes(r0)     // Catch: java.lang.Throwable -> L1f
            android.view.Window r3 = r3.getWindow()     // Catch: java.lang.Throwable -> L1f
            r0 = 512(0x200, float:7.17E-43)
            r3.clearFlags(r0)     // Catch: java.lang.Throwable -> L1f
            return
        L1f:
            java.lang.String r3 = "PushActivityImpl"
            java.lang.String r0 = "quitFullScreen errno"
            cn.jpush.android.helper.Logger.w(r3, r0)
            return
    }

    public void a() {
            r4 = this;
            android.widget.RelativeLayout r0 = r4.f1958h     // Catch: java.lang.Throwable -> L34
            if (r0 == 0) goto L34
            int r0 = r0.getVisibility()     // Catch: java.lang.Throwable -> L34
            r1 = 8
            if (r0 != r1) goto L34
            android.widget.RelativeLayout r0 = r4.f1958h     // Catch: java.lang.Throwable -> L34
            r1 = 0
            r0.setVisibility(r1)     // Catch: java.lang.Throwable -> L34
            android.widget.RelativeLayout r0 = r4.f1958h     // Catch: java.lang.Throwable -> L34
            android.content.Context r0 = r0.getContext()     // Catch: java.lang.Throwable -> L34
            android.app.Activity r0 = (android.app.Activity) r0     // Catch: java.lang.Throwable -> L34
            r4.c(r0)     // Catch: java.lang.Throwable -> L34
            android.widget.ImageButton r0 = r4.f1960j     // Catch: java.lang.Throwable -> L34
            android.view.View$OnClickListener r1 = r4.m     // Catch: java.lang.Throwable -> L34
            r0.setOnClickListener(r1)     // Catch: java.lang.Throwable -> L34
            android.webkit.WebView r0 = r4.f1957g     // Catch: java.lang.Throwable -> L34
            if (r0 == 0) goto L34
            cn.jpush.android.ui.c$3 r1 = new cn.jpush.android.ui.c$3     // Catch: java.lang.Throwable -> L34
            java.lang.String r2 = "PushActivityImpl#showTitleBar"
            r1.<init>(r4, r2)     // Catch: java.lang.Throwable -> L34
            r2 = 1000(0x3e8, double:4.94E-321)
            r0.postDelayed(r1, r2)     // Catch: java.lang.Throwable -> L34
        L34:
            return
    }

    public void a(android.app.Activity r6) {
            r5 = this;
            java.lang.String r0 = "PushActivityImpl"
            r6.finish()
            int r1 = r5.f1952b
            r2 = 1
            if (r2 != r1) goto L79
            java.lang.String r1 = "activity"
            java.lang.Object r1 = r6.getSystemService(r1)     // Catch: java.lang.Throwable -> L71
            android.app.ActivityManager r1 = (android.app.ActivityManager) r1     // Catch: java.lang.Throwable -> L71
            java.util.List r3 = r1.getRunningTasks(r2)     // Catch: java.lang.Throwable -> L71
            r4 = 0
            java.lang.Object r3 = r3.get(r4)     // Catch: java.lang.Throwable -> L71
            android.app.ActivityManager$RunningTaskInfo r3 = (android.app.ActivityManager.RunningTaskInfo) r3     // Catch: java.lang.Throwable -> L71
            android.content.ComponentName r3 = cn.jpush.android.ui.d.a(r3)     // Catch: java.lang.Throwable -> L71
            java.util.List r1 = r1.getRunningTasks(r2)     // Catch: java.lang.Throwable -> L71
            java.lang.Object r1 = r1.get(r4)     // Catch: java.lang.Throwable -> L71
            android.app.ActivityManager$RunningTaskInfo r1 = (android.app.ActivityManager.RunningTaskInfo) r1     // Catch: java.lang.Throwable -> L71
            android.content.ComponentName r1 = cn.jpush.android.ui.e.a(r1)     // Catch: java.lang.Throwable -> L71
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L71
            r2.<init>()     // Catch: java.lang.Throwable -> L71
            java.lang.String r4 = "baseActivity  = "
            r2.append(r4)     // Catch: java.lang.Throwable -> L71
            java.lang.String r4 = r3.toString()     // Catch: java.lang.Throwable -> L71
            r2.append(r4)     // Catch: java.lang.Throwable -> L71
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L71
            cn.jpush.android.helper.Logger.d(r0, r2)     // Catch: java.lang.Throwable -> L71
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L71
            r2.<init>()     // Catch: java.lang.Throwable -> L71
            java.lang.String r4 = "topActivity  = "
            r2.append(r4)     // Catch: java.lang.Throwable -> L71
            java.lang.String r4 = r1.toString()     // Catch: java.lang.Throwable -> L71
            r2.append(r4)     // Catch: java.lang.Throwable -> L71
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L71
            cn.jpush.android.helper.Logger.d(r0, r2)     // Catch: java.lang.Throwable -> L71
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L71
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L71
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> L71
            if (r1 == 0) goto L79
            cn.jpush.android.ad.a.f(r6)     // Catch: java.lang.Throwable -> L71
            return
        L71:
            java.lang.String r1 = "Get running tasks failed."
            cn.jpush.android.helper.Logger.ww(r0, r1)
            cn.jpush.android.ad.a.f(r6)
        L79:
            return
    }

    public void a(android.app.Activity r12, android.view.View r13, cn.jpush.android.d.d r14) {
            r11 = this;
            java.lang.String r0 = "Android sdk version greater than or equal to 17, Java—Js interact by annotation!"
            java.lang.String r1 = "id"
            java.lang.String r2 = r14.aa     // Catch: java.lang.Throwable -> L150
            r3 = 1
            r13.setFocusable(r3)     // Catch: java.lang.Throwable -> L150
            android.content.res.Resources r4 = r12.getResources()     // Catch: java.lang.Throwable -> L150
            java.lang.String r5 = "fullWebView"
            java.lang.String r6 = r12.getPackageName()     // Catch: java.lang.Throwable -> L150
            int r4 = r4.getIdentifier(r5, r1, r6)     // Catch: java.lang.Throwable -> L150
            if (r4 <= 0) goto L24
            r5 = r13
            android.widget.LinearLayout r5 = (android.widget.LinearLayout) r5     // Catch: java.lang.Throwable -> L150
            android.view.View r4 = r12.findViewById(r4)     // Catch: java.lang.Throwable -> L150
            r5.removeView(r4)     // Catch: java.lang.Throwable -> L150
        L24:
            android.webkit.WebView r4 = new android.webkit.WebView     // Catch: java.lang.Throwable -> L150
            android.content.Context r5 = r12.getApplicationContext()     // Catch: java.lang.Throwable -> L150
            android.content.Context r5 = com.stub.StubApp.getOrigApplicationContext(r5)     // Catch: java.lang.Throwable -> L150
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L150
            r11.f1957g = r4     // Catch: java.lang.Throwable -> L150
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams     // Catch: java.lang.Throwable -> L150
            r6 = -1
            r5.<init>(r6, r6)     // Catch: java.lang.Throwable -> L150
            r4.setLayoutParams(r5)     // Catch: java.lang.Throwable -> L150
            android.webkit.WebView r4 = r11.f1957g     // Catch: java.lang.Throwable -> L150
            java.lang.String r5 = "#000000"
            int r5 = android.graphics.Color.parseColor(r5)     // Catch: java.lang.Throwable -> L150
            r4.setBackgroundColor(r5)     // Catch: java.lang.Throwable -> L150
            android.widget.LinearLayout r13 = (android.widget.LinearLayout) r13     // Catch: java.lang.Throwable -> L150
            android.webkit.WebView r4 = r11.f1957g     // Catch: java.lang.Throwable -> L150
            r13.addView(r4)     // Catch: java.lang.Throwable -> L150
            android.content.res.Resources r13 = r12.getResources()     // Catch: java.lang.Throwable -> L150
            java.lang.String r4 = "rlRichpushTitleBar"
            java.lang.String r5 = r12.getPackageName()     // Catch: java.lang.Throwable -> L150
            int r13 = r13.getIdentifier(r4, r1, r5)     // Catch: java.lang.Throwable -> L150
            android.view.View r13 = r12.findViewById(r13)     // Catch: java.lang.Throwable -> L150
            android.widget.RelativeLayout r13 = (android.widget.RelativeLayout) r13     // Catch: java.lang.Throwable -> L150
            r11.f1958h = r13     // Catch: java.lang.Throwable -> L150
            android.content.res.Resources r13 = r12.getResources()     // Catch: java.lang.Throwable -> L150
            java.lang.String r4 = "tvRichpushTitle"
            java.lang.String r5 = r12.getPackageName()     // Catch: java.lang.Throwable -> L150
            int r13 = r13.getIdentifier(r4, r1, r5)     // Catch: java.lang.Throwable -> L150
            android.view.View r13 = r12.findViewById(r13)     // Catch: java.lang.Throwable -> L150
            android.widget.TextView r13 = (android.widget.TextView) r13     // Catch: java.lang.Throwable -> L150
            r11.f1959i = r13     // Catch: java.lang.Throwable -> L150
            android.content.res.Resources r13 = r12.getResources()     // Catch: java.lang.Throwable -> L150
            java.lang.String r4 = "imgRichpushBtnBack"
            java.lang.String r5 = r12.getPackageName()     // Catch: java.lang.Throwable -> L150
            int r13 = r13.getIdentifier(r4, r1, r5)     // Catch: java.lang.Throwable -> L150
            android.view.View r13 = r12.findViewById(r13)     // Catch: java.lang.Throwable -> L150
            android.widget.ImageButton r13 = (android.widget.ImageButton) r13     // Catch: java.lang.Throwable -> L150
            r11.f1960j = r13     // Catch: java.lang.Throwable -> L150
            android.content.res.Resources r13 = r12.getResources()     // Catch: java.lang.Throwable -> L150
            java.lang.String r4 = "pushPrograssBar"
            java.lang.String r5 = r12.getPackageName()     // Catch: java.lang.Throwable -> L150
            int r13 = r13.getIdentifier(r4, r1, r5)     // Catch: java.lang.Throwable -> L150
            android.view.View r13 = r12.findViewById(r13)     // Catch: java.lang.Throwable -> L150
            android.widget.ProgressBar r13 = (android.widget.ProgressBar) r13     // Catch: java.lang.Throwable -> L150
            r11.f1961k = r13     // Catch: java.lang.Throwable -> L150
            android.webkit.WebView r13 = r11.f1957g     // Catch: java.lang.Throwable -> L150
            java.lang.String r1 = "PushActivityImpl"
            if (r13 == 0) goto Lb8
            android.widget.RelativeLayout r13 = r11.f1958h     // Catch: java.lang.Throwable -> L150
            if (r13 == 0) goto Lb8
            android.widget.TextView r13 = r11.f1959i     // Catch: java.lang.Throwable -> L150
            if (r13 == 0) goto Lb8
            android.widget.ImageButton r13 = r11.f1960j     // Catch: java.lang.Throwable -> L150
            if (r13 != 0) goto Lc0
        Lb8:
            java.lang.String r13 = "Please use default code in jpush_webview_layout.xml!"
            cn.jpush.android.helper.Logger.ee(r1, r13)     // Catch: java.lang.Throwable -> L150
            r12.finish()     // Catch: java.lang.Throwable -> L150
        Lc0:
            int r13 = r14.ad     // Catch: java.lang.Throwable -> L150
            if (r3 != r13) goto Ld5
            android.widget.RelativeLayout r13 = r11.f1958h     // Catch: java.lang.Throwable -> L150
            r2 = 8
            r13.setVisibility(r2)     // Catch: java.lang.Throwable -> L150
            android.view.Window r13 = r12.getWindow()     // Catch: java.lang.Throwable -> L150
            r2 = 1024(0x400, float:1.435E-42)
            r13.setFlags(r2, r2)     // Catch: java.lang.Throwable -> L150
            goto Lf5
        Ld5:
            android.widget.TextView r13 = r11.f1959i     // Catch: java.lang.Throwable -> L150
            r13.setText(r2)     // Catch: java.lang.Throwable -> L150
            android.widget.ImageButton r13 = r11.f1960j     // Catch: java.lang.Throwable -> L150
            android.view.View$OnClickListener r2 = r11.m     // Catch: java.lang.Throwable -> L150
            r13.setOnClickListener(r2)     // Catch: java.lang.Throwable -> L150
            android.content.Context r4 = r12.getApplicationContext()     // Catch: java.lang.Throwable -> L150
            android.content.Context r4 = com.stub.StubApp.getOrigApplicationContext(r4)     // Catch: java.lang.Throwable -> L150
            android.widget.ImageButton r5 = r11.f1960j     // Catch: java.lang.Throwable -> L150
            r9 = 10
            r10 = 6
            r6 = 1
            r7 = 10
            r8 = 6
            cn.jpush.android.ad.m.a(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L150
        Lf5:
            android.webkit.WebView r13 = r11.f1957g     // Catch: java.lang.Throwable -> L150
            r13.setScrollbarFadingEnabled(r3)     // Catch: java.lang.Throwable -> L150
            android.webkit.WebView r13 = r11.f1957g     // Catch: java.lang.Throwable -> L150
            r2 = 33554432(0x2000000, float:9.403955E-38)
            r13.setScrollBarStyle(r2)     // Catch: java.lang.Throwable -> L150
            android.webkit.WebView r13 = r11.f1957g     // Catch: java.lang.Throwable -> L150
            android.webkit.WebSettings r13 = r13.getSettings()     // Catch: java.lang.Throwable -> L150
            cn.jpush.android.ad.a.c(r13)     // Catch: java.lang.Throwable -> L150
            android.webkit.WebView r2 = r11.f1957g     // Catch: java.lang.Throwable -> L150
            cn.jpush.android.ad.a.a(r2)     // Catch: java.lang.Throwable -> L150
            cn.jpush.android.ad.a.a(r13)     // Catch: java.lang.Throwable -> L150
            r2 = 0
            r13.setSavePassword(r2)     // Catch: java.lang.Throwable -> L150
            cn.jpush.android.webview.bridge.d r13 = new cn.jpush.android.webview.bridge.d     // Catch: java.lang.Throwable -> L150
            r13.<init>(r12, r14)     // Catch: java.lang.Throwable -> L150
            cn.jpush.android.ui.c.a = r13     // Catch: java.lang.Throwable -> L150
            cn.jpush.android.helper.Logger.dd(r1, r0)     // Catch: java.lang.Throwable -> L150
            cn.jpush.android.helper.Logger.d(r1, r0)     // Catch: java.lang.Throwable -> L150
            r11.b()     // Catch: java.lang.Throwable -> L150
            android.webkit.WebView r13 = r11.f1957g     // Catch: java.lang.Throwable -> L150
            cn.jpush.android.webview.bridge.a r0 = new cn.jpush.android.webview.bridge.a     // Catch: java.lang.Throwable -> L150
            java.lang.String r1 = "JPushWeb"
            java.lang.Class<cn.jpush.android.webview.bridge.HostJsScope> r2 = cn.jpush.android.webview.bridge.HostJsScope.class
            android.widget.ProgressBar r3 = r11.f1961k     // Catch: java.lang.Throwable -> L150
            android.widget.TextView r4 = r11.f1959i     // Catch: java.lang.Throwable -> L150
            r0.<init>(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L150
            r13.setWebChromeClient(r0)     // Catch: java.lang.Throwable -> L150
            cn.jpush.android.ui.a r13 = new cn.jpush.android.ui.a     // Catch: java.lang.Throwable -> L150
            r13.<init>(r14, r12)     // Catch: java.lang.Throwable -> L150
            r11.l = r13     // Catch: java.lang.Throwable -> L150
            boolean r12 = r11.f1956f     // Catch: java.lang.Throwable -> L150
            r13.a(r12)     // Catch: java.lang.Throwable -> L150
            android.webkit.WebView r12 = r11.f1957g     // Catch: java.lang.Throwable -> L150
            cn.jpush.android.ui.a r13 = r11.l     // Catch: java.lang.Throwable -> L150
            r12.setWebViewClient(r13)     // Catch: java.lang.Throwable -> L150
            cn.jpush.android.webview.bridge.d r12 = cn.jpush.android.ui.c.a     // Catch: java.lang.Throwable -> L150
            cn.jpush.android.webview.bridge.HostJsScope.setWebViewHelper(r12)     // Catch: java.lang.Throwable -> L150
        L150:
            return
    }

    @Override // cn.jpush.android.local.ProxyActivityAction
    public void onBackPressed(android.app.Activity r8) {
            r7 = this;
            android.webkit.WebView r0 = r7.f1957g
            if (r0 == 0) goto L10
            boolean r0 = r0.canGoBack()
            if (r0 == 0) goto L10
            android.webkit.WebView r8 = r7.f1957g
            r8.goBack()
            return
        L10:
            cn.jpush.android.d.d r0 = r7.f1953c
            if (r0 == 0) goto L18
            byte r3 = r0.ai
            if (r3 != 0) goto L1a
        L18:
            r6 = r8
            goto L25
        L1a:
            java.lang.String r1 = r7.f1955e
            java.lang.String r2 = ""
            r4 = 1006(0x3ee, double:4.97E-321)
            r6 = r8
            cn.jpush.android.helper.c.a(r1, r2, r3, r4, r6)
            goto L2c
        L25:
            java.lang.String r8 = r7.f1955e
            r0 = 1006(0x3ee, double:4.97E-321)
            cn.jpush.android.helper.c.a(r8, r0, r6)
        L2c:
            r7.a(r6)
            return
    }

    @Override // cn.jpush.android.local.ProxyActivityAction
    public void onConfigurationChanged(android.app.Activity r1, android.content.res.Configuration r2) {
            r0 = this;
            return
    }

    @Override // cn.jpush.android.local.ProxyActivityAction
    public void onCreate(android.app.Activity r1, android.os.Bundle r2) {
            r0 = this;
            cn.jpush.android.ad.a.e(r1)
            r0.b(r1)
            return
    }

    @Override // cn.jpush.android.local.ProxyActivityAction
    public boolean onCreateOptionsMenu(android.app.Activity r1, android.view.Menu r2) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // cn.jpush.android.local.ProxyActivityAction
    public void onDestroy(android.app.Activity r3) {
            r2 = this;
            android.webkit.WebView r3 = r2.f1957g
            if (r3 == 0) goto L58
            android.view.ViewParent r3 = r3.getParent()
            if (r3 == 0) goto L2c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "webview parent view "
            r0.append(r1)
            java.lang.String r1 = r3.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "PushActivityImpl"
            cn.jpush.android.helper.Logger.d(r1, r0)
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            android.webkit.WebView r0 = r2.f1957g
            r3.removeView(r0)
        L2c:
            android.webkit.WebView r3 = r2.f1957g
            android.webkit.WebSettings r3 = r3.getSettings()
            r0 = 0
            r3.setJavaScriptEnabled(r0)
            android.webkit.WebView r3 = r2.f1957g
            r0 = 1
            r3.clearCache(r0)
            android.webkit.WebView r3 = r2.f1957g
            r3.clearHistory()
            android.webkit.WebView r3 = r2.f1957g
            r3.clearView()
            android.webkit.WebView r3 = r2.f1957g
            r3.removeAllViews()
            android.webkit.WebView r3 = r2.f1957g
            r3.clearSslPreferences()
            android.webkit.WebView r3 = r2.f1957g
            r3.destroy()
            r3 = 0
            r2.f1957g = r3
        L58:
            return
    }

    @Override // cn.jpush.android.local.ProxyActivityAction
    public void onEvent(android.app.Activity r1, java.lang.String r2, android.os.Bundle r3) {
            r0 = this;
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L18
            java.lang.String r3 = "push_show_titlebar"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L18
            cn.jpush.android.ui.c$1 r2 = new cn.jpush.android.ui.c$1
            java.lang.String r3 = "PushActivityImpl#onEvent"
            r2.<init>(r0, r3)
            r1.runOnUiThread(r2)
        L18:
            return
    }

    @Override // cn.jpush.android.local.ProxyActivityAction
    public boolean onKeyDown(android.app.Activity r1, int r2, android.view.KeyEvent r3) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // cn.jpush.android.local.ProxyActivityAction
    public void onNewIntent(android.app.Activity r1, android.content.Intent r2) {
            r0 = this;
            r1.setIntent(r2)
            r0.b(r1)
            return
    }

    @Override // cn.jpush.android.local.ProxyActivityAction
    public void onPause(android.app.Activity r1) {
            r0 = this;
            android.webkit.WebView r1 = r0.f1957g
            if (r1 == 0) goto L7
            r1.onPause()
        L7:
            return
    }

    @Override // cn.jpush.android.local.ProxyActivityAction
    public void onRestart(android.app.Activity r1) {
            r0 = this;
            return
    }

    @Override // cn.jpush.android.local.ProxyActivityAction
    public void onResume(android.app.Activity r1) {
            r0 = this;
            android.webkit.WebView r1 = r0.f1957g
            if (r1 == 0) goto Lc
            r1.onResume()
            cn.jpush.android.webview.bridge.d r1 = cn.jpush.android.ui.c.a
            cn.jpush.android.webview.bridge.HostJsScope.setWebViewHelper(r1)
        Lc:
            return
    }

    @Override // cn.jpush.android.local.ProxyActivityAction
    public void onStart(android.app.Activity r1, android.content.Intent r2) {
            r0 = this;
            return
    }

    @Override // cn.jpush.android.local.ProxyActivityAction
    public void onStop(android.app.Activity r1) {
            r0 = this;
            return
    }
}
