package com.acse.ottn.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class RoundRectImageView extends android.widget.ImageView {
    public android.graphics.Paint a;

    /* renamed from: b, reason: collision with root package name */
    public android.graphics.Paint f2881b;

    /* renamed from: c, reason: collision with root package name */
    public float f2882c;

    public RoundRectImageView(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public RoundRectImageView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public RoundRectImageView(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r3 = 0
            r0.f2882c = r3
            boolean r3 = r0.isInEditMode()
            if (r3 != 0) goto Lf
            r0.a(r1, r2)
        Lf:
            android.graphics.Paint r1 = new android.graphics.Paint
            r1.<init>()
            r0.a = r1
            r2 = 1
            r1.setAntiAlias(r2)
            android.graphics.Paint r1 = new android.graphics.Paint
            r1.<init>()
            r0.f2881b = r1
            r1.setAntiAlias(r2)
            return
    }

    public static android.graphics.Bitmap a(android.graphics.Bitmap r6, int r7, int r8, int r9, int r10) {
            if (r6 != 0) goto L4
            r6 = 0
            return r6
        L4:
            int r0 = r6.getWidth()
            int r1 = r6.getHeight()
            float r2 = (float) r7
            r3 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 * r3
            float r0 = (float) r0
            float r2 = r2 / r0
            float r0 = (float) r8
            float r0 = r0 * r3
            float r1 = (float) r1
            float r0 = r0 / r1
            android.graphics.Matrix r1 = new android.graphics.Matrix
            r1.<init>()
            r1.setScale(r2, r0)
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r7, r8, r0)
            android.graphics.Canvas r2 = new android.graphics.Canvas
            r2.<init>(r0)
            android.graphics.Paint r3 = new android.graphics.Paint
            r3.<init>()
            android.graphics.BitmapShader r4 = new android.graphics.BitmapShader
            android.graphics.Shader$TileMode r5 = android.graphics.Shader.TileMode.CLAMP
            r4.<init>(r6, r5, r5)
            r4.setLocalMatrix(r1)
            r3.setShader(r4)
            android.graphics.RectF r6 = new android.graphics.RectF
            float r1 = (float) r10
            int r7 = r7 - r10
            float r7 = (float) r7
            int r8 = r8 - r10
            float r8 = (float) r8
            r6.<init>(r1, r1, r7, r8)
            float r7 = (float) r9
            r2.drawRoundRect(r6, r7, r7, r3)
            if (r10 <= 0) goto L67
            android.graphics.Paint r8 = new android.graphics.Paint
            r9 = 1
            r8.<init>(r9)
            r3.setAntiAlias(r9)
            r9 = -16711936(0xffffffffff00ff00, float:-1.7146522E38)
            r8.setColor(r9)
            android.graphics.Paint$Style r9 = android.graphics.Paint.Style.STROKE
            r8.setStyle(r9)
            r8.setStrokeWidth(r1)
            r2.drawRoundRect(r6, r7, r7, r8)
        L67:
            return r0
    }

    public static android.graphics.Bitmap a(android.graphics.drawable.Drawable r4) {
            int r0 = r4.getIntrinsicWidth()
            int r1 = r4.getIntrinsicHeight()
            int r2 = r4.getOpacity()
            r3 = -1
            if (r2 == r3) goto L12
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
            goto L14
        L12:
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.RGB_565
        L14:
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r0, r1, r2)
            android.graphics.Canvas r1 = new android.graphics.Canvas
            r1.<init>(r0)
            r4.draw(r1)
            return r0
    }

    public final int a(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r2 = (float) r2
            float r2 = r2 * r0
            int r2 = (int) r2
            return r2
    }

    public android.graphics.Bitmap a(android.graphics.Bitmap r8, float r9) {
            r7 = this;
            int r0 = r8.getWidth()
            int r1 = r8.getHeight()
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r0, r1, r2)
            android.graphics.Canvas r1 = new android.graphics.Canvas
            r1.<init>(r0)
            android.graphics.Paint r2 = new android.graphics.Paint
            r2.<init>()
            android.graphics.Rect r3 = new android.graphics.Rect
            int r4 = r8.getWidth()
            int r5 = r8.getHeight()
            r6 = 0
            r3.<init>(r6, r6, r4, r5)
            android.graphics.RectF r4 = new android.graphics.RectF
            r4.<init>(r3)
            r5 = 1
            r2.setAntiAlias(r5)
            r1.drawARGB(r6, r6, r6, r6)
            r1.drawRoundRect(r4, r9, r9, r2)
            android.graphics.PorterDuffXfermode r9 = new android.graphics.PorterDuffXfermode
            android.graphics.PorterDuff$Mode r4 = android.graphics.PorterDuff.Mode.SRC_IN
            r9.<init>(r4)
            r2.setXfermode(r9)
            r1.drawBitmap(r8, r3, r3, r2)
            return r0
    }

    public final void a(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            int[] r0 = com.acse.ottn.R.styleable.RoundRectImageView
            android.content.res.TypedArray r2 = r2.obtainStyledAttributes(r3, r0)
            int r3 = com.acse.ottn.R.styleable.RoundRectImageView_image_radius     // Catch: java.lang.Throwable -> L15
            r0 = -880869120(0xffffffffcb7f0100, float:-1.6711936E7)
            float r3 = r2.getDimension(r3, r0)     // Catch: java.lang.Throwable -> L15
            r1.f2882c = r3     // Catch: java.lang.Throwable -> L15
            r2.recycle()
            return
        L15:
            r3 = move-exception
            r2.recycle()
            throw r3
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(android.graphics.Canvas r7) {
            r6 = this;
            android.graphics.drawable.Drawable r0 = r6.getDrawable()
            if (r0 == 0) goto L3c
            android.graphics.Bitmap r0 = a(r0)
            float r1 = r6.f2882c
            android.graphics.Bitmap r0 = r6.a(r0, r1)
            android.graphics.Rect r1 = new android.graphics.Rect
            int r2 = r0.getWidth()
            int r3 = r0.getHeight()
            r4 = 0
            r1.<init>(r4, r4, r2, r3)
            android.graphics.Rect r2 = new android.graphics.Rect
            int r3 = r6.getWidth()
            int r5 = r6.getHeight()
            r2.<init>(r4, r4, r3, r5)
            android.graphics.Paint r3 = r6.a
            r3.reset()
            android.graphics.Paint r3 = r6.a
            r4 = 1
            r3.setAntiAlias(r4)
            android.graphics.Paint r3 = r6.a
            r7.drawBitmap(r0, r1, r2, r3)
            return
        L3c:
            super.onDraw(r7)
            return
    }

    public void setRadius(int r1) {
            r0 = this;
            int r1 = r0.a(r1)
            float r1 = (float) r1
            r0.f2882c = r1
            return
    }
}
