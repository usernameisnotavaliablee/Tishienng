package com.kwad.components.core.video;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class DetailVideoView extends com.kwad.sdk.widget.KSFrameLayout implements android.view.View.OnClickListener {
    public com.kwad.components.core.page.widget.b aal;
    private com.kwad.components.core.video.b aam;
    private android.graphics.SurfaceTexture aan;
    private android.widget.TextView aao;
    public android.view.Surface aap;
    private com.kwad.components.core.video.DetailVideoView.a aaq;
    private com.kwad.sdk.core.response.model.PhotoInfo.VideoInfo aar;
    private boolean aas;
    private final android.graphics.RectF aat;
    private int aau;
    private int aav;

    @androidx.annotation.NonNull
    private final com.kwad.components.core.video.d aaw;
    private android.graphics.Matrix mMatrix;



    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        void onClickRootView();

        void onClickVideoView();
    }

    public DetailVideoView(android.content.Context r3) {
            r2 = this;
            r2.<init>(r3)
            r0 = 0
            r2.aas = r0
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r2.aat = r1
            r2.aau = r0
            r2.aav = r0
            com.kwad.components.core.video.d r0 = new com.kwad.components.core.video.d
            r0.<init>()
            r2.aaw = r0
            r2.B(r3)
            return
    }

    public DetailVideoView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r1.<init>(r2, r3)
            r3 = 0
            r1.aas = r3
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r1.aat = r0
            r1.aau = r3
            r1.aav = r3
            com.kwad.components.core.video.d r3 = new com.kwad.components.core.video.d
            r3.<init>()
            r1.aaw = r3
            r1.B(r2)
            return
    }

    private void B(android.content.Context r3) {
            r2 = this;
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r2.mMatrix = r0
            com.kwad.components.core.page.widget.b r0 = new com.kwad.components.core.page.widget.b
            r0.<init>(r3)
            r2.aal = r0
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r0 = -1
            r1 = 17
            r3.<init>(r0, r0, r1)
            com.kwad.components.core.page.widget.b r0 = r2.aal
            r1 = 0
            r2.addView(r0, r1, r3)
            r2.tH()
            return
    }

    static /* synthetic */ android.graphics.SurfaceTexture a(com.kwad.components.core.video.DetailVideoView r0, android.graphics.SurfaceTexture r1) {
            r0.aan = r1
            return r1
    }

    private void a(android.view.View r4, long r5, long r7) {
            r3 = this;
            if (r4 == 0) goto L48
            r0 = 0
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 == 0) goto L48
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 != 0) goto Ld
            goto L48
        Ld:
            android.view.ViewParent r0 = r4.getParent()
            android.view.View r0 = (android.view.View) r0
            if (r0 != 0) goto L16
            goto L48
        L16:
            int r1 = r0.getWidth()
            int r0 = r0.getHeight()
            if (r1 == 0) goto L48
            if (r0 != 0) goto L23
            goto L48
        L23:
            r4.getLayoutParams()
            float r5 = (float) r5
            float r6 = (float) r7
            float r5 = r5 / r6
            float r6 = (float) r0
            float r6 = r6 * r5
            float r7 = (float) r1
            int r8 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r8 <= 0) goto L34
            float r7 = r7 / r5
            int r0 = (int) r7
            goto L35
        L34:
            int r1 = (int) r6
        L35:
            if (r1 == 0) goto L39
            if (r0 != 0) goto L3b
        L39:
            r0 = -1
            r1 = -1
        L3b:
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            r4.width = r1
            r4.height = r0
            com.kwad.components.core.page.widget.b r5 = r3.aal
            r5.setLayoutParams(r4)
        L48:
            return
    }

    static /* synthetic */ android.graphics.SurfaceTexture c(com.kwad.components.core.video.DetailVideoView r0) {
            android.graphics.SurfaceTexture r0 = r0.aan
            return r0
    }

    static /* synthetic */ void d(com.kwad.components.core.video.DetailVideoView r0) {
            r0.tI()
            return
    }

    static /* synthetic */ com.kwad.components.core.video.b e(com.kwad.components.core.video.DetailVideoView r0) {
            com.kwad.components.core.video.b r0 = r0.aam
            return r0
    }

    private void tH() {
            r2 = this;
            boolean r0 = r2.aas
            if (r0 == 0) goto Lc
            com.kwad.components.core.page.widget.b r0 = r2.aal
            if (r0 == 0) goto Lc
            r1 = 0
            r0.setOpaque(r1)
        Lc:
            com.kwad.components.core.page.widget.b r0 = r2.aal
            com.kwad.components.core.video.DetailVideoView$1 r1 = new com.kwad.components.core.video.DetailVideoView$1
            r1.<init>(r2)
            r0.setSurfaceTextureListener(r1)
            return
    }

    private void tI() {
            r1 = this;
            android.view.Surface r0 = r1.aap
            if (r0 == 0) goto Lf
            r0.release()     // Catch: java.lang.Throwable -> L8
            goto Lc
        L8:
            r0 = move-exception
            com.kwad.sdk.core.d.c.printStackTrace(r0)
        Lc:
            r0 = 0
            r1.aap = r0
        Lf:
            return
    }

    public final android.animation.ValueAnimator a(com.kwad.sdk.core.response.model.AdTemplate r9, int r10, android.animation.ValueAnimator.AnimatorUpdateListener r11) {
            r8 = this;
            int r0 = r8.getHeight()
            float r0 = (float) r0
            int r1 = r8.getWidth()
            float r1 = (float) r1
            float r5 = r0 / r1
            com.kwad.sdk.core.response.model.AdInfo r9 = com.kwad.sdk.core.response.b.e.el(r9)
            boolean r4 = com.kwad.sdk.core.response.b.a.W(r9)
            android.view.ViewGroup$LayoutParams r6 = r8.getLayoutParams()
            int r9 = (int) r0
            int[] r9 = new int[]{r9, r10}
            android.animation.ValueAnimator r9 = android.animation.ValueAnimator.ofInt(r9)
            com.kwad.components.core.video.DetailVideoView$2 r2 = new com.kwad.components.core.video.DetailVideoView$2
            r3 = r8
            r7 = r11
            r2.<init>(r3, r4, r5, r6, r7)
            r9.addUpdateListener(r2)
            r10 = 1058306785(0x3f147ae1, float:0.58)
            r11 = 1065353216(0x3f800000, float:1.0)
            r0 = 0
            android.view.animation.Interpolator r10 = androidx.core.view.animation.PathInterpolatorCompat.create(r0, r0, r10, r11)
            r0 = 500(0x1f4, double:2.47E-321)
            r9.setDuration(r0)
            r9.setInterpolator(r10)
            return r9
    }

    public final void adaptVideoSize(int r8, int r9) {
            r7 = this;
            com.kwad.components.core.page.widget.b r0 = r7.aal
            if (r0 != 0) goto Lc
            java.lang.String r8 = "DetailVideoView"
            java.lang.String r9 = "adaptVideoSize mTextureView is null"
            com.kwad.sdk.core.d.c.w(r8, r9)
            return
        Lc:
            r7.aav = r9
            r7.aau = r8
            com.kwad.components.core.video.d r0 = r7.aaw
            boolean r0 = r0.tJ()
            if (r0 == 0) goto L42
            com.kwad.components.core.video.d r0 = r7.aaw
            int r0 = r0.tK()
            r1 = 1
            if (r0 == r1) goto L2c
            r1 = 2
            if (r0 == r1) goto L26
            r0 = 0
            goto L31
        L26:
            com.kwad.components.core.video.VideoAdapters$b r0 = new com.kwad.components.core.video.VideoAdapters$b
            r0.<init>()
            goto L31
        L2c:
            com.kwad.components.core.video.VideoAdapters$c r0 = new com.kwad.components.core.video.VideoAdapters$c
            r0.<init>()
        L31:
            if (r0 == 0) goto L3f
            com.kwad.components.core.page.widget.b r1 = r7.aal
            android.view.ViewParent r2 = r1.getParent()
            android.view.View r2 = (android.view.View) r2
            r0.a(r1, r2, r8, r9)
            return
        L3f:
            r1 = r7
            goto L110
        L42:
            com.kwad.components.core.video.d r0 = r7.aaw
            boolean r0 = r0.tP()
            if (r0 == 0) goto L50
            com.kwad.components.core.page.widget.b r8 = r7.aal
            com.kwad.sdk.c.a.a.H(r8)
            return
        L50:
            com.kwad.components.core.video.d r0 = r7.aaw
            boolean r0 = r0.tL()
            if (r0 == 0) goto L5e
            com.kwad.components.core.page.widget.b r0 = r7.aal
            com.kwad.sdk.c.a.a.e(r0, r8, r9)
            return
        L5e:
            com.kwad.components.core.video.d r0 = r7.aaw
            boolean r0 = r0.tN()
            if (r0 == 0) goto L6c
            com.kwad.components.core.page.widget.b r0 = r7.aal
            com.kwad.sdk.c.a.a.f(r0, r8, r9)
            return
        L6c:
            com.kwad.components.core.video.d r0 = r7.aaw
            boolean r0 = r0.tM()
            if (r0 == 0) goto L7a
            com.kwad.components.core.page.widget.b r0 = r7.aal
            com.kwad.sdk.c.a.a.d(r0, r8, r9)
            return
        L7a:
            com.kwad.components.core.video.d r0 = r7.aaw
            boolean r0 = r0.tO()
            if (r0 == 0) goto L8b
            com.kwad.components.core.page.widget.b r2 = r7.aal
            long r3 = (long) r8
            long r5 = (long) r9
            r1 = r7
            r1.a(r2, r3, r5)
            return
        L8b:
            r1 = r7
            com.kwad.components.core.page.widget.b r0 = r1.aal
            android.view.ViewParent r0 = r0.getParent()
            android.view.View r0 = (android.view.View) r0
            if (r0 != 0) goto L98
            goto L110
        L98:
            int r2 = r0.getWidth()
            int r0 = r0.getHeight()
            if (r2 == 0) goto L110
            if (r0 != 0) goto La5
            goto L110
        La5:
            com.kwad.sdk.core.response.model.PhotoInfo$VideoInfo r3 = r1.aar
            if (r3 == 0) goto Lc9
            android.graphics.Matrix r4 = r1.mMatrix
            boolean r0 = com.kwad.sdk.core.response.b.h.a(r4, r2, r0, r3)
            if (r0 == 0) goto Lc9
            com.kwad.components.core.page.widget.b r8 = r1.aal
            android.view.ViewGroup$LayoutParams r8 = r8.getLayoutParams()
            r9 = -1
            r8.width = r9
            r8.height = r9
            com.kwad.components.core.page.widget.b r9 = r1.aal
            android.graphics.Matrix r0 = r1.mMatrix
            r9.setTransform(r0)
            com.kwad.components.core.page.widget.b r9 = r1.aal
            r9.setLayoutParams(r8)
            goto Lef
        Lc9:
            com.kwad.components.core.page.widget.b r0 = r1.aal
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            r0.width = r2
            float r9 = (float) r9
            float r8 = (float) r8
            r3 = 1065353216(0x3f800000, float:1.0)
            float r8 = r8 * r3
            float r9 = r9 / r8
            float r8 = (float) r2
            float r9 = r9 * r8
            int r8 = (int) r9
            r0.height = r8
            android.graphics.Matrix r8 = r1.mMatrix
            r8.reset()
            com.kwad.components.core.page.widget.b r8 = r1.aal
            android.graphics.Matrix r9 = r1.mMatrix
            r8.setTransform(r9)
            com.kwad.components.core.page.widget.b r8 = r1.aal
            r8.setLayoutParams(r0)
        Lef:
            android.graphics.RectF r8 = r1.aat
            com.kwad.components.core.page.widget.b r9 = r1.aal
            int r9 = r9.getLeft()
            float r9 = (float) r9
            com.kwad.components.core.page.widget.b r0 = r1.aal
            int r0 = r0.getTop()
            float r0 = (float) r0
            com.kwad.components.core.page.widget.b r2 = r1.aal
            int r2 = r2.getRight()
            float r2 = (float) r2
            com.kwad.components.core.page.widget.b r3 = r1.aal
            int r3 = r3.getBottom()
            float r3 = (float) r3
            r8.set(r9, r0, r2, r3)
        L110:
            return
    }

    public final void bc(int r3) {
            r2 = this;
            java.lang.Boolean r0 = com.kwad.components.core.a.oz
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L45
            android.widget.TextView r0 = r2.aao
            if (r0 != 0) goto L1d
            android.content.Context r0 = r2.getContext()
            if (r0 == 0) goto L45
            android.widget.TextView r0 = new android.widget.TextView
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1)
            r2.aao = r0
        L1d:
            android.widget.TextView r0 = r2.aao
            r2.removeView(r0)
            android.widget.TextView r0 = r2.aao
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r0.setText(r3)
            android.widget.TextView r3 = r2.aao
            r0 = -65536(0xffffffffffff0000, float:NaN)
            r3.setTextColor(r0)
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r0 = -2
            r3.<init>(r0, r0)
            r0 = 53
            r3.gravity = r0
            android.widget.TextView r0 = r2.aao
            int r1 = r2.getChildCount()
            r2.addView(r0, r1, r3)
        L45:
            return
    }

    @java.lang.Deprecated
    public final void fixWidth(boolean r2) {
            r1 = this;
            com.kwad.components.core.video.d r0 = r1.aaw
            r0.aU(r2)
            return
    }

    public final void g(boolean r2, int r3) {
            r1 = this;
            com.kwad.components.core.video.d r2 = r1.aaw
            r0 = 1
            r2.setAd(r0)
            com.kwad.components.core.video.d r2 = r1.aaw
            r2.bd(r3)
            return
    }

    public int getTextureViewGravity() {
            r3 = this;
            com.kwad.components.core.page.widget.b r0 = r3.aal
            r1 = 17
            if (r0 != 0) goto L7
            return r1
        L7:
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            boolean r2 = r0 instanceof android.widget.FrameLayout.LayoutParams
            if (r2 == 0) goto L14
            android.widget.FrameLayout$LayoutParams r0 = (android.widget.FrameLayout.LayoutParams) r0
            int r0 = r0.gravity
            return r0
        L14:
            return r1
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View r2) {
            r1 = this;
            com.kwad.components.core.page.widget.b r0 = r1.aal
            if (r2 != r0) goto Lc
            com.kwad.components.core.video.DetailVideoView$a r2 = r1.aaq
            if (r2 == 0) goto L13
            r2.onClickVideoView()
            return
        Lc:
            com.kwad.components.core.video.DetailVideoView$a r2 = r1.aaq
            if (r2 == 0) goto L13
            r2.onClickRootView()
        L13:
            return
    }

    @Override // com.kwad.sdk.widget.KSFrameLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
            r1 = this;
            super.onDetachedFromWindow()
            r1.tI()
            android.graphics.SurfaceTexture r0 = r1.aan
            if (r0 == 0) goto L10
            r0.release()
            r0 = 0
            r1.aan = r0
        L10:
            return
    }

    @Override // com.kwad.sdk.widget.KSFrameLayout, android.view.View
    public void onSizeChanged(int r1, int r2, int r3, int r4) {
            r0 = this;
            super.onSizeChanged(r1, r2, r3, r4)
            int r1 = r0.aau
            if (r1 <= 0) goto Le
            int r2 = r0.aav
            if (r2 <= 0) goto Le
            r0.adaptVideoSize(r1, r2)
        Le:
            return
    }

    @java.lang.Deprecated
    public void setAd(boolean r2) {
            r1 = this;
            com.kwad.components.core.video.d r0 = r1.aaw
            r0.setAd(r2)
            return
    }

    public void setClickListener(com.kwad.components.core.video.DetailVideoView.a r1) {
            r0 = this;
            r0.aaq = r1
            r0.setOnClickListener(r0)
            return
    }

    @java.lang.Deprecated
    public void setFillXY(boolean r2) {
            r1 = this;
            com.kwad.components.core.video.d r0 = r1.aaw
            r0.setFillXY(r2)
            return
    }

    @java.lang.Deprecated
    public void setForce(boolean r2) {
            r1 = this;
            com.kwad.components.core.video.d r0 = r1.aaw
            r0.setForce(r2)
            return
    }

    public void setHorizontalVideo(boolean r2) {
            r1 = this;
            com.kwad.components.core.video.d r0 = r1.aaw
            r0.setHorizontalVideo(r2)
            return
    }

    public void setIsAlphaVideoView(boolean r2) {
            r1 = this;
            r1.aas = r2
            if (r2 == 0) goto Lc
            com.kwad.components.core.page.widget.b r2 = r1.aal
            if (r2 == 0) goto Lc
            r0 = 0
            r2.setOpaque(r0)
        Lc:
            return
    }

    public void setMediaPlayer(com.kwad.components.core.video.b r2) {
            r1 = this;
            r1.aam = r2
            android.view.Surface r0 = r1.aap
            if (r0 == 0) goto Lb
            if (r2 == 0) goto Lb
            r2.setSurface(r0)
        Lb:
            return
    }

    @Override // com.kwad.sdk.widget.KSFrameLayout
    public void setRadius(float r1) {
            r0 = this;
            com.kwad.components.core.widget.h.b(r0, r1)
            return
    }

    public void setVideoInfo(com.kwad.sdk.core.response.model.PhotoInfo.VideoInfo r1) {
            r0 = this;
            r0.aar = r1
            return
    }

    public final void updateTextureViewGravity(int r3) {
            r2 = this;
            com.kwad.components.core.page.widget.b r0 = r2.aal
            if (r0 != 0) goto L5
            goto L16
        L5:
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            boolean r1 = r0 instanceof android.widget.FrameLayout.LayoutParams
            if (r1 == 0) goto L16
            android.widget.FrameLayout$LayoutParams r0 = (android.widget.FrameLayout.LayoutParams) r0
            r0.gravity = r3
            com.kwad.components.core.page.widget.b r3 = r2.aal
            r3.requestLayout()
        L16:
            return
    }
}
