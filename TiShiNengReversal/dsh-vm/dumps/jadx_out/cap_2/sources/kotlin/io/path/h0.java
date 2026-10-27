package kotlin.io.path;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class h0 implements kotlin.sequences.m<java.nio.file.Path> {

    @org.jetbrains.annotations.NotNull
    private final java.nio.file.Path a;

    @org.jetbrains.annotations.NotNull
    private final kotlin.io.path.PathWalkOption[] b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlin.io.path.PathTreeWalk$bfsIterator$1", f = "PathTreeWalk.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {191, 197}, m = "invokeSuspend", n = {"$this$iterator", "queue", "entriesReader", "pathNode", "this_$iv", "$this$yieldIfNeeded$iv", "node$iv", "entriesReader$iv", "path$iv", "$i$f$yieldIfNeeded", "$this$iterator", "queue", "entriesReader", "pathNode", "this_$iv", "$this$yieldIfNeeded$iv", "node$iv", "entriesReader$iv", "path$iv", "$i$f$yieldIfNeeded"}, nl = {193, 199}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "I$0"}, v = 2)
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nPathTreeWalk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathTreeWalk.kt\nkotlin/io/path/PathTreeWalk$bfsIterator$1\n+ 2 PathTreeWalk.kt\nkotlin/io/path/PathTreeWalk\n*L\n1#1,180:1\n44#2,19:181\n*S KotlinDebug\n*F\n+ 1 PathTreeWalk.kt\nkotlin/io/path/PathTreeWalk$bfsIterator$1\n*L\n101#1:181,19\n*E\n"})
    static final class a extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<kotlin.sequences.o<? super java.nio.file.Path>, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        java.lang.Object a;
        java.lang.Object b;
        java.lang.Object c;
        java.lang.Object d;
        java.lang.Object e;
        java.lang.Object f;
        java.lang.Object g;
        java.lang.Object h;
        int i;
        int j;
        private /* synthetic */ java.lang.Object k;
        final /* synthetic */ kotlin.io.path.h0 l;

        a(kotlin.io.path.h0 r1, kotlin.coroutines.e<? super kotlin.io.path.h0.a> r2) {
                r0 = this;
                r0.l = r1
                r1 = 2
                r0.<init>(r1, r2)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.e<kotlin.n1> create(java.lang.Object r3, kotlin.coroutines.e<?> r4) {
                r2 = this;
                kotlin.io.path.h0$a r0 = new kotlin.io.path.h0$a
                kotlin.io.path.h0 r1 = r2.l
                r0.<init>(r1, r4)
                r0.k = r3
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlin.sequences.o<? super java.nio.file.Path> r1, kotlin.coroutines.e<? super kotlin.n1> r2) {
                r0 = this;
                kotlin.sequences.o r1 = (kotlin.sequences.o) r1
                kotlin.coroutines.e r2 = (kotlin.coroutines.e) r2
                java.lang.Object r1 = r0.invoke2(r1, r2)
                return r1
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final java.lang.Object invoke2(kotlin.sequences.o<? super java.nio.file.Path> r1, kotlin.coroutines.e<? super kotlin.n1> r2) {
                r0 = this;
                kotlin.coroutines.e r1 = r0.create(r1, r2)
                kotlin.io.path.h0$a r1 = (kotlin.io.path.h0.a) r1
                kotlin.n1 r2 = kotlin.n1.a
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
                r11 = this;
                java.lang.Object r0 = r11.k
                kotlin.sequences.o r0 = (kotlin.sequences.o) r0
                java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
                int r2 = r11.j
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L66
                if (r2 == r4) goto L3f
                if (r2 != r3) goto L37
                java.lang.Object r2 = r11.h
                kotlin.io.path.f.a(r2)
                java.lang.Object r2 = r11.g
                kotlin.io.path.i r2 = (kotlin.io.path.i) r2
                java.lang.Object r2 = r11.f
                kotlin.io.path.x r2 = (kotlin.io.path.x) r2
                java.lang.Object r2 = r11.e
                kotlin.sequences.o r2 = (kotlin.sequences.o) r2
                java.lang.Object r2 = r11.d
                kotlin.io.path.h0 r2 = (kotlin.io.path.h0) r2
                java.lang.Object r2 = r11.c
                kotlin.io.path.x r2 = (kotlin.io.path.x) r2
                java.lang.Object r2 = r11.b
                kotlin.io.path.i r2 = (kotlin.io.path.i) r2
                java.lang.Object r5 = r11.a
                kotlin.collections.m r5 = (kotlin.collections.m) r5
                kotlin.g0.n(r12)
                goto L99
            L37:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L3f:
                java.lang.Object r2 = r11.h
                java.nio.file.Path r2 = kotlin.io.path.f.a(r2)
                java.lang.Object r5 = r11.g
                kotlin.io.path.i r5 = (kotlin.io.path.i) r5
                java.lang.Object r6 = r11.f
                kotlin.io.path.x r6 = (kotlin.io.path.x) r6
                java.lang.Object r7 = r11.e
                kotlin.sequences.o r7 = (kotlin.sequences.o) r7
                java.lang.Object r7 = r11.d
                kotlin.io.path.h0 r7 = (kotlin.io.path.h0) r7
                java.lang.Object r8 = r11.c
                kotlin.io.path.x r8 = (kotlin.io.path.x) r8
                java.lang.Object r8 = r11.b
                kotlin.io.path.i r8 = (kotlin.io.path.i) r8
                java.lang.Object r9 = r11.a
                kotlin.collections.m r9 = (kotlin.collections.m) r9
                kotlin.g0.n(r12)
                goto L104
            L66:
                kotlin.g0.n(r12)
                kotlin.collections.m r12 = new kotlin.collections.m
                r12.<init>()
                kotlin.io.path.i r2 = new kotlin.io.path.i
                kotlin.io.path.h0 r5 = r11.l
                boolean r5 = kotlin.io.path.h0.c(r5)
                r2.<init>(r5)
                kotlin.io.path.x r5 = new kotlin.io.path.x
                kotlin.io.path.h0 r6 = r11.l
                java.nio.file.Path r6 = kotlin.io.path.h0.f(r6)
                kotlin.io.path.h0 r7 = r11.l
                java.nio.file.Path r7 = kotlin.io.path.h0.f(r7)
                kotlin.io.path.h0 r8 = r11.l
                java.nio.file.LinkOption[] r8 = kotlin.io.path.h0.e(r8)
                java.lang.Object r7 = kotlin.io.path.j0.b(r7, r8)
                r8 = 0
                r5.<init>(r6, r7, r8)
                r12.addLast(r5)
                r5 = r12
            L99:
                boolean r12 = r5.isEmpty()
                if (r12 != 0) goto L182
                java.lang.Object r12 = r5.removeFirst()
                r6 = r12
                kotlin.io.path.x r6 = (kotlin.io.path.x) r6
                kotlin.io.path.h0 r7 = r11.l
                java.nio.file.Path r12 = r6.d()
                kotlin.io.path.x r8 = r6.c()
                if (r8 == 0) goto Lb5
                kotlin.io.path.y1.O(r12)
            Lb5:
                java.nio.file.LinkOption[] r8 = kotlin.io.path.h0.e(r7)
                int r9 = r8.length
                java.lang.Object[] r8 = java.util.Arrays.copyOf(r8, r9)
                java.nio.file.LinkOption[] r8 = (java.nio.file.LinkOption[]) r8
                int r9 = r8.length
                java.lang.Object[] r8 = java.util.Arrays.copyOf(r8, r9)
                java.nio.file.LinkOption[] r8 = (java.nio.file.LinkOption[]) r8
                boolean r8 = kotlin.io.path.b.a(r12, r8)
                r9 = 0
                if (r8 == 0) goto L139
                boolean r8 = kotlin.io.path.j0.a(r6)
                if (r8 != 0) goto L12d
                boolean r8 = kotlin.io.path.h0.d(r7)
                if (r8 == 0) goto L108
                r11.k = r0
                r11.a = r5
                r11.b = r2
                java.lang.Object r8 = kotlin.coroutines.jvm.internal.j.a(r6)
                r11.c = r8
                r11.d = r7
                java.lang.Object r8 = kotlin.coroutines.jvm.internal.j.a(r0)
                r11.e = r8
                r11.f = r6
                r11.g = r2
                r11.h = r12
                r11.i = r9
                r11.j = r4
                java.lang.Object r8 = r0.c(r12, r11)
                if (r8 != r1) goto L100
                goto L181
            L100:
                r8 = r2
                r9 = r5
                r2 = r12
                r5 = r8
            L104:
                r12 = r2
                r2 = r5
                r5 = r9
                goto L109
            L108:
                r8 = r2
            L109:
                java.nio.file.LinkOption[] r7 = kotlin.io.path.h0.e(r7)
                int r9 = r7.length
                java.lang.Object[] r7 = java.util.Arrays.copyOf(r7, r9)
                java.nio.file.LinkOption[] r7 = (java.nio.file.LinkOption[]) r7
                int r9 = r7.length
                java.lang.Object[] r7 = java.util.Arrays.copyOf(r7, r9)
                java.nio.file.LinkOption[] r7 = (java.nio.file.LinkOption[]) r7
                boolean r12 = kotlin.io.path.b.a(r12, r7)
                if (r12 == 0) goto L12a
                java.util.List r12 = r2.c(r6)
                java.util.Collection r12 = (java.util.Collection) r12
                r5.addAll(r12)
            L12a:
                r2 = r8
                goto L99
            L12d:
                kotlin.io.path.g0.a()
                java.lang.String r12 = r12.toString()
                java.nio.file.FileSystemLoopException r12 = kotlin.io.path.f0.a(r12)
                throw r12
            L139:
                java.nio.file.LinkOption[] r8 = new java.nio.file.LinkOption[r4]
                java.nio.file.LinkOption r10 = com.huawei.secure.android.common.util.b0.a()
                r8[r9] = r10
                java.lang.Object[] r8 = java.util.Arrays.copyOf(r8, r4)
                java.nio.file.LinkOption[] r8 = (java.nio.file.LinkOption[]) r8
                boolean r8 = kotlin.io.path.e0.a(r12, r8)
                if (r8 == 0) goto L99
                r11.k = r0
                r11.a = r5
                r11.b = r2
                java.lang.Object r8 = kotlin.coroutines.jvm.internal.j.a(r6)
                r11.c = r8
                java.lang.Object r7 = kotlin.coroutines.jvm.internal.j.a(r7)
                r11.d = r7
                java.lang.Object r7 = kotlin.coroutines.jvm.internal.j.a(r0)
                r11.e = r7
                java.lang.Object r6 = kotlin.coroutines.jvm.internal.j.a(r6)
                r11.f = r6
                java.lang.Object r6 = kotlin.coroutines.jvm.internal.j.a(r2)
                r11.g = r6
                java.lang.Object r6 = kotlin.coroutines.jvm.internal.j.a(r12)
                r11.h = r6
                r11.i = r9
                r11.j = r3
                java.lang.Object r12 = r0.c(r12, r11)
                if (r12 != r1) goto L99
            L181:
                return r1
            L182:
                kotlin.n1 r12 = kotlin.n1.a
                return r12
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlin.io.path.PathTreeWalk$dfsIterator$1", f = "PathTreeWalk.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3}, l = {191, 197, 210, 216}, m = "invokeSuspend", n = {"$this$iterator", "stack", "entriesReader", "startNode", "this_$iv", "$this$yieldIfNeeded$iv", "node$iv", "entriesReader$iv", "path$iv", "$i$f$yieldIfNeeded", "$this$iterator", "stack", "entriesReader", "startNode", "this_$iv", "$this$yieldIfNeeded$iv", "node$iv", "entriesReader$iv", "path$iv", "$i$f$yieldIfNeeded", "$this$iterator", "stack", "entriesReader", "startNode", "topNode", "topIterator", "pathNode", "this_$iv", "$this$yieldIfNeeded$iv", "node$iv", "entriesReader$iv", "path$iv", "$i$f$yieldIfNeeded", "$this$iterator", "stack", "entriesReader", "startNode", "topNode", "topIterator", "pathNode", "this_$iv", "$this$yieldIfNeeded$iv", "node$iv", "entriesReader$iv", "path$iv", "$i$f$yieldIfNeeded"}, nl = {193, 199, 212, 218}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "I$0"}, v = 2)
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nPathTreeWalk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathTreeWalk.kt\nkotlin/io/path/PathTreeWalk$dfsIterator$1\n+ 2 PathTreeWalk.kt\nkotlin/io/path/PathTreeWalk\n*L\n1#1,180:1\n44#2,19:181\n44#2,19:200\n*S KotlinDebug\n*F\n+ 1 PathTreeWalk.kt\nkotlin/io/path/PathTreeWalk$dfsIterator$1\n*L\n70#1:181,19\n81#1:200,19\n*E\n"})
    static final class b extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<kotlin.sequences.o<? super java.nio.file.Path>, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        java.lang.Object a;
        java.lang.Object b;
        java.lang.Object c;
        java.lang.Object d;
        java.lang.Object e;
        java.lang.Object f;
        java.lang.Object g;
        java.lang.Object h;
        java.lang.Object i;
        java.lang.Object j;
        java.lang.Object k;
        int l;
        int m;
        private /* synthetic */ java.lang.Object n;
        final /* synthetic */ kotlin.io.path.h0 o;

        b(kotlin.io.path.h0 r1, kotlin.coroutines.e<? super kotlin.io.path.h0.b> r2) {
                r0 = this;
                r0.o = r1
                r1 = 2
                r0.<init>(r1, r2)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.e<kotlin.n1> create(java.lang.Object r3, kotlin.coroutines.e<?> r4) {
                r2 = this;
                kotlin.io.path.h0$b r0 = new kotlin.io.path.h0$b
                kotlin.io.path.h0 r1 = r2.o
                r0.<init>(r1, r4)
                r0.n = r3
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlin.sequences.o<? super java.nio.file.Path> r1, kotlin.coroutines.e<? super kotlin.n1> r2) {
                r0 = this;
                kotlin.sequences.o r1 = (kotlin.sequences.o) r1
                kotlin.coroutines.e r2 = (kotlin.coroutines.e) r2
                java.lang.Object r1 = r0.invoke2(r1, r2)
                return r1
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final java.lang.Object invoke2(kotlin.sequences.o<? super java.nio.file.Path> r1, kotlin.coroutines.e<? super kotlin.n1> r2) {
                r0 = this;
                kotlin.coroutines.e r1 = r0.create(r1, r2)
                kotlin.io.path.h0$b r1 = (kotlin.io.path.h0.b) r1
                kotlin.n1 r2 = kotlin.n1.a
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
                r17 = this;
                r0 = r17
                java.lang.Object r1 = r0.n
                kotlin.sequences.o r1 = (kotlin.sequences.o) r1
                java.lang.Object r2 = kotlin.coroutines.intrinsics.a.l()
                int r3 = r0.m
                r4 = 4
                r5 = 3
                r6 = 2
                r7 = 0
                r8 = 1
                if (r3 == 0) goto Lc5
                if (r3 == r8) goto L9e
                if (r3 == r6) goto L78
                if (r3 == r5) goto L45
                if (r3 != r4) goto L3d
                java.lang.Object r3 = r0.k
                kotlin.io.path.f.a(r3)
                java.lang.Object r3 = r0.j
                kotlin.io.path.i r3 = (kotlin.io.path.i) r3
                java.lang.Object r3 = r0.i
                kotlin.io.path.x r3 = (kotlin.io.path.x) r3
                java.lang.Object r3 = r0.h
                kotlin.sequences.o r3 = (kotlin.sequences.o) r3
                java.lang.Object r3 = r0.g
                kotlin.io.path.h0 r3 = (kotlin.io.path.h0) r3
                java.lang.Object r3 = r0.f
                kotlin.io.path.x r3 = (kotlin.io.path.x) r3
                java.lang.Object r3 = r0.e
                java.util.Iterator r3 = (java.util.Iterator) r3
                java.lang.Object r3 = r0.d
                kotlin.io.path.x r3 = (kotlin.io.path.x) r3
                goto L8d
            L3d:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L45:
                java.lang.Object r3 = r0.k
                java.nio.file.Path r3 = kotlin.io.path.f.a(r3)
                java.lang.Object r6 = r0.j
                kotlin.io.path.i r6 = (kotlin.io.path.i) r6
                java.lang.Object r9 = r0.i
                kotlin.io.path.x r9 = (kotlin.io.path.x) r9
                java.lang.Object r10 = r0.h
                kotlin.sequences.o r10 = (kotlin.sequences.o) r10
                java.lang.Object r10 = r0.g
                kotlin.io.path.h0 r10 = (kotlin.io.path.h0) r10
                java.lang.Object r11 = r0.f
                kotlin.io.path.x r11 = (kotlin.io.path.x) r11
                java.lang.Object r12 = r0.e
                java.util.Iterator r12 = (java.util.Iterator) r12
                java.lang.Object r12 = r0.d
                kotlin.io.path.x r12 = (kotlin.io.path.x) r12
                java.lang.Object r12 = r0.c
                kotlin.io.path.x r12 = (kotlin.io.path.x) r12
                java.lang.Object r13 = r0.b
                kotlin.io.path.i r13 = (kotlin.io.path.i) r13
                java.lang.Object r14 = r0.a
                kotlin.collections.m r14 = (kotlin.collections.m) r14
                kotlin.g0.n(r18)
                goto L26b
            L78:
                java.lang.Object r3 = r0.h
                kotlin.io.path.f.a(r3)
                java.lang.Object r3 = r0.g
                kotlin.io.path.i r3 = (kotlin.io.path.i) r3
                java.lang.Object r3 = r0.f
                kotlin.io.path.x r3 = (kotlin.io.path.x) r3
                java.lang.Object r3 = r0.e
                kotlin.sequences.o r3 = (kotlin.sequences.o) r3
                java.lang.Object r3 = r0.d
                kotlin.io.path.h0 r3 = (kotlin.io.path.h0) r3
            L8d:
                java.lang.Object r3 = r0.c
                kotlin.io.path.x r3 = (kotlin.io.path.x) r3
                java.lang.Object r6 = r0.b
                kotlin.io.path.i r6 = (kotlin.io.path.i) r6
                java.lang.Object r9 = r0.a
                kotlin.collections.m r9 = (kotlin.collections.m) r9
                kotlin.g0.n(r18)
                goto L1de
            L9e:
                java.lang.Object r3 = r0.h
                java.nio.file.Path r3 = kotlin.io.path.f.a(r3)
                java.lang.Object r6 = r0.g
                kotlin.io.path.i r6 = (kotlin.io.path.i) r6
                java.lang.Object r9 = r0.f
                kotlin.io.path.x r9 = (kotlin.io.path.x) r9
                java.lang.Object r10 = r0.e
                kotlin.sequences.o r10 = (kotlin.sequences.o) r10
                java.lang.Object r10 = r0.d
                kotlin.io.path.h0 r10 = (kotlin.io.path.h0) r10
                java.lang.Object r11 = r0.c
                kotlin.io.path.x r11 = (kotlin.io.path.x) r11
                java.lang.Object r12 = r0.b
                kotlin.io.path.i r12 = (kotlin.io.path.i) r12
                java.lang.Object r13 = r0.a
                kotlin.collections.m r13 = (kotlin.collections.m) r13
                kotlin.g0.n(r18)
                goto L150
            Lc5:
                kotlin.g0.n(r18)
                kotlin.collections.m r9 = new kotlin.collections.m
                r9.<init>()
                kotlin.io.path.i r3 = new kotlin.io.path.i
                kotlin.io.path.h0 r10 = r0.o
                boolean r10 = kotlin.io.path.h0.c(r10)
                r3.<init>(r10)
                kotlin.io.path.x r10 = new kotlin.io.path.x
                kotlin.io.path.h0 r11 = r0.o
                java.nio.file.Path r11 = kotlin.io.path.h0.f(r11)
                kotlin.io.path.h0 r12 = r0.o
                java.nio.file.Path r12 = kotlin.io.path.h0.f(r12)
                kotlin.io.path.h0 r13 = r0.o
                java.nio.file.LinkOption[] r13 = kotlin.io.path.h0.e(r13)
                java.lang.Object r12 = kotlin.io.path.j0.b(r12, r13)
                r13 = 0
                r10.<init>(r11, r12, r13)
                kotlin.io.path.h0 r11 = r0.o
                java.nio.file.Path r12 = r10.d()
                kotlin.io.path.x r13 = r10.c()
                if (r13 == 0) goto L103
                kotlin.io.path.y1.O(r12)
            L103:
                java.nio.file.LinkOption[] r13 = kotlin.io.path.h0.e(r11)
                int r14 = r13.length
                java.lang.Object[] r13 = java.util.Arrays.copyOf(r13, r14)
                java.nio.file.LinkOption[] r13 = (java.nio.file.LinkOption[]) r13
                int r14 = r13.length
                java.lang.Object[] r13 = java.util.Arrays.copyOf(r13, r14)
                java.nio.file.LinkOption[] r13 = (java.nio.file.LinkOption[]) r13
                boolean r13 = kotlin.io.path.b.a(r12, r13)
                if (r13 == 0) goto L192
                boolean r6 = kotlin.io.path.j0.a(r10)
                if (r6 != 0) goto L186
                boolean r6 = kotlin.io.path.h0.d(r11)
                if (r6 == 0) goto L159
                r0.n = r1
                r0.a = r9
                r0.b = r3
                r0.c = r10
                r0.d = r11
                java.lang.Object r6 = kotlin.coroutines.jvm.internal.j.a(r1)
                r0.e = r6
                r0.f = r10
                r0.g = r3
                r0.h = r12
                r0.l = r7
                r0.m = r8
                java.lang.Object r6 = r1.c(r12, r0)
                if (r6 != r2) goto L149
                goto L307
            L149:
                r6 = r3
                r13 = r9
                r9 = r10
                r10 = r11
                r3 = r12
                r12 = r6
                r11 = r9
            L150:
                r16 = r13
                r13 = r3
                r3 = r6
                r6 = r10
                r10 = r9
                r9 = r16
                goto L15d
            L159:
                r6 = r11
                r13 = r12
                r12 = r3
                r11 = r10
            L15d:
                java.nio.file.LinkOption[] r6 = kotlin.io.path.h0.e(r6)
                int r14 = r6.length
                java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r14)
                java.nio.file.LinkOption[] r6 = (java.nio.file.LinkOption[]) r6
                int r14 = r6.length
                java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r14)
                java.nio.file.LinkOption[] r6 = (java.nio.file.LinkOption[]) r6
                boolean r6 = kotlin.io.path.b.a(r13, r6)
                if (r6 == 0) goto L183
                java.util.List r3 = r3.c(r10)
                java.util.Iterator r3 = r3.iterator()
                r11.e(r3)
                r9.addLast(r11)
            L183:
                r3 = r11
                r6 = r12
                goto L1de
            L186:
                kotlin.io.path.g0.a()
                java.lang.String r1 = r12.toString()
                java.nio.file.FileSystemLoopException r1 = kotlin.io.path.f0.a(r1)
                throw r1
            L192:
                java.nio.file.LinkOption[] r13 = new java.nio.file.LinkOption[r8]
                java.nio.file.LinkOption r14 = com.huawei.secure.android.common.util.b0.a()
                r13[r7] = r14
                java.lang.Object[] r13 = java.util.Arrays.copyOf(r13, r8)
                java.nio.file.LinkOption[] r13 = (java.nio.file.LinkOption[]) r13
                boolean r13 = kotlin.io.path.e0.a(r12, r13)
                if (r13 == 0) goto L1dc
                r0.n = r1
                r0.a = r9
                r0.b = r3
                java.lang.Object r13 = kotlin.coroutines.jvm.internal.j.a(r10)
                r0.c = r13
                java.lang.Object r11 = kotlin.coroutines.jvm.internal.j.a(r11)
                r0.d = r11
                java.lang.Object r11 = kotlin.coroutines.jvm.internal.j.a(r1)
                r0.e = r11
                java.lang.Object r11 = kotlin.coroutines.jvm.internal.j.a(r10)
                r0.f = r11
                java.lang.Object r11 = kotlin.coroutines.jvm.internal.j.a(r3)
                r0.g = r11
                java.lang.Object r11 = kotlin.coroutines.jvm.internal.j.a(r12)
                r0.h = r11
                r0.l = r7
                r0.m = r6
                java.lang.Object r6 = r1.c(r12, r0)
                if (r6 != r2) goto L1dc
                goto L307
            L1dc:
                r6 = r3
                r3 = r10
            L1de:
                boolean r10 = r9.isEmpty()
                if (r10 != 0) goto L30d
                java.lang.Object r10 = r9.last()
                kotlin.io.path.x r10 = (kotlin.io.path.x) r10
                java.util.Iterator r11 = r10.a()
                kotlin.jvm.internal.g0.m(r11)
                boolean r12 = r11.hasNext()
                if (r12 == 0) goto L308
                java.lang.Object r12 = r11.next()
                kotlin.io.path.x r12 = (kotlin.io.path.x) r12
                kotlin.io.path.h0 r13 = r0.o
                java.nio.file.Path r14 = r12.d()
                kotlin.io.path.x r15 = r12.c()
                if (r15 == 0) goto L20c
                kotlin.io.path.y1.O(r14)
            L20c:
                java.nio.file.LinkOption[] r15 = kotlin.io.path.h0.e(r13)
                int r4 = r15.length
                java.lang.Object[] r4 = java.util.Arrays.copyOf(r15, r4)
                java.nio.file.LinkOption[] r4 = (java.nio.file.LinkOption[]) r4
                int r15 = r4.length
                java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r15)
                java.nio.file.LinkOption[] r4 = (java.nio.file.LinkOption[]) r4
                boolean r4 = kotlin.io.path.b.a(r14, r4)
                if (r4 == 0) goto L2ac
                boolean r4 = kotlin.io.path.j0.a(r12)
                if (r4 != 0) goto L2a0
                boolean r4 = kotlin.io.path.h0.d(r13)
                if (r4 == 0) goto L273
                r0.n = r1
                r0.a = r9
                r0.b = r6
                java.lang.Object r4 = kotlin.coroutines.jvm.internal.j.a(r3)
                r0.c = r4
                java.lang.Object r4 = kotlin.coroutines.jvm.internal.j.a(r10)
                r0.d = r4
                java.lang.Object r4 = kotlin.coroutines.jvm.internal.j.a(r11)
                r0.e = r4
                r0.f = r12
                r0.g = r13
                java.lang.Object r4 = kotlin.coroutines.jvm.internal.j.a(r1)
                r0.h = r4
                r0.i = r12
                r0.j = r6
                r0.k = r14
                r0.l = r7
                r0.m = r5
                java.lang.Object r4 = r1.c(r14, r0)
                if (r4 != r2) goto L264
                goto L307
            L264:
                r11 = r12
                r10 = r13
                r12 = r3
                r13 = r6
                r3 = r14
                r14 = r9
                r9 = r11
            L26b:
                r16 = r14
                r14 = r3
                r3 = r12
                r12 = r9
                r9 = r16
                goto L276
            L273:
                r11 = r12
                r10 = r13
                r13 = r6
            L276:
                java.nio.file.LinkOption[] r4 = kotlin.io.path.h0.e(r10)
                int r10 = r4.length
                java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r10)
                java.nio.file.LinkOption[] r4 = (java.nio.file.LinkOption[]) r4
                int r10 = r4.length
                java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r10)
                java.nio.file.LinkOption[] r4 = (java.nio.file.LinkOption[]) r4
                boolean r4 = kotlin.io.path.b.a(r14, r4)
                if (r4 == 0) goto L29c
                java.util.List r4 = r6.c(r12)
                java.util.Iterator r4 = r4.iterator()
                r11.e(r4)
                r9.addLast(r11)
            L29c:
                r6 = r13
            L29d:
                r4 = 4
                goto L1de
            L2a0:
                kotlin.io.path.g0.a()
                java.lang.String r1 = r14.toString()
                java.nio.file.FileSystemLoopException r1 = kotlin.io.path.f0.a(r1)
                throw r1
            L2ac:
                java.nio.file.LinkOption[] r4 = new java.nio.file.LinkOption[r8]
                java.nio.file.LinkOption r15 = com.huawei.secure.android.common.util.b0.a()
                r4[r7] = r15
                java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r8)
                java.nio.file.LinkOption[] r4 = (java.nio.file.LinkOption[]) r4
                boolean r4 = kotlin.io.path.e0.a(r14, r4)
                if (r4 == 0) goto L29d
                r0.n = r1
                r0.a = r9
                r0.b = r6
                java.lang.Object r4 = kotlin.coroutines.jvm.internal.j.a(r3)
                r0.c = r4
                java.lang.Object r4 = kotlin.coroutines.jvm.internal.j.a(r10)
                r0.d = r4
                java.lang.Object r4 = kotlin.coroutines.jvm.internal.j.a(r11)
                r0.e = r4
                java.lang.Object r4 = kotlin.coroutines.jvm.internal.j.a(r12)
                r0.f = r4
                java.lang.Object r4 = kotlin.coroutines.jvm.internal.j.a(r13)
                r0.g = r4
                java.lang.Object r4 = kotlin.coroutines.jvm.internal.j.a(r1)
                r0.h = r4
                java.lang.Object r4 = kotlin.coroutines.jvm.internal.j.a(r12)
                r0.i = r4
                java.lang.Object r4 = kotlin.coroutines.jvm.internal.j.a(r6)
                r0.j = r4
                java.lang.Object r4 = kotlin.coroutines.jvm.internal.j.a(r14)
                r0.k = r4
                r0.l = r7
                r4 = 4
                r0.m = r4
                java.lang.Object r10 = r1.c(r14, r0)
                if (r10 != r2) goto L1de
            L307:
                return r2
            L308:
                r9.removeLast()
                goto L1de
            L30d:
                kotlin.n1 r1 = kotlin.n1.a
                return r1
        }
    }

    public h0(@org.jetbrains.annotations.NotNull java.nio.file.Path r2, @org.jetbrains.annotations.NotNull kotlin.io.path.PathWalkOption[] r3) {
            r1 = this;
            java.lang.String r0 = "start"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "options"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.<init>()
            r1.a = r2
            r1.b = r3
            return
    }

    public static final /* synthetic */ boolean c(kotlin.io.path.h0 r0) {
            boolean r0 = r0.i()
            return r0
    }

    public static final /* synthetic */ boolean d(kotlin.io.path.h0 r0) {
            boolean r0 = r0.j()
            return r0
    }

    public static final /* synthetic */ java.nio.file.LinkOption[] e(kotlin.io.path.h0 r0) {
            java.nio.file.LinkOption[] r0 = r0.k()
            return r0
    }

    public static final /* synthetic */ java.nio.file.Path f(kotlin.io.path.h0 r0) {
            java.nio.file.Path r0 = r0.a
            return r0
    }

    private final java.util.Iterator<java.nio.file.Path> g() {
            r2 = this;
            kotlin.io.path.h0$a r0 = new kotlin.io.path.h0$a
            r1 = 0
            r0.<init>(r2, r1)
            java.util.Iterator r0 = kotlin.sequences.p.a(r0)
            return r0
    }

    private final java.util.Iterator<java.nio.file.Path> h() {
            r2 = this;
            kotlin.io.path.h0$b r0 = new kotlin.io.path.h0$b
            r1 = 0
            r0.<init>(r2, r1)
            java.util.Iterator r0 = kotlin.sequences.p.a(r0)
            return r0
    }

    private final boolean i() {
            r2 = this;
            kotlin.io.path.PathWalkOption[] r0 = r2.b
            kotlin.io.path.PathWalkOption r1 = kotlin.io.path.PathWalkOption.FOLLOW_LINKS
            boolean r0 = kotlin.collections.n.B8(r0, r1)
            return r0
    }

    private final boolean j() {
            r2 = this;
            kotlin.io.path.PathWalkOption[] r0 = r2.b
            kotlin.io.path.PathWalkOption r1 = kotlin.io.path.PathWalkOption.INCLUDE_DIRECTORIES
            boolean r0 = kotlin.collections.n.B8(r0, r1)
            return r0
    }

    private final java.nio.file.LinkOption[] k() {
            r2 = this;
            kotlin.io.path.w r0 = kotlin.io.path.w.a
            boolean r1 = r2.i()
            java.nio.file.LinkOption[] r0 = r0.a(r1)
            return r0
    }

    private final boolean l() {
            r2 = this;
            kotlin.io.path.PathWalkOption[] r0 = r2.b
            kotlin.io.path.PathWalkOption r1 = kotlin.io.path.PathWalkOption.BREADTH_FIRST
            boolean r0 = kotlin.collections.n.B8(r0, r1)
            return r0
    }

    private final java.lang.Object m(kotlin.sequences.o<? super java.nio.file.Path> r5, kotlin.io.path.x r6, kotlin.io.path.i r7, kotlin.jvm.functions.Function1<? super java.util.List<kotlin.io.path.x>, kotlin.n1> r8, kotlin.coroutines.e<? super kotlin.n1> r9) {
            r4 = this;
            java.nio.file.Path r0 = r6.d()
            kotlin.io.path.x r1 = r6.c()
            if (r1 == 0) goto Ld
            kotlin.io.path.y1.O(r0)
        Ld:
            java.nio.file.LinkOption[] r1 = e(r4)
            int r2 = r1.length
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r2)
            java.nio.file.LinkOption[] r1 = (java.nio.file.LinkOption[]) r1
            int r2 = r1.length
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r2)
            java.nio.file.LinkOption[] r1 = (java.nio.file.LinkOption[]) r1
            boolean r1 = kotlin.io.path.b.a(r0, r1)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L68
            boolean r1 = kotlin.io.path.j0.a(r6)
            if (r1 != 0) goto L5c
            boolean r1 = d(r4)
            if (r1 == 0) goto L3c
            kotlin.jvm.internal.d0.e(r3)
            r5.c(r0, r9)
            kotlin.jvm.internal.d0.e(r2)
        L3c:
            java.nio.file.LinkOption[] r5 = e(r4)
            int r9 = r5.length
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r9)
            java.nio.file.LinkOption[] r5 = (java.nio.file.LinkOption[]) r5
            int r9 = r5.length
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r9)
            java.nio.file.LinkOption[] r5 = (java.nio.file.LinkOption[]) r5
            boolean r5 = kotlin.io.path.b.a(r0, r5)
            if (r5 == 0) goto L88
            java.util.List r5 = r7.c(r6)
            r8.invoke(r5)
            goto L88
        L5c:
            kotlin.io.path.g0.a()
            java.lang.String r5 = r0.toString()
            java.nio.file.FileSystemLoopException r5 = kotlin.io.path.f0.a(r5)
            throw r5
        L68:
            java.nio.file.LinkOption[] r6 = new java.nio.file.LinkOption[r2]
            java.nio.file.LinkOption r7 = com.huawei.secure.android.common.util.b0.a()
            r6[r3] = r7
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r2)
            java.nio.file.LinkOption[] r6 = (java.nio.file.LinkOption[]) r6
            boolean r6 = kotlin.io.path.e0.a(r0, r6)
            if (r6 == 0) goto L88
            kotlin.jvm.internal.d0.e(r3)
            r5.c(r0, r9)
            kotlin.jvm.internal.d0.e(r2)
            kotlin.n1 r5 = kotlin.n1.a
            return r5
        L88:
            kotlin.n1 r5 = kotlin.n1.a
            return r5
    }

    @Override // kotlin.sequences.m
    @org.jetbrains.annotations.NotNull
    public java.util.Iterator<java.nio.file.Path> iterator() {
            r1 = this;
            boolean r0 = r1.l()
            if (r0 == 0) goto Lb
            java.util.Iterator r0 = r1.g()
            return r0
        Lb:
            java.util.Iterator r0 = r1.h()
            return r0
    }
}
