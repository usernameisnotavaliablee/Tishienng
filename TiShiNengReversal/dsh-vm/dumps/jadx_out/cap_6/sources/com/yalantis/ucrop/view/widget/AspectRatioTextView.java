package com.yalantis.ucrop.view.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class AspectRatioTextView extends android.widget.TextView {
    private final float a;
    private final android.graphics.Rect b;
    private android.graphics.Paint c;
    private int d;
    private float e;
    private java.lang.String f;
    private float g;
    private float h;

    public AspectRatioTextView(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public AspectRatioTextView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public AspectRatioTextView(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r3 = 1069547520(0x3fc00000, float:1.5)
            r0.a = r3
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            r0.b = r3
            int[] r3 = com.yalantis.ucrop.R.styleable.ucrop_AspectRatioTextView
            android.content.res.TypedArray r1 = r1.obtainStyledAttributes(r2, r3)
            r0.c(r1)
            return
    }

    @android.annotation.TargetApi(21)
    public AspectRatioTextView(android.content.Context r1, android.util.AttributeSet r2, int r3, int r4) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            r3 = 1069547520(0x3fc00000, float:1.5)
            r0.a = r3
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            r0.b = r3
            int[] r3 = com.yalantis.ucrop.R.styleable.ucrop_AspectRatioTextView
            android.content.res.TypedArray r1 = r1.obtainStyledAttributes(r2, r3)
            r0.c(r1)
            return
    }

    private void a(@androidx.annotation.ColorInt int r5) {
            r4 = this;
            android.graphics.Paint r0 = r4.c
            if (r0 == 0) goto L7
            r0.setColor(r5)
        L7:
            android.content.res.ColorStateList r0 = new android.content.res.ColorStateList
            r1 = 2
            int[][] r1 = new int[r1][]
            r2 = 16842913(0x10100a1, float:2.369401E-38)
            int[] r2 = new int[]{r2}
            r3 = 0
            r1[r3] = r2
            int[] r2 = new int[]{r3}
            r3 = 1
            r1[r3] = r2
            android.content.Context r2 = r4.getContext()
            int r3 = com.yalantis.ucrop.R.color.ucrop_color_widget
            int r2 = androidx.core.content.ContextCompat.getColor(r2, r3)
            int[] r5 = new int[]{r5, r2}
            r0.<init>(r1, r5)
            r4.setTextColor(r0)
            return
    }

    private void c(@androidx.annotation.NonNull android.content.res.TypedArray r6) {
            r5 = this;
            r0 = 1
            r5.setGravity(r0)
            int r1 = com.yalantis.ucrop.R.styleable.ucrop_AspectRatioTextView_ucrop_artv_ratio_title
            java.lang.String r1 = r6.getString(r1)
            r5.f = r1
            int r1 = com.yalantis.ucrop.R.styleable.ucrop_AspectRatioTextView_ucrop_artv_ratio_x
            r2 = 0
            float r1 = r6.getFloat(r1, r2)
            r5.g = r1
            int r1 = com.yalantis.ucrop.R.styleable.ucrop_AspectRatioTextView_ucrop_artv_ratio_y
            float r1 = r6.getFloat(r1, r2)
            r5.h = r1
            float r3 = r5.g
            int r4 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r4 == 0) goto L2c
            int r4 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r4 != 0) goto L28
            goto L2c
        L28:
            float r3 = r3 / r1
            r5.e = r3
            goto L2e
        L2c:
            r5.e = r2
        L2e:
            android.content.Context r1 = r5.getContext()
            android.content.res.Resources r1 = r1.getResources()
            int r2 = com.yalantis.ucrop.R.dimen.ucrop_size_dot_scale_text_view
            int r1 = r1.getDimensionPixelSize(r2)
            r5.d = r1
            android.graphics.Paint r1 = new android.graphics.Paint
            r1.<init>(r0)
            r5.c = r1
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.FILL
            r1.setStyle(r0)
            r5.d()
            android.content.res.Resources r0 = r5.getResources()
            int r1 = com.yalantis.ucrop.R.color.ucrop_color_widget_active
            int r0 = r0.getColor(r1)
            r5.a(r0)
            r6.recycle()
            return
    }

    private void d() {
            r5 = this;
            java.lang.String r0 = r5.f
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Le
            java.lang.String r0 = r5.f
            r5.setText(r0)
            return
        Le:
            java.util.Locale r0 = java.util.Locale.US
            float r1 = r5.g
            int r1 = (int) r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            float r2 = r5.h
            int r2 = (int) r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r1
            r1 = 1
            r3[r1] = r2
            java.lang.String r1 = "%d:%d"
            java.lang.String r0 = java.lang.String.format(r0, r1, r3)
            r5.setText(r0)
            return
    }

    private void e() {
            r2 = this;
            float r0 = r2.e
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L12
            float r0 = r2.g
            float r1 = r2.h
            r2.g = r1
            r2.h = r0
            float r1 = r1 / r0
            r2.e = r1
        L12:
            return
    }

    public float b(boolean r1) {
            r0 = this;
            if (r1 == 0) goto L8
            r0.e()
            r0.d()
        L8:
            float r1 = r0.e
            return r1
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(android.graphics.Canvas r7) {
            r6 = this;
            super.onDraw(r7)
            boolean r0 = r6.isSelected()
            if (r0 == 0) goto L30
            android.graphics.Rect r0 = r6.b
            r7.getClipBounds(r0)
            android.graphics.Rect r0 = r6.b
            int r1 = r0.right
            int r2 = r0.left
            int r1 = r1 - r2
            float r1 = (float) r1
            r2 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r2
            int r3 = r0.bottom
            float r3 = (float) r3
            int r0 = r0.top
            float r0 = (float) r0
            float r0 = r0 / r2
            float r3 = r3 - r0
            int r0 = r6.d
            float r4 = (float) r0
            r5 = 1069547520(0x3fc00000, float:1.5)
            float r4 = r4 * r5
            float r3 = r3 - r4
            float r0 = (float) r0
            float r0 = r0 / r2
            android.graphics.Paint r2 = r6.c
            r7.drawCircle(r1, r3, r0, r2)
        L30:
            return
    }

    public void setActiveColor(@androidx.annotation.ColorInt int r1) {
            r0 = this;
            r0.a(r1)
            r0.invalidate()
            return
    }

    public void setAspectRatio(@androidx.annotation.NonNull com.yalantis.ucrop.model.AspectRatio r4) {
            r3 = this;
            java.lang.String r0 = r4.a()
            r3.f = r0
            float r0 = r4.b()
            r3.g = r0
            float r4 = r4.c()
            r3.h = r4
            float r0 = r3.g
            r1 = 0
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 == 0) goto L22
            int r2 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r2 != 0) goto L1e
            goto L22
        L1e:
            float r0 = r0 / r4
            r3.e = r0
            goto L24
        L22:
            r3.e = r1
        L24:
            r3.d()
            return
    }
}
