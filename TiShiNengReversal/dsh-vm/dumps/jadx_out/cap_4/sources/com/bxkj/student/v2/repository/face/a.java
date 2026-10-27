package com.bxkj.student.v2.repository.face;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class a {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.student.v2.repository.face.FaceCheckRepository", f = "FaceCheckRepository.kt", i = {0}, l = {14}, m = "faceCheck", n = {"file"}, s = {"L$0"})
    /* renamed from: com.bxkj.student.v2.repository.face.a$a, reason: collision with other inner class name */
    static final class C0151a extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object a;
        /* synthetic */ java.lang.Object b;
        final /* synthetic */ com.bxkj.student.v2.repository.face.a c;
        int d;

        C0151a(com.bxkj.student.v2.repository.face.a r1, kotlin.coroutines.e<? super com.bxkj.student.v2.repository.face.a.C0151a> r2) {
                r0 = this;
                r0.c = r1
                r0.<init>(r2)
                return
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
                r1 = this;
                r1.b = r2
                int r2 = r1.d
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r2 | r0
                r1.d = r2
                com.bxkj.student.v2.repository.face.a r2 = r1.c
                r0 = 0
                java.lang.Object r2 = r2.a(r0, r1)
                return r2
        }
    }

    public a() {
            r0 = this;
            r0.<init>()
            return
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object a(@org.jetbrains.annotations.Nullable okhttp3.MultipartBody.Part r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super java.lang.Boolean> r6) {
            r4 = this;
            boolean r0 = r6 instanceof com.bxkj.student.v2.repository.face.a.C0151a
            if (r0 == 0) goto L13
            r0 = r6
            com.bxkj.student.v2.repository.face.a$a r0 = (com.bxkj.student.v2.repository.face.a.C0151a) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            com.bxkj.student.v2.repository.face.a$a r0 = new com.bxkj.student.v2.repository.face.a$a
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.a
            okhttp3.MultipartBody$Part r5 = (okhttp3.MultipartBody.Part) r5
            kotlin.g0.n(r6)
            goto L4d
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.g0.n(r6)
            com.bxkj.student.v2.retrofit.e r6 = com.bxkj.student.v2.retrofit.e.a
            com.bxkj.student.v2.retrofit.b r6 = r6.c()
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.j.a(r5)
            r0.a = r2
            r0.d = r3
            java.lang.Object r6 = r6.E(r5, r0)
            if (r6 != r1) goto L4d
            return r1
        L4d:
            com.bxkj.base.v2.http.result.ApiResult r6 = (com.bxkj.base.v2.http.result.ApiResult) r6
            if (r6 == 0) goto L58
            java.lang.Object r5 = r6.apiData()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            return r5
        L58:
            r5 = 0
            return r5
    }
}
