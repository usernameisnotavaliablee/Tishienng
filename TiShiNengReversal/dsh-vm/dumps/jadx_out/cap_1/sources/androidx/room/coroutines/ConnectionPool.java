package androidx.room.coroutines;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public interface ConnectionPool extends java.lang.AutoCloseable {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class RollbackException extends java.lang.Throwable {

        @org.jetbrains.annotations.Nullable
        private final java.lang.Object result;

        public RollbackException(@org.jetbrains.annotations.Nullable java.lang.Object r1) {
                r0 = this;
                r0.<init>()
                r0.result = r1
                return
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Object getResult() {
                r1 = this;
                java.lang.Object r0 = r1.result
                return r0
        }
    }

    @Override // java.lang.AutoCloseable
    void close();

    @org.jetbrains.annotations.Nullable
    <R> java.lang.Object useConnection(boolean r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super androidx.room.Transactor, ? super kotlin.coroutines.e<? super R>, ? extends java.lang.Object> r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super R> r3);
}
