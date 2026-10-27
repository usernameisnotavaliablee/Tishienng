package androidx.room;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class RoomTrackingLiveData$observer$1 extends androidx.room.InvalidationTracker.Observer {
    final /* synthetic */ androidx.room.RoomTrackingLiveData<T> this$0;

    RoomTrackingLiveData$observer$1(java.lang.String[] r1, androidx.room.RoomTrackingLiveData<T> r2) {
            r0 = this;
            r0.this$0 = r2
            r0.<init>(r1)
            return
    }

    public static /* synthetic */ void a(androidx.room.RoomTrackingLiveData r0) {
            onInvalidated$lambda$0(r0)
            return
    }

    private static final void onInvalidated$lambda$0(androidx.room.RoomTrackingLiveData r0) {
            androidx.room.RoomTrackingLiveData.access$invalidated(r0)
            return
    }

    @Override // androidx.room.InvalidationTracker.Observer
    public void onInvalidated(java.util.Set<java.lang.String> r3) {
            r2 = this;
            java.lang.String r0 = "tables"
            kotlin.jvm.internal.g0.p(r3, r0)
            androidx.arch.core.executor.ArchTaskExecutor r3 = androidx.arch.core.executor.ArchTaskExecutor.getInstance()
            androidx.room.RoomTrackingLiveData<T> r0 = r2.this$0
            androidx.room.t r1 = new androidx.room.t
            r1.<init>(r0)
            r3.executeOnMainThread(r1)
            return
    }
}
