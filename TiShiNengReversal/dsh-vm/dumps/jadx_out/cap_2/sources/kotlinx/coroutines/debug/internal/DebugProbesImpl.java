package kotlinx.coroutines.debug.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.PublishedApi
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nDebugProbesImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugProbesImpl.kt\nkotlinx/coroutines/debug/internal/DebugProbesImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 6 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,620:1\n150#1:638\n151#1,4:640\n156#1,5:645\n150#1:650\n151#1,4:652\n156#1,5:657\n1#2:621\n1#2:639\n1#2:651\n766#3:622\n857#3,2:623\n1208#3,2:625\n1238#3,4:627\n1855#3,2:665\n350#3,7:673\n1819#3,8:680\n603#4:631\n603#4:644\n603#4:656\n603#4:662\n1295#4,2:663\n37#5,2:632\n37#5,2:634\n37#5,2:636\n1627#6,6:667\n1735#6,6:688\n*S KotlinDebug\n*F\n+ 1 DebugProbesImpl.kt\nkotlinx/coroutines/debug/internal/DebugProbesImpl\n*L\n245#1:638\n245#1:640,4\n245#1:645,5\n252#1:650\n252#1:652,4\n252#1:657,5\n245#1:639\n252#1:651\n110#1:622\n110#1:623,2\n111#1:625,2\n111#1:627,4\n307#1:665,2\n416#1:673,7\n506#1:680,8\n154#1:631\n245#1:644\n252#1:656\n287#1:662\n288#1:663,2\n211#1:632,2\n212#1:634,2\n213#1:636,2\n355#1:667,6\n558#1:688,6\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class DebugProbesImpl {

    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.debug.internal.DebugProbesImpl a = null;

    @org.jetbrains.annotations.NotNull
    private static final java.lang.StackTraceElement b = null;

    @org.jetbrains.annotations.NotNull
    private static final java.text.SimpleDateFormat c = null;

    @org.jetbrains.annotations.Nullable
    private static java.lang.Thread d;

    @org.jetbrains.annotations.NotNull
    private static final kotlinx.coroutines.debug.internal.b<kotlinx.coroutines.debug.internal.DebugProbesImpl.a<?>, java.lang.Boolean> e = null;
    private static boolean f;
    private static boolean g;
    private static boolean h;

    @org.jetbrains.annotations.Nullable
    private static final kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.n1> i = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlinx.coroutines.debug.internal.b<kotlin.coroutines.jvm.internal.c, kotlinx.coroutines.debug.internal.e> j = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlinx.coroutines.debug.internal.DebugProbesImpl.b k = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlinx.coroutines.debug.internal.DebugProbesImpl.c l = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a<T> implements kotlin.coroutines.e<T>, kotlin.coroutines.jvm.internal.c {

        @kotlin.jvm.JvmField
        @org.jetbrains.annotations.NotNull
        public final kotlin.coroutines.e<T> a;

        @kotlin.jvm.JvmField
        @org.jetbrains.annotations.NotNull
        public final kotlinx.coroutines.debug.internal.e b;

        public a(@org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super T> r1, @org.jetbrains.annotations.NotNull kotlinx.coroutines.debug.internal.e r2) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                return
        }

        private final kotlinx.coroutines.debug.internal.k b() {
                r1 = this;
                kotlinx.coroutines.debug.internal.e r0 = r1.b
                kotlinx.coroutines.debug.internal.k r0 = r0.c()
                return r0
        }

        @Override // kotlin.coroutines.jvm.internal.c
        @org.jetbrains.annotations.Nullable
        public kotlin.coroutines.jvm.internal.c getCallerFrame() {
                r1 = this;
                kotlinx.coroutines.debug.internal.k r0 = r1.b()
                if (r0 == 0) goto Lb
                kotlin.coroutines.jvm.internal.c r0 = r0.getCallerFrame()
                return r0
            Lb:
                r0 = 0
                return r0
        }

        @Override // kotlin.coroutines.e
        @org.jetbrains.annotations.NotNull
        public kotlin.coroutines.i getContext() {
                r1 = this;
                kotlin.coroutines.e<T> r0 = r1.a
                kotlin.coroutines.i r0 = r0.getContext()
                return r0
        }

        @Override // kotlin.coroutines.jvm.internal.c
        @org.jetbrains.annotations.Nullable
        public java.lang.StackTraceElement getStackTraceElement() {
                r1 = this;
                kotlinx.coroutines.debug.internal.k r0 = r1.b()
                if (r0 == 0) goto Lb
                java.lang.StackTraceElement r0 = r0.getStackTraceElement()
                return r0
            Lb:
                r0 = 0
                return r0
        }

        @Override // kotlin.coroutines.e
        public void resumeWith(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
                r1 = this;
                kotlinx.coroutines.debug.internal.DebugProbesImpl r0 = kotlinx.coroutines.debug.internal.DebugProbesImpl.a
                kotlinx.coroutines.debug.internal.DebugProbesImpl.c(r0, r1)
                kotlin.coroutines.e<T> r0 = r1.a
                r0.resumeWith(r2)
                return
        }

        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
                r1 = this;
                kotlin.coroutines.e<T> r0 = r1.a
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class b {

        @org.jetbrains.annotations.NotNull
        private static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater a = null;

        @kotlin.jvm.Volatile
        private volatile int installations;

        static {
                java.lang.Class<kotlinx.coroutines.debug.internal.DebugProbesImpl$b> r0 = kotlinx.coroutines.debug.internal.DebugProbesImpl.b.class
                java.lang.String r1 = "installations"
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
                kotlinx.coroutines.debug.internal.DebugProbesImpl.b.a = r0
                return
        }

        private b() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ b(kotlin.jvm.internal.v r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater a() {
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.debug.internal.DebugProbesImpl.b.a
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class c {

        @org.jetbrains.annotations.NotNull
        private static final java.util.concurrent.atomic.AtomicLongFieldUpdater a = null;

        @kotlin.jvm.Volatile
        private volatile long sequenceNumber;

        static {
                java.lang.Class<kotlinx.coroutines.debug.internal.DebugProbesImpl$c> r0 = kotlinx.coroutines.debug.internal.DebugProbesImpl.c.class
                java.lang.String r1 = "sequenceNumber"
                java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(r0, r1)
                kotlinx.coroutines.debug.internal.DebugProbesImpl.c.a = r0
                return
        }

        private c() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ c(kotlin.jvm.internal.v r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater a() {
                java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = kotlinx.coroutines.debug.internal.DebugProbesImpl.c.a
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 DebugProbesImpl.kt\nkotlinx/coroutines/debug/internal/DebugProbesImpl\n*L\n1#1,328:1\n154#2:329\n*E\n"})
    public static final class d<T> implements java.util.Comparator {
        public d() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.util.Comparator
        public final int compare(T r3, T r4) {
                r2 = this;
                kotlinx.coroutines.debug.internal.DebugProbesImpl$a r3 = (kotlinx.coroutines.debug.internal.DebugProbesImpl.a) r3
                kotlinx.coroutines.debug.internal.e r3 = r3.b
                long r0 = r3.b
                java.lang.Long r3 = java.lang.Long.valueOf(r0)
                kotlinx.coroutines.debug.internal.DebugProbesImpl$a r4 = (kotlinx.coroutines.debug.internal.DebugProbesImpl.a) r4
                kotlinx.coroutines.debug.internal.e r4 = r4.b
                long r0 = r4.b
                java.lang.Long r4 = java.lang.Long.valueOf(r0)
                int r3 = kotlin.comparisons.a.l(r3, r4)
                return r3
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 DebugProbesImpl.kt\nkotlinx/coroutines/debug/internal/DebugProbesImpl\n*L\n1#1,328:1\n287#2:329\n*E\n"})
    public static final class e<T> implements java.util.Comparator {
        public e() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.util.Comparator
        public final int compare(T r3, T r4) {
                r2 = this;
                kotlinx.coroutines.debug.internal.DebugProbesImpl$a r3 = (kotlinx.coroutines.debug.internal.DebugProbesImpl.a) r3
                kotlinx.coroutines.debug.internal.e r3 = r3.b
                long r0 = r3.b
                java.lang.Long r3 = java.lang.Long.valueOf(r0)
                kotlinx.coroutines.debug.internal.DebugProbesImpl$a r4 = (kotlinx.coroutines.debug.internal.DebugProbesImpl.a) r4
                kotlinx.coroutines.debug.internal.e r4 = r4.b
                long r0 = r4.b
                java.lang.Long r4 = java.lang.Long.valueOf(r0)
                int r3 = kotlin.comparisons.a.l(r3, r4)
                return r3
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class f extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<kotlinx.coroutines.debug.internal.DebugProbesImpl.a<?>, java.lang.Boolean> {
        public static final kotlinx.coroutines.debug.internal.DebugProbesImpl.f a = null;

        static {
                kotlinx.coroutines.debug.internal.DebugProbesImpl$f r0 = new kotlinx.coroutines.debug.internal.DebugProbesImpl$f
                r0.<init>()
                kotlinx.coroutines.debug.internal.DebugProbesImpl.f.a = r0
                return
        }

        f() {
                r1 = this;
                r0 = 1
                r1.<init>(r0)
                return
        }

        @org.jetbrains.annotations.NotNull
        public final java.lang.Boolean a(@org.jetbrains.annotations.NotNull kotlinx.coroutines.debug.internal.DebugProbesImpl.a<?> r2) {
                r1 = this;
                kotlinx.coroutines.debug.internal.DebugProbesImpl r0 = kotlinx.coroutines.debug.internal.DebugProbesImpl.a
                boolean r2 = kotlinx.coroutines.debug.internal.DebugProbesImpl.b(r0, r2)
                r2 = r2 ^ 1
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
                return r2
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ java.lang.Boolean invoke(kotlinx.coroutines.debug.internal.DebugProbesImpl.a<?> r1) {
                r0 = this;
                kotlinx.coroutines.debug.internal.DebugProbesImpl$a r1 = (kotlinx.coroutines.debug.internal.DebugProbesImpl.a) r1
                java.lang.Boolean r1 = r0.a(r1)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class g extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<kotlin.n1> {
        public static final kotlinx.coroutines.debug.internal.DebugProbesImpl.g a = null;

        static {
                kotlinx.coroutines.debug.internal.DebugProbesImpl$g r0 = new kotlinx.coroutines.debug.internal.DebugProbesImpl$g
                r0.<init>()
                kotlinx.coroutines.debug.internal.DebugProbesImpl.g.a = r0
                return
        }

        g() {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                return
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ kotlin.n1 invoke() {
                r1 = this;
                r1.invoke2()
                kotlin.n1 r0 = kotlin.n1.a
                return r0
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
                r1 = this;
                kotlinx.coroutines.debug.internal.b r0 = kotlinx.coroutines.debug.internal.DebugProbesImpl.a()
                r0.m()
                return
        }
    }

    static {
            kotlinx.coroutines.debug.internal.DebugProbesImpl r0 = new kotlinx.coroutines.debug.internal.DebugProbesImpl
            r0.<init>()
            kotlinx.coroutines.debug.internal.DebugProbesImpl.a = r0
            _COROUTINE.a r1 = new _COROUTINE.a
            r1.<init>()
            java.lang.StackTraceElement r1 = r1.b()
            kotlinx.coroutines.debug.internal.DebugProbesImpl.b = r1
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat
            java.lang.String r2 = "yyyy/MM/dd HH:mm:ss"
            r1.<init>(r2)
            kotlinx.coroutines.debug.internal.DebugProbesImpl.c = r1
            kotlinx.coroutines.debug.internal.b r1 = new kotlinx.coroutines.debug.internal.b
            r2 = 0
            r3 = 1
            r4 = 0
            r1.<init>(r2, r3, r4)
            kotlinx.coroutines.debug.internal.DebugProbesImpl.e = r1
            kotlinx.coroutines.debug.internal.DebugProbesImpl.f = r3
            kotlinx.coroutines.debug.internal.DebugProbesImpl.g = r3
            kotlinx.coroutines.debug.internal.DebugProbesImpl.h = r3
            kotlin.jvm.functions.Function1 r0 = r0.t()
            kotlinx.coroutines.debug.internal.DebugProbesImpl.i = r0
            kotlinx.coroutines.debug.internal.b r0 = new kotlinx.coroutines.debug.internal.b
            r0.<init>(r3)
            kotlinx.coroutines.debug.internal.DebugProbesImpl.j = r0
            kotlinx.coroutines.debug.internal.DebugProbesImpl$b r0 = new kotlinx.coroutines.debug.internal.DebugProbesImpl$b
            r0.<init>(r4)
            kotlinx.coroutines.debug.internal.DebugProbesImpl.k = r0
            kotlinx.coroutines.debug.internal.DebugProbesImpl$c r0 = new kotlinx.coroutines.debug.internal.DebugProbesImpl$c
            r0.<init>(r4)
            kotlinx.coroutines.debug.internal.DebugProbesImpl.l = r0
            return
    }

    private DebugProbesImpl() {
            r0 = this;
            r0.<init>()
            return
    }

    private final boolean B(java.lang.StackTraceElement r5) {
            r4 = this;
            java.lang.String r5 = r5.getClassName()
            r0 = 2
            r1 = 0
            java.lang.String r2 = "kotlinx.coroutines"
            r3 = 0
            boolean r5 = kotlin.text.u.H2(r5, r2, r3, r0, r1)
            return r5
    }

    private final kotlinx.coroutines.debug.internal.DebugProbesImpl.a<?> C(kotlin.coroutines.e<?> r3) {
            r2 = this;
            boolean r0 = r3 instanceof kotlin.coroutines.jvm.internal.c
            r1 = 0
            if (r0 == 0) goto L8
            kotlin.coroutines.jvm.internal.c r3 = (kotlin.coroutines.jvm.internal.c) r3
            goto L9
        L8:
            r3 = r1
        L9:
            if (r3 == 0) goto L10
            kotlinx.coroutines.debug.internal.DebugProbesImpl$a r3 = r2.D(r3)
            return r3
        L10:
            return r1
    }

    private final kotlinx.coroutines.debug.internal.DebugProbesImpl.a<?> D(kotlin.coroutines.jvm.internal.c r2) {
            r1 = this;
        L0:
            boolean r0 = r2 instanceof kotlinx.coroutines.debug.internal.DebugProbesImpl.a
            if (r0 == 0) goto L7
            kotlinx.coroutines.debug.internal.DebugProbesImpl$a r2 = (kotlinx.coroutines.debug.internal.DebugProbesImpl.a) r2
            return r2
        L7:
            kotlin.coroutines.jvm.internal.c r2 = r2.getCallerFrame()
            if (r2 == 0) goto Le
            goto L0
        Le:
            r2 = 0
            return r2
    }

    private final void E(java.io.PrintStream r2, java.util.List<java.lang.StackTraceElement> r3) {
            r1 = this;
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
        L6:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L19
            java.lang.Object r0 = r3.next()
            java.lang.StackTraceElement r0 = (java.lang.StackTraceElement) r0
            java.util.Objects.toString(r0)
            r2.getClass()
            goto L6
        L19:
            return
    }

    private final void F(kotlinx.coroutines.debug.internal.DebugProbesImpl.a<?> r2) {
            r1 = this;
            kotlinx.coroutines.debug.internal.b<kotlinx.coroutines.debug.internal.DebugProbesImpl$a<?>, java.lang.Boolean> r0 = kotlinx.coroutines.debug.internal.DebugProbesImpl.e
            r0.remove(r2)
            kotlinx.coroutines.debug.internal.e r2 = r2.b
            kotlin.coroutines.jvm.internal.c r2 = r2.e()
            if (r2 == 0) goto L19
            kotlin.coroutines.jvm.internal.c r2 = r1.J(r2)
            if (r2 != 0) goto L14
            goto L19
        L14:
            kotlinx.coroutines.debug.internal.b<kotlin.coroutines.jvm.internal.c, kotlinx.coroutines.debug.internal.e> r0 = kotlinx.coroutines.debug.internal.DebugProbesImpl.j
            r0.remove(r2)
        L19:
            return
    }

    private final kotlin.coroutines.jvm.internal.c J(kotlin.coroutines.jvm.internal.c r2) {
            r1 = this;
        L0:
            kotlin.coroutines.jvm.internal.c r2 = r2.getCallerFrame()
            if (r2 != 0) goto L8
            r2 = 0
            return r2
        L8:
            java.lang.StackTraceElement r0 = r2.getStackTraceElement()
            if (r0 == 0) goto L0
            return r2
    }

    private final <T extends java.lang.Throwable> java.util.List<java.lang.StackTraceElement> K(T r8) {
            r7 = this;
            java.lang.StackTraceElement[] r8 = r8.getStackTrace()
            int r0 = r8.length
            int r1 = r8.length
            r2 = -1
            int r1 = r1 + r2
            if (r1 < 0) goto L21
        La:
            int r3 = r1 + (-1)
            r4 = r8[r1]
            java.lang.String r4 = r4.getClassName()
            java.lang.String r5 = "kotlin.coroutines.jvm.internal.DebugProbesKt"
            boolean r4 = kotlin.jvm.internal.g0.g(r4, r5)
            if (r4 == 0) goto L1c
            r2 = r1
            goto L21
        L1c:
            if (r3 >= 0) goto L1f
            goto L21
        L1f:
            r1 = r3
            goto La
        L21:
            r1 = 1
            int r2 = r2 + r1
            boolean r3 = kotlinx.coroutines.debug.internal.DebugProbesImpl.f
            if (r3 != 0) goto L3b
            int r0 = r0 - r2
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            r3 = 0
        L2e:
            if (r3 >= r0) goto L3a
            int r4 = r3 + r2
            r4 = r8[r4]
            r1.add(r4)
            int r3 = r3 + 1
            goto L2e
        L3a:
            return r1
        L3b:
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = r0 - r2
            int r4 = r4 + r1
            r3.<init>(r4)
        L43:
            if (r2 >= r0) goto L89
            r1 = r8[r2]
            boolean r1 = r7.B(r1)
            if (r1 == 0) goto L81
            r1 = r8[r2]
            r3.add(r1)
            int r1 = r2 + 1
        L54:
            if (r1 >= r0) goto L61
            r4 = r8[r1]
            boolean r4 = r7.B(r4)
            if (r4 == 0) goto L61
            int r1 = r1 + 1
            goto L54
        L61:
            int r4 = r1 + (-1)
            r5 = r4
        L64:
            if (r5 <= r2) goto L71
            r6 = r8[r5]
            java.lang.String r6 = r6.getFileName()
            if (r6 != 0) goto L71
            int r5 = r5 + (-1)
            goto L64
        L71:
            if (r5 <= r2) goto L7a
            if (r5 >= r4) goto L7a
            r2 = r8[r5]
            r3.add(r2)
        L7a:
            r2 = r8[r4]
            r3.add(r2)
            r2 = r1
            goto L43
        L81:
            r1 = r8[r2]
            r3.add(r1)
            int r2 = r2 + 1
            goto L43
        L89:
            return r3
    }

    private final void O() {
            r8 = this;
            kotlinx.coroutines.debug.internal.DebugProbesImpl$g r5 = kotlinx.coroutines.debug.internal.DebugProbesImpl.g.a
            r6 = 21
            r7 = 0
            r0 = 0
            r1 = 1
            r2 = 0
            java.lang.String r3 = "Coroutines Debugger Cleaner"
            r4 = 0
            java.lang.Thread r0 = kotlin.concurrent.b.c(r0, r1, r2, r3, r4, r5, r6, r7)
            kotlinx.coroutines.debug.internal.DebugProbesImpl.d = r0
            return
    }

    private final void P() {
            r2 = this;
            java.lang.Thread r0 = kotlinx.coroutines.debug.internal.DebugProbesImpl.d
            if (r0 != 0) goto L5
            return
        L5:
            r1 = 0
            kotlinx.coroutines.debug.internal.DebugProbesImpl.d = r1
            r0.interrupt()
            r0.join()
            return
    }

    private final kotlinx.coroutines.debug.internal.k Q(java.util.List<java.lang.StackTraceElement> r4) {
            r3 = this;
            boolean r0 = r4.isEmpty()
            r1 = 0
            if (r0 != 0) goto L22
            int r0 = r4.size()
            java.util.ListIterator r4 = r4.listIterator(r0)
        Lf:
            boolean r0 = r4.hasPrevious()
            if (r0 == 0) goto L22
            java.lang.Object r0 = r4.previous()
            java.lang.StackTraceElement r0 = (java.lang.StackTraceElement) r0
            kotlinx.coroutines.debug.internal.k r2 = new kotlinx.coroutines.debug.internal.k
            r2.<init>(r1, r0)
            r1 = r2
            goto Lf
        L22:
            java.lang.StackTraceElement r4 = kotlinx.coroutines.debug.internal.DebugProbesImpl.b
            kotlinx.coroutines.debug.internal.k r0 = new kotlinx.coroutines.debug.internal.k
            r0.<init>(r1, r4)
            return r0
    }

    private final java.lang.String R(java.lang.Object r1) {
            r0 = this;
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = kotlinx.coroutines.debug.internal.g.a(r1)
            return r1
    }

    private final void T(kotlin.coroutines.jvm.internal.c r5, java.lang.String r6) {
            r4 = this;
            boolean r0 = r4.A()
            if (r0 != 0) goto L7
            goto L45
        L7:
            kotlinx.coroutines.debug.internal.b<kotlin.coroutines.jvm.internal.c, kotlinx.coroutines.debug.internal.e> r0 = kotlinx.coroutines.debug.internal.DebugProbesImpl.j
            java.lang.Object r1 = r0.remove(r5)
            kotlinx.coroutines.debug.internal.e r1 = (kotlinx.coroutines.debug.internal.e) r1
            if (r1 == 0) goto L13
            r2 = 0
            goto L30
        L13:
            kotlinx.coroutines.debug.internal.DebugProbesImpl$a r1 = r4.D(r5)
            if (r1 == 0) goto L45
            kotlinx.coroutines.debug.internal.e r1 = r1.b
            if (r1 != 0) goto L1e
            goto L45
        L1e:
            kotlin.coroutines.jvm.internal.c r2 = r1.e()
            if (r2 == 0) goto L29
            kotlin.coroutines.jvm.internal.c r2 = r4.J(r2)
            goto L2a
        L29:
            r2 = 0
        L2a:
            if (r2 == 0) goto L2f
            r0.remove(r2)
        L2f:
            r2 = 1
        L30:
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.coroutines.Continuation<*>"
            kotlin.jvm.internal.g0.n(r5, r3)
            r3 = r5
            kotlin.coroutines.e r3 = (kotlin.coroutines.e) r3
            r1.i(r6, r3, r2)
            kotlin.coroutines.jvm.internal.c r5 = r4.J(r5)
            if (r5 != 0) goto L42
            goto L45
        L42:
            r0.put(r5, r1)
        L45:
            return
    }

    private final void U(kotlin.coroutines.e<?> r3, java.lang.String r4) {
            r2 = this;
            boolean r0 = r2.A()
            if (r0 != 0) goto L7
            goto L31
        L7:
            boolean r0 = kotlinx.coroutines.debug.internal.DebugProbesImpl.h
            if (r0 == 0) goto L14
            kotlin.coroutines.i r0 = r3.getContext()
            kotlin.coroutines.EmptyCoroutineContext r1 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            if (r0 != r1) goto L14
            goto L31
        L14:
            java.lang.String r0 = "RUNNING"
            boolean r0 = kotlin.jvm.internal.g0.g(r4, r0)
            if (r0 == 0) goto L2b
            boolean r0 = r3 instanceof kotlin.coroutines.jvm.internal.c
            if (r0 == 0) goto L23
            kotlin.coroutines.jvm.internal.c r3 = (kotlin.coroutines.jvm.internal.c) r3
            goto L24
        L23:
            r3 = 0
        L24:
            if (r3 != 0) goto L27
            goto L31
        L27:
            r2.T(r3, r4)
            return
        L2b:
            kotlinx.coroutines.debug.internal.DebugProbesImpl$a r0 = r2.C(r3)
            if (r0 != 0) goto L32
        L31:
            return
        L32:
            r2.V(r0, r3, r4)
            return
    }

    private final void V(kotlinx.coroutines.debug.internal.DebugProbesImpl.a<?> r2, kotlin.coroutines.e<?> r3, java.lang.String r4) {
            r1 = this;
            boolean r0 = r1.A()
            if (r0 != 0) goto L7
            return
        L7:
            kotlinx.coroutines.debug.internal.e r2 = r2.b
            r0 = 1
            r2.i(r4, r3, r0)
            return
    }

    public static final /* synthetic */ kotlinx.coroutines.debug.internal.b a() {
            kotlinx.coroutines.debug.internal.b<kotlin.coroutines.jvm.internal.c, kotlinx.coroutines.debug.internal.e> r0 = kotlinx.coroutines.debug.internal.DebugProbesImpl.j
            return r0
    }

    public static final /* synthetic */ boolean b(kotlinx.coroutines.debug.internal.DebugProbesImpl r0, kotlinx.coroutines.debug.internal.DebugProbesImpl.a r1) {
            boolean r0 = r0.z(r1)
            return r0
    }

    public static final /* synthetic */ void c(kotlinx.coroutines.debug.internal.DebugProbesImpl r0, kotlinx.coroutines.debug.internal.DebugProbesImpl.a r1) {
            r0.F(r1)
            return
    }

    private final void d(kotlinx.coroutines.e2 r7, java.util.Map<kotlinx.coroutines.e2, kotlinx.coroutines.debug.internal.e> r8, java.lang.StringBuilder r9, java.lang.String r10) {
            r6 = this;
            java.lang.Object r0 = r8.get(r7)
            kotlinx.coroutines.debug.internal.e r0 = (kotlinx.coroutines.debug.internal.e) r0
            r1 = 9
            r2 = 10
            if (r0 != 0) goto L39
            boolean r0 = r7 instanceof kotlinx.coroutines.internal.o0
            if (r0 != 0) goto L7f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r10)
            java.lang.String r3 = r6.r(r7)
            r0.append(r3)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r9.append(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r10)
            r0.append(r1)
            java.lang.String r10 = r0.toString()
            goto L7f
        L39:
            java.util.List r3 = r0.g()
            java.lang.Object r3 = kotlin.collections.f0.L2(r3)
            java.lang.StackTraceElement r3 = (java.lang.StackTraceElement) r3
            java.lang.String r0 = r0.f()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r10)
            java.lang.String r5 = r6.r(r7)
            r4.append(r5)
            java.lang.String r5 = ", continuation is "
            r4.append(r5)
            r4.append(r0)
            java.lang.String r0 = " at line "
            r4.append(r0)
            r4.append(r3)
            r4.append(r2)
            java.lang.String r0 = r4.toString()
            r9.append(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r10)
            r0.append(r1)
            java.lang.String r10 = r0.toString()
        L7f:
            kotlin.sequences.m r7 = r7.E()
            java.util.Iterator r7 = r7.iterator()
        L87:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L97
            java.lang.Object r0 = r7.next()
            kotlinx.coroutines.e2 r0 = (kotlinx.coroutines.e2) r0
            r6.d(r0, r8, r9, r10)
            goto L87
        L97:
            return
    }

    private final <T> kotlin.coroutines.e<T> e(kotlin.coroutines.e<? super T> r5, kotlinx.coroutines.debug.internal.k r6) {
            r4 = this;
            boolean r0 = r4.A()
            if (r0 != 0) goto L7
            return r5
        L7:
            kotlinx.coroutines.debug.internal.e r0 = new kotlinx.coroutines.debug.internal.e
            kotlin.coroutines.i r1 = r5.getContext()
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = kotlinx.coroutines.debug.internal.DebugProbesImpl.c.a()
            kotlinx.coroutines.debug.internal.DebugProbesImpl$c r3 = kotlinx.coroutines.debug.internal.DebugProbesImpl.l
            long r2 = r2.incrementAndGet(r3)
            r0.<init>(r1, r6, r2)
            kotlinx.coroutines.debug.internal.DebugProbesImpl$a r6 = new kotlinx.coroutines.debug.internal.DebugProbesImpl$a
            r6.<init>(r5, r0)
            kotlinx.coroutines.debug.internal.b<kotlinx.coroutines.debug.internal.DebugProbesImpl$a<?>, java.lang.Boolean> r5 = kotlinx.coroutines.debug.internal.DebugProbesImpl.e
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r5.put(r6, r0)
            boolean r0 = r4.A()
            if (r0 != 0) goto L2f
            r5.clear()
        L2f:
            return r6
    }

    private final <R> java.util.List<R> i(kotlin.jvm.functions.Function2<? super kotlinx.coroutines.debug.internal.DebugProbesImpl.a<?>, ? super kotlin.coroutines.i, ? extends R> r3) {
            r2 = this;
            boolean r0 = r2.A()
            if (r0 == 0) goto L25
            java.util.Set r0 = r2.q()
            kotlin.sequences.m r0 = kotlin.collections.f0.E1(r0)
            kotlinx.coroutines.debug.internal.DebugProbesImpl$d r1 = new kotlinx.coroutines.debug.internal.DebugProbesImpl$d
            r1.<init>()
            kotlin.sequences.m r0 = kotlin.sequences.p.q3(r0, r1)
            kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpCoroutinesInfoImpl$3 r1 = new kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpCoroutinesInfoImpl$3
            r1.<init>(r3)
            kotlin.sequences.m r3 = kotlin.sequences.p.S1(r0, r1)
            java.util.List r3 = kotlin.sequences.p.I3(r3)
            return r3
        L25:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "Debug probes are not installed"
            r3.<init>(r0)
            throw r3
    }

    private final void j(java.io.PrintStream r9) {
            r8 = this;
            boolean r0 = r8.A()
            if (r0 == 0) goto L8f
            java.text.SimpleDateFormat r0 = kotlinx.coroutines.debug.internal.DebugProbesImpl.c
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r0.format(r1)
            r9.getClass()
            java.util.Set r0 = r8.q()
            kotlin.sequences.m r0 = kotlin.collections.f0.E1(r0)
            kotlinx.coroutines.debug.internal.DebugProbesImpl$f r1 = kotlinx.coroutines.debug.internal.DebugProbesImpl.f.a
            kotlin.sequences.m r0 = kotlin.sequences.p.P0(r0, r1)
            kotlinx.coroutines.debug.internal.DebugProbesImpl$e r1 = new kotlinx.coroutines.debug.internal.DebugProbesImpl$e
            r1.<init>()
            kotlin.sequences.m r0 = kotlin.sequences.p.q3(r0, r1)
            java.util.Iterator r0 = r0.iterator()
        L31:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L8e
            java.lang.Object r1 = r0.next()
            kotlinx.coroutines.debug.internal.DebugProbesImpl$a r1 = (kotlinx.coroutines.debug.internal.DebugProbesImpl.a) r1
            kotlinx.coroutines.debug.internal.e r2 = r1.b
            java.util.List r3 = r2.g()
            kotlinx.coroutines.debug.internal.DebugProbesImpl r4 = kotlinx.coroutines.debug.internal.DebugProbesImpl.a
            java.lang.String r5 = r2.f()
            java.lang.Thread r6 = r2.lastObservedThread
            java.util.List r5 = r4.n(r5, r6, r3)
            java.lang.String r6 = r2.f()
            java.lang.String r7 = "RUNNING"
            boolean r6 = kotlin.jvm.internal.g0.g(r6, r7)
            if (r6 == 0) goto L6f
            if (r5 != r3) goto L6f
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = r2.f()
            r6.append(r7)
            java.lang.String r7 = " (Last suspension stacktrace, not an actual stacktrace)"
            r6.append(r7)
            goto L72
        L6f:
            r2.f()
        L72:
            kotlin.coroutines.e<T> r1 = r1.a
            java.util.Objects.toString(r1)
            boolean r1 = r3.isEmpty()
            if (r1 == 0) goto L8a
            java.lang.StackTraceElement r1 = kotlinx.coroutines.debug.internal.DebugProbesImpl.b
            java.util.Objects.toString(r1)
            java.util.List r1 = r2.d()
            r4.E(r9, r1)
            goto L31
        L8a:
            r4.E(r9, r5)
            goto L31
        L8e:
            return
        L8f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "Debug probes are not installed"
            r9.<init>(r0)
            throw r9
    }

    private final java.util.List<java.lang.StackTraceElement> n(java.lang.String r7, java.lang.Thread r8, java.util.List<java.lang.StackTraceElement> r9) {
            r6 = this;
            java.lang.String r0 = "RUNNING"
            boolean r7 = kotlin.jvm.internal.g0.g(r7, r0)
            if (r7 == 0) goto La7
            if (r8 != 0) goto Lc
            goto La7
        Lc:
            kotlin.Result$a r7 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L17
            java.lang.StackTraceElement[] r7 = r8.getStackTrace()     // Catch: java.lang.Throwable -> L17
            java.lang.Object r7 = kotlin.Result.m11constructorimpl(r7)     // Catch: java.lang.Throwable -> L17
            goto L22
        L17:
            r7 = move-exception
            kotlin.Result$a r8 = kotlin.Result.Companion
            java.lang.Object r7 = kotlin.g0.a(r7)
            java.lang.Object r7 = kotlin.Result.m11constructorimpl(r7)
        L22:
            boolean r8 = kotlin.Result.m17isFailureimpl(r7)
            if (r8 == 0) goto L29
            r7 = 0
        L29:
            java.lang.StackTraceElement[] r7 = (java.lang.StackTraceElement[]) r7
            if (r7 != 0) goto L2f
            goto La7
        L2f:
            int r8 = r7.length
            r0 = 0
            r1 = 0
        L32:
            r2 = -1
            if (r1 >= r8) goto L5f
            r3 = r7[r1]
            java.lang.String r4 = r3.getClassName()
            java.lang.String r5 = "kotlin.coroutines.jvm.internal.BaseContinuationImpl"
            boolean r4 = kotlin.jvm.internal.g0.g(r4, r5)
            if (r4 == 0) goto L5c
            java.lang.String r4 = r3.getMethodName()
            java.lang.String r5 = "resumeWith"
            boolean r4 = kotlin.jvm.internal.g0.g(r4, r5)
            if (r4 == 0) goto L5c
            java.lang.String r3 = r3.getFileName()
            java.lang.String r4 = "ContinuationImpl.kt"
            boolean r3 = kotlin.jvm.internal.g0.g(r3, r4)
            if (r3 == 0) goto L5c
            goto L60
        L5c:
            int r1 = r1 + 1
            goto L32
        L5f:
            r1 = -1
        L60:
            kotlin.Pair r8 = r6.o(r1, r7, r9)
            java.lang.Object r3 = r8.component1()
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            java.lang.Object r8 = r8.component2()
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            if (r3 != r2) goto L7b
            goto La7
        L7b:
            int r2 = r9.size()
            int r2 = r2 + r1
            int r2 = r2 - r3
            int r2 = r2 + (-1)
            int r2 = r2 - r8
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r2)
            int r1 = r1 - r8
        L8a:
            if (r0 >= r1) goto L94
            r8 = r7[r0]
            r4.add(r8)
            int r0 = r0 + 1
            goto L8a
        L94:
            int r3 = r3 + 1
            int r7 = r9.size()
        L9a:
            if (r3 >= r7) goto La6
            java.lang.Object r8 = r9.get(r3)
            r4.add(r8)
            int r3 = r3 + 1
            goto L9a
        La6:
            return r4
        La7:
            return r9
    }

    private final kotlin.Pair<java.lang.Integer, java.lang.Integer> o(int r6, java.lang.StackTraceElement[] r7, java.util.List<java.lang.StackTraceElement> r8) {
            r5 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = -1
            r3 = 3
            if (r1 >= r3) goto L21
            kotlinx.coroutines.debug.internal.DebugProbesImpl r3 = kotlinx.coroutines.debug.internal.DebugProbesImpl.a
            int r4 = r6 + (-1)
            int r4 = r4 - r1
            int r3 = r3.p(r4, r7, r8)
            if (r3 == r2) goto L1e
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r1)
            kotlin.Pair r6 = kotlin.o0.a(r6, r7)
            return r6
        L1e:
            int r1 = r1 + 1
            goto L2
        L21:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            kotlin.Pair r6 = kotlin.o0.a(r6, r7)
            return r6
    }

    private final int p(int r5, java.lang.StackTraceElement[] r6, java.util.List<java.lang.StackTraceElement> r7) {
            r4 = this;
            java.lang.Object r5 = kotlin.collections.n.hf(r6, r5)
            java.lang.StackTraceElement r5 = (java.lang.StackTraceElement) r5
            r6 = -1
            if (r5 != 0) goto La
            return r6
        La:
            java.util.Iterator r7 = r7.iterator()
            r0 = 0
        Lf:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L49
            java.lang.Object r1 = r7.next()
            java.lang.StackTraceElement r1 = (java.lang.StackTraceElement) r1
            java.lang.String r2 = r1.getFileName()
            java.lang.String r3 = r5.getFileName()
            boolean r2 = kotlin.jvm.internal.g0.g(r2, r3)
            if (r2 == 0) goto L46
            java.lang.String r2 = r1.getClassName()
            java.lang.String r3 = r5.getClassName()
            boolean r2 = kotlin.jvm.internal.g0.g(r2, r3)
            if (r2 == 0) goto L46
            java.lang.String r1 = r1.getMethodName()
            java.lang.String r2 = r5.getMethodName()
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r2)
            if (r1 == 0) goto L46
            return r0
        L46:
            int r0 = r0 + 1
            goto Lf
        L49:
            return r6
    }

    private final java.util.Set<kotlinx.coroutines.debug.internal.DebugProbesImpl.a<?>> q() {
            r1 = this;
            kotlinx.coroutines.debug.internal.b<kotlinx.coroutines.debug.internal.DebugProbesImpl$a<?>, java.lang.Boolean> r0 = kotlinx.coroutines.debug.internal.DebugProbesImpl.e
            java.util.Set r0 = r0.keySet()
            return r0
    }

    private final java.lang.String r(kotlinx.coroutines.e2 r2) {
            r1 = this;
            boolean r0 = r2 instanceof kotlinx.coroutines.l2
            if (r0 == 0) goto Lb
            kotlinx.coroutines.l2 r2 = (kotlinx.coroutines.l2) r2
            java.lang.String r2 = r2.p1()
            return r2
        Lb:
            java.lang.String r2 = r2.toString()
            return r2
    }

    private static /* synthetic */ void s(kotlinx.coroutines.e2 r0) {
            return
    }

    private final kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.n1> t() {
            r3 = this;
            r0 = 0
            kotlin.Result$a r1 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L25
            java.lang.String r1 = "kotlinx.coroutines.debug.internal.ByteBuddyDynamicAttach"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L25
            java.lang.reflect.Constructor[] r1 = r1.getConstructors()     // Catch: java.lang.Throwable -> L25
            r2 = 0
            r1 = r1[r2]     // Catch: java.lang.Throwable -> L25
            java.lang.Object r1 = r1.newInstance(r0)     // Catch: java.lang.Throwable -> L25
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.Function1<kotlin.Boolean, kotlin.Unit>"
            kotlin.jvm.internal.g0.n(r1, r2)     // Catch: java.lang.Throwable -> L25
            r2 = 1
            java.lang.Object r1 = kotlin.jvm.internal.u0.q(r1, r2)     // Catch: java.lang.Throwable -> L25
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1     // Catch: java.lang.Throwable -> L25
            java.lang.Object r1 = kotlin.Result.m11constructorimpl(r1)     // Catch: java.lang.Throwable -> L25
            goto L30
        L25:
            r1 = move-exception
            kotlin.Result$a r2 = kotlin.Result.Companion
            java.lang.Object r1 = kotlin.g0.a(r1)
            java.lang.Object r1 = kotlin.Result.m11constructorimpl(r1)
        L30:
            boolean r2 = kotlin.Result.m17isFailureimpl(r1)
            if (r2 == 0) goto L37
            goto L38
        L37:
            r0 = r1
        L38:
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            return r0
    }

    private final boolean z(kotlinx.coroutines.debug.internal.DebugProbesImpl.a<?> r4) {
            r3 = this;
            kotlinx.coroutines.debug.internal.e r0 = r4.b
            kotlin.coroutines.i r0 = r0.getContext()
            r1 = 0
            if (r0 == 0) goto L22
            kotlinx.coroutines.e2$b r2 = kotlinx.coroutines.e2.s0
            kotlin.coroutines.i$b r0 = r0.get(r2)
            kotlinx.coroutines.e2 r0 = (kotlinx.coroutines.e2) r0
            if (r0 != 0) goto L14
            goto L22
        L14:
            boolean r0 = r0.isCompleted()
            if (r0 != 0) goto L1b
            return r1
        L1b:
            kotlinx.coroutines.debug.internal.b<kotlinx.coroutines.debug.internal.DebugProbesImpl$a<?>, java.lang.Boolean> r0 = kotlinx.coroutines.debug.internal.DebugProbesImpl.e
            r0.remove(r4)
            r4 = 1
            return r4
        L22:
            return r1
    }

    @kotlin.jvm.JvmName(name = "isInstalled$kotlinx_coroutines_debug")
    public final boolean A() {
            r2 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.debug.internal.DebugProbesImpl.b.a()
            kotlinx.coroutines.debug.internal.DebugProbesImpl$b r1 = kotlinx.coroutines.debug.internal.DebugProbesImpl.k
            int r0 = r0.get(r1)
            if (r0 <= 0) goto Le
            r0 = 1
            return r0
        Le:
            r0 = 0
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final <T> kotlin.coroutines.e<T> G(@org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super T> r3) {
            r2 = this;
            boolean r0 = r2.A()
            if (r0 != 0) goto L7
            goto L1a
        L7:
            boolean r0 = kotlinx.coroutines.debug.internal.DebugProbesImpl.h
            if (r0 == 0) goto L14
            kotlin.coroutines.i r0 = r3.getContext()
            kotlin.coroutines.EmptyCoroutineContext r1 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            if (r0 != r1) goto L14
            return r3
        L14:
            kotlinx.coroutines.debug.internal.DebugProbesImpl$a r0 = r2.C(r3)
            if (r0 == 0) goto L1b
        L1a:
            return r3
        L1b:
            boolean r0 = kotlinx.coroutines.debug.internal.DebugProbesImpl.g
            if (r0 == 0) goto L2d
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>()
            java.util.List r0 = r2.K(r0)
            kotlinx.coroutines.debug.internal.k r0 = r2.Q(r0)
            goto L2e
        L2d:
            r0 = 0
        L2e:
            kotlin.coroutines.e r3 = r2.e(r3, r0)
            return r3
    }

    public final void H(@org.jetbrains.annotations.NotNull kotlin.coroutines.e<?> r2) {
            r1 = this;
            java.lang.String r0 = "RUNNING"
            r1.U(r2, r0)
            return
    }

    public final void I(@org.jetbrains.annotations.NotNull kotlin.coroutines.e<?> r2) {
            r1 = this;
            java.lang.String r0 = "SUSPENDED"
            r1.U(r2, r0)
            return
    }

    public final void L(boolean r1) {
            r0 = this;
            kotlinx.coroutines.debug.internal.DebugProbesImpl.g = r1
            return
    }

    public final void M(boolean r1) {
            r0 = this;
            kotlinx.coroutines.debug.internal.DebugProbesImpl.h = r1
            return
    }

    public final void N(boolean r1) {
            r0 = this;
            kotlinx.coroutines.debug.internal.DebugProbesImpl.f = r1
            return
    }

    public final void S() {
            r2 = this;
            boolean r0 = r2.A()
            if (r0 == 0) goto L33
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.debug.internal.DebugProbesImpl.b.a()
            kotlinx.coroutines.debug.internal.DebugProbesImpl$b r1 = kotlinx.coroutines.debug.internal.DebugProbesImpl.k
            int r0 = r0.decrementAndGet(r1)
            if (r0 == 0) goto L13
            goto L32
        L13:
            r2.P()
            kotlinx.coroutines.debug.internal.b<kotlinx.coroutines.debug.internal.DebugProbesImpl$a<?>, java.lang.Boolean> r0 = kotlinx.coroutines.debug.internal.DebugProbesImpl.e
            r0.clear()
            kotlinx.coroutines.debug.internal.b<kotlin.coroutines.jvm.internal.c, kotlinx.coroutines.debug.internal.e> r0 = kotlinx.coroutines.debug.internal.DebugProbesImpl.j
            r0.clear()
            kotlinx.coroutines.debug.internal.a r0 = kotlinx.coroutines.debug.internal.a.a
            boolean r0 = r0.a()
            if (r0 == 0) goto L29
            goto L32
        L29:
            kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.n1> r0 = kotlinx.coroutines.debug.internal.DebugProbesImpl.i
            if (r0 == 0) goto L32
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.invoke(r1)
        L32:
            return
        L33:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Agent was not installed"
            r0.<init>(r1)
            throw r0
    }

    @kotlin.jvm.JvmName(name = "dumpCoroutines")
    public final void f(@org.jetbrains.annotations.NotNull java.io.PrintStream r2) {
            r1 = this;
            monitor-enter(r2)
            kotlinx.coroutines.debug.internal.DebugProbesImpl r0 = kotlinx.coroutines.debug.internal.DebugProbesImpl.a     // Catch: java.lang.Throwable -> La
            r0.j(r2)     // Catch: java.lang.Throwable -> La
            kotlin.n1 r0 = kotlin.n1.a     // Catch: java.lang.Throwable -> La
            monitor-exit(r2)
            return
        La:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<kotlinx.coroutines.debug.internal.d> g() {
            r2 = this;
            boolean r0 = r2.A()
            if (r0 == 0) goto L25
            java.util.Set r0 = r2.q()
            kotlin.sequences.m r0 = kotlin.collections.f0.E1(r0)
            kotlinx.coroutines.debug.internal.DebugProbesImpl$d r1 = new kotlinx.coroutines.debug.internal.DebugProbesImpl$d
            r1.<init>()
            kotlin.sequences.m r0 = kotlin.sequences.p.q3(r0, r1)
            kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpCoroutinesInfo$$inlined$dumpCoroutinesInfoImpl$1 r1 = new kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpCoroutinesInfo$$inlined$dumpCoroutinesInfoImpl$1
            r1.<init>()
            kotlin.sequences.m r0 = kotlin.sequences.p.S1(r0, r1)
            java.util.List r0 = kotlin.sequences.p.I3(r0)
            return r0
        L25:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Debug probes are not installed"
            r0.<init>(r1)
            throw r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.Object[] h() {
            r13 = this;
            java.util.List r0 = r13.g()
            int r1 = r0.size()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r1)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r1)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r1)
            java.util.Iterator r1 = r0.iterator()
        L1b:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto Lb9
            java.lang.Object r5 = r1.next()
            kotlinx.coroutines.debug.internal.d r5 = (kotlinx.coroutines.debug.internal.d) r5
            kotlin.coroutines.i r6 = r5.getContext()
            kotlinx.coroutines.q0$a r7 = kotlinx.coroutines.q0.b
            kotlin.coroutines.i$b r7 = r6.get(r7)
            kotlinx.coroutines.q0 r7 = (kotlinx.coroutines.q0) r7
            r8 = 0
            if (r7 == 0) goto L41
            java.lang.String r7 = r7.w()
            if (r7 == 0) goto L41
            java.lang.String r7 = r13.R(r7)
            goto L42
        L41:
            r7 = r8
        L42:
            kotlinx.coroutines.m0$a r9 = kotlinx.coroutines.m0.Key
            kotlin.coroutines.i$b r9 = r6.get(r9)
            kotlinx.coroutines.m0 r9 = (kotlinx.coroutines.m0) r9
            if (r9 == 0) goto L51
            java.lang.String r9 = r13.R(r9)
            goto L52
        L51:
            r9 = r8
        L52:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "\n                {\n                    \"name\": "
            r10.append(r11)
            r10.append(r7)
            java.lang.String r7 = ",\n                    \"id\": "
            r10.append(r7)
            kotlinx.coroutines.p0$a r7 = kotlinx.coroutines.p0.b
            kotlin.coroutines.i$b r6 = r6.get(r7)
            kotlinx.coroutines.p0 r6 = (kotlinx.coroutines.p0) r6
            if (r6 == 0) goto L76
            long r6 = r6.w()
            java.lang.Long r8 = java.lang.Long.valueOf(r6)
        L76:
            r10.append(r8)
            java.lang.String r6 = ",\n                    \"dispatcher\": "
            r10.append(r6)
            r10.append(r9)
            java.lang.String r6 = ",\n                    \"sequenceNumber\": "
            r10.append(r6)
            long r6 = r5.e()
            r10.append(r6)
            java.lang.String r6 = ",\n                    \"state\": \""
            r10.append(r6)
            java.lang.String r6 = r5.f()
            r10.append(r6)
            java.lang.String r6 = "\"\n                } \n                "
            r10.append(r6)
            java.lang.String r6 = r10.toString()
            java.lang.String r6 = kotlin.text.u.v(r6)
            r4.add(r6)
            kotlin.coroutines.jvm.internal.c r6 = r5.c()
            r3.add(r6)
            java.lang.Thread r5 = r5.d()
            r2.add(r5)
            goto L1b
        Lb9:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r5 = 91
            r1.append(r5)
            r11 = 63
            r12 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            java.lang.String r4 = kotlin.collections.f0.r3(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r1.append(r4)
            r4 = 93
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r4 = 0
            java.lang.Thread[] r5 = new java.lang.Thread[r4]
            java.lang.Object[] r2 = r2.toArray(r5)
            kotlin.coroutines.jvm.internal.c[] r5 = new kotlin.coroutines.jvm.internal.c[r4]
            java.lang.Object[] r3 = r3.toArray(r5)
            java.util.Collection r0 = (java.util.Collection) r0
            kotlinx.coroutines.debug.internal.d[] r5 = new kotlinx.coroutines.debug.internal.d[r4]
            java.lang.Object[] r0 = r0.toArray(r5)
            r5 = 4
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r4] = r1
            r1 = 1
            r5[r1] = r2
            r1 = 2
            r5[r1] = r3
            r1 = 3
            r5[r1] = r0
            return r5
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<kotlinx.coroutines.debug.internal.DebuggerInfo> k() {
            r2 = this;
            boolean r0 = r2.A()
            if (r0 == 0) goto L25
            java.util.Set r0 = r2.q()
            kotlin.sequences.m r0 = kotlin.collections.f0.E1(r0)
            kotlinx.coroutines.debug.internal.DebugProbesImpl$d r1 = new kotlinx.coroutines.debug.internal.DebugProbesImpl$d
            r1.<init>()
            kotlin.sequences.m r0 = kotlin.sequences.p.q3(r0, r1)
            kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpDebuggerInfo$$inlined$dumpCoroutinesInfoImpl$1 r1 = new kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpDebuggerInfo$$inlined$dumpCoroutinesInfoImpl$1
            r1.<init>()
            kotlin.sequences.m r0 = kotlin.sequences.p.S1(r0, r1)
            java.util.List r0 = kotlin.sequences.p.I3(r0)
            return r0
        L25:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Debug probes are not installed"
            r0.<init>(r1)
            throw r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.StackTraceElement> l(@org.jetbrains.annotations.NotNull kotlinx.coroutines.debug.internal.d r2, @org.jetbrains.annotations.NotNull java.util.List<java.lang.StackTraceElement> r3) {
            r1 = this;
            java.lang.String r0 = r2.f()
            java.lang.Thread r2 = r2.d()
            java.util.List r2 = r1.n(r0, r2, r3)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String m(@org.jetbrains.annotations.NotNull kotlinx.coroutines.debug.internal.d r10) {
            r9 = this;
            java.util.List r0 = r10.g()
            java.util.List r10 = r9.l(r10, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r10 = r10.iterator()
        L11:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L6b
            java.lang.Object r1 = r10.next()
            java.lang.StackTraceElement r1 = (java.lang.StackTraceElement) r1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "\n                {\n                    \"declaringClass\": \""
            r2.append(r3)
            java.lang.String r3 = r1.getClassName()
            r2.append(r3)
            java.lang.String r3 = "\",\n                    \"methodName\": \""
            r2.append(r3)
            java.lang.String r3 = r1.getMethodName()
            r2.append(r3)
            java.lang.String r3 = "\",\n                    \"fileName\": "
            r2.append(r3)
            java.lang.String r3 = r1.getFileName()
            if (r3 == 0) goto L4a
            java.lang.String r3 = r9.R(r3)
            goto L4b
        L4a:
            r3 = 0
        L4b:
            r2.append(r3)
            java.lang.String r3 = ",\n                    \"lineNumber\": "
            r2.append(r3)
            int r1 = r1.getLineNumber()
            r2.append(r1)
            java.lang.String r1 = "\n                }\n                "
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r1 = kotlin.text.u.v(r1)
            r0.add(r1)
            goto L11
        L6b:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r1 = 91
            r10.append(r1)
            r7 = 63
            r8 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            java.lang.String r0 = kotlin.collections.f0.r3(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            r10.append(r0)
            r0 = 93
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            return r10
    }

    public final boolean u() {
            r1 = this;
            boolean r0 = kotlinx.coroutines.debug.internal.DebugProbesImpl.g
            return r0
    }

    public final boolean v() {
            r1 = this;
            boolean r0 = kotlinx.coroutines.debug.internal.DebugProbesImpl.h
            return r0
    }

    public final boolean w() {
            r1 = this;
            boolean r0 = kotlinx.coroutines.debug.internal.DebugProbesImpl.f
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String x(@org.jetbrains.annotations.NotNull kotlinx.coroutines.e2 r6) {
            r5 = this;
            boolean r0 = r5.A()
            if (r0 == 0) goto L7d
            java.util.Set r0 = r5.q()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L13:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L32
            java.lang.Object r2 = r0.next()
            r3 = r2
            kotlinx.coroutines.debug.internal.DebugProbesImpl$a r3 = (kotlinx.coroutines.debug.internal.DebugProbesImpl.a) r3
            kotlin.coroutines.e<T> r3 = r3.a
            kotlin.coroutines.i r3 = r3.getContext()
            kotlinx.coroutines.e2$b r4 = kotlinx.coroutines.e2.s0
            kotlin.coroutines.i$b r3 = r3.get(r4)
            if (r3 == 0) goto L13
            r1.add(r2)
            goto L13
        L32:
            r0 = 10
            int r0 = kotlin.collections.f0.d0(r1, r0)
            int r0 = kotlin.collections.i1.j(r0)
            r2 = 16
            int r0 = kotlin.ranges.t.u(r0, r2)
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>(r0)
            java.util.Iterator r0 = r1.iterator()
        L4b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L67
            java.lang.Object r1 = r0.next()
            kotlinx.coroutines.debug.internal.DebugProbesImpl$a r1 = (kotlinx.coroutines.debug.internal.DebugProbesImpl.a) r1
            kotlin.coroutines.e<T> r3 = r1.a
            kotlin.coroutines.i r3 = r3.getContext()
            kotlinx.coroutines.e2 r3 = kotlinx.coroutines.h2.B(r3)
            kotlinx.coroutines.debug.internal.e r1 = r1.b
            r2.put(r3, r1)
            goto L4b
        L67:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            kotlinx.coroutines.debug.internal.DebugProbesImpl r1 = kotlinx.coroutines.debug.internal.DebugProbesImpl.a
            java.lang.String r3 = ""
            r1.d(r6, r2, r0, r3)
            java.lang.String r6 = r0.toString()
            java.lang.String r0 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.g0.o(r6, r0)
            return r6
        L7d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "Debug probes are not installed"
            r6.<init>(r0)
            throw r6
    }

    public final void y() {
            r2 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.debug.internal.DebugProbesImpl.b.a()
            kotlinx.coroutines.debug.internal.DebugProbesImpl$b r1 = kotlinx.coroutines.debug.internal.DebugProbesImpl.k
            int r0 = r0.incrementAndGet(r1)
            r1 = 1
            if (r0 <= r1) goto Le
            goto L23
        Le:
            r2.O()
            kotlinx.coroutines.debug.internal.a r0 = kotlinx.coroutines.debug.internal.a.a
            boolean r0 = r0.a()
            if (r0 == 0) goto L1a
            goto L23
        L1a:
            kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.n1> r0 = kotlinx.coroutines.debug.internal.DebugProbesImpl.i
            if (r0 == 0) goto L23
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r0.invoke(r1)
        L23:
            return
    }
}
