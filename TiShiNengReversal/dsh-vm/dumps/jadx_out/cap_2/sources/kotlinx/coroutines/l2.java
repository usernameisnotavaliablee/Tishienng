package kotlinx.coroutines;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "This is internal API and may be removed in the future releases")
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nJobSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/JobSupport\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 4 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 Concurrent.kt\nkotlinx/coroutines/internal/ConcurrentKt\n+ 7 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n+ 8 Exceptions.kt\nkotlinx/coroutines/ExceptionsKt\n+ 9 LockFreeLinkedList.kt\nkotlinx/coroutines/internal/LockFreeLinkedListHead\n+ 10 CompletionHandler.common.kt\nkotlinx/coroutines/CompletionHandler_commonKt\n+ 11 CompletionHandler.kt\nkotlinx/coroutines/CompletionHandlerKt\n+ 12 LockFreeLinkedList.kt\nkotlinx/coroutines/internal/LockFreeLinkedListNode\n+ 13 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,1454:1\n706#1,2:1461\n367#1,2:1471\n369#1,4:1476\n373#1,4:1482\n377#1,2:1489\n367#1,2:1491\n369#1,4:1496\n373#1,4:1502\n377#1,2:1509\n178#1,2:1518\n707#1:1520\n178#1,2:1521\n178#1,2:1540\n178#1,2:1555\n706#1,2:1557\n706#1,2:1559\n178#1,2:1561\n706#1,2:1563\n178#1,2:1565\n178#1,2:1572\n178#1,2:1574\n1#2:1455\n1#2:1480\n1#2:1500\n28#3,4:1456\n28#3,4:1523\n28#3,4:1567\n28#3,4:1576\n20#4:1460\n20#4:1527\n20#4:1571\n20#4:1580\n288#5,2:1463\n288#5,2:1465\n19#6:1467\n163#7:1468\n163#7:1469\n153#7,4:1583\n75#8:1470\n75#8:1481\n75#8:1501\n75#8:1514\n341#9,3:1473\n344#9,3:1486\n341#9,3:1493\n344#9,3:1506\n341#9,3:1511\n344#9,3:1515\n47#10:1528\n22#11:1529\n22#11:1530\n13#11:1551\n13#11:1554\n13#11:1581\n13#11:1582\n13#11:1587\n13#11:1588\n134#12:1531\n73#12,3:1532\n135#12,5:1535\n314#13,9:1542\n323#13,2:1552\n*S KotlinDebug\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/JobSupport\n*L\n250#1:1461,2\n332#1:1471,2\n332#1:1476,4\n332#1:1482,4\n332#1:1489,2\n364#1:1491,2\n364#1:1496,4\n364#1:1502,4\n364#1:1509,2\n381#1:1518,2\n426#1:1520\n461#1:1521,2\n553#1:1540,2\n594#1:1555,2\n621#1:1557,2\n630#1:1559,2\n694#1:1561,2\n723#1:1563,2\n736#1:1565,2\n809#1:1572,2\n831#1:1574,2\n332#1:1480\n364#1:1500\n213#1:1456,4\n478#1:1523,4\n739#1:1567,4\n884#1:1576,4\n213#1:1460\n478#1:1527\n739#1:1571\n884#1:1580\n261#1:1463,2\n265#1:1465,2\n273#1:1467\n279#1:1468\n281#1:1469\n1218#1:1583,4\n284#1:1470\n332#1:1481\n364#1:1501\n372#1:1514\n332#1:1473,3\n332#1:1486,3\n364#1:1493,3\n364#1:1506,3\n368#1:1511,3\n368#1:1515,3\n483#1:1528\n495#1:1529\n505#1:1530\n561#1:1551\n577#1:1554\n924#1:1581\n974#1:1582\n1237#1:1587\n1259#1:1588\n526#1:1531\n526#1:1532,3\n526#1:1535,5\n559#1:1542,9\n559#1:1552,2\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class l2 implements kotlinx.coroutines.e2, kotlinx.coroutines.x, kotlinx.coroutines.u2 {

    @org.jetbrains.annotations.NotNull
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater a = null;

    @org.jetbrains.annotations.NotNull
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater b = null;

    @kotlin.jvm.Volatile
    @org.jetbrains.annotations.Nullable
    private volatile java.lang.Object _parentHandle;

    @kotlin.jvm.Volatile
    @org.jetbrains.annotations.Nullable
    private volatile java.lang.Object _state;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nJobSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/JobSupport$AwaitContinuation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1454:1\n1#2:1455\n*E\n"})
    private static final class a<T> extends kotlinx.coroutines.q<T> {

        @org.jetbrains.annotations.NotNull
        private final kotlinx.coroutines.l2 i;

        public a(@org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super T> r2, @org.jetbrains.annotations.NotNull kotlinx.coroutines.l2 r3) {
                r1 = this;
                r0 = 1
                r1.<init>(r2, r0)
                r1.i = r3
                return
        }

        @Override // kotlinx.coroutines.q
        @org.jetbrains.annotations.NotNull
        protected java.lang.String L() {
                r1 = this;
                java.lang.String r0 = "AwaitContinuation"
                return r0
        }

        @Override // kotlinx.coroutines.q
        @org.jetbrains.annotations.NotNull
        public java.lang.Throwable v(@org.jetbrains.annotations.NotNull kotlinx.coroutines.e2 r3) {
                r2 = this;
                kotlinx.coroutines.l2 r0 = r2.i
                java.lang.Object r0 = r0.H0()
                boolean r1 = r0 instanceof kotlinx.coroutines.l2.c
                if (r1 == 0) goto L14
                r1 = r0
                kotlinx.coroutines.l2$c r1 = (kotlinx.coroutines.l2.c) r1
                java.lang.Throwable r1 = r1.e()
                if (r1 == 0) goto L14
                return r1
            L14:
                boolean r1 = r0 instanceof kotlinx.coroutines.d0
                if (r1 == 0) goto L1d
                kotlinx.coroutines.d0 r0 = (kotlinx.coroutines.d0) r0
                java.lang.Throwable r3 = r0.a
                return r3
            L1d:
                java.util.concurrent.CancellationException r3 = r3.H()
                return r3
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class b extends kotlinx.coroutines.k2 {

        @org.jetbrains.annotations.NotNull
        private final kotlinx.coroutines.l2 e;

        @org.jetbrains.annotations.NotNull
        private final kotlinx.coroutines.l2.c f;

        @org.jetbrains.annotations.NotNull
        private final kotlinx.coroutines.w g;

        @org.jetbrains.annotations.Nullable
        private final java.lang.Object h;

        public b(@org.jetbrains.annotations.NotNull kotlinx.coroutines.l2 r1, @org.jetbrains.annotations.NotNull kotlinx.coroutines.l2.c r2, @org.jetbrains.annotations.NotNull kotlinx.coroutines.w r3, @org.jetbrains.annotations.Nullable java.lang.Object r4) {
                r0 = this;
                r0.<init>()
                r0.e = r1
                r0.f = r2
                r0.g = r3
                r0.h = r4
                return
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ kotlin.n1 invoke(java.lang.Throwable r1) {
                r0 = this;
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                r0.z(r1)
                kotlin.n1 r1 = kotlin.n1.a
                return r1
        }

        @Override // kotlinx.coroutines.f0
        public void z(@org.jetbrains.annotations.Nullable java.lang.Throwable r4) {
                r3 = this;
                kotlinx.coroutines.l2 r4 = r3.e
                kotlinx.coroutines.l2$c r0 = r3.f
                kotlinx.coroutines.w r1 = r3.g
                java.lang.Object r2 = r3.h
                kotlinx.coroutines.l2.X(r4, r0, r1, r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nJobSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/JobSupport$Finishing\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1454:1\n1#2:1455\n*E\n"})
    private static final class c implements kotlinx.coroutines.y1 {

        @org.jetbrains.annotations.NotNull
        private static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater b = null;

        @org.jetbrains.annotations.NotNull
        private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater c = null;

        @org.jetbrains.annotations.NotNull
        private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater d = null;

        @kotlin.jvm.Volatile
        @org.jetbrains.annotations.Nullable
        private volatile java.lang.Object _exceptionsHolder;

        @kotlin.jvm.Volatile
        private volatile int _isCompleting;

        @kotlin.jvm.Volatile
        @org.jetbrains.annotations.Nullable
        private volatile java.lang.Object _rootCause;

        @org.jetbrains.annotations.NotNull
        private final kotlinx.coroutines.q2 a;

        static {
                java.lang.String r0 = "_isCompleting"
                java.lang.Class<kotlinx.coroutines.l2$c> r1 = kotlinx.coroutines.l2.c.class
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r1, r0)
                kotlinx.coroutines.l2.c.b = r0
                java.lang.String r0 = "_rootCause"
                java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r2, r0)
                kotlinx.coroutines.l2.c.c = r0
                java.lang.String r0 = "_exceptionsHolder"
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r2, r0)
                kotlinx.coroutines.l2.c.d = r0
                return
        }

        public c(@org.jetbrains.annotations.NotNull kotlinx.coroutines.q2 r1, boolean r2, @org.jetbrains.annotations.Nullable java.lang.Throwable r3) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0._isCompleting = r2
                r0._rootCause = r3
                return
        }

        private final java.util.ArrayList<java.lang.Throwable> c() {
                r2 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r1 = 4
                r0.<init>(r1)
                return r0
        }

        private final java.lang.Object d() {
                r1 = this;
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.l2.c.d
                java.lang.Object r0 = r0.get(r1)
                return r0
        }

        private final void k(java.lang.Object r2) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.l2.c.d
                r0.set(r1, r2)
                return
        }

        @Override // kotlinx.coroutines.y1
        @org.jetbrains.annotations.NotNull
        public kotlinx.coroutines.q2 a() {
                r1 = this;
                kotlinx.coroutines.q2 r0 = r1.a
                return r0
        }

        public final void b(@org.jetbrains.annotations.NotNull java.lang.Throwable r4) {
                r3 = this;
                java.lang.Throwable r0 = r3.e()
                if (r0 != 0) goto La
                r3.l(r4)
                return
            La:
                if (r4 != r0) goto Ld
                goto L1d
            Ld:
                java.lang.Object r0 = r3.d()
                if (r0 != 0) goto L17
                r3.k(r4)
                return
            L17:
                boolean r1 = r0 instanceof java.lang.Throwable
                if (r1 == 0) goto L2c
                if (r4 != r0) goto L1e
            L1d:
                return
            L1e:
                java.util.ArrayList r1 = r3.c()
                r1.add(r0)
                r1.add(r4)
                r3.k(r1)
                return
            L2c:
                boolean r1 = r0 instanceof java.util.ArrayList
                if (r1 == 0) goto L36
                java.util.ArrayList r0 = (java.util.ArrayList) r0
                r0.add(r4)
                return
            L36:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "State is "
                r1.append(r2)
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                java.lang.String r0 = r0.toString()
                r4.<init>(r0)
                throw r4
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Throwable e() {
                r1 = this;
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.l2.c.c
                java.lang.Object r0 = r0.get(r1)
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                return r0
        }

        public final boolean f() {
                r1 = this;
                java.lang.Throwable r0 = r1.e()
                if (r0 == 0) goto L8
                r0 = 1
                return r0
            L8:
                r0 = 0
                return r0
        }

        public final boolean g() {
                r1 = this;
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.l2.c.b
                int r0 = r0.get(r1)
                if (r0 == 0) goto La
                r0 = 1
                return r0
            La:
                r0 = 0
                return r0
        }

        public final boolean h() {
                r2 = this;
                java.lang.Object r0 = r2.d()
                kotlinx.coroutines.internal.s0 r1 = kotlinx.coroutines.m2.e()
                if (r0 != r1) goto Lc
                r0 = 1
                return r0
            Lc:
                r0 = 0
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final java.util.List<java.lang.Throwable> i(@org.jetbrains.annotations.Nullable java.lang.Throwable r4) {
                r3 = this;
                java.lang.Object r0 = r3.d()
                if (r0 != 0) goto Lb
                java.util.ArrayList r0 = r3.c()
                goto L1e
            Lb:
                boolean r1 = r0 instanceof java.lang.Throwable
                if (r1 == 0) goto L18
                java.util.ArrayList r1 = r3.c()
                r1.add(r0)
                r0 = r1
                goto L1e
            L18:
                boolean r1 = r0 instanceof java.util.ArrayList
                if (r1 == 0) goto L3b
                java.util.ArrayList r0 = (java.util.ArrayList) r0
            L1e:
                java.lang.Throwable r1 = r3.e()
                if (r1 == 0) goto L28
                r2 = 0
                r0.add(r2, r1)
            L28:
                if (r4 == 0) goto L33
                boolean r1 = kotlin.jvm.internal.g0.g(r4, r1)
                if (r1 != 0) goto L33
                r0.add(r4)
            L33:
                kotlinx.coroutines.internal.s0 r4 = kotlinx.coroutines.m2.e()
                r3.k(r4)
                return r0
            L3b:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "State is "
                r1.append(r2)
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                java.lang.String r0 = r0.toString()
                r4.<init>(r0)
                throw r4
        }

        @Override // kotlinx.coroutines.y1
        public boolean isActive() {
                r1 = this;
                java.lang.Throwable r0 = r1.e()
                if (r0 != 0) goto L8
                r0 = 1
                return r0
            L8:
                r0 = 0
                return r0
        }

        public final void j(boolean r2) {
                r1 = this;
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.l2.c.b
                r0.set(r1, r2)
                return
        }

        public final void l(@org.jetbrains.annotations.Nullable java.lang.Throwable r2) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.l2.c.c
                r0.set(r1, r2)
                return
        }

        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Finishing[cancelling="
                r0.append(r1)
                boolean r1 = r2.f()
                r0.append(r1)
                java.lang.String r1 = ", completing="
                r0.append(r1)
                boolean r1 = r2.g()
                r0.append(r1)
                java.lang.String r1 = ", rootCause="
                r0.append(r1)
                java.lang.Throwable r1 = r2.e()
                r0.append(r1)
                java.lang.String r1 = ", exceptions="
                r0.append(r1)
                java.lang.Object r1 = r2.d()
                r0.append(r1)
                java.lang.String r1 = ", list="
                r0.append(r1)
                kotlinx.coroutines.q2 r1 = r2.a()
                r0.append(r1)
                r1 = 93
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class d extends kotlinx.coroutines.k2 {

        @org.jetbrains.annotations.NotNull
        private final kotlinx.coroutines.selects.m<?> e;
        final /* synthetic */ kotlinx.coroutines.l2 f;

        public d(@org.jetbrains.annotations.NotNull kotlinx.coroutines.l2 r1, kotlinx.coroutines.selects.m<?> r2) {
                r0 = this;
                r0.f = r1
                r0.<init>()
                r0.e = r2
                return
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ kotlin.n1 invoke(java.lang.Throwable r1) {
                r0 = this;
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                r0.z(r1)
                kotlin.n1 r1 = kotlin.n1.a
                return r1
        }

        @Override // kotlinx.coroutines.f0
        public void z(@org.jetbrains.annotations.Nullable java.lang.Throwable r3) {
                r2 = this;
                kotlinx.coroutines.l2 r3 = r2.f
                java.lang.Object r3 = r3.H0()
                boolean r0 = r3 instanceof kotlinx.coroutines.d0
                if (r0 == 0) goto Lb
                goto Lf
            Lb:
                java.lang.Object r3 = kotlinx.coroutines.m2.h(r3)
            Lf:
                kotlinx.coroutines.selects.m<?> r0 = r2.e
                kotlinx.coroutines.l2 r1 = r2.f
                r0.j(r1, r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class e extends kotlinx.coroutines.k2 {

        @org.jetbrains.annotations.NotNull
        private final kotlinx.coroutines.selects.m<?> e;
        final /* synthetic */ kotlinx.coroutines.l2 f;

        public e(@org.jetbrains.annotations.NotNull kotlinx.coroutines.l2 r1, kotlinx.coroutines.selects.m<?> r2) {
                r0 = this;
                r0.f = r1
                r0.<init>()
                r0.e = r2
                return
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ kotlin.n1 invoke(java.lang.Throwable r1) {
                r0 = this;
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                r0.z(r1)
                kotlin.n1 r1 = kotlin.n1.a
                return r1
        }

        @Override // kotlinx.coroutines.f0
        public void z(@org.jetbrains.annotations.Nullable java.lang.Throwable r3) {
                r2 = this;
                kotlinx.coroutines.selects.m<?> r3 = r2.e
                kotlinx.coroutines.l2 r0 = r2.f
                kotlin.n1 r1 = kotlin.n1.a
                r3.j(r0, r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nLockFreeLinkedList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LockFreeLinkedList.kt\nkotlinx/coroutines/internal/LockFreeLinkedListNode$makeCondAddOp$1\n+ 2 JobSupport.kt\nkotlinx/coroutines/JobSupport\n*L\n1#1,367:1\n526#2:368\n*E\n"})
    public static final class f extends kotlinx.coroutines.internal.y.a {
        final /* synthetic */ kotlinx.coroutines.l2 d;
        final /* synthetic */ java.lang.Object e;

        public f(kotlinx.coroutines.internal.y r1, kotlinx.coroutines.l2 r2, java.lang.Object r3) {
                r0 = this;
                r0.d = r2
                r0.e = r3
                r0.<init>(r1)
                return
        }

        @Override // kotlinx.coroutines.internal.b
        public /* bridge */ /* synthetic */ java.lang.Object e(kotlinx.coroutines.internal.y r1) {
                r0 = this;
                kotlinx.coroutines.internal.y r1 = (kotlinx.coroutines.internal.y) r1
                java.lang.Object r1 = r0.g(r1)
                return r1
        }

        @org.jetbrains.annotations.Nullable
        public java.lang.Object g(@org.jetbrains.annotations.NotNull kotlinx.coroutines.internal.y r2) {
                r1 = this;
                kotlinx.coroutines.l2 r2 = r1.d
                java.lang.Object r2 = r2.H0()
                java.lang.Object r0 = r1.e
                if (r2 != r0) goto Lc
                r2 = 0
                return r2
            Lc:
                java.lang.Object r2 = kotlinx.coroutines.internal.x.a()
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.JobSupport$children$1", f = "JobSupport.kt", i = {1, 1, 1}, l = {956, 958}, m = "invokeSuspend", n = {"$this$sequence", "this_$iv", "cur$iv"}, s = {"L$0", "L$1", "L$2"})
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nJobSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/JobSupport$children$1\n+ 2 LockFreeLinkedList.kt\nkotlinx/coroutines/internal/LockFreeLinkedListHead\n*L\n1#1,1454:1\n341#2,6:1455\n*S KotlinDebug\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/JobSupport$children$1\n*L\n958#1:1455,6\n*E\n"})
    static final class g extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<kotlin.sequences.o<? super kotlinx.coroutines.e2>, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        java.lang.Object a;
        java.lang.Object b;
        int c;
        private /* synthetic */ java.lang.Object d;
        final /* synthetic */ kotlinx.coroutines.l2 e;

        g(kotlinx.coroutines.l2 r1, kotlin.coroutines.e<? super kotlinx.coroutines.l2.g> r2) {
                r0 = this;
                r0.e = r1
                r1 = 2
                r0.<init>(r1, r2)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.NotNull
        public final kotlin.coroutines.e<kotlin.n1> create(@org.jetbrains.annotations.Nullable java.lang.Object r3, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<?> r4) {
                r2 = this;
                kotlinx.coroutines.l2$g r0 = new kotlinx.coroutines.l2$g
                kotlinx.coroutines.l2 r1 = r2.e
                r0.<init>(r1, r4)
                r0.d = r3
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlin.sequences.o<? super kotlinx.coroutines.e2> r1, kotlin.coroutines.e<? super kotlin.n1> r2) {
                r0 = this;
                kotlin.sequences.o r1 = (kotlin.sequences.o) r1
                kotlin.coroutines.e r2 = (kotlin.coroutines.e) r2
                java.lang.Object r1 = r0.invoke2(r1, r2)
                return r1
        }

        @org.jetbrains.annotations.Nullable
        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final java.lang.Object invoke2(@org.jetbrains.annotations.NotNull kotlin.sequences.o<? super kotlinx.coroutines.e2> r1, @org.jetbrains.annotations.Nullable kotlin.coroutines.e<? super kotlin.n1> r2) {
                r0 = this;
                kotlin.coroutines.e r1 = r0.create(r1, r2)
                kotlinx.coroutines.l2$g r1 = (kotlinx.coroutines.l2.g) r1
                kotlin.n1 r2 = kotlin.n1.a
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r6) {
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
                int r1 = r5.c
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2a
                if (r1 == r3) goto L26
                if (r1 != r2) goto L1e
                java.lang.Object r1 = r5.b
                kotlinx.coroutines.internal.y r1 = (kotlinx.coroutines.internal.y) r1
                java.lang.Object r3 = r5.a
                kotlinx.coroutines.internal.w r3 = (kotlinx.coroutines.internal.w) r3
                java.lang.Object r4 = r5.d
                kotlin.sequences.o r4 = (kotlin.sequences.o) r4
                kotlin.g0.n(r6)
                goto L81
            L1e:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L26:
                kotlin.g0.n(r6)
                goto L86
            L2a:
                kotlin.g0.n(r6)
                java.lang.Object r6 = r5.d
                kotlin.sequences.o r6 = (kotlin.sequences.o) r6
                kotlinx.coroutines.l2 r1 = r5.e
                java.lang.Object r1 = r1.H0()
                boolean r4 = r1 instanceof kotlinx.coroutines.w
                if (r4 == 0) goto L48
                kotlinx.coroutines.w r1 = (kotlinx.coroutines.w) r1
                kotlinx.coroutines.x r1 = r1.e
                r5.c = r3
                java.lang.Object r6 = r6.c(r1, r5)
                if (r6 != r0) goto L86
                goto L80
            L48:
                boolean r3 = r1 instanceof kotlinx.coroutines.y1
                if (r3 == 0) goto L86
                kotlinx.coroutines.y1 r1 = (kotlinx.coroutines.y1) r1
                kotlinx.coroutines.q2 r1 = r1.a()
                if (r1 == 0) goto L86
                java.lang.Object r3 = r1.n()
                java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
                kotlin.jvm.internal.g0.n(r3, r4)
                kotlinx.coroutines.internal.y r3 = (kotlinx.coroutines.internal.y) r3
                r4 = r3
                r3 = r1
                r1 = r4
                r4 = r6
            L63:
                boolean r6 = kotlin.jvm.internal.g0.g(r1, r3)
                if (r6 != 0) goto L86
                boolean r6 = r1 instanceof kotlinx.coroutines.w
                if (r6 == 0) goto L81
                r6 = r1
                kotlinx.coroutines.w r6 = (kotlinx.coroutines.w) r6
                kotlinx.coroutines.x r6 = r6.e
                r5.d = r4
                r5.a = r3
                r5.b = r1
                r5.c = r2
                java.lang.Object r6 = r4.c(r6, r5)
                if (r6 != r0) goto L81
            L80:
                return r0
            L81:
                kotlinx.coroutines.internal.y r1 = r1.o()
                goto L63
            L86:
                kotlin.n1 r6 = kotlin.n1.a
                return r6
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* synthetic */ class h extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function3<kotlinx.coroutines.l2, kotlinx.coroutines.selects.m<?>, java.lang.Object, kotlin.n1> {
        public static final kotlinx.coroutines.l2.h a = null;

        static {
                kotlinx.coroutines.l2$h r0 = new kotlinx.coroutines.l2$h
                r0.<init>()
                kotlinx.coroutines.l2.h.a = r0
                return
        }

        h() {
                r6 = this;
                java.lang.String r4 = "onAwaitInternalRegFunc(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V"
                r5 = 0
                r1 = 3
                java.lang.Class<kotlinx.coroutines.l2> r2 = kotlinx.coroutines.l2.class
                java.lang.String r3 = "onAwaitInternalRegFunc"
                r0 = r6
                r0.<init>(r1, r2, r3, r4, r5)
                return
        }

        public final void c(@org.jetbrains.annotations.NotNull kotlinx.coroutines.l2 r1, @org.jetbrains.annotations.NotNull kotlinx.coroutines.selects.m<?> r2, @org.jetbrains.annotations.Nullable java.lang.Object r3) {
                r0 = this;
                kotlinx.coroutines.l2.a0(r1, r2, r3)
                return
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ kotlin.n1 invoke(kotlinx.coroutines.l2 r1, kotlinx.coroutines.selects.m<?> r2, java.lang.Object r3) {
                r0 = this;
                kotlinx.coroutines.l2 r1 = (kotlinx.coroutines.l2) r1
                kotlinx.coroutines.selects.m r2 = (kotlinx.coroutines.selects.m) r2
                r0.c(r1, r2, r3)
                kotlin.n1 r1 = kotlin.n1.a
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* synthetic */ class i extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function3<kotlinx.coroutines.l2, java.lang.Object, java.lang.Object, java.lang.Object> {
        public static final kotlinx.coroutines.l2.i a = null;

        static {
                kotlinx.coroutines.l2$i r0 = new kotlinx.coroutines.l2$i
                r0.<init>()
                kotlinx.coroutines.l2.i.a = r0
                return
        }

        i() {
                r6 = this;
                java.lang.String r4 = "onAwaitInternalProcessResFunc(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"
                r5 = 0
                r1 = 3
                java.lang.Class<kotlinx.coroutines.l2> r2 = kotlinx.coroutines.l2.class
                java.lang.String r3 = "onAwaitInternalProcessResFunc"
                r0 = r6
                r0.<init>(r1, r2, r3, r4, r5)
                return
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Object c(@org.jetbrains.annotations.NotNull kotlinx.coroutines.l2 r1, @org.jetbrains.annotations.Nullable java.lang.Object r2, @org.jetbrains.annotations.Nullable java.lang.Object r3) {
                r0 = this;
                java.lang.Object r1 = kotlinx.coroutines.l2.Z(r1, r2, r3)
                return r1
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.l2 r1, java.lang.Object r2, java.lang.Object r3) {
                r0 = this;
                kotlinx.coroutines.l2 r1 = (kotlinx.coroutines.l2) r1
                java.lang.Object r1 = r0.c(r1, r2, r3)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* synthetic */ class j extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function3<kotlinx.coroutines.l2, kotlinx.coroutines.selects.m<?>, java.lang.Object, kotlin.n1> {
        public static final kotlinx.coroutines.l2.j a = null;

        static {
                kotlinx.coroutines.l2$j r0 = new kotlinx.coroutines.l2$j
                r0.<init>()
                kotlinx.coroutines.l2.j.a = r0
                return
        }

        j() {
                r6 = this;
                java.lang.String r4 = "registerSelectForOnJoin(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V"
                r5 = 0
                r1 = 3
                java.lang.Class<kotlinx.coroutines.l2> r2 = kotlinx.coroutines.l2.class
                java.lang.String r3 = "registerSelectForOnJoin"
                r0 = r6
                r0.<init>(r1, r2, r3, r4, r5)
                return
        }

        public final void c(@org.jetbrains.annotations.NotNull kotlinx.coroutines.l2 r1, @org.jetbrains.annotations.NotNull kotlinx.coroutines.selects.m<?> r2, @org.jetbrains.annotations.Nullable java.lang.Object r3) {
                r0 = this;
                kotlinx.coroutines.l2.b0(r1, r2, r3)
                return
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ kotlin.n1 invoke(kotlinx.coroutines.l2 r1, kotlinx.coroutines.selects.m<?> r2, java.lang.Object r3) {
                r0 = this;
                kotlinx.coroutines.l2 r1 = (kotlinx.coroutines.l2) r1
                kotlinx.coroutines.selects.m r2 = (kotlinx.coroutines.selects.m) r2
                r0.c(r1, r2, r3)
                kotlin.n1 r1 = kotlin.n1.a
                return r1
        }
    }

    static {
            java.lang.String r0 = "_state"
            java.lang.Class<kotlinx.coroutines.l2> r1 = kotlinx.coroutines.l2.class
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r2, r0)
            kotlinx.coroutines.l2.a = r0
            java.lang.String r0 = "_parentHandle"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r2, r0)
            kotlinx.coroutines.l2.b = r0
            return
    }

    public l2(boolean r1) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto La
            kotlinx.coroutines.m1 r1 = kotlinx.coroutines.m2.c()
            goto Le
        La:
            kotlinx.coroutines.m1 r1 = kotlinx.coroutines.m2.d()
        Le:
            r0._state = r1
            return
    }

    protected static /* synthetic */ void C0() {
            return
    }

    public static /* synthetic */ void E0() {
            return
    }

    private final kotlinx.coroutines.q2 F0(kotlinx.coroutines.y1 r4) {
            r3 = this;
            kotlinx.coroutines.q2 r0 = r4.a()
            if (r0 != 0) goto L36
            boolean r0 = r4 instanceof kotlinx.coroutines.m1
            if (r0 == 0) goto L10
            kotlinx.coroutines.q2 r4 = new kotlinx.coroutines.q2
            r4.<init>()
            return r4
        L10:
            boolean r0 = r4 instanceof kotlinx.coroutines.k2
            if (r0 == 0) goto L1b
            kotlinx.coroutines.k2 r4 = (kotlinx.coroutines.k2) r4
            r3.h1(r4)
            r4 = 0
            return r4
        L1b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "State should have list: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
        L36:
            return r0
    }

    private final boolean L0(kotlinx.coroutines.y1 r2) {
            r1 = this;
            boolean r0 = r2 instanceof kotlinx.coroutines.l2.c
            if (r0 == 0) goto Le
            kotlinx.coroutines.l2$c r2 = (kotlinx.coroutines.l2.c) r2
            boolean r2 = r2.f()
            if (r2 == 0) goto Le
            r2 = 1
            return r2
        Le:
            r2 = 0
            return r2
    }

    private final boolean O0() {
            r2 = this;
        L0:
            java.lang.Object r0 = r2.H0()
            boolean r1 = r0 instanceof kotlinx.coroutines.y1
            if (r1 != 0) goto La
            r0 = 0
            return r0
        La:
            int r0 = r2.l1(r0)
            if (r0 < 0) goto L0
            r0 = 1
            return r0
    }

    private final java.lang.Object P0(kotlin.coroutines.e<? super kotlin.n1> r4) {
            r3 = this;
            kotlinx.coroutines.q r0 = new kotlinx.coroutines.q
            kotlin.coroutines.e r1 = kotlin.coroutines.intrinsics.a.e(r4)
            r2 = 1
            r0.<init>(r1, r2)
            r0.Q()
            kotlinx.coroutines.w2 r1 = new kotlinx.coroutines.w2
            r1.<init>(r0)
            kotlinx.coroutines.j1 r1 = r3.k(r1)
            kotlinx.coroutines.s.a(r0, r1)
            java.lang.Object r0 = r0.x()
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            if (r0 != r1) goto L26
            kotlin.coroutines.jvm.internal.e.c(r4)
        L26:
            java.lang.Object r4 = kotlin.coroutines.intrinsics.a.l()
            if (r0 != r4) goto L2d
            return r0
        L2d:
            kotlin.n1 r4 = kotlin.n1.a
            return r4
    }

    private final void Q0(java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2, kotlin.jvm.functions.Function1<java.lang.Object, kotlin.n1> r3, java.lang.Object r4) {
            r1 = this;
        L0:
            java.lang.Object r0 = r2.get(r4)
            r3.invoke(r0)
            goto L0
    }

    private final java.lang.Void R0(kotlin.jvm.functions.Function1<java.lang.Object, kotlin.n1> r2) {
            r1 = this;
        L0:
            java.lang.Object r0 = r1.H0()
            r2.invoke(r0)
            goto L0
    }

    private final java.lang.Object S0(java.lang.Object r7) {
            r6 = this;
            r0 = 0
            r1 = r0
        L2:
            java.lang.Object r2 = r6.H0()
            boolean r3 = r2 instanceof kotlinx.coroutines.l2.c
            if (r3 == 0) goto L50
            monitor-enter(r2)
            r3 = r2
            kotlinx.coroutines.l2$c r3 = (kotlinx.coroutines.l2.c) r3     // Catch: java.lang.Throwable -> L1a
            boolean r3 = r3.h()     // Catch: java.lang.Throwable -> L1a
            if (r3 == 0) goto L1c
            kotlinx.coroutines.internal.s0 r7 = kotlinx.coroutines.m2.f()     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r2)
            return r7
        L1a:
            r7 = move-exception
            goto L4e
        L1c:
            r3 = r2
            kotlinx.coroutines.l2$c r3 = (kotlinx.coroutines.l2.c) r3     // Catch: java.lang.Throwable -> L1a
            boolean r3 = r3.f()     // Catch: java.lang.Throwable -> L1a
            if (r7 != 0) goto L27
            if (r3 != 0) goto L33
        L27:
            if (r1 != 0) goto L2d
            java.lang.Throwable r1 = r6.q0(r7)     // Catch: java.lang.Throwable -> L1a
        L2d:
            r7 = r2
            kotlinx.coroutines.l2$c r7 = (kotlinx.coroutines.l2.c) r7     // Catch: java.lang.Throwable -> L1a
            r7.b(r1)     // Catch: java.lang.Throwable -> L1a
        L33:
            r7 = r2
            kotlinx.coroutines.l2$c r7 = (kotlinx.coroutines.l2.c) r7     // Catch: java.lang.Throwable -> L1a
            java.lang.Throwable r7 = r7.e()     // Catch: java.lang.Throwable -> L1a
            if (r3 != 0) goto L3d
            r0 = r7
        L3d:
            monitor-exit(r2)
            if (r0 == 0) goto L49
            kotlinx.coroutines.l2$c r2 = (kotlinx.coroutines.l2.c) r2
            kotlinx.coroutines.q2 r7 = r2.a()
            r6.Y0(r7, r0)
        L49:
            kotlinx.coroutines.internal.s0 r7 = kotlinx.coroutines.m2.a()
            return r7
        L4e:
            monitor-exit(r2)
            throw r7
        L50:
            boolean r3 = r2 instanceof kotlinx.coroutines.y1
            if (r3 == 0) goto La1
            if (r1 != 0) goto L5a
            java.lang.Throwable r1 = r6.q0(r7)
        L5a:
            r3 = r2
            kotlinx.coroutines.y1 r3 = (kotlinx.coroutines.y1) r3
            boolean r4 = r3.isActive()
            if (r4 == 0) goto L6e
            boolean r2 = r6.r1(r3, r1)
            if (r2 == 0) goto L2
            kotlinx.coroutines.internal.s0 r7 = kotlinx.coroutines.m2.a()
            return r7
        L6e:
            kotlinx.coroutines.d0 r3 = new kotlinx.coroutines.d0
            r4 = 0
            r5 = 2
            r3.<init>(r1, r4, r5, r0)
            java.lang.Object r3 = r6.s1(r2, r3)
            kotlinx.coroutines.internal.s0 r4 = kotlinx.coroutines.m2.a()
            if (r3 == r4) goto L86
            kotlinx.coroutines.internal.s0 r2 = kotlinx.coroutines.m2.b()
            if (r3 == r2) goto L2
            return r3
        L86:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot happen in "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        La1:
            kotlinx.coroutines.internal.s0 r7 = kotlinx.coroutines.m2.f()
            return r7
    }

    public static final /* synthetic */ java.lang.Object V(kotlinx.coroutines.l2 r0, kotlin.coroutines.e r1) {
            java.lang.Object r0 = r0.g0(r1)
            return r0
    }

    private final kotlinx.coroutines.k2 V0(kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.n1> r2, boolean r3) {
            r1 = this;
            r0 = 0
            if (r3 == 0) goto L12
            boolean r3 = r2 instanceof kotlinx.coroutines.f2
            if (r3 == 0) goto La
            r0 = r2
            kotlinx.coroutines.f2 r0 = (kotlinx.coroutines.f2) r0
        La:
            if (r0 != 0) goto L21
            kotlinx.coroutines.c2 r0 = new kotlinx.coroutines.c2
            r0.<init>(r2)
            goto L21
        L12:
            boolean r3 = r2 instanceof kotlinx.coroutines.k2
            if (r3 == 0) goto L19
            r0 = r2
            kotlinx.coroutines.k2 r0 = (kotlinx.coroutines.k2) r0
        L19:
            if (r0 == 0) goto L1c
            goto L21
        L1c:
            kotlinx.coroutines.d2 r0 = new kotlinx.coroutines.d2
            r0.<init>(r2)
        L21:
            r0.B(r1)
            return r0
    }

    public static final /* synthetic */ java.lang.String W(kotlinx.coroutines.l2 r0) {
            java.lang.String r0 = r0.m0()
            return r0
    }

    public static final /* synthetic */ void X(kotlinx.coroutines.l2 r0, kotlinx.coroutines.l2.c r1, kotlinx.coroutines.w r2, java.lang.Object r3) {
            r0.p0(r1, r2, r3)
            return
    }

    private final kotlinx.coroutines.w X0(kotlinx.coroutines.internal.y r2) {
            r1 = this;
        L0:
            boolean r0 = r2.q()
            if (r0 == 0) goto Lb
            kotlinx.coroutines.internal.y r2 = r2.p()
            goto L0
        Lb:
            kotlinx.coroutines.internal.y r2 = r2.o()
            boolean r0 = r2.q()
            if (r0 != 0) goto Lb
            boolean r0 = r2 instanceof kotlinx.coroutines.w
            if (r0 == 0) goto L1c
            kotlinx.coroutines.w r2 = (kotlinx.coroutines.w) r2
            return r2
        L1c:
            boolean r0 = r2 instanceof kotlinx.coroutines.q2
            if (r0 == 0) goto Lb
            r2 = 0
            return r2
    }

    public static final /* synthetic */ java.lang.Object Y(kotlinx.coroutines.l2 r0, kotlin.coroutines.e r1) {
            java.lang.Object r0 = r0.P0(r1)
            return r0
    }

    private final void Y0(kotlinx.coroutines.q2 r7, java.lang.Throwable r8) {
            r6 = this;
            r6.d1(r8)
            java.lang.Object r0 = r7.n()
            java.lang.String r1 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            kotlin.jvm.internal.g0.n(r0, r1)
            kotlinx.coroutines.internal.y r0 = (kotlinx.coroutines.internal.y) r0
            r1 = 0
        Lf:
            boolean r2 = kotlin.jvm.internal.g0.g(r0, r7)
            if (r2 != 0) goto L4c
            boolean r2 = r0 instanceof kotlinx.coroutines.f2
            if (r2 == 0) goto L47
            r2 = r0
            kotlinx.coroutines.k2 r2 = (kotlinx.coroutines.k2) r2
            r2.z(r8)     // Catch: java.lang.Throwable -> L20
            goto L47
        L20:
            r3 = move-exception
            if (r1 == 0) goto L27
            kotlin.l.a(r1, r3)
            goto L47
        L27:
            kotlinx.coroutines.CompletionHandlerException r1 = new kotlinx.coroutines.CompletionHandlerException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Exception in completion handler "
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = " for "
            r4.append(r2)
            r4.append(r6)
            java.lang.String r2 = r4.toString()
            r1.<init>(r2, r3)
            kotlin.n1 r2 = kotlin.n1.a
        L47:
            kotlinx.coroutines.internal.y r0 = r0.o()
            goto Lf
        L4c:
            if (r1 == 0) goto L51
            r6.J0(r1)
        L51:
            r6.l0(r8)
            return
    }

    public static final /* synthetic */ java.lang.Object Z(kotlinx.coroutines.l2 r0, java.lang.Object r1, java.lang.Object r2) {
            java.lang.Object r0 = r0.b1(r1, r2)
            return r0
    }

    private final void Z0(kotlinx.coroutines.q2 r7, java.lang.Throwable r8) {
            r6 = this;
            java.lang.Object r0 = r7.n()
            java.lang.String r1 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            kotlin.jvm.internal.g0.n(r0, r1)
            kotlinx.coroutines.internal.y r0 = (kotlinx.coroutines.internal.y) r0
            r1 = 0
        Lc:
            boolean r2 = kotlin.jvm.internal.g0.g(r0, r7)
            if (r2 != 0) goto L49
            boolean r2 = r0 instanceof kotlinx.coroutines.k2
            if (r2 == 0) goto L44
            r2 = r0
            kotlinx.coroutines.k2 r2 = (kotlinx.coroutines.k2) r2
            r2.z(r8)     // Catch: java.lang.Throwable -> L1d
            goto L44
        L1d:
            r3 = move-exception
            if (r1 == 0) goto L24
            kotlin.l.a(r1, r3)
            goto L44
        L24:
            kotlinx.coroutines.CompletionHandlerException r1 = new kotlinx.coroutines.CompletionHandlerException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Exception in completion handler "
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = " for "
            r4.append(r2)
            r4.append(r6)
            java.lang.String r2 = r4.toString()
            r1.<init>(r2, r3)
            kotlin.n1 r2 = kotlin.n1.a
        L44:
            kotlinx.coroutines.internal.y r0 = r0.o()
            goto Lc
        L49:
            if (r1 == 0) goto L4e
            r6.J0(r1)
        L4e:
            return
    }

    public static final /* synthetic */ void a0(kotlinx.coroutines.l2 r0, kotlinx.coroutines.selects.m r1, java.lang.Object r2) {
            r0.c1(r1, r2)
            return
    }

    private final /* synthetic */ <T extends kotlinx.coroutines.k2> void a1(kotlinx.coroutines.q2 r7, java.lang.Throwable r8) {
            r6 = this;
            java.lang.Object r0 = r7.n()
            java.lang.String r1 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            kotlin.jvm.internal.g0.n(r0, r1)
            kotlinx.coroutines.internal.y r0 = (kotlinx.coroutines.internal.y) r0
            r1 = 0
        Lc:
            boolean r2 = kotlin.jvm.internal.g0.g(r0, r7)
            if (r2 != 0) goto L51
            r2 = 3
            java.lang.String r3 = "T"
            kotlin.jvm.internal.g0.y(r2, r3)
            boolean r2 = androidx.activity.k.a(r0)
            if (r2 == 0) goto L4c
            r2 = r0
            kotlinx.coroutines.k2 r2 = (kotlinx.coroutines.k2) r2
            r2.z(r8)     // Catch: java.lang.Throwable -> L25
            goto L4c
        L25:
            r3 = move-exception
            if (r1 == 0) goto L2c
            kotlin.l.a(r1, r3)
            goto L4c
        L2c:
            kotlinx.coroutines.CompletionHandlerException r1 = new kotlinx.coroutines.CompletionHandlerException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Exception in completion handler "
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = " for "
            r4.append(r2)
            r4.append(r6)
            java.lang.String r2 = r4.toString()
            r1.<init>(r2, r3)
            kotlin.n1 r2 = kotlin.n1.a
        L4c:
            kotlinx.coroutines.internal.y r0 = r0.o()
            goto Lc
        L51:
            if (r1 == 0) goto L56
            r6.J0(r1)
        L56:
            return
    }

    public static final /* synthetic */ void b0(kotlinx.coroutines.l2 r0, kotlinx.coroutines.selects.m r1, java.lang.Object r2) {
            r0.i1(r1, r2)
            return
    }

    private final java.lang.Object b1(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            boolean r1 = r2 instanceof kotlinx.coroutines.d0
            if (r1 != 0) goto L5
            return r2
        L5:
            kotlinx.coroutines.d0 r2 = (kotlinx.coroutines.d0) r2
            java.lang.Throwable r1 = r2.a
            throw r1
    }

    private final boolean c0(java.lang.Object r3, kotlinx.coroutines.q2 r4, kotlinx.coroutines.k2 r5) {
            r2 = this;
            kotlinx.coroutines.l2$f r0 = new kotlinx.coroutines.l2$f
            r0.<init>(r5, r2, r3)
        L5:
            kotlinx.coroutines.internal.y r3 = r4.p()
            int r3 = r3.x(r5, r4, r0)
            r1 = 1
            if (r3 == r1) goto L16
            r1 = 2
            if (r3 == r1) goto L14
            goto L5
        L14:
            r3 = 0
            return r3
        L16:
            return r1
    }

    private final void c1(kotlinx.coroutines.selects.m<?> r2, java.lang.Object r3) {
            r1 = this;
        L0:
            java.lang.Object r3 = r1.H0()
            boolean r0 = r3 instanceof kotlinx.coroutines.y1
            if (r0 != 0) goto L15
            boolean r0 = r3 instanceof kotlinx.coroutines.d0
            if (r0 == 0) goto Ld
            goto L11
        Ld:
            java.lang.Object r3 = kotlinx.coroutines.m2.h(r3)
        L11:
            r2.f(r3)
            return
        L15:
            int r3 = r1.l1(r3)
            if (r3 < 0) goto L0
            kotlinx.coroutines.l2$d r3 = new kotlinx.coroutines.l2$d
            r3.<init>(r1, r2)
            kotlinx.coroutines.j1 r3 = r1.k(r3)
            r2.h(r3)
            return
    }

    private final void d0(java.lang.Throwable r4, java.util.List<? extends java.lang.Throwable> r5) {
            r3 = this;
            int r0 = r5.size()
            r1 = 1
            if (r0 > r1) goto L8
            goto L37
        L8:
            int r0 = r5.size()
            java.util.IdentityHashMap r1 = new java.util.IdentityHashMap
            r1.<init>(r0)
            java.util.Set r0 = java.util.Collections.newSetFromMap(r1)
            java.util.Iterator r5 = r5.iterator()
        L19:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L37
            java.lang.Object r1 = r5.next()
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            if (r1 == r4) goto L19
            if (r1 == r4) goto L19
            boolean r2 = r1 instanceof java.util.concurrent.CancellationException
            if (r2 != 0) goto L19
            boolean r2 = r0.add(r1)
            if (r2 == 0) goto L19
            kotlin.l.a(r4, r1)
            goto L19
        L37:
            return
    }

    private final java.lang.Object g0(kotlin.coroutines.e<java.lang.Object> r3) {
            r2 = this;
            kotlinx.coroutines.l2$a r0 = new kotlinx.coroutines.l2$a
            kotlin.coroutines.e r1 = kotlin.coroutines.intrinsics.a.e(r3)
            r0.<init>(r1, r2)
            r0.Q()
            kotlinx.coroutines.v2 r1 = new kotlinx.coroutines.v2
            r1.<init>(r0)
            kotlinx.coroutines.j1 r1 = r2.k(r1)
            kotlinx.coroutines.s.a(r0, r1)
            java.lang.Object r0 = r0.x()
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            if (r0 != r1) goto L25
            kotlin.coroutines.jvm.internal.e.c(r3)
        L25:
            return r0
    }

    private final void g1(kotlinx.coroutines.m1 r3) {
            r2 = this;
            kotlinx.coroutines.q2 r0 = new kotlinx.coroutines.q2
            r0.<init>()
            boolean r1 = r3.isActive()
            if (r1 == 0) goto Lc
            goto L12
        Lc:
            kotlinx.coroutines.x1 r1 = new kotlinx.coroutines.x1
            r1.<init>(r0)
            r0 = r1
        L12:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.l2.a
            androidx.concurrent.futures.a.a(r1, r2, r3, r0)
            return
    }

    private final void h1(kotlinx.coroutines.k2 r3) {
            r2 = this;
            kotlinx.coroutines.q2 r0 = new kotlinx.coroutines.q2
            r0.<init>()
            r3.j(r0)
            kotlinx.coroutines.internal.y r0 = r3.o()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.l2.a
            androidx.concurrent.futures.a.a(r1, r2, r3, r0)
            return
    }

    private final void i1(kotlinx.coroutines.selects.m<?> r1, java.lang.Object r2) {
            r0 = this;
            boolean r2 = r0.O0()
            if (r2 != 0) goto Lc
            kotlin.n1 r2 = kotlin.n1.a
            r1.f(r2)
            return
        Lc:
            kotlinx.coroutines.l2$e r2 = new kotlinx.coroutines.l2$e
            r2.<init>(r0, r1)
            kotlinx.coroutines.j1 r2 = r0.k(r2)
            r1.h(r2)
            return
    }

    private final java.lang.Object k0(java.lang.Object r7) {
            r6 = this;
        L0:
            java.lang.Object r0 = r6.H0()
            boolean r1 = r0 instanceof kotlinx.coroutines.y1
            if (r1 == 0) goto L2d
            boolean r1 = r0 instanceof kotlinx.coroutines.l2.c
            if (r1 == 0) goto L16
            r1 = r0
            kotlinx.coroutines.l2$c r1 = (kotlinx.coroutines.l2.c) r1
            boolean r1 = r1.g()
            if (r1 == 0) goto L16
            goto L2d
        L16:
            kotlinx.coroutines.d0 r1 = new kotlinx.coroutines.d0
            java.lang.Throwable r2 = r6.q0(r7)
            r3 = 2
            r4 = 0
            r5 = 0
            r1.<init>(r2, r5, r3, r4)
            java.lang.Object r0 = r6.s1(r0, r1)
            kotlinx.coroutines.internal.s0 r1 = kotlinx.coroutines.m2.b()
            if (r0 == r1) goto L0
            return r0
        L2d:
            kotlinx.coroutines.internal.s0 r7 = kotlinx.coroutines.m2.a()
            return r7
    }

    private final boolean l0(java.lang.Throwable r5) {
            r4 = this;
            boolean r0 = r4.N0()
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            boolean r0 = r5 instanceof java.util.concurrent.CancellationException
            kotlinx.coroutines.v r2 = r4.G0()
            if (r2 == 0) goto L21
            kotlinx.coroutines.s2 r3 = kotlinx.coroutines.s2.a
            if (r2 != r3) goto L15
            goto L21
        L15:
            boolean r5 = r2.b(r5)
            if (r5 != 0) goto L20
            if (r0 == 0) goto L1e
            goto L20
        L1e:
            r5 = 0
            return r5
        L20:
            return r1
        L21:
            return r0
    }

    private final int l1(java.lang.Object r5) {
            r4 = this;
            boolean r0 = r5 instanceof kotlinx.coroutines.m1
            r1 = 1
            r2 = -1
            r3 = 0
            if (r0 == 0) goto L22
            r0 = r5
            kotlinx.coroutines.m1 r0 = (kotlinx.coroutines.m1) r0
            boolean r0 = r0.isActive()
            if (r0 == 0) goto L11
            return r3
        L11:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.l2.a
            kotlinx.coroutines.m1 r3 = kotlinx.coroutines.m2.c()
            boolean r5 = androidx.concurrent.futures.a.a(r0, r4, r5, r3)
            if (r5 != 0) goto L1e
            return r2
        L1e:
            r4.f1()
            return r1
        L22:
            boolean r0 = r5 instanceof kotlinx.coroutines.x1
            if (r0 == 0) goto L3a
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.l2.a
            r3 = r5
            kotlinx.coroutines.x1 r3 = (kotlinx.coroutines.x1) r3
            kotlinx.coroutines.q2 r3 = r3.a()
            boolean r5 = androidx.concurrent.futures.a.a(r0, r4, r5, r3)
            if (r5 != 0) goto L36
            return r2
        L36:
            r4.f1()
            return r1
        L3a:
            return r3
    }

    private final java.lang.String m1(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof kotlinx.coroutines.l2.c
            java.lang.String r1 = "Active"
            if (r0 == 0) goto L1b
            kotlinx.coroutines.l2$c r3 = (kotlinx.coroutines.l2.c) r3
            boolean r0 = r3.f()
            if (r0 == 0) goto L11
            java.lang.String r3 = "Cancelling"
            return r3
        L11:
            boolean r3 = r3.g()
            if (r3 == 0) goto L1a
            java.lang.String r3 = "Completing"
            return r3
        L1a:
            return r1
        L1b:
            boolean r0 = r3 instanceof kotlinx.coroutines.y1
            if (r0 == 0) goto L2b
            kotlinx.coroutines.y1 r3 = (kotlinx.coroutines.y1) r3
            boolean r3 = r3.isActive()
            if (r3 == 0) goto L28
            return r1
        L28:
            java.lang.String r3 = "New"
            return r3
        L2b:
            boolean r3 = r3 instanceof kotlinx.coroutines.d0
            if (r3 == 0) goto L32
            java.lang.String r3 = "Cancelled"
            return r3
        L32:
            java.lang.String r3 = "Completed"
            return r3
    }

    private final void o0(kotlinx.coroutines.y1 r4, java.lang.Object r5) {
            r3 = this;
            kotlinx.coroutines.v r0 = r3.G0()
            if (r0 == 0) goto Le
            r0.dispose()
            kotlinx.coroutines.s2 r0 = kotlinx.coroutines.s2.a
            r3.k1(r0)
        Le:
            boolean r0 = r5 instanceof kotlinx.coroutines.d0
            r1 = 0
            if (r0 == 0) goto L16
            kotlinx.coroutines.d0 r5 = (kotlinx.coroutines.d0) r5
            goto L17
        L16:
            r5 = r1
        L17:
            if (r5 == 0) goto L1b
            java.lang.Throwable r1 = r5.a
        L1b:
            boolean r5 = r4 instanceof kotlinx.coroutines.k2
            if (r5 == 0) goto L49
            r5 = r4
            kotlinx.coroutines.k2 r5 = (kotlinx.coroutines.k2) r5     // Catch: java.lang.Throwable -> L26
            r5.z(r1)     // Catch: java.lang.Throwable -> L26
            return
        L26:
            r5 = move-exception
            kotlinx.coroutines.CompletionHandlerException r0 = new kotlinx.coroutines.CompletionHandlerException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Exception in completion handler "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = " for "
            r1.append(r4)
            r1.append(r3)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4, r5)
            r3.J0(r0)
            return
        L49:
            kotlinx.coroutines.q2 r4 = r4.a()
            if (r4 == 0) goto L52
            r3.Z0(r4, r1)
        L52:
            return
    }

    public static /* synthetic */ java.util.concurrent.CancellationException o1(kotlinx.coroutines.l2 r0, java.lang.Throwable r1, java.lang.String r2, int r3, java.lang.Object r4) {
            if (r4 != 0) goto Lc
            r3 = r3 & 1
            if (r3 == 0) goto L7
            r2 = 0
        L7:
            java.util.concurrent.CancellationException r0 = r0.n1(r1, r2)
            return r0
        Lc:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: toCancellationException"
            r0.<init>(r1)
            throw r0
    }

    private final void p0(kotlinx.coroutines.l2.c r1, kotlinx.coroutines.w r2, java.lang.Object r3) {
            r0 = this;
            kotlinx.coroutines.w r2 = r0.X0(r2)
            if (r2 == 0) goto Ld
            boolean r2 = r0.u1(r1, r2, r3)
            if (r2 == 0) goto Ld
            return
        Ld:
            java.lang.Object r1 = r0.t0(r1, r3)
            r0.e0(r1)
            return
    }

    private final java.lang.Throwable q0(java.lang.Object r3) {
            r2 = this;
            if (r3 != 0) goto L4
            r0 = 1
            goto L6
        L4:
            boolean r0 = r3 instanceof java.lang.Throwable
        L6:
            if (r0 == 0) goto L17
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            if (r3 != 0) goto L16
            kotlinx.coroutines.JobCancellationException r3 = new kotlinx.coroutines.JobCancellationException
            java.lang.String r0 = W(r2)
            r1 = 0
            r3.<init>(r0, r1, r2)
        L16:
            return r3
        L17:
            java.lang.String r0 = "null cannot be cast to non-null type kotlinx.coroutines.ParentJob"
            kotlin.jvm.internal.g0.n(r3, r0)
            kotlinx.coroutines.u2 r3 = (kotlinx.coroutines.u2) r3
            java.util.concurrent.CancellationException r3 = r3.K()
            return r3
    }

    private final boolean q1(kotlinx.coroutines.y1 r3, java.lang.Object r4) {
            r2 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.l2.a
            java.lang.Object r1 = kotlinx.coroutines.m2.g(r4)
            boolean r0 = androidx.concurrent.futures.a.a(r0, r2, r3, r1)
            if (r0 != 0) goto Le
            r3 = 0
            return r3
        Le:
            r0 = 0
            r2.d1(r0)
            r2.e1(r4)
            r2.o0(r3, r4)
            r3 = 1
            return r3
    }

    private final boolean r1(kotlinx.coroutines.y1 r5, java.lang.Throwable r6) {
            r4 = this;
            kotlinx.coroutines.q2 r0 = r4.F0(r5)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            kotlinx.coroutines.l2$c r2 = new kotlinx.coroutines.l2$c
            r2.<init>(r0, r1, r6)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = kotlinx.coroutines.l2.a
            boolean r5 = androidx.concurrent.futures.a.a(r3, r4, r5, r2)
            if (r5 != 0) goto L16
            return r1
        L16:
            r4.Y0(r0, r6)
            r5 = 1
            return r5
    }

    public static /* synthetic */ kotlinx.coroutines.JobCancellationException s0(kotlinx.coroutines.l2 r1, java.lang.String r2, java.lang.Throwable r3, int r4, java.lang.Object r5) {
            if (r5 != 0) goto L19
            r5 = r4 & 1
            r0 = 0
            if (r5 == 0) goto L8
            r2 = r0
        L8:
            r4 = r4 & 2
            if (r4 == 0) goto Ld
            r3 = r0
        Ld:
            kotlinx.coroutines.JobCancellationException r4 = new kotlinx.coroutines.JobCancellationException
            if (r2 != 0) goto L15
            java.lang.String r2 = W(r1)
        L15:
            r4.<init>(r2, r3, r1)
            return r4
        L19:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Super calls with default arguments not supported in this target, function: defaultCancellationException"
            r1.<init>(r2)
            throw r1
    }

    private final java.lang.Object s1(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            boolean r0 = r2 instanceof kotlinx.coroutines.y1
            if (r0 != 0) goto L9
            kotlinx.coroutines.internal.s0 r2 = kotlinx.coroutines.m2.a()
            return r2
        L9:
            boolean r0 = r2 instanceof kotlinx.coroutines.m1
            if (r0 != 0) goto L11
            boolean r0 = r2 instanceof kotlinx.coroutines.k2
            if (r0 == 0) goto L27
        L11:
            boolean r0 = r2 instanceof kotlinx.coroutines.w
            if (r0 != 0) goto L27
            boolean r0 = r3 instanceof kotlinx.coroutines.d0
            if (r0 != 0) goto L27
            kotlinx.coroutines.y1 r2 = (kotlinx.coroutines.y1) r2
            boolean r2 = r1.q1(r2, r3)
            if (r2 == 0) goto L22
            return r3
        L22:
            kotlinx.coroutines.internal.s0 r2 = kotlinx.coroutines.m2.b()
            return r2
        L27:
            kotlinx.coroutines.y1 r2 = (kotlinx.coroutines.y1) r2
            java.lang.Object r2 = r1.t1(r2, r3)
            return r2
    }

    private final java.lang.Object t0(kotlinx.coroutines.l2.c r6, java.lang.Object r7) {
            r5 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.d0
            r1 = 0
            if (r0 == 0) goto L9
            r0 = r7
            kotlinx.coroutines.d0 r0 = (kotlinx.coroutines.d0) r0
            goto La
        L9:
            r0 = r1
        La:
            if (r0 == 0) goto Lf
            java.lang.Throwable r0 = r0.a
            goto L10
        Lf:
            r0 = r1
        L10:
            monitor-enter(r6)
            boolean r2 = r6.f()     // Catch: java.lang.Throwable -> L23
            java.util.List r3 = r6.i(r0)     // Catch: java.lang.Throwable -> L23
            java.lang.Throwable r4 = r5.z0(r6, r3)     // Catch: java.lang.Throwable -> L23
            if (r4 == 0) goto L25
            r5.d0(r4, r3)     // Catch: java.lang.Throwable -> L23
            goto L25
        L23:
            r7 = move-exception
            goto L61
        L25:
            monitor-exit(r6)
            if (r4 != 0) goto L29
            goto L33
        L29:
            if (r4 != r0) goto L2c
            goto L33
        L2c:
            kotlinx.coroutines.d0 r7 = new kotlinx.coroutines.d0
            r0 = 0
            r3 = 2
            r7.<init>(r4, r0, r3, r1)
        L33:
            if (r4 == 0) goto L4c
            boolean r0 = r5.l0(r4)
            if (r0 != 0) goto L41
            boolean r0 = r5.I0(r4)
            if (r0 == 0) goto L4c
        L41:
            java.lang.String r0 = "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally"
            kotlin.jvm.internal.g0.n(r7, r0)
            r0 = r7
            kotlinx.coroutines.d0 r0 = (kotlinx.coroutines.d0) r0
            r0.b()
        L4c:
            if (r2 != 0) goto L51
            r5.d1(r4)
        L51:
            r5.e1(r7)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.l2.a
            java.lang.Object r1 = kotlinx.coroutines.m2.g(r7)
            androidx.concurrent.futures.a.a(r0, r5, r6, r1)
            r5.o0(r6, r7)
            return r7
        L61:
            monitor-exit(r6)
            throw r7
    }

    private final java.lang.Object t1(kotlinx.coroutines.y1 r7, java.lang.Object r8) {
            r6 = this;
            kotlinx.coroutines.q2 r0 = r6.F0(r7)
            if (r0 != 0) goto Lb
            kotlinx.coroutines.internal.s0 r7 = kotlinx.coroutines.m2.b()
            return r7
        Lb:
            boolean r1 = r7 instanceof kotlinx.coroutines.l2.c
            r2 = 0
            if (r1 == 0) goto L14
            r1 = r7
            kotlinx.coroutines.l2$c r1 = (kotlinx.coroutines.l2.c) r1
            goto L15
        L14:
            r1 = r2
        L15:
            if (r1 != 0) goto L1d
            kotlinx.coroutines.l2$c r1 = new kotlinx.coroutines.l2$c
            r3 = 0
            r1.<init>(r0, r3, r2)
        L1d:
            kotlin.jvm.internal.Ref$ObjectRef r3 = new kotlin.jvm.internal.Ref$ObjectRef
            r3.<init>()
            monitor-enter(r1)
            boolean r4 = r1.g()     // Catch: java.lang.Throwable -> L2f
            if (r4 == 0) goto L31
            kotlinx.coroutines.internal.s0 r7 = kotlinx.coroutines.m2.a()     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r1)
            return r7
        L2f:
            r7 = move-exception
            goto L7e
        L31:
            r4 = 1
            r1.j(r4)     // Catch: java.lang.Throwable -> L2f
            if (r1 == r7) goto L45
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = kotlinx.coroutines.l2.a     // Catch: java.lang.Throwable -> L2f
            boolean r4 = androidx.concurrent.futures.a.a(r4, r6, r7, r1)     // Catch: java.lang.Throwable -> L2f
            if (r4 != 0) goto L45
            kotlinx.coroutines.internal.s0 r7 = kotlinx.coroutines.m2.b()     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r1)
            return r7
        L45:
            boolean r4 = r1.f()     // Catch: java.lang.Throwable -> L2f
            boolean r5 = r8 instanceof kotlinx.coroutines.d0     // Catch: java.lang.Throwable -> L2f
            if (r5 == 0) goto L51
            r5 = r8
            kotlinx.coroutines.d0 r5 = (kotlinx.coroutines.d0) r5     // Catch: java.lang.Throwable -> L2f
            goto L52
        L51:
            r5 = r2
        L52:
            if (r5 == 0) goto L59
            java.lang.Throwable r5 = r5.a     // Catch: java.lang.Throwable -> L2f
            r1.b(r5)     // Catch: java.lang.Throwable -> L2f
        L59:
            java.lang.Throwable r5 = r1.e()     // Catch: java.lang.Throwable -> L2f
            if (r4 != 0) goto L60
            r2 = r5
        L60:
            r3.element = r2     // Catch: java.lang.Throwable -> L2f
            kotlin.n1 r3 = kotlin.n1.a     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r1)
            if (r2 == 0) goto L6a
            r6.Y0(r0, r2)
        L6a:
            kotlinx.coroutines.w r7 = r6.u0(r7)
            if (r7 == 0) goto L79
            boolean r7 = r6.u1(r1, r7, r8)
            if (r7 == 0) goto L79
            kotlinx.coroutines.internal.s0 r7 = kotlinx.coroutines.m2.b
            return r7
        L79:
            java.lang.Object r7 = r6.t0(r1, r8)
            return r7
        L7e:
            monitor-exit(r1)
            throw r7
    }

    private final kotlinx.coroutines.w u0(kotlinx.coroutines.y1 r3) {
            r2 = this;
            boolean r0 = r3 instanceof kotlinx.coroutines.w
            r1 = 0
            if (r0 == 0) goto L9
            r0 = r3
            kotlinx.coroutines.w r0 = (kotlinx.coroutines.w) r0
            goto La
        L9:
            r0 = r1
        La:
            if (r0 != 0) goto L18
            kotlinx.coroutines.q2 r3 = r3.a()
            if (r3 == 0) goto L17
            kotlinx.coroutines.w r3 = r2.X0(r3)
            return r3
        L17:
            return r1
        L18:
            return r0
    }

    private final boolean u1(kotlinx.coroutines.l2.c r7, kotlinx.coroutines.w r8, java.lang.Object r9) {
            r6 = this;
        L0:
            kotlinx.coroutines.x r0 = r8.e
            kotlinx.coroutines.l2$b r3 = new kotlinx.coroutines.l2$b
            r3.<init>(r6, r7, r8, r9)
            r4 = 1
            r5 = 0
            r1 = 0
            r2 = 0
            kotlinx.coroutines.j1 r0 = kotlinx.coroutines.e2.a.g(r0, r1, r2, r3, r4, r5)
            kotlinx.coroutines.s2 r1 = kotlinx.coroutines.s2.a
            if (r0 == r1) goto L15
            r7 = 1
            return r7
        L15:
            kotlinx.coroutines.w r8 = r6.X0(r8)
            if (r8 != 0) goto L0
            r7 = 0
            return r7
    }

    private final java.lang.Throwable y0(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof kotlinx.coroutines.d0
            r1 = 0
            if (r0 == 0) goto L8
            kotlinx.coroutines.d0 r3 = (kotlinx.coroutines.d0) r3
            goto L9
        L8:
            r3 = r1
        L9:
            if (r3 == 0) goto Le
            java.lang.Throwable r3 = r3.a
            return r3
        Le:
            return r1
    }

    private final java.lang.Throwable z0(kotlinx.coroutines.l2.c r5, java.util.List<? extends java.lang.Throwable> r6) {
            r4 = this;
            boolean r0 = r6.isEmpty()
            r1 = 0
            if (r0 == 0) goto L18
            boolean r5 = r5.f()
            if (r5 == 0) goto L17
            kotlinx.coroutines.JobCancellationException r5 = new kotlinx.coroutines.JobCancellationException
            java.lang.String r6 = W(r4)
            r5.<init>(r6, r1, r4)
            return r5
        L17:
            return r1
        L18:
            r5 = r6
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r0 = r5.iterator()
        L1f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L31
            java.lang.Object r2 = r0.next()
            r3 = r2
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            boolean r3 = r3 instanceof java.util.concurrent.CancellationException
            if (r3 != 0) goto L1f
            goto L32
        L31:
            r2 = r1
        L32:
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            if (r2 == 0) goto L37
            return r2
        L37:
            r0 = 0
            java.lang.Object r6 = r6.get(r0)
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            boolean r0 = r6 instanceof kotlinx.coroutines.TimeoutCancellationException
            if (r0 == 0) goto L5f
            java.util.Iterator r5 = r5.iterator()
        L46:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L5a
            java.lang.Object r0 = r5.next()
            r2 = r0
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            if (r2 == r6) goto L46
            boolean r2 = r2 instanceof kotlinx.coroutines.TimeoutCancellationException
            if (r2 == 0) goto L46
            r1 = r0
        L5a:
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            if (r1 == 0) goto L5f
            return r1
        L5f:
            return r6
    }

    @Override // kotlinx.coroutines.e2
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.v A(@org.jetbrains.annotations.NotNull kotlinx.coroutines.x r7) {
            r6 = this;
            kotlinx.coroutines.w r3 = new kotlinx.coroutines.w
            r3.<init>(r7)
            r4 = 2
            r5 = 0
            r1 = 1
            r2 = 0
            r0 = r6
            kotlinx.coroutines.j1 r7 = kotlinx.coroutines.e2.a.g(r0, r1, r2, r3, r4, r5)
            java.lang.String r0 = "null cannot be cast to non-null type kotlinx.coroutines.ChildHandle"
            kotlin.jvm.internal.g0.n(r7, r0)
            kotlinx.coroutines.v r7 = (kotlinx.coroutines.v) r7
            return r7
    }

    public boolean A0() {
            r1 = this;
            r0 = 1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    protected final kotlinx.coroutines.selects.g<?> B0() {
            r7 = this;
            kotlinx.coroutines.selects.h r0 = new kotlinx.coroutines.selects.h
            kotlinx.coroutines.l2$h r1 = kotlinx.coroutines.l2.h.a
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }"
            kotlin.jvm.internal.g0.n(r1, r2)
            r2 = 3
            java.lang.Object r1 = kotlin.jvm.internal.u0.q(r1, r2)
            kotlin.jvm.functions.Function3 r1 = (kotlin.jvm.functions.Function3) r1
            kotlinx.coroutines.l2$i r3 = kotlinx.coroutines.l2.i.a
            java.lang.String r4 = "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'param')] kotlin.Any?, @[ParameterName(name = 'clauseResult')] kotlin.Any?, kotlin.Any?>{ kotlinx.coroutines.selects.SelectKt.ProcessResultFunction }"
            kotlin.jvm.internal.g0.n(r3, r4)
            java.lang.Object r2 = kotlin.jvm.internal.u0.q(r3, r2)
            r3 = r2
            kotlin.jvm.functions.Function3 r3 = (kotlin.jvm.functions.Function3) r3
            r5 = 8
            r6 = 0
            r4 = 0
            r2 = r1
            r1 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r0
    }

    public boolean D0() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // kotlinx.coroutines.e2
    @org.jetbrains.annotations.NotNull
    public final kotlin.sequences.m<kotlinx.coroutines.e2> E() {
            r2 = this;
            kotlinx.coroutines.l2$g r0 = new kotlinx.coroutines.l2$g
            r1 = 0
            r0.<init>(r2, r1)
            kotlin.sequences.m r0 = kotlin.sequences.p.b(r0)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Throwable F() {
            r2 = this;
            java.lang.Object r0 = r2.H0()
            boolean r1 = r0 instanceof kotlinx.coroutines.y1
            if (r1 != 0) goto Ld
            java.lang.Throwable r0 = r2.y0(r0)
            return r0
        Ld:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "This job has not completed yet"
            r0.<init>(r1)
            throw r0
    }

    @Override // kotlinx.coroutines.e2
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.j1 G(boolean r7, boolean r8, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.n1> r9) {
            r6 = this;
            kotlinx.coroutines.k2 r0 = r6.V0(r9, r7)
        L4:
            java.lang.Object r1 = r6.H0()
            boolean r2 = r1 instanceof kotlinx.coroutines.m1
            if (r2 == 0) goto L22
            r2 = r1
            kotlinx.coroutines.m1 r2 = (kotlinx.coroutines.m1) r2
            boolean r3 = r2.isActive()
            if (r3 == 0) goto L1e
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = kotlinx.coroutines.l2.a
            boolean r1 = androidx.concurrent.futures.a.a(r2, r6, r1, r0)
            if (r1 == 0) goto L4
            goto L7e
        L1e:
            r6.g1(r2)
            goto L4
        L22:
            boolean r2 = r1 instanceof kotlinx.coroutines.y1
            r3 = 0
            if (r2 == 0) goto L7f
            r2 = r1
            kotlinx.coroutines.y1 r2 = (kotlinx.coroutines.y1) r2
            kotlinx.coroutines.q2 r2 = r2.a()
            if (r2 != 0) goto L3b
            java.lang.String r2 = "null cannot be cast to non-null type kotlinx.coroutines.JobNode"
            kotlin.jvm.internal.g0.n(r1, r2)
            kotlinx.coroutines.k2 r1 = (kotlinx.coroutines.k2) r1
            r6.h1(r1)
            goto L4
        L3b:
            kotlinx.coroutines.s2 r4 = kotlinx.coroutines.s2.a
            if (r7 == 0) goto L70
            boolean r5 = r1 instanceof kotlinx.coroutines.l2.c
            if (r5 == 0) goto L70
            monitor-enter(r1)
            r3 = r1
            kotlinx.coroutines.l2$c r3 = (kotlinx.coroutines.l2.c) r3     // Catch: java.lang.Throwable -> L5b
            java.lang.Throwable r3 = r3.e()     // Catch: java.lang.Throwable -> L5b
            if (r3 == 0) goto L5d
            boolean r5 = r9 instanceof kotlinx.coroutines.w     // Catch: java.lang.Throwable -> L5b
            if (r5 == 0) goto L6a
            r5 = r1
            kotlinx.coroutines.l2$c r5 = (kotlinx.coroutines.l2.c) r5     // Catch: java.lang.Throwable -> L5b
            boolean r5 = r5.g()     // Catch: java.lang.Throwable -> L5b
            if (r5 != 0) goto L6a
            goto L5d
        L5b:
            r7 = move-exception
            goto L6e
        L5d:
            boolean r4 = r6.c0(r1, r2, r0)     // Catch: java.lang.Throwable -> L5b
            if (r4 != 0) goto L65
            monitor-exit(r1)
            goto L4
        L65:
            if (r3 != 0) goto L69
            monitor-exit(r1)
            return r0
        L69:
            r4 = r0
        L6a:
            kotlin.n1 r5 = kotlin.n1.a     // Catch: java.lang.Throwable -> L5b
            monitor-exit(r1)
            goto L70
        L6e:
            monitor-exit(r1)
            throw r7
        L70:
            if (r3 == 0) goto L78
            if (r8 == 0) goto L77
            r9.invoke(r3)
        L77:
            return r4
        L78:
            boolean r1 = r6.c0(r1, r2, r0)
            if (r1 == 0) goto L4
        L7e:
            return r0
        L7f:
            if (r8 == 0) goto L90
            boolean r7 = r1 instanceof kotlinx.coroutines.d0
            if (r7 == 0) goto L88
            kotlinx.coroutines.d0 r1 = (kotlinx.coroutines.d0) r1
            goto L89
        L88:
            r1 = r3
        L89:
            if (r1 == 0) goto L8d
            java.lang.Throwable r3 = r1.a
        L8d:
            r9.invoke(r3)
        L90:
            kotlinx.coroutines.s2 r7 = kotlinx.coroutines.s2.a
            return r7
    }

    @org.jetbrains.annotations.Nullable
    public final kotlinx.coroutines.v G0() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.l2.b
            java.lang.Object r0 = r0.get(r1)
            kotlinx.coroutines.v r0 = (kotlinx.coroutines.v) r0
            return r0
    }

    @Override // kotlinx.coroutines.e2
    @org.jetbrains.annotations.NotNull
    public final java.util.concurrent.CancellationException H() {
            r4 = this;
            java.lang.Object r0 = r4.H0()
            boolean r1 = r0 instanceof kotlinx.coroutines.l2.c
            java.lang.String r2 = "Job is still new or active: "
            if (r1 == 0) goto L47
            kotlinx.coroutines.l2$c r0 = (kotlinx.coroutines.l2.c) r0
            java.lang.Throwable r0 = r0.e()
            if (r0 == 0) goto L2e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = kotlinx.coroutines.u0.a(r4)
            r1.append(r3)
            java.lang.String r3 = " is cancelling"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.util.concurrent.CancellationException r0 = r4.n1(r0, r1)
            if (r0 == 0) goto L2e
            return r0
        L2e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L47:
            boolean r1 = r0 instanceof kotlinx.coroutines.y1
            if (r1 != 0) goto L75
            boolean r1 = r0 instanceof kotlinx.coroutines.d0
            r2 = 0
            if (r1 == 0) goto L5a
            kotlinx.coroutines.d0 r0 = (kotlinx.coroutines.d0) r0
            java.lang.Throwable r0 = r0.a
            r1 = 1
            java.util.concurrent.CancellationException r0 = o1(r4, r0, r2, r1, r2)
            return r0
        L5a:
            kotlinx.coroutines.JobCancellationException r0 = new kotlinx.coroutines.JobCancellationException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = kotlinx.coroutines.u0.a(r4)
            r1.append(r3)
            java.lang.String r3 = " has completed normally"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1, r2, r4)
            return r0
        L75:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object H0() {
            r3 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.l2.a
        L2:
            java.lang.Object r1 = r0.get(r3)
            boolean r2 = r1 instanceof kotlinx.coroutines.internal.k0
            if (r2 != 0) goto Lb
            return r1
        Lb:
            kotlinx.coroutines.internal.k0 r1 = (kotlinx.coroutines.internal.k0) r1
            r1.b(r3)
            goto L2
    }

    protected boolean I0(@org.jetbrains.annotations.NotNull java.lang.Throwable r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    public void J0(@org.jetbrains.annotations.NotNull java.lang.Throwable r1) {
            r0 = this;
            throw r1
    }

    @Override // kotlinx.coroutines.u2
    @org.jetbrains.annotations.NotNull
    public java.util.concurrent.CancellationException K() {
            r5 = this;
            java.lang.Object r0 = r5.H0()
            boolean r1 = r0 instanceof kotlinx.coroutines.l2.c
            r2 = 0
            if (r1 == 0) goto L11
            r1 = r0
            kotlinx.coroutines.l2$c r1 = (kotlinx.coroutines.l2.c) r1
            java.lang.Throwable r1 = r1.e()
            goto L20
        L11:
            boolean r1 = r0 instanceof kotlinx.coroutines.d0
            if (r1 == 0) goto L1b
            r1 = r0
            kotlinx.coroutines.d0 r1 = (kotlinx.coroutines.d0) r1
            java.lang.Throwable r1 = r1.a
            goto L20
        L1b:
            boolean r1 = r0 instanceof kotlinx.coroutines.y1
            if (r1 != 0) goto L44
            r1 = r2
        L20:
            boolean r3 = r1 instanceof java.util.concurrent.CancellationException
            if (r3 == 0) goto L27
            r2 = r1
            java.util.concurrent.CancellationException r2 = (java.util.concurrent.CancellationException) r2
        L27:
            if (r2 != 0) goto L43
            kotlinx.coroutines.JobCancellationException r2 = new kotlinx.coroutines.JobCancellationException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Parent job is "
            r3.append(r4)
            java.lang.String r0 = r5.m1(r0)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0, r1, r5)
        L43:
            return r2
        L44:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Cannot be cancelling child in this state: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    protected final void K0(@org.jetbrains.annotations.Nullable kotlinx.coroutines.e2 r2) {
            r1 = this;
            if (r2 != 0) goto L8
            kotlinx.coroutines.s2 r2 = kotlinx.coroutines.s2.a
            r1.k1(r2)
            return
        L8:
            r2.start()
            kotlinx.coroutines.v r2 = r2.A(r1)
            r1.k1(r2)
            boolean r0 = r1.isCompleted()
            if (r0 == 0) goto L20
            r2.dispose()
            kotlinx.coroutines.s2 r2 = kotlinx.coroutines.s2.a
            r1.k1(r2)
        L20:
            return
    }

    @Override // kotlinx.coroutines.e2
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object M(@org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r2) {
            r1 = this;
            boolean r0 = r1.O0()
            if (r0 != 0) goto L10
            kotlin.coroutines.i r2 = r2.getContext()
            kotlinx.coroutines.h2.z(r2)
            kotlin.n1 r2 = kotlin.n1.a
            return r2
        L10:
            java.lang.Object r2 = r1.P0(r2)
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
            if (r2 != r0) goto L1b
            return r2
        L1b:
            kotlin.n1 r2 = kotlin.n1.a
            return r2
    }

    public final boolean M0() {
            r1 = this;
            java.lang.Object r0 = r1.H0()
            boolean r0 = r0 instanceof kotlinx.coroutines.d0
            return r0
    }

    protected boolean N0() {
            r1 = this;
            r0 = 0
            return r0
    }

    public final boolean T0(@org.jetbrains.annotations.Nullable java.lang.Object r4) {
            r3 = this;
        L0:
            java.lang.Object r0 = r3.H0()
            java.lang.Object r0 = r3.s1(r0, r4)
            kotlinx.coroutines.internal.s0 r1 = kotlinx.coroutines.m2.a()
            if (r0 != r1) goto L10
            r4 = 0
            return r4
        L10:
            kotlinx.coroutines.internal.s0 r1 = kotlinx.coroutines.m2.b
            r2 = 1
            if (r0 != r1) goto L16
            return r2
        L16:
            kotlinx.coroutines.internal.s0 r1 = kotlinx.coroutines.m2.b()
            if (r0 == r1) goto L0
            r3.e0(r0)
            return r2
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object U0(@org.jetbrains.annotations.Nullable java.lang.Object r4) {
            r3 = this;
        L0:
            java.lang.Object r0 = r3.H0()
            java.lang.Object r0 = r3.s1(r0, r4)
            kotlinx.coroutines.internal.s0 r1 = kotlinx.coroutines.m2.a()
            if (r0 == r1) goto L15
            kotlinx.coroutines.internal.s0 r1 = kotlinx.coroutines.m2.b()
            if (r0 == r1) goto L0
            return r0
        L15:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Job "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r2 = " is already complete or completing, but is being completed with "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            java.lang.Throwable r4 = r3.y0(r4)
            r0.<init>(r1, r4)
            throw r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String W0() {
            r1 = this;
            java.lang.String r0 = kotlinx.coroutines.u0.a(r1)
            return r0
    }

    @Override // kotlinx.coroutines.e2, kotlinx.coroutines.channels.d
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Added since 1.2.0 for binary compatibility with versions <= 1.1.x")
    public /* synthetic */ boolean a(java.lang.Throwable r4) {
            r3 = this;
            r0 = 1
            r1 = 0
            if (r4 == 0) goto La
            java.util.concurrent.CancellationException r4 = o1(r3, r4, r1, r0, r1)
            if (r4 != 0) goto L13
        La:
            kotlinx.coroutines.JobCancellationException r4 = new kotlinx.coroutines.JobCancellationException
            java.lang.String r2 = W(r3)
            r4.<init>(r2, r1, r3)
        L13:
            r3.j0(r4)
            return r0
    }

    @Override // kotlinx.coroutines.e2, kotlinx.coroutines.channels.d
    public void b(@org.jetbrains.annotations.Nullable java.util.concurrent.CancellationException r3) {
            r2 = this;
            if (r3 != 0) goto Lc
            kotlinx.coroutines.JobCancellationException r3 = new kotlinx.coroutines.JobCancellationException
            java.lang.String r0 = W(r2)
            r1 = 0
            r3.<init>(r0, r1, r2)
        Lc:
            r2.j0(r3)
            return
    }

    @Override // kotlinx.coroutines.e2, kotlinx.coroutines.channels.b0
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public /* synthetic */ void cancel() {
            r0 = this;
            kotlinx.coroutines.e2.a.a(r0)
            return
    }

    protected void d1(@org.jetbrains.annotations.Nullable java.lang.Throwable r1) {
            r0 = this;
            return
    }

    protected void e0(@org.jetbrains.annotations.Nullable java.lang.Object r1) {
            r0 = this;
            return
    }

    protected void e1(@org.jetbrains.annotations.Nullable java.lang.Object r1) {
            r0 = this;
            return
    }

    @org.jetbrains.annotations.Nullable
    protected final java.lang.Object f0(@org.jetbrains.annotations.NotNull kotlin.coroutines.e<java.lang.Object> r3) {
            r2 = this;
        L0:
            java.lang.Object r0 = r2.H0()
            boolean r1 = r0 instanceof kotlinx.coroutines.y1
            if (r1 != 0) goto L16
            boolean r3 = r0 instanceof kotlinx.coroutines.d0
            if (r3 != 0) goto L11
            java.lang.Object r3 = kotlinx.coroutines.m2.h(r0)
            return r3
        L11:
            kotlinx.coroutines.d0 r0 = (kotlinx.coroutines.d0) r0
            java.lang.Throwable r3 = r0.a
            throw r3
        L16:
            int r0 = r2.l1(r0)
            if (r0 < 0) goto L0
            java.lang.Object r3 = r2.g0(r3)
            return r3
    }

    protected void f1() {
            r0 = this;
            return
    }

    @Override // kotlin.coroutines.i.b, kotlin.coroutines.i
    public <R> R fold(R r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.i.b, ? extends R> r2) {
            r0 = this;
            java.lang.Object r1 = kotlinx.coroutines.e2.a.d(r0, r1, r2)
            return r1
    }

    @Override // kotlinx.coroutines.x
    public final void g(@org.jetbrains.annotations.NotNull kotlinx.coroutines.u2 r1) {
            r0 = this;
            r0.i0(r1)
            return
    }

    @Override // kotlin.coroutines.i.b, kotlin.coroutines.i
    @org.jetbrains.annotations.Nullable
    public <E extends kotlin.coroutines.i.b> E get(@org.jetbrains.annotations.NotNull kotlin.coroutines.i.c<E> r1) {
            r0 = this;
            kotlin.coroutines.i$b r1 = kotlinx.coroutines.e2.a.e(r0, r1)
            return r1
    }

    @Override // kotlin.coroutines.i.b
    @org.jetbrains.annotations.NotNull
    public final kotlin.coroutines.i.c<?> getKey() {
            r1 = this;
            kotlinx.coroutines.e2$b r0 = kotlinx.coroutines.e2.s0
            return r0
    }

    @Override // kotlinx.coroutines.e2
    @org.jetbrains.annotations.Nullable
    public kotlinx.coroutines.e2 getParent() {
            r1 = this;
            kotlinx.coroutines.v r0 = r1.G0()
            if (r0 == 0) goto Lb
            kotlinx.coroutines.e2 r0 = r0.getParent()
            return r0
        Lb:
            r0 = 0
            return r0
    }

    public final boolean h0(@org.jetbrains.annotations.Nullable java.lang.Throwable r1) {
            r0 = this;
            boolean r1 = r0.i0(r1)
            return r1
    }

    public final boolean i0(@org.jetbrains.annotations.Nullable java.lang.Object r4) {
            r3 = this;
            kotlinx.coroutines.internal.s0 r0 = kotlinx.coroutines.m2.a()
            boolean r1 = r3.D0()
            r2 = 1
            if (r1 == 0) goto L14
            java.lang.Object r0 = r3.k0(r4)
            kotlinx.coroutines.internal.s0 r1 = kotlinx.coroutines.m2.b
            if (r0 != r1) goto L14
            return r2
        L14:
            kotlinx.coroutines.internal.s0 r1 = kotlinx.coroutines.m2.a()
            if (r0 != r1) goto L1e
            java.lang.Object r0 = r3.S0(r4)
        L1e:
            kotlinx.coroutines.internal.s0 r4 = kotlinx.coroutines.m2.a()
            if (r0 != r4) goto L25
            return r2
        L25:
            kotlinx.coroutines.internal.s0 r4 = kotlinx.coroutines.m2.b
            if (r0 != r4) goto L2a
            return r2
        L2a:
            kotlinx.coroutines.internal.s0 r4 = kotlinx.coroutines.m2.f()
            if (r0 != r4) goto L32
            r4 = 0
            return r4
        L32:
            r3.e0(r0)
            return r2
    }

    @Override // kotlinx.coroutines.e2
    public boolean isActive() {
            r2 = this;
            java.lang.Object r0 = r2.H0()
            boolean r1 = r0 instanceof kotlinx.coroutines.y1
            if (r1 == 0) goto L12
            kotlinx.coroutines.y1 r0 = (kotlinx.coroutines.y1) r0
            boolean r0 = r0.isActive()
            if (r0 == 0) goto L12
            r0 = 1
            return r0
        L12:
            r0 = 0
            return r0
    }

    @Override // kotlinx.coroutines.e2
    public final boolean isCancelled() {
            r2 = this;
            java.lang.Object r0 = r2.H0()
            boolean r1 = r0 instanceof kotlinx.coroutines.d0
            if (r1 != 0) goto L17
            boolean r1 = r0 instanceof kotlinx.coroutines.l2.c
            if (r1 == 0) goto L15
            kotlinx.coroutines.l2$c r0 = (kotlinx.coroutines.l2.c) r0
            boolean r0 = r0.f()
            if (r0 == 0) goto L15
            goto L17
        L15:
            r0 = 0
            return r0
        L17:
            r0 = 1
            return r0
    }

    @Override // kotlinx.coroutines.e2
    public final boolean isCompleted() {
            r1 = this;
            java.lang.Object r0 = r1.H0()
            boolean r0 = r0 instanceof kotlinx.coroutines.y1
            r0 = r0 ^ 1
            return r0
    }

    @Override // kotlinx.coroutines.e2
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.e2 j(@org.jetbrains.annotations.NotNull kotlinx.coroutines.e2 r1) {
            r0 = this;
            kotlinx.coroutines.e2 r1 = kotlinx.coroutines.e2.a.j(r0, r1)
            return r1
    }

    public void j0(@org.jetbrains.annotations.NotNull java.lang.Throwable r1) {
            r0 = this;
            r0.i0(r1)
            return
    }

    public final void j1(@org.jetbrains.annotations.NotNull kotlinx.coroutines.k2 r4) {
            r3 = this;
        L0:
            java.lang.Object r0 = r3.H0()
            boolean r1 = r0 instanceof kotlinx.coroutines.k2
            if (r1 == 0) goto L18
            if (r0 == r4) goto Lb
            goto L27
        Lb:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.l2.a
            kotlinx.coroutines.m1 r2 = kotlinx.coroutines.m2.c()
            boolean r0 = androidx.concurrent.futures.a.a(r1, r3, r0, r2)
            if (r0 == 0) goto L0
            goto L27
        L18:
            boolean r1 = r0 instanceof kotlinx.coroutines.y1
            if (r1 == 0) goto L27
            kotlinx.coroutines.y1 r0 = (kotlinx.coroutines.y1) r0
            kotlinx.coroutines.q2 r0 = r0.a()
            if (r0 == 0) goto L27
            r4.u()
        L27:
            return
    }

    @Override // kotlinx.coroutines.e2
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.j1 k(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.n1> r3) {
            r2 = this;
            r0 = 0
            r1 = 1
            kotlinx.coroutines.j1 r3 = r2.G(r0, r1, r3)
            return r3
    }

    public final void k1(@org.jetbrains.annotations.Nullable kotlinx.coroutines.v r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.l2.b
            r0.set(r1, r2)
            return
    }

    @org.jetbrains.annotations.NotNull
    protected java.lang.String m0() {
            r1 = this;
            java.lang.String r0 = "Job was cancelled"
            return r0
    }

    @Override // kotlin.coroutines.i.b, kotlin.coroutines.i
    @org.jetbrains.annotations.NotNull
    public kotlin.coroutines.i minusKey(@org.jetbrains.annotations.NotNull kotlin.coroutines.i.c<?> r1) {
            r0 = this;
            kotlin.coroutines.i r1 = kotlinx.coroutines.e2.a.h(r0, r1)
            return r1
    }

    public boolean n0(@org.jetbrains.annotations.NotNull java.lang.Throwable r3) {
            r2 = this;
            boolean r0 = r3 instanceof java.util.concurrent.CancellationException
            r1 = 1
            if (r0 == 0) goto L6
            return r1
        L6:
            boolean r3 = r2.i0(r3)
            if (r3 == 0) goto L13
            boolean r3 = r2.A0()
            if (r3 == 0) goto L13
            return r1
        L13:
            r3 = 0
            return r3
    }

    @org.jetbrains.annotations.NotNull
    protected final java.util.concurrent.CancellationException n1(@org.jetbrains.annotations.NotNull java.lang.Throwable r2, @org.jetbrains.annotations.Nullable java.lang.String r3) {
            r1 = this;
            boolean r0 = r2 instanceof java.util.concurrent.CancellationException
            if (r0 == 0) goto L8
            r0 = r2
            java.util.concurrent.CancellationException r0 = (java.util.concurrent.CancellationException) r0
            goto L9
        L8:
            r0 = 0
        L9:
            if (r0 != 0) goto L16
            kotlinx.coroutines.JobCancellationException r0 = new kotlinx.coroutines.JobCancellationException
            if (r3 != 0) goto L13
            java.lang.String r3 = W(r1)
        L13:
            r0.<init>(r3, r2, r1)
        L16:
            return r0
    }

    @kotlinx.coroutines.InternalCoroutinesApi
    @org.jetbrains.annotations.NotNull
    public final java.lang.String p1() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.W0()
            r0.append(r1)
            r1 = 123(0x7b, float:1.72E-43)
            r0.append(r1)
            java.lang.Object r1 = r2.H0()
            java.lang.String r1 = r2.m1(r1)
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // kotlin.coroutines.i
    @org.jetbrains.annotations.NotNull
    public kotlin.coroutines.i plus(@org.jetbrains.annotations.NotNull kotlin.coroutines.i r1) {
            r0 = this;
            kotlin.coroutines.i r1 = kotlinx.coroutines.e2.a.i(r0, r1)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.JobCancellationException r0(@org.jetbrains.annotations.Nullable java.lang.String r2, @org.jetbrains.annotations.Nullable java.lang.Throwable r3) {
            r1 = this;
            kotlinx.coroutines.JobCancellationException r0 = new kotlinx.coroutines.JobCancellationException
            if (r2 != 0) goto L8
            java.lang.String r2 = W(r1)
        L8:
            r0.<init>(r2, r3, r1)
            return r0
    }

    @Override // kotlinx.coroutines.e2
    public final boolean start() {
            r2 = this;
        L0:
            java.lang.Object r0 = r2.H0()
            int r0 = r2.l1(r0)
            if (r0 == 0) goto Lf
            r1 = 1
            if (r0 == r1) goto Le
            goto L0
        Le:
            return r1
        Lf:
            r0 = 0
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.p1()
            r0.append(r1)
            r1 = 64
            r0.append(r1)
            java.lang.String r1 = kotlinx.coroutines.u0.b(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object v0() {
            r2 = this;
            java.lang.Object r0 = r2.H0()
            boolean r1 = r0 instanceof kotlinx.coroutines.y1
            if (r1 != 0) goto L16
            boolean r1 = r0 instanceof kotlinx.coroutines.d0
            if (r1 != 0) goto L11
            java.lang.Object r0 = kotlinx.coroutines.m2.h(r0)
            return r0
        L11:
            kotlinx.coroutines.d0 r0 = (kotlinx.coroutines.d0) r0
            java.lang.Throwable r0 = r0.a
            throw r0
        L16:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "This job has not completed yet"
            r0.<init>(r1)
            throw r0
    }

    @org.jetbrains.annotations.Nullable
    protected final java.lang.Throwable w0() {
            r3 = this;
            java.lang.Object r0 = r3.H0()
            boolean r1 = r0 instanceof kotlinx.coroutines.l2.c
            java.lang.String r2 = "Job is still new or active: "
            if (r1 == 0) goto L2c
            kotlinx.coroutines.l2$c r0 = (kotlinx.coroutines.l2.c) r0
            java.lang.Throwable r0 = r0.e()
            if (r0 == 0) goto L13
            return r0
        L13:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L2c:
            boolean r1 = r0 instanceof kotlinx.coroutines.y1
            if (r1 != 0) goto L3b
            boolean r1 = r0 instanceof kotlinx.coroutines.d0
            if (r1 == 0) goto L39
            kotlinx.coroutines.d0 r0 = (kotlinx.coroutines.d0) r0
            java.lang.Throwable r0 = r0.a
            return r0
        L39:
            r0 = 0
            return r0
        L3b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    protected final boolean x0() {
            r2 = this;
            java.lang.Object r0 = r2.H0()
            boolean r1 = r0 instanceof kotlinx.coroutines.d0
            if (r1 == 0) goto L12
            kotlinx.coroutines.d0 r0 = (kotlinx.coroutines.d0) r0
            boolean r0 = r0.a()
            if (r0 == 0) goto L12
            r0 = 1
            return r0
        L12:
            r0 = 0
            return r0
    }

    @Override // kotlinx.coroutines.e2
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.selects.e y() {
            r6 = this;
            kotlinx.coroutines.selects.f r0 = new kotlinx.coroutines.selects.f
            kotlinx.coroutines.l2$j r1 = kotlinx.coroutines.l2.j.a
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }"
            kotlin.jvm.internal.g0.n(r1, r2)
            r2 = 3
            java.lang.Object r1 = kotlin.jvm.internal.u0.q(r1, r2)
            r2 = r1
            kotlin.jvm.functions.Function3 r2 = (kotlin.jvm.functions.Function3) r2
            r4 = 4
            r5 = 0
            r3 = 0
            r1 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }
}
