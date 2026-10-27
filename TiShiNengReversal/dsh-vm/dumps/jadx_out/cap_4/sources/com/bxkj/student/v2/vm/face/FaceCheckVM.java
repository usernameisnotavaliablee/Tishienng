package com.bxkj.student.v2.vm.face;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class FaceCheckVM extends com.bxkj.base.v2.base.BaseViewModel {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.student.v2.vm.face.FaceCheckVM$faceDetect$1", f = "FaceCheckVM.kt", i = {}, l = {19}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        int a;
        final /* synthetic */ java.io.File b;
        final /* synthetic */ kotlin.jvm.functions.Function1<com.bxkj.base.v2.http.exception.ApiException, kotlin.n1> c;

        a(java.io.File r1, kotlin.jvm.functions.Function1<? super com.bxkj.base.v2.http.exception.ApiException, kotlin.n1> r2, kotlin.coroutines.e<? super com.bxkj.student.v2.vm.face.FaceCheckVM.a> r3) {
                r0 = this;
                r0.b = r1
                r0.c = r2
                r1 = 1
                r0.<init>(r1, r3)
                return
        }

        public final kotlin.coroutines.e<kotlin.n1> create(kotlin.coroutines.e<?> r4) {
                r3 = this;
                com.bxkj.student.v2.vm.face.FaceCheckVM$a r0 = new com.bxkj.student.v2.vm.face.FaceCheckVM$a
                java.io.File r1 = r3.b
                kotlin.jvm.functions.Function1<com.bxkj.base.v2.http.exception.ApiException, kotlin.n1> r2 = r3.c
                r0.<init>(r1, r2, r4)
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
                com.bxkj.student.v2.vm.face.FaceCheckVM$a r2 = (com.bxkj.student.v2.vm.face.FaceCheckVM.a) r2
                kotlin.n1 r0 = kotlin.n1.a
                java.lang.Object r2 = r2.invokeSuspend(r0)
                return r2
        }

        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
                r8 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
                int r1 = r8.a
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                kotlin.g0.n(r9)
                goto L46
            Lf:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L17:
                kotlin.g0.n(r9)
                com.bxkj.student.v2.repository.face.a r9 = new com.bxkj.student.v2.repository.face.a
                r9.<init>()
                okhttp3.MultipartBody$Part$Companion r1 = okhttp3.MultipartBody.Part.Companion
                java.io.File r3 = r8.b
                java.lang.String r3 = r3.getName()
                okhttp3.RequestBody$Companion r4 = okhttp3.RequestBody.Companion
                java.io.File r5 = r8.b
                okhttp3.MediaType$Companion r6 = okhttp3.MediaType.Companion
                java.lang.String r7 = "image/png"
                okhttp3.MediaType r6 = r6.get(r7)
                okhttp3.RequestBody r4 = r4.create(r5, r6)
                java.lang.String r5 = "file"
                okhttp3.MultipartBody$Part r1 = r1.createFormData(r5, r3, r4)
                r8.a = r2
                java.lang.Object r9 = r9.a(r1, r8)
                if (r9 != r0) goto L46
                return r0
            L46:
                kotlin.jvm.functions.Function1<com.bxkj.base.v2.http.exception.ApiException, kotlin.n1> r9 = r8.c
                com.bxkj.base.v2.http.exception.ApiException r0 = new com.bxkj.base.v2.http.exception.ApiException
                r1 = 0
                java.lang.Integer r1 = kotlin.coroutines.jvm.internal.a.f(r1)
                java.lang.String r2 = "人脸验证成功"
                r0.<init>(r1, r2)
                r9.invoke(r0)
                kotlin.n1 r9 = kotlin.n1.a
                return r9
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.student.v2.vm.face.FaceCheckVM$faceDetect$2", f = "FaceCheckVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.bxkj.base.v2.http.exception.ApiException, kotlin.coroutines.e<? super java.lang.Boolean>, java.lang.Object> {
        int a;
        /* synthetic */ java.lang.Object b;
        final /* synthetic */ kotlin.jvm.functions.Function1<com.bxkj.base.v2.http.exception.ApiException, kotlin.n1> c;

        b(kotlin.jvm.functions.Function1<? super com.bxkj.base.v2.http.exception.ApiException, kotlin.n1> r1, kotlin.coroutines.e<? super com.bxkj.student.v2.vm.face.FaceCheckVM.b> r2) {
                r0 = this;
                r0.c = r1
                r1 = 2
                r0.<init>(r1, r2)
                return
        }

        public final kotlin.coroutines.e<kotlin.n1> create(java.lang.Object r3, kotlin.coroutines.e<?> r4) {
                r2 = this;
                com.bxkj.student.v2.vm.face.FaceCheckVM$b r0 = new com.bxkj.student.v2.vm.face.FaceCheckVM$b
                kotlin.jvm.functions.Function1<com.bxkj.base.v2.http.exception.ApiException, kotlin.n1> r1 = r2.c
                r0.<init>(r1, r4)
                r0.b = r3
                return r0
        }

        public final java.lang.Object f(com.bxkj.base.v2.http.exception.ApiException r1, kotlin.coroutines.e<? super java.lang.Boolean> r2) {
                r0 = this;
                kotlin.coroutines.e r1 = r0.create(r1, r2)
                com.bxkj.student.v2.vm.face.FaceCheckVM$b r1 = (com.bxkj.student.v2.vm.face.FaceCheckVM.b) r1
                kotlin.n1 r2 = kotlin.n1.a
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
                r0 = this;
                com.bxkj.base.v2.http.exception.ApiException r1 = (com.bxkj.base.v2.http.exception.ApiException) r1
                kotlin.coroutines.e r2 = (kotlin.coroutines.e) r2
                java.lang.Object r1 = r0.f(r1, r2)
                return r1
        }

        public final java.lang.Object invokeSuspend(java.lang.Object r3) {
                r2 = this;
                java.lang.Object r0 = r2.b
                com.bxkj.base.v2.http.exception.ApiException r0 = (com.bxkj.base.v2.http.exception.ApiException) r0
                kotlin.coroutines.intrinsics.a.l()
                int r1 = r2.a
                if (r1 != 0) goto L19
                kotlin.g0.n(r3)
                kotlin.jvm.functions.Function1<com.bxkj.base.v2.http.exception.ApiException, kotlin.n1> r3 = r2.c
                r3.invoke(r0)
                r3 = 1
                java.lang.Boolean r3 = kotlin.coroutines.jvm.internal.a.a(r3)
                return r3
            L19:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r3.<init>(r0)
                throw r3
        }
    }

    public FaceCheckVM() {
            r0 = this;
            r0.<init>()
            return
    }

    public final void t(@org.jetbrains.annotations.NotNull java.io.File r13, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super com.bxkj.base.v2.http.exception.ApiException, kotlin.n1> r14) {
            r12 = this;
            java.lang.String r0 = "faceFile"
            kotlin.jvm.internal.g0.p(r13, r0)
            java.lang.String r0 = "result"
            kotlin.jvm.internal.g0.p(r14, r0)
            com.bxkj.student.v2.vm.face.FaceCheckVM$a r2 = new com.bxkj.student.v2.vm.face.FaceCheckVM$a
            r0 = 0
            r2.<init>(r13, r14, r0)
            com.bxkj.student.v2.vm.face.FaceCheckVM$b r3 = new com.bxkj.student.v2.vm.face.FaceCheckVM$b
            r3.<init>(r14, r0)
            r10 = 252(0xfc, float:3.53E-43)
            r11 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r1 = r12
            com.bxkj.base.v2.base.BaseViewModel.j(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
    }
}
