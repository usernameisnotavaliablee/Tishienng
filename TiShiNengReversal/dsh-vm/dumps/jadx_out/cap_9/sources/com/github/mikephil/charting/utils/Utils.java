package com.github.mikephil.charting.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class Utils {
    public static final double DEG2RAD = 0.017453292519943295d;
    public static final double DOUBLE_EPSILON = 0.0d;
    public static final float FDEG2RAD = 0.017453292f;
    public static final float FLOAT_EPSILON = 0.0f;
    private static final int[] POW_10 = null;
    private static android.graphics.Rect mCalcTextHeightRect = null;
    private static android.graphics.Rect mCalcTextSizeRect = null;
    private static com.github.mikephil.charting.formatter.ValueFormatter mDefaultValueFormatter = null;
    private static android.graphics.Rect mDrawTextRectBuffer = null;
    private static android.graphics.Rect mDrawableBoundsCache = null;
    private static android.graphics.Paint.FontMetrics mFontMetrics = null;
    private static android.graphics.Paint.FontMetrics mFontMetricsBuffer = null;
    private static int mMaximumFlingVelocity = 8000;
    private static android.util.DisplayMetrics mMetrics = null;
    private static int mMinimumFlingVelocity = 50;

    static {
            r0 = 1
            double r0 = java.lang.Double.longBitsToDouble(r0)
            com.github.mikephil.charting.utils.Utils.DOUBLE_EPSILON = r0
            r0 = 1
            float r0 = java.lang.Float.intBitsToFloat(r0)
            com.github.mikephil.charting.utils.Utils.FLOAT_EPSILON = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            com.github.mikephil.charting.utils.Utils.mCalcTextHeightRect = r0
            android.graphics.Paint$FontMetrics r0 = new android.graphics.Paint$FontMetrics
            r0.<init>()
            com.github.mikephil.charting.utils.Utils.mFontMetrics = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            com.github.mikephil.charting.utils.Utils.mCalcTextSizeRect = r0
            r0 = 10
            int[] r0 = new int[r0]
            r0 = {x004a: FILL_ARRAY_DATA , data: [1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000} // fill-array
            com.github.mikephil.charting.utils.Utils.POW_10 = r0
            com.github.mikephil.charting.formatter.ValueFormatter r0 = generateDefaultValueFormatter()
            com.github.mikephil.charting.utils.Utils.mDefaultValueFormatter = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            com.github.mikephil.charting.utils.Utils.mDrawableBoundsCache = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            com.github.mikephil.charting.utils.Utils.mDrawTextRectBuffer = r0
            android.graphics.Paint$FontMetrics r0 = new android.graphics.Paint$FontMetrics
            r0.<init>()
            com.github.mikephil.charting.utils.Utils.mFontMetricsBuffer = r0
            return
    }

    public Utils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int calcTextHeight(android.graphics.Paint r3, java.lang.String r4) {
            android.graphics.Rect r0 = com.github.mikephil.charting.utils.Utils.mCalcTextHeightRect
            r1 = 0
            r0.set(r1, r1, r1, r1)
            int r2 = r4.length()
            r3.getTextBounds(r4, r1, r2, r0)
            int r3 = r0.height()
            return r3
    }

    public static com.github.mikephil.charting.utils.FSize calcTextSize(android.graphics.Paint r1, java.lang.String r2) {
            r0 = 0
            com.github.mikephil.charting.utils.FSize r0 = com.github.mikephil.charting.utils.FSize.getInstance(r0, r0)
            calcTextSize(r1, r2, r0)
            return r0
    }

    public static void calcTextSize(android.graphics.Paint r3, java.lang.String r4, com.github.mikephil.charting.utils.FSize r5) {
            android.graphics.Rect r0 = com.github.mikephil.charting.utils.Utils.mCalcTextSizeRect
            r1 = 0
            r0.set(r1, r1, r1, r1)
            int r2 = r4.length()
            r3.getTextBounds(r4, r1, r2, r0)
            int r3 = r0.width()
            float r3 = (float) r3
            r5.width = r3
            int r3 = r0.height()
            float r3 = (float) r3
            r5.height = r3
            return
    }

    public static int calcTextWidth(android.graphics.Paint r0, java.lang.String r1) {
            float r0 = r0.measureText(r1)
            int r0 = (int) r0
            return r0
    }

    public static float convertDpToPixel(float r1) {
            android.util.DisplayMetrics r0 = com.github.mikephil.charting.utils.Utils.mMetrics
            if (r0 != 0) goto L5
            return r1
        L5:
            float r0 = r0.density
            float r1 = r1 * r0
            return r1
    }

    public static int[] convertIntegers(java.util.List<java.lang.Integer> r1) {
            int r0 = r1.size()
            int[] r0 = new int[r0]
            copyIntegers(r1, r0)
            return r0
    }

    public static float convertPixelsToDp(float r1) {
            android.util.DisplayMetrics r0 = com.github.mikephil.charting.utils.Utils.mMetrics
            if (r0 != 0) goto L5
            return r1
        L5:
            float r0 = r0.density
            float r1 = r1 / r0
            return r1
    }

    public static java.lang.String[] convertStrings(java.util.List<java.lang.String> r4) {
            int r0 = r4.size()
            java.lang.String[] r1 = new java.lang.String[r0]
            r2 = 0
        L7:
            if (r2 >= r0) goto L14
            java.lang.Object r3 = r4.get(r2)
            java.lang.String r3 = (java.lang.String) r3
            r1[r2] = r3
            int r2 = r2 + 1
            goto L7
        L14:
            return r1
    }

    public static void copyIntegers(java.util.List<java.lang.Integer> r3, int[] r4) {
            int r0 = r4.length
            int r1 = r3.size()
            if (r0 >= r1) goto L9
            int r0 = r4.length
            goto Ld
        L9:
            int r0 = r3.size()
        Ld:
            r1 = 0
        Le:
            if (r1 >= r0) goto L1f
            java.lang.Object r2 = r3.get(r1)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r4[r1] = r2
            int r1 = r1 + 1
            goto Le
        L1f:
            return
    }

    public static void copyStrings(java.util.List<java.lang.String> r3, java.lang.String[] r4) {
            int r0 = r4.length
            int r1 = r3.size()
            if (r0 >= r1) goto L9
            int r0 = r4.length
            goto Ld
        L9:
            int r0 = r3.size()
        Ld:
            r1 = 0
        Le:
            if (r1 >= r0) goto L1b
            java.lang.Object r2 = r3.get(r1)
            java.lang.String r2 = (java.lang.String) r2
            r4[r1] = r2
            int r1 = r1 + 1
            goto Le
        L1b:
            return
    }

    public static void drawImage(android.graphics.Canvas r2, android.graphics.drawable.Drawable r3, int r4, int r5, int r6, int r7) {
            com.github.mikephil.charting.utils.MPPointF r0 = com.github.mikephil.charting.utils.MPPointF.getInstance()
            int r1 = r6 / 2
            int r4 = r4 - r1
            float r4 = (float) r4
            r0.x = r4
            int r7 = r7 / 2
            int r5 = r5 - r7
            float r4 = (float) r5
            r0.y = r4
            android.graphics.Rect r4 = com.github.mikephil.charting.utils.Utils.mDrawableBoundsCache
            r3.copyBounds(r4)
            android.graphics.Rect r4 = com.github.mikephil.charting.utils.Utils.mDrawableBoundsCache
            int r5 = r4.left
            int r4 = r4.top
            int r7 = r5 + r6
            int r6 = r6 + r4
            r3.setBounds(r5, r4, r7, r6)
            int r4 = r2.save()
            float r5 = r0.x
            float r6 = r0.y
            r2.translate(r5, r6)
            r3.draw(r2)
            r2.restoreToCount(r4)
            return
    }

    public static void drawMultilineText(android.graphics.Canvas r7, android.text.StaticLayout r8, float r9, float r10, android.text.TextPaint r11, com.github.mikephil.charting.utils.MPPointF r12, float r13) {
            android.graphics.Paint$FontMetrics r0 = com.github.mikephil.charting.utils.Utils.mFontMetricsBuffer
            float r0 = r11.getFontMetrics(r0)
            int r1 = r8.getWidth()
            float r1 = (float) r1
            int r2 = r8.getLineCount()
            float r2 = (float) r2
            float r2 = r2 * r0
            android.graphics.Rect r0 = com.github.mikephil.charting.utils.Utils.mDrawTextRectBuffer
            int r0 = r0.left
            float r0 = (float) r0
            r3 = 0
            float r0 = r3 - r0
            float r4 = r2 + r3
            android.graphics.Paint$Align r5 = r11.getTextAlign()
            android.graphics.Paint$Align r6 = android.graphics.Paint.Align.LEFT
            r11.setTextAlign(r6)
            int r6 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r6 == 0) goto L67
            r3 = 1056964608(0x3f000000, float:0.5)
            float r6 = r1 * r3
            float r0 = r0 - r6
            float r6 = r2 * r3
            float r4 = r4 - r6
            float r6 = r12.x
            int r6 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r6 != 0) goto L3d
            float r6 = r12.y
            int r6 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r6 == 0) goto L54
        L3d:
            com.github.mikephil.charting.utils.FSize r1 = getSizeOfRotatedRectangleByDegrees(r1, r2, r13)
            float r2 = r1.width
            float r6 = r12.x
            float r6 = r6 - r3
            float r2 = r2 * r6
            float r9 = r9 - r2
            float r2 = r1.height
            float r12 = r12.y
            float r12 = r12 - r3
            float r2 = r2 * r12
            float r10 = r10 - r2
            com.github.mikephil.charting.utils.FSize.recycleInstance(r1)
        L54:
            r7.save()
            r7.translate(r9, r10)
            r7.rotate(r13)
            r7.translate(r0, r4)
            r8.draw(r7)
            r7.restore()
            goto L89
        L67:
            float r13 = r12.x
            int r6 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r6 != 0) goto L73
            float r6 = r12.y
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 == 0) goto L7b
        L73:
            float r1 = r1 * r13
            float r0 = r0 - r1
            float r12 = r12.y
            float r2 = r2 * r12
            float r4 = r4 - r2
        L7b:
            float r0 = r0 + r9
            float r4 = r4 + r10
            r7.save()
            r7.translate(r0, r4)
            r8.draw(r7)
            r7.restore()
        L89:
            r11.setTextAlign(r5)
            return
    }

    public static void drawMultilineText(android.graphics.Canvas r10, java.lang.String r11, float r12, float r13, android.text.TextPaint r14, com.github.mikephil.charting.utils.FSize r15, com.github.mikephil.charting.utils.MPPointF r16, float r17) {
            android.text.StaticLayout r0 = new android.text.StaticLayout
            int r3 = r11.length()
            float r15 = r15.width
            double r1 = (double) r15
            double r1 = java.lang.Math.ceil(r1)
            r4 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r1 = java.lang.Math.max(r1, r4)
            int r5 = (int) r1
            android.text.Layout$Alignment r6 = android.text.Layout.Alignment.ALIGN_NORMAL
            r8 = 0
            r9 = 0
            r2 = 0
            r7 = 1065353216(0x3f800000, float:1.0)
            r1 = r11
            r4 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r2 = r12
            r3 = r13
            r5 = r16
            r6 = r17
            r1 = r0
            r0 = r10
            drawMultilineText(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void drawXAxisValue(android.graphics.Canvas r7, java.lang.String r8, float r9, float r10, android.graphics.Paint r11, com.github.mikephil.charting.utils.MPPointF r12, float r13) {
            android.graphics.Paint$FontMetrics r0 = com.github.mikephil.charting.utils.Utils.mFontMetricsBuffer
            float r0 = r11.getFontMetrics(r0)
            int r1 = r8.length()
            android.graphics.Rect r2 = com.github.mikephil.charting.utils.Utils.mDrawTextRectBuffer
            r3 = 0
            r11.getTextBounds(r8, r3, r1, r2)
            android.graphics.Rect r1 = com.github.mikephil.charting.utils.Utils.mDrawTextRectBuffer
            int r1 = r1.left
            float r1 = (float) r1
            r2 = 0
            float r1 = r2 - r1
            android.graphics.Paint$FontMetrics r3 = com.github.mikephil.charting.utils.Utils.mFontMetricsBuffer
            float r3 = r3.ascent
            float r3 = -r3
            float r3 = r3 + r2
            android.graphics.Paint$Align r4 = r11.getTextAlign()
            android.graphics.Paint$Align r5 = android.graphics.Paint.Align.LEFT
            r11.setTextAlign(r5)
            int r5 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r5 == 0) goto L74
            android.graphics.Rect r2 = com.github.mikephil.charting.utils.Utils.mDrawTextRectBuffer
            int r2 = r2.width()
            float r2 = (float) r2
            r5 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 * r5
            float r1 = r1 - r2
            float r2 = r0 * r5
            float r3 = r3 - r2
            float r2 = r12.x
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 != 0) goto L46
            float r2 = r12.y
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 == 0) goto L64
        L46:
            android.graphics.Rect r2 = com.github.mikephil.charting.utils.Utils.mDrawTextRectBuffer
            int r2 = r2.width()
            float r2 = (float) r2
            com.github.mikephil.charting.utils.FSize r0 = getSizeOfRotatedRectangleByDegrees(r2, r0, r13)
            float r2 = r0.width
            float r6 = r12.x
            float r6 = r6 - r5
            float r2 = r2 * r6
            float r9 = r9 - r2
            float r2 = r0.height
            float r12 = r12.y
            float r12 = r12 - r5
            float r2 = r2 * r12
            float r10 = r10 - r2
            com.github.mikephil.charting.utils.FSize.recycleInstance(r0)
        L64:
            r7.save()
            r7.translate(r9, r10)
            r7.rotate(r13)
            r7.drawText(r8, r1, r3, r11)
            r7.restore()
            goto L96
        L74:
            float r13 = r12.x
            int r13 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r13 != 0) goto L80
            float r13 = r12.y
            int r13 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r13 == 0) goto L91
        L80:
            android.graphics.Rect r13 = com.github.mikephil.charting.utils.Utils.mDrawTextRectBuffer
            int r13 = r13.width()
            float r13 = (float) r13
            float r2 = r12.x
            float r13 = r13 * r2
            float r1 = r1 - r13
            float r12 = r12.y
            float r0 = r0 * r12
            float r3 = r3 - r0
        L91:
            float r1 = r1 + r9
            float r3 = r3 + r10
            r7.drawText(r8, r1, r3, r11)
        L96:
            r11.setTextAlign(r4)
            return
    }

    public static java.lang.String formatNumber(float r1, int r2, boolean r3) {
            r0 = 46
            java.lang.String r1 = formatNumber(r1, r2, r3, r0)
            return r1
    }

    public static java.lang.String formatNumber(float r17, int r18, boolean r19, char r20) {
            r0 = r17
            r1 = 35
            char[] r2 = new char[r1]
            r3 = 0
            int r4 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r4 != 0) goto Le
            java.lang.String r0 = "0"
            return r0
        Le:
            r4 = 1065353216(0x3f800000, float:1.0)
            r5 = 1
            r6 = 0
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 >= 0) goto L1e
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 <= 0) goto L1e
            r4 = 1
            goto L1f
        L1e:
            r4 = 0
        L1f:
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 >= 0) goto L26
            float r0 = -r0
            r3 = 1
            goto L27
        L26:
            r3 = 0
        L27:
            int[] r7 = com.github.mikephil.charting.utils.Utils.POW_10
            int r8 = r7.length
            r9 = r18
            if (r9 <= r8) goto L31
            int r8 = r7.length
            int r8 = r8 - r5
            goto L32
        L31:
            r8 = r9
        L32:
            r7 = r7[r8]
            float r7 = (float) r7
            float r0 = r0 * r7
            int r0 = java.lang.Math.round(r0)
            long r9 = (long) r0
            r0 = 34
            r7 = 0
        L3f:
            r11 = 48
            r12 = 0
            int r14 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r14 != 0) goto L65
            int r14 = r8 + 1
            if (r6 >= r14) goto L4c
            goto L65
        L4c:
            if (r4 == 0) goto L55
            int r4 = r0 + (-1)
            r2[r0] = r11
            int r6 = r6 + 1
            r0 = r4
        L55:
            if (r3 == 0) goto L5d
            r3 = 45
            r2[r0] = r3
            int r6 = r6 + 1
        L5d:
            int r1 = r1 - r6
            int r0 = 35 - r1
            java.lang.String r0 = java.lang.String.valueOf(r2, r1, r0)
            return r0
        L65:
            r14 = 10
            r16 = r2
            long r1 = r9 % r14
            int r2 = (int) r1
            long r9 = r9 / r14
            int r1 = r0 + (-1)
            int r2 = r2 + r11
            char r2 = (char) r2
            r16[r0] = r2
            int r2 = r6 + 1
            if (r2 != r8) goto L81
            int r0 = r0 + (-2)
            r2 = 44
            r16[r1] = r2
            int r6 = r6 + 2
            r7 = 1
            goto La6
        L81:
            if (r19 == 0) goto La4
            int r11 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r11 == 0) goto La4
            if (r2 <= r8) goto La4
            if (r7 == 0) goto L98
            int r11 = r2 - r8
            int r11 = r11 % 4
            if (r11 != 0) goto La4
            int r0 = r0 + (-2)
            r16[r1] = r20
        L95:
            int r6 = r6 + 2
            goto La6
        L98:
            int r11 = r2 - r8
            int r11 = r11 % 4
            r12 = 3
            if (r11 != r12) goto La4
            int r0 = r0 + (-2)
            r16[r1] = r20
            goto L95
        La4:
            r0 = r1
            r6 = r2
        La6:
            r2 = r16
            r1 = 35
            goto L3f
    }

    private static com.github.mikephil.charting.formatter.ValueFormatter generateDefaultValueFormatter() {
            com.github.mikephil.charting.formatter.DefaultValueFormatter r0 = new com.github.mikephil.charting.formatter.DefaultValueFormatter
            r1 = 1
            r0.<init>(r1)
            return r0
    }

    public static int getDecimals(float r2) {
            double r0 = (double) r2
            float r2 = roundToNextSignificant(r0)
            boolean r0 = java.lang.Float.isInfinite(r2)
            if (r0 == 0) goto Ld
            r2 = 0
            return r2
        Ld:
            double r0 = (double) r2
            double r0 = java.lang.Math.log10(r0)
            double r0 = -r0
            double r0 = java.lang.Math.ceil(r0)
            int r2 = (int) r0
            int r2 = r2 + 2
            return r2
    }

    public static com.github.mikephil.charting.formatter.ValueFormatter getDefaultValueFormatter() {
            com.github.mikephil.charting.formatter.ValueFormatter r0 = com.github.mikephil.charting.utils.Utils.mDefaultValueFormatter
            return r0
    }

    public static float getLineHeight(android.graphics.Paint r1) {
            android.graphics.Paint$FontMetrics r0 = com.github.mikephil.charting.utils.Utils.mFontMetrics
            float r1 = getLineHeight(r1, r0)
            return r1
    }

    public static float getLineHeight(android.graphics.Paint r0, android.graphics.Paint.FontMetrics r1) {
            r0.getFontMetrics(r1)
            float r0 = r1.descent
            float r1 = r1.ascent
            float r0 = r0 - r1
            return r0
    }

    public static float getLineSpacing(android.graphics.Paint r1) {
            android.graphics.Paint$FontMetrics r0 = com.github.mikephil.charting.utils.Utils.mFontMetrics
            float r1 = getLineSpacing(r1, r0)
            return r1
    }

    public static float getLineSpacing(android.graphics.Paint r1, android.graphics.Paint.FontMetrics r2) {
            r1.getFontMetrics(r2)
            float r1 = r2.ascent
            float r0 = r2.top
            float r1 = r1 - r0
            float r2 = r2.bottom
            float r1 = r1 + r2
            return r1
    }

    public static int getMaximumFlingVelocity() {
            int r0 = com.github.mikephil.charting.utils.Utils.mMaximumFlingVelocity
            return r0
    }

    public static int getMinimumFlingVelocity() {
            int r0 = com.github.mikephil.charting.utils.Utils.mMinimumFlingVelocity
            return r0
    }

    public static float getNormalizedAngle(float r2) {
        L0:
            r0 = 0
            r1 = 1135869952(0x43b40000, float:360.0)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 >= 0) goto L9
            float r2 = r2 + r1
            goto L0
        L9:
            float r2 = r2 % r1
            return r2
    }

    public static com.github.mikephil.charting.utils.MPPointF getPosition(com.github.mikephil.charting.utils.MPPointF r1, float r2, float r3) {
            r0 = 0
            com.github.mikephil.charting.utils.MPPointF r0 = com.github.mikephil.charting.utils.MPPointF.getInstance(r0, r0)
            getPosition(r1, r2, r3, r0)
            return r0
    }

    public static void getPosition(com.github.mikephil.charting.utils.MPPointF r6, float r7, float r8, com.github.mikephil.charting.utils.MPPointF r9) {
            float r0 = r6.x
            double r0 = (double) r0
            double r2 = (double) r7
            double r7 = (double) r8
            double r4 = java.lang.Math.toRadians(r7)
            double r4 = java.lang.Math.cos(r4)
            double r4 = r4 * r2
            double r0 = r0 + r4
            float r0 = (float) r0
            r9.x = r0
            float r6 = r6.y
            double r0 = (double) r6
            double r6 = java.lang.Math.toRadians(r7)
            double r6 = java.lang.Math.sin(r6)
            double r2 = r2 * r6
            double r0 = r0 + r2
            float r6 = (float) r0
            r9.y = r6
            return
    }

    public static int getSDKInt() {
            int r0 = android.os.Build.VERSION.SDK_INT
            return r0
    }

    public static com.github.mikephil.charting.utils.FSize getSizeOfRotatedRectangleByDegrees(float r1, float r2, float r3) {
            r0 = 1016003125(0x3c8efa35, float:0.017453292)
            float r3 = r3 * r0
            com.github.mikephil.charting.utils.FSize r1 = getSizeOfRotatedRectangleByRadians(r1, r2, r3)
            return r1
    }

    public static com.github.mikephil.charting.utils.FSize getSizeOfRotatedRectangleByDegrees(com.github.mikephil.charting.utils.FSize r1, float r2) {
            r0 = 1016003125(0x3c8efa35, float:0.017453292)
            float r2 = r2 * r0
            float r0 = r1.width
            float r1 = r1.height
            com.github.mikephil.charting.utils.FSize r1 = getSizeOfRotatedRectangleByRadians(r0, r1, r2)
            return r1
    }

    public static com.github.mikephil.charting.utils.FSize getSizeOfRotatedRectangleByRadians(float r4, float r5, float r6) {
            double r0 = (double) r6
            double r2 = java.lang.Math.cos(r0)
            float r6 = (float) r2
            float r6 = r6 * r4
            float r6 = java.lang.Math.abs(r6)
            double r2 = java.lang.Math.sin(r0)
            float r2 = (float) r2
            float r2 = r2 * r5
            float r2 = java.lang.Math.abs(r2)
            float r6 = r6 + r2
            double r2 = java.lang.Math.sin(r0)
            float r2 = (float) r2
            float r4 = r4 * r2
            float r4 = java.lang.Math.abs(r4)
            double r0 = java.lang.Math.cos(r0)
            float r0 = (float) r0
            float r5 = r5 * r0
            float r5 = java.lang.Math.abs(r5)
            float r4 = r4 + r5
            com.github.mikephil.charting.utils.FSize r4 = com.github.mikephil.charting.utils.FSize.getInstance(r6, r4)
            return r4
    }

    public static com.github.mikephil.charting.utils.FSize getSizeOfRotatedRectangleByRadians(com.github.mikephil.charting.utils.FSize r1, float r2) {
            float r0 = r1.width
            float r1 = r1.height
            com.github.mikephil.charting.utils.FSize r1 = getSizeOfRotatedRectangleByRadians(r0, r1, r2)
            return r1
    }

    public static void init(android.content.Context r2) {
            if (r2 != 0) goto Lf
            int r2 = android.view.ViewConfiguration.getMinimumFlingVelocity()
            com.github.mikephil.charting.utils.Utils.mMinimumFlingVelocity = r2
            int r2 = android.view.ViewConfiguration.getMaximumFlingVelocity()
            com.github.mikephil.charting.utils.Utils.mMaximumFlingVelocity = r2
            return
        Lf:
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r2)
            int r1 = r0.getScaledMinimumFlingVelocity()
            com.github.mikephil.charting.utils.Utils.mMinimumFlingVelocity = r1
            int r0 = r0.getScaledMaximumFlingVelocity()
            com.github.mikephil.charting.utils.Utils.mMaximumFlingVelocity = r0
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            com.github.mikephil.charting.utils.Utils.mMetrics = r2
            return
    }

    @java.lang.Deprecated
    public static void init(android.content.res.Resources r0) {
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            com.github.mikephil.charting.utils.Utils.mMetrics = r0
            int r0 = android.view.ViewConfiguration.getMinimumFlingVelocity()
            com.github.mikephil.charting.utils.Utils.mMinimumFlingVelocity = r0
            int r0 = android.view.ViewConfiguration.getMaximumFlingVelocity()
            com.github.mikephil.charting.utils.Utils.mMaximumFlingVelocity = r0
            return
    }

    public static double nextUp(double r5) {
            r0 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 != 0) goto L7
            return r5
        L7:
            r0 = 0
            double r5 = r5 + r0
            long r2 = java.lang.Double.doubleToRawLongBits(r5)
            int r4 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r4 < 0) goto L15
            r5 = 1
            goto L17
        L15:
            r5 = -1
        L17:
            long r2 = r2 + r5
            double r5 = java.lang.Double.longBitsToDouble(r2)
            return r5
    }

    @android.annotation.SuppressLint({"NewApi"})
    public static void postInvalidateOnAnimation(android.view.View r0) {
            r0.postInvalidateOnAnimation()
            return
    }

    public static float roundToNextSignificant(double r5) {
            boolean r0 = java.lang.Double.isInfinite(r5)
            if (r0 != 0) goto L3a
            boolean r0 = java.lang.Double.isNaN(r5)
            if (r0 != 0) goto L3a
            r0 = 0
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 != 0) goto L13
            goto L3a
        L13:
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 >= 0) goto L19
            double r0 = -r5
            goto L1a
        L19:
            r0 = r5
        L1a:
            double r0 = java.lang.Math.log10(r0)
            float r0 = (float) r0
            double r0 = (double) r0
            double r0 = java.lang.Math.ceil(r0)
            float r0 = (float) r0
            int r0 = (int) r0
            int r0 = 1 - r0
            r1 = 4621819117588971520(0x4024000000000000, double:10.0)
            double r3 = (double) r0
            double r0 = java.lang.Math.pow(r1, r3)
            float r0 = (float) r0
            double r1 = (double) r0
            double r5 = r5 * r1
            long r5 = java.lang.Math.round(r5)
            float r5 = (float) r5
            float r5 = r5 / r0
            return r5
        L3a:
            r5 = 0
            return r5
    }

    public static void velocityTrackerPointerUpCleanUpIfNecessary(android.view.MotionEvent r7, android.view.VelocityTracker r8) {
            int r0 = com.github.mikephil.charting.utils.Utils.mMaximumFlingVelocity
            float r0 = (float) r0
            r1 = 1000(0x3e8, float:1.401E-42)
            r8.computeCurrentVelocity(r1, r0)
            int r0 = r7.getActionIndex()
            int r1 = r7.getPointerId(r0)
            float r2 = r8.getXVelocity(r1)
            float r1 = r8.getYVelocity(r1)
            int r3 = r7.getPointerCount()
            r4 = 0
        L1d:
            if (r4 >= r3) goto L3f
            if (r4 != r0) goto L22
            goto L3c
        L22:
            int r5 = r7.getPointerId(r4)
            float r6 = r8.getXVelocity(r5)
            float r6 = r6 * r2
            float r5 = r8.getYVelocity(r5)
            float r5 = r5 * r1
            float r6 = r6 + r5
            r5 = 0
            int r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r5 >= 0) goto L3c
            r8.clear()
            return
        L3c:
            int r4 = r4 + 1
            goto L1d
        L3f:
            return
    }
}
