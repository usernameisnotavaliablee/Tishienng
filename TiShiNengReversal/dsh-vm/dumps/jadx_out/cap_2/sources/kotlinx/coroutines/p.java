package kotlinx.coroutines;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public interface p<T> extends kotlin.coroutines.e<T> {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a {
        public static /* synthetic */ boolean a(kotlinx.coroutines.p r0, java.lang.Throwable r1, int r2, java.lang.Object r3) {
                if (r3 != 0) goto Lc
                r2 = r2 & 1
                if (r2 == 0) goto L7
                r1 = 0
            L7:
                boolean r0 = r0.a(r1)
                return r0
            Lc:
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "Super calls with default arguments not supported in this target, function: cancel"
                r0.<init>(r1)
                throw r0
        }

        public static /* synthetic */ java.lang.Object b(kotlinx.coroutines.p r0, java.lang.Object r1, java.lang.Object r2, int r3, java.lang.Object r4) {
                if (r4 != 0) goto Lc
                r3 = r3 & 2
                if (r3 == 0) goto L7
                r2 = 0
            L7:
                java.lang.Object r0 = r0.C(r1, r2)
                return r0
            Lc:
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "Super calls with default arguments not supported in this target, function: tryResume"
                r0.<init>(r1)
                throw r0
        }
    }

    @kotlinx.coroutines.InternalCoroutinesApi
    void B(@org.jetbrains.annotations.NotNull java.lang.Object r1);

    @kotlinx.coroutines.InternalCoroutinesApi
    @org.jetbrains.annotations.Nullable
    java.lang.Object C(T r1, @org.jetbrains.annotations.Nullable java.lang.Object r2);

    void I(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.n1> r1);

    @kotlinx.coroutines.InternalCoroutinesApi
    @org.jetbrains.annotations.Nullable
    java.lang.Object J(@org.jetbrains.annotations.NotNull java.lang.Throwable r1);

    @kotlinx.coroutines.InternalCoroutinesApi
    @org.jetbrains.annotations.Nullable
    java.lang.Object O(T r1, @org.jetbrains.annotations.Nullable java.lang.Object r2, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.n1> r3);

    @kotlinx.coroutines.ExperimentalCoroutinesApi
    void P(@org.jetbrains.annotations.NotNull kotlinx.coroutines.m0 r1, T r2);

    @kotlinx.coroutines.InternalCoroutinesApi
    void Q();

    boolean a(@org.jetbrains.annotations.Nullable java.lang.Throwable r1);

    @kotlinx.coroutines.ExperimentalCoroutinesApi
    void h(@org.jetbrains.annotations.NotNull kotlinx.coroutines.m0 r1, @org.jetbrains.annotations.NotNull java.lang.Throwable r2);

    boolean isActive();

    boolean isCancelled();

    boolean isCompleted();

    @kotlinx.coroutines.ExperimentalCoroutinesApi
    void o(T r1, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.n1> r2);
}
