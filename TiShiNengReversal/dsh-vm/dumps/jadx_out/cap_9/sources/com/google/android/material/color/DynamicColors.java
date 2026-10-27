package com.google.android.material.color;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class DynamicColors {
    private static final com.google.android.material.color.DynamicColors.DeviceSupportCondition DEFAULT_DEVICE_SUPPORT_CONDITION = null;
    private static final java.util.Map<java.lang.String, com.google.android.material.color.DynamicColors.DeviceSupportCondition> DYNAMIC_COLOR_SUPPORTED_BRANDS = null;
    private static final java.util.Map<java.lang.String, com.google.android.material.color.DynamicColors.DeviceSupportCondition> DYNAMIC_COLOR_SUPPORTED_MANUFACTURERS = null;
    private static final int[] DYNAMIC_COLOR_THEME_OVERLAY_ATTRIBUTE = null;

    @android.annotation.SuppressLint({"PrivateApi"})
    private static final com.google.android.material.color.DynamicColors.DeviceSupportCondition SAMSUNG_DEVICE_SUPPORT_CONDITION = null;
    private static final int USE_DEFAULT_THEME_OVERLAY = 0;



    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private interface DeviceSupportCondition {
        boolean isSupported();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class DynamicColorsActivityLifecycleCallbacks implements android.app.Application.ActivityLifecycleCallbacks {
        private final com.google.android.material.color.DynamicColorsOptions dynamicColorsOptions;

        DynamicColorsActivityLifecycleCallbacks(@androidx.annotation.NonNull com.google.android.material.color.DynamicColorsOptions r1) {
                r0 = this;
                r0.<init>()
                r0.dynamicColorsOptions = r1
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@androidx.annotation.NonNull android.app.Activity r1, @androidx.annotation.Nullable android.os.Bundle r2) {
                r0 = this;
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(@androidx.annotation.NonNull android.app.Activity r1) {
                r0 = this;
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(@androidx.annotation.NonNull android.app.Activity r1) {
                r0 = this;
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreCreated(@androidx.annotation.NonNull android.app.Activity r1, @androidx.annotation.Nullable android.os.Bundle r2) {
                r0 = this;
                com.google.android.material.color.DynamicColorsOptions r2 = r0.dynamicColorsOptions
                com.google.android.material.color.DynamicColors.applyToActivityIfAvailable(r1, r2)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(@androidx.annotation.NonNull android.app.Activity r1) {
                r0 = this;
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(@androidx.annotation.NonNull android.app.Activity r1, @androidx.annotation.NonNull android.os.Bundle r2) {
                r0 = this;
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(@androidx.annotation.NonNull android.app.Activity r1) {
                r0 = this;
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(@androidx.annotation.NonNull android.app.Activity r1) {
                r0 = this;
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface OnAppliedCallback {
        void onApplied(@androidx.annotation.NonNull android.app.Activity r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface Precondition {
        boolean shouldApplyDynamicColors(@androidx.annotation.NonNull android.app.Activity r1, @androidx.annotation.StyleRes int r2);
    }

    static {
            int r0 = com.google.android.material.R.attr.dynamicColorThemeOverlay
            int[] r0 = new int[]{r0}
            com.google.android.material.color.DynamicColors.DYNAMIC_COLOR_THEME_OVERLAY_ATTRIBUTE = r0
            com.google.android.material.color.DynamicColors$1 r0 = new com.google.android.material.color.DynamicColors$1
            r0.<init>()
            com.google.android.material.color.DynamicColors.DEFAULT_DEVICE_SUPPORT_CONDITION = r0
            com.google.android.material.color.DynamicColors$2 r1 = new com.google.android.material.color.DynamicColors$2
            r1.<init>()
            com.google.android.material.color.DynamicColors.SAMSUNG_DEVICE_SUPPORT_CONDITION = r1
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.lang.String r3 = "fcnt"
            r2.put(r3, r0)
            java.lang.String r3 = "google"
            r2.put(r3, r0)
            java.lang.String r3 = "hmd global"
            r2.put(r3, r0)
            java.lang.String r3 = "infinix"
            r2.put(r3, r0)
            java.lang.String r3 = "infinix mobility limited"
            r2.put(r3, r0)
            java.lang.String r3 = "itel"
            r2.put(r3, r0)
            java.lang.String r3 = "kyocera"
            r2.put(r3, r0)
            java.lang.String r3 = "lenovo"
            r2.put(r3, r0)
            java.lang.String r3 = "lge"
            r2.put(r3, r0)
            java.lang.String r3 = "motorola"
            r2.put(r3, r0)
            java.lang.String r3 = "nothing"
            r2.put(r3, r0)
            java.lang.String r3 = "oneplus"
            r2.put(r3, r0)
            java.lang.String r3 = "oppo"
            r2.put(r3, r0)
            java.lang.String r3 = "realme"
            r2.put(r3, r0)
            java.lang.String r3 = "robolectric"
            r2.put(r3, r0)
            java.lang.String r3 = "samsung"
            r2.put(r3, r1)
            java.lang.String r1 = "sharp"
            r2.put(r1, r0)
            java.lang.String r1 = "sony"
            r2.put(r1, r0)
            java.lang.String r1 = "tcl"
            r2.put(r1, r0)
            java.lang.String r1 = "tecno"
            r2.put(r1, r0)
            java.lang.String r1 = "tecno mobile limited"
            r2.put(r1, r0)
            java.lang.String r1 = "vivo"
            r2.put(r1, r0)
            java.lang.String r1 = "wingtech"
            r2.put(r1, r0)
            java.lang.String r1 = "xiaomi"
            r2.put(r1, r0)
            java.util.Map r1 = java.util.Collections.unmodifiableMap(r2)
            com.google.android.material.color.DynamicColors.DYNAMIC_COLOR_SUPPORTED_MANUFACTURERS = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.lang.String r2 = "asus"
            r1.put(r2, r0)
            java.lang.String r2 = "jio"
            r1.put(r2, r0)
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r1)
            com.google.android.material.color.DynamicColors.DYNAMIC_COLOR_SUPPORTED_BRANDS = r0
            return
    }

    private DynamicColors() {
            r0 = this;
            r0.<init>()
            return
    }

    @java.lang.Deprecated
    public static void applyIfAvailable(@androidx.annotation.NonNull android.app.Activity r0) {
            applyToActivityIfAvailable(r0)
            return
    }

    @java.lang.Deprecated
    public static void applyIfAvailable(@androidx.annotation.NonNull android.app.Activity r1, @androidx.annotation.StyleRes int r2) {
            com.google.android.material.color.DynamicColorsOptions$Builder r0 = new com.google.android.material.color.DynamicColorsOptions$Builder
            r0.<init>()
            com.google.android.material.color.DynamicColorsOptions$Builder r2 = r0.setThemeOverlay(r2)
            com.google.android.material.color.DynamicColorsOptions r2 = r2.build()
            applyToActivityIfAvailable(r1, r2)
            return
    }

    @java.lang.Deprecated
    public static void applyIfAvailable(@androidx.annotation.NonNull android.app.Activity r1, @androidx.annotation.NonNull com.google.android.material.color.DynamicColors.Precondition r2) {
            com.google.android.material.color.DynamicColorsOptions$Builder r0 = new com.google.android.material.color.DynamicColorsOptions$Builder
            r0.<init>()
            com.google.android.material.color.DynamicColorsOptions$Builder r2 = r0.setPrecondition(r2)
            com.google.android.material.color.DynamicColorsOptions r2 = r2.build()
            applyToActivityIfAvailable(r1, r2)
            return
    }

    public static void applyToActivitiesIfAvailable(@androidx.annotation.NonNull android.app.Application r1) {
            com.google.android.material.color.DynamicColorsOptions$Builder r0 = new com.google.android.material.color.DynamicColorsOptions$Builder
            r0.<init>()
            com.google.android.material.color.DynamicColorsOptions r0 = r0.build()
            applyToActivitiesIfAvailable(r1, r0)
            return
    }

    @java.lang.Deprecated
    public static void applyToActivitiesIfAvailable(@androidx.annotation.NonNull android.app.Application r1, @androidx.annotation.StyleRes int r2) {
            com.google.android.material.color.DynamicColorsOptions$Builder r0 = new com.google.android.material.color.DynamicColorsOptions$Builder
            r0.<init>()
            com.google.android.material.color.DynamicColorsOptions$Builder r2 = r0.setThemeOverlay(r2)
            com.google.android.material.color.DynamicColorsOptions r2 = r2.build()
            applyToActivitiesIfAvailable(r1, r2)
            return
    }

    @java.lang.Deprecated
    public static void applyToActivitiesIfAvailable(@androidx.annotation.NonNull android.app.Application r1, @androidx.annotation.StyleRes int r2, @androidx.annotation.NonNull com.google.android.material.color.DynamicColors.Precondition r3) {
            com.google.android.material.color.DynamicColorsOptions$Builder r0 = new com.google.android.material.color.DynamicColorsOptions$Builder
            r0.<init>()
            com.google.android.material.color.DynamicColorsOptions$Builder r2 = r0.setThemeOverlay(r2)
            com.google.android.material.color.DynamicColorsOptions$Builder r2 = r2.setPrecondition(r3)
            com.google.android.material.color.DynamicColorsOptions r2 = r2.build()
            applyToActivitiesIfAvailable(r1, r2)
            return
    }

    @java.lang.Deprecated
    public static void applyToActivitiesIfAvailable(@androidx.annotation.NonNull android.app.Application r1, @androidx.annotation.NonNull com.google.android.material.color.DynamicColors.Precondition r2) {
            com.google.android.material.color.DynamicColorsOptions$Builder r0 = new com.google.android.material.color.DynamicColorsOptions$Builder
            r0.<init>()
            com.google.android.material.color.DynamicColorsOptions$Builder r2 = r0.setPrecondition(r2)
            com.google.android.material.color.DynamicColorsOptions r2 = r2.build()
            applyToActivitiesIfAvailable(r1, r2)
            return
    }

    public static void applyToActivitiesIfAvailable(@androidx.annotation.NonNull android.app.Application r1, @androidx.annotation.NonNull com.google.android.material.color.DynamicColorsOptions r2) {
            com.google.android.material.color.DynamicColors$DynamicColorsActivityLifecycleCallbacks r0 = new com.google.android.material.color.DynamicColors$DynamicColorsActivityLifecycleCallbacks
            r0.<init>(r2)
            r1.registerActivityLifecycleCallbacks(r0)
            return
    }

    public static void applyToActivityIfAvailable(@androidx.annotation.NonNull android.app.Activity r1) {
            com.google.android.material.color.DynamicColorsOptions$Builder r0 = new com.google.android.material.color.DynamicColorsOptions$Builder
            r0.<init>()
            com.google.android.material.color.DynamicColorsOptions r0 = r0.build()
            applyToActivityIfAvailable(r1, r0)
            return
    }

    public static void applyToActivityIfAvailable(@androidx.annotation.NonNull android.app.Activity r5, @androidx.annotation.NonNull com.google.android.material.color.DynamicColorsOptions r6) {
            boolean r0 = isDynamicColorAvailable()
            if (r0 != 0) goto L7
            goto L66
        L7:
            java.lang.Integer r0 = r6.getContentBasedSeedColor()
            if (r0 != 0) goto L1d
            int r0 = r6.getThemeOverlay()
            if (r0 != 0) goto L18
            int r0 = getDefaultThemeOverlay(r5)
            goto L1e
        L18:
            int r0 = r6.getThemeOverlay()
            goto L1e
        L1d:
            r0 = 0
        L1e:
            com.google.android.material.color.DynamicColors$Precondition r1 = r6.getPrecondition()
            boolean r1 = r1.shouldApplyDynamicColors(r5, r0)
            if (r1 == 0) goto L66
            java.lang.Integer r1 = r6.getContentBasedSeedColor()
            if (r1 == 0) goto L5c
            com.google.android.material.color.utilities.SchemeContent r0 = new com.google.android.material.color.utilities.SchemeContent
            java.lang.Integer r1 = r6.getContentBasedSeedColor()
            int r1 = r1.intValue()
            com.google.android.material.color.utilities.Hct r1 = com.google.android.material.color.utilities.Hct.fromInt(r1)
            boolean r2 = com.google.android.material.color.MaterialColors.isLightTheme(r5)
            r2 = r2 ^ 1
            float r3 = getSystemContrast(r5)
            double r3 = (double) r3
            r0.<init>(r1, r2, r3)
            com.google.android.material.color.ColorResourcesOverride r1 = com.google.android.material.color.i.a()
            if (r1 != 0) goto L51
            goto L66
        L51:
            java.util.Map r0 = com.google.android.material.color.MaterialColorUtilitiesHelper.createColorResourcesIdsToColorValues(r0)
            boolean r0 = r1.applyIfPossible(r5, r0)
            if (r0 != 0) goto L5f
            goto L66
        L5c:
            com.google.android.material.color.ThemeUtils.applyThemeOverlay(r5, r0)
        L5f:
            com.google.android.material.color.DynamicColors$OnAppliedCallback r6 = r6.getOnAppliedCallback()
            r6.onApplied(r5)
        L66:
            return
    }

    private static int getDefaultThemeOverlay(@androidx.annotation.NonNull android.content.Context r1) {
            int[] r0 = com.google.android.material.color.DynamicColors.DYNAMIC_COLOR_THEME_OVERLAY_ATTRIBUTE
            android.content.res.TypedArray r1 = r1.obtainStyledAttributes(r0)
            r0 = 0
            int r0 = r1.getResourceId(r0, r0)
            r1.recycle()
            return r0
    }

    private static float getSystemContrast(android.content.Context r2) {
            java.lang.String r0 = "uimode"
            java.lang.Object r2 = r2.getSystemService(r0)
            android.app.UiModeManager r2 = (android.app.UiModeManager) r2
            if (r2 == 0) goto L16
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 >= r1) goto L11
            goto L16
        L11:
            float r2 = com.google.android.material.color.a.a(r2)
            return r2
        L16:
            r2 = 0
            return r2
    }

    @androidx.annotation.ChecksSdkIntAtLeast(api = 31)
    @android.annotation.SuppressLint({"DefaultLocale"})
    public static boolean isDynamicColorAvailable() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            r2 = 0
            if (r0 >= r1) goto L8
            return r2
        L8:
            boolean r0 = androidx.core.os.BuildCompat.isAtLeastT()
            r1 = 1
            if (r0 == 0) goto L10
            return r1
        L10:
            java.util.Map<java.lang.String, com.google.android.material.color.DynamicColors$DeviceSupportCondition> r0 = com.google.android.material.color.DynamicColors.DYNAMIC_COLOR_SUPPORTED_MANUFACTURERS
            java.lang.String r3 = android.os.Build.MANUFACTURER
            java.util.Locale r4 = java.util.Locale.ROOT
            java.lang.String r3 = r3.toLowerCase(r4)
            java.lang.Object r0 = r0.get(r3)
            com.google.android.material.color.DynamicColors$DeviceSupportCondition r0 = (com.google.android.material.color.DynamicColors.DeviceSupportCondition) r0
            if (r0 != 0) goto L30
            java.util.Map<java.lang.String, com.google.android.material.color.DynamicColors$DeviceSupportCondition> r0 = com.google.android.material.color.DynamicColors.DYNAMIC_COLOR_SUPPORTED_BRANDS
            java.lang.String r3 = android.os.Build.BRAND
            java.lang.String r3 = r3.toLowerCase(r4)
            java.lang.Object r0 = r0.get(r3)
            com.google.android.material.color.DynamicColors$DeviceSupportCondition r0 = (com.google.android.material.color.DynamicColors.DeviceSupportCondition) r0
        L30:
            if (r0 == 0) goto L39
            boolean r0 = r0.isSupported()
            if (r0 == 0) goto L39
            return r1
        L39:
            return r2
    }

    @androidx.annotation.NonNull
    public static android.content.Context wrapContextIfAvailable(@androidx.annotation.NonNull android.content.Context r1) {
            r0 = 0
            android.content.Context r1 = wrapContextIfAvailable(r1, r0)
            return r1
    }

    @androidx.annotation.NonNull
    public static android.content.Context wrapContextIfAvailable(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.StyleRes int r2) {
            com.google.android.material.color.DynamicColorsOptions$Builder r0 = new com.google.android.material.color.DynamicColorsOptions$Builder
            r0.<init>()
            com.google.android.material.color.DynamicColorsOptions$Builder r2 = r0.setThemeOverlay(r2)
            com.google.android.material.color.DynamicColorsOptions r2 = r2.build()
            android.content.Context r1 = wrapContextIfAvailable(r1, r2)
            return r1
    }

    @androidx.annotation.NonNull
    public static android.content.Context wrapContextIfAvailable(@androidx.annotation.NonNull android.content.Context r5, @androidx.annotation.NonNull com.google.android.material.color.DynamicColorsOptions r6) {
            boolean r0 = isDynamicColorAvailable()
            if (r0 != 0) goto L7
            goto L13
        L7:
            int r0 = r6.getThemeOverlay()
            if (r0 != 0) goto L11
            int r0 = getDefaultThemeOverlay(r5)
        L11:
            if (r0 != 0) goto L14
        L13:
            return r5
        L14:
            java.lang.Integer r1 = r6.getContentBasedSeedColor()
            if (r1 == 0) goto L45
            com.google.android.material.color.utilities.SchemeContent r1 = new com.google.android.material.color.utilities.SchemeContent
            java.lang.Integer r6 = r6.getContentBasedSeedColor()
            int r6 = r6.intValue()
            com.google.android.material.color.utilities.Hct r6 = com.google.android.material.color.utilities.Hct.fromInt(r6)
            boolean r2 = com.google.android.material.color.MaterialColors.isLightTheme(r5)
            r2 = r2 ^ 1
            float r3 = getSystemContrast(r5)
            double r3 = (double) r3
            r1.<init>(r6, r2, r3)
            com.google.android.material.color.ColorResourcesOverride r6 = com.google.android.material.color.i.a()
            if (r6 == 0) goto L45
            java.util.Map r0 = com.google.android.material.color.MaterialColorUtilitiesHelper.createColorResourcesIdsToColorValues(r1)
            android.content.Context r5 = r6.wrapContextIfPossible(r5, r0)
            return r5
        L45:
            android.view.ContextThemeWrapper r6 = new android.view.ContextThemeWrapper
            r6.<init>(r5, r0)
            return r6
    }
}
