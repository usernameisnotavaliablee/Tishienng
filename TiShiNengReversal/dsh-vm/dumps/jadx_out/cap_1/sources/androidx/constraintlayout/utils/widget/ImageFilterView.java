package androidx.constraintlayout.utils.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class ImageFilterView extends androidx.appcompat.widget.AppCompatImageView {
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



    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class ImageMatrix {
        float[] m;
        float mBrightness;
        android.graphics.ColorMatrix mColorMatrix;
        float mContrast;
        float mSaturation;
        android.graphics.ColorMatrix mTmpColorMatrix;
        float mWarmth;

        ImageMatrix() {
                r1 = this;
                r1.<init>()
                r0 = 20
                float[] r0 = new float[r0]
                r1.m = r0
                android.graphics.ColorMatrix r0 = new android.graphics.ColorMatrix
                r0.<init>()
                r1.mColorMatrix = r0
                android.graphics.ColorMatrix r0 = new android.graphics.ColorMatrix
                r0.<init>()
                r1.mTmpColorMatrix = r0
                r0 = 1065353216(0x3f800000, float:1.0)
                r1.mBrightness = r0
                r1.mSaturation = r0
                r1.mContrast = r0
                r1.mWarmth = r0
                return
        }

        private void brightness(float r4) {
                r3 = this;
                float[] r0 = r3.m
                r1 = 0
                r0[r1] = r4
                r1 = 1
                r2 = 0
                r0[r1] = r2
                r1 = 2
                r0[r1] = r2
                r1 = 3
                r0[r1] = r2
                r1 = 4
                r0[r1] = r2
                r1 = 5
                r0[r1] = r2
                r1 = 6
                r0[r1] = r4
                r1 = 7
                r0[r1] = r2
                r1 = 8
                r0[r1] = r2
                r1 = 9
                r0[r1] = r2
                r1 = 10
                r0[r1] = r2
                r1 = 11
                r0[r1] = r2
                r1 = 12
                r0[r1] = r4
                r4 = 13
                r0[r4] = r2
                r4 = 14
                r0[r4] = r2
                r4 = 15
                r0[r4] = r2
                r4 = 16
                r0[r4] = r2
                r4 = 17
                r0[r4] = r2
                r4 = 18
                r1 = 1065353216(0x3f800000, float:1.0)
                r0[r4] = r1
                r4 = 19
                r0[r4] = r2
                return
        }

        private void saturation(float r9) {
                r8 = this;
                r0 = 1065353216(0x3f800000, float:1.0)
                float r1 = r0 - r9
                r2 = 1050250366(0x3e998c7e, float:0.2999)
                float r2 = r2 * r1
                r3 = 1058424226(0x3f1645a2, float:0.587)
                float r3 = r3 * r1
                r4 = 1038710997(0x3de978d5, float:0.114)
                float r1 = r1 * r4
                float[] r4 = r8.m
                r5 = 0
                float r6 = r2 + r9
                r4[r5] = r6
                r5 = 1
                r4[r5] = r3
                r5 = 2
                r4[r5] = r1
                r5 = 3
                r6 = 0
                r4[r5] = r6
                r5 = 4
                r4[r5] = r6
                r5 = 5
                r4[r5] = r2
                r5 = 6
                float r7 = r3 + r9
                r4[r5] = r7
                r5 = 7
                r4[r5] = r1
                r5 = 8
                r4[r5] = r6
                r5 = 9
                r4[r5] = r6
                r5 = 10
                r4[r5] = r2
                r2 = 11
                r4[r2] = r3
                r2 = 12
                float r1 = r1 + r9
                r4[r2] = r1
                r9 = 13
                r4[r9] = r6
                r9 = 14
                r4[r9] = r6
                r9 = 15
                r4[r9] = r6
                r9 = 16
                r4[r9] = r6
                r9 = 17
                r4[r9] = r6
                r9 = 18
                r4[r9] = r0
                r9 = 19
                r4[r9] = r6
                return
        }

        private void warmth(float r12) {
                r11 = this;
                r0 = 0
                int r1 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
                if (r1 > 0) goto L8
                r12 = 1008981770(0x3c23d70a, float:0.01)
            L8:
                r1 = 1167867904(0x459c4000, float:5000.0)
                float r1 = r1 / r12
                r12 = 1120403456(0x42c80000, float:100.0)
                float r1 = r1 / r12
                r12 = 1126243996(0x43211e9c, float:161.11957)
                r2 = 1120334093(0x42c6f10d, float:99.4708)
                r3 = 1115947008(0x42840000, float:66.0)
                r4 = 1132396544(0x437f0000, float:255.0)
                int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r5 <= 0) goto L41
                r5 = 1114636288(0x42700000, float:60.0)
                float r5 = r1 - r5
                double r5 = (double) r5
                r7 = -4629404809370271744(0xbfc10cda80000000, double:-0.13320475816726685)
                double r7 = java.lang.Math.pow(r5, r7)
                float r7 = (float) r7
                r8 = 1134877040(0x43a4d970, float:329.69873)
                float r7 = r7 * r8
                r8 = 4590105838747648000(0x3fb354f0e0000000, double:0.07551484555006027)
                double r5 = java.lang.Math.pow(r5, r8)
                float r5 = (float) r5
                r6 = 1133514659(0x43900fa3, float:288.12216)
                float r5 = r5 * r6
                goto L4c
            L41:
                double r5 = (double) r1
                double r5 = java.lang.Math.log(r5)
                float r5 = (float) r5
                float r5 = r5 * r2
                float r5 = r5 - r12
                r7 = 1132396544(0x437f0000, float:255.0)
            L4c:
                r6 = 1134069180(0x439885bc, float:305.0448)
                r8 = 1124762762(0x430a848a, float:138.51773)
                int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r3 >= 0) goto L6b
                r3 = 1100480512(0x41980000, float:19.0)
                int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r3 <= 0) goto L69
                r3 = 1092616192(0x41200000, float:10.0)
                float r1 = r1 - r3
                double r9 = (double) r1
                double r9 = java.lang.Math.log(r9)
                float r1 = (float) r9
                float r1 = r1 * r8
                float r1 = r1 - r6
                goto L6d
            L69:
                r1 = 0
                goto L6d
            L6b:
                r1 = 1132396544(0x437f0000, float:255.0)
            L6d:
                float r3 = java.lang.Math.max(r7, r0)
                float r3 = java.lang.Math.min(r4, r3)
                float r5 = java.lang.Math.max(r5, r0)
                float r5 = java.lang.Math.min(r4, r5)
                float r1 = java.lang.Math.max(r1, r0)
                float r1 = java.lang.Math.min(r4, r1)
                r7 = 1112014848(0x42480000, float:50.0)
                double r9 = (double) r7
                double r9 = java.lang.Math.log(r9)
                float r7 = (float) r9
                float r7 = r7 * r2
                float r7 = r7 - r12
                r12 = 1109393408(0x42200000, float:40.0)
                double r9 = (double) r12
                double r9 = java.lang.Math.log(r9)
                float r12 = (float) r9
                float r12 = r12 * r8
                float r12 = r12 - r6
                float r2 = java.lang.Math.max(r4, r0)
                float r2 = java.lang.Math.min(r4, r2)
                float r6 = java.lang.Math.max(r7, r0)
                float r6 = java.lang.Math.min(r4, r6)
                float r12 = java.lang.Math.max(r12, r0)
                float r12 = java.lang.Math.min(r4, r12)
                float r3 = r3 / r2
                float r5 = r5 / r6
                float r1 = r1 / r12
                float[] r12 = r11.m
                r2 = 0
                r12[r2] = r3
                r2 = 1
                r12[r2] = r0
                r2 = 2
                r12[r2] = r0
                r2 = 3
                r12[r2] = r0
                r2 = 4
                r12[r2] = r0
                r2 = 5
                r12[r2] = r0
                r2 = 6
                r12[r2] = r5
                r2 = 7
                r12[r2] = r0
                r2 = 8
                r12[r2] = r0
                r2 = 9
                r12[r2] = r0
                r2 = 10
                r12[r2] = r0
                r2 = 11
                r12[r2] = r0
                r2 = 12
                r12[r2] = r1
                r1 = 13
                r12[r1] = r0
                r1 = 14
                r12[r1] = r0
                r1 = 15
                r12[r1] = r0
                r1 = 16
                r12[r1] = r0
                r1 = 17
                r12[r1] = r0
                r1 = 18
                r2 = 1065353216(0x3f800000, float:1.0)
                r12[r1] = r2
                r1 = 19
                r12[r1] = r0
                return
        }

        void updateMatrix(android.widget.ImageView r6) {
                r5 = this;
                android.graphics.ColorMatrix r0 = r5.mColorMatrix
                r0.reset()
                float r0 = r5.mSaturation
                r1 = 1
                r2 = 1065353216(0x3f800000, float:1.0)
                int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r3 == 0) goto L1a
                r5.saturation(r0)
                android.graphics.ColorMatrix r0 = r5.mColorMatrix
                float[] r3 = r5.m
                r0.set(r3)
                r0 = 1
                goto L1b
            L1a:
                r0 = 0
            L1b:
                float r3 = r5.mContrast
                int r4 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
                if (r4 == 0) goto L2e
                android.graphics.ColorMatrix r0 = r5.mTmpColorMatrix
                r0.setScale(r3, r3, r3, r2)
                android.graphics.ColorMatrix r0 = r5.mColorMatrix
                android.graphics.ColorMatrix r3 = r5.mTmpColorMatrix
                r0.postConcat(r3)
                r0 = 1
            L2e:
                float r3 = r5.mWarmth
                int r4 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
                if (r4 == 0) goto L46
                r5.warmth(r3)
                android.graphics.ColorMatrix r0 = r5.mTmpColorMatrix
                float[] r3 = r5.m
                r0.set(r3)
                android.graphics.ColorMatrix r0 = r5.mColorMatrix
                android.graphics.ColorMatrix r3 = r5.mTmpColorMatrix
                r0.postConcat(r3)
                r0 = 1
            L46:
                float r3 = r5.mBrightness
                int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
                if (r2 == 0) goto L5e
                r5.brightness(r3)
                android.graphics.ColorMatrix r0 = r5.mTmpColorMatrix
                float[] r2 = r5.m
                r0.set(r2)
                android.graphics.ColorMatrix r0 = r5.mColorMatrix
                android.graphics.ColorMatrix r2 = r5.mTmpColorMatrix
                r0.postConcat(r2)
                goto L5f
            L5e:
                r1 = r0
            L5f:
                if (r1 == 0) goto L6c
                android.graphics.ColorMatrixColorFilter r0 = new android.graphics.ColorMatrixColorFilter
                android.graphics.ColorMatrix r1 = r5.mColorMatrix
                r0.<init>(r1)
                r6.setColorFilter(r0)
                return
            L6c:
                r6.clearColorFilter()
                return
        }
    }

    public ImageFilterView(android.content.Context r2) {
            r1 = this;
            r1.<init>(r2)
            androidx.constraintlayout.utils.widget.ImageFilterView$ImageMatrix r0 = new androidx.constraintlayout.utils.widget.ImageFilterView$ImageMatrix
            r0.<init>()
            r1.mImageMatrix = r0
            r0 = 1
            r1.mOverlay = r0
            r0 = 0
            r1.mCrossfade = r0
            r1.mRoundPercent = r0
            r0 = 2143289344(0x7fc00000, float:NaN)
            r1.mRound = r0
            r0 = 0
            r1.init(r2, r0)
            return
    }

    public ImageFilterView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r1.<init>(r2, r3)
            androidx.constraintlayout.utils.widget.ImageFilterView$ImageMatrix r0 = new androidx.constraintlayout.utils.widget.ImageFilterView$ImageMatrix
            r0.<init>()
            r1.mImageMatrix = r0
            r0 = 1
            r1.mOverlay = r0
            r0 = 0
            r1.mCrossfade = r0
            r1.mRoundPercent = r0
            r0 = 2143289344(0x7fc00000, float:NaN)
            r1.mRound = r0
            r1.init(r2, r3)
            return
    }

    public ImageFilterView(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            androidx.constraintlayout.utils.widget.ImageFilterView$ImageMatrix r3 = new androidx.constraintlayout.utils.widget.ImageFilterView$ImageMatrix
            r3.<init>()
            r0.mImageMatrix = r3
            r3 = 1
            r0.mOverlay = r3
            r3 = 0
            r0.mCrossfade = r3
            r0.mRoundPercent = r3
            r3 = 2143289344(0x7fc00000, float:NaN)
            r0.mRound = r3
            r0.init(r1, r2)
            return
    }

    static /* synthetic */ float access$000(androidx.constraintlayout.utils.widget.ImageFilterView r0) {
            float r0 = r0.mRoundPercent
            return r0
    }

    static /* synthetic */ float access$100(androidx.constraintlayout.utils.widget.ImageFilterView r0) {
            float r0 = r0.mRound
            return r0
    }

    private void init(android.content.Context r7, android.util.AttributeSet r8) {
            r6 = this;
            if (r8 == 0) goto La7
            android.content.Context r7 = r6.getContext()
            int[] r0 = androidx.constraintlayout.widget.R.styleable.ImageFilterView
            android.content.res.TypedArray r7 = r7.obtainStyledAttributes(r8, r0)
            int r8 = r7.getIndexCount()
            int r0 = androidx.constraintlayout.widget.R.styleable.ImageFilterView_altSrc
            android.graphics.drawable.Drawable r0 = r7.getDrawable(r0)
            r1 = 0
            r2 = 0
        L18:
            if (r2 >= r8) goto L76
            int r3 = r7.getIndex(r2)
            int r4 = androidx.constraintlayout.widget.R.styleable.ImageFilterView_crossfade
            r5 = 0
            if (r3 != r4) goto L2a
            float r3 = r7.getFloat(r3, r5)
            r6.mCrossfade = r3
            goto L73
        L2a:
            int r4 = androidx.constraintlayout.widget.R.styleable.ImageFilterView_warmth
            if (r3 != r4) goto L36
            float r3 = r7.getFloat(r3, r5)
            r6.setWarmth(r3)
            goto L73
        L36:
            int r4 = androidx.constraintlayout.widget.R.styleable.ImageFilterView_saturation
            if (r3 != r4) goto L42
            float r3 = r7.getFloat(r3, r5)
            r6.setSaturation(r3)
            goto L73
        L42:
            int r4 = androidx.constraintlayout.widget.R.styleable.ImageFilterView_contrast
            if (r3 != r4) goto L4e
            float r3 = r7.getFloat(r3, r5)
            r6.setContrast(r3)
            goto L73
        L4e:
            int r4 = androidx.constraintlayout.widget.R.styleable.ImageFilterView_round
            if (r3 != r4) goto L5a
            float r3 = r7.getDimension(r3, r5)
            r6.setRound(r3)
            goto L73
        L5a:
            int r4 = androidx.constraintlayout.widget.R.styleable.ImageFilterView_roundPercent
            if (r3 != r4) goto L66
            float r3 = r7.getFloat(r3, r5)
            r6.setRoundPercent(r3)
            goto L73
        L66:
            int r4 = androidx.constraintlayout.widget.R.styleable.ImageFilterView_overlay
            if (r3 != r4) goto L73
            boolean r4 = r6.mOverlay
            boolean r3 = r7.getBoolean(r3, r4)
            r6.setOverlay(r3)
        L73:
            int r2 = r2 + 1
            goto L18
        L76:
            r7.recycle()
            if (r0 == 0) goto La7
            r7 = 2
            android.graphics.drawable.Drawable[] r7 = new android.graphics.drawable.Drawable[r7]
            r6.mLayers = r7
            android.graphics.drawable.Drawable r8 = r6.getDrawable()
            r7[r1] = r8
            android.graphics.drawable.Drawable[] r7 = r6.mLayers
            r8 = 1
            r7[r8] = r0
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
        La7:
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

    public float getBrightness() {
            r1 = this;
            androidx.constraintlayout.utils.widget.ImageFilterView$ImageMatrix r0 = r1.mImageMatrix
            float r0 = r0.mBrightness
            return r0
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
            androidx.constraintlayout.utils.widget.ImageFilterView$2 r5 = new androidx.constraintlayout.utils.widget.ImageFilterView$2
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
            androidx.constraintlayout.utils.widget.ImageFilterView$1 r6 = new androidx.constraintlayout.utils.widget.ImageFilterView$1
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
