package com.daimajia.numberprogressbar;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class NumberProgressBar extends android.view.View {
    private static final java.lang.String INSTANCE_MAX = "max";
    private static final java.lang.String INSTANCE_PREFIX = "prefix";
    private static final java.lang.String INSTANCE_PROGRESS = "progress";
    private static final java.lang.String INSTANCE_REACHED_BAR_COLOR = "reached_bar_color";
    private static final java.lang.String INSTANCE_REACHED_BAR_HEIGHT = "reached_bar_height";
    private static final java.lang.String INSTANCE_STATE = "saved_instance";
    private static final java.lang.String INSTANCE_SUFFIX = "suffix";
    private static final java.lang.String INSTANCE_TEXT_COLOR = "text_color";
    private static final java.lang.String INSTANCE_TEXT_SIZE = "text_size";
    private static final java.lang.String INSTANCE_TEXT_VISIBILITY = "text_visibility";
    private static final java.lang.String INSTANCE_UNREACHED_BAR_COLOR = "unreached_bar_color";
    private static final java.lang.String INSTANCE_UNREACHED_BAR_HEIGHT = "unreached_bar_height";
    private static final int PROGRESS_TEXT_VISIBLE = 0;
    private final float default_progress_text_offset;
    private final float default_reached_bar_height;
    private final int default_reached_color;
    private final int default_text_color;
    private final float default_text_size;
    private final float default_unreached_bar_height;
    private final int default_unreached_color;
    private java.lang.String mCurrentDrawText;
    private int mCurrentProgress;
    private boolean mDrawReachedBar;
    private float mDrawTextEnd;
    private float mDrawTextStart;
    private float mDrawTextWidth;
    private boolean mDrawUnreachedBar;
    private boolean mIfDrawText;
    private com.daimajia.numberprogressbar.OnProgressBarListener mListener;
    private int mMaxProgress;
    private float mOffset;
    private java.lang.String mPrefix;
    private int mReachedBarColor;
    private float mReachedBarHeight;
    private android.graphics.Paint mReachedBarPaint;
    private android.graphics.RectF mReachedRectF;
    private java.lang.String mSuffix;
    private int mTextColor;
    private android.graphics.Paint mTextPaint;
    private float mTextSize;
    private int mUnreachedBarColor;
    private float mUnreachedBarHeight;
    private android.graphics.Paint mUnreachedBarPaint;
    private android.graphics.RectF mUnreachedRectF;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum ProgressTextVisibility extends java.lang.Enum<com.daimajia.numberprogressbar.NumberProgressBar.ProgressTextVisibility> {
        private static final /* synthetic */ com.daimajia.numberprogressbar.NumberProgressBar.ProgressTextVisibility[] $VALUES = null;
        public static final com.daimajia.numberprogressbar.NumberProgressBar.ProgressTextVisibility Invisible = null;
        public static final com.daimajia.numberprogressbar.NumberProgressBar.ProgressTextVisibility Visible = null;

        static {
                com.daimajia.numberprogressbar.NumberProgressBar$ProgressTextVisibility r0 = new com.daimajia.numberprogressbar.NumberProgressBar$ProgressTextVisibility
                java.lang.String r1 = "Visible"
                r2 = 0
                r0.<init>(r1, r2)
                com.daimajia.numberprogressbar.NumberProgressBar.ProgressTextVisibility.Visible = r0
                com.daimajia.numberprogressbar.NumberProgressBar$ProgressTextVisibility r1 = new com.daimajia.numberprogressbar.NumberProgressBar$ProgressTextVisibility
                java.lang.String r3 = "Invisible"
                r4 = 1
                r1.<init>(r3, r4)
                com.daimajia.numberprogressbar.NumberProgressBar.ProgressTextVisibility.Invisible = r1
                r3 = 2
                com.daimajia.numberprogressbar.NumberProgressBar$ProgressTextVisibility[] r3 = new com.daimajia.numberprogressbar.NumberProgressBar.ProgressTextVisibility[r3]
                r3[r2] = r0
                r3[r4] = r1
                com.daimajia.numberprogressbar.NumberProgressBar.ProgressTextVisibility.$VALUES = r3
                return
        }

        ProgressTextVisibility(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.daimajia.numberprogressbar.NumberProgressBar.ProgressTextVisibility valueOf(java.lang.String r1) {
                java.lang.Class<com.daimajia.numberprogressbar.NumberProgressBar$ProgressTextVisibility> r0 = com.daimajia.numberprogressbar.NumberProgressBar.ProgressTextVisibility.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.daimajia.numberprogressbar.NumberProgressBar$ProgressTextVisibility r1 = (com.daimajia.numberprogressbar.NumberProgressBar.ProgressTextVisibility) r1
                return r1
        }

        public static com.daimajia.numberprogressbar.NumberProgressBar.ProgressTextVisibility[] values() {
                com.daimajia.numberprogressbar.NumberProgressBar$ProgressTextVisibility[] r0 = com.daimajia.numberprogressbar.NumberProgressBar.ProgressTextVisibility.$VALUES
                java.lang.Object r0 = r0.clone()
                com.daimajia.numberprogressbar.NumberProgressBar$ProgressTextVisibility[] r0 = (com.daimajia.numberprogressbar.NumberProgressBar.ProgressTextVisibility[]) r0
                return r0
        }
    }

    public NumberProgressBar(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public NumberProgressBar(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public NumberProgressBar(android.content.Context r11, android.util.AttributeSet r12, int r13) {
            r10 = this;
            r10.<init>(r11, r12, r13)
            r0 = 100
            r10.mMaxProgress = r0
            r1 = 0
            r10.mCurrentProgress = r1
            java.lang.String r2 = "%"
            r10.mSuffix = r2
            java.lang.String r2 = ""
            r10.mPrefix = r2
            r2 = 66
            r3 = 145(0x91, float:2.03E-43)
            r4 = 241(0xf1, float:3.38E-43)
            int r5 = android.graphics.Color.rgb(r2, r3, r4)
            r10.default_text_color = r5
            int r2 = android.graphics.Color.rgb(r2, r3, r4)
            r10.default_reached_color = r2
            r3 = 204(0xcc, float:2.86E-43)
            int r3 = android.graphics.Color.rgb(r3, r3, r3)
            r10.default_unreached_color = r3
            android.graphics.RectF r4 = new android.graphics.RectF
            r6 = 0
            r4.<init>(r6, r6, r6, r6)
            r10.mUnreachedRectF = r4
            android.graphics.RectF r4 = new android.graphics.RectF
            r4.<init>(r6, r6, r6, r6)
            r10.mReachedRectF = r4
            r4 = 1
            r10.mDrawUnreachedBar = r4
            r10.mDrawReachedBar = r4
            r10.mIfDrawText = r4
            r4 = 1069547520(0x3fc00000, float:1.5)
            float r4 = r10.dp2px(r4)
            r10.default_reached_bar_height = r4
            r6 = 1065353216(0x3f800000, float:1.0)
            float r6 = r10.dp2px(r6)
            r10.default_unreached_bar_height = r6
            r7 = 1092616192(0x41200000, float:10.0)
            float r7 = r10.sp2px(r7)
            r10.default_text_size = r7
            r8 = 1077936128(0x40400000, float:3.0)
            float r8 = r10.dp2px(r8)
            r10.default_progress_text_offset = r8
            android.content.res.Resources$Theme r11 = r11.getTheme()
            int[] r9 = com.daimajia.numberprogressbar.R.styleable.NumberProgressBar
            android.content.res.TypedArray r11 = r11.obtainStyledAttributes(r12, r9, r13, r1)
            int r12 = com.daimajia.numberprogressbar.R.styleable.NumberProgressBar_progress_reached_color
            int r12 = r11.getColor(r12, r2)
            r10.mReachedBarColor = r12
            int r12 = com.daimajia.numberprogressbar.R.styleable.NumberProgressBar_progress_unreached_color
            int r12 = r11.getColor(r12, r3)
            r10.mUnreachedBarColor = r12
            int r12 = com.daimajia.numberprogressbar.R.styleable.NumberProgressBar_progress_text_color
            int r12 = r11.getColor(r12, r5)
            r10.mTextColor = r12
            int r12 = com.daimajia.numberprogressbar.R.styleable.NumberProgressBar_progress_text_size
            float r12 = r11.getDimension(r12, r7)
            r10.mTextSize = r12
            int r12 = com.daimajia.numberprogressbar.R.styleable.NumberProgressBar_progress_reached_bar_height
            float r12 = r11.getDimension(r12, r4)
            r10.mReachedBarHeight = r12
            int r12 = com.daimajia.numberprogressbar.R.styleable.NumberProgressBar_progress_unreached_bar_height
            float r12 = r11.getDimension(r12, r6)
            r10.mUnreachedBarHeight = r12
            int r12 = com.daimajia.numberprogressbar.R.styleable.NumberProgressBar_progress_text_offset
            float r12 = r11.getDimension(r12, r8)
            r10.mOffset = r12
            int r12 = com.daimajia.numberprogressbar.R.styleable.NumberProgressBar_progress_text_visibility
            int r12 = r11.getInt(r12, r1)
            if (r12 == 0) goto Lae
            r10.mIfDrawText = r1
        Lae:
            int r12 = com.daimajia.numberprogressbar.R.styleable.NumberProgressBar_progress_current
            int r12 = r11.getInt(r12, r1)
            r10.setProgress(r12)
            int r12 = com.daimajia.numberprogressbar.R.styleable.NumberProgressBar_progress_max
            int r12 = r11.getInt(r12, r0)
            r10.setMax(r12)
            r11.recycle()
            r10.initializePainters()
            return
    }

    private void calculateDrawRectF() {
            r7 = this;
            int r0 = r7.getProgress()
            int r0 = r0 * 100
            int r1 = r7.getMax()
            int r0 = r0 / r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r3 = 0
            r2[r3] = r0
            java.lang.String r0 = "%d"
            java.lang.String r0 = java.lang.String.format(r0, r2)
            r7.mCurrentDrawText = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = r7.mPrefix
            r0.append(r2)
            java.lang.String r2 = r7.mCurrentDrawText
            r0.append(r2)
            java.lang.String r2 = r7.mSuffix
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r7.mCurrentDrawText = r0
            android.graphics.Paint r2 = r7.mTextPaint
            float r0 = r2.measureText(r0)
            r7.mDrawTextWidth = r0
            int r0 = r7.getProgress()
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 != 0) goto L51
            r7.mDrawReachedBar = r3
            int r0 = r7.getPaddingLeft()
            float r0 = (float) r0
            r7.mDrawTextStart = r0
            goto Lae
        L51:
            r7.mDrawReachedBar = r1
            android.graphics.RectF r0 = r7.mReachedRectF
            int r4 = r7.getPaddingLeft()
            float r4 = (float) r4
            r0.left = r4
            android.graphics.RectF r0 = r7.mReachedRectF
            int r4 = r7.getHeight()
            float r4 = (float) r4
            float r4 = r4 / r2
            float r5 = r7.mReachedBarHeight
            float r5 = r5 / r2
            float r4 = r4 - r5
            r0.top = r4
            android.graphics.RectF r0 = r7.mReachedRectF
            int r4 = r7.getWidth()
            int r5 = r7.getPaddingLeft()
            int r4 = r4 - r5
            int r5 = r7.getPaddingRight()
            int r4 = r4 - r5
            float r4 = (float) r4
            int r5 = r7.getMax()
            float r5 = (float) r5
            r6 = 1065353216(0x3f800000, float:1.0)
            float r5 = r5 * r6
            float r4 = r4 / r5
            int r5 = r7.getProgress()
            float r5 = (float) r5
            float r4 = r4 * r5
            float r5 = r7.mOffset
            float r4 = r4 - r5
            int r5 = r7.getPaddingLeft()
            float r5 = (float) r5
            float r4 = r4 + r5
            r0.right = r4
            android.graphics.RectF r0 = r7.mReachedRectF
            int r4 = r7.getHeight()
            float r4 = (float) r4
            float r4 = r4 / r2
            float r5 = r7.mReachedBarHeight
            float r5 = r5 / r2
            float r4 = r4 + r5
            r0.bottom = r4
            android.graphics.RectF r0 = r7.mReachedRectF
            float r0 = r0.right
            float r4 = r7.mOffset
            float r0 = r0 + r4
            r7.mDrawTextStart = r0
        Lae:
            int r0 = r7.getHeight()
            float r0 = (float) r0
            float r0 = r0 / r2
            android.graphics.Paint r4 = r7.mTextPaint
            float r4 = r4.descent()
            android.graphics.Paint r5 = r7.mTextPaint
            float r5 = r5.ascent()
            float r4 = r4 + r5
            float r4 = r4 / r2
            float r0 = r0 - r4
            int r0 = (int) r0
            float r0 = (float) r0
            r7.mDrawTextEnd = r0
            float r0 = r7.mDrawTextStart
            float r4 = r7.mDrawTextWidth
            float r0 = r0 + r4
            int r4 = r7.getWidth()
            int r5 = r7.getPaddingRight()
            int r4 = r4 - r5
            float r4 = (float) r4
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 < 0) goto Lf0
            int r0 = r7.getWidth()
            int r4 = r7.getPaddingRight()
            int r0 = r0 - r4
            float r0 = (float) r0
            float r4 = r7.mDrawTextWidth
            float r0 = r0 - r4
            r7.mDrawTextStart = r0
            android.graphics.RectF r4 = r7.mReachedRectF
            float r5 = r7.mOffset
            float r0 = r0 - r5
            r4.right = r0
        Lf0:
            float r0 = r7.mDrawTextStart
            float r4 = r7.mDrawTextWidth
            float r0 = r0 + r4
            float r4 = r7.mOffset
            float r0 = r0 + r4
            int r4 = r7.getWidth()
            int r5 = r7.getPaddingRight()
            int r4 = r4 - r5
            float r4 = (float) r4
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 < 0) goto L109
            r7.mDrawUnreachedBar = r3
            return
        L109:
            r7.mDrawUnreachedBar = r1
            android.graphics.RectF r1 = r7.mUnreachedRectF
            r1.left = r0
            int r0 = r7.getWidth()
            int r3 = r7.getPaddingRight()
            int r0 = r0 - r3
            float r0 = (float) r0
            r1.right = r0
            android.graphics.RectF r0 = r7.mUnreachedRectF
            int r1 = r7.getHeight()
            float r1 = (float) r1
            float r1 = r1 / r2
            float r3 = r7.mUnreachedBarHeight
            float r3 = -r3
            float r3 = r3 / r2
            float r1 = r1 + r3
            r0.top = r1
            android.graphics.RectF r0 = r7.mUnreachedRectF
            int r1 = r7.getHeight()
            float r1 = (float) r1
            float r1 = r1 / r2
            float r3 = r7.mUnreachedBarHeight
            float r3 = r3 / r2
            float r1 = r1 + r3
            r0.bottom = r1
            return
    }

    private void calculateDrawRectFWithoutProgressText() {
            r5 = this;
            android.graphics.RectF r0 = r5.mReachedRectF
            int r1 = r5.getPaddingLeft()
            float r1 = (float) r1
            r0.left = r1
            android.graphics.RectF r0 = r5.mReachedRectF
            int r1 = r5.getHeight()
            float r1 = (float) r1
            r2 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r2
            float r3 = r5.mReachedBarHeight
            float r3 = r3 / r2
            float r1 = r1 - r3
            r0.top = r1
            android.graphics.RectF r0 = r5.mReachedRectF
            int r1 = r5.getWidth()
            int r3 = r5.getPaddingLeft()
            int r1 = r1 - r3
            int r3 = r5.getPaddingRight()
            int r1 = r1 - r3
            float r1 = (float) r1
            int r3 = r5.getMax()
            float r3 = (float) r3
            r4 = 1065353216(0x3f800000, float:1.0)
            float r3 = r3 * r4
            float r1 = r1 / r3
            int r3 = r5.getProgress()
            float r3 = (float) r3
            float r1 = r1 * r3
            int r3 = r5.getPaddingLeft()
            float r3 = (float) r3
            float r1 = r1 + r3
            r0.right = r1
            android.graphics.RectF r0 = r5.mReachedRectF
            int r1 = r5.getHeight()
            float r1 = (float) r1
            float r1 = r1 / r2
            float r3 = r5.mReachedBarHeight
            float r3 = r3 / r2
            float r1 = r1 + r3
            r0.bottom = r1
            android.graphics.RectF r0 = r5.mUnreachedRectF
            android.graphics.RectF r1 = r5.mReachedRectF
            float r1 = r1.right
            r0.left = r1
            int r1 = r5.getWidth()
            int r3 = r5.getPaddingRight()
            int r1 = r1 - r3
            float r1 = (float) r1
            r0.right = r1
            android.graphics.RectF r0 = r5.mUnreachedRectF
            int r1 = r5.getHeight()
            float r1 = (float) r1
            float r1 = r1 / r2
            float r3 = r5.mUnreachedBarHeight
            float r3 = -r3
            float r3 = r3 / r2
            float r1 = r1 + r3
            r0.top = r1
            android.graphics.RectF r0 = r5.mUnreachedRectF
            int r1 = r5.getHeight()
            float r1 = (float) r1
            float r1 = r1 / r2
            float r3 = r5.mUnreachedBarHeight
            float r3 = r3 / r2
            float r1 = r1 + r3
            r0.bottom = r1
            return
    }

    private void initializePainters() {
            r3 = this;
            android.graphics.Paint r0 = new android.graphics.Paint
            r1 = 1
            r0.<init>(r1)
            r3.mReachedBarPaint = r0
            int r2 = r3.mReachedBarColor
            r0.setColor(r2)
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>(r1)
            r3.mUnreachedBarPaint = r0
            int r2 = r3.mUnreachedBarColor
            r0.setColor(r2)
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>(r1)
            r3.mTextPaint = r0
            int r1 = r3.mTextColor
            r0.setColor(r1)
            android.graphics.Paint r0 = r3.mTextPaint
            float r1 = r3.mTextSize
            r0.setTextSize(r1)
            return
    }

    private int measure(int r4, boolean r5) {
            r3 = this;
            int r0 = android.view.View.MeasureSpec.getMode(r4)
            int r4 = android.view.View.MeasureSpec.getSize(r4)
            if (r5 == 0) goto L14
            int r1 = r3.getPaddingLeft()
            int r2 = r3.getPaddingRight()
        L12:
            int r1 = r1 + r2
            goto L1d
        L14:
            int r1 = r3.getPaddingTop()
            int r2 = r3.getPaddingBottom()
            goto L12
        L1d:
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 != r2) goto L22
            return r4
        L22:
            if (r5 == 0) goto L29
            int r2 = r3.getSuggestedMinimumWidth()
            goto L2d
        L29:
            int r2 = r3.getSuggestedMinimumHeight()
        L2d:
            int r2 = r2 + r1
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r1) goto L3e
            if (r5 == 0) goto L39
            int r4 = java.lang.Math.max(r2, r4)
            return r4
        L39:
            int r4 = java.lang.Math.min(r2, r4)
            return r4
        L3e:
            return r2
    }

    public float dp2px(float r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r2 = r2 * r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r0
            return r2
    }

    public int getMax() {
            r1 = this;
            int r0 = r1.mMaxProgress
            return r0
    }

    public java.lang.String getPrefix() {
            r1 = this;
            java.lang.String r0 = r1.mPrefix
            return r0
    }

    public int getProgress() {
            r1 = this;
            int r0 = r1.mCurrentProgress
            return r0
    }

    public float getProgressTextSize() {
            r1 = this;
            float r0 = r1.mTextSize
            return r0
    }

    public boolean getProgressTextVisibility() {
            r1 = this;
            boolean r0 = r1.mIfDrawText
            return r0
    }

    public int getReachedBarColor() {
            r1 = this;
            int r0 = r1.mReachedBarColor
            return r0
    }

    public float getReachedBarHeight() {
            r1 = this;
            float r0 = r1.mReachedBarHeight
            return r0
    }

    public java.lang.String getSuffix() {
            r1 = this;
            java.lang.String r0 = r1.mSuffix
            return r0
    }

    @Override // android.view.View
    protected int getSuggestedMinimumHeight() {
            r3 = this;
            float r0 = r3.mTextSize
            int r0 = (int) r0
            float r1 = r3.mReachedBarHeight
            int r1 = (int) r1
            float r2 = r3.mUnreachedBarHeight
            int r2 = (int) r2
            int r1 = java.lang.Math.max(r1, r2)
            int r0 = java.lang.Math.max(r0, r1)
            return r0
    }

    @Override // android.view.View
    protected int getSuggestedMinimumWidth() {
            r1 = this;
            float r0 = r1.mTextSize
            int r0 = (int) r0
            return r0
    }

    public int getTextColor() {
            r1 = this;
            int r0 = r1.mTextColor
            return r0
    }

    public int getUnreachedBarColor() {
            r1 = this;
            int r0 = r1.mUnreachedBarColor
            return r0
    }

    public float getUnreachedBarHeight() {
            r1 = this;
            float r0 = r1.mUnreachedBarHeight
            return r0
    }

    public void incrementProgressBy(int r3) {
            r2 = this;
            if (r3 <= 0) goto La
            int r0 = r2.getProgress()
            int r0 = r0 + r3
            r2.setProgress(r0)
        La:
            com.daimajia.numberprogressbar.OnProgressBarListener r3 = r2.mListener
            if (r3 == 0) goto L19
            int r0 = r2.getProgress()
            int r1 = r2.getMax()
            r3.onProgressChange(r0, r1)
        L19:
            return
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas r5) {
            r4 = this;
            boolean r0 = r4.mIfDrawText
            if (r0 == 0) goto L8
            r4.calculateDrawRectF()
            goto Lb
        L8:
            r4.calculateDrawRectFWithoutProgressText()
        Lb:
            boolean r0 = r4.mDrawReachedBar
            if (r0 == 0) goto L16
            android.graphics.RectF r0 = r4.mReachedRectF
            android.graphics.Paint r1 = r4.mReachedBarPaint
            r5.drawRect(r0, r1)
        L16:
            boolean r0 = r4.mDrawUnreachedBar
            if (r0 == 0) goto L21
            android.graphics.RectF r0 = r4.mUnreachedRectF
            android.graphics.Paint r1 = r4.mUnreachedBarPaint
            r5.drawRect(r0, r1)
        L21:
            boolean r0 = r4.mIfDrawText
            if (r0 == 0) goto L30
            java.lang.String r0 = r4.mCurrentDrawText
            float r1 = r4.mDrawTextStart
            float r2 = r4.mDrawTextEnd
            android.graphics.Paint r3 = r4.mTextPaint
            r5.drawText(r0, r1, r2, r3)
        L30:
            return
    }

    @Override // android.view.View
    protected void onMeasure(int r2, int r3) {
            r1 = this;
            r0 = 1
            int r2 = r1.measure(r2, r0)
            r0 = 0
            int r3 = r1.measure(r3, r0)
            r1.setMeasuredDimension(r2, r3)
            return
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(android.os.Parcelable r2) {
            r1 = this;
            boolean r0 = r2 instanceof android.os.Bundle
            if (r0 == 0) goto L77
            android.os.Bundle r2 = (android.os.Bundle) r2
            java.lang.String r0 = "text_color"
            int r0 = r2.getInt(r0)
            r1.mTextColor = r0
            java.lang.String r0 = "text_size"
            float r0 = r2.getFloat(r0)
            r1.mTextSize = r0
            java.lang.String r0 = "reached_bar_height"
            float r0 = r2.getFloat(r0)
            r1.mReachedBarHeight = r0
            java.lang.String r0 = "unreached_bar_height"
            float r0 = r2.getFloat(r0)
            r1.mUnreachedBarHeight = r0
            java.lang.String r0 = "reached_bar_color"
            int r0 = r2.getInt(r0)
            r1.mReachedBarColor = r0
            java.lang.String r0 = "unreached_bar_color"
            int r0 = r2.getInt(r0)
            r1.mUnreachedBarColor = r0
            r1.initializePainters()
            java.lang.String r0 = "max"
            int r0 = r2.getInt(r0)
            r1.setMax(r0)
            java.lang.String r0 = "progress"
            int r0 = r2.getInt(r0)
            r1.setProgress(r0)
            java.lang.String r0 = "prefix"
            java.lang.String r0 = r2.getString(r0)
            r1.setPrefix(r0)
            java.lang.String r0 = "suffix"
            java.lang.String r0 = r2.getString(r0)
            r1.setSuffix(r0)
            java.lang.String r0 = "text_visibility"
            boolean r0 = r2.getBoolean(r0)
            if (r0 == 0) goto L68
            com.daimajia.numberprogressbar.NumberProgressBar$ProgressTextVisibility r0 = com.daimajia.numberprogressbar.NumberProgressBar.ProgressTextVisibility.Visible
            goto L6a
        L68:
            com.daimajia.numberprogressbar.NumberProgressBar$ProgressTextVisibility r0 = com.daimajia.numberprogressbar.NumberProgressBar.ProgressTextVisibility.Invisible
        L6a:
            r1.setProgressTextVisibility(r0)
            java.lang.String r0 = "saved_instance"
            android.os.Parcelable r2 = r2.getParcelable(r0)
            super.onRestoreInstanceState(r2)
            return
        L77:
            super.onRestoreInstanceState(r2)
            return
    }

    @Override // android.view.View
    protected android.os.Parcelable onSaveInstanceState() {
            r3 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "saved_instance"
            android.os.Parcelable r2 = super.onSaveInstanceState()
            r0.putParcelable(r1, r2)
            java.lang.String r1 = "text_color"
            int r2 = r3.getTextColor()
            r0.putInt(r1, r2)
            java.lang.String r1 = "text_size"
            float r2 = r3.getProgressTextSize()
            r0.putFloat(r1, r2)
            java.lang.String r1 = "reached_bar_height"
            float r2 = r3.getReachedBarHeight()
            r0.putFloat(r1, r2)
            java.lang.String r1 = "unreached_bar_height"
            float r2 = r3.getUnreachedBarHeight()
            r0.putFloat(r1, r2)
            java.lang.String r1 = "reached_bar_color"
            int r2 = r3.getReachedBarColor()
            r0.putInt(r1, r2)
            java.lang.String r1 = "unreached_bar_color"
            int r2 = r3.getUnreachedBarColor()
            r0.putInt(r1, r2)
            java.lang.String r1 = "max"
            int r2 = r3.getMax()
            r0.putInt(r1, r2)
            java.lang.String r1 = "progress"
            int r2 = r3.getProgress()
            r0.putInt(r1, r2)
            java.lang.String r1 = "suffix"
            java.lang.String r2 = r3.getSuffix()
            r0.putString(r1, r2)
            java.lang.String r1 = "prefix"
            java.lang.String r2 = r3.getPrefix()
            r0.putString(r1, r2)
            java.lang.String r1 = "text_visibility"
            boolean r2 = r3.getProgressTextVisibility()
            r0.putBoolean(r1, r2)
            return r0
    }

    public void setMax(int r1) {
            r0 = this;
            if (r1 <= 0) goto L7
            r0.mMaxProgress = r1
            r0.invalidate()
        L7:
            return
    }

    public void setOnProgressBarListener(com.daimajia.numberprogressbar.OnProgressBarListener r1) {
            r0 = this;
            r0.mListener = r1
            return
    }

    public void setPrefix(java.lang.String r1) {
            r0 = this;
            if (r1 != 0) goto L7
            java.lang.String r1 = ""
            r0.mPrefix = r1
            return
        L7:
            r0.mPrefix = r1
            return
    }

    public void setProgress(int r2) {
            r1 = this;
            int r0 = r1.getMax()
            if (r2 > r0) goto Ld
            if (r2 < 0) goto Ld
            r1.mCurrentProgress = r2
            r1.invalidate()
        Ld:
            return
    }

    public void setProgressTextColor(int r2) {
            r1 = this;
            r1.mTextColor = r2
            android.graphics.Paint r0 = r1.mTextPaint
            r0.setColor(r2)
            r1.invalidate()
            return
    }

    public void setProgressTextSize(float r2) {
            r1 = this;
            r1.mTextSize = r2
            android.graphics.Paint r0 = r1.mTextPaint
            r0.setTextSize(r2)
            r1.invalidate()
            return
    }

    public void setProgressTextVisibility(com.daimajia.numberprogressbar.NumberProgressBar.ProgressTextVisibility r2) {
            r1 = this;
            com.daimajia.numberprogressbar.NumberProgressBar$ProgressTextVisibility r0 = com.daimajia.numberprogressbar.NumberProgressBar.ProgressTextVisibility.Visible
            if (r2 != r0) goto L6
            r2 = 1
            goto L7
        L6:
            r2 = 0
        L7:
            r1.mIfDrawText = r2
            r1.invalidate()
            return
    }

    public void setReachedBarColor(int r2) {
            r1 = this;
            r1.mReachedBarColor = r2
            android.graphics.Paint r0 = r1.mReachedBarPaint
            r0.setColor(r2)
            r1.invalidate()
            return
    }

    public void setReachedBarHeight(float r1) {
            r0 = this;
            r0.mReachedBarHeight = r1
            return
    }

    public void setSuffix(java.lang.String r1) {
            r0 = this;
            if (r1 != 0) goto L7
            java.lang.String r1 = ""
            r0.mSuffix = r1
            return
        L7:
            r0.mSuffix = r1
            return
    }

    public void setUnreachedBarColor(int r2) {
            r1 = this;
            r1.mUnreachedBarColor = r2
            android.graphics.Paint r0 = r1.mUnreachedBarPaint
            r0.setColor(r2)
            r1.invalidate()
            return
    }

    public void setUnreachedBarHeight(float r1) {
            r0 = this;
            r0.mUnreachedBarHeight = r1
            return
    }

    public float sp2px(float r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.scaledDensity
            float r2 = r2 * r0
            return r2
    }
}
