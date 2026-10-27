package com.kwad.components.core.e.c;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class b extends com.kwad.components.core.proxy.g {

    @androidx.annotation.Nullable
    private static com.kwad.components.core.e.c.b OG;

    @androidx.annotation.NonNull
    private final com.kwad.components.core.e.c.b.C0072b OH;
    private com.kwad.components.core.e.c.a OL;
    private boolean OM;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class a {

        @androidx.annotation.Nullable
        private android.content.DialogInterface.OnShowListener OO;

        @androidx.annotation.Nullable
        private android.content.DialogInterface.OnDismissListener OP;
        private com.kwad.sdk.core.response.model.AdTemplate adTemplate;
        private java.lang.String url;

        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ com.kwad.sdk.core.response.model.AdTemplate a(com.kwad.components.core.e.c.b.a r0) {
                com.kwad.sdk.core.response.model.AdTemplate r0 = r0.adTemplate
                return r0
        }

        static /* synthetic */ java.lang.String b(com.kwad.components.core.e.c.b.a r0) {
                java.lang.String r0 = r0.url
                return r0
        }

        static /* synthetic */ android.content.DialogInterface.OnShowListener c(com.kwad.components.core.e.c.b.a r0) {
                android.content.DialogInterface$OnShowListener r0 = r0.OO
                return r0
        }

        static /* synthetic */ android.content.DialogInterface.OnDismissListener d(com.kwad.components.core.e.c.b.a r0) {
                android.content.DialogInterface$OnDismissListener r0 = r0.OP
                return r0
        }

        public final com.kwad.components.core.e.c.b.a a(@androidx.annotation.Nullable android.content.DialogInterface.OnShowListener r1) {
                r0 = this;
                r0.OO = r1
                return r0
        }

        public final com.kwad.components.core.e.c.b.a aA(com.kwad.sdk.core.response.model.AdTemplate r1) {
                r0 = this;
                r0.adTemplate = r1
                return r0
        }

        public final com.kwad.components.core.e.c.b.a ak(java.lang.String r1) {
                r0 = this;
                r0.url = r1
                return r0
        }

        public final com.kwad.components.core.e.c.b.a c(@androidx.annotation.Nullable android.content.DialogInterface.OnDismissListener r1) {
                r0 = this;
                r0.OP = r1
                return r0
        }

        public final com.kwad.components.core.e.c.b.C0072b oZ() {
                r2 = this;
                java.lang.Boolean r0 = com.kwad.components.core.a.oz
                boolean r0 = r0.booleanValue()
                if (r0 == 0) goto L1d
                com.kwad.sdk.core.response.model.AdTemplate r0 = r2.adTemplate
                if (r0 == 0) goto L15
                java.lang.String r0 = r2.url
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 != 0) goto L15
                goto L1d
            L15:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "param is error, please check it"
                r0.<init>(r1)
                throw r0
            L1d:
                com.kwad.components.core.e.c.b$b r0 = new com.kwad.components.core.e.c.b$b
                r1 = 0
                r0.<init>(r2, r1)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.kwad.components.core.e.c.b$b, reason: collision with other inner class name */
    public static class C0072b {

        @androidx.annotation.Nullable
        protected android.content.DialogInterface.OnShowListener OO;

        @androidx.annotation.Nullable
        protected android.content.DialogInterface.OnDismissListener OP;
        protected final com.kwad.sdk.core.response.model.AdTemplate adTemplate;
        protected java.lang.String url;

        private C0072b(com.kwad.components.core.e.c.b.a r2) {
                r1 = this;
                r1.<init>()
                com.kwad.sdk.core.response.model.AdTemplate r0 = com.kwad.components.core.e.c.b.a.a(r2)
                r1.adTemplate = r0
                java.lang.String r0 = com.kwad.components.core.e.c.b.a.b(r2)
                r1.url = r0
                android.content.DialogInterface$OnShowListener r0 = com.kwad.components.core.e.c.b.a.c(r2)
                r1.OO = r0
                android.content.DialogInterface$OnDismissListener r2 = com.kwad.components.core.e.c.b.a.d(r2)
                r1.OP = r2
                return
        }

        /* synthetic */ C0072b(com.kwad.components.core.e.c.b.a r1, byte r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    private b(android.app.Activity r2, @androidx.annotation.NonNull com.kwad.components.core.e.c.b.C0072b r3) {
            r1 = this;
            r1.<init>(r2)
            r0 = 0
            r1.OM = r0
            r1.OH = r3
            boolean r2 = com.kwad.sdk.c.a.a.d(r2)
            if (r2 == 0) goto L17
            android.view.Window r2 = r1.getWindow()
            r0 = 1024(0x400, float:1.435E-42)
            r2.addFlags(r0)
        L17:
            android.content.DialogInterface$OnShowListener r2 = r3.OO
            r1.setOnShowListener(r2)
            android.content.DialogInterface$OnDismissListener r2 = r3.OP
            r1.setOnDismissListener(r2)
            return
    }

    public static boolean a(android.content.Context r2, com.kwad.components.core.e.c.b.C0072b r3) {
            com.kwad.components.core.e.c.b r0 = com.kwad.components.core.e.c.b.OG
            r1 = 0
            if (r0 == 0) goto Lc
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto Lc
            return r1
        Lc:
            if (r2 != 0) goto Lf
            return r1
        Lf:
            android.app.Activity r2 = com.kwad.sdk.o.m.ej(r2)
            if (r2 == 0) goto L3b
            boolean r0 = r2.isFinishing()
            if (r0 == 0) goto L1c
            goto L3b
        L1c:
            com.kwad.sdk.a.a.c r0 = com.kwad.sdk.a.a.c.CU()
            r0.dismiss()
            com.kwad.components.core.e.c.b r0 = new com.kwad.components.core.e.c.b     // Catch: java.lang.Throwable -> L37
            r0.<init>(r2, r3)     // Catch: java.lang.Throwable -> L37
            com.kwad.components.core.e.c.b.OG = r0     // Catch: java.lang.Throwable -> L37
            r0.show()     // Catch: java.lang.Throwable -> L37
            com.kwad.sdk.core.response.model.AdTemplate r2 = r3.adTemplate     // Catch: java.lang.Throwable -> L37
            r3 = 86
            r0 = 0
            com.kwad.sdk.core.adlog.c.b(r2, r3, r0)     // Catch: java.lang.Throwable -> L37
            r2 = 1
            return r2
        L37:
            r2 = move-exception
            com.kwad.sdk.core.d.c.printStackTrace(r2)
        L3b:
            return r1
    }

    public static boolean oW() {
            com.kwad.components.core.e.c.b r0 = com.kwad.components.core.e.c.b.OG
            if (r0 == 0) goto L9
            boolean r0 = r0.isShowing()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public final void al(boolean r1) {
            r0 = this;
            r0.OM = r1
            r0.dismiss()
            return
    }

    @Override // com.kwad.components.core.proxy.g, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
            r1 = this;
            super.dismiss()
            r0 = 0
            com.kwad.components.core.e.c.b.OG = r0
            return
    }

    @Override // com.kwad.components.core.proxy.g
    public final android.view.ViewGroup dw() {
            r3 = this;
            com.kwad.components.core.e.c.a r0 = new com.kwad.components.core.e.c.a
            android.content.Context r1 = r3.mContext
            com.kwad.components.core.e.c.b$b r2 = r3.OH
            r0.<init>(r1, r3, r2)
            r3.OL = r0
            return r0
    }

    @Override // com.kwad.components.core.proxy.g
    public final int getLayoutId() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.kwad.components.core.proxy.g
    public final void h(android.view.View r2) {
            r1 = this;
            com.kwad.components.core.e.c.a r2 = r1.OL
            com.kwad.components.core.e.c.b$1 r0 = new com.kwad.components.core.e.c.b$1
            r0.<init>(r1)
            r2.setChangeListener(r0)
            return
    }

    @Override // android.app.Dialog
    public final boolean isShowing() {
            r1 = this;
            boolean r0 = super.isShowing()
            return r0
    }

    @Override // com.kwad.components.core.proxy.g
    public final boolean oX() {
            r1 = this;
            r0 = 1
            return r0
    }

    public final boolean oY() {
            r1 = this;
            boolean r0 = r1.OM
            return r0
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
            r1 = this;
            super.onBackPressed()
            com.kwad.components.core.e.c.b$b r0 = r1.OH
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.adTemplate
            com.kwad.sdk.core.adlog.c.cb(r0)
            return
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
            r1 = this;
            super.onDetachedFromWindow()
            r0 = 0
            com.kwad.components.core.e.c.b.OG = r0
            return
    }

    @Override // com.kwad.components.core.proxy.g, android.app.Dialog
    public final void onStart() {
            r2 = this;
            super.onStart()
            com.kwad.components.core.e.c.b r0 = com.kwad.components.core.e.c.b.OG
            if (r0 == 0) goto Lb
            r1 = 0
            r0.setTitle(r1)
        Lb:
            return
    }

    @Override // android.app.Dialog
    public final void show() {
            r4 = this;
            super.show()     // Catch: java.lang.Exception -> L43
            android.content.Context r0 = r4.getContext()     // Catch: java.lang.Throwable -> L2c
            if (r0 == 0) goto L2e
            android.content.Context r0 = r4.getContext()     // Catch: java.lang.Throwable -> L2c
            android.content.res.Resources r0 = r0.getResources()     // Catch: java.lang.Throwable -> L2c
            if (r0 == 0) goto L2e
            java.lang.String r1 = "navigation_bar_height"
            java.lang.String r2 = "dimen"
            java.lang.String r3 = "android"
            int r0 = r0.getIdentifier(r1, r2, r3)     // Catch: java.lang.Throwable -> L2c
            if (r0 <= 0) goto L2e
            android.content.Context r1 = r4.getContext()     // Catch: java.lang.Throwable -> L2c
            android.content.res.Resources r1 = r1.getResources()     // Catch: java.lang.Throwable -> L2c
            int r0 = r1.getDimensionPixelSize(r0)     // Catch: java.lang.Throwable -> L2c
            goto L2f
        L2c:
            r0 = move-exception
            goto L3f
        L2e:
            r0 = 0
        L2f:
            if (r0 <= 0) goto L42
            android.view.Window r0 = r4.getWindow()     // Catch: java.lang.Throwable -> L2c
            android.view.View r0 = r0.getDecorView()     // Catch: java.lang.Throwable -> L2c
            r1 = 5382(0x1506, float:7.542E-42)
            r0.setSystemUiVisibility(r1)     // Catch: java.lang.Throwable -> L2c
            return
        L3f:
            com.kwad.sdk.core.d.c.printStackTraceOnly(r0)     // Catch: java.lang.Exception -> L43
        L42:
            return
        L43:
            r0 = move-exception
            com.kwad.sdk.core.d.c.printStackTraceOnly(r0)
            return
    }
}
