package androidx.camera.core.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final /* synthetic */ class f {
    @androidx.annotation.NonNull
    public static androidx.camera.core.UseCase.EventCallback a(androidx.camera.core.internal.UseCaseEventConfig r1) {
            androidx.camera.core.impl.Config$Option<androidx.camera.core.UseCase$EventCallback> r0 = androidx.camera.core.internal.UseCaseEventConfig.OPTION_USE_CASE_EVENT_CALLBACK
            java.lang.Object r1 = r1.retrieveOption(r0)
            androidx.camera.core.UseCase$EventCallback r1 = (androidx.camera.core.UseCase.EventCallback) r1
            return r1
    }

    @androidx.annotation.Nullable
    public static androidx.camera.core.UseCase.EventCallback b(androidx.camera.core.internal.UseCaseEventConfig r1, @androidx.annotation.Nullable androidx.camera.core.UseCase.EventCallback r2) {
            androidx.camera.core.impl.Config$Option<androidx.camera.core.UseCase$EventCallback> r0 = androidx.camera.core.internal.UseCaseEventConfig.OPTION_USE_CASE_EVENT_CALLBACK
            java.lang.Object r1 = r1.retrieveOption(r0, r2)
            androidx.camera.core.UseCase$EventCallback r1 = (androidx.camera.core.UseCase.EventCallback) r1
            return r1
    }
}
