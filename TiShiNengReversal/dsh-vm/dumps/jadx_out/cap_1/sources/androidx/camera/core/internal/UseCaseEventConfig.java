package androidx.camera.core.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public interface UseCaseEventConfig extends androidx.camera.core.impl.ReadableConfig {
    public static final androidx.camera.core.impl.Config.Option<androidx.camera.core.UseCase.EventCallback> OPTION_USE_CASE_EVENT_CALLBACK = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface Builder<B> {
        @androidx.annotation.NonNull
        B setUseCaseEventCallback(@androidx.annotation.NonNull androidx.camera.core.UseCase.EventCallback r1);
    }

    static {
            java.lang.String r0 = "camerax.core.useCaseEventCallback"
            java.lang.Class<androidx.camera.core.UseCase$EventCallback> r1 = androidx.camera.core.UseCase.EventCallback.class
            androidx.camera.core.impl.Config$Option r0 = androidx.camera.core.impl.Config.Option.create(r0, r1)
            androidx.camera.core.internal.UseCaseEventConfig.OPTION_USE_CASE_EVENT_CALLBACK = r0
            return
    }

    @androidx.annotation.NonNull
    androidx.camera.core.UseCase.EventCallback getUseCaseEventCallback();

    @androidx.annotation.Nullable
    androidx.camera.core.UseCase.EventCallback getUseCaseEventCallback(@androidx.annotation.Nullable androidx.camera.core.UseCase.EventCallback r1);
}
