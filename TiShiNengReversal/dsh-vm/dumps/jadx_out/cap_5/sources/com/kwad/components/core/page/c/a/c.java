package com.kwad.components.core.page.c.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class c extends com.kwad.components.core.page.c.a.a {
    private final com.kwad.sdk.core.c.c An;
    private android.widget.LinearLayout TQ;
    private android.widget.TextView TR;
    private android.widget.TextView TS;
    private android.widget.TextView TT;
    private android.widget.TextView TU;
    private int TV;
    private boolean TW;
    private boolean TX;
    private java.lang.Runnable TY;



    public c() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.TW = r0
            r1.TX = r0
            com.kwad.components.core.page.c.a.c$1 r0 = new com.kwad.components.core.page.c.a.c$1
            r0.<init>(r1)
            r1.TY = r0
            com.kwad.components.core.page.c.a.c$2 r0 = new com.kwad.components.core.page.c.a.c$2
            r0.<init>(r1)
            r1.An = r0
            return
    }

    static /* synthetic */ boolean a(com.kwad.components.core.page.c.a.c r0) {
            boolean r0 = r0.TW
            return r0
    }

    static /* synthetic */ boolean a(com.kwad.components.core.page.c.a.c r0, boolean r1) {
            r0.TW = r1
            return r1
    }

    static /* synthetic */ int b(com.kwad.components.core.page.c.a.c r0) {
            int r0 = r0.TV
            return r0
    }

    static /* synthetic */ android.widget.TextView c(com.kwad.components.core.page.c.a.c r0) {
            android.widget.TextView r0 = r0.TR
            return r0
    }

    static /* synthetic */ android.widget.TextView d(com.kwad.components.core.page.c.a.c r0) {
            android.widget.TextView r0 = r0.TS
            return r0
    }

    static /* synthetic */ android.widget.TextView e(com.kwad.components.core.page.c.a.c r0) {
            android.widget.TextView r0 = r0.TT
            return r0
    }

    static /* synthetic */ android.widget.TextView f(com.kwad.components.core.page.c.a.c r0) {
            android.widget.TextView r0 = r0.TU
            return r0
    }

    static /* synthetic */ boolean g(com.kwad.components.core.page.c.a.c r0) {
            boolean r0 = r0.TX
            return r0
    }

    static /* synthetic */ void h(com.kwad.components.core.page.c.a.c r0) {
            r0.rh()
            return
    }

    static /* synthetic */ int i(com.kwad.components.core.page.c.a.c r2) {
            int r0 = r2.TV
            int r1 = r0 + (-1)
            r2.TV = r1
            return r0
    }

    private void rg() {
            r3 = this;
            android.widget.LinearLayout r0 = r3.TQ
            r1 = 0
            r0.setVisibility(r1)
            com.kwad.components.core.page.c.a.b r0 = r3.TJ
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            boolean r0 = r0.mRewardVerifyCalled
            if (r0 == 0) goto L27
            android.widget.TextView r0 = r3.TR
            java.lang.String r1 = "任务已完成"
            r0.setText(r1)
            android.widget.TextView r0 = r3.TS
            r1 = 8
            r0.setVisibility(r1)
            android.widget.TextView r0 = r3.TT
            r0.setVisibility(r1)
            android.widget.TextView r0 = r3.TU
            r0.setVisibility(r1)
            return
        L27:
            r3.rh()
            java.lang.Runnable r0 = r3.TY
            r1 = 1000(0x3e8, double:4.94E-321)
            com.kwad.sdk.utils.bw.runOnUiThreadDelay(r0, r1)
            return
    }

    private void rh() {
            r2 = this;
            android.widget.TextView r0 = r2.TS
            java.lang.String r1 = r2.ri()
            r0.setText(r1)
            android.widget.TextView r0 = r2.TU
            java.lang.String r1 = r2.rj()
            r0.setText(r1)
            return
    }

    private java.lang.String ri() {
            r3 = this;
            int r0 = r3.TV
            int r0 = r0 / 60
            r1 = 10
            if (r0 < r1) goto L15
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
        L15:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "0"
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }

    private java.lang.String rj() {
            r3 = this;
            int r0 = r3.TV
            int r0 = r0 % 60
            r1 = 10
            if (r0 < r1) goto L15
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
        L15:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "0"
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }

    @Override // com.kwad.components.core.page.c.a.a, com.kwad.sdk.mvp.Presenter
    public final void at() {
            r1 = this;
            super.at()
            com.kwad.sdk.core.c.b.Ho()
            com.kwad.sdk.core.c.c r0 = r1.An
            com.kwad.sdk.core.c.b.a(r0)
            int r0 = com.kwad.sdk.core.config.e.FC()
            r1.TV = r0
            r1.rg()
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
            r1 = this;
            super.onCreate()
            int r0 = com.kwad.sdk.R.id.ksad_reward_land_page_open_tip
            android.view.View r0 = r1.findViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r1.TQ = r0
            int r0 = com.kwad.sdk.R.id.ksad_reward_land_page_open_desc
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.TR = r0
            int r0 = com.kwad.sdk.R.id.ksad_reward_land_page_open_minute
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.TS = r0
            int r0 = com.kwad.sdk.R.id.ksad_reward_land_page_open_colon
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.TT = r0
            int r0 = com.kwad.sdk.R.id.ksad_reward_land_page_open_second
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.TU = r0
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
            r1 = this;
            super.onUnbind()
            com.kwad.sdk.core.c.b.Ho()
            com.kwad.sdk.core.c.c r0 = r1.An
            com.kwad.sdk.core.c.b.b(r0)
            java.lang.Runnable r0 = r1.TY
            com.kwad.sdk.utils.bw.c(r0)
            return
    }
}
