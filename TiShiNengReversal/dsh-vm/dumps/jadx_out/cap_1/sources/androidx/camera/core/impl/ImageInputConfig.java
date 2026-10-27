package androidx.camera.core.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public interface ImageInputConfig extends androidx.camera.core.impl.ReadableConfig {
    public static final androidx.camera.core.impl.Config.Option<androidx.camera.core.DynamicRange> OPTION_INPUT_DYNAMIC_RANGE = null;
    public static final androidx.camera.core.impl.Config.Option<java.lang.Integer> OPTION_INPUT_FORMAT = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface Builder<B> {
        @androidx.annotation.NonNull
        B setDynamicRange(@androidx.annotation.NonNull androidx.camera.core.DynamicRange r1);
    }

    static {
            java.lang.String r0 = "camerax.core.imageInput.inputFormat"
            java.lang.Class r1 = java.lang.Integer.TYPE
            androidx.camera.core.impl.Config$Option r0 = androidx.camera.core.impl.Config.Option.create(r0, r1)
            androidx.camera.core.impl.ImageInputConfig.OPTION_INPUT_FORMAT = r0
            java.lang.String r0 = "camerax.core.imageInput.inputDynamicRange"
            java.lang.Class<androidx.camera.core.DynamicRange> r1 = androidx.camera.core.DynamicRange.class
            androidx.camera.core.impl.Config$Option r0 = androidx.camera.core.impl.Config.Option.create(r0, r1)
            androidx.camera.core.impl.ImageInputConfig.OPTION_INPUT_DYNAMIC_RANGE = r0
            return
    }

    @androidx.annotation.NonNull
    androidx.camera.core.DynamicRange getDynamicRange();

    int getInputFormat();

    boolean hasDynamicRange();
}
