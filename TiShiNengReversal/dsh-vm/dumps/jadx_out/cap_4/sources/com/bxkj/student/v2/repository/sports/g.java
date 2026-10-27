package com.bxkj.student.v2.repository.sports;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nSportsRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportsRepository.kt\ncom/bxkj/student/v2/repository/sports/SportsRepository\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,190:1\n1788#2,4:191\n1788#2,4:195\n1788#2,4:199\n1#3:203\n*S KotlinDebug\n*F\n+ 1 SportsRepository.kt\ncom/bxkj/student/v2/repository/sports/SportsRepository\n*L\n86#1:191,4\n87#1:195,4\n88#1:199,4\n*E\n"})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class g {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.student.v2.repository.sports.SportsRepository", f = "SportsRepository.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3}, l = {97, 111, 116, 133}, m = "commitV3_2", n = {"sportRange", "speed", "avgSpeed", "brand", "model", "system", "version", "appVersion", "pointList", "stepNumbers", "isSequencePoint", "gitudeLatitude", "okPointList", "isFaceStatus", "uploadType", "identify", "geofence", "limitSpeed", "limitStride", "limitStepFrequency", "gpsDistance", "isRunningOpenDevelop", "paramMap", "latLngList", "f", "m", "h", "d", "sportType", "startTime", "endTime", "sportTime", "isOpenDevelopInStart", "sportRange", "speed", "avgSpeed", "brand", "model", "system", "version", "appVersion", "pointList", "stepNumbers", "isSequencePoint", "gitudeLatitude", "okPointList", "isFaceStatus", "uploadType", "identify", "geofence", "limitSpeed", "limitStride", "limitStepFrequency", "gpsDistance", "isRunningOpenDevelop", "paramMap", "latLngList", "f", "m", "h", "d", "it", "sportType", "startTime", "endTime", "sportTime", "isOpenDevelopInStart", "$i$a$-let-SportsRepository$commitV3_2$7", "sportRange", "speed", "avgSpeed", "brand", "model", "system", "version", "appVersion", "pointList", "stepNumbers", "isSequencePoint", "gitudeLatitude", "okPointList", "isFaceStatus", "uploadType", "identify", "geofence", "limitSpeed", "limitStride", "limitStepFrequency", "gpsDistance", "isRunningOpenDevelop", "paramMap", "latLngList", "f", "m", "h", "d", "it", "sportType", "startTime", "endTime", "sportTime", "isOpenDevelopInStart", "$i$a$-let-SportsRepository$commitV3_2$9", "sportRange", "speed", "avgSpeed", "brand", "model", "system", "version", "appVersion", "pointList", "stepNumbers", "isSequencePoint", "gitudeLatitude", "okPointList", "isFaceStatus", "uploadType", "identify", "geofence", "limitSpeed", "limitStride", "limitStepFrequency", "gpsDistance", "isRunningOpenDevelop", "paramMap", "latLngList", "f", "m", "h", "d", "jsonParam", "timestamp", "aesEncrypt", "key", "data", "sportType", "startTime", "endTime", "sportTime", "isOpenDevelopInStart"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "L$12", "L$13", "L$14", "L$15", "L$16", "L$17", "L$18", "L$19", "L$20", "L$21", "L$22", "L$23", "L$24", "L$25", "L$26", "L$27", "I$0", "J$0", "J$1", "J$2", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "L$12", "L$13", "L$14", "L$15", "L$16", "L$17", "L$18", "L$19", "L$20", "L$21", "L$22", "L$23", "L$24", "L$25", "L$26", "L$27", "L$28", "I$0", "J$0", "J$1", "J$2", "Z$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "L$12", "L$13", "L$14", "L$15", "L$16", "L$17", "L$18", "L$19", "L$20", "L$21", "L$22", "L$23", "L$24", "L$25", "L$26", "L$27", "L$28", "I$0", "J$0", "J$1", "J$2", "Z$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "L$12", "L$13", "L$14", "L$15", "L$16", "L$17", "L$18", "L$19", "L$20", "L$21", "L$22", "L$23", "L$24", "L$25", "L$26", "L$27", "L$28", "L$29", "L$30", "L$31", "L$32", "I$0", "J$0", "J$1", "J$2", "Z$0"})
    static final class a extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object A;
        java.lang.Object B;
        java.lang.Object C;
        java.lang.Object D;
        java.lang.Object E;
        java.lang.Object F;
        java.lang.Object G;
        java.lang.Object H;
        java.lang.Object I;
        java.lang.Object J;
        java.lang.Object K;
        java.lang.Object L;
        boolean M;
        /* synthetic */ java.lang.Object N;
        final /* synthetic */ com.bxkj.student.v2.repository.sports.g O;
        int P;
        int a;
        int b;
        long c;
        long d;
        long e;
        java.lang.Object f;
        java.lang.Object g;
        java.lang.Object h;
        java.lang.Object i;
        java.lang.Object j;
        java.lang.Object k;

        /* renamed from: l, reason: collision with root package name */
        java.lang.Object f1401l;

        /* renamed from: m, reason: collision with root package name */
        java.lang.Object f1402m;

        /* renamed from: n, reason: collision with root package name */
        java.lang.Object f1403n;

        /* renamed from: o, reason: collision with root package name */
        java.lang.Object f1404o;

        /* renamed from: p, reason: collision with root package name */
        java.lang.Object f1405p;

        /* renamed from: q, reason: collision with root package name */
        java.lang.Object f1406q;

        /* renamed from: r, reason: collision with root package name */
        java.lang.Object f1407r;

        /* renamed from: s, reason: collision with root package name */
        java.lang.Object f1408s;

        /* renamed from: t, reason: collision with root package name */
        java.lang.Object f1409t;

        /* renamed from: u, reason: collision with root package name */
        java.lang.Object f1410u;

        /* renamed from: v, reason: collision with root package name */
        java.lang.Object f1411v;

        /* renamed from: w, reason: collision with root package name */
        java.lang.Object f1412w;

        /* renamed from: x, reason: collision with root package name */
        java.lang.Object f1413x;

        /* renamed from: y, reason: collision with root package name */
        java.lang.Object f1414y;

        /* renamed from: z, reason: collision with root package name */
        java.lang.Object f1415z;

        a(com.bxkj.student.v2.repository.sports.g r1, kotlin.coroutines.e<? super com.bxkj.student.v2.repository.sports.g.a> r2) {
                r0 = this;
                r0.O = r1
                r0.<init>(r2)
                return
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r34) {
                r33 = this;
                r0 = r33
                r1 = r34
                r0.N = r1
                int r1 = r0.P
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r1 = r1 | r2
                r0.P = r1
                com.bxkj.student.v2.repository.sports.g r1 = r0.O
                r30 = 0
                r31 = 0
                r2 = 0
                r3 = 0
                r5 = 0
                r7 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = 0
                r13 = 0
                r14 = 0
                r15 = 0
                r16 = 0
                r17 = 0
                r18 = 0
                r19 = 0
                r20 = 0
                r21 = 0
                r22 = 0
                r23 = 0
                r24 = 0
                r25 = 0
                r26 = 0
                r27 = 0
                r28 = 0
                r29 = 0
                r32 = r0
                java.lang.Object r0 = r1.a(r2, r3, r5, r7, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.student.v2.repository.sports.SportsRepository", f = "SportsRepository.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {186}, m = "passPointCameraV2", n = {"identify", "remark", "file", "paramMap", "timestamp", "aesEncrypt", "key", "data", "requestBody"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8"})
    static final class b extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object a;
        java.lang.Object b;
        java.lang.Object c;
        java.lang.Object d;
        java.lang.Object e;
        java.lang.Object f;
        java.lang.Object g;
        java.lang.Object h;
        java.lang.Object i;
        /* synthetic */ java.lang.Object j;
        final /* synthetic */ com.bxkj.student.v2.repository.sports.g k;

        /* renamed from: l, reason: collision with root package name */
        int f1416l;

        b(com.bxkj.student.v2.repository.sports.g r1, kotlin.coroutines.e<? super com.bxkj.student.v2.repository.sports.g.b> r2) {
                r0 = this;
                r0.k = r1
                r0.<init>(r2)
                return
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
                r1 = this;
                r1.j = r2
                int r2 = r1.f1416l
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r2 | r0
                r1.f1416l = r2
                com.bxkj.student.v2.repository.sports.g r2 = r1.k
                r0 = 0
                java.lang.Object r2 = r2.d(r0, r0, r0, r1)
                return r2
        }
    }

    public g() {
            r0 = this;
            r0.<init>()
            return
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object a(int r50, long r51, long r53, long r55, @org.jetbrains.annotations.Nullable java.lang.String r57, @org.jetbrains.annotations.Nullable java.lang.String r58, @org.jetbrains.annotations.Nullable java.lang.String r59, @org.jetbrains.annotations.Nullable java.lang.String r60, @org.jetbrains.annotations.Nullable java.lang.String r61, @org.jetbrains.annotations.Nullable java.lang.String r62, @org.jetbrains.annotations.Nullable java.lang.String r63, @org.jetbrains.annotations.Nullable java.lang.String r64, @org.jetbrains.annotations.Nullable java.lang.String r65, @org.jetbrains.annotations.Nullable java.lang.String r66, @org.jetbrains.annotations.Nullable java.lang.String r67, @org.jetbrains.annotations.Nullable java.lang.String r68, @org.jetbrains.annotations.Nullable java.lang.String r69, @org.jetbrains.annotations.Nullable java.lang.String r70, @org.jetbrains.annotations.Nullable java.lang.Integer r71, @org.jetbrains.annotations.Nullable java.lang.String r72, @org.jetbrains.annotations.Nullable java.lang.String r73, @org.jetbrains.annotations.Nullable java.lang.String r74, @org.jetbrains.annotations.Nullable java.lang.String r75, @org.jetbrains.annotations.Nullable java.lang.String r76, @org.jetbrains.annotations.Nullable java.lang.String r77, boolean r78, @org.jetbrains.annotations.Nullable java.lang.String r79, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super com.bxkj.student.v2.common.data.CommitResult<java.lang.Object>> r80) {
            r49 = this;
            r1 = r68
            r2 = r72
            r3 = r78
            r0 = r80
            boolean r4 = r0 instanceof com.bxkj.student.v2.repository.sports.g.a
            if (r4 == 0) goto L1d
            r4 = r0
            com.bxkj.student.v2.repository.sports.g$a r4 = (com.bxkj.student.v2.repository.sports.g.a) r4
            int r5 = r4.P
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L1d
            int r5 = r5 - r6
            r4.P = r5
            r5 = r49
            goto L24
        L1d:
            com.bxkj.student.v2.repository.sports.g$a r4 = new com.bxkj.student.v2.repository.sports.g$a
            r5 = r49
            r4.<init>(r5, r0)
        L24:
            java.lang.Object r0 = r4.N
            java.lang.Object r6 = kotlin.coroutines.intrinsics.a.l()
            int r7 = r4.P
            r8 = 4
            r9 = 3
            r10 = 2
            r12 = 1
            if (r7 == 0) goto L36c
            if (r7 == r12) goto L29c
            if (r7 == r10) goto L184
            if (r7 == r9) goto Lca
            if (r7 != r8) goto Lc2
            java.lang.Object r1 = r4.L
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r4.K
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r4.J
            java.lang.String[] r1 = (java.lang.String[]) r1
            java.lang.Object r1 = r4.I
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r4.H
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r4.G
            kotlin.jvm.internal.Ref$IntRef r1 = (kotlin.jvm.internal.Ref.IntRef) r1
            java.lang.Object r1 = r4.F
            java.lang.Integer r1 = (java.lang.Integer) r1
            java.lang.Object r1 = r4.E
            java.lang.Integer r1 = (java.lang.Integer) r1
            java.lang.Object r1 = r4.D
            java.lang.Integer r1 = (java.lang.Integer) r1
            java.lang.Object r1 = r4.C
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r1 = r4.B
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Object r1 = r4.A
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r4.f1415z
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r4.f1414y
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r4.f1413x
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r4.f1412w
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r4.f1411v
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r4.f1410u
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r4.f1409t
            java.lang.Integer r1 = (java.lang.Integer) r1
            java.lang.Object r1 = r4.f1408s
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r4.f1407r
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r4.f1406q
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r4.f1405p
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r4.f1404o
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r4.f1403n
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r4.f1402m
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r4.f1401l
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r4.k
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r4.j
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r4.i
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r4.h
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r4.g
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r4.f
            java.lang.String r1 = (java.lang.String) r1
            kotlin.g0.n(r0)
            return r0
        Lc2:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        Lca:
            boolean r1 = r4.M
            long r2 = r4.e
            long r14 = r4.d
            long r8 = r4.c
            int r7 = r4.a
            java.lang.Object r11 = r4.H
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r11 = r4.G
            kotlin.jvm.internal.Ref$IntRef r11 = (kotlin.jvm.internal.Ref.IntRef) r11
            java.lang.Object r10 = r4.F
            java.lang.Integer r10 = (java.lang.Integer) r10
            java.lang.Object r13 = r4.E
            java.lang.Integer r13 = (java.lang.Integer) r13
            java.lang.Object r12 = r4.D
            java.lang.Integer r12 = (java.lang.Integer) r12
            r19 = r0
            java.lang.Object r0 = r4.C
            r20 = r0
            java.util.List r20 = (java.util.List) r20
            java.lang.Object r0 = r4.B
            r21 = r0
            java.util.Map r21 = (java.util.Map) r21
            java.lang.Object r0 = r4.A
            r22 = r0
            java.lang.String r22 = (java.lang.String) r22
            java.lang.Object r0 = r4.f1415z
            r23 = r0
            java.lang.String r23 = (java.lang.String) r23
            java.lang.Object r0 = r4.f1414y
            r24 = r0
            java.lang.String r24 = (java.lang.String) r24
            java.lang.Object r0 = r4.f1413x
            r25 = r0
            java.lang.String r25 = (java.lang.String) r25
            java.lang.Object r0 = r4.f1412w
            r26 = r0
            java.lang.String r26 = (java.lang.String) r26
            java.lang.Object r0 = r4.f1411v
            r27 = r0
            java.lang.String r27 = (java.lang.String) r27
            java.lang.Object r0 = r4.f1410u
            r28 = r0
            java.lang.String r28 = (java.lang.String) r28
            java.lang.Object r0 = r4.f1409t
            r29 = r0
            java.lang.Integer r29 = (java.lang.Integer) r29
            java.lang.Object r0 = r4.f1408s
            r30 = r0
            java.lang.String r30 = (java.lang.String) r30
            java.lang.Object r0 = r4.f1407r
            r31 = r0
            java.lang.String r31 = (java.lang.String) r31
            java.lang.Object r0 = r4.f1406q
            r32 = r0
            java.lang.String r32 = (java.lang.String) r32
            java.lang.Object r0 = r4.f1405p
            r33 = r0
            java.lang.String r33 = (java.lang.String) r33
            java.lang.Object r0 = r4.f1404o
            r34 = r0
            java.lang.String r34 = (java.lang.String) r34
            java.lang.Object r0 = r4.f1403n
            r35 = r0
            java.lang.String r35 = (java.lang.String) r35
            java.lang.Object r0 = r4.f1402m
            r36 = r0
            java.lang.String r36 = (java.lang.String) r36
            java.lang.Object r0 = r4.f1401l
            r37 = r0
            java.lang.String r37 = (java.lang.String) r37
            java.lang.Object r0 = r4.k
            r38 = r0
            java.lang.String r38 = (java.lang.String) r38
            java.lang.Object r0 = r4.j
            r39 = r0
            java.lang.String r39 = (java.lang.String) r39
            java.lang.Object r0 = r4.i
            r40 = r0
            java.lang.String r40 = (java.lang.String) r40
            java.lang.Object r0 = r4.h
            r41 = r0
            java.lang.String r41 = (java.lang.String) r41
            java.lang.Object r0 = r4.g
            r42 = r0
            java.lang.String r42 = (java.lang.String) r42
            java.lang.Object r0 = r4.f
            r43 = r0
            java.lang.String r43 = (java.lang.String) r43
            kotlin.g0.n(r19)     // Catch: java.lang.Exception -> L181
            r0 = r19
            goto La1b
        L181:
            r0 = move-exception
            goto La5d
        L184:
            r19 = r0
            boolean r1 = r4.M
            long r2 = r4.e
            long r14 = r4.d
            long r7 = r4.c
            int r10 = r4.a
            java.lang.Object r0 = r4.H
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r4.G
            r12 = r0
            kotlin.jvm.internal.Ref$IntRef r12 = (kotlin.jvm.internal.Ref.IntRef) r12
            java.lang.Object r0 = r4.F
            r13 = r0
            java.lang.Integer r13 = (java.lang.Integer) r13
            java.lang.Object r0 = r4.E
            r20 = r0
            java.lang.Integer r20 = (java.lang.Integer) r20
            java.lang.Object r0 = r4.D
            r21 = r0
            java.lang.Integer r21 = (java.lang.Integer) r21
            java.lang.Object r0 = r4.C
            r22 = r0
            java.util.List r22 = (java.util.List) r22
            java.lang.Object r0 = r4.B
            r23 = r0
            java.util.Map r23 = (java.util.Map) r23
            java.lang.Object r0 = r4.A
            r24 = r0
            java.lang.String r24 = (java.lang.String) r24
            java.lang.Object r0 = r4.f1415z
            r25 = r0
            java.lang.String r25 = (java.lang.String) r25
            java.lang.Object r0 = r4.f1414y
            r26 = r0
            java.lang.String r26 = (java.lang.String) r26
            java.lang.Object r0 = r4.f1413x
            r27 = r0
            java.lang.String r27 = (java.lang.String) r27
            java.lang.Object r0 = r4.f1412w
            r28 = r0
            java.lang.String r28 = (java.lang.String) r28
            java.lang.Object r0 = r4.f1411v
            r29 = r0
            java.lang.String r29 = (java.lang.String) r29
            java.lang.Object r0 = r4.f1410u
            r30 = r0
            java.lang.String r30 = (java.lang.String) r30
            java.lang.Object r0 = r4.f1409t
            r31 = r0
            java.lang.Integer r31 = (java.lang.Integer) r31
            java.lang.Object r0 = r4.f1408s
            r32 = r0
            java.lang.String r32 = (java.lang.String) r32
            java.lang.Object r0 = r4.f1407r
            r33 = r0
            java.lang.String r33 = (java.lang.String) r33
            java.lang.Object r0 = r4.f1406q
            r34 = r0
            java.lang.String r34 = (java.lang.String) r34
            java.lang.Object r0 = r4.f1405p
            r35 = r0
            java.lang.String r35 = (java.lang.String) r35
            java.lang.Object r0 = r4.f1404o
            r36 = r0
            java.lang.String r36 = (java.lang.String) r36
            java.lang.Object r0 = r4.f1403n
            r37 = r0
            java.lang.String r37 = (java.lang.String) r37
            java.lang.Object r0 = r4.f1402m
            r38 = r0
            java.lang.String r38 = (java.lang.String) r38
            java.lang.Object r0 = r4.f1401l
            r39 = r0
            java.lang.String r39 = (java.lang.String) r39
            java.lang.Object r0 = r4.k
            r40 = r0
            java.lang.String r40 = (java.lang.String) r40
            java.lang.Object r0 = r4.j
            r41 = r0
            java.lang.String r41 = (java.lang.String) r41
            java.lang.Object r0 = r4.i
            r42 = r0
            java.lang.String r42 = (java.lang.String) r42
            java.lang.Object r0 = r4.h
            r43 = r0
            java.lang.String r43 = (java.lang.String) r43
            java.lang.Object r0 = r4.g
            r44 = r0
            java.lang.String r44 = (java.lang.String) r44
            java.lang.Object r0 = r4.f
            r45 = r0
            java.lang.String r45 = (java.lang.String) r45
            kotlin.g0.n(r19)     // Catch: java.lang.Exception -> L261
            r8 = r7
            r7 = r10
            r11 = r12
            r10 = r13
            r0 = r19
            r13 = r20
            r12 = r21
            r21 = r23
            r23 = r25
            r25 = r27
            r27 = r29
            r29 = r31
            r31 = r33
            r33 = r35
            r35 = r37
            r37 = r39
            r39 = r41
            r41 = r43
            r43 = r45
            goto L89f
        L261:
            r0 = move-exception
            r8 = r7
            r7 = r10
            r11 = r12
            r10 = r13
            r13 = r20
            r12 = r21
            r20 = r22
            r21 = r23
            r22 = r24
            r23 = r25
            r24 = r26
            r25 = r27
            r26 = r28
            r27 = r29
            r28 = r30
            r29 = r31
            r30 = r32
            r31 = r33
            r32 = r34
            r33 = r35
            r34 = r36
            r35 = r37
            r36 = r38
            r37 = r39
            r38 = r40
            r39 = r41
            r40 = r42
            r41 = r43
            r42 = r44
            r43 = r45
            goto La5d
        L29c:
            r19 = r0
            boolean r1 = r4.M
            long r2 = r4.e
            long r7 = r4.d
            long r12 = r4.c
            int r10 = r4.a
            java.lang.Object r0 = r4.G
            r14 = r0
            kotlin.jvm.internal.Ref$IntRef r14 = (kotlin.jvm.internal.Ref.IntRef) r14
            java.lang.Object r0 = r4.F
            r15 = r0
            java.lang.Integer r15 = (java.lang.Integer) r15
            java.lang.Object r0 = r4.E
            r20 = r0
            java.lang.Integer r20 = (java.lang.Integer) r20
            java.lang.Object r0 = r4.D
            r21 = r0
            java.lang.Integer r21 = (java.lang.Integer) r21
            java.lang.Object r0 = r4.C
            r22 = r0
            java.util.List r22 = (java.util.List) r22
            java.lang.Object r0 = r4.B
            r23 = r0
            java.util.Map r23 = (java.util.Map) r23
            java.lang.Object r0 = r4.A
            r24 = r0
            java.lang.String r24 = (java.lang.String) r24
            java.lang.Object r0 = r4.f1415z
            r25 = r0
            java.lang.String r25 = (java.lang.String) r25
            java.lang.Object r0 = r4.f1414y
            r26 = r0
            java.lang.String r26 = (java.lang.String) r26
            java.lang.Object r0 = r4.f1413x
            r27 = r0
            java.lang.String r27 = (java.lang.String) r27
            java.lang.Object r0 = r4.f1412w
            r28 = r0
            java.lang.String r28 = (java.lang.String) r28
            java.lang.Object r0 = r4.f1411v
            r29 = r0
            java.lang.String r29 = (java.lang.String) r29
            java.lang.Object r0 = r4.f1410u
            r30 = r0
            java.lang.String r30 = (java.lang.String) r30
            java.lang.Object r0 = r4.f1409t
            r31 = r0
            java.lang.Integer r31 = (java.lang.Integer) r31
            java.lang.Object r0 = r4.f1408s
            r32 = r0
            java.lang.String r32 = (java.lang.String) r32
            java.lang.Object r0 = r4.f1407r
            r33 = r0
            java.lang.String r33 = (java.lang.String) r33
            java.lang.Object r0 = r4.f1406q
            r34 = r0
            java.lang.String r34 = (java.lang.String) r34
            java.lang.Object r0 = r4.f1405p
            r35 = r0
            java.lang.String r35 = (java.lang.String) r35
            java.lang.Object r0 = r4.f1404o
            r36 = r0
            java.lang.String r36 = (java.lang.String) r36
            java.lang.Object r0 = r4.f1403n
            r37 = r0
            java.lang.String r37 = (java.lang.String) r37
            java.lang.Object r0 = r4.f1402m
            r38 = r0
            java.lang.String r38 = (java.lang.String) r38
            java.lang.Object r0 = r4.f1401l
            r39 = r0
            java.lang.String r39 = (java.lang.String) r39
            java.lang.Object r0 = r4.k
            r40 = r0
            java.lang.String r40 = (java.lang.String) r40
            java.lang.Object r0 = r4.j
            r41 = r0
            java.lang.String r41 = (java.lang.String) r41
            java.lang.Object r0 = r4.i
            r42 = r0
            java.lang.String r42 = (java.lang.String) r42
            java.lang.Object r0 = r4.h
            r43 = r0
            java.lang.String r43 = (java.lang.String) r43
            java.lang.Object r0 = r4.g
            r44 = r0
            java.lang.String r44 = (java.lang.String) r44
            java.lang.Object r0 = r4.f
            r45 = r0
            java.lang.String r45 = (java.lang.String) r45
            kotlin.g0.n(r19)     // Catch: java.lang.Exception -> L359
            r0 = r19
            r5 = r20
            r9 = r23
            goto L653
        L359:
            r0 = move-exception
            r9 = r14
            r5 = r15
            r11 = r39
            r15 = r40
            r14 = r41
            r39 = r23
            r23 = r22
            r22 = r21
            r21 = r20
            goto L770
        L36c:
            r19 = r0
            kotlin.g0.n(r19)
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
            r7.<init>()
            b0.a r0 = b0.a.a
            java.util.Map r0 = r0.a()
            r7.putAll(r0)
            java.lang.String r0 = "sportType"
            java.lang.Integer r8 = kotlin.coroutines.jvm.internal.a.f(r50)
            r7.put(r0, r8)
            java.lang.String r0 = "startTime"
            java.lang.Long r8 = kotlin.coroutines.jvm.internal.a.g(r51)
            r7.put(r0, r8)
            java.lang.String r0 = "endTime"
            java.lang.Long r8 = kotlin.coroutines.jvm.internal.a.g(r53)
            r7.put(r0, r8)
            java.lang.String r0 = "sportTime"
            java.lang.Long r8 = kotlin.coroutines.jvm.internal.a.g(r55)
            r7.put(r0, r8)
            java.lang.String r0 = "sportRange"
            r8 = r57
            r7.put(r0, r8)
            java.lang.String r0 = "speed"
            r10 = r58
            r7.put(r0, r10)
            java.lang.String r0 = "avgSpeed"
            r12 = r59
            r7.put(r0, r12)
            java.lang.String r0 = "brand"
            r13 = r60
            r7.put(r0, r13)
            java.lang.String r0 = "model"
            r14 = r61
            r7.put(r0, r14)
            java.lang.String r0 = "system"
            r15 = r62
            r7.put(r0, r15)
            java.lang.String r0 = "version"
            r11 = r63
            r7.put(r0, r11)
            java.lang.String r0 = "appVersion"
            r9 = r64
            r7.put(r0, r9)
            java.lang.String r0 = "stepNumbers"
            r5 = r66
            r7.put(r0, r5)
            java.lang.String r0 = "isSequencePoint"
            r5 = r67
            r7.put(r0, r5)
            java.lang.String r0 = "gitudeLatitude"
            r7.put(r0, r1)
            java.lang.String r0 = "pointList"
            r5 = r65
            r7.put(r0, r5)
            java.lang.String r0 = "okPointList"
            r5 = r69
            r7.put(r0, r5)
            java.lang.String r0 = "isFaceStatus"
            r5 = r70
            r7.put(r0, r5)
            java.lang.String r0 = "uploadType"
            r5 = r71
            r7.put(r0, r5)
            java.lang.String r0 = "identify"
            r7.put(r0, r2)
            java.lang.String r0 = "geofence"
            r5 = r73
            r7.put(r0, r5)
            java.lang.String r0 = "limitSpeed"
            r5 = r74
            r7.put(r0, r5)
            java.lang.String r0 = "limitStride"
            r5 = r75
            r7.put(r0, r5)
            java.lang.String r0 = "limitStepFrequency"
            r5 = r76
            r7.put(r0, r5)
            java.lang.String r0 = "gpsDistance"
            r5 = r77
            r7.put(r0, r5)
            java.lang.Class<com.bxkj.student.v2.common.data.PointData> r0 = com.bxkj.student.v2.common.data.PointData.class
            java.util.List r22 = com.alibaba.fastjson.JSON.parseArray(r1, r0)
            if (r22 == 0) goto L47e
            r0 = r22
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r1 = r0 instanceof java.util.Collection
            if (r1 == 0) goto L44d
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L44d
            r1 = 0
            goto L478
        L44d:
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L452:
            boolean r21 = r0.hasNext()
            if (r21 == 0) goto L478
            java.lang.Object r21 = r0.next()
            com.bxkj.student.v2.common.data.PointData r21 = (com.bxkj.student.v2.common.data.PointData) r21
            if (r21 == 0) goto L452
            java.lang.Boolean r23 = r21.getF()
            if (r23 == 0) goto L452
            java.lang.Boolean r21 = r21.getF()
            boolean r21 = r21.booleanValue()
            if (r21 == 0) goto L452
            int r1 = r1 + 1
            if (r1 >= 0) goto L452
            kotlin.collections.f0.a0()
            goto L452
        L478:
            java.lang.Integer r0 = kotlin.coroutines.jvm.internal.a.f(r1)
            r1 = r0
            goto L47f
        L47e:
            r1 = 0
        L47f:
            if (r22 == 0) goto L4c5
            r0 = r22
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r5 = r0 instanceof java.util.Collection
            if (r5 == 0) goto L494
            r5 = r0
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L494
            r5 = 0
            goto L4bf
        L494:
            java.util.Iterator r0 = r0.iterator()
            r5 = 0
        L499:
            boolean r21 = r0.hasNext()
            if (r21 == 0) goto L4bf
            java.lang.Object r21 = r0.next()
            com.bxkj.student.v2.common.data.PointData r21 = (com.bxkj.student.v2.common.data.PointData) r21
            if (r21 == 0) goto L499
            java.lang.Boolean r23 = r21.getM()
            if (r23 == 0) goto L499
            java.lang.Boolean r21 = r21.getM()
            boolean r21 = r21.booleanValue()
            if (r21 == 0) goto L499
            int r5 = r5 + 1
            if (r5 >= 0) goto L499
            kotlin.collections.f0.a0()
            goto L499
        L4bf:
            java.lang.Integer r0 = kotlin.coroutines.jvm.internal.a.f(r5)
            r5 = r0
            goto L4c6
        L4c5:
            r5 = 0
        L4c6:
            if (r22 == 0) goto L50c
            r0 = r22
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r8 = r0 instanceof java.util.Collection
            if (r8 == 0) goto L4db
            r8 = r0
            java.util.Collection r8 = (java.util.Collection) r8
            boolean r8 = r8.isEmpty()
            if (r8 == 0) goto L4db
            r8 = 0
            goto L506
        L4db:
            java.util.Iterator r0 = r0.iterator()
            r8 = 0
        L4e0:
            boolean r21 = r0.hasNext()
            if (r21 == 0) goto L506
            java.lang.Object r21 = r0.next()
            com.bxkj.student.v2.common.data.PointData r21 = (com.bxkj.student.v2.common.data.PointData) r21
            if (r21 == 0) goto L4e0
            java.lang.Boolean r23 = r21.getH()
            if (r23 == 0) goto L4e0
            java.lang.Boolean r21 = r21.getH()
            boolean r21 = r21.booleanValue()
            if (r21 == 0) goto L4e0
            int r8 = r8 + 1
            if (r8 >= 0) goto L4e0
            kotlin.collections.f0.a0()
            goto L4e0
        L506:
            java.lang.Integer r0 = kotlin.coroutines.jvm.internal.a.f(r8)
            r8 = r0
            goto L50d
        L50c:
            r8 = 0
        L50d:
            kotlin.jvm.internal.Ref$IntRef r9 = new kotlin.jvm.internal.Ref$IntRef
            r9.<init>()
            if (r3 == 0) goto L517
            r0 = r49
            goto L518
        L517:
            r0 = 0
        L518:
            if (r0 == 0) goto L51f
            r10 = 1
            r9.element = r10
            kotlin.n1 r0 = kotlin.n1.a
        L51f:
            if (r79 == 0) goto L538
            int r0 = r79.length()
            if (r0 <= 0) goto L52a
            r0 = r79
            goto L52b
        L52a:
            r0 = 0
        L52b:
            if (r0 == 0) goto L538
            int r10 = r9.element
            int r0 = java.lang.Integer.parseInt(r0)
            int r10 = r10 + r0
            r9.element = r10
            kotlin.n1 r0 = kotlin.n1.a
        L538:
            int r0 = r9.element
            java.lang.Integer r0 = kotlin.coroutines.jvm.internal.a.f(r0)
            java.lang.String r10 = "d"
            r7.put(r10, r0)
            java.lang.String r0 = "f"
            r7.put(r0, r1)
            java.lang.String r0 = "m"
            r7.put(r0, r5)
            java.lang.String r0 = "h"
            r7.put(r0, r8)
            com.bxkj.student.v2.common.db.AppDatabase$a r0 = com.bxkj.student.v2.common.db.AppDatabase.a     // Catch: java.lang.Exception -> L6fb
            com.bxkj.student.v2.common.db.AppDatabase r0 = r0.a()     // Catch: java.lang.Exception -> L6fb
            com.bxkj.student.v2.common.db.dao.b r0 = r0.w()     // Catch: java.lang.Exception -> L6fb
            if (r0 == 0) goto L6ff
            java.lang.Object r10 = kotlin.coroutines.jvm.internal.j.a(r57)     // Catch: java.lang.Exception -> L6fb
            r4.f = r10     // Catch: java.lang.Exception -> L6fb
            java.lang.Object r10 = kotlin.coroutines.jvm.internal.j.a(r58)     // Catch: java.lang.Exception -> L6fb
            r4.g = r10     // Catch: java.lang.Exception -> L6fb
            java.lang.Object r10 = kotlin.coroutines.jvm.internal.j.a(r12)     // Catch: java.lang.Exception -> L6fb
            r4.h = r10     // Catch: java.lang.Exception -> L6fb
            java.lang.Object r10 = kotlin.coroutines.jvm.internal.j.a(r13)     // Catch: java.lang.Exception -> L6fb
            r4.i = r10     // Catch: java.lang.Exception -> L6fb
            java.lang.Object r10 = kotlin.coroutines.jvm.internal.j.a(r14)     // Catch: java.lang.Exception -> L6fb
            r4.j = r10     // Catch: java.lang.Exception -> L6fb
            java.lang.Object r10 = kotlin.coroutines.jvm.internal.j.a(r15)     // Catch: java.lang.Exception -> L6fb
            r4.k = r10     // Catch: java.lang.Exception -> L6fb
            java.lang.Object r10 = kotlin.coroutines.jvm.internal.j.a(r11)     // Catch: java.lang.Exception -> L6fb
            r4.f1401l = r10     // Catch: java.lang.Exception -> L6fb
            java.lang.Object r10 = kotlin.coroutines.jvm.internal.j.a(r64)     // Catch: java.lang.Exception -> L6fb
            r4.f1402m = r10     // Catch: java.lang.Exception -> L6fb
            java.lang.Object r10 = kotlin.coroutines.jvm.internal.j.a(r65)     // Catch: java.lang.Exception -> L6fb
            r4.f1403n = r10     // Catch: java.lang.Exception -> L6fb
            java.lang.Object r10 = kotlin.coroutines.jvm.internal.j.a(r66)     // Catch: java.lang.Exception -> L6fb
            r4.f1404o = r10     // Catch: java.lang.Exception -> L6fb
            java.lang.Object r10 = kotlin.coroutines.jvm.internal.j.a(r67)     // Catch: java.lang.Exception -> L6fb
            r4.f1405p = r10     // Catch: java.lang.Exception -> L6fb
            java.lang.Object r10 = kotlin.coroutines.jvm.internal.j.a(r68)     // Catch: java.lang.Exception -> L6fb
            r4.f1406q = r10     // Catch: java.lang.Exception -> L6fb
            java.lang.Object r10 = kotlin.coroutines.jvm.internal.j.a(r69)     // Catch: java.lang.Exception -> L6fb
            r4.f1407r = r10     // Catch: java.lang.Exception -> L6fb
            java.lang.Object r10 = kotlin.coroutines.jvm.internal.j.a(r70)     // Catch: java.lang.Exception -> L6fb
            r4.f1408s = r10     // Catch: java.lang.Exception -> L6fb
            java.lang.Object r10 = kotlin.coroutines.jvm.internal.j.a(r71)     // Catch: java.lang.Exception -> L6fb
            r4.f1409t = r10     // Catch: java.lang.Exception -> L6fb
            r4.f1410u = r2     // Catch: java.lang.Exception -> L6fb
            java.lang.Object r10 = kotlin.coroutines.jvm.internal.j.a(r73)     // Catch: java.lang.Exception -> L6fb
            r4.f1411v = r10     // Catch: java.lang.Exception -> L6fb
            java.lang.Object r10 = kotlin.coroutines.jvm.internal.j.a(r74)     // Catch: java.lang.Exception -> L6fb
            r4.f1412w = r10     // Catch: java.lang.Exception -> L6fb
            java.lang.Object r10 = kotlin.coroutines.jvm.internal.j.a(r75)     // Catch: java.lang.Exception -> L6fb
            r4.f1413x = r10     // Catch: java.lang.Exception -> L6fb
            java.lang.Object r10 = kotlin.coroutines.jvm.internal.j.a(r76)     // Catch: java.lang.Exception -> L6fb
            r4.f1414y = r10     // Catch: java.lang.Exception -> L6fb
            java.lang.Object r10 = kotlin.coroutines.jvm.internal.j.a(r77)     // Catch: java.lang.Exception -> L6fb
            r4.f1415z = r10     // Catch: java.lang.Exception -> L6fb
            java.lang.Object r10 = kotlin.coroutines.jvm.internal.j.a(r79)     // Catch: java.lang.Exception -> L6fb
            r4.A = r10     // Catch: java.lang.Exception -> L6fb
            r4.B = r7     // Catch: java.lang.Exception -> L6fb
            java.lang.Object r10 = kotlin.coroutines.jvm.internal.j.a(r22)     // Catch: java.lang.Exception -> L6fb
            r4.C = r10     // Catch: java.lang.Exception -> L6fb
            java.lang.Object r10 = kotlin.coroutines.jvm.internal.j.a(r1)     // Catch: java.lang.Exception -> L6fb
            r4.D = r10     // Catch: java.lang.Exception -> L6fb
            java.lang.Object r10 = kotlin.coroutines.jvm.internal.j.a(r5)     // Catch: java.lang.Exception -> L6fb
            r4.E = r10     // Catch: java.lang.Exception -> L6fb
            java.lang.Object r10 = kotlin.coroutines.jvm.internal.j.a(r8)     // Catch: java.lang.Exception -> L6fb
            r4.F = r10     // Catch: java.lang.Exception -> L6fb
            java.lang.Object r10 = kotlin.coroutines.jvm.internal.j.a(r9)     // Catch: java.lang.Exception -> L6fb
            r4.G = r10     // Catch: java.lang.Exception -> L6fb
            r10 = r50
            r4.a = r10     // Catch: java.lang.Exception -> L6f7
            r21 = r1
            r1 = r51
            r4.c = r1     // Catch: java.lang.Exception -> L6be
            r1 = r53
            r4.d = r1     // Catch: java.lang.Exception -> L6be
            r1 = r55
            r4.e = r1     // Catch: java.lang.Exception -> L6be
            r4.M = r3     // Catch: java.lang.Exception -> L6be
            r1 = 1
            r4.P = r1     // Catch: java.lang.Exception -> L6be
            java.lang.Object r0 = r0.f(r4)     // Catch: java.lang.Exception -> L6be
            if (r0 != r6) goto L61d
            goto Lbaf
        L61d:
            r45 = r57
            r44 = r58
            r38 = r64
            r37 = r65
            r36 = r66
            r35 = r67
            r34 = r68
            r33 = r69
            r32 = r70
            r31 = r71
            r30 = r72
            r29 = r73
            r28 = r74
            r27 = r75
            r26 = r76
            r25 = r77
            r24 = r79
            r1 = r3
            r39 = r11
            r43 = r12
            r42 = r13
            r41 = r14
            r40 = r15
            r12 = r51
            r2 = r55
            r15 = r8
            r14 = r9
            r9 = r7
            r7 = r53
        L653:
            l0.a r0 = (l0.a) r0     // Catch: java.lang.Exception -> L6b2
            if (r0 == 0) goto L6b6
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L6b2
            r11.<init>()     // Catch: java.lang.Exception -> L6b2
            r50 = r1
            java.lang.String r1 = "获取环境信息成功="
            r11.append(r1)     // Catch: java.lang.Exception -> L69d
            r11.append(r0)     // Catch: java.lang.Exception -> L69d
            java.lang.String r1 = r11.toString()     // Catch: java.lang.Exception -> L69d
            r51 = r0
            r11 = 0
            java.lang.Object[] r0 = new java.lang.Object[r11]     // Catch: java.lang.Exception -> L69d
            com.orhanobut.logger.j.d(r1, r0)     // Catch: java.lang.Exception -> L69d
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap     // Catch: java.lang.Exception -> L69d
            r0.<init>()     // Catch: java.lang.Exception -> L69d
            java.lang.String r1 = "deviceId"
            java.lang.String r11 = r51.f()     // Catch: java.lang.Exception -> L69d
            r0.put(r1, r11)     // Catch: java.lang.Exception -> L69d
            java.lang.String r1 = "oppo"
            java.lang.String r11 = r51.g()     // Catch: java.lang.Exception -> L69d
            r0.put(r1, r11)     // Catch: java.lang.Exception -> L69d
            java.lang.String r1 = "safe"
            java.lang.String r11 = r51.h()     // Catch: java.lang.Exception -> L69d
            r0.put(r1, r11)     // Catch: java.lang.Exception -> L69d
            java.lang.String r1 = "environment"
            r9.put(r1, r0)     // Catch: java.lang.Exception -> L69d
            kotlin.n1 r0 = kotlin.n1.a     // Catch: java.lang.Exception -> L69d
            r1 = r50
            goto L73c
        L69d:
            r0 = move-exception
            r1 = r50
        L6a0:
            r23 = r22
            r11 = r39
            r39 = r9
            r9 = r14
            r22 = r21
            r14 = r41
            r21 = r5
            r5 = r15
            r15 = r40
            goto L770
        L6b2:
            r0 = move-exception
            r50 = r1
            goto L6a0
        L6b6:
            r50 = r1
            r0 = r50
            r1 = r21
            goto L739
        L6be:
            r0 = move-exception
        L6bf:
            r45 = r57
            r44 = r58
            r38 = r64
            r37 = r65
            r36 = r66
            r35 = r67
            r34 = r68
            r33 = r69
            r32 = r70
            r31 = r71
            r30 = r72
            r29 = r73
            r28 = r74
            r27 = r75
            r26 = r76
            r25 = r77
            r24 = r79
            r1 = r3
            r39 = r7
            r43 = r12
            r42 = r13
            r23 = r22
            r12 = r51
            r2 = r55
            r22 = r21
            r21 = r5
            r5 = r8
            r7 = r53
            goto L770
        L6f7:
            r0 = move-exception
        L6f8:
            r21 = r1
            goto L6bf
        L6fb:
            r0 = move-exception
            r10 = r50
            goto L6f8
        L6ff:
            r10 = r50
            r21 = r1
            r45 = r57
            r44 = r58
            r38 = r64
            r37 = r65
            r36 = r66
            r35 = r67
            r34 = r68
            r33 = r69
            r32 = r70
            r31 = r71
            r30 = r72
            r29 = r73
            r28 = r74
            r27 = r75
            r26 = r76
            r25 = r77
            r24 = r79
            r0 = r3
            r39 = r11
            r43 = r12
            r42 = r13
            r41 = r14
            r40 = r15
            r12 = r51
            r2 = r55
            r15 = r8
            r14 = r9
            r9 = r7
            r7 = r53
        L739:
            r21 = r1
            r1 = r0
        L73c:
            r11 = r14
            r50 = r15
            r23 = r25
            r25 = r27
            r27 = r29
            r29 = r31
            r31 = r33
            r33 = r35
            r35 = r37
            r37 = r39
            r39 = r41
            r14 = r7
            r7 = r10
            r10 = r30
            r30 = r32
            r32 = r34
            r34 = r36
            r36 = r38
            r38 = r40
            r46 = r12
            r13 = r5
            r5 = r9
            r8 = r46
            r12 = r21
            r41 = r43
            r43 = r45
            r40 = r42
            r42 = r44
            goto L7bb
        L770:
            java.lang.String r0 = com.bxkj.base.v2.common.ext.e.a(r0)
            r50 = r1
            r51 = r2
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]
            com.orhanobut.logger.j.e(r0, r2)
            r1 = r50
            r2 = r51
            r50 = r5
            r5 = r39
            r39 = r14
            r46 = r11
            r11 = r9
            r47 = r7
            r7 = r10
            r8 = r12
            r13 = r21
            r12 = r22
            r22 = r23
            r23 = r25
            r25 = r27
            r27 = r29
            r10 = r30
            r29 = r31
            r30 = r32
            r31 = r33
            r32 = r34
            r33 = r35
            r34 = r36
            r35 = r37
            r36 = r38
            r37 = r46
            r38 = r15
            r14 = r47
            r40 = r42
            r41 = r43
            r42 = r44
            r43 = r45
        L7bb:
            if (r10 == 0) goto L933
            com.bxkj.student.v2.common.db.AppDatabase$a r0 = com.bxkj.student.v2.common.db.AppDatabase.a     // Catch: java.lang.Exception -> L92f
            com.bxkj.student.v2.common.db.AppDatabase r0 = r0.a()     // Catch: java.lang.Exception -> L92f
            com.bxkj.student.v2.common.db.dao.y r0 = r0.z()     // Catch: java.lang.Exception -> L92f
            if (r0 == 0) goto L8d2
            r51 = r11
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.j.a(r43)     // Catch: java.lang.Exception -> L8bf
            r4.f = r11     // Catch: java.lang.Exception -> L8bf
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.j.a(r42)     // Catch: java.lang.Exception -> L8bf
            r4.g = r11     // Catch: java.lang.Exception -> L8bf
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.j.a(r41)     // Catch: java.lang.Exception -> L8bf
            r4.h = r11     // Catch: java.lang.Exception -> L8bf
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.j.a(r40)     // Catch: java.lang.Exception -> L8bf
            r4.i = r11     // Catch: java.lang.Exception -> L8bf
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.j.a(r39)     // Catch: java.lang.Exception -> L8bf
            r4.j = r11     // Catch: java.lang.Exception -> L8bf
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.j.a(r38)     // Catch: java.lang.Exception -> L8bf
            r4.k = r11     // Catch: java.lang.Exception -> L8bf
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.j.a(r37)     // Catch: java.lang.Exception -> L8bf
            r4.f1401l = r11     // Catch: java.lang.Exception -> L8bf
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.j.a(r36)     // Catch: java.lang.Exception -> L8bf
            r4.f1402m = r11     // Catch: java.lang.Exception -> L8bf
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.j.a(r35)     // Catch: java.lang.Exception -> L8bf
            r4.f1403n = r11     // Catch: java.lang.Exception -> L8bf
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.j.a(r34)     // Catch: java.lang.Exception -> L8bf
            r4.f1404o = r11     // Catch: java.lang.Exception -> L8bf
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.j.a(r33)     // Catch: java.lang.Exception -> L8bf
            r4.f1405p = r11     // Catch: java.lang.Exception -> L8bf
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.j.a(r32)     // Catch: java.lang.Exception -> L8bf
            r4.f1406q = r11     // Catch: java.lang.Exception -> L8bf
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.j.a(r31)     // Catch: java.lang.Exception -> L8bf
            r4.f1407r = r11     // Catch: java.lang.Exception -> L8bf
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.j.a(r30)     // Catch: java.lang.Exception -> L8bf
            r4.f1408s = r11     // Catch: java.lang.Exception -> L8bf
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.j.a(r29)     // Catch: java.lang.Exception -> L8bf
            r4.f1409t = r11     // Catch: java.lang.Exception -> L8bf
            r4.f1410u = r10     // Catch: java.lang.Exception -> L8bf
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.j.a(r27)     // Catch: java.lang.Exception -> L8bf
            r4.f1411v = r11     // Catch: java.lang.Exception -> L8bf
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.j.a(r28)     // Catch: java.lang.Exception -> L8bf
            r4.f1412w = r11     // Catch: java.lang.Exception -> L8bf
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.j.a(r25)     // Catch: java.lang.Exception -> L8bf
            r4.f1413x = r11     // Catch: java.lang.Exception -> L8bf
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.j.a(r26)     // Catch: java.lang.Exception -> L8bf
            r4.f1414y = r11     // Catch: java.lang.Exception -> L8bf
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.j.a(r23)     // Catch: java.lang.Exception -> L8bf
            r4.f1415z = r11     // Catch: java.lang.Exception -> L8bf
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.j.a(r24)     // Catch: java.lang.Exception -> L8bf
            r4.A = r11     // Catch: java.lang.Exception -> L8bf
            r4.B = r5     // Catch: java.lang.Exception -> L8bf
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.j.a(r22)     // Catch: java.lang.Exception -> L8bf
            r4.C = r11     // Catch: java.lang.Exception -> L8bf
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.j.a(r12)     // Catch: java.lang.Exception -> L8bf
            r4.D = r11     // Catch: java.lang.Exception -> L8bf
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.j.a(r13)     // Catch: java.lang.Exception -> L8bf
            r4.E = r11     // Catch: java.lang.Exception -> L8bf
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.j.a(r50)     // Catch: java.lang.Exception -> L8bf
            r4.F = r11     // Catch: java.lang.Exception -> L8bf
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.j.a(r51)     // Catch: java.lang.Exception -> L8bf
            r4.G = r11     // Catch: java.lang.Exception -> L8bf
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.j.a(r10)     // Catch: java.lang.Exception -> L8bf
            r4.H = r11     // Catch: java.lang.Exception -> L8bf
            r4.a = r7     // Catch: java.lang.Exception -> L8bf
            r4.c = r8     // Catch: java.lang.Exception -> L8bf
            r4.d = r14     // Catch: java.lang.Exception -> L8bf
            r4.e = r2     // Catch: java.lang.Exception -> L8bf
            r4.M = r1     // Catch: java.lang.Exception -> L8bf
            r11 = 0
            r4.b = r11     // Catch: java.lang.Exception -> L8bf
            r11 = 2
            r4.P = r11     // Catch: java.lang.Exception -> L8bf
            java.lang.Object r0 = r0.b(r10, r4)     // Catch: java.lang.Exception -> L8bf
            if (r0 != r6) goto L889
            goto Lbaf
        L889:
            r11 = r51
            r21 = r5
            r44 = r42
            r42 = r40
            r40 = r38
            r38 = r36
            r36 = r34
            r34 = r32
            r32 = r30
            r30 = r10
            r10 = r50
        L89f:
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Exception -> L8a4
            r5 = r21
            goto L8e7
        L8a4:
            r0 = move-exception
        L8a5:
            r20 = r22
            r22 = r24
            r24 = r26
            r26 = r28
            r28 = r30
            r30 = r32
            r32 = r34
            r34 = r36
            r36 = r38
            r38 = r40
            r40 = r42
            r42 = r44
            goto La5d
        L8bf:
            r0 = move-exception
            r11 = r51
        L8c2:
            r21 = r5
            r20 = r22
            r22 = r24
            r24 = r26
            r26 = r28
            r28 = r10
            r10 = r50
            goto La5d
        L8d2:
            r51 = r11
            r44 = r42
            r0 = 0
            r42 = r40
            r40 = r38
            r38 = r36
            r36 = r34
            r34 = r32
            r32 = r30
            r30 = r10
            r10 = r50
        L8e7:
            if (r0 == 0) goto L91b
            int r0 = r0.intValue()     // Catch: java.lang.Exception -> L917
            r50 = r0
            java.lang.String r0 = "isValid"
            r51 = r1
            java.lang.Integer r1 = kotlin.coroutines.jvm.internal.a.f(r50)     // Catch: java.lang.Exception -> L911
            r5.put(r0, r1)     // Catch: java.lang.Exception -> L911
            kotlin.n1 r0 = kotlin.n1.a     // Catch: java.lang.Exception -> L911
            r1 = r51
            r50 = r10
            r10 = r30
            r30 = r32
            r32 = r34
            r34 = r36
            r36 = r38
            r38 = r40
            r40 = r42
            r42 = r44
            goto L939
        L911:
            r0 = move-exception
            r1 = r51
        L914:
            r21 = r5
            goto L8a5
        L917:
            r0 = move-exception
            r51 = r1
            goto L914
        L91b:
            r51 = r1
            r0 = r10
            r10 = r30
            r30 = r32
            r32 = r34
            r34 = r36
            r36 = r38
            r38 = r40
            r40 = r42
            r42 = r44
            goto L937
        L92f:
            r0 = move-exception
            r51 = r11
            goto L8c2
        L933:
            r51 = r11
            r0 = r50
        L937:
            r50 = r0
        L939:
            if (r10 == 0) goto La6a
            com.bxkj.student.v2.common.db.AppDatabase$a r0 = com.bxkj.student.v2.common.db.AppDatabase.a     // Catch: java.lang.Exception -> L92f
            com.bxkj.student.v2.common.db.AppDatabase r0 = r0.a()     // Catch: java.lang.Exception -> L92f
            com.bxkj.student.v2.common.db.dao.y r0 = r0.z()     // Catch: java.lang.Exception -> L92f
            if (r0 == 0) goto La24
            r51 = r11
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.j.a(r43)     // Catch: java.lang.Exception -> L8bf
            r4.f = r11     // Catch: java.lang.Exception -> L8bf
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.j.a(r42)     // Catch: java.lang.Exception -> L8bf
            r4.g = r11     // Catch: java.lang.Exception -> L8bf
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.j.a(r41)     // Catch: java.lang.Exception -> L8bf
            r4.h = r11     // Catch: java.lang.Exception -> L8bf
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.j.a(r40)     // Catch: java.lang.Exception -> L8bf
            r4.i = r11     // Catch: java.lang.Exception -> L8bf
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.j.a(r39)     // Catch: java.lang.Exception -> L8bf
            r4.j = r11     // Catch: java.lang.Exception -> L8bf
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.j.a(r38)     // Catch: java.lang.Exception -> L8bf
            r4.k = r11     // Catch: java.lang.Exception -> L8bf
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.j.a(r37)     // Catch: java.lang.Exception -> L8bf
            r4.f1401l = r11     // Catch: java.lang.Exception -> L8bf
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.j.a(r36)     // Catch: java.lang.Exception -> L8bf
            r4.f1402m = r11     // Catch: java.lang.Exception -> L8bf
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.j.a(r35)     // Catch: java.lang.Exception -> L8bf
            r4.f1403n = r11     // Catch: java.lang.Exception -> L8bf
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.j.a(r34)     // Catch: java.lang.Exception -> L8bf
            r4.f1404o = r11     // Catch: java.lang.Exception -> L8bf
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.j.a(r33)     // Catch: java.lang.Exception -> L8bf
            r4.f1405p = r11     // Catch: java.lang.Exception -> L8bf
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.j.a(r32)     // Catch: java.lang.Exception -> L8bf
            r4.f1406q = r11     // Catch: java.lang.Exception -> L8bf
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.j.a(r31)     // Catch: java.lang.Exception -> L8bf
            r4.f1407r = r11     // Catch: java.lang.Exception -> L8bf
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.j.a(r30)     // Catch: java.lang.Exception -> L8bf
            r4.f1408s = r11     // Catch: java.lang.Exception -> L8bf
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.j.a(r29)     // Catch: java.lang.Exception -> L8bf
            r4.f1409t = r11     // Catch: java.lang.Exception -> L8bf
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.j.a(r10)     // Catch: java.lang.Exception -> L8bf
            r4.f1410u = r11     // Catch: java.lang.Exception -> L8bf
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.j.a(r27)     // Catch: java.lang.Exception -> L8bf
            r4.f1411v = r11     // Catch: java.lang.Exception -> L8bf
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.j.a(r28)     // Catch: java.lang.Exception -> L8bf
            r4.f1412w = r11     // Catch: java.lang.Exception -> L8bf
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.j.a(r25)     // Catch: java.lang.Exception -> L8bf
            r4.f1413x = r11     // Catch: java.lang.Exception -> L8bf
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.j.a(r26)     // Catch: java.lang.Exception -> L8bf
            r4.f1414y = r11     // Catch: java.lang.Exception -> L8bf
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.j.a(r23)     // Catch: java.lang.Exception -> L8bf
            r4.f1415z = r11     // Catch: java.lang.Exception -> L8bf
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.j.a(r24)     // Catch: java.lang.Exception -> L8bf
            r4.A = r11     // Catch: java.lang.Exception -> L8bf
            r4.B = r5     // Catch: java.lang.Exception -> L8bf
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.j.a(r22)     // Catch: java.lang.Exception -> L8bf
            r4.C = r11     // Catch: java.lang.Exception -> L8bf
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.j.a(r12)     // Catch: java.lang.Exception -> L8bf
            r4.D = r11     // Catch: java.lang.Exception -> L8bf
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.j.a(r13)     // Catch: java.lang.Exception -> L8bf
            r4.E = r11     // Catch: java.lang.Exception -> L8bf
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.j.a(r50)     // Catch: java.lang.Exception -> L8bf
            r4.F = r11     // Catch: java.lang.Exception -> L8bf
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.j.a(r51)     // Catch: java.lang.Exception -> L8bf
            r4.G = r11     // Catch: java.lang.Exception -> L8bf
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.j.a(r10)     // Catch: java.lang.Exception -> L8bf
            r4.H = r11     // Catch: java.lang.Exception -> L8bf
            r4.a = r7     // Catch: java.lang.Exception -> L8bf
            r4.c = r8     // Catch: java.lang.Exception -> L8bf
            r4.d = r14     // Catch: java.lang.Exception -> L8bf
            r4.e = r2     // Catch: java.lang.Exception -> L8bf
            r4.M = r1     // Catch: java.lang.Exception -> L8bf
            r11 = 0
            r4.b = r11     // Catch: java.lang.Exception -> L8bf
            r11 = 3
            r4.P = r11     // Catch: java.lang.Exception -> L8bf
            java.lang.Object r0 = r0.l(r10, r4)     // Catch: java.lang.Exception -> L8bf
            if (r0 != r6) goto La0b
            goto Lbaf
        La0b:
            r11 = r51
            r21 = r5
            r20 = r22
            r22 = r24
            r24 = r26
            r26 = r28
            r28 = r10
            r10 = r50
        La1b:
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L181
            r50 = r1
            r5 = r11
            r1 = r21
            r11 = r0
            goto La38
        La24:
            r51 = r11
            r20 = r22
            r22 = r24
            r24 = r26
            r26 = r28
            r11 = 0
            r28 = r10
            r10 = r50
            r50 = r1
            r1 = r5
            r5 = r51
        La38:
            if (r11 == 0) goto La4d
            java.lang.String r0 = "remarkId"
            r1.put(r0, r11)     // Catch: java.lang.Exception -> La46
            kotlin.n1 r0 = kotlin.n1.a     // Catch: java.lang.Exception -> La46
            r11 = r5
            r5 = r1
            r1 = r50
            goto La79
        La46:
            r0 = move-exception
            r21 = r1
            r11 = r5
            r1 = r50
            goto La5d
        La4d:
            r11 = r5
            r0 = r10
            r10 = r28
            r5 = r1
            r28 = r26
            r1 = r50
            r26 = r24
            r24 = r22
            r22 = r20
            goto La6e
        La5d:
            java.lang.String r0 = com.bxkj.base.v2.common.ext.e.a(r0)
            r5 = 0
            java.lang.Object[] r5 = new java.lang.Object[r5]
            com.orhanobut.logger.j.e(r0, r5)
            r5 = r21
            goto La79
        La6a:
            r51 = r11
            r0 = r50
        La6e:
            r20 = r22
            r22 = r24
            r24 = r26
            r26 = r28
            r28 = r10
            r10 = r0
        La79:
            com.google.gson.Gson r0 = new com.google.gson.Gson
            r0.<init>()
            java.lang.String r0 = r0.toJson(r5)
            com.orhanobut.logger.j.h(r0)
            long r44 = java.lang.System.currentTimeMillis()
            r17 = r5
            java.lang.String r5 = java.lang.String.valueOf(r44)
            r50 = r10
            b0.b r10 = b0.b.a
            com.bxkj.student.App$a r19 = com.bxkj.student.App.d
            r51 = r11
            com.bxkj.student.App r11 = r19.a()
            com.bxkj.base.v2.data.b$a r19 = com.bxkj.base.v2.data.b.d
            com.bxkj.base.v2.data.b r19 = r19.a()
            r52 = r12
            java.lang.String r12 = r19.g()
            kotlin.jvm.internal.g0.m(r0)
            java.lang.String[] r10 = r10.b(r11, r12, r5, r0)
            r18 = 1
            r11 = r10[r18]
            r16 = 2
            r12 = r10[r16]
            com.bxkj.student.v2.retrofit.e r16 = com.bxkj.student.v2.retrofit.e.a
            r53 = r0
            com.bxkj.student.v2.retrofit.b r0 = r16.c()
            r54 = r10
            java.lang.String r10 = "UTF-8"
            r55 = r13
            java.lang.String r13 = java.net.URLEncoder.encode(r11, r10)
            r56 = r11
            java.lang.String r11 = "encode(...)"
            kotlin.jvm.internal.g0.o(r13, r11)
            java.lang.String r10 = java.net.URLEncoder.encode(r12, r10)
            kotlin.jvm.internal.g0.o(r10, r11)
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.j.a(r43)
            r4.f = r11
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.j.a(r42)
            r4.g = r11
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.j.a(r41)
            r4.h = r11
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.j.a(r40)
            r4.i = r11
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.j.a(r39)
            r4.j = r11
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.j.a(r38)
            r4.k = r11
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.j.a(r37)
            r4.f1401l = r11
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.j.a(r36)
            r4.f1402m = r11
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.j.a(r35)
            r4.f1403n = r11
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.j.a(r34)
            r4.f1404o = r11
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.j.a(r33)
            r4.f1405p = r11
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.j.a(r32)
            r4.f1406q = r11
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.j.a(r31)
            r4.f1407r = r11
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.j.a(r30)
            r4.f1408s = r11
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.j.a(r29)
            r4.f1409t = r11
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.j.a(r28)
            r4.f1410u = r11
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.j.a(r27)
            r4.f1411v = r11
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.j.a(r26)
            r4.f1412w = r11
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.j.a(r25)
            r4.f1413x = r11
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.j.a(r24)
            r4.f1414y = r11
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.j.a(r23)
            r4.f1415z = r11
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.j.a(r22)
            r4.A = r11
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.j.a(r17)
            r4.B = r11
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.j.a(r20)
            r4.C = r11
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.j.a(r52)
            r4.D = r11
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.j.a(r55)
            r4.E = r11
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.j.a(r50)
            r4.F = r11
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.j.a(r51)
            r4.G = r11
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.j.a(r53)
            r4.H = r11
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.j.a(r5)
            r4.I = r11
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.j.a(r54)
            r4.J = r11
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.j.a(r56)
            r4.K = r11
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.j.a(r12)
            r4.L = r11
            r4.a = r7
            r4.c = r8
            r4.d = r14
            r4.e = r2
            r4.M = r1
            r1 = 4
            r4.P = r1
            java.lang.Object r0 = r0.K(r5, r13, r10, r4)
            if (r0 != r6) goto Lbb0
        Lbaf:
            return r6
        Lbb0:
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object b(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r3) {
            r1 = this;
            com.bxkj.student.v2.common.db.AppDatabase$a r0 = com.bxkj.student.v2.common.db.AppDatabase.a
            com.bxkj.student.v2.common.db.AppDatabase r0 = r0.a()
            com.bxkj.student.v2.common.db.dao.y r0 = r0.z()
            if (r0 == 0) goto L1a
            java.lang.Object r2 = r0.deleteByIdentify(r2, r3)
            java.lang.Object r3 = kotlin.coroutines.intrinsics.a.l()
            if (r2 != r3) goto L17
            return r2
        L17:
            kotlin.n1 r2 = kotlin.n1.a
            return r2
        L1a:
            r2 = 0
            return r2
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object c(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super java.util.List<l0.d>> r3) {
            r1 = this;
            com.bxkj.student.v2.common.db.AppDatabase$a r0 = com.bxkj.student.v2.common.db.AppDatabase.a
            com.bxkj.student.v2.common.db.AppDatabase r0 = r0.a()
            com.bxkj.student.v2.common.db.dao.y r0 = r0.z()
            if (r0 == 0) goto L11
            java.lang.Object r2 = r0.getLocalRecordById(r2, r3)
            return r2
        L11:
            r2 = 0
            return r2
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object d(@org.jetbrains.annotations.NotNull java.lang.String r17, @org.jetbrains.annotations.NotNull java.lang.String r18, @org.jetbrains.annotations.NotNull java.io.File r19, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r20) {
            r16 = this;
            r0 = r20
            boolean r1 = r0 instanceof com.bxkj.student.v2.repository.sports.g.b
            if (r1 == 0) goto L17
            r1 = r0
            com.bxkj.student.v2.repository.sports.g$b r1 = (com.bxkj.student.v2.repository.sports.g.b) r1
            int r2 = r1.f1416l
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f1416l = r2
            r2 = r16
            goto L1e
        L17:
            com.bxkj.student.v2.repository.sports.g$b r1 = new com.bxkj.student.v2.repository.sports.g$b
            r2 = r16
            r1.<init>(r2, r0)
        L1e:
            java.lang.Object r0 = r1.j
            java.lang.Object r3 = kotlin.coroutines.intrinsics.a.l()
            int r4 = r1.f1416l
            r5 = 1
            if (r4 == 0) goto L5c
            if (r4 != r5) goto L54
            java.lang.Object r3 = r1.i
            okhttp3.MultipartBody r3 = (okhttp3.MultipartBody) r3
            java.lang.Object r3 = r1.h
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r3 = r1.g
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r3 = r1.f
            java.lang.String[] r3 = (java.lang.String[]) r3
            java.lang.Object r3 = r1.e
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r3 = r1.d
            java.util.Map r3 = (java.util.Map) r3
            java.lang.Object r3 = r1.c
            java.io.File r3 = (java.io.File) r3
            java.lang.Object r3 = r1.b
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r1 = r1.a
            java.lang.String r1 = (java.lang.String) r1
            kotlin.g0.n(r0)
            goto L129
        L54:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L5c:
            kotlin.g0.n(r0)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            b0.a r4 = b0.a.a
            java.util.Map r4 = r4.a()
            r0.putAll(r4)
            java.lang.String r4 = "identify"
            r6 = r17
            r0.put(r4, r6)
            java.lang.String r4 = "type"
            java.lang.String r7 = "4"
            r0.put(r4, r7)
            java.lang.String r4 = "remark"
            r7 = r18
            r0.put(r4, r7)
            long r8 = java.lang.System.currentTimeMillis()
            java.lang.String r4 = java.lang.String.valueOf(r8)
            b0.b r8 = b0.b.a
            com.bxkj.student.App$a r9 = com.bxkj.student.App.d
            com.bxkj.student.App r9 = r9.a()
            com.bxkj.base.v2.data.b$a r10 = com.bxkj.base.v2.data.b.d
            com.bxkj.base.v2.data.b r10 = r10.a()
            java.lang.String r10 = r10.g()
            java.lang.String r11 = com.alibaba.fastjson.JSON.toJSONString(r0)
            java.lang.String r12 = "toJSONString(...)"
            kotlin.jvm.internal.g0.o(r11, r12)
            java.lang.String[] r8 = r8.b(r9, r10, r4, r11)
            r9 = r8[r5]
            r10 = 2
            r10 = r8[r10]
            okhttp3.MultipartBody$Builder r11 = new okhttp3.MultipartBody$Builder
            r12 = 0
            r11.<init>(r12, r5, r12)
            okhttp3.MediaType r12 = okhttp3.MultipartBody.FORM
            okhttp3.MultipartBody$Builder r11 = r11.setType(r12)
            java.lang.String r12 = "key"
            okhttp3.MultipartBody$Builder r11 = r11.addFormDataPart(r12, r9)
            java.lang.String r12 = "param"
            okhttp3.MultipartBody$Builder r11 = r11.addFormDataPart(r12, r10)
            java.lang.String r12 = r19.getName()
            okhttp3.RequestBody$Companion r13 = okhttp3.RequestBody.Companion
            okhttp3.MediaType$Companion r14 = okhttp3.MediaType.Companion
            java.lang.String r15 = "image/png"
            okhttp3.MediaType r14 = r14.get(r15)
            r15 = r19
            okhttp3.RequestBody r13 = r13.create(r15, r14)
            java.lang.String r14 = "file"
            okhttp3.MultipartBody$Builder r11 = r11.addFormDataPart(r14, r12, r13)
            okhttp3.MultipartBody r11 = r11.build()
            com.bxkj.student.v2.retrofit.e r12 = com.bxkj.student.v2.retrofit.e.a
            com.bxkj.student.v2.retrofit.b r12 = r12.c()
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.j.a(r6)
            r1.a = r6
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.j.a(r7)
            r1.b = r6
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.j.a(r15)
            r1.c = r6
            java.lang.Object r0 = kotlin.coroutines.jvm.internal.j.a(r0)
            r1.d = r0
            java.lang.Object r0 = kotlin.coroutines.jvm.internal.j.a(r4)
            r1.e = r0
            java.lang.Object r0 = kotlin.coroutines.jvm.internal.j.a(r8)
            r1.f = r0
            java.lang.Object r0 = kotlin.coroutines.jvm.internal.j.a(r9)
            r1.g = r0
            java.lang.Object r0 = kotlin.coroutines.jvm.internal.j.a(r10)
            r1.h = r0
            java.lang.Object r0 = kotlin.coroutines.jvm.internal.j.a(r11)
            r1.i = r0
            r1.f1416l = r5
            java.lang.Object r0 = r12.o(r4, r11, r1)
            if (r0 != r3) goto L129
            return r3
        L129:
            com.bxkj.base.v2.http.result.ApiResult r0 = (com.bxkj.base.v2.http.result.ApiResult) r0
            if (r0 == 0) goto L133
            java.lang.Object r0 = r0.apiData()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
        L133:
            kotlin.n1 r0 = kotlin.n1.a
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object e(@org.jetbrains.annotations.NotNull java.lang.String r8, @org.jetbrains.annotations.NotNull java.lang.String r9, @org.jetbrains.annotations.NotNull java.lang.String r10, @org.jetbrains.annotations.NotNull java.lang.String r11, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r12) {
            r7 = this;
            com.bxkj.student.v2.common.db.AppDatabase$a r0 = com.bxkj.student.v2.common.db.AppDatabase.a
            com.bxkj.student.v2.common.db.AppDatabase r0 = r0.a()
            com.bxkj.student.v2.common.db.dao.y r1 = r0.z()
            if (r1 == 0) goto L1f
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            java.lang.Object r8 = r1.i(r2, r3, r4, r5, r6)
            java.lang.Object r9 = kotlin.coroutines.intrinsics.a.l()
            if (r8 != r9) goto L1c
            return r8
        L1c:
            kotlin.n1 r8 = kotlin.n1.a
            return r8
        L1f:
            r8 = 0
            return r8
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object f(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull java.lang.String r3, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r4) {
            r1 = this;
            com.bxkj.student.v2.common.db.AppDatabase$a r0 = com.bxkj.student.v2.common.db.AppDatabase.a
            com.bxkj.student.v2.common.db.AppDatabase r0 = r0.a()
            com.bxkj.student.v2.common.db.dao.y r0 = r0.z()
            if (r0 == 0) goto L1a
            java.lang.Object r2 = r0.t(r2, r3, r4)
            java.lang.Object r3 = kotlin.coroutines.intrinsics.a.l()
            if (r2 != r3) goto L17
            return r2
        L17:
            kotlin.n1 r2 = kotlin.n1.a
            return r2
        L1a:
            r2 = 0
            return r2
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object g(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r3) {
            r1 = this;
            com.bxkj.student.v2.common.db.AppDatabase$a r0 = com.bxkj.student.v2.common.db.AppDatabase.a
            com.bxkj.student.v2.common.db.AppDatabase r0 = r0.a()
            com.bxkj.student.v2.common.db.dao.y r0 = r0.z()
            if (r0 == 0) goto L1a
            java.lang.Object r2 = r0.j(r2, r3)
            java.lang.Object r3 = kotlin.coroutines.intrinsics.a.l()
            if (r2 != r3) goto L17
            return r2
        L17:
            kotlin.n1 r2 = kotlin.n1.a
            return r2
        L1a:
            r2 = 0
            return r2
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object h(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull java.lang.String r3, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r4) {
            r1 = this;
            com.bxkj.student.v2.common.db.AppDatabase$a r0 = com.bxkj.student.v2.common.db.AppDatabase.a
            com.bxkj.student.v2.common.db.AppDatabase r0 = r0.a()
            com.bxkj.student.v2.common.db.dao.y r0 = r0.z()
            if (r0 == 0) goto L1a
            java.lang.Object r2 = r0.p(r2, r3, r4)
            java.lang.Object r3 = kotlin.coroutines.intrinsics.a.l()
            if (r2 != r3) goto L17
            return r2
        L17:
            kotlin.n1 r2 = kotlin.n1.a
            return r2
        L1a:
            r2 = 0
            return r2
    }
}
