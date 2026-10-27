package com.kwad.components.ad.splashscreen.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class SkipView extends android.widget.LinearLayout implements com.kwad.components.ad.splashscreen.widget.b {
    private com.kwad.components.ad.splashscreen.widget.SkipView.a JD;
    private java.lang.Runnable JP;
    private final com.kwad.components.ad.splashscreen.widget.SkipView.b Ls;
    private android.view.View Lt;
    private android.widget.TextView Lu;
    private android.widget.TextView Lv;
    private int Lw;
    private boolean qy;
    private boolean vX;



    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        void am(int r1);

        void me();

        void mf();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class b {
        private int JK;
        private int LA;
        private boolean LB;
        private boolean LC;
        private java.lang.String Ly;
        private java.lang.String Lz;

        private b() {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "跳过"
                r1.Ly = r0
                java.lang.String r0 = ""
                r1.Lz = r0
                r0 = 5
                r1.LA = r0
                r1.JK = r0
                r0 = 1
                r1.LB = r0
                r1.LC = r0
                return
        }

        /* synthetic */ b(byte r1) {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ java.lang.String a(com.kwad.components.ad.splashscreen.widget.SkipView.b r0, java.lang.String r1) {
                r0.Lz = r1
                return r1
        }

        static /* synthetic */ boolean a(com.kwad.components.ad.splashscreen.widget.SkipView.b r0, boolean r1) {
                r0.LB = r1
                return r1
        }

        static /* synthetic */ int b(com.kwad.components.ad.splashscreen.widget.SkipView.b r0) {
                int r0 = r0.LA
                return r0
        }

        static /* synthetic */ java.lang.String b(com.kwad.components.ad.splashscreen.widget.SkipView.b r0, java.lang.String r1) {
                r0.Ly = r1
                return r1
        }

        static /* synthetic */ boolean b(com.kwad.components.ad.splashscreen.widget.SkipView.b r0, boolean r1) {
                r0.LC = r1
                return r1
        }

        static /* synthetic */ int c(com.kwad.components.ad.splashscreen.widget.SkipView.b r0) {
                int r0 = r0.JK
                return r0
        }

        static /* synthetic */ int d(com.kwad.components.ad.splashscreen.widget.SkipView.b r2) {
                int r0 = r2.JK
                int r1 = r0 + (-1)
                r2.JK = r1
                return r0
        }

        static /* synthetic */ java.lang.String e(com.kwad.components.ad.splashscreen.widget.SkipView.b r0) {
                java.lang.String r0 = r0.Ly
                return r0
        }

        static /* synthetic */ boolean f(com.kwad.components.ad.splashscreen.widget.SkipView.b r0) {
                boolean r0 = r0.LB
                return r0
        }

        static /* synthetic */ boolean g(com.kwad.components.ad.splashscreen.widget.SkipView.b r0) {
                boolean r0 = r0.LC
                return r0
        }

        static /* synthetic */ boolean h(com.kwad.components.ad.splashscreen.widget.SkipView.b r0) {
                boolean r0 = r0.nD()
                return r0
        }

        private boolean nD() {
                r1 = this;
                boolean r0 = r1.LB
                if (r0 == 0) goto La
                boolean r0 = r1.LC
                if (r0 == 0) goto La
                r0 = 1
                return r0
            La:
                r0 = 0
                return r0
        }

        public final void ac(java.lang.String r2) {
                r1 = this;
                r0 = -1
                r1.JK = r0
                r1.Lz = r2
                return
        }

        public final void ar(int r1) {
                r0 = this;
                r0.LA = r1
                r0.JK = r1
                return
        }

        public final java.lang.String nB() {
                r2 = this;
                int r0 = r2.JK
                if (r0 >= 0) goto L7
                java.lang.String r0 = r2.Lz
                return r0
            L7:
                if (r0 != 0) goto L1c
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r2.Lz
                r0.append(r1)
                r1 = 1
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
            L1c:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r2.Lz
                r0.append(r1)
                int r1 = r2.JK
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        public final boolean nC() {
                r1 = this;
                int r0 = r1.JK
                if (r0 > 0) goto L6
                r0 = 1
                return r0
            L6:
                r0 = 0
                return r0
        }
    }

    public SkipView(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public SkipView(android.content.Context r2, @androidx.annotation.Nullable android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public SkipView(android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2, int r3) {
            r0 = this;
            android.content.Context r1 = com.kwad.sdk.o.m.wrapContextIfNeed(r1)
            r0.<init>(r1, r2, r3)
            com.kwad.components.ad.splashscreen.widget.SkipView$b r1 = new com.kwad.components.ad.splashscreen.widget.SkipView$b
            r2 = 0
            r1.<init>(r2)
            r0.Ls = r1
            r1 = -1
            r0.Lw = r1
            r0.qy = r2
            r1 = 1
            r0.vX = r1
            com.kwad.components.ad.splashscreen.widget.SkipView$1 r1 = new com.kwad.components.ad.splashscreen.widget.SkipView$1
            r1.<init>(r0)
            r0.JP = r1
            r0.init()
            return
    }

    private void C(com.kwad.sdk.core.response.model.AdInfo r1) {
            r0 = this;
            boolean r1 = com.kwad.sdk.core.response.b.a.cE(r1)
            r0.setTimerBtnVisible(r1)
            return
    }

    private void a(com.kwad.components.ad.splashscreen.widget.SkipView.b r5) {
            r4 = this;
            if (r5 != 0) goto L4
            goto L73
        L4:
            android.widget.TextView r0 = r4.Lu
            r1 = 8
            r2 = 0
            if (r0 == 0) goto L2b
            java.lang.String r0 = com.kwad.components.ad.splashscreen.widget.SkipView.b.e(r5)
            if (r0 == 0) goto L1a
            android.widget.TextView r0 = r4.Lu
            java.lang.String r3 = com.kwad.components.ad.splashscreen.widget.SkipView.b.e(r5)
            r0.setText(r3)
        L1a:
            com.kwad.components.ad.splashscreen.widget.SkipView$b r0 = r4.Ls
            boolean r0 = com.kwad.components.ad.splashscreen.widget.SkipView.b.f(r0)
            if (r0 == 0) goto L24
            r0 = 0
            goto L26
        L24:
            r0 = 8
        L26:
            android.widget.TextView r3 = r4.Lu
            r3.setVisibility(r0)
        L2b:
            java.lang.String r5 = r5.nB()
            android.widget.TextView r0 = r4.Lv
            if (r0 == 0) goto L49
            if (r5 == 0) goto L38
            r0.setText(r5)
        L38:
            com.kwad.components.ad.splashscreen.widget.SkipView$b r5 = r4.Ls
            boolean r5 = com.kwad.components.ad.splashscreen.widget.SkipView.b.g(r5)
            if (r5 == 0) goto L42
            r5 = 0
            goto L44
        L42:
            r5 = 8
        L44:
            android.widget.TextView r0 = r4.Lv
            r0.setVisibility(r5)
        L49:
            android.view.View r5 = r4.Lt
            if (r5 == 0) goto L73
            com.kwad.components.ad.splashscreen.widget.SkipView$b r5 = r4.Ls
            boolean r5 = com.kwad.components.ad.splashscreen.widget.SkipView.b.h(r5)
            if (r5 == 0) goto L56
            r1 = 0
        L56:
            android.view.View r0 = r4.Lt
            r0.setVisibility(r1)
            android.view.ViewGroup$LayoutParams r0 = r4.getLayoutParams()
            if (r0 == 0) goto L73
            if (r5 != 0) goto L6a
            r5 = -2
            r0.width = r5
            r4.invalidate()
            return
        L6a:
            int r5 = r4.Lw
            if (r5 <= 0) goto L73
            r0.width = r5
            r4.invalidate()
        L73:
            return
    }

    static /* synthetic */ void a(com.kwad.components.ad.splashscreen.widget.SkipView r0, int r1) {
            r0.al(r1)
            return
    }

    static /* synthetic */ void a(com.kwad.components.ad.splashscreen.widget.SkipView r0, com.kwad.components.ad.splashscreen.widget.SkipView.b r1) {
            r0.a(r1)
            return
    }

    static /* synthetic */ boolean a(com.kwad.components.ad.splashscreen.widget.SkipView r0) {
            boolean r0 = r0.qy
            return r0
    }

    private void al(int r2) {
            r1 = this;
            com.kwad.components.ad.splashscreen.widget.SkipView$a r0 = r1.JD
            if (r0 == 0) goto L7
            r0.am(r2)
        L7:
            return
    }

    private void au() {
            r1 = this;
            com.kwad.components.ad.splashscreen.widget.SkipView$b r0 = r1.Ls
            r1.a(r0)
            java.lang.Runnable r0 = r1.JP
            r1.post(r0)
            return
    }

    static /* synthetic */ com.kwad.components.ad.splashscreen.widget.SkipView.b b(com.kwad.components.ad.splashscreen.widget.SkipView r0) {
            com.kwad.components.ad.splashscreen.widget.SkipView$b r0 = r0.Ls
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.splashscreen.widget.SkipView.a c(com.kwad.components.ad.splashscreen.widget.SkipView r0) {
            com.kwad.components.ad.splashscreen.widget.SkipView$a r0 = r0.JD
            return r0
    }

    private void fP() {
            r1 = this;
            r0 = 1
            r1.qy = r0
            return
    }

    private void fQ() {
            r1 = this;
            r0 = 0
            r1.qy = r0
            return
    }

    private void init() {
            r2 = this;
            r0 = 0
            r2.setOrientation(r0)
            android.content.Context r0 = r2.getContext()
            int r1 = com.kwad.sdk.R.layout.ksad_skip_view
            com.kwad.sdk.o.m.inflate(r0, r1, r2)
            int r0 = com.kwad.sdk.R.id.ksad_skip_view_skip
            android.view.View r0 = r2.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.Lu = r0
            int r0 = com.kwad.sdk.R.id.ksad_skip_view_timer
            android.view.View r0 = r2.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.Lv = r0
            int r0 = com.kwad.sdk.R.id.ksad_skip_view_divider
            android.view.View r0 = r2.findViewById(r0)
            r2.Lt = r0
            com.kwad.components.ad.splashscreen.widget.SkipView$2 r0 = new com.kwad.components.ad.splashscreen.widget.SkipView$2
            r0.<init>(r2)
            r2.setOnClickListener(r0)
            r0 = 1
            r2.setSkipBtnVisible(r0)
            r2.setTimerBtnVisible(r0)
            return
    }

    private void nA() {
            r3 = this;
            int r0 = r3.getVisibility()
            if (r0 != 0) goto L7
            return
        L7:
            r0 = 0
            r3.setVisibility(r0)
            r0 = 0
            r3.setAlpha(r0)
            android.view.ViewPropertyAnimator r0 = r3.animate()
            r1 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r0 = r0.alpha(r1)
            r1 = 500(0x1f4, double:2.47E-321)
            android.view.ViewPropertyAnimator r0 = r0.setDuration(r1)
            r0.start()
            return
    }

    @Override // com.kwad.components.ad.splashscreen.widget.b
    public final void A(com.kwad.sdk.core.response.model.AdInfo r1) {
            r0 = this;
            boolean r1 = com.kwad.sdk.core.response.b.a.bc(r1)
            if (r1 != 0) goto L9
            r0.fP()
        L9:
            return
    }

    @Override // com.kwad.components.ad.splashscreen.widget.b
    public final void B(com.kwad.sdk.core.response.model.AdInfo r2) {
            r1 = this;
            boolean r0 = r1.vX
            if (r0 == 0) goto L7
            r1.nA()
        L7:
            boolean r2 = com.kwad.sdk.core.response.b.a.bc(r2)
            if (r2 != 0) goto L10
            r1.fQ()
        L10:
            return
    }

    @Override // com.kwad.components.ad.splashscreen.widget.b
    public final void a(com.kwad.components.ad.splashscreen.local.SplashSkipViewModel r2, com.kwad.sdk.core.response.model.AdInfo r3) {
            r1 = this;
            boolean r0 = com.kwad.sdk.core.response.b.a.cD(r3)
            r1.vX = r0
            com.kwad.sdk.core.config.item.r r0 = com.kwad.components.ad.splashscreen.b.a.FN
            java.lang.String r0 = com.kwad.sdk.core.config.e.a(r0)
            r1.setTimerPrefixText(r0)
            int r2 = r2.skipSecond
            r1.setTimerSecond(r2)
            boolean r2 = com.kwad.sdk.core.response.b.a.bc(r3)
            if (r2 != 0) goto L1d
            r1.au()
        L1d:
            java.lang.String r2 = com.kwad.sdk.core.response.b.a.cs(r3)
            r1.setSkipText(r2)
            r2 = 8
            r1.setVisibility(r2)
            r1.C(r3)
            return
    }

    public final void ac(java.lang.String r2) {
            r1 = this;
            if (r2 != 0) goto L3
            return
        L3:
            com.kwad.components.ad.splashscreen.widget.SkipView$b r0 = r1.Ls
            r0.ac(r2)
            com.kwad.components.ad.splashscreen.widget.SkipView$b r2 = r1.Ls
            r1.a(r2)
            return
    }

    @Override // com.kwad.components.ad.splashscreen.widget.b
    public final int ao(int r3) {
            r2 = this;
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            android.content.Context r0 = r2.getContext()
            r1 = 1108082688(0x420c0000, float:35.0)
            int r0 = com.kwad.sdk.c.a.a.a(r0, r1)
            r3.height = r0
            int r0 = r2.getWidth()
            r2.setLayoutParams(r3)
            return r0
    }

    @Override // com.kwad.components.ad.splashscreen.widget.b
    public final void cq() {
            r2 = this;
            android.os.Handler r0 = r2.getHandler()
            if (r0 == 0) goto Le
            android.os.Handler r0 = r2.getHandler()
            r1 = 0
            r0.removeCallbacksAndMessages(r1)
        Le:
            return
    }

    @Override // android.view.View
    public void setLayoutParams(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            super.setLayoutParams(r1)
            int r1 = r1.width
            r0.Lw = r1
            return
    }

    @Override // com.kwad.components.ad.splashscreen.widget.b
    public void setOnViewListener(com.kwad.components.ad.splashscreen.widget.SkipView.a r1) {
            r0 = this;
            r0.JD = r1
            return
    }

    public void setSkipBtnVisible(boolean r2) {
            r1 = this;
            com.kwad.components.ad.splashscreen.widget.SkipView$b r0 = r1.Ls
            com.kwad.components.ad.splashscreen.widget.SkipView.b.a(r0, r2)
            com.kwad.components.ad.splashscreen.widget.SkipView$b r2 = r1.Ls
            r1.a(r2)
            return
    }

    public void setSkipText(java.lang.String r2) {
            r1 = this;
            com.kwad.components.ad.splashscreen.widget.SkipView$b r0 = r1.Ls
            com.kwad.components.ad.splashscreen.widget.SkipView.b.b(r0, r2)
            com.kwad.components.ad.splashscreen.widget.SkipView$b r2 = r1.Ls
            r1.a(r2)
            return
    }

    public void setTimerBtnVisible(boolean r2) {
            r1 = this;
            com.kwad.components.ad.splashscreen.widget.SkipView$b r0 = r1.Ls
            com.kwad.components.ad.splashscreen.widget.SkipView.b.b(r0, r2)
            com.kwad.components.ad.splashscreen.widget.SkipView$b r2 = r1.Ls
            r1.a(r2)
            return
    }

    public void setTimerPrefixText(java.lang.String r2) {
            r1 = this;
            com.kwad.components.ad.splashscreen.widget.SkipView$b r0 = r1.Ls
            com.kwad.components.ad.splashscreen.widget.SkipView.b.a(r0, r2)
            com.kwad.components.ad.splashscreen.widget.SkipView$b r2 = r1.Ls
            r1.a(r2)
            return
    }

    public void setTimerSecond(int r2) {
            r1 = this;
            com.kwad.components.ad.splashscreen.widget.SkipView$b r0 = r1.Ls
            r0.ar(r2)
            com.kwad.components.ad.splashscreen.widget.SkipView$b r2 = r1.Ls
            r1.a(r2)
            return
    }
}
