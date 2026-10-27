package com.kwad.components.core.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@android.annotation.SuppressLint({"ViewConstructor"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class a extends com.kwad.sdk.widget.KSFrameLayout implements com.kwad.sdk.utils.ca.a {
    private com.kwad.components.core.widget.a.InterfaceC0104a ahX;
    private boolean ahY;
    private boolean ahZ;
    private int aia;
    private boolean aib;
    private long aic;
    private boolean aid;
    private final float aie;
    private final int aif;
    private final android.view.View bP;
    private final com.kwad.sdk.utils.ca bQ;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.kwad.components.core.widget.a$a, reason: collision with other inner class name */
    public interface InterfaceC0104a {
        void aa();

        void ab();

        void ay();

        void c(android.view.View r1);

        void onWindowFocusChanged(boolean r1);
    }

    public a(android.content.Context r1, android.view.View r2) {
            r0 = this;
            r0.<init>(r1, r2)
            com.kwad.sdk.utils.ca r1 = new com.kwad.sdk.utils.ca
            r1.<init>(r0)
            r0.bQ = r1
            r1 = 5
            r0.aia = r1
            r0.bP = r2
            android.view.ViewGroup$LayoutParams r1 = new android.view.ViewGroup$LayoutParams
            r2 = 1
            r1.<init>(r2, r2)
            r0.setLayoutParams(r1)
            float r1 = com.kwad.sdk.core.config.e.FH()
            r0.aie = r1
            r0.setVisiblePercent(r1)
            float r1 = com.kwad.sdk.core.config.e.FJ()
            r2 = 0
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 >= 0) goto L2c
            r1 = 1065353216(0x3f800000, float:1.0)
        L2c:
            r2 = 1148846080(0x447a0000, float:1000.0)
            float r1 = r1 * r2
            int r1 = (int) r1
            r0.aif = r1
            return
    }

    private void vR() {
            r4 = this;
            int r0 = r4.aif
            if (r0 != 0) goto Le
            com.kwad.components.core.widget.a$a r0 = r4.ahX
            if (r0 == 0) goto Le
            android.view.View r1 = r4.bP
            r0.c(r1)
            return
        Le:
            com.kwad.sdk.utils.ca r0 = r4.bQ
            android.os.Message r0 = r0.obtainMessage()
            r1 = 2
            r0.what = r1
            com.kwad.sdk.utils.ca r1 = r4.bQ
            int r2 = r4.aif
            long r2 = (long) r2
            r1.sendMessageDelayed(r0, r2)
            return
    }

    private void vS() {
            r2 = this;
            com.kwad.sdk.utils.ca r0 = r2.bQ
            r1 = 0
            r0.removeCallbacksAndMessages(r1)
            r0 = 0
            r2.ahZ = r0
            return
    }

    private void vT() {
            r2 = this;
            boolean r0 = r2.ahZ
            if (r0 != 0) goto Lc
            r0 = 1
            r2.ahZ = r0
            com.kwad.sdk.utils.ca r1 = r2.bQ
            r1.sendEmptyMessage(r0)
        Lc:
            return
    }

    @Override // com.kwad.sdk.widget.KSFrameLayout, com.kwad.sdk.widget.k
    public final void E(android.view.View r6) {
            r5 = this;
            super.E(r6)
            int r0 = r5.aif
            if (r0 != 0) goto Lf
            com.kwad.components.core.widget.a$a r0 = r5.ahX
            if (r0 == 0) goto Lf
            r0.c(r6)
            return
        Lf:
            boolean r0 = r5.aib
            if (r0 != 0) goto L23
            r6 = 1
            r5.aib = r6
            long r0 = java.lang.System.currentTimeMillis()
            r5.aic = r0
            r5.vS()
            r5.vR()
            return
        L23:
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r5.aic
            long r0 = r0 - r2
            int r2 = r5.aif
            long r2 = (long) r2
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L3b
            com.kwad.components.core.widget.a$a r0 = r5.ahX
            if (r0 == 0) goto L3b
            r0.c(r6)
            r5.vS()
        L3b:
            return
    }

    @Override // com.kwad.sdk.utils.ca.a
    public final void a(android.os.Message r10) {
            r9 = this;
            boolean r0 = r9.ahY
            if (r0 == 0) goto L5
            goto L27
        L5:
            int r10 = r10.what
            r0 = 1120403456(0x42c80000, float:100.0)
            r1 = 0
            r2 = 1
            if (r10 == r2) goto L31
            r3 = 2
            if (r10 == r3) goto L11
            goto L27
        L11:
            android.view.View r10 = r9.bP
            float r3 = r9.aie
            float r3 = r3 * r0
            int r0 = (int) r3
            boolean r10 = com.kwad.sdk.utils.bz.a(r10, r0, r1)
            if (r10 == 0) goto L28
            com.kwad.components.core.widget.a$a r10 = r9.ahX
            if (r10 == 0) goto L27
            android.view.View r0 = r9.bP
            r10.c(r0)
        L27:
            return
        L28:
            r10 = 5
            r9.aia = r10
            com.kwad.sdk.utils.ca r10 = r9.bQ
            r10.sendEmptyMessage(r2)
            return
        L31:
            android.view.View r10 = r9.bP
            float r3 = r9.aie
            float r3 = r3 * r0
            int r0 = (int) r3
            boolean r10 = com.kwad.sdk.utils.bz.a(r10, r0, r1)
            r3 = 500(0x1f4, double:2.47E-321)
            r5 = 100
            if (r10 == 0) goto L6f
            r9.vS()
            boolean r10 = r9.aib
            if (r10 == 0) goto L53
            com.kwad.components.core.widget.a$a r10 = r9.ahX
            if (r10 == 0) goto L5e
            android.view.View r0 = r9.bP
            r10.c(r0)
            goto L5e
        L53:
            r9.aib = r2
            long r7 = java.lang.System.currentTimeMillis()
            r9.aic = r7
            r9.vR()
        L5e:
            r9.aid = r1
            com.kwad.sdk.utils.ca r10 = r9.bQ
            int r0 = r9.aia
            int r1 = r0 + (-1)
            r9.aia = r1
            if (r0 <= 0) goto L6b
            r3 = r5
        L6b:
            r10.sendEmptyMessageDelayed(r2, r3)
            return
        L6f:
            com.kwad.components.core.widget.a$a r10 = r9.ahX
            if (r10 == 0) goto L7a
            boolean r0 = r9.aid
            if (r0 != 0) goto L7a
            r10.ay()
        L7a:
            r9.aid = r2
            com.kwad.sdk.utils.ca r10 = r9.bQ
            int r0 = r9.aia
            int r1 = r0 + (-1)
            r9.aia = r1
            if (r0 <= 0) goto L87
            r3 = r5
        L87:
            r10.sendEmptyMessageDelayed(r2, r3)
            return
    }

    @Override // com.kwad.sdk.widget.KSFrameLayout
    public final void aa() {
            r1 = this;
            super.aa()
            r0 = 5
            r1.aia = r0
            r0 = 0
            r1.ahY = r0
            r1.aib = r0
            r1.vT()
            com.kwad.components.core.widget.a$a r0 = r1.ahX
            if (r0 == 0) goto L15
            r0.aa()
        L15:
            return
    }

    @Override // com.kwad.sdk.widget.KSFrameLayout
    public final void ab() {
            r2 = this;
            super.ab()
            r2.vS()
            r0 = 0
            r2.aia = r0
            r0 = 0
            r2.aic = r0
            r0 = 1
            r2.ahY = r0
            com.kwad.components.core.widget.a$a r0 = r2.ahX
            if (r0 == 0) goto L17
            r0.ab()
        L17:
            return
    }

    @Override // com.kwad.sdk.widget.KSFrameLayout, android.view.View
    public final void onWindowFocusChanged(boolean r3) {
            r2 = this;
            super.onWindowFocusChanged(r3)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "onWindowFocusChanged hasWindowFocus:"
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "AdExposureView"
            com.kwad.sdk.core.d.c.d(r1, r0)
            com.kwad.components.core.widget.a$a r0 = r2.ahX
            if (r0 == 0) goto L1d
            r0.onWindowFocusChanged(r3)
        L1d:
            return
    }

    public final void setViewCallback(com.kwad.components.core.widget.a.InterfaceC0104a r1) {
            r0 = this;
            r0.ahX = r1
            return
    }

    public final void vU() {
            r0 = this;
            r0.vT()
            return
    }
}
