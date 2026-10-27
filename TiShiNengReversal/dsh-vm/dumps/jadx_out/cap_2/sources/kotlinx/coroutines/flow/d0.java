package kotlinx.coroutines.flow;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class d0 {
    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.flow.c0 a(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.c0.a r0, long r1, long r3) {
            kotlinx.coroutines.flow.g0 r0 = new kotlinx.coroutines.flow.g0
            long r1 = kotlin.time.h.x(r1)
            long r3 = kotlin.time.h.x(r3)
            r0.<init>(r1, r3)
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.flow.c0 b(kotlinx.coroutines.flow.c0.a r0, long r1, long r3, int r5, java.lang.Object r6) {
            r6 = r5 & 1
            if (r6 == 0) goto La
            kotlin.time.h$a r1 = kotlin.time.h.b
            long r1 = r1.T()
        La:
            r5 = r5 & 2
            if (r5 == 0) goto L14
            kotlin.time.h$a r3 = kotlin.time.h.b
            long r3 = r3.n()
        L14:
            kotlinx.coroutines.flow.c0 r0 = a(r0, r1, r3)
            return r0
    }
}
