package androidx.room.coroutines;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class ConnectionPoolKt {
    @org.jetbrains.annotations.NotNull
    public static final androidx.room.coroutines.ConnectionPool newConnectionPool(@org.jetbrains.annotations.NotNull androidx.sqlite.SQLiteDriver r1, @org.jetbrains.annotations.NotNull java.lang.String r2, int r3, int r4) {
            java.lang.String r0 = "driver"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "fileName"
            kotlin.jvm.internal.g0.p(r2, r0)
            androidx.room.coroutines.ConnectionPoolImpl r0 = new androidx.room.coroutines.ConnectionPoolImpl
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final androidx.room.coroutines.ConnectionPool newSingleConnectionPool(@org.jetbrains.annotations.NotNull androidx.sqlite.SQLiteDriver r1, @org.jetbrains.annotations.NotNull java.lang.String r2) {
            java.lang.String r0 = "driver"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "fileName"
            kotlin.jvm.internal.g0.p(r2, r0)
            androidx.room.coroutines.ConnectionPoolImpl r0 = new androidx.room.coroutines.ConnectionPoolImpl
            r0.<init>(r1, r2)
            return r0
    }
}
