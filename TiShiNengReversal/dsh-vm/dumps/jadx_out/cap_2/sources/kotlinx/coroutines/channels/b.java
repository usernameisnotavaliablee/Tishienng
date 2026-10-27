package kotlinx.coroutines.channels;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class b {
    @kotlinx.coroutines.ObsoleteCoroutinesApi
    @org.jetbrains.annotations.NotNull
    public static final <E> kotlinx.coroutines.channels.c0<E> a(@org.jetbrains.annotations.NotNull kotlinx.coroutines.r0 r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.i r2, int r3, @org.jetbrains.annotations.NotNull kotlinx.coroutines.CoroutineStart r4, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.n1> r5, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super kotlinx.coroutines.channels.c<E>, ? super kotlin.coroutines.e<? super kotlin.n1>, ? extends java.lang.Object> r6) {
            kotlin.coroutines.i r1 = kotlinx.coroutines.l0.e(r1, r2)
            r2 = 0
            r0 = 6
            kotlinx.coroutines.channels.j r2 = kotlinx.coroutines.channels.m.d(r3, r2, r2, r0, r2)
            boolean r3 = r4.isLazy()
            if (r3 == 0) goto L16
            kotlinx.coroutines.channels.v r3 = new kotlinx.coroutines.channels.v
            r3.<init>(r1, r2, r6)
            goto L1c
        L16:
            kotlinx.coroutines.channels.a r3 = new kotlinx.coroutines.channels.a
            r0 = 1
            r3.<init>(r1, r2, r0)
        L1c:
            if (r5 == 0) goto L21
            r3.k(r5)
        L21:
            r3.z1(r4, r3, r6)
            return r3
    }

    public static /* synthetic */ kotlinx.coroutines.channels.c0 b(kotlinx.coroutines.r0 r0, kotlin.coroutines.i r1, int r2, kotlinx.coroutines.CoroutineStart r3, kotlin.jvm.functions.Function1 r4, kotlin.jvm.functions.Function2 r5, int r6, java.lang.Object r7) {
            r7 = r6 & 1
            if (r7 == 0) goto L6
            kotlin.coroutines.EmptyCoroutineContext r1 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
        L6:
            r7 = r6 & 2
            if (r7 == 0) goto Lb
            r2 = 0
        Lb:
            r7 = r6 & 4
            if (r7 == 0) goto L11
            kotlinx.coroutines.CoroutineStart r3 = kotlinx.coroutines.CoroutineStart.DEFAULT
        L11:
            r6 = r6 & 8
            if (r6 == 0) goto L16
            r4 = 0
        L16:
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r2 = r0
            r3 = r1
            kotlinx.coroutines.channels.c0 r0 = a(r2, r3, r4, r5, r6, r7)
            return r0
    }
}
