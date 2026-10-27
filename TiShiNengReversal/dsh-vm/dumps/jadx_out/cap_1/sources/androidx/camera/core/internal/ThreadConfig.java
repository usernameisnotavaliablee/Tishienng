package androidx.camera.core.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public interface ThreadConfig extends androidx.camera.core.impl.ReadableConfig {
    public static final androidx.camera.core.impl.Config.Option<java.util.concurrent.Executor> OPTION_BACKGROUND_EXECUTOR = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface Builder<B> {
        @androidx.annotation.NonNull
        B setBackgroundExecutor(@androidx.annotation.NonNull java.util.concurrent.Executor r1);
    }

    static {
            java.lang.String r0 = "camerax.core.thread.backgroundExecutor"
            java.lang.Class<java.util.concurrent.Executor> r1 = java.util.concurrent.Executor.class
            androidx.camera.core.impl.Config$Option r0 = androidx.camera.core.impl.Config.Option.create(r0, r1)
            androidx.camera.core.internal.ThreadConfig.OPTION_BACKGROUND_EXECUTOR = r0
            return
    }

    @androidx.annotation.NonNull
    java.util.concurrent.Executor getBackgroundExecutor();

    @androidx.annotation.Nullable
    java.util.concurrent.Executor getBackgroundExecutor(@androidx.annotation.Nullable java.util.concurrent.Executor r1);
}
