package androidx.core.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class ViewConfigurationCompat {
    private static final int NO_FLING_MAX_VELOCITY = Integer.MIN_VALUE;
    private static final int NO_FLING_MIN_VELOCITY = Integer.MAX_VALUE;
    private static final int RESOURCE_ID_NOT_SUPPORTED = -1;
    private static final int RESOURCE_ID_SUPPORTED_BUT_NOT_FOUND = 0;
    private static final java.lang.String TAG = "ViewConfigCompat";
    private static java.lang.reflect.Method sGetScaledScrollFactorMethod;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(26)
    static class Api26Impl {
        private Api26Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        static float getScaledHorizontalScrollFactor(android.view.ViewConfiguration r0) {
                float r0 = r0.getScaledHorizontalScrollFactor()
                return r0
        }

        @androidx.annotation.DoNotInline
        static float getScaledVerticalScrollFactor(android.view.ViewConfiguration r0) {
                float r0 = r0.getScaledVerticalScrollFactor()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(28)
    static class Api28Impl {
        private Api28Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        static int getScaledHoverSlop(android.view.ViewConfiguration r0) {
                int r0 = r0.getScaledHoverSlop()
                return r0
        }

        @androidx.annotation.DoNotInline
        static boolean shouldShowMenuShortcutsWhenKeyboardPresent(android.view.ViewConfiguration r0) {
                boolean r0 = r0.shouldShowMenuShortcutsWhenKeyboardPresent()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(34)
    static class Api34Impl {
        private Api34Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        static int getScaledMaximumFlingVelocity(@androidx.annotation.NonNull android.view.ViewConfiguration r0, int r1, int r2, int r3) {
                int r0 = r0.getScaledMaximumFlingVelocity(r1, r2, r3)
                return r0
        }

        @androidx.annotation.DoNotInline
        static int getScaledMinimumFlingVelocity(@androidx.annotation.NonNull android.view.ViewConfiguration r0, int r1, int r2, int r3) {
                int r0 = r0.getScaledMinimumFlingVelocity(r1, r2, r3)
                return r0
        }
    }

    static {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 25
            if (r0 != r1) goto L11
            java.lang.Class<android.view.ViewConfiguration> r0 = android.view.ViewConfiguration.class
            java.lang.String r1 = "getScaledScrollFactor"
            r2 = 0
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch: java.lang.Exception -> L11
            androidx.core.view.ViewConfigurationCompat.sGetScaledScrollFactorMethod = r0     // Catch: java.lang.Exception -> L11
        L11:
            return
    }

    private ViewConfigurationCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    private static int getCompatFlingVelocityThreshold(android.content.res.Resources r1, int r2, androidx.core.util.Supplier<java.lang.Integer> r3, int r4) {
            r0 = -1
            if (r2 == r0) goto Le
            if (r2 == 0) goto Ld
            int r1 = r1.getDimensionPixelSize(r2)
            if (r1 >= 0) goto Lc
            goto Ld
        Lc:
            return r1
        Ld:
            return r4
        Le:
            java.lang.Object r1 = r3.get()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            return r1
    }

    private static float getLegacyScrollFactor(android.view.ViewConfiguration r3, android.content.Context r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 25
            if (r0 < r1) goto L18
            java.lang.reflect.Method r0 = androidx.core.view.ViewConfigurationCompat.sGetScaledScrollFactorMethod
            if (r0 == 0) goto L18
            r1 = 0
            java.lang.Object r3 = r0.invoke(r3, r1)     // Catch: java.lang.Exception -> L17
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Exception -> L17
            int r3 = r3.intValue()     // Catch: java.lang.Exception -> L17
            float r3 = (float) r3
            return r3
        L17:
        L18:
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            android.content.res.Resources$Theme r0 = r4.getTheme()
            r1 = 16842829(0x101004d, float:2.3693774E-38)
            r2 = 1
            boolean r0 = r0.resolveAttribute(r1, r3, r2)
            if (r0 == 0) goto L38
            android.content.res.Resources r4 = r4.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r3 = r3.getDimension(r4)
            return r3
        L38:
            r3 = 0
            return r3
    }

    private static int getPlatformResId(android.content.res.Resources r1, java.lang.String r2, java.lang.String r3) {
            java.lang.String r0 = "android"
            int r1 = r1.getIdentifier(r2, r3, r0)
            return r1
    }

    private static int getPreApi34MaximumFlingVelocityResId(android.content.res.Resources r1, int r2, int r3) {
            r0 = 4194304(0x400000, float:5.877472E-39)
            if (r2 != r0) goto L11
            r2 = 26
            if (r3 != r2) goto L11
            java.lang.String r2 = "config_viewMaxRotaryEncoderFlingVelocity"
            java.lang.String r3 = "dimen"
            int r1 = getPlatformResId(r1, r2, r3)
            return r1
        L11:
            r1 = -1
            return r1
    }

    private static int getPreApi34MinimumFlingVelocityResId(android.content.res.Resources r1, int r2, int r3) {
            r0 = 4194304(0x400000, float:5.877472E-39)
            if (r2 != r0) goto L11
            r2 = 26
            if (r3 != r2) goto L11
            java.lang.String r2 = "config_viewMinRotaryEncoderFlingVelocity"
            java.lang.String r3 = "dimen"
            int r1 = getPlatformResId(r1, r2, r3)
            return r1
        L11:
            r1 = -1
            return r1
    }

    public static float getScaledHorizontalScrollFactor(@androidx.annotation.NonNull android.view.ViewConfiguration r2, @androidx.annotation.NonNull android.content.Context r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Lb
            float r2 = androidx.core.view.ViewConfigurationCompat.Api26Impl.getScaledHorizontalScrollFactor(r2)
            return r2
        Lb:
            float r2 = getLegacyScrollFactor(r2, r3)
            return r2
    }

    public static int getScaledHoverSlop(@androidx.annotation.NonNull android.view.ViewConfiguration r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lb
            int r2 = androidx.core.view.ViewConfigurationCompat.Api28Impl.getScaledHoverSlop(r2)
            return r2
        Lb:
            int r2 = r2.getScaledTouchSlop()
            int r2 = r2 / 2
            return r2
    }

    public static int getScaledMaximumFlingVelocity(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.NonNull android.view.ViewConfiguration r3, int r4, int r5, int r6) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Lb
            int r2 = androidx.core.view.ViewConfigurationCompat.Api34Impl.getScaledMaximumFlingVelocity(r3, r4, r5, r6)
            return r2
        Lb:
            boolean r4 = isInputDeviceInfoValid(r4, r5, r6)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r4 != 0) goto L14
            return r0
        L14:
            android.content.res.Resources r2 = r2.getResources()
            int r4 = getPreApi34MaximumFlingVelocityResId(r2, r6, r5)
            java.util.Objects.requireNonNull(r3)
            androidx.core.view.j0 r5 = new androidx.core.view.j0
            r5.<init>(r3)
            int r2 = getCompatFlingVelocityThreshold(r2, r4, r5, r0)
            return r2
    }

    public static int getScaledMinimumFlingVelocity(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.NonNull android.view.ViewConfiguration r3, int r4, int r5, int r6) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Lb
            int r2 = androidx.core.view.ViewConfigurationCompat.Api34Impl.getScaledMinimumFlingVelocity(r3, r4, r5, r6)
            return r2
        Lb:
            boolean r4 = isInputDeviceInfoValid(r4, r5, r6)
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r4 != 0) goto L15
            return r0
        L15:
            android.content.res.Resources r2 = r2.getResources()
            int r4 = getPreApi34MinimumFlingVelocityResId(r2, r6, r5)
            java.util.Objects.requireNonNull(r3)
            androidx.core.view.k0 r5 = new androidx.core.view.k0
            r5.<init>(r3)
            int r2 = getCompatFlingVelocityThreshold(r2, r4, r5, r0)
            return r2
    }

    @java.lang.Deprecated
    public static int getScaledPagingTouchSlop(android.view.ViewConfiguration r0) {
            int r0 = r0.getScaledPagingTouchSlop()
            return r0
    }

    public static float getScaledVerticalScrollFactor(@androidx.annotation.NonNull android.view.ViewConfiguration r2, @androidx.annotation.NonNull android.content.Context r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Lb
            float r2 = androidx.core.view.ViewConfigurationCompat.Api26Impl.getScaledVerticalScrollFactor(r2)
            return r2
        Lb:
            float r2 = getLegacyScrollFactor(r2, r3)
            return r2
    }

    @java.lang.Deprecated
    public static boolean hasPermanentMenuKey(android.view.ViewConfiguration r0) {
            boolean r0 = r0.hasPermanentMenuKey()
            return r0
    }

    private static boolean isInputDeviceInfoValid(int r0, int r1, int r2) {
            android.view.InputDevice r0 = android.view.InputDevice.getDevice(r0)
            if (r0 == 0) goto Le
            android.view.InputDevice$MotionRange r0 = r0.getMotionRange(r1, r2)
            if (r0 == 0) goto Le
            r0 = 1
            return r0
        Le:
            r0 = 0
            return r0
    }

    public static boolean shouldShowMenuShortcutsWhenKeyboardPresent(@androidx.annotation.NonNull android.view.ViewConfiguration r2, @androidx.annotation.NonNull android.content.Context r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lb
            boolean r2 = androidx.core.view.ViewConfigurationCompat.Api28Impl.shouldShowMenuShortcutsWhenKeyboardPresent(r2)
            return r2
        Lb:
            android.content.res.Resources r2 = r3.getResources()
            java.lang.String r3 = "config_showMenuShortcutsWhenKeyboardPresent"
            java.lang.String r0 = "bool"
            int r3 = getPlatformResId(r2, r3, r0)
            if (r3 == 0) goto L21
            boolean r2 = r2.getBoolean(r3)
            if (r2 == 0) goto L21
            r2 = 1
            return r2
        L21:
            r2 = 0
            return r2
    }
}
