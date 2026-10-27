package com.huawei.hms.scankit;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class i extends com.huawei.hms.scankit.e {
    protected com.huawei.hms.scankit.ViewfinderView A;
    protected android.widget.ImageView B;
    private android.widget.ImageView C;
    private android.widget.TextView D;
    private com.huawei.hms.feature.dynamic.IObjectWrapper E;
    private android.widget.RelativeLayout F;
    private int G;
    private int H;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements android.view.ViewTreeObserver.OnGlobalLayoutListener {
        final /* synthetic */ android.widget.RelativeLayout a;
        final /* synthetic */ com.huawei.hms.scankit.i b;

        a(com.huawei.hms.scankit.i r1, android.widget.RelativeLayout r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
                r2 = this;
                com.huawei.hms.scankit.i r0 = r2.b
                int r0 = com.huawei.hms.scankit.i.a(r0)
                android.widget.RelativeLayout r1 = r2.a
                int r1 = r1.getHeight()
                if (r0 == r1) goto L37
                com.huawei.hms.scankit.i r0 = r2.b
                int r0 = com.huawei.hms.scankit.i.b(r0)
                android.widget.RelativeLayout r1 = r2.a
                int r1 = r1.getWidth()
                if (r0 == r1) goto L37
                com.huawei.hms.scankit.i r0 = r2.b
                android.widget.RelativeLayout r1 = r2.a
                int r1 = r1.getHeight()
                com.huawei.hms.scankit.i.a(r0, r1)
                com.huawei.hms.scankit.i r0 = r2.b
                android.widget.RelativeLayout r1 = r2.a
                int r1 = r1.getWidth()
                com.huawei.hms.scankit.i.b(r0, r1)
                com.huawei.hms.scankit.i r0 = r2.b
                com.huawei.hms.scankit.i.c(r0)
            L37:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b implements android.view.View.OnClickListener {
        final /* synthetic */ com.huawei.hms.scankit.i a;

        b(com.huawei.hms.scankit.i r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r2) {
                r1 = this;
                com.huawei.hms.scankit.i r0 = r1.a
                android.view.View$OnClickListener r0 = r0.i
                if (r0 == 0) goto L9
                r0.onClick(r2)
            L9:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c implements android.view.View.OnClickListener {
        final /* synthetic */ com.huawei.hms.scankit.i a;

        c(com.huawei.hms.scankit.i r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r3) {
                r2 = this;
                boolean r0 = r3.isSelected()
                if (r0 == 0) goto L2a
                com.huawei.hms.scankit.i r3 = r2.a
                r3.f()
                com.huawei.hms.scankit.i r3 = r2.a
                com.huawei.hms.scankit.i.d(r3)
                com.huawei.hms.scankit.i r3 = r2.a
                android.widget.ImageView r3 = com.huawei.hms.scankit.i.e(r3)
                com.huawei.hms.scankit.i r0 = r2.a
                android.widget.ImageView r0 = com.huawei.hms.scankit.i.e(r0)
                android.content.res.Resources r0 = r0.getResources()
                int r1 = com.huawei.hms.scankit.R.string.scankit_light
                java.lang.String r0 = r0.getString(r1)
                r3.setContentDescription(r0)
                return
            L2a:
                com.huawei.hms.scankit.i r0 = r2.a
                r0.g()
                r0 = 1
                r3.setSelected(r0)
                com.huawei.hms.scankit.i r3 = r2.a
                android.widget.TextView r3 = com.huawei.hms.scankit.i.f(r3)
                int r0 = com.huawei.hms.scankit.R.string.scankit_light_off
                r3.setText(r0)
                com.huawei.hms.scankit.i r3 = r2.a
                android.widget.ImageView r3 = com.huawei.hms.scankit.i.e(r3)
                com.huawei.hms.scankit.i r1 = r2.a
                android.widget.ImageView r1 = com.huawei.hms.scankit.i.e(r1)
                android.content.res.Resources r1 = r1.getResources()
                java.lang.String r0 = r1.getString(r0)
                r3.setContentDescription(r0)
                return
        }
    }

    public i(android.content.Context r9, int r10, com.huawei.hms.feature.dynamic.IObjectWrapper r11, boolean r12, boolean r13) {
            r8 = this;
            r3 = 0
            r6 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r4 = r11
            r5 = r12
            r7 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r9 = 0
            r0.G = r9
            r0.H = r9
            r0.E = r4
            r0.c = r1
            r0.b = r2
            r0.p = r5
            android.graphics.Rect r9 = new android.graphics.Rect
            r10 = -1
            r9.<init>(r10, r10, r10, r10)
            r0.n = r9
            r0.s = r7
            return
    }

    static /* synthetic */ int a(com.huawei.hms.scankit.i r0) {
            int r0 = r0.G
            return r0
    }

    static /* synthetic */ int a(com.huawei.hms.scankit.i r0, int r1) {
            r0.G = r1
            return r1
    }

    static /* synthetic */ int b(com.huawei.hms.scankit.i r0) {
            int r0 = r0.H
            return r0
    }

    static /* synthetic */ int b(com.huawei.hms.scankit.i r0, int r1) {
            r0.H = r1
            return r1
    }

    static /* synthetic */ void c(com.huawei.hms.scankit.i r0) {
            r0.p()
            return
    }

    static /* synthetic */ void d(com.huawei.hms.scankit.i r0) {
            r0.o()
            return
    }

    static /* synthetic */ android.widget.ImageView e(com.huawei.hms.scankit.i r0) {
            android.widget.ImageView r0 = r0.C
            return r0
    }

    static /* synthetic */ android.widget.TextView f(com.huawei.hms.scankit.i r0) {
            android.widget.TextView r0 = r0.D
            return r0
    }

    private boolean n() {
            r2 = this;
            android.content.Context r0 = r2.c
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r0 = r0.widthPixels
            r1 = 1990(0x7c6, float:2.789E-42)
            if (r0 <= r1) goto L42
            android.content.Context r0 = r2.c
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r0 = r0.widthPixels
            r1 = 2300(0x8fc, float:3.223E-42)
            if (r0 >= r1) goto L42
            android.content.Context r0 = r2.c
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r0 = r0.heightPixels
            r1 = 2190(0x88e, float:3.069E-42)
            if (r0 <= r1) goto L42
            android.content.Context r0 = r2.c
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r0 = r0.heightPixels
            r1 = 2600(0xa28, float:3.643E-42)
            if (r0 >= r1) goto L42
            r0 = 1
            return r0
        L42:
            r0 = 0
            return r0
    }

    private void o() {
            r2 = this;
            android.widget.ImageView r0 = r2.C
            if (r0 == 0) goto L8
            r1 = 0
            r0.setSelected(r1)
        L8:
            android.widget.TextView r0 = r2.D
            if (r0 == 0) goto L11
            int r1 = com.huawei.hms.scankit.R.string.scankit_light
            r0.setText(r1)
        L11:
            return
    }

    private void p() {
            r3 = this;
            android.content.Context r0 = r3.c
            boolean r0 = com.huawei.hms.scankit.p.w7.f(r0)
            if (r0 == 0) goto L12
            android.content.Context r0 = r3.c
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = com.huawei.hms.scankit.p.w7.b(r0)
            if (r0 != 0) goto L38
        L12:
            android.widget.RelativeLayout r0 = r3.F
            if (r0 == 0) goto L38
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            android.widget.RelativeLayout r1 = r3.F
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            int r1 = r1.width
            android.widget.RelativeLayout r2 = r3.F
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            int r2 = r2.height
            r0.<init>(r1, r2)
            int r1 = r3.m()
            r2 = 0
            r0.setMargins(r2, r1, r2, r2)
            android.widget.RelativeLayout r1 = r3.F
            r1.setLayoutParams(r0)
        L38:
            return
    }

    @Override // com.huawei.hms.scankit.e
    protected void c() {
            r2 = this;
            super.c()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "initlight mIsContains "
            r0.append(r1)
            boolean r1 = r2.j
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "Scankit"
            com.huawei.hms.scankit.p.o4.d(r1, r0)
            boolean r0 = r2.j
            if (r0 != 0) goto L36
            boolean r0 = r2.t
            if (r0 == 0) goto L36
            android.content.Context r0 = r2.c
            boolean r0 = com.huawei.hms.scankit.p.w7.a(r0)
            if (r0 == 0) goto L36
            java.lang.String r0 = "initlight open"
            com.huawei.hms.scankit.p.o4.d(r1, r0)
            android.widget.LinearLayout r0 = r2.w
            r1 = 0
            r0.setVisibility(r1)
        L36:
            return
    }

    @Override // com.huawei.hms.scankit.e
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
            r0.<init>(r1, r2)
            return r0
    }

    @Override // com.huawei.hms.scankit.e
    protected void e() {
            r11 = this;
            com.huawei.hms.scankit.ProviderRemoteView r0 = r11.d()
            r11.d = r0
            int r1 = com.huawei.hms.scankit.R.id.scan_title
            android.view.View r0 = r0.findViewById(r1)
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            r11.F = r0
            r11.p()
            com.huawei.hms.scankit.ProviderRemoteView r0 = r11.d
            int r1 = com.huawei.hms.scankit.R.id.scan_parent_view
            android.view.View r0 = r0.findViewById(r1)
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            if (r0 == 0) goto L2b
            android.view.ViewTreeObserver r1 = r0.getViewTreeObserver()
            com.huawei.hms.scankit.i$a r2 = new com.huawei.hms.scankit.i$a
            r2.<init>(r11, r0)
            r1.addOnGlobalLayoutListener(r2)
        L2b:
            com.huawei.hms.scankit.ProviderRemoteView r0 = r11.d
            int r1 = com.huawei.hms.scankit.R.id.surfaceView
            android.view.View r0 = r0.findViewById(r1)
            android.view.TextureView r0 = (android.view.TextureView) r0
            r11.e = r0
            com.huawei.hms.scankit.ProviderRemoteView r0 = r11.d
            int r1 = com.huawei.hms.scankit.R.id.viewfinderView
            android.view.View r0 = r0.findViewById(r1)
            com.huawei.hms.scankit.ViewfinderView r0 = (com.huawei.hms.scankit.ViewfinderView) r0
            r11.A = r0
            com.huawei.hms.scankit.b r1 = new com.huawei.hms.scankit.b
            android.content.Context r2 = r11.c
            android.view.TextureView r3 = r11.e
            com.huawei.hms.scankit.ViewfinderView r4 = r11.A
            android.graphics.Rect r5 = r11.n
            int r6 = r11.b
            com.huawei.hms.feature.dynamic.IObjectWrapper r7 = r11.E
            boolean r8 = r11.p
            java.lang.String r9 = "DefaultView"
            r10 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.f = r1
            boolean r0 = r11.s
            r1.b(r0)
            com.huawei.hms.scankit.ProviderRemoteView r0 = r11.d
            int r1 = com.huawei.hms.scankit.R.id.img_btn
            android.view.View r0 = r0.findViewById(r1)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r11.B = r0
            com.huawei.hms.scankit.i$b r1 = new com.huawei.hms.scankit.i$b
            r1.<init>(r11)
            r0.setOnClickListener(r1)
            com.huawei.hms.scankit.ProviderRemoteView r0 = r11.d
            int r1 = com.huawei.hms.scankit.R.id.flash_light_ll
            android.view.View r0 = r0.findViewById(r1)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r11.w = r0
            com.huawei.hms.scankit.ProviderRemoteView r0 = r11.d
            int r1 = com.huawei.hms.scankit.R.id.ivFlash
            android.view.View r0 = r0.findViewById(r1)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r11.C = r0
            r11.c()
            android.widget.ImageView r0 = r11.C
            com.huawei.hms.scankit.i$c r1 = new com.huawei.hms.scankit.i$c
            r1.<init>(r11)
            r0.setOnClickListener(r1)
            com.huawei.hms.scankit.ProviderRemoteView r0 = r11.d
            int r1 = com.huawei.hms.scankit.R.id.flash_light_text
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r11.D = r0
            r0 = 0
            r1 = 1
            r11.a(r0, r1)
            r11.j()
            r11.k()
            return
    }

    @Override // com.huawei.hms.scankit.e, com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
    public com.huawei.hms.feature.dynamic.IObjectWrapper getView() {
            r1 = this;
            com.huawei.hms.scankit.ProviderRemoteView r0 = r1.d
            com.huawei.hms.feature.dynamic.IObjectWrapper r0 = com.huawei.hms.feature.dynamic.ObjectWrapper.wrap(r0)
            return r0
    }

    protected void i() {
            r11 = this;
            com.huawei.hms.scankit.ProviderRemoteView r0 = r11.d
            int r1 = com.huawei.hms.scankit.R.id.scan_parent_view
            android.view.View r0 = r0.findViewById(r1)
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            android.widget.LinearLayout r1 = new android.widget.LinearLayout
            android.content.Context r2 = r11.c
            r1.<init>(r2)
            r11.w = r1
            java.lang.String r1 = "Scankit"
            java.lang.String r2 = "initlight adJustLightLayout open"
            com.huawei.hms.scankit.p.o4.d(r1, r2)
            android.widget.LinearLayout r1 = r11.w
            r2 = 0
            r1.setVisibility(r2)
            android.widget.LinearLayout r1 = r11.w
            r3 = 1
            r1.setOrientation(r3)
            android.widget.ImageView r1 = r11.C
            android.view.ViewParent r1 = r1.getParent()
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            android.widget.ImageView r4 = r11.C
            r1.removeView(r4)
            android.widget.TextView r4 = r11.D
            r1.removeView(r4)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r4 = -1
            r5 = -2
            r1.<init>(r4, r5)
            android.content.Context r6 = r11.c
            r7 = 6
            int r6 = com.huawei.hms.scankit.p.i8.a(r6, r7)
            r1.topMargin = r6
            android.widget.LinearLayout r6 = r11.w
            r7 = 16
            r6.setGravity(r7)
            android.widget.RelativeLayout$LayoutParams r6 = new android.widget.RelativeLayout$LayoutParams
            android.content.Context r8 = r11.c
            r9 = 214(0xd6, float:3.0E-43)
            int r8 = com.huawei.hms.scankit.p.i8.a(r8, r9)
            r6.<init>(r8, r4)
            r8 = 11
            r6.addRule(r8)
            r8 = 15
            r6.addRule(r8)
            android.widget.LinearLayout r8 = new android.widget.LinearLayout
            android.content.Context r9 = r11.c
            r8.<init>(r9)
            android.widget.LinearLayout$LayoutParams r9 = new android.widget.LinearLayout$LayoutParams
            r9.<init>(r4, r5)
            android.content.Context r4 = r11.c
            r5 = 24
            int r4 = com.huawei.hms.scankit.p.i8.a(r4, r5)
            android.content.Context r10 = r11.c
            int r5 = com.huawei.hms.scankit.p.i8.a(r10, r5)
            r9.setMargins(r4, r2, r5, r2)
            r8.setLayoutParams(r9)
            r8.setGravity(r7)
            r8.setOrientation(r3)
            android.widget.ImageView r3 = r11.C
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r3 = (android.widget.LinearLayout.LayoutParams) r3
            r3.setMargins(r2, r2, r2, r2)
            android.widget.ImageView r2 = r11.C
            r8.addView(r2)
            android.widget.TextView r2 = r11.D
            r8.addView(r2, r1)
            android.widget.LinearLayout r1 = r11.w
            r1.addView(r8)
            android.widget.LinearLayout r1 = r11.w
            r0.addView(r1, r6)
            return
    }

    protected void j() {
            r5 = this;
            java.util.Locale r0 = java.util.Locale.getDefault()
            if (r0 == 0) goto L44
            boolean r0 = com.huawei.hms.scankit.p.w7.d()
            if (r0 == 0) goto L44
            com.huawei.hms.scankit.ProviderRemoteView r0 = r5.d
            int r1 = com.huawei.hms.scankit.R.id.title_scan
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            com.huawei.hms.scankit.ProviderRemoteView r1 = r5.d
            int r2 = com.huawei.hms.scankit.R.id.back_img_in
            android.view.View r1 = r1.findViewById(r2)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            if (r1 == 0) goto L27
            r2 = 1127481344(0x43340000, float:180.0)
            r1.setRotation(r2)
        L27:
            if (r0 == 0) goto L41
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            boolean r2 = r1 instanceof android.widget.RelativeLayout.LayoutParams
            if (r2 == 0) goto L41
            r2 = r1
            android.widget.RelativeLayout$LayoutParams r2 = (android.widget.RelativeLayout.LayoutParams) r2
            int r3 = com.huawei.hms.scankit.R.id.img_btn
            r4 = 1
            r2.addRule(r4, r3)
            r3 = 200(0xc8, float:2.8E-43)
            r2.rightMargin = r3
            r0.setLayoutParams(r1)
        L41:
            r5.k()
        L44:
            return
    }

    protected void k() {
            r3 = this;
            android.widget.LinearLayout r0 = r3.w
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.content.Context r1 = r3.c
            if (r1 == 0) goto L32
            android.content.res.Resources r1 = r1.getResources()
            if (r1 == 0) goto L32
            android.content.Context r1 = r3.c
            android.content.res.Resources r1 = r1.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            if (r1 == 0) goto L32
            boolean r1 = r3.n()
            if (r1 == 0) goto L32
            boolean r1 = r0 instanceof android.widget.FrameLayout.LayoutParams
            if (r1 == 0) goto L32
            r1 = r0
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            r2 = 150(0x96, float:2.1E-43)
            r1.bottomMargin = r2
            android.widget.LinearLayout r1 = r3.w
            r1.setLayoutParams(r0)
        L32:
            return
    }

    protected int l() {
            r5 = this;
            int r0 = r5.m()
            android.content.Context r1 = r5.c
            if (r1 == 0) goto L2f
            android.content.res.Resources r1 = r1.getResources()
            if (r1 == 0) goto L2f
            android.content.Context r1 = r5.c     // Catch: java.lang.Exception -> L2b
            android.content.res.Resources r1 = r1.getResources()     // Catch: java.lang.Exception -> L2b
            java.lang.String r2 = "hw_multiwindow_height_of_drag_bar"
            java.lang.String r3 = "dimen"
            java.lang.String r4 = "androidhwext"
            int r1 = r1.getIdentifier(r2, r3, r4)     // Catch: java.lang.Exception -> L2b
            if (r1 <= 0) goto L2f
            android.content.Context r2 = r5.c     // Catch: java.lang.Exception -> L2b
            android.content.res.Resources r2 = r2.getResources()     // Catch: java.lang.Exception -> L2b
            int r0 = r2.getDimensionPixelSize(r1)     // Catch: java.lang.Exception -> L2b
            return r0
        L2b:
            r1 = move-exception
            r1.getMessage()
        L2f:
            return r0
    }

    protected int m() {
            r4 = this;
            android.content.Context r0 = r4.c
            if (r0 == 0) goto L27
            android.content.res.Resources r0 = r0.getResources()
            if (r0 == 0) goto L27
            android.content.Context r0 = r4.c
            android.content.res.Resources r0 = r0.getResources()
            java.lang.String r1 = "dimen"
            java.lang.String r2 = "android"
            java.lang.String r3 = "status_bar_height"
            int r0 = r0.getIdentifier(r3, r1, r2)
            if (r0 <= 0) goto L27
            android.content.Context r1 = r4.c
            android.content.res.Resources r1 = r1.getResources()
            int r0 = r1.getDimensionPixelSize(r0)
            return r0
        L27:
            r0 = 0
            return r0
    }

    @Override // com.huawei.hms.scankit.e, android.hardware.SensorEventListener
    public void onAccuracyChanged(android.hardware.Sensor r1, int r2) {
            r0 = this;
            return
    }

    @Override // com.huawei.hms.scankit.e, com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
    public void onCreate(android.os.Bundle r1) {
            r0 = this;
            super.onCreate(r1)
            return
    }

    @Override // com.huawei.hms.scankit.e, com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
    public void onResume() {
            r3 = this;
            com.huawei.hms.scankit.b r0 = r3.f
            android.view.TextureView r1 = r0.i
            if (r1 != 0) goto La
            android.view.TextureView r1 = r3.e
            r0.i = r1
        La:
            r0.f()
            r3.o()
            android.hardware.SensorManager r0 = r3.h
            r1 = 5
            android.hardware.Sensor r1 = r0.getDefaultSensor(r1)
            r2 = 2
            r0.registerListener(r3, r1, r2)
            return
    }

    @Override // com.huawei.hms.scankit.e, com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
    public void setOnClickListener(com.huawei.hms.feature.dynamic.IObjectWrapper r1) {
            r0 = this;
            java.lang.Object r1 = com.huawei.hms.feature.dynamic.ObjectWrapper.unwrap(r1)
            android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
            r0.i = r1
            return
    }

    @Override // com.huawei.hms.scankit.e, com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
    public void turnOffLight() throws android.os.RemoteException {
            r0 = this;
            return
    }

    @Override // com.huawei.hms.scankit.e, com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
    public void turnOnLight() throws android.os.RemoteException {
            r0 = this;
            return
    }
}
