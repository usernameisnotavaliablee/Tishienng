package com.bxkj.student.common.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class SnackBarUtils {
    private final com.bxkj.student.common.view.SnackBarUtils.Builder builder;



    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class Builder {
        private android.view.View.OnClickListener actionClickListener;
        private java.lang.CharSequence actionText;
        private java.lang.Integer actionTextColor;
        private android.content.res.ColorStateList actionTextColors;
        private int actionTextResId;
        private java.lang.Float actionTextSize;
        private java.lang.Integer actionTextSizeUnit;
        private android.graphics.Typeface actionTextTypeface;
        private java.lang.Integer actionTextTypefaceStyle;
        private java.lang.Integer backgroundColor;
        private boolean centerText;
        private int duration;
        private android.graphics.drawable.Drawable icon;
        private int iconResId;
        private int maxLines;
        private java.lang.CharSequence text;
        private java.lang.Integer textColor;
        private android.content.res.ColorStateList textColors;
        private int textResId;
        private java.lang.Float textSize;
        private java.lang.Integer textSizeUnit;
        private android.graphics.Typeface textTypeface;
        private java.lang.Integer textTypefaceStyle;
        private android.view.View view;

        private Builder() {
                r3 = this;
                r3.<init>()
                r0 = 0
                r3.view = r0
                r1 = -1
                r3.duration = r1
                java.lang.String r1 = ""
                r3.text = r1
                r2 = 0
                r3.textResId = r2
                r3.textColor = r0
                r3.textColors = r0
                r3.textSizeUnit = r0
                r3.textSize = r0
                r3.textTypefaceStyle = r0
                r3.textTypeface = r0
                r3.actionTextSizeUnit = r0
                r3.actionTextSize = r0
                r3.actionText = r1
                r3.actionTextResId = r2
                r3.actionTextTypefaceStyle = r0
                r3.actionTextTypeface = r0
                r3.actionClickListener = r0
                r3.actionTextColor = r0
                r3.actionTextColors = r0
                r1 = 2147483647(0x7fffffff, float:NaN)
                r3.maxLines = r1
                r3.centerText = r2
                r3.icon = r0
                r3.iconResId = r2
                r3.backgroundColor = r0
                return
        }

        /* synthetic */ Builder(com.bxkj.student.common.view.a r1) {
                r0 = this;
                r0.<init>()
                return
        }

        static /* bridge */ /* synthetic */ android.view.View.OnClickListener a(com.bxkj.student.common.view.SnackBarUtils.Builder r0) {
                android.view.View$OnClickListener r0 = r0.actionClickListener
                return r0
        }

        static /* bridge */ /* synthetic */ java.lang.CharSequence b(com.bxkj.student.common.view.SnackBarUtils.Builder r0) {
                java.lang.CharSequence r0 = r0.actionText
                return r0
        }

        static /* bridge */ /* synthetic */ java.lang.Integer c(com.bxkj.student.common.view.SnackBarUtils.Builder r0) {
                java.lang.Integer r0 = r0.actionTextColor
                return r0
        }

        static /* bridge */ /* synthetic */ android.content.res.ColorStateList d(com.bxkj.student.common.view.SnackBarUtils.Builder r0) {
                android.content.res.ColorStateList r0 = r0.actionTextColors
                return r0
        }

        static /* bridge */ /* synthetic */ java.lang.Float e(com.bxkj.student.common.view.SnackBarUtils.Builder r0) {
                java.lang.Float r0 = r0.actionTextSize
                return r0
        }

        static /* bridge */ /* synthetic */ java.lang.Integer f(com.bxkj.student.common.view.SnackBarUtils.Builder r0) {
                java.lang.Integer r0 = r0.actionTextSizeUnit
                return r0
        }

        static /* bridge */ /* synthetic */ android.graphics.Typeface g(com.bxkj.student.common.view.SnackBarUtils.Builder r0) {
                android.graphics.Typeface r0 = r0.actionTextTypeface
                return r0
        }

        static /* bridge */ /* synthetic */ java.lang.Integer h(com.bxkj.student.common.view.SnackBarUtils.Builder r0) {
                java.lang.Integer r0 = r0.actionTextTypefaceStyle
                return r0
        }

        static /* bridge */ /* synthetic */ java.lang.Integer i(com.bxkj.student.common.view.SnackBarUtils.Builder r0) {
                java.lang.Integer r0 = r0.backgroundColor
                return r0
        }

        static /* bridge */ /* synthetic */ boolean j(com.bxkj.student.common.view.SnackBarUtils.Builder r0) {
                boolean r0 = r0.centerText
                return r0
        }

        static /* bridge */ /* synthetic */ int k(com.bxkj.student.common.view.SnackBarUtils.Builder r0) {
                int r0 = r0.duration
                return r0
        }

        static /* bridge */ /* synthetic */ android.graphics.drawable.Drawable l(com.bxkj.student.common.view.SnackBarUtils.Builder r0) {
                android.graphics.drawable.Drawable r0 = r0.icon
                return r0
        }

        static /* bridge */ /* synthetic */ int m(com.bxkj.student.common.view.SnackBarUtils.Builder r0) {
                int r0 = r0.maxLines
                return r0
        }

        private com.google.android.material.snackbar.Snackbar make() {
                r2 = this;
                android.view.View r0 = r2.view
                if (r0 == 0) goto L43
                int r1 = r2.textResId
                if (r1 == 0) goto L14
                android.content.res.Resources r0 = r0.getResources()
                int r1 = r2.textResId
                java.lang.CharSequence r0 = r0.getText(r1)
                r2.text = r0
            L14:
                int r0 = r2.actionTextResId
                if (r0 == 0) goto L26
                android.view.View r0 = r2.view
                android.content.res.Resources r0 = r0.getResources()
                int r1 = r2.actionTextResId
                java.lang.CharSequence r0 = r0.getText(r1)
                r2.actionText = r0
            L26:
                int r0 = r2.iconResId
                if (r0 == 0) goto L38
                android.view.View r0 = r2.view
                android.content.Context r0 = r0.getContext()
                int r1 = r2.iconResId
                android.graphics.drawable.Drawable r0 = androidx.core.content.ContextCompat.getDrawable(r0, r1)
                r2.icon = r0
            L38:
                com.bxkj.student.common.view.SnackBarUtils r0 = new com.bxkj.student.common.view.SnackBarUtils
                r1 = 0
                r0.<init>(r2, r1)
                com.google.android.material.snackbar.Snackbar r0 = com.bxkj.student.common.view.SnackBarUtils.a(r0)
                return r0
            L43:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "must set an Activity or a View before making a snack"
                r0.<init>(r1)
                throw r0
        }

        static /* bridge */ /* synthetic */ java.lang.CharSequence n(com.bxkj.student.common.view.SnackBarUtils.Builder r0) {
                java.lang.CharSequence r0 = r0.text
                return r0
        }

        static /* bridge */ /* synthetic */ java.lang.Integer o(com.bxkj.student.common.view.SnackBarUtils.Builder r0) {
                java.lang.Integer r0 = r0.textColor
                return r0
        }

        static /* bridge */ /* synthetic */ android.content.res.ColorStateList p(com.bxkj.student.common.view.SnackBarUtils.Builder r0) {
                android.content.res.ColorStateList r0 = r0.textColors
                return r0
        }

        static /* bridge */ /* synthetic */ java.lang.Float q(com.bxkj.student.common.view.SnackBarUtils.Builder r0) {
                java.lang.Float r0 = r0.textSize
                return r0
        }

        static /* bridge */ /* synthetic */ java.lang.Integer r(com.bxkj.student.common.view.SnackBarUtils.Builder r0) {
                java.lang.Integer r0 = r0.textSizeUnit
                return r0
        }

        static /* bridge */ /* synthetic */ android.graphics.Typeface s(com.bxkj.student.common.view.SnackBarUtils.Builder r0) {
                android.graphics.Typeface r0 = r0.textTypeface
                return r0
        }

        static /* bridge */ /* synthetic */ java.lang.Integer t(com.bxkj.student.common.view.SnackBarUtils.Builder r0) {
                java.lang.Integer r0 = r0.textTypefaceStyle
                return r0
        }

        static /* bridge */ /* synthetic */ android.view.View u(com.bxkj.student.common.view.SnackBarUtils.Builder r0) {
                android.view.View r0 = r0.view
                return r0
        }

        static /* bridge */ /* synthetic */ void v(com.bxkj.student.common.view.SnackBarUtils.Builder r0, android.view.View.OnClickListener r1) {
                r0.actionClickListener = r1
                return
        }

        public com.google.android.material.snackbar.Snackbar build() {
                r1 = this;
                com.google.android.material.snackbar.Snackbar r0 = r1.make()
                return r0
        }

        public com.bxkj.student.common.view.SnackBarUtils.Builder centerText() {
                r1 = this;
                r0 = 1
                r1.centerText = r0
                return r1
        }

        public com.bxkj.student.common.view.SnackBarUtils.Builder setActionClickListener(android.view.View.OnClickListener r1) {
                r0 = this;
                r0.actionClickListener = r1
                return r0
        }

        public com.bxkj.student.common.view.SnackBarUtils.Builder setActionText(@androidx.annotation.StringRes int r1) {
                r0 = this;
                r0.actionTextResId = r1
                return r0
        }

        public com.bxkj.student.common.view.SnackBarUtils.Builder setActionText(java.lang.CharSequence r2) {
                r1 = this;
                r0 = 0
                r1.textResId = r0
                r1.actionText = r2
                return r1
        }

        public com.bxkj.student.common.view.SnackBarUtils.Builder setActionTextColor(@androidx.annotation.ColorInt int r1) {
                r0 = this;
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r0.actionTextColor = r1
                return r0
        }

        public com.bxkj.student.common.view.SnackBarUtils.Builder setActionTextColor(android.content.res.ColorStateList r2) {
                r1 = this;
                r0 = 0
                r1.actionTextColor = r0
                r1.actionTextColors = r2
                return r1
        }

        public com.bxkj.student.common.view.SnackBarUtils.Builder setActionTextSize(float r2) {
                r1 = this;
                r0 = 0
                r1.actionTextSizeUnit = r0
                java.lang.Float r2 = java.lang.Float.valueOf(r2)
                r1.actionTextSize = r2
                return r1
        }

        public com.bxkj.student.common.view.SnackBarUtils.Builder setActionTextSize(int r1, float r2) {
                r0 = this;
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r0.actionTextSizeUnit = r1
                java.lang.Float r1 = java.lang.Float.valueOf(r2)
                r0.actionTextSize = r1
                return r0
        }

        public com.bxkj.student.common.view.SnackBarUtils.Builder setActionTextTypeface(android.graphics.Typeface r1) {
                r0 = this;
                r0.actionTextTypeface = r1
                return r0
        }

        public com.bxkj.student.common.view.SnackBarUtils.Builder setActionTextTypefaceStyle(int r1) {
                r0 = this;
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r0.actionTextTypefaceStyle = r1
                return r0
        }

        public com.bxkj.student.common.view.SnackBarUtils.Builder setActivity(android.app.Activity r2) {
                r1 = this;
                r0 = 16908290(0x1020002, float:2.3877235E-38)
                android.view.View r2 = r2.findViewById(r0)
                android.view.ViewGroup r2 = (android.view.ViewGroup) r2
                r0 = 0
                android.view.View r2 = r2.getChildAt(r0)
                com.bxkj.student.common.view.SnackBarUtils$Builder r2 = r1.setView(r2)
                return r2
        }

        public com.bxkj.student.common.view.SnackBarUtils.Builder setBackgroundColor(@androidx.annotation.ColorInt int r1) {
                r0 = this;
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r0.backgroundColor = r1
                return r0
        }

        public com.bxkj.student.common.view.SnackBarUtils.Builder setDuration(int r1) {
                r0 = this;
                r0.duration = r1
                return r0
        }

        public com.bxkj.student.common.view.SnackBarUtils.Builder setIcon(@androidx.annotation.DrawableRes int r1) {
                r0 = this;
                r0.iconResId = r1
                return r0
        }

        public com.bxkj.student.common.view.SnackBarUtils.Builder setIcon(android.graphics.drawable.Drawable r1) {
                r0 = this;
                r0.icon = r1
                return r0
        }

        public com.bxkj.student.common.view.SnackBarUtils.Builder setMaxLines(int r1) {
                r0 = this;
                r0.maxLines = r1
                return r0
        }

        public com.bxkj.student.common.view.SnackBarUtils.Builder setText(@androidx.annotation.StringRes int r1) {
                r0 = this;
                r0.textResId = r1
                return r0
        }

        public com.bxkj.student.common.view.SnackBarUtils.Builder setText(java.lang.CharSequence r2) {
                r1 = this;
                r0 = 0
                r1.textResId = r0
                r1.text = r2
                return r1
        }

        public com.bxkj.student.common.view.SnackBarUtils.Builder setTextColor(@androidx.annotation.ColorInt int r1) {
                r0 = this;
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r0.textColor = r1
                return r0
        }

        public com.bxkj.student.common.view.SnackBarUtils.Builder setTextColor(android.content.res.ColorStateList r2) {
                r1 = this;
                r0 = 0
                r1.textColor = r0
                r1.textColors = r2
                return r1
        }

        public com.bxkj.student.common.view.SnackBarUtils.Builder setTextSize(float r2) {
                r1 = this;
                r0 = 0
                r1.textSizeUnit = r0
                java.lang.Float r2 = java.lang.Float.valueOf(r2)
                r1.textSize = r2
                return r1
        }

        public com.bxkj.student.common.view.SnackBarUtils.Builder setTextSize(int r1, float r2) {
                r0 = this;
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r0.textSizeUnit = r1
                java.lang.Float r1 = java.lang.Float.valueOf(r2)
                r0.textSize = r1
                return r0
        }

        public com.bxkj.student.common.view.SnackBarUtils.Builder setTextTypeface(android.graphics.Typeface r1) {
                r0 = this;
                r0.textTypeface = r1
                return r0
        }

        public com.bxkj.student.common.view.SnackBarUtils.Builder setTextTypefaceStyle(int r1) {
                r0 = this;
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r0.textTypefaceStyle = r1
                return r0
        }

        public com.bxkj.student.common.view.SnackBarUtils.Builder setView(android.view.View r1) {
                r0 = this;
                r0.view = r1
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.IntRange(from = 1)
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    private @interface Duration {
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface DurationType {
        public static final int LENGTH_INDEFINITE = -2;
        public static final int LENGTH_LONG = 0;
        public static final int LENGTH_SHORT = -1;
    }

    private SnackBarUtils() {
            r2 = this;
            r2.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "u can't instantiate me..."
            r0.<init>(r1)
            throw r0
    }

    private SnackBarUtils(com.bxkj.student.common.view.SnackBarUtils.Builder r1) {
            r0 = this;
            r0.<init>()
            r0.builder = r1
            return
    }

    /* synthetic */ SnackBarUtils(com.bxkj.student.common.view.SnackBarUtils.Builder r1, com.bxkj.student.common.view.a r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    static /* bridge */ /* synthetic */ com.google.android.material.snackbar.Snackbar a(com.bxkj.student.common.view.SnackBarUtils r0) {
            com.google.android.material.snackbar.Snackbar r0 = r0.make()
            return r0
    }

    public static com.bxkj.student.common.view.SnackBarUtils.Builder builder() {
            com.bxkj.student.common.view.SnackBarUtils$Builder r0 = new com.bxkj.student.common.view.SnackBarUtils$Builder
            r1 = 0
            r0.<init>(r1)
            return r0
    }

    private com.google.android.material.snackbar.Snackbar make() {
            r7 = this;
            com.bxkj.student.common.view.SnackBarUtils$Builder r0 = r7.builder
            android.view.View r0 = com.bxkj.student.common.view.SnackBarUtils.Builder.u(r0)
            com.bxkj.student.common.view.SnackBarUtils$Builder r1 = r7.builder
            java.lang.CharSequence r1 = com.bxkj.student.common.view.SnackBarUtils.Builder.n(r1)
            com.bxkj.student.common.view.SnackBarUtils$Builder r2 = r7.builder
            int r2 = com.bxkj.student.common.view.SnackBarUtils.Builder.k(r2)
            com.google.android.material.snackbar.Snackbar r0 = com.google.android.material.snackbar.Snackbar.make(r0, r1, r2)
            android.view.View r1 = r0.getView()
            com.google.android.material.snackbar.Snackbar$SnackbarLayout r1 = (com.google.android.material.snackbar.Snackbar.SnackbarLayout) r1
            r2 = 2131298539(0x7f0908eb, float:1.8215054E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.Button r2 = (android.widget.Button) r2
            r3 = 2131298540(0x7f0908ec, float:1.8215056E38)
            android.view.View r3 = r1.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            com.bxkj.student.common.view.SnackBarUtils$Builder r4 = r7.builder
            android.view.View$OnClickListener r4 = com.bxkj.student.common.view.SnackBarUtils.Builder.a(r4)
            if (r4 != 0) goto L3e
            com.bxkj.student.common.view.SnackBarUtils$Builder r4 = r7.builder
            java.lang.CharSequence r4 = com.bxkj.student.common.view.SnackBarUtils.Builder.b(r4)
            if (r4 == 0) goto L86
        L3e:
            com.bxkj.student.common.view.SnackBarUtils$Builder r4 = r7.builder
            android.view.View$OnClickListener r4 = com.bxkj.student.common.view.SnackBarUtils.Builder.a(r4)
            if (r4 != 0) goto L50
            com.bxkj.student.common.view.SnackBarUtils$Builder r4 = r7.builder
            com.bxkj.student.common.view.SnackBarUtils$1 r5 = new com.bxkj.student.common.view.SnackBarUtils$1
            r5.<init>(r7)
            com.bxkj.student.common.view.SnackBarUtils.Builder.v(r4, r5)
        L50:
            com.bxkj.student.common.view.SnackBarUtils$Builder r4 = r7.builder
            java.lang.CharSequence r4 = com.bxkj.student.common.view.SnackBarUtils.Builder.b(r4)
            com.bxkj.student.common.view.SnackBarUtils$Builder r5 = r7.builder
            android.view.View$OnClickListener r5 = com.bxkj.student.common.view.SnackBarUtils.Builder.a(r5)
            r0.setAction(r4, r5)
            com.bxkj.student.common.view.SnackBarUtils$Builder r4 = r7.builder
            android.content.res.ColorStateList r4 = com.bxkj.student.common.view.SnackBarUtils.Builder.d(r4)
            if (r4 == 0) goto L71
            com.bxkj.student.common.view.SnackBarUtils$Builder r4 = r7.builder
            android.content.res.ColorStateList r4 = com.bxkj.student.common.view.SnackBarUtils.Builder.d(r4)
            r0.setActionTextColor(r4)
            goto L86
        L71:
            com.bxkj.student.common.view.SnackBarUtils$Builder r4 = r7.builder
            java.lang.Integer r4 = com.bxkj.student.common.view.SnackBarUtils.Builder.c(r4)
            if (r4 == 0) goto L86
            com.bxkj.student.common.view.SnackBarUtils$Builder r4 = r7.builder
            java.lang.Integer r4 = com.bxkj.student.common.view.SnackBarUtils.Builder.c(r4)
            int r4 = r4.intValue()
            r0.setActionTextColor(r4)
        L86:
            android.widget.FrameLayout$LayoutParams r4 = new android.widget.FrameLayout$LayoutParams
            r5 = -2
            r4.<init>(r5, r5)
            r5 = 17
            r4.gravity = r5
            r1.setLayoutParams(r4)
            com.bxkj.student.common.view.SnackBarUtils$Builder r4 = r7.builder
            android.view.View r4 = com.bxkj.student.common.view.SnackBarUtils.Builder.u(r4)
            android.content.Context r4 = r4.getContext()
            r6 = 1142292480(0x44160000, float:600.0)
            int r4 = cn.bluemobi.dylan.base.utils.d.a(r4, r6)
            r1.setMinimumWidth(r4)
            com.bxkj.student.common.view.SnackBarUtils$Builder r4 = r7.builder
            android.view.View r4 = com.bxkj.student.common.view.SnackBarUtils.Builder.u(r4)
            android.content.Context r4 = r4.getContext()
            r6 = 1117782016(0x42a00000, float:80.0)
            int r4 = cn.bluemobi.dylan.base.utils.d.a(r4, r6)
            r1.setMinimumHeight(r4)
            com.bxkj.student.common.view.SnackBarUtils$Builder r4 = r7.builder
            java.lang.Integer r4 = com.bxkj.student.common.view.SnackBarUtils.Builder.i(r4)
            if (r4 == 0) goto Lce
            com.bxkj.student.common.view.SnackBarUtils$Builder r4 = r7.builder
            java.lang.Integer r4 = com.bxkj.student.common.view.SnackBarUtils.Builder.i(r4)
            int r4 = r4.intValue()
            r1.setBackgroundColor(r4)
        Lce:
            com.bxkj.student.common.view.SnackBarUtils$Builder r1 = r7.builder
            java.lang.Float r1 = com.bxkj.student.common.view.SnackBarUtils.Builder.e(r1)
            if (r1 == 0) goto L103
            com.bxkj.student.common.view.SnackBarUtils$Builder r1 = r7.builder
            java.lang.Integer r1 = com.bxkj.student.common.view.SnackBarUtils.Builder.f(r1)
            if (r1 == 0) goto Lf6
            com.bxkj.student.common.view.SnackBarUtils$Builder r1 = r7.builder
            java.lang.Integer r1 = com.bxkj.student.common.view.SnackBarUtils.Builder.f(r1)
            int r1 = r1.intValue()
            com.bxkj.student.common.view.SnackBarUtils$Builder r4 = r7.builder
            java.lang.Float r4 = com.bxkj.student.common.view.SnackBarUtils.Builder.e(r4)
            float r4 = r4.floatValue()
            r2.setTextSize(r1, r4)
            goto L103
        Lf6:
            com.bxkj.student.common.view.SnackBarUtils$Builder r1 = r7.builder
            java.lang.Float r1 = com.bxkj.student.common.view.SnackBarUtils.Builder.e(r1)
            float r1 = r1.floatValue()
            r2.setTextSize(r1)
        L103:
            android.graphics.Typeface r1 = r2.getTypeface()
            com.bxkj.student.common.view.SnackBarUtils$Builder r4 = r7.builder
            android.graphics.Typeface r4 = com.bxkj.student.common.view.SnackBarUtils.Builder.g(r4)
            if (r4 == 0) goto L115
            com.bxkj.student.common.view.SnackBarUtils$Builder r1 = r7.builder
            android.graphics.Typeface r1 = com.bxkj.student.common.view.SnackBarUtils.Builder.g(r1)
        L115:
            com.bxkj.student.common.view.SnackBarUtils$Builder r4 = r7.builder
            java.lang.Integer r4 = com.bxkj.student.common.view.SnackBarUtils.Builder.h(r4)
            if (r4 == 0) goto L12b
            com.bxkj.student.common.view.SnackBarUtils$Builder r4 = r7.builder
            java.lang.Integer r4 = com.bxkj.student.common.view.SnackBarUtils.Builder.h(r4)
            int r4 = r4.intValue()
            r2.setTypeface(r1, r4)
            goto L12e
        L12b:
            r2.setTypeface(r1)
        L12e:
            com.bxkj.student.common.view.SnackBarUtils$Builder r1 = r7.builder
            java.lang.Float r1 = com.bxkj.student.common.view.SnackBarUtils.Builder.q(r1)
            if (r1 == 0) goto L163
            com.bxkj.student.common.view.SnackBarUtils$Builder r1 = r7.builder
            java.lang.Integer r1 = com.bxkj.student.common.view.SnackBarUtils.Builder.r(r1)
            if (r1 == 0) goto L156
            com.bxkj.student.common.view.SnackBarUtils$Builder r1 = r7.builder
            java.lang.Integer r1 = com.bxkj.student.common.view.SnackBarUtils.Builder.r(r1)
            int r1 = r1.intValue()
            com.bxkj.student.common.view.SnackBarUtils$Builder r2 = r7.builder
            java.lang.Float r2 = com.bxkj.student.common.view.SnackBarUtils.Builder.q(r2)
            float r2 = r2.floatValue()
            r3.setTextSize(r1, r2)
            goto L163
        L156:
            com.bxkj.student.common.view.SnackBarUtils$Builder r1 = r7.builder
            java.lang.Float r1 = com.bxkj.student.common.view.SnackBarUtils.Builder.q(r1)
            float r1 = r1.floatValue()
            r3.setTextSize(r1)
        L163:
            android.graphics.Typeface r1 = r3.getTypeface()
            com.bxkj.student.common.view.SnackBarUtils$Builder r2 = r7.builder
            android.graphics.Typeface r2 = com.bxkj.student.common.view.SnackBarUtils.Builder.s(r2)
            if (r2 == 0) goto L175
            com.bxkj.student.common.view.SnackBarUtils$Builder r1 = r7.builder
            android.graphics.Typeface r1 = com.bxkj.student.common.view.SnackBarUtils.Builder.s(r1)
        L175:
            com.bxkj.student.common.view.SnackBarUtils$Builder r2 = r7.builder
            java.lang.Integer r2 = com.bxkj.student.common.view.SnackBarUtils.Builder.t(r2)
            if (r2 == 0) goto L18b
            com.bxkj.student.common.view.SnackBarUtils$Builder r2 = r7.builder
            java.lang.Integer r2 = com.bxkj.student.common.view.SnackBarUtils.Builder.t(r2)
            int r2 = r2.intValue()
            r3.setTypeface(r1, r2)
            goto L18e
        L18b:
            r3.setTypeface(r1)
        L18e:
            com.bxkj.student.common.view.SnackBarUtils$Builder r1 = r7.builder
            android.content.res.ColorStateList r1 = com.bxkj.student.common.view.SnackBarUtils.Builder.p(r1)
            if (r1 == 0) goto L1a0
            com.bxkj.student.common.view.SnackBarUtils$Builder r1 = r7.builder
            android.content.res.ColorStateList r1 = com.bxkj.student.common.view.SnackBarUtils.Builder.p(r1)
            r3.setTextColor(r1)
            goto L1b5
        L1a0:
            com.bxkj.student.common.view.SnackBarUtils$Builder r1 = r7.builder
            java.lang.Integer r1 = com.bxkj.student.common.view.SnackBarUtils.Builder.o(r1)
            if (r1 == 0) goto L1b5
            com.bxkj.student.common.view.SnackBarUtils$Builder r1 = r7.builder
            java.lang.Integer r1 = com.bxkj.student.common.view.SnackBarUtils.Builder.o(r1)
            int r1 = r1.intValue()
            r3.setTextColor(r1)
        L1b5:
            com.bxkj.student.common.view.SnackBarUtils$Builder r1 = r7.builder
            int r1 = com.bxkj.student.common.view.SnackBarUtils.Builder.m(r1)
            r3.setMaxLines(r1)
            com.bxkj.student.common.view.SnackBarUtils$Builder r1 = r7.builder
            boolean r1 = com.bxkj.student.common.view.SnackBarUtils.Builder.j(r1)
            if (r1 == 0) goto L1c7
            goto L1c9
        L1c7:
            r5 = 16
        L1c9:
            r3.setGravity(r5)
            com.bxkj.student.common.view.SnackBarUtils$Builder r1 = r7.builder
            boolean r1 = com.bxkj.student.common.view.SnackBarUtils.Builder.j(r1)
            if (r1 == 0) goto L1d8
            r1 = 4
            r3.setTextAlignment(r1)
        L1d8:
            com.bxkj.student.common.view.SnackBarUtils$Builder r1 = r7.builder
            android.graphics.drawable.Drawable r1 = com.bxkj.student.common.view.SnackBarUtils.Builder.l(r1)
            if (r1 == 0) goto L232
            com.bxkj.student.common.view.SnackBarUtils$Builder r1 = r7.builder
            boolean r1 = com.bxkj.student.common.view.SnackBarUtils.Builder.j(r1)
            r2 = 0
            if (r1 == 0) goto L223
            com.bxkj.student.common.view.SnackBarUtils$Builder r1 = r7.builder
            java.lang.CharSequence r1 = com.bxkj.student.common.view.SnackBarUtils.Builder.b(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L223
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888
            com.bxkj.student.common.view.SnackBarUtils$Builder r4 = r7.builder
            android.graphics.drawable.Drawable r4 = com.bxkj.student.common.view.SnackBarUtils.Builder.l(r4)
            int r4 = r4.getIntrinsicWidth()
            com.bxkj.student.common.view.SnackBarUtils$Builder r5 = r7.builder
            android.graphics.drawable.Drawable r5 = com.bxkj.student.common.view.SnackBarUtils.Builder.l(r5)
            int r5 = r5.getIntrinsicHeight()
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r4, r5, r1)
            android.graphics.drawable.BitmapDrawable r4 = new android.graphics.drawable.BitmapDrawable
            com.bxkj.student.common.view.SnackBarUtils$Builder r5 = r7.builder
            android.view.View r5 = com.bxkj.student.common.view.SnackBarUtils.Builder.u(r5)
            android.content.Context r5 = r5.getContext()
            android.content.res.Resources r5 = r5.getResources()
            r4.<init>(r5, r1)
            goto L224
        L223:
            r4 = r2
        L224:
            com.bxkj.student.common.view.SnackBarUtils$Builder r1 = r7.builder
            android.graphics.drawable.Drawable r1 = com.bxkj.student.common.view.SnackBarUtils.Builder.l(r1)
            r3.setCompoundDrawablesWithIntrinsicBounds(r1, r2, r4, r2)
            r1 = 10
            r3.setCompoundDrawablePadding(r1)
        L232:
            return r0
    }

    public static com.google.android.material.snackbar.Snackbar show(android.app.Activity r2, boolean r3, java.lang.String r4) {
            com.bxkj.student.common.view.SnackBarUtils$Builder r0 = builder()
            if (r3 == 0) goto Le
            r1 = 17170451(0x1060013, float:2.4611966E-38)
        L9:
            int r1 = androidx.core.content.ContextCompat.getColor(r2, r1)
            goto L12
        Le:
            r1 = 2131099719(0x7f060047, float:1.78118E38)
            goto L9
        L12:
            com.bxkj.student.common.view.SnackBarUtils$Builder r0 = r0.setBackgroundColor(r1)
            r1 = 1106247680(0x41f00000, float:30.0)
            com.bxkj.student.common.view.SnackBarUtils$Builder r0 = r0.setTextSize(r1)
            r1 = 2131099737(0x7f060059, float:1.7811836E38)
            int r1 = androidx.core.content.ContextCompat.getColor(r2, r1)
            com.bxkj.student.common.view.SnackBarUtils$Builder r0 = r0.setTextColor(r1)
            r1 = 1
            com.bxkj.student.common.view.SnackBarUtils$Builder r0 = r0.setTextTypefaceStyle(r1)
            com.bxkj.student.common.view.SnackBarUtils$Builder r4 = r0.setText(r4)
            r0 = 4
            com.bxkj.student.common.view.SnackBarUtils$Builder r4 = r4.setMaxLines(r0)
            com.bxkj.student.common.view.SnackBarUtils$Builder r4 = r4.centerText()
            if (r3 == 0) goto L3f
            r3 = 2131690121(0x7f0f0289, float:1.9009277E38)
            goto L42
        L3f:
            r3 = 2131690119(0x7f0f0287, float:1.9009273E38)
        L42:
            com.bxkj.student.common.view.SnackBarUtils$Builder r3 = r4.setIcon(r3)
            com.bxkj.student.common.view.SnackBarUtils$Builder r2 = r3.setActivity(r2)
            r3 = 0
            com.bxkj.student.common.view.SnackBarUtils$Builder r2 = r2.setDuration(r3)
            com.google.android.material.snackbar.Snackbar r2 = r2.build()
            r2.show()
            return r2
    }

    public static com.google.android.material.snackbar.Snackbar show(android.app.Activity r6, boolean r7, java.lang.String r8, int r9) {
            com.bxkj.student.common.view.SnackBarUtils$Builder r0 = builder()
            if (r7 == 0) goto Le
            r1 = 17170451(0x1060013, float:2.4611966E-38)
        L9:
            int r1 = androidx.core.content.ContextCompat.getColor(r6, r1)
            goto L12
        Le:
            r1 = 2131099719(0x7f060047, float:1.78118E38)
            goto L9
        L12:
            com.bxkj.student.common.view.SnackBarUtils$Builder r0 = r0.setBackgroundColor(r1)
            r1 = 1106247680(0x41f00000, float:30.0)
            com.bxkj.student.common.view.SnackBarUtils$Builder r0 = r0.setTextSize(r1)
            r1 = 2131099737(0x7f060059, float:1.7811836E38)
            int r1 = androidx.core.content.ContextCompat.getColor(r6, r1)
            com.bxkj.student.common.view.SnackBarUtils$Builder r0 = r0.setTextColor(r1)
            r1 = 1
            com.bxkj.student.common.view.SnackBarUtils$Builder r0 = r0.setTextTypefaceStyle(r1)
            com.bxkj.student.common.view.SnackBarUtils$Builder r8 = r0.setText(r8)
            r0 = 4
            com.bxkj.student.common.view.SnackBarUtils$Builder r8 = r8.setMaxLines(r0)
            com.bxkj.student.common.view.SnackBarUtils$Builder r8 = r8.centerText()
            if (r7 == 0) goto L3f
            r7 = 2131690121(0x7f0f0289, float:1.9009277E38)
            goto L42
        L3f:
            r7 = 2131690119(0x7f0f0287, float:1.9009273E38)
        L42:
            com.bxkj.student.common.view.SnackBarUtils$Builder r7 = r8.setIcon(r7)
            com.bxkj.student.common.view.SnackBarUtils$Builder r6 = r7.setActivity(r6)
            r7 = -2
            com.bxkj.student.common.view.SnackBarUtils$Builder r6 = r6.setDuration(r7)
            com.google.android.material.snackbar.Snackbar r5 = r6.build()
            r5.show()
            com.bxkj.student.common.view.SnackBarUtils$2 r0 = new com.bxkj.student.common.view.SnackBarUtils$2
            long r1 = (long) r9
            r3 = 1000(0x3e8, double:4.94E-321)
            r0.<init>(r1, r3, r5)
            r0.start()
            return r5
    }

    public static void showSnackBar(android.app.Activity r3, java.lang.String r4) {
            if (r3 == 0) goto L50
            if (r4 == 0) goto L50
            int r0 = r4.length()
            if (r0 != 0) goto Lb
            goto L50
        Lb:
            com.bxkj.student.common.view.SnackBarUtils$Builder r0 = builder()
            android.content.res.Resources r1 = r3.getResources()
            r2 = 17170444(0x106000c, float:2.4611947E-38)
            int r1 = r1.getColor(r2)
            com.bxkj.student.common.view.SnackBarUtils$Builder r0 = r0.setBackgroundColor(r1)
            r1 = 1096810496(0x41600000, float:14.0)
            com.bxkj.student.common.view.SnackBarUtils$Builder r0 = r0.setTextSize(r1)
            android.content.res.Resources r1 = r3.getResources()
            r2 = 2131100716(0x7f06042c, float:1.7813821E38)
            int r1 = r1.getColor(r2)
            com.bxkj.student.common.view.SnackBarUtils$Builder r0 = r0.setTextColor(r1)
            r1 = 1
            com.bxkj.student.common.view.SnackBarUtils$Builder r0 = r0.setTextTypefaceStyle(r1)
            com.bxkj.student.common.view.SnackBarUtils$Builder r4 = r0.setText(r4)
            com.bxkj.student.common.view.SnackBarUtils$Builder r4 = r4.setMaxLines(r1)
            com.bxkj.student.common.view.SnackBarUtils$Builder r3 = r4.setActivity(r3)
            r4 = -1
            com.bxkj.student.common.view.SnackBarUtils$Builder r3 = r3.setDuration(r4)
            com.google.android.material.snackbar.Snackbar r3 = r3.build()
            r3.show()
        L50:
            return
    }

    public static void showSnackBar(android.app.Activity r4, java.lang.String r5, java.lang.String r6, @androidx.annotation.DrawableRes int r7, android.view.View.OnClickListener r8) {
            if (r4 == 0) goto L7d
            if (r5 == 0) goto L7d
            int r0 = r5.length()
            if (r0 == 0) goto L7d
            if (r6 == 0) goto L7d
            int r0 = r6.length()
            if (r0 == 0) goto L7d
            if (r7 == 0) goto L15
            goto L7d
        L15:
            com.bxkj.student.common.view.SnackBarUtils$Builder r0 = builder()
            android.content.res.Resources r1 = r4.getResources()
            r2 = 17170444(0x106000c, float:2.4611947E-38)
            int r1 = r1.getColor(r2)
            com.bxkj.student.common.view.SnackBarUtils$Builder r0 = r0.setBackgroundColor(r1)
            r1 = 1096810496(0x41600000, float:14.0)
            com.bxkj.student.common.view.SnackBarUtils$Builder r0 = r0.setTextSize(r1)
            android.content.res.Resources r2 = r4.getResources()
            r3 = 2131100716(0x7f06042c, float:1.7813821E38)
            int r2 = r2.getColor(r3)
            com.bxkj.student.common.view.SnackBarUtils$Builder r0 = r0.setTextColor(r2)
            r2 = 1
            com.bxkj.student.common.view.SnackBarUtils$Builder r0 = r0.setTextTypefaceStyle(r2)
            com.bxkj.student.common.view.SnackBarUtils$Builder r5 = r0.setText(r5)
            com.bxkj.student.common.view.SnackBarUtils$Builder r5 = r5.setMaxLines(r2)
            com.bxkj.student.common.view.SnackBarUtils$Builder r5 = r5.setActionText(r6)
            android.content.res.Resources r6 = r4.getResources()
            r0 = 17170451(0x1060013, float:2.4611966E-38)
            int r6 = r6.getColor(r0)
            com.bxkj.student.common.view.SnackBarUtils$Builder r5 = r5.setActionTextColor(r6)
            com.bxkj.student.common.view.SnackBarUtils$Builder r5 = r5.setActionTextSize(r1)
            com.bxkj.student.common.view.SnackBarUtils$Builder r5 = r5.setActionTextTypefaceStyle(r2)
            com.bxkj.student.common.view.SnackBarUtils$Builder r5 = r5.setActionClickListener(r8)
            com.bxkj.student.common.view.SnackBarUtils$Builder r4 = r5.setActivity(r4)
            r5 = -2
            com.bxkj.student.common.view.SnackBarUtils$Builder r4 = r4.setDuration(r5)
            com.bxkj.student.common.view.SnackBarUtils$Builder r4 = r4.setIcon(r7)
            com.google.android.material.snackbar.Snackbar r4 = r4.build()
            r4.show()
        L7d:
            return
    }

    public static void showSnackBar(android.app.Activity r5, java.lang.String r6, java.lang.String r7, android.view.View.OnClickListener r8) {
            if (r5 == 0) goto L74
            if (r6 == 0) goto L74
            int r0 = r6.length()
            if (r0 == 0) goto L74
            if (r7 == 0) goto L74
            int r0 = r7.length()
            if (r0 != 0) goto L13
            goto L74
        L13:
            com.bxkj.student.common.view.SnackBarUtils$Builder r0 = builder()
            android.content.res.Resources r1 = r5.getResources()
            r2 = 17170444(0x106000c, float:2.4611947E-38)
            int r1 = r1.getColor(r2)
            com.bxkj.student.common.view.SnackBarUtils$Builder r0 = r0.setBackgroundColor(r1)
            r1 = 1096810496(0x41600000, float:14.0)
            com.bxkj.student.common.view.SnackBarUtils$Builder r0 = r0.setTextSize(r1)
            android.content.res.Resources r3 = r5.getResources()
            r4 = 2131100716(0x7f06042c, float:1.7813821E38)
            int r3 = r3.getColor(r4)
            com.bxkj.student.common.view.SnackBarUtils$Builder r0 = r0.setTextColor(r3)
            r3 = 1
            com.bxkj.student.common.view.SnackBarUtils$Builder r0 = r0.setTextTypefaceStyle(r3)
            com.bxkj.student.common.view.SnackBarUtils$Builder r6 = r0.setText(r6)
            com.bxkj.student.common.view.SnackBarUtils$Builder r6 = r6.setMaxLines(r3)
            com.bxkj.student.common.view.SnackBarUtils$Builder r6 = r6.setActionText(r7)
            android.content.res.Resources r7 = r5.getResources()
            int r7 = r7.getColor(r2)
            com.bxkj.student.common.view.SnackBarUtils$Builder r6 = r6.setActionTextColor(r7)
            com.bxkj.student.common.view.SnackBarUtils$Builder r6 = r6.setActionTextSize(r1)
            com.bxkj.student.common.view.SnackBarUtils$Builder r6 = r6.setActionTextTypefaceStyle(r3)
            com.bxkj.student.common.view.SnackBarUtils$Builder r6 = r6.setActionClickListener(r8)
            com.bxkj.student.common.view.SnackBarUtils$Builder r5 = r6.setActivity(r5)
            r6 = -2
            com.bxkj.student.common.view.SnackBarUtils$Builder r5 = r5.setDuration(r6)
            com.google.android.material.snackbar.Snackbar r5 = r5.build()
            r5.show()
        L74:
            return
    }
}
