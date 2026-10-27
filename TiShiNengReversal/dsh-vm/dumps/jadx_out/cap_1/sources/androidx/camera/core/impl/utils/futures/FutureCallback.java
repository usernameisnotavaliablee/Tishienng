package androidx.camera.core.impl.utils.futures;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public interface FutureCallback<V> {
    void onFailure(@androidx.annotation.NonNull java.lang.Throwable r1);

    void onSuccess(@androidx.annotation.Nullable V r1);
}
