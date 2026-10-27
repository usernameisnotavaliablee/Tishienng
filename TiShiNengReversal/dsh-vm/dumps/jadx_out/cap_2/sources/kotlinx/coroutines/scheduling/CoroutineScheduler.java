package kotlinx.coroutines.scheduling;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nCoroutineScheduler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineScheduler.kt\nkotlinx/coroutines/scheduling/CoroutineScheduler\n+ 2 Tasks.kt\nkotlinx/coroutines/scheduling/TasksKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 5 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 6 Tasks.kt\nkotlinx/coroutines/scheduling/Task\n+ 7 CoroutineScheduler.kt\nkotlinx/coroutines/scheduling/CoroutineScheduler$Worker\n*L\n1#1,1033:1\n285#1:1036\n283#1:1037\n283#1:1038\n285#1:1039\n280#1:1045\n281#1,5:1046\n291#1:1052\n283#1:1053\n284#1:1054\n283#1:1060\n284#1:1061\n280#1:1062\n288#1:1063\n283#1:1064\n283#1:1067\n284#1:1068\n285#1:1069\n93#2:1034\n93#2:1051\n1#3:1035\n28#4,4:1040\n28#4,4:1055\n20#5:1044\n20#5:1059\n90#6:1065\n610#7:1066\n*S KotlinDebug\n*F\n+ 1 CoroutineScheduler.kt\nkotlinx/coroutines/scheduling/CoroutineScheduler\n*L\n281#1:1036\n288#1:1037\n289#1:1038\n298#1:1039\n347#1:1045\n375#1:1046,5\n398#1:1052\n445#1:1053\n446#1:1054\n482#1:1060\n483#1:1061\n489#1:1062\n498#1:1063\n498#1:1064\n576#1:1067\n577#1:1068\n578#1:1069\n119#1:1034\n395#1:1051\n347#1:1040,4\n478#1:1055,4\n347#1:1044\n478#1:1059\n515#1:1065\n522#1:1066\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class CoroutineScheduler implements java.util.concurrent.Executor, java.io.Closeable {

    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.scheduling.CoroutineScheduler.a h = null;

    @org.jetbrains.annotations.NotNull
    private static final java.util.concurrent.atomic.AtomicLongFieldUpdater i = null;

    @org.jetbrains.annotations.NotNull
    private static final java.util.concurrent.atomic.AtomicLongFieldUpdater j = null;

    @org.jetbrains.annotations.NotNull
    private static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater k = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.internal.s0 l = null;
    private static final int m = -1;
    private static final int n = 0;
    private static final int o = 1;
    private static final int p = 21;
    private static final long q = 2097151;
    private static final long r = 4398044413952L;
    private static final int s = 42;
    private static final long t = 9223367638808264704L;
    public static final int u = 1;
    public static final int v = 2097150;
    private static final long w = 2097151;
    private static final long x = -2097152;
    private static final long y = 2097152;

    @kotlin.jvm.Volatile
    private volatile int _isTerminated;

    @kotlin.jvm.JvmField
    public final int a;

    @kotlin.jvm.JvmField
    public final int b;

    @kotlin.jvm.JvmField
    public final long c;

    @kotlin.jvm.Volatile
    private volatile long controlState;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public final java.lang.String d;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.scheduling.e e;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.scheduling.e f;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.internal.n0<kotlinx.coroutines.scheduling.CoroutineScheduler.c> g;

    @kotlin.jvm.Volatile
    private volatile long parkedWorkersStack;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum WorkerState extends java.lang.Enum<kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState> {
        private static final /* synthetic */ kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState[] $VALUES = null;
        public static final kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState BLOCKING = null;
        public static final kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState CPU_ACQUIRED = null;
        public static final kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState DORMANT = null;
        public static final kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState PARKING = null;
        public static final kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState TERMINATED = null;

        private static final /* synthetic */ kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState[] $values() {
                r0 = 5
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState[] r0 = new kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState[r0]
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.CPU_ACQUIRED
                r2 = 0
                r0[r2] = r1
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.BLOCKING
                r2 = 1
                r0[r2] = r1
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.PARKING
                r2 = 2
                r0[r2] = r1
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.DORMANT
                r2 = 3
                r0[r2] = r1
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.TERMINATED
                r2 = 4
                r0[r2] = r1
                return r0
        }

        static {
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r0 = new kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState
                java.lang.String r1 = "CPU_ACQUIRED"
                r2 = 0
                r0.<init>(r1, r2)
                kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.CPU_ACQUIRED = r0
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r0 = new kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState
                java.lang.String r1 = "BLOCKING"
                r2 = 1
                r0.<init>(r1, r2)
                kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.BLOCKING = r0
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r0 = new kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState
                java.lang.String r1 = "PARKING"
                r2 = 2
                r0.<init>(r1, r2)
                kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.PARKING = r0
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r0 = new kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState
                java.lang.String r1 = "DORMANT"
                r2 = 3
                r0.<init>(r1, r2)
                kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.DORMANT = r0
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r0 = new kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState
                java.lang.String r1 = "TERMINATED"
                r2 = 4
                r0.<init>(r1, r2)
                kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.TERMINATED = r0
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState[] r0 = $values()
                kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.$VALUES = r0
                return
        }

        WorkerState(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState valueOf(java.lang.String r1) {
                java.lang.Class<kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState> r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = (kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState) r1
                return r1
        }

        public static kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState[] values() {
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState[] r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.$VALUES
                java.lang.Object r0 = r0.clone()
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState[] r0 = (kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState[]) r0
                return r0
        }
    }

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
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a = null;

        static {
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState[] r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.PARKING     // Catch: java.lang.NoSuchFieldError -> L10
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L10
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L10
            L10:
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.BLOCKING     // Catch: java.lang.NoSuchFieldError -> L19
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L19
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L19
            L19:
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.CPU_ACQUIRED     // Catch: java.lang.NoSuchFieldError -> L22
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L22
            L22:
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.DORMANT     // Catch: java.lang.NoSuchFieldError -> L2b
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2b
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2b
            L2b:
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.TERMINATED     // Catch: java.lang.NoSuchFieldError -> L34
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L34
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L34
            L34:
                kotlinx.coroutines.scheduling.CoroutineScheduler.b.a = r0
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nCoroutineScheduler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineScheduler.kt\nkotlinx/coroutines/scheduling/CoroutineScheduler$Worker\n+ 2 CoroutineScheduler.kt\nkotlinx/coroutines/scheduling/CoroutineScheduler\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Tasks.kt\nkotlinx/coroutines/scheduling/Task\n+ 5 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 6 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n*L\n1#1,1033:1\n298#2:1034\n285#2:1035\n299#2,4:1036\n304#2:1040\n294#2,2:1041\n294#2,2:1045\n280#2:1052\n289#2:1053\n283#2:1054\n280#2:1055\n1#3:1043\n90#4:1044\n28#5,4:1047\n20#6:1051\n*S KotlinDebug\n*F\n+ 1 CoroutineScheduler.kt\nkotlinx/coroutines/scheduling/CoroutineScheduler$Worker\n*L\n665#1:1034\n665#1:1035\n665#1:1036,4\n679#1:1040\n753#1:1041,2\n807#1:1045,2\n855#1:1052\n881#1:1053\n881#1:1054\n963#1:1055\n790#1:1044\n851#1:1047,4\n851#1:1051\n*E\n"})
    public final class c extends java.lang.Thread {

        @org.jetbrains.annotations.NotNull
        private static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater i = null;

        @kotlin.jvm.JvmField
        @org.jetbrains.annotations.NotNull
        public final kotlinx.coroutines.scheduling.p a;

        @org.jetbrains.annotations.NotNull
        private final kotlin.jvm.internal.Ref.ObjectRef<kotlinx.coroutines.scheduling.j> b;

        @kotlin.jvm.JvmField
        @org.jetbrains.annotations.NotNull
        public kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState c;
        private long d;
        private long e;
        private int f;

        @kotlin.jvm.JvmField
        public boolean g;
        final /* synthetic */ kotlinx.coroutines.scheduling.CoroutineScheduler h;
        private volatile int indexInArray;

        @org.jetbrains.annotations.Nullable
        private volatile java.lang.Object nextParkedWorker;

        @kotlin.jvm.Volatile
        private volatile int workerCtl;

        static {
                java.lang.Class<kotlinx.coroutines.scheduling.CoroutineScheduler$c> r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.c.class
                java.lang.String r1 = "workerCtl"
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
                kotlinx.coroutines.scheduling.CoroutineScheduler.c.i = r0
                return
        }

        private c(kotlinx.coroutines.scheduling.CoroutineScheduler r1) {
                r0 = this;
                r0.h = r1
                r0.<init>()
                r1 = 1
                r0.setDaemon(r1)
                kotlinx.coroutines.scheduling.p r1 = new kotlinx.coroutines.scheduling.p
                r1.<init>()
                r0.a = r1
                kotlin.jvm.internal.Ref$ObjectRef r1 = new kotlin.jvm.internal.Ref$ObjectRef
                r1.<init>()
                r0.b = r1
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.DORMANT
                r0.c = r1
                kotlinx.coroutines.internal.s0 r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.l
                r0.nextParkedWorker = r1
                kotlin.random.Random$Default r1 = kotlin.random.Random.Default
                int r1 = r1.nextInt()
                r0.f = r1
                return
        }

        public c(kotlinx.coroutines.scheduling.CoroutineScheduler r1, int r2) {
                r0 = this;
                r0.<init>(r1)
                r0.v(r2)
                return
        }

        private final kotlinx.coroutines.scheduling.j A(int r19) {
                r18 = this;
                r0 = r18
                kotlinx.coroutines.scheduling.CoroutineScheduler r1 = r0.h
                java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = kotlinx.coroutines.scheduling.CoroutineScheduler.a()
                long r1 = r2.get(r1)
                r3 = 2097151(0x1fffff, double:1.0361303E-317)
                long r1 = r1 & r3
                int r2 = (int) r1
                r1 = 2
                r3 = 0
                if (r2 >= r1) goto L16
                return r3
            L16:
                int r1 = r0.q(r2)
                kotlinx.coroutines.scheduling.CoroutineScheduler r4 = r0.h
                r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r7 = 0
                r8 = r5
            L23:
                r10 = 0
                if (r7 >= r2) goto L5f
                r12 = 1
                int r1 = r1 + r12
                if (r1 <= r2) goto L2c
                r1 = 1
            L2c:
                kotlinx.coroutines.internal.n0<kotlinx.coroutines.scheduling.CoroutineScheduler$c> r12 = r4.g
                java.lang.Object r12 = r12.b(r1)
                kotlinx.coroutines.scheduling.CoroutineScheduler$c r12 = (kotlinx.coroutines.scheduling.CoroutineScheduler.c) r12
                if (r12 == 0) goto L5a
                if (r12 == r0) goto L5a
                kotlinx.coroutines.scheduling.p r12 = r12.a
                kotlin.jvm.internal.Ref$ObjectRef<kotlinx.coroutines.scheduling.j> r13 = r0.b
                r14 = r19
                long r12 = r12.p(r14, r13)
                r15 = -1
                int r17 = (r12 > r15 ? 1 : (r12 == r15 ? 0 : -1))
                if (r17 != 0) goto L51
                kotlin.jvm.internal.Ref$ObjectRef<kotlinx.coroutines.scheduling.j> r1 = r0.b
                T r2 = r1.element
                kotlinx.coroutines.scheduling.j r2 = (kotlinx.coroutines.scheduling.j) r2
                r1.element = r3
                return r2
            L51:
                int r15 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
                if (r15 <= 0) goto L5c
                long r8 = java.lang.Math.min(r8, r12)
                goto L5c
            L5a:
                r14 = r19
            L5c:
                int r7 = r7 + 1
                goto L23
            L5f:
                int r1 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
                if (r1 == 0) goto L64
                goto L65
            L64:
                r8 = r10
            L65:
                r0.e = r8
                return r3
        }

        private final void B() {
                r8 = this;
                kotlinx.coroutines.scheduling.CoroutineScheduler r0 = r8.h
                kotlinx.coroutines.internal.n0<kotlinx.coroutines.scheduling.CoroutineScheduler$c> r1 = r0.g
                monitor-enter(r1)
                boolean r2 = r0.isTerminated()     // Catch: java.lang.Throwable -> L58
                if (r2 == 0) goto Ld
                monitor-exit(r1)
                return
            Ld:
                java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = kotlinx.coroutines.scheduling.CoroutineScheduler.a()     // Catch: java.lang.Throwable -> L58
                long r2 = r2.get(r0)     // Catch: java.lang.Throwable -> L58
                r4 = 2097151(0x1fffff, double:1.0361303E-317)
                long r2 = r2 & r4
                int r3 = (int) r2     // Catch: java.lang.Throwable -> L58
                int r2 = r0.a     // Catch: java.lang.Throwable -> L58
                if (r3 > r2) goto L20
                monitor-exit(r1)
                return
            L20:
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = kotlinx.coroutines.scheduling.CoroutineScheduler.c.i     // Catch: java.lang.Throwable -> L58
                r3 = -1
                r6 = 1
                boolean r2 = r2.compareAndSet(r8, r3, r6)     // Catch: java.lang.Throwable -> L58
                if (r2 != 0) goto L2c
                monitor-exit(r1)
                return
            L2c:
                int r2 = r8.indexInArray     // Catch: java.lang.Throwable -> L58
                r3 = 0
                r8.v(r3)     // Catch: java.lang.Throwable -> L58
                r0.x(r8, r2, r3)     // Catch: java.lang.Throwable -> L58
                java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = kotlinx.coroutines.scheduling.CoroutineScheduler.a()     // Catch: java.lang.Throwable -> L58
                long r6 = r3.getAndDecrement(r0)     // Catch: java.lang.Throwable -> L58
                long r4 = r4 & r6
                int r3 = (int) r4     // Catch: java.lang.Throwable -> L58
                if (r3 == r2) goto L5a
                kotlinx.coroutines.internal.n0<kotlinx.coroutines.scheduling.CoroutineScheduler$c> r4 = r0.g     // Catch: java.lang.Throwable -> L58
                java.lang.Object r4 = r4.b(r3)     // Catch: java.lang.Throwable -> L58
                kotlin.jvm.internal.g0.m(r4)     // Catch: java.lang.Throwable -> L58
                kotlinx.coroutines.scheduling.CoroutineScheduler$c r4 = (kotlinx.coroutines.scheduling.CoroutineScheduler.c) r4     // Catch: java.lang.Throwable -> L58
                kotlinx.coroutines.internal.n0<kotlinx.coroutines.scheduling.CoroutineScheduler$c> r5 = r0.g     // Catch: java.lang.Throwable -> L58
                r5.c(r2, r4)     // Catch: java.lang.Throwable -> L58
                r4.v(r2)     // Catch: java.lang.Throwable -> L58
                r0.x(r4, r3, r2)     // Catch: java.lang.Throwable -> L58
                goto L5a
            L58:
                r0 = move-exception
                goto L68
            L5a:
                kotlinx.coroutines.internal.n0<kotlinx.coroutines.scheduling.CoroutineScheduler$c> r0 = r0.g     // Catch: java.lang.Throwable -> L58
                r2 = 0
                r0.c(r3, r2)     // Catch: java.lang.Throwable -> L58
                kotlin.n1 r0 = kotlin.n1.a     // Catch: java.lang.Throwable -> L58
                monitor-exit(r1)
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.TERMINATED
                r8.c = r0
                return
            L68:
                monitor-exit(r1)
                throw r0
        }

        public static final /* synthetic */ kotlinx.coroutines.scheduling.CoroutineScheduler a(kotlinx.coroutines.scheduling.CoroutineScheduler.c r0) {
                kotlinx.coroutines.scheduling.CoroutineScheduler r0 = r0.h
                return r0
        }

        private final void b(int r4) {
                r3 = this;
                if (r4 != 0) goto L3
                goto L19
            L3:
                kotlinx.coroutines.scheduling.CoroutineScheduler r4 = r3.h
                java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.a()
                r1 = -2097152(0xffffffffffe00000, double:NaN)
                r0.addAndGet(r4, r1)
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r4 = r3.c
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.TERMINATED
                if (r4 == r0) goto L19
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r4 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.DORMANT
                r3.c = r4
            L19:
                return
        }

        private final void c(int r1) {
                r0 = this;
                if (r1 != 0) goto L3
                goto L10
            L3:
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.BLOCKING
                boolean r1 = r0.z(r1)
                if (r1 == 0) goto L10
                kotlinx.coroutines.scheduling.CoroutineScheduler r1 = r0.h
                r1.C()
            L10:
                return
        }

        private final void d(kotlinx.coroutines.scheduling.j r3) {
                r2 = this;
                kotlinx.coroutines.scheduling.k r0 = r3.b
                int r0 = r0.q()
                r2.n(r0)
                r2.c(r0)
                kotlinx.coroutines.scheduling.CoroutineScheduler r1 = r2.h
                r1.z(r3)
                r2.b(r0)
                return
        }

        private final kotlinx.coroutines.scheduling.j e(boolean r2) {
                r1 = this;
                if (r2 == 0) goto L2c
                kotlinx.coroutines.scheduling.CoroutineScheduler r2 = r1.h
                int r2 = r2.a
                int r2 = r2 * 2
                int r2 = r1.q(r2)
                if (r2 != 0) goto L10
                r2 = 1
                goto L11
            L10:
                r2 = 0
            L11:
                if (r2 == 0) goto L1a
                kotlinx.coroutines.scheduling.j r0 = r1.s()
                if (r0 == 0) goto L1a
                return r0
            L1a:
                kotlinx.coroutines.scheduling.p r0 = r1.a
                kotlinx.coroutines.scheduling.j r0 = r0.h()
                if (r0 == 0) goto L23
                return r0
            L23:
                if (r2 != 0) goto L33
                kotlinx.coroutines.scheduling.j r2 = r1.s()
                if (r2 == 0) goto L33
                return r2
            L2c:
                kotlinx.coroutines.scheduling.j r2 = r1.s()
                if (r2 == 0) goto L33
                return r2
            L33:
                r2 = 3
                kotlinx.coroutines.scheduling.j r2 = r1.A(r2)
                return r2
        }

        private final kotlinx.coroutines.scheduling.j f() {
                r1 = this;
                kotlinx.coroutines.scheduling.p r0 = r1.a
                kotlinx.coroutines.scheduling.j r0 = r0.i()
                if (r0 != 0) goto L19
                kotlinx.coroutines.scheduling.CoroutineScheduler r0 = r1.h
                kotlinx.coroutines.scheduling.e r0 = r0.f
                java.lang.Object r0 = r0.h()
                kotlinx.coroutines.scheduling.j r0 = (kotlinx.coroutines.scheduling.j) r0
                if (r0 != 0) goto L19
                r0 = 1
                kotlinx.coroutines.scheduling.j r0 = r1.A(r0)
            L19:
                return r0
        }

        private final kotlinx.coroutines.scheduling.j g() {
                r1 = this;
                kotlinx.coroutines.scheduling.p r0 = r1.a
                kotlinx.coroutines.scheduling.j r0 = r0.k()
                if (r0 != 0) goto L19
                kotlinx.coroutines.scheduling.CoroutineScheduler r0 = r1.h
                kotlinx.coroutines.scheduling.e r0 = r0.f
                java.lang.Object r0 = r0.h()
                kotlinx.coroutines.scheduling.j r0 = (kotlinx.coroutines.scheduling.j) r0
                if (r0 != 0) goto L19
                r0 = 2
                kotlinx.coroutines.scheduling.j r0 = r1.A(r0)
            L19:
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater m() {
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.c.i
                return r0
        }

        private final void n(int r3) {
                r2 = this;
                r0 = 0
                r2.d = r0
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r3 = r2.c
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.PARKING
                if (r3 != r0) goto Le
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r3 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.BLOCKING
                r2.c = r3
            Le:
                return
        }

        private final boolean o() {
                r2 = this;
                java.lang.Object r0 = r2.nextParkedWorker
                kotlinx.coroutines.internal.s0 r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.l
                if (r0 == r1) goto L8
                r0 = 1
                return r0
            L8:
                r0 = 0
                return r0
        }

        private final void r() {
                r6 = this;
                long r0 = r6.d
                r2 = 0
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 != 0) goto L13
                long r0 = java.lang.System.nanoTime()
                kotlinx.coroutines.scheduling.CoroutineScheduler r4 = r6.h
                long r4 = r4.c
                long r0 = r0 + r4
                r6.d = r0
            L13:
                kotlinx.coroutines.scheduling.CoroutineScheduler r0 = r6.h
                long r0 = r0.c
                java.util.concurrent.locks.LockSupport.parkNanos(r0)
                long r0 = java.lang.System.nanoTime()
                long r4 = r6.d
                long r0 = r0 - r4
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 < 0) goto L2a
                r6.d = r2
                r6.B()
            L2a:
                return
        }

        private final kotlinx.coroutines.scheduling.j s() {
                r1 = this;
                r0 = 2
                int r0 = r1.q(r0)
                if (r0 != 0) goto L1f
                kotlinx.coroutines.scheduling.CoroutineScheduler r0 = r1.h
                kotlinx.coroutines.scheduling.e r0 = r0.e
                java.lang.Object r0 = r0.h()
                kotlinx.coroutines.scheduling.j r0 = (kotlinx.coroutines.scheduling.j) r0
                if (r0 == 0) goto L14
                return r0
            L14:
                kotlinx.coroutines.scheduling.CoroutineScheduler r0 = r1.h
                kotlinx.coroutines.scheduling.e r0 = r0.f
                java.lang.Object r0 = r0.h()
                kotlinx.coroutines.scheduling.j r0 = (kotlinx.coroutines.scheduling.j) r0
                return r0
            L1f:
                kotlinx.coroutines.scheduling.CoroutineScheduler r0 = r1.h
                kotlinx.coroutines.scheduling.e r0 = r0.f
                java.lang.Object r0 = r0.h()
                kotlinx.coroutines.scheduling.j r0 = (kotlinx.coroutines.scheduling.j) r0
                if (r0 == 0) goto L2c
                return r0
            L2c:
                kotlinx.coroutines.scheduling.CoroutineScheduler r0 = r1.h
                kotlinx.coroutines.scheduling.e r0 = r0.e
                java.lang.Object r0 = r0.h()
                kotlinx.coroutines.scheduling.j r0 = (kotlinx.coroutines.scheduling.j) r0
                return r0
        }

        private final void u() {
                r7 = this;
                r0 = 0
            L1:
                r1 = 0
            L2:
                kotlinx.coroutines.scheduling.CoroutineScheduler r2 = r7.h
                boolean r2 = r2.isTerminated()
                if (r2 != 0) goto L40
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r2 = r7.c
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r3 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.TERMINATED
                if (r2 == r3) goto L40
                boolean r2 = r7.g
                kotlinx.coroutines.scheduling.j r2 = r7.h(r2)
                r3 = 0
                if (r2 == 0) goto L20
                r7.e = r3
                r7.d(r2)
                goto L1
            L20:
                r7.g = r0
                long r5 = r7.e
                int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
                if (r2 == 0) goto L3c
                if (r1 != 0) goto L2c
                r1 = 1
                goto L2
            L2c:
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.PARKING
                r7.z(r1)
                java.lang.Thread.interrupted()
                long r1 = r7.e
                java.util.concurrent.locks.LockSupport.parkNanos(r1)
                r7.e = r3
                goto L1
            L3c:
                r7.y()
                goto L2
            L40:
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.TERMINATED
                r7.z(r0)
                return
        }

        private final boolean x() {
                r9 = this;
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r0 = r9.c
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.CPU_ACQUIRED
                r2 = 1
                if (r0 != r1) goto L8
                return r2
            L8:
                kotlinx.coroutines.scheduling.CoroutineScheduler r4 = r9.h
                java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.a()
            Le:
                long r5 = r0.get(r4)
                r7 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
                long r7 = r7 & r5
                r1 = 42
                long r7 = r7 >> r1
                int r1 = (int) r7
                if (r1 != 0) goto L20
                r0 = 0
                return r0
            L20:
                r7 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
                long r7 = r5 - r7
                java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = kotlinx.coroutines.scheduling.CoroutineScheduler.a()
                boolean r1 = r3.compareAndSet(r4, r5, r7)
                if (r1 == 0) goto Le
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.CPU_ACQUIRED
                r9.c = r0
                return r2
        }

        private final void y() {
                r3 = this;
                boolean r0 = r3.o()
                if (r0 != 0) goto Lc
                kotlinx.coroutines.scheduling.CoroutineScheduler r0 = r3.h
                r0.w(r3)
                return
            Lc:
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.c.i
                r1 = -1
                r0.set(r3, r1)
            L12:
                boolean r0 = r3.o()
                if (r0 == 0) goto L3b
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.c.i
                int r0 = r0.get(r3)
                if (r0 != r1) goto L3b
                kotlinx.coroutines.scheduling.CoroutineScheduler r0 = r3.h
                boolean r0 = r0.isTerminated()
                if (r0 != 0) goto L3b
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r0 = r3.c
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r2 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.TERMINATED
                if (r0 != r2) goto L2f
                goto L3b
            L2f:
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.PARKING
                r3.z(r0)
                java.lang.Thread.interrupted()
                r3.r()
                goto L12
            L3b:
                return
        }

        @org.jetbrains.annotations.Nullable
        public final kotlinx.coroutines.scheduling.j h(boolean r2) {
                r1 = this;
                boolean r0 = r1.x()
                if (r0 == 0) goto Lb
                kotlinx.coroutines.scheduling.j r2 = r1.e(r2)
                return r2
            Lb:
                kotlinx.coroutines.scheduling.j r2 = r1.f()
                return r2
        }

        public final int i() {
                r1 = this;
                int r0 = r1.indexInArray
                return r0
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Object j() {
                r1 = this;
                java.lang.Object r0 = r1.nextParkedWorker
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final kotlinx.coroutines.scheduling.CoroutineScheduler k() {
                r1 = this;
                kotlinx.coroutines.scheduling.CoroutineScheduler r0 = a(r1)
                return r0
        }

        public final int l() {
                r1 = this;
                int r0 = r1.workerCtl
                return r0
        }

        public final boolean p() {
                r2 = this;
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r0 = r2.c
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.BLOCKING
                if (r0 != r1) goto L8
                r0 = 1
                return r0
            L8:
                r0 = 0
                return r0
        }

        public final int q(int r4) {
                r3 = this;
                int r0 = r3.f
                int r1 = r0 << 13
                r0 = r0 ^ r1
                int r1 = r0 >> 17
                r0 = r0 ^ r1
                int r1 = r0 << 5
                r0 = r0 ^ r1
                r3.f = r0
                int r1 = r4 + (-1)
                r2 = r1 & r4
                if (r2 != 0) goto L16
                r4 = r0 & r1
                return r4
            L16:
                r1 = 2147483647(0x7fffffff, float:NaN)
                r0 = r0 & r1
                int r0 = r0 % r4
                return r0
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
                r0 = this;
                r0.u()
                return
        }

        public final long t() {
                r6 = this;
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r0 = r6.c
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.CPU_ACQUIRED
                if (r0 != r1) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                if (r0 == 0) goto L10
                kotlinx.coroutines.scheduling.j r1 = r6.g()
                goto L14
            L10:
                kotlinx.coroutines.scheduling.j r1 = r6.f()
            L14:
                r2 = 0
                if (r1 != 0) goto L21
                long r0 = r6.e
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 != 0) goto L20
                r0 = -1
            L20:
                return r0
            L21:
                kotlinx.coroutines.scheduling.CoroutineScheduler r4 = r6.h
                r4.z(r1)
                if (r0 != 0) goto L34
                kotlinx.coroutines.scheduling.CoroutineScheduler r0 = r6.h
                java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.a()
                r4 = -2097152(0xffffffffffe00000, double:NaN)
                r1.addAndGet(r0, r4)
            L34:
                return r2
        }

        public final void v(int r3) {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                kotlinx.coroutines.scheduling.CoroutineScheduler r1 = r2.h
                java.lang.String r1 = r1.d
                r0.append(r1)
                java.lang.String r1 = "-worker-"
                r0.append(r1)
                if (r3 != 0) goto L16
                java.lang.String r1 = "TERMINATED"
                goto L1a
            L16:
                java.lang.String r1 = java.lang.String.valueOf(r3)
            L1a:
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r2.setName(r0)
                r2.indexInArray = r3
                return
        }

        public final void w(@org.jetbrains.annotations.Nullable java.lang.Object r1) {
                r0 = this;
                r0.nextParkedWorker = r1
                return
        }

        public final boolean z(@org.jetbrains.annotations.NotNull kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState r7) {
                r6 = this;
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r0 = r6.c
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.CPU_ACQUIRED
                if (r0 != r1) goto L8
                r1 = 1
                goto L9
            L8:
                r1 = 0
            L9:
                if (r1 == 0) goto L19
                kotlinx.coroutines.scheduling.CoroutineScheduler r2 = r6.h
                java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = kotlinx.coroutines.scheduling.CoroutineScheduler.a()
                r4 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
                r3.addAndGet(r2, r4)
            L19:
                if (r0 == r7) goto L1d
                r6.c = r7
            L1d:
                return r1
        }
    }

    static {
            kotlinx.coroutines.scheduling.CoroutineScheduler$a r0 = new kotlinx.coroutines.scheduling.CoroutineScheduler$a
            r1 = 0
            r0.<init>(r1)
            kotlinx.coroutines.scheduling.CoroutineScheduler.h = r0
            java.lang.String r0 = "parkedWorkersStack"
            java.lang.Class<kotlinx.coroutines.scheduling.CoroutineScheduler> r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.class
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(r1, r0)
            kotlinx.coroutines.scheduling.CoroutineScheduler.i = r0
            java.lang.String r0 = "controlState"
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(r1, r0)
            kotlinx.coroutines.scheduling.CoroutineScheduler.j = r0
            java.lang.String r0 = "_isTerminated"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r1, r0)
            kotlinx.coroutines.scheduling.CoroutineScheduler.k = r0
            kotlinx.coroutines.internal.s0 r0 = new kotlinx.coroutines.internal.s0
            java.lang.String r1 = "NOT_IN_STACK"
            r0.<init>(r1)
            kotlinx.coroutines.scheduling.CoroutineScheduler.l = r0
            return
    }

    public CoroutineScheduler(int r3, int r4, long r5, @org.jetbrains.annotations.NotNull java.lang.String r7) {
            r2 = this;
            r2.<init>()
            r2.a = r3
            r2.b = r4
            r2.c = r5
            r2.d = r7
            r7 = 1
            if (r3 < r7) goto L9f
            java.lang.String r7 = "Max pool size "
            if (r4 < r3) goto L7e
            r0 = 2097150(0x1ffffe, float:2.938733E-39)
            if (r4 > r0) goto L60
            r0 = 0
            int r4 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r4 <= 0) goto L40
            kotlinx.coroutines.scheduling.e r4 = new kotlinx.coroutines.scheduling.e
            r4.<init>()
            r2.e = r4
            kotlinx.coroutines.scheduling.e r4 = new kotlinx.coroutines.scheduling.e
            r4.<init>()
            r2.f = r4
            kotlinx.coroutines.internal.n0 r4 = new kotlinx.coroutines.internal.n0
            int r5 = r3 + 1
            int r5 = r5 * 2
            r4.<init>(r5)
            r2.g = r4
            long r3 = (long) r3
            r5 = 42
            long r3 = r3 << r5
            r2.controlState = r3
            r3 = 0
            r2._isTerminated = r3
            return
        L40:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Idle worker keep alive time "
            r3.append(r4)
            r3.append(r5)
            java.lang.String r4 = " must be positive"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
        L60:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            r3.append(r4)
            java.lang.String r4 = " should not exceed maximal supported number of threads 2097150"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
        L7e:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r7)
            r5.append(r4)
            java.lang.String r4 = " should be greater than or equals to core pool size "
            r5.append(r4)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
        L9f:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Core pool size "
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = " should be at least 1"
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
    }

    public /* synthetic */ CoroutineScheduler(int r7, int r8, long r9, java.lang.String r11, int r12, kotlin.jvm.internal.v r13) {
            r6 = this;
            r13 = r12 & 4
            if (r13 == 0) goto L6
            long r9 = kotlinx.coroutines.scheduling.n.e
        L6:
            r3 = r9
            r9 = r12 & 8
            if (r9 == 0) goto Ld
            java.lang.String r11 = kotlinx.coroutines.scheduling.n.a
        Ld:
            r0 = r6
            r1 = r7
            r2 = r8
            r5 = r11
            r0.<init>(r1, r2, r3, r5)
            return
    }

    private final void B(long r1, boolean r3) {
            r0 = this;
            if (r3 == 0) goto L3
            goto L10
        L3:
            boolean r3 = r0.H()
            if (r3 == 0) goto La
            goto L10
        La:
            boolean r1 = r0.F(r1)
            if (r1 == 0) goto L11
        L10:
            return
        L11:
            r0.H()
            return
    }

    private final kotlinx.coroutines.scheduling.j D(kotlinx.coroutines.scheduling.CoroutineScheduler.c r3, kotlinx.coroutines.scheduling.j r4, boolean r5) {
            r2 = this;
            if (r3 != 0) goto L3
            goto L9
        L3:
            kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r0 = r3.c
            kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.TERMINATED
            if (r0 != r1) goto La
        L9:
            return r4
        La:
            kotlinx.coroutines.scheduling.k r0 = r4.b
            int r0 = r0.q()
            if (r0 != 0) goto L19
            kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r0 = r3.c
            kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.BLOCKING
            if (r0 != r1) goto L19
            return r4
        L19:
            r0 = 1
            r3.g = r0
            kotlinx.coroutines.scheduling.p r3 = r3.a
            kotlinx.coroutines.scheduling.j r3 = r3.a(r4, r5)
            return r3
    }

    private final boolean E() {
            r7 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = a()
        L4:
            long r3 = r0.get(r7)
            r1 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
            long r1 = r1 & r3
            r5 = 42
            long r1 = r1 >> r5
            int r2 = (int) r1
            if (r2 != 0) goto L16
            r0 = 0
            return r0
        L16:
            r1 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
            long r5 = r3 - r1
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = a()
            r2 = r7
            boolean r1 = r1.compareAndSet(r2, r3, r5)
            if (r1 == 0) goto L4
            r0 = 1
            return r0
    }

    private final boolean F(long r5) {
            r4 = this;
            r0 = 2097151(0x1fffff, double:1.0361303E-317)
            long r0 = r0 & r5
            int r1 = (int) r0
            r2 = 4398044413952(0x3ffffe00000, double:2.1729226538177E-311)
            long r5 = r5 & r2
            r0 = 21
            long r5 = r5 >> r0
            int r6 = (int) r5
            int r1 = r1 - r6
            r5 = 0
            int r6 = kotlin.ranges.t.u(r1, r5)
            int r0 = r4.a
            if (r6 >= r0) goto L2a
            int r6 = r4.e()
            r0 = 1
            if (r6 != r0) goto L27
            int r1 = r4.a
            if (r1 <= r0) goto L27
            r4.e()
        L27:
            if (r6 <= 0) goto L2a
            return r0
        L2a:
            return r5
    }

    static /* synthetic */ boolean G(kotlinx.coroutines.scheduling.CoroutineScheduler r0, long r1, int r3, java.lang.Object r4) {
            r3 = r3 & 1
            if (r3 == 0) goto La
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.j
            long r1 = r1.get(r0)
        La:
            boolean r0 = r0.F(r1)
            return r0
    }

    private final boolean H() {
            r4 = this;
        L0:
            kotlinx.coroutines.scheduling.CoroutineScheduler$c r0 = r4.v()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = kotlinx.coroutines.scheduling.CoroutineScheduler.c.m()
            r3 = -1
            boolean r1 = r2.compareAndSet(r0, r3, r1)
            if (r1 == 0) goto L0
            java.util.concurrent.locks.LockSupport.unpark(r0)
            r0 = 1
            return r0
    }

    public static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater a() {
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.j
            return r0
    }

    private final boolean b(kotlinx.coroutines.scheduling.j r3) {
            r2 = this;
            kotlinx.coroutines.scheduling.k r0 = r3.b
            int r0 = r0.q()
            r1 = 1
            if (r0 != r1) goto L10
            kotlinx.coroutines.scheduling.e r0 = r2.f
            boolean r3 = r0.a(r3)
            return r3
        L10:
            kotlinx.coroutines.scheduling.e r0 = r2.e
            boolean r3 = r0.a(r3)
            return r3
    }

    private final int d(long r3) {
            r2 = this;
            r0 = 4398044413952(0x3ffffe00000, double:2.1729226538177E-311)
            long r3 = r3 & r0
            r0 = 21
            long r3 = r3 >> r0
            int r4 = (int) r3
            return r4
    }

    private final int e() {
            r10 = this;
            kotlinx.coroutines.internal.n0<kotlinx.coroutines.scheduling.CoroutineScheduler$c> r0 = r10.g
            monitor-enter(r0)
            boolean r1 = r10.isTerminated()     // Catch: java.lang.Throwable -> L6c
            if (r1 == 0) goto Lc
            monitor-exit(r0)
            r0 = -1
            return r0
        Lc:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.j     // Catch: java.lang.Throwable -> L6c
            long r2 = r1.get(r10)     // Catch: java.lang.Throwable -> L6c
            r4 = 2097151(0x1fffff, double:1.0361303E-317)
            long r6 = r2 & r4
            int r7 = (int) r6     // Catch: java.lang.Throwable -> L6c
            r8 = 4398044413952(0x3ffffe00000, double:2.1729226538177E-311)
            long r2 = r2 & r8
            r6 = 21
            long r2 = r2 >> r6
            int r3 = (int) r2     // Catch: java.lang.Throwable -> L6c
            int r2 = r7 - r3
            r3 = 0
            int r2 = kotlin.ranges.t.u(r2, r3)     // Catch: java.lang.Throwable -> L6c
            int r6 = r10.a     // Catch: java.lang.Throwable -> L6c
            if (r2 < r6) goto L2f
            monitor-exit(r0)
            return r3
        L2f:
            int r6 = r10.b     // Catch: java.lang.Throwable -> L6c
            if (r7 < r6) goto L35
            monitor-exit(r0)
            return r3
        L35:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = a()     // Catch: java.lang.Throwable -> L6c
            long r6 = r3.get(r10)     // Catch: java.lang.Throwable -> L6c
            long r6 = r6 & r4
            int r3 = (int) r6     // Catch: java.lang.Throwable -> L6c
            int r3 = r3 + 1
            if (r3 <= 0) goto L6e
            kotlinx.coroutines.internal.n0<kotlinx.coroutines.scheduling.CoroutineScheduler$c> r6 = r10.g     // Catch: java.lang.Throwable -> L6c
            java.lang.Object r6 = r6.b(r3)     // Catch: java.lang.Throwable -> L6c
            if (r6 != 0) goto L6e
            kotlinx.coroutines.scheduling.CoroutineScheduler$c r6 = new kotlinx.coroutines.scheduling.CoroutineScheduler$c     // Catch: java.lang.Throwable -> L6c
            r6.<init>(r10, r3)     // Catch: java.lang.Throwable -> L6c
            kotlinx.coroutines.internal.n0<kotlinx.coroutines.scheduling.CoroutineScheduler$c> r7 = r10.g     // Catch: java.lang.Throwable -> L6c
            r7.c(r3, r6)     // Catch: java.lang.Throwable -> L6c
            long r7 = r1.incrementAndGet(r10)     // Catch: java.lang.Throwable -> L6c
            long r4 = r4 & r7
            int r1 = (int) r4
            if (r3 != r1) goto L64
            int r2 = r2 + 1
            monitor-exit(r0)
            r6.start()
            return r2
        L64:
            java.lang.String r1 = "Failed requirement."
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L6c
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L6c
            throw r2     // Catch: java.lang.Throwable -> L6c
        L6c:
            r1 = move-exception
            goto L76
        L6e:
            java.lang.String r1 = "Failed requirement."
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L6c
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L6c
            throw r2     // Catch: java.lang.Throwable -> L6c
        L76:
            monitor-exit(r0)
            throw r1
    }

    private final int g(long r3) {
            r2 = this;
            r0 = 2097151(0x1fffff, double:1.0361303E-317)
            long r3 = r3 & r0
            int r4 = (int) r3
            return r4
    }

    private final kotlinx.coroutines.scheduling.CoroutineScheduler.c h() {
            r3 = this;
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r1 = r0 instanceof kotlinx.coroutines.scheduling.CoroutineScheduler.c
            r2 = 0
            if (r1 == 0) goto Lc
            kotlinx.coroutines.scheduling.CoroutineScheduler$c r0 = (kotlinx.coroutines.scheduling.CoroutineScheduler.c) r0
            goto Ld
        Lc:
            r0 = r2
        Ld:
            if (r0 == 0) goto L1a
            kotlinx.coroutines.scheduling.CoroutineScheduler r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.c.a(r0)
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
            if (r1 == 0) goto L1a
            return r0
        L1a:
            return r2
    }

    private final void k() {
            r3 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = a()
            r1 = -2097152(0xffffffffffe00000, double:NaN)
            r0.addAndGet(r3, r1)
            return
    }

    private final int l() {
            r4 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = a()
            long r0 = r0.getAndDecrement(r4)
            r2 = 2097151(0x1fffff, double:1.0361303E-317)
            long r0 = r0 & r2
            int r1 = (int) r0
            return r1
    }

    public static /* synthetic */ void n(kotlinx.coroutines.scheduling.CoroutineScheduler r0, java.lang.Runnable r1, kotlinx.coroutines.scheduling.k r2, boolean r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L6
            kotlinx.coroutines.scheduling.k r2 = kotlinx.coroutines.scheduling.n.i
        L6:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = 0
        Lb:
            r0.m(r1, r2, r3)
            return
    }

    private final int o() {
            r4 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.j
            long r0 = r0.get(r4)
            r2 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
            long r0 = r0 & r2
            r2 = 42
            long r0 = r0 >> r2
            int r1 = (int) r0
            return r1
    }

    private final int p() {
            r4 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = a()
            long r0 = r0.get(r4)
            r2 = 2097151(0x1fffff, double:1.0361303E-317)
            long r0 = r0 & r2
            int r1 = (int) r0
            return r1
    }

    private final long q() {
            r3 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.j
            r1 = 2097152(0x200000, double:1.036131E-317)
            long r0 = r0.addAndGet(r3, r1)
            return r0
    }

    private final int s() {
            r4 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.j
            long r0 = r0.incrementAndGet(r4)
            r2 = 2097151(0x1fffff, double:1.0361303E-317)
            long r0 = r0 & r2
            int r1 = (int) r0
            return r1
    }

    private final void t(java.util.concurrent.atomic.AtomicLongFieldUpdater r3, kotlin.jvm.functions.Function1<? super java.lang.Long, kotlin.n1> r4, java.lang.Object r5) {
            r2 = this;
        L0:
            long r0 = r3.get(r5)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r4.invoke(r0)
            goto L0
    }

    private final int u(kotlinx.coroutines.scheduling.CoroutineScheduler.c r2) {
            r1 = this;
            java.lang.Object r2 = r2.j()
        L4:
            kotlinx.coroutines.internal.s0 r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.l
            if (r2 != r0) goto La
            r2 = -1
            return r2
        La:
            if (r2 != 0) goto Le
            r2 = 0
            return r2
        Le:
            kotlinx.coroutines.scheduling.CoroutineScheduler$c r2 = (kotlinx.coroutines.scheduling.CoroutineScheduler.c) r2
            int r0 = r2.i()
            if (r0 == 0) goto L17
            return r0
        L17:
            java.lang.Object r2 = r2.j()
            goto L4
    }

    private final kotlinx.coroutines.scheduling.CoroutineScheduler.c v() {
            r10 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.i
        L2:
            long r3 = r0.get(r10)
            r1 = 2097151(0x1fffff, double:1.0361303E-317)
            long r1 = r1 & r3
            int r2 = (int) r1
            kotlinx.coroutines.internal.n0<kotlinx.coroutines.scheduling.CoroutineScheduler$c> r1 = r10.g
            java.lang.Object r1 = r1.b(r2)
            r7 = r1
            kotlinx.coroutines.scheduling.CoroutineScheduler$c r7 = (kotlinx.coroutines.scheduling.CoroutineScheduler.c) r7
            if (r7 != 0) goto L18
            r0 = 0
            return r0
        L18:
            r1 = 2097152(0x200000, double:1.036131E-317)
            long r1 = r1 + r3
            r5 = -2097152(0xffffffffffe00000, double:NaN)
            long r1 = r1 & r5
            int r5 = r10.u(r7)
            if (r5 < 0) goto L2
            r8 = r1
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.i
            long r5 = (long) r5
            long r5 = r5 | r8
            r2 = r10
            boolean r1 = r1.compareAndSet(r2, r3, r5)
            if (r1 == 0) goto L2
            kotlinx.coroutines.internal.s0 r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.l
            r7.w(r0)
            return r7
    }

    private final long y() {
            r3 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = a()
            r1 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
            long r0 = r0.addAndGet(r3, r1)
            return r0
    }

    public final void A(long r8) {
            r7 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.k
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r7, r1, r2)
            if (r0 != 0) goto Lb
            return
        Lb:
            kotlinx.coroutines.scheduling.CoroutineScheduler$c r0 = r7.h()
            kotlinx.coroutines.internal.n0<kotlinx.coroutines.scheduling.CoroutineScheduler$c> r1 = r7.g
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = a()     // Catch: java.lang.Throwable -> L87
            long r3 = r3.get(r7)     // Catch: java.lang.Throwable -> L87
            r5 = 2097151(0x1fffff, double:1.0361303E-317)
            long r3 = r3 & r5
            int r4 = (int) r3
            monitor-exit(r1)
            if (r2 > r4) goto L49
            r1 = 1
        L23:
            kotlinx.coroutines.internal.n0<kotlinx.coroutines.scheduling.CoroutineScheduler$c> r3 = r7.g
            java.lang.Object r3 = r3.b(r1)
            kotlin.jvm.internal.g0.m(r3)
            kotlinx.coroutines.scheduling.CoroutineScheduler$c r3 = (kotlinx.coroutines.scheduling.CoroutineScheduler.c) r3
            if (r3 == r0) goto L44
        L30:
            boolean r5 = r3.isAlive()
            if (r5 == 0) goto L3d
            java.util.concurrent.locks.LockSupport.unpark(r3)
            r3.join(r8)
            goto L30
        L3d:
            kotlinx.coroutines.scheduling.p r3 = r3.a
            kotlinx.coroutines.scheduling.e r5 = r7.f
            r3.g(r5)
        L44:
            if (r1 == r4) goto L49
            int r1 = r1 + 1
            goto L23
        L49:
            kotlinx.coroutines.scheduling.e r8 = r7.f
            r8.b()
            kotlinx.coroutines.scheduling.e r8 = r7.e
            r8.b()
        L53:
            if (r0 == 0) goto L5b
            kotlinx.coroutines.scheduling.j r8 = r0.h(r2)
            if (r8 != 0) goto L83
        L5b:
            kotlinx.coroutines.scheduling.e r8 = r7.e
            java.lang.Object r8 = r8.h()
            kotlinx.coroutines.scheduling.j r8 = (kotlinx.coroutines.scheduling.j) r8
            if (r8 != 0) goto L83
            kotlinx.coroutines.scheduling.e r8 = r7.f
            java.lang.Object r8 = r8.h()
            kotlinx.coroutines.scheduling.j r8 = (kotlinx.coroutines.scheduling.j) r8
            if (r8 != 0) goto L83
            if (r0 == 0) goto L76
            kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r8 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.TERMINATED
            r0.z(r8)
        L76:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = kotlinx.coroutines.scheduling.CoroutineScheduler.i
            r0 = 0
            r8.set(r7, r0)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = kotlinx.coroutines.scheduling.CoroutineScheduler.j
            r8.set(r7, r0)
            return
        L83:
            r7.z(r8)
            goto L53
        L87:
            r8 = move-exception
            monitor-exit(r1)
            throw r8
    }

    public final void C() {
            r4 = this;
            boolean r0 = r4.H()
            if (r0 == 0) goto L7
            goto L11
        L7:
            r0 = 1
            r1 = 0
            r2 = 0
            boolean r0 = G(r4, r2, r0, r1)
            if (r0 == 0) goto L12
        L11:
            return
        L12:
            r4.H()
            return
    }

    public final int c(long r3) {
            r2 = this;
            r0 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
            long r3 = r3 & r0
            r0 = 42
            long r3 = r3 >> r0
            int r4 = (int) r3
            return r4
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r2 = this;
            r0 = 10000(0x2710, double:4.9407E-320)
            r2.A(r0)
            return
    }

    @Override // java.util.concurrent.Executor
    public void execute(@org.jetbrains.annotations.NotNull java.lang.Runnable r7) {
            r6 = this;
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            n(r0, r1, r2, r3, r4, r5)
            return
    }

    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.scheduling.j f(@org.jetbrains.annotations.NotNull java.lang.Runnable r4, @org.jetbrains.annotations.NotNull kotlinx.coroutines.scheduling.k r5) {
            r3 = this;
            kotlinx.coroutines.scheduling.i r0 = kotlinx.coroutines.scheduling.n.f
            long r0 = r0.a()
            boolean r2 = r4 instanceof kotlinx.coroutines.scheduling.j
            if (r2 == 0) goto L11
            kotlinx.coroutines.scheduling.j r4 = (kotlinx.coroutines.scheduling.j) r4
            r4.a = r0
            r4.b = r5
            return r4
        L11:
            kotlinx.coroutines.scheduling.m r2 = new kotlinx.coroutines.scheduling.m
            r2.<init>(r4, r0, r5)
            return r2
    }

    public final boolean isTerminated() {
            r1 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.k
            int r0 = r0.get(r1)
            if (r0 == 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    public final void m(@org.jetbrains.annotations.NotNull java.lang.Runnable r6, @org.jetbrains.annotations.NotNull kotlinx.coroutines.scheduling.k r7, boolean r8) {
            r5 = this;
            kotlinx.coroutines.b r0 = kotlinx.coroutines.c.b()
            if (r0 == 0) goto L9
            r0.e()
        L9:
            kotlinx.coroutines.scheduling.j r6 = r5.f(r6, r7)
            kotlinx.coroutines.scheduling.k r7 = r6.b
            int r7 = r7.q()
            r0 = 0
            r1 = 1
            if (r7 != r1) goto L19
            r7 = 1
            goto L1a
        L19:
            r7 = 0
        L1a:
            if (r7 == 0) goto L26
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = kotlinx.coroutines.scheduling.CoroutineScheduler.j
            r3 = 2097152(0x200000, double:1.036131E-317)
            long r2 = r2.addAndGet(r5, r3)
            goto L28
        L26:
            r2 = 0
        L28:
            kotlinx.coroutines.scheduling.CoroutineScheduler$c r4 = r5.h()
            kotlinx.coroutines.scheduling.j r6 = r5.D(r4, r6, r8)
            if (r6 == 0) goto L52
            boolean r6 = r5.b(r6)
            if (r6 == 0) goto L39
            goto L52
        L39:
            java.util.concurrent.RejectedExecutionException r6 = new java.util.concurrent.RejectedExecutionException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = r5.d
            r7.append(r8)
            java.lang.String r8 = " was terminated"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L52:
            if (r8 == 0) goto L57
            if (r4 == 0) goto L57
            r0 = 1
        L57:
            if (r7 == 0) goto L5d
            r5.B(r2, r0)
            return
        L5d:
            if (r0 == 0) goto L60
            return
        L60:
            r5.C()
            return
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r12 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            kotlinx.coroutines.internal.n0<kotlinx.coroutines.scheduling.CoroutineScheduler$c> r1 = r12.g
            int r1 = r1.a()
            r2 = 0
            r3 = 1
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 1
        L12:
            if (r8 >= r1) goto L8d
            kotlinx.coroutines.internal.n0<kotlinx.coroutines.scheduling.CoroutineScheduler$c> r9 = r12.g
            java.lang.Object r9 = r9.b(r8)
            kotlinx.coroutines.scheduling.CoroutineScheduler$c r9 = (kotlinx.coroutines.scheduling.CoroutineScheduler.c) r9
            if (r9 != 0) goto L1f
            goto L8a
        L1f:
            kotlinx.coroutines.scheduling.p r10 = r9.a
            int r10 = r10.f()
            kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r9 = r9.c
            int[] r11 = kotlinx.coroutines.scheduling.CoroutineScheduler.b.a
            int r9 = r9.ordinal()
            r9 = r11[r9]
            if (r9 == r3) goto L88
            r11 = 2
            if (r9 == r11) goto L71
            r11 = 3
            if (r9 == r11) goto L5a
            r11 = 4
            if (r9 == r11) goto L41
            r10 = 5
            if (r9 == r10) goto L3e
            goto L8a
        L3e:
            int r7 = r7 + 1
            goto L8a
        L41:
            int r6 = r6 + 1
            if (r10 <= 0) goto L8a
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r10)
            r10 = 100
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r0.add(r9)
            goto L8a
        L5a:
            int r2 = r2 + 1
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r10)
            r10 = 99
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r0.add(r9)
            goto L8a
        L71:
            int r4 = r4 + 1
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r10)
            r10 = 98
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r0.add(r9)
            goto L8a
        L88:
            int r5 = r5 + 1
        L8a:
            int r8 = r8 + 1
            goto L12
        L8d:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.j
            long r8 = r1.get(r12)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = r12.d
            r1.append(r3)
            r3 = 64
            r1.append(r3)
            java.lang.String r3 = kotlinx.coroutines.u0.b(r12)
            r1.append(r3)
            java.lang.String r3 = "[Pool Size {core = "
            r1.append(r3)
            int r3 = r12.a
            r1.append(r3)
            java.lang.String r3 = ", max = "
            r1.append(r3)
            int r3 = r12.b
            r1.append(r3)
            java.lang.String r3 = "}, Worker States {CPU = "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r2 = ", blocking = "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r2 = ", parked = "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r2 = ", dormant = "
            r1.append(r2)
            r1.append(r6)
            java.lang.String r2 = ", terminated = "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r2 = "}, running workers queues = "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = ", global CPU queue size = "
            r1.append(r0)
            kotlinx.coroutines.scheduling.e r0 = r12.e
            int r0 = r0.c()
            r1.append(r0)
            java.lang.String r0 = ", global blocking queue size = "
            r1.append(r0)
            kotlinx.coroutines.scheduling.e r0 = r12.f
            int r0 = r0.c()
            r1.append(r0)
            java.lang.String r0 = ", Control State {created workers= "
            r1.append(r0)
            r2 = 2097151(0x1fffff, double:1.0361303E-317)
            long r2 = r2 & r8
            int r0 = (int) r2
            r1.append(r0)
            java.lang.String r0 = ", blocking tasks = "
            r1.append(r0)
            r2 = 4398044413952(0x3ffffe00000, double:2.1729226538177E-311)
            long r2 = r2 & r8
            r0 = 21
            long r2 = r2 >> r0
            int r0 = (int) r2
            r1.append(r0)
            java.lang.String r0 = ", CPUs acquired = "
            r1.append(r0)
            int r0 = r12.a
            r2 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
            long r2 = r2 & r8
            r4 = 42
            long r2 = r2 >> r4
            int r3 = (int) r2
            int r0 = r0 - r3
            r1.append(r0)
            java.lang.String r0 = "}]"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }

    public final boolean w(@org.jetbrains.annotations.NotNull kotlinx.coroutines.scheduling.CoroutineScheduler.c r10) {
            r9 = this;
            java.lang.Object r0 = r10.j()
            kotlinx.coroutines.internal.s0 r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.l
            if (r0 == r1) goto La
            r10 = 0
            return r10
        La:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.i
        Lc:
            long r3 = r0.get(r9)
            r1 = 2097151(0x1fffff, double:1.0361303E-317)
            long r1 = r1 & r3
            int r2 = (int) r1
            r5 = 2097152(0x200000, double:1.036131E-317)
            long r5 = r5 + r3
            r7 = -2097152(0xffffffffffe00000, double:NaN)
            long r5 = r5 & r7
            int r1 = r10.i()
            kotlinx.coroutines.internal.n0<kotlinx.coroutines.scheduling.CoroutineScheduler$c> r7 = r9.g
            java.lang.Object r2 = r7.b(r2)
            r10.w(r2)
            r2 = r1
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.i
            long r7 = (long) r2
            long r5 = r5 | r7
            r2 = r9
            boolean r1 = r1.compareAndSet(r2, r3, r5)
            if (r1 == 0) goto Lc
            r10 = 1
            return r10
    }

    public final void x(@org.jetbrains.annotations.NotNull kotlinx.coroutines.scheduling.CoroutineScheduler.c r10, int r11, int r12) {
            r9 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.i
        L2:
            long r3 = r0.get(r9)
            r1 = 2097151(0x1fffff, double:1.0361303E-317)
            long r1 = r1 & r3
            int r2 = (int) r1
            r5 = 2097152(0x200000, double:1.036131E-317)
            long r5 = r5 + r3
            r7 = -2097152(0xffffffffffe00000, double:NaN)
            long r5 = r5 & r7
            if (r2 != r11) goto L1d
            if (r12 != 0) goto L1c
            int r2 = r9.u(r10)
            goto L1d
        L1c:
            r2 = r12
        L1d:
            if (r2 < 0) goto L2
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.i
            long r7 = (long) r2
            long r5 = r5 | r7
            r2 = r9
            boolean r1 = r1.compareAndSet(r2, r3, r5)
            if (r1 == 0) goto L2
            return
    }

    public final void z(@org.jetbrains.annotations.NotNull kotlinx.coroutines.scheduling.j r3) {
            r2 = this;
            r3.run()     // Catch: java.lang.Throwable -> Ld
            kotlinx.coroutines.b r3 = kotlinx.coroutines.c.b()
            if (r3 == 0) goto L22
            r3.f()
            return
        Ld:
            r3 = move-exception
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L23
            java.lang.Thread$UncaughtExceptionHandler r1 = r0.getUncaughtExceptionHandler()     // Catch: java.lang.Throwable -> L23
            r1.uncaughtException(r0, r3)     // Catch: java.lang.Throwable -> L23
            kotlinx.coroutines.b r3 = kotlinx.coroutines.c.b()
            if (r3 == 0) goto L22
            r3.f()
        L22:
            return
        L23:
            r3 = move-exception
            kotlinx.coroutines.b r0 = kotlinx.coroutines.c.b()
            if (r0 == 0) goto L2d
            r0.f()
        L2d:
            throw r3
    }
}
