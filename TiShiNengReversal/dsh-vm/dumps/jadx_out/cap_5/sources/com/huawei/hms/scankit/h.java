package com.huawei.hms.scankit;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class h extends com.huawei.hms.scankit.i implements android.view.View.OnClickListener {
    private com.huawei.hms.scankit.drawable.ScanDrawable I;
    private android.widget.ImageView J;
    private android.widget.ImageView K;
    private android.widget.ImageView L;
    private android.widget.ImageView M;
    private android.widget.ImageView N;
    private android.widget.RelativeLayout O;
    private android.widget.LinearLayout P;
    private android.widget.LinearLayout Q;
    private android.widget.LinearLayout R;
    private android.widget.LinearLayout S;
    private int T;
    private int U;
    private android.widget.LinearLayout V;
    private android.widget.TextView W;
    private android.widget.TextView X;
    private android.widget.TextView Y;
    private android.widget.TextView Z;
    private android.widget.LinearLayout a0;
    private boolean b0;
    private boolean c0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements android.view.ViewTreeObserver.OnGlobalLayoutListener {
        final /* synthetic */ com.huawei.hms.scankit.h a;

        a(com.huawei.hms.scankit.h r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
                r5 = this;
                android.graphics.Rect r0 = new android.graphics.Rect
                r0.<init>()
                com.huawei.hms.scankit.h r1 = r5.a
                android.content.Context r1 = r1.c
                if (r1 != 0) goto Ld
                goto L184
            Ld:
                android.app.Activity r1 = (android.app.Activity) r1
                android.view.Window r1 = r1.getWindow()
                android.view.View r1 = r1.getDecorView()
                r1.getWindowVisibleDisplayFrame(r0)
                com.huawei.hms.scankit.h r1 = r5.a
                android.content.Context r1 = r1.c
                android.app.Activity r1 = (android.app.Activity) r1
                boolean r1 = com.huawei.hms.scankit.p.w7.c(r1)
                if (r1 != 0) goto L184
                com.huawei.hms.scankit.h r1 = r5.a
                android.content.Context r1 = r1.c
                android.app.Activity r1 = (android.app.Activity) r1
                android.view.Window r1 = r1.getWindow()
                android.view.View r1 = r1.getDecorView()
                android.view.View r1 = r1.getRootView()
                int r1 = r1.getWidth()
                int r0 = r0.right
                int r1 = r1 - r0
                boolean r0 = com.huawei.hms.scankit.p.w7.d()
                if (r0 != 0) goto Lb1
                com.huawei.hms.scankit.h r0 = r5.a
                android.widget.LinearLayout r0 = com.huawei.hms.scankit.h.a(r0)
                android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
                android.widget.RelativeLayout$LayoutParams r0 = (android.widget.RelativeLayout.LayoutParams) r0
                if (r1 == 0) goto L79
                int r1 = r0.getMarginEnd()
                com.huawei.hms.scankit.h r2 = r5.a
                android.content.Context r3 = r2.c
                int r2 = com.huawei.hms.scankit.h.b(r2)
                int r2 = r2 + (-12)
                int r2 = com.huawei.hms.scankit.p.i8.a(r3, r2)
                if (r1 == r2) goto L184
                com.huawei.hms.scankit.h r1 = r5.a
                android.content.Context r2 = r1.c
                int r1 = com.huawei.hms.scankit.h.b(r1)
                int r1 = r1 + (-12)
                int r1 = com.huawei.hms.scankit.p.i8.a(r2, r1)
                r0.setMarginEnd(r1)
                return
            L79:
                int r1 = r0.getMarginEnd()
                com.huawei.hms.scankit.h r2 = r5.a
                android.content.Context r3 = r2.c
                int r2 = com.huawei.hms.scankit.h.b(r2)
                int r2 = r2 + (-12)
                int r2 = com.huawei.hms.scankit.p.i8.a(r3, r2)
                com.huawei.hms.scankit.h r3 = r5.a
                android.content.Context r3 = r3.c
                int r3 = com.huawei.hms.scankit.p.i8.a(r3)
                int r2 = r2 + r3
                if (r1 == r2) goto L184
                com.huawei.hms.scankit.h r1 = r5.a
                android.content.Context r2 = r1.c
                int r1 = com.huawei.hms.scankit.h.b(r1)
                int r1 = r1 + (-12)
                int r1 = com.huawei.hms.scankit.p.i8.a(r2, r1)
                com.huawei.hms.scankit.h r2 = r5.a
                android.content.Context r2 = r2.c
                int r2 = com.huawei.hms.scankit.p.i8.a(r2)
                int r1 = r1 + r2
                r0.setMarginEnd(r1)
                return
            Lb1:
                com.huawei.hms.scankit.h r0 = r5.a
                android.widget.RelativeLayout r0 = com.huawei.hms.scankit.h.c(r0)
                android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
                android.widget.RelativeLayout$LayoutParams r0 = (android.widget.RelativeLayout.LayoutParams) r0
                com.huawei.hms.scankit.h r2 = r5.a
                android.widget.LinearLayout r2 = com.huawei.hms.scankit.h.d(r2)
                android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
                android.widget.RelativeLayout$LayoutParams r2 = (android.widget.RelativeLayout.LayoutParams) r2
                if (r1 == 0) goto L116
                int r1 = r0.getMarginStart()
                com.huawei.hms.scankit.h r3 = r5.a
                android.content.Context r4 = r3.c
                int r3 = com.huawei.hms.scankit.h.b(r3)
                int r3 = r3 + (-12)
                int r3 = com.huawei.hms.scankit.p.i8.a(r4, r3)
                if (r1 == r3) goto Lf0
                com.huawei.hms.scankit.h r1 = r5.a
                android.content.Context r3 = r1.c
                int r1 = com.huawei.hms.scankit.h.b(r1)
                int r1 = r1 + (-12)
                int r1 = com.huawei.hms.scankit.p.i8.a(r3, r1)
                r0.setMarginStart(r1)
            Lf0:
                int r0 = r2.getMarginStart()
                com.huawei.hms.scankit.h r1 = r5.a
                android.content.Context r3 = r1.c
                int r1 = com.huawei.hms.scankit.h.b(r1)
                int r1 = r1 + (-12)
                int r1 = com.huawei.hms.scankit.p.i8.a(r3, r1)
                if (r0 == r1) goto L184
                com.huawei.hms.scankit.h r0 = r5.a
                android.content.Context r1 = r0.c
                int r0 = com.huawei.hms.scankit.h.b(r0)
                int r0 = r0 + (-12)
                int r0 = com.huawei.hms.scankit.p.i8.a(r1, r0)
                r2.setMarginStart(r0)
                return
            L116:
                int r1 = r0.getMarginStart()
                com.huawei.hms.scankit.h r3 = r5.a
                android.content.Context r4 = r3.c
                int r3 = com.huawei.hms.scankit.h.b(r3)
                int r3 = r3 + (-12)
                int r3 = com.huawei.hms.scankit.p.i8.a(r4, r3)
                com.huawei.hms.scankit.h r4 = r5.a
                android.content.Context r4 = r4.c
                int r4 = com.huawei.hms.scankit.p.i8.a(r4)
                int r3 = r3 + r4
                if (r1 == r3) goto L14d
                com.huawei.hms.scankit.h r1 = r5.a
                android.content.Context r3 = r1.c
                int r1 = com.huawei.hms.scankit.h.b(r1)
                int r1 = r1 + (-12)
                int r1 = com.huawei.hms.scankit.p.i8.a(r3, r1)
                com.huawei.hms.scankit.h r3 = r5.a
                android.content.Context r3 = r3.c
                int r3 = com.huawei.hms.scankit.p.i8.a(r3)
                int r1 = r1 + r3
                r0.setMarginStart(r1)
            L14d:
                int r0 = r2.getMarginStart()
                com.huawei.hms.scankit.h r1 = r5.a
                android.content.Context r3 = r1.c
                int r1 = com.huawei.hms.scankit.h.b(r1)
                int r1 = r1 + (-12)
                int r1 = com.huawei.hms.scankit.p.i8.a(r3, r1)
                com.huawei.hms.scankit.h r3 = r5.a
                android.content.Context r3 = r3.c
                int r3 = com.huawei.hms.scankit.p.i8.a(r3)
                int r1 = r1 + r3
                if (r0 == r1) goto L184
                com.huawei.hms.scankit.h r0 = r5.a
                android.content.Context r1 = r0.c
                int r0 = com.huawei.hms.scankit.h.b(r0)
                int r0 = r0 + (-12)
                int r0 = com.huawei.hms.scankit.p.i8.a(r1, r0)
                com.huawei.hms.scankit.h r1 = r5.a
                android.content.Context r1 = r1.c
                int r1 = com.huawei.hms.scankit.p.i8.a(r1)
                int r0 = r0 + r1
                r2.setMarginStart(r0)
            L184:
                return
        }
    }

    public h(android.content.Context r1, int r2, com.huawei.hms.feature.dynamic.IObjectWrapper r3, boolean r4, boolean r5, int r6, boolean r7, boolean r8) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5)
            r1 = r0
            r2 = 24
            r1.T = r2
            r1.U = r6
            r1.b0 = r7
            r1.c0 = r8
            return
    }

    static /* synthetic */ android.widget.LinearLayout a(com.huawei.hms.scankit.h r0) {
            android.widget.LinearLayout r0 = r0.S
            return r0
    }

    static /* synthetic */ int b(com.huawei.hms.scankit.h r0) {
            int r0 = r0.T
            return r0
    }

    static /* synthetic */ android.widget.RelativeLayout c(com.huawei.hms.scankit.h r0) {
            android.widget.RelativeLayout r0 = r0.O
            return r0
    }

    static /* synthetic */ android.widget.LinearLayout d(com.huawei.hms.scankit.h r0) {
            android.widget.LinearLayout r0 = r0.a0
            return r0
    }

    private void q() {
            r3 = this;
            android.widget.LinearLayout r0 = r3.P
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.widget.RelativeLayout$LayoutParams r0 = (android.widget.RelativeLayout.LayoutParams) r0
            android.content.Context r1 = r3.c
            int r2 = r3.T
            int r2 = r2 + (-12)
            int r1 = com.huawei.hms.scankit.p.i8.a(r1, r2)
            r0.setMarginStart(r1)
            android.widget.LinearLayout r0 = r3.Q
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.widget.RelativeLayout$LayoutParams r0 = (android.widget.RelativeLayout.LayoutParams) r0
            android.content.Context r1 = r3.c
            int r2 = r3.T
            int r2 = r2 + (-12)
            int r1 = com.huawei.hms.scankit.p.i8.a(r1, r2)
            r0.setMarginEnd(r1)
            android.widget.LinearLayout r0 = r3.R
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.widget.RelativeLayout$LayoutParams r0 = (android.widget.RelativeLayout.LayoutParams) r0
            android.content.Context r1 = r3.c
            int r2 = r3.T
            int r2 = r2 + (-12)
            int r1 = com.huawei.hms.scankit.p.i8.a(r1, r2)
            r0.setMarginStart(r1)
            android.widget.LinearLayout r0 = r3.S
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.widget.RelativeLayout$LayoutParams r0 = (android.widget.RelativeLayout.LayoutParams) r0
            android.content.Context r1 = r3.c
            int r2 = r3.T
            int r2 = r2 + (-12)
            int r1 = com.huawei.hms.scankit.p.i8.a(r1, r2)
            r0.setMarginEnd(r1)
            return
    }

    private void r() {
            r2 = this;
            android.content.Context r0 = r2.c
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto Lb
            android.app.Activity r0 = (android.app.Activity) r0
            r0.finish()
        Lb:
            return
    }

    private void s() {
            r2 = this;
            com.huawei.hms.scankit.ProviderRemoteView r0 = r2.d
            int r1 = com.huawei.hms.scankit.R.id.scan_title_landscape
            android.view.View r0 = r0.findViewById(r1)
            r1 = 8
            r0.setVisibility(r1)
            com.huawei.hms.scankit.ProviderRemoteView r0 = r2.d
            int r1 = com.huawei.hms.scankit.R.id.scan_title
            android.view.View r0 = r0.findViewById(r1)
            r1 = 0
            r0.setVisibility(r1)
            return
    }

    private void t() {
            r2 = this;
            android.content.Context r0 = r2.c
            android.app.Activity r0 = (android.app.Activity) r0
            java.lang.String r1 = "uimode"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.app.UiModeManager r0 = (android.app.UiModeManager) r0
            int r0 = r0.getCurrentModeType()
            r1 = 3
            if (r0 == r1) goto L28
            r1 = 4
            if (r0 == r1) goto L23
            r1 = 6
            if (r0 == r1) goto L1e
            r0 = 24
            r2.T = r0
            return
        L1e:
            r0 = 26
            r2.T = r0
            return
        L23:
            r0 = 48
            r2.T = r0
            return
        L28:
            r0 = 32
            r2.T = r0
            return
    }

    private void u() {
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto L43
            android.content.Context r0 = r3.c
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L13
            android.app.Activity r0 = (android.app.Activity) r0
            android.view.WindowManager r0 = r0.getWindowManager()
            goto L1b
        L13:
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
        L1b:
            android.view.Display r0 = r0.getDefaultDisplay()
            android.graphics.Point r1 = new android.graphics.Point
            r1.<init>()
            r0.getRealSize(r1)
            android.content.Context r2 = r3.c
            android.app.Activity r2 = (android.app.Activity) r2
            boolean r2 = com.huawei.hms.scankit.p.w7.c(r2)
            if (r2 == 0) goto L34
            int r1 = r1.x
            goto L36
        L34:
            int r1 = r1.y
        L36:
            int r0 = r0.getWidth()
            if (r0 >= r1) goto L40
            r3.s()
            return
        L40:
            r3.v()
        L43:
            return
    }

    private void v() {
            r4 = this;
            android.widget.LinearLayout r0 = r4.V
            r1 = 8
            r0.setVisibility(r1)
            android.widget.RelativeLayout r0 = r4.O
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.widget.RelativeLayout$LayoutParams r0 = (android.widget.RelativeLayout.LayoutParams) r0
            int r2 = r4.l()
            r3 = 0
            r0.setMargins(r3, r2, r3, r3)
            android.widget.RelativeLayout r2 = r4.O
            r2.setLayoutParams(r0)
            com.huawei.hms.scankit.ProviderRemoteView r0 = r4.d
            int r2 = com.huawei.hms.scankit.R.id.scan_title_landscape
            android.view.View r0 = r0.findViewById(r2)
            r0.setVisibility(r3)
            com.huawei.hms.scankit.ProviderRemoteView r0 = r4.d
            int r2 = com.huawei.hms.scankit.R.id.scan_title
            android.view.View r0 = r0.findViewById(r2)
            r0.setVisibility(r1)
            return
    }

    @Override // com.huawei.hms.scankit.i, com.huawei.hms.scankit.e
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
            r2 = 0
            r0.<init>(r1, r2, r2)
            return r0
    }

    @Override // com.huawei.hms.scankit.i, com.huawei.hms.scankit.e
    protected void e() {
            r7 = this;
            super.e()
            com.huawei.hms.scankit.b r0 = r7.f
            boolean r1 = r7.c0
            r0.c(r1)
            com.huawei.hms.scankit.ProviderRemoteView r0 = r7.d
            int r1 = com.huawei.hms.scankit.R.id.ivScan
            android.view.View r0 = r0.findViewById(r1)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r7.J = r0
            com.huawei.hms.scankit.ProviderRemoteView r0 = r7.d
            int r1 = com.huawei.hms.scankit.R.id.back_img_in
            android.view.View r0 = r0.findViewById(r1)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r7.K = r0
            com.huawei.hms.scankit.ProviderRemoteView r0 = r7.d
            int r1 = com.huawei.hms.scankit.R.id.img_btn
            android.view.View r0 = r0.findViewById(r1)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r7.L = r0
            com.huawei.hms.scankit.ProviderRemoteView r0 = r7.d
            int r1 = com.huawei.hms.scankit.R.id.scankit_back_img_in_land
            android.view.View r0 = r0.findViewById(r1)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r7.M = r0
            com.huawei.hms.scankit.ProviderRemoteView r0 = r7.d
            int r1 = com.huawei.hms.scankit.R.id.scankit_img_btn_in_land
            android.view.View r0 = r0.findViewById(r1)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r7.N = r0
            com.huawei.hms.scankit.ProviderRemoteView r0 = r7.d
            int r1 = com.huawei.hms.scankit.R.id.scan_title_landscape
            android.view.View r0 = r0.findViewById(r1)
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            r7.O = r0
            com.huawei.hms.scankit.ProviderRemoteView r0 = r7.d
            int r1 = com.huawei.hms.scankit.R.id.back_layout
            android.view.View r0 = r0.findViewById(r1)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r7.P = r0
            com.huawei.hms.scankit.ProviderRemoteView r0 = r7.d
            int r1 = com.huawei.hms.scankit.R.id.gallery_Layout
            android.view.View r0 = r0.findViewById(r1)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r7.Q = r0
            com.huawei.hms.scankit.ProviderRemoteView r0 = r7.d
            int r1 = com.huawei.hms.scankit.R.id.back_layout_landscape
            android.view.View r0 = r0.findViewById(r1)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r7.R = r0
            com.huawei.hms.scankit.ProviderRemoteView r0 = r7.d
            int r1 = com.huawei.hms.scankit.R.id.gallery_Layout_landscape
            android.view.View r0 = r0.findViewById(r1)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r7.S = r0
            com.huawei.hms.scankit.ProviderRemoteView r0 = r7.d
            int r1 = com.huawei.hms.scankit.R.id.scan_title_layout
            android.view.View r0 = r0.findViewById(r1)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r7.V = r0
            com.huawei.hms.scankit.ProviderRemoteView r0 = r7.d
            int r2 = com.huawei.hms.scankit.R.id.title_scan
            android.view.View r0 = r0.findViewById(r2)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r7.W = r0
            com.huawei.hms.scankit.ProviderRemoteView r0 = r7.d
            int r2 = com.huawei.hms.scankit.R.id.title_scan_level_two
            android.view.View r0 = r0.findViewById(r2)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r7.X = r0
            com.huawei.hms.scankit.ProviderRemoteView r0 = r7.d
            int r2 = com.huawei.hms.scankit.R.id.scankit_title_scan_land
            android.view.View r0 = r0.findViewById(r2)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r7.Y = r0
            com.huawei.hms.scankit.ProviderRemoteView r0 = r7.d
            int r2 = com.huawei.hms.scankit.R.id.scankit_title_scan_land_level_two
            android.view.View r0 = r0.findViewById(r2)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r7.Z = r0
            com.huawei.hms.scankit.ProviderRemoteView r0 = r7.d
            int r2 = com.huawei.hms.scankit.R.id.scanLayout
            android.view.View r0 = r0.findViewById(r2)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r7.a0 = r0
            android.widget.LinearLayout r0 = r7.P
            r0.setOnClickListener(r7)
            android.widget.LinearLayout r0 = r7.Q
            r0.setOnClickListener(r7)
            android.widget.ImageView r0 = r7.K
            r0.setOnClickListener(r7)
            android.widget.ImageView r0 = r7.L
            r0.setOnClickListener(r7)
            android.widget.ImageView r0 = r7.M
            r0.setOnClickListener(r7)
            android.widget.ImageView r0 = r7.N
            r0.setOnClickListener(r7)
            android.widget.LinearLayout r0 = r7.R
            r0.setOnClickListener(r7)
            android.widget.LinearLayout r0 = r7.S
            r0.setOnClickListener(r7)
            android.widget.LinearLayout r0 = r7.V
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.widget.RelativeLayout$LayoutParams r0 = (android.widget.RelativeLayout.LayoutParams) r0
            android.content.Context r2 = r7.c
            r3 = 80
            int r2 = com.huawei.hms.scankit.p.i8.a(r2, r3)
            android.content.Context r4 = r7.c
            int r4 = com.huawei.hms.scankit.p.w7.d(r4)
            int r2 = r2 + r4
            r4 = 0
            r0.setMargins(r4, r2, r4, r4)
            r2 = 6
            r0.addRule(r2)
            android.widget.LinearLayout r2 = r7.V
            r2.setLayoutParams(r0)
            android.widget.LinearLayout r0 = r7.V
            r0.bringToFront()
            android.widget.LinearLayout r0 = r7.V
            r0.setVisibility(r4)
            r7.t()
            r7.q()
            int r0 = r7.U
            if (r0 != 0) goto L15d
            android.widget.TextView r0 = r7.W
            int r2 = com.huawei.hms.scankit.R.string.scankit_title_all
            r0.setText(r2)
            android.widget.TextView r0 = r7.W
            android.content.res.Resources r5 = r0.getResources()
            java.lang.String r5 = r5.getString(r2)
            r0.setContentDescription(r5)
            android.widget.TextView r0 = r7.X
            int r5 = com.huawei.hms.scankit.R.string.scankit_title_all_level_two
            r0.setText(r5)
            android.widget.TextView r0 = r7.Y
            r0.setText(r2)
            android.widget.TextView r0 = r7.Y
            android.content.res.Resources r6 = r0.getResources()
            java.lang.String r2 = r6.getString(r2)
            r0.setContentDescription(r2)
            android.widget.TextView r0 = r7.Z
            r0.setText(r5)
            goto L18f
        L15d:
            android.widget.TextView r0 = r7.W
            int r2 = com.huawei.hms.scankit.R.string.scankit_title_qr
            r0.setText(r2)
            android.widget.TextView r0 = r7.W
            android.content.res.Resources r5 = r0.getResources()
            java.lang.String r5 = r5.getString(r2)
            r0.setContentDescription(r5)
            android.widget.TextView r0 = r7.X
            int r5 = com.huawei.hms.scankit.R.string.scankit_title_qr_level_two
            r0.setText(r5)
            android.widget.TextView r0 = r7.Y
            r0.setText(r2)
            android.widget.TextView r0 = r7.Y
            android.content.res.Resources r6 = r0.getResources()
            java.lang.String r2 = r6.getString(r2)
            r0.setContentDescription(r2)
            android.widget.TextView r0 = r7.Z
            r0.setText(r5)
        L18f:
            android.widget.TextView r0 = r7.Z
            r0.bringToFront()
            android.widget.ImageView r0 = r7.J     // Catch: java.lang.Throwable -> L1bb
            if (r0 == 0) goto L1df
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()     // Catch: java.lang.Throwable -> L1bb
            android.content.Context r2 = r7.c     // Catch: java.lang.Throwable -> L1bb
            android.graphics.Point r2 = com.huawei.hms.scankit.p.i8.b(r2)     // Catch: java.lang.Throwable -> L1bb
            int r2 = r2.x     // Catch: java.lang.Throwable -> L1bb
            android.content.Context r5 = r7.c     // Catch: java.lang.Throwable -> L1bb
            r6 = 520(0x208, float:7.29E-43)
            int r5 = com.huawei.hms.scankit.p.i8.a(r5, r6)     // Catch: java.lang.Throwable -> L1bb
            if (r2 <= r5) goto L1be
            android.content.Context r2 = r7.c     // Catch: java.lang.Throwable -> L1bb
            android.graphics.Point r2 = com.huawei.hms.scankit.p.i8.b(r2)     // Catch: java.lang.Throwable -> L1bb
            int r2 = r2.x     // Catch: java.lang.Throwable -> L1bb
            int r2 = r2 / 2
            r0.width = r2     // Catch: java.lang.Throwable -> L1bb
            goto L1c8
        L1bb:
            goto L32c
        L1be:
            android.content.Context r2 = r7.c     // Catch: java.lang.Throwable -> L1bb
            android.graphics.Point r2 = com.huawei.hms.scankit.p.i8.b(r2)     // Catch: java.lang.Throwable -> L1bb
            int r2 = r2.x     // Catch: java.lang.Throwable -> L1bb
            r0.width = r2     // Catch: java.lang.Throwable -> L1bb
        L1c8:
            android.widget.ImageView r2 = r7.J     // Catch: java.lang.Throwable -> L1bb
            r2.setLayoutParams(r0)     // Catch: java.lang.Throwable -> L1bb
            com.huawei.hms.scankit.drawable.ScanDrawable r0 = new com.huawei.hms.scankit.drawable.ScanDrawable     // Catch: java.lang.Throwable -> L1bb
            android.content.Context r2 = r7.c     // Catch: java.lang.Throwable -> L1bb
            android.content.res.Resources r2 = r2.getResources()     // Catch: java.lang.Throwable -> L1bb
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L1bb
            r7.I = r0     // Catch: java.lang.Throwable -> L1bb
            android.widget.ImageView r2 = r7.J     // Catch: java.lang.Throwable -> L1bb
            r2.setImageDrawable(r0)     // Catch: java.lang.Throwable -> L1bb
        L1df:
            android.content.Context r0 = r7.c     // Catch: java.lang.Throwable -> L1bb
            boolean r0 = com.huawei.hms.scankit.p.w7.j(r0)     // Catch: java.lang.Throwable -> L1bb
            if (r0 != 0) goto L21f
            android.content.Context r0 = r7.c     // Catch: java.lang.Throwable -> L1bb
            android.app.Activity r0 = (android.app.Activity) r0     // Catch: java.lang.Throwable -> L1bb
            boolean r0 = com.huawei.hms.scankit.p.w7.c(r0)     // Catch: java.lang.Throwable -> L1bb
            if (r0 != 0) goto L1f5
            r7.u()     // Catch: java.lang.Throwable -> L1bb
            goto L1f8
        L1f5:
            r7.s()     // Catch: java.lang.Throwable -> L1bb
        L1f8:
            android.content.Context r0 = r7.c     // Catch: java.lang.Throwable -> L1bb
            boolean r0 = com.huawei.hms.scankit.p.w7.f(r0)     // Catch: java.lang.Throwable -> L1bb
            if (r0 == 0) goto L21f
            android.content.Context r0 = r7.c     // Catch: java.lang.Throwable -> L1bb
            android.app.Activity r0 = (android.app.Activity) r0     // Catch: java.lang.Throwable -> L1bb
            boolean r0 = com.huawei.hms.scankit.p.w7.b(r0)     // Catch: java.lang.Throwable -> L1bb
            if (r0 != 0) goto L21f
            android.content.Context r0 = r7.c     // Catch: java.lang.Throwable -> L1bb
            boolean r0 = com.huawei.hms.scankit.p.w7.h(r0)     // Catch: java.lang.Throwable -> L1bb
            if (r0 != 0) goto L21f
            boolean r0 = com.huawei.hms.scankit.p.w7.f()     // Catch: java.lang.Throwable -> L1bb
            if (r0 == 0) goto L21c
            r7.u()     // Catch: java.lang.Throwable -> L1bb
            goto L21f
        L21c:
            r7.v()     // Catch: java.lang.Throwable -> L1bb
        L21f:
            android.content.Context r0 = r7.c     // Catch: java.lang.Throwable -> L1bb
            boolean r0 = com.huawei.hms.scankit.p.w7.f(r0)     // Catch: java.lang.Throwable -> L1bb
            r2 = 12
            if (r0 == 0) goto L27d
            com.huawei.hms.scankit.ProviderRemoteView r0 = r7.d     // Catch: java.lang.Throwable -> L1bb
            android.view.View r0 = r0.findViewById(r1)     // Catch: java.lang.Throwable -> L1bb
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0     // Catch: java.lang.Throwable -> L1bb
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()     // Catch: java.lang.Throwable -> L1bb
            android.widget.RelativeLayout$LayoutParams r1 = (android.widget.RelativeLayout.LayoutParams) r1     // Catch: java.lang.Throwable -> L1bb
            android.content.Context r5 = r7.c     // Catch: java.lang.Throwable -> L1bb
            android.app.Activity r5 = (android.app.Activity) r5     // Catch: java.lang.Throwable -> L1bb
            boolean r5 = com.huawei.hms.scankit.p.w7.b(r5)     // Catch: java.lang.Throwable -> L1bb
            r6 = 10
            if (r5 == 0) goto L250
            android.content.Context r5 = r7.c     // Catch: java.lang.Throwable -> L1bb
            int r3 = com.huawei.hms.scankit.p.i8.a(r5, r3)     // Catch: java.lang.Throwable -> L1bb
            r1.setMargins(r4, r3, r4, r4)     // Catch: java.lang.Throwable -> L1bb
            r1.addRule(r6)     // Catch: java.lang.Throwable -> L1bb
            goto L277
        L250:
            android.content.Context r5 = r7.c     // Catch: java.lang.Throwable -> L1bb
            boolean r5 = com.huawei.hms.scankit.p.w7.h(r5)     // Catch: java.lang.Throwable -> L1bb
            if (r5 != 0) goto L277
            boolean r5 = com.huawei.hms.scankit.p.w7.f()     // Catch: java.lang.Throwable -> L1bb
            if (r5 == 0) goto L26b
            android.content.Context r5 = r7.c     // Catch: java.lang.Throwable -> L1bb
            int r3 = com.huawei.hms.scankit.p.i8.a(r5, r3)     // Catch: java.lang.Throwable -> L1bb
            r1.setMargins(r4, r3, r4, r4)     // Catch: java.lang.Throwable -> L1bb
            r1.addRule(r6)     // Catch: java.lang.Throwable -> L1bb
            goto L277
        L26b:
            android.content.Context r3 = r7.c     // Catch: java.lang.Throwable -> L1bb
            int r3 = com.huawei.hms.scankit.p.i8.a(r3, r4)     // Catch: java.lang.Throwable -> L1bb
            r1.setMargins(r4, r3, r4, r4)     // Catch: java.lang.Throwable -> L1bb
            r1.addRule(r2)     // Catch: java.lang.Throwable -> L1bb
        L277:
            r0.setLayoutParams(r1)     // Catch: java.lang.Throwable -> L1bb
            r0.bringToFront()     // Catch: java.lang.Throwable -> L1bb
        L27d:
            android.content.Context r0 = r7.c     // Catch: java.lang.Throwable -> L1bb
            android.app.Activity r0 = (android.app.Activity) r0     // Catch: java.lang.Throwable -> L1bb
            boolean r0 = com.huawei.hms.scankit.p.w7.c(r0)     // Catch: java.lang.Throwable -> L1bb
            if (r0 != 0) goto L30f
            android.content.Context r0 = r7.c     // Catch: java.lang.Throwable -> L1bb
            boolean r0 = com.huawei.hms.scankit.p.w7.k(r0)     // Catch: java.lang.Throwable -> L1bb
            if (r0 == 0) goto L30f
            android.content.Context r0 = r7.c     // Catch: java.lang.Throwable -> L1bb
            boolean r0 = com.huawei.hms.scankit.p.w7.j(r0)     // Catch: java.lang.Throwable -> L1bb
            if (r0 != 0) goto L30f
            android.content.Context r0 = r7.c     // Catch: java.lang.Throwable -> L1bb
            boolean r0 = com.huawei.hms.scankit.p.w7.f(r0)     // Catch: java.lang.Throwable -> L1bb
            if (r0 != 0) goto L30f
            java.util.Locale r0 = java.util.Locale.getDefault()     // Catch: java.lang.Throwable -> L1bb
            if (r0 == 0) goto L2f4
            boolean r0 = com.huawei.hms.scankit.p.w7.d()     // Catch: java.lang.Throwable -> L1bb
            if (r0 == 0) goto L2f4
            android.widget.RelativeLayout r0 = r7.O     // Catch: java.lang.Throwable -> L1bb
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()     // Catch: java.lang.Throwable -> L1bb
            android.widget.RelativeLayout$LayoutParams r0 = (android.widget.RelativeLayout.LayoutParams) r0     // Catch: java.lang.Throwable -> L1bb
            android.content.Context r1 = r7.c     // Catch: java.lang.Throwable -> L1bb
            int r1 = com.huawei.hms.scankit.p.i8.a(r1, r4)     // Catch: java.lang.Throwable -> L1bb
            r0.setMarginEnd(r1)     // Catch: java.lang.Throwable -> L1bb
            android.content.Context r1 = r7.c     // Catch: java.lang.Throwable -> L1bb
            int r3 = r7.T     // Catch: java.lang.Throwable -> L1bb
            int r3 = r3 - r2
            int r1 = com.huawei.hms.scankit.p.i8.a(r1, r3)     // Catch: java.lang.Throwable -> L1bb
            android.content.Context r3 = r7.c     // Catch: java.lang.Throwable -> L1bb
            int r3 = com.huawei.hms.scankit.p.i8.a(r3)     // Catch: java.lang.Throwable -> L1bb
            int r1 = r1 + r3
            r0.setMarginStart(r1)     // Catch: java.lang.Throwable -> L1bb
            android.widget.LinearLayout r0 = r7.a0     // Catch: java.lang.Throwable -> L1bb
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()     // Catch: java.lang.Throwable -> L1bb
            android.widget.RelativeLayout$LayoutParams r0 = (android.widget.RelativeLayout.LayoutParams) r0     // Catch: java.lang.Throwable -> L1bb
            android.content.Context r1 = r7.c     // Catch: java.lang.Throwable -> L1bb
            int r1 = com.huawei.hms.scankit.p.i8.a(r1, r4)     // Catch: java.lang.Throwable -> L1bb
            r0.setMarginEnd(r1)     // Catch: java.lang.Throwable -> L1bb
            android.content.Context r1 = r7.c     // Catch: java.lang.Throwable -> L1bb
            int r3 = r7.T     // Catch: java.lang.Throwable -> L1bb
            int r3 = r3 - r2
            int r1 = com.huawei.hms.scankit.p.i8.a(r1, r3)     // Catch: java.lang.Throwable -> L1bb
            android.content.Context r2 = r7.c     // Catch: java.lang.Throwable -> L1bb
            int r2 = com.huawei.hms.scankit.p.i8.a(r2)     // Catch: java.lang.Throwable -> L1bb
            int r1 = r1 + r2
            r0.setMarginStart(r1)     // Catch: java.lang.Throwable -> L1bb
            goto L30f
        L2f4:
            android.widget.LinearLayout r0 = r7.S     // Catch: java.lang.Throwable -> L1bb
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()     // Catch: java.lang.Throwable -> L1bb
            android.widget.RelativeLayout$LayoutParams r0 = (android.widget.RelativeLayout.LayoutParams) r0     // Catch: java.lang.Throwable -> L1bb
            android.content.Context r1 = r7.c     // Catch: java.lang.Throwable -> L1bb
            int r3 = r7.T     // Catch: java.lang.Throwable -> L1bb
            int r3 = r3 - r2
            int r1 = com.huawei.hms.scankit.p.i8.a(r1, r3)     // Catch: java.lang.Throwable -> L1bb
            android.content.Context r2 = r7.c     // Catch: java.lang.Throwable -> L1bb
            int r2 = com.huawei.hms.scankit.p.i8.a(r2)     // Catch: java.lang.Throwable -> L1bb
            int r1 = r1 + r2
            r0.setMarginEnd(r1)     // Catch: java.lang.Throwable -> L1bb
        L30f:
            android.content.Context r0 = r7.c     // Catch: java.lang.Throwable -> L1bb
            android.app.Activity r0 = (android.app.Activity) r0     // Catch: java.lang.Throwable -> L1bb
            boolean r0 = com.huawei.hms.scankit.p.w7.c(r0)     // Catch: java.lang.Throwable -> L1bb
            if (r0 != 0) goto L32c
            android.content.Context r0 = r7.c     // Catch: java.lang.Throwable -> L1bb
            boolean r0 = com.huawei.hms.scankit.p.w7.i(r0)     // Catch: java.lang.Throwable -> L1bb
            if (r0 == 0) goto L32c
            boolean r0 = r7.t     // Catch: java.lang.Throwable -> L1bb
            if (r0 == 0) goto L32c
            boolean r0 = r7.b0     // Catch: java.lang.Throwable -> L1bb
            if (r0 == 0) goto L32c
            r7.i()     // Catch: java.lang.Throwable -> L1bb
        L32c:
            com.huawei.hms.scankit.ProviderRemoteView r0 = r7.d
            int r1 = com.huawei.hms.scankit.R.id.scan_parent_view
            android.view.View r0 = r0.findViewById(r1)
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            com.huawei.hms.scankit.h$a r1 = new com.huawei.hms.scankit.h$a
            r1.<init>(r7)
            r0.addOnGlobalLayoutListener(r1)
            boolean r0 = r7.b0
            if (r0 != 0) goto L34d
            android.widget.ImageView r0 = r7.J
            r1 = 8
            r0.setVisibility(r1)
        L34d:
            return
    }

    @Override // com.huawei.hms.scankit.i
    protected void j() {
            r2 = this;
            java.util.Locale r0 = java.util.Locale.getDefault()
            if (r0 == 0) goto L35
            boolean r0 = com.huawei.hms.scankit.p.w7.d()
            if (r0 == 0) goto L35
            com.huawei.hms.scankit.ProviderRemoteView r0 = r2.d
            int r1 = com.huawei.hms.scankit.R.id.back_img_in
            android.view.View r0 = r0.findViewById(r1)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r2.K = r0
            com.huawei.hms.scankit.ProviderRemoteView r0 = r2.d
            int r1 = com.huawei.hms.scankit.R.id.scankit_back_img_in_land
            android.view.View r0 = r0.findViewById(r1)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r2.M = r0
            android.widget.ImageView r0 = r2.K
            if (r0 == 0) goto L32
            int r1 = com.huawei.hms.scankit.R.drawable.scankit_ic_back_mirroring
            r0.setImageResource(r1)
            android.widget.ImageView r0 = r2.M
            r0.setImageResource(r1)
        L32:
            r2.k()
        L35:
            return
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View r3) {
            r2 = this;
            int r0 = r3.getId()
            int r1 = com.huawei.hms.scankit.R.id.back_layout
            if (r0 != r1) goto Lb
            r2.r()
        Lb:
            int r0 = r3.getId()
            int r1 = com.huawei.hms.scankit.R.id.back_layout_landscape
            if (r0 != r1) goto L16
            r2.r()
        L16:
            int r0 = r3.getId()
            int r1 = com.huawei.hms.scankit.R.id.back_img_in
            if (r0 != r1) goto L21
            r2.r()
        L21:
            int r0 = r3.getId()
            int r1 = com.huawei.hms.scankit.R.id.scankit_back_img_in_land
            if (r0 != r1) goto L2c
            r2.r()
        L2c:
            int r0 = r3.getId()
            int r1 = com.huawei.hms.scankit.R.id.gallery_Layout
            if (r0 != r1) goto L39
            android.view.View$OnClickListener r0 = r2.i
            r0.onClick(r3)
        L39:
            int r0 = r3.getId()
            int r1 = com.huawei.hms.scankit.R.id.gallery_Layout_landscape
            if (r0 != r1) goto L46
            android.view.View$OnClickListener r0 = r2.i
            r0.onClick(r3)
        L46:
            int r0 = r3.getId()
            int r1 = com.huawei.hms.scankit.R.id.scankit_img_btn_in_land
            if (r0 != r1) goto L53
            android.view.View$OnClickListener r0 = r2.i
            r0.onClick(r3)
        L53:
            int r0 = r3.getId()
            int r1 = com.huawei.hms.scankit.R.id.img_btn
            if (r0 != r1) goto L60
            android.view.View$OnClickListener r0 = r2.i
            r0.onClick(r3)
        L60:
            return
    }

    @Override // com.huawei.hms.scankit.e, com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
    public void onStart() {
            r2 = this;
            super.onStart()
            boolean r0 = r2.b0
            if (r0 == 0) goto L2e
            com.huawei.hms.scankit.drawable.ScanDrawable r0 = r2.I
            if (r0 != 0) goto L23
            com.huawei.hms.scankit.drawable.ScanDrawable r0 = new com.huawei.hms.scankit.drawable.ScanDrawable
            android.content.Context r1 = r2.c
            android.content.res.Resources r1 = r1.getResources()
            r0.<init>(r1)
            r2.I = r0
            android.widget.ImageView r1 = r2.J
            r1.setImageDrawable(r0)
            com.huawei.hms.scankit.drawable.ScanDrawable r0 = r2.I
            r0.start()
            return
        L23:
            boolean r0 = r0.isRunning()
            if (r0 != 0) goto L2e
            com.huawei.hms.scankit.drawable.ScanDrawable r0 = r2.I
            r0.start()
        L2e:
            return
    }

    @Override // com.huawei.hms.scankit.e, com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
    public void onStop() {
            r1 = this;
            super.onStop()
            boolean r0 = r1.b0
            if (r0 == 0) goto L17
            com.huawei.hms.scankit.drawable.ScanDrawable r0 = r1.I
            if (r0 != 0) goto Lc
            goto L17
        Lc:
            boolean r0 = r0.isRunning()
            if (r0 == 0) goto L17
            com.huawei.hms.scankit.drawable.ScanDrawable r0 = r1.I
            r0.stop()
        L17:
            return
    }
}
