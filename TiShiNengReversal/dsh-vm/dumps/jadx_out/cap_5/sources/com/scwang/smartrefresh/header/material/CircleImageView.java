package com.scwang.smartrefresh.header.material;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class CircleImageView extends android.widget.ImageView {
    private static final int c = 503316480;
    private static final int d = 1023410176;
    private static final float e = 0.0f;
    private static final float f = 1.75f;
    private static final float g = 3.5f;
    private static final int h = 4;
    private android.view.animation.Animation.AnimationListener a;
    int b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class a extends android.graphics.drawable.shapes.OvalShape {
        private android.graphics.RadialGradient a;
        private android.graphics.Paint b;
        final /* synthetic */ com.scwang.smartrefresh.header.material.CircleImageView c;

        a(com.scwang.smartrefresh.header.material.CircleImageView r2, int r3) {
                r1 = this;
                r1.c = r2
                r1.<init>()
                android.graphics.Paint r0 = new android.graphics.Paint
                r0.<init>()
                r1.b = r0
                r2.b = r3
                android.graphics.RectF r2 = r1.rect()
                float r2 = r2.width()
                int r2 = (int) r2
                r1.a(r2)
                return
        }

        private void a(int r8) {
                r7 = this;
                android.graphics.RadialGradient r0 = new android.graphics.RadialGradient
                int r8 = r8 / 2
                float r1 = (float) r8
                com.scwang.smartrefresh.header.material.CircleImageView r8 = r7.c
                int r8 = r8.b
                float r3 = (float) r8
                r8 = 1023410176(0x3d000000, float:0.03125)
                r2 = 0
                int[] r4 = new int[]{r8, r2}
                r5 = 0
                android.graphics.Shader$TileMode r6 = android.graphics.Shader.TileMode.CLAMP
                r2 = r1
                r0.<init>(r1, r2, r3, r4, r5, r6)
                r7.a = r0
                android.graphics.Paint r8 = r7.b
                r8.setShader(r0)
                return
        }

        @Override // android.graphics.drawable.shapes.OvalShape, android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        public void draw(android.graphics.Canvas r5, android.graphics.Paint r6) {
                r4 = this;
                com.scwang.smartrefresh.header.material.CircleImageView r0 = r4.c
                int r0 = r0.getWidth()
                com.scwang.smartrefresh.header.material.CircleImageView r1 = r4.c
                int r1 = r1.getHeight()
                int r0 = r0 / 2
                float r2 = (float) r0
                int r1 = r1 / 2
                float r1 = (float) r1
                android.graphics.Paint r3 = r4.b
                r5.drawCircle(r2, r1, r2, r3)
                com.scwang.smartrefresh.header.material.CircleImageView r3 = r4.c
                int r3 = r3.b
                int r0 = r0 - r3
                float r0 = (float) r0
                r5.drawCircle(r2, r1, r0, r6)
                return
        }

        @Override // android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        protected void onResize(float r1, float r2) {
                r0 = this;
                super.onResize(r1, r2)
                int r1 = (int) r1
                r0.a(r1)
                return
        }
    }

    public CircleImageView(android.content.Context r6, int r7) {
            r5 = this;
            r5.<init>(r6)
            android.content.Context r6 = r5.getContext()
            android.content.res.Resources r6 = r6.getResources()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            r0 = 1071644672(0x3fe00000, float:1.75)
            float r0 = r0 * r6
            int r0 = (int) r0
            r1 = 0
            float r1 = r1 * r6
            int r1 = (int) r1
            r2 = 1080033280(0x40600000, float:3.5)
            float r2 = r2 * r6
            int r2 = (int) r2
            r5.b = r2
            boolean r2 = r5.a()
            if (r2 == 0) goto L39
            android.graphics.drawable.ShapeDrawable r0 = new android.graphics.drawable.ShapeDrawable
            android.graphics.drawable.shapes.OvalShape r1 = new android.graphics.drawable.shapes.OvalShape
            r1.<init>()
            r0.<init>(r1)
            r1 = 1082130432(0x40800000, float:4.0)
            float r6 = r6 * r1
            r5.setElevation(r6)
            goto L61
        L39:
            com.scwang.smartrefresh.header.material.CircleImageView$a r6 = new com.scwang.smartrefresh.header.material.CircleImageView$a
            int r2 = r5.b
            r6.<init>(r5, r2)
            android.graphics.drawable.ShapeDrawable r2 = new android.graphics.drawable.ShapeDrawable
            r2.<init>(r6)
            r6 = 1
            android.graphics.Paint r3 = r2.getPaint()
            r5.setLayerType(r6, r3)
            android.graphics.Paint r6 = r2.getPaint()
            int r3 = r5.b
            float r3 = (float) r3
            float r1 = (float) r1
            float r0 = (float) r0
            r4 = 503316480(0x1e000000, float:6.7762636E-21)
            r6.setShadowLayer(r3, r1, r0, r4)
            int r6 = r5.b
            r5.setPadding(r6, r6, r6, r6)
            r0 = r2
        L61:
            android.graphics.Paint r6 = r0.getPaint()
            r6.setColor(r7)
            r5.setBackground(r0)
            return
    }

    private boolean a() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // android.view.View
    public void onAnimationEnd() {
            r2 = this;
            super.onAnimationEnd()
            android.view.animation.Animation$AnimationListener r0 = r2.a
            if (r0 == 0) goto Le
            android.view.animation.Animation r1 = r2.getAnimation()
            r0.onAnimationEnd(r1)
        Le:
            return
    }

    @Override // android.view.View
    public void onAnimationStart() {
            r2 = this;
            super.onAnimationStart()
            android.view.animation.Animation$AnimationListener r0 = r2.a
            if (r0 == 0) goto Le
            android.view.animation.Animation r1 = r2.getAnimation()
            r0.onAnimationStart(r1)
        Le:
            return
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int r2, int r3) {
            r1 = this;
            super.onMeasure(r2, r3)
            boolean r2 = r1.a()
            if (r2 != 0) goto L1e
            int r2 = r1.getMeasuredWidth()
            int r3 = r1.b
            int r3 = r3 * 2
            int r2 = r2 + r3
            int r3 = r1.getMeasuredHeight()
            int r0 = r1.b
            int r0 = r0 * 2
            int r3 = r3 + r0
            r1.setMeasuredDimension(r2, r3)
        L1e:
            return
    }

    public void setAnimationListener(android.view.animation.Animation.AnimationListener r1) {
            r0 = this;
            r0.a = r1
            return
    }

    @Override // android.view.View
    public void setBackgroundColor(@androidx.annotation.ColorInt int r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.getBackground()
            boolean r0 = r0 instanceof android.graphics.drawable.ShapeDrawable
            if (r0 == 0) goto L15
            android.graphics.drawable.Drawable r0 = r1.getBackground()
            android.graphics.drawable.ShapeDrawable r0 = (android.graphics.drawable.ShapeDrawable) r0
            android.graphics.Paint r0 = r0.getPaint()
            r0.setColor(r2)
        L15:
            return
    }

    public void setBackgroundColorRes(int r4) {
            r3 = this;
            android.content.Context r0 = r3.getContext()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            if (r1 < r2) goto L1a
            android.content.res.Resources r1 = r0.getResources()
            android.content.res.Resources$Theme r0 = r0.getTheme()
            int r4 = com.kwad.sdk.o.p.a(r1, r4, r0)
            r3.setBackgroundColor(r4)
            return
        L1a:
            android.content.res.Resources r0 = r0.getResources()
            int r4 = r0.getColor(r4)
            r3.setBackgroundColor(r4)
            return
    }
}
