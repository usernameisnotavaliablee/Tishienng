package kotlinx.coroutines.channels;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "BroadcastChannel is deprecated in the favour of SharedFlow and is no longer supported")
@kotlinx.coroutines.ObsoleteCoroutinesApi
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public interface d<E> extends kotlinx.coroutines.channels.c0<E> {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a {
        public static /* synthetic */ void a(kotlinx.coroutines.channels.d r0, java.util.concurrent.CancellationException r1, int r2, java.lang.Object r3) {
                if (r3 != 0) goto Lb
                r2 = r2 & 1
                if (r2 == 0) goto L7
                r1 = 0
            L7:
                r0.b(r1)
                return
            Lb:
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "Super calls with default arguments not supported in this target, function: cancel"
                r0.<init>(r1)
                throw r0
        }

        public static /* synthetic */ boolean b(kotlinx.coroutines.channels.d r0, java.lang.Throwable r1, int r2, java.lang.Object r3) {
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

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @kotlin.ReplaceWith(expression = "trySend(element).isSuccess", imports = {}))
        public static <E> boolean c(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.d<E> r0, E r1) {
                boolean r0 = kotlinx.coroutines.channels.c0.a.c(r0, r1)
                return r0
        }
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility only")
    /* synthetic */ boolean a(java.lang.Throwable r1);

    void b(@org.jetbrains.annotations.Nullable java.util.concurrent.CancellationException r1);

    @org.jetbrains.annotations.NotNull
    kotlinx.coroutines.channels.b0<E> m();
}
