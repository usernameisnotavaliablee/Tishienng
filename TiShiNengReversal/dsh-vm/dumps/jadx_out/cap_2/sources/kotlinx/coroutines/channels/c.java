package kotlinx.coroutines.channels;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlinx.coroutines.ObsoleteCoroutinesApi
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public interface c<E> extends kotlinx.coroutines.r0, kotlinx.coroutines.channels.b0<E> {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a {
        @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
        public static /* synthetic */ void a(kotlinx.coroutines.channels.c r0) {
                kotlinx.coroutines.channels.b0.a.a(r0)
                return
        }

        @org.jetbrains.annotations.NotNull
        public static <E> kotlinx.coroutines.selects.g<E> b(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.c<E> r0) {
                kotlinx.coroutines.selects.g r0 = kotlinx.coroutines.channels.b0.a.d(r0)
                return r0
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @kotlin.ReplaceWith(expression = "tryReceive().getOrNull()", imports = {}))
        @org.jetbrains.annotations.Nullable
        public static <E> E c(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.c<E> r0) {
                java.lang.Object r0 = kotlinx.coroutines.channels.b0.a.h(r0)
                return r0
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @kotlin.ReplaceWith(expression = "receiveCatching().getOrNull()", imports = {}))
        @kotlin.internal.LowPriorityInOverloadResolution
        @org.jetbrains.annotations.Nullable
        public static <E> java.lang.Object d(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.c<E> r0, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super E> r1) {
                java.lang.Object r0 = kotlinx.coroutines.channels.b0.a.i(r0, r1)
                return r0
        }
    }

    @org.jetbrains.annotations.NotNull
    kotlinx.coroutines.channels.j<E> getChannel();
}
