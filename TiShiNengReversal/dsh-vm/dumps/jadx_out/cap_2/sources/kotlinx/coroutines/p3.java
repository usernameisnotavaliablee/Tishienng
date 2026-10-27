package kotlinx.coroutines;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nCoroutineContext.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineContext.kt\nkotlinx/coroutines/UndispatchedCoroutine\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CoroutineContext.kt\nkotlinx/coroutines/CoroutineContextKt\n*L\n1#1,314:1\n1#2:315\n107#3,13:316\n*S KotlinDebug\n*F\n+ 1 CoroutineContext.kt\nkotlinx/coroutines/UndispatchedCoroutine\n*L\n269#1:316,13\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class p3<T> extends kotlinx.coroutines.internal.o0<T> {

    @org.jetbrains.annotations.NotNull
    private final java.lang.ThreadLocal<kotlin.Pair<kotlin.coroutines.i, java.lang.Object>> e;
    private volatile boolean threadLocalIsSet;

    public p3(@org.jetbrains.annotations.NotNull kotlin.coroutines.i r3, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super T> r4) {
            r2 = this;
            kotlinx.coroutines.q3 r0 = kotlinx.coroutines.q3.a
            kotlin.coroutines.i$b r1 = r3.get(r0)
            if (r1 != 0) goto Ld
            kotlin.coroutines.i r0 = r3.plus(r0)
            goto Le
        Ld:
            r0 = r3
        Le:
            r2.<init>(r0, r4)
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r2.e = r0
            kotlin.coroutines.i r4 = r4.getContext()
            kotlin.coroutines.f$b r0 = kotlin.coroutines.f.o0
            kotlin.coroutines.i$b r4 = r4.get(r0)
            boolean r4 = r4 instanceof kotlinx.coroutines.m0
            if (r4 != 0) goto L31
            r4 = 0
            java.lang.Object r4 = kotlinx.coroutines.internal.y0.c(r3, r4)
            kotlinx.coroutines.internal.y0.a(r3, r4)
            r2.B1(r3, r4)
        L31:
            return
    }

    public final boolean A1() {
            r3 = this;
            boolean r0 = r3.threadLocalIsSet
            r1 = 1
            if (r0 == 0) goto Lf
            java.lang.ThreadLocal<kotlin.Pair<kotlin.coroutines.i, java.lang.Object>> r0 = r3.e
            java.lang.Object r0 = r0.get()
            if (r0 != 0) goto Lf
            r0 = 1
            goto L10
        Lf:
            r0 = 0
        L10:
            java.lang.ThreadLocal<kotlin.Pair<kotlin.coroutines.i, java.lang.Object>> r2 = r3.e
            r2.remove()
            r0 = r0 ^ r1
            return r0
    }

    public final void B1(@org.jetbrains.annotations.NotNull kotlin.coroutines.i r2, @org.jetbrains.annotations.Nullable java.lang.Object r3) {
            r1 = this;
            r0 = 1
            r1.threadLocalIsSet = r0
            java.lang.ThreadLocal<kotlin.Pair<kotlin.coroutines.i, java.lang.Object>> r0 = r1.e
            kotlin.Pair r2 = kotlin.o0.a(r2, r3)
            r0.set(r2)
            return
    }

    @Override // kotlinx.coroutines.internal.o0, kotlinx.coroutines.a
    protected void v1(@org.jetbrains.annotations.Nullable java.lang.Object r6) {
            r5 = this;
            boolean r0 = r5.threadLocalIsSet
            if (r0 == 0) goto L20
            java.lang.ThreadLocal<kotlin.Pair<kotlin.coroutines.i, java.lang.Object>> r0 = r5.e
            java.lang.Object r0 = r0.get()
            kotlin.Pair r0 = (kotlin.Pair) r0
            if (r0 == 0) goto L1b
            java.lang.Object r1 = r0.component1()
            kotlin.coroutines.i r1 = (kotlin.coroutines.i) r1
            java.lang.Object r0 = r0.component2()
            kotlinx.coroutines.internal.y0.a(r1, r0)
        L1b:
            java.lang.ThreadLocal<kotlin.Pair<kotlin.coroutines.i, java.lang.Object>> r0 = r5.e
            r0.remove()
        L20:
            kotlin.coroutines.e<T> r0 = r5.d
            java.lang.Object r6 = kotlinx.coroutines.i0.a(r6, r0)
            kotlin.coroutines.e<T> r0 = r5.d
            kotlin.coroutines.i r1 = r0.getContext()
            r2 = 0
            java.lang.Object r3 = kotlinx.coroutines.internal.y0.c(r1, r2)
            kotlinx.coroutines.internal.s0 r4 = kotlinx.coroutines.internal.y0.a
            if (r3 == r4) goto L39
            kotlinx.coroutines.p3 r2 = kotlinx.coroutines.l0.g(r0, r1, r3)
        L39:
            kotlin.coroutines.e<T> r0 = r5.d     // Catch: java.lang.Throwable -> L4e
            r0.resumeWith(r6)     // Catch: java.lang.Throwable -> L4e
            kotlin.n1 r6 = kotlin.n1.a     // Catch: java.lang.Throwable -> L4e
            if (r2 == 0) goto L4a
            boolean r6 = r2.A1()
            if (r6 == 0) goto L49
            goto L4a
        L49:
            return
        L4a:
            kotlinx.coroutines.internal.y0.a(r1, r3)
            return
        L4e:
            r6 = move-exception
            if (r2 == 0) goto L57
            boolean r0 = r2.A1()
            if (r0 == 0) goto L5a
        L57:
            kotlinx.coroutines.internal.y0.a(r1, r3)
        L5a:
            throw r6
    }
}
