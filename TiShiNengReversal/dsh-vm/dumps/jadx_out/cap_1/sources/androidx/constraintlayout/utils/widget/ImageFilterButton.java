package androidx.constraintlayout.utils.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class ImageFilterButton extends androidx.appcompat.widget.AppCompatImageButton {
    private float mCrossfade;
    private androidx.constraintlayout.utils.widget.ImageFilterView.ImageMatrix mImageMatrix;
    android.graphics.drawable.LayerDrawable mLayer;
    android.graphics.drawable.Drawable[] mLayers;
    private boolean mOverlay;
    private android.graphics.Path mPath;
    android.graphics.RectF mRect;
    private float mRound;
    private float mRoundPercent;
    android.view.ViewOutlineProvider mViewOutlineProvider;



    public ImageFilterButton(android.content.Context r2) {
            r1 = this;
            r1.<init>(r2)
            androidx.constraintlayout.utils.widget.ImageFilterView$ImageMatrix r0 = new androidx.constraintlayout.utils.widget.ImageFilterView$ImageMatrix
            r0.<init>()
            r1.mImageMatrix = r0
            r0 = 0
            r1.mCrossfade = r0
            r1.mRoundPercent = r0
            r0 = 2143289344(0x7fc00000, float:NaN)
            r1.mRound = r0
            r0 = 1
            r1.mOverlay = r0
            r0 = 0
            r1.init(r2, r0)
            return
    }

    public ImageFilterButton(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r1.<init>(r2, r3)
            androidx.constraintlayout.utils.widget.ImageFilterView$ImageMatrix r0 = new androidx.constraintlayout.utils.widget.ImageFilterView$ImageMatrix
            r0.<init>()
            r1.mImageMatrix = r0
            r0 = 0
            r1.mCrossfade = r0
            r1.mRoundPercent = r0
            r0 = 2143289344(0x7fc00000, float:NaN)
            r1.mRound = r0
            r0 = 1
            r1.mOverlay = r0
            r1.init(r2, r3)
            return
    }

    public ImageFilterButton(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            androidx.constraintlayout.utils.widget.ImageFilterView$ImageMatrix r3 = new androidx.constraintlayout.utils.widget.ImageFilterView$ImageMatrix
            r3.<init>()
            r0.mImageMatrix = r3
            r3 = 0
            r0.mCrossfade = r3
            r0.mRoundPercent = r3
            r3 = 2143289344(0x7fc00000, float:NaN)
            r0.mRound = r3
            r3 = 1
            r0.mOverlay = r3
            r0.init(r1, r2)
            return
    }

    static /* synthetic */ float access$000(androidx.constraintlayout.utils.widget.ImageFilterButton r0) {
            float r0 = r0.mRoundPercent
            return r0
    }

    static /* synthetic */ float access$100(androidx.constraintlayout.utils.widget.ImageFilterButton r0) {
            float r0 = r0.mRound
            return r0
    }

    private void init(android.content.Context r7, android.util.AttributeSet r8) {
            r6 = this;
            r7 = 0
            r6.setPadding(r7, r7, r7, r7)
            if (r8 == 0) goto Laa
            android.content.Context r0 = r6.getContext()
            int[] r1 = androidx.constraintlayout.widget.R.styleable.ImageFilterView
            android.content.res.TypedArray r8 = r0.obtainStyledAttributes(r8, r1)
            int r0 = r8.getIndexCount()
            int r1 = androidx.constraintlayout.widget.R.styleable.ImageFilterView_altSrc
            android.graphics.drawable.Drawable r1 = r8.getDrawable(r1)
            r2 = 0
        L1b:
            if (r2 >= r0) goto L79
            int r3 = r8.getIndex(r2)
            int r4 = androidx.constraintlayout.widget.R.styleable.ImageFilterView_crossfade
            r5 = 0
            if (r3 != r4) goto L2d
            float r3 = r8.getFloat(r3, r5)
            r6.mCrossfade = r3
            goto L76
        L2d:
            int r4 = androidx.constraintlayout.widget.R.styleable.ImageFilterView_warmth
            if (r3 != r4) goto L39
            float r3 = r8.getFloat(r3, r5)
            r6.setWarmth(r3)
            goto L76
        L39:
            int r4 = androidx.constraintlayout.widget.R.styleable.ImageFilterView_saturation
            if (r3 != r4) goto L45
            float r3 = r8.getFloat(r3, r5)
            r6.setSaturation(r3)
            goto L76
        L45:
            int r4 = androidx.constraintlayout.widget.R.styleable.ImageFilterView_contrast
            if (r3 != r4) goto L51
            float r3 = r8.getFloat(r3, r5)
            r6.setContrast(r3)
            goto L76
        L51:
            int r4 = androidx.constraintlayout.widget.R.styleable.ImageFilterView_round
            if (r3 != r4) goto L5d
            float r3 = r8.getDimension(r3, r5)
            r6.setRound(r3)
            goto L76
        L5d:
            int r4 = androidx.constraintlayout.widget.R.styleable.ImageFilterView_roundPercent
            if (r3 != r4) goto L69
            float r3 = r8.getFloat(r3, r5)
            r6.setRoundPercent(r3)
            goto L76
        L69:
            int r4 = androidx.constraintlayout.widget.R.styleable.ImageFilterView_overlay
            if (r3 != r4) goto L76
            boolean r4 = r6.mOverlay
            boolean r3 = r8.getBoolean(r3, r4)
            r6.setOverlay(r3)
        L76:
            int r2 = r2 + 1
            goto L1b
        L79:
            r8.recycle()
            if (r1 == 0) goto Laa
            r8 = 2
            android.graphics.drawable.Drawable[] r8 = new android.graphics.drawable.Drawable[r8]
            r6.mLayers = r8
            android.graphics.drawable.Drawable r0 = r6.getDrawable()
            r8[r7] = r0
            android.graphics.drawable.Drawable[] r7 = r6.mLayers
            r8 = 1
            r7[r8] = r1
            android.graphics.drawable.LayerDrawable r7 = new android.graphics.drawable.LayerDrawable
            android.graphics.drawable.Drawable[] r0 = r6.mLayers
            r7.<init>(r0)
            r6.mLayer = r7
            android.graphics.drawable.Drawable r7 = r7.getDrawable(r8)
            r8 = 1132396544(0x437f0000, float:255.0)
            float r0 = r6.mCrossfade
            float r0 = r0 * r8
            int r8 = (int) r0
            r7.setAlpha(r8)
            android.graphics.drawable.LayerDrawable r7 = r6.mLayer
            super.setImageDrawable(r7)
        Laa:
            return
    }

    private void setOverlay(boolean r1) {
            r0 = this;
            r0.mOverlay = r1
            return
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas r1) {
            r0 = this;
            super.draw(r1)
            return
    }

    public float getContrast() {
            r1 = this;
            androidx.constraintlayout.utils.widget.ImageFilterView$ImageMatrix r0 = r1.mImageMatrix
            float r0 = r0.mContrast
            return r0
    }

    public float getCrossfade() {
            r1 = this;
            float r0 = r1.mCrossfade
            return r0
    }

    public float getRound() {
            r1 = this;
            float r0 = r1.mRound
            return r0
    }

    public float getRoundPercent() {
            r1 = this;
            float r0 = r1.mRoundPercent
            return r0
    }

    public float getSaturation() {
            r1 = this;
            androidx.constraintlayout.utils.widget.ImageFilterView$ImageMatrix r0 = r1.mImageMatrix
            float r0 = r0.mSaturation
            return r0
    }

    public float getWarmth() {
            r1 = this;
            androidx.constraintlayout.utils.widget.ImageFilterView$ImageMatrix r0 = r1.mImageMatrix
            float r0 = r0.mWarmth
            return r0
    }

    public void setBrightness(float r2) {
            r1 = this;
            androidx.constraintlayout.utils.widget.ImageFilterView$ImageMatrix r0 = r1.mImageMatrix
            r0.mBrightness = r2
            r0.updateMatrix(r1)
            return
    }

    public void setContrast(float r2) {
            r1 = this;
            androidx.constraintlayout.utils.widget.ImageFilterView$ImageMatrix r0 = r1.mImageMatrix
            r0.mContrast = r2
            r0.updateMatrix(r1)
            return
    }

    public void setCrossfade(float r4) {
            r3 = this;
            r3.mCrossfade = r4
            android.graphics.drawable.Drawable[] r4 = r3.mLayers
            if (r4 == 0) goto L32
            boolean r4 = r3.mOverlay
            r0 = 1132396544(0x437f0000, float:255.0)
            if (r4 != 0) goto L1e
            android.graphics.drawable.LayerDrawable r4 = r3.mLayer
            r1 = 0
            android.graphics.drawable.Drawable r4 = r4.getDrawable(r1)
            r1 = 1065353216(0x3f800000, float:1.0)
            float r2 = r3.mCrossfade
            float r1 = r1 - r2
            float r1 = r1 * r0
            int r1 = (int) r1
            r4.setAlpha(r1)
        L1e:
            android.graphics.drawable.LayerDrawable r4 = r3.mLayer
            r1 = 1
            android.graphics.drawable.Drawable r4 = r4.getDrawable(r1)
            float r1 = r3.mCrossfade
            float r1 = r1 * r0
            int r0 = (int) r1
            r4.setAlpha(r0)
            android.graphics.drawable.LayerDrawable r4 = r3.mLayer
            super.setImageDrawable(r4)
        L32:
            return
    }

    @androidx.annotation.RequiresApi(21)
    public void setRound(float r5) {
            r4 = this;
            boolean r0 = java.lang.Float.isNaN(r5)
            if (r0 == 0) goto L12
            r4.mRound = r5
            float r5 = r4.mRoundPercent
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r4.mRoundPercent = r0
            r4.setRoundPercent(r5)
            return
        L12:
            float r0 = r4.mRound
            r1 = 0
            r2 = 1
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 == 0) goto L1c
            r0 = 1
            goto L1d
        L1c:
            r0 = 0
        L1d:
            r4.mRound = r5
            r3 = 0
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 == 0) goto L6b
            android.graphics.Path r5 = r4.mPath
            if (r5 != 0) goto L2f
            android.graphics.Path r5 = new android.graphics.Path
            r5.<init>()
            r4.mPath = r5
        L2f:
            android.graphics.RectF r5 = r4.mRect
            if (r5 != 0) goto L3a
            android.graphics.RectF r5 = new android.graphics.RectF
            r5.<init>()
            r4.mRect = r5
        L3a:
            android.view.ViewOutlineProvider r5 = r4.mViewOutlineProvider
            if (r5 != 0) goto L48
            androidx.constraintlayout.utils.widget.ImageFilterButton$2 r5 = new androidx.constraintlayout.utils.widget.ImageFilterButton$2
            r5.<init>(r4)
            r4.mViewOutlineProvider = r5
            r4.setOutlineProvider(r5)
        L48:
            r4.setClipToOutline(r2)
            int r5 = r4.getWidth()
            int r1 = r4.getHeight()
            android.graphics.RectF r2 = r4.mRect
            float r5 = (float) r5
            float r1 = (float) r1
            r2.set(r3, r3, r5, r1)
            android.graphics.Path r5 = r4.mPath
            r5.reset()
            android.graphics.Path r5 = r4.mPath
            android.graphics.RectF r1 = r4.mRect
            float r2 = r4.mRound
            android.graphics.Path$Direction r3 = android.graphics.Path.Direction.CW
            r5.addRoundRect(r1, r2, r2, r3)
            goto L6e
        L6b:
            r4.setClipToOutline(r1)
        L6e:
            if (r0 == 0) goto L73
            r4.invalidateOutline()
        L73:
            return
    }

    @androidx.annotation.RequiresApi(21)
    public void setRoundPercent(float r6) {
            r5 = this;
            float r0 = r5.mRoundPercent
            r1 = 0
            r2 = 1
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 == 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            r5.mRoundPercent = r6
            r3 = 0
            int r6 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r6 == 0) goto L63
            android.graphics.Path r6 = r5.mPath
            if (r6 != 0) goto L1d
            android.graphics.Path r6 = new android.graphics.Path
            r6.<init>()
            r5.mPath = r6
        L1d:
            android.graphics.RectF r6 = r5.mRect
            if (r6 != 0) goto L28
            android.graphics.RectF r6 = new android.graphics.RectF
            r6.<init>()
            r5.mRect = r6
        L28:
            android.view.ViewOutlineProvider r6 = r5.mViewOutlineProvider
            if (r6 != 0) goto L36
            androidx.constraintlayout.utils.widget.ImageFilterButton$1 r6 = new androidx.constraintlayout.utils.widget.ImageFilterButton$1
            r6.<init>(r5)
            r5.mViewOutlineProvider = r6
            r5.setOutlineProvider(r6)
        L36:
            r5.setClipToOutline(r2)
            int r6 = r5.getWidth()
            int r1 = r5.getHeight()
            int r2 = java.lang.Math.min(r6, r1)
            float r2 = (float) r2
            float r4 = r5.mRoundPercent
            float r2 = r2 * r4
            r4 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r4
            android.graphics.RectF r4 = r5.mRect
            float r6 = (float) r6
            float r1 = (float) r1
            r4.set(r3, r3, r6, r1)
            android.graphics.Path r6 = r5.mPath
            r6.reset()
            android.graphics.Path r6 = r5.mPath
            android.graphics.RectF r1 = r5.mRect
            android.graphics.Path$Direction r3 = android.graphics.Path.Direction.CW
            r6.addRoundRect(r1, r2, r2, r3)
            goto L66
        L63:
            r5.setClipToOutline(r1)
        L66:
            if (r0 == 0) goto L6b
            r5.invalidateOutline()
        L6b:
            return
    }

    public void setSaturation(float r2) {
            r1 = this;
            androidx.constraintlayout.utils.widget.ImageFilterView$ImageMatrix r0 = r1.mImageMatrix
            r0.mSaturation = r2
            r0.updateMatrix(r1)
            return
    }

    public void setWarmth(float r2) {
            r1 = this;
            androidx.constraintlayout.utils.widget.ImageFilterView$ImageMatrix r0 = r1.mImageMatrix
            r0.mWarmth = r2
            r0.updateMatrix(r1)
            return
    }
}
