package kotlinx.coroutines;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/DelayKt\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,162:1\n314#2,11:163\n314#2,11:174\n*S KotlinDebug\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/DelayKt\n*L\n106#1:163,11\n127#1:174,11\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class a1 {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.DelayKt", f = "Delay.kt", i = {}, l = {163}, m = "awaitCancellation", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        /* synthetic */ java.lang.Object a;
        int b;

        a(kotlin.coroutines.e<? super kotlinx.coroutines.a1.a> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
                r1 = this;
                r1.a = r2
                int r2 = r1.b
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r2 | r0
                r1.b = r2
                java.lang.Object r2 = kotlinx.coroutines.a1.a(r1)
                return r2
        }
    }

    @org.jetbrains.annotations.Nullable
    public static final java.lang.Object a(@org.jetbrains.annotations.NotNull kotlin.coroutines.e<?> r4) {
            boolean r0 = r4 instanceof kotlinx.coroutines.a1.a
            if (r0 == 0) goto L13
            r0 = r4
            kotlinx.coroutines.a1$a r0 = (kotlinx.coroutines.a1.a) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            kotlinx.coroutines.a1$a r0 = new kotlinx.coroutines.a1$a
            r0.<init>(r4)
        L18:
            java.lang.Object r4 = r0.a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L2d:
            kotlin.g0.n(r4)
            goto L52
        L31:
            kotlin.g0.n(r4)
            r0.b = r3
            kotlinx.coroutines.q r4 = new kotlinx.coroutines.q
            kotlin.coroutines.e r2 = kotlin.coroutines.intrinsics.a.e(r0)
            r4.<init>(r2, r3)
            r4.Q()
            java.lang.Object r4 = r4.x()
            java.lang.Object r2 = kotlin.coroutines.intrinsics.a.l()
            if (r4 != r2) goto L4f
            kotlin.coroutines.jvm.internal.e.c(r0)
        L4f:
            if (r4 != r1) goto L52
            return r1
        L52:
            kotlin.KotlinNothingValueException r4 = new kotlin.KotlinNothingValueException
            r4.<init>()
            throw r4
    }

    @org.jetbrains.annotations.Nullable
    public static final java.lang.Object b(long r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r6) {
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 > 0) goto L9
            kotlin.n1 r4 = kotlin.n1.a
            return r4
        L9:
            kotlinx.coroutines.q r0 = new kotlinx.coroutines.q
            kotlin.coroutines.e r1 = kotlin.coroutines.intrinsics.a.e(r6)
            r2 = 1
            r0.<init>(r1, r2)
            r0.Q()
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r3 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r3 >= 0) goto L2a
            kotlin.coroutines.i r1 = r0.getContext()
            kotlinx.coroutines.z0 r1 = d(r1)
            r1.i(r4, r0)
        L2a:
            java.lang.Object r4 = r0.x()
            java.lang.Object r5 = kotlin.coroutines.intrinsics.a.l()
            if (r4 != r5) goto L37
            kotlin.coroutines.jvm.internal.e.c(r6)
        L37:
            java.lang.Object r5 = kotlin.coroutines.intrinsics.a.l()
            if (r4 != r5) goto L3e
            return r4
        L3e:
            kotlin.n1 r4 = kotlin.n1.a
            return r4
    }

    @org.jetbrains.annotations.Nullable
    public static final java.lang.Object c(long r0, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r2) {
            long r0 = e(r0)
            java.lang.Object r0 = b(r0, r2)
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            if (r0 != r1) goto Lf
            return r0
        Lf:
            kotlin.n1 r0 = kotlin.n1.a
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.z0 d(@org.jetbrains.annotations.NotNull kotlin.coroutines.i r1) {
            kotlin.coroutines.f$b r0 = kotlin.coroutines.f.o0
            kotlin.coroutines.i$b r1 = r1.get(r0)
            boolean r0 = r1 instanceof kotlinx.coroutines.z0
            if (r0 == 0) goto Ld
            kotlinx.coroutines.z0 r1 = (kotlinx.coroutines.z0) r1
            goto Le
        Ld:
            r1 = 0
        Le:
            if (r1 != 0) goto L14
            kotlinx.coroutines.z0 r1 = kotlinx.coroutines.w0.a()
        L14:
            return r1
    }

    public static final long e(long r2) {
            kotlin.time.h$a r0 = kotlin.time.h.b
            long r0 = r0.T()
            int r0 = kotlin.time.h.k(r2, r0)
            if (r0 <= 0) goto L17
            long r2 = kotlin.time.h.x(r2)
            r0 = 1
            long r2 = kotlin.ranges.t.v(r2, r0)
            return r2
        L17:
            r2 = 0
            return r2
    }
}
