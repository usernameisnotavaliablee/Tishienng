package com.bytedance.msdk.core.views;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class RefreshableBannerView extends android.widget.FrameLayout {
    private boolean cw;
    private boolean j;

    /* renamed from: m, reason: collision with root package name */
    private com.bytedance.msdk.core.views.RefreshableBannerView.j f2281m;

    /* renamed from: r, reason: collision with root package name */
    private final android.graphics.Rect f2282r;
    private final android.view.ViewTreeObserver.OnScrollChangedListener up;
    private boolean xt;



    public interface j {
        void j(boolean r1);
    }

    public RefreshableBannerView(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 1
            r0.j = r1
            r0.xt = r1
            r0.cw = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.f2282r = r1
            com.bytedance.msdk.core.views.RefreshableBannerView$1 r1 = new com.bytedance.msdk.core.views.RefreshableBannerView$1
            r1.<init>(r0)
            r0.up = r1
            return
    }

    static /* synthetic */ android.graphics.Rect j(com.bytedance.msdk.core.views.RefreshableBannerView r0) {
            android.graphics.Rect r0 = r0.f2282r
            return r0
    }

    private void j(boolean r4) {
            r3 = this;
            boolean r0 = r3.j
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Lc
            boolean r0 = r3.xt
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            if (r4 == 0) goto L1f
            if (r0 == 0) goto L2e
            boolean r4 = r3.cw
            if (r4 != 0) goto L2e
            r3.cw = r2
            com.bytedance.msdk.core.views.RefreshableBannerView$j r4 = r3.f2281m
            if (r4 == 0) goto L2e
            r4.j(r2)
            return
        L1f:
            if (r0 != 0) goto L2e
            boolean r4 = r3.cw
            if (r4 == 0) goto L2e
            r3.cw = r1
            com.bytedance.msdk.core.views.RefreshableBannerView$j r4 = r3.f2281m
            if (r4 == 0) goto L2e
            r4.j(r1)
        L2e:
            return
    }

    static /* synthetic */ boolean j(com.bytedance.msdk.core.views.RefreshableBannerView r0, boolean r1) {
            r0.xt = r1
            return r1
    }

    static /* synthetic */ void xt(com.bytedance.msdk.core.views.RefreshableBannerView r0, boolean r1) {
            r0.j(r1)
            return
    }

    static /* synthetic */ boolean xt(com.bytedance.msdk.core.views.RefreshableBannerView r0) {
            boolean r0 = r0.xt
            return r0
    }

    @androidx.annotation.UiThread
    public void j(android.view.View r7) {
            r6 = this;
            int r0 = r6.getWidth()
            float r0 = (float) r0
            r7.setTranslationX(r0)
            r6.addView(r7)
            r0 = 1
            float[] r1 = new float[r0]
            r2 = 0
            r3 = 0
            r1[r2] = r3
            java.lang.String r3 = "translationX"
            android.animation.ObjectAnimator r7 = android.animation.ObjectAnimator.ofFloat(r7, r3, r1)
            r4 = 250(0xfa, double:1.235E-321)
            android.animation.ObjectAnimator r7 = r7.setDuration(r4)
            r7.start()
            int r7 = r6.getChildCount()
            if (r7 <= r0) goto L48
            int r7 = r6.getWidth()
            int r7 = -r7
            float r7 = (float) r7
            float[] r0 = new float[r0]
            r0[r2] = r7
            android.view.View r7 = r6.getChildAt(r2)
            android.animation.ObjectAnimator r7 = android.animation.ObjectAnimator.ofFloat(r7, r3, r0)
            android.animation.ObjectAnimator r7 = r7.setDuration(r4)
            com.bytedance.msdk.core.views.RefreshableBannerView$2 r0 = new com.bytedance.msdk.core.views.RefreshableBannerView$2
            r0.<init>(r6)
            r7.addListener(r0)
            r7.start()
        L48:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
            r2 = this;
            super.onAttachedToWindow()
            android.view.ViewTreeObserver r0 = r2.getViewTreeObserver()
            android.view.ViewTreeObserver$OnScrollChangedListener r1 = r2.up
            r0.addOnScrollChangedListener(r1)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
            r2 = this;
            super.onDetachedFromWindow()
            android.view.ViewTreeObserver r0 = r2.getViewTreeObserver()
            android.view.ViewTreeObserver$OnScrollChangedListener r1 = r2.up
            r0.removeOnScrollChangedListener(r1)
            return
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int r1) {
            r0 = this;
            super.onWindowVisibilityChanged(r1)
            if (r1 != 0) goto L7
            r1 = 1
            goto L8
        L7:
            r1 = 0
        L8:
            r0.j = r1
            r0.j(r1)
            return
    }

    public void setVisibilityChangeListener(com.bytedance.msdk.core.views.RefreshableBannerView.j r1) {
            r0 = this;
            r0.f2281m = r1
            return
    }
}
