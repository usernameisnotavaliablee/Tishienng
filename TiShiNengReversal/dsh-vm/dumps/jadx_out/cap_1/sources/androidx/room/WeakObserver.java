package androidx.room;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class WeakObserver extends androidx.room.InvalidationTracker.Observer {

    @org.jetbrains.annotations.NotNull
    private final java.lang.ref.WeakReference<androidx.room.InvalidationTracker.Observer> delegateRef;

    @org.jetbrains.annotations.NotNull
    private final androidx.room.InvalidationTracker tracker;

    public WeakObserver(@org.jetbrains.annotations.NotNull androidx.room.InvalidationTracker r2, @org.jetbrains.annotations.NotNull androidx.room.InvalidationTracker.Observer r3) {
            r1 = this;
            java.lang.String r0 = "tracker"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "delegate"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String[] r0 = r3.getTables$room_runtime_release()
            r1.<init>(r0)
            r1.tracker = r2
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r2.<init>(r3)
            r1.delegateRef = r2
            return
    }

    @Override // androidx.room.InvalidationTracker.Observer
    public void onInvalidated(@org.jetbrains.annotations.NotNull java.util.Set<java.lang.String> r2) {
            r1 = this;
            java.lang.String r0 = "tables"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.ref.WeakReference<androidx.room.InvalidationTracker$Observer> r0 = r1.delegateRef
            java.lang.Object r0 = r0.get()
            androidx.room.InvalidationTracker$Observer r0 = (androidx.room.InvalidationTracker.Observer) r0
            if (r0 != 0) goto L15
            androidx.room.InvalidationTracker r2 = r1.tracker
            r2.removeObserver(r1)
            return
        L15:
            r0.onInvalidated(r2)
            return
    }
}
