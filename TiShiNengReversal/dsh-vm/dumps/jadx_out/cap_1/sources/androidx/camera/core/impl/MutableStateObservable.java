package androidx.camera.core.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class MutableStateObservable<T> extends androidx.camera.core.impl.StateObservable<T> {
    private MutableStateObservable(@androidx.annotation.Nullable java.lang.Object r1, boolean r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @androidx.annotation.NonNull
    public static <T> androidx.camera.core.impl.MutableStateObservable<T> withInitialError(@androidx.annotation.NonNull java.lang.Throwable r2) {
            androidx.camera.core.impl.MutableStateObservable r0 = new androidx.camera.core.impl.MutableStateObservable
            r1 = 1
            r0.<init>(r2, r1)
            return r0
    }

    @androidx.annotation.NonNull
    public static <T> androidx.camera.core.impl.MutableStateObservable<T> withInitialState(@androidx.annotation.Nullable T r2) {
            androidx.camera.core.impl.MutableStateObservable r0 = new androidx.camera.core.impl.MutableStateObservable
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    public void setError(@androidx.annotation.NonNull java.lang.Throwable r1) {
            r0 = this;
            r0.updateStateAsError(r1)
            return
    }

    public void setState(@androidx.annotation.Nullable T r1) {
            r0 = this;
            r0.updateState(r1)
            return
    }
}
