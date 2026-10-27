package kotlinx.coroutines.channels;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public interface j<E> extends kotlinx.coroutines.channels.c0<E>, kotlinx.coroutines.channels.b0<E> {

    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.channels.j.b t0 = null;
    public static final int u0 = Integer.MAX_VALUE;
    public static final int v0 = 0;
    public static final int w0 = -1;
    public static final int x0 = -2;
    public static final int y0 = -3;

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String z0 = "kotlinx.coroutines.channels.defaultBuffer";

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a {
        @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
        public static /* synthetic */ void a(kotlinx.coroutines.channels.j r0) {
                kotlinx.coroutines.channels.b0.a.a(r0)
                return
        }

        @org.jetbrains.annotations.NotNull
        public static <E> kotlinx.coroutines.selects.g<E> b(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.j<E> r0) {
                kotlinx.coroutines.selects.g r0 = kotlinx.coroutines.channels.b0.a.d(r0)
                return r0
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @kotlin.ReplaceWith(expression = "trySend(element).isSuccess", imports = {}))
        public static <E> boolean c(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.j<E> r0, E r1) {
                boolean r0 = kotlinx.coroutines.channels.c0.a.c(r0, r1)
                return r0
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @kotlin.ReplaceWith(expression = "tryReceive().getOrNull()", imports = {}))
        @org.jetbrains.annotations.Nullable
        public static <E> E d(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.j<E> r0) {
                java.lang.Object r0 = kotlinx.coroutines.channels.b0.a.h(r0)
                return r0
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @kotlin.ReplaceWith(expression = "receiveCatching().getOrNull()", imports = {}))
        @kotlin.internal.LowPriorityInOverloadResolution
        @org.jetbrains.annotations.Nullable
        public static <E> java.lang.Object e(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.j<E> r0, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super E> r1) {
                java.lang.Object r0 = kotlinx.coroutines.channels.b0.a.i(r0, r1)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class b {
        static final /* synthetic */ kotlinx.coroutines.channels.j.b a = null;
        public static final int b = Integer.MAX_VALUE;
        public static final int c = 0;
        public static final int d = -1;
        public static final int e = -2;
        public static final int f = -3;

        @org.jetbrains.annotations.NotNull
        public static final java.lang.String g = "kotlinx.coroutines.channels.defaultBuffer";
        private static final int h = 0;

        static {
                kotlinx.coroutines.channels.j$b r0 = new kotlinx.coroutines.channels.j$b
                r0.<init>()
                kotlinx.coroutines.channels.j.b.a = r0
                r0 = 1
                r1 = 2147483646(0x7ffffffe, float:NaN)
                java.lang.String r2 = "kotlinx.coroutines.channels.defaultBuffer"
                r3 = 64
                int r0 = kotlinx.coroutines.internal.v0.b(r2, r3, r0, r1)
                kotlinx.coroutines.channels.j.b.h = r0
                return
        }

        private b() {
                r0 = this;
                r0.<init>()
                return
        }

        public final int a() {
                r1 = this;
                int r0 = kotlinx.coroutines.channels.j.b.h
                return r0
        }
    }

    static {
            kotlinx.coroutines.channels.j$b r0 = kotlinx.coroutines.channels.j.b.a
            kotlinx.coroutines.channels.j.t0 = r0
            return
    }
}
