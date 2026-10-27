package kotlinx.coroutines.sync;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public interface a {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: kotlinx.coroutines.sync.a$a, reason: collision with other inner class name */
    public static final class C0110a {
        @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Mutex.onLock deprecated without replacement. For additional details please refer to #2794")
        public static /* synthetic */ void a() {
                return
        }

        public static /* synthetic */ java.lang.Object b(kotlinx.coroutines.sync.a r0, java.lang.Object r1, kotlin.coroutines.e r2, int r3, java.lang.Object r4) {
                if (r4 != 0) goto Lc
                r3 = r3 & 1
                if (r3 == 0) goto L7
                r1 = 0
            L7:
                java.lang.Object r0 = r0.lock(r1, r2)
                return r0
            Lc:
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "Super calls with default arguments not supported in this target, function: lock"
                r0.<init>(r1)
                throw r0
        }

        public static /* synthetic */ boolean c(kotlinx.coroutines.sync.a r0, java.lang.Object r1, int r2, java.lang.Object r3) {
                if (r3 != 0) goto Lc
                r2 = r2 & 1
                if (r2 == 0) goto L7
                r1 = 0
            L7:
                boolean r0 = r0.tryLock(r1)
                return r0
            Lc:
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "Super calls with default arguments not supported in this target, function: tryLock"
                r0.<init>(r1)
                throw r0
        }

        public static /* synthetic */ void d(kotlinx.coroutines.sync.a r0, java.lang.Object r1, int r2, java.lang.Object r3) {
                if (r3 != 0) goto Lb
                r2 = r2 & 1
                if (r2 == 0) goto L7
                r1 = 0
            L7:
                r0.unlock(r1)
                return
            Lb:
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "Super calls with default arguments not supported in this target, function: unlock"
                r0.<init>(r1)
                throw r0
        }
    }

    @org.jetbrains.annotations.NotNull
    kotlinx.coroutines.selects.i<java.lang.Object, kotlinx.coroutines.sync.a> getOnLock();

    boolean holdsLock(@org.jetbrains.annotations.NotNull java.lang.Object r1);

    boolean isLocked();

    @org.jetbrains.annotations.Nullable
    java.lang.Object lock(@org.jetbrains.annotations.Nullable java.lang.Object r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r2);

    boolean tryLock(@org.jetbrains.annotations.Nullable java.lang.Object r1);

    void unlock(@org.jetbrains.annotations.Nullable java.lang.Object r1);
}
