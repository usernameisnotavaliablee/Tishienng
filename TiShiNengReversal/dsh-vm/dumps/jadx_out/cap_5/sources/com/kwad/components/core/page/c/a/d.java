package com.kwad.components.core.page.c.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class d extends com.kwad.components.core.page.c.a.a {
    private android.view.View Ua;
    private android.widget.TextView Ub;
    private int Uc;
    private java.lang.Runnable Ud;


    public d() {
            r1 = this;
            r1.<init>()
            com.kwad.components.core.page.c.a.d$1 r0 = new com.kwad.components.core.page.c.a.d$1
            r0.<init>(r1)
            r1.Ud = r0
            return
    }

    static /* synthetic */ int a(com.kwad.components.core.page.c.a.d r0) {
            int r0 = r0.Uc
            return r0
    }

    static /* synthetic */ android.widget.TextView b(com.kwad.components.core.page.c.a.d r0) {
            android.widget.TextView r0 = r0.Ub
            return r0
    }

    static /* synthetic */ int c(com.kwad.components.core.page.c.a.d r2) {
            int r0 = r2.Uc
            int r1 = r0 + (-1)
            r2.Uc = r1
            return r0
    }

    static /* synthetic */ android.view.View d(com.kwad.components.core.page.c.a.d r0) {
            android.view.View r0 = r0.Ua
            return r0
    }

    private void rk() {
            r4 = this;
            android.view.View r0 = r4.Ua
            if (r0 == 0) goto L2a
            android.widget.TextView r0 = r4.Ub
            if (r0 != 0) goto L9
            goto L2a
        L9:
            int r1 = r4.Uc
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r1
            java.lang.String r1 = "倒计时%d秒"
            java.lang.String r1 = java.lang.String.format(r1, r2)
            r0.setText(r1)
            android.view.View r0 = r4.Ua
            r0.setVisibility(r3)
            java.lang.Runnable r0 = r4.Ud
            r1 = 1000(0x3e8, double:4.94E-321)
            com.kwad.sdk.utils.bw.runOnUiThreadDelay(r0, r1)
        L2a:
            return
    }

    @Override // com.kwad.components.core.page.c.a.a, com.kwad.sdk.mvp.Presenter
    public final void at() {
            r2 = this;
            super.at()
            com.kwad.components.core.page.c.a.b r0 = r2.TJ
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            int r0 = com.kwad.sdk.core.response.b.a.aM(r0)
            r2.Uc = r0
            com.kwad.components.core.r.a r0 = com.kwad.components.core.r.a.sF()
            int r1 = r2.Uc
            r0.aY(r1)
            r2.rk()
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
            r1 = this;
            super.onCreate()
            int r0 = com.kwad.sdk.R.id.ksad_web_reward_task_layout
            android.view.View r0 = r1.findViewById(r0)
            r1.Ua = r0
            int r0 = com.kwad.sdk.R.id.ksad_web_reward_task_text
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.Ub = r0
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
            r1 = this;
            super.onUnbind()
            java.lang.Runnable r0 = r1.Ud
            com.kwad.sdk.utils.bw.c(r0)
            return
    }
}
