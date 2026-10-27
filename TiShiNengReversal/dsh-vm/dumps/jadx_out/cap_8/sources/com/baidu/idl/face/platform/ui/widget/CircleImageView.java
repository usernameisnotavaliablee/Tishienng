package com.baidu.idl.face.platform.ui.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@android.annotation.SuppressLint({"AppCompatCustomView"})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class CircleImageView extends android.widget.ImageView {
    private static final android.graphics.Bitmap.Config BITMAP_CONFIG = null;
    private static final int COLORDRAWABLE_DIMENSION = 2;
    private static final int DEFAULT_BORDER_COLOR = -16777216;
    private static final int DEFAULT_BORDER_WIDTH = 0;
    private static final android.widget.ImageView.ScaleType SCALE_TYPE = null;
    private static final java.lang.String TAG = "CircleImageView";
    private android.graphics.Bitmap mBitmap;
    private int mBitmapHeight;
    private final android.graphics.Paint mBitmapPaint;
    private android.graphics.BitmapShader mBitmapShader;
    private int mBitmapWidth;
    private int mBorderColor;
    private final android.graphics.Paint mBorderPaint;
    private float mBorderRadius;
    private final android.graphics.RectF mBorderRect;
    private int mBorderWidth;
    private float mDrawableRadius;
    private final android.graphics.RectF mDrawableRect;
    private boolean mReady;
    private boolean mSetupPending;
    private final android.graphics.Matrix mShaderMatrix;

    static {
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.CENTER_CROP
            com.baidu.idl.face.platform.ui.widget.CircleImageView.SCALE_TYPE = r0
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            com.baidu.idl.face.platform.ui.widget.CircleImageView.BITMAP_CONFIG = r0
            return
    }

    public CircleImageView(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.mDrawableRect = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.mBorderRect = r1
            android.graphics.Matrix r1 = new android.graphics.Matrix
            r1.<init>()
            r0.mShaderMatrix = r1
            android.graphics.Paint r1 = new android.graphics.Paint
            r1.<init>()
            r0.mBitmapPaint = r1
            android.graphics.Paint r1 = new android.graphics.Paint
            r1.<init>()
            r0.mBorderPaint = r1
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0.mBorderColor = r1
            r1 = 0
            r0.mBorderWidth = r1
            r0.init()
            return
    }

    public CircleImageView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public CircleImageView(android.content.Context r4, android.util.AttributeSet r5, int r6) {
            r3 = this;
            r3.<init>(r4, r5, r6)
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r3.mDrawableRect = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r3.mBorderRect = r0
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r3.mShaderMatrix = r0
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r3.mBitmapPaint = r0
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r3.mBorderPaint = r0
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r3.mBorderColor = r0
            r1 = 0
            r3.mBorderWidth = r1
            int[] r2 = com.baidu.idl.face.platform.ui.R.styleable.CircleImageView
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r2, r6, r1)
            int r5 = com.baidu.idl.face.platform.ui.R.styleable.CircleImageView_border_width
            int r5 = r4.getDimensionPixelSize(r5, r1)
            r3.mBorderWidth = r5
            int r5 = com.baidu.idl.face.platform.ui.R.styleable.CircleImageView_border_color
            int r5 = r4.getColor(r5, r0)
            r3.mBorderColor = r5
            r4.recycle()
            r3.init()
            return
    }

    private android.graphics.Bitmap getBitmapFromDrawable(android.graphics.drawable.Drawable r6) {
            r5 = this;
            boolean r0 = r6 instanceof android.graphics.drawable.BitmapDrawable     // Catch: java.lang.Exception -> L3a
            if (r0 == 0) goto Lb
            android.graphics.drawable.BitmapDrawable r6 = (android.graphics.drawable.BitmapDrawable) r6     // Catch: java.lang.Exception -> L3a
            android.graphics.Bitmap r6 = r6.getBitmap()     // Catch: java.lang.Exception -> L3a
            return r6
        Lb:
            boolean r0 = r6 instanceof android.graphics.drawable.ColorDrawable     // Catch: java.lang.Exception -> L3a
            if (r0 == 0) goto L17
            android.graphics.Bitmap$Config r0 = com.baidu.idl.face.platform.ui.widget.CircleImageView.BITMAP_CONFIG     // Catch: java.lang.Exception -> L3a
            r1 = 2
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r1, r1, r0)     // Catch: java.lang.Exception -> L3a
            goto L25
        L17:
            int r0 = r6.getIntrinsicWidth()     // Catch: java.lang.Exception -> L3a
            int r1 = r6.getIntrinsicHeight()     // Catch: java.lang.Exception -> L3a
            android.graphics.Bitmap$Config r2 = com.baidu.idl.face.platform.ui.widget.CircleImageView.BITMAP_CONFIG     // Catch: java.lang.Exception -> L3a
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r0, r1, r2)     // Catch: java.lang.Exception -> L3a
        L25:
            android.graphics.Canvas r1 = new android.graphics.Canvas     // Catch: java.lang.Exception -> L3a
            r1.<init>(r0)     // Catch: java.lang.Exception -> L3a
            int r2 = r1.getWidth()     // Catch: java.lang.Exception -> L3a
            int r3 = r1.getHeight()     // Catch: java.lang.Exception -> L3a
            r4 = 0
            r6.setBounds(r4, r4, r2, r3)     // Catch: java.lang.Exception -> L3a
            r6.draw(r1)     // Catch: java.lang.Exception -> L3a
            return r0
        L3a:
            r6 = 0
            return r6
    }

    private void init() {
            r1 = this;
            android.widget.ImageView$ScaleType r0 = com.baidu.idl.face.platform.ui.widget.CircleImageView.SCALE_TYPE
            super.setScaleType(r0)
            r0 = 1
            r1.mReady = r0
            boolean r0 = r1.mSetupPending
            if (r0 == 0) goto L12
            r1.setup()
            r0 = 0
            r1.mSetupPending = r0
        L12:
            return
    }

    private void setup() {
            r7 = this;
            boolean r0 = r7.mReady
            r1 = 1
            if (r0 != 0) goto L8
            r7.mSetupPending = r1
            return
        L8:
            android.graphics.Bitmap r0 = r7.mBitmap
            if (r0 != 0) goto Ld
            return
        Ld:
            android.graphics.BitmapShader r0 = new android.graphics.BitmapShader
            android.graphics.Bitmap r2 = r7.mBitmap
            android.graphics.Shader$TileMode r3 = android.graphics.Shader.TileMode.CLAMP
            r0.<init>(r2, r3, r3)
            r7.mBitmapShader = r0
            android.graphics.Paint r0 = r7.mBitmapPaint
            r0.setAntiAlias(r1)
            android.graphics.Paint r0 = r7.mBitmapPaint
            android.graphics.BitmapShader r2 = r7.mBitmapShader
            r0.setShader(r2)
            android.graphics.Paint r0 = r7.mBorderPaint
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.STROKE
            r0.setStyle(r2)
            android.graphics.Paint r0 = r7.mBorderPaint
            r0.setAntiAlias(r1)
            android.graphics.Paint r0 = r7.mBorderPaint
            int r1 = r7.mBorderColor
            r0.setColor(r1)
            android.graphics.Paint r0 = r7.mBorderPaint
            int r1 = r7.mBorderWidth
            float r1 = (float) r1
            r0.setStrokeWidth(r1)
            android.graphics.Bitmap r0 = r7.mBitmap
            int r0 = r0.getHeight()
            r7.mBitmapHeight = r0
            android.graphics.Bitmap r0 = r7.mBitmap
            int r0 = r0.getWidth()
            r7.mBitmapWidth = r0
            android.graphics.RectF r0 = r7.mBorderRect
            int r1 = r7.getWidth()
            float r1 = (float) r1
            int r2 = r7.getHeight()
            float r2 = (float) r2
            r3 = 0
            r0.set(r3, r3, r1, r2)
            android.graphics.RectF r0 = r7.mBorderRect
            float r0 = r0.height()
            int r1 = r7.mBorderWidth
            float r1 = (float) r1
            float r0 = r0 - r1
            r1 = 2
            float r1 = (float) r1
            float r0 = r0 / r1
            android.graphics.RectF r2 = r7.mBorderRect
            float r2 = r2.width()
            int r3 = r7.mBorderWidth
            float r3 = (float) r3
            float r2 = r2 - r3
            float r2 = r2 / r1
            float r0 = java.lang.Math.min(r0, r2)
            r7.mBorderRadius = r0
            android.graphics.RectF r0 = r7.mDrawableRect
            int r2 = r7.mBorderWidth
            float r3 = (float) r2
            float r2 = (float) r2
            android.graphics.RectF r4 = r7.mBorderRect
            float r4 = r4.width()
            int r5 = r7.mBorderWidth
            float r5 = (float) r5
            float r4 = r4 - r5
            android.graphics.RectF r5 = r7.mBorderRect
            float r5 = r5.height()
            int r6 = r7.mBorderWidth
            float r6 = (float) r6
            float r5 = r5 - r6
            r0.set(r3, r2, r4, r5)
            android.graphics.RectF r0 = r7.mDrawableRect
            float r0 = r0.height()
            float r0 = r0 / r1
            android.graphics.RectF r2 = r7.mDrawableRect
            float r2 = r2.width()
            float r2 = r2 / r1
            float r0 = java.lang.Math.min(r0, r2)
            r7.mDrawableRadius = r0
            r7.updateShaderMatrix()
            r7.invalidate()
            return
    }

    private void updateShaderMatrix() {
            r5 = this;
            android.graphics.Matrix r0 = r5.mShaderMatrix
            r1 = 0
            r0.set(r1)
            int r0 = r5.mBitmapWidth
            float r0 = (float) r0
            android.graphics.RectF r1 = r5.mDrawableRect
            float r1 = r1.height()
            float r0 = r0 * r1
            android.graphics.RectF r1 = r5.mDrawableRect
            float r1 = r1.width()
            int r2 = r5.mBitmapHeight
            float r2 = (float) r2
            float r1 = r1 * r2
            r2 = 0
            r3 = 1056964608(0x3f000000, float:0.5)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L3e
            android.graphics.RectF r0 = r5.mDrawableRect
            float r0 = r0.height()
            int r1 = r5.mBitmapHeight
            float r1 = (float) r1
            float r0 = r0 / r1
            android.graphics.RectF r1 = r5.mDrawableRect
            float r1 = r1.width()
            int r4 = r5.mBitmapWidth
            float r4 = (float) r4
            float r4 = r4 * r0
            float r1 = r1 - r4
            float r1 = r1 * r3
            r2 = r1
            r1 = 0
            goto L56
        L3e:
            android.graphics.RectF r0 = r5.mDrawableRect
            float r0 = r0.width()
            int r1 = r5.mBitmapWidth
            float r1 = (float) r1
            float r0 = r0 / r1
            android.graphics.RectF r1 = r5.mDrawableRect
            float r1 = r1.height()
            int r4 = r5.mBitmapHeight
            float r4 = (float) r4
            float r4 = r4 * r0
            float r1 = r1 - r4
            float r1 = r1 * r3
        L56:
            android.graphics.Matrix r4 = r5.mShaderMatrix
            r4.setScale(r0, r0)
            android.graphics.Matrix r0 = r5.mShaderMatrix
            float r2 = r2 + r3
            int r2 = (int) r2
            int r4 = r5.mBorderWidth
            int r2 = r2 + r4
            float r2 = (float) r2
            float r1 = r1 + r3
            int r1 = (int) r1
            int r1 = r1 + r4
            float r1 = (float) r1
            r0.postTranslate(r2, r1)
            android.graphics.BitmapShader r0 = r5.mBitmapShader
            android.graphics.Matrix r1 = r5.mShaderMatrix
            r0.setLocalMatrix(r1)
            return
    }

    public int getBorderColor() {
            r1 = this;
            int r0 = r1.mBorderColor
            return r0
    }

    public int getBorderWidth() {
            r1 = this;
            int r0 = r1.mBorderWidth
            return r0
    }

    @Override // android.widget.ImageView
    public android.widget.ImageView.ScaleType getScaleType() {
            r1 = this;
            android.widget.ImageView$ScaleType r0 = com.baidu.idl.face.platform.ui.widget.CircleImageView.SCALE_TYPE
            return r0
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(android.graphics.Canvas r5) {
            r4 = this;
            android.graphics.drawable.Drawable r0 = r4.getDrawable()
            if (r0 != 0) goto L7
            goto L35
        L7:
            int r0 = r4.getWidth()
            int r0 = r0 / 2
            float r0 = (float) r0
            int r1 = r4.getHeight()
            int r1 = r1 / 2
            float r1 = (float) r1
            float r2 = r4.mDrawableRadius
            android.graphics.Paint r3 = r4.mBitmapPaint
            r5.drawCircle(r0, r1, r2, r3)
            int r0 = r4.mBorderWidth
            if (r0 == 0) goto L35
            int r0 = r4.getWidth()
            int r0 = r0 / 2
            float r0 = (float) r0
            int r1 = r4.getHeight()
            int r1 = r1 / 2
            float r1 = (float) r1
            float r2 = r4.mBorderRadius
            android.graphics.Paint r3 = r4.mBorderPaint
            r5.drawCircle(r0, r1, r2, r3)
        L35:
            return
    }

    @Override // android.view.View
    protected void onSizeChanged(int r1, int r2, int r3, int r4) {
            r0 = this;
            super.onSizeChanged(r1, r2, r3, r4)
            r0.setup()
            return
    }

    @Override // android.widget.ImageView
    public void setAdjustViewBounds(boolean r2) {
            r1 = this;
            if (r2 != 0) goto L3
            return
        L3:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "adjustViewBounds not supported."
            r2.<init>(r0)
            throw r2
    }

    public void setBorderColor(int r2) {
            r1 = this;
            int r0 = r1.mBorderColor
            if (r2 != r0) goto L5
            return
        L5:
            r1.mBorderColor = r2
            android.graphics.Paint r0 = r1.mBorderPaint
            r0.setColor(r2)
            r1.invalidate()
            return
    }

    public void setBorderWidth(int r2) {
            r1 = this;
            int r0 = r1.mBorderWidth
            if (r2 != r0) goto L5
            return
        L5:
            r1.mBorderWidth = r2
            r1.setup()
            return
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(android.graphics.Bitmap r1) {
            r0 = this;
            super.setImageBitmap(r1)
            r0.mBitmap = r1
            r0.setup()
            return
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            super.setImageDrawable(r1)
            android.graphics.Bitmap r1 = r0.getBitmapFromDrawable(r1)
            r0.mBitmap = r1
            r0.setup()
            return
    }

    @Override // android.widget.ImageView
    public void setImageResource(int r1) {
            r0 = this;
            super.setImageResource(r1)
            android.graphics.drawable.Drawable r1 = r0.getDrawable()
            android.graphics.Bitmap r1 = r0.getBitmapFromDrawable(r1)
            r0.mBitmap = r1
            r0.setup()
            return
    }

    @Override // android.widget.ImageView
    public void setImageURI(android.net.Uri r1) {
            r0 = this;
            super.setImageURI(r1)
            android.graphics.drawable.Drawable r1 = r0.getDrawable()
            android.graphics.Bitmap r1 = r0.getBitmapFromDrawable(r1)
            r0.mBitmap = r1
            r0.setup()
            return
    }

    @Override // android.widget.ImageView
    public void setScaleType(android.widget.ImageView.ScaleType r1) {
            r0 = this;
            return
    }
}
