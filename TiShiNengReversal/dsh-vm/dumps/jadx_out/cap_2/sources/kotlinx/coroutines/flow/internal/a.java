package kotlinx.coroutines.flow.internal;

import kotlinx.coroutines.flow.internal.c;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nAbstractSharedFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractSharedFlow.kt\nkotlinx/coroutines/flow/internal/AbstractSharedFlow\n+ 2 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 3 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,132:1\n28#2,4:133\n28#2,4:138\n28#2,4:144\n20#3:137\n20#3:142\n20#3:148\n1#4:143\n13579#5,2:149\n*S KotlinDebug\n*F\n+ 1 AbstractSharedFlow.kt\nkotlinx/coroutines/flow/internal/AbstractSharedFlow\n*L\n30#1:133,4\n45#1:138,4\n76#1:144,4\n30#1:137\n45#1:142\n76#1:148\n95#1:149,2\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class a<S extends kotlinx.coroutines.flow.internal.c<?>> {

    @org.jetbrains.annotations.Nullable
    private S[] a;
    private int b;
    private int c;

    @org.jetbrains.annotations.Nullable
    private kotlinx.coroutines.flow.internal.w d;

    public a() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final /* synthetic */ int f(kotlinx.coroutines.flow.internal.a r0) {
            int r0 = r0.b
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.flow.internal.c[] g(kotlinx.coroutines.flow.internal.a r0) {
            S extends kotlinx.coroutines.flow.internal.c<?>[] r0 = r0.a
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.h0<java.lang.Integer> d() {
            r2 = this;
            monitor-enter(r2)
            kotlinx.coroutines.flow.internal.w r0 = r2.d     // Catch: java.lang.Throwable -> Lf
            if (r0 != 0) goto L11
            kotlinx.coroutines.flow.internal.w r0 = new kotlinx.coroutines.flow.internal.w     // Catch: java.lang.Throwable -> Lf
            int r1 = r2.b     // Catch: java.lang.Throwable -> Lf
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lf
            r2.d = r0     // Catch: java.lang.Throwable -> Lf
            goto L11
        Lf:
            r0 = move-exception
            goto L13
        L11:
            monitor-exit(r2)
            return r0
        L13:
            monitor-exit(r2)
            throw r0
    }

    @org.jetbrains.annotations.NotNull
    protected final S h() {
            r4 = this;
            monitor-enter(r4)
            S extends kotlinx.coroutines.flow.internal.c<?>[] r0 = r4.a     // Catch: java.lang.Throwable -> Ld
            r1 = 2
            if (r0 != 0) goto Lf
            kotlinx.coroutines.flow.internal.c[] r0 = r4.j(r1)     // Catch: java.lang.Throwable -> Ld
            r4.a = r0     // Catch: java.lang.Throwable -> Ld
            goto L27
        Ld:
            r0 = move-exception
            goto L55
        Lf:
            int r2 = r4.b     // Catch: java.lang.Throwable -> Ld
            int r3 = r0.length     // Catch: java.lang.Throwable -> Ld
            if (r2 < r3) goto L27
            int r2 = r0.length     // Catch: java.lang.Throwable -> Ld
            int r2 = r2 * 2
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r2)     // Catch: java.lang.Throwable -> Ld
            java.lang.String r1 = "copyOf(this, newSize)"
            kotlin.jvm.internal.g0.o(r0, r1)     // Catch: java.lang.Throwable -> Ld
            r1 = r0
            kotlinx.coroutines.flow.internal.c[] r1 = (kotlinx.coroutines.flow.internal.c[]) r1     // Catch: java.lang.Throwable -> Ld
            r4.a = r1     // Catch: java.lang.Throwable -> Ld
            kotlinx.coroutines.flow.internal.c[] r0 = (kotlinx.coroutines.flow.internal.c[]) r0     // Catch: java.lang.Throwable -> Ld
        L27:
            int r1 = r4.c     // Catch: java.lang.Throwable -> Ld
        L29:
            r2 = r0[r1]     // Catch: java.lang.Throwable -> Ld
            if (r2 != 0) goto L33
            kotlinx.coroutines.flow.internal.c r2 = r4.i()     // Catch: java.lang.Throwable -> Ld
            r0[r1] = r2     // Catch: java.lang.Throwable -> Ld
        L33:
            int r1 = r1 + 1
            int r3 = r0.length     // Catch: java.lang.Throwable -> Ld
            if (r1 < r3) goto L39
            r1 = 0
        L39:
            java.lang.String r3 = "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>"
            kotlin.jvm.internal.g0.n(r2, r3)     // Catch: java.lang.Throwable -> Ld
            boolean r3 = r2.a(r4)     // Catch: java.lang.Throwable -> Ld
            if (r3 == 0) goto L29
            r4.c = r1     // Catch: java.lang.Throwable -> Ld
            int r0 = r4.b     // Catch: java.lang.Throwable -> Ld
            r1 = 1
            int r0 = r0 + r1
            r4.b = r0     // Catch: java.lang.Throwable -> Ld
            kotlinx.coroutines.flow.internal.w r0 = r4.d     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r4)
            if (r0 == 0) goto L54
            r0.d0(r1)
        L54:
            return r2
        L55:
            monitor-exit(r4)
            throw r0
    }

    @org.jetbrains.annotations.NotNull
    protected abstract S i();

    @org.jetbrains.annotations.NotNull
    protected abstract S[] j(int r1);

    protected final void k(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super S, kotlin.n1> r5) {
            r4 = this;
            int r0 = f(r4)
            if (r0 != 0) goto L7
            goto L1b
        L7:
            kotlinx.coroutines.flow.internal.c[] r0 = g(r4)
            if (r0 == 0) goto L1b
            int r1 = r0.length
            r2 = 0
        Lf:
            if (r2 >= r1) goto L1b
            r3 = r0[r2]
            if (r3 == 0) goto L18
            r5.invoke(r3)
        L18:
            int r2 = r2 + 1
            goto Lf
        L1b:
            return
    }

    protected final void l(@org.jetbrains.annotations.NotNull S r7) {
            r6 = this;
            monitor-enter(r6)
            int r0 = r6.b     // Catch: java.lang.Throwable -> Lf
            r1 = -1
            int r0 = r0 + r1
            r6.b = r0     // Catch: java.lang.Throwable -> Lf
            kotlinx.coroutines.flow.internal.w r2 = r6.d     // Catch: java.lang.Throwable -> Lf
            r3 = 0
            if (r0 != 0) goto L11
            r6.c = r3     // Catch: java.lang.Throwable -> Lf
            goto L11
        Lf:
            r7 = move-exception
            goto L36
        L11:
            java.lang.String r0 = "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>"
            kotlin.jvm.internal.g0.n(r7, r0)     // Catch: java.lang.Throwable -> Lf
            kotlin.coroutines.e[] r7 = r7.b(r6)     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r6)
            int r0 = r7.length
        L1c:
            if (r3 >= r0) goto L30
            r4 = r7[r3]
            if (r4 == 0) goto L2d
            kotlin.Result$a r5 = kotlin.Result.Companion
            kotlin.n1 r5 = kotlin.n1.a
            java.lang.Object r5 = kotlin.Result.m11constructorimpl(r5)
            r4.resumeWith(r5)
        L2d:
            int r3 = r3 + 1
            goto L1c
        L30:
            if (r2 == 0) goto L35
            r2.d0(r1)
        L35:
            return
        L36:
            monitor-exit(r6)
            throw r7
    }

    protected final int m() {
            r1 = this;
            int r0 = r1.b
            return r0
    }

    @org.jetbrains.annotations.Nullable
    protected final S[] n() {
            r1 = this;
            S extends kotlinx.coroutines.flow.internal.c<?>[] r0 = r1.a
            return r0
    }
}
