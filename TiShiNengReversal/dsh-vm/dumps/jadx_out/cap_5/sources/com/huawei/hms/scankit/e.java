package com.huawei.hms.scankit;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class e extends com.huawei.hms.hmsscankit.api.IRemoteViewDelegate.Stub implements com.huawei.hms.scankit.p.e5, android.hardware.SensorEventListener {
    private static final java.lang.String y = "e";
    protected static boolean z;
    private volatile com.huawei.hms.scankit.p.w3 a;
    protected int b;
    protected android.content.Context c;
    protected com.huawei.hms.scankit.ProviderRemoteView d;
    protected android.view.TextureView e;
    protected com.huawei.hms.scankit.b f;
    protected com.huawei.hms.hmsscankit.api.IOnResultCallback g;
    protected android.hardware.SensorManager h;
    protected android.view.View.OnClickListener i;
    protected boolean j;
    protected final java.lang.Float k;
    protected java.lang.Boolean l;
    protected android.app.AlertDialog m;
    protected android.graphics.Rect n;
    private com.huawei.hms.feature.dynamic.IObjectWrapper o;
    protected boolean p;
    private android.view.OrientationEventListener q;
    private boolean r;
    protected boolean s;
    protected boolean t;
    private android.graphics.Point u;
    protected com.huawei.hms.hmsscankit.api.IOnLightCallback v;
    protected android.widget.LinearLayout w;
    boolean x;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements android.view.View.OnTouchListener {
        final /* synthetic */ com.huawei.hms.scankit.e a;

        a(com.huawei.hms.scankit.e r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(android.view.View r1, android.view.MotionEvent r2) {
                r0 = this;
                com.huawei.hms.scankit.e r1 = r0.a
                com.huawei.hms.scankit.b r1 = r1.f
                r1.b(r2)
                r1 = 1
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends android.view.OrientationEventListener {
        final /* synthetic */ com.huawei.hms.scankit.e a;

        b(com.huawei.hms.scankit.e r1, android.content.Context r2) {
                r0 = this;
                r0.a = r1
                r0.<init>(r2)
                return
        }

        @Override // android.view.OrientationEventListener
        public void onOrientationChanged(int r5) {
                r4 = this;
                com.huawei.hms.scankit.e r5 = r4.a
                android.content.Context r5 = r5.c
                android.app.Activity r5 = (android.app.Activity) r5
                android.view.WindowManager r5 = r5.getWindowManager()
                android.view.Display r5 = r5.getDefaultDisplay()
                int r5 = r5.getRotation()
                boolean r0 = com.huawei.hms.scankit.p.w7.b()
                boolean r1 = com.huawei.hms.scankit.p.w7.e()
                com.huawei.hms.scankit.e r2 = r4.a
                android.content.Context r2 = r2.c
                boolean r2 = com.huawei.hms.scankit.p.w7.e(r2)
                r3 = 90
                if (r2 == 0) goto L2e
                if (r0 != 0) goto L2e
                com.huawei.hms.scankit.e r5 = r4.a
                com.huawei.hms.scankit.e.a(r5, r3)
                return
            L2e:
                com.huawei.hms.scankit.e r0 = r4.a
                android.content.Context r0 = r0.c
                android.app.Activity r0 = (android.app.Activity) r0
                boolean r0 = com.huawei.hms.scankit.p.w7.b(r0)
                if (r0 == 0) goto L42
                if (r1 != 0) goto L42
                com.huawei.hms.scankit.e r5 = r4.a
                com.huawei.hms.scankit.e.a(r5, r3)
                return
            L42:
                if (r5 == 0) goto L65
                r0 = 1
                if (r5 == r0) goto L5e
                r0 = 2
                if (r5 == r0) goto L56
                r0 = 3
                if (r5 == r0) goto L4e
                return
            L4e:
                com.huawei.hms.scankit.e r5 = r4.a
                r0 = 180(0xb4, float:2.52E-43)
                com.huawei.hms.scankit.e.a(r5, r0)
                return
            L56:
                com.huawei.hms.scankit.e r5 = r4.a
                r0 = 270(0x10e, float:3.78E-43)
                com.huawei.hms.scankit.e.a(r5, r0)
                return
            L5e:
                com.huawei.hms.scankit.e r5 = r4.a
                r0 = 0
                com.huawei.hms.scankit.e.a(r5, r0)
                return
            L65:
                com.huawei.hms.scankit.e r5 = r4.a
                com.huawei.hms.scankit.e.a(r5, r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c implements android.view.View.OnClickListener {
        final /* synthetic */ com.huawei.hms.scankit.e a;

        c(com.huawei.hms.scankit.e r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r1) {
                r0 = this;
                com.huawei.hms.scankit.e r1 = r0.a
                android.app.AlertDialog r1 = r1.m
                r1.dismiss()
                return
        }
    }

    static {
            return
    }

    public e(android.content.Context r4, int r5, java.lang.Object r6, com.huawei.hms.feature.dynamic.IObjectWrapper r7, boolean r8, boolean r9, boolean r10) {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.a = r0
            r1 = 0
            r3.b = r1
            r3.j = r1
            r2 = 1109393408(0x42200000, float:40.0)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r3.k = r2
            r3.p = r1
            r2 = 1
            r3.t = r2
            r3.u = r0
            r3.x = r1
            r3.c = r4
            r3.b = r5
            r3.o = r7
            boolean r4 = r6 instanceof android.graphics.Rect
            if (r4 == 0) goto L2b
            android.graphics.Rect r6 = (android.graphics.Rect) r6
            r3.n = r6
            goto L2d
        L2b:
            r3.n = r0
        L2d:
            r3.p = r8
            r3.r = r9
            r3.s = r10
            return
    }

    private static android.graphics.Point a(android.content.Context r3) {
            java.lang.String r0 = "window"
            java.lang.Object r0 = r3.getSystemService(r0)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.Display r0 = r0.getDefaultDisplay()
            android.graphics.Point r1 = new android.graphics.Point
            r1.<init>()
            boolean r2 = com.huawei.hms.scankit.p.w7.f(r3)
            if (r2 != 0) goto L22
            boolean r3 = com.huawei.hms.scankit.p.w7.e(r3)
            if (r3 == 0) goto L1e
            goto L22
        L1e:
            r0.getRealSize(r1)
            return r1
        L22:
            r0.getSize(r1)
            return r1
    }

    private void a(int r3) {
            r2 = this;
            com.huawei.hms.scankit.b r0 = r2.f
            if (r0 == 0) goto L50
            com.huawei.hms.scankit.p.j0 r0 = r0.a()
            if (r0 != 0) goto Lb
            goto L50
        Lb:
            android.content.Context r0 = r2.c     // Catch: java.lang.Exception -> L41 java.lang.NullPointerException -> L49
            android.graphics.Point r0 = a(r0)     // Catch: java.lang.Exception -> L41 java.lang.NullPointerException -> L49
            com.huawei.hms.scankit.b r1 = r2.f     // Catch: java.lang.Exception -> L41 java.lang.NullPointerException -> L49
            com.huawei.hms.scankit.p.j0 r1 = r1.a()     // Catch: java.lang.Exception -> L41 java.lang.NullPointerException -> L49
            int r1 = r1.d()     // Catch: java.lang.Exception -> L41 java.lang.NullPointerException -> L49
            if (r3 == r1) goto L26
            com.huawei.hms.scankit.b r1 = r2.f     // Catch: java.lang.Exception -> L41 java.lang.NullPointerException -> L49
            com.huawei.hms.scankit.p.j0 r1 = r1.a()     // Catch: java.lang.Exception -> L41 java.lang.NullPointerException -> L49
            r1.b(r3)     // Catch: java.lang.Exception -> L41 java.lang.NullPointerException -> L49
        L26:
            com.huawei.hms.scankit.b r3 = r2.f     // Catch: java.lang.Exception -> L41 java.lang.NullPointerException -> L49
            com.huawei.hms.scankit.p.j0 r3 = r3.a()     // Catch: java.lang.Exception -> L41 java.lang.NullPointerException -> L49
            boolean r3 = r3.i()     // Catch: java.lang.Exception -> L41 java.lang.NullPointerException -> L49
            if (r3 == 0) goto L50
            android.graphics.Point r3 = r2.u     // Catch: java.lang.Exception -> L41 java.lang.NullPointerException -> L49
            if (r3 == 0) goto L3c
            int r3 = r3.x     // Catch: java.lang.Exception -> L41 java.lang.NullPointerException -> L49
            int r1 = r0.x     // Catch: java.lang.Exception -> L41 java.lang.NullPointerException -> L49
            if (r3 == r1) goto L50
        L3c:
            r3 = 0
            r2.a(r0, r3)     // Catch: java.lang.Exception -> L41 java.lang.NullPointerException -> L49
            return
        L41:
            java.lang.String r3 = com.huawei.hms.scankit.e.y
            java.lang.String r0 = "adjustCameraOrientation: Exception"
            com.huawei.hms.scankit.p.o4.e(r3, r0)
            goto L50
        L49:
            java.lang.String r3 = com.huawei.hms.scankit.e.y
            java.lang.String r0 = "adjustCameraOrientation: nullpoint"
            com.huawei.hms.scankit.p.o4.e(r3, r0)
        L50:
            return
    }

    static /* synthetic */ void a(com.huawei.hms.scankit.e r0, int r1) {
            r0.a(r1)
            return
    }

    private com.huawei.hms.ml.scan.HmsScan[] a(com.huawei.hms.feature.dynamic.IObjectWrapper r6, com.huawei.hms.feature.dynamic.IObjectWrapper r7) {
            r5 = this;
            r0 = 0
            if (r6 != 0) goto Ld
            java.lang.String r6 = "ScankitRemoteS"
            java.lang.String r7 = "bitmap is null"
            com.huawei.hms.scankit.p.o4.b(r6, r7)
            com.huawei.hms.ml.scan.HmsScan[] r6 = new com.huawei.hms.ml.scan.HmsScan[r0]
            return r6
        Ld:
            r1 = 1
            if (r7 == 0) goto L3f
            java.lang.Object r2 = com.huawei.hms.feature.dynamic.ObjectWrapper.unwrap(r7)
            boolean r2 = r2 instanceof android.os.Bundle
            if (r2 == 0) goto L3f
            java.lang.Object r2 = com.huawei.hms.feature.dynamic.ObjectWrapper.unwrap(r7)
            android.os.Bundle r2 = (android.os.Bundle) r2
            java.lang.String r3 = "FormatValue"
            int r2 = r2.getInt(r3)
            java.lang.Object r7 = com.huawei.hms.feature.dynamic.ObjectWrapper.unwrap(r7)
            android.os.Bundle r7 = (android.os.Bundle) r7
            java.lang.String r3 = "TransType"
            int r7 = r7.getInt(r3, r0)
            com.huawei.hms.hmsscankit.DetailRect.HMSSCAN_SDK_VALUE = r7
            r3 = 2
            if (r7 < r3) goto L37
            r7 = 1
            goto L38
        L37:
            r7 = 0
        L38:
            if (r7 == 0) goto L41
            int r2 = com.huawei.hms.scankit.p.w7.b(r2)
            goto L41
        L3f:
            r7 = 0
            r2 = 0
        L41:
            com.huawei.hms.scankit.p.r6 r3 = com.huawei.hms.scankit.p.r6.a()
            java.lang.Object r6 = com.huawei.hms.feature.dynamic.ObjectWrapper.unwrap(r6)
            android.graphics.Bitmap r6 = (android.graphics.Bitmap) r6
            com.huawei.hms.scankit.p.w3 r4 = r5.a
            com.huawei.hms.ml.scan.HmsScan[] r6 = r3.b(r6, r2, r1, r4)
            if (r7 != 0) goto L57
            com.huawei.hms.ml.scan.HmsScan[] r6 = com.huawei.hms.scankit.p.w7.a(r6)
        L57:
            int r7 = r6.length
            if (r7 != 0) goto L5e
            r5.h()
            return r6
        L5e:
            r7 = r6[r0]
            if (r7 == 0) goto L6d
            java.lang.String r7 = r7.originalValue
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 == 0) goto L6d
            r5.h()
        L6d:
            return r6
    }

    protected void a(android.graphics.Point r3, boolean r4) {
            r2 = this;
            android.content.Context r0 = r2.c     // Catch: java.lang.Exception -> L18 java.lang.NullPointerException -> L20
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)     // Catch: java.lang.Exception -> L18 java.lang.NullPointerException -> L20
            if (r0 == 0) goto L27
            if (r3 != 0) goto L12
            android.content.Context r3 = r2.c     // Catch: java.lang.Exception -> L18 java.lang.NullPointerException -> L20
            android.graphics.Point r3 = a(r3)     // Catch: java.lang.Exception -> L18 java.lang.NullPointerException -> L20
        L12:
            r2.u = r3     // Catch: java.lang.Exception -> L18 java.lang.NullPointerException -> L20
            r2.b(r3, r4)     // Catch: java.lang.Exception -> L18 java.lang.NullPointerException -> L20
            return
        L18:
            java.lang.String r3 = com.huawei.hms.scankit.e.y
            java.lang.String r4 = "initSurfaceView: Exception"
            com.huawei.hms.scankit.p.o4.e(r3, r4)
            goto L27
        L20:
            java.lang.String r3 = com.huawei.hms.scankit.e.y
            java.lang.String r4 = "initSurfaceView: nullpoint"
            com.huawei.hms.scankit.p.o4.e(r3, r4)
        L27:
            return
    }

    @Override // com.huawei.hms.scankit.p.e5
    public boolean a() {
            r1 = this;
            boolean r0 = r1.x
            return r0
    }

    @Override // com.huawei.hms.scankit.p.e5
    public boolean a(com.huawei.hms.ml.scan.HmsScan[] r1) {
            r0 = this;
            if (r1 == 0) goto L14
            int r1 = r1.length
            if (r1 <= 0) goto L14
            android.app.AlertDialog r1 = r0.m
            if (r1 == 0) goto L14
            boolean r1 = r1.isShowing()
            if (r1 == 0) goto L14
            android.app.AlertDialog r1 = r0.m
            r1.dismiss()
        L14:
            r1 = 0
            return r1
    }

    protected void b(android.graphics.Point r8, boolean r9) {
            r7 = this;
            android.view.TextureView r0 = r7.e
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r0 = (android.widget.FrameLayout.LayoutParams) r0
            int r1 = r8.x
            float r1 = (float) r1
            int r2 = r8.y
            float r2 = (float) r2
            boolean r3 = com.huawei.hms.scankit.p.w7.b()
            java.lang.String r4 = com.huawei.hms.scankit.e.y
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "initSurfaceViewSize: isPortraitScreen: "
            r5.append(r6)
            android.content.Context r6 = r7.c
            android.app.Activity r6 = (android.app.Activity) r6
            boolean r6 = com.huawei.hms.scankit.p.w7.c(r6)
            r5.append(r6)
            java.lang.String r6 = " inMultiWindow: "
            r5.append(r6)
            android.content.Context r6 = r7.c
            boolean r6 = com.huawei.hms.scankit.p.w7.f(r6)
            r5.append(r6)
            java.lang.String r6 = " isInMultiWindowFreeform: "
            r5.append(r6)
            android.content.Context r6 = r7.c
            android.app.Activity r6 = (android.app.Activity) r6
            boolean r6 = com.huawei.hms.scankit.p.w7.b(r6)
            r5.append(r6)
            java.lang.String r6 = " isPadOrFold: "
            r5.append(r6)
            android.content.Context r6 = r7.c
            boolean r6 = com.huawei.hms.scankit.p.w7.j(r6)
            r5.append(r6)
            java.lang.String r6 = " isFoldStateExpand: "
            r5.append(r6)
            android.content.Context r6 = r7.c
            boolean r6 = com.huawei.hms.scankit.p.w7.h(r6)
            r5.append(r6)
            java.lang.String r6 = " isPad: "
            r5.append(r6)
            android.content.Context r6 = r7.c
            boolean r6 = com.huawei.hms.scankit.p.w7.i(r6)
            r5.append(r6)
            java.lang.String r6 = " inMagicWindow: "
            r5.append(r6)
            android.content.Context r6 = r7.c
            boolean r6 = com.huawei.hms.scankit.p.w7.e(r6)
            r5.append(r6)
            java.lang.String r6 = " ignore: "
            r5.append(r6)
            r5.append(r3)
            java.lang.String r6 = " screen: "
            r5.append(r6)
            java.lang.String r8 = r8.toString()
            r5.append(r8)
            java.lang.String r8 = " width: "
            r5.append(r8)
            int r8 = r0.width
            r5.append(r8)
            java.lang.String r8 = " height: "
            r5.append(r8)
            int r8 = r0.height
            r5.append(r8)
            java.lang.String r8 = " inMagicWindow "
            r5.append(r8)
            android.content.Context r8 = r7.c
            boolean r8 = com.huawei.hms.scankit.p.w7.e(r8)
            r5.append(r8)
            java.lang.String r8 = " ignore "
            r5.append(r8)
            r5.append(r3)
            java.lang.String r8 = " isInit "
            r5.append(r8)
            r5.append(r9)
            java.lang.String r8 = " isSpecialExpectSize "
            r5.append(r8)
            com.huawei.hms.scankit.b r8 = r7.f
            boolean r8 = r8.b()
            r5.append(r8)
            java.lang.String r8 = r5.toString()
            com.huawei.hms.scankit.p.o4.d(r4, r8)
            android.content.Context r8 = r7.c
            android.app.Activity r8 = (android.app.Activity) r8
            boolean r8 = com.huawei.hms.scankit.p.w7.c(r8)
            r4 = 17
            r5 = -1
            if (r8 != 0) goto L149
            android.content.Context r8 = r7.c
            boolean r8 = com.huawei.hms.scankit.p.w7.e(r8)
            if (r8 == 0) goto Lf9
            android.content.Context r8 = r7.c
            boolean r8 = com.huawei.hms.scankit.p.w7.e(r8)
            if (r8 == 0) goto L149
            if (r3 == 0) goto L149
        Lf9:
            r8 = 1
            com.huawei.hms.scankit.e.z = r8
            r8 = 1151336448(0x44a00000, float:1280.0)
            if (r9 == 0) goto L11f
            android.content.Context r9 = r7.c
            boolean r9 = com.huawei.hms.scankit.p.w7.f(r9)
            if (r9 != 0) goto L11a
            android.content.Context r9 = r7.c
            android.app.Activity r9 = (android.app.Activity) r9
            boolean r9 = com.huawei.hms.scankit.p.w7.b(r9)
            if (r9 != 0) goto L11a
            android.content.Context r9 = r7.c
            boolean r9 = com.huawei.hms.scankit.p.w7.e(r9)
            if (r9 == 0) goto L11f
        L11a:
            r9 = 1151336448(0x44a00000, float:1280.0)
            r3 = 1151336448(0x44a00000, float:1280.0)
            goto L123
        L11f:
            r9 = 1156579328(0x44f00000, float:1920.0)
            r3 = 1149698048(0x44870000, float:1080.0)
        L123:
            com.huawei.hms.scankit.b r6 = r7.f
            boolean r6 = r6.b()
            if (r6 == 0) goto L12e
            r3 = 1151336448(0x44a00000, float:1280.0)
            goto L12f
        L12e:
            r8 = r9
        L12f:
            float r1 = r1 / r8
            float r2 = r2 / r3
            int r9 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r9 <= 0) goto L13f
            float r3 = r3 * r1
            int r8 = (int) r3
            r0.width = r5
            r0.height = r8
            r0.gravity = r4
            goto L1a8
        L13f:
            float r8 = r8 * r2
            int r8 = (int) r8
            r0.height = r5
            r0.width = r8
            r0.gravity = r4
            goto L1a8
        L149:
            r8 = 0
            com.huawei.hms.scankit.e.z = r8
            java.lang.String r8 = android.os.Build.DEVICE
            java.lang.String r3 = "ceres-c3"
            boolean r8 = r3.equals(r8)
            r3 = 1280(0x500, float:1.794E-42)
            if (r8 == 0) goto L15d
            r8 = 1280(0x500, float:1.794E-42)
            r6 = 1280(0x500, float:1.794E-42)
            goto L161
        L15d:
            r8 = 1080(0x438, float:1.513E-42)
            r6 = 1920(0x780, float:2.69E-42)
        L161:
            if (r9 == 0) goto L181
            android.content.Context r9 = r7.c
            boolean r9 = com.huawei.hms.scankit.p.w7.f(r9)
            if (r9 != 0) goto L17d
            android.content.Context r9 = r7.c
            android.app.Activity r9 = (android.app.Activity) r9
            boolean r9 = com.huawei.hms.scankit.p.w7.b(r9)
            if (r9 != 0) goto L17d
            android.content.Context r9 = r7.c
            boolean r9 = com.huawei.hms.scankit.p.w7.e(r9)
            if (r9 == 0) goto L181
        L17d:
            r8 = 1280(0x500, float:1.794E-42)
            r6 = 1280(0x500, float:1.794E-42)
        L181:
            com.huawei.hms.scankit.b r9 = r7.f
            boolean r9 = r9.b()
            if (r9 == 0) goto L18c
            r6 = 1280(0x500, float:1.794E-42)
            goto L18d
        L18c:
            r3 = r8
        L18d:
            float r8 = (float) r3
            float r1 = r1 / r8
            float r9 = (float) r6
            float r2 = r2 / r9
            int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r3 <= 0) goto L19f
            float r9 = r9 * r1
            int r8 = (int) r9
            r0.width = r5
            r0.height = r8
            r0.gravity = r4
            goto L1a8
        L19f:
            float r8 = r8 * r2
            int r8 = (int) r8
            r0.height = r5
            r0.width = r8
            r0.gravity = r4
        L1a8:
            android.view.TextureView r8 = r7.e
            r8.setLayoutParams(r0)
            return
    }

    protected boolean b() {
            r2 = this;
            com.huawei.hms.scankit.b r0 = r2.f     // Catch: java.lang.Exception -> L11 java.lang.RuntimeException -> L19
            com.huawei.hms.scankit.p.j0 r0 = r0.a()     // Catch: java.lang.Exception -> L11 java.lang.RuntimeException -> L19
            java.lang.String r0 = r0.h()     // Catch: java.lang.Exception -> L11 java.lang.RuntimeException -> L19
            java.lang.String r1 = "torch"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> L11 java.lang.RuntimeException -> L19
            return r0
        L11:
            java.lang.String r0 = com.huawei.hms.scankit.e.y
            java.lang.String r1 = "getFlashStatusException"
            com.huawei.hms.scankit.p.o4.b(r0, r1)
            goto L20
        L19:
            java.lang.String r0 = com.huawei.hms.scankit.e.y
            java.lang.String r1 = "getFlashStatusRuntimeException"
            com.huawei.hms.scankit.p.o4.b(r0, r1)
        L20:
            r0 = 0
            return r0
    }

    protected void c() {
            r3 = this;
            android.content.Context r0 = r3.c
            java.lang.String r1 = "sensor"
            java.lang.Object r0 = r0.getSystemService(r1)
            boolean r1 = r0 instanceof android.hardware.SensorManager
            if (r1 == 0) goto L2f
            android.hardware.SensorManager r0 = (android.hardware.SensorManager) r0
            r3.h = r0
            r1 = -1
            java.util.List r0 = r0.getSensorList(r1)
            java.util.Iterator r0 = r0.iterator()
        L19:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2f
            java.lang.Object r1 = r0.next()
            android.hardware.Sensor r1 = (android.hardware.Sensor) r1
            int r1 = r1.getType()
            r2 = 5
            if (r2 != r1) goto L19
            r0 = 1
            r3.j = r0
        L2f:
            return
    }

    protected com.huawei.hms.scankit.ProviderRemoteView d() {
            r3 = this;
            com.huawei.hms.scankit.ProviderRemoteView r0 = new com.huawei.hms.scankit.ProviderRemoteView
            android.content.Context r1 = com.huawei.hms.feature.DynamicModuleInitializer.getContext()
            if (r1 != 0) goto Lb
            android.content.Context r1 = r3.c
            goto Lf
        Lb:
            android.content.Context r1 = com.huawei.hms.feature.DynamicModuleInitializer.getContext()
        Lf:
            r2 = 1
            r0.<init>(r1, r2)
            return r0
    }

    @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
    public com.huawei.hms.ml.scan.HmsScan[] decodeWithBitmap(com.huawei.hms.feature.dynamic.IObjectWrapper r8, com.huawei.hms.feature.dynamic.IObjectWrapper r9) throws android.os.RemoteException {
            r7 = this;
            boolean r0 = com.huawei.hms.scankit.p.r3.A
            if (r0 != 0) goto L7
            com.huawei.hms.scankit.util.OpencvJNI.init()
        L7:
            if (r9 == 0) goto L18
            java.lang.Object r0 = com.huawei.hms.feature.dynamic.ObjectWrapper.unwrap(r9)
            boolean r0 = r0 instanceof android.os.Bundle
            if (r0 == 0) goto L18
            java.lang.Object r0 = com.huawei.hms.feature.dynamic.ObjectWrapper.unwrap(r9)
            android.os.Bundle r0 = (android.os.Bundle) r0
            goto L1d
        L18:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
        L1d:
            r1 = 1
            r2 = 0
            if (r9 == 0) goto L4e
            java.lang.Object r3 = com.huawei.hms.feature.dynamic.ObjectWrapper.unwrap(r9)
            boolean r3 = r3 instanceof android.os.Bundle
            if (r3 == 0) goto L4e
            java.lang.Object r3 = com.huawei.hms.feature.dynamic.ObjectWrapper.unwrap(r9)
            android.os.Bundle r3 = (android.os.Bundle) r3
            java.lang.String r4 = "USEAPK"
            boolean r3 = r3.getBoolean(r4, r2)
            java.lang.Object r4 = com.huawei.hms.feature.dynamic.ObjectWrapper.unwrap(r9)
            android.os.Bundle r4 = (android.os.Bundle) r4
            java.lang.String r5 = "ROLLBACK"
            boolean r4 = r4.getBoolean(r5, r2)
            java.lang.Object r5 = com.huawei.hms.feature.dynamic.ObjectWrapper.unwrap(r9)
            android.os.Bundle r5 = (android.os.Bundle) r5
            java.lang.String r6 = "ParseResult"
            boolean r5 = r5.getBoolean(r6, r1)
            goto L51
        L4e:
            r3 = 0
            r4 = 0
            r5 = 1
        L51:
            com.huawei.hms.scankit.p.r3.f = r5
            if (r4 == 0) goto L64
            boolean r4 = com.huawei.hms.scankit.p.r3.a
            if (r4 != 0) goto L64
            if (r3 == 0) goto L64
            com.huawei.hms.ml.scan.HmsScan r8 = com.huawei.hms.scankit.p.r6.b()
            com.huawei.hms.ml.scan.HmsScan[] r9 = new com.huawei.hms.ml.scan.HmsScan[r1]
            r9[r2] = r8
            return r9
        L64:
            com.huawei.hms.scankit.p.w3 r1 = r7.a
            if (r1 != 0) goto L81
            com.huawei.hms.scankit.p.w3 r1 = new com.huawei.hms.scankit.p.w3     // Catch: java.lang.Exception -> L72 java.lang.RuntimeException -> L7a
            java.lang.String r2 = "PhotoMode"
            r1.<init>(r0, r2)     // Catch: java.lang.Exception -> L72 java.lang.RuntimeException -> L7a
            r7.a = r1     // Catch: java.lang.Exception -> L72 java.lang.RuntimeException -> L7a
            goto L81
        L72:
            java.lang.String r0 = com.huawei.hms.scankit.e.y
            java.lang.String r1 = "Exception"
            com.huawei.hms.scankit.p.o4.b(r0, r1)
            goto L81
        L7a:
            java.lang.String r0 = com.huawei.hms.scankit.e.y
            java.lang.String r1 = "RuntimeException"
            com.huawei.hms.scankit.p.o4.b(r0, r1)
        L81:
            com.huawei.hms.ml.scan.HmsScan[] r8 = r7.a(r8, r9)
            return r8
    }

    protected void e() {
            r11 = this;
            com.huawei.hms.scankit.ProviderRemoteView r0 = r11.d()
            r11.d = r0
            int r1 = com.huawei.hms.scankit.R.id.surfaceView
            android.view.View r0 = r0.findViewById(r1)
            android.view.TextureView r0 = (android.view.TextureView) r0
            r11.e = r0
            com.huawei.hms.scankit.b r1 = new com.huawei.hms.scankit.b
            android.content.Context r2 = r11.c
            android.view.TextureView r3 = r11.e
            android.graphics.Rect r5 = r11.n
            int r6 = r11.b
            com.huawei.hms.feature.dynamic.IObjectWrapper r7 = r11.o
            boolean r8 = r11.p
            java.lang.String r9 = "CustomizedView"
            r10 = 1
            r4 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.f = r1
            boolean r0 = r11.s
            r1.b(r0)
            r11.c()
            r0 = 0
            r1 = 1
            r11.a(r0, r1)
            return
    }

    protected void f() {
            r2 = this;
            com.huawei.hms.scankit.b r0 = r2.f     // Catch: java.lang.Exception -> L16 java.lang.RuntimeException -> L1e
            if (r0 == 0) goto L25
            com.huawei.hms.scankit.p.j0 r0 = r0.a()     // Catch: java.lang.Exception -> L16 java.lang.RuntimeException -> L1e
            if (r0 == 0) goto L25
            com.huawei.hms.scankit.b r0 = r2.f     // Catch: java.lang.Exception -> L16 java.lang.RuntimeException -> L1e
            com.huawei.hms.scankit.p.j0 r0 = r0.a()     // Catch: java.lang.Exception -> L16 java.lang.RuntimeException -> L1e
            java.lang.String r1 = "off"
            r0.a(r1)     // Catch: java.lang.Exception -> L16 java.lang.RuntimeException -> L1e
            return
        L16:
            java.lang.String r0 = com.huawei.hms.scankit.e.y
            java.lang.String r1 = "offFlashException"
            com.huawei.hms.scankit.p.o4.b(r0, r1)
            goto L25
        L1e:
            java.lang.String r0 = com.huawei.hms.scankit.e.y
            java.lang.String r1 = "offFlashRuntimeException"
            com.huawei.hms.scankit.p.o4.b(r0, r1)
        L25:
            return
    }

    public void g() {
            r2 = this;
            com.huawei.hms.scankit.b r0 = r2.f     // Catch: java.lang.Exception -> L16 java.lang.RuntimeException -> L1e
            if (r0 == 0) goto L25
            com.huawei.hms.scankit.p.j0 r0 = r0.a()     // Catch: java.lang.Exception -> L16 java.lang.RuntimeException -> L1e
            if (r0 == 0) goto L25
            com.huawei.hms.scankit.b r0 = r2.f     // Catch: java.lang.Exception -> L16 java.lang.RuntimeException -> L1e
            com.huawei.hms.scankit.p.j0 r0 = r0.a()     // Catch: java.lang.Exception -> L16 java.lang.RuntimeException -> L1e
            java.lang.String r1 = "torch"
            r0.a(r1)     // Catch: java.lang.Exception -> L16 java.lang.RuntimeException -> L1e
            return
        L16:
            java.lang.String r0 = com.huawei.hms.scankit.e.y
            java.lang.String r1 = "openFlashException"
            com.huawei.hms.scankit.p.o4.b(r0, r1)
            goto L25
        L1e:
            java.lang.String r0 = com.huawei.hms.scankit.e.y
            java.lang.String r1 = "openFlashRuntimeException"
            com.huawei.hms.scankit.p.o4.b(r0, r1)
        L25:
            return
    }

    @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
    public boolean getLightStatus() throws android.os.RemoteException {
            r1 = this;
            boolean r0 = r1.b()
            return r0
    }

    @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
    public com.huawei.hms.feature.dynamic.IObjectWrapper getView() {
            r1 = this;
            com.huawei.hms.scankit.ProviderRemoteView r0 = r1.d
            com.huawei.hms.feature.dynamic.IObjectWrapper r0 = com.huawei.hms.feature.dynamic.ObjectWrapper.wrap(r0)
            return r0
    }

    protected void h() {
            r4 = this;
            android.app.AlertDialog$Builder r0 = new android.app.AlertDialog$Builder
            android.content.Context r1 = r4.c
            r0.<init>(r1)
            android.app.AlertDialog r0 = r0.create()
            r4.m = r0
            r0.show()
            android.content.Context r0 = com.huawei.hms.feature.DynamicModuleInitializer.getContext()
            if (r0 != 0) goto L19
            android.content.Context r0 = r4.c
            goto L1d
        L19:
            android.content.Context r0 = com.huawei.hms.feature.DynamicModuleInitializer.getContext()
        L1d:
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r1 = com.huawei.hms.scankit.R.layout.scankit_dialog_layout
            r2 = 0
            android.view.View r0 = r0.inflate(r1, r2)
            android.app.AlertDialog r1 = r4.m
            android.view.Window r1 = r1.getWindow()
            android.view.WindowManager$LayoutParams r2 = r1.getAttributes()
            r3 = 60
            r2.y = r3
            r1.setAttributes(r2)
            android.graphics.drawable.ColorDrawable r2 = new android.graphics.drawable.ColorDrawable
            r3 = 0
            r2.<init>(r3)
            r1.setBackgroundDrawable(r2)
            r1.setContentView(r0)
            r2 = 80
            r1.setGravity(r2)
            int r1 = com.huawei.hms.scankit.R.id.dialog_sure_btn
            android.view.View r0 = r0.findViewById(r1)
            com.huawei.hms.scankit.e$c r1 = new com.huawei.hms.scankit.e$c
            r1.<init>(r4)
            r0.setOnClickListener(r1)
            return
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(android.hardware.Sensor r1, int r2) {
            r0 = this;
            return
    }

    @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
    public void onCreate(android.os.Bundle r2) {
            r1 = this;
            android.content.Context r2 = r1.c
            boolean r0 = r2 instanceof android.app.Activity
            if (r0 == 0) goto L1b
            android.app.Activity r2 = (android.app.Activity) r2
            android.view.Window r2 = r2.getWindow()
            if (r2 == 0) goto L1b
            android.content.Context r2 = r1.c
            android.app.Activity r2 = (android.app.Activity) r2
            android.view.Window r2 = r2.getWindow()
            r0 = 16777216(0x1000000, float:2.3509887E-38)
            r2.setFlags(r0, r0)
        L1b:
            android.content.Context r2 = r1.c
            if (r2 == 0) goto L4b
            android.content.pm.PackageManager r2 = r2.getPackageManager()
            if (r2 == 0) goto L4b
            android.content.Context r2 = r1.c
            android.content.pm.PackageManager r2 = r2.getPackageManager()
            java.lang.String r0 = "android.hardware.camera.flash"
            boolean r2 = r2.hasSystemFeature(r0)
            r1.t = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "initlight hasFlash "
            r2.append(r0)
            boolean r0 = r1.t
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            java.lang.String r0 = "Scankit"
            com.huawei.hms.scankit.p.o4.d(r0, r2)
        L4b:
            r1.e()
            com.huawei.hms.scankit.b r2 = r1.f
            r2.a(r1)
            com.huawei.hms.scankit.ProviderRemoteView r2 = r1.d
            com.huawei.hms.scankit.e$a r0 = new com.huawei.hms.scankit.e$a
            r0.<init>(r1)
            r2.setOnTouchListener(r0)
            com.huawei.hms.hmsscankit.api.IOnResultCallback r2 = r1.g
            if (r2 == 0) goto L66
            com.huawei.hms.scankit.b r0 = r1.f
            r0.a(r2)
        L66:
            com.huawei.hms.scankit.b r2 = r1.f
            boolean r0 = r1.r
            r2.a(r0)
            com.huawei.hms.scankit.b r2 = r1.f
            r2.c()
            int r2 = android.os.Build.VERSION.SDK_INT
            r0 = 24
            if (r2 < r0) goto L92
            com.huawei.hms.scankit.e$b r2 = new com.huawei.hms.scankit.e$b
            android.content.Context r0 = r1.c
            r2.<init>(r1, r0)
            r1.q = r2
            boolean r2 = r2.canDetectOrientation()
            if (r2 == 0) goto L8d
            android.view.OrientationEventListener r2 = r1.q
            r2.enable()
            return
        L8d:
            android.view.OrientationEventListener r2 = r1.q
            r2.disable()
        L92:
            return
    }

    @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
    public void onDestroy() {
            r2 = this;
            com.huawei.hms.scankit.b r0 = r2.f     // Catch: java.lang.Exception -> L2d java.lang.RuntimeException -> L35
            r0.d()     // Catch: java.lang.Exception -> L2d java.lang.RuntimeException -> L35
            android.view.OrientationEventListener r0 = r2.q     // Catch: java.lang.Exception -> L2d java.lang.RuntimeException -> L35
            if (r0 == 0) goto L14
            boolean r0 = r0.canDetectOrientation()     // Catch: java.lang.Exception -> L2d java.lang.RuntimeException -> L35
            if (r0 == 0) goto L14
            android.view.OrientationEventListener r0 = r2.q     // Catch: java.lang.Exception -> L2d java.lang.RuntimeException -> L35
            r0.disable()     // Catch: java.lang.Exception -> L2d java.lang.RuntimeException -> L35
        L14:
            android.content.Context r0 = r2.c     // Catch: java.lang.Exception -> L2d java.lang.RuntimeException -> L35
            r1 = 0
            if (r0 == 0) goto L1b
            r2.c = r1     // Catch: java.lang.Exception -> L2d java.lang.RuntimeException -> L35
        L1b:
            android.app.AlertDialog r0 = r2.m     // Catch: java.lang.Exception -> L2d java.lang.RuntimeException -> L35
            if (r0 == 0) goto L3c
            boolean r0 = r0.isShowing()     // Catch: java.lang.Exception -> L2d java.lang.RuntimeException -> L35
            if (r0 == 0) goto L3c
            android.app.AlertDialog r0 = r2.m     // Catch: java.lang.Exception -> L2d java.lang.RuntimeException -> L35
            r0.dismiss()     // Catch: java.lang.Exception -> L2d java.lang.RuntimeException -> L35
            r2.m = r1     // Catch: java.lang.Exception -> L2d java.lang.RuntimeException -> L35
            return
        L2d:
            java.lang.String r0 = com.huawei.hms.scankit.e.y
            java.lang.String r1 = "onDestroyException"
            com.huawei.hms.scankit.p.o4.b(r0, r1)
            goto L3c
        L35:
            java.lang.String r0 = com.huawei.hms.scankit.e.y
            java.lang.String r1 = "onDestroyRuntimeException"
            com.huawei.hms.scankit.p.o4.b(r0, r1)
        L3c:
            return
    }

    @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
    public void onPause() {
            r2 = this;
            com.huawei.hms.scankit.b r0 = r2.f     // Catch: java.lang.Exception -> Lb java.lang.RuntimeException -> L13
            r0.e()     // Catch: java.lang.Exception -> Lb java.lang.RuntimeException -> L13
            android.hardware.SensorManager r0 = r2.h     // Catch: java.lang.Exception -> Lb java.lang.RuntimeException -> L13
            r0.unregisterListener(r2)     // Catch: java.lang.Exception -> Lb java.lang.RuntimeException -> L13
            return
        Lb:
            java.lang.String r0 = com.huawei.hms.scankit.e.y
            java.lang.String r1 = "onPauseException"
            com.huawei.hms.scankit.p.o4.b(r0, r1)
            goto L1a
        L13:
            java.lang.String r0 = com.huawei.hms.scankit.e.y
            java.lang.String r1 = "onPauseRuntimeException"
            com.huawei.hms.scankit.p.o4.b(r0, r1)
        L1a:
            return
    }

    @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
    public void onResume() {
            r3 = this;
            com.huawei.hms.scankit.b r0 = r3.f     // Catch: java.lang.Exception -> L11 java.lang.RuntimeException -> L19
            r0.f()     // Catch: java.lang.Exception -> L11 java.lang.RuntimeException -> L19
            android.hardware.SensorManager r0 = r3.h     // Catch: java.lang.Exception -> L11 java.lang.RuntimeException -> L19
            r1 = 5
            android.hardware.Sensor r1 = r0.getDefaultSensor(r1)     // Catch: java.lang.Exception -> L11 java.lang.RuntimeException -> L19
            r2 = 2
            r0.registerListener(r3, r1, r2)     // Catch: java.lang.Exception -> L11 java.lang.RuntimeException -> L19
            return
        L11:
            java.lang.String r0 = com.huawei.hms.scankit.e.y
            java.lang.String r1 = "onResumeException"
            com.huawei.hms.scankit.p.o4.b(r0, r1)
            goto L20
        L19:
            java.lang.String r0 = com.huawei.hms.scankit.e.y
            java.lang.String r1 = "onResumeRuntimeException"
            com.huawei.hms.scankit.p.o4.b(r0, r1)
        L20:
            return
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(android.hardware.SensorEvent r5) {
            r4 = this;
            boolean r0 = r4.j
            if (r0 == 0) goto L7d
            android.hardware.Sensor r0 = r5.sensor
            int r0 = r0.getType()
            r1 = 5
            if (r0 != r1) goto L7d
            boolean r0 = r4.t
            if (r0 != 0) goto L12
            goto L7d
        L12:
            float[] r0 = r5.values
            r1 = 0
            r0 = r0[r1]
            java.lang.Float r2 = r4.k
            float r2 = r2.floatValue()
            r3 = 1
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L24
            r0 = 1
            goto L25
        L24:
            r0 = 0
        L25:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            r4.l = r2
            java.lang.String r2 = "onSensorChanged RemoteException"
            if (r0 != 0) goto L55
            android.content.Context r5 = r4.c
            boolean r5 = com.huawei.hms.scankit.p.w7.a(r5)
            if (r5 == 0) goto L7d
            android.widget.LinearLayout r5 = r4.w
            if (r5 == 0) goto L47
            java.lang.String r5 = "Scankit"
            java.lang.String r0 = "initlight onSensorChanged open"
            com.huawei.hms.scankit.p.o4.d(r5, r0)
            android.widget.LinearLayout r5 = r4.w
            r5.setVisibility(r1)
        L47:
            com.huawei.hms.hmsscankit.api.IOnLightCallback r5 = r4.v
            if (r5 == 0) goto L7d
            r5.onVisibleChanged(r3)     // Catch: android.os.RemoteException -> L4f
            return
        L4f:
            java.lang.String r5 = com.huawei.hms.scankit.e.y
            com.huawei.hms.scankit.p.o4.e(r5, r2)
            goto L7d
        L55:
            float[] r5 = r5.values
            r5 = r5[r1]
            r0 = 1142292480(0x44160000, float:600.0)
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 <= 0) goto L7d
            android.widget.LinearLayout r5 = r4.w
            if (r5 == 0) goto L70
            boolean r5 = r4.b()
            if (r5 != 0) goto L70
            android.widget.LinearLayout r5 = r4.w
            r0 = 8
            r5.setVisibility(r0)
        L70:
            com.huawei.hms.hmsscankit.api.IOnLightCallback r5 = r4.v
            if (r5 == 0) goto L7d
            r5.onVisibleChanged(r1)     // Catch: android.os.RemoteException -> L78
            return
        L78:
            java.lang.String r5 = com.huawei.hms.scankit.e.y
            com.huawei.hms.scankit.p.o4.e(r5, r2)
        L7d:
            return
    }

    @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
    public void onStart() {
            r2 = this;
            com.huawei.hms.scankit.b r0 = r2.f     // Catch: java.lang.Exception -> L6 java.lang.RuntimeException -> Le
            r0.g()     // Catch: java.lang.Exception -> L6 java.lang.RuntimeException -> Le
            return
        L6:
            java.lang.String r0 = com.huawei.hms.scankit.e.y
            java.lang.String r1 = "onStartException"
            com.huawei.hms.scankit.p.o4.b(r0, r1)
            goto L15
        Le:
            java.lang.String r0 = com.huawei.hms.scankit.e.y
            java.lang.String r1 = "onStartRuntimeException"
            com.huawei.hms.scankit.p.o4.b(r0, r1)
        L15:
            return
    }

    @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
    public void onStop() {
            r2 = this;
            com.huawei.hms.scankit.b r0 = r2.f     // Catch: java.lang.Exception -> L6 java.lang.RuntimeException -> Le
            r0.h()     // Catch: java.lang.Exception -> L6 java.lang.RuntimeException -> Le
            return
        L6:
            java.lang.String r0 = com.huawei.hms.scankit.e.y
            java.lang.String r1 = "onStopException"
            com.huawei.hms.scankit.p.o4.b(r0, r1)
            goto L15
        Le:
            java.lang.String r0 = com.huawei.hms.scankit.e.y
            java.lang.String r1 = "onStopRuntimeException"
            com.huawei.hms.scankit.p.o4.b(r0, r1)
        L15:
            return
    }

    @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
    public void pauseContinuouslyScan() throws android.os.RemoteException {
            r1 = this;
            com.huawei.hms.scankit.b r0 = r1.f
            if (r0 == 0) goto L7
            r0.i()
        L7:
            r0 = 1
            r1.x = r0
            return
    }

    @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
    public void resumeContinuouslyScan() throws android.os.RemoteException {
            r1 = this;
            r0 = 0
            r1.x = r0
            return
    }

    @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
    public void setOnClickListener(com.huawei.hms.feature.dynamic.IObjectWrapper r1) {
            r0 = this;
            if (r1 == 0) goto La
            java.lang.Object r1 = com.huawei.hms.feature.dynamic.ObjectWrapper.unwrap(r1)
            android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
            r0.i = r1
        La:
            return
    }

    @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
    public void setOnErrorCallback(com.huawei.hms.hmsscankit.api.IOnErrorCallback r2) throws android.os.RemoteException {
            r1 = this;
            com.huawei.hms.scankit.b r0 = r1.f
            if (r0 == 0) goto L7
            r0.a(r2)
        L7:
            return
    }

    @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
    public void setOnLightVisbleCallBack(com.huawei.hms.hmsscankit.api.IOnLightCallback r1) throws android.os.RemoteException {
            r0 = this;
            r0.v = r1
            return
    }

    @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
    public void setOnResultCallback(com.huawei.hms.hmsscankit.api.IOnResultCallback r2) {
            r1 = this;
            r1.g = r2
            com.huawei.hms.scankit.b r0 = r1.f
            if (r0 == 0) goto L9
            r0.a(r2)
        L9:
            return
    }

    @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
    public void turnOffLight() throws android.os.RemoteException {
            r0 = this;
            r0.f()
            return
    }

    @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
    public void turnOnLight() throws android.os.RemoteException {
            r0 = this;
            r0.g()
            return
    }
}
