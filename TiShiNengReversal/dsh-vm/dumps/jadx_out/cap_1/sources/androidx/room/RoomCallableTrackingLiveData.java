package androidx.room;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class RoomCallableTrackingLiveData<T> extends androidx.room.RoomTrackingLiveData<T> {

    @org.jetbrains.annotations.NotNull
    private final java.util.concurrent.Callable<T> callableFunction;

    public RoomCallableTrackingLiveData(@org.jetbrains.annotations.NotNull androidx.room.RoomDatabase r8, @org.jetbrains.annotations.NotNull androidx.room.InvalidationLiveDataContainer r9, boolean r10, @org.jetbrains.annotations.NotNull java.lang.String[] r11, @org.jetbrains.annotations.NotNull java.util.concurrent.Callable<T> r12) {
            r7 = this;
            java.lang.String r0 = "database"
            kotlin.jvm.internal.g0.p(r8, r0)
            java.lang.String r0 = "container"
            kotlin.jvm.internal.g0.p(r9, r0)
            java.lang.String r0 = "tableNames"
            kotlin.jvm.internal.g0.p(r11, r0)
            java.lang.String r0 = "callableFunction"
            kotlin.jvm.internal.g0.p(r12, r0)
            r6 = 0
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            r1.callableFunction = r12
            return
    }

    @Override // androidx.room.RoomTrackingLiveData
    @org.jetbrains.annotations.Nullable
    public java.lang.Object compute(@org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super T> r1) {
            r0 = this;
            java.util.concurrent.Callable<T> r1 = r0.callableFunction
            java.lang.Object r1 = r1.call()
            return r1
    }
}
