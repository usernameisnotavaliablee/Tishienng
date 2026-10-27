package androidx.camera.core.internal.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public interface RingBuffer<T> {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface OnRemoveCallback<T> {
        void onRemove(@androidx.annotation.NonNull T r1);
    }

    @androidx.annotation.NonNull
    T dequeue();

    void enqueue(@androidx.annotation.NonNull T r1);

    int getMaxCapacity();

    boolean isEmpty();
}
