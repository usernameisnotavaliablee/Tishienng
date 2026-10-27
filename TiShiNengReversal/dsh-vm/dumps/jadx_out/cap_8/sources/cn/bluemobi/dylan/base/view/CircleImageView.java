package cn.bluemobi.dylan.base.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class CircleImageView extends androidx.appcompat.widget.AppCompatImageView {
    private static final android.graphics.Bitmap.Config BITMAP_CONFIG = null;
    private static final int COLORDRAWABLE_DIMENSION = 1;
    private static final int DEFAULT_BORDER_COLOR = -16777216;
    private static final int DEFAULT_BORDER_WIDTH = 0;
    private static final android.widget.ImageView.ScaleType SCALE_TYPE = null;
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
            cn.bluemobi.dylan.base.view.CircleImageView.SCALE_TYPE = r0
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            cn.bluemobi.dylan.base.view.CircleImageView.BITMAP_CONFIG = r0
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
            android.widget.ImageView$ScaleType r2 = cn.bluemobi.dylan.base.view.CircleImageView.SCALE_TYPE
            super/*android.widget.ImageView*/.setScaleType(r2)
            int[] r2 = cn.bluemobi.dylan.base.R.styleable.CircleImageView
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r2, r6, r1)
            int r5 = cn.bluemobi.dylan.base.R.styleable.CircleImageView_border_width
            int r5 = r4.getDimensionPixelSize(r5, r1)
            r3.mBorderWidth = r5
            int r5 = cn.bluemobi.dylan.base.R.styleable.CircleImageView_border_color
            int r5 = r4.getColor(r5, r0)
            r3.mBorderColor = r5
            r4.recycle()
            r4 = 1
            r3.mReady = r4
            boolean r4 = r3.mSetupPending
            if (r4 == 0) goto L57
            r3.setup()
            r3.mSetupPending = r1
        L57:
            return
    }

    private android.graphics.Bitmap getBitmapFromDrawable(android.graphics.drawable.Drawable r7) {
            r6 = this;
            r0 = 0
            if (r7 != 0) goto L4
            return r0
        L4:
            boolean r1 = r7 instanceof android.graphics.drawable.BitmapDrawable
            if (r1 == 0) goto Lf
            android.graphics.drawable.BitmapDrawable r7 = (android.graphics.drawable.BitmapDrawable) r7
            android.graphics.Bitmap r7 = r7.getBitmap()
            return r7
        Lf:
            boolean r1 = r7 instanceof android.graphics.drawable.ColorDrawable     // Catch: java.lang.OutOfMemoryError -> L3e
            if (r1 == 0) goto L1b
            android.graphics.Bitmap$Config r1 = cn.bluemobi.dylan.base.view.CircleImageView.BITMAP_CONFIG     // Catch: java.lang.OutOfMemoryError -> L3e
            r2 = 1
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r2, r2, r1)     // Catch: java.lang.OutOfMemoryError -> L3e
            goto L29
        L1b:
            cn.bluemobi.dylan.base.utils.i$a r1 = cn.bluemobi.dylan.base.utils.i.c(r6)     // Catch: java.lang.OutOfMemoryError -> L3e
            int r2 = r1.a     // Catch: java.lang.OutOfMemoryError -> L3e
            int r1 = r1.f116b     // Catch: java.lang.OutOfMemoryError -> L3e
            android.graphics.Bitmap$Config r3 = cn.bluemobi.dylan.base.view.CircleImageView.BITMAP_CONFIG     // Catch: java.lang.OutOfMemoryError -> L3e
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r2, r1, r3)     // Catch: java.lang.OutOfMemoryError -> L3e
        L29:
            android.graphics.Canvas r2 = new android.graphics.Canvas     // Catch: java.lang.OutOfMemoryError -> L3e
            r2.<init>(r1)     // Catch: java.lang.OutOfMemoryError -> L3e
            int r3 = r2.getWidth()     // Catch: java.lang.OutOfMemoryError -> L3e
            int r4 = r2.getHeight()     // Catch: java.lang.OutOfMemoryError -> L3e
            r5 = 0
            r7.setBounds(r5, r5, r3, r4)     // Catch: java.lang.OutOfMemoryError -> L3e
            r7.draw(r2)     // Catch: java.lang.OutOfMemoryError -> L3e
            return r1
        L3e:
            return r0
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
            r1 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r1
            android.graphics.RectF r2 = r7.mBorderRect
            float r2 = r2.width()
            int r3 = r7.mBorderWidth
            float r3 = (float) r3
            float r2 = r2 - r3
            float r2 = r2 / r1
            float r0 = java.lang.Math.max(r0, r2)
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
            float r0 = java.lang.Math.max(r0, r2)
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
            r2 = 1056964608(0x3f000000, float:0.5)
            r3 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L3c
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
            float r1 = r1 * r2
            goto L56
        L3c:
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
            float r1 = r1 * r2
            r3 = r1
            r1 = 0
        L56:
            android.graphics.Matrix r4 = r5.mShaderMatrix
            r4.setScale(r0, r0)
            android.graphics.Matrix r0 = r5.mShaderMatrix
            float r3 = r3 + r2
            int r3 = (int) r3
            int r4 = r5.mBorderWidth
            int r3 = r3 + r4
            float r3 = (float) r3
            float r1 = r1 + r2
            int r1 = (int) r1
            int r1 = r1 + r4
            float r1 = (float) r1
            r0.postTranslate(r3, r1)
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

    public android.widget.ImageView.ScaleType getScaleType() {
            r1 = this;
            android.widget.ImageView$ScaleType r0 = cn.bluemobi.dylan.base.view.CircleImageView.SCALE_TYPE
            return r0
    }

    protected void onDraw(android.graphics.Canvas r5) {
            r4 = this;
            android.graphics.drawable.Drawable r0 = r4.getDrawable()
            if (r0 != 0) goto L7
            return
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
            int r0 = r4.getWidth()
            int r0 = r0 / 2
            float r0 = (float) r0
            int r1 = r4.getHeight()
            int r1 = r1 / 2
            float r1 = (float) r1
            float r2 = r4.mBorderRadius
            android.graphics.Paint r3 = r4.mBorderPaint
            r5.drawCircle(r0, r1, r2, r3)
            return
    }

    protected void onSizeChanged(int r1, int r2, int r3, int r4) {
            r0 = this;
            super/*android.widget.ImageView*/.onSizeChanged(r1, r2, r3, r4)
            r0.setup()
            return
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

    public void setImageBitmap(android.graphics.Bitmap r1) {
            r0 = this;
            super.setImageBitmap(r1)
            r0.mBitmap = r1
            r0.setup()
            return
    }

    public void setImageDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            super.setImageDrawable(r1)
            android.graphics.Bitmap r1 = r0.getBitmapFromDrawable(r1)
            r0.mBitmap = r1
            r0.setup()
            return
    }

    public void setImageResource(int r1) {
            r0 = this;
            super.setImageResource(r1)
            android.graphics.drawable.Drawable r1 = r0.getDrawable()
            android.graphics.Bitmap r1 = r0.getBitmapFromDrawable(r1)
            r0.mBitmap = r1
            r0.setup()
            return
    }
}
