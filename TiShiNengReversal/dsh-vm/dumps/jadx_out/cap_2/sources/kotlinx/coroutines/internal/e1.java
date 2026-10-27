package kotlinx.coroutines.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class e1 {

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public final kotlin.coroutines.i a;

    @org.jetbrains.annotations.NotNull
    private final java.lang.Object[] b;

    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.e3<java.lang.Object>[] c;
    private int d;

    public e1(@org.jetbrains.annotations.NotNull kotlin.coroutines.i r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r0.b = r1
            kotlinx.coroutines.e3[] r1 = new kotlinx.coroutines.e3[r2]
            r0.c = r1
            return
    }

    public final void a(@org.jetbrains.annotations.NotNull kotlinx.coroutines.e3<?> r3, @org.jetbrains.annotations.Nullable java.lang.Object r4) {
            r2 = this;
            java.lang.Object[] r0 = r2.b
            int r1 = r2.d
            r0[r1] = r4
            kotlinx.coroutines.e3<java.lang.Object>[] r4 = r2.c
            int r0 = r1 + 1
            r2.d = r0
            java.lang.String r0 = "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>"
            kotlin.jvm.internal.g0.n(r3, r0)
            r4[r1] = r3
            return
    }

    public final void b(@org.jetbrains.annotations.NotNull kotlin.coroutines.i r5) {
            r4 = this;
            kotlinx.coroutines.e3<java.lang.Object>[] r0 = r4.c
            int r0 = r0.length
            int r0 = r0 + (-1)
            if (r0 < 0) goto L1c
        L7:
            int r1 = r0 + (-1)
            kotlinx.coroutines.e3<java.lang.Object>[] r2 = r4.c
            r2 = r2[r0]
            kotlin.jvm.internal.g0.m(r2)
            java.lang.Object[] r3 = r4.b
            r0 = r3[r0]
            r2.n(r5, r0)
            if (r1 >= 0) goto L1a
            goto L1c
        L1a:
            r0 = r1
            goto L7
        L1c:
            return
    }
}
