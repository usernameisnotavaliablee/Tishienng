package com.bxkj.student.v2.ui.sports.v3.service.step;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class V3StepObserver implements androidx.lifecycle.LifecycleObserver, android.hardware.SensorEventListener {

    @org.jetbrains.annotations.NotNull
    private com.bxkj.student.v2.ui.sports.v3.service.step.V3StepService a;

    @org.jetbrains.annotations.Nullable
    private android.hardware.SensorManager b;
    private boolean c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;

    @org.jetbrains.annotations.Nullable
    private com.bxkj.student.run.app.step.accelerometer.a i;

    @org.jetbrains.annotations.NotNull
    private final java.util.concurrent.ScheduledExecutorService j;
    private int k;

    /* renamed from: l, reason: collision with root package name */
    @org.jetbrains.annotations.Nullable
    private cn.bluemobi.dylan.base.view.iOSTwoButtonDialog f1494l;

    /* renamed from: m, reason: collision with root package name */
    private long f1495m;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.student.v2.ui.sports.v3.service.step.V3StepObserver$createRecorder$1", f = "V3StepObserver.kt", i = {0, 0, 0, 0}, l = {324}, m = "invokeSuspend", n = {"identify", "userNumber", "sportsDb", "sportsType"}, s = {"L$0", "L$1", "L$2", "I$0"})
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nV3StepObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 V3StepObserver.kt\ncom/bxkj/student/v2/ui/sports/v3/service/step/V3StepObserver$createRecorder$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,531:1\n1#2:532\n*E\n"})
    static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.r0, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        int a;
        java.lang.Object b;
        java.lang.Object c;
        java.lang.Object d;
        int e;
        final /* synthetic */ com.bxkj.student.v2.ui.sports.v3.service.step.V3StepObserver f;

        a(com.bxkj.student.v2.ui.sports.v3.service.step.V3StepObserver r1, kotlin.coroutines.e<? super com.bxkj.student.v2.ui.sports.v3.service.step.V3StepObserver.a> r2) {
                r0 = this;
                r0.f = r1
                r1 = 2
                r0.<init>(r1, r2)
                return
        }

        public final kotlin.coroutines.e<kotlin.n1> create(java.lang.Object r2, kotlin.coroutines.e<?> r3) {
                r1 = this;
                com.bxkj.student.v2.ui.sports.v3.service.step.V3StepObserver$a r2 = new com.bxkj.student.v2.ui.sports.v3.service.step.V3StepObserver$a
                com.bxkj.student.v2.ui.sports.v3.service.step.V3StepObserver r0 = r1.f
                r2.<init>(r0, r3)
                return r2
        }

        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
                r0 = this;
                kotlinx.coroutines.r0 r1 = (kotlinx.coroutines.r0) r1
                kotlin.coroutines.e r2 = (kotlin.coroutines.e) r2
                java.lang.Object r1 = r0.invoke(r1, r2)
                return r1
        }

        public final java.lang.Object invoke(kotlinx.coroutines.r0 r1, kotlin.coroutines.e<? super kotlin.n1> r2) {
                r0 = this;
                kotlin.coroutines.e r1 = r0.create(r1, r2)
                com.bxkj.student.v2.ui.sports.v3.service.step.V3StepObserver$a r1 = (com.bxkj.student.v2.ui.sports.v3.service.step.V3StepObserver.a) r1
                kotlin.n1 r2 = kotlin.n1.a
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        public final java.lang.Object invokeSuspend(java.lang.Object r40) {
                r39 = this;
                r1 = r39
                java.lang.String r0 = "toJSONString(...)"
                java.lang.Object r2 = kotlin.coroutines.intrinsics.a.l()
                int r3 = r1.e
                r5 = 1
                if (r3 == 0) goto L2d
                if (r3 != r5) goto L25
                java.lang.Object r0 = r1.d
                l0.d r0 = (l0.d) r0
                java.lang.Object r0 = r1.c
                java.lang.String r0 = (java.lang.String) r0
                java.lang.Object r0 = r1.b
                java.lang.String r0 = (java.lang.String) r0
                kotlin.g0.n(r40)     // Catch: java.lang.Exception -> L20
                goto L17e
            L20:
                r0 = move-exception
                r38 = 0
                goto L160
            L25:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r2)
                throw r0
            L2d:
                kotlin.g0.n(r40)
                com.bxkj.student.v2.common.data.i$a r3 = com.bxkj.student.v2.common.data.i.a     // Catch: java.lang.Exception -> L20
                java.util.Map r6 = r3.B()     // Catch: java.lang.Exception -> L20
                java.lang.String r7 = "runType"
                java.lang.Object r6 = r6.get(r7)     // Catch: java.lang.Exception -> L20
                if (r6 != 0) goto L42
                java.lang.Integer r6 = kotlin.coroutines.jvm.internal.a.f(r5)     // Catch: java.lang.Exception -> L20
            L42:
                if (r6 != 0) goto L48
                java.lang.Integer r6 = kotlin.coroutines.jvm.internal.a.f(r5)     // Catch: java.lang.Exception -> L20
            L48:
                java.lang.String r6 = r6.toString()     // Catch: java.lang.Exception -> L20
                int r6 = java.lang.Integer.parseInt(r6)     // Catch: java.lang.Exception -> L20
                java.util.Map r7 = r3.B()     // Catch: java.lang.Exception -> L20
                java.lang.String r8 = "identify"
                java.lang.Object r7 = r7.get(r8)     // Catch: java.lang.Exception -> L20
                if (r7 != 0) goto L5e
                java.lang.String r7 = ""
            L5e:
                java.lang.String r9 = java.lang.String.valueOf(r7)     // Catch: java.lang.Exception -> L20
                boolean r7 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Exception -> L20
                if (r7 == 0) goto L74
                com.bxkj.student.v2.ui.sports.v3.service.step.V3StepObserver r0 = r1.f     // Catch: java.lang.Exception -> L20
                com.bxkj.student.v2.ui.sports.v3.service.step.V3StepService r0 = r0.k()     // Catch: java.lang.Exception -> L20
                r0.stopSelf()     // Catch: java.lang.Exception -> L20
                kotlin.n1 r0 = kotlin.n1.a     // Catch: java.lang.Exception -> L20
                return r0
            L74:
                com.bxkj.base.v2.data.b$a r7 = com.bxkj.base.v2.data.b.d     // Catch: java.lang.Exception -> L20
                com.bxkj.base.v2.data.b r7 = r7.a()     // Catch: java.lang.Exception -> L20
                java.lang.String r10 = r7.S()     // Catch: java.lang.Exception -> L20
                l0.d r8 = new l0.d     // Catch: java.lang.Exception -> L20
                java.lang.String r11 = java.lang.String.valueOf(r6)     // Catch: java.lang.Exception -> L20
                java.util.Map r7 = r3.B()     // Catch: java.lang.Exception -> L20
                java.lang.String r12 = com.alibaba.fastjson.JSON.toJSONString(r7)     // Catch: java.lang.Exception -> L20
                kotlin.jvm.internal.g0.o(r12, r0)     // Catch: java.lang.Exception -> L20
                long r13 = r3.D()     // Catch: java.lang.Exception -> L20
                java.lang.String r13 = java.lang.String.valueOf(r13)     // Catch: java.lang.Exception -> L20
                java.lang.String r14 = ""
                long r15 = r3.e()     // Catch: java.lang.Exception -> L20
                java.lang.String r15 = java.lang.String.valueOf(r15)     // Catch: java.lang.Exception -> L20
                double r16 = r3.g()     // Catch: java.lang.Exception -> L20
                java.lang.String r16 = java.lang.String.valueOf(r16)     // Catch: java.lang.Exception -> L20
                double r17 = r3.o()     // Catch: java.lang.Exception -> L20
                java.lang.String r17 = java.lang.String.valueOf(r17)     // Catch: java.lang.Exception -> L20
                java.util.List r7 = r3.s()     // Catch: java.lang.Exception -> L20
                java.lang.String r7 = com.alibaba.fastjson.JSON.toJSONString(r7)     // Catch: java.lang.Exception -> L20
                kotlin.jvm.internal.g0.o(r7, r0)     // Catch: java.lang.Exception -> L20
                java.util.List r18 = r3.m()     // Catch: java.lang.Exception -> L20
                r38 = 0
                java.lang.String r4 = com.alibaba.fastjson.JSON.toJSONString(r18)     // Catch: java.lang.Exception -> L15f
                kotlin.jvm.internal.g0.o(r4, r0)     // Catch: java.lang.Exception -> L15f
                java.util.List r18 = r3.x()     // Catch: java.lang.Exception -> L15f
                java.lang.String r5 = com.alibaba.fastjson.JSON.toJSONString(r18)     // Catch: java.lang.Exception -> L15f
                kotlin.jvm.internal.g0.o(r5, r0)     // Catch: java.lang.Exception -> L15f
                androidx.lifecycle.MutableLiveData r18 = r3.k()     // Catch: java.lang.Exception -> L15f
                java.lang.Object r18 = r18.getValue()     // Catch: java.lang.Exception -> L15f
                java.lang.String r21 = java.lang.String.valueOf(r18)     // Catch: java.lang.Exception -> L15f
                androidx.lifecycle.MutableLiveData r18 = r3.j()     // Catch: java.lang.Exception -> L15f
                java.lang.Object r18 = r18.getValue()     // Catch: java.lang.Exception -> L15f
                java.lang.String r22 = java.lang.String.valueOf(r18)     // Catch: java.lang.Exception -> L15f
                java.lang.String r23 = "0"
                java.lang.String r24 = ""
                java.lang.String r25 = ""
                java.lang.String r26 = ""
                java.lang.String r27 = ""
                java.lang.String r28 = "0"
                java.lang.String r29 = "0.0"
                com.amap.api.maps.model.LatLng r18 = r3.z()     // Catch: java.lang.Exception -> L15f
                r40 = r3
                java.lang.String r3 = com.alibaba.fastjson.JSON.toJSONString(r18)     // Catch: java.lang.Exception -> L15f
                kotlin.jvm.internal.g0.o(r3, r0)     // Catch: java.lang.Exception -> L15f
                int r0 = r40.I()     // Catch: java.lang.Exception -> L15f
                java.lang.String r31 = java.lang.String.valueOf(r0)     // Catch: java.lang.Exception -> L15f
                com.bxkj.base.v2.common.utils.x r0 = com.bxkj.base.v2.common.utils.x.a     // Catch: java.lang.Exception -> L15f
                r30 = r3
                java.util.Map r3 = r40.B()     // Catch: java.lang.Exception -> L15f
                r19 = r4
                java.lang.String r4 = "remarkId"
                java.lang.String r35 = r0.t(r3, r4)     // Catch: java.lang.Exception -> L15f
                r36 = 58720256(0x3800000, float:7.523164E-37)
                r37 = 0
                r32 = 0
                r33 = 0
                r34 = 0
                r20 = r5
                r18 = r7
                r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)     // Catch: java.lang.Exception -> L15f
                com.bxkj.student.v2.common.db.AppDatabase$a r0 = com.bxkj.student.v2.common.db.AppDatabase.a     // Catch: java.lang.Exception -> L15f
                com.bxkj.student.v2.common.db.AppDatabase r0 = r0.a()     // Catch: java.lang.Exception -> L15f
                com.bxkj.student.v2.common.db.dao.y r0 = r0.z()     // Catch: java.lang.Exception -> L15f
                if (r0 == 0) goto L17e
                r3 = 1
                l0.d[] r4 = new l0.d[r3]     // Catch: java.lang.Exception -> L15f
                r4[r38] = r8     // Catch: java.lang.Exception -> L15f
                java.lang.Object r3 = kotlin.coroutines.jvm.internal.j.a(r9)     // Catch: java.lang.Exception -> L15f
                r1.b = r3     // Catch: java.lang.Exception -> L15f
                java.lang.Object r3 = kotlin.coroutines.jvm.internal.j.a(r10)     // Catch: java.lang.Exception -> L15f
                r1.c = r3     // Catch: java.lang.Exception -> L15f
                java.lang.Object r3 = kotlin.coroutines.jvm.internal.j.a(r8)     // Catch: java.lang.Exception -> L15f
                r1.d = r3     // Catch: java.lang.Exception -> L15f
                r1.a = r6     // Catch: java.lang.Exception -> L15f
                r3 = 1
                r1.e = r3     // Catch: java.lang.Exception -> L15f
                java.lang.Object r0 = r0.n(r4, r1)     // Catch: java.lang.Exception -> L15f
                if (r0 != r2) goto L17e
                return r2
            L15f:
                r0 = move-exception
            L160:
                java.lang.String r2 = r0.getMessage()
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "createRecorder异常"
                r3.append(r4)
                r3.append(r2)
                java.lang.String r2 = r3.toString()
                r3 = 0
                java.lang.Object[] r3 = new java.lang.Object[r3]
                com.orhanobut.logger.j.e(r2, r3)
                com.tencent.bugly.crashreport.CrashReport.postCatchedException(r0)
            L17e:
                kotlin.n1 r0 = kotlin.n1.a
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.student.v2.ui.sports.v3.service.step.V3StepObserver$recorderLocation$1", f = "V3StepObserver.kt", i = {0}, l = {351}, m = "invokeSuspend", n = {"identify"}, s = {"L$0"})
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nV3StepObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 V3StepObserver.kt\ncom/bxkj/student/v2/ui/sports/v3/service/step/V3StepObserver$recorderLocation$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,531:1\n1#2:532\n*E\n"})
    static final class b extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.r0, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        java.lang.Object a;
        int b;
        final /* synthetic */ com.bxkj.student.v2.ui.sports.v3.service.step.V3StepObserver c;

        b(com.bxkj.student.v2.ui.sports.v3.service.step.V3StepObserver r1, kotlin.coroutines.e<? super com.bxkj.student.v2.ui.sports.v3.service.step.V3StepObserver.b> r2) {
                r0 = this;
                r0.c = r1
                r1 = 2
                r0.<init>(r1, r2)
                return
        }

        public final kotlin.coroutines.e<kotlin.n1> create(java.lang.Object r2, kotlin.coroutines.e<?> r3) {
                r1 = this;
                com.bxkj.student.v2.ui.sports.v3.service.step.V3StepObserver$b r2 = new com.bxkj.student.v2.ui.sports.v3.service.step.V3StepObserver$b
                com.bxkj.student.v2.ui.sports.v3.service.step.V3StepObserver r0 = r1.c
                r2.<init>(r0, r3)
                return r2
        }

        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
                r0 = this;
                kotlinx.coroutines.r0 r1 = (kotlinx.coroutines.r0) r1
                kotlin.coroutines.e r2 = (kotlin.coroutines.e) r2
                java.lang.Object r1 = r0.invoke(r1, r2)
                return r1
        }

        public final java.lang.Object invoke(kotlinx.coroutines.r0 r1, kotlin.coroutines.e<? super kotlin.n1> r2) {
                r0 = this;
                kotlin.coroutines.e r1 = r0.create(r1, r2)
                com.bxkj.student.v2.ui.sports.v3.service.step.V3StepObserver$b r1 = (com.bxkj.student.v2.ui.sports.v3.service.step.V3StepObserver.b) r1
                kotlin.n1 r2 = kotlin.n1.a
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
                r19 = this;
                r13 = r19
                java.lang.String r0 = "identify"
                java.lang.String r1 = "toJSONString(...)"
                java.lang.Object r14 = kotlin.coroutines.intrinsics.a.l()
                int r2 = r13.b
                r15 = 0
                r3 = 1
                if (r2 == 0) goto L26
                if (r2 != r3) goto L1e
                java.lang.Object r0 = r13.a
                java.lang.String r0 = (java.lang.String) r0
                kotlin.g0.n(r20)     // Catch: java.lang.Exception -> L1b
                goto L128
            L1b:
                r0 = move-exception
                goto L10a
            L1e:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L26:
                kotlin.g0.n(r20)
                com.bxkj.student.v2.common.data.i$a r2 = com.bxkj.student.v2.common.data.i.a     // Catch: java.lang.Exception -> L1b
                java.util.Map r4 = r2.B()     // Catch: java.lang.Exception -> L1b
                java.lang.Object r4 = r4.get(r0)     // Catch: java.lang.Exception -> L1b
                if (r4 != 0) goto L37
                java.lang.String r4 = ""
            L37:
                java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.lang.Exception -> L1b
                boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Exception -> L1b
                if (r5 == 0) goto L4d
                com.bxkj.student.v2.ui.sports.v3.service.step.V3StepObserver r0 = r13.c     // Catch: java.lang.Exception -> L1b
                com.bxkj.student.v2.ui.sports.v3.service.step.V3StepService r0 = r0.k()     // Catch: java.lang.Exception -> L1b
                r0.stopSelf()     // Catch: java.lang.Exception -> L1b
                kotlin.n1 r0 = kotlin.n1.a     // Catch: java.lang.Exception -> L1b
                return r0
            L4d:
                long r5 = r2.D()     // Catch: java.lang.Exception -> L1b
                r7 = 0
                int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r9 != 0) goto L6a
                java.lang.String r0 = "记录跑步数据但是跑步已结束"
                java.lang.Object[] r1 = new java.lang.Object[r15]     // Catch: java.lang.Exception -> L1b
                com.orhanobut.logger.j.e(r0, r1)     // Catch: java.lang.Exception -> L1b
                com.bxkj.student.v2.ui.sports.v3.service.step.V3StepObserver r0 = r13.c     // Catch: java.lang.Exception -> L1b
                com.bxkj.student.v2.ui.sports.v3.service.step.V3StepService r0 = r0.k()     // Catch: java.lang.Exception -> L1b
                r0.stopSelf()     // Catch: java.lang.Exception -> L1b
                kotlin.n1 r0 = kotlin.n1.a     // Catch: java.lang.Exception -> L1b
                return r0
            L6a:
                com.bxkj.student.v2.common.db.AppDatabase$a r5 = com.bxkj.student.v2.common.db.AppDatabase.a     // Catch: java.lang.Exception -> L1b
                com.bxkj.student.v2.common.db.AppDatabase r5 = r5.a()     // Catch: java.lang.Exception -> L1b
                com.bxkj.student.v2.common.db.dao.y r5 = r5.z()     // Catch: java.lang.Exception -> L1b
                if (r5 == 0) goto L128
                long r6 = r2.e()     // Catch: java.lang.Exception -> L1b
                java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch: java.lang.Exception -> L1b
                double r7 = r2.g()     // Catch: java.lang.Exception -> L1b
                java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch: java.lang.Exception -> L1b
                double r8 = r2.o()     // Catch: java.lang.Exception -> L1b
                java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch: java.lang.Exception -> L1b
                java.util.List r9 = r2.s()     // Catch: java.lang.Exception -> L1b
                java.lang.String r9 = com.alibaba.fastjson.JSON.toJSONString(r9)     // Catch: java.lang.Exception -> L1b
                kotlin.jvm.internal.g0.o(r9, r1)     // Catch: java.lang.Exception -> L1b
                java.util.List r10 = r2.m()     // Catch: java.lang.Exception -> L1b
                java.lang.String r10 = com.alibaba.fastjson.JSON.toJSONString(r10)     // Catch: java.lang.Exception -> L1b
                kotlin.jvm.internal.g0.o(r10, r1)     // Catch: java.lang.Exception -> L1b
                java.util.List r11 = r2.x()     // Catch: java.lang.Exception -> L1b
                java.lang.String r11 = com.alibaba.fastjson.JSON.toJSONString(r11)     // Catch: java.lang.Exception -> L1b
                kotlin.jvm.internal.g0.o(r11, r1)     // Catch: java.lang.Exception -> L1b
                androidx.lifecycle.MutableLiveData r12 = r2.k()     // Catch: java.lang.Exception -> L1b
                java.lang.Object r12 = r12.getValue()     // Catch: java.lang.Exception -> L1b
                java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch: java.lang.Exception -> L1b
                androidx.lifecycle.MutableLiveData r16 = r2.j()     // Catch: java.lang.Exception -> L1b
                java.lang.Object r16 = r16.getValue()     // Catch: java.lang.Exception -> L1b
                java.lang.String r16 = java.lang.String.valueOf(r16)     // Catch: java.lang.Exception -> L1b
                com.bxkj.base.v2.common.utils.x r15 = com.bxkj.base.v2.common.utils.x.a     // Catch: java.lang.Exception -> L1b
                java.util.Map r3 = r2.B()     // Catch: java.lang.Exception -> L1b
                java.lang.String r0 = r15.t(r3, r0)     // Catch: java.lang.Exception -> L1b
                double r17 = r2.i()     // Catch: java.lang.Exception -> L1b
                java.lang.String r3 = java.lang.String.valueOf(r17)     // Catch: java.lang.Exception -> L1b
                com.amap.api.maps.model.LatLng r15 = r2.z()     // Catch: java.lang.Exception -> L1b
                java.lang.String r15 = com.alibaba.fastjson.JSON.toJSONString(r15)     // Catch: java.lang.Exception -> L1b
                kotlin.jvm.internal.g0.o(r15, r1)     // Catch: java.lang.Exception -> L1b
                int r1 = r2.I()     // Catch: java.lang.Exception -> L1b
                java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Exception -> L1b
                java.lang.Object r2 = kotlin.coroutines.jvm.internal.j.a(r4)     // Catch: java.lang.Exception -> L1b
                r13.a = r2     // Catch: java.lang.Exception -> L1b
                r2 = 1
                r13.b = r2     // Catch: java.lang.Exception -> L1b
                r2 = r7
                r4 = r9
                r7 = r12
                r9 = r0
                r12 = r1
                r0 = r5
                r1 = r6
                r5 = r10
                r6 = r11
                r11 = r15
                r10 = r3
                r3 = r8
                r8 = r16
                java.lang.Object r0 = r0.o(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Exception -> L1b
                if (r0 != r14) goto L128
                return r14
            L10a:
                java.lang.String r1 = r0.getMessage()
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "recorderLocation异常"
                r2.append(r3)
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                r2 = 0
                java.lang.Object[] r2 = new java.lang.Object[r2]
                com.orhanobut.logger.j.e(r1, r2)
                com.tencent.bugly.crashreport.CrashReport.postCatchedException(r0)
            L128:
                kotlin.n1 r0 = kotlin.n1.a
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.student.v2.ui.sports.v3.service.step.V3StepObserver$showExceptionTraceDialog$1", f = "V3StepObserver.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.r0, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        int a;
        final /* synthetic */ com.bxkj.student.v2.ui.sports.v3.service.step.V3StepObserver b;

        c(com.bxkj.student.v2.ui.sports.v3.service.step.V3StepObserver r1, kotlin.coroutines.e<? super com.bxkj.student.v2.ui.sports.v3.service.step.V3StepObserver.c> r2) {
                r0 = this;
                r0.b = r1
                r1 = 2
                r0.<init>(r1, r2)
                return
        }

        public final kotlin.coroutines.e<kotlin.n1> create(java.lang.Object r2, kotlin.coroutines.e<?> r3) {
                r1 = this;
                com.bxkj.student.v2.ui.sports.v3.service.step.V3StepObserver$c r2 = new com.bxkj.student.v2.ui.sports.v3.service.step.V3StepObserver$c
                com.bxkj.student.v2.ui.sports.v3.service.step.V3StepObserver r0 = r1.b
                r2.<init>(r0, r3)
                return r2
        }

        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
                r0 = this;
                kotlinx.coroutines.r0 r1 = (kotlinx.coroutines.r0) r1
                kotlin.coroutines.e r2 = (kotlin.coroutines.e) r2
                java.lang.Object r1 = r0.invoke(r1, r2)
                return r1
        }

        public final java.lang.Object invoke(kotlinx.coroutines.r0 r1, kotlin.coroutines.e<? super kotlin.n1> r2) {
                r0 = this;
                kotlin.coroutines.e r1 = r0.create(r1, r2)
                com.bxkj.student.v2.ui.sports.v3.service.step.V3StepObserver$c r1 = (com.bxkj.student.v2.ui.sports.v3.service.step.V3StepObserver.c) r1
                kotlin.n1 r2 = kotlin.n1.a
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        public final java.lang.Object invokeSuspend(java.lang.Object r3) {
                r2 = this;
                kotlin.coroutines.intrinsics.a.l()
                int r0 = r2.a
                if (r0 != 0) goto L42
                kotlin.g0.n(r3)
                com.bxkj.student.v2.common.utils.a r3 = com.bxkj.student.v2.common.utils.a.a
                android.app.Activity r3 = r3.a()
                if (r3 == 0) goto L27
                com.bxkj.student.App$a r0 = com.bxkj.student.App.d
                com.bxkj.student.App r0 = r0.a()
                r1 = 2131951889(0x7f130111, float:1.9540205E38)
                java.lang.String r0 = r0.getString(r1)
                java.lang.String r1 = "getString(...)"
                kotlin.jvm.internal.g0.o(r0, r1)
                com.bxkj.base.v2.common.ext.ContextExtKt.m(r3, r0)
            L27:
                com.bxkj.student.v2.ui.sports.v3.service.step.V3StepObserver r3 = r2.b
                com.bxkj.student.v2.ui.sports.v3.service.step.V3StepService r3 = r3.k()
                java.lang.String r0 = "vibrator"
                java.lang.Object r3 = r3.getSystemService(r0)
                java.lang.String r0 = "null cannot be cast to non-null type android.os.Vibrator"
                kotlin.jvm.internal.g0.n(r3, r0)
                android.os.Vibrator r3 = (android.os.Vibrator) r3
                r0 = 2000(0x7d0, double:9.88E-321)
                r3.vibrate(r0)
                kotlin.n1 r3 = kotlin.n1.a
                return r3
            L42:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r3.<init>(r0)
                throw r3
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.student.v2.ui.sports.v3.service.step.V3StepObserver$showExceptionTraceDialogConfirm$1", f = "V3StepObserver.kt", i = {0, 0, 0}, l = {273}, m = "invokeSuspend", n = {"mActivity", "msg", "$i$a$-let-V3StepObserver$showExceptionTraceDialogConfirm$1$2"}, s = {"L$0", "L$1", "I$0"})
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nV3StepObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 V3StepObserver.kt\ncom/bxkj/student/v2/ui/sports/v3/service/step/V3StepObserver$showExceptionTraceDialogConfirm$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,531:1\n1#2:532\n*E\n"})
    static final class d extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.r0, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        java.lang.Object a;
        java.lang.Object b;
        int c;
        int d;
        final /* synthetic */ com.bxkj.student.v2.ui.sports.v3.service.step.V3StepObserver e;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.student.v2.ui.sports.v3.service.step.V3StepObserver$showExceptionTraceDialogConfirm$1$2$3", f = "V3StepObserver.kt", i = {0, 0}, l = {277}, m = "invokeSuspend", n = {"identify", "sportsSetJson"}, s = {"L$0", "L$1"})
        static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.r0, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
            java.lang.Object a;
            java.lang.Object b;
            int c;

            a(kotlin.coroutines.e<? super com.bxkj.student.v2.ui.sports.v3.service.step.V3StepObserver.d.a> r2) {
                    r1 = this;
                    r0 = 2
                    r1.<init>(r0, r2)
                    return
            }

            public final kotlin.coroutines.e<kotlin.n1> create(java.lang.Object r1, kotlin.coroutines.e<?> r2) {
                    r0 = this;
                    com.bxkj.student.v2.ui.sports.v3.service.step.V3StepObserver$d$a r1 = new com.bxkj.student.v2.ui.sports.v3.service.step.V3StepObserver$d$a
                    r1.<init>(r2)
                    return r1
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
                    r0 = this;
                    kotlinx.coroutines.r0 r1 = (kotlinx.coroutines.r0) r1
                    kotlin.coroutines.e r2 = (kotlin.coroutines.e) r2
                    java.lang.Object r1 = r0.invoke(r1, r2)
                    return r1
            }

            public final java.lang.Object invoke(kotlinx.coroutines.r0 r1, kotlin.coroutines.e<? super kotlin.n1> r2) {
                    r0 = this;
                    kotlin.coroutines.e r1 = r0.create(r1, r2)
                    com.bxkj.student.v2.ui.sports.v3.service.step.V3StepObserver$d$a r1 = (com.bxkj.student.v2.ui.sports.v3.service.step.V3StepObserver.d.a) r1
                    kotlin.n1 r2 = kotlin.n1.a
                    java.lang.Object r1 = r1.invokeSuspend(r2)
                    return r1
            }

            public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                    r5 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
                    int r1 = r5.c
                    r2 = 1
                    if (r1 == 0) goto L1f
                    if (r1 != r2) goto L17
                    java.lang.Object r0 = r5.b
                    java.lang.String r0 = (java.lang.String) r0
                    java.lang.Object r0 = r5.a
                    java.lang.String r0 = (java.lang.String) r0
                    kotlin.g0.n(r6)
                    goto L69
                L17:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r0)
                    throw r6
                L1f:
                    kotlin.g0.n(r6)
                    com.bxkj.student.v2.common.data.i$a r6 = com.bxkj.student.v2.common.data.i.a
                    java.util.Map r1 = r6.B()
                    java.lang.String r3 = "exceptionTrace"
                    java.lang.Boolean r4 = kotlin.coroutines.jvm.internal.a.a(r2)
                    r1.put(r3, r4)
                    com.bxkj.base.v2.common.utils.x r1 = com.bxkj.base.v2.common.utils.x.a
                    java.util.Map r3 = r6.B()
                    java.lang.String r4 = "identify"
                    java.lang.String r1 = r1.t(r3, r4)
                    java.util.Map r6 = r6.B()
                    java.lang.String r6 = com.alibaba.fastjson.JSON.toJSONString(r6)
                    com.bxkj.student.v2.common.db.AppDatabase$a r3 = com.bxkj.student.v2.common.db.AppDatabase.a
                    com.bxkj.student.v2.common.db.AppDatabase r3 = r3.a()
                    com.bxkj.student.v2.common.db.dao.y r3 = r3.z()
                    if (r3 == 0) goto L69
                    kotlin.jvm.internal.g0.m(r6)
                    java.lang.Object r4 = kotlin.coroutines.jvm.internal.j.a(r1)
                    r5.a = r4
                    java.lang.Object r4 = kotlin.coroutines.jvm.internal.j.a(r6)
                    r5.b = r4
                    r5.c = r2
                    java.lang.Object r6 = r3.g(r6, r1, r5)
                    if (r6 != r0) goto L69
                    return r0
                L69:
                    kotlin.n1 r6 = kotlin.n1.a
                    return r6
            }
        }

        d(com.bxkj.student.v2.ui.sports.v3.service.step.V3StepObserver r1, kotlin.coroutines.e<? super com.bxkj.student.v2.ui.sports.v3.service.step.V3StepObserver.d> r2) {
                r0 = this;
                r0.e = r1
                r1 = 2
                r0.<init>(r1, r2)
                return
        }

        public static /* synthetic */ kotlin.n1 f(android.app.Activity r0, cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r1) {
                kotlin.n1 r0 = k(r0, r1)
                return r0
        }

        public static /* synthetic */ kotlin.n1 i(android.app.Activity r0, cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r1) {
                kotlin.n1 r0 = j(r0, r1)
                return r0
        }

        private static final kotlin.n1 j(android.app.Activity r1, cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r2) {
                com.bxkj.student.v2.ui.sports.v3.service.m$a r2 = com.bxkj.student.v2.ui.sports.v3.service.m.a
                r2.c(r1)
                com.bxkj.base.v2.common.utils.h0 r2 = new com.bxkj.base.v2.common.utils.h0
                r2.<init>(r1)
                r2.c()
                android.content.Intent r2 = new android.content.Intent
                java.lang.Class<com.bxkj.student.v2.ui.sports.set.PermissionSetActivity> r0 = com.bxkj.student.v2.ui.sports.set.PermissionSetActivity.class
                r2.<init>(r1, r0)
                r1.startActivity(r2)
                kotlin.n1 r1 = kotlin.n1.a
                return r1
        }

        private static final kotlin.n1 k(android.app.Activity r0, cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r1) {
                com.bxkj.student.v2.ui.sports.v3.service.m$a r1 = com.bxkj.student.v2.ui.sports.v3.service.m.a
                r1.c(r0)
                com.bxkj.base.v2.common.utils.h0 r1 = new com.bxkj.base.v2.common.utils.h0
                r1.<init>(r0)
                r1.c()
                kotlin.n1 r0 = kotlin.n1.a
                return r0
        }

        public final kotlin.coroutines.e<kotlin.n1> create(java.lang.Object r2, kotlin.coroutines.e<?> r3) {
                r1 = this;
                com.bxkj.student.v2.ui.sports.v3.service.step.V3StepObserver$d r2 = new com.bxkj.student.v2.ui.sports.v3.service.step.V3StepObserver$d
                com.bxkj.student.v2.ui.sports.v3.service.step.V3StepObserver r0 = r1.e
                r2.<init>(r0, r3)
                return r2
        }

        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
                r0 = this;
                kotlinx.coroutines.r0 r1 = (kotlinx.coroutines.r0) r1
                kotlin.coroutines.e r2 = (kotlin.coroutines.e) r2
                java.lang.Object r1 = r0.invoke(r1, r2)
                return r1
        }

        public final java.lang.Object invoke(kotlinx.coroutines.r0 r1, kotlin.coroutines.e<? super kotlin.n1> r2) {
                r0 = this;
                kotlin.coroutines.e r1 = r0.create(r1, r2)
                com.bxkj.student.v2.ui.sports.v3.service.step.V3StepObserver$d r1 = (com.bxkj.student.v2.ui.sports.v3.service.step.V3StepObserver.d) r1
                kotlin.n1 r2 = kotlin.n1.a
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
                r11 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
                int r1 = r11.d
                r2 = 1
                if (r1 == 0) goto L20
                if (r1 != r2) goto L18
                java.lang.Object r0 = r11.b
                java.lang.String r0 = (java.lang.String) r0
                java.lang.Object r0 = r11.a
                android.app.Activity r0 = (android.app.Activity) r0
                kotlin.g0.n(r12)
                goto Lb9
            L18:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L20:
                kotlin.g0.n(r12)
                com.bxkj.student.v2.common.utils.a r12 = com.bxkj.student.v2.common.utils.a.a
                android.app.Activity r12 = r12.a()
                if (r12 == 0) goto Lb9
                boolean r1 = r12 instanceof com.bxkj.student.v2.ui.sports.v3.V4SportActivity
                r3 = 0
                if (r1 == 0) goto L32
                r4 = r12
                goto L33
            L32:
                r4 = r3
            L33:
                if (r4 == 0) goto Lb9
                com.bxkj.student.v2.ui.sports.v3.service.step.V3StepObserver r12 = r11.e
                cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r1 = r12.i()
                if (r1 == 0) goto L46
                boolean r1 = r1.isShowing()
                if (r1 != r2) goto L46
                kotlin.n1 r12 = kotlin.n1.a
                return r12
            L46:
                long r5 = java.lang.System.currentTimeMillis()
                long r7 = r12.j()
                long r5 = r5 - r7
                r7 = 60000(0xea60, double:2.9644E-319)
                int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r1 >= 0) goto L59
                kotlin.n1 r12 = kotlin.n1.a
                return r12
            L59:
                long r5 = java.lang.System.currentTimeMillis()
                r12.q(r5)
                com.bxkj.student.App$a r1 = com.bxkj.student.App.d
                com.bxkj.student.App r1 = r1.a()
                r5 = 2131951889(0x7f130111, float:1.9540205E38)
                java.lang.String r6 = r1.getString(r5)
                java.lang.String r1 = "getString(...)"
                kotlin.jvm.internal.g0.o(r6, r1)
                com.bxkj.student.v2.ui.sports.v3.service.m$a r1 = com.bxkj.student.v2.ui.sports.v3.service.m.a
                java.lang.String r5 = "注意"
                r1.e(r4, r5, r6)
                com.bxkj.base.v2.common.utils.h0 r1 = new com.bxkj.base.v2.common.utils.h0
                r1.<init>(r4)
                r1.b()
                com.bxkj.student.v2.ui.sports.v3.service.step.d r7 = new com.bxkj.student.v2.ui.sports.v3.service.step.d
                r7.<init>(r4)
                com.bxkj.student.v2.ui.sports.v3.service.step.e r8 = new com.bxkj.student.v2.ui.sports.v3.service.step.e
                r8.<init>(r4)
                java.lang.String r9 = "继续跑步"
                java.lang.String r10 = "设置运动权限"
                java.lang.String r5 = "注意"
                cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r1 = com.bxkj.base.v2.common.ext.ContextExtKt.g(r4, r5, r6, r7, r8, r9, r10)
                r12.p(r1)
                kotlinx.coroutines.m0 r12 = kotlinx.coroutines.g1.c()
                com.bxkj.student.v2.ui.sports.v3.service.step.V3StepObserver$d$a r1 = new com.bxkj.student.v2.ui.sports.v3.service.step.V3StepObserver$d$a
                r1.<init>(r3)
                java.lang.Object r3 = kotlin.coroutines.jvm.internal.j.a(r4)
                r11.a = r3
                java.lang.Object r3 = kotlin.coroutines.jvm.internal.j.a(r6)
                r11.b = r3
                r3 = 0
                r11.c = r3
                r11.d = r2
                java.lang.Object r12 = kotlinx.coroutines.i.h(r12, r1, r11)
                if (r12 != r0) goto Lb9
                return r0
            Lb9:
                kotlin.n1 r12 = kotlin.n1.a
                return r12
        }
    }

    public V3StepObserver(@org.jetbrains.annotations.NotNull com.bxkj.student.v2.ui.sports.v3.service.step.V3StepService r2) {
            r1 = this;
            java.lang.String r0 = "service"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.a = r2
            r2 = -1
            r1.g = r2
            java.util.concurrent.ScheduledExecutorService r2 = java.util.concurrent.Executors.newSingleThreadScheduledExecutor()
            java.lang.String r0 = "newSingleThreadScheduledExecutor(...)"
            kotlin.jvm.internal.g0.o(r2, r0)
            r1.j = r2
            return
    }

    public static /* synthetic */ void a(com.bxkj.student.v2.ui.sports.v3.service.step.V3StepObserver r0) {
            w(r0)
            return
    }

    public static /* synthetic */ void b(com.bxkj.student.v2.ui.sports.v3.service.step.V3StepObserver r0, int r1) {
            d(r0, r1)
            return
    }

    private final void c() {
            r5 = this;
            com.bxkj.student.run.app.step.accelerometer.a r0 = new com.bxkj.student.run.app.step.accelerometer.a
            r0.<init>()
            r5.i = r0
            int r1 = r5.e
            r0.f(r1)
            android.hardware.SensorManager r0 = r5.b
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L17
            android.hardware.Sensor r0 = r0.getDefaultSensor(r2)
            goto L18
        L17:
            r0 = r1
        L18:
            android.hardware.SensorManager r3 = r5.b
            kotlin.jvm.internal.g0.m(r3)
            com.bxkj.student.run.app.step.accelerometer.a r4 = r5.i
            if (r4 == 0) goto L25
            com.bxkj.student.run.app.step.accelerometer.c r1 = r4.b()
        L25:
            boolean r0 = r3.registerListener(r1, r0, r2)
            com.bxkj.student.run.app.step.accelerometer.a r1 = r5.i
            if (r1 == 0) goto L35
            com.bxkj.student.v2.ui.sports.v3.service.step.c r2 = new com.bxkj.student.v2.ui.sports.v3.service.step.c
            r2.<init>(r5)
            r1.c(r2)
        L35:
            r1 = 0
            if (r0 == 0) goto L40
            java.lang.String r0 = "加速度传感器可以使用"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.orhanobut.logger.j.d(r0, r1)
            return
        L40:
            java.lang.String r0 = "加速度传感器无法使用"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.orhanobut.logger.j.d(r0, r1)
            return
    }

    private static final void d(com.bxkj.student.v2.ui.sports.v3.service.step.V3StepObserver r1, int r2) {
            r1.e = r2
            com.bxkj.student.v2.common.data.i$a r0 = com.bxkj.student.v2.common.data.i.a
            r0.v0(r2)
            int r1 = r1.e
            r0.S(r1)
            return
    }

    private final void e() {
            r5 = this;
            android.hardware.SensorManager r0 = r5.b
            r1 = 0
            r2 = 19
            if (r0 == 0) goto Lc
            android.hardware.Sensor r0 = r0.getDefaultSensor(r2)
            goto Ld
        Lc:
            r0 = r1
        Ld:
            android.hardware.SensorManager r3 = r5.b
            r4 = 18
            if (r3 == 0) goto L17
            android.hardware.Sensor r1 = r3.getDefaultSensor(r4)
        L17:
            r3 = 0
            if (r0 == 0) goto L24
            r5.g = r2
            android.hardware.SensorManager r1 = r5.b
            if (r1 == 0) goto L2f
            r1.registerListener(r5, r0, r3)
            return
        L24:
            if (r1 == 0) goto L30
            r5.g = r4
            android.hardware.SensorManager r0 = r5.b
            if (r0 == 0) goto L2f
            r0.registerListener(r5, r1, r3)
        L2f:
            return
        L30:
            java.lang.String r0 = "Count sensor not available!"
            java.lang.Object[] r1 = new java.lang.Object[r3]
            com.orhanobut.logger.j.d(r0, r1)
            r5.c()
            return
    }

    private final void f() {
            r10 = this;
            com.bxkj.base.v2.common.utils.x r0 = com.bxkj.base.v2.common.utils.x.a
            com.bxkj.student.v2.common.data.i$a r1 = com.bxkj.student.v2.common.data.i.a
            java.util.Map r2 = r1.B()
            java.lang.String r3 = "isCheckExceptionTrace"
            r4 = 1
            int r2 = r0.l(r2, r3, r4)
            if (r2 != 0) goto L13
            goto L8c
        L13:
            java.util.Map r2 = r1.B()
            java.lang.String r3 = "exceptionRatio"
            r5 = 4600877379321698714(0x3fd999999999999a, double:0.4)
            double r2 = r0.g(r2, r3, r5)
            long r5 = r1.e()
            r7 = 30
            r0 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto L55
            com.bxkj.student.v2.common.utils.g$a r5 = com.bxkj.student.v2.common.utils.g.a
            java.util.List r1 = r1.s()
            boolean r1 = r5.d(r1, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "第一次检测isExceptionPoint="
            r2.append(r3)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.orhanobut.logger.j.d(r2, r0)
            if (r1 == 0) goto L8c
            r10.k = r4
            r10.s()
            return
        L55:
            long r5 = r1.e()
            r7 = 60
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto L8c
            com.bxkj.student.v2.common.utils.g$a r5 = com.bxkj.student.v2.common.utils.g.a
            java.util.List r1 = r1.s()
            boolean r1 = r5.d(r1, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "第二次检测isExceptionPoint="
            r2.append(r3)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.orhanobut.logger.j.d(r2, r0)
            if (r1 == 0) goto L8c
            int r0 = r10.k
            if (r0 != r4) goto L89
            r10.t()
            return
        L89:
            r10.s()
        L8c:
            return
    }

    private final void g() {
            r5 = this;
            com.bxkj.base.v2.common.utils.x r0 = com.bxkj.base.v2.common.utils.x.a
            com.bxkj.student.v2.common.data.i$a r1 = com.bxkj.student.v2.common.data.i.a
            java.util.Map r2 = r1.B()
            java.lang.String r3 = "isCheckExceptionTrace2"
            r4 = 1
            int r2 = r0.l(r2, r3, r4)
            if (r2 != 0) goto L12
            goto L38
        L12:
            java.util.Map r2 = r1.B()
            java.lang.String r3 = "checkTraceDuration"
            int r0 = r0.l(r2, r3, r4)
            com.bxkj.student.v2.common.data.PointData r1 = r1.f()
            if (r1 == 0) goto L38
            long r1 = r1.getT()
            long r3 = java.lang.System.currentTimeMillis()
            long r3 = r3 - r1
            r1 = 60000(0xea60, float:8.4078E-41)
            int r0 = r0 * r1
            long r0 = (long) r0
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 < 0) goto L38
            r5.t()
        L38:
            return
    }

    private final void h() {
            r7 = this;
            com.bxkj.student.v2.ui.sports.v3.service.step.V3StepService r0 = r7.a
            androidx.lifecycle.LifecycleCoroutineScope r1 = androidx.lifecycle.LifecycleOwnerKt.getLifecycleScope(r0)
            kotlinx.coroutines.m0 r2 = kotlinx.coroutines.g1.c()
            com.bxkj.student.v2.ui.sports.v3.service.step.V3StepObserver$a r4 = new com.bxkj.student.v2.ui.sports.v3.service.step.V3StepObserver$a
            r0 = 0
            r4.<init>(r7, r0)
            r5 = 2
            r6 = 0
            r3 = 0
            kotlinx.coroutines.i.e(r1, r2, r3, r4, r5, r6)
            return
    }

    private final void l() {
            r1 = this;
            com.bxkj.student.v2.common.data.i$a r0 = com.bxkj.student.v2.common.data.i.a
            int r0 = r0.G()
            r1.e = r0
            r1.f = r0
            return
    }

    private final void m() {
            r12 = this;
            com.bxkj.student.v2.common.data.i$a r0 = com.bxkj.student.v2.common.data.i.a
            boolean r1 = r0.K()
            if (r1 != 0) goto L62
            long r1 = r0.e()
            r3 = 1
            long r7 = r1 + r3
            r0.V(r7)
            r0.T()
            double r1 = r0.g()
            java.lang.String r1 = com.bxkj.student.run.app.utils.i.a(r1, r7)
            double r2 = r0.g()
            java.lang.String r2 = com.bxkj.student.run.app.utils.i.b(r2, r7)
            kotlin.jvm.internal.g0.m(r1)
            r0.U(r1)
            kotlin.jvm.internal.g0.m(r2)
            r0.n0(r2)
            r12.o(r7)
            m0.a$a r5 = m0.a.a
            com.bxkj.student.v2.ui.sports.v3.service.step.V3StepService r6 = r12.a
            double r9 = r0.g()
            int r11 = r0.G()
            r5.a(r6, r7, r9, r11)
            r0 = 60
            long r0 = (long) r0
            long r7 = r7 % r0
            r0 = 0
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 != 0) goto L55
            com.bxkj.student.v2.ui.sports.v3.service.m$a r0 = com.bxkj.student.v2.ui.sports.v3.service.m.a
            com.bxkj.student.v2.ui.sports.v3.service.step.V3StepService r1 = r12.a
            r0.a(r1)
        L55:
            com.bxkj.student.v2.ui.sports.v3.service.m$a r0 = com.bxkj.student.v2.ui.sports.v3.service.m.a
            com.bxkj.student.v2.ui.sports.v3.service.step.V3StepService r1 = r12.a
            r0.f(r1)
            r12.f()
            r12.g()
        L62:
            r12.n()
            return
    }

    private final void n() {
            r7 = this;
            com.bxkj.student.v2.ui.sports.v3.service.step.V3StepService r0 = r7.a
            androidx.lifecycle.LifecycleCoroutineScope r1 = androidx.lifecycle.LifecycleOwnerKt.getLifecycleScope(r0)
            kotlinx.coroutines.m0 r2 = kotlinx.coroutines.g1.c()
            com.bxkj.student.v2.ui.sports.v3.service.step.V3StepObserver$b r4 = new com.bxkj.student.v2.ui.sports.v3.service.step.V3StepObserver$b
            r0 = 0
            r4.<init>(r7, r0)
            r5 = 2
            r6 = 0
            r3 = 0
            kotlinx.coroutines.i.e(r1, r2, r3, r4, r5, r6)
            return
    }

    private final void o(long r8) {
            r7 = this;
            r0 = 60
            long r0 = (long) r0
            long r2 = r8 % r0
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L5e
            long r8 = r8 / r0
            int r0 = r7.e
            int r1 = r7.f
            int r0 = r0 - r1
            com.bxkj.student.v2.common.data.i$a r1 = com.bxkj.student.v2.common.data.i.a
            java.util.List r2 = r1.H()
            int r2 = r2.size()
            long r2 = (long) r2
            int r4 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r4 >= 0) goto L2c
            java.util.List r8 = r1.H()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
            r8.add(r9)
            goto L5a
        L2c:
            java.util.List r8 = r1.H()
            java.util.List r9 = r1.H()
            int r9 = r9.size()
            int r9 = r9 + (-1)
            java.util.List r2 = r1.H()
            java.util.List r1 = r1.H()
            int r1 = r1.size()
            int r1 = r1 + (-1)
            java.lang.Object r1 = r2.get(r1)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            int r1 = r1 + r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r8.set(r9, r0)
        L5a:
            int r8 = r7.e
            r7.f = r8
        L5e:
            return
    }

    private final void s() {
            r7 = this;
            com.bxkj.student.v2.ui.sports.v3.service.step.V3StepService r0 = r7.a
            androidx.lifecycle.LifecycleCoroutineScope r1 = androidx.lifecycle.LifecycleOwnerKt.getLifecycleScope(r0)
            kotlinx.coroutines.p2 r2 = kotlinx.coroutines.g1.e()
            com.bxkj.student.v2.ui.sports.v3.service.step.V3StepObserver$c r4 = new com.bxkj.student.v2.ui.sports.v3.service.step.V3StepObserver$c
            r0 = 0
            r4.<init>(r7, r0)
            r5 = 2
            r6 = 0
            r3 = 0
            kotlinx.coroutines.i.e(r1, r2, r3, r4, r5, r6)
            return
    }

    private final void t() {
            r7 = this;
            com.bxkj.student.v2.ui.sports.v3.service.step.V3StepService r0 = r7.a
            androidx.lifecycle.LifecycleCoroutineScope r1 = androidx.lifecycle.LifecycleOwnerKt.getLifecycleScope(r0)
            kotlinx.coroutines.p2 r2 = kotlinx.coroutines.g1.e()
            com.bxkj.student.v2.ui.sports.v3.service.step.V3StepObserver$d r4 = new com.bxkj.student.v2.ui.sports.v3.service.step.V3StepObserver$d
            r0 = 0
            r4.<init>(r7, r0)
            r5 = 2
            r6 = 0
            r3 = 0
            kotlinx.coroutines.i.e(r1, r2, r3, r4, r5, r6)
            return
    }

    private final void u() {
            r2 = this;
            android.hardware.SensorManager r0 = r2.b
            if (r0 == 0) goto L7
            r0 = 0
            r2.b = r0
        L7:
            com.bxkj.student.v2.ui.sports.v3.service.step.V3StepService r0 = r2.a
            java.lang.String r1 = "sensor"
            java.lang.Object r0 = r0.getSystemService(r1)
            java.lang.String r1 = "null cannot be cast to non-null type android.hardware.SensorManager"
            kotlin.jvm.internal.g0.n(r0, r1)
            android.hardware.SensorManager r0 = (android.hardware.SensorManager) r0
            r2.b = r0
            r2.e()
            return
    }

    private final void v() {
            r7 = this;
            r7.h()
            java.util.concurrent.ScheduledExecutorService r0 = r7.j
            com.bxkj.student.v2.ui.sports.v3.service.step.b r1 = new com.bxkj.student.v2.ui.sports.v3.service.step.b
            r1.<init>(r7)
            r4 = 1000(0x3e8, double:4.94E-321)
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS
            r2 = 0
            r0.scheduleAtFixedRate(r1, r2, r4, r6)
            return
    }

    private static final void w(com.bxkj.student.v2.ui.sports.v3.service.step.V3StepObserver r0) {
            r0.m()
            return
    }

    @org.jetbrains.annotations.Nullable
    public final cn.bluemobi.dylan.base.view.iOSTwoButtonDialog i() {
            r1 = this;
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r1.f1494l
            return r0
    }

    public final long j() {
            r2 = this;
            long r0 = r2.f1495m
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.bxkj.student.v2.ui.sports.v3.service.step.V3StepService k() {
            r1 = this;
            com.bxkj.student.v2.ui.sports.v3.service.step.V3StepService r0 = r1.a
            return r0
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(@org.jetbrains.annotations.Nullable android.hardware.Sensor r1, int r2) {
            r0 = this;
            return
    }

    @androidx.lifecycle.OnLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_CREATE)
    public final void onCreate() {
            r3 = this;
            com.bxkj.student.v2.ui.sports.v3.service.m$a r0 = com.bxkj.student.v2.ui.sports.v3.service.m.a
            com.bxkj.student.v2.ui.sports.v3.service.step.V3StepService r1 = r3.a
            r2 = 0
            r0.d(r1, r2)
            r3.l()
            r3.v()
            r3.u()
            return
    }

    @androidx.lifecycle.OnLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
            r2 = this;
            java.util.concurrent.ScheduledExecutorService r0 = r2.j
            r0.shutdownNow()
            android.hardware.SensorManager r0 = r2.b
            if (r0 == 0) goto Lc
            r0.unregisterListener(r2)
        Lc:
            com.bxkj.student.v2.ui.sports.v3.service.step.V3StepService r0 = r2.a
            r1 = 1
            r0.stopForeground(r1)
            com.bxkj.student.v2.ui.sports.v3.service.m$a r0 = com.bxkj.student.v2.ui.sports.v3.service.m.a
            com.bxkj.student.v2.ui.sports.v3.service.step.V3StepService r1 = r2.a
            r0.b(r1)
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "停止计步服务"
            com.orhanobut.logger.j.d(r1, r0)
            return
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(@org.jetbrains.annotations.NotNull android.hardware.SensorEvent r5) {
            r4 = this;
            java.lang.String r0 = "event"
            kotlin.jvm.internal.g0.p(r5, r0)
            int r0 = r4.g
            r1 = 19
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L65
            float[] r5 = r5.values
            r5 = r5[r3]
            int r5 = (int) r5
            boolean r0 = r4.c
            if (r0 != 0) goto L1b
            r4.c = r2
            r4.d = r5
            goto L52
        L1b:
            int r0 = r4.d
            if (r5 >= r0) goto L3c
            r4.d = r5
            r4.h = r3
            int r5 = r4.e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "系统步数重置，保持当前步数不变: "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.Object[] r0 = new java.lang.Object[r3]
            com.orhanobut.logger.j.e(r5, r0)
            goto L52
        L3c:
            int r5 = r5 - r0
            int r0 = r4.h
            int r0 = r5 - r0
            com.bxkj.student.v2.common.data.i$a r1 = com.bxkj.student.v2.common.data.i.a
            boolean r1 = r1.K()
            if (r1 != 0) goto L50
            if (r0 <= 0) goto L50
            int r1 = r4.e
            int r1 = r1 + r0
            r4.e = r1
        L50:
            r4.h = r5
        L52:
            com.bxkj.student.v2.common.data.i$a r5 = com.bxkj.student.v2.common.data.i.a
            int r0 = r4.e
            int r0 = java.lang.Math.max(r0, r3)
            r5.v0(r0)
            int r0 = r5.G()
            r5.S(r0)
            return
        L65:
            r1 = 18
            if (r0 != r1) goto L8c
            float[] r5 = r5.values
            r5 = r5[r3]
            r0 = 1065353216(0x3f800000, float:1.0)
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 != 0) goto L80
            com.bxkj.student.v2.common.data.i$a r5 = com.bxkj.student.v2.common.data.i.a
            boolean r5 = r5.K()
            if (r5 != 0) goto L80
            int r5 = r4.e
            int r5 = r5 + r2
            r4.e = r5
        L80:
            com.bxkj.student.v2.common.data.i$a r5 = com.bxkj.student.v2.common.data.i.a
            int r0 = r4.e
            r5.v0(r0)
            int r0 = r4.e
            r5.S(r0)
        L8c:
            return
    }

    public final void p(@org.jetbrains.annotations.Nullable cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r1) {
            r0 = this;
            r0.f1494l = r1
            return
    }

    public final void q(long r1) {
            r0 = this;
            r0.f1495m = r1
            return
    }

    public final void r(@org.jetbrains.annotations.NotNull com.bxkj.student.v2.ui.sports.v3.service.step.V3StepService r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.a = r2
            return
    }
}
