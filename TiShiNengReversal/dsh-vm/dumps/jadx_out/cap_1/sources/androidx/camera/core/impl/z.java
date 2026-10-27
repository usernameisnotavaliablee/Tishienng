package androidx.camera.core.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final /* synthetic */ class z {
    static {
            int r0 = androidx.camera.core.impl.ImageOutputConfig.INVALID_ROTATION
            return
    }

    public static int a(androidx.camera.core.impl.ImageOutputConfig r1, int r2) {
            androidx.camera.core.impl.Config$Option<java.lang.Integer> r0 = androidx.camera.core.impl.ImageOutputConfig.OPTION_APP_TARGET_ROTATION
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r1 = r1.retrieveOption(r0, r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            return r1
    }

    @androidx.annotation.NonNull
    public static java.util.List b(androidx.camera.core.impl.ImageOutputConfig r2) {
            java.util.ArrayList r0 = new java.util.ArrayList
            androidx.camera.core.impl.Config$Option<java.util.List<android.util.Size>> r1 = androidx.camera.core.impl.ImageOutputConfig.OPTION_CUSTOM_ORDERED_RESOLUTIONS
            java.lang.Object r2 = r2.retrieveOption(r1)
            java.util.List r2 = (java.util.List) r2
            java.util.Objects.requireNonNull(r2)
            java.util.Collection r2 = (java.util.Collection) r2
            r0.<init>(r2)
            return r0
    }

    @androidx.annotation.Nullable
    public static java.util.List c(androidx.camera.core.impl.ImageOutputConfig r1, @androidx.annotation.Nullable java.util.List r2) {
            androidx.camera.core.impl.Config$Option<java.util.List<android.util.Size>> r0 = androidx.camera.core.impl.ImageOutputConfig.OPTION_CUSTOM_ORDERED_RESOLUTIONS
            java.lang.Object r1 = r1.retrieveOption(r0, r2)
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L10
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r1)
            return r2
        L10:
            r1 = 0
            return r1
    }

    @androidx.annotation.NonNull
    public static android.util.Size d(androidx.camera.core.impl.ImageOutputConfig r1) {
            androidx.camera.core.impl.Config$Option<android.util.Size> r0 = androidx.camera.core.impl.ImageOutputConfig.OPTION_DEFAULT_RESOLUTION
            java.lang.Object r1 = r1.retrieveOption(r0)
            android.util.Size r1 = (android.util.Size) r1
            return r1
    }

    @androidx.annotation.Nullable
    public static android.util.Size e(androidx.camera.core.impl.ImageOutputConfig r1, @androidx.annotation.Nullable android.util.Size r2) {
            androidx.camera.core.impl.Config$Option<android.util.Size> r0 = androidx.camera.core.impl.ImageOutputConfig.OPTION_DEFAULT_RESOLUTION
            java.lang.Object r1 = r1.retrieveOption(r0, r2)
            android.util.Size r1 = (android.util.Size) r1
            return r1
    }

    @androidx.annotation.NonNull
    public static android.util.Size f(androidx.camera.core.impl.ImageOutputConfig r1) {
            androidx.camera.core.impl.Config$Option<android.util.Size> r0 = androidx.camera.core.impl.ImageOutputConfig.OPTION_MAX_RESOLUTION
            java.lang.Object r1 = r1.retrieveOption(r0)
            android.util.Size r1 = (android.util.Size) r1
            return r1
    }

    @androidx.annotation.Nullable
    public static android.util.Size g(androidx.camera.core.impl.ImageOutputConfig r1, @androidx.annotation.Nullable android.util.Size r2) {
            androidx.camera.core.impl.Config$Option<android.util.Size> r0 = androidx.camera.core.impl.ImageOutputConfig.OPTION_MAX_RESOLUTION
            java.lang.Object r1 = r1.retrieveOption(r0, r2)
            android.util.Size r1 = (android.util.Size) r1
            return r1
    }

    public static int h(androidx.camera.core.impl.ImageOutputConfig r1, int r2) {
            androidx.camera.core.impl.Config$Option<java.lang.Integer> r0 = androidx.camera.core.impl.ImageOutputConfig.OPTION_MIRROR_MODE
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r1 = r1.retrieveOption(r0, r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            return r1
    }

    @androidx.annotation.NonNull
    public static androidx.camera.core.resolutionselector.ResolutionSelector i(androidx.camera.core.impl.ImageOutputConfig r1) {
            androidx.camera.core.impl.Config$Option<androidx.camera.core.resolutionselector.ResolutionSelector> r0 = androidx.camera.core.impl.ImageOutputConfig.OPTION_RESOLUTION_SELECTOR
            java.lang.Object r1 = r1.retrieveOption(r0)
            androidx.camera.core.resolutionselector.ResolutionSelector r1 = (androidx.camera.core.resolutionselector.ResolutionSelector) r1
            return r1
    }

    @androidx.annotation.Nullable
    public static androidx.camera.core.resolutionselector.ResolutionSelector j(androidx.camera.core.impl.ImageOutputConfig r1, @androidx.annotation.Nullable androidx.camera.core.resolutionselector.ResolutionSelector r2) {
            androidx.camera.core.impl.Config$Option<androidx.camera.core.resolutionselector.ResolutionSelector> r0 = androidx.camera.core.impl.ImageOutputConfig.OPTION_RESOLUTION_SELECTOR
            java.lang.Object r1 = r1.retrieveOption(r0, r2)
            androidx.camera.core.resolutionselector.ResolutionSelector r1 = (androidx.camera.core.resolutionselector.ResolutionSelector) r1
            return r1
    }

    @androidx.annotation.NonNull
    public static java.util.List k(androidx.camera.core.impl.ImageOutputConfig r1) {
            androidx.camera.core.impl.Config$Option<java.util.List<android.util.Pair<java.lang.Integer, android.util.Size[]>>> r0 = androidx.camera.core.impl.ImageOutputConfig.OPTION_SUPPORTED_RESOLUTIONS
            java.lang.Object r1 = r1.retrieveOption(r0)
            java.util.List r1 = (java.util.List) r1
            return r1
    }

    @androidx.annotation.Nullable
    public static java.util.List l(androidx.camera.core.impl.ImageOutputConfig r1, @androidx.annotation.Nullable java.util.List r2) {
            androidx.camera.core.impl.Config$Option<java.util.List<android.util.Pair<java.lang.Integer, android.util.Size[]>>> r0 = androidx.camera.core.impl.ImageOutputConfig.OPTION_SUPPORTED_RESOLUTIONS
            java.lang.Object r1 = r1.retrieveOption(r0, r2)
            java.util.List r1 = (java.util.List) r1
            return r1
    }

    public static int m(androidx.camera.core.impl.ImageOutputConfig r1) {
            androidx.camera.core.impl.Config$Option<java.lang.Integer> r0 = androidx.camera.core.impl.ImageOutputConfig.OPTION_TARGET_ASPECT_RATIO
            java.lang.Object r1 = r1.retrieveOption(r0)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            return r1
    }

    @androidx.annotation.NonNull
    public static android.util.Size n(androidx.camera.core.impl.ImageOutputConfig r1) {
            androidx.camera.core.impl.Config$Option<android.util.Size> r0 = androidx.camera.core.impl.ImageOutputConfig.OPTION_TARGET_RESOLUTION
            java.lang.Object r1 = r1.retrieveOption(r0)
            android.util.Size r1 = (android.util.Size) r1
            return r1
    }

    @androidx.annotation.Nullable
    public static android.util.Size o(androidx.camera.core.impl.ImageOutputConfig r1, @androidx.annotation.Nullable android.util.Size r2) {
            androidx.camera.core.impl.Config$Option<android.util.Size> r0 = androidx.camera.core.impl.ImageOutputConfig.OPTION_TARGET_RESOLUTION
            java.lang.Object r1 = r1.retrieveOption(r0, r2)
            android.util.Size r1 = (android.util.Size) r1
            return r1
    }

    public static int p(androidx.camera.core.impl.ImageOutputConfig r1) {
            androidx.camera.core.impl.Config$Option<java.lang.Integer> r0 = androidx.camera.core.impl.ImageOutputConfig.OPTION_TARGET_ROTATION
            java.lang.Object r1 = r1.retrieveOption(r0)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            return r1
    }

    public static int q(androidx.camera.core.impl.ImageOutputConfig r1, int r2) {
            androidx.camera.core.impl.Config$Option<java.lang.Integer> r0 = androidx.camera.core.impl.ImageOutputConfig.OPTION_TARGET_ROTATION
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r1 = r1.retrieveOption(r0, r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            return r1
    }

    public static boolean r(androidx.camera.core.impl.ImageOutputConfig r1) {
            androidx.camera.core.impl.Config$Option<java.lang.Integer> r0 = androidx.camera.core.impl.ImageOutputConfig.OPTION_TARGET_ASPECT_RATIO
            boolean r1 = r1.containsOption(r0)
            return r1
    }

    public static void s(@androidx.annotation.NonNull androidx.camera.core.impl.ImageOutputConfig r3) {
            boolean r0 = r3.hasTargetAspectRatio()
            r1 = 0
            android.util.Size r2 = r3.getTargetResolution(r1)
            if (r2 == 0) goto Ld
            r2 = 1
            goto Le
        Ld:
            r2 = 0
        Le:
            if (r0 == 0) goto L1b
            if (r2 != 0) goto L13
            goto L1b
        L13:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Cannot use both setTargetResolution and setTargetAspectRatio on the same config."
            r3.<init>(r0)
            throw r3
        L1b:
            androidx.camera.core.resolutionselector.ResolutionSelector r3 = r3.getResolutionSelector(r1)
            if (r3 == 0) goto L2e
            if (r0 != 0) goto L26
            if (r2 != 0) goto L26
            goto L2e
        L26:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Cannot use setTargetResolution or setTargetAspectRatio with setResolutionSelector on the same config."
            r3.<init>(r0)
            throw r3
        L2e:
            return
    }
}
