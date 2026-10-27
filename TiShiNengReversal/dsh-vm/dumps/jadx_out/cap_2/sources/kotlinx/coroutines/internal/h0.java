package kotlinx.coroutines.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nOnDemandAllocatingPool.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnDemandAllocatingPool.kt\nkotlinx/coroutines/internal/OnDemandAllocatingPool\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 OnDemandAllocatingPool.kt\nkotlinx/coroutines/internal/OnDemandAllocatingPoolKt\n*L\n1#1,107:1\n41#1:108\n41#1:109\n35#1,7:110\n41#1:127\n1549#2:117\n1620#2,2:118\n1622#2:122\n1549#2:123\n1620#2,3:124\n101#3,2:120\n*S KotlinDebug\n*F\n+ 1 OnDemandAllocatingPool.kt\nkotlinx/coroutines/internal/OnDemandAllocatingPool\n*L\n35#1:108\n54#1:109\n76#1:110,7\n92#1:127\n77#1:117\n77#1:118,2\n77#1:122\n91#1:123\n91#1:124,3\n79#1:120,2\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class h0<T> {

    @org.jetbrains.annotations.NotNull
    private static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater d = null;
    private final int a;

    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function1<java.lang.Integer, T> b;

    @org.jetbrains.annotations.NotNull
    private final java.util.concurrent.atomic.AtomicReferenceArray c;

    @kotlin.jvm.Volatile
    private volatile int controlState;

    static {
            java.lang.Class<kotlinx.coroutines.internal.h0> r0 = kotlinx.coroutines.internal.h0.class
            java.lang.String r1 = "controlState"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            kotlinx.coroutines.internal.h0.d = r0
            return
    }

    public h0(int r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends T> r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            java.util.concurrent.atomic.AtomicReferenceArray r2 = new java.util.concurrent.atomic.AtomicReferenceArray
            r2.<init>(r1)
            r0.c = r2
            return
    }

    private final boolean c(int r2) {
            r1 = this;
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 & r0
            if (r2 == 0) goto L7
            r2 = 1
            return r2
        L7:
            r2 = 0
            return r2
    }

    private final void d(java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.n1> r3, java.lang.Object r4) {
            r1 = this;
        L0:
            int r0 = r2.get(r4)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.invoke(r0)
            goto L0
    }

    private final int f() {
            r4 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.internal.h0.d
        L2:
            int r1 = r0.get(r4)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto Le
            r0 = 0
            return r0
        Le:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = kotlinx.coroutines.internal.h0.d
            r2 = r2 | r1
            boolean r2 = r3.compareAndSet(r4, r1, r2)
            if (r2 == 0) goto L2
            return r1
    }

    public final boolean a() {
            r5 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.internal.h0.d
        L2:
            int r1 = r0.get(r5)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 & r1
            if (r2 == 0) goto Ld
            r0 = 0
            return r0
        Ld:
            int r2 = r5.a
            r3 = 1
            if (r1 < r2) goto L13
            return r3
        L13:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = kotlinx.coroutines.internal.h0.d
            int r4 = r1 + 1
            boolean r2 = r2.compareAndSet(r5, r1, r4)
            if (r2 == 0) goto L2
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r5.c
            kotlin.jvm.functions.Function1<java.lang.Integer, T> r2 = r5.b
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            java.lang.Object r2 = r2.invoke(r4)
            r0.set(r1, r2)
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<T> b() {
            r5 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.internal.h0.d
        L2:
            int r1 = r0.get(r5)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            r4 = 0
            if (r3 == 0) goto Lf
            r1 = 0
            goto L18
        Lf:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = kotlinx.coroutines.internal.h0.d
            r2 = r2 | r1
            boolean r2 = r3.compareAndSet(r5, r1, r2)
            if (r2 == 0) goto L2
        L18:
            kotlin.ranges.m r0 = kotlin.ranges.t.W1(r4, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = kotlin.collections.f0.d0(r0, r2)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L2b:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L45
            r2 = r0
            kotlin.collections.d1 r2 = (kotlin.collections.d1) r2
            int r2 = r2.nextInt()
        L38:
            java.util.concurrent.atomic.AtomicReferenceArray r3 = r5.c
            r4 = 0
            java.lang.Object r3 = r3.getAndSet(r2, r4)
            if (r3 == 0) goto L38
            r1.add(r3)
            goto L2b
        L45:
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String e() {
            r5 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.internal.h0.d
            int r0 = r0.get(r5)
            r1 = 2147483647(0x7fffffff, float:NaN)
            r1 = r1 & r0
            r2 = 0
            kotlin.ranges.m r1 = kotlin.ranges.t.W1(r2, r1)
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = kotlin.collections.f0.d0(r1, r3)
            r2.<init>(r3)
            java.util.Iterator r1 = r1.iterator()
        L1e:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L35
            r3 = r1
            kotlin.collections.d1 r3 = (kotlin.collections.d1) r3
            int r3 = r3.nextInt()
            java.util.concurrent.atomic.AtomicReferenceArray r4 = r5.c
            java.lang.Object r3 = r4.get(r3)
            r2.add(r3)
            goto L1e
        L35:
            java.lang.String r1 = r2.toString()
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r2
            if (r0 == 0) goto L41
            java.lang.String r0 = "[closed]"
            goto L43
        L41:
            java.lang.String r0 = ""
        L43:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "OnDemandAllocatingPool("
            r0.append(r1)
            java.lang.String r1 = r2.e()
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
