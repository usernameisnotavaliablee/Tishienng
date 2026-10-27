package cn.bluemobi.dylan.base.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class RatingBar extends android.widget.LinearLayout {
    private boolean mClickable;
    private cn.bluemobi.dylan.base.view.RatingBar.OnRatingChangeListener onRatingChangeListener;
    private int starCount;
    private android.graphics.drawable.Drawable starEmptyDrawable;
    private android.graphics.drawable.Drawable starFillDrawable;
    private android.graphics.drawable.Drawable starHalfDrawable;
    private float starImageSize;
    private float starPadding;
    private float starStep;
    private cn.bluemobi.dylan.base.view.RatingBar.StepSize stepSize;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface OnRatingChangeListener {
        void onRatingChange(float r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum StepSize extends java.lang.Enum<cn.bluemobi.dylan.base.view.RatingBar.StepSize> {
        private static final /* synthetic */ cn.bluemobi.dylan.base.view.RatingBar.StepSize[] $VALUES = null;
        public static final cn.bluemobi.dylan.base.view.RatingBar.StepSize Full = null;
        public static final cn.bluemobi.dylan.base.view.RatingBar.StepSize Half = null;
        int step;

        static {
                cn.bluemobi.dylan.base.view.RatingBar$StepSize r0 = new cn.bluemobi.dylan.base.view.RatingBar$StepSize
                java.lang.String r1 = "Half"
                r2 = 0
                r0.<init>(r1, r2, r2)
                cn.bluemobi.dylan.base.view.RatingBar.StepSize.Half = r0
                cn.bluemobi.dylan.base.view.RatingBar$StepSize r1 = new cn.bluemobi.dylan.base.view.RatingBar$StepSize
                java.lang.String r3 = "Full"
                r4 = 1
                r1.<init>(r3, r4, r4)
                cn.bluemobi.dylan.base.view.RatingBar.StepSize.Full = r1
                r3 = 2
                cn.bluemobi.dylan.base.view.RatingBar$StepSize[] r3 = new cn.bluemobi.dylan.base.view.RatingBar.StepSize[r3]
                r3[r2] = r0
                r3[r4] = r1
                cn.bluemobi.dylan.base.view.RatingBar.StepSize.$VALUES = r3
                return
        }

        StepSize(java.lang.String r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.step = r3
                return
        }

        public static cn.bluemobi.dylan.base.view.RatingBar.StepSize fromStep(int r5) {
                cn.bluemobi.dylan.base.view.RatingBar$StepSize[] r0 = values()
                int r1 = r0.length
                r2 = 0
            L6:
                if (r2 >= r1) goto L12
                r3 = r0[r2]
                int r4 = r3.step
                if (r4 != r5) goto Lf
                return r3
            Lf:
                int r2 = r2 + 1
                goto L6
            L12:
                java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                r5.<init>()
                throw r5
        }

        public static cn.bluemobi.dylan.base.view.RatingBar.StepSize valueOf(java.lang.String r1) {
                java.lang.Class<cn.bluemobi.dylan.base.view.RatingBar$StepSize> r0 = cn.bluemobi.dylan.base.view.RatingBar.StepSize.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                cn.bluemobi.dylan.base.view.RatingBar$StepSize r1 = (cn.bluemobi.dylan.base.view.RatingBar.StepSize) r1
                return r1
        }

        public static cn.bluemobi.dylan.base.view.RatingBar.StepSize[] values() {
                cn.bluemobi.dylan.base.view.RatingBar$StepSize[] r0 = cn.bluemobi.dylan.base.view.RatingBar.StepSize.$VALUES
                java.lang.Object r0 = r0.clone()
                cn.bluemobi.dylan.base.view.RatingBar$StepSize[] r0 = (cn.bluemobi.dylan.base.view.RatingBar.StepSize[]) r0
                return r0
        }
    }

    public RatingBar(android.content.Context r4, android.util.AttributeSet r5) {
            r3 = this;
            r3.<init>(r4, r5)
            r0 = 0
            r3.setOrientation(r0)
            int[] r1 = cn.bluemobi.dylan.base.R.styleable.RatingBar
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r1)
            int r5 = cn.bluemobi.dylan.base.R.styleable.RatingBar_starImageSize
            r1 = 1101004800(0x41a00000, float:20.0)
            float r5 = r4.getDimension(r5, r1)
            r3.starImageSize = r5
            int r5 = cn.bluemobi.dylan.base.R.styleable.RatingBar_starPadding
            r1 = 1092616192(0x41200000, float:10.0)
            float r5 = r4.getDimension(r5, r1)
            r3.starPadding = r5
            int r5 = cn.bluemobi.dylan.base.R.styleable.RatingBar_starStep
            r1 = 1065353216(0x3f800000, float:1.0)
            float r5 = r4.getFloat(r5, r1)
            r3.starStep = r5
            int r5 = cn.bluemobi.dylan.base.R.styleable.RatingBar_stepSize
            r1 = 1
            int r5 = r4.getInt(r5, r1)
            cn.bluemobi.dylan.base.view.RatingBar$StepSize r5 = cn.bluemobi.dylan.base.view.RatingBar.StepSize.fromStep(r5)
            r3.stepSize = r5
            int r5 = cn.bluemobi.dylan.base.R.styleable.RatingBar_starCount
            r2 = 5
            int r5 = r4.getInteger(r5, r2)
            r3.starCount = r5
            int r5 = cn.bluemobi.dylan.base.R.styleable.RatingBar_starEmpty
            android.graphics.drawable.Drawable r5 = r4.getDrawable(r5)
            r3.starEmptyDrawable = r5
            int r5 = cn.bluemobi.dylan.base.R.styleable.RatingBar_starFill
            android.graphics.drawable.Drawable r5 = r4.getDrawable(r5)
            r3.starFillDrawable = r5
            int r5 = cn.bluemobi.dylan.base.R.styleable.RatingBar_starHalf
            android.graphics.drawable.Drawable r5 = r4.getDrawable(r5)
            r3.starHalfDrawable = r5
            int r5 = cn.bluemobi.dylan.base.R.styleable.RatingBar_clickable
            boolean r5 = r4.getBoolean(r5, r1)
            r3.mClickable = r5
            r4.recycle()
        L64:
            int r4 = r3.starCount
            if (r0 >= r4) goto L7f
            android.widget.ImageView r4 = r3.getStarImageView()
            android.graphics.drawable.Drawable r5 = r3.starEmptyDrawable
            r4.setImageDrawable(r5)
            cn.bluemobi.dylan.base.view.RatingBar$1 r5 = new cn.bluemobi.dylan.base.view.RatingBar$1
            r5.<init>(r3, r4)
            r4.setOnClickListener(r5)
            r3.addView(r4)
            int r0 = r0 + 1
            goto L64
        L7f:
            float r4 = r3.starStep
            r3.setStar(r4)
            return
    }

    static /* synthetic */ boolean access$000(cn.bluemobi.dylan.base.view.RatingBar r0) {
            boolean r0 = r0.mClickable
            return r0
    }

    static /* synthetic */ float access$100(cn.bluemobi.dylan.base.view.RatingBar r0) {
            float r0 = r0.starStep
            return r0
    }

    static /* synthetic */ cn.bluemobi.dylan.base.view.RatingBar.StepSize access$200(cn.bluemobi.dylan.base.view.RatingBar r0) {
            cn.bluemobi.dylan.base.view.RatingBar$StepSize r0 = r0.stepSize
            return r0
    }

    static /* synthetic */ android.graphics.drawable.Drawable access$300(cn.bluemobi.dylan.base.view.RatingBar r0) {
            android.graphics.drawable.Drawable r0 = r0.starHalfDrawable
            return r0
    }

    private android.widget.ImageView getStarImageView() {
            r4 = this;
            android.widget.ImageView r0 = new android.widget.ImageView
            android.content.Context r1 = r4.getContext()
            r0.<init>(r1)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            float r2 = r4.starImageSize
            int r2 = java.lang.Math.round(r2)
            float r3 = r4.starImageSize
            int r3 = java.lang.Math.round(r3)
            r1.<init>(r2, r3)
            float r2 = r4.starPadding
            int r2 = java.lang.Math.round(r2)
            r3 = 0
            r1.setMargins(r3, r3, r2, r3)
            r0.setLayoutParams(r1)
            r1 = 1
            r0.setAdjustViewBounds(r1)
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER_CROP
            r0.setScaleType(r1)
            android.graphics.drawable.Drawable r1 = r4.starEmptyDrawable
            r0.setImageDrawable(r1)
            r1 = 10
            r0.setMinimumWidth(r1)
            r0.setMaxHeight(r1)
            return r0
    }

    @Override // android.view.View
    public void setClickable(boolean r1) {
            r0 = this;
            r0.mClickable = r1
            return
    }

    public void setOnRatingChangeListener(cn.bluemobi.dylan.base.view.RatingBar.OnRatingChangeListener r1) {
            r0 = this;
            r0.onRatingChangeListener = r1
            return
    }

    public void setStar(float r5) {
            r4 = this;
            cn.bluemobi.dylan.base.view.RatingBar$OnRatingChangeListener r0 = r4.onRatingChangeListener
            if (r0 == 0) goto L7
            r0.onRatingChange(r5)
        L7:
            r4.starStep = r5
            int r0 = (int) r5
            java.math.BigDecimal r1 = new java.math.BigDecimal
            java.lang.String r5 = java.lang.Float.toString(r5)
            r1.<init>(r5)
            java.math.BigDecimal r5 = new java.math.BigDecimal
            java.lang.String r2 = java.lang.Integer.toString(r0)
            r5.<init>(r2)
            java.math.BigDecimal r5 = r1.subtract(r5)
            float r5 = r5.floatValue()
            r1 = 0
        L25:
            if (r1 >= r0) goto L35
            android.view.View r2 = r4.getChildAt(r1)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            android.graphics.drawable.Drawable r3 = r4.starFillDrawable
            r2.setImageDrawable(r3)
            int r1 = r1 + 1
            goto L25
        L35:
            r1 = r0
        L36:
            int r2 = r4.starCount
            if (r1 >= r2) goto L48
            android.view.View r2 = r4.getChildAt(r1)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            android.graphics.drawable.Drawable r3 = r4.starEmptyDrawable
            r2.setImageDrawable(r3)
            int r1 = r1 + 1
            goto L36
        L48:
            r1 = 0
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 <= 0) goto L58
            android.view.View r5 = r4.getChildAt(r0)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            android.graphics.drawable.Drawable r0 = r4.starHalfDrawable
            r5.setImageDrawable(r0)
        L58:
            return
    }

    public void setStarEmptyDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.starEmptyDrawable = r1
            return
    }

    public void setStarFillDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.starFillDrawable = r1
            return
    }

    public void setStarHalfDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.starHalfDrawable = r1
            return
    }

    public void setStarImageSize(float r1) {
            r0 = this;
            r0.starImageSize = r1
            return
    }

    public void setStepSize(cn.bluemobi.dylan.base.view.RatingBar.StepSize r1) {
            r0 = this;
            r0.stepSize = r1
            return
    }
}
