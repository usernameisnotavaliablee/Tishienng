package com.google.android.material.ripple;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class RippleUtils {
    private static final int[] ENABLED_PRESSED_STATE_SET = null;
    private static final int[] FOCUSED_STATE_SET = null;
    private static final int[] HOVERED_FOCUSED_STATE_SET = null;
    private static final int[] HOVERED_STATE_SET = null;

    @androidx.annotation.VisibleForTesting
    static final java.lang.String LOG_TAG = null;
    private static final int[] PRESSED_STATE_SET = null;
    private static final int[] SELECTED_FOCUSED_STATE_SET = null;
    private static final int[] SELECTED_HOVERED_FOCUSED_STATE_SET = null;
    private static final int[] SELECTED_HOVERED_STATE_SET = null;
    private static final int[] SELECTED_PRESSED_STATE_SET = null;
    private static final int[] SELECTED_STATE_SET = null;

    @androidx.annotation.VisibleForTesting
    static final java.lang.String TRANSPARENT_DEFAULT_COLOR_WARNING = "Use a non-transparent color for the default color as it will be used to finish ripple animations.";

    @androidx.annotation.ChecksSdkIntAtLeast(api = 21)
    public static final boolean USE_FRAMEWORK_RIPPLE = false;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(21)
    private static class RippleUtilsLollipop {
        private RippleUtilsLollipop() {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ android.graphics.drawable.Drawable access$000(android.content.Context r0, int r1) {
                android.graphics.drawable.Drawable r0 = createOvalRipple(r0, r1)
                return r0
        }

        @androidx.annotation.DoNotInline
        private static android.graphics.drawable.Drawable createOvalRipple(@androidx.annotation.NonNull android.content.Context r6, @androidx.annotation.Px int r7) {
                android.graphics.drawable.GradientDrawable r1 = new android.graphics.drawable.GradientDrawable
                r1.<init>()
                r0 = -1
                r1.setColor(r0)
                r0 = 1
                r1.setShape(r0)
                android.graphics.drawable.InsetDrawable r0 = new android.graphics.drawable.InsetDrawable
                r3 = r7
                r4 = r7
                r5 = r7
                r2 = r7
                r0.<init>(r1, r2, r3, r4, r5)
                android.graphics.drawable.RippleDrawable r7 = new android.graphics.drawable.RippleDrawable
                int r1 = com.google.android.material.R.attr.colorControlHighlight
                r2 = 0
                android.content.res.ColorStateList r2 = android.content.res.ColorStateList.valueOf(r2)
                android.content.res.ColorStateList r6 = com.google.android.material.color.MaterialColors.getColorStateList(r6, r1, r2)
                r1 = 0
                r7.<init>(r6, r1, r0)
                return r7
        }
    }

    static {
            r0 = 1
            com.google.android.material.ripple.RippleUtils.USE_FRAMEWORK_RIPPLE = r0
            r0 = 16842919(0x10100a7, float:2.3694026E-38)
            int[] r1 = new int[]{r0}
            com.google.android.material.ripple.RippleUtils.PRESSED_STATE_SET = r1
            r1 = 16843623(0x1010367, float:2.3696E-38)
            r2 = 16842908(0x101009c, float:2.3693995E-38)
            int[] r3 = new int[]{r1, r2}
            com.google.android.material.ripple.RippleUtils.HOVERED_FOCUSED_STATE_SET = r3
            int[] r3 = new int[]{r2}
            com.google.android.material.ripple.RippleUtils.FOCUSED_STATE_SET = r3
            int[] r3 = new int[]{r1}
            com.google.android.material.ripple.RippleUtils.HOVERED_STATE_SET = r3
            r3 = 16842913(0x10100a1, float:2.369401E-38)
            int[] r4 = new int[]{r3, r0}
            com.google.android.material.ripple.RippleUtils.SELECTED_PRESSED_STATE_SET = r4
            int[] r4 = new int[]{r3, r1, r2}
            com.google.android.material.ripple.RippleUtils.SELECTED_HOVERED_FOCUSED_STATE_SET = r4
            int[] r2 = new int[]{r3, r2}
            com.google.android.material.ripple.RippleUtils.SELECTED_FOCUSED_STATE_SET = r2
            int[] r1 = new int[]{r3, r1}
            com.google.android.material.ripple.RippleUtils.SELECTED_HOVERED_STATE_SET = r1
            int[] r1 = new int[]{r3}
            com.google.android.material.ripple.RippleUtils.SELECTED_STATE_SET = r1
            r1 = 16842910(0x101009e, float:2.3694E-38)
            int[] r0 = new int[]{r1, r0}
            com.google.android.material.ripple.RippleUtils.ENABLED_PRESSED_STATE_SET = r0
            java.lang.Class<com.google.android.material.ripple.RippleUtils> r0 = com.google.android.material.ripple.RippleUtils.class
            java.lang.String r0 = r0.getSimpleName()
            com.google.android.material.ripple.RippleUtils.LOG_TAG = r0
            return
    }

    private RippleUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    public static android.content.res.ColorStateList convertToRippleDrawableColor(@androidx.annotation.Nullable android.content.res.ColorStateList r7) {
            boolean r0 = com.google.android.material.ripple.RippleUtils.USE_FRAMEWORK_RIPPLE
            r1 = 2
            r2 = 1
            r3 = 3
            r4 = 0
            if (r0 == 0) goto L34
            int[][] r0 = new int[r3][]
            int[] r3 = new int[r3]
            int[] r5 = com.google.android.material.ripple.RippleUtils.SELECTED_STATE_SET
            r0[r4] = r5
            int[] r5 = com.google.android.material.ripple.RippleUtils.SELECTED_PRESSED_STATE_SET
            int r5 = getColorForState(r7, r5)
            r3[r4] = r5
            int[] r4 = com.google.android.material.ripple.RippleUtils.FOCUSED_STATE_SET
            r0[r2] = r4
            int r4 = getColorForState(r7, r4)
            r3[r2] = r4
            int[] r2 = android.util.StateSet.NOTHING
            r0[r1] = r2
            int[] r2 = com.google.android.material.ripple.RippleUtils.PRESSED_STATE_SET
            int r7 = getColorForState(r7, r2)
            r3[r1] = r7
            android.content.res.ColorStateList r7 = new android.content.res.ColorStateList
            r7.<init>(r0, r3)
            return r7
        L34:
            r0 = 10
            int[][] r5 = new int[r0][]
            int[] r0 = new int[r0]
            int[] r6 = com.google.android.material.ripple.RippleUtils.SELECTED_PRESSED_STATE_SET
            r5[r4] = r6
            int r6 = getColorForState(r7, r6)
            r0[r4] = r6
            int[] r6 = com.google.android.material.ripple.RippleUtils.SELECTED_HOVERED_FOCUSED_STATE_SET
            r5[r2] = r6
            int r6 = getColorForState(r7, r6)
            r0[r2] = r6
            int[] r2 = com.google.android.material.ripple.RippleUtils.SELECTED_FOCUSED_STATE_SET
            r5[r1] = r2
            int r2 = getColorForState(r7, r2)
            r0[r1] = r2
            int[] r1 = com.google.android.material.ripple.RippleUtils.SELECTED_HOVERED_STATE_SET
            r5[r3] = r1
            int r1 = getColorForState(r7, r1)
            r0[r3] = r1
            int[] r1 = com.google.android.material.ripple.RippleUtils.SELECTED_STATE_SET
            r2 = 4
            r5[r2] = r1
            r0[r2] = r4
            int[] r1 = com.google.android.material.ripple.RippleUtils.PRESSED_STATE_SET
            r2 = 5
            r5[r2] = r1
            int r1 = getColorForState(r7, r1)
            r0[r2] = r1
            int[] r1 = com.google.android.material.ripple.RippleUtils.HOVERED_FOCUSED_STATE_SET
            r2 = 6
            r5[r2] = r1
            int r1 = getColorForState(r7, r1)
            r0[r2] = r1
            int[] r1 = com.google.android.material.ripple.RippleUtils.FOCUSED_STATE_SET
            r2 = 7
            r5[r2] = r1
            int r1 = getColorForState(r7, r1)
            r0[r2] = r1
            int[] r1 = com.google.android.material.ripple.RippleUtils.HOVERED_STATE_SET
            r2 = 8
            r5[r2] = r1
            int r7 = getColorForState(r7, r1)
            r0[r2] = r7
            int[] r7 = android.util.StateSet.NOTHING
            r1 = 9
            r5[r1] = r7
            r0[r1] = r4
            android.content.res.ColorStateList r7 = new android.content.res.ColorStateList
            r7.<init>(r5, r0)
            return r7
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RequiresApi(21)
    public static android.graphics.drawable.Drawable createOvalRippleLollipop(@androidx.annotation.NonNull android.content.Context r0, @androidx.annotation.Px int r1) {
            android.graphics.drawable.Drawable r0 = com.google.android.material.ripple.RippleUtils.RippleUtilsLollipop.access$000(r0, r1)
            return r0
    }

    @androidx.annotation.ColorInt
    @android.annotation.TargetApi(21)
    private static int doubleAlpha(@androidx.annotation.ColorInt int r2) {
            int r0 = android.graphics.Color.alpha(r2)
            int r0 = r0 * 2
            r1 = 255(0xff, float:3.57E-43)
            int r0 = java.lang.Math.min(r0, r1)
            int r2 = androidx.core.graphics.ColorUtils.setAlphaComponent(r2, r0)
            return r2
    }

    @androidx.annotation.ColorInt
    private static int getColorForState(@androidx.annotation.Nullable android.content.res.ColorStateList r1, int[] r2) {
            if (r1 == 0) goto Lb
            int r0 = r1.getDefaultColor()
            int r1 = r1.getColorForState(r2, r0)
            goto Lc
        Lb:
            r1 = 0
        Lc:
            boolean r2 = com.google.android.material.ripple.RippleUtils.USE_FRAMEWORK_RIPPLE
            if (r2 == 0) goto L14
            int r1 = doubleAlpha(r1)
        L14:
            return r1
    }

    @androidx.annotation.NonNull
    public static android.content.res.ColorStateList sanitizeRippleDrawableColor(@androidx.annotation.Nullable android.content.res.ColorStateList r3) {
            r0 = 0
            if (r3 == 0) goto L21
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 22
            if (r1 < r2) goto L20
            r2 = 27
            if (r1 > r2) goto L20
            int r1 = r3.getDefaultColor()
            int r1 = android.graphics.Color.alpha(r1)
            if (r1 != 0) goto L20
            int[] r1 = com.google.android.material.ripple.RippleUtils.ENABLED_PRESSED_STATE_SET
            int r0 = r3.getColorForState(r1, r0)
            android.graphics.Color.alpha(r0)
        L20:
            return r3
        L21:
            android.content.res.ColorStateList r3 = android.content.res.ColorStateList.valueOf(r0)
            return r3
    }

    public static boolean shouldDrawRippleCompat(@androidx.annotation.NonNull int[] r8) {
            int r0 = r8.length
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
        L5:
            r5 = 1
            if (r2 >= r0) goto L27
            r6 = r8[r2]
            r7 = 16842910(0x101009e, float:2.3694E-38)
            if (r6 != r7) goto L11
            r3 = 1
            goto L24
        L11:
            r7 = 16842908(0x101009c, float:2.3693995E-38)
            if (r6 != r7) goto L18
        L16:
            r4 = 1
            goto L24
        L18:
            r7 = 16842919(0x10100a7, float:2.3694026E-38)
            if (r6 != r7) goto L1e
            goto L16
        L1e:
            r7 = 16843623(0x1010367, float:2.3696E-38)
            if (r6 != r7) goto L24
            goto L16
        L24:
            int r2 = r2 + 1
            goto L5
        L27:
            if (r3 == 0) goto L2c
            if (r4 == 0) goto L2c
            return r5
        L2c:
            return r1
    }
}
