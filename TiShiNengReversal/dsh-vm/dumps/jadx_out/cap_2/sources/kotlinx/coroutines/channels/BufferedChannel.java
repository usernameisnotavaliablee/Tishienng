package kotlinx.coroutines.channels;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nBufferedChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannelKt\n+ 4 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 5 DispatchedTask.kt\nkotlinx/coroutines/DispatchedTaskKt\n+ 6 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n+ 7 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel$sendImpl$1\n+ 8 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel$receiveImpl$1\n+ 9 InlineList.kt\nkotlinx/coroutines/internal/InlineList\n+ 10 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListKt\n+ 11 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,3055:1\n273#1,6:3058\n280#1,68:3065\n374#1,18:3156\n244#1:3174\n269#1,10:3175\n280#1,48:3186\n395#1:3234\n334#1,14:3235\n399#1,3:3250\n244#1:3263\n269#1,10:3264\n280#1,68:3275\n244#1:3353\n269#1,10:3354\n280#1,68:3365\n244#1:3437\n269#1,10:3438\n280#1,68:3449\n886#1,52:3519\n964#1,8:3575\n858#1:3583\n882#1,33:3584\n974#1:3617\n916#1,14:3618\n935#1,3:3633\n979#1,6:3636\n886#1,52:3650\n964#1,8:3706\n858#1:3714\n882#1,33:3715\n974#1:3748\n916#1,14:3749\n935#1,3:3764\n979#1,6:3767\n858#1:3782\n882#1,48:3783\n935#1,3:3832\n858#1:3835\n882#1,48:3836\n935#1,3:3885\n244#1:3897\n269#1,10:3898\n280#1,68:3909\n858#1:3978\n882#1,48:3979\n935#1,3:4028\n1#2:3056\n3038#3:3057\n3038#3:3064\n3038#3:3185\n3038#3:3274\n3038#3:3364\n3038#3:3436\n3038#3:3448\n3038#3:3518\n3038#3:3781\n3038#3:3888\n3038#3:3889\n3052#3:3890\n3052#3:3891\n3051#3:3892\n3051#3:3893\n3051#3:3894\n3052#3:3895\n3051#3:3896\n3038#3:3908\n3039#3:4031\n3038#3:4032\n3038#3:4033\n3038#3:4034\n3039#3:4035\n3038#3:4036\n3039#3:4059\n3038#3:4060\n3038#3:4061\n3039#3:4062\n3038#3:4112\n3039#3:4113\n3039#3:4114\n3039#3:4132\n3039#3:4133\n314#4,9:3133\n323#4,2:3150\n332#4,4:3152\n336#4,8:3253\n314#4,9:3344\n323#4,2:3434\n332#4,4:3571\n336#4,8:3642\n332#4,4:3702\n336#4,8:3773\n220#5:3142\n221#5:3145\n220#5:3146\n221#5:3149\n61#6,2:3143\n61#6,2:3147\n61#6,2:3261\n269#7:3249\n269#7:3343\n269#7:3433\n269#7:3517\n269#7:3977\n882#8:3632\n882#8:3763\n882#8:3831\n882#8:3884\n882#8:4027\n37#9,11:4037\n37#9,11:4048\n72#10,3:4063\n46#10,8:4066\n72#10,3:4074\n46#10,8:4077\n46#10,8:4085\n72#10,3:4093\n46#10,8:4096\n46#10,8:4104\n766#11:4115\n857#11,2:4116\n2310#11,14:4118\n766#11:4134\n857#11,2:4135\n2310#11,14:4137\n766#11:4151\n857#11,2:4152\n2310#11,14:4154\n*S KotlinDebug\n*F\n+ 1 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel\n*L\n113#1:3058,6\n113#1:3065,68\n154#1:3156,18\n154#1:3174\n154#1:3175,10\n154#1:3186,48\n154#1:3234\n154#1:3235,14\n154#1:3250,3\n194#1:3263\n194#1:3264,10\n194#1:3275,68\n225#1:3353\n225#1:3354,10\n225#1:3365,68\n391#1:3437\n391#1:3438,10\n391#1:3449,68\n667#1:3519,52\n696#1:3575,8\n696#1:3583\n696#1:3584,33\n696#1:3617\n696#1:3618,14\n696#1:3633,3\n696#1:3636,6\n732#1:3650,52\n748#1:3706,8\n748#1:3714\n748#1:3715,33\n748#1:3748\n748#1:3749,14\n748#1:3764,3\n748#1:3767,6\n781#1:3782\n781#1:3783,48\n781#1:3832,3\n971#1:3835\n971#1:3836,48\n971#1:3885,3\n1464#1:3897\n1464#1:3898,10\n1464#1:3909,68\n1512#1:3978\n1512#1:3979,48\n1512#1:4028,3\n70#1:3057\n113#1:3064\n154#1:3185\n194#1:3274\n225#1:3364\n278#1:3436\n391#1:3448\n606#1:3518\n771#1:3781\n1007#1:3888\n1056#1:3889\n1374#1:3890\n1376#1:3891\n1406#1:3892\n1416#1:3893\n1425#1:3894\n1426#1:3895\n1433#1:3896\n1464#1:3908\n1865#1:4031\n1867#1:4032\n1869#1:4033\n1882#1:4034\n1893#1:4035\n1894#1:4036\n2196#1:4059\n2209#1:4060\n2219#1:4061\n2222#1:4062\n2539#1:4112\n2541#1:4113\n2566#1:4114\n2628#1:4132\n2629#1:4133\n134#1:3133,9\n134#1:3150,2\n153#1:3152,4\n153#1:3253,8\n221#1:3344,9\n221#1:3434,2\n695#1:3571,4\n695#1:3642,8\n746#1:3702,4\n746#1:3773,8\n138#1:3142\n138#1:3145\n141#1:3146\n141#1:3149\n138#1:3143,2\n141#1:3147,2\n183#1:3261,2\n154#1:3249\n194#1:3343\n225#1:3433\n391#1:3517\n1464#1:3977\n696#1:3632\n748#1:3763\n781#1:3831\n971#1:3884\n1512#1:4027\n2098#1:4037,11\n2153#1:4048,11\n2361#1:4063,3\n2361#1:4066,8\n2416#1:4074,3\n2416#1:4077,8\n2435#1:4085,8\n2465#1:4093,3\n2465#1:4096,8\n2526#1:4104,8\n2575#1:4115\n2575#1:4116,2\n2576#1:4118,14\n2640#1:4134\n2640#1:4135,2\n2641#1:4137,14\n2681#1:4151\n2681#1:4152,2\n2682#1:4154,14\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class BufferedChannel<E> implements kotlinx.coroutines.channels.j<E> {

    @org.jetbrains.annotations.NotNull
    private static final java.util.concurrent.atomic.AtomicLongFieldUpdater d = null;

    @org.jetbrains.annotations.NotNull
    private static final java.util.concurrent.atomic.AtomicLongFieldUpdater e = null;

    @org.jetbrains.annotations.NotNull
    private static final java.util.concurrent.atomic.AtomicLongFieldUpdater f = null;

    @org.jetbrains.annotations.NotNull
    private static final java.util.concurrent.atomic.AtomicLongFieldUpdater g = null;

    @org.jetbrains.annotations.NotNull
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater h = null;

    @org.jetbrains.annotations.NotNull
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater i = null;

    @org.jetbrains.annotations.NotNull
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater j = null;

    @org.jetbrains.annotations.NotNull
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater k = null;

    @org.jetbrains.annotations.NotNull
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater l = null;

    @kotlin.jvm.Volatile
    @org.jetbrains.annotations.Nullable
    private volatile java.lang.Object _closeCause;
    private final int a;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.Nullable
    public final kotlin.jvm.functions.Function1<E, kotlin.n1> b;

    @kotlin.jvm.Volatile
    private volatile long bufferEnd;

    @kotlin.jvm.Volatile
    @org.jetbrains.annotations.Nullable
    private volatile java.lang.Object bufferEndSegment;

    @org.jetbrains.annotations.Nullable
    private final kotlin.jvm.functions.Function3<kotlinx.coroutines.selects.m<?>, java.lang.Object, java.lang.Object, kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.n1>> c;

    @kotlin.jvm.Volatile
    @org.jetbrains.annotations.Nullable
    private volatile java.lang.Object closeHandler;

    @kotlin.jvm.Volatile
    private volatile long completedExpandBuffersAndPauseFlag;

    @kotlin.jvm.Volatile
    @org.jetbrains.annotations.Nullable
    private volatile java.lang.Object receiveSegment;

    @kotlin.jvm.Volatile
    private volatile long receivers;

    @kotlin.jvm.Volatile
    @org.jetbrains.annotations.Nullable
    private volatile java.lang.Object sendSegment;

    @kotlin.jvm.Volatile
    private volatile long sendersAndCloseStatus;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nBufferedChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel$BufferedChannelIterator\n+ 2 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 4 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel$receiveImpl$1\n+ 5 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,3055:1\n886#2,52:3056\n964#2,8:3112\n858#2:3120\n882#2,33:3121\n974#2:3154\n916#2,14:3155\n935#2,3:3170\n979#2,6:3173\n332#3,4:3108\n336#3,8:3179\n882#4:3169\n61#5,2:3187\n61#5,2:3190\n1#6:3189\n*S KotlinDebug\n*F\n+ 1 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel$BufferedChannelIterator\n*L\n1590#1:3056,52\n1627#1:3112,8\n1627#1:3120\n1627#1:3121,33\n1627#1:3154\n1627#1:3155,14\n1627#1:3170,3\n1627#1:3173,6\n1625#1:3108,4\n1625#1:3179,8\n1627#1:3169\n1663#1:3187,2\n1708#1:3190,2\n*E\n"})
    private final class a implements kotlinx.coroutines.channels.l<E>, kotlinx.coroutines.r3 {

        @org.jetbrains.annotations.Nullable
        private java.lang.Object a;

        @org.jetbrains.annotations.Nullable
        private kotlinx.coroutines.q<? super java.lang.Boolean> b;
        final /* synthetic */ kotlinx.coroutines.channels.BufferedChannel<E> c;

        public a(kotlinx.coroutines.channels.BufferedChannel r1) {
                r0 = this;
                r0.c = r1
                r0.<init>()
                kotlinx.coroutines.internal.s0 r1 = kotlinx.coroutines.channels.i.m()
                r0.a = r1
                return
        }

        public static final /* synthetic */ java.lang.Object d(kotlinx.coroutines.channels.BufferedChannel.a r0, kotlinx.coroutines.channels.o r1, int r2, long r3, kotlin.coroutines.e r5) {
                java.lang.Object r0 = r0.h(r1, r2, r3, r5)
                return r0
        }

        public static final /* synthetic */ void e(kotlinx.coroutines.channels.BufferedChannel.a r0) {
                r0.j()
                return
        }

        public static final /* synthetic */ void f(kotlinx.coroutines.channels.BufferedChannel.a r0, kotlinx.coroutines.q r1) {
                r0.b = r1
                return
        }

        public static final /* synthetic */ void g(kotlinx.coroutines.channels.BufferedChannel.a r0, java.lang.Object r1) {
                r0.a = r1
                return
        }

        private final java.lang.Object h(kotlinx.coroutines.channels.o<E> r11, int r12, long r13, kotlin.coroutines.e<? super java.lang.Boolean> r15) {
                r10 = this;
                kotlinx.coroutines.channels.BufferedChannel<E> r0 = r10.c
                kotlin.coroutines.e r1 = kotlin.coroutines.intrinsics.a.e(r15)
                kotlinx.coroutines.q r6 = kotlinx.coroutines.s.b(r1)
                f(r10, r6)     // Catch: java.lang.Throwable -> Lde
                r5 = r10
                r1 = r11
                r2 = r12
                r3 = r13
                java.lang.Object r11 = kotlinx.coroutines.channels.BufferedChannel.J(r0, r1, r2, r3, r5)     // Catch: java.lang.Throwable -> L20
                kotlinx.coroutines.internal.s0 r12 = kotlinx.coroutines.channels.i.r()     // Catch: java.lang.Throwable -> L20
                if (r11 != r12) goto L24
                kotlinx.coroutines.channels.BufferedChannel.s(r0, r10, r1, r2)     // Catch: java.lang.Throwable -> L20
                goto Ld0
            L20:
                r0 = move-exception
            L21:
                r11 = r0
                goto Le2
            L24:
                kotlinx.coroutines.internal.s0 r12 = kotlinx.coroutines.channels.i.h()     // Catch: java.lang.Throwable -> L20
                r13 = 1
                r14 = 0
                if (r11 != r12) goto Lba
                long r11 = r0.o0()     // Catch: java.lang.Throwable -> L20
                int r2 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
                if (r2 >= 0) goto L37
                r1.b()     // Catch: java.lang.Throwable -> L20
            L37:
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r11 = kotlinx.coroutines.channels.BufferedChannel.f()     // Catch: java.lang.Throwable -> L20
                java.lang.Object r11 = r11.get(r0)     // Catch: java.lang.Throwable -> L20
                kotlinx.coroutines.channels.o r11 = (kotlinx.coroutines.channels.o) r11     // Catch: java.lang.Throwable -> L20
            L41:
                boolean r12 = r0.D()     // Catch: java.lang.Throwable -> L20
                if (r12 == 0) goto L4c
                e(r10)     // Catch: java.lang.Throwable -> L20
                goto Ld0
            L4c:
                java.util.concurrent.atomic.AtomicLongFieldUpdater r12 = kotlinx.coroutines.channels.BufferedChannel.g()     // Catch: java.lang.Throwable -> L20
                long r3 = r12.getAndIncrement(r0)     // Catch: java.lang.Throwable -> L20
                int r12 = kotlinx.coroutines.channels.i.b     // Catch: java.lang.Throwable -> L20
                long r1 = (long) r12     // Catch: java.lang.Throwable -> L20
                long r1 = r3 / r1
                long r7 = (long) r12     // Catch: java.lang.Throwable -> L20
                long r7 = r3 % r7
                int r12 = (int) r7     // Catch: java.lang.Throwable -> L20
                long r7 = r11.c     // Catch: java.lang.Throwable -> L20
                int r9 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
                if (r9 == 0) goto L6c
                kotlinx.coroutines.channels.o r1 = kotlinx.coroutines.channels.BufferedChannel.c(r0, r1, r11)     // Catch: java.lang.Throwable -> L20
                if (r1 != 0) goto L6a
                goto L41
            L6a:
                r2 = r12
                goto L6e
            L6c:
                r1 = r11
                goto L6a
            L6e:
                java.lang.Object r11 = kotlinx.coroutines.channels.BufferedChannel.J(r0, r1, r2, r3, r5)     // Catch: java.lang.Throwable -> L20
                kotlinx.coroutines.internal.s0 r12 = kotlinx.coroutines.channels.i.r()     // Catch: java.lang.Throwable -> L20
                if (r11 != r12) goto L7c
                kotlinx.coroutines.channels.BufferedChannel.s(r0, r10, r1, r2)     // Catch: java.lang.Throwable -> L20
                goto Ld0
            L7c:
                kotlinx.coroutines.internal.s0 r12 = kotlinx.coroutines.channels.i.h()     // Catch: java.lang.Throwable -> L20
                if (r11 != r12) goto L8f
                long r11 = r0.o0()     // Catch: java.lang.Throwable -> L20
                int r2 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
                if (r2 >= 0) goto L8d
                r1.b()     // Catch: java.lang.Throwable -> L20
            L8d:
                r11 = r1
                goto L41
            L8f:
                kotlinx.coroutines.internal.s0 r12 = kotlinx.coroutines.channels.i.s()     // Catch: java.lang.Throwable -> L20
                if (r11 == r12) goto Lb2
                r1.b()     // Catch: java.lang.Throwable -> L20
                g(r10, r11)     // Catch: java.lang.Throwable -> L20
                f(r10, r14)     // Catch: java.lang.Throwable -> L20
                java.lang.Boolean r12 = kotlin.coroutines.jvm.internal.a.a(r13)     // Catch: java.lang.Throwable -> L20
                kotlin.jvm.functions.Function1<E, kotlin.n1> r13 = r0.b     // Catch: java.lang.Throwable -> L20
                if (r13 == 0) goto Lae
                kotlin.coroutines.i r14 = r6.getContext()     // Catch: java.lang.Throwable -> L20
            Laa:
                kotlin.jvm.functions.Function1 r14 = kotlinx.coroutines.internal.j0.a(r13, r11, r14)     // Catch: java.lang.Throwable -> L20
            Lae:
                r6.o(r12, r14)     // Catch: java.lang.Throwable -> L20
                goto Ld0
            Lb2:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L20
                java.lang.String r12 = "unexpected"
                r11.<init>(r12)     // Catch: java.lang.Throwable -> L20
                throw r11     // Catch: java.lang.Throwable -> L20
            Lba:
                r1.b()     // Catch: java.lang.Throwable -> L20
                g(r10, r11)     // Catch: java.lang.Throwable -> L20
                f(r10, r14)     // Catch: java.lang.Throwable -> L20
                java.lang.Boolean r12 = kotlin.coroutines.jvm.internal.a.a(r13)     // Catch: java.lang.Throwable -> L20
                kotlin.jvm.functions.Function1<E, kotlin.n1> r13 = r0.b     // Catch: java.lang.Throwable -> L20
                if (r13 == 0) goto Lae
                kotlin.coroutines.i r14 = r6.getContext()     // Catch: java.lang.Throwable -> L20
                goto Laa
            Ld0:
                java.lang.Object r11 = r6.x()
                java.lang.Object r12 = kotlin.coroutines.intrinsics.a.l()
                if (r11 != r12) goto Ldd
                kotlin.coroutines.jvm.internal.e.c(r15)
            Ldd:
                return r11
            Lde:
                r0 = move-exception
                r5 = r10
                goto L21
            Le2:
                r6.N()
                throw r11
        }

        private final boolean i() {
                r1 = this;
                kotlinx.coroutines.internal.s0 r0 = kotlinx.coroutines.channels.i.z()
                r1.a = r0
                kotlinx.coroutines.channels.BufferedChannel<E> r0 = r1.c
                java.lang.Throwable r0 = r0.f0()
                if (r0 != 0) goto L10
                r0 = 0
                return r0
            L10:
                java.lang.Throwable r0 = kotlinx.coroutines.internal.r0.o(r0)
                throw r0
        }

        private final void j() {
                r3 = this;
                kotlinx.coroutines.q<? super java.lang.Boolean> r0 = r3.b
                kotlin.jvm.internal.g0.m(r0)
                r1 = 0
                r3.b = r1
                kotlinx.coroutines.internal.s0 r1 = kotlinx.coroutines.channels.i.z()
                r3.a = r1
                kotlinx.coroutines.channels.BufferedChannel<E> r1 = r3.c
                java.lang.Throwable r1 = r1.f0()
                if (r1 != 0) goto L22
                kotlin.Result$a r1 = kotlin.Result.Companion
                java.lang.Boolean r1 = java.lang.Boolean.FALSE
                java.lang.Object r1 = kotlin.Result.m11constructorimpl(r1)
                r0.resumeWith(r1)
                return
            L22:
                kotlin.Result$a r2 = kotlin.Result.Companion
                java.lang.Object r1 = kotlin.g0.a(r1)
                java.lang.Object r1 = kotlin.Result.m11constructorimpl(r1)
                r0.resumeWith(r1)
                return
        }

        @Override // kotlinx.coroutines.channels.l
        @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.3.0, binary compatibility with versions <= 1.2.x")
        @kotlin.jvm.JvmName(name = "next")
        public /* synthetic */ java.lang.Object a(kotlin.coroutines.e r1) {
                r0 = this;
                java.lang.Object r1 = kotlinx.coroutines.channels.l.a.a(r0, r1)
                return r1
        }

        @Override // kotlinx.coroutines.r3
        public void b(@org.jetbrains.annotations.NotNull kotlinx.coroutines.internal.p0<?> r2, int r3) {
                r1 = this;
                kotlinx.coroutines.q<? super java.lang.Boolean> r0 = r1.b
                if (r0 == 0) goto L7
                r0.b(r2, r3)
            L7:
                return
        }

        @Override // kotlinx.coroutines.channels.l
        @org.jetbrains.annotations.Nullable
        public java.lang.Object c(@org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super java.lang.Boolean> r11) {
                r10 = this;
                kotlinx.coroutines.channels.BufferedChannel<E> r0 = r10.c
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.channels.BufferedChannel.f()
                java.lang.Object r1 = r1.get(r0)
                kotlinx.coroutines.channels.o r1 = (kotlinx.coroutines.channels.o) r1
            Lc:
                boolean r2 = r0.D()
                if (r2 == 0) goto L1b
                boolean r11 = r10.i()
                java.lang.Boolean r11 = kotlin.coroutines.jvm.internal.a.a(r11)
                return r11
            L1b:
                java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = kotlinx.coroutines.channels.BufferedChannel.g()
                long r3 = r2.getAndIncrement(r0)
                int r2 = kotlinx.coroutines.channels.i.b
                long r5 = (long) r2
                long r5 = r3 / r5
                long r7 = (long) r2
                long r7 = r3 % r7
                int r2 = (int) r7
                long r7 = r1.c
                int r9 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
                if (r9 == 0) goto L3a
                kotlinx.coroutines.channels.o r5 = kotlinx.coroutines.channels.BufferedChannel.c(r0, r5, r1)
                if (r5 != 0) goto L39
                goto Lc
            L39:
                r1 = r5
            L3a:
                r5 = 0
                java.lang.Object r9 = kotlinx.coroutines.channels.BufferedChannel.J(r0, r1, r2, r3, r5)
                kotlinx.coroutines.internal.s0 r5 = kotlinx.coroutines.channels.i.r()
                if (r9 == r5) goto L73
                kotlinx.coroutines.internal.s0 r5 = kotlinx.coroutines.channels.i.h()
                if (r9 != r5) goto L57
                long r5 = r0.o0()
                int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r2 >= 0) goto Lc
                r1.b()
                goto Lc
            L57:
                kotlinx.coroutines.internal.s0 r0 = kotlinx.coroutines.channels.i.s()
                if (r9 != r0) goto L67
                r8 = r11
                r5 = r2
                r6 = r3
                r3 = r10
                r4 = r1
                java.lang.Object r11 = r3.h(r4, r5, r6, r8)
                return r11
            L67:
                r3 = r10
                r1.b()
                r3.a = r9
                r11 = 1
                java.lang.Boolean r11 = kotlin.coroutines.jvm.internal.a.a(r11)
                return r11
            L73:
                r3 = r10
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "unreachable"
                r11.<init>(r0)
                throw r11
        }

        public final boolean k(E r5) {
                r4 = this;
                kotlinx.coroutines.q<? super java.lang.Boolean> r0 = r4.b
                kotlin.jvm.internal.g0.m(r0)
                r1 = 0
                r4.b = r1
                r4.a = r5
                java.lang.Boolean r2 = java.lang.Boolean.TRUE
                kotlinx.coroutines.channels.BufferedChannel<E> r3 = r4.c
                kotlin.jvm.functions.Function1<E, kotlin.n1> r3 = r3.b
                if (r3 == 0) goto L1a
                kotlin.coroutines.i r1 = r0.getContext()
                kotlin.jvm.functions.Function1 r1 = kotlinx.coroutines.internal.j0.a(r3, r5, r1)
            L1a:
                boolean r5 = kotlinx.coroutines.channels.i.u(r0, r2, r1)
                return r5
        }

        public final void l() {
                r3 = this;
                kotlinx.coroutines.q<? super java.lang.Boolean> r0 = r3.b
                kotlin.jvm.internal.g0.m(r0)
                r1 = 0
                r3.b = r1
                kotlinx.coroutines.internal.s0 r1 = kotlinx.coroutines.channels.i.z()
                r3.a = r1
                kotlinx.coroutines.channels.BufferedChannel<E> r1 = r3.c
                java.lang.Throwable r1 = r1.f0()
                if (r1 != 0) goto L22
                kotlin.Result$a r1 = kotlin.Result.Companion
                java.lang.Boolean r1 = java.lang.Boolean.FALSE
                java.lang.Object r1 = kotlin.Result.m11constructorimpl(r1)
                r0.resumeWith(r1)
                return
            L22:
                kotlin.Result$a r2 = kotlin.Result.Companion
                java.lang.Object r1 = kotlin.g0.a(r1)
                java.lang.Object r1 = kotlin.Result.m11constructorimpl(r1)
                r0.resumeWith(r1)
                return
        }

        @Override // kotlinx.coroutines.channels.l
        public E next() {
                r2 = this;
                java.lang.Object r0 = r2.a
                kotlinx.coroutines.internal.s0 r1 = kotlinx.coroutines.channels.i.m()
                if (r0 == r1) goto L20
                kotlinx.coroutines.internal.s0 r1 = kotlinx.coroutines.channels.i.m()
                r2.a = r1
                kotlinx.coroutines.internal.s0 r1 = kotlinx.coroutines.channels.i.z()
                if (r0 == r1) goto L15
                return r0
            L15:
                kotlinx.coroutines.channels.BufferedChannel<E> r0 = r2.c
                java.lang.Throwable r0 = kotlinx.coroutines.channels.BufferedChannel.e(r0)
                java.lang.Throwable r0 = kotlinx.coroutines.internal.r0.o(r0)
                throw r0
            L20:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "`hasNext()` has not been invoked"
                r0.<init>(r1)
                throw r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class b implements kotlinx.coroutines.r3 {

        @org.jetbrains.annotations.NotNull
        private final kotlinx.coroutines.p<java.lang.Boolean> a;
        private final /* synthetic */ kotlinx.coroutines.q<java.lang.Boolean> b;

        public b(@org.jetbrains.annotations.NotNull kotlinx.coroutines.p<? super java.lang.Boolean> r2) {
                r1 = this;
                r1.<init>()
                r1.a = r2
                java.lang.String r0 = "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuationImpl<kotlin.Boolean>"
                kotlin.jvm.internal.g0.n(r2, r0)
                kotlinx.coroutines.q r2 = (kotlinx.coroutines.q) r2
                r1.b = r2
                return
        }

        @org.jetbrains.annotations.NotNull
        public final kotlinx.coroutines.p<java.lang.Boolean> a() {
                r1 = this;
                kotlinx.coroutines.p<java.lang.Boolean> r0 = r1.a
                return r0
        }

        @Override // kotlinx.coroutines.r3
        public void b(@org.jetbrains.annotations.NotNull kotlinx.coroutines.internal.p0<?> r2, int r3) {
                r1 = this;
                kotlinx.coroutines.q<java.lang.Boolean> r0 = r1.b
                r0.b(r2, r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* synthetic */ class c extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function3<kotlinx.coroutines.channels.BufferedChannel<?>, kotlinx.coroutines.selects.m<?>, java.lang.Object, kotlin.n1> {
        public static final kotlinx.coroutines.channels.BufferedChannel.c a = null;

        static {
                kotlinx.coroutines.channels.BufferedChannel$c r0 = new kotlinx.coroutines.channels.BufferedChannel$c
                r0.<init>()
                kotlinx.coroutines.channels.BufferedChannel.c.a = r0
                return
        }

        c() {
                r6 = this;
                java.lang.String r4 = "registerSelectForReceive(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V"
                r5 = 0
                r1 = 3
                java.lang.Class<kotlinx.coroutines.channels.BufferedChannel> r2 = kotlinx.coroutines.channels.BufferedChannel.class
                java.lang.String r3 = "registerSelectForReceive"
                r0 = r6
                r0.<init>(r1, r2, r3, r4, r5)
                return
        }

        public final void c(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.BufferedChannel<?> r1, @org.jetbrains.annotations.NotNull kotlinx.coroutines.selects.m<?> r2, @org.jetbrains.annotations.Nullable java.lang.Object r3) {
                r0 = this;
                kotlinx.coroutines.channels.BufferedChannel.H(r1, r2, r3)
                return
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ kotlin.n1 invoke(kotlinx.coroutines.channels.BufferedChannel<?> r1, kotlinx.coroutines.selects.m<?> r2, java.lang.Object r3) {
                r0 = this;
                kotlinx.coroutines.channels.BufferedChannel r1 = (kotlinx.coroutines.channels.BufferedChannel) r1
                kotlinx.coroutines.selects.m r2 = (kotlinx.coroutines.selects.m) r2
                r0.c(r1, r2, r3)
                kotlin.n1 r1 = kotlin.n1.a
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* synthetic */ class d extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function3<kotlinx.coroutines.channels.BufferedChannel<?>, java.lang.Object, java.lang.Object, java.lang.Object> {
        public static final kotlinx.coroutines.channels.BufferedChannel.d a = null;

        static {
                kotlinx.coroutines.channels.BufferedChannel$d r0 = new kotlinx.coroutines.channels.BufferedChannel$d
                r0.<init>()
                kotlinx.coroutines.channels.BufferedChannel.d.a = r0
                return
        }

        d() {
                r6 = this;
                java.lang.String r4 = "processResultSelectReceive(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"
                r5 = 0
                r1 = 3
                java.lang.Class<kotlinx.coroutines.channels.BufferedChannel> r2 = kotlinx.coroutines.channels.BufferedChannel.class
                java.lang.String r3 = "processResultSelectReceive"
                r0 = r6
                r0.<init>(r1, r2, r3, r4, r5)
                return
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Object c(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.BufferedChannel<?> r1, @org.jetbrains.annotations.Nullable java.lang.Object r2, @org.jetbrains.annotations.Nullable java.lang.Object r3) {
                r0 = this;
                java.lang.Object r1 = kotlinx.coroutines.channels.BufferedChannel.A(r1, r2, r3)
                return r1
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.channels.BufferedChannel<?> r1, java.lang.Object r2, java.lang.Object r3) {
                r0 = this;
                kotlinx.coroutines.channels.BufferedChannel r1 = (kotlinx.coroutines.channels.BufferedChannel) r1
                java.lang.Object r1 = r0.c(r1, r2, r3)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* synthetic */ class e extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function3<kotlinx.coroutines.channels.BufferedChannel<?>, kotlinx.coroutines.selects.m<?>, java.lang.Object, kotlin.n1> {
        public static final kotlinx.coroutines.channels.BufferedChannel.e a = null;

        static {
                kotlinx.coroutines.channels.BufferedChannel$e r0 = new kotlinx.coroutines.channels.BufferedChannel$e
                r0.<init>()
                kotlinx.coroutines.channels.BufferedChannel.e.a = r0
                return
        }

        e() {
                r6 = this;
                java.lang.String r4 = "registerSelectForReceive(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V"
                r5 = 0
                r1 = 3
                java.lang.Class<kotlinx.coroutines.channels.BufferedChannel> r2 = kotlinx.coroutines.channels.BufferedChannel.class
                java.lang.String r3 = "registerSelectForReceive"
                r0 = r6
                r0.<init>(r1, r2, r3, r4, r5)
                return
        }

        public final void c(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.BufferedChannel<?> r1, @org.jetbrains.annotations.NotNull kotlinx.coroutines.selects.m<?> r2, @org.jetbrains.annotations.Nullable java.lang.Object r3) {
                r0 = this;
                kotlinx.coroutines.channels.BufferedChannel.H(r1, r2, r3)
                return
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ kotlin.n1 invoke(kotlinx.coroutines.channels.BufferedChannel<?> r1, kotlinx.coroutines.selects.m<?> r2, java.lang.Object r3) {
                r0 = this;
                kotlinx.coroutines.channels.BufferedChannel r1 = (kotlinx.coroutines.channels.BufferedChannel) r1
                kotlinx.coroutines.selects.m r2 = (kotlinx.coroutines.selects.m) r2
                r0.c(r1, r2, r3)
                kotlin.n1 r1 = kotlin.n1.a
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* synthetic */ class f extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function3<kotlinx.coroutines.channels.BufferedChannel<?>, java.lang.Object, java.lang.Object, java.lang.Object> {
        public static final kotlinx.coroutines.channels.BufferedChannel.f a = null;

        static {
                kotlinx.coroutines.channels.BufferedChannel$f r0 = new kotlinx.coroutines.channels.BufferedChannel$f
                r0.<init>()
                kotlinx.coroutines.channels.BufferedChannel.f.a = r0
                return
        }

        f() {
                r6 = this;
                java.lang.String r4 = "processResultSelectReceiveCatching(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"
                r5 = 0
                r1 = 3
                java.lang.Class<kotlinx.coroutines.channels.BufferedChannel> r2 = kotlinx.coroutines.channels.BufferedChannel.class
                java.lang.String r3 = "processResultSelectReceiveCatching"
                r0 = r6
                r0.<init>(r1, r2, r3, r4, r5)
                return
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Object c(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.BufferedChannel<?> r1, @org.jetbrains.annotations.Nullable java.lang.Object r2, @org.jetbrains.annotations.Nullable java.lang.Object r3) {
                r0 = this;
                java.lang.Object r1 = kotlinx.coroutines.channels.BufferedChannel.B(r1, r2, r3)
                return r1
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.channels.BufferedChannel<?> r1, java.lang.Object r2, java.lang.Object r3) {
                r0 = this;
                kotlinx.coroutines.channels.BufferedChannel r1 = (kotlinx.coroutines.channels.BufferedChannel) r1
                java.lang.Object r1 = r0.c(r1, r2, r3)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* synthetic */ class g extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function3<kotlinx.coroutines.channels.BufferedChannel<?>, kotlinx.coroutines.selects.m<?>, java.lang.Object, kotlin.n1> {
        public static final kotlinx.coroutines.channels.BufferedChannel.g a = null;

        static {
                kotlinx.coroutines.channels.BufferedChannel$g r0 = new kotlinx.coroutines.channels.BufferedChannel$g
                r0.<init>()
                kotlinx.coroutines.channels.BufferedChannel.g.a = r0
                return
        }

        g() {
                r6 = this;
                java.lang.String r4 = "registerSelectForReceive(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V"
                r5 = 0
                r1 = 3
                java.lang.Class<kotlinx.coroutines.channels.BufferedChannel> r2 = kotlinx.coroutines.channels.BufferedChannel.class
                java.lang.String r3 = "registerSelectForReceive"
                r0 = r6
                r0.<init>(r1, r2, r3, r4, r5)
                return
        }

        public final void c(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.BufferedChannel<?> r1, @org.jetbrains.annotations.NotNull kotlinx.coroutines.selects.m<?> r2, @org.jetbrains.annotations.Nullable java.lang.Object r3) {
                r0 = this;
                kotlinx.coroutines.channels.BufferedChannel.H(r1, r2, r3)
                return
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ kotlin.n1 invoke(kotlinx.coroutines.channels.BufferedChannel<?> r1, kotlinx.coroutines.selects.m<?> r2, java.lang.Object r3) {
                r0 = this;
                kotlinx.coroutines.channels.BufferedChannel r1 = (kotlinx.coroutines.channels.BufferedChannel) r1
                kotlinx.coroutines.selects.m r2 = (kotlinx.coroutines.selects.m) r2
                r0.c(r1, r2, r3)
                kotlin.n1 r1 = kotlin.n1.a
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* synthetic */ class h extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function3<kotlinx.coroutines.channels.BufferedChannel<?>, java.lang.Object, java.lang.Object, java.lang.Object> {
        public static final kotlinx.coroutines.channels.BufferedChannel.h a = null;

        static {
                kotlinx.coroutines.channels.BufferedChannel$h r0 = new kotlinx.coroutines.channels.BufferedChannel$h
                r0.<init>()
                kotlinx.coroutines.channels.BufferedChannel.h.a = r0
                return
        }

        h() {
                r6 = this;
                java.lang.String r4 = "processResultSelectReceiveOrNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"
                r5 = 0
                r1 = 3
                java.lang.Class<kotlinx.coroutines.channels.BufferedChannel> r2 = kotlinx.coroutines.channels.BufferedChannel.class
                java.lang.String r3 = "processResultSelectReceiveOrNull"
                r0 = r6
                r0.<init>(r1, r2, r3, r4, r5)
                return
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Object c(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.BufferedChannel<?> r1, @org.jetbrains.annotations.Nullable java.lang.Object r2, @org.jetbrains.annotations.Nullable java.lang.Object r3) {
                r0 = this;
                java.lang.Object r1 = kotlinx.coroutines.channels.BufferedChannel.C(r1, r2, r3)
                return r1
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.channels.BufferedChannel<?> r1, java.lang.Object r2, java.lang.Object r3) {
                r0 = this;
                kotlinx.coroutines.channels.BufferedChannel r1 = (kotlinx.coroutines.channels.BufferedChannel) r1
                java.lang.Object r1 = r0.c(r1, r2, r3)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* synthetic */ class i extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function3<kotlinx.coroutines.channels.BufferedChannel<?>, kotlinx.coroutines.selects.m<?>, java.lang.Object, kotlin.n1> {
        public static final kotlinx.coroutines.channels.BufferedChannel.i a = null;

        static {
                kotlinx.coroutines.channels.BufferedChannel$i r0 = new kotlinx.coroutines.channels.BufferedChannel$i
                r0.<init>()
                kotlinx.coroutines.channels.BufferedChannel.i.a = r0
                return
        }

        i() {
                r6 = this;
                java.lang.String r4 = "registerSelectForSend(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V"
                r5 = 0
                r1 = 3
                java.lang.Class<kotlinx.coroutines.channels.BufferedChannel> r2 = kotlinx.coroutines.channels.BufferedChannel.class
                java.lang.String r3 = "registerSelectForSend"
                r0 = r6
                r0.<init>(r1, r2, r3, r4, r5)
                return
        }

        public final void c(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.BufferedChannel<?> r1, @org.jetbrains.annotations.NotNull kotlinx.coroutines.selects.m<?> r2, @org.jetbrains.annotations.Nullable java.lang.Object r3) {
                r0 = this;
                r1.g1(r2, r3)
                return
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ kotlin.n1 invoke(kotlinx.coroutines.channels.BufferedChannel<?> r1, kotlinx.coroutines.selects.m<?> r2, java.lang.Object r3) {
                r0 = this;
                kotlinx.coroutines.channels.BufferedChannel r1 = (kotlinx.coroutines.channels.BufferedChannel) r1
                kotlinx.coroutines.selects.m r2 = (kotlinx.coroutines.selects.m) r2
                r0.c(r1, r2, r3)
                kotlin.n1 r1 = kotlin.n1.a
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* synthetic */ class j extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function3<kotlinx.coroutines.channels.BufferedChannel<?>, java.lang.Object, java.lang.Object, java.lang.Object> {
        public static final kotlinx.coroutines.channels.BufferedChannel.j a = null;

        static {
                kotlinx.coroutines.channels.BufferedChannel$j r0 = new kotlinx.coroutines.channels.BufferedChannel$j
                r0.<init>()
                kotlinx.coroutines.channels.BufferedChannel.j.a = r0
                return
        }

        j() {
                r6 = this;
                java.lang.String r4 = "processResultSelectSend(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"
                r5 = 0
                r1 = 3
                java.lang.Class<kotlinx.coroutines.channels.BufferedChannel> r2 = kotlinx.coroutines.channels.BufferedChannel.class
                java.lang.String r3 = "processResultSelectSend"
                r0 = r6
                r0.<init>(r1, r2, r3, r4, r5)
                return
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Object c(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.BufferedChannel<?> r1, @org.jetbrains.annotations.Nullable java.lang.Object r2, @org.jetbrains.annotations.Nullable java.lang.Object r3) {
                r0 = this;
                java.lang.Object r1 = kotlinx.coroutines.channels.BufferedChannel.E(r1, r2, r3)
                return r1
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.channels.BufferedChannel<?> r1, java.lang.Object r2, java.lang.Object r3) {
                r0 = this;
                kotlinx.coroutines.channels.BufferedChannel r1 = (kotlinx.coroutines.channels.BufferedChannel) r1
                java.lang.Object r1 = r0.c(r1, r2, r3)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class k extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.selects.m<?>, java.lang.Object, java.lang.Object, kotlin.jvm.functions.Function1<? super java.lang.Throwable, ? extends kotlin.n1>> {
        final /* synthetic */ kotlinx.coroutines.channels.BufferedChannel<E> a;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        static final class a extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.n1> {
            final /* synthetic */ java.lang.Object a;
            final /* synthetic */ kotlinx.coroutines.channels.BufferedChannel<E> b;
            final /* synthetic */ kotlinx.coroutines.selects.m<?> c;

            a(java.lang.Object r1, kotlinx.coroutines.channels.BufferedChannel<E> r2, kotlinx.coroutines.selects.m<?> r3) {
                    r0 = this;
                    r0.a = r1
                    r0.b = r2
                    r0.c = r3
                    r1 = 1
                    r0.<init>(r1)
                    return
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.n1 invoke(java.lang.Throwable r1) {
                    r0 = this;
                    java.lang.Throwable r1 = (java.lang.Throwable) r1
                    r0.invoke2(r1)
                    kotlin.n1 r1 = kotlin.n1.a
                    return r1
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@org.jetbrains.annotations.NotNull java.lang.Throwable r3) {
                    r2 = this;
                    java.lang.Object r3 = r2.a
                    kotlinx.coroutines.internal.s0 r0 = kotlinx.coroutines.channels.i.z()
                    if (r3 == r0) goto L17
                    kotlinx.coroutines.channels.BufferedChannel<E> r3 = r2.b
                    kotlin.jvm.functions.Function1<E, kotlin.n1> r3 = r3.b
                    java.lang.Object r0 = r2.a
                    kotlinx.coroutines.selects.m<?> r1 = r2.c
                    kotlin.coroutines.i r1 = r1.getContext()
                    kotlinx.coroutines.internal.j0.b(r3, r0, r1)
                L17:
                    return
            }
        }

        k(kotlinx.coroutines.channels.BufferedChannel<E> r1) {
                r0 = this;
                r0.a = r1
                r1 = 3
                r0.<init>(r1)
                return
        }

        @org.jetbrains.annotations.NotNull
        public final kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.n1> a(@org.jetbrains.annotations.NotNull kotlinx.coroutines.selects.m<?> r2, @org.jetbrains.annotations.Nullable java.lang.Object r3, @org.jetbrains.annotations.Nullable java.lang.Object r4) {
                r1 = this;
                kotlinx.coroutines.channels.BufferedChannel$k$a r3 = new kotlinx.coroutines.channels.BufferedChannel$k$a
                kotlinx.coroutines.channels.BufferedChannel<E> r0 = r1.a
                r3.<init>(r4, r0, r2)
                return r3
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ kotlin.jvm.functions.Function1<? super java.lang.Throwable, ? extends kotlin.n1> invoke(kotlinx.coroutines.selects.m<?> r1, java.lang.Object r2, java.lang.Object r3) {
                r0 = this;
                kotlinx.coroutines.selects.m r1 = (kotlinx.coroutines.selects.m) r1
                kotlin.jvm.functions.Function1 r1 = r0.a(r1, r2, r3)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.BufferedChannel", f = "BufferedChannel.kt", i = {}, l = {739}, m = "receiveCatching-JP2dKIU$suspendImpl", n = {}, s = {})
    static final class l<E> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        /* synthetic */ java.lang.Object a;
        final /* synthetic */ kotlinx.coroutines.channels.BufferedChannel<E> b;
        int c;

        l(kotlinx.coroutines.channels.BufferedChannel<E> r1, kotlin.coroutines.e<? super kotlinx.coroutines.channels.BufferedChannel.l> r2) {
                r0 = this;
                r0.b = r1
                r0.<init>(r2)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
                r1 = this;
                r1.a = r2
                int r2 = r1.c
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r2 | r0
                r1.c = r2
                kotlinx.coroutines.channels.BufferedChannel<E> r2 = r1.b
                java.lang.Object r2 = kotlinx.coroutines.channels.BufferedChannel.Z0(r2, r1)
                java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
                if (r2 != r0) goto L16
                return r2
            L16:
                kotlinx.coroutines.channels.n r2 = kotlinx.coroutines.channels.n.b(r2)
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.BufferedChannel", f = "BufferedChannel.kt", i = {0, 0, 0, 0}, l = {3056}, m = "receiveCatchingOnNoWaiterSuspend-GKJJFZk", n = {"this", "segment", "index", "r"}, s = {"L$0", "L$1", "I$0", "J$0"})
    static final class m extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object a;
        java.lang.Object b;
        int c;
        long d;
        /* synthetic */ java.lang.Object e;
        final /* synthetic */ kotlinx.coroutines.channels.BufferedChannel<E> f;
        int g;

        m(kotlinx.coroutines.channels.BufferedChannel<E> r1, kotlin.coroutines.e<? super kotlinx.coroutines.channels.BufferedChannel.m> r2) {
                r0 = this;
                r0.f = r1
                r0.<init>(r2)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r7) {
                r6 = this;
                r6.e = r7
                int r7 = r6.g
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r7 = r7 | r0
                r6.g = r7
                kotlinx.coroutines.channels.BufferedChannel<E> r0 = r6.f
                r2 = 0
                r3 = 0
                r1 = 0
                r5 = r6
                java.lang.Object r7 = kotlinx.coroutines.channels.BufferedChannel.F(r0, r1, r2, r3, r5)
                java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
                if (r7 != r0) goto L1b
                return r7
            L1b:
                kotlinx.coroutines.channels.n r7 = kotlinx.coroutines.channels.n.b(r7)
                return r7
        }
    }

    static {
            java.lang.String r0 = "sendersAndCloseStatus"
            java.lang.Class<kotlinx.coroutines.channels.BufferedChannel> r1 = kotlinx.coroutines.channels.BufferedChannel.class
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(r1, r0)
            kotlinx.coroutines.channels.BufferedChannel.d = r0
            java.lang.String r0 = "receivers"
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(r1, r0)
            kotlinx.coroutines.channels.BufferedChannel.e = r0
            java.lang.String r0 = "bufferEnd"
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(r1, r0)
            kotlinx.coroutines.channels.BufferedChannel.f = r0
            java.lang.String r0 = "completedExpandBuffersAndPauseFlag"
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(r1, r0)
            kotlinx.coroutines.channels.BufferedChannel.g = r0
            java.lang.String r0 = "sendSegment"
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r2, r0)
            kotlinx.coroutines.channels.BufferedChannel.h = r0
            java.lang.String r0 = "receiveSegment"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r2, r0)
            kotlinx.coroutines.channels.BufferedChannel.i = r0
            java.lang.String r0 = "bufferEndSegment"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r2, r0)
            kotlinx.coroutines.channels.BufferedChannel.j = r0
            java.lang.String r0 = "_closeCause"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r2, r0)
            kotlinx.coroutines.channels.BufferedChannel.k = r0
            java.lang.String r0 = "closeHandler"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r2, r0)
            kotlinx.coroutines.channels.BufferedChannel.l = r0
            return
    }

    public BufferedChannel(int r9, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super E, kotlin.n1> r10) {
            r8 = this;
            r8.<init>()
            r8.a = r9
            r8.b = r10
            if (r9 < 0) goto L46
            long r0 = kotlinx.coroutines.channels.i.t(r9)
            r8.bufferEnd = r0
            long r0 = r8.e0()
            r8.completedExpandBuffersAndPauseFlag = r0
            kotlinx.coroutines.channels.o r2 = new kotlinx.coroutines.channels.o
            r5 = 0
            r7 = 3
            r3 = 0
            r6 = r8
            r2.<init>(r3, r5, r6, r7)
            r6.sendSegment = r2
            r6.receiveSegment = r2
            boolean r9 = r8.B0()
            if (r9 == 0) goto L32
            kotlinx.coroutines.channels.o r2 = kotlinx.coroutines.channels.i.n()
            java.lang.String r9 = "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>"
            kotlin.jvm.internal.g0.n(r2, r9)
        L32:
            r6.bufferEndSegment = r2
            if (r10 == 0) goto L3c
            kotlinx.coroutines.channels.BufferedChannel$k r9 = new kotlinx.coroutines.channels.BufferedChannel$k
            r9.<init>(r8)
            goto L3d
        L3c:
            r9 = 0
        L3d:
            r6.c = r9
            kotlinx.coroutines.internal.s0 r9 = kotlinx.coroutines.channels.i.l()
            r6._closeCause = r9
            return
        L46:
            r6 = r8
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "Invalid channel capacity: "
            r10.append(r0)
            r10.append(r9)
            java.lang.String r9 = ", should be >=0"
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
    }

    public /* synthetic */ BufferedChannel(int r1, kotlin.jvm.functions.Function1 r2, int r3, kotlin.jvm.internal.v r4) {
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            r0.<init>(r1, r2)
            return
    }

    public static final /* synthetic */ java.lang.Object A(kotlinx.coroutines.channels.BufferedChannel r0, java.lang.Object r1, java.lang.Object r2) {
            java.lang.Object r0 = r0.U0(r1, r2)
            return r0
    }

    @kotlinx.coroutines.ExperimentalCoroutinesApi
    public static /* synthetic */ void A0() {
            return
    }

    private final java.lang.Object A1(kotlinx.coroutines.channels.o<E> r7, int r8, long r9, java.lang.Object r11) {
            r6 = this;
            java.lang.Object r0 = r7.y(r8)
            if (r0 != 0) goto L31
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = kotlinx.coroutines.channels.BufferedChannel.d
            long r1 = r1.get(r6)
            r3 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r1 = r1 & r3
            int r3 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r3 < 0) goto L2b
            if (r11 != 0) goto L1d
            kotlinx.coroutines.internal.s0 r7 = kotlinx.coroutines.channels.i.s()
            return r7
        L1d:
            boolean r0 = r7.t(r8, r0, r11)
            if (r0 == 0) goto L2b
            r6.Z()
            kotlinx.coroutines.internal.s0 r7 = kotlinx.coroutines.channels.i.r()
            return r7
        L2b:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r5 = r11
            goto L47
        L31:
            kotlinx.coroutines.internal.s0 r1 = kotlinx.coroutines.channels.i.f
            if (r0 != r1) goto L2b
            kotlinx.coroutines.internal.s0 r1 = kotlinx.coroutines.channels.i.f()
            boolean r0 = r7.t(r8, r0, r1)
            if (r0 == 0) goto L2b
            r6.Z()
            java.lang.Object r7 = r7.A(r8)
            return r7
        L47:
            java.lang.Object r7 = r0.B1(r1, r2, r3, r5)
            return r7
    }

    public static final /* synthetic */ java.lang.Object B(kotlinx.coroutines.channels.BufferedChannel r0, java.lang.Object r1, java.lang.Object r2) {
            java.lang.Object r0 = r0.V0(r1, r2)
            return r0
    }

    private final boolean B0() {
            r5 = this;
            long r0 = r5.e0()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L16
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L14
            goto L16
        L14:
            r0 = 0
            return r0
        L16:
            r0 = 1
            return r0
    }

    private final java.lang.Object B1(kotlinx.coroutines.channels.o<E> r6, int r7, long r8, java.lang.Object r10) {
            r5 = this;
        L0:
            java.lang.Object r0 = r6.y(r7)
            if (r0 == 0) goto L8a
            kotlinx.coroutines.internal.s0 r1 = kotlinx.coroutines.channels.i.k()
            if (r0 != r1) goto Le
            goto L8a
        Le:
            kotlinx.coroutines.internal.s0 r1 = kotlinx.coroutines.channels.i.f
            if (r0 != r1) goto L24
            kotlinx.coroutines.internal.s0 r1 = kotlinx.coroutines.channels.i.f()
            boolean r0 = r6.t(r7, r0, r1)
            if (r0 == 0) goto L0
            r5.Z()
            java.lang.Object r6 = r6.A(r7)
            return r6
        L24:
            kotlinx.coroutines.internal.s0 r1 = kotlinx.coroutines.channels.i.j()
            if (r0 != r1) goto L2f
            kotlinx.coroutines.internal.s0 r6 = kotlinx.coroutines.channels.i.h()
            return r6
        L2f:
            kotlinx.coroutines.internal.s0 r1 = kotlinx.coroutines.channels.i.o()
            if (r0 != r1) goto L3a
            kotlinx.coroutines.internal.s0 r6 = kotlinx.coroutines.channels.i.h()
            return r6
        L3a:
            kotlinx.coroutines.internal.s0 r1 = kotlinx.coroutines.channels.i.z()
            if (r0 != r1) goto L48
            r5.Z()
            kotlinx.coroutines.internal.s0 r6 = kotlinx.coroutines.channels.i.h()
            return r6
        L48:
            kotlinx.coroutines.internal.s0 r1 = kotlinx.coroutines.channels.i.p()
            if (r0 == r1) goto L0
            kotlinx.coroutines.internal.s0 r1 = kotlinx.coroutines.channels.i.q()
            boolean r1 = r6.t(r7, r0, r1)
            if (r1 == 0) goto L0
            boolean r8 = r0 instanceof kotlinx.coroutines.channels.e0
            if (r8 == 0) goto L60
            kotlinx.coroutines.channels.e0 r0 = (kotlinx.coroutines.channels.e0) r0
            kotlinx.coroutines.r3 r0 = r0.a
        L60:
            boolean r9 = r5.w1(r0, r6, r7)
            if (r9 == 0) goto L75
            kotlinx.coroutines.internal.s0 r8 = kotlinx.coroutines.channels.i.f()
            r6.C(r7, r8)
            r5.Z()
            java.lang.Object r6 = r6.A(r7)
            return r6
        L75:
            kotlinx.coroutines.internal.s0 r9 = kotlinx.coroutines.channels.i.j()
            r6.C(r7, r9)
            r9 = 0
            r6.z(r7, r9)
            if (r8 == 0) goto L85
            r5.Z()
        L85:
            kotlinx.coroutines.internal.s0 r6 = kotlinx.coroutines.channels.i.h()
            return r6
        L8a:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = kotlinx.coroutines.channels.BufferedChannel.d
            long r1 = r1.get(r5)
            r3 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r1 = r1 & r3
            int r3 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r3 >= 0) goto Lac
            kotlinx.coroutines.internal.s0 r1 = kotlinx.coroutines.channels.i.o()
            boolean r0 = r6.t(r7, r0, r1)
            if (r0 == 0) goto L0
            r5.Z()
            kotlinx.coroutines.internal.s0 r6 = kotlinx.coroutines.channels.i.h()
            return r6
        Lac:
            if (r10 != 0) goto Lb3
            kotlinx.coroutines.internal.s0 r6 = kotlinx.coroutines.channels.i.s()
            return r6
        Lb3:
            boolean r0 = r6.t(r7, r0, r10)
            if (r0 == 0) goto L0
            r5.Z()
            kotlinx.coroutines.internal.s0 r6 = kotlinx.coroutines.channels.i.r()
            return r6
    }

    public static final /* synthetic */ java.lang.Object C(kotlinx.coroutines.channels.BufferedChannel r0, java.lang.Object r1, java.lang.Object r2) {
            java.lang.Object r0 = r0.W0(r1, r2)
            return r0
    }

    private final void C0(java.util.concurrent.atomic.AtomicLongFieldUpdater r3, kotlin.jvm.functions.Function1<? super java.lang.Long, kotlin.n1> r4, java.lang.Object r5) {
            r2 = this;
        L0:
            long r0 = r3.get(r5)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r4.invoke(r0)
            goto L0
    }

    private final int C1(kotlinx.coroutines.channels.o<E> r5, int r6, E r7, long r8, java.lang.Object r10, boolean r11) {
            r4 = this;
            r5.D(r6, r7)
            if (r11 == 0) goto Lb
            int r5 = r4.D1(r5, r6, r7, r8, r10, r11)
            r6 = r4
            return r5
        Lb:
            r0 = r11
            r11 = r10
            r9 = r8
            r8 = r7
            r7 = r4
            java.lang.Object r1 = r5.y(r6)
            r2 = 1
            if (r1 != 0) goto L38
            boolean r1 = r4.L(r9)
            r3 = 0
            if (r1 == 0) goto L2c
            kotlinx.coroutines.internal.s0 r1 = kotlinx.coroutines.channels.i.f
            boolean r1 = r5.t(r6, r3, r1)
            if (r1 == 0) goto L27
            return r2
        L27:
            r7 = r8
            r8 = r9
            r10 = r11
            r11 = r0
            goto L64
        L2c:
            if (r11 != 0) goto L30
            r5 = 3
            return r5
        L30:
            boolean r1 = r5.t(r6, r3, r11)
            if (r1 == 0) goto L27
            r5 = 2
            return r5
        L38:
            boolean r3 = r1 instanceof kotlinx.coroutines.r3
            if (r3 == 0) goto L27
            r5.u(r6)
            boolean r8 = r4.v1(r1, r8)
            if (r8 == 0) goto L51
            kotlinx.coroutines.internal.s0 r8 = kotlinx.coroutines.channels.i.f()
            r5.C(r6, r8)
            r4.Q0()
            r5 = 0
            return r5
        L51:
            kotlinx.coroutines.internal.s0 r8 = kotlinx.coroutines.channels.i.i()
            java.lang.Object r8 = r5.v(r6, r8)
            kotlinx.coroutines.internal.s0 r9 = kotlinx.coroutines.channels.i.i()
            if (r8 == r9) goto L62
            r5.z(r6, r2)
        L62:
            r5 = 5
            return r5
        L64:
            int r5 = r4.D1(r5, r6, r7, r8, r10, r11)
            return r5
    }

    private final void D0(java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2, kotlin.jvm.functions.Function1<java.lang.Object, kotlin.n1> r3, java.lang.Object r4) {
            r1 = this;
        L0:
            java.lang.Object r0 = r2.get(r4)
            r3.invoke(r0)
            goto L0
    }

    private final int D1(kotlinx.coroutines.channels.o<E> r6, int r7, E r8, long r9, java.lang.Object r11, boolean r12) {
            r5 = this;
        L0:
            java.lang.Object r0 = r6.y(r7)
            r1 = 4
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L37
            boolean r0 = r5.L(r9)
            r4 = 0
            if (r0 == 0) goto L1b
            if (r12 != 0) goto L1b
            kotlinx.coroutines.internal.s0 r0 = kotlinx.coroutines.channels.i.f
            boolean r0 = r6.t(r7, r4, r0)
            if (r0 == 0) goto L0
            return r3
        L1b:
            if (r12 == 0) goto L2b
            kotlinx.coroutines.internal.s0 r0 = kotlinx.coroutines.channels.i.j()
            boolean r0 = r6.t(r7, r4, r0)
            if (r0 == 0) goto L0
            r6.z(r7, r2)
            return r1
        L2b:
            if (r11 != 0) goto L2f
            r6 = 3
            return r6
        L2f:
            boolean r0 = r6.t(r7, r4, r11)
            if (r0 == 0) goto L0
            r6 = 2
            return r6
        L37:
            kotlinx.coroutines.internal.s0 r4 = kotlinx.coroutines.channels.i.k()
            if (r0 != r4) goto L46
            kotlinx.coroutines.internal.s0 r1 = kotlinx.coroutines.channels.i.f
            boolean r0 = r6.t(r7, r0, r1)
            if (r0 == 0) goto L0
            return r3
        L46:
            kotlinx.coroutines.internal.s0 r9 = kotlinx.coroutines.channels.i.i()
            r10 = 5
            if (r0 != r9) goto L51
            r6.u(r7)
            return r10
        L51:
            kotlinx.coroutines.internal.s0 r9 = kotlinx.coroutines.channels.i.o()
            if (r0 != r9) goto L5b
            r6.u(r7)
            return r10
        L5b:
            kotlinx.coroutines.internal.s0 r9 = kotlinx.coroutines.channels.i.z()
            if (r0 != r9) goto L68
            r6.u(r7)
            r5.X()
            return r1
        L68:
            r6.u(r7)
            boolean r9 = r0 instanceof kotlinx.coroutines.channels.e0
            if (r9 == 0) goto L73
            kotlinx.coroutines.channels.e0 r0 = (kotlinx.coroutines.channels.e0) r0
            kotlinx.coroutines.r3 r0 = r0.a
        L73:
            boolean r8 = r5.v1(r0, r8)
            if (r8 == 0) goto L84
            kotlinx.coroutines.internal.s0 r8 = kotlinx.coroutines.channels.i.f()
            r6.C(r7, r8)
            r5.Q0()
            return r2
        L84:
            kotlinx.coroutines.internal.s0 r8 = kotlinx.coroutines.channels.i.i()
            java.lang.Object r8 = r6.v(r7, r8)
            kotlinx.coroutines.internal.s0 r9 = kotlinx.coroutines.channels.i.i()
            if (r8 == r9) goto L95
            r6.z(r7, r3)
        L95:
            return r10
    }

    public static final /* synthetic */ java.lang.Object E(kotlinx.coroutines.channels.BufferedChannel r0, java.lang.Object r1, java.lang.Object r2) {
            java.lang.Object r0 = r0.X0(r1, r2)
            return r0
    }

    private final long E0(kotlinx.coroutines.channels.o<E> r9) {
            r8 = this;
        L0:
            int r0 = kotlinx.coroutines.channels.i.b
            int r0 = r0 + (-1)
        L4:
            r1 = -1
            r3 = -1
            if (r3 >= r0) goto L3d
            long r3 = r9.c
            int r5 = kotlinx.coroutines.channels.i.b
            long r5 = (long) r5
            long r3 = r3 * r5
            long r5 = (long) r0
            long r3 = r3 + r5
            long r5 = r8.m0()
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto L1b
            return r1
        L1b:
            java.lang.Object r1 = r9.y(r0)
            if (r1 == 0) goto L2d
            kotlinx.coroutines.internal.s0 r2 = kotlinx.coroutines.channels.i.k()
            if (r1 != r2) goto L28
            goto L2d
        L28:
            kotlinx.coroutines.internal.s0 r2 = kotlinx.coroutines.channels.i.f
            if (r1 != r2) goto L3a
            return r3
        L2d:
            kotlinx.coroutines.internal.s0 r2 = kotlinx.coroutines.channels.i.z()
            boolean r1 = r9.t(r0, r1, r2)
            if (r1 == 0) goto L1b
            r9.r()
        L3a:
            int r0 = r0 + (-1)
            goto L4
        L3d:
            kotlinx.coroutines.internal.g r9 = r9.g()
            kotlinx.coroutines.channels.o r9 = (kotlinx.coroutines.channels.o) r9
            if (r9 != 0) goto L0
            return r1
    }

    private final void E1(long r8) {
            r7 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = kotlinx.coroutines.channels.BufferedChannel.e
        L2:
            long r3 = r0.get(r7)
            int r1 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r1 < 0) goto Lb
            goto L15
        Lb:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = kotlinx.coroutines.channels.BufferedChannel.e
            r2 = r7
            r5 = r8
            boolean r8 = r1.compareAndSet(r2, r3, r5)
            if (r8 == 0) goto L16
        L15:
            return
        L16:
            r8 = r5
            goto L2
    }

    public static final /* synthetic */ java.lang.Object F(kotlinx.coroutines.channels.BufferedChannel r0, kotlinx.coroutines.channels.o r1, int r2, long r3, kotlin.coroutines.e r5) {
            java.lang.Object r0 = r0.a1(r1, r2, r3, r5)
            return r0
    }

    private final void F0() {
            r6 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = kotlinx.coroutines.channels.BufferedChannel.d
        L2:
            long r2 = r0.get(r6)
            r1 = 60
            long r4 = r2 >> r1
            int r1 = (int) r4
            if (r1 != 0) goto L1f
            r4 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r4 = r4 & r2
            r1 = 1
            long r4 = kotlinx.coroutines.channels.i.b(r4, r1)
            r1 = r6
            boolean r2 = r0.compareAndSet(r1, r2, r4)
            if (r2 == 0) goto L2
        L1f:
            return
    }

    private final void F1(long r8) {
            r7 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = kotlinx.coroutines.channels.BufferedChannel.d
        L2:
            long r3 = r0.get(r7)
            r1 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r1 = r1 & r3
            int r5 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r5 < 0) goto L11
            goto L23
        L11:
            r5 = 60
            long r5 = r3 >> r5
            int r6 = (int) r5
            long r5 = kotlinx.coroutines.channels.i.b(r1, r6)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = kotlinx.coroutines.channels.BufferedChannel.d
            r2 = r7
            boolean r1 = r1.compareAndSet(r2, r3, r5)
            if (r1 == 0) goto L2
        L23:
            return
    }

    public static final /* synthetic */ java.lang.Object G(kotlinx.coroutines.channels.BufferedChannel r0, kotlinx.coroutines.channels.o r1, int r2, long r3, kotlin.coroutines.e r5) {
            java.lang.Object r0 = r0.e1(r1, r2, r3, r5)
            return r0
    }

    private final void G0() {
            r6 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = kotlinx.coroutines.channels.BufferedChannel.d
        L2:
            long r2 = r0.get(r6)
            r4 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r4 = r4 & r2
            r1 = 3
            long r4 = kotlinx.coroutines.channels.i.b(r4, r1)
            r1 = r6
            boolean r2 = r0.compareAndSet(r1, r2, r4)
            if (r2 == 0) goto L2
            return
    }

    public static final /* synthetic */ void H(kotlinx.coroutines.channels.BufferedChannel r0, kotlinx.coroutines.selects.m r1, java.lang.Object r2) {
            r0.f1(r1, r2)
            return
    }

    private final void H0() {
            r7 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = kotlinx.coroutines.channels.BufferedChannel.d
        L2:
            long r2 = r0.get(r7)
            r1 = 60
            long r4 = r2 >> r1
            int r1 = (int) r4
            r4 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            if (r1 == 0) goto L1e
            r6 = 1
            if (r1 == r6) goto L16
            goto L2b
        L16:
            long r4 = r4 & r2
            r1 = 3
            long r4 = kotlinx.coroutines.channels.i.b(r4, r1)
        L1c:
            r1 = r7
            goto L25
        L1e:
            long r4 = r4 & r2
            r1 = 2
            long r4 = kotlinx.coroutines.channels.i.b(r4, r1)
            goto L1c
        L25:
            boolean r2 = r0.compareAndSet(r1, r2, r4)
            if (r2 == 0) goto L2
        L2b:
            return
    }

    public static final /* synthetic */ java.lang.Object I(kotlinx.coroutines.channels.BufferedChannel r0, kotlinx.coroutines.channels.o r1, int r2, java.lang.Object r3, long r4, kotlin.coroutines.e r6) {
            java.lang.Object r0 = r0.r1(r1, r2, r3, r4, r6)
            return r0
    }

    private final void I0(long r6, kotlinx.coroutines.channels.o<E> r8) {
            r5 = this;
        L0:
            long r0 = r8.c
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 >= 0) goto L11
            kotlinx.coroutines.internal.g r0 = r8.e()
            kotlinx.coroutines.channels.o r0 = (kotlinx.coroutines.channels.o) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r8 = r0
            goto L0
        L11:
            boolean r6 = r8.h()
            if (r6 == 0) goto L22
            kotlinx.coroutines.internal.g r6 = r8.e()
            kotlinx.coroutines.channels.o r6 = (kotlinx.coroutines.channels.o) r6
            if (r6 != 0) goto L20
            goto L22
        L20:
            r8 = r6
            goto L11
        L22:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = kotlinx.coroutines.channels.BufferedChannel.j
        L24:
            java.lang.Object r7 = r6.get(r5)
            kotlinx.coroutines.internal.p0 r7 = (kotlinx.coroutines.internal.p0) r7
            long r0 = r7.c
            long r2 = r8.c
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L33
            return
        L33:
            boolean r0 = r8.s()
            if (r0 != 0) goto L3a
            goto L11
        L3a:
            boolean r0 = androidx.concurrent.futures.a.a(r6, r5, r7, r8)
            if (r0 == 0) goto L4a
            boolean r6 = r7.o()
            if (r6 == 0) goto L49
            r7.l()
        L49:
            return
        L4a:
            boolean r7 = r8.o()
            if (r7 == 0) goto L24
            r8.l()
            goto L24
    }

    public static final /* synthetic */ java.lang.Object J(kotlinx.coroutines.channels.BufferedChannel r0, kotlinx.coroutines.channels.o r1, int r2, long r3, java.lang.Object r5) {
            java.lang.Object r0 = r0.A1(r1, r2, r3, r5)
            return r0
    }

    public static final /* synthetic */ int K(kotlinx.coroutines.channels.BufferedChannel r0, kotlinx.coroutines.channels.o r1, int r2, java.lang.Object r3, long r4, java.lang.Object r6, boolean r7) {
            int r0 = r0.C1(r1, r2, r3, r4, r6, r7)
            return r0
    }

    private final void K0(kotlinx.coroutines.p<? super kotlinx.coroutines.channels.n<? extends E>> r3) {
            r2 = this;
            kotlin.Result$a r0 = kotlin.Result.Companion
            kotlinx.coroutines.channels.n$b r0 = kotlinx.coroutines.channels.n.b
            java.lang.Throwable r1 = r2.f0()
            java.lang.Object r0 = r0.a(r1)
            kotlinx.coroutines.channels.n r0 = kotlinx.coroutines.channels.n.b(r0)
            java.lang.Object r0 = kotlin.Result.m11constructorimpl(r0)
            r3.resumeWith(r0)
            return
    }

    private final boolean L(long r5) {
            r4 = this;
            long r0 = r4.e0()
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 < 0) goto L17
            long r0 = r4.m0()
            int r2 = r4.a
            long r2 = (long) r2
            long r0 = r0 + r2
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 >= 0) goto L15
            goto L17
        L15:
            r5 = 0
            return r5
        L17:
            r5 = 1
            return r5
    }

    private final void L0(kotlinx.coroutines.p<? super E> r2) {
            r1 = this;
            kotlin.Result$a r0 = kotlin.Result.Companion
            java.lang.Throwable r0 = r1.l0()
            java.lang.Object r0 = kotlin.g0.a(r0)
            java.lang.Object r0 = kotlin.Result.m11constructorimpl(r0)
            r2.resumeWith(r0)
            return
    }

    private final void M0(kotlinx.coroutines.selects.m<?> r2) {
            r1 = this;
            kotlinx.coroutines.internal.s0 r0 = kotlinx.coroutines.channels.i.z()
            r2.f(r0)
            return
    }

    private final void N0(E r3, kotlinx.coroutines.selects.m<?> r4) {
            r2 = this;
            kotlin.jvm.functions.Function1<E, kotlin.n1> r0 = r2.b
            if (r0 == 0) goto Lb
            kotlin.coroutines.i r1 = r4.getContext()
            kotlinx.coroutines.internal.j0.b(r0, r3, r1)
        Lb:
            kotlinx.coroutines.internal.s0 r3 = kotlinx.coroutines.channels.i.z()
            r4.f(r3)
            return
    }

    private final void O(kotlinx.coroutines.channels.o<E> r9, long r10) {
            r8 = this;
            r0 = 0
            r1 = 1
            java.lang.Object r0 = kotlinx.coroutines.internal.q.c(r0, r1, r0)
        L6:
            r2 = -1
            if (r9 == 0) goto L6f
            int r3 = kotlinx.coroutines.channels.i.b
            int r3 = r3 - r1
        Lc:
            if (r2 >= r3) goto L68
            long r4 = r9.c
            int r6 = kotlinx.coroutines.channels.i.b
            long r6 = (long) r6
            long r4 = r4 * r6
            long r6 = (long) r3
            long r4 = r4 + r6
            int r6 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r6 < 0) goto L6f
        L1b:
            java.lang.Object r4 = r9.y(r3)
            if (r4 == 0) goto L58
            kotlinx.coroutines.internal.s0 r5 = kotlinx.coroutines.channels.i.k()
            if (r4 != r5) goto L28
            goto L58
        L28:
            boolean r5 = r4 instanceof kotlinx.coroutines.channels.e0
            if (r5 == 0) goto L42
            kotlinx.coroutines.internal.s0 r5 = kotlinx.coroutines.channels.i.z()
            boolean r5 = r9.t(r3, r4, r5)
            if (r5 == 0) goto L1b
            kotlinx.coroutines.channels.e0 r4 = (kotlinx.coroutines.channels.e0) r4
            kotlinx.coroutines.r3 r4 = r4.a
            java.lang.Object r0 = kotlinx.coroutines.internal.q.h(r0, r4)
            r9.z(r3, r1)
            goto L65
        L42:
            boolean r5 = r4 instanceof kotlinx.coroutines.r3
            if (r5 == 0) goto L65
            kotlinx.coroutines.internal.s0 r5 = kotlinx.coroutines.channels.i.z()
            boolean r5 = r9.t(r3, r4, r5)
            if (r5 == 0) goto L1b
            java.lang.Object r0 = kotlinx.coroutines.internal.q.h(r0, r4)
            r9.z(r3, r1)
            goto L65
        L58:
            kotlinx.coroutines.internal.s0 r5 = kotlinx.coroutines.channels.i.z()
            boolean r4 = r9.t(r3, r4, r5)
            if (r4 == 0) goto L1b
            r9.r()
        L65:
            int r3 = r3 + (-1)
            goto Lc
        L68:
            kotlinx.coroutines.internal.g r9 = r9.g()
            kotlinx.coroutines.channels.o r9 = (kotlinx.coroutines.channels.o) r9
            goto L6
        L6f:
            if (r0 == 0) goto L95
            boolean r9 = r0 instanceof java.util.ArrayList
            if (r9 != 0) goto L7b
            kotlinx.coroutines.r3 r0 = (kotlinx.coroutines.r3) r0
            r8.i1(r0)
            return
        L7b:
            java.lang.String r9 = "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }"
            kotlin.jvm.internal.g0.n(r0, r9)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r9 = r0.size()
            int r9 = r9 - r1
        L87:
            if (r2 >= r9) goto L95
            java.lang.Object r10 = r0.get(r9)
            kotlinx.coroutines.r3 r10 = (kotlinx.coroutines.r3) r10
            r8.i1(r10)
            int r9 = r9 + (-1)
            goto L87
        L95:
            return
    }

    private final java.lang.Object O0(E r5, kotlin.coroutines.e<? super kotlin.n1> r6) {
            r4 = this;
            kotlinx.coroutines.q r0 = new kotlinx.coroutines.q
            kotlin.coroutines.e r1 = kotlin.coroutines.intrinsics.a.e(r6)
            r2 = 1
            r0.<init>(r1, r2)
            r0.Q()
            kotlin.jvm.functions.Function1<E, kotlin.n1> r1 = r4.b
            if (r1 == 0) goto L2e
            r2 = 2
            r3 = 0
            kotlinx.coroutines.internal.UndeliveredElementException r5 = kotlinx.coroutines.internal.j0.d(r1, r5, r3, r2, r3)
            if (r5 == 0) goto L2e
            java.lang.Throwable r1 = r4.n0()
            kotlin.l.a(r5, r1)
            kotlin.Result$a r1 = kotlin.Result.Companion
            java.lang.Object r5 = kotlin.g0.a(r5)
            java.lang.Object r5 = kotlin.Result.m11constructorimpl(r5)
            r0.resumeWith(r5)
            goto L3f
        L2e:
            java.lang.Throwable r5 = r4.n0()
            kotlin.Result$a r1 = kotlin.Result.Companion
            java.lang.Object r5 = kotlin.g0.a(r5)
            java.lang.Object r5 = kotlin.Result.m11constructorimpl(r5)
            r0.resumeWith(r5)
        L3f:
            java.lang.Object r5 = r0.x()
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
            if (r5 != r0) goto L4c
            kotlin.coroutines.jvm.internal.e.c(r6)
        L4c:
            java.lang.Object r6 = kotlin.coroutines.intrinsics.a.l()
            if (r5 != r6) goto L53
            return r5
        L53:
            kotlin.n1 r5 = kotlin.n1.a
            return r5
    }

    private final void P0(E r3, kotlinx.coroutines.p<? super kotlin.n1> r4) {
            r2 = this;
            kotlin.jvm.functions.Function1<E, kotlin.n1> r0 = r2.b
            if (r0 == 0) goto Lb
            kotlin.coroutines.i r1 = r4.getContext()
            kotlinx.coroutines.internal.j0.b(r0, r3, r1)
        Lb:
            java.lang.Throwable r3 = r2.n0()
            kotlin.Result$a r0 = kotlin.Result.Companion
            java.lang.Object r3 = kotlin.g0.a(r3)
            java.lang.Object r3 = kotlin.Result.m11constructorimpl(r3)
            r4.resumeWith(r3)
            return
    }

    private final kotlinx.coroutines.channels.o<E> Q() {
            r7 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.channels.BufferedChannel.j
            java.lang.Object r0 = r0.get(r7)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.channels.BufferedChannel.h
            java.lang.Object r1 = r1.get(r7)
            kotlinx.coroutines.channels.o r1 = (kotlinx.coroutines.channels.o) r1
            long r2 = r1.c
            r4 = r0
            kotlinx.coroutines.channels.o r4 = (kotlinx.coroutines.channels.o) r4
            long r4 = r4.c
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L1a
            r0 = r1
        L1a:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.channels.BufferedChannel.i
            java.lang.Object r1 = r1.get(r7)
            kotlinx.coroutines.channels.o r1 = (kotlinx.coroutines.channels.o) r1
            long r2 = r1.c
            r4 = r0
            kotlinx.coroutines.channels.o r4 = (kotlinx.coroutines.channels.o) r4
            long r4 = r4.c
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L2e
            r0 = r1
        L2e:
            kotlinx.coroutines.internal.g r0 = (kotlinx.coroutines.internal.g) r0
            kotlinx.coroutines.internal.g r0 = kotlinx.coroutines.internal.f.d(r0)
            kotlinx.coroutines.channels.o r0 = (kotlinx.coroutines.channels.o) r0
            return r0
    }

    private final void S0(kotlinx.coroutines.r3 r1, kotlinx.coroutines.channels.o<E> r2, int r3) {
            r0 = this;
            r0.R0()
            r1.b(r2, r3)
            return
    }

    private final void T0(kotlinx.coroutines.r3 r2, kotlinx.coroutines.channels.o<E> r3, int r4) {
            r1 = this;
            int r0 = kotlinx.coroutines.channels.i.b
            int r4 = r4 + r0
            r2.b(r3, r4)
            return
    }

    private final java.lang.Object U0(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            kotlinx.coroutines.internal.s0 r1 = kotlinx.coroutines.channels.i.z()
            if (r2 == r1) goto L7
            return r2
        L7:
            java.lang.Throwable r1 = r0.l0()
            throw r1
    }

    private final void V(long r1) {
            r0 = this;
            kotlinx.coroutines.channels.o r1 = r0.W(r1)
            r0.h1(r1)
            return
    }

    private final java.lang.Object V0(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            kotlinx.coroutines.internal.s0 r1 = kotlinx.coroutines.channels.i.z()
            if (r2 != r1) goto L11
            kotlinx.coroutines.channels.n$b r1 = kotlinx.coroutines.channels.n.b
            java.lang.Throwable r2 = r0.f0()
            java.lang.Object r1 = r1.a(r2)
            goto L17
        L11:
            kotlinx.coroutines.channels.n$b r1 = kotlinx.coroutines.channels.n.b
            java.lang.Object r1 = r1.c(r2)
        L17:
            kotlinx.coroutines.channels.n r1 = kotlinx.coroutines.channels.n.b(r1)
            return r1
    }

    private final kotlinx.coroutines.channels.o<E> W(long r7) {
            r6 = this;
            kotlinx.coroutines.channels.o r0 = r6.Q()
            boolean r1 = r6.z0()
            if (r1 == 0) goto L17
            long r1 = r6.E0(r0)
            r3 = -1
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L17
            r6.Y(r1)
        L17:
            r6.O(r0, r7)
            return r0
    }

    private final java.lang.Object W0(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            kotlinx.coroutines.internal.s0 r1 = kotlinx.coroutines.channels.i.z()
            if (r2 != r1) goto L13
            java.lang.Throwable r1 = r0.f0()
            if (r1 != 0) goto Le
            r1 = 0
            return r1
        Le:
            java.lang.Throwable r1 = r0.l0()
            throw r1
        L13:
            return r2
    }

    private final void X() {
            r0 = this;
            r0.z()
            return
    }

    private final java.lang.Object X0(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            kotlinx.coroutines.internal.s0 r1 = kotlinx.coroutines.channels.i.z()
            if (r2 == r1) goto L7
            return r0
        L7:
            java.lang.Throwable r1 = r0.n0()
            throw r1
    }

    static /* synthetic */ <E> java.lang.Object Y0(kotlinx.coroutines.channels.BufferedChannel<E> r9, kotlin.coroutines.e<? super E> r10) {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f()
            java.lang.Object r0 = r0.get(r9)
            kotlinx.coroutines.channels.o r0 = (kotlinx.coroutines.channels.o) r0
        La:
            boolean r1 = r9.D()
            if (r1 != 0) goto L69
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = g()
            long r5 = r1.getAndIncrement(r9)
            int r1 = kotlinx.coroutines.channels.i.b
            long r2 = (long) r1
            long r2 = r5 / r2
            long r7 = (long) r1
            long r7 = r5 % r7
            int r4 = (int) r7
            long r7 = r0.c
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 == 0) goto L30
            kotlinx.coroutines.channels.o r1 = c(r9, r2, r0)
            if (r1 != 0) goto L2e
            goto La
        L2e:
            r3 = r1
            goto L31
        L30:
            r3 = r0
        L31:
            r7 = 0
            r2 = r9
            java.lang.Object r9 = J(r2, r3, r4, r5, r7)
            kotlinx.coroutines.internal.s0 r0 = kotlinx.coroutines.channels.i.r()
            if (r9 == r0) goto L61
            kotlinx.coroutines.internal.s0 r0 = kotlinx.coroutines.channels.i.h()
            if (r9 != r0) goto L51
            long r0 = r2.o0()
            int r9 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r9 >= 0) goto L4e
            r3.b()
        L4e:
            r9 = r2
            r0 = r3
            goto La
        L51:
            kotlinx.coroutines.internal.s0 r0 = kotlinx.coroutines.channels.i.s()
            if (r9 != r0) goto L5d
            r7 = r10
            java.lang.Object r9 = r2.e1(r3, r4, r5, r7)
            return r9
        L5d:
            r3.b()
            return r9
        L61:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "unexpected"
            r9.<init>(r10)
            throw r9
        L69:
            r2 = r9
            java.lang.Throwable r9 = r2.l0()
            java.lang.Throwable r9 = kotlinx.coroutines.internal.r0.o(r9)
            throw r9
    }

    private final void Z() {
            r13 = this;
            boolean r0 = r13.B0()
            if (r0 == 0) goto L7
            return
        L7:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.channels.BufferedChannel.j
            java.lang.Object r0 = r0.get(r13)
            kotlinx.coroutines.channels.o r0 = (kotlinx.coroutines.channels.o) r0
            r4 = r0
        L10:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = kotlinx.coroutines.channels.BufferedChannel.f
            long r5 = r0.getAndIncrement(r13)
            int r0 = kotlinx.coroutines.channels.i.b
            long r1 = (long) r0
            long r2 = r5 / r1
            long r7 = r13.o0()
            r9 = 0
            r10 = 1
            r11 = 0
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 > 0) goto L3a
            long r0 = r4.c
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 >= 0) goto L36
            kotlinx.coroutines.internal.g r0 = r4.e()
            if (r0 == 0) goto L36
            r13.I0(r2, r4)
        L36:
            r0(r13, r11, r10, r9)
            return
        L3a:
            long r7 = r4.c
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 == 0) goto L4a
            r1 = r13
            kotlinx.coroutines.channels.o r2 = r1.a0(r2, r4, r5)
            if (r2 != 0) goto L48
            goto L10
        L48:
            r4 = r2
            goto L4b
        L4a:
            r1 = r13
        L4b:
            long r2 = (long) r0
            long r2 = r5 % r2
            int r0 = (int) r2
            boolean r0 = r13.y1(r4, r0, r5)
            if (r0 == 0) goto L59
            r0(r13, r11, r10, r9)
            return
        L59:
            r0(r13, r11, r10, r9)
            goto L10
    }

    static /* synthetic */ <E> java.lang.Object Z0(kotlinx.coroutines.channels.BufferedChannel<E> r13, kotlin.coroutines.e<? super kotlinx.coroutines.channels.n<? extends E>> r14) {
            boolean r0 = r14 instanceof kotlinx.coroutines.channels.BufferedChannel.l
            if (r0 == 0) goto L14
            r0 = r14
            kotlinx.coroutines.channels.BufferedChannel$l r0 = (kotlinx.coroutines.channels.BufferedChannel.l) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.c = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            kotlinx.coroutines.channels.BufferedChannel$l r0 = new kotlinx.coroutines.channels.BufferedChannel$l
            r0.<init>(r13, r14)
            goto L12
        L1a:
            java.lang.Object r14 = r6.a
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
            int r1 = r6.c
            r2 = 1
            if (r1 == 0) goto L39
            if (r1 != r2) goto L31
            kotlin.g0.n(r14)
            kotlinx.coroutines.channels.n r14 = (kotlinx.coroutines.channels.n) r14
            java.lang.Object r13 = r14.o()
            return r13
        L31:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L39:
            kotlin.g0.n(r14)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r14 = f()
            java.lang.Object r14 = r14.get(r13)
            kotlinx.coroutines.channels.o r14 = (kotlinx.coroutines.channels.o) r14
        L46:
            boolean r1 = r13.D()
            if (r1 == 0) goto L57
            kotlinx.coroutines.channels.n$b r14 = kotlinx.coroutines.channels.n.b
            java.lang.Throwable r13 = r13.f0()
            java.lang.Object r13 = r14.a(r13)
            return r13
        L57:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = g()
            long r4 = r1.getAndIncrement(r13)
            int r1 = kotlinx.coroutines.channels.i.b
            long r7 = (long) r1
            long r7 = r4 / r7
            long r9 = (long) r1
            long r9 = r4 % r9
            int r3 = (int) r9
            long r9 = r14.c
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r1 == 0) goto L77
            kotlinx.coroutines.channels.o r1 = c(r13, r7, r14)
            if (r1 != 0) goto L75
            goto L46
        L75:
            r8 = r1
            goto L78
        L77:
            r8 = r14
        L78:
            r12 = 0
            r7 = r13
            r9 = r3
            r10 = r4
            java.lang.Object r13 = J(r7, r8, r9, r10, r12)
            r1 = r7
            kotlinx.coroutines.internal.s0 r14 = kotlinx.coroutines.channels.i.r()
            if (r13 == r14) goto Lb6
            kotlinx.coroutines.internal.s0 r14 = kotlinx.coroutines.channels.i.h()
            if (r13 != r14) goto L9b
            long r13 = r1.o0()
            int r3 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r3 >= 0) goto L98
            r8.b()
        L98:
            r13 = r1
            r14 = r8
            goto L46
        L9b:
            kotlinx.coroutines.internal.s0 r14 = kotlinx.coroutines.channels.i.s()
            if (r13 != r14) goto Lac
            r6.c = r2
            r2 = r8
            java.lang.Object r13 = r1.a1(r2, r3, r4, r6)
            if (r13 != r0) goto Lab
            return r0
        Lab:
            return r13
        Lac:
            r8.b()
            kotlinx.coroutines.channels.n$b r14 = kotlinx.coroutines.channels.n.b
            java.lang.Object r13 = r14.c(r13)
            return r13
        Lb6:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "unexpected"
            r13.<init>(r14)
            throw r13
    }

    private final kotlinx.coroutines.channels.o<E> a0(long r15, kotlinx.coroutines.channels.o<E> r17, long r18) {
            r14 = this;
            r2 = r15
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.channels.BufferedChannel.j
            kotlin.reflect.i r4 = kotlinx.coroutines.channels.i.y()
            kotlin.jvm.functions.Function2 r4 = (kotlin.jvm.functions.Function2) r4
            r5 = r17
        Lb:
            java.lang.Object r6 = kotlinx.coroutines.internal.f.g(r5, r2, r4)
            boolean r7 = kotlinx.coroutines.internal.q0.h(r6)
            if (r7 != 0) goto L49
            kotlinx.coroutines.internal.p0 r7 = kotlinx.coroutines.internal.q0.f(r6)
        L19:
            java.lang.Object r8 = r0.get(r14)
            kotlinx.coroutines.internal.p0 r8 = (kotlinx.coroutines.internal.p0) r8
            long r9 = r8.c
            long r11 = r7.c
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 < 0) goto L28
            goto L49
        L28:
            boolean r9 = r7.s()
            if (r9 != 0) goto L2f
            goto Lb
        L2f:
            boolean r9 = androidx.concurrent.futures.a.a(r0, r14, r8, r7)
            if (r9 == 0) goto L3f
            boolean r0 = r8.o()
            if (r0 == 0) goto L49
            r8.l()
            goto L49
        L3f:
            boolean r8 = r7.o()
            if (r8 == 0) goto L19
            r7.l()
            goto L19
        L49:
            boolean r0 = kotlinx.coroutines.internal.q0.h(r6)
            r7 = 1
            r8 = 0
            r10 = 0
            if (r0 == 0) goto L5d
            r14.X()
            r14.I0(r15, r17)
            r0(r14, r8, r7, r10)
            return r10
        L5d:
            kotlinx.coroutines.internal.p0 r0 = kotlinx.coroutines.internal.q0.f(r6)
            r6 = r0
            kotlinx.coroutines.channels.o r6 = (kotlinx.coroutines.channels.o) r6
            long r4 = r6.c
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 <= 0) goto L8b
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = kotlinx.coroutines.channels.BufferedChannel.f
            r2 = 1
            long r2 = r18 + r2
            int r11 = kotlinx.coroutines.channels.i.b
            long r12 = (long) r11
            long r4 = r4 * r12
            r1 = r14
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L87
            long r2 = r6.c
            long r4 = (long) r11
            long r2 = r2 * r4
            long r2 = r2 - r18
            r14.q0(r2)
            goto L8a
        L87:
            r0(r14, r8, r7, r10)
        L8a:
            return r10
        L8b:
            return r6
    }

    private final java.lang.Object a1(kotlinx.coroutines.channels.o<E> r11, int r12, long r13, kotlin.coroutines.e<? super kotlinx.coroutines.channels.n<? extends E>> r15) {
            r10 = this;
            boolean r0 = r15 instanceof kotlinx.coroutines.channels.BufferedChannel.m
            if (r0 == 0) goto L13
            r0 = r15
            kotlinx.coroutines.channels.BufferedChannel$m r0 = (kotlinx.coroutines.channels.BufferedChannel.m) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.BufferedChannel$m r0 = new kotlinx.coroutines.channels.BufferedChannel$m
            r0.<init>(r10, r15)
        L18:
            java.lang.Object r15 = r0.e
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.g
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r11 = r0.b
            kotlinx.coroutines.channels.o r11 = (kotlinx.coroutines.channels.o) r11
            java.lang.Object r11 = r0.a
            kotlinx.coroutines.channels.BufferedChannel r11 = (kotlinx.coroutines.channels.BufferedChannel) r11
            kotlin.g0.n(r15)
            r2 = r10
            goto L12e
        L33:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3b:
            kotlin.g0.n(r15)
            r0.a = r10
            r0.b = r11
            r0.c = r12
            r0.d = r13
            r0.g = r3
            kotlin.coroutines.e r15 = kotlin.coroutines.intrinsics.a.e(r0)
            kotlinx.coroutines.q r15 = kotlinx.coroutines.s.b(r15)
            kotlinx.coroutines.channels.a0 r7 = new kotlinx.coroutines.channels.a0     // Catch: java.lang.Throwable -> L135
            java.lang.String r2 = "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuationImpl<kotlinx.coroutines.channels.ChannelResult<E of kotlinx.coroutines.channels.BufferedChannel.receiveCatchingOnNoWaiterSuspend_GKJJFZk$lambda$35>>"
            kotlin.jvm.internal.g0.n(r15, r2)     // Catch: java.lang.Throwable -> L135
            r7.<init>(r15)     // Catch: java.lang.Throwable -> L135
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            java.lang.Object r11 = J(r2, r3, r4, r5, r7)     // Catch: java.lang.Throwable -> L6d
            kotlinx.coroutines.internal.s0 r12 = kotlinx.coroutines.channels.i.r()     // Catch: java.lang.Throwable -> L6d
            if (r11 != r12) goto L71
            s(r10, r7, r3, r4)     // Catch: java.lang.Throwable -> L6d
            goto L11e
        L6d:
            r0 = move-exception
        L6e:
            r11 = r0
            goto L139
        L71:
            kotlinx.coroutines.internal.s0 r12 = kotlinx.coroutines.channels.i.h()     // Catch: java.lang.Throwable -> L6d
            r13 = 0
            if (r11 != r12) goto L108
            long r11 = r10.o0()     // Catch: java.lang.Throwable -> L6d
            int r14 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r14 >= 0) goto L83
            r3.b()     // Catch: java.lang.Throwable -> L6d
        L83:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r11 = f()     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r11 = r11.get(r10)     // Catch: java.lang.Throwable -> L6d
            kotlinx.coroutines.channels.o r11 = (kotlinx.coroutines.channels.o) r11     // Catch: java.lang.Throwable -> L6d
        L8d:
            boolean r12 = r10.D()     // Catch: java.lang.Throwable -> L6d
            if (r12 == 0) goto L98
            l(r10, r15)     // Catch: java.lang.Throwable -> L6d
            goto L11e
        L98:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r12 = g()     // Catch: java.lang.Throwable -> L6d
            long r5 = r12.getAndIncrement(r10)     // Catch: java.lang.Throwable -> L6d
            int r12 = kotlinx.coroutines.channels.i.b     // Catch: java.lang.Throwable -> L6d
            long r3 = (long) r12     // Catch: java.lang.Throwable -> L6d
            long r3 = r5 / r3
            long r8 = (long) r12     // Catch: java.lang.Throwable -> L6d
            long r8 = r5 % r8
            int r12 = (int) r8     // Catch: java.lang.Throwable -> L6d
            long r8 = r11.c     // Catch: java.lang.Throwable -> L6d
            int r14 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r14 == 0) goto Lb9
            kotlinx.coroutines.channels.o r14 = c(r10, r3, r11)     // Catch: java.lang.Throwable -> L6d
            if (r14 != 0) goto Lb6
            goto L8d
        Lb6:
            r3 = r14
        Lb7:
            r4 = r12
            goto Lbb
        Lb9:
            r3 = r11
            goto Lb7
        Lbb:
            java.lang.Object r11 = J(r2, r3, r4, r5, r7)     // Catch: java.lang.Throwable -> L6d
            r14 = r3
            kotlinx.coroutines.internal.s0 r12 = kotlinx.coroutines.channels.i.r()     // Catch: java.lang.Throwable -> L6d
            if (r11 != r12) goto Lca
            s(r10, r7, r14, r4)     // Catch: java.lang.Throwable -> L6d
            goto L11e
        Lca:
            kotlinx.coroutines.internal.s0 r12 = kotlinx.coroutines.channels.i.h()     // Catch: java.lang.Throwable -> L6d
            if (r11 != r12) goto Ldd
            long r11 = r10.o0()     // Catch: java.lang.Throwable -> L6d
            int r3 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r3 >= 0) goto Ldb
            r14.b()     // Catch: java.lang.Throwable -> L6d
        Ldb:
            r11 = r14
            goto L8d
        Ldd:
            kotlinx.coroutines.internal.s0 r12 = kotlinx.coroutines.channels.i.s()     // Catch: java.lang.Throwable -> L6d
            if (r11 == r12) goto L100
            r14.b()     // Catch: java.lang.Throwable -> L6d
            kotlinx.coroutines.channels.n$b r12 = kotlinx.coroutines.channels.n.b     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r12 = r12.c(r11)     // Catch: java.lang.Throwable -> L6d
            kotlinx.coroutines.channels.n r12 = kotlinx.coroutines.channels.n.b(r12)     // Catch: java.lang.Throwable -> L6d
            kotlin.jvm.functions.Function1<E, kotlin.n1> r14 = r2.b     // Catch: java.lang.Throwable -> L6d
            if (r14 == 0) goto Lfc
            kotlin.coroutines.i r13 = r15.getContext()     // Catch: java.lang.Throwable -> L6d
        Lf8:
            kotlin.jvm.functions.Function1 r13 = kotlinx.coroutines.internal.j0.a(r14, r11, r13)     // Catch: java.lang.Throwable -> L6d
        Lfc:
            r15.o(r12, r13)     // Catch: java.lang.Throwable -> L6d
            goto L11e
        L100:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L6d
            java.lang.String r12 = "unexpected"
            r11.<init>(r12)     // Catch: java.lang.Throwable -> L6d
            throw r11     // Catch: java.lang.Throwable -> L6d
        L108:
            r3.b()     // Catch: java.lang.Throwable -> L6d
            kotlinx.coroutines.channels.n$b r12 = kotlinx.coroutines.channels.n.b     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r12 = r12.c(r11)     // Catch: java.lang.Throwable -> L6d
            kotlinx.coroutines.channels.n r12 = kotlinx.coroutines.channels.n.b(r12)     // Catch: java.lang.Throwable -> L6d
            kotlin.jvm.functions.Function1<E, kotlin.n1> r14 = r2.b     // Catch: java.lang.Throwable -> L6d
            if (r14 == 0) goto Lfc
            kotlin.coroutines.i r13 = r15.getContext()     // Catch: java.lang.Throwable -> L6d
            goto Lf8
        L11e:
            java.lang.Object r15 = r15.x()
            java.lang.Object r11 = kotlin.coroutines.intrinsics.a.l()
            if (r15 != r11) goto L12b
            kotlin.coroutines.jvm.internal.e.c(r0)
        L12b:
            if (r15 != r1) goto L12e
            return r1
        L12e:
            kotlinx.coroutines.channels.n r15 = (kotlinx.coroutines.channels.n) r15
            java.lang.Object r11 = r15.o()
            return r11
        L135:
            r0 = move-exception
            r2 = r10
            goto L6e
        L139:
            r15.N()
            throw r11
    }

    private final kotlinx.coroutines.channels.o<E> b0(long r11, kotlinx.coroutines.channels.o<E> r13) {
            r10 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.channels.BufferedChannel.i
            kotlin.reflect.i r1 = kotlinx.coroutines.channels.i.y()
            kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1
        L8:
            java.lang.Object r2 = kotlinx.coroutines.internal.f.g(r13, r11, r1)
            boolean r3 = kotlinx.coroutines.internal.q0.h(r2)
            if (r3 != 0) goto L46
            kotlinx.coroutines.internal.p0 r3 = kotlinx.coroutines.internal.q0.f(r2)
        L16:
            java.lang.Object r4 = r0.get(r10)
            kotlinx.coroutines.internal.p0 r4 = (kotlinx.coroutines.internal.p0) r4
            long r5 = r4.c
            long r7 = r3.c
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 < 0) goto L25
            goto L46
        L25:
            boolean r5 = r3.s()
            if (r5 != 0) goto L2c
            goto L8
        L2c:
            boolean r5 = androidx.concurrent.futures.a.a(r0, r10, r4, r3)
            if (r5 == 0) goto L3c
            boolean r0 = r4.o()
            if (r0 == 0) goto L46
            r4.l()
            goto L46
        L3c:
            boolean r4 = r3.o()
            if (r4 == 0) goto L16
            r3.l()
            goto L16
        L46:
            boolean r0 = kotlinx.coroutines.internal.q0.h(r2)
            r1 = 0
            if (r0 == 0) goto L63
            r10.X()
            long r11 = r13.c
            int r0 = kotlinx.coroutines.channels.i.b
            long r2 = (long) r0
            long r11 = r11 * r2
            long r2 = r10.o0()
            int r0 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r0 >= 0) goto L62
            r13.b()
        L62:
            return r1
        L63:
            kotlinx.coroutines.internal.p0 r13 = kotlinx.coroutines.internal.q0.f(r2)
            kotlinx.coroutines.channels.o r13 = (kotlinx.coroutines.channels.o) r13
            boolean r0 = r10.B0()
            if (r0 != 0) goto Lab
            long r2 = r10.e0()
            int r0 = kotlinx.coroutines.channels.i.b
            long r4 = (long) r0
            long r2 = r2 / r4
            int r0 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r0 > 0) goto Lab
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.channels.BufferedChannel.j
        L7d:
            java.lang.Object r2 = r0.get(r10)
            kotlinx.coroutines.internal.p0 r2 = (kotlinx.coroutines.internal.p0) r2
            long r3 = r2.c
            long r5 = r13.c
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto Lab
            boolean r3 = r13.s()
            if (r3 == 0) goto Lab
            boolean r3 = androidx.concurrent.futures.a.a(r0, r10, r2, r13)
            if (r3 == 0) goto La1
            boolean r0 = r2.o()
            if (r0 == 0) goto Lab
            r2.l()
            goto Lab
        La1:
            boolean r2 = r13.o()
            if (r2 == 0) goto L7d
            r13.l()
            goto L7d
        Lab:
            long r2 = r13.c
            int r0 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r0 <= 0) goto Lca
            int r11 = kotlinx.coroutines.channels.i.b
            long r4 = (long) r11
            long r2 = r2 * r4
            r10.E1(r2)
            long r2 = r13.c
            long r11 = (long) r11
            long r2 = r2 * r11
            long r11 = r10.o0()
            int r0 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r0 >= 0) goto Lc9
            r13.b()
        Lc9:
            return r1
        Lca:
            return r13
    }

    private final <R> R b1(java.lang.Object r10, kotlin.jvm.functions.Function1<? super E, ? extends R> r11, kotlin.jvm.functions.Function3<? super kotlinx.coroutines.channels.o<E>, ? super java.lang.Integer, ? super java.lang.Long, ? extends R> r12, kotlin.jvm.functions.Function0<? extends R> r13, kotlin.jvm.functions.Function3<? super kotlinx.coroutines.channels.o<E>, ? super java.lang.Integer, ? super java.lang.Long, ? extends R> r14) {
            r9 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f()
            java.lang.Object r0 = r0.get(r9)
            kotlinx.coroutines.channels.o r0 = (kotlinx.coroutines.channels.o) r0
        La:
            boolean r1 = r9.D()
            if (r1 == 0) goto L15
            java.lang.Object r10 = r13.invoke()
            return r10
        L15:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = g()
            long r5 = r1.getAndIncrement(r9)
            int r1 = kotlinx.coroutines.channels.i.b
            long r2 = (long) r1
            long r2 = r5 / r2
            long r7 = (long) r1
            long r7 = r5 % r7
            int r4 = (int) r7
            long r7 = r0.c
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 == 0) goto L37
            kotlinx.coroutines.channels.o r1 = c(r9, r2, r0)
            if (r1 != 0) goto L33
            goto La
        L33:
            r3 = r1
        L34:
            r2 = r9
            r7 = r10
            goto L39
        L37:
            r3 = r0
            goto L34
        L39:
            java.lang.Object r10 = J(r2, r3, r4, r5, r7)
            r0 = r3
            kotlinx.coroutines.internal.s0 r1 = kotlinx.coroutines.channels.i.r()
            if (r10 != r1) goto L5f
            boolean r10 = r7 instanceof kotlinx.coroutines.r3
            if (r10 == 0) goto L4c
            r10 = r7
            kotlinx.coroutines.r3 r10 = (kotlinx.coroutines.r3) r10
            goto L4d
        L4c:
            r10 = 0
        L4d:
            if (r10 == 0) goto L52
            s(r9, r10, r0, r4)
        L52:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r4)
            java.lang.Long r11 = java.lang.Long.valueOf(r5)
            java.lang.Object r10 = r12.invoke(r0, r10, r11)
            return r10
        L5f:
            kotlinx.coroutines.internal.s0 r1 = kotlinx.coroutines.channels.i.h()
            if (r10 != r1) goto L72
            long r3 = r9.o0()
            int r10 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r10 >= 0) goto L70
            r0.b()
        L70:
            r10 = r7
            goto La
        L72:
            kotlinx.coroutines.internal.s0 r12 = kotlinx.coroutines.channels.i.s()
            if (r10 != r12) goto L85
            java.lang.Integer r10 = java.lang.Integer.valueOf(r4)
            java.lang.Long r11 = java.lang.Long.valueOf(r5)
            java.lang.Object r10 = r14.invoke(r0, r10, r11)
            return r10
        L85:
            r0.b()
            java.lang.Object r10 = r11.invoke(r10)
            return r10
    }

    public static final /* synthetic */ kotlinx.coroutines.channels.o c(kotlinx.coroutines.channels.BufferedChannel r0, long r1, kotlinx.coroutines.channels.o r3) {
            kotlinx.coroutines.channels.o r0 = r0.b0(r1, r3)
            return r0
    }

    private final kotlinx.coroutines.channels.o<E> c0(long r11, kotlinx.coroutines.channels.o<E> r13) {
            r10 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.channels.BufferedChannel.h
            kotlin.reflect.i r1 = kotlinx.coroutines.channels.i.y()
            kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1
        L8:
            java.lang.Object r2 = kotlinx.coroutines.internal.f.g(r13, r11, r1)
            boolean r3 = kotlinx.coroutines.internal.q0.h(r2)
            if (r3 != 0) goto L46
            kotlinx.coroutines.internal.p0 r3 = kotlinx.coroutines.internal.q0.f(r2)
        L16:
            java.lang.Object r4 = r0.get(r10)
            kotlinx.coroutines.internal.p0 r4 = (kotlinx.coroutines.internal.p0) r4
            long r5 = r4.c
            long r7 = r3.c
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 < 0) goto L25
            goto L46
        L25:
            boolean r5 = r3.s()
            if (r5 != 0) goto L2c
            goto L8
        L2c:
            boolean r5 = androidx.concurrent.futures.a.a(r0, r10, r4, r3)
            if (r5 == 0) goto L3c
            boolean r0 = r4.o()
            if (r0 == 0) goto L46
            r4.l()
            goto L46
        L3c:
            boolean r4 = r3.o()
            if (r4 == 0) goto L16
            r3.l()
            goto L16
        L46:
            boolean r0 = kotlinx.coroutines.internal.q0.h(r2)
            r1 = 0
            if (r0 == 0) goto L63
            r10.X()
            long r11 = r13.c
            int r0 = kotlinx.coroutines.channels.i.b
            long r2 = (long) r0
            long r11 = r11 * r2
            long r2 = r10.m0()
            int r0 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r0 >= 0) goto L62
            r13.b()
        L62:
            return r1
        L63:
            kotlinx.coroutines.internal.p0 r13 = kotlinx.coroutines.internal.q0.f(r2)
            kotlinx.coroutines.channels.o r13 = (kotlinx.coroutines.channels.o) r13
            long r2 = r13.c
            int r0 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r0 <= 0) goto L88
            int r11 = kotlinx.coroutines.channels.i.b
            long r4 = (long) r11
            long r2 = r2 * r4
            r10.F1(r2)
            long r2 = r13.c
            long r11 = (long) r11
            long r2 = r2 * r11
            long r11 = r10.m0()
            int r0 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r0 >= 0) goto L87
            r13.b()
        L87:
            return r1
        L88:
            return r13
    }

    static /* synthetic */ java.lang.Object c1(kotlinx.coroutines.channels.BufferedChannel r7, java.lang.Object r8, kotlin.jvm.functions.Function1 r9, kotlin.jvm.functions.Function3 r10, kotlin.jvm.functions.Function0 r11, kotlin.jvm.functions.Function3 r12, int r13, java.lang.Object r14) {
            if (r14 != 0) goto L96
            r13 = r13 & 16
            if (r13 == 0) goto L8
            kotlinx.coroutines.channels.BufferedChannel$receiveImpl$1 r12 = kotlinx.coroutines.channels.BufferedChannel$receiveImpl$1.INSTANCE
        L8:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r13 = f()
            java.lang.Object r13 = r13.get(r7)
            kotlinx.coroutines.channels.o r13 = (kotlinx.coroutines.channels.o) r13
        L12:
            boolean r14 = r7.D()
            if (r14 == 0) goto L1d
            java.lang.Object r7 = r11.invoke()
            return r7
        L1d:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r14 = g()
            long r3 = r14.getAndIncrement(r7)
            int r14 = kotlinx.coroutines.channels.i.b
            long r0 = (long) r14
            long r0 = r3 / r0
            long r5 = (long) r14
            long r5 = r3 % r5
            int r2 = (int) r5
            long r5 = r13.c
            int r14 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r14 == 0) goto L3f
            kotlinx.coroutines.channels.o r14 = c(r7, r0, r13)
            if (r14 != 0) goto L3b
            goto L12
        L3b:
            r1 = r14
        L3c:
            r0 = r7
            r5 = r8
            goto L41
        L3f:
            r1 = r13
            goto L3c
        L41:
            java.lang.Object r7 = J(r0, r1, r2, r3, r5)
            r13 = r1
            kotlinx.coroutines.internal.s0 r8 = kotlinx.coroutines.channels.i.r()
            if (r7 != r8) goto L67
            boolean r7 = r5 instanceof kotlinx.coroutines.r3
            if (r7 == 0) goto L54
            r8 = r5
            kotlinx.coroutines.r3 r8 = (kotlinx.coroutines.r3) r8
            goto L55
        L54:
            r8 = 0
        L55:
            if (r8 == 0) goto L5a
            s(r0, r8, r13, r2)
        L5a:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)
            java.lang.Long r8 = java.lang.Long.valueOf(r3)
            java.lang.Object r7 = r10.invoke(r13, r7, r8)
            return r7
        L67:
            kotlinx.coroutines.internal.s0 r8 = kotlinx.coroutines.channels.i.h()
            if (r7 != r8) goto L7b
            long r7 = r0.o0()
            int r14 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r14 >= 0) goto L78
            r13.b()
        L78:
            r7 = r0
            r8 = r5
            goto L12
        L7b:
            kotlinx.coroutines.internal.s0 r8 = kotlinx.coroutines.channels.i.s()
            if (r7 != r8) goto L8e
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)
            java.lang.Long r8 = java.lang.Long.valueOf(r3)
            java.lang.Object r7 = r12.invoke(r13, r7, r8)
            return r7
        L8e:
            r13.b()
            java.lang.Object r7 = r9.invoke(r7)
            return r7
        L96:
            java.lang.UnsupportedOperationException r7 = new java.lang.UnsupportedOperationException
            java.lang.String r8 = "Super calls with default arguments not supported in this target, function: receiveImpl"
            r7.<init>(r8)
            throw r7
    }

    public static final /* synthetic */ kotlinx.coroutines.channels.o d(kotlinx.coroutines.channels.BufferedChannel r0, long r1, kotlinx.coroutines.channels.o r3) {
            kotlinx.coroutines.channels.o r0 = r0.c0(r1, r3)
            return r0
    }

    private final java.lang.Object d0(java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3, kotlin.jvm.functions.Function1<java.lang.Object, ? extends java.lang.Object> r4, java.lang.Object r5) {
            r2 = this;
        L0:
            java.lang.Object r0 = r3.get(r5)
            java.lang.Object r1 = r4.invoke(r0)
            boolean r1 = androidx.concurrent.futures.a.a(r3, r5, r0, r1)
            if (r1 == 0) goto L0
            return r0
    }

    private final void d1(kotlinx.coroutines.channels.o<E> r7, int r8, long r9, kotlinx.coroutines.r3 r11, kotlin.jvm.functions.Function1<? super E, kotlin.n1> r12, kotlin.jvm.functions.Function0<kotlin.n1> r13) {
            r6 = this;
            java.lang.Object r0 = J(r6, r7, r8, r9, r11)
            r5 = r11
            r10 = r9
            r9 = r8
            r8 = r7
            r7 = r6
            kotlinx.coroutines.internal.s0 r1 = kotlinx.coroutines.channels.i.r()
            if (r0 != r1) goto L13
            s(r6, r5, r8, r9)
            return
        L13:
            kotlinx.coroutines.internal.s0 r9 = kotlinx.coroutines.channels.i.h()
            if (r0 != r9) goto La0
            long r0 = r6.o0()
            int r9 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r9 >= 0) goto L24
            r8.b()
        L24:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8 = f()
            java.lang.Object r8 = r8.get(r6)
            kotlinx.coroutines.channels.o r8 = (kotlinx.coroutines.channels.o) r8
        L2e:
            boolean r9 = r6.D()
            if (r9 == 0) goto L38
            r13.invoke()
            return
        L38:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r9 = g()
            long r3 = r9.getAndIncrement(r6)
            int r9 = kotlinx.coroutines.channels.i.b
            long r10 = (long) r9
            long r10 = r3 / r10
            long r0 = (long) r9
            long r0 = r3 % r0
            int r2 = (int) r0
            long r0 = r8.c
            int r9 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r9 == 0) goto L59
            kotlinx.coroutines.channels.o r9 = c(r6, r10, r8)
            if (r9 != 0) goto L56
            goto L2e
        L56:
            r1 = r9
        L57:
            r0 = r7
            goto L5b
        L59:
            r1 = r8
            goto L57
        L5b:
            java.lang.Object r7 = J(r0, r1, r2, r3, r5)
            r9 = r0
            r8 = r1
            kotlinx.coroutines.internal.s0 r10 = kotlinx.coroutines.channels.i.r()
            if (r7 != r10) goto L78
            boolean r7 = androidx.activity.k.a(r5)
            if (r7 == 0) goto L6f
            r11 = r5
            goto L70
        L6f:
            r11 = 0
        L70:
            if (r11 == 0) goto L75
            s(r6, r11, r8, r2)
        L75:
            kotlin.n1 r7 = kotlin.n1.a
            return
        L78:
            kotlinx.coroutines.internal.s0 r10 = kotlinx.coroutines.channels.i.h()
            if (r7 != r10) goto L8b
            long r10 = r6.o0()
            int r7 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r7 >= 0) goto L89
            r8.b()
        L89:
            r7 = r9
            goto L2e
        L8b:
            kotlinx.coroutines.internal.s0 r10 = kotlinx.coroutines.channels.i.s()
            if (r7 == r10) goto L98
            r8.b()
            r12.invoke(r7)
            return
        L98:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "unexpected"
            r7.<init>(r8)
            throw r7
        La0:
            r9 = r7
            r8.b()
            r12.invoke(r0)
            return
    }

    public static final /* synthetic */ java.lang.Throwable e(kotlinx.coroutines.channels.BufferedChannel r0) {
            java.lang.Throwable r0 = r0.l0()
            return r0
    }

    private final long e0() {
            r2 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = kotlinx.coroutines.channels.BufferedChannel.f
            long r0 = r0.get(r2)
            return r0
    }

    private final java.lang.Object e1(kotlinx.coroutines.channels.o<E> r10, int r11, long r12, kotlin.coroutines.e<? super E> r14) {
            r9 = this;
            kotlin.coroutines.e r0 = kotlin.coroutines.intrinsics.a.e(r14)
            kotlinx.coroutines.q r6 = kotlinx.coroutines.s.b(r0)
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            java.lang.Object r10 = J(r1, r2, r3, r4, r6)     // Catch: java.lang.Throwable -> L1b
            kotlinx.coroutines.internal.s0 r11 = kotlinx.coroutines.channels.i.r()     // Catch: java.lang.Throwable -> L1b
            if (r10 != r11) goto L1f
            s(r9, r6, r2, r3)     // Catch: java.lang.Throwable -> L1b
            goto Lc1
        L1b:
            r0 = move-exception
            r10 = r0
            goto Lcf
        L1f:
            kotlinx.coroutines.internal.s0 r11 = kotlinx.coroutines.channels.i.h()     // Catch: java.lang.Throwable -> L1b
            r12 = 0
            if (r10 != r11) goto Lb5
            long r10 = r9.o0()     // Catch: java.lang.Throwable -> L1b
            int r13 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r13 >= 0) goto L31
            r2.b()     // Catch: java.lang.Throwable -> L1b
        L31:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r10 = f()     // Catch: java.lang.Throwable -> L1b
            java.lang.Object r10 = r10.get(r9)     // Catch: java.lang.Throwable -> L1b
            kotlinx.coroutines.channels.o r10 = (kotlinx.coroutines.channels.o) r10     // Catch: java.lang.Throwable -> L1b
        L3b:
            boolean r11 = r9.D()     // Catch: java.lang.Throwable -> L1b
            if (r11 == 0) goto L46
            n(r9, r6)     // Catch: java.lang.Throwable -> L1b
            goto Lc1
        L46:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r11 = g()     // Catch: java.lang.Throwable -> L1b
            long r4 = r11.getAndIncrement(r9)     // Catch: java.lang.Throwable -> L1b
            int r11 = kotlinx.coroutines.channels.i.b     // Catch: java.lang.Throwable -> L1b
            long r2 = (long) r11     // Catch: java.lang.Throwable -> L1b
            long r2 = r4 / r2
            long r7 = (long) r11     // Catch: java.lang.Throwable -> L1b
            long r7 = r4 % r7
            int r11 = (int) r7     // Catch: java.lang.Throwable -> L1b
            long r7 = r10.c     // Catch: java.lang.Throwable -> L1b
            int r13 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r13 == 0) goto L67
            kotlinx.coroutines.channels.o r13 = c(r9, r2, r10)     // Catch: java.lang.Throwable -> L1b
            if (r13 != 0) goto L64
            goto L3b
        L64:
            r2 = r13
        L65:
            r3 = r11
            goto L69
        L67:
            r2 = r10
            goto L65
        L69:
            java.lang.Object r10 = J(r1, r2, r3, r4, r6)     // Catch: java.lang.Throwable -> L1b
            r13 = r2
            kotlinx.coroutines.internal.s0 r11 = kotlinx.coroutines.channels.i.r()     // Catch: java.lang.Throwable -> L1b
            if (r10 != r11) goto L81
            boolean r10 = androidx.activity.k.a(r6)     // Catch: java.lang.Throwable -> L1b
            if (r10 == 0) goto L7b
            r12 = r6
        L7b:
            if (r12 == 0) goto Lc1
            s(r9, r12, r13, r3)     // Catch: java.lang.Throwable -> L1b
            goto Lc1
        L81:
            kotlinx.coroutines.internal.s0 r11 = kotlinx.coroutines.channels.i.h()     // Catch: java.lang.Throwable -> L1b
            if (r10 != r11) goto L94
            long r10 = r9.o0()     // Catch: java.lang.Throwable -> L1b
            int r0 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r0 >= 0) goto L92
            r13.b()     // Catch: java.lang.Throwable -> L1b
        L92:
            r10 = r13
            goto L3b
        L94:
            kotlinx.coroutines.internal.s0 r11 = kotlinx.coroutines.channels.i.s()     // Catch: java.lang.Throwable -> L1b
            if (r10 == r11) goto Lad
            r13.b()     // Catch: java.lang.Throwable -> L1b
            kotlin.jvm.functions.Function1<E, kotlin.n1> r11 = r1.b     // Catch: java.lang.Throwable -> L1b
            if (r11 == 0) goto La9
            kotlin.coroutines.i r12 = r6.getContext()     // Catch: java.lang.Throwable -> L1b
        La5:
            kotlin.jvm.functions.Function1 r12 = kotlinx.coroutines.internal.j0.a(r11, r10, r12)     // Catch: java.lang.Throwable -> L1b
        La9:
            r6.o(r10, r12)     // Catch: java.lang.Throwable -> L1b
            goto Lc1
        Lad:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1b
            java.lang.String r11 = "unexpected"
            r10.<init>(r11)     // Catch: java.lang.Throwable -> L1b
            throw r10     // Catch: java.lang.Throwable -> L1b
        Lb5:
            r2.b()     // Catch: java.lang.Throwable -> L1b
            kotlin.jvm.functions.Function1<E, kotlin.n1> r11 = r1.b     // Catch: java.lang.Throwable -> L1b
            if (r11 == 0) goto La9
            kotlin.coroutines.i r12 = r6.getContext()     // Catch: java.lang.Throwable -> L1b
            goto La5
        Lc1:
            java.lang.Object r10 = r6.x()
            java.lang.Object r11 = kotlin.coroutines.intrinsics.a.l()
            if (r10 != r11) goto Lce
            kotlin.coroutines.jvm.internal.e.c(r14)
        Lce:
            return r10
        Lcf:
            r6.N()
            throw r10
    }

    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f() {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.channels.BufferedChannel.i
            return r0
    }

    private final void f1(kotlinx.coroutines.selects.m<?> r9, java.lang.Object r10) {
            r8 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r10 = f()
            java.lang.Object r10 = r10.get(r8)
            kotlinx.coroutines.channels.o r10 = (kotlinx.coroutines.channels.o) r10
        La:
            boolean r0 = r8.D()
            if (r0 == 0) goto L14
            r8.M0(r9)
            return
        L14:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = g()
            long r4 = r0.getAndIncrement(r8)
            int r0 = kotlinx.coroutines.channels.i.b
            long r1 = (long) r0
            long r1 = r4 / r1
            long r6 = (long) r0
            long r6 = r4 % r6
            int r3 = (int) r6
            long r6 = r10.c
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 == 0) goto L36
            kotlinx.coroutines.channels.o r0 = c(r8, r1, r10)
            if (r0 != 0) goto L32
            goto La
        L32:
            r2 = r0
        L33:
            r1 = r8
            r6 = r9
            goto L38
        L36:
            r2 = r10
            goto L33
        L38:
            java.lang.Object r9 = J(r1, r2, r3, r4, r6)
            r10 = r2
            kotlinx.coroutines.internal.s0 r0 = kotlinx.coroutines.channels.i.r()
            if (r9 != r0) goto L52
            boolean r9 = r6 instanceof kotlinx.coroutines.r3
            if (r9 == 0) goto L4b
            r9 = r6
            kotlinx.coroutines.r3 r9 = (kotlinx.coroutines.r3) r9
            goto L4c
        L4b:
            r9 = 0
        L4c:
            if (r9 == 0) goto L51
            s(r8, r9, r10, r3)
        L51:
            return
        L52:
            kotlinx.coroutines.internal.s0 r0 = kotlinx.coroutines.channels.i.h()
            if (r9 != r0) goto L65
            long r2 = r8.o0()
            int r9 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r9 >= 0) goto L63
            r10.b()
        L63:
            r9 = r6
            goto La
        L65:
            kotlinx.coroutines.internal.s0 r0 = kotlinx.coroutines.channels.i.s()
            if (r9 == r0) goto L72
            r10.b()
            r6.f(r9)
            return
        L72:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "unexpected"
            r9.<init>(r10)
            throw r9
    }

    public static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater g() {
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = kotlinx.coroutines.channels.BufferedChannel.e
            return r0
    }

    public static /* synthetic */ void g0() {
            return
    }

    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater h() {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.channels.BufferedChannel.h
            return r0
    }

    public static /* synthetic */ void h0() {
            return
    }

    private final void h1(kotlinx.coroutines.channels.o<E> r13) {
            r12 = this;
            kotlin.jvm.functions.Function1<E, kotlin.n1> r0 = r12.b
            r1 = 0
            r2 = 1
            java.lang.Object r3 = kotlinx.coroutines.internal.q.c(r1, r2, r1)
        L8:
            int r4 = kotlinx.coroutines.channels.i.b
            int r4 = r4 - r2
        Lb:
            r5 = -1
            if (r5 >= r4) goto Lb4
            long r6 = r13.c
            int r8 = kotlinx.coroutines.channels.i.b
            long r8 = (long) r8
            long r6 = r6 * r8
            long r8 = (long) r4
            long r6 = r6 + r8
        L17:
            java.lang.Object r8 = r13.y(r4)
            kotlinx.coroutines.internal.s0 r9 = kotlinx.coroutines.channels.i.f()
            if (r8 == r9) goto Lbc
            kotlinx.coroutines.internal.s0 r9 = kotlinx.coroutines.channels.i.f
            if (r8 != r9) goto L49
            long r9 = r12.m0()
            int r11 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r11 < 0) goto Lbc
            kotlinx.coroutines.internal.s0 r9 = kotlinx.coroutines.channels.i.z()
            boolean r8 = r13.t(r4, r8, r9)
            if (r8 == 0) goto L17
            if (r0 == 0) goto L41
            java.lang.Object r5 = r13.x(r4)
            kotlinx.coroutines.internal.UndeliveredElementException r1 = kotlinx.coroutines.internal.j0.c(r0, r5, r1)
        L41:
            r13.u(r4)
            r13.r()
            goto Lb0
        L49:
            kotlinx.coroutines.internal.s0 r9 = kotlinx.coroutines.channels.i.k()
            if (r8 == r9) goto La3
            if (r8 != 0) goto L52
            goto La3
        L52:
            boolean r9 = r8 instanceof kotlinx.coroutines.r3
            if (r9 != 0) goto L6f
            boolean r9 = r8 instanceof kotlinx.coroutines.channels.e0
            if (r9 == 0) goto L5b
            goto L6f
        L5b:
            kotlinx.coroutines.internal.s0 r9 = kotlinx.coroutines.channels.i.p()
            if (r8 == r9) goto Lbc
            kotlinx.coroutines.internal.s0 r9 = kotlinx.coroutines.channels.i.q()
            if (r8 != r9) goto L68
            goto Lbc
        L68:
            kotlinx.coroutines.internal.s0 r9 = kotlinx.coroutines.channels.i.p()
            if (r8 == r9) goto L17
            goto Lb0
        L6f:
            long r9 = r12.m0()
            int r11 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r11 < 0) goto Lbc
            boolean r9 = r8 instanceof kotlinx.coroutines.channels.e0
            if (r9 == 0) goto L81
            r9 = r8
            kotlinx.coroutines.channels.e0 r9 = (kotlinx.coroutines.channels.e0) r9
            kotlinx.coroutines.r3 r9 = r9.a
            goto L84
        L81:
            r9 = r8
            kotlinx.coroutines.r3 r9 = (kotlinx.coroutines.r3) r9
        L84:
            kotlinx.coroutines.internal.s0 r10 = kotlinx.coroutines.channels.i.z()
            boolean r8 = r13.t(r4, r8, r10)
            if (r8 == 0) goto L17
            if (r0 == 0) goto L98
            java.lang.Object r5 = r13.x(r4)
            kotlinx.coroutines.internal.UndeliveredElementException r1 = kotlinx.coroutines.internal.j0.c(r0, r5, r1)
        L98:
            java.lang.Object r3 = kotlinx.coroutines.internal.q.h(r3, r9)
            r13.u(r4)
            r13.r()
            goto Lb0
        La3:
            kotlinx.coroutines.internal.s0 r9 = kotlinx.coroutines.channels.i.z()
            boolean r8 = r13.t(r4, r8, r9)
            if (r8 == 0) goto L17
            r13.r()
        Lb0:
            int r4 = r4 + (-1)
            goto Lb
        Lb4:
            kotlinx.coroutines.internal.g r13 = r13.g()
            kotlinx.coroutines.channels.o r13 = (kotlinx.coroutines.channels.o) r13
            if (r13 != 0) goto L8
        Lbc:
            if (r3 == 0) goto Le2
            boolean r13 = r3 instanceof java.util.ArrayList
            if (r13 != 0) goto Lc8
            kotlinx.coroutines.r3 r3 = (kotlinx.coroutines.r3) r3
            r12.j1(r3)
            goto Le2
        Lc8:
            java.lang.String r13 = "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }"
            kotlin.jvm.internal.g0.n(r3, r13)
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r13 = r3.size()
            int r13 = r13 - r2
        Ld4:
            if (r5 >= r13) goto Le2
            java.lang.Object r0 = r3.get(r13)
            kotlinx.coroutines.r3 r0 = (kotlinx.coroutines.r3) r0
            r12.j1(r0)
            int r13 = r13 + (-1)
            goto Ld4
        Le2:
            if (r1 != 0) goto Le5
            return
        Le5:
            throw r1
    }

    public static /* synthetic */ void i0() {
            return
    }

    private final void i1(kotlinx.coroutines.r3 r2) {
            r1 = this;
            r0 = 1
            r1.k1(r2, r0)
            return
    }

    public static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater j() {
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = kotlinx.coroutines.channels.BufferedChannel.d
            return r0
    }

    public static /* synthetic */ void j0() {
            return
    }

    private final void j1(kotlinx.coroutines.r3 r2) {
            r1 = this;
            r0 = 0
            r1.k1(r2, r0)
            return
    }

    public static final /* synthetic */ boolean k(kotlinx.coroutines.channels.BufferedChannel r0, long r1) {
            boolean r0 = r0.y0(r1)
            return r0
    }

    private static /* synthetic */ void k0() {
            return
    }

    private final void k1(kotlinx.coroutines.r3 r3, boolean r4) {
            r2 = this;
            boolean r0 = r3 instanceof kotlinx.coroutines.channels.BufferedChannel.b
            if (r0 == 0) goto L16
            kotlinx.coroutines.channels.BufferedChannel$b r3 = (kotlinx.coroutines.channels.BufferedChannel.b) r3
            kotlinx.coroutines.p r3 = r3.a()
            kotlin.Result$a r4 = kotlin.Result.Companion
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            java.lang.Object r4 = kotlin.Result.m11constructorimpl(r4)
            r3.resumeWith(r4)
            return
        L16:
            boolean r0 = r3 instanceof kotlinx.coroutines.p
            if (r0 == 0) goto L35
            kotlin.coroutines.e r3 = (kotlin.coroutines.e) r3
            kotlin.Result$a r0 = kotlin.Result.Companion
            if (r4 == 0) goto L25
            java.lang.Throwable r4 = r2.l0()
            goto L29
        L25:
            java.lang.Throwable r4 = r2.n0()
        L29:
            java.lang.Object r4 = kotlin.g0.a(r4)
            java.lang.Object r4 = kotlin.Result.m11constructorimpl(r4)
            r3.resumeWith(r4)
            return
        L35:
            boolean r4 = r3 instanceof kotlinx.coroutines.channels.a0
            if (r4 == 0) goto L55
            kotlinx.coroutines.channels.a0 r3 = (kotlinx.coroutines.channels.a0) r3
            kotlinx.coroutines.q<kotlinx.coroutines.channels.n<? extends E>> r3 = r3.a
            kotlin.Result$a r4 = kotlin.Result.Companion
            kotlinx.coroutines.channels.n$b r4 = kotlinx.coroutines.channels.n.b
            java.lang.Throwable r0 = r2.f0()
            java.lang.Object r4 = r4.a(r0)
            kotlinx.coroutines.channels.n r4 = kotlinx.coroutines.channels.n.b(r4)
            java.lang.Object r4 = kotlin.Result.m11constructorimpl(r4)
            r3.resumeWith(r4)
            return
        L55:
            boolean r4 = r3 instanceof kotlinx.coroutines.channels.BufferedChannel.a
            if (r4 == 0) goto L5f
            kotlinx.coroutines.channels.BufferedChannel$a r3 = (kotlinx.coroutines.channels.BufferedChannel.a) r3
            r3.l()
            return
        L5f:
            boolean r4 = r3 instanceof kotlinx.coroutines.selects.m
            if (r4 == 0) goto L6d
            kotlinx.coroutines.selects.m r3 = (kotlinx.coroutines.selects.m) r3
            kotlinx.coroutines.internal.s0 r4 = kotlinx.coroutines.channels.i.z()
            r3.j(r2, r4)
            return
        L6d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unexpected waiter: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
    }

    public static final /* synthetic */ void l(kotlinx.coroutines.channels.BufferedChannel r0, kotlinx.coroutines.p r1) {
            r0.K0(r1)
            return
    }

    private final java.lang.Throwable l0() {
            r2 = this;
            java.lang.Throwable r0 = r2.f0()
            if (r0 != 0) goto Ld
            kotlinx.coroutines.channels.ClosedReceiveChannelException r0 = new kotlinx.coroutines.channels.ClosedReceiveChannelException
            java.lang.String r1 = "Channel was closed"
            r0.<init>(r1)
        Ld:
            return r0
    }

    static /* synthetic */ <E> java.lang.Object l1(kotlinx.coroutines.channels.BufferedChannel<E> r13, E r14, kotlin.coroutines.e<? super kotlin.n1> r15) {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = h()
            java.lang.Object r0 = r0.get(r13)
            kotlinx.coroutines.channels.o r0 = (kotlinx.coroutines.channels.o) r0
        La:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = j()
            long r1 = r1.getAndIncrement(r13)
            r3 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r9 = r1 & r3
            boolean r12 = k(r13, r1)
            int r1 = kotlinx.coroutines.channels.i.b
            long r2 = (long) r1
            long r2 = r9 / r2
            long r4 = (long) r1
            long r4 = r9 % r4
            int r7 = (int) r4
            long r4 = r0.c
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 == 0) goto L41
            kotlinx.coroutines.channels.o r1 = d(r13, r2, r0)
            if (r1 != 0) goto L3f
            if (r12 == 0) goto La
            java.lang.Object r13 = r13.O0(r14, r15)
            java.lang.Object r14 = kotlin.coroutines.intrinsics.a.l()
            if (r13 != r14) goto L98
            return r13
        L3f:
            r6 = r1
            goto L42
        L41:
            r6 = r0
        L42:
            r11 = 0
            r5 = r13
            r8 = r14
            int r13 = K(r5, r6, r7, r8, r9, r11, r12)
            if (r13 == 0) goto L95
            r14 = 1
            if (r13 == r14) goto L98
            r14 = 2
            if (r13 == r14) goto L84
            r14 = 3
            if (r13 == r14) goto L78
            r14 = 4
            if (r13 == r14) goto L62
            r14 = 5
            if (r13 == r14) goto L5b
            goto L5e
        L5b:
            r6.b()
        L5e:
            r13 = r5
            r0 = r6
            r14 = r8
            goto La
        L62:
            long r13 = r5.m0()
            int r0 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r0 >= 0) goto L6d
            r6.b()
        L6d:
            java.lang.Object r13 = r5.O0(r8, r15)
            java.lang.Object r14 = kotlin.coroutines.intrinsics.a.l()
            if (r13 != r14) goto L98
            return r13
        L78:
            r11 = r15
            java.lang.Object r13 = r5.r1(r6, r7, r8, r9, r11)
            java.lang.Object r14 = kotlin.coroutines.intrinsics.a.l()
            if (r13 != r14) goto L98
            return r13
        L84:
            r11 = r15
            if (r12 == 0) goto L98
            r6.r()
            java.lang.Object r13 = r5.O0(r8, r11)
            java.lang.Object r14 = kotlin.coroutines.intrinsics.a.l()
            if (r13 != r14) goto L98
            return r13
        L95:
            r6.b()
        L98:
            kotlin.n1 r13 = kotlin.n1.a
            return r13
    }

    public static final /* synthetic */ void n(kotlinx.coroutines.channels.BufferedChannel r0, kotlinx.coroutines.p r1) {
            r0.L0(r1)
            return
    }

    static /* synthetic */ <E> java.lang.Object n1(kotlinx.coroutines.channels.BufferedChannel<E> r14, E r15, kotlin.coroutines.e<? super java.lang.Boolean> r16) {
            kotlinx.coroutines.q r0 = new kotlinx.coroutines.q
            kotlin.coroutines.e r1 = kotlin.coroutines.intrinsics.a.e(r16)
            r2 = 1
            r0.<init>(r1, r2)
            r0.Q()
            kotlin.jvm.functions.Function1<E, kotlin.n1> r1 = r14.b
            if (r1 != 0) goto Lb7
            kotlinx.coroutines.channels.BufferedChannel$b r9 = new kotlinx.coroutines.channels.BufferedChannel$b
            r9.<init>(r0)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = h()
            java.lang.Object r1 = r1.get(r14)
            kotlinx.coroutines.channels.o r1 = (kotlinx.coroutines.channels.o) r1
        L20:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = j()
            long r3 = r3.getAndIncrement(r14)
            r5 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r7 = r3 & r5
            boolean r10 = k(r14, r3)
            int r3 = kotlinx.coroutines.channels.i.b
            long r4 = (long) r3
            long r4 = r7 / r4
            long r11 = (long) r3
            long r11 = r7 % r11
            int r3 = (int) r11
            long r11 = r1.c
            r13 = 0
            int r6 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r6 == 0) goto L5d
            kotlinx.coroutines.channels.o r4 = d(r14, r4, r1)
            if (r4 != 0) goto L59
            if (r10 == 0) goto L20
        L4b:
            kotlin.Result$a r14 = kotlin.Result.Companion
            java.lang.Boolean r14 = kotlin.coroutines.jvm.internal.a.a(r13)
            java.lang.Object r14 = kotlin.Result.m11constructorimpl(r14)
            r0.resumeWith(r14)
            goto La9
        L59:
            r6 = r15
            r5 = r3
            r3 = r14
            goto L5f
        L5d:
            r4 = r1
            goto L59
        L5f:
            int r1 = K(r3, r4, r5, r6, r7, r9, r10)
            if (r1 == 0) goto La5
            if (r1 == r2) goto L97
            r6 = 2
            if (r1 == r6) goto L8d
            r5 = 3
            if (r1 == r5) goto L85
            r5 = 4
            if (r1 == r5) goto L79
            r5 = 5
            if (r1 == r5) goto L74
            goto L77
        L74:
            r4.b()
        L77:
            r1 = r4
            goto L20
        L79:
            long r1 = r14.m0()
            int r14 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r14 >= 0) goto L4b
            r4.b()
            goto L4b
        L85:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "unexpected"
            r14.<init>(r0)
            throw r14
        L8d:
            if (r10 == 0) goto L93
            r4.r()
            goto L4b
        L93:
            y(r14, r9, r4, r5)
            goto La9
        L97:
            kotlin.Result$a r14 = kotlin.Result.Companion
            java.lang.Boolean r14 = kotlin.coroutines.jvm.internal.a.a(r2)
            java.lang.Object r14 = kotlin.Result.m11constructorimpl(r14)
            r0.resumeWith(r14)
            goto La9
        La5:
            r4.b()
            goto L97
        La9:
            java.lang.Object r14 = r0.x()
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
            if (r14 != r0) goto Lb6
            kotlin.coroutines.jvm.internal.e.c(r16)
        Lb6:
            return r14
        Lb7:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "the `onUndeliveredElement` feature is unsupported for `sendBroadcast(e)`"
            r14.<init>(r0)
            throw r14
    }

    public static final /* synthetic */ java.lang.Object o(kotlinx.coroutines.channels.BufferedChannel r0, java.lang.Object r1, kotlin.coroutines.e r2) {
            java.lang.Object r0 = r0.O0(r1, r2)
            return r0
    }

    public static final /* synthetic */ void p(kotlinx.coroutines.channels.BufferedChannel r0, java.lang.Object r1, kotlinx.coroutines.p r2) {
            r0.P0(r1, r2)
            return
    }

    public static /* synthetic */ java.lang.Object p1(kotlinx.coroutines.channels.BufferedChannel r13, java.lang.Object r14, java.lang.Object r15, kotlin.jvm.functions.Function0 r16, kotlin.jvm.functions.Function2 r17, kotlin.jvm.functions.Function0 r18, kotlin.jvm.functions.Function4 r19, int r20, java.lang.Object r21) {
            if (r21 != 0) goto Lb3
            r1 = r20 & 32
            if (r1 == 0) goto La
            kotlinx.coroutines.channels.BufferedChannel$sendImpl$1 r1 = kotlinx.coroutines.channels.BufferedChannel$sendImpl$1.INSTANCE
            r8 = r1
            goto Lc
        La:
            r8 = r19
        Lc:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = h()
            java.lang.Object r1 = r1.get(r13)
            kotlinx.coroutines.channels.o r1 = (kotlinx.coroutines.channels.o) r1
        L16:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = j()
            long r2 = r2.getAndIncrement(r13)
            r4 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r4 = r4 & r2
            boolean r7 = k(r13, r2)
            int r2 = kotlinx.coroutines.channels.i.b
            long r9 = (long) r2
            long r9 = r4 / r9
            long r2 = (long) r2
            long r2 = r4 % r2
            int r2 = (int) r2
            long r11 = r1.c
            int r3 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r3 == 0) goto L49
            kotlinx.coroutines.channels.o r3 = d(r13, r9, r1)
            if (r3 != 0) goto L44
            if (r7 == 0) goto L16
            java.lang.Object r0 = r18.invoke()
            return r0
        L44:
            r1 = r3
            r0 = r13
            r6 = r15
            r3 = r14
            goto L4c
        L49:
            r0 = r13
            r3 = r14
            r6 = r15
        L4c:
            int r9 = K(r0, r1, r2, r3, r4, r6, r7)
            if (r9 == 0) goto Lab
            r3 = 1
            if (r9 == r3) goto La6
            r3 = 2
            if (r9 == r3) goto L83
            r3 = 3
            if (r9 == r3) goto L76
            r2 = 4
            if (r9 == r2) goto L66
            r2 = 5
            if (r9 == r2) goto L62
            goto L16
        L62:
            r1.b()
            goto L16
        L66:
            long r2 = r13.m0()
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 >= 0) goto L71
            r1.b()
        L71:
            java.lang.Object r0 = r18.invoke()
            return r0
        L76:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            java.lang.Object r0 = r8.invoke(r1, r0, r14, r2)
            return r0
        L83:
            if (r7 == 0) goto L8d
            r1.r()
            java.lang.Object r0 = r18.invoke()
            return r0
        L8d:
            boolean r3 = r15 instanceof kotlinx.coroutines.r3
            if (r3 == 0) goto L95
            r3 = r15
            kotlinx.coroutines.r3 r3 = (kotlinx.coroutines.r3) r3
            goto L96
        L95:
            r3 = 0
        L96:
            if (r3 == 0) goto L9b
            y(r13, r3, r1, r2)
        L9b:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r2 = r17
            java.lang.Object r0 = r2.invoke(r1, r0)
            return r0
        La6:
            java.lang.Object r0 = r16.invoke()
            return r0
        Lab:
            r1.b()
            java.lang.Object r0 = r16.invoke()
            return r0
        Lb3:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: sendImpl"
            r0.<init>(r1)
            throw r0
    }

    private final void q0(long r6) {
            r5 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = kotlinx.coroutines.channels.BufferedChannel.g
            long r6 = r0.addAndGet(r5, r6)
            r0 = 4611686018427387904(0x4000000000000000, double:2.0)
            long r6 = r6 & r0
            r2 = 0
            int r4 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r4 == 0) goto L1b
        Lf:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r6 = kotlinx.coroutines.channels.BufferedChannel.g
            long r6 = r6.get(r5)
            long r6 = r6 & r0
            int r4 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r4 == 0) goto L1b
            goto Lf
        L1b:
            return
    }

    private final void q1(kotlinx.coroutines.channels.o<E> r16, int r17, E r18, long r19, kotlinx.coroutines.r3 r21, kotlin.jvm.functions.Function0<kotlin.n1> r22, kotlin.jvm.functions.Function0<kotlin.n1> r23) {
            r15 = this;
            r7 = 0
            r0 = r15
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r19
            r6 = r21
            int r7 = K(r0, r1, r2, r3, r4, r6, r7)
            if (r7 == 0) goto Le4
            r8 = 1
            if (r7 == r8) goto Le0
            r9 = 2
            if (r7 == r9) goto Ld6
            r10 = 4
            if (r7 == r10) goto Lc7
            java.lang.String r11 = "unexpected"
            r12 = 5
            if (r7 != r12) goto Lc0
            r16.b()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = h()
            java.lang.Object r1 = r1.get(r15)
            kotlinx.coroutines.channels.o r1 = (kotlinx.coroutines.channels.o) r1
        L2d:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = j()
            long r2 = r2.getAndIncrement(r15)
            r4 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r4 = r4 & r2
            boolean r7 = k(r15, r2)
            int r2 = kotlinx.coroutines.channels.i.b
            long r13 = (long) r2
            long r13 = r4 / r13
            long r2 = (long) r2
            long r2 = r4 % r2
            int r2 = (int) r2
            r19 = r11
            long r10 = r1.c
            int r3 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r3 == 0) goto L67
            kotlinx.coroutines.channels.o r3 = d(r15, r13, r1)
            if (r3 != 0) goto L60
            if (r7 == 0) goto L5c
            r23.invoke()
            return
        L5c:
            r11 = r19
            r10 = 4
            goto L2d
        L60:
            r1 = r3
            r0 = r15
            r6 = r21
            r3 = r18
            goto L6c
        L67:
            r0 = r15
            r3 = r18
            r6 = r21
        L6c:
            int r10 = K(r0, r1, r2, r3, r4, r6, r7)
            if (r10 == 0) goto Lb9
            if (r10 == r8) goto Lb5
            if (r10 == r9) goto L9a
            r2 = 3
            if (r10 == r2) goto L92
            r2 = 4
            if (r10 == r2) goto L83
            if (r10 == r12) goto L7f
            goto L5c
        L7f:
            r1.b()
            goto L5c
        L83:
            long r2 = r15.m0()
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 >= 0) goto L8e
            r1.b()
        L8e:
            r23.invoke()
            return
        L92:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r2 = r19
            r1.<init>(r2)
            throw r1
        L9a:
            if (r7 == 0) goto La3
            r1.r()
            r23.invoke()
            return
        La3:
            boolean r3 = androidx.activity.k.a(r21)
            if (r3 == 0) goto Lac
            r3 = r21
            goto Lad
        Lac:
            r3 = 0
        Lad:
            if (r3 == 0) goto Lb2
            y(r15, r3, r1, r2)
        Lb2:
            kotlin.n1 r1 = kotlin.n1.a
            return
        Lb5:
            r22.invoke()
            return
        Lb9:
            r1.b()
            r22.invoke()
            return
        Lc0:
            r2 = r11
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r2)
            throw r1
        Lc7:
            long r1 = r15.m0()
            int r3 = (r19 > r1 ? 1 : (r19 == r1 ? 0 : -1))
            if (r3 >= 0) goto Ld2
            r16.b()
        Ld2:
            r23.invoke()
            return
        Ld6:
            r1 = r16
            r2 = r17
            r6 = r21
            y(r15, r6, r1, r2)
            return
        Le0:
            r22.invoke()
            return
        Le4:
            r1 = r16
            r1.b()
            r22.invoke()
            return
    }

    static /* synthetic */ void r0(kotlinx.coroutines.channels.BufferedChannel r0, long r1, int r3, java.lang.Object r4) {
            if (r4 != 0) goto Lc
            r3 = r3 & 1
            if (r3 == 0) goto L8
            r1 = 1
        L8:
            r0.q0(r1)
            return
        Lc:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: incCompletedExpandBufferAttempts"
            r0.<init>(r1)
            throw r0
    }

    private final java.lang.Object r1(kotlinx.coroutines.channels.o<E> r17, int r18, E r19, long r20, kotlin.coroutines.e<? super kotlin.n1> r22) {
            r16 = this;
            kotlin.coroutines.e r0 = kotlin.coroutines.intrinsics.a.e(r22)
            kotlinx.coroutines.q r7 = kotlinx.coroutines.s.b(r0)
            r8 = 0
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r20
            int r0 = K(r1, r2, r3, r4, r5, r7, r8)     // Catch: java.lang.Throwable -> L64
            if (r0 == 0) goto Le3
            r9 = 1
            if (r0 == r9) goto Lde
            r10 = 2
            if (r0 == r10) goto Ld6
            r11 = 4
            if (r0 == r11) goto Lca
            java.lang.String r12 = "unexpected"
            r13 = 5
            if (r0 != r13) goto Lc3
            r17.b()     // Catch: java.lang.Throwable -> L64
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = h()     // Catch: java.lang.Throwable -> L64
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L64
            kotlinx.coroutines.channels.o r0 = (kotlinx.coroutines.channels.o) r0     // Catch: java.lang.Throwable -> L64
        L34:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = j()     // Catch: java.lang.Throwable -> L64
            long r2 = r2.getAndIncrement(r1)     // Catch: java.lang.Throwable -> L64
            r5 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r5 = r5 & r2
            boolean r8 = k(r1, r2)     // Catch: java.lang.Throwable -> L64
            int r2 = kotlinx.coroutines.channels.i.b     // Catch: java.lang.Throwable -> L64
            long r14 = (long) r2     // Catch: java.lang.Throwable -> L64
            long r14 = r5 / r14
            long r2 = (long) r2     // Catch: java.lang.Throwable -> L64
            long r2 = r5 % r2
            int r3 = (int) r2     // Catch: java.lang.Throwable -> L64
            r20 = r12
            long r11 = r0.c     // Catch: java.lang.Throwable -> L64
            int r2 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r2 == 0) goto L6b
            kotlinx.coroutines.channels.o r2 = d(r1, r14, r0)     // Catch: java.lang.Throwable -> L64
            if (r2 != 0) goto L6c
            if (r8 == 0) goto L67
        L5f:
            p(r1, r4, r7)     // Catch: java.lang.Throwable -> L64
            goto Led
        L64:
            r0 = move-exception
            goto L104
        L67:
            r12 = r20
        L69:
            r11 = 4
            goto L34
        L6b:
            r2 = r0
        L6c:
            int r0 = K(r1, r2, r3, r4, r5, r7, r8)     // Catch: java.lang.Throwable -> L64
            if (r0 == 0) goto Lbb
            if (r0 == r9) goto Laf
            if (r0 == r10) goto L9a
            r3 = 3
            if (r0 == r3) goto L92
            r3 = 4
            if (r0 == r3) goto L86
            if (r0 == r13) goto L7f
            goto L82
        L7f:
            r2.b()     // Catch: java.lang.Throwable -> L64
        L82:
            r12 = r20
            r0 = r2
            goto L69
        L86:
            long r8 = r1.m0()     // Catch: java.lang.Throwable -> L64
            int r0 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r0 >= 0) goto L5f
            r2.b()     // Catch: java.lang.Throwable -> L64
            goto L5f
        L92:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L64
            r2 = r20
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L64
            throw r0     // Catch: java.lang.Throwable -> L64
        L9a:
            if (r8 == 0) goto La0
            r2.r()     // Catch: java.lang.Throwable -> L64
            goto L5f
        La0:
            boolean r0 = androidx.activity.k.a(r7)     // Catch: java.lang.Throwable -> L64
            if (r0 == 0) goto La8
            r0 = r7
            goto La9
        La8:
            r0 = 0
        La9:
            if (r0 == 0) goto Led
            y(r1, r0, r2, r3)     // Catch: java.lang.Throwable -> L64
            goto Led
        Laf:
            kotlin.Result$a r0 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L64
            kotlin.n1 r0 = kotlin.n1.a     // Catch: java.lang.Throwable -> L64
        Lb3:
            java.lang.Object r0 = kotlin.Result.m11constructorimpl(r0)     // Catch: java.lang.Throwable -> L64
            r7.resumeWith(r0)     // Catch: java.lang.Throwable -> L64
            goto Led
        Lbb:
            r2.b()     // Catch: java.lang.Throwable -> L64
            kotlin.Result$a r0 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L64
            kotlin.n1 r0 = kotlin.n1.a     // Catch: java.lang.Throwable -> L64
            goto Lb3
        Lc3:
            r2 = r12
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L64
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L64
            throw r0     // Catch: java.lang.Throwable -> L64
        Lca:
            long r2 = r1.m0()     // Catch: java.lang.Throwable -> L64
            int r0 = (r20 > r2 ? 1 : (r20 == r2 ? 0 : -1))
            if (r0 >= 0) goto L5f
            r17.b()     // Catch: java.lang.Throwable -> L64
            goto L5f
        Ld6:
            r2 = r17
            r3 = r18
            y(r1, r7, r2, r3)     // Catch: java.lang.Throwable -> L64
            goto Led
        Lde:
            kotlin.Result$a r0 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L64
            kotlin.n1 r0 = kotlin.n1.a     // Catch: java.lang.Throwable -> L64
            goto Lb3
        Le3:
            r2 = r17
            r2.b()     // Catch: java.lang.Throwable -> L64
            kotlin.Result$a r0 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L64
            kotlin.n1 r0 = kotlin.n1.a     // Catch: java.lang.Throwable -> L64
            goto Lb3
        Led:
            java.lang.Object r0 = r7.x()
            java.lang.Object r2 = kotlin.coroutines.intrinsics.a.l()
            if (r0 != r2) goto Lfa
            kotlin.coroutines.jvm.internal.e.c(r22)
        Lfa:
            java.lang.Object r2 = kotlin.coroutines.intrinsics.a.l()
            if (r0 != r2) goto L101
            return r0
        L101:
            kotlin.n1 r0 = kotlin.n1.a
            return r0
        L104:
            r7.N()
            throw r0
    }

    public static final /* synthetic */ void s(kotlinx.coroutines.channels.BufferedChannel r0, kotlinx.coroutines.r3 r1, kotlinx.coroutines.channels.o r2, int r3) {
            r0.S0(r1, r2, r3)
            return
    }

    private final void s0() {
            r3 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.channels.BufferedChannel.l
        L2:
            java.lang.Object r1 = r0.get(r3)
            if (r1 != 0) goto Ld
            kotlinx.coroutines.internal.s0 r2 = kotlinx.coroutines.channels.i.d()
            goto L11
        Ld:
            kotlinx.coroutines.internal.s0 r2 = kotlinx.coroutines.channels.i.e()
        L11:
            boolean r2 = androidx.concurrent.futures.a.a(r0, r3, r1, r2)
            if (r2 == 0) goto L2
            if (r1 != 0) goto L1a
            return
        L1a:
            r0 = 1
            java.lang.Object r0 = kotlin.jvm.internal.u0.q(r1, r0)
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            java.lang.Throwable r0 = r3.f0()
            r1.invoke(r0)
            return
    }

    private final boolean s1(long r3) {
            r2 = this;
            boolean r0 = r2.y0(r3)
            if (r0 == 0) goto L8
            r3 = 0
            return r3
        L8:
            r0 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r3 = r3 & r0
            boolean r3 = r2.L(r3)
            r3 = r3 ^ 1
            return r3
    }

    private final boolean t0(kotlinx.coroutines.channels.o<E> r5, int r6, long r7) {
            r4 = this;
        L0:
            java.lang.Object r0 = r5.y(r6)
            r1 = 0
            if (r0 == 0) goto L48
            kotlinx.coroutines.internal.s0 r2 = kotlinx.coroutines.channels.i.k()
            if (r0 != r2) goto Le
            goto L48
        Le:
            kotlinx.coroutines.internal.s0 r5 = kotlinx.coroutines.channels.i.f
            r6 = 1
            if (r0 != r5) goto L14
            return r6
        L14:
            kotlinx.coroutines.internal.s0 r5 = kotlinx.coroutines.channels.i.j()
            if (r0 != r5) goto L1b
            return r1
        L1b:
            kotlinx.coroutines.internal.s0 r5 = kotlinx.coroutines.channels.i.z()
            if (r0 != r5) goto L22
            return r1
        L22:
            kotlinx.coroutines.internal.s0 r5 = kotlinx.coroutines.channels.i.f()
            if (r0 != r5) goto L29
            return r1
        L29:
            kotlinx.coroutines.internal.s0 r5 = kotlinx.coroutines.channels.i.o()
            if (r0 != r5) goto L30
            return r1
        L30:
            kotlinx.coroutines.internal.s0 r5 = kotlinx.coroutines.channels.i.p()
            if (r0 != r5) goto L37
            return r6
        L37:
            kotlinx.coroutines.internal.s0 r5 = kotlinx.coroutines.channels.i.q()
            if (r0 != r5) goto L3e
            return r1
        L3e:
            long r2 = r4.m0()
            int r5 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r5 != 0) goto L47
            return r6
        L47:
            return r1
        L48:
            kotlinx.coroutines.internal.s0 r2 = kotlinx.coroutines.channels.i.o()
            boolean r0 = r5.t(r6, r0, r2)
            if (r0 == 0) goto L0
            r4.Z()
            return r1
    }

    private final boolean u0(long r7, boolean r9) {
            r6 = this;
            r0 = 60
            long r0 = r7 >> r0
            int r1 = (int) r0
            r0 = 0
            if (r1 == 0) goto L45
            r2 = 1
            if (r1 == r2) goto L45
            r3 = 2
            r4 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            if (r1 == r3) goto L36
            r9 = 3
            if (r1 != r9) goto L1b
            long r7 = r7 & r4
            r6.V(r7)
            return r2
        L1b:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "unexpected close status: "
            r7.append(r8)
            r7.append(r1)
            java.lang.String r7 = r7.toString()
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r7 = r7.toString()
            r8.<init>(r7)
            throw r8
        L36:
            long r7 = r7 & r4
            r6.W(r7)
            if (r9 == 0) goto L44
            boolean r7 = r6.p0()
            if (r7 != 0) goto L43
            return r2
        L43:
            return r0
        L44:
            return r2
        L45:
            return r0
    }

    @kotlinx.coroutines.ExperimentalCoroutinesApi
    public static /* synthetic */ void v0() {
            return
    }

    private final boolean v1(java.lang.Object r5, E r6) {
            r4 = this;
            boolean r0 = r5 instanceof kotlinx.coroutines.selects.m
            if (r0 == 0) goto Lb
            kotlinx.coroutines.selects.m r5 = (kotlinx.coroutines.selects.m) r5
            boolean r5 = r5.j(r4, r6)
            return r5
        Lb:
            boolean r0 = r5 instanceof kotlinx.coroutines.channels.a0
            r1 = 0
            if (r0 == 0) goto L36
            java.lang.String r0 = "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveCatching<E of kotlinx.coroutines.channels.BufferedChannel>"
            kotlin.jvm.internal.g0.n(r5, r0)
            kotlinx.coroutines.channels.a0 r5 = (kotlinx.coroutines.channels.a0) r5
            kotlinx.coroutines.q<kotlinx.coroutines.channels.n<? extends E>> r0 = r5.a
            kotlinx.coroutines.channels.n$b r2 = kotlinx.coroutines.channels.n.b
            java.lang.Object r2 = r2.c(r6)
            kotlinx.coroutines.channels.n r2 = kotlinx.coroutines.channels.n.b(r2)
            kotlin.jvm.functions.Function1<E, kotlin.n1> r3 = r4.b
            if (r3 == 0) goto L31
            kotlinx.coroutines.q<kotlinx.coroutines.channels.n<? extends E>> r5 = r5.a
            kotlin.coroutines.i r5 = r5.getContext()
            kotlin.jvm.functions.Function1 r1 = kotlinx.coroutines.internal.j0.a(r3, r6, r5)
        L31:
            boolean r5 = kotlinx.coroutines.channels.i.u(r0, r2, r1)
            return r5
        L36:
            boolean r0 = r5 instanceof kotlinx.coroutines.channels.BufferedChannel.a
            if (r0 == 0) goto L46
            java.lang.String r0 = "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>"
            kotlin.jvm.internal.g0.n(r5, r0)
            kotlinx.coroutines.channels.BufferedChannel$a r5 = (kotlinx.coroutines.channels.BufferedChannel.a) r5
            boolean r5 = r5.k(r6)
            return r5
        L46:
            boolean r0 = r5 instanceof kotlinx.coroutines.p
            if (r0 == 0) goto L62
            java.lang.String r0 = "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>"
            kotlin.jvm.internal.g0.n(r5, r0)
            kotlinx.coroutines.p r5 = (kotlinx.coroutines.p) r5
            kotlin.jvm.functions.Function1<E, kotlin.n1> r0 = r4.b
            if (r0 == 0) goto L5d
            kotlin.coroutines.i r1 = r5.getContext()
            kotlin.jvm.functions.Function1 r1 = kotlinx.coroutines.internal.j0.a(r0, r6, r1)
        L5d:
            boolean r5 = kotlinx.coroutines.channels.i.u(r5, r6, r1)
            return r5
        L62:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unexpected receiver type: "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
    }

    private final boolean w0(long r2) {
            r1 = this;
            r0 = 1
            boolean r2 = r1.u0(r2, r0)
            return r2
    }

    private final boolean w1(java.lang.Object r4, kotlinx.coroutines.channels.o<E> r5, int r6) {
            r3 = this;
            boolean r0 = r4 instanceof kotlinx.coroutines.p
            r1 = 2
            r2 = 0
            if (r0 == 0) goto L14
            java.lang.String r5 = "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>"
            kotlin.jvm.internal.g0.n(r4, r5)
            kotlinx.coroutines.p r4 = (kotlinx.coroutines.p) r4
            kotlin.n1 r5 = kotlin.n1.a
            boolean r4 = kotlinx.coroutines.channels.i.G(r4, r5, r2, r1, r2)
            return r4
        L14:
            boolean r0 = r4 instanceof kotlinx.coroutines.selects.m
            if (r0 == 0) goto L34
            java.lang.String r0 = "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>"
            kotlin.jvm.internal.g0.n(r4, r0)
            kotlinx.coroutines.selects.l r4 = (kotlinx.coroutines.selects.l) r4
            kotlin.n1 r0 = kotlin.n1.a
            kotlinx.coroutines.selects.TrySelectDetailedResult r4 = r4.K(r3, r0)
            kotlinx.coroutines.selects.TrySelectDetailedResult r0 = kotlinx.coroutines.selects.TrySelectDetailedResult.REREGISTER
            if (r4 != r0) goto L2c
            r5.u(r6)
        L2c:
            kotlinx.coroutines.selects.TrySelectDetailedResult r5 = kotlinx.coroutines.selects.TrySelectDetailedResult.SUCCESSFUL
            if (r4 != r5) goto L32
            r4 = 1
            return r4
        L32:
            r4 = 0
            return r4
        L34:
            boolean r5 = r4 instanceof kotlinx.coroutines.channels.BufferedChannel.b
            if (r5 == 0) goto L45
            kotlinx.coroutines.channels.BufferedChannel$b r4 = (kotlinx.coroutines.channels.BufferedChannel.b) r4
            kotlinx.coroutines.p r4 = r4.a()
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            boolean r4 = kotlinx.coroutines.channels.i.G(r4, r5, r2, r1, r2)
            return r4
        L45:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "Unexpected waiter: "
            r6.append(r0)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
            throw r5
    }

    @kotlinx.coroutines.ExperimentalCoroutinesApi
    public static /* synthetic */ void x0() {
            return
    }

    private final void x1(java.util.concurrent.atomic.AtomicLongFieldUpdater r7, kotlin.jvm.functions.Function1<? super java.lang.Long, java.lang.Long> r8, java.lang.Object r9) {
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

    public static final /* synthetic */ void y(kotlinx.coroutines.channels.BufferedChannel r0, kotlinx.coroutines.r3 r1, kotlinx.coroutines.channels.o r2, int r3) {
            r0.T0(r1, r2, r3)
            return
    }

    private final boolean y0(long r2) {
            r1 = this;
            r0 = 0
            boolean r2 = r1.u0(r2, r0)
            return r2
    }

    private final boolean y1(kotlinx.coroutines.channels.o<E> r5, int r6, long r7) {
            r4 = this;
            java.lang.Object r0 = r5.y(r6)
            boolean r1 = r0 instanceof kotlinx.coroutines.r3
            if (r1 == 0) goto L35
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = kotlinx.coroutines.channels.BufferedChannel.e
            long r1 = r1.get(r4)
            int r3 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r3 < 0) goto L35
            kotlinx.coroutines.internal.s0 r1 = kotlinx.coroutines.channels.i.p()
            boolean r1 = r5.t(r6, r0, r1)
            if (r1 == 0) goto L35
            boolean r7 = r4.w1(r0, r5, r6)
            if (r7 == 0) goto L29
            kotlinx.coroutines.internal.s0 r7 = kotlinx.coroutines.channels.i.f
            r5.C(r6, r7)
            r5 = 1
            return r5
        L29:
            kotlinx.coroutines.internal.s0 r7 = kotlinx.coroutines.channels.i.j()
            r5.C(r6, r7)
            r7 = 0
            r5.z(r6, r7)
            return r7
        L35:
            boolean r5 = r4.z1(r5, r6, r7)
            return r5
    }

    private final boolean z1(kotlinx.coroutines.channels.o<E> r7, int r8, long r9) {
            r6 = this;
        L0:
            java.lang.Object r0 = r7.y(r8)
            boolean r1 = r0 instanceof kotlinx.coroutines.r3
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L44
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = kotlinx.coroutines.channels.BufferedChannel.e
            long r4 = r1.get(r6)
            int r1 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r1 >= 0) goto L23
            kotlinx.coroutines.channels.e0 r1 = new kotlinx.coroutines.channels.e0
            r2 = r0
            kotlinx.coroutines.r3 r2 = (kotlinx.coroutines.r3) r2
            r1.<init>(r2)
            boolean r0 = r7.t(r8, r0, r1)
            if (r0 == 0) goto L0
            return r3
        L23:
            kotlinx.coroutines.internal.s0 r1 = kotlinx.coroutines.channels.i.p()
            boolean r1 = r7.t(r8, r0, r1)
            if (r1 == 0) goto L0
            boolean r9 = r6.w1(r0, r7, r8)
            if (r9 == 0) goto L39
            kotlinx.coroutines.internal.s0 r9 = kotlinx.coroutines.channels.i.f
            r7.C(r8, r9)
            return r3
        L39:
            kotlinx.coroutines.internal.s0 r9 = kotlinx.coroutines.channels.i.j()
            r7.C(r8, r9)
            r7.z(r8, r2)
            return r2
        L44:
            kotlinx.coroutines.internal.s0 r1 = kotlinx.coroutines.channels.i.j()
            if (r0 != r1) goto L4b
            return r2
        L4b:
            if (r0 != 0) goto L58
            kotlinx.coroutines.internal.s0 r1 = kotlinx.coroutines.channels.i.k()
            boolean r0 = r7.t(r8, r0, r1)
            if (r0 == 0) goto L0
            return r3
        L58:
            kotlinx.coroutines.internal.s0 r1 = kotlinx.coroutines.channels.i.f
            if (r0 != r1) goto L5d
            return r3
        L5d:
            kotlinx.coroutines.internal.s0 r1 = kotlinx.coroutines.channels.i.o()
            if (r0 == r1) goto L99
            kotlinx.coroutines.internal.s0 r1 = kotlinx.coroutines.channels.i.f()
            if (r0 == r1) goto L99
            kotlinx.coroutines.internal.s0 r1 = kotlinx.coroutines.channels.i.i()
            if (r0 != r1) goto L70
            goto L99
        L70:
            kotlinx.coroutines.internal.s0 r1 = kotlinx.coroutines.channels.i.z()
            if (r0 != r1) goto L77
            return r3
        L77:
            kotlinx.coroutines.internal.s0 r1 = kotlinx.coroutines.channels.i.q()
            if (r0 != r1) goto L7e
            goto L0
        L7e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Unexpected cell state: "
            r8.append(r9)
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L99:
            return r3
    }

    @Override // kotlinx.coroutines.channels.b0
    public boolean D() {
            r2 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = kotlinx.coroutines.channels.BufferedChannel.d
            long r0 = r0.get(r2)
            boolean r0 = r2.w0(r0)
            return r0
    }

    public final void G1(long r18) {
            r17 = this;
            r1 = r17
            boolean r0 = r1.B0()
            if (r0 == 0) goto La
            goto L82
        La:
            long r2 = r1.e0()
            int r0 = (r2 > r18 ? 1 : (r2 == r18 ? 0 : -1))
            if (r0 <= 0) goto L98
            int r0 = kotlinx.coroutines.channels.i.g()
            r6 = 0
            r2 = 0
        L18:
            r7 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            if (r2 >= r0) goto L3a
            long r3 = r1.e0()
            java.util.concurrent.atomic.AtomicLongFieldUpdater r5 = kotlinx.coroutines.channels.BufferedChannel.g
            long r9 = r5.get(r1)
            long r7 = r7 & r9
            int r5 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r5 != 0) goto L37
            long r7 = r1.e0()
            int r5 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r5 != 0) goto L37
            goto L82
        L37:
            int r2 = r2 + 1
            goto L18
        L3a:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = kotlinx.coroutines.channels.BufferedChannel.g
        L3c:
            long r2 = r0.get(r1)
            long r4 = r2 & r7
            r9 = 1
            long r4 = kotlinx.coroutines.channels.i.a(r4, r9)
            boolean r2 = r0.compareAndSet(r1, r2, r4)
            if (r2 == 0) goto L95
        L4d:
            long r2 = r1.e0()
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = kotlinx.coroutines.channels.BufferedChannel.g
            r4 = r2
            long r2 = r0.get(r1)
            long r10 = r2 & r7
            r12 = 4611686018427387904(0x4000000000000000, double:2.0)
            long r12 = r12 & r2
            r14 = 0
            int r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r16 == 0) goto L65
            r12 = 1
            goto L66
        L65:
            r12 = 0
        L66:
            int r13 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r13 != 0) goto L86
            long r13 = r1.e0()
            int r15 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r15 != 0) goto L86
        L72:
            long r2 = r0.get(r1)
            long r4 = r2 & r7
            long r4 = kotlinx.coroutines.channels.i.a(r4, r6)
            boolean r2 = r0.compareAndSet(r1, r2, r4)
            if (r2 == 0) goto L83
        L82:
            return
        L83:
            r1 = r17
            goto L72
        L86:
            if (r12 != 0) goto L92
            long r4 = kotlinx.coroutines.channels.i.a(r10, r9)
            r1 = r17
            r0.compareAndSet(r1, r2, r4)
            goto L4d
        L92:
            r1 = r17
            goto L4d
        L95:
            r1 = r17
            goto L3c
        L98:
            r1 = r17
            goto La
    }

    protected void J0() {
            r0 = this;
            return
    }

    public boolean M(@org.jetbrains.annotations.Nullable java.lang.Throwable r2) {
            r1 = this;
            if (r2 != 0) goto L9
            java.util.concurrent.CancellationException r2 = new java.util.concurrent.CancellationException
            java.lang.String r0 = "Channel was cancelled"
            r2.<init>(r0)
        L9:
            r0 = 1
            boolean r2 = r1.U(r2, r0)
            return r2
    }

    @Override // kotlinx.coroutines.channels.b0
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.selects.g<E> N() {
            r5 = this;
            kotlinx.coroutines.selects.h r0 = new kotlinx.coroutines.selects.h
            kotlinx.coroutines.channels.BufferedChannel$c r1 = kotlinx.coroutines.channels.BufferedChannel.c.a
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }"
            kotlin.jvm.internal.g0.n(r1, r2)
            r2 = 3
            java.lang.Object r1 = kotlin.jvm.internal.u0.q(r1, r2)
            kotlin.jvm.functions.Function3 r1 = (kotlin.jvm.functions.Function3) r1
            kotlinx.coroutines.channels.BufferedChannel$d r3 = kotlinx.coroutines.channels.BufferedChannel.d.a
            java.lang.String r4 = "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'param')] kotlin.Any?, @[ParameterName(name = 'clauseResult')] kotlin.Any?, kotlin.Any?>{ kotlinx.coroutines.selects.SelectKt.ProcessResultFunction }"
            kotlin.jvm.internal.g0.n(r3, r4)
            java.lang.Object r2 = kotlin.jvm.internal.u0.q(r3, r2)
            kotlin.jvm.functions.Function3 r2 = (kotlin.jvm.functions.Function3) r2
            kotlin.jvm.functions.Function3<kotlinx.coroutines.selects.m<?>, java.lang.Object, java.lang.Object, kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.n1>> r3 = r5.c
            r0.<init>(r5, r1, r2, r3)
            return r0
    }

    public final void P() {
            r10 = this;
            boolean r0 = r10.B0()
            if (r0 == 0) goto L2e
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.channels.BufferedChannel.j
            java.lang.Object r0 = r0.get(r10)
            kotlinx.coroutines.channels.o r1 = kotlinx.coroutines.channels.i.n()
            if (r0 != r1) goto L13
            goto L46
        L13:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "bufferEndSegment must be NULL_SEGMENT for rendezvous and unlimited channels; they do not manipulate it.\nChannel state: "
            r0.append(r1)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L2e:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.channels.BufferedChannel.i
            java.lang.Object r0 = r0.get(r10)
            kotlinx.coroutines.channels.o r0 = (kotlinx.coroutines.channels.o) r0
            long r0 = r0.c
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = kotlinx.coroutines.channels.BufferedChannel.j
            java.lang.Object r2 = r2.get(r10)
            kotlinx.coroutines.channels.o r2 = (kotlinx.coroutines.channels.o) r2
            long r2 = r2.c
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L20a
        L46:
            r0 = 3
            kotlinx.coroutines.channels.o[] r0 = new kotlinx.coroutines.channels.o[r0]
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.channels.BufferedChannel.i
            java.lang.Object r1 = r1.get(r10)
            r2 = 0
            r0[r2] = r1
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.channels.BufferedChannel.h
            java.lang.Object r1 = r1.get(r10)
            r3 = 1
            r0[r3] = r1
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.channels.BufferedChannel.j
            java.lang.Object r1 = r1.get(r10)
            r4 = 2
            r0[r4] = r1
            java.util.List r0 = kotlin.collections.f0.Q(r0)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L73:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L8a
            java.lang.Object r4 = r0.next()
            r5 = r4
            kotlinx.coroutines.channels.o r5 = (kotlinx.coroutines.channels.o) r5
            kotlinx.coroutines.channels.o r6 = kotlinx.coroutines.channels.i.n()
            if (r5 == r6) goto L73
            r1.add(r4)
            goto L73
        L8a:
            java.util.Iterator r0 = r1.iterator()
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L204
            java.lang.Object r1 = r0.next()
            boolean r4 = r0.hasNext()
            if (r4 != 0) goto L9f
            goto Lb9
        L9f:
            r4 = r1
            kotlinx.coroutines.channels.o r4 = (kotlinx.coroutines.channels.o) r4
            long r4 = r4.c
        La4:
            java.lang.Object r6 = r0.next()
            r7 = r6
            kotlinx.coroutines.channels.o r7 = (kotlinx.coroutines.channels.o) r7
            long r7 = r7.c
            int r9 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r9 <= 0) goto Lb3
            r1 = r6
            r4 = r7
        Lb3:
            boolean r6 = r0.hasNext()
            if (r6 != 0) goto La4
        Lb9:
            kotlinx.coroutines.channels.o r1 = (kotlinx.coroutines.channels.o) r1
            kotlinx.coroutines.internal.g r0 = r1.g()
            if (r0 != 0) goto L1e9
        Lc1:
            kotlinx.coroutines.internal.g r0 = r1.e()
            if (r0 == 0) goto L1e8
            kotlinx.coroutines.internal.g r0 = r1.e()
            kotlin.jvm.internal.g0.m(r0)
            kotlinx.coroutines.channels.o r0 = (kotlinx.coroutines.channels.o) r0
            kotlinx.coroutines.internal.g r0 = r0.g()
            if (r0 == 0) goto L101
            kotlinx.coroutines.internal.g r0 = r1.e()
            kotlin.jvm.internal.g0.m(r0)
            kotlinx.coroutines.channels.o r0 = (kotlinx.coroutines.channels.o) r0
            kotlinx.coroutines.internal.g r0 = r0.g()
            if (r0 != r1) goto Le6
            goto L101
        Le6:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "The `segment.next.prev === segment` invariant is violated.\nChannel state: "
            r0.append(r1)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L101:
            int r0 = kotlinx.coroutines.channels.i.b
            r4 = 0
            r5 = 0
        L105:
            if (r4 >= r0) goto L19e
            java.lang.Object r6 = r1.y(r4)
            kotlinx.coroutines.internal.s0 r7 = kotlinx.coroutines.channels.i.f
            boolean r7 = kotlin.jvm.internal.g0.g(r6, r7)
            if (r7 != 0) goto L19a
            boolean r7 = r6 instanceof kotlinx.coroutines.r3
            if (r7 != 0) goto L19a
            kotlinx.coroutines.internal.s0 r7 = kotlinx.coroutines.channels.i.i()
            boolean r7 = kotlin.jvm.internal.g0.g(r6, r7)
            if (r7 == 0) goto L123
            r7 = 1
            goto L12b
        L123:
            kotlinx.coroutines.internal.s0 r7 = kotlinx.coroutines.channels.i.j()
            boolean r7 = kotlin.jvm.internal.g0.g(r6, r7)
        L12b:
            if (r7 == 0) goto L12f
            r7 = 1
            goto L137
        L12f:
            kotlinx.coroutines.internal.s0 r7 = kotlinx.coroutines.channels.i.z()
            boolean r7 = kotlin.jvm.internal.g0.g(r6, r7)
        L137:
            java.lang.String r8 = "Check failed."
            if (r7 == 0) goto L14f
            java.lang.Object r6 = r1.x(r4)
            if (r6 != 0) goto L143
            r6 = 1
            goto L144
        L143:
            r6 = 0
        L144:
            if (r6 == 0) goto L149
            int r5 = r5 + 1
            goto L19a
        L149:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r8)
            throw r0
        L14f:
            kotlinx.coroutines.internal.s0 r7 = kotlinx.coroutines.channels.i.o()
            boolean r7 = kotlin.jvm.internal.g0.g(r6, r7)
            if (r7 == 0) goto L15b
            r7 = 1
            goto L163
        L15b:
            kotlinx.coroutines.internal.s0 r7 = kotlinx.coroutines.channels.i.f()
            boolean r7 = kotlin.jvm.internal.g0.g(r6, r7)
        L163:
            if (r7 == 0) goto L177
            java.lang.Object r6 = r1.x(r4)
            if (r6 != 0) goto L16d
            r6 = 1
            goto L16e
        L16d:
            r6 = 0
        L16e:
            if (r6 == 0) goto L171
            goto L19a
        L171:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r8)
            throw r0
        L177:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unexpected segment cell state: "
            r1.append(r2)
            r1.append(r6)
            java.lang.String r2 = ".\nChannel state: "
            r1.append(r2)
            r1.append(r10)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L19a:
            int r4 = r4 + 1
            goto L105
        L19e:
            int r0 = kotlinx.coroutines.channels.i.b
            if (r5 != r0) goto L1dc
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.channels.BufferedChannel.i
            java.lang.Object r0 = r0.get(r10)
            if (r1 == r0) goto L1bd
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.channels.BufferedChannel.h
            java.lang.Object r0 = r0.get(r10)
            if (r1 == r0) goto L1bd
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.channels.BufferedChannel.j
            java.lang.Object r0 = r0.get(r10)
            if (r1 != r0) goto L1bb
            goto L1bd
        L1bb:
            r0 = 0
            goto L1be
        L1bd:
            r0 = 1
        L1be:
            if (r0 == 0) goto L1c1
            goto L1dc
        L1c1:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Logically removed segment is reachable.\nChannel state: "
            r0.append(r1)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L1dc:
            kotlinx.coroutines.internal.g r0 = r1.e()
            kotlin.jvm.internal.g0.m(r0)
            r1 = r0
            kotlinx.coroutines.channels.o r1 = (kotlinx.coroutines.channels.o) r1
            goto Lc1
        L1e8:
            return
        L1e9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "All processed segments should be unreachable from the data structure, but the `prev` link of the leftmost segment is non-null.\nChannel state: "
            r0.append(r1)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L204:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
        L20a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "bufferEndSegment should not have lower id than receiveSegment.\nChannel state: "
            r0.append(r1)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    protected void Q0() {
            r0 = this;
            return
    }

    @Override // kotlinx.coroutines.channels.b0
    @org.jetbrains.annotations.Nullable
    public java.lang.Object R(@org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super E> r1) {
            r0 = this;
            java.lang.Object r1 = Y0(r0, r1)
            return r1
    }

    protected void R0() {
            r0 = this;
            return
    }

    @Override // kotlinx.coroutines.channels.c0
    public boolean S(@org.jetbrains.annotations.Nullable java.lang.Throwable r2) {
            r1 = this;
            r0 = 0
            boolean r2 = r1.U(r2, r0)
            return r2
    }

    @Override // kotlinx.coroutines.channels.c0
    @org.jetbrains.annotations.Nullable
    public java.lang.Object T(E r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r2) {
            r0 = this;
            java.lang.Object r1 = l1(r0, r1, r2)
            return r1
    }

    protected boolean U(@org.jetbrains.annotations.Nullable java.lang.Throwable r3, boolean r4) {
            r2 = this;
            if (r4 == 0) goto L5
            r2.F0()
        L5:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.channels.BufferedChannel.k
            kotlinx.coroutines.internal.s0 r1 = kotlinx.coroutines.channels.i.l()
            boolean r3 = androidx.concurrent.futures.a.a(r0, r2, r1, r3)
            if (r4 == 0) goto L15
            r2.G0()
            goto L18
        L15:
            r2.H0()
        L18:
            r2.X()
            r2.J0()
            if (r3 == 0) goto L23
            r2.s0()
        L23:
            return r3
    }

    protected final void Y(long r11) {
            r10 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.channels.BufferedChannel.i
            java.lang.Object r0 = r0.get(r10)
            kotlinx.coroutines.channels.o r0 = (kotlinx.coroutines.channels.o) r0
        L8:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = kotlinx.coroutines.channels.BufferedChannel.e
            long r3 = r1.get(r10)
            int r2 = r10.a
            long r5 = (long) r2
            long r5 = r5 + r3
            long r7 = r10.e0()
            long r5 = java.lang.Math.max(r5, r7)
            int r2 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r2 >= 0) goto L1f
            return
        L1f:
            r5 = 1
            long r5 = r5 + r3
            r2 = r10
            boolean r1 = r1.compareAndSet(r2, r3, r5)
            if (r1 == 0) goto L8
            int r1 = kotlinx.coroutines.channels.i.b
            long r5 = (long) r1
            long r5 = r3 / r5
            long r7 = (long) r1
            long r7 = r3 % r7
            int r1 = (int) r7
            long r7 = r0.c
            int r9 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r9 == 0) goto L40
            kotlinx.coroutines.channels.o r5 = r10.b0(r5, r0)
            if (r5 != 0) goto L3f
            goto L8
        L3f:
            r0 = r5
        L40:
            r7 = 0
            r5 = r3
            r3 = r0
            r4 = r1
            java.lang.Object r0 = r2.A1(r3, r4, r5, r7)
            kotlinx.coroutines.internal.s0 r1 = kotlinx.coroutines.channels.i.h()
            if (r0 != r1) goto L5a
            long r0 = r10.o0()
            int r4 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r4 >= 0) goto L6b
            r3.b()
            goto L6b
        L5a:
            r3.b()
            kotlin.jvm.functions.Function1<E, kotlin.n1> r1 = r2.b
            if (r1 == 0) goto L6b
            r4 = 2
            r5 = 0
            kotlinx.coroutines.internal.UndeliveredElementException r0 = kotlinx.coroutines.internal.j0.d(r1, r0, r5, r4, r5)
            if (r0 != 0) goto L6a
            goto L6b
        L6a:
            throw r0
        L6b:
            r0 = r3
            goto L8
    }

    @Override // kotlinx.coroutines.channels.b0
    public final boolean a(@org.jetbrains.annotations.Nullable java.lang.Throwable r1) {
            r0 = this;
            boolean r1 = r0.M(r1)
            return r1
    }

    @Override // kotlinx.coroutines.channels.b0
    public final void b(@org.jetbrains.annotations.Nullable java.util.concurrent.CancellationException r1) {
            r0 = this;
            r0.M(r1)
            return
    }

    @Override // kotlinx.coroutines.channels.b0
    public final void cancel() {
            r1 = this;
            r0 = 0
            r1.M(r0)
            return
    }

    @org.jetbrains.annotations.Nullable
    protected final java.lang.Throwable f0() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.channels.BufferedChannel.k
            java.lang.Object r0 = r0.get(r1)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            return r0
    }

    protected void g1(@org.jetbrains.annotations.NotNull kotlinx.coroutines.selects.m<?> r14, @org.jetbrains.annotations.Nullable java.lang.Object r15) {
            r13 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = h()
            java.lang.Object r0 = r0.get(r13)
            kotlinx.coroutines.channels.o r0 = (kotlinx.coroutines.channels.o) r0
        La:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = j()
            long r1 = r1.getAndIncrement(r13)
            r3 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r9 = r1 & r3
            boolean r12 = k(r13, r1)
            int r1 = kotlinx.coroutines.channels.i.b
            long r2 = (long) r1
            long r2 = r9 / r2
            long r4 = (long) r1
            long r4 = r9 % r4
            int r7 = (int) r4
            long r4 = r0.c
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 == 0) goto L3d
            kotlinx.coroutines.channels.o r1 = d(r13, r2, r0)
            if (r1 != 0) goto L38
            if (r12 == 0) goto La
            r13.N0(r15, r14)
            return
        L38:
            r6 = r1
        L39:
            r5 = r13
            r11 = r14
            r8 = r15
            goto L3f
        L3d:
            r6 = r0
            goto L39
        L3f:
            int r14 = K(r5, r6, r7, r8, r9, r11, r12)
            r0 = r6
            if (r14 == 0) goto L91
            r15 = 1
            if (r14 == r15) goto L8b
            r15 = 2
            if (r14 == r15) goto L73
            r15 = 3
            if (r14 == r15) goto L6b
            r15 = 4
            if (r14 == r15) goto L5c
            r15 = 5
            if (r14 == r15) goto L56
            goto L59
        L56:
            r0.b()
        L59:
            r15 = r8
            r14 = r11
            goto La
        L5c:
            long r14 = r13.m0()
            int r1 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            if (r1 >= 0) goto L67
            r0.b()
        L67:
            r13.N0(r8, r11)
            return
        L6b:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "unexpected"
            r14.<init>(r15)
            throw r14
        L73:
            if (r12 == 0) goto L7c
            r0.r()
            r13.N0(r8, r11)
            return
        L7c:
            boolean r14 = r11 instanceof kotlinx.coroutines.r3
            if (r14 == 0) goto L84
            r14 = r11
            kotlinx.coroutines.r3 r14 = (kotlinx.coroutines.r3) r14
            goto L85
        L84:
            r14 = 0
        L85:
            if (r14 == 0) goto L8a
            y(r13, r14, r0, r7)
        L8a:
            return
        L8b:
            kotlin.n1 r14 = kotlin.n1.a
            r11.f(r14)
            return
        L91:
            r0.b()
            kotlin.n1 r14 = kotlin.n1.a
            r11.f(r14)
            return
    }

    @Override // kotlinx.coroutines.channels.c0
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.selects.i<E, kotlinx.coroutines.channels.BufferedChannel<E>> i() {
            r7 = this;
            kotlinx.coroutines.selects.j r0 = new kotlinx.coroutines.selects.j
            kotlinx.coroutines.channels.BufferedChannel$i r1 = kotlinx.coroutines.channels.BufferedChannel.i.a
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }"
            kotlin.jvm.internal.g0.n(r1, r2)
            r2 = 3
            java.lang.Object r1 = kotlin.jvm.internal.u0.q(r1, r2)
            kotlin.jvm.functions.Function3 r1 = (kotlin.jvm.functions.Function3) r1
            kotlinx.coroutines.channels.BufferedChannel$j r3 = kotlinx.coroutines.channels.BufferedChannel.j.a
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

    @Override // kotlinx.coroutines.channels.b0
    public boolean isEmpty() {
            r2 = this;
            boolean r0 = r2.D()
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            boolean r0 = r2.p0()
            if (r0 == 0) goto Lf
            return r1
        Lf:
            boolean r0 = r2.D()
            r0 = r0 ^ 1
            return r0
    }

    @Override // kotlinx.coroutines.channels.b0
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.channels.l<E> iterator() {
            r1 = this;
            kotlinx.coroutines.channels.BufferedChannel$a r0 = new kotlinx.coroutines.channels.BufferedChannel$a
            r0.<init>(r1)
            return r0
    }

    public final long m0() {
            r2 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = kotlinx.coroutines.channels.BufferedChannel.e
            long r0 = r0.get(r2)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public java.lang.Object m1(E r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super java.lang.Boolean> r2) {
            r0 = this;
            java.lang.Object r1 = n1(r0, r1, r2)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    protected final java.lang.Throwable n0() {
            r2 = this;
            java.lang.Throwable r0 = r2.f0()
            if (r0 != 0) goto Ld
            kotlinx.coroutines.channels.ClosedSendChannelException r0 = new kotlinx.coroutines.channels.ClosedSendChannelException
            java.lang.String r1 = "Channel was closed"
            r0.<init>(r1)
        Ld:
            return r0
    }

    public final long o0() {
            r4 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = kotlinx.coroutines.channels.BufferedChannel.d
            long r0 = r0.get(r4)
            r2 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r0 = r0 & r2
            return r0
    }

    protected final <R> R o1(E r13, @org.jetbrains.annotations.Nullable java.lang.Object r14, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends R> r15, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super kotlinx.coroutines.channels.o<E>, ? super java.lang.Integer, ? extends R> r16, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends R> r17, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function4<? super kotlinx.coroutines.channels.o<E>, ? super java.lang.Integer, ? super E, ? super java.lang.Long, ? extends R> r18) {
            r12 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = h()
            java.lang.Object r1 = r1.get(r12)
            kotlinx.coroutines.channels.o r1 = (kotlinx.coroutines.channels.o) r1
        La:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = j()
            long r2 = r2.getAndIncrement(r12)
            r4 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r4 = r4 & r2
            boolean r7 = k(r12, r2)
            int r2 = kotlinx.coroutines.channels.i.b
            long r8 = (long) r2
            long r8 = r4 / r8
            long r2 = (long) r2
            long r2 = r4 % r2
            int r2 = (int) r2
            long r10 = r1.c
            int r3 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r3 == 0) goto L3d
            kotlinx.coroutines.channels.o r3 = d(r12, r8, r1)
            if (r3 != 0) goto L38
            if (r7 == 0) goto La
            java.lang.Object r1 = r17.invoke()
            return r1
        L38:
            r1 = r3
            r0 = r12
            r6 = r14
            r3 = r13
            goto L40
        L3d:
            r0 = r12
            r3 = r13
            r6 = r14
        L40:
            int r8 = K(r0, r1, r2, r3, r4, r6, r7)
            if (r8 == 0) goto La1
            r3 = 1
            if (r8 == r3) goto L9c
            r3 = 2
            if (r8 == r3) goto L79
            r3 = 3
            if (r8 == r3) goto L6a
            r2 = 4
            if (r8 == r2) goto L5a
            r2 = 5
            if (r8 == r2) goto L56
            goto La
        L56:
            r1.b()
            goto La
        L5a:
            long r2 = r12.m0()
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 >= 0) goto L65
            r1.b()
        L65:
            java.lang.Object r1 = r17.invoke()
            return r1
        L6a:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Long r3 = java.lang.Long.valueOf(r4)
            r5 = r18
            java.lang.Object r1 = r5.invoke(r1, r2, r13, r3)
            return r1
        L79:
            if (r7 == 0) goto L83
            r1.r()
            java.lang.Object r1 = r17.invoke()
            return r1
        L83:
            boolean r3 = r14 instanceof kotlinx.coroutines.r3
            if (r3 == 0) goto L8b
            r3 = r14
            kotlinx.coroutines.r3 r3 = (kotlinx.coroutines.r3) r3
            goto L8c
        L8b:
            r3 = 0
        L8c:
            if (r3 == 0) goto L91
            y(r12, r3, r1, r2)
        L91:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = r16
            java.lang.Object r1 = r3.invoke(r1, r2)
            return r1
        L9c:
            java.lang.Object r1 = r15.invoke()
            return r1
        La1:
            r1.b()
            java.lang.Object r1 = r15.invoke()
            return r1
    }

    @Override // kotlinx.coroutines.channels.c0
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @kotlin.ReplaceWith(expression = "trySend(element).isSuccess", imports = {}))
    public boolean offer(E r1) {
            r0 = this;
            boolean r1 = kotlinx.coroutines.channels.j.a.c(r0, r1)
            return r1
    }

    public final boolean p0() {
            r11 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.channels.BufferedChannel.i
            java.lang.Object r1 = r0.get(r11)
            kotlinx.coroutines.channels.o r1 = (kotlinx.coroutines.channels.o) r1
            long r4 = r11.m0()
            long r2 = r11.o0()
            r6 = 0
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 > 0) goto L16
            return r6
        L16:
            int r2 = kotlinx.coroutines.channels.i.b
            long r7 = (long) r2
            long r7 = r4 / r7
            long r9 = r1.c
            int r3 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r3 == 0) goto L34
            kotlinx.coroutines.channels.o r1 = r11.b0(r7, r1)
            if (r1 != 0) goto L34
            java.lang.Object r0 = r0.get(r11)
            kotlinx.coroutines.channels.o r0 = (kotlinx.coroutines.channels.o) r0
            long r0 = r0.c
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 >= 0) goto L0
            return r6
        L34:
            r1.b()
            long r2 = (long) r2
            long r2 = r4 % r2
            int r0 = (int) r2
            boolean r0 = r11.t0(r1, r0, r4)
            if (r0 == 0) goto L43
            r0 = 1
            return r0
        L43:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = kotlinx.coroutines.channels.BufferedChannel.e
            r0 = 1
            long r6 = r4 + r0
            r3 = r11
            r2.compareAndSet(r3, r4, r6)
            goto L0
    }

    @Override // kotlinx.coroutines.channels.b0
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @kotlin.ReplaceWith(expression = "tryReceive().getOrNull()", imports = {}))
    @org.jetbrains.annotations.Nullable
    public E poll() {
            r1 = this;
            java.lang.Object r0 = kotlinx.coroutines.channels.j.a.d(r1)
            return r0
    }

    @Override // kotlinx.coroutines.channels.c0
    public void q(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.n1> r5) {
            r4 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.channels.BufferedChannel.l
            r1 = 0
            boolean r1 = androidx.concurrent.futures.a.a(r0, r4, r1, r5)
            if (r1 == 0) goto La
            return
        La:
            java.lang.Object r1 = r0.get(r4)
            kotlinx.coroutines.internal.s0 r2 = kotlinx.coroutines.channels.i.d()
            if (r1 != r2) goto L2c
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.channels.BufferedChannel.l
            kotlinx.coroutines.internal.s0 r2 = kotlinx.coroutines.channels.i.d()
            kotlinx.coroutines.internal.s0 r3 = kotlinx.coroutines.channels.i.e()
            boolean r1 = androidx.concurrent.futures.a.a(r1, r4, r2, r3)
            if (r1 == 0) goto La
            java.lang.Throwable r0 = r4.f0()
            r5.invoke(r0)
            return
        L2c:
            kotlinx.coroutines.internal.s0 r5 = kotlinx.coroutines.channels.i.e()
            if (r1 != r5) goto L3a
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Another handler was already registered and successfully invoked"
            r5.<init>(r0)
            throw r5
        L3a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Another handler is already registered: "
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
    }

    @Override // kotlinx.coroutines.channels.c0
    @org.jetbrains.annotations.NotNull
    public java.lang.Object r(E r14) {
            r13 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = kotlinx.coroutines.channels.BufferedChannel.d
            long r0 = r0.get(r13)
            boolean r0 = r13.s1(r0)
            if (r0 == 0) goto L13
            kotlinx.coroutines.channels.n$b r14 = kotlinx.coroutines.channels.n.b
            java.lang.Object r14 = r14.b()
            return r14
        L13:
            kotlinx.coroutines.internal.s0 r6 = kotlinx.coroutines.channels.i.j()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = h()
            java.lang.Object r0 = r0.get(r13)
            kotlinx.coroutines.channels.o r0 = (kotlinx.coroutines.channels.o) r0
        L21:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = j()
            long r1 = r1.getAndIncrement(r13)
            r3 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r3 = r3 & r1
            boolean r7 = k(r13, r1)
            int r1 = kotlinx.coroutines.channels.i.b
            long r8 = (long) r1
            long r8 = r3 / r8
            long r1 = (long) r1
            long r1 = r3 % r1
            int r2 = (int) r1
            long r10 = r0.c
            int r1 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r1 == 0) goto L59
            kotlinx.coroutines.channels.o r1 = d(r13, r8, r0)
            if (r1 != 0) goto L55
            if (r7 == 0) goto L21
            kotlinx.coroutines.channels.n$b r14 = kotlinx.coroutines.channels.n.b
            java.lang.Throwable r0 = r13.n0()
            java.lang.Object r14 = r14.a(r0)
            return r14
        L55:
            r0 = r13
            r4 = r3
        L57:
            r3 = r14
            goto L5d
        L59:
            r1 = r0
            r4 = r3
            r0 = r13
            goto L57
        L5d:
            int r14 = K(r0, r1, r2, r3, r4, r6, r7)
            r12 = r1
            r1 = r0
            r0 = r12
            if (r14 == 0) goto Lc9
            r8 = 1
            if (r14 == r8) goto Lc0
            r8 = 2
            if (r14 == r8) goto L99
            r2 = 3
            if (r14 == r2) goto L91
            r2 = 4
            if (r14 == r2) goto L7b
            r2 = 5
            if (r14 == r2) goto L76
            goto L79
        L76:
            r0.b()
        L79:
            r14 = r3
            goto L21
        L7b:
            long r2 = r13.m0()
            int r14 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r14 >= 0) goto L86
            r0.b()
        L86:
            kotlinx.coroutines.channels.n$b r14 = kotlinx.coroutines.channels.n.b
            java.lang.Throwable r0 = r13.n0()
            java.lang.Object r14 = r14.a(r0)
            return r14
        L91:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "unexpected"
            r14.<init>(r0)
            throw r14
        L99:
            if (r7 == 0) goto La9
            r0.r()
            kotlinx.coroutines.channels.n$b r14 = kotlinx.coroutines.channels.n.b
            java.lang.Throwable r0 = r13.n0()
            java.lang.Object r14 = r14.a(r0)
            return r14
        La9:
            boolean r14 = r6 instanceof kotlinx.coroutines.r3
            if (r14 == 0) goto Lb0
            kotlinx.coroutines.r3 r6 = (kotlinx.coroutines.r3) r6
            goto Lb1
        Lb0:
            r6 = 0
        Lb1:
            if (r6 == 0) goto Lb6
            y(r13, r6, r0, r2)
        Lb6:
            r0.r()
            kotlinx.coroutines.channels.n$b r14 = kotlinx.coroutines.channels.n.b
            java.lang.Object r14 = r14.b()
            return r14
        Lc0:
            kotlinx.coroutines.channels.n$b r14 = kotlinx.coroutines.channels.n.b
            kotlin.n1 r0 = kotlin.n1.a
            java.lang.Object r14 = r14.c(r0)
            return r14
        Lc9:
            r0.b()
            kotlinx.coroutines.channels.n$b r14 = kotlinx.coroutines.channels.n.b
            kotlin.n1 r0 = kotlin.n1.a
            java.lang.Object r14 = r14.c(r0)
            return r14
    }

    @Override // kotlinx.coroutines.channels.b0
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.selects.g<kotlinx.coroutines.channels.n<E>> t() {
            r5 = this;
            kotlinx.coroutines.selects.h r0 = new kotlinx.coroutines.selects.h
            kotlinx.coroutines.channels.BufferedChannel$e r1 = kotlinx.coroutines.channels.BufferedChannel.e.a
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }"
            kotlin.jvm.internal.g0.n(r1, r2)
            r2 = 3
            java.lang.Object r1 = kotlin.jvm.internal.u0.q(r1, r2)
            kotlin.jvm.functions.Function3 r1 = (kotlin.jvm.functions.Function3) r1
            kotlinx.coroutines.channels.BufferedChannel$f r3 = kotlinx.coroutines.channels.BufferedChannel.f.a
            java.lang.String r4 = "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'param')] kotlin.Any?, @[ParameterName(name = 'clauseResult')] kotlin.Any?, kotlin.Any?>{ kotlinx.coroutines.selects.SelectKt.ProcessResultFunction }"
            kotlin.jvm.internal.g0.n(r3, r4)
            java.lang.Object r2 = kotlin.jvm.internal.u0.q(r3, r2)
            kotlin.jvm.functions.Function3 r2 = (kotlin.jvm.functions.Function3) r2
            kotlin.jvm.functions.Function3<kotlinx.coroutines.selects.m<?>, java.lang.Object, java.lang.Object, kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.n1>> r3 = r5.c
            r0.<init>(r5, r1, r2, r3)
            return r0
    }

    public boolean t1() {
            r2 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = kotlinx.coroutines.channels.BufferedChannel.d
            long r0 = r0.get(r2)
            boolean r0 = r2.s1(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r17 = this;
            r0 = r17
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = kotlinx.coroutines.channels.BufferedChannel.d
            long r2 = r2.get(r0)
            r4 = 60
            long r2 = r2 >> r4
            int r3 = (int) r2
            r2 = 3
            r4 = 2
            if (r3 == r4) goto L1e
            if (r3 == r2) goto L18
            goto L23
        L18:
            java.lang.String r3 = "cancelled,"
            r1.append(r3)
            goto L23
        L1e:
            java.lang.String r3 = "closed,"
            r1.append(r3)
        L23:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "capacity="
            r3.append(r5)
            int r5 = r0.a
            r3.append(r5)
            r5 = 44
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            r1.append(r3)
            java.lang.String r3 = "data=["
            r1.append(r3)
            kotlinx.coroutines.channels.o[] r2 = new kotlinx.coroutines.channels.o[r2]
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = kotlinx.coroutines.channels.BufferedChannel.i
            java.lang.Object r3 = r3.get(r0)
            r6 = 0
            r2[r6] = r3
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = kotlinx.coroutines.channels.BufferedChannel.h
            java.lang.Object r3 = r3.get(r0)
            r7 = 1
            r2[r7] = r3
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = kotlinx.coroutines.channels.BufferedChannel.j
            java.lang.Object r3 = r3.get(r0)
            r2[r4] = r3
            java.util.List r2 = kotlin.collections.f0.Q(r2)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L6e:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L85
            java.lang.Object r4 = r2.next()
            r8 = r4
            kotlinx.coroutines.channels.o r8 = (kotlinx.coroutines.channels.o) r8
            kotlinx.coroutines.channels.o r9 = kotlinx.coroutines.channels.i.n()
            if (r8 == r9) goto L6e
            r3.add(r4)
            goto L6e
        L85:
            java.util.Iterator r2 = r3.iterator()
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L212
            java.lang.Object r3 = r2.next()
            boolean r4 = r2.hasNext()
            if (r4 != 0) goto L9a
            goto Lb4
        L9a:
            r4 = r3
            kotlinx.coroutines.channels.o r4 = (kotlinx.coroutines.channels.o) r4
            long r8 = r4.c
        L9f:
            java.lang.Object r4 = r2.next()
            r10 = r4
            kotlinx.coroutines.channels.o r10 = (kotlinx.coroutines.channels.o) r10
            long r10 = r10.c
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 <= 0) goto Lae
            r3 = r4
            r8 = r10
        Lae:
            boolean r4 = r2.hasNext()
            if (r4 != 0) goto L9f
        Lb4:
            kotlinx.coroutines.channels.o r3 = (kotlinx.coroutines.channels.o) r3
            long r10 = r0.m0()
            long r12 = r0.o0()
        Lbe:
            int r2 = kotlinx.coroutines.channels.i.b
            r4 = 0
        Lc1:
            if (r4 >= r2) goto L1e4
            long r8 = r3.c
            int r14 = kotlinx.coroutines.channels.i.b
            long r14 = (long) r14
            long r8 = r8 * r14
            long r14 = (long) r4
            long r8 = r8 + r14
            int r14 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r14 < 0) goto Ld9
            int r15 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r15 >= 0) goto Ld5
            goto Ld9
        Ld5:
            r16 = 1
            goto L1ef
        Ld9:
            java.lang.Object r15 = r3.y(r4)
            java.lang.Object r6 = r3.x(r4)
            r16 = 1
            boolean r7 = r15 instanceof kotlinx.coroutines.p
            if (r7 == 0) goto Lfd
            int r7 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r7 >= 0) goto Lf1
            if (r14 < 0) goto Lf1
            java.lang.String r7 = "receive"
            goto L1aa
        Lf1:
            if (r14 >= 0) goto Lf9
            if (r7 < 0) goto Lf9
            java.lang.String r7 = "send"
            goto L1aa
        Lf9:
            java.lang.String r7 = "cont"
            goto L1aa
        Lfd:
            boolean r7 = r15 instanceof kotlinx.coroutines.selects.m
            if (r7 == 0) goto L117
            int r7 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r7 >= 0) goto L10b
            if (r14 < 0) goto L10b
            java.lang.String r7 = "onReceive"
            goto L1aa
        L10b:
            if (r14 >= 0) goto L113
            if (r7 < 0) goto L113
            java.lang.String r7 = "onSend"
            goto L1aa
        L113:
            java.lang.String r7 = "select"
            goto L1aa
        L117:
            boolean r7 = r15 instanceof kotlinx.coroutines.channels.a0
            if (r7 == 0) goto L11f
            java.lang.String r7 = "receiveCatching"
            goto L1aa
        L11f:
            boolean r7 = r15 instanceof kotlinx.coroutines.channels.BufferedChannel.b
            if (r7 == 0) goto L127
            java.lang.String r7 = "sendBroadcast"
            goto L1aa
        L127:
            boolean r7 = r15 instanceof kotlinx.coroutines.channels.e0
            if (r7 == 0) goto L143
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "EB("
            r7.append(r8)
            r7.append(r15)
            r8 = 41
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            goto L1aa
        L143:
            kotlinx.coroutines.internal.s0 r7 = kotlinx.coroutines.channels.i.q()
            boolean r7 = kotlin.jvm.internal.g0.g(r15, r7)
            if (r7 == 0) goto L14f
            r7 = 1
            goto L157
        L14f:
            kotlinx.coroutines.internal.s0 r7 = kotlinx.coroutines.channels.i.p()
            boolean r7 = kotlin.jvm.internal.g0.g(r15, r7)
        L157:
            if (r7 == 0) goto L15c
            java.lang.String r7 = "resuming_sender"
            goto L1aa
        L15c:
            if (r15 != 0) goto L160
            r7 = 1
            goto L168
        L160:
            kotlinx.coroutines.internal.s0 r7 = kotlinx.coroutines.channels.i.k()
            boolean r7 = kotlin.jvm.internal.g0.g(r15, r7)
        L168:
            if (r7 == 0) goto L16c
            r7 = 1
            goto L174
        L16c:
            kotlinx.coroutines.internal.s0 r7 = kotlinx.coroutines.channels.i.f()
            boolean r7 = kotlin.jvm.internal.g0.g(r15, r7)
        L174:
            if (r7 == 0) goto L178
            r7 = 1
            goto L180
        L178:
            kotlinx.coroutines.internal.s0 r7 = kotlinx.coroutines.channels.i.o()
            boolean r7 = kotlin.jvm.internal.g0.g(r15, r7)
        L180:
            if (r7 == 0) goto L184
            r7 = 1
            goto L18c
        L184:
            kotlinx.coroutines.internal.s0 r7 = kotlinx.coroutines.channels.i.i()
            boolean r7 = kotlin.jvm.internal.g0.g(r15, r7)
        L18c:
            if (r7 == 0) goto L190
            r7 = 1
            goto L198
        L190:
            kotlinx.coroutines.internal.s0 r7 = kotlinx.coroutines.channels.i.j()
            boolean r7 = kotlin.jvm.internal.g0.g(r15, r7)
        L198:
            if (r7 == 0) goto L19c
            r7 = 1
            goto L1a4
        L19c:
            kotlinx.coroutines.internal.s0 r7 = kotlinx.coroutines.channels.i.z()
            boolean r7 = kotlin.jvm.internal.g0.g(r15, r7)
        L1a4:
            if (r7 != 0) goto L1de
            java.lang.String r7 = r15.toString()
        L1aa:
            if (r6 == 0) goto L1cc
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r9 = 40
            r8.append(r9)
            r8.append(r7)
            r8.append(r5)
            r8.append(r6)
            java.lang.String r6 = "),"
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            r1.append(r6)
            goto L1de
        L1cc:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r7)
            r6.append(r5)
            java.lang.String r6 = r6.toString()
            r1.append(r6)
        L1de:
            int r4 = r4 + 1
            r6 = 0
            r7 = 1
            goto Lc1
        L1e4:
            r16 = 1
            kotlinx.coroutines.internal.g r2 = r3.e()
            r3 = r2
            kotlinx.coroutines.channels.o r3 = (kotlinx.coroutines.channels.o) r3
            if (r3 != 0) goto L20e
        L1ef:
            char r2 = kotlin.text.u.U7(r1)
            if (r2 != r5) goto L204
            int r2 = r1.length()
            int r2 = r2 + (-1)
            java.lang.StringBuilder r2 = r1.deleteCharAt(r2)
            java.lang.String r3 = "this.deleteCharAt(index)"
            kotlin.jvm.internal.g0.o(r2, r3)
        L204:
            java.lang.String r2 = "]"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            return r1
        L20e:
            r6 = 0
            r7 = 1
            goto Lbe
        L212:
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            r1.<init>()
            throw r1
    }

    @Override // kotlinx.coroutines.channels.b0
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.selects.g<E> u() {
            r5 = this;
            kotlinx.coroutines.selects.h r0 = new kotlinx.coroutines.selects.h
            kotlinx.coroutines.channels.BufferedChannel$g r1 = kotlinx.coroutines.channels.BufferedChannel.g.a
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }"
            kotlin.jvm.internal.g0.n(r1, r2)
            r2 = 3
            java.lang.Object r1 = kotlin.jvm.internal.u0.q(r1, r2)
            kotlin.jvm.functions.Function3 r1 = (kotlin.jvm.functions.Function3) r1
            kotlinx.coroutines.channels.BufferedChannel$h r3 = kotlinx.coroutines.channels.BufferedChannel.h.a
            java.lang.String r4 = "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'param')] kotlin.Any?, @[ParameterName(name = 'clauseResult')] kotlin.Any?, kotlin.Any?>{ kotlinx.coroutines.selects.SelectKt.ProcessResultFunction }"
            kotlin.jvm.internal.g0.n(r3, r4)
            java.lang.Object r2 = kotlin.jvm.internal.u0.q(r3, r2)
            kotlin.jvm.functions.Function3 r2 = (kotlin.jvm.functions.Function3) r2
            kotlin.jvm.functions.Function3<kotlinx.coroutines.selects.m<?>, java.lang.Object, java.lang.Object, kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.n1>> r3 = r5.c
            r0.<init>(r5, r1, r2, r3)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String u1() {
            r11 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "S="
            r1.append(r2)
            long r2 = r11.o0()
            r1.append(r2)
            java.lang.String r2 = ",R="
            r1.append(r2)
            long r2 = r11.m0()
            r1.append(r2)
            java.lang.String r2 = ",B="
            r1.append(r2)
            long r2 = r11.e0()
            r1.append(r2)
            java.lang.String r2 = ",B'="
            r1.append(r2)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = kotlinx.coroutines.channels.BufferedChannel.g
            long r2 = r2.get(r11)
            r1.append(r2)
            java.lang.String r2 = ",C="
            r1.append(r2)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = kotlinx.coroutines.channels.BufferedChannel.d
            long r3 = r2.get(r11)
            r5 = 60
            long r3 = r3 >> r5
            int r4 = (int) r3
            r1.append(r4)
            r3 = 44
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            long r1 = r2.get(r11)
            long r1 = r1 >> r5
            int r2 = (int) r1
            r1 = 3
            r4 = 2
            r5 = 1
            if (r2 == r5) goto L76
            if (r2 == r4) goto L70
            if (r2 == r1) goto L6a
            goto L7b
        L6a:
            java.lang.String r2 = "CANCELLED,"
            r0.append(r2)
            goto L7b
        L70:
            java.lang.String r2 = "CLOSED,"
            r0.append(r2)
            goto L7b
        L76:
            java.lang.String r2 = "CANCELLATION_STARTED,"
            r0.append(r2)
        L7b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r6 = "SEND_SEGM="
            r2.append(r6)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = kotlinx.coroutines.channels.BufferedChannel.h
            java.lang.Object r7 = r6.get(r11)
            java.lang.String r7 = kotlinx.coroutines.u0.b(r7)
            r2.append(r7)
            java.lang.String r7 = ",RCV_SEGM="
            r2.append(r7)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = kotlinx.coroutines.channels.BufferedChannel.i
            java.lang.Object r8 = r7.get(r11)
            java.lang.String r8 = kotlinx.coroutines.u0.b(r8)
            r2.append(r8)
            java.lang.String r2 = r2.toString()
            r0.append(r2)
            boolean r2 = r11.B0()
            if (r2 != 0) goto Lcf
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r8 = ",EB_SEGM="
            r2.append(r8)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8 = kotlinx.coroutines.channels.BufferedChannel.j
            java.lang.Object r8 = r8.get(r11)
            java.lang.String r8 = kotlinx.coroutines.u0.b(r8)
            r2.append(r8)
            java.lang.String r2 = r2.toString()
            r0.append(r2)
        Lcf:
            java.lang.String r2 = "  "
            r0.append(r2)
            kotlinx.coroutines.channels.o[] r1 = new kotlinx.coroutines.channels.o[r1]
            java.lang.Object r2 = r7.get(r11)
            r7 = 0
            r1[r7] = r2
            java.lang.Object r2 = r6.get(r11)
            r1[r5] = r2
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = kotlinx.coroutines.channels.BufferedChannel.j
            java.lang.Object r2 = r2.get(r11)
            r1[r4] = r2
            java.util.List r1 = kotlin.collections.f0.Q(r1)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        Lfa:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L111
            java.lang.Object r4 = r1.next()
            r5 = r4
            kotlinx.coroutines.channels.o r5 = (kotlinx.coroutines.channels.o) r5
            kotlinx.coroutines.channels.o r6 = kotlinx.coroutines.channels.i.n()
            if (r5 == r6) goto Lfa
            r2.add(r4)
            goto Lfa
        L111:
            java.util.Iterator r1 = r2.iterator()
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L22c
            java.lang.Object r2 = r1.next()
            boolean r4 = r1.hasNext()
            if (r4 != 0) goto L126
            goto L140
        L126:
            r4 = r2
            kotlinx.coroutines.channels.o r4 = (kotlinx.coroutines.channels.o) r4
            long r4 = r4.c
        L12b:
            java.lang.Object r6 = r1.next()
            r8 = r6
            kotlinx.coroutines.channels.o r8 = (kotlinx.coroutines.channels.o) r8
            long r8 = r8.c
            int r10 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r10 <= 0) goto L13a
            r2 = r6
            r4 = r8
        L13a:
            boolean r6 = r1.hasNext()
            if (r6 != 0) goto L12b
        L140:
            kotlinx.coroutines.channels.o r2 = (kotlinx.coroutines.channels.o) r2
        L142:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = kotlinx.coroutines.u0.b(r2)
            r1.append(r4)
            java.lang.String r4 = "=["
            r1.append(r4)
            boolean r4 = r2.h()
            if (r4 == 0) goto L15c
            java.lang.String r4 = "*"
            goto L15e
        L15c:
            java.lang.String r4 = ""
        L15e:
            r1.append(r4)
            long r4 = r2.c
            r1.append(r4)
            java.lang.String r4 = ",prev="
            r1.append(r4)
            kotlinx.coroutines.internal.g r4 = r2.g()
            kotlinx.coroutines.channels.o r4 = (kotlinx.coroutines.channels.o) r4
            r5 = 0
            if (r4 == 0) goto L179
            java.lang.String r4 = kotlinx.coroutines.u0.b(r4)
            goto L17a
        L179:
            r4 = r5
        L17a:
            r1.append(r4)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            int r1 = kotlinx.coroutines.channels.i.b
            r4 = 0
        L18a:
            if (r4 >= r1) goto L1f9
            java.lang.Object r6 = r2.y(r4)
            java.lang.Object r8 = r2.x(r4)
            boolean r9 = r6 instanceof kotlinx.coroutines.p
            if (r9 == 0) goto L19b
            java.lang.String r6 = "cont"
            goto L1cf
        L19b:
            boolean r9 = r6 instanceof kotlinx.coroutines.selects.m
            if (r9 == 0) goto L1a2
            java.lang.String r6 = "select"
            goto L1cf
        L1a2:
            boolean r9 = r6 instanceof kotlinx.coroutines.channels.a0
            if (r9 == 0) goto L1a9
            java.lang.String r6 = "receiveCatching"
            goto L1cf
        L1a9:
            boolean r9 = r6 instanceof kotlinx.coroutines.channels.BufferedChannel.b
            if (r9 == 0) goto L1b0
            java.lang.String r6 = "send(broadcast)"
            goto L1cf
        L1b0:
            boolean r9 = r6 instanceof kotlinx.coroutines.channels.e0
            if (r9 == 0) goto L1cb
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "EB("
            r9.append(r10)
            r9.append(r6)
            r6 = 41
            r9.append(r6)
            java.lang.String r6 = r9.toString()
            goto L1cf
        L1cb:
            java.lang.String r6 = java.lang.String.valueOf(r6)
        L1cf:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r10 = 91
            r9.append(r10)
            r9.append(r4)
            java.lang.String r10 = "]=("
            r9.append(r10)
            r9.append(r6)
            r9.append(r3)
            r9.append(r8)
            java.lang.String r6 = "),"
            r9.append(r6)
            java.lang.String r6 = r9.toString()
            r0.append(r6)
            int r4 = r4 + 1
            goto L18a
        L1f9:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "next="
            r1.append(r4)
            kotlinx.coroutines.internal.g r4 = r2.e()
            kotlinx.coroutines.channels.o r4 = (kotlinx.coroutines.channels.o) r4
            if (r4 == 0) goto L20f
            java.lang.String r5 = kotlinx.coroutines.u0.b(r4)
        L20f:
            r1.append(r5)
            java.lang.String r4 = "]  "
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            kotlinx.coroutines.internal.g r1 = r2.e()
            r2 = r1
            kotlinx.coroutines.channels.o r2 = (kotlinx.coroutines.channels.o) r2
            if (r2 != 0) goto L142
            java.lang.String r0 = r0.toString()
            return r0
        L22c:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }

    @Override // kotlinx.coroutines.channels.b0
    @org.jetbrains.annotations.NotNull
    public java.lang.Object v() {
            r10 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = kotlinx.coroutines.channels.BufferedChannel.e
            long r0 = r0.get(r10)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = kotlinx.coroutines.channels.BufferedChannel.d
            long r2 = r2.get(r10)
            boolean r4 = r10.w0(r2)
            if (r4 == 0) goto L1d
            kotlinx.coroutines.channels.n$b r0 = kotlinx.coroutines.channels.n.b
            java.lang.Throwable r1 = r10.f0()
            java.lang.Object r0 = r0.a(r1)
            return r0
        L1d:
            r4 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r2 = r2 & r4
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L2e
            kotlinx.coroutines.channels.n$b r0 = kotlinx.coroutines.channels.n.b
            java.lang.Object r0 = r0.b()
            return r0
        L2e:
            kotlinx.coroutines.internal.s0 r6 = kotlinx.coroutines.channels.i.i()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f()
            java.lang.Object r0 = r0.get(r10)
            kotlinx.coroutines.channels.o r0 = (kotlinx.coroutines.channels.o) r0
        L3c:
            boolean r1 = r10.D()
            if (r1 == 0) goto L4d
            kotlinx.coroutines.channels.n$b r0 = kotlinx.coroutines.channels.n.b
            java.lang.Throwable r1 = r10.f0()
            java.lang.Object r0 = r0.a(r1)
            return r0
        L4d:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = g()
            long r4 = r1.getAndIncrement(r10)
            int r1 = kotlinx.coroutines.channels.i.b
            long r2 = (long) r1
            long r2 = r4 / r2
            long r7 = (long) r1
            long r7 = r4 % r7
            int r1 = (int) r7
            long r7 = r0.c
            int r9 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r9 == 0) goto L6e
            kotlinx.coroutines.channels.o r2 = c(r10, r2, r0)
            if (r2 != 0) goto L6b
            goto L3c
        L6b:
            r3 = r1
            r1 = r10
            goto L70
        L6e:
            r2 = r0
            goto L6b
        L70:
            java.lang.Object r0 = J(r1, r2, r3, r4, r6)
            kotlinx.coroutines.internal.s0 r7 = kotlinx.coroutines.channels.i.r()
            if (r0 != r7) goto L94
            boolean r0 = r6 instanceof kotlinx.coroutines.r3
            if (r0 == 0) goto L81
            kotlinx.coroutines.r3 r6 = (kotlinx.coroutines.r3) r6
            goto L82
        L81:
            r6 = 0
        L82:
            if (r6 == 0) goto L87
            s(r10, r6, r2, r3)
        L87:
            r10.G1(r4)
            r2.r()
            kotlinx.coroutines.channels.n$b r0 = kotlinx.coroutines.channels.n.b
            java.lang.Object r0 = r0.b()
            return r0
        L94:
            kotlinx.coroutines.internal.s0 r3 = kotlinx.coroutines.channels.i.h()
            if (r0 != r3) goto La7
            long r7 = r10.o0()
            int r0 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r0 >= 0) goto La5
            r2.b()
        La5:
            r0 = r2
            goto L3c
        La7:
            kotlinx.coroutines.internal.s0 r3 = kotlinx.coroutines.channels.i.s()
            if (r0 == r3) goto Lb7
            r2.b()
            kotlinx.coroutines.channels.n$b r2 = kotlinx.coroutines.channels.n.b
            java.lang.Object r0 = r2.c(r0)
            return r0
        Lb7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "unexpected"
            r0.<init>(r2)
            throw r0
    }

    @Override // kotlinx.coroutines.channels.b0
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @kotlin.ReplaceWith(expression = "receiveCatching().getOrNull()", imports = {}))
    @kotlin.internal.LowPriorityInOverloadResolution
    @org.jetbrains.annotations.Nullable
    public java.lang.Object w(@org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super E> r1) {
            r0 = this;
            java.lang.Object r1 = kotlinx.coroutines.channels.j.a.e(r0, r1)
            return r1
    }

    @Override // kotlinx.coroutines.channels.b0
    @org.jetbrains.annotations.Nullable
    public java.lang.Object x(@org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlinx.coroutines.channels.n<? extends E>> r1) {
            r0 = this;
            java.lang.Object r1 = Z0(r0, r1)
            return r1
    }

    @Override // kotlinx.coroutines.channels.c0
    public boolean z() {
            r2 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = kotlinx.coroutines.channels.BufferedChannel.d
            long r0 = r0.get(r2)
            boolean r0 = r2.y0(r0)
            return r0
    }

    protected boolean z0() {
            r1 = this;
            r0 = 0
            return r0
    }
}
