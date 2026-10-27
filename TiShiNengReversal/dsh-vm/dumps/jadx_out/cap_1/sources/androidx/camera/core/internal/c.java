package androidx.camera.core.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final /* synthetic */ class c {
    @androidx.annotation.NonNull
    public static java.util.concurrent.Executor a(androidx.camera.core.internal.IoConfig r1) {
            androidx.camera.core.impl.Config$Option<java.util.concurrent.Executor> r0 = androidx.camera.core.internal.IoConfig.OPTION_IO_EXECUTOR
            java.lang.Object r1 = r1.retrieveOption(r0)
            java.util.concurrent.Executor r1 = (java.util.concurrent.Executor) r1
            return r1
    }

    @androidx.annotation.Nullable
    public static java.util.concurrent.Executor b(androidx.camera.core.internal.IoConfig r1, @androidx.annotation.Nullable java.util.concurrent.Executor r2) {
            androidx.camera.core.impl.Config$Option<java.util.concurrent.Executor> r0 = androidx.camera.core.internal.IoConfig.OPTION_IO_EXECUTOR
            java.lang.Object r1 = r1.retrieveOption(r0, r2)
            java.util.concurrent.Executor r1 = (java.util.concurrent.Executor) r1
            return r1
    }
}
