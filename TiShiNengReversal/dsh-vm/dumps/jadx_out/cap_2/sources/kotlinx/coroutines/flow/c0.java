package kotlinx.coroutines.flow;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public interface c0 {

    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.flow.c0.a a = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a {
        static final /* synthetic */ kotlinx.coroutines.flow.c0.a a = null;

        @org.jetbrains.annotations.NotNull
        private static final kotlinx.coroutines.flow.c0 b = null;

        @org.jetbrains.annotations.NotNull
        private static final kotlinx.coroutines.flow.c0 c = null;

        static {
                kotlinx.coroutines.flow.c0$a r0 = new kotlinx.coroutines.flow.c0$a
                r0.<init>()
                kotlinx.coroutines.flow.c0.a.a = r0
                kotlinx.coroutines.flow.e0 r0 = new kotlinx.coroutines.flow.e0
                r0.<init>()
                kotlinx.coroutines.flow.c0.a.b = r0
                kotlinx.coroutines.flow.f0 r0 = new kotlinx.coroutines.flow.f0
                r0.<init>()
                kotlinx.coroutines.flow.c0.a.c = r0
                return
        }

        private a() {
                r0 = this;
                r0.<init>()
                return
        }

        public static /* synthetic */ kotlinx.coroutines.flow.c0 b(kotlinx.coroutines.flow.c0.a r0, long r1, long r3, int r5, java.lang.Object r6) {
                r6 = r5 & 1
                if (r6 == 0) goto L6
                r1 = 0
            L6:
                r5 = r5 & 2
                if (r5 == 0) goto Lf
                r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            Lf:
                kotlinx.coroutines.flow.c0 r0 = r0.a(r1, r3)
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final kotlinx.coroutines.flow.c0 a(long r2, long r4) {
                r1 = this;
                kotlinx.coroutines.flow.g0 r0 = new kotlinx.coroutines.flow.g0
                r0.<init>(r2, r4)
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final kotlinx.coroutines.flow.c0 c() {
                r1 = this;
                kotlinx.coroutines.flow.c0 r0 = kotlinx.coroutines.flow.c0.a.b
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final kotlinx.coroutines.flow.c0 d() {
                r1 = this;
                kotlinx.coroutines.flow.c0 r0 = kotlinx.coroutines.flow.c0.a.c
                return r0
        }
    }

    static {
            kotlinx.coroutines.flow.c0$a r0 = kotlinx.coroutines.flow.c0.a.a
            kotlinx.coroutines.flow.c0.a = r0
            return
    }

    @org.jetbrains.annotations.NotNull
    kotlinx.coroutines.flow.i<kotlinx.coroutines.flow.SharingCommand> a(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.h0<java.lang.Integer> r1);
}
