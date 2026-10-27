package androidx.room;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class TransactionElement implements kotlin.coroutines.i.b {

    @org.jetbrains.annotations.NotNull
    public static final androidx.room.TransactionElement.Key Key = null;

    @org.jetbrains.annotations.NotNull
    private final java.util.concurrent.atomic.AtomicInteger referenceCount;

    @org.jetbrains.annotations.NotNull
    private final kotlin.coroutines.f transactionDispatcher;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Key implements kotlin.coroutines.i.c<androidx.room.TransactionElement> {
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
            androidx.room.TransactionElement$Key r0 = new androidx.room.TransactionElement$Key
            r1 = 0
            r0.<init>(r1)
            androidx.room.TransactionElement.Key = r0
            return
    }

    public TransactionElement(@org.jetbrains.annotations.NotNull kotlin.coroutines.f r2) {
            r1 = this;
            java.lang.String r0 = "transactionDispatcher"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.transactionDispatcher = r2
            java.util.concurrent.atomic.AtomicInteger r2 = new java.util.concurrent.atomic.AtomicInteger
            r0 = 0
            r2.<init>(r0)
            r1.referenceCount = r2
            return
    }

    public final void acquire() {
            r1 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r1.referenceCount
            r0.incrementAndGet()
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
    public kotlin.coroutines.i.c<androidx.room.TransactionElement> getKey() {
            r1 = this;
            androidx.room.TransactionElement$Key r0 = androidx.room.TransactionElement.Key
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.coroutines.f getTransactionDispatcher$room_runtime_release() {
            r1 = this;
            kotlin.coroutines.f r0 = r1.transactionDispatcher
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

    public final void release() {
            r2 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r2.referenceCount
            int r0 = r0.decrementAndGet()
            if (r0 < 0) goto L9
            return
        L9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Transaction was never started or was already released."
            r0.<init>(r1)
            throw r0
    }
}
