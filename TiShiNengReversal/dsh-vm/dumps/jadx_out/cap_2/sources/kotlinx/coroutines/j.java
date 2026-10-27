package kotlinx.coroutines;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nBuilders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Builders.kt\nkotlinx/coroutines/BuildersKt__BuildersKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,102:1\n1#2:103\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final /* synthetic */ class j {
    public static final <T> T a(@org.jetbrains.annotations.NotNull kotlin.coroutines.i r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super kotlinx.coroutines.r0, ? super kotlin.coroutines.e<? super T>, ? extends java.lang.Object> r5) throws java.lang.InterruptedException {
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            kotlin.coroutines.f$b r1 = kotlin.coroutines.f.o0
            kotlin.coroutines.i$b r1 = r4.get(r1)
            kotlin.coroutines.f r1 = (kotlin.coroutines.f) r1
            if (r1 != 0) goto L1f
            kotlinx.coroutines.g3 r1 = kotlinx.coroutines.g3.a
            kotlinx.coroutines.n1 r1 = r1.b()
            kotlinx.coroutines.w1 r2 = kotlinx.coroutines.w1.a
            kotlin.coroutines.i r4 = r4.plus(r1)
            kotlin.coroutines.i r4 = kotlinx.coroutines.l0.e(r2, r4)
            goto L42
        L1f:
            boolean r2 = r1 instanceof kotlinx.coroutines.n1
            r3 = 0
            if (r2 == 0) goto L27
            kotlinx.coroutines.n1 r1 = (kotlinx.coroutines.n1) r1
            goto L28
        L27:
            r1 = r3
        L28:
            if (r1 == 0) goto L36
            boolean r2 = r1.O()
            if (r2 == 0) goto L31
            r3 = r1
        L31:
            if (r3 != 0) goto L34
            goto L36
        L34:
            r1 = r3
            goto L3c
        L36:
            kotlinx.coroutines.g3 r1 = kotlinx.coroutines.g3.a
            kotlinx.coroutines.n1 r1 = r1.a()
        L3c:
            kotlinx.coroutines.w1 r2 = kotlinx.coroutines.w1.a
            kotlin.coroutines.i r4 = kotlinx.coroutines.l0.e(r2, r4)
        L42:
            kotlinx.coroutines.g r2 = new kotlinx.coroutines.g
            r2.<init>(r4, r0, r1)
            kotlinx.coroutines.CoroutineStart r4 = kotlinx.coroutines.CoroutineStart.DEFAULT
            r2.z1(r4, r2, r5)
            java.lang.Object r4 = r2.A1()
            return r4
    }

    public static /* synthetic */ java.lang.Object b(kotlin.coroutines.i r0, kotlin.jvm.functions.Function2 r1, int r2, java.lang.Object r3) throws java.lang.InterruptedException {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            kotlin.coroutines.EmptyCoroutineContext r0 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
        L6:
            java.lang.Object r0 = kotlinx.coroutines.i.f(r0, r1)
            return r0
    }
}
