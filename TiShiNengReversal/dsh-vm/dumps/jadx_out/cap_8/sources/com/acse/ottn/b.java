package com.acse.ottn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class b {

    /* renamed from: f, reason: collision with root package name */
    public static com.acse.ottn.b f2140f = null;

    /* renamed from: g, reason: collision with root package name */
    public static java.lang.String f2141g = "acse_AccessibilityUtil";

    /* renamed from: h, reason: collision with root package name */
    public static final int f2142h = 3;

    /* renamed from: i, reason: collision with root package name */
    public static final long f2143i = 60000;
    public boolean a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2144b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2145c;

    /* renamed from: d, reason: collision with root package name */
    public android.os.CountDownTimer f2146d;

    /* renamed from: e, reason: collision with root package name */
    public long[] f2147e;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class a extends android.accessibilityservice.AccessibilityService.GestureResultCallback {
        public final /* synthetic */ com.acse.ottn.b a;

        public a(com.acse.ottn.b r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.accessibilityservice.AccessibilityService.GestureResultCallback
        public void onCompleted(android.accessibilityservice.GestureDescription r2) {
                r1 = this;
                super.onCompleted(r2)
                java.lang.String r2 = "samonp-->"
                java.lang.String r0 = "点击回调"
                com.acse.ottn.h2.a(r2, r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.acse.ottn.b$b, reason: collision with other inner class name */
    public class C0065b extends android.accessibilityservice.AccessibilityService.GestureResultCallback {
        public final /* synthetic */ com.acse.ottn.b a;

        public C0065b(com.acse.ottn.b r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.accessibilityservice.AccessibilityService.GestureResultCallback
        public void onCompleted(android.accessibilityservice.GestureDescription r1) {
                r0 = this;
                super.onCompleted(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class c extends android.accessibilityservice.AccessibilityService.GestureResultCallback {
        public final /* synthetic */ com.acse.ottn.b a;

        public c(com.acse.ottn.b r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.accessibilityservice.AccessibilityService.GestureResultCallback
        public void onCompleted(android.accessibilityservice.GestureDescription r1) {
                r0 = this;
                super.onCompleted(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class d implements com.acse.ottn.n0.d {
        public final /* synthetic */ android.accessibilityservice.AccessibilityService a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.b f2148b;

        public d(com.acse.ottn.b r1, android.accessibilityservice.AccessibilityService r2) {
                r0 = this;
                r0.f2148b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // com.acse.ottn.n0.d
        public void a() {
                r2 = this;
                com.acse.ottn.b r0 = r2.f2148b
                r1 = 0
                r0.f2146d = r1
                return
        }

        @Override // com.acse.ottn.n0.d
        public void a(long r2) {
                r1 = this;
                android.accessibilityservice.AccessibilityService r2 = r1.a
                if (r2 == 0) goto L29
                com.acse.ottn.b r2 = com.acse.ottn.b.c()
                android.accessibilityservice.AccessibilityService r3 = r1.a
                java.lang.String r0 = "com.tencent.mm:id/gix"
                android.view.accessibility.AccessibilityNodeInfo r2 = r2.f(r3, r0)
                if (r2 == 0) goto L29
                com.acse.ottn.b r2 = com.acse.ottn.b.c()
                android.accessibilityservice.AccessibilityService r3 = r1.a
                r2.a(r3, r0)
                com.acse.ottn.b r2 = r1.f2148b
                android.os.CountDownTimer r2 = r2.f2146d
                if (r2 == 0) goto L29
                r2.cancel()
                com.acse.ottn.b r2 = r1.f2148b
                r3 = 0
                r2.f2146d = r3
            L29:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class e implements com.acse.ottn.io.reactivex.functions.Consumer<java.lang.String> {
        public final /* synthetic */ com.acse.ottn.b a;

        public e(com.acse.ottn.b r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void a(java.lang.String r1) throws java.lang.Exception {
                r0 = this;
                return
        }

        @Override // com.acse.ottn.io.reactivex.functions.Consumer
        public /* bridge */ /* synthetic */ void accept(java.lang.String r1) throws java.lang.Exception {
                r0 = this;
                java.lang.String r1 = (java.lang.String) r1
                r0.a(r1)
                return
        }

        @Override // com.acse.ottn.io.reactivex.functions.Consumer
        public /* synthetic */ void call(java.lang.String r1) {
                r0 = this;
                com.acse.ottn.io.reactivex.functions.c.a(r0, r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class f implements com.acse.ottn.io.reactivex.functions.Consumer<java.lang.Throwable> {
        public final /* synthetic */ com.acse.ottn.b a;

        public f(com.acse.ottn.b r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void a(java.lang.Throwable r1) throws java.lang.Exception {
                r0 = this;
                return
        }

        @Override // com.acse.ottn.io.reactivex.functions.Consumer
        public /* bridge */ /* synthetic */ void accept(java.lang.Throwable r1) throws java.lang.Exception {
                r0 = this;
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                r0.a(r1)
                return
        }

        @Override // com.acse.ottn.io.reactivex.functions.Consumer
        public /* synthetic */ void call(java.lang.Throwable r1) {
                r0 = this;
                com.acse.ottn.io.reactivex.functions.c.a(r0, r1)
                return
        }
    }

    static {
            return
    }

    public b() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.a = r0
            r1.f2144b = r0
            r1.f2145c = r0
            r0 = 3
            long[] r0 = new long[r0]
            r1.f2147e = r0
            return
    }

    public static com.acse.ottn.b c() {
            com.acse.ottn.b r0 = com.acse.ottn.b.f2140f
            if (r0 != 0) goto L19
            java.lang.Class<com.acse.ottn.b> r0 = com.acse.ottn.b.class
            monitor-enter(r0)
            com.acse.ottn.b r1 = com.acse.ottn.b.f2140f     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.acse.ottn.b r1 = new com.acse.ottn.b     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.acse.ottn.b.f2140f = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r1 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1
        L19:
            com.acse.ottn.b r0 = com.acse.ottn.b.f2140f
            return r0
    }

    @android.annotation.TargetApi(18)
    public android.view.accessibility.AccessibilityNodeInfo a(android.accessibilityservice.AccessibilityService r3, java.lang.String r4, java.lang.String r5, java.lang.String r6) {
            r2 = this;
            android.view.accessibility.AccessibilityNodeInfo r3 = r3.getRootInActiveWindow()
            r0 = 0
            if (r3 != 0) goto L8
            return r0
        L8:
            java.util.List r3 = r3.findAccessibilityNodeInfosByViewId(r4)
            if (r3 == 0) goto L49
            boolean r4 = r3.isEmpty()
            if (r4 != 0) goto L49
            java.util.Iterator r3 = r3.iterator()
        L18:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L49
            java.lang.Object r4 = r3.next()
            android.view.accessibility.AccessibilityNodeInfo r4 = (android.view.accessibility.AccessibilityNodeInfo) r4
            if (r4 == 0) goto L18
            java.lang.CharSequence r1 = r4.getText()
            if (r1 == 0) goto L18
            java.lang.CharSequence r1 = r4.getText()
            java.lang.String r1 = r1.toString()
            boolean r1 = r1.contains(r5)
            if (r1 == 0) goto L18
            java.lang.CharSequence r1 = r4.getText()
            java.lang.String r1 = r1.toString()
            boolean r1 = r1.contains(r6)
            if (r1 == 0) goto L18
            return r4
        L49:
            return r0
    }

    @androidx.annotation.RequiresApi(api = 16)
    public android.view.accessibility.AccessibilityNodeInfo a(android.accessibilityservice.AccessibilityService r4, java.lang.String r5, boolean r6) {
            r3 = this;
            android.view.accessibility.AccessibilityNodeInfo r4 = r4.getRootInActiveWindow()
            r0 = 0
            if (r4 != 0) goto L1e
            java.lang.String r4 = com.acse.ottn.b.f2141g
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r1 = "findViewByText accessibilityNodeInfo is null text ="
            r6.append(r1)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            com.acse.ottn.h2.b(r4, r5)
            return r0
        L1e:
            java.util.List r4 = r4.findAccessibilityNodeInfosByText(r5)
            if (r4 == 0) goto L5b
            boolean r1 = r4.isEmpty()
            if (r1 != 0) goto L5b
            java.util.Iterator r4 = r4.iterator()
        L2e:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L5b
            java.lang.Object r1 = r4.next()
            android.view.accessibility.AccessibilityNodeInfo r1 = (android.view.accessibility.AccessibilityNodeInfo) r1
            if (r1 == 0) goto L2e
            java.lang.CharSequence r2 = r1.getText()
            if (r2 == 0) goto L2e
            java.lang.CharSequence r2 = r1.getText()
            java.lang.String r2 = r2.toString()
            java.lang.String r2 = r2.trim()
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L2e
            boolean r2 = r1.isClickable()
            if (r2 != r6) goto L2e
            return r1
        L5b:
            return r0
    }

    @android.annotation.TargetApi(18)
    public android.view.accessibility.AccessibilityNodeInfo a(android.view.accessibility.AccessibilityNodeInfo r2, java.lang.String r3) {
            r1 = this;
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            java.util.List r2 = r2.findAccessibilityNodeInfosByViewId(r3)
            if (r2 == 0) goto L23
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L23
            java.util.Iterator r2 = r2.iterator()
        L14:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L23
            java.lang.Object r3 = r2.next()
            android.view.accessibility.AccessibilityNodeInfo r3 = (android.view.accessibility.AccessibilityNodeInfo) r3
            if (r3 == 0) goto L14
            return r3
        L23:
            return r0
    }

    @android.annotation.TargetApi(18)
    public android.view.accessibility.AccessibilityNodeInfo a(android.view.accessibility.AccessibilityNodeInfo r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            int r3 = r2.getChildCount()
            int r3 = r3 + (-1)
        L6:
            if (r3 < 0) goto L24
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.getChild(r3)
            if (r0 == 0) goto L21
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.getChild(r3)
            java.lang.CharSequence r0 = r0.getText()
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L21
            android.view.accessibility.AccessibilityNodeInfo r2 = r2.getChild(r3)
            return r2
        L21:
            int r3 = r3 + (-1)
            goto L6
        L24:
            r2 = 0
            return r2
    }

    public android.view.accessibility.AccessibilityNodeInfo a(android.view.accessibility.AccessibilityNodeInfo r3, java.lang.String r4, boolean r5) {
            r2 = this;
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            java.util.List r3 = r3.findAccessibilityNodeInfosByText(r4)
            if (r3 == 0) goto L29
            boolean r4 = r3.isEmpty()
            if (r4 != 0) goto L29
            java.util.Iterator r3 = r3.iterator()
        L14:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L29
            java.lang.Object r4 = r3.next()
            android.view.accessibility.AccessibilityNodeInfo r4 = (android.view.accessibility.AccessibilityNodeInfo) r4
            if (r4 == 0) goto L14
            boolean r1 = r4.isClickable()
            if (r1 != r5) goto L14
            return r4
        L29:
            return r0
    }

    @android.annotation.TargetApi(18)
    public android.view.accessibility.AccessibilityNodeInfo a(android.view.accessibility.AccessibilityWindowInfo r2, java.lang.String r3) {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r2 = r2.getRoot()
            r0 = 0
            if (r2 != 0) goto L8
            return r0
        L8:
            java.util.List r2 = r2.findAccessibilityNodeInfosByViewId(r3)
            if (r2 == 0) goto L27
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L27
            java.util.Iterator r2 = r2.iterator()
        L18:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L27
            java.lang.Object r3 = r2.next()
            android.view.accessibility.AccessibilityNodeInfo r3 = (android.view.accessibility.AccessibilityNodeInfo) r3
            if (r3 == 0) goto L18
            return r3
        L27:
            return r0
    }

    public void a(long r1) {
            r0 = this;
            java.lang.Thread.sleep(r1)     // Catch: java.lang.Exception -> L4
            return
        L4:
            r1 = 0
            java.lang.System.exit(r1)
            return
    }

    @androidx.annotation.RequiresApi(api = 24)
    public void a(android.accessibilityservice.AccessibilityService r9, float r10, float r11, int r12, android.accessibilityservice.AccessibilityService.GestureResultCallback r13) {
            r8 = this;
            android.graphics.Path r2 = new android.graphics.Path
            r2.<init>()
            r2.moveTo(r10, r11)
            long r5 = (long) r12
            r3 = 0
            r0 = r8
            r1 = r9
            r7 = r13
            r0.a(r1, r2, r3, r5, r7)
            return
    }

    @androidx.annotation.RequiresApi(api = 24)
    public void a(android.accessibilityservice.AccessibilityService r2, android.graphics.Path r3, long r4, long r6, android.accessibilityservice.AccessibilityService.GestureResultCallback r8) {
            r1 = this;
            l.n.a()     // Catch: java.lang.Throwable -> L19
            android.accessibilityservice.GestureDescription$Builder r0 = l.d.a()     // Catch: java.lang.Throwable -> L19
            l.f.a()     // Catch: java.lang.Throwable -> L19
            android.accessibilityservice.GestureDescription$StrokeDescription r3 = l.e.a(r3, r4, r6)     // Catch: java.lang.Throwable -> L19
            l.a.a(r0, r3)     // Catch: java.lang.Throwable -> L19
            android.accessibilityservice.GestureDescription r3 = l.b.a(r0)     // Catch: java.lang.Throwable -> L19
            r4 = 0
            l.c.a(r2, r3, r8, r4)     // Catch: java.lang.Throwable -> L19
        L19:
            return
    }

    public void a(android.content.Context r3) {
            r2 = this;
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.intent.action.MAIN"
            r0.<init>(r1)
            r1 = 268435456(0x10000000, float:2.524355E-29)
            r0.setFlags(r1)
            java.lang.String r1 = "android.intent.category.HOME"
            r0.addCategory(r1)
            r3.startActivity(r0)
            return
    }

    public void a(android.view.accessibility.AccessibilityEvent r2) {
            r1 = this;
            android.os.Parcelable r0 = r2.getParcelableData()
            if (r0 == 0) goto L19
            android.os.Parcelable r0 = r2.getParcelableData()
            boolean r0 = r0 instanceof android.app.Notification
            if (r0 == 0) goto L19
            android.os.Parcelable r2 = r2.getParcelableData()
            android.app.Notification r2 = (android.app.Notification) r2
            android.app.PendingIntent r2 = r2.contentIntent
            r2.send()     // Catch: android.app.PendingIntent.CanceledException -> L19
        L19:
            return
    }

    public void a(androidx.appcompat.app.AppCompatActivity r2, int r3) {
            r1 = this;
            com.acse.ottn.i1 r0 = com.acse.ottn.i1.b()
            r0.b(r2, r3)
            return
    }

    public void a(java.lang.String r3) {
            r2 = this;
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
            if (r0 == 0) goto Lf
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
            java.lang.String r1 = "plunin_id"
            r0.b(r1, r3)
        Lf:
            return
    }

    public void a(java.lang.String r4, java.lang.String r5) {
            r3 = this;
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>()
            java.lang.String r1 = com.acse.ottn.util.HelpShopAppUtil.getHmKey()
            java.lang.String r2 = "ak"
            r0.put(r2, r1)
            com.acse.ottn.util.HelpShopAppUtil.getInstance()
            java.lang.String r1 = com.acse.ottn.util.HelpShopAppUtil.sessionExID()
            java.lang.String r2 = "sessionid"
            r0.put(r2, r1)
            java.lang.String r1 = "is_snt"
            java.lang.String r2 = "0"
            r0.put(r1, r2)
            java.lang.String r1 = "sdk_version"
            java.lang.String r2 = "1.2.6.6"
            r0.put(r1, r2)
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            if (r1 == 0) goto L30
            java.lang.String r4 = "n"
        L30:
            java.lang.String r1 = "state"
            r0.put(r1, r4)
            java.lang.String r4 = "schoolId"
            r0.put(r4, r5)
            com.acse.ottn.g0 r4 = new com.acse.ottn.g0
            r4.<init>()
            com.acse.ottn.t0 r5 = com.acse.ottn.t0.b()
            java.lang.String r1 = ""
            okhttp3.RequestBody r5 = r5.a(r0, r1)
            rx.e r4 = r4.j(r5)
            rx.h r5 = com.acse.ottn.io.reactivex.schedulers.Schedulers.newThread()
            rx.e r4 = r4.w5(r5)
            com.acse.ottn.b$e r5 = new com.acse.ottn.b$e
            r5.<init>(r3)
            com.acse.ottn.b$f r0 = new com.acse.ottn.b$f
            r0.<init>(r3)
            r4.u5(r5, r0)
            return
    }

    public void a(boolean r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public boolean a() {
            r2 = this;
            com.acse.ottn.i1 r0 = com.acse.ottn.i1.b()
            android.content.Context r1 = com.acse.ottn.util.HelpShopAppUtil.getContext()
            boolean r0 = r0.a(r1)
            return r0
    }

    @android.annotation.SuppressLint({"ObsoleteSdkInt"})
    public boolean a(android.accessibilityservice.AccessibilityService r3) {
            r2 = this;
            if (r3 != 0) goto L4
            r3 = 0
            return r3
        L4:
            r0 = 200(0xc8, double:9.9E-322)
            java.lang.Thread.sleep(r0)     // Catch: java.lang.InterruptedException -> L9
        L9:
            r0 = 1
            boolean r3 = r3.performGlobalAction(r0)
            return r3
    }

    @androidx.annotation.RequiresApi(api = 24)
    public boolean a(android.accessibilityservice.AccessibilityService r7, int r8, int r9) {
            r6 = this;
            android.graphics.Path r0 = new android.graphics.Path     // Catch: java.lang.Throwable -> L2f
            r0.<init>()     // Catch: java.lang.Throwable -> L2f
            float r1 = (float) r8     // Catch: java.lang.Throwable -> L2f
            float r2 = (float) r9     // Catch: java.lang.Throwable -> L2f
            r0.moveTo(r1, r2)     // Catch: java.lang.Throwable -> L2f
            l.n.a()     // Catch: java.lang.Throwable -> L2f
            android.accessibilityservice.GestureDescription$Builder r1 = l.d.a()     // Catch: java.lang.Throwable -> L2f
            l.f.a()     // Catch: java.lang.Throwable -> L2f
            r2 = 0
            r4 = 200(0xc8, double:9.9E-322)
            android.accessibilityservice.GestureDescription$StrokeDescription r0 = l.e.a(r0, r2, r4)     // Catch: java.lang.Throwable -> L2f
            android.accessibilityservice.GestureDescription$Builder r0 = l.a.a(r1, r0)     // Catch: java.lang.Throwable -> L2f
            android.accessibilityservice.GestureDescription r0 = l.b.a(r0)     // Catch: java.lang.Throwable -> L2f
            com.acse.ottn.b$a r1 = new com.acse.ottn.b$a     // Catch: java.lang.Throwable -> L2f
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L2f
            r2 = 0
            boolean r7 = l.c.a(r7, r0, r1, r2)     // Catch: java.lang.Throwable -> L2f
            return r7
        L2f:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "点击失败 x= "
            r7.append(r0)
            r7.append(r8)
            java.lang.String r8 = "   y = "
            r7.append(r8)
            r7.append(r9)
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = "samonp-->"
            com.acse.ottn.h2.a(r8, r7)
            r7 = 0
            return r7
    }

    @androidx.annotation.RequiresApi(api = 24)
    public boolean a(android.accessibilityservice.AccessibilityService r2, int r3, int r4, int r5, int r6, int r7) {
            r1 = this;
            android.graphics.Path r0 = new android.graphics.Path     // Catch: java.lang.Throwable -> L33
            r0.<init>()     // Catch: java.lang.Throwable -> L33
            float r3 = (float) r3     // Catch: java.lang.Throwable -> L33
            float r4 = (float) r4     // Catch: java.lang.Throwable -> L33
            r0.moveTo(r3, r4)     // Catch: java.lang.Throwable -> L33
            float r3 = (float) r5     // Catch: java.lang.Throwable -> L33
            float r4 = (float) r6     // Catch: java.lang.Throwable -> L33
            r0.lineTo(r3, r4)     // Catch: java.lang.Throwable -> L33
            l.n.a()     // Catch: java.lang.Throwable -> L33
            android.accessibilityservice.GestureDescription$Builder r3 = l.d.a()     // Catch: java.lang.Throwable -> L33
            l.f.a()     // Catch: java.lang.Throwable -> L33
            long r4 = (long) r7     // Catch: java.lang.Throwable -> L33
            r6 = 0
            android.accessibilityservice.GestureDescription$StrokeDescription r4 = l.e.a(r0, r6, r4)     // Catch: java.lang.Throwable -> L33
            android.accessibilityservice.GestureDescription$Builder r3 = l.a.a(r3, r4)     // Catch: java.lang.Throwable -> L33
            android.accessibilityservice.GestureDescription r3 = l.b.a(r3)     // Catch: java.lang.Throwable -> L33
            com.acse.ottn.b$c r4 = new com.acse.ottn.b$c     // Catch: java.lang.Throwable -> L33
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L33
            r5 = 0
            boolean r2 = l.c.a(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L33
            return r2
        L33:
            r2 = 0
            return r2
    }

    @android.annotation.SuppressLint({"ObsoleteSdkInt"})
    public boolean a(android.accessibilityservice.AccessibilityService r2, android.view.accessibility.AccessibilityNodeInfo r3, java.lang.String r4) {
            r1 = this;
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.lang.String r0 = "ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE"
            r2.putCharSequence(r0, r4)
            r4 = 2097152(0x200000, float:2.938736E-39)
            boolean r2 = r3.performAction(r4, r2)
            return r2
    }

    @androidx.annotation.RequiresApi(api = 18)
    public boolean a(android.accessibilityservice.AccessibilityService r2, java.lang.String r3) {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r2 = r2.getRootInActiveWindow()
            r0 = 0
            if (r2 != 0) goto L8
            return r0
        L8:
            java.util.List r2 = r2.findAccessibilityNodeInfosByViewId(r3)
            if (r2 == 0) goto L2b
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L2b
            java.util.Iterator r2 = r2.iterator()
        L18:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L2b
            java.lang.Object r3 = r2.next()
            android.view.accessibility.AccessibilityNodeInfo r3 = (android.view.accessibility.AccessibilityNodeInfo) r3
            if (r3 == 0) goto L18
            boolean r2 = r1.c(r3)
            return r2
        L2b:
            return r0
    }

    @androidx.annotation.RequiresApi(api = 18)
    public boolean a(android.accessibilityservice.AccessibilityService r3, java.lang.String r4, int r5) {
            r2 = this;
            android.view.accessibility.AccessibilityNodeInfo r3 = r3.getRootInActiveWindow()
            r0 = 0
            if (r3 != 0) goto L8
            return r0
        L8:
            java.util.List r3 = r3.findAccessibilityNodeInfosByViewId(r4)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            if (r3 == 0) goto L2f
            boolean r1 = r3.isEmpty()
            if (r1 != 0) goto L2f
            java.util.Iterator r3 = r3.iterator()
        L1d:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L2f
            java.lang.Object r1 = r3.next()
            android.view.accessibility.AccessibilityNodeInfo r1 = (android.view.accessibility.AccessibilityNodeInfo) r1
            if (r1 == 0) goto L1d
            r4.add(r1)
            goto L1d
        L2f:
            boolean r3 = r4.isEmpty()
            if (r3 == 0) goto L36
            return r0
        L36:
            int r3 = r4.size()
            if (r3 <= r5) goto L47
            java.lang.Object r3 = r4.get(r5)
            android.view.accessibility.AccessibilityNodeInfo r3 = (android.view.accessibility.AccessibilityNodeInfo) r3
            boolean r3 = r2.c(r3)
            return r3
        L47:
            java.lang.Object r3 = r4.get(r0)
            android.view.accessibility.AccessibilityNodeInfo r3 = (android.view.accessibility.AccessibilityNodeInfo) r3
            boolean r3 = r2.c(r3)
            return r3
    }

    public boolean a(android.content.Context r7, java.lang.Class r8) {
            r6 = this;
            android.content.ContentResolver r0 = r7.getContentResolver()
            java.lang.String r1 = "accessibility_enabled"
            r2 = 0
            int r0 = android.provider.Settings.Secure.getInt(r0, r1, r2)
            r1 = 1
            if (r0 == r1) goto Lf
            return r2
        Lf:
            android.content.ContentResolver r0 = r7.getContentResolver()
            java.lang.String r3 = "enabled_accessibility_services"
            java.lang.String r0 = android.provider.Settings.Secure.getString(r0, r3)
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 != 0) goto L56
            android.text.TextUtils$SimpleStringSplitter r3 = new android.text.TextUtils$SimpleStringSplitter
            r4 = 58
            r3.<init>(r4)
            r3.setString(r0)
        L29:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L56
            java.lang.String r0 = r3.next()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r7.getPackageName()
            r4.append(r5)
            java.lang.String r5 = "/"
            r4.append(r5)
            java.lang.String r5 = r8.getName()
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            boolean r0 = r0.equalsIgnoreCase(r4)
            if (r0 == 0) goto L29
            return r1
        L56:
            return r2
    }

    public boolean a(android.view.accessibility.AccessibilityNodeInfo r2) {
            r1 = this;
            r0 = 8192(0x2000, float:1.148E-41)
            boolean r2 = r2.performAction(r0)
            return r2
    }

    @androidx.annotation.RequiresApi(api = 16)
    public android.view.accessibility.AccessibilityNodeInfo b(android.view.accessibility.AccessibilityNodeInfo r2, java.lang.String r3) {
            r1 = this;
            r0 = 0
            android.view.accessibility.AccessibilityNodeInfo r2 = r1.a(r2, r3, r0)
            return r2
    }

    public void b() {
            r7 = this;
            android.content.Context r0 = com.acse.ottn.util.HelpShopAppUtil.getContext()
            java.lang.String r1 = "accessibility"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.accessibility.AccessibilityManager r0 = (android.view.accessibility.AccessibilityManager) r0
            java.util.List r0 = r0.getInstalledAccessibilityServiceList()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L19:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L6e
            java.lang.Object r2 = r0.next()
            android.accessibilityservice.AccessibilityServiceInfo r2 = (android.accessibilityservice.AccessibilityServiceInfo) r2
            android.content.pm.ResolveInfo r3 = r2.getResolveInfo()
            android.content.pm.ServiceInfo r3 = r3.serviceInfo
            java.lang.String r3 = r3.name
            android.content.pm.ResolveInfo r4 = r2.getResolveInfo()
            android.content.pm.ServiceInfo r4 = r4.serviceInfo
            java.lang.String r4 = r4.packageName
            android.content.pm.ResolveInfo r2 = r2.getResolveInfo()
            android.content.Context r5 = com.acse.ottn.util.HelpShopAppUtil.getContext()
            android.content.pm.PackageManager r5 = r5.getPackageManager()
            java.lang.CharSequence r2 = r2.loadLabel(r5)
            java.lang.String r2 = r2.toString()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "应用名称："
            r5.append(r6)
            r5.append(r2)
            java.lang.String r2 = "--->app包名："
            r5.append(r2)
            r5.append(r4)
            java.lang.String r2 = "---->service路径："
            r5.append(r2)
            r5.append(r3)
            java.lang.String r2 = r5.toString()
            r1.add(r2)
            goto L19
        L6e:
            com.acse.ottn.q2 r0 = com.acse.ottn.q2.b()
            java.lang.String r1 = com.alibaba.fastjson.JSON.toJSONString(r1)
            java.lang.String r2 = "accessiblity_list"
            r0.b(r2, r1)
            return
    }

    public void b(android.accessibilityservice.AccessibilityService r2, android.view.accessibility.AccessibilityNodeInfo r3, java.lang.String r4) {
            r1 = this;
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.lang.String r0 = "ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE"
            r2.putCharSequence(r0, r4)
            r4 = 2097152(0x200000, float:2.938736E-39)
            r3.performAction(r4, r2)
            return
    }

    @android.annotation.SuppressLint({"ObsoleteSdkInt"})
    public boolean b(android.accessibilityservice.AccessibilityService r3) {
            r2 = this;
            if (r3 != 0) goto L4
            r3 = 0
            return r3
        L4:
            r0 = 200(0xc8, double:9.9E-322)
            java.lang.Thread.sleep(r0)     // Catch: java.lang.InterruptedException -> L9
        L9:
            r0 = 2
            boolean r3 = r3.performGlobalAction(r0)
            return r3
    }

    @androidx.annotation.RequiresApi(api = 24)
    public boolean b(android.accessibilityservice.AccessibilityService r6, int r7, int r8) {
            r5 = this;
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            float r7 = (float) r7
            float r8 = (float) r8
            r0.moveTo(r7, r8)
            android.accessibilityservice.GestureDescription$Builder r7 = l.d.a()
            r1 = 0
            r3 = 1000(0x3e8, double:4.94E-321)
            android.accessibilityservice.GestureDescription$StrokeDescription r8 = l.e.a(r0, r1, r3)
            android.accessibilityservice.GestureDescription$Builder r7 = l.a.a(r7, r8)
            android.accessibilityservice.GestureDescription r7 = l.b.a(r7)
            com.acse.ottn.b$b r8 = new com.acse.ottn.b$b
            r8.<init>(r5)
            r0 = 0
            boolean r6 = l.c.a(r6, r7, r8, r0)
            return r6
    }

    @androidx.annotation.RequiresApi(api = 16)
    public boolean b(android.accessibilityservice.AccessibilityService r4, java.lang.String r5) {
            r3 = this;
            android.view.accessibility.AccessibilityNodeInfo r4 = r4.getRootInActiveWindow()
            r0 = 0
            if (r4 != 0) goto L8
            return r0
        L8:
            java.util.List r4 = r4.findAccessibilityNodeInfosByText(r5)
            if (r4 == 0) goto L3f
            boolean r1 = r4.isEmpty()
            if (r1 != 0) goto L3f
            java.util.Iterator r4 = r4.iterator()
        L18:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L3f
            java.lang.Object r1 = r4.next()
            android.view.accessibility.AccessibilityNodeInfo r1 = (android.view.accessibility.AccessibilityNodeInfo) r1
            if (r1 == 0) goto L18
            java.lang.CharSequence r2 = r1.getText()
            boolean r2 = r2.equals(r5)
            if (r2 != 0) goto L3a
            java.lang.CharSequence r2 = r1.getContentDescription()
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L18
        L3a:
            boolean r4 = r3.c(r1)
            return r4
        L3f:
            return r0
    }

    @androidx.annotation.RequiresApi(api = 16)
    public boolean b(android.accessibilityservice.AccessibilityService r5, java.lang.String r6, int r7) {
            r4 = this;
            android.view.accessibility.AccessibilityNodeInfo r5 = r5.getRootInActiveWindow()
            r0 = 0
            if (r5 != 0) goto L8
            return r0
        L8:
            java.util.List r5 = r5.findAccessibilityNodeInfosByText(r6)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            if (r5 == 0) goto L4f
            boolean r2 = r5.isEmpty()
            if (r2 != 0) goto L4f
            java.util.Iterator r5 = r5.iterator()
        L1d:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L4f
            java.lang.Object r2 = r5.next()
            android.view.accessibility.AccessibilityNodeInfo r2 = (android.view.accessibility.AccessibilityNodeInfo) r2
            if (r2 == 0) goto L1d
            java.lang.CharSequence r3 = r2.getText()
            if (r3 == 0) goto L3b
            java.lang.CharSequence r3 = r2.getText()
            boolean r3 = r3.equals(r6)
            if (r3 != 0) goto L4b
        L3b:
            java.lang.CharSequence r3 = r2.getContentDescription()
            if (r3 == 0) goto L1d
            java.lang.CharSequence r3 = r2.getContentDescription()
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto L1d
        L4b:
            r1.add(r2)
            goto L1d
        L4f:
            boolean r5 = r1.isEmpty()
            if (r5 == 0) goto L56
            return r0
        L56:
            int r5 = r1.size()
            if (r5 <= r7) goto L67
            java.lang.Object r5 = r1.get(r7)
            android.view.accessibility.AccessibilityNodeInfo r5 = (android.view.accessibility.AccessibilityNodeInfo) r5
            boolean r5 = r4.c(r5)
            return r5
        L67:
            java.lang.Object r5 = r1.get(r0)
            android.view.accessibility.AccessibilityNodeInfo r5 = (android.view.accessibility.AccessibilityNodeInfo) r5
            boolean r5 = r4.c(r5)
            return r5
    }

    public boolean b(android.view.accessibility.AccessibilityNodeInfo r2) {
            r1 = this;
            if (r2 == 0) goto L10
            boolean r0 = r2.isScrollable()
            if (r0 != 0) goto L9
            goto L10
        L9:
            r0 = 4096(0x1000, float:5.74E-42)
            boolean r2 = r2.performAction(r0)
            return r2
        L10:
            r2 = 0
            return r2
    }

    public android.view.accessibility.AccessibilityNodeInfo c(android.view.accessibility.AccessibilityNodeInfo r4, java.lang.String r5) {
            r3 = this;
            r0 = 0
            if (r4 != 0) goto Lb
            java.lang.String r4 = com.acse.ottn.b.f2141g
            java.lang.String r5 = "findViewByText3 accessibilityNodeInfo is null"
            com.acse.ottn.h2.b(r4, r5)
            return r0
        Lb:
            r3.h(r4)
            java.util.List r4 = r4.findAccessibilityNodeInfosByText(r5)
            if (r4 == 0) goto L5d
            boolean r1 = r4.isEmpty()
            if (r1 != 0) goto L5d
            java.util.Iterator r4 = r4.iterator()
        L1e:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L5d
            java.lang.Object r1 = r4.next()
            android.view.accessibility.AccessibilityNodeInfo r1 = (android.view.accessibility.AccessibilityNodeInfo) r1
            if (r1 == 0) goto L1e
            java.lang.CharSequence r2 = r1.getText()
            if (r2 == 0) goto L44
            java.lang.CharSequence r2 = r1.getText()
            java.lang.String r2 = r2.toString()
            java.lang.String r2 = r2.trim()
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L5c
        L44:
            java.lang.CharSequence r2 = r1.getContentDescription()
            if (r2 == 0) goto L1e
            java.lang.CharSequence r2 = r1.getContentDescription()
            java.lang.String r2 = r2.toString()
            java.lang.String r2 = r2.trim()
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L1e
        L5c:
            return r1
        L5d:
            return r0
    }

    public final void c(android.accessibilityservice.AccessibilityService r8) {
            r7 = this;
            com.acse.ottn.n3 r8 = com.acse.ottn.n3.a()
            java.lang.String r0 = "show_red_package"
            boolean r8 = r8.a(r0)
            if (r8 == 0) goto Ld
            goto L37
        Ld:
            long[] r8 = r7.f2147e
            int r0 = r8.length
            r1 = 1
            int r0 = r0 - r1
            r2 = 0
            java.lang.System.arraycopy(r8, r1, r8, r2, r0)
            long[] r8 = r7.f2147e
            r3 = r8[r1]
            r0 = 2
            r5 = r8[r0]
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L37
            r3 = 0
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 == 0) goto L37
            int r0 = r8.length
            int r0 = r0 - r1
            long r3 = android.os.SystemClock.uptimeMillis()
            r8[r0] = r3
            long[] r8 = r7.f2147e
            int r0 = r8.length
            int r0 = r0 - r1
            r0 = r8[r0]
            r0 = r8[r2]
        L37:
            return
    }

    @android.annotation.TargetApi(18)
    public void c(android.accessibilityservice.AccessibilityService r1, java.lang.String r2) {
            r0 = this;
            android.view.accessibility.AccessibilityNodeInfo r1 = r1.getRootInActiveWindow()
            if (r1 != 0) goto L7
            goto L28
        L7:
            java.util.List r1 = r1.findAccessibilityNodeInfosByViewId(r2)
            if (r1 == 0) goto L28
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L28
            java.util.Iterator r1 = r1.iterator()
        L17:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L28
            java.lang.Object r2 = r1.next()
            android.view.accessibility.AccessibilityNodeInfo r2 = (android.view.accessibility.AccessibilityNodeInfo) r2
            if (r2 == 0) goto L17
            r0.g(r2)
        L28:
            return
    }

    @androidx.annotation.RequiresApi(api = 18)
    public boolean c(android.accessibilityservice.AccessibilityService r3, java.lang.String r4, int r5) {
            r2 = this;
            android.view.accessibility.AccessibilityNodeInfo r3 = r3.getRootInActiveWindow()
            r0 = 0
            if (r3 != 0) goto L8
            return r0
        L8:
            java.util.List r3 = r3.findAccessibilityNodeInfosByViewId(r4)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            if (r3 == 0) goto L2f
            boolean r1 = r3.isEmpty()
            if (r1 != 0) goto L2f
            java.util.Iterator r3 = r3.iterator()
        L1d:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L2f
            java.lang.Object r1 = r3.next()
            android.view.accessibility.AccessibilityNodeInfo r1 = (android.view.accessibility.AccessibilityNodeInfo) r1
            if (r1 == 0) goto L1d
            r4.add(r1)
            goto L1d
        L2f:
            boolean r3 = r4.isEmpty()
            if (r3 == 0) goto L36
            return r0
        L36:
            int r3 = r4.size()
            if (r3 <= r5) goto L47
            java.lang.Object r3 = r4.get(r5)
            android.view.accessibility.AccessibilityNodeInfo r3 = (android.view.accessibility.AccessibilityNodeInfo) r3
            boolean r3 = r2.f(r3)
            return r3
        L47:
            java.lang.Object r3 = r4.get(r0)
            android.view.accessibility.AccessibilityNodeInfo r3 = (android.view.accessibility.AccessibilityNodeInfo) r3
            boolean r3 = r2.f(r3)
            return r3
    }

    public boolean c(android.view.accessibility.AccessibilityNodeInfo r3) {
            r2 = this;
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            boolean r1 = r3.isClickable()
            if (r1 == 0) goto L11
            r0 = 16
            boolean r3 = r3.performAction(r0)
            return r3
        L11:
            android.view.accessibility.AccessibilityNodeInfo r3 = r3.getParent()
            r2.c(r3)
            return r0
    }

    public java.lang.String d() {
            r2 = this;
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
            java.lang.String r1 = "plunin_id"
            java.lang.String r0 = r0.e(r1)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L13
            java.lang.String r0 = ""
            return r0
        L13:
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
            java.lang.String r0 = r0.e(r1)
            return r0
    }

    public void d(android.accessibilityservice.AccessibilityService r4) {
            r3 = this;
            if (r4 != 0) goto L3
            return
        L3:
            android.os.CountDownTimer r0 = r3.f2146d
            if (r0 == 0) goto Ld
            r0.cancel()
            r0 = 0
            r3.f2146d = r0
        Ld:
            com.acse.ottn.n0 r0 = com.acse.ottn.n0.a()
            com.acse.ottn.b$d r1 = new com.acse.ottn.b$d
            r1.<init>(r3, r4)
            r4 = 2000(0x7d0, float:2.803E-42)
            r2 = 50
            android.os.CountDownTimer r4 = r0.a(r4, r2, r1)
            r3.f2146d = r4
            r4.start()
            return
    }

    @androidx.annotation.RequiresApi(api = 16)
    public void d(android.accessibilityservice.AccessibilityService r1, java.lang.String r2) {
            r0 = this;
            android.view.accessibility.AccessibilityNodeInfo r1 = r1.getRootInActiveWindow()
            if (r1 != 0) goto L7
            goto L28
        L7:
            java.util.List r1 = r1.findAccessibilityNodeInfosByText(r2)
            if (r1 == 0) goto L28
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L28
            java.util.Iterator r1 = r1.iterator()
        L17:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L28
            java.lang.Object r2 = r1.next()
            android.view.accessibility.AccessibilityNodeInfo r2 = (android.view.accessibility.AccessibilityNodeInfo) r2
            if (r2 == 0) goto L17
            r0.g(r2)
        L28:
            return
    }

    public void d(android.view.accessibility.AccessibilityNodeInfo r5) {
            r4 = this;
            r0 = 0
        L1:
            int r1 = r5.getChildCount()
            if (r0 >= r1) goto L30
            android.view.accessibility.AccessibilityNodeInfo r1 = r5.getChild(r0)
            java.lang.String r2 = "com.tencent.mm:id/e7t"
            android.view.accessibility.AccessibilityNodeInfo r1 = r4.a(r1, r2)
            if (r1 == 0) goto L2d
            java.lang.CharSequence r2 = r1.getText()
            if (r2 == 0) goto L2d
            java.lang.CharSequence r2 = r1.getText()
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "[微信红包]"
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto L2d
            r4.g(r1)
            return
        L2d:
            int r0 = r0 + 1
            goto L1
        L30:
            return
    }

    @androidx.annotation.RequiresApi(api = 16)
    public boolean d(android.accessibilityservice.AccessibilityService r5, java.lang.String r6, int r7) {
            r4 = this;
            android.view.accessibility.AccessibilityNodeInfo r5 = r5.getRootInActiveWindow()
            r0 = 0
            if (r5 != 0) goto L8
            return r0
        L8:
            java.util.List r5 = r5.findAccessibilityNodeInfosByText(r6)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            if (r5 == 0) goto L4f
            boolean r2 = r5.isEmpty()
            if (r2 != 0) goto L4f
            java.util.Iterator r5 = r5.iterator()
        L1d:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L4f
            java.lang.Object r2 = r5.next()
            android.view.accessibility.AccessibilityNodeInfo r2 = (android.view.accessibility.AccessibilityNodeInfo) r2
            if (r2 == 0) goto L1d
            java.lang.CharSequence r3 = r2.getText()
            if (r3 == 0) goto L3b
            java.lang.CharSequence r3 = r2.getText()
            boolean r3 = r3.equals(r6)
            if (r3 != 0) goto L4b
        L3b:
            java.lang.CharSequence r3 = r2.getContentDescription()
            if (r3 == 0) goto L1d
            java.lang.CharSequence r3 = r2.getContentDescription()
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto L1d
        L4b:
            r1.add(r2)
            goto L1d
        L4f:
            boolean r5 = r1.isEmpty()
            if (r5 == 0) goto L56
            return r0
        L56:
            int r5 = r1.size()
            if (r5 <= r7) goto L67
            java.lang.Object r5 = r1.get(r7)
            android.view.accessibility.AccessibilityNodeInfo r5 = (android.view.accessibility.AccessibilityNodeInfo) r5
            boolean r5 = r4.f(r5)
            return r5
        L67:
            java.lang.Object r5 = r1.get(r0)
            android.view.accessibility.AccessibilityNodeInfo r5 = (android.view.accessibility.AccessibilityNodeInfo) r5
            boolean r5 = r4.f(r5)
            return r5
    }

    @androidx.annotation.RequiresApi(api = 16)
    public android.view.accessibility.AccessibilityNodeInfo e(android.accessibilityservice.AccessibilityService r2, java.lang.String r3) {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r2 = r2.getRootInActiveWindow()
            r0 = 0
            if (r2 != 0) goto Lf
            java.lang.String r2 = com.acse.ottn.b.f2141g
            java.lang.String r3 = "findViewByText3 accessibilityNodeInfo is null"
            com.acse.ottn.h2.b(r2, r3)
            return r0
        Lf:
            java.util.List r2 = r2.findAccessibilityNodeInfosByText(r3)
            if (r2 == 0) goto L2e
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L2e
            java.util.Iterator r2 = r2.iterator()
        L1f:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L2e
            java.lang.Object r3 = r2.next()
            android.view.accessibility.AccessibilityNodeInfo r3 = (android.view.accessibility.AccessibilityNodeInfo) r3
            if (r3 == 0) goto L1f
            return r3
        L2e:
            return r0
    }

    @androidx.annotation.RequiresApi(api = 16)
    public void e(android.accessibilityservice.AccessibilityService r3) {
            r2 = this;
            java.lang.String r0 = "openOppenBatteryButton"
            java.lang.String r1 = "调用返回"
            com.acse.ottn.h2.a(r0, r1)     // Catch: java.lang.InterruptedException -> Lc
            r0 = 150(0x96, double:7.4E-322)
            java.lang.Thread.sleep(r0)     // Catch: java.lang.InterruptedException -> Lc
        Lc:
            r0 = 1
            r3.performGlobalAction(r0)
            return
    }

    @androidx.annotation.RequiresApi(api = 18)
    public void e(android.view.accessibility.AccessibilityNodeInfo r6) {
            r5 = this;
            if (r6 == 0) goto L52
            int r0 = r6.getChildCount()
            int r0 = r0 + (-1)
        L8:
            if (r0 < 0) goto L52
            android.view.accessibility.AccessibilityNodeInfo r1 = r6.getChild(r0)
            if (r1 != 0) goto L11
            goto L4f
        L11:
            java.lang.CharSequence r2 = r1.getText()
            if (r2 == 0) goto L47
            java.lang.String r3 = r2.toString()
            java.lang.String r4 = "微信红包"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L2f
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "[微信红包]"
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto L47
        L2f:
            android.view.accessibility.AccessibilityNodeInfo r2 = r1.getParent()
        L33:
            if (r2 == 0) goto L47
            int r3 = r2.getChildCount()
            r4 = 2
            if (r3 != r4) goto L42
            r3 = 16
            r2.performAction(r3)
            goto L47
        L42:
            android.view.accessibility.AccessibilityNodeInfo r2 = r2.getParent()
            goto L33
        L47:
            boolean r2 = r5.f2145c
            if (r2 == 0) goto L4c
            goto L52
        L4c:
            r5.e(r1)
        L4f:
            int r0 = r0 + (-1)
            goto L8
        L52:
            return
    }

    public boolean e() {
            r6 = this;
            com.acse.ottn.a r0 = com.acse.ottn.a.c()
            android.content.Context r1 = com.acse.ottn.util.HelpShopAppUtil.getContext()
            java.lang.String r0 = r0.b(r1)
            r1 = 0
            android.content.Context r2 = com.acse.ottn.util.HelpShopAppUtil.getContext()     // Catch: java.lang.Exception -> L1c
            android.content.ContentResolver r2 = r2.getContentResolver()     // Catch: java.lang.Exception -> L1c
            java.lang.String r3 = "accessibility_enabled"
            int r2 = android.provider.Settings.Secure.getInt(r2, r3)     // Catch: java.lang.Exception -> L1c
            goto L38
        L1c:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Error finding setting, default accessibility to not found: "
            r3.append(r4)
            java.lang.String r2 = r2.getMessage()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = "AccessibilityIntroduce"
            com.acse.ottn.h2.b(r3, r2)
            r2 = 0
        L38:
            android.text.TextUtils$SimpleStringSplitter r3 = new android.text.TextUtils$SimpleStringSplitter
            r4 = 58
            r3.<init>(r4)
            r4 = 1
            if (r2 != r4) goto L66
            android.content.Context r2 = com.acse.ottn.util.HelpShopAppUtil.getContext()
            android.content.ContentResolver r2 = r2.getContentResolver()
            java.lang.String r5 = "enabled_accessibility_services"
            java.lang.String r2 = android.provider.Settings.Secure.getString(r2, r5)
            if (r2 == 0) goto L66
            r3.setString(r2)
        L55:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L66
            java.lang.String r2 = r3.next()
            boolean r2 = r2.contains(r0)
            if (r2 == 0) goto L55
            return r4
        L66:
            return r1
    }

    @android.annotation.TargetApi(18)
    public android.view.accessibility.AccessibilityNodeInfo f(android.accessibilityservice.AccessibilityService r2, java.lang.String r3) {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r2 = r2.getRootInActiveWindow()
            r0 = 0
            if (r2 != 0) goto L8
            return r0
        L8:
            java.util.List r2 = r2.findAccessibilityNodeInfosByViewId(r3)
            if (r2 == 0) goto L27
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L27
            java.util.Iterator r2 = r2.iterator()
        L18:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L27
            java.lang.Object r3 = r2.next()
            android.view.accessibility.AccessibilityNodeInfo r3 = (android.view.accessibility.AccessibilityNodeInfo) r3
            if (r3 == 0) goto L18
            return r3
        L27:
            return r0
    }

    @androidx.annotation.RequiresApi(api = 16)
    public void f(android.accessibilityservice.AccessibilityService r3) {
            r2 = this;
            r0 = 500(0x1f4, double:2.47E-321)
            java.lang.Thread.sleep(r0)     // Catch: java.lang.InterruptedException -> L5
        L5:
            r0 = 8192(0x2000, float:1.148E-41)
            r3.performGlobalAction(r0)
            return
    }

    public boolean f() {
            r1 = this;
            boolean r0 = r1.a
            return r0
    }

    public final boolean f(android.view.accessibility.AccessibilityNodeInfo r3) {
            r2 = this;
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            boolean r1 = r3.isLongClickable()
            if (r1 == 0) goto L11
            r0 = 32
            boolean r3 = r3.performAction(r0)
            return r3
        L11:
            android.view.accessibility.AccessibilityNodeInfo r3 = r3.getParent()
            r2.f(r3)
            return r0
    }

    @androidx.annotation.RequiresApi(api = 16)
    public android.view.accessibility.AccessibilityNodeInfo g(android.accessibilityservice.AccessibilityService r2, java.lang.String r3) {
            r1 = this;
            r0 = 0
            android.view.accessibility.AccessibilityNodeInfo r2 = r1.a(r2, r3, r0)
            return r2
    }

    public final java.lang.Object g() throws java.io.ObjectStreamException {
            r1 = this;
            com.acse.ottn.b r0 = com.acse.ottn.b.f2140f
            return r0
    }

    @androidx.annotation.RequiresApi(api = 16)
    public void g(android.accessibilityservice.AccessibilityService r3) {
            r2 = this;
            r0 = 500(0x1f4, double:2.47E-321)
            java.lang.Thread.sleep(r0)     // Catch: java.lang.InterruptedException -> L5
        L5:
            r0 = 4096(0x1000, float:5.74E-42)
            r3.performGlobalAction(r0)
            return
    }

    public void g(android.view.accessibility.AccessibilityNodeInfo r2) {
            r1 = this;
            if (r2 != 0) goto L3
            goto L16
        L3:
            if (r2 == 0) goto L16
            boolean r0 = r2.isClickable()
            if (r0 == 0) goto L11
            r0 = 16
            r2.performAction(r0)
            return
        L11:
            android.view.accessibility.AccessibilityNodeInfo r2 = r2.getParent()
            goto L3
        L16:
            return
    }

    @androidx.annotation.RequiresApi(api = 16)
    public android.view.accessibility.AccessibilityNodeInfo h(android.accessibilityservice.AccessibilityService r2, java.lang.String r3) {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r2 = r2.getRootInActiveWindow()
            r0 = 0
            if (r2 != 0) goto Lf
            java.lang.String r2 = com.acse.ottn.b.f2141g
            java.lang.String r3 = "findViewByText1 accessibilityNodeInfo is null"
            com.acse.ottn.h2.b(r2, r3)
            return r0
        Lf:
            java.util.List r2 = r2.findAccessibilityNodeInfosByText(r3)
            if (r2 == 0) goto L2e
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L2e
            java.util.Iterator r2 = r2.iterator()
        L1f:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L2e
            java.lang.Object r3 = r2.next()
            android.view.accessibility.AccessibilityNodeInfo r3 = (android.view.accessibility.AccessibilityNodeInfo) r3
            if (r3 == 0) goto L1f
            return r3
        L2e:
            return r0
    }

    public void h(android.view.accessibility.AccessibilityNodeInfo r4) {
            r3 = this;
            if (r4 == 0) goto L30
            int r0 = r4.getChildCount()
            if (r0 != 0) goto L30
            java.lang.CharSequence r0 = r4.getText()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L1e
            java.lang.CharSequence r4 = r4.getText()
            java.lang.String r4 = r4.toString()
            r4.getClass()
            return
        L1e:
            java.lang.CharSequence r0 = r4.getContentDescription()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L54
            java.lang.CharSequence r4 = r4.getContentDescription()
            r4.toString()
            return
        L30:
            if (r4 == 0) goto L54
            r0 = 0
        L33:
            int r1 = r4.getChildCount()
            if (r0 >= r1) goto L54
            android.view.accessibility.AccessibilityNodeInfo r1 = r4.getChild(r0)     // Catch: java.lang.Throwable -> L47
            if (r1 == 0) goto L51
            android.view.accessibility.AccessibilityNodeInfo r1 = r4.getChild(r0)     // Catch: java.lang.Throwable -> L47
            r3.h(r1)     // Catch: java.lang.Throwable -> L47
            goto L51
        L47:
            r1 = move-exception
            java.lang.String r2 = com.acse.ottn.b.f2141g
            java.lang.String r1 = r1.getMessage()
            com.acse.ottn.h2.a(r2, r1)
        L51:
            int r0 = r0 + 1
            goto L33
        L54:
            return
    }

    @androidx.annotation.RequiresApi(api = 16)
    public void i(android.accessibilityservice.AccessibilityService r3, java.lang.String r4) {
            r2 = this;
            android.view.accessibility.AccessibilityNodeInfo r3 = r3.getRootInActiveWindow()
            if (r3 != 0) goto Le
            java.lang.String r3 = com.acse.ottn.b.f2141g
            java.lang.String r4 = "findViewByText2 accessibilityNodeInfo is null"
            com.acse.ottn.h2.a(r3, r4)
            return
        Le:
            java.util.List r3 = r3.findAccessibilityNodeInfosByText(r4)
            if (r3 == 0) goto L4e
            boolean r4 = r3.isEmpty()
            if (r4 != 0) goto L4e
            java.lang.String r4 = com.acse.ottn.b.f2141g
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "nodeInfoList size ="
            r0.append(r1)
            int r1 = r3.size()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.acse.ottn.h2.a(r4, r0)
            java.util.Iterator r3 = r3.iterator()
        L38:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L4e
            java.lang.Object r4 = r3.next()
            android.view.accessibility.AccessibilityNodeInfo r4 = (android.view.accessibility.AccessibilityNodeInfo) r4
            if (r4 == 0) goto L38
            com.acse.ottn.b r0 = c()
            r0.g(r4)
            goto L38
        L4e:
            return
    }

    @androidx.annotation.RequiresApi(api = 16)
    public android.view.accessibility.AccessibilityNodeInfo j(android.accessibilityservice.AccessibilityService r1, java.lang.String r2) {
            r0 = this;
            android.view.accessibility.AccessibilityNodeInfo r1 = r1.getRootInActiveWindow()
            android.view.accessibility.AccessibilityNodeInfo r1 = r0.c(r1, r2)
            return r1
    }

    @android.annotation.TargetApi(18)
    public java.util.List<android.view.accessibility.AccessibilityNodeInfo> k(android.accessibilityservice.AccessibilityService r1, java.lang.String r2) {
            r0 = this;
            android.view.accessibility.AccessibilityNodeInfo r1 = r1.getRootInActiveWindow()
            if (r1 != 0) goto L8
            r1 = 0
            return r1
        L8:
            java.util.List r1 = r1.findAccessibilityNodeInfosByViewId(r2)
            return r1
    }

    @androidx.annotation.RequiresApi(api = 16)
    public boolean l(android.accessibilityservice.AccessibilityService r4, java.lang.String r5) {
            r3 = this;
            android.view.accessibility.AccessibilityNodeInfo r4 = r4.getRootInActiveWindow()
            r0 = 0
            if (r4 != 0) goto L8
            return r0
        L8:
            java.util.List r4 = r4.findAccessibilityNodeInfosByText(r5)
            if (r4 == 0) goto L3f
            boolean r1 = r4.isEmpty()
            if (r1 != 0) goto L3f
            java.util.Iterator r4 = r4.iterator()
        L18:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L3f
            java.lang.Object r1 = r4.next()
            android.view.accessibility.AccessibilityNodeInfo r1 = (android.view.accessibility.AccessibilityNodeInfo) r1
            if (r1 == 0) goto L18
            java.lang.CharSequence r2 = r1.getText()
            boolean r2 = r2.equals(r5)
            if (r2 != 0) goto L3a
            java.lang.CharSequence r2 = r1.getContentDescription()
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L18
        L3a:
            boolean r4 = r3.f(r1)
            return r4
        L3f:
            return r0
    }

    @androidx.annotation.RequiresApi(api = 18)
    public boolean m(android.accessibilityservice.AccessibilityService r2, java.lang.String r3) {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r2 = r2.getRootInActiveWindow()
            r0 = 0
            if (r2 != 0) goto L8
            return r0
        L8:
            java.util.List r2 = r2.findAccessibilityNodeInfosByViewId(r3)
            if (r2 == 0) goto L2b
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L2b
            java.util.Iterator r2 = r2.iterator()
        L18:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L2b
            java.lang.Object r3 = r2.next()
            android.view.accessibility.AccessibilityNodeInfo r3 = (android.view.accessibility.AccessibilityNodeInfo) r3
            if (r3 == 0) goto L18
            boolean r2 = r1.f(r3)
            return r2
        L2b:
            return r0
    }
}
