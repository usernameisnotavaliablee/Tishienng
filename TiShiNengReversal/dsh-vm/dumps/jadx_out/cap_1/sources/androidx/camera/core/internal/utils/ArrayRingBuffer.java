package androidx.camera.core.internal.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class ArrayRingBuffer<T> implements androidx.camera.core.internal.utils.RingBuffer<T> {
    private static final java.lang.String TAG = "ZslRingBuffer";

    @androidx.annotation.GuardedBy("mLock")
    private final java.util.ArrayDeque<T> mBuffer;
    private final java.lang.Object mLock;

    @androidx.annotation.Nullable
    final androidx.camera.core.internal.utils.RingBuffer.OnRemoveCallback<T> mOnRemoveCallback;
    private final int mRingBufferCapacity;

    public ArrayRingBuffer(int r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public ArrayRingBuffer(int r2, @androidx.annotation.Nullable androidx.camera.core.internal.utils.RingBuffer.OnRemoveCallback<T> r3) {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.mLock = r0
            r1.mRingBufferCapacity = r2
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>(r2)
            r1.mBuffer = r0
            r1.mOnRemoveCallback = r3
            return
    }

    @Override // androidx.camera.core.internal.utils.RingBuffer
    @androidx.annotation.NonNull
    public T dequeue() {
            r2 = this;
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            java.util.ArrayDeque<T> r1 = r2.mBuffer     // Catch: java.lang.Throwable -> Lb
            java.lang.Object r1 = r1.removeLast()     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return r1
        Lb:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r1
    }

    @Override // androidx.camera.core.internal.utils.RingBuffer
    public void enqueue(@androidx.annotation.NonNull T r4) {
            r3 = this;
            java.lang.Object r0 = r3.mLock
            monitor-enter(r0)
            java.util.ArrayDeque<T> r1 = r3.mBuffer     // Catch: java.lang.Throwable -> L12
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L12
            int r2 = r3.mRingBufferCapacity     // Catch: java.lang.Throwable -> L12
            if (r1 < r2) goto L14
            java.lang.Object r1 = r3.dequeue()     // Catch: java.lang.Throwable -> L12
            goto L15
        L12:
            r4 = move-exception
            goto L25
        L14:
            r1 = 0
        L15:
            java.util.ArrayDeque<T> r2 = r3.mBuffer     // Catch: java.lang.Throwable -> L12
            r2.addFirst(r4)     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            androidx.camera.core.internal.utils.RingBuffer$OnRemoveCallback<T> r4 = r3.mOnRemoveCallback
            if (r4 == 0) goto L24
            if (r1 == 0) goto L24
            r4.onRemove(r1)
        L24:
            return
        L25:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            throw r4
    }

    @Override // androidx.camera.core.internal.utils.RingBuffer
    public int getMaxCapacity() {
            r1 = this;
            int r0 = r1.mRingBufferCapacity
            return r0
    }

    @Override // androidx.camera.core.internal.utils.RingBuffer
    public boolean isEmpty() {
            r2 = this;
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            java.util.ArrayDeque<T> r1 = r2.mBuffer     // Catch: java.lang.Throwable -> Lb
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return r1
        Lb:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r1
    }
}
