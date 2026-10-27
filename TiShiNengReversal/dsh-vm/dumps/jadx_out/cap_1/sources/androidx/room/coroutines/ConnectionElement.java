package androidx.room.coroutines;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class ConnectionElement implements kotlin.coroutines.i.b {

    @org.jetbrains.annotations.NotNull
    public static final androidx.room.coroutines.ConnectionElement.Key Key = null;

    @org.jetbrains.annotations.NotNull
    private final androidx.room.coroutines.PooledConnectionImpl connectionWrapper;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Key implements kotlin.coroutines.i.c<androidx.room.coroutines.ConnectionElement> {
        private Key() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Key(kotlin.jvm.internal.v r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            androidx.room.coroutines.ConnectionElement$Key r0 = new androidx.room.coroutines.ConnectionElement$Key
            r1 = 0
            r0.<init>(r1)
            androidx.room.coroutines.ConnectionElement.Key = r0
            return
    }

    public ConnectionElement(@org.jetbrains.annotations.NotNull androidx.room.coroutines.PooledConnectionImpl r2) {
            r1 = this;
            java.lang.String r0 = "connectionWrapper"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.connectionWrapper = r2
            return
    }

    public <R> R fold(R r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.i.b, ? extends R> r2) {
            r0 = this;
            java.lang.Object r1 = kotlin.coroutines.i.b.a.a(r0, r1, r2)
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public <E extends kotlin.coroutines.i.b> E get(@org.jetbrains.annotations.NotNull kotlin.coroutines.i.c<E> r1) {
            r0 = this;
            kotlin.coroutines.i$b r1 = kotlin.coroutines.i.b.a.b(r0, r1)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final androidx.room.coroutines.PooledConnectionImpl getConnectionWrapper() {
            r1 = this;
            androidx.room.coroutines.PooledConnectionImpl r0 = r1.connectionWrapper
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.coroutines.i.c<androidx.room.coroutines.ConnectionElement> getKey() {
            r1 = this;
            androidx.room.coroutines.ConnectionElement$Key r0 = androidx.room.coroutines.ConnectionElement.Key
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.coroutines.i minusKey(@org.jetbrains.annotations.NotNull kotlin.coroutines.i.c<?> r1) {
            r0 = this;
            kotlin.coroutines.i r1 = kotlin.coroutines.i.b.a.c(r0, r1)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.coroutines.i plus(@org.jetbrains.annotations.NotNull kotlin.coroutines.i r1) {
            r0 = this;
            kotlin.coroutines.i r1 = kotlin.coroutines.i.b.a.d(r0, r1)
            return r1
    }
}
