package com.kwad.components.core.webview.tachikoma.d;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class e extends com.kwad.components.core.proxy.j {
    public java.lang.String AI;
    public com.kwad.components.core.webview.tachikoma.f.c Yd;
    protected com.kwad.components.offline.api.tk.model.StyleTemplate Yf;
    private com.kwad.components.core.webview.tachikoma.d.d ahA;
    private com.kwad.sdk.widget.KSFrameLayout ahB;
    protected java.util.List<android.content.DialogInterface.OnDismissListener> ahC;
    public boolean ahD;
    protected com.kwad.components.core.webview.tachikoma.d.b ahp;
    protected com.kwad.sdk.components.l ahr;
    protected com.kwad.components.core.webview.tachikoma.k ahs;
    public boolean aht;
    public com.kwad.components.core.webview.tachikoma.d.e.a ahu;
    private com.kwad.components.core.webview.tachikoma.f.e ahx;
    public com.kwad.sdk.core.response.model.AdResultData mAdResultData;
    private com.kwad.sdk.mvp.Presenter mPresenter;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        boolean hc();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class b {
        private boolean ahD;
        private com.kwad.components.offline.api.tk.model.StyleTemplate ahF;
        private com.kwad.components.core.webview.tachikoma.k ahG;
        private com.kwad.sdk.components.l ahr;
        private boolean aht;
        private com.kwad.sdk.core.response.model.AdResultData mAdResultData;
        private java.lang.String templateId;

        public b() {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ boolean c(com.kwad.components.core.webview.tachikoma.d.e.b r0) {
                boolean r0 = r0.aht
                return r0
        }

        static /* synthetic */ boolean d(com.kwad.components.core.webview.tachikoma.d.e.b r0) {
                boolean r0 = r0.ahD
                return r0
        }

        static /* synthetic */ com.kwad.components.offline.api.tk.model.StyleTemplate e(com.kwad.components.core.webview.tachikoma.d.e.b r0) {
                com.kwad.components.offline.api.tk.model.StyleTemplate r0 = r0.ahF
                return r0
        }

        static /* synthetic */ com.kwad.sdk.components.l f(com.kwad.components.core.webview.tachikoma.d.e.b r0) {
                com.kwad.sdk.components.l r0 = r0.ahr
                return r0
        }

        static /* synthetic */ com.kwad.components.core.webview.tachikoma.k g(com.kwad.components.core.webview.tachikoma.d.e.b r0) {
                com.kwad.components.core.webview.tachikoma.k r0 = r0.ahG
                return r0
        }

        public final void a(com.kwad.components.core.webview.tachikoma.k r1) {
                r0 = this;
                r0.ahG = r1
                return
        }

        public final void a(com.kwad.components.offline.api.tk.model.StyleTemplate r1) {
                r0 = this;
                r0.ahF = r1
                return
        }

        public final void a(com.kwad.sdk.core.response.model.AdResultData r1) {
                r0 = this;
                r0.mAdResultData = r1
                return
        }

        public final void aZ(boolean r1) {
                r0 = this;
                r1 = 0
                r0.aht = r1
                return
        }

        public final void ba(boolean r1) {
                r0 = this;
                r1 = 1
                r0.ahD = r1
                return
        }

        public final void bg(java.lang.String r1) {
                r0 = this;
                r0.templateId = r1
                return
        }

        public final void c(com.kwad.sdk.components.l r1) {
                r0 = this;
                r0.ahr = r1
                return
        }

        public final java.lang.String getTemplateId() {
                r1 = this;
                java.lang.String r0 = r1.templateId
                return r0
        }

        public final com.kwad.sdk.core.response.model.AdResultData iu() {
                r1 = this;
                com.kwad.sdk.core.response.model.AdResultData r0 = r1.mAdResultData
                return r0
        }

        public final boolean ln() {
                r1 = this;
                boolean r0 = r1.aht
                return r0
        }

        public final boolean vH() {
                r1 = this;
                boolean r0 = r1.ahD
                return r0
        }
    }

    public e() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r1.ahC = r0
            r0 = 0
            r1.ahD = r0
            return
    }

    private void D(android.view.View r2) {
            r1 = this;
            com.kwad.components.core.webview.tachikoma.d.b r0 = r1.ahp
            if (r0 != 0) goto La
            com.kwad.components.core.webview.tachikoma.d.b r0 = r1.ku()
            r1.ahp = r0
        La:
            r1.kw()
            com.kwad.sdk.mvp.Presenter r0 = r1.mPresenter
            if (r0 != 0) goto L1a
            com.kwad.sdk.mvp.Presenter r0 = r1.bD()
            r1.mPresenter = r0
            r0.K(r2)
        L1a:
            com.kwad.sdk.mvp.Presenter r2 = r1.mPresenter
            com.kwad.components.core.webview.tachikoma.d.b r0 = r1.ahp
            r2.n(r0)
            return
    }

    static /* synthetic */ com.kwad.components.core.webview.tachikoma.d.d a(com.kwad.components.core.webview.tachikoma.d.e r0) {
            com.kwad.components.core.webview.tachikoma.d.d r0 = r0.ahA
            return r0
    }

    public static com.kwad.components.core.webview.tachikoma.d.e b(com.kwad.components.core.webview.tachikoma.d.e.b r3) {
            com.kwad.components.core.webview.tachikoma.d.e r0 = new com.kwad.components.core.webview.tachikoma.d.e
            r0.<init>()
            com.kwad.sdk.core.response.model.AdResultData r1 = r3.iu()
            r0.mAdResultData = r1
            java.lang.String r1 = r3.getTemplateId()
            r0.AI = r1
            boolean r1 = com.kwad.components.core.webview.tachikoma.d.e.b.c(r3)
            r0.aht = r1
            boolean r1 = com.kwad.components.core.webview.tachikoma.d.e.b.d(r3)
            r0.ahD = r1
            com.kwad.components.offline.api.tk.model.StyleTemplate r1 = com.kwad.components.core.webview.tachikoma.d.e.b.e(r3)
            r0.Yf = r1
            com.kwad.sdk.components.l r1 = com.kwad.components.core.webview.tachikoma.d.e.b.f(r3)
            r0.ahr = r1
            com.kwad.components.core.webview.tachikoma.k r1 = com.kwad.components.core.webview.tachikoma.d.e.b.g(r3)
            r0.ahs = r1
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r2 = "templateId"
            java.lang.String r3 = r3.getTemplateId()
            r1.putString(r2, r3)
            r0.setArguments(r1)
            return r0
    }

    private com.kwad.sdk.mvp.Presenter bD() {
            r2 = this;
            com.kwad.sdk.mvp.Presenter r0 = new com.kwad.sdk.mvp.Presenter
            r0.<init>()
            r2.mPresenter = r0
            com.kwad.components.core.webview.tachikoma.d.b r1 = r2.ahp
            com.kwad.components.core.webview.tachikoma.k r1 = r1.ahs
            if (r1 == 0) goto L15
            com.kwad.components.core.webview.tachikoma.d.d r1 = r2.vG()
            r0.a(r1)
            goto L1c
        L15:
            com.kwad.components.core.webview.tachikoma.d.c r1 = r2.kv()
            r0.a(r1)
        L1c:
            com.kwad.sdk.mvp.Presenter r0 = r2.mPresenter
            return r0
    }

    private static boolean d(android.app.Activity r2) {
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            android.view.Window r2 = r2.getWindow()
            android.view.WindowManager$LayoutParams r2 = r2.getAttributes()
            int r2 = r2.flags
            r1 = 1024(0x400, float:1.435E-42)
            r2 = r2 & r1
            if (r2 != r1) goto L15
            r2 = 1
            return r2
        L15:
            return r0
    }

    private com.kwad.components.core.webview.tachikoma.d.d vG() {
            r1 = this;
            com.kwad.components.core.webview.tachikoma.d.d r0 = r1.ahA
            if (r0 != 0) goto Lb
            com.kwad.components.core.webview.tachikoma.d.d r0 = new com.kwad.components.core.webview.tachikoma.d.d
            r0.<init>()
            r1.ahA = r0
        Lb:
            com.kwad.components.core.webview.tachikoma.d.d r0 = r1.ahA
            return r0
    }

    @Override // com.kwad.components.core.proxy.j
    public final android.view.View a(android.view.LayoutInflater r3, @androidx.annotation.Nullable android.view.ViewGroup r4) {
            r2 = this;
            com.kwad.sdk.widget.KSFrameLayout r0 = r2.ahB
            if (r0 != 0) goto Lf
            int r0 = com.kwad.sdk.R.layout.ksad_video_tk_dialog_layout
            r1 = 0
            android.view.View r3 = r3.inflate(r0, r4, r1)
            com.kwad.sdk.widget.KSFrameLayout r3 = (com.kwad.sdk.widget.KSFrameLayout) r3
            r2.ahB = r3
        Lf:
            com.kwad.sdk.widget.KSFrameLayout r3 = r2.ahB
            return r3
    }

    public final void a(com.kwad.components.core.webview.tachikoma.f.e r1) {
            r0 = this;
            r0.ahx = r1
            return
    }

    public final void d(android.content.DialogInterface.OnDismissListener r2) {
            r1 = this;
            if (r2 == 0) goto L7
            java.util.List<android.content.DialogInterface$OnDismissListener> r0 = r1.ahC
            r0.add(r2)
        L7:
            return
    }

    public final void e(android.content.DialogInterface.OnDismissListener r2) {
            r1 = this;
            java.util.List<android.content.DialogInterface$OnDismissListener> r0 = r1.ahC
            r0.remove(r2)
            return
    }

    protected com.kwad.components.core.webview.tachikoma.d.b ku() {
            r1 = this;
            com.kwad.components.core.webview.tachikoma.d.b r0 = new com.kwad.components.core.webview.tachikoma.d.b
            r0.<init>()
            return r0
    }

    protected com.kwad.components.core.webview.tachikoma.d.c kv() {
            r1 = this;
            com.kwad.components.core.webview.tachikoma.d.c r0 = new com.kwad.components.core.webview.tachikoma.d.c
            r0.<init>()
            return r0
    }

    protected void kw() {
            r2 = this;
            com.kwad.components.core.webview.tachikoma.d.b r0 = r2.ahp
            com.kwad.sdk.core.response.model.AdResultData r1 = r2.mAdResultData
            r0.a(r1)
            com.kwad.components.core.webview.tachikoma.d.b r0 = r2.ahp
            android.app.Activity r1 = r2.getActivity()
            r0.mActivity = r1
            com.kwad.components.core.webview.tachikoma.d.b r0 = r2.ahp
            r0.afi = r2
            com.kwad.sdk.widget.KSFrameLayout r1 = r2.ahB
            r0.ahq = r1
            java.lang.String r1 = r2.AI
            r0.AI = r1
            com.kwad.components.offline.api.tk.model.StyleTemplate r1 = r2.Yf
            r0.Yf = r1
            boolean r1 = r2.aht
            r0.aht = r1
            com.kwad.sdk.components.l r1 = r2.ahr
            r0.ahr = r1
            com.kwad.components.core.webview.tachikoma.k r1 = r2.ahs
            r0.ahs = r1
            com.kwad.components.core.webview.tachikoma.d.e$a r1 = r2.ahu
            r0.ahu = r1
            com.kwad.components.core.webview.tachikoma.f.c r1 = r2.Yd
            r0.Yd = r1
            return
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onActivityCreated(@androidx.annotation.Nullable android.os.Bundle r5) {
            r4 = this;
            super.onActivityCreated(r5)     // Catch: java.lang.Throwable -> L4
            goto L5
        L4:
        L5:
            android.app.Dialog r5 = r4.getDialog()
            if (r5 != 0) goto Lc
            goto L16
        Lc:
            android.app.Dialog r5 = r4.getDialog()
            android.view.Window r5 = r5.getWindow()
            if (r5 != 0) goto L17
        L16:
            return
        L17:
            android.view.WindowManager$LayoutParams r0 = r5.getAttributes()
            r1 = 0
            r0.dimAmount = r1
            r1 = -1
            r0.width = r1
            r0.height = r1
            r5.setAttributes(r0)
            android.app.Dialog r0 = r4.getDialog()
            r2 = 0
            r0.setCanceledOnTouchOutside(r2)
            android.view.View r0 = r5.getDecorView()
            r0.setPadding(r2, r2, r2, r2)
            r5.setLayout(r1, r1)
            android.app.Dialog r0 = r4.getDialog()
            android.view.Window r0 = r0.getWindow()
            android.graphics.drawable.ColorDrawable r1 = new android.graphics.drawable.ColorDrawable
            r1.<init>(r2)
            r0.setBackgroundDrawable(r1)
            r0 = 16
            r5.setSoftInputMode(r0)
            android.app.Dialog r0 = r4.getDialog()
            android.app.Activity r0 = r0.getOwnerActivity()
            boolean r0 = d(r0)
            if (r0 == 0) goto L60
            r0 = 1024(0x400, float:1.435E-42)
            r5.setFlags(r0, r0)
        L60:
            com.kwad.sdk.components.l r5 = r4.ahr     // Catch: java.lang.Throwable -> L91
            boolean r5 = r5.isHideNavigationBar()     // Catch: java.lang.Throwable -> L91
            if (r5 == 0) goto Laa
            android.content.Context r5 = r4.getContext()     // Catch: java.lang.Throwable -> L91
            if (r5 == 0) goto L93
            android.content.Context r5 = r4.getContext()     // Catch: java.lang.Throwable -> L91
            android.content.res.Resources r5 = r5.getResources()     // Catch: java.lang.Throwable -> L91
            if (r5 == 0) goto L93
            java.lang.String r0 = "navigation_bar_height"
            java.lang.String r1 = "dimen"
            java.lang.String r3 = "android"
            int r5 = r5.getIdentifier(r0, r1, r3)     // Catch: java.lang.Throwable -> L91
            if (r5 <= 0) goto L93
            android.content.Context r0 = r4.getContext()     // Catch: java.lang.Throwable -> L91
            android.content.res.Resources r0 = r0.getResources()     // Catch: java.lang.Throwable -> L91
            int r2 = r0.getDimensionPixelSize(r5)     // Catch: java.lang.Throwable -> L91
            goto L93
        L91:
            r5 = move-exception
            goto La7
        L93:
            if (r2 <= 0) goto Laa
            android.app.Dialog r5 = r4.getDialog()     // Catch: java.lang.Throwable -> L91
            android.view.Window r5 = r5.getWindow()     // Catch: java.lang.Throwable -> L91
            android.view.View r5 = r5.getDecorView()     // Catch: java.lang.Throwable -> L91
            r0 = 5382(0x1506, float:7.542E-42)
            r5.setSystemUiVisibility(r0)     // Catch: java.lang.Throwable -> L91
            goto Laa
        La7:
            com.kwad.sdk.core.d.c.printStackTraceOnly(r5)
        Laa:
            android.app.Dialog r5 = r4.getDialog()
            com.kwad.components.core.webview.tachikoma.d.e$1 r0 = new com.kwad.components.core.webview.tachikoma.d.e$1
            r0.<init>(r4)
            r5.setOnKeyListener(r0)
            return
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onCreate(android.os.Bundle r2) {
            r1 = this;
            super.onCreate(r2)
            android.os.Bundle r2 = r1.getArguments()
            java.lang.String r0 = "templateId"
            java.lang.String r2 = r2.getString(r0)
            r1.AI = r2
            return
    }

    @Override // android.app.Fragment
    public void onDestroy() {
            r2 = this;
            super.onDestroy()
            com.kwad.sdk.mvp.Presenter r0 = r2.mPresenter
            r1 = 0
            if (r0 == 0) goto Ld
            r0.destroy()
            r2.mPresenter = r1
        Ld:
            com.kwad.components.core.webview.tachikoma.d.b r0 = r2.ahp
            if (r0 == 0) goto L16
            r0.release()
            r2.ahp = r1
        L16:
            return
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onDestroyView() {
            r3 = this;
            super.onDestroyView()     // Catch: java.lang.Throwable -> L4
            goto L18
        L4:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "destroy view failed:"
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "TkDialogFragment"
            com.kwad.sdk.core.d.c.e(r1, r0)
        L18:
            com.kwad.sdk.widget.KSFrameLayout r0 = r3.ahB
            if (r0 == 0) goto L34
            android.view.ViewParent r0 = r0.getParent()
            boolean r0 = r0 instanceof android.view.ViewGroup
            if (r0 == 0) goto L34
            com.kwad.sdk.widget.KSFrameLayout r0 = r3.ahB
            android.view.ViewParent r0 = r0.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            com.kwad.sdk.widget.KSFrameLayout r1 = r3.ahB
            r0.removeView(r1)
            r0 = 0
            r3.ahB = r0
        L34:
            com.kwad.components.core.webview.tachikoma.f.e r0 = r3.ahx
            if (r0 == 0) goto L3b
            r0.hi()
        L3b:
            return
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface r3) {
            r2 = this;
            super.onDismiss(r3)
            com.kwad.components.core.webview.tachikoma.f.c r0 = r2.Yd
            if (r0 == 0) goto La
            r0.hi()
        La:
            java.util.List<android.content.DialogInterface$OnDismissListener> r0 = r2.ahC
            java.util.Iterator r0 = r0.iterator()
        L10:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L22
            java.lang.Object r1 = r0.next()
            android.content.DialogInterface$OnDismissListener r1 = (android.content.DialogInterface.OnDismissListener) r1
            if (r1 == 0) goto L10
            r1.onDismiss(r3)
            goto L10
        L22:
            com.kwad.sdk.components.l r3 = r2.ahr
            if (r3 == 0) goto L29
            r3.callbackDialogDismiss()
        L29:
            return
    }

    @Override // android.app.Fragment
    public void onViewCreated(@androidx.annotation.NonNull android.view.View r1, @androidx.annotation.Nullable android.os.Bundle r2) {
            r0 = this;
            super.onViewCreated(r1, r2)
            r0.D(r1)
            com.kwad.components.core.webview.tachikoma.f.c r1 = r0.Yd
            if (r1 == 0) goto Ld
            r1.ha()
        Ld:
            com.kwad.components.core.webview.tachikoma.f.e r1 = r0.ahx
            if (r1 == 0) goto L14
            r1.ha()
        L14:
            return
    }
}
