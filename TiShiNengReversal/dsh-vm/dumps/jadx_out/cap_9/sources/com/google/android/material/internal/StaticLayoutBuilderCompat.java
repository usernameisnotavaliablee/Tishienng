package com.google.android.material.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class StaticLayoutBuilderCompat {
    static final int DEFAULT_HYPHENATION_FREQUENCY = 0;
    static final float DEFAULT_LINE_SPACING_ADD = 0.0f;
    static final float DEFAULT_LINE_SPACING_MULTIPLIER = 1.0f;
    private static final java.lang.String TEXT_DIRS_CLASS = "android.text.TextDirectionHeuristics";
    private static final java.lang.String TEXT_DIR_CLASS = "android.text.TextDirectionHeuristic";
    private static final java.lang.String TEXT_DIR_CLASS_LTR = "LTR";
    private static final java.lang.String TEXT_DIR_CLASS_RTL = "RTL";

    @androidx.annotation.Nullable
    private static java.lang.reflect.Constructor<android.text.StaticLayout> constructor;
    private static boolean initialized;

    @androidx.annotation.Nullable
    private static java.lang.Object textDirection;
    private android.text.Layout.Alignment alignment;

    @androidx.annotation.Nullable
    private android.text.TextUtils.TruncateAt ellipsize;
    private int end;
    private int hyphenationFrequency;
    private boolean includePad;
    private boolean isRtl;
    private float lineSpacingAdd;
    private float lineSpacingMultiplier;
    private int maxLines;
    private final android.text.TextPaint paint;
    private java.lang.CharSequence source;
    private int start;

    @androidx.annotation.Nullable
    private com.google.android.material.internal.StaticLayoutBuilderConfigurer staticLayoutBuilderConfigurer;
    private final int width;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class StaticLayoutBuilderCompatException extends java.lang.Exception {
        StaticLayoutBuilderCompatException(java.lang.Throwable r3) {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Error thrown initializing StaticLayout "
                r0.append(r1)
                java.lang.String r1 = r3.getMessage()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r2.<init>(r0, r3)
                return
        }
    }

    static {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            com.google.android.material.internal.StaticLayoutBuilderCompat.DEFAULT_HYPHENATION_FREQUENCY = r0
            return
    }

    private StaticLayoutBuilderCompat(java.lang.CharSequence r1, android.text.TextPaint r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            r0.paint = r2
            r0.width = r3
            r2 = 0
            r0.start = r2
            int r1 = r1.length()
            r0.end = r1
            android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_NORMAL
            r0.alignment = r1
            r1 = 2147483647(0x7fffffff, float:NaN)
            r0.maxLines = r1
            r1 = 0
            r0.lineSpacingAdd = r1
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.lineSpacingMultiplier = r1
            int r1 = com.google.android.material.internal.StaticLayoutBuilderCompat.DEFAULT_HYPHENATION_FREQUENCY
            r0.hyphenationFrequency = r1
            r1 = 1
            r0.includePad = r1
            r1 = 0
            r0.ellipsize = r1
            return
    }

    private void createConstructorWithReflection() throws com.google.android.material.internal.StaticLayoutBuilderCompat.StaticLayoutBuilderCompatException {
            r5 = this;
            boolean r0 = com.google.android.material.internal.StaticLayoutBuilderCompat.initialized
            if (r0 == 0) goto L5
            return
        L5:
            boolean r0 = r5.isRtl     // Catch: java.lang.Exception -> L13
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L15
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L13
            r3 = 23
            if (r0 < r3) goto L15
            r0 = 1
            goto L16
        L13:
            r0 = move-exception
            goto L6b
        L15:
            r0 = 0
        L16:
            if (r0 == 0) goto L1b
            android.text.TextDirectionHeuristic r0 = android.text.TextDirectionHeuristics.RTL     // Catch: java.lang.Exception -> L13
            goto L1d
        L1b:
            android.text.TextDirectionHeuristic r0 = android.text.TextDirectionHeuristics.LTR     // Catch: java.lang.Exception -> L13
        L1d:
            com.google.android.material.internal.StaticLayoutBuilderCompat.textDirection = r0     // Catch: java.lang.Exception -> L13
            r0 = 13
            java.lang.Class[] r0 = new java.lang.Class[r0]     // Catch: java.lang.Exception -> L13
            java.lang.Class<java.lang.CharSequence> r3 = java.lang.CharSequence.class
            r0[r1] = r3     // Catch: java.lang.Exception -> L13
            java.lang.Class r1 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L13
            r0[r2] = r1     // Catch: java.lang.Exception -> L13
            r3 = 2
            r0[r3] = r1     // Catch: java.lang.Exception -> L13
            java.lang.Class<android.text.TextPaint> r3 = android.text.TextPaint.class
            r4 = 3
            r0[r4] = r3     // Catch: java.lang.Exception -> L13
            r3 = 4
            r0[r3] = r1     // Catch: java.lang.Exception -> L13
            java.lang.Class<android.text.Layout$Alignment> r3 = android.text.Layout.Alignment.class
            r4 = 5
            r0[r4] = r3     // Catch: java.lang.Exception -> L13
            java.lang.Class<android.text.TextDirectionHeuristic> r3 = android.text.TextDirectionHeuristic.class
            r4 = 6
            r0[r4] = r3     // Catch: java.lang.Exception -> L13
            java.lang.Class r3 = java.lang.Float.TYPE     // Catch: java.lang.Exception -> L13
            r4 = 7
            r0[r4] = r3     // Catch: java.lang.Exception -> L13
            r4 = 8
            r0[r4] = r3     // Catch: java.lang.Exception -> L13
            java.lang.Class r3 = java.lang.Boolean.TYPE     // Catch: java.lang.Exception -> L13
            r4 = 9
            r0[r4] = r3     // Catch: java.lang.Exception -> L13
            java.lang.Class<android.text.TextUtils$TruncateAt> r3 = android.text.TextUtils.TruncateAt.class
            r4 = 10
            r0[r4] = r3     // Catch: java.lang.Exception -> L13
            r3 = 11
            r0[r3] = r1     // Catch: java.lang.Exception -> L13
            r3 = 12
            r0[r3] = r1     // Catch: java.lang.Exception -> L13
            java.lang.Class<android.text.StaticLayout> r1 = android.text.StaticLayout.class
            java.lang.reflect.Constructor r0 = r1.getDeclaredConstructor(r0)     // Catch: java.lang.Exception -> L13
            com.google.android.material.internal.StaticLayoutBuilderCompat.constructor = r0     // Catch: java.lang.Exception -> L13
            r0.setAccessible(r2)     // Catch: java.lang.Exception -> L13
            com.google.android.material.internal.StaticLayoutBuilderCompat.initialized = r2     // Catch: java.lang.Exception -> L13
            return
        L6b:
            com.google.android.material.internal.StaticLayoutBuilderCompat$StaticLayoutBuilderCompatException r1 = new com.google.android.material.internal.StaticLayoutBuilderCompat$StaticLayoutBuilderCompatException
            r1.<init>(r0)
            throw r1
    }

    @androidx.annotation.NonNull
    public static com.google.android.material.internal.StaticLayoutBuilderCompat obtain(@androidx.annotation.NonNull java.lang.CharSequence r1, @androidx.annotation.NonNull android.text.TextPaint r2, @androidx.annotation.IntRange(from = 0) int r3) {
            com.google.android.material.internal.StaticLayoutBuilderCompat r0 = new com.google.android.material.internal.StaticLayoutBuilderCompat
            r0.<init>(r1, r2, r3)
            return r0
    }

    public android.text.StaticLayout build() throws com.google.android.material.internal.StaticLayoutBuilderCompat.StaticLayoutBuilderCompatException {
            r17 = this;
            r1 = r17
            java.lang.CharSequence r0 = r1.source
            if (r0 != 0) goto La
            java.lang.String r0 = ""
            r1.source = r0
        La:
            int r0 = r1.width
            r2 = 0
            int r0 = java.lang.Math.max(r2, r0)
            java.lang.CharSequence r3 = r1.source
            int r4 = r1.maxLines
            r5 = 1
            if (r4 != r5) goto L21
            android.text.TextPaint r4 = r1.paint
            float r6 = (float) r0
            android.text.TextUtils$TruncateAt r7 = r1.ellipsize
            java.lang.CharSequence r3 = android.text.TextUtils.ellipsize(r3, r4, r6, r7)
        L21:
            int r4 = r3.length()
            int r6 = r1.end
            int r4 = java.lang.Math.min(r4, r6)
            r1.end = r4
            int r6 = android.os.Build.VERSION.SDK_INT
            r7 = 23
            r8 = 1065353216(0x3f800000, float:1.0)
            r9 = 0
            if (r6 < r7) goto L92
            boolean r2 = r1.isRtl
            if (r2 == 0) goto L42
            int r2 = r1.maxLines
            if (r2 != r5) goto L42
            android.text.Layout$Alignment r2 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            r1.alignment = r2
        L42:
            int r2 = r1.start
            android.text.TextPaint r6 = r1.paint
            android.text.StaticLayout$Builder r0 = androidx.core.text.e.a(r3, r2, r4, r6, r0)
            android.text.Layout$Alignment r2 = r1.alignment
            com.google.android.material.internal.f.a(r0, r2)
            boolean r2 = r1.includePad
            com.google.android.material.internal.g.a(r0, r2)
            boolean r2 = r1.isRtl
            if (r2 == 0) goto L5b
            android.text.TextDirectionHeuristic r2 = android.text.TextDirectionHeuristics.RTL
            goto L5d
        L5b:
            android.text.TextDirectionHeuristic r2 = android.text.TextDirectionHeuristics.LTR
        L5d:
            androidx.appcompat.widget.c.a(r0, r2)
            android.text.TextUtils$TruncateAt r2 = r1.ellipsize
            if (r2 == 0) goto L67
            com.google.android.material.internal.h.a(r0, r2)
        L67:
            int r2 = r1.maxLines
            com.google.android.material.internal.i.a(r0, r2)
            float r2 = r1.lineSpacingAdd
            int r3 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r3 != 0) goto L78
            float r3 = r1.lineSpacingMultiplier
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 == 0) goto L7d
        L78:
            float r3 = r1.lineSpacingMultiplier
            com.google.android.material.internal.j.a(r0, r2, r3)
        L7d:
            int r2 = r1.maxLines
            if (r2 <= r5) goto L86
            int r2 = r1.hyphenationFrequency
            androidx.core.text.g.a(r0, r2)
        L86:
            com.google.android.material.internal.StaticLayoutBuilderConfigurer r2 = r1.staticLayoutBuilderConfigurer
            if (r2 == 0) goto L8d
            r2.configure(r0)
        L8d:
            android.text.StaticLayout r0 = androidx.core.text.h.a(r0)
            return r0
        L92:
            r1.createConstructorWithReflection()
            java.lang.reflect.Constructor<android.text.StaticLayout> r4 = com.google.android.material.internal.StaticLayoutBuilderCompat.constructor     // Catch: java.lang.Exception -> L107
            java.lang.Object r4 = androidx.core.util.Preconditions.checkNotNull(r4)     // Catch: java.lang.Exception -> L107
            java.lang.reflect.Constructor r4 = (java.lang.reflect.Constructor) r4     // Catch: java.lang.Exception -> L107
            int r6 = r1.start     // Catch: java.lang.Exception -> L107
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Exception -> L107
            int r7 = r1.end     // Catch: java.lang.Exception -> L107
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Exception -> L107
            android.text.TextPaint r10 = r1.paint     // Catch: java.lang.Exception -> L107
            java.lang.Integer r11 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Exception -> L107
            android.text.Layout$Alignment r12 = r1.alignment     // Catch: java.lang.Exception -> L107
            java.lang.Object r13 = com.google.android.material.internal.StaticLayoutBuilderCompat.textDirection     // Catch: java.lang.Exception -> L107
            java.lang.Object r13 = androidx.core.util.Preconditions.checkNotNull(r13)     // Catch: java.lang.Exception -> L107
            java.lang.Float r8 = java.lang.Float.valueOf(r8)     // Catch: java.lang.Exception -> L107
            java.lang.Float r9 = java.lang.Float.valueOf(r9)     // Catch: java.lang.Exception -> L107
            boolean r14 = r1.includePad     // Catch: java.lang.Exception -> L107
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r14)     // Catch: java.lang.Exception -> L107
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Exception -> L107
            int r15 = r1.maxLines     // Catch: java.lang.Exception -> L107
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch: java.lang.Exception -> L107
            r16 = 0
            r2 = 13
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L107
            r2[r16] = r3     // Catch: java.lang.Exception -> L107
            r2[r5] = r6     // Catch: java.lang.Exception -> L107
            r3 = 2
            r2[r3] = r7     // Catch: java.lang.Exception -> L107
            r3 = 3
            r2[r3] = r10     // Catch: java.lang.Exception -> L107
            r3 = 4
            r2[r3] = r11     // Catch: java.lang.Exception -> L107
            r3 = 5
            r2[r3] = r12     // Catch: java.lang.Exception -> L107
            r3 = 6
            r2[r3] = r13     // Catch: java.lang.Exception -> L107
            r3 = 7
            r2[r3] = r8     // Catch: java.lang.Exception -> L107
            r3 = 8
            r2[r3] = r9     // Catch: java.lang.Exception -> L107
            r3 = 9
            r2[r3] = r14     // Catch: java.lang.Exception -> L107
            r3 = 10
            r5 = 0
            r2[r3] = r5     // Catch: java.lang.Exception -> L107
            r3 = 11
            r2[r3] = r0     // Catch: java.lang.Exception -> L107
            r0 = 12
            r2[r0] = r15     // Catch: java.lang.Exception -> L107
            java.lang.Object r0 = r4.newInstance(r2)     // Catch: java.lang.Exception -> L107
            android.text.StaticLayout r0 = (android.text.StaticLayout) r0     // Catch: java.lang.Exception -> L107
            return r0
        L107:
            r0 = move-exception
            com.google.android.material.internal.StaticLayoutBuilderCompat$StaticLayoutBuilderCompatException r2 = new com.google.android.material.internal.StaticLayoutBuilderCompat$StaticLayoutBuilderCompatException
            r2.<init>(r0)
            throw r2
    }

    @androidx.annotation.NonNull
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.internal.StaticLayoutBuilderCompat setAlignment(@androidx.annotation.NonNull android.text.Layout.Alignment r1) {
            r0 = this;
            r0.alignment = r1
            return r0
    }

    @androidx.annotation.NonNull
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.internal.StaticLayoutBuilderCompat setEllipsize(@androidx.annotation.Nullable android.text.TextUtils.TruncateAt r1) {
            r0 = this;
            r0.ellipsize = r1
            return r0
    }

    @androidx.annotation.NonNull
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.internal.StaticLayoutBuilderCompat setEnd(@androidx.annotation.IntRange(from = 0) int r1) {
            r0 = this;
            r0.end = r1
            return r0
    }

    @androidx.annotation.NonNull
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.internal.StaticLayoutBuilderCompat setHyphenationFrequency(int r1) {
            r0 = this;
            r0.hyphenationFrequency = r1
            return r0
    }

    @androidx.annotation.NonNull
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.internal.StaticLayoutBuilderCompat setIncludePad(boolean r1) {
            r0 = this;
            r0.includePad = r1
            return r0
    }

    public com.google.android.material.internal.StaticLayoutBuilderCompat setIsRtl(boolean r1) {
            r0 = this;
            r0.isRtl = r1
            return r0
    }

    @androidx.annotation.NonNull
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.internal.StaticLayoutBuilderCompat setLineSpacing(float r1, float r2) {
            r0 = this;
            r0.lineSpacingAdd = r1
            r0.lineSpacingMultiplier = r2
            return r0
    }

    @androidx.annotation.NonNull
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.internal.StaticLayoutBuilderCompat setMaxLines(@androidx.annotation.IntRange(from = 0) int r1) {
            r0 = this;
            r0.maxLines = r1
            return r0
    }

    @androidx.annotation.NonNull
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.internal.StaticLayoutBuilderCompat setStart(@androidx.annotation.IntRange(from = 0) int r1) {
            r0 = this;
            r0.start = r1
            return r0
    }

    @androidx.annotation.NonNull
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.internal.StaticLayoutBuilderCompat setStaticLayoutBuilderConfigurer(@androidx.annotation.Nullable com.google.android.material.internal.StaticLayoutBuilderConfigurer r1) {
            r0 = this;
            r0.staticLayoutBuilderConfigurer = r1
            return r0
    }
}
