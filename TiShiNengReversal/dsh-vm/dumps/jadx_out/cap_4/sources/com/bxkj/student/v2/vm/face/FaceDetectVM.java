package com.bxkj.student.v2.vm.face;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class FaceDetectVM extends com.bxkj.base.v2.base.BaseViewModel {

    @org.jetbrains.annotations.Nullable
    private kotlinx.coroutines.e2 h;

    @org.jetbrains.annotations.Nullable
    private kotlinx.coroutines.e2 i;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.student.v2.vm.face.FaceDetectVM$faceDetectV3$2", f = "FaceDetectVM.kt", i = {}, l = {44}, m = "invokeSuspend", n = {}, s = {})
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nFaceDetectVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FaceDetectVM.kt\ncom/bxkj/student/v2/vm/face/FaceDetectVM$faceDetectV3$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,96:1\n1#2:97\n*E\n"})
    static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        int a;
        final /* synthetic */ java.lang.String b;
        final /* synthetic */ java.lang.String c;
        final /* synthetic */ java.lang.String d;
        final /* synthetic */ java.io.File e;
        final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<java.lang.String> f;
        final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<java.lang.String> g;
        final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.n1> h;

        a(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.io.File r4, kotlin.jvm.internal.Ref.ObjectRef<java.lang.String> r5, kotlin.jvm.internal.Ref.ObjectRef<java.lang.String> r6, kotlin.jvm.functions.Function0<kotlin.n1> r7, kotlin.coroutines.e<? super com.bxkj.student.v2.vm.face.FaceDetectVM.a> r8) {
                r0 = this;
                r0.b = r1
                r0.c = r2
                r0.d = r3
                r0.e = r4
                r0.f = r5
                r0.g = r6
                r0.h = r7
                r1 = 1
                r0.<init>(r1, r8)
                return
        }

        public final kotlin.coroutines.e<kotlin.n1> create(kotlin.coroutines.e<?> r10) {
                r9 = this;
                com.bxkj.student.v2.vm.face.FaceDetectVM$a r0 = new com.bxkj.student.v2.vm.face.FaceDetectVM$a
                java.lang.String r1 = r9.b
                java.lang.String r2 = r9.c
                java.lang.String r3 = r9.d
                java.io.File r4 = r9.e
                kotlin.jvm.internal.Ref$ObjectRef<java.lang.String> r5 = r9.f
                kotlin.jvm.internal.Ref$ObjectRef<java.lang.String> r6 = r9.g
                kotlin.jvm.functions.Function0<kotlin.n1> r7 = r9.h
                r8 = r10
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                return r0
        }

        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1) {
                r0 = this;
                kotlin.coroutines.e r1 = (kotlin.coroutines.e) r1
                java.lang.Object r1 = r0.invoke(r1)
                return r1
        }

        public final java.lang.Object invoke(kotlin.coroutines.e<? super kotlin.n1> r2) {
                r1 = this;
                kotlin.coroutines.e r2 = r1.create(r2)
                com.bxkj.student.v2.vm.face.FaceDetectVM$a r2 = (com.bxkj.student.v2.vm.face.FaceDetectVM.a) r2
                kotlin.n1 r0 = kotlin.n1.a
                java.lang.Object r2 = r2.invokeSuspend(r0)
                return r2
        }

        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
                r12 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
                int r1 = r12.a
                r2 = 1
                if (r1 == 0) goto L18
                if (r1 != r2) goto L10
                kotlin.g0.n(r13)
                r9 = r12
                goto L4c
            L10:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L18:
                kotlin.g0.n(r13)
                com.bxkj.student.v2.repository.face.c r1 = new com.bxkj.student.v2.repository.face.c
                r1.<init>()
                r13 = 1
                java.lang.String r2 = r12.b
                java.lang.String r3 = r12.c
                java.lang.String r4 = r12.d
                java.io.File r5 = r12.e
                java.lang.String r5 = r5.getPath()
                java.lang.String r6 = "getPath(...)"
                kotlin.jvm.internal.g0.o(r5, r6)
                kotlin.jvm.internal.Ref$ObjectRef<java.lang.String> r6 = r12.f
                java.lang.Object r6 = r6.element
                java.lang.String r6 = (java.lang.String) r6
                kotlin.jvm.internal.Ref$ObjectRef<java.lang.String> r7 = r12.g
                java.lang.Object r7 = r7.element
                java.lang.String r7 = (java.lang.String) r7
                r12.a = r13
                r8 = 0
                r10 = 64
                r11 = 0
                r9 = r12
                java.lang.Object r13 = com.bxkj.student.v2.repository.face.c.b(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                if (r13 != r0) goto L4c
                return r0
            L4c:
                java.io.File r13 = r9.e
                boolean r0 = r13.exists()
                if (r0 == 0) goto L55
                goto L56
            L55:
                r13 = 0
            L56:
                if (r13 == 0) goto L5f
                boolean r13 = r13.delete()
                kotlin.coroutines.jvm.internal.a.a(r13)
            L5f:
                kotlin.jvm.functions.Function0<kotlin.n1> r13 = r9.h
                r13.invoke()
                kotlin.n1 r13 = kotlin.n1.a
                return r13
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.student.v2.vm.face.FaceDetectVM$faceDetectV3$3", f = "FaceDetectVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        int a;
        final /* synthetic */ com.bxkj.student.v2.vm.face.FaceDetectVM b;

        b(com.bxkj.student.v2.vm.face.FaceDetectVM r1, kotlin.coroutines.e<? super com.bxkj.student.v2.vm.face.FaceDetectVM.b> r2) {
                r0 = this;
                r0.b = r1
                r1 = 1
                r0.<init>(r1, r2)
                return
        }

        public final kotlin.coroutines.e<kotlin.n1> create(kotlin.coroutines.e<?> r3) {
                r2 = this;
                com.bxkj.student.v2.vm.face.FaceDetectVM$b r0 = new com.bxkj.student.v2.vm.face.FaceDetectVM$b
                com.bxkj.student.v2.vm.face.FaceDetectVM r1 = r2.b
                r0.<init>(r1, r3)
                return r0
        }

        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1) {
                r0 = this;
                kotlin.coroutines.e r1 = (kotlin.coroutines.e) r1
                java.lang.Object r1 = r0.invoke(r1)
                return r1
        }

        public final java.lang.Object invoke(kotlin.coroutines.e<? super kotlin.n1> r2) {
                r1 = this;
                kotlin.coroutines.e r2 = r1.create(r2)
                com.bxkj.student.v2.vm.face.FaceDetectVM$b r2 = (com.bxkj.student.v2.vm.face.FaceDetectVM.b) r2
                kotlin.n1 r0 = kotlin.n1.a
                java.lang.Object r2 = r2.invokeSuspend(r0)
                return r2
        }

        public final java.lang.Object invokeSuspend(java.lang.Object r3) {
                r2 = this;
                kotlin.coroutines.intrinsics.a.l()
                int r0 = r2.a
                if (r0 != 0) goto L1a
                kotlin.g0.n(r3)
                com.bxkj.student.v2.vm.face.FaceDetectVM r3 = r2.b
                kotlinx.coroutines.e2 r3 = com.bxkj.student.v2.vm.face.FaceDetectVM.u(r3)
                if (r3 == 0) goto L17
                r0 = 1
                r1 = 0
                kotlinx.coroutines.e2.a.b(r3, r1, r0, r1)
            L17:
                kotlin.n1 r3 = kotlin.n1.a
                return r3
            L1a:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r3.<init>(r0)
                throw r3
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.student.v2.vm.face.FaceDetectVM$faceDetectV3$4", f = "FaceDetectVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nFaceDetectVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FaceDetectVM.kt\ncom/bxkj/student/v2/vm/face/FaceDetectVM$faceDetectV3$4\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,96:1\n1#2:97\n*E\n"})
    static final class c extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<java.lang.Exception, kotlin.coroutines.e<? super java.lang.Boolean>, java.lang.Object> {
        int a;
        /* synthetic */ java.lang.Object b;
        final /* synthetic */ com.bxkj.student.v2.vm.face.FaceDetectVM c;
        final /* synthetic */ java.io.File d;
        final /* synthetic */ com.bxkj.student.v2.common.data.PointData e;
        final /* synthetic */ java.lang.String f;
        final /* synthetic */ java.lang.String g;
        final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.n1> h;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.student.v2.vm.face.FaceDetectVM$faceDetectV3$4$1", f = "FaceDetectVM.kt", i = {0, 0, 0}, l = {69}, m = "invokeSuspend", n = {"coordinates", "timeStamp", "faceDb"}, s = {"L$0", "L$1", "L$2"})
        @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nFaceDetectVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FaceDetectVM.kt\ncom/bxkj/student/v2/vm/face/FaceDetectVM$faceDetectV3$4$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,96:1\n1#2:97\n*E\n"})
        static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
            java.lang.Object a;
            java.lang.Object b;
            java.lang.Object c;
            int d;
            final /* synthetic */ com.bxkj.student.v2.vm.face.FaceDetectVM e;
            final /* synthetic */ com.bxkj.student.v2.common.data.PointData f;
            final /* synthetic */ java.lang.String g;
            final /* synthetic */ java.lang.String h;
            final /* synthetic */ java.io.File i;
            final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.n1> j;

            a(com.bxkj.student.v2.vm.face.FaceDetectVM r1, com.bxkj.student.v2.common.data.PointData r2, java.lang.String r3, java.lang.String r4, java.io.File r5, kotlin.jvm.functions.Function0<kotlin.n1> r6, kotlin.coroutines.e<? super com.bxkj.student.v2.vm.face.FaceDetectVM.c.a> r7) {
                    r0 = this;
                    r0.e = r1
                    r0.f = r2
                    r0.g = r3
                    r0.h = r4
                    r0.i = r5
                    r0.j = r6
                    r1 = 1
                    r0.<init>(r1, r7)
                    return
            }

            public final kotlin.coroutines.e<kotlin.n1> create(kotlin.coroutines.e<?> r9) {
                    r8 = this;
                    com.bxkj.student.v2.vm.face.FaceDetectVM$c$a r0 = new com.bxkj.student.v2.vm.face.FaceDetectVM$c$a
                    com.bxkj.student.v2.vm.face.FaceDetectVM r1 = r8.e
                    com.bxkj.student.v2.common.data.PointData r2 = r8.f
                    java.lang.String r3 = r8.g
                    java.lang.String r4 = r8.h
                    java.io.File r5 = r8.i
                    kotlin.jvm.functions.Function0<kotlin.n1> r6 = r8.j
                    r7 = r9
                    r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                    return r0
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1) {
                    r0 = this;
                    kotlin.coroutines.e r1 = (kotlin.coroutines.e) r1
                    java.lang.Object r1 = r0.invoke(r1)
                    return r1
            }

            public final java.lang.Object invoke(kotlin.coroutines.e<? super kotlin.n1> r2) {
                    r1 = this;
                    kotlin.coroutines.e r2 = r1.create(r2)
                    com.bxkj.student.v2.vm.face.FaceDetectVM$c$a r2 = (com.bxkj.student.v2.vm.face.FaceDetectVM.c.a) r2
                    kotlin.n1 r0 = kotlin.n1.a
                    java.lang.Object r2 = r2.invokeSuspend(r0)
                    return r2
            }

            public final java.lang.Object invokeSuspend(java.lang.Object r15) {
                    r14 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
                    int r1 = r14.d
                    r2 = 1
                    if (r1 == 0) goto L24
                    if (r1 != r2) goto L1c
                    java.lang.Object r0 = r14.c
                    l0.b r0 = (l0.b) r0
                    java.lang.Object r0 = r14.b
                    kotlin.jvm.internal.Ref$ObjectRef r0 = (kotlin.jvm.internal.Ref.ObjectRef) r0
                    java.lang.Object r0 = r14.a
                    kotlin.jvm.internal.Ref$ObjectRef r0 = (kotlin.jvm.internal.Ref.ObjectRef) r0
                    kotlin.g0.n(r15)
                    goto Lb4
                L1c:
                    java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r15.<init>(r0)
                    throw r15
                L24:
                    kotlin.g0.n(r15)
                    r15 = 0
                    java.lang.Object[] r15 = new java.lang.Object[r15]
                    java.lang.String r1 = "离线跑步人脸识别,将中途人脸识别的照片存储本地！"
                    com.orhanobut.logger.j.d(r1, r15)
                    kotlin.jvm.internal.Ref$ObjectRef r15 = new kotlin.jvm.internal.Ref$ObjectRef
                    r15.<init>()
                    java.lang.String r1 = ""
                    r15.element = r1
                    kotlin.jvm.internal.Ref$ObjectRef r3 = new kotlin.jvm.internal.Ref$ObjectRef
                    r3.<init>()
                    r3.element = r1
                    com.bxkj.student.v2.common.data.PointData r1 = r14.f
                    if (r1 == 0) goto L6b
                    double r4 = r1.getA()
                    double r6 = r1.getO()
                    java.lang.StringBuilder r8 = new java.lang.StringBuilder
                    r8.<init>()
                    r8.append(r4)
                    java.lang.String r4 = ","
                    r8.append(r4)
                    r8.append(r6)
                    java.lang.String r4 = r8.toString()
                    r15.element = r4
                    long r4 = r1.getT()
                    java.lang.String r1 = java.lang.String.valueOf(r4)
                    r3.element = r1
                L6b:
                    l0.b r4 = new l0.b
                    java.lang.String r7 = r14.g
                    java.lang.String r8 = r14.h
                    java.io.File r1 = r14.i
                    java.lang.String r9 = r1.getPath()
                    java.lang.String r1 = "getPath(...)"
                    kotlin.jvm.internal.g0.o(r9, r1)
                    java.lang.Object r1 = r15.element
                    r10 = r1
                    java.lang.String r10 = (java.lang.String) r10
                    java.lang.Object r1 = r3.element
                    r11 = r1
                    java.lang.String r11 = (java.lang.String) r11
                    r12 = 1
                    r13 = 0
                    r5 = 0
                    r4.<init>(r5, r7, r8, r9, r10, r11, r12, r13)
                    com.bxkj.student.v2.common.db.AppDatabase$a r1 = com.bxkj.student.v2.common.db.AppDatabase.a
                    com.bxkj.student.v2.common.db.AppDatabase r1 = r1.a()
                    com.bxkj.student.v2.common.db.dao.g r1 = r1.x()
                    if (r1 == 0) goto Lb4
                    java.lang.Object r15 = kotlin.coroutines.jvm.internal.j.a(r15)
                    r14.a = r15
                    java.lang.Object r15 = kotlin.coroutines.jvm.internal.j.a(r3)
                    r14.b = r15
                    java.lang.Object r15 = kotlin.coroutines.jvm.internal.j.a(r4)
                    r14.c = r15
                    r14.d = r2
                    java.lang.Object r15 = r1.insert(r4, r14)
                    if (r15 != r0) goto Lb4
                    return r0
                Lb4:
                    kotlin.jvm.functions.Function0<kotlin.n1> r15 = r14.j
                    r15.invoke()
                    kotlin.n1 r15 = kotlin.n1.a
                    return r15
            }
        }

        c(com.bxkj.student.v2.vm.face.FaceDetectVM r1, java.io.File r2, com.bxkj.student.v2.common.data.PointData r3, java.lang.String r4, java.lang.String r5, kotlin.jvm.functions.Function0<kotlin.n1> r6, kotlin.coroutines.e<? super com.bxkj.student.v2.vm.face.FaceDetectVM.c> r7) {
                r0 = this;
                r0.c = r1
                r0.d = r2
                r0.e = r3
                r0.f = r4
                r0.g = r5
                r0.h = r6
                r1 = 2
                r0.<init>(r1, r7)
                return
        }

        public final kotlin.coroutines.e<kotlin.n1> create(java.lang.Object r9, kotlin.coroutines.e<?> r10) {
                r8 = this;
                com.bxkj.student.v2.vm.face.FaceDetectVM$c r0 = new com.bxkj.student.v2.vm.face.FaceDetectVM$c
                com.bxkj.student.v2.vm.face.FaceDetectVM r1 = r8.c
                java.io.File r2 = r8.d
                com.bxkj.student.v2.common.data.PointData r3 = r8.e
                java.lang.String r4 = r8.f
                java.lang.String r5 = r8.g
                kotlin.jvm.functions.Function0<kotlin.n1> r6 = r8.h
                r7 = r10
                r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                r0.b = r9
                return r0
        }

        public final java.lang.Object f(java.lang.Exception r1, kotlin.coroutines.e<? super java.lang.Boolean> r2) {
                r0 = this;
                kotlin.coroutines.e r1 = r0.create(r1, r2)
                com.bxkj.student.v2.vm.face.FaceDetectVM$c r1 = (com.bxkj.student.v2.vm.face.FaceDetectVM.c) r1
                kotlin.n1 r2 = kotlin.n1.a
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
                r0 = this;
                java.lang.Exception r1 = (java.lang.Exception) r1
                kotlin.coroutines.e r2 = (kotlin.coroutines.e) r2
                java.lang.Object r1 = r0.f(r1, r2)
                return r1
        }

        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
                r12 = this;
                java.lang.Object r0 = r12.b
                java.lang.Exception r0 = (java.lang.Exception) r0
                kotlin.coroutines.intrinsics.a.l()
                int r1 = r12.a
                if (r1 != 0) goto L53
                kotlin.g0.n(r13)
                boolean r13 = com.bxkj.base.v2.common.ext.e.b(r0)
                if (r13 == 0) goto L3a
                com.bxkj.student.v2.vm.face.FaceDetectVM r0 = r12.c
                com.bxkj.student.v2.vm.face.FaceDetectVM$c$a r1 = new com.bxkj.student.v2.vm.face.FaceDetectVM$c$a
                com.bxkj.student.v2.common.data.PointData r2 = r12.e
                java.lang.String r3 = r12.f
                java.lang.String r4 = r12.g
                java.io.File r5 = r12.d
                kotlin.jvm.functions.Function0<kotlin.n1> r6 = r12.h
                r7 = 0
                r11 = r1
                r1 = r0
                r0 = r11
                r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                r11 = r1
                r1 = r0
                r0 = r11
                r9 = 254(0xfe, float:3.56E-43)
                r10 = 0
                r2 = 0
                r3 = 0
                r4 = 0
                r5 = 0
                r6 = 0
                r8 = 0
                com.bxkj.base.v2.base.BaseViewModel.j(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                r13 = 1
                goto L4e
            L3a:
                java.io.File r13 = r12.d
                boolean r0 = r13.exists()
                if (r0 == 0) goto L43
                goto L44
            L43:
                r13 = 0
            L44:
                if (r13 == 0) goto L4d
                boolean r13 = r13.delete()
                kotlin.coroutines.jvm.internal.a.a(r13)
            L4d:
                r13 = 0
            L4e:
                java.lang.Boolean r13 = kotlin.coroutines.jvm.internal.a.a(r13)
                return r13
            L53:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.student.v2.vm.face.FaceDetectVM$startTimeOut$1", f = "FaceDetectVM.kt", i = {}, l = {83}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.r0, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        int a;
        final /* synthetic */ com.bxkj.student.v2.vm.face.FaceDetectVM b;

        d(com.bxkj.student.v2.vm.face.FaceDetectVM r1, kotlin.coroutines.e<? super com.bxkj.student.v2.vm.face.FaceDetectVM.d> r2) {
                r0 = this;
                r0.b = r1
                r1 = 2
                r0.<init>(r1, r2)
                return
        }

        public final kotlin.coroutines.e<kotlin.n1> create(java.lang.Object r2, kotlin.coroutines.e<?> r3) {
                r1 = this;
                com.bxkj.student.v2.vm.face.FaceDetectVM$d r2 = new com.bxkj.student.v2.vm.face.FaceDetectVM$d
                com.bxkj.student.v2.vm.face.FaceDetectVM r0 = r1.b
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
                com.bxkj.student.v2.vm.face.FaceDetectVM$d r1 = (com.bxkj.student.v2.vm.face.FaceDetectVM.d) r1
                kotlin.n1 r2 = kotlin.n1.a
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
                int r1 = r6.a
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                kotlin.g0.n(r7)
                goto L25
            Lf:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L17:
                kotlin.g0.n(r7)
                r6.a = r2
                r1 = 5000(0x1388, double:2.4703E-320)
                java.lang.Object r7 = kotlinx.coroutines.a1.b(r1, r6)
                if (r7 != r0) goto L25
                return r0
            L25:
                r7 = 0
                java.lang.Object[] r7 = new java.lang.Object[r7]
                java.lang.String r0 = "3秒未请求到接口主动取消"
                com.orhanobut.logger.j.d(r0, r7)
                com.bxkj.student.v2.vm.face.FaceDetectVM r7 = r6.b
                kotlinx.coroutines.e2 r7 = com.bxkj.student.v2.vm.face.FaceDetectVM.t(r7)
                if (r7 == 0) goto L5c
                retrofit2.HttpException r1 = new retrofit2.HttpException
                okhttp3.ResponseBody$Companion r2 = okhttp3.ResponseBody.Companion
                okhttp3.MediaType$Companion r3 = okhttp3.MediaType.Companion
                java.lang.String r4 = "text/plain"
                okhttp3.MediaType r3 = r3.parse(r4)
                java.nio.charset.Charset r4 = kotlin.text.e.b
                byte[] r4 = r0.getBytes(r4)
                java.lang.String r5 = "getBytes(...)"
                kotlin.jvm.internal.g0.o(r4, r5)
                okhttp3.ResponseBody r2 = r2.create(r3, r4)
                r3 = 502(0x1f6, float:7.03E-43)
                retrofit2.c0 r2 = retrofit2.c0.c(r3, r2)
                r1.<init>(r2)
                kotlinx.coroutines.h2.g(r7, r0, r1)
            L5c:
                kotlin.n1 r7 = kotlin.n1.a
                return r7
        }
    }

    public FaceDetectVM() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final /* synthetic */ kotlinx.coroutines.e2 t(com.bxkj.student.v2.vm.face.FaceDetectVM r0) {
            kotlinx.coroutines.e2 r0 = r0.h
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.e2 u(com.bxkj.student.v2.vm.face.FaceDetectVM r0) {
            kotlinx.coroutines.e2 r0 = r0.i
            return r0
    }

    private final void w() {
            r6 = this;
            kotlinx.coroutines.r0 r0 = androidx.lifecycle.ViewModelKt.getViewModelScope(r6)
            com.bxkj.student.v2.vm.face.FaceDetectVM$d r3 = new com.bxkj.student.v2.vm.face.FaceDetectVM$d
            r1 = 0
            r3.<init>(r6, r1)
            r4 = 3
            r5 = 0
            r2 = 0
            kotlinx.coroutines.e2 r0 = kotlinx.coroutines.i.e(r0, r1, r2, r3, r4, r5)
            r6.i = r0
            return
    }

    protected void onCleared() {
            r3 = this;
            kotlinx.coroutines.e2 r0 = r3.i
            if (r0 == 0) goto L9
            r1 = 1
            r2 = 0
            kotlinx.coroutines.e2.a.b(r0, r2, r1, r2)
        L9:
            super.onCleared()
            return
    }

    public final void v(@org.jetbrains.annotations.NotNull java.lang.String r15, @org.jetbrains.annotations.NotNull java.lang.String r16, @org.jetbrains.annotations.NotNull java.lang.String r17, @org.jetbrains.annotations.NotNull java.io.File r18, @org.jetbrains.annotations.Nullable com.bxkj.student.v2.common.data.PointData r19, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.n1> r20) {
            r14 = this;
            java.lang.String r1 = "identify"
            kotlin.jvm.internal.g0.p(r15, r1)
            java.lang.String r1 = "type"
            r4 = r16
            kotlin.jvm.internal.g0.p(r4, r1)
            java.lang.String r1 = "runType"
            r5 = r17
            kotlin.jvm.internal.g0.p(r5, r1)
            java.lang.String r1 = "faceFile"
            r2 = r18
            kotlin.jvm.internal.g0.p(r2, r1)
            java.lang.String r1 = "result"
            r9 = r20
            kotlin.jvm.internal.g0.p(r9, r1)
            r14.w()
            kotlin.jvm.internal.Ref$ObjectRef r7 = new kotlin.jvm.internal.Ref$ObjectRef
            r7.<init>()
            java.lang.String r1 = ""
            r7.element = r1
            kotlin.jvm.internal.Ref$ObjectRef r8 = new kotlin.jvm.internal.Ref$ObjectRef
            r8.<init>()
            r8.element = r1
            if (r19 == 0) goto L5e
            double r10 = r19.getA()
            double r12 = r19.getO()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r10)
            java.lang.String r6 = ","
            r1.append(r6)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            r7.element = r1
            long r10 = r19.getT()
            java.lang.String r1 = java.lang.String.valueOf(r10)
            r8.element = r1
        L5e:
            com.bxkj.student.v2.vm.face.FaceDetectVM$a r1 = new com.bxkj.student.v2.vm.face.FaceDetectVM$a
            r10 = 0
            r3 = r15
            r6 = r2
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r8 = r2
            com.bxkj.student.v2.vm.face.FaceDetectVM$b r9 = new com.bxkj.student.v2.vm.face.FaceDetectVM$b
            r1 = 0
            r9.<init>(r14, r1)
            com.bxkj.student.v2.vm.face.FaceDetectVM$c r6 = new com.bxkj.student.v2.vm.face.FaceDetectVM$c
            r7 = 0
            r1 = r14
            r4 = r15
            r5 = r16
            r2 = r18
            r3 = r19
            r0 = r6
            r6 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r5 = r9
            r9 = 206(0xce, float:2.89E-43)
            r2 = 0
            r3 = 0
            r4 = 0
            r1 = r8
            r8 = 0
            r6 = r0
            r0 = r14
            kotlinx.coroutines.e2 r1 = com.bxkj.base.v2.base.BaseViewModel.j(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r14.h = r1
            return
    }
}
