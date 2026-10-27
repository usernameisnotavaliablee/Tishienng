package kotlinx.coroutines.channels;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public interface c0<E> {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a {
        public static /* synthetic */ boolean a(kotlinx.coroutines.channels.c0 r0, java.lang.Throwable r1, int r2, java.lang.Object r3) {
                if (r3 != 0) goto Lc
                r2 = r2 & 1
                if (r2 == 0) goto L7
                r1 = 0
            L7:
                boolean r0 = r0.S(r1)
                return r0
            Lc:
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "Super calls with default arguments not supported in this target, function: close"
                r0.<init>(r1)
                throw r0
        }

        @kotlinx.coroutines.DelicateCoroutinesApi
        public static /* synthetic */ void b() {
                return
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @kotlin.ReplaceWith(expression = "trySend(element).isSuccess", imports = {}))
        public static <E> boolean c(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.c0<? super E> r0, E r1) {
                java.lang.Object r0 = r0.r(r1)
                boolean r1 = kotlinx.coroutines.channels.n.m(r0)
                if (r1 == 0) goto Lc
                r0 = 1
                return r0
            Lc:
                java.lang.Throwable r0 = kotlinx.coroutines.channels.n.f(r0)
                if (r0 != 0) goto L14
                r0 = 0
                return r0
            L14:
                java.lang.Throwable r0 = kotlinx.coroutines.internal.r0.o(r0)
                throw r0
        }
    }

    boolean S(@org.jetbrains.annotations.Nullable java.lang.Throwable r1);

    @org.jetbrains.annotations.Nullable
    java.lang.Object T(E r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r2);

    @org.jetbrains.annotations.NotNull
    kotlinx.coroutines.selects.i<E, kotlinx.coroutines.channels.c0<E>> i();

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @kotlin.ReplaceWith(expression = "trySend(element).isSuccess", imports = {}))
    boolean offer(E r1);

    void q(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.n1> r1);

    @org.jetbrains.annotations.NotNull
    java.lang.Object r(E r1);

    boolean z();
}
