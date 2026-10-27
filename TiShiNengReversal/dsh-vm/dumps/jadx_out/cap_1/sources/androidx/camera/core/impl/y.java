package androidx.camera.core.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final /* synthetic */ class y {
    @androidx.annotation.NonNull
    public static androidx.camera.core.DynamicRange a(androidx.camera.core.impl.ImageInputConfig r2) {
            androidx.camera.core.impl.Config$Option<androidx.camera.core.DynamicRange> r0 = androidx.camera.core.impl.ImageInputConfig.OPTION_INPUT_DYNAMIC_RANGE
            androidx.camera.core.DynamicRange r1 = androidx.camera.core.DynamicRange.UNSPECIFIED
            java.lang.Object r2 = r2.retrieveOption(r0, r1)
            androidx.camera.core.DynamicRange r2 = (androidx.camera.core.DynamicRange) r2
            java.lang.Object r2 = androidx.core.util.Preconditions.checkNotNull(r2)
            androidx.camera.core.DynamicRange r2 = (androidx.camera.core.DynamicRange) r2
            return r2
    }

    public static int b(androidx.camera.core.impl.ImageInputConfig r1) {
            androidx.camera.core.impl.Config$Option<java.lang.Integer> r0 = androidx.camera.core.impl.ImageInputConfig.OPTION_INPUT_FORMAT
            java.lang.Object r1 = r1.retrieveOption(r0)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            return r1
    }

    public static boolean c(androidx.camera.core.impl.ImageInputConfig r1) {
            androidx.camera.core.impl.Config$Option<androidx.camera.core.DynamicRange> r0 = androidx.camera.core.impl.ImageInputConfig.OPTION_INPUT_DYNAMIC_RANGE
            boolean r1 = r1.containsOption(r0)
            return r1
    }
}
