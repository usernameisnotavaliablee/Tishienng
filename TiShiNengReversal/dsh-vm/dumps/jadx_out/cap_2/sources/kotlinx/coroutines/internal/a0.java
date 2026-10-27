package kotlinx.coroutines.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nLockFreeTaskQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LockFreeTaskQueue.kt\nkotlinx/coroutines/internal/LockFreeTaskQueueCore\n+ 2 LockFreeTaskQueue.kt\nkotlinx/coroutines/internal/LockFreeTaskQueueCore$Companion\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,308:1\n299#2,3:309\n299#2,3:312\n299#2,3:315\n299#2,3:318\n299#2,3:321\n299#2,3:325\n299#2,3:328\n1#3:324\n*S KotlinDebug\n*F\n+ 1 LockFreeTaskQueue.kt\nkotlinx/coroutines/internal/LockFreeTaskQueueCore\n*L\n91#1:309,3\n92#1:312,3\n107#1:315,3\n167#1:318,3\n200#1:321,3\n231#1:325,3\n247#1:328,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class a0<E> {

    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.internal.a0.a e = null;

    @org.jetbrains.annotations.NotNull
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f = null;

    @org.jetbrains.annotations.NotNull
    private static final java.util.concurrent.atomic.AtomicLongFieldUpdater g = null;
    public static final int h = 8;
    public static final int i = 30;
    public static final int j = 1073741823;
    public static final int k = 0;
    public static final long l = 1073741823;
    public static final int m = 30;
    public static final long n = 1152921503533105152L;
    public static final int o = 60;
    public static final long p = 1152921504606846976L;
    public static final int q = 61;
    public static final long r = 2305843009213693952L;
    public static final int s = 1024;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.internal.s0 t = null;
    public static final int u = 0;
    public static final int v = 1;
    public static final int w = 2;

    @kotlin.jvm.Volatile
    @org.jetbrains.annotations.Nullable
    private volatile java.lang.Object _next;

    @kotlin.jvm.Volatile
    private volatile long _state;
    private final int a;
    private final boolean b;
    private final int c;

    @org.jetbrains.annotations.NotNull
    private final java.util.concurrent.atomic.AtomicReferenceArray d;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a {
        private a() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ a(kotlin.jvm.internal.v r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public final int a(long r4) {
                r3 = this;
                r0 = 2305843009213693952(0x2000000000000000, double:1.4916681462400413E-154)
                long r4 = r4 & r0
                r0 = 0
                int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r2 == 0) goto Lb
                r4 = 2
                return r4
            Lb:
                r4 = 1
                return r4
        }

        public final long b(long r3, int r5) {
                r2 = this;
                r0 = 1073741823(0x3fffffff, double:5.304989472E-315)
                long r3 = r2.e(r3, r0)
                long r0 = (long) r5
                long r3 = r3 | r0
                return r3
        }

        public final long c(long r3, int r5) {
                r2 = this;
                r0 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
                long r3 = r2.e(r3, r0)
                long r0 = (long) r5
                r5 = 30
                long r0 = r0 << r5
                long r3 = r3 | r0
                return r3
        }

        public final <T> T d(long r5, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.Integer, ? extends T> r7) {
                r4 = this;
                r0 = 1073741823(0x3fffffff, double:5.304989472E-315)
                long r0 = r0 & r5
                int r1 = (int) r0
                r2 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
                long r5 = r5 & r2
                r0 = 30
                long r5 = r5 >> r0
                int r6 = (int) r5
                java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                java.lang.Object r5 = r7.invoke(r5, r6)
                return r5
        }

        public final long e(long r1, long r3) {
                r0 = this;
                long r3 = ~r3
                long r1 = r1 & r3
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class b {

        @kotlin.jvm.JvmField
        public final int a;

        public b(int r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }
    }

    static {
            kotlinx.coroutines.internal.a0$a r0 = new kotlinx.coroutines.internal.a0$a
            r1 = 0
            r0.<init>(r1)
            kotlinx.coroutines.internal.a0.e = r0
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r1 = "_next"
            java.lang.Class<kotlinx.coroutines.internal.a0> r2 = kotlinx.coroutines.internal.a0.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r1)
            kotlinx.coroutines.internal.a0.f = r0
            java.lang.String r0 = "_state"
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(r2, r0)
            kotlinx.coroutines.internal.a0.g = r0
            kotlinx.coroutines.internal.s0 r0 = new kotlinx.coroutines.internal.s0
            java.lang.String r1 = "REMOVE_FROZEN"
            r0.<init>(r1)
            kotlinx.coroutines.internal.a0.t = r0
            return
    }

    public a0(int r3, boolean r4) {
            r2 = this;
            r2.<init>()
            r2.a = r3
            r2.b = r4
            int r4 = r3 + (-1)
            r2.c = r4
            java.util.concurrent.atomic.AtomicReferenceArray r0 = new java.util.concurrent.atomic.AtomicReferenceArray
            r0.<init>(r3)
            r2.d = r0
            r0 = 1073741823(0x3fffffff, float:1.9999999)
            java.lang.String r1 = "Check failed."
            if (r4 > r0) goto L23
            r3 = r3 & r4
            if (r3 != 0) goto L1d
            return
        L1d:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            r3.<init>(r1)
            throw r3
        L23:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            r3.<init>(r1)
            throw r3
    }

    private final kotlinx.coroutines.internal.a0<E> b(long r7) {
            r6 = this;
            kotlinx.coroutines.internal.a0 r0 = new kotlinx.coroutines.internal.a0
            int r1 = r6.a
            int r1 = r1 * 2
            boolean r2 = r6.b
            r0.<init>(r1, r2)
            r1 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r1 = r1 & r7
            int r2 = (int) r1
            r3 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r3 = r3 & r7
            r1 = 30
            long r3 = r3 >> r1
            int r1 = (int) r3
        L1a:
            int r3 = r6.c
            r4 = r2 & r3
            r5 = r1 & r3
            if (r4 == r5) goto L3b
            java.util.concurrent.atomic.AtomicReferenceArray r4 = r6.d
            r3 = r3 & r2
            java.lang.Object r3 = r4.get(r3)
            if (r3 != 0) goto L30
            kotlinx.coroutines.internal.a0$b r3 = new kotlinx.coroutines.internal.a0$b
            r3.<init>(r2)
        L30:
            java.util.concurrent.atomic.AtomicReferenceArray r4 = r0.d
            int r5 = r0.c
            r5 = r5 & r2
            r4.set(r5, r3)
            int r2 = r2 + 1
            goto L1a
        L3b:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = kotlinx.coroutines.internal.a0.g
            kotlinx.coroutines.internal.a0$a r2 = kotlinx.coroutines.internal.a0.e
            r3 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r7 = r2.e(r7, r3)
            r1.set(r0, r7)
            return r0
    }

    private final kotlinx.coroutines.internal.a0<E> c(long r5) {
            r4 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.a0.f
        L2:
            java.lang.Object r1 = r0.get(r4)
            kotlinx.coroutines.internal.a0 r1 = (kotlinx.coroutines.internal.a0) r1
            if (r1 == 0) goto Lb
            return r1
        Lb:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.internal.a0.f
            r2 = 0
            kotlinx.coroutines.internal.a0 r3 = r4.b(r5)
            androidx.concurrent.futures.a.a(r1, r4, r2, r3)
            goto L2
    }

    private final kotlinx.coroutines.internal.a0<E> e(int r3, E r4) {
            r2 = this;
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r2.d
            int r1 = r2.c
            r1 = r1 & r3
            java.lang.Object r0 = r0.get(r1)
            boolean r1 = r0 instanceof kotlinx.coroutines.internal.a0.b
            if (r1 == 0) goto L1c
            kotlinx.coroutines.internal.a0$b r0 = (kotlinx.coroutines.internal.a0.b) r0
            int r0 = r0.a
            if (r0 != r3) goto L1c
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r2.d
            int r1 = r2.c
            r3 = r3 & r1
            r0.set(r3, r4)
            return r2
        L1c:
            r3 = 0
            return r3
    }

    private final void i(java.util.concurrent.atomic.AtomicLongFieldUpdater r3, kotlin.jvm.functions.Function1<? super java.lang.Long, kotlin.n1> r4, java.lang.Object r5) {
            r2 = this;
        L0:
            long r0 = r3.get(r5)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r4.invoke(r0)
            goto L0
    }

    private final void j(java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2, kotlin.jvm.functions.Function1<java.lang.Object, kotlin.n1> r3, java.lang.Object r4) {
            r1 = this;
        L0:
            java.lang.Object r0 = r2.get(r4)
            r3.invoke(r0)
            goto L0
    }

    private final long l() {
            r10 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = kotlinx.coroutines.internal.a0.g
        L2:
            long r2 = r0.get(r10)
            r4 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r6 = r2 & r4
            r8 = 0
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 == 0) goto L11
            return r2
        L11:
            long r4 = r4 | r2
            r1 = r10
            boolean r2 = r0.compareAndSet(r1, r2, r4)
            if (r2 == 0) goto L2
            return r4
    }

    private final kotlinx.coroutines.internal.a0<E> o(int r9, int r10) {
            r8 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r9 = kotlinx.coroutines.internal.a0.g
        L2:
            long r2 = r9.get(r8)
            r0 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r0 = r0 & r2
            int r6 = (int) r0
            r0 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r0 = r0 & r2
            r4 = 0
            int r7 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r7 == 0) goto L19
            kotlinx.coroutines.internal.a0 r9 = r8.m()
            return r9
        L19:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = kotlinx.coroutines.internal.a0.g
            kotlinx.coroutines.internal.a0$a r1 = kotlinx.coroutines.internal.a0.e
            long r4 = r1.b(r2, r10)
            r1 = r8
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L2
            java.util.concurrent.atomic.AtomicReferenceArray r9 = r1.d
            int r10 = r1.c
            r10 = r10 & r6
            r0 = 0
            r9.set(r10, r0)
            return r0
    }

    private final void p(java.util.concurrent.atomic.AtomicLongFieldUpdater r7, kotlin.jvm.functions.Function1<? super java.lang.Long, java.lang.Long> r8, java.lang.Object r9) {
            r6 = this;
        L0:
            long r2 = r7.get(r9)
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            java.lang.Object r0 = r8.invoke(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            long r4 = r0.longValue()
            r0 = r7
            r1 = r9
            boolean r7 = r0.compareAndSet(r1, r2, r4)
            if (r7 == 0) goto L1b
            return
        L1b:
            r7 = r0
            r9 = r1
            goto L0
    }

    private final long q(java.util.concurrent.atomic.AtomicLongFieldUpdater r8, kotlin.jvm.functions.Function1<? super java.lang.Long, java.lang.Long> r9, java.lang.Object r10) {
            r7 = this;
        L0:
            long r2 = r8.get(r10)
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            java.lang.Object r0 = r9.invoke(r0)
            r6 = r0
            java.lang.Number r6 = (java.lang.Number) r6
            long r4 = r6.longValue()
            r0 = r8
            r1 = r10
            boolean r8 = r0.compareAndSet(r1, r2, r4)
            if (r8 == 0) goto L20
            long r8 = r6.longValue()
            return r8
        L20:
            r8 = r0
            r10 = r1
            goto L0
    }

    public final int a(@org.jetbrains.annotations.NotNull E r13) {
            r12 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = kotlinx.coroutines.internal.a0.g
        L2:
            long r3 = r0.get(r12)
            r1 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r1 = r1 & r3
            r7 = 0
            int r5 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r5 == 0) goto L16
            kotlinx.coroutines.internal.a0$a r13 = kotlinx.coroutines.internal.a0.e
            int r13 = r13.a(r3)
            return r13
        L16:
            r1 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r1 = r1 & r3
            int r2 = (int) r1
            r5 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r5 = r5 & r3
            r1 = 30
            long r5 = r5 >> r1
            int r9 = (int) r5
            int r10 = r12.c
            int r1 = r9 + 2
            r1 = r1 & r10
            r5 = r2 & r10
            r6 = 1
            if (r1 != r5) goto L30
            return r6
        L30:
            boolean r1 = r12.b
            r5 = 1073741823(0x3fffffff, float:1.9999999)
            if (r1 != 0) goto L4f
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r12.d
            r11 = r9 & r10
            java.lang.Object r1 = r1.get(r11)
            if (r1 == 0) goto L4f
            int r1 = r12.a
            r3 = 1024(0x400, float:1.435E-42)
            if (r1 < r3) goto L4e
            int r9 = r9 - r2
            r2 = r9 & r5
            int r1 = r1 >> 1
            if (r2 <= r1) goto L2
        L4e:
            return r6
        L4f:
            int r1 = r9 + 1
            r1 = r1 & r5
            r2 = r1
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = kotlinx.coroutines.internal.a0.g
            kotlinx.coroutines.internal.a0$a r5 = kotlinx.coroutines.internal.a0.e
            long r5 = r5.c(r3, r2)
            r2 = r12
            boolean r1 = r1.compareAndSet(r2, r3, r5)
            if (r1 == 0) goto L2
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r2.d
            r1 = r9 & r10
            r0.set(r1, r13)
            r0 = r2
        L6a:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = kotlinx.coroutines.internal.a0.g
            long r3 = r1.get(r0)
            r5 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r3 = r3 & r5
            int r1 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r1 == 0) goto L81
            kotlinx.coroutines.internal.a0 r0 = r0.m()
            kotlinx.coroutines.internal.a0 r0 = r0.e(r9, r13)
            if (r0 != 0) goto L6a
        L81:
            r13 = 0
            return r13
    }

    public final boolean d() {
            r11 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = kotlinx.coroutines.internal.a0.g
        L2:
            long r2 = r0.get(r11)
            r4 = 2305843009213693952(0x2000000000000000, double:1.4916681462400413E-154)
            long r6 = r2 & r4
            r8 = 1
            r9 = 0
            int r1 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r1 == 0) goto L12
            return r8
        L12:
            r6 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r6 = r6 & r2
            int r1 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r1 == 0) goto L1b
            r0 = 0
            return r0
        L1b:
            long r4 = r4 | r2
            r1 = r11
            boolean r2 = r0.compareAndSet(r1, r2, r4)
            if (r2 == 0) goto L2
            return r8
    }

    public final int f() {
            r6 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = kotlinx.coroutines.internal.a0.g
            long r0 = r0.get(r6)
            r2 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r2 = r2 & r0
            int r3 = (int) r2
            r4 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r0 = r0 & r4
            r2 = 30
            long r0 = r0 >> r2
            int r1 = (int) r0
            int r1 = r1 - r3
            r0 = 1073741823(0x3fffffff, float:1.9999999)
            r0 = r0 & r1
            return r0
    }

    public final boolean g() {
            r5 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = kotlinx.coroutines.internal.a0.g
            long r0 = r0.get(r5)
            r2 = 2305843009213693952(0x2000000000000000, double:1.4916681462400413E-154)
            long r0 = r0 & r2
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L11
            r0 = 1
            return r0
        L11:
            r0 = 0
            return r0
    }

    public final boolean h() {
            r6 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = kotlinx.coroutines.internal.a0.g
            long r0 = r0.get(r6)
            r2 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r2 = r2 & r0
            int r3 = (int) r2
            r4 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r0 = r0 & r4
            r2 = 30
            long r0 = r0 >> r2
            int r1 = (int) r0
            if (r3 != r1) goto L19
            r0 = 1
            return r0
        L19:
            r0 = 0
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final <R> java.util.List<R> k(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super E, ? extends R> r8) {
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r7.a
            r0.<init>(r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = kotlinx.coroutines.internal.a0.g
            long r1 = r1.get(r7)
            r3 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r3 = r3 & r1
            int r4 = (int) r3
            r5 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r1 = r1 & r5
            r3 = 30
            long r1 = r1 >> r3
            int r2 = (int) r1
        L1c:
            int r1 = r7.c
            r3 = r4 & r1
            r5 = r2 & r1
            if (r3 == r5) goto L3b
            java.util.concurrent.atomic.AtomicReferenceArray r3 = r7.d
            r1 = r1 & r4
            java.lang.Object r1 = r3.get(r1)
            if (r1 == 0) goto L38
            boolean r3 = r1 instanceof kotlinx.coroutines.internal.a0.b
            if (r3 != 0) goto L38
            java.lang.Object r1 = r8.invoke(r1)
            r0.add(r1)
        L38:
            int r4 = r4 + 1
            goto L1c
        L3b:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.internal.a0<E> m() {
            r2 = this;
            long r0 = r2.l()
            kotlinx.coroutines.internal.a0 r0 = r2.c(r0)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object n() {
            r11 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = kotlinx.coroutines.internal.a0.g
        L2:
            long r3 = r0.get(r11)
            r1 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r1 = r1 & r3
            r5 = 0
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 == 0) goto L12
            kotlinx.coroutines.internal.s0 r0 = kotlinx.coroutines.internal.a0.t
            return r0
        L12:
            r1 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r1 = r1 & r3
            int r7 = (int) r1
            r1 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r1 = r1 & r3
            r5 = 30
            long r1 = r1 >> r5
            int r2 = (int) r1
            int r1 = r11.c
            r2 = r2 & r1
            r5 = r7 & r1
            r8 = 0
            if (r2 != r5) goto L2a
            return r8
        L2a:
            java.util.concurrent.atomic.AtomicReferenceArray r2 = r11.d
            r1 = r1 & r7
            java.lang.Object r9 = r2.get(r1)
            if (r9 != 0) goto L38
            boolean r1 = r11.b
            if (r1 == 0) goto L2
            return r8
        L38:
            boolean r1 = r9 instanceof kotlinx.coroutines.internal.a0.b
            if (r1 == 0) goto L3d
            return r8
        L3d:
            int r1 = r7 + 1
            r2 = 1073741823(0x3fffffff, float:1.9999999)
            r10 = r1 & r2
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = kotlinx.coroutines.internal.a0.g
            kotlinx.coroutines.internal.a0$a r2 = kotlinx.coroutines.internal.a0.e
            long r5 = r2.b(r3, r10)
            r2 = r11
            boolean r1 = r1.compareAndSet(r2, r3, r5)
            if (r1 == 0) goto L5c
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r2.d
            int r1 = r2.c
            r1 = r1 & r7
            r0.set(r1, r8)
            return r9
        L5c:
            boolean r1 = r2.b
            if (r1 == 0) goto L2
            r0 = r2
        L61:
            kotlinx.coroutines.internal.a0 r0 = r0.o(r7, r10)
            if (r0 != 0) goto L61
            return r9
    }
}
