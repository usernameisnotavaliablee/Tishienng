package com.kwad.components.ad.reward.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@android.annotation.SuppressLint({"AppCompatCustomView"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class KsShadowImageView extends android.widget.ImageView {
    private android.graphics.Paint DT;
    private android.graphics.BlurMaskFilter DU;
    private int DV;
    private boolean DW;
    private boolean DX;
    private boolean DY;
    private boolean DZ;
    private android.graphics.Rect Ea;

    @androidx.annotation.ColorInt
    private int Eb;

    public KsShadowImageView(android.content.Context r3) {
            r2 = this;
            r2.<init>(r3)
            r0 = 1
            r2.DZ = r0
            r0 = 0
            r1 = 0
            r2.a(r3, r0, r1)
            return
    }

    public KsShadowImageView(android.content.Context r2, @androidx.annotation.Nullable android.util.AttributeSet r3) {
            r1 = this;
            r1.<init>(r2, r3)
            r0 = 1
            r1.DZ = r0
            r0 = 0
            r1.a(r2, r3, r0)
            return
    }

    public KsShadowImageView(android.content.Context r2, @androidx.annotation.Nullable android.util.AttributeSet r3, int r4) {
            r1 = this;
            r1.<init>(r2, r3, r4)
            r0 = 1
            r1.DZ = r0
            r1.a(r2, r3, r4)
            return
    }

    @androidx.annotation.RequiresApi(api = 21)
    public KsShadowImageView(android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2, int r3, int r4) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            r4 = 1
            r0.DZ = r4
            r0.a(r1, r2, r3)
            return
    }

    private void a(android.content.Context r4, @androidx.annotation.Nullable android.util.AttributeSet r5, int r6) {
            r3 = this;
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r3.DT = r0
            android.graphics.BlurMaskFilter r0 = new android.graphics.BlurMaskFilter
            r1 = 1112014848(0x42480000, float:50.0)
            android.graphics.BlurMaskFilter$Blur r2 = android.graphics.BlurMaskFilter.Blur.OUTER
            r0.<init>(r1, r2)
            r3.DU = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r3.Ea = r0
            int[] r0 = com.kwad.sdk.R.styleable.ksad_KsShadowImageView
            r1 = 0
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r0, r6, r1)
            int r5 = com.kwad.sdk.R.styleable.ksad_KsShadowImageView_ksad_shadowSize
            r6 = 20
            int r5 = r4.getDimensionPixelSize(r5, r6)
            r3.DV = r5
            int r5 = com.kwad.sdk.R.styleable.ksad_KsShadowImageView_ksad_shadowColor
            java.lang.String r6 = "#33000000"
            int r6 = android.graphics.Color.parseColor(r6)
            int r5 = r4.getColor(r5, r6)
            r3.Eb = r5
            int r5 = com.kwad.sdk.R.styleable.ksad_KsShadowImageView_ksad_enableLeftShadow
            r6 = 1
            boolean r5 = r4.getBoolean(r5, r6)
            r3.DW = r5
            int r5 = com.kwad.sdk.R.styleable.ksad_KsShadowImageView_ksad_enableRightShadow
            boolean r5 = r4.getBoolean(r5, r6)
            r3.DX = r5
            int r5 = com.kwad.sdk.R.styleable.ksad_KsShadowImageView_ksad_enableTopShadow
            boolean r5 = r4.getBoolean(r5, r6)
            r3.DY = r5
            int r5 = com.kwad.sdk.R.styleable.ksad_KsShadowImageView_ksad_enableBottomShadow
            boolean r5 = r4.getBoolean(r5, r6)
            r3.DZ = r5
            r4.recycle()
            return
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(android.graphics.Canvas r6) {
            r5 = this;
            super.onDraw(r6)
            android.graphics.Paint r0 = r5.DT
            android.graphics.BlurMaskFilter r1 = r5.DU
            r0.setMaskFilter(r1)
            android.graphics.Paint r0 = r5.DT
            int r1 = r5.Eb
            r0.setColor(r1)
            android.graphics.Paint r0 = r5.DT
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.FILL
            r0.setStyle(r1)
            int r0 = r5.getMeasuredWidth()
            int r1 = r5.getMeasuredHeight()
            android.graphics.Rect r2 = r5.Ea
            boolean r3 = r5.DW
            r4 = 0
            if (r3 == 0) goto L2a
            int r3 = r5.DV
            goto L2b
        L2a:
            r3 = 0
        L2b:
            r2.left = r3
            boolean r3 = r5.DY
            if (r3 == 0) goto L34
            int r3 = r5.DV
            goto L35
        L34:
            r3 = 0
        L35:
            r2.top = r3
            boolean r3 = r5.DX
            if (r3 == 0) goto L3e
            int r3 = r5.DV
            goto L3f
        L3e:
            r3 = 0
        L3f:
            int r0 = r0 - r3
            r2.right = r0
            boolean r0 = r5.DZ
            if (r0 == 0) goto L48
            int r4 = r5.DV
        L48:
            int r1 = r1 - r4
            r2.bottom = r1
            android.graphics.Paint r0 = r5.DT
            r6.drawRect(r2, r0)
            return
    }
}
