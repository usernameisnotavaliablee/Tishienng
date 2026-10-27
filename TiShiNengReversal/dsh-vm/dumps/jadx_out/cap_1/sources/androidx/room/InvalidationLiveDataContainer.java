package androidx.room;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class InvalidationLiveDataContainer {

    @org.jetbrains.annotations.NotNull
    private final androidx.room.RoomDatabase database;

    @org.jetbrains.annotations.NotNull
    private final java.util.Set<androidx.lifecycle.LiveData<?>> liveDataSet;

    public InvalidationLiveDataContainer(@org.jetbrains.annotations.NotNull androidx.room.RoomDatabase r2) {
            r1 = this;
            java.lang.String r0 = "database"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.database = r2
            java.util.IdentityHashMap r2 = new java.util.IdentityHashMap
            r2.<init>()
            java.util.Set r2 = java.util.Collections.newSetFromMap(r2)
            java.lang.String r0 = "newSetFromMap(...)"
            kotlin.jvm.internal.g0.o(r2, r0)
            r1.liveDataSet = r2
            return
    }

    @org.jetbrains.annotations.NotNull
    public final <T> androidx.lifecycle.LiveData<T> create(@org.jetbrains.annotations.NotNull java.lang.String[] r8, boolean r9, @org.jetbrains.annotations.NotNull java.util.concurrent.Callable<T> r10) {
            r7 = this;
            java.lang.String r0 = "tableNames"
            kotlin.jvm.internal.g0.p(r8, r0)
            java.lang.String r0 = "callableFunction"
            kotlin.jvm.internal.g0.p(r10, r0)
            androidx.room.RoomCallableTrackingLiveData r1 = new androidx.room.RoomCallableTrackingLiveData
            androidx.room.RoomDatabase r2 = r7.database
            r3 = r7
            r5 = r8
            r4 = r9
            r6 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final <T> androidx.lifecycle.LiveData<T> create(@org.jetbrains.annotations.NotNull java.lang.String[] r8, boolean r9, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super androidx.sqlite.SQLiteConnection, ? extends T> r10) {
            r7 = this;
            java.lang.String r0 = "tableNames"
            kotlin.jvm.internal.g0.p(r8, r0)
            java.lang.String r0 = "lambdaFunction"
            kotlin.jvm.internal.g0.p(r10, r0)
            androidx.room.RoomLambdaTrackingLiveData r1 = new androidx.room.RoomLambdaTrackingLiveData
            androidx.room.RoomDatabase r2 = r7.database
            r3 = r7
            r5 = r8
            r4 = r9
            r6 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.Set<androidx.lifecycle.LiveData<?>> getLiveDataSet$room_runtime_release() {
            r1 = this;
            java.util.Set<androidx.lifecycle.LiveData<?>> r0 = r1.liveDataSet
            return r0
    }

    public final void onActive(@org.jetbrains.annotations.NotNull androidx.lifecycle.LiveData<?> r2) {
            r1 = this;
            java.lang.String r0 = "liveData"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.Set<androidx.lifecycle.LiveData<?>> r0 = r1.liveDataSet
            r0.add(r2)
            return
    }

    public final void onInactive(@org.jetbrains.annotations.NotNull androidx.lifecycle.LiveData<?> r2) {
            r1 = this;
            java.lang.String r0 = "liveData"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.Set<androidx.lifecycle.LiveData<?>> r0 = r1.liveDataSet
            r0.remove(r2)
            return
    }
}
