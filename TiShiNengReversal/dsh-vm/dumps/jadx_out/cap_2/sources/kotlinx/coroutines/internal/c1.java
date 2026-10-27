package kotlinx.coroutines.internal;

import java.lang.Comparable;
import kotlinx.coroutines.internal.d1;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlinx.coroutines.InternalCoroutinesApi
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nThreadSafeHeap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadSafeHeap.kt\nkotlinx/coroutines/internal/ThreadSafeHeap\n+ 2 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 3 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,168:1\n28#2,4:169\n28#2,4:174\n28#2,4:179\n28#2,4:184\n28#2,4:189\n28#2,4:194\n28#2,4:199\n28#2,4:204\n20#3:173\n20#3:178\n20#3:183\n20#3:188\n20#3:193\n20#3:198\n20#3:203\n20#3:208\n1#4:209\n*S KotlinDebug\n*F\n+ 1 ThreadSafeHeap.kt\nkotlinx/coroutines/internal/ThreadSafeHeap\n*L\n35#1:169,4\n42#1:174,4\n50#1:179,4\n52#1:184,4\n60#1:189,4\n69#1:194,4\n72#1:199,4\n81#1:204,4\n35#1:173\n42#1:178\n50#1:183\n52#1:188\n60#1:193\n69#1:198\n72#1:203\n81#1:208\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class c1<T extends kotlinx.coroutines.internal.d1 & java.lang.Comparable<? super T>> {

    @org.jetbrains.annotations.NotNull
    private static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater b = null;

    @kotlin.jvm.Volatile
    private volatile int _size;

    @org.jetbrains.annotations.Nullable
    private T[] a;

    static {
            java.lang.Class<kotlinx.coroutines.internal.c1> r0 = kotlinx.coroutines.internal.c1.class
            java.lang.String r1 = "_size"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            kotlinx.coroutines.internal.c1.b = r0
            return
    }

    public c1() {
            r0 = this;
            r0.<init>()
            return
    }

    private final T[] j() {
            r3 = this;
            T extends kotlinx.coroutines.internal.d1 & java.lang.Comparable<? super T>[] r0 = r3.a
            if (r0 != 0) goto La
            r0 = 4
            kotlinx.coroutines.internal.d1[] r0 = new kotlinx.coroutines.internal.d1[r0]
            r3.a = r0
            return r0
        La:
            int r1 = r3.g()
            int r2 = r0.length
            if (r1 < r2) goto L24
            int r1 = r3.g()
            int r1 = r1 * 2
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            java.lang.String r1 = "copyOf(this, newSize)"
            kotlin.jvm.internal.g0.o(r0, r1)
            kotlinx.coroutines.internal.d1[] r0 = (kotlinx.coroutines.internal.d1[]) r0
            r3.a = r0
        L24:
            return r0
    }

    private final void o(int r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.internal.c1.b
            r0.set(r1, r2)
            return
    }

    private final void p(int r6) {
            r5 = this;
        L0:
            int r0 = r6 * 2
            int r1 = r0 + 1
            int r2 = r5.g()
            if (r1 < r2) goto Lb
            goto L3e
        Lb:
            T extends kotlinx.coroutines.internal.d1 & java.lang.Comparable<? super T>[] r2 = r5.a
            kotlin.jvm.internal.g0.m(r2)
            int r0 = r0 + 2
            int r3 = r5.g()
            if (r0 >= r3) goto L2b
            r3 = r2[r0]
            kotlin.jvm.internal.g0.m(r3)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            r4 = r2[r1]
            kotlin.jvm.internal.g0.m(r4)
            int r3 = r3.compareTo(r4)
            if (r3 >= 0) goto L2b
            goto L2c
        L2b:
            r0 = r1
        L2c:
            r1 = r2[r6]
            kotlin.jvm.internal.g0.m(r1)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            r2 = r2[r0]
            kotlin.jvm.internal.g0.m(r2)
            int r1 = r1.compareTo(r2)
            if (r1 > 0) goto L3f
        L3e:
            return
        L3f:
            r5.r(r6, r0)
            r6 = r0
            goto L0
    }

    private final void q(int r4) {
            r3 = this;
        L0:
            if (r4 > 0) goto L3
            goto L1e
        L3:
            T extends kotlinx.coroutines.internal.d1 & java.lang.Comparable<? super T>[] r0 = r3.a
            kotlin.jvm.internal.g0.m(r0)
            int r1 = r4 + (-1)
            int r1 = r1 / 2
            r2 = r0[r1]
            kotlin.jvm.internal.g0.m(r2)
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            r0 = r0[r4]
            kotlin.jvm.internal.g0.m(r0)
            int r0 = r2.compareTo(r0)
            if (r0 > 0) goto L1f
        L1e:
            return
        L1f:
            r3.r(r4, r1)
            r4 = r1
            goto L0
    }

    private final void r(int r4, int r5) {
            r3 = this;
            T extends kotlinx.coroutines.internal.d1 & java.lang.Comparable<? super T>[] r0 = r3.a
            kotlin.jvm.internal.g0.m(r0)
            r1 = r0[r5]
            kotlin.jvm.internal.g0.m(r1)
            r2 = r0[r4]
            kotlin.jvm.internal.g0.m(r2)
            r0[r4] = r1
            r0[r5] = r2
            r1.setIndex(r4)
            r2.setIndex(r5)
            return
    }

    @kotlin.PublishedApi
    public final void a(@org.jetbrains.annotations.NotNull T r4) {
            r3 = this;
            r4.a(r3)
            kotlinx.coroutines.internal.d1[] r0 = r3.j()
            int r1 = r3.g()
            int r2 = r1 + 1
            r3.o(r2)
            r0[r1] = r4
            r4.setIndex(r1)
            r3.q(r1)
            return
    }

    public final void b(@org.jetbrains.annotations.NotNull T r1) {
            r0 = this;
            monitor-enter(r0)
            r0.a(r1)     // Catch: java.lang.Throwable -> L8
            kotlin.n1 r1 = kotlin.n1.a     // Catch: java.lang.Throwable -> L8
            monitor-exit(r0)
            return
        L8:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public final boolean c(@org.jetbrains.annotations.NotNull T r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> r4) {
            r2 = this;
            monitor-enter(r2)
            r0 = 1
            kotlinx.coroutines.internal.d1 r1 = r2.f()     // Catch: java.lang.Throwable -> L17
            java.lang.Object r4 = r4.invoke(r1)     // Catch: java.lang.Throwable -> L17
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.lang.Throwable -> L17
            boolean r4 = r4.booleanValue()     // Catch: java.lang.Throwable -> L17
            if (r4 == 0) goto L19
            r2.a(r3)     // Catch: java.lang.Throwable -> L17
            r3 = 1
            goto L1a
        L17:
            r3 = move-exception
            goto L22
        L19:
            r3 = 0
        L1a:
            kotlin.jvm.internal.d0.d(r0)
            monitor-exit(r2)
            kotlin.jvm.internal.d0.c(r0)
            return r3
        L22:
            kotlin.jvm.internal.d0.d(r0)
            monitor-exit(r2)
            kotlin.jvm.internal.d0.c(r0)
            throw r3
    }

    public final void d() {
            r6 = this;
            monitor-enter(r6)
            T extends kotlinx.coroutines.internal.d1 & java.lang.Comparable<? super T>[] r0 = r6.a     // Catch: java.lang.Throwable -> Le
            if (r0 == 0) goto L10
            r4 = 6
            r5 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            kotlin.collections.n.V1(r0, r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> Le
            goto L10
        Le:
            r0 = move-exception
            goto L1a
        L10:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.internal.c1.b     // Catch: java.lang.Throwable -> Le
            r1 = 0
            r0.set(r6, r1)     // Catch: java.lang.Throwable -> Le
            kotlin.n1 r0 = kotlin.n1.a     // Catch: java.lang.Throwable -> Le
            monitor-exit(r6)
            return
        L1a:
            monitor-exit(r6)
            throw r0
    }

    @org.jetbrains.annotations.Nullable
    public final T e(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> r5) {
            r4 = this;
            monitor-enter(r4)
            int r0 = r4.g()     // Catch: java.lang.Throwable -> L10
            r1 = 0
        L6:
            r2 = 0
            if (r1 >= r0) goto L25
            T extends kotlinx.coroutines.internal.d1 & java.lang.Comparable<? super T>[] r3 = r4.a     // Catch: java.lang.Throwable -> L10
            if (r3 == 0) goto L12
            r2 = r3[r1]     // Catch: java.lang.Throwable -> L10
            goto L12
        L10:
            r5 = move-exception
            goto L27
        L12:
            kotlin.jvm.internal.g0.m(r2)     // Catch: java.lang.Throwable -> L10
            java.lang.Object r3 = r5.invoke(r2)     // Catch: java.lang.Throwable -> L10
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L10
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L10
            if (r3 == 0) goto L22
            goto L25
        L22:
            int r1 = r1 + 1
            goto L6
        L25:
            monitor-exit(r4)
            return r2
        L27:
            monitor-exit(r4)
            throw r5
    }

    @kotlin.PublishedApi
    @org.jetbrains.annotations.Nullable
    public final T f() {
            r2 = this;
            T extends kotlinx.coroutines.internal.d1 & java.lang.Comparable<? super T>[] r0 = r2.a
            if (r0 == 0) goto L8
            r1 = 0
            r0 = r0[r1]
            return r0
        L8:
            r0 = 0
            return r0
    }

    public final int g() {
            r1 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.internal.c1.b
            int r0 = r0.get(r1)
            return r0
    }

    public final boolean h() {
            r1 = this;
            int r0 = r1.g()
            if (r0 != 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final T i() {
            r1 = this;
            monitor-enter(r1)
            kotlinx.coroutines.internal.d1 r0 = r1.f()     // Catch: java.lang.Throwable -> L7
            monitor-exit(r1)
            return r0
        L7:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public final boolean k(@org.jetbrains.annotations.NotNull T r2) {
            r1 = this;
            monitor-enter(r1)
            kotlinx.coroutines.internal.c1 r0 = r2.c()     // Catch: java.lang.Throwable -> L13
            if (r0 != 0) goto L9
            r2 = 0
            goto L11
        L9:
            int r2 = r2.getIndex()     // Catch: java.lang.Throwable -> L13
            r1.l(r2)     // Catch: java.lang.Throwable -> L13
            r2 = 1
        L11:
            monitor-exit(r1)
            return r2
        L13:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @kotlin.PublishedApi
    @org.jetbrains.annotations.NotNull
    public final T l(int r6) {
            r5 = this;
            T extends kotlinx.coroutines.internal.d1 & java.lang.Comparable<? super T>[] r0 = r5.a
            kotlin.jvm.internal.g0.m(r0)
            int r1 = r5.g()
            r2 = -1
            int r1 = r1 + r2
            r5.o(r1)
            int r1 = r5.g()
            if (r6 >= r1) goto L3d
            int r1 = r5.g()
            r5.r(r6, r1)
            int r1 = r6 + (-1)
            int r1 = r1 / 2
            if (r6 <= 0) goto L3a
            r3 = r0[r6]
            kotlin.jvm.internal.g0.m(r3)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            r4 = r0[r1]
            kotlin.jvm.internal.g0.m(r4)
            int r3 = r3.compareTo(r4)
            if (r3 >= 0) goto L3a
            r5.r(r6, r1)
            r5.q(r1)
            goto L3d
        L3a:
            r5.p(r6)
        L3d:
            int r6 = r5.g()
            r6 = r0[r6]
            kotlin.jvm.internal.g0.m(r6)
            r1 = 0
            r6.a(r1)
            r6.setIndex(r2)
            int r2 = r5.g()
            r0[r2] = r1
            return r6
    }

    @org.jetbrains.annotations.Nullable
    public final T m(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> r4) {
            r3 = this;
            monitor-enter(r3)
            r0 = 1
            kotlinx.coroutines.internal.d1 r1 = r3.f()     // Catch: java.lang.Throwable -> L24
            r2 = 0
            if (r1 != 0) goto L12
            r4 = 2
            kotlin.jvm.internal.d0.d(r4)
            monitor-exit(r3)
            kotlin.jvm.internal.d0.c(r4)
            return r2
        L12:
            java.lang.Object r4 = r4.invoke(r1)     // Catch: java.lang.Throwable -> L24
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.lang.Throwable -> L24
            boolean r4 = r4.booleanValue()     // Catch: java.lang.Throwable -> L24
            if (r4 == 0) goto L26
            r4 = 0
            kotlinx.coroutines.internal.d1 r2 = r3.l(r4)     // Catch: java.lang.Throwable -> L24
            goto L26
        L24:
            r4 = move-exception
            goto L2e
        L26:
            kotlin.jvm.internal.d0.d(r0)
            monitor-exit(r3)
            kotlin.jvm.internal.d0.c(r0)
            return r2
        L2e:
            kotlin.jvm.internal.d0.d(r0)
            monitor-exit(r3)
            kotlin.jvm.internal.d0.c(r0)
            throw r4
    }

    @org.jetbrains.annotations.Nullable
    public final T n() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.g()     // Catch: java.lang.Throwable -> Ld
            if (r0 <= 0) goto Lf
            r0 = 0
            kotlinx.coroutines.internal.d1 r0 = r1.l(r0)     // Catch: java.lang.Throwable -> Ld
            goto L10
        Ld:
            r0 = move-exception
            goto L12
        Lf:
            r0 = 0
        L10:
            monitor-exit(r1)
            return r0
        L12:
            monitor-exit(r1)
            throw r0
    }
}
