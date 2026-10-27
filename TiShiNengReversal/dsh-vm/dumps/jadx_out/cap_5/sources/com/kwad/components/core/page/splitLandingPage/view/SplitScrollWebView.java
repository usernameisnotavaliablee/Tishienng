package com.kwad.components.core.page.splitLandingPage.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class SplitScrollWebView extends com.kwad.sdk.core.webview.KsAdWebView {
    private int UZ;
    private boolean VA;
    private boolean Vx;
    private com.kwad.components.core.page.splitLandingPage.view.SplitScrollWebView.a Vy;
    private float Vz;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        void f(float r1);

        boolean rL();
    }

    public SplitScrollWebView(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0.Vx = r1
            r0.rF()
            return
    }

    public SplitScrollWebView(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 0
            r0.Vx = r1
            r0.rF()
            return
    }

    public SplitScrollWebView(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r1 = 0
            r0.Vx = r1
            r0.rF()
            return
    }

    private void rF() {
            r1 = this;
            r0 = 0
            r1.UZ = r0
            return
    }

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    protected void onMeasure(int r2, int r3) {
            r1 = this;
            int r0 = r1.UZ
            if (r0 == 0) goto L39
            boolean r3 = com.kwad.components.core.t.d.tc()
            if (r3 == 0) goto L13
            android.content.Context r3 = r1.getContext()
            int r3 = com.kwad.sdk.c.a.a.getStatusBarHeight(r3)
            goto L14
        L13:
            r3 = 0
        L14:
            android.content.Context r0 = r1.getContext()
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L27
            android.content.Context r0 = r1.getContext()
            android.app.Activity r0 = (android.app.Activity) r0
            int r0 = com.kwad.sdk.c.a.a.g(r0)
            goto L2f
        L27:
            android.content.Context r0 = r1.getContext()
            int r0 = com.kwad.sdk.c.a.a.getScreenHeight(r0)
        L2f:
            int r0 = r0 - r3
            int r3 = r1.UZ
            int r0 = r0 - r3
            r3 = 1073741824(0x40000000, float:2.0)
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
        L39:
            super.onMeasure(r2, r3)
            return
    }

    @Override // com.kwad.sdk.core.webview.KsAdWebView, android.webkit.WebView, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r6) {
            r5 = this;
            android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r6)
            boolean r1 = r5.Vx
            if (r1 == 0) goto Ld
            boolean r6 = super.onTouchEvent(r0)
            return r6
        Ld:
            int r1 = androidx.core.view.MotionEventCompat.getActionMasked(r6)
            float r2 = r6.getY()
            r3 = 0
            if (r1 == 0) goto L51
            r6 = 1
            if (r1 == r6) goto L38
            r4 = 2
            if (r1 == r4) goto L22
            r0 = 3
            if (r1 == r0) goto L38
            goto L50
        L22:
            float r1 = r5.Vz
            float r3 = r1 - r2
            com.kwad.components.core.page.splitLandingPage.view.SplitScrollWebView$a r4 = r5.Vy
            if (r4 == 0) goto L33
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 > 0) goto L33
            r5.VA = r6
            r4.f(r3)
        L33:
            boolean r6 = super.onTouchEvent(r0)
            return r6
        L38:
            com.kwad.components.core.page.splitLandingPage.view.SplitScrollWebView$a r0 = r5.Vy
            if (r0 == 0) goto L50
            float r1 = r5.Vz
            float r1 = r1 - r2
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 >= 0) goto L48
            boolean r1 = r5.VA
            if (r1 == 0) goto L50
        L48:
            boolean r0 = r0.rL()
            if (r0 == 0) goto L50
            r5.Vx = r6
        L50:
            return r3
        L51:
            r5.Vz = r2
            r5.VA = r3
            boolean r6 = super.onTouchEvent(r6)
            return r6
    }

    public void setDisableAnimation(boolean r1) {
            r0 = this;
            r0.Vx = r1
            return
    }

    public void setSplitScrollWebViewListener(com.kwad.components.core.page.splitLandingPage.view.SplitScrollWebView.a r1) {
            r0 = this;
            r0.Vy = r1
            return
    }
}
