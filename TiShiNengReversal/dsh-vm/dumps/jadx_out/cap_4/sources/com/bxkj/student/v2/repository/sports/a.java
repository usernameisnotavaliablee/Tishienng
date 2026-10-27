package com.bxkj.student.v2.repository.sports;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class a {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.student.v2.repository.sports.RecordDetailRepository", f = "RecordDetailRepository.kt", i = {}, l = {22}, m = "getShareCircleUrl", n = {}, s = {})
    /* renamed from: com.bxkj.student.v2.repository.sports.a$a, reason: collision with other inner class name */
    static final class C0155a extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        /* synthetic */ java.lang.Object a;
        final /* synthetic */ com.bxkj.student.v2.repository.sports.a b;
        int c;

        C0155a(com.bxkj.student.v2.repository.sports.a r1, kotlin.coroutines.e<? super com.bxkj.student.v2.repository.sports.a.C0155a> r2) {
                r0 = this;
                r0.b = r1
                r0.<init>(r2)
                return
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
                r1 = this;
                r1.a = r2
                int r2 = r1.c
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r2 | r0
                r1.c = r2
                com.bxkj.student.v2.repository.sports.a r2 = r1.b
                java.lang.Object r2 = r2.b(r1)
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.student.v2.repository.sports.RecordDetailRepository", f = "RecordDetailRepository.kt", i = {}, l = {17}, m = "getSportsAppeal", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        /* synthetic */ java.lang.Object a;
        final /* synthetic */ com.bxkj.student.v2.repository.sports.a b;
        int c;

        b(com.bxkj.student.v2.repository.sports.a r1, kotlin.coroutines.e<? super com.bxkj.student.v2.repository.sports.a.b> r2) {
                r0 = this;
                r0.b = r1
                r0.<init>(r2)
                return
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
                r1 = this;
                r1.a = r2
                int r2 = r1.c
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r2 | r0
                r1.c = r2
                com.bxkj.student.v2.repository.sports.a r2 = r1.b
                java.lang.Object r2 = r2.c(r1)
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.student.v2.repository.sports.RecordDetailRepository", f = "RecordDetailRepository.kt", i = {0}, l = {15}, m = "getSportsRecordDetail", n = {"exerciseRecordId"}, s = {"L$0"})
    static final class c extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object a;
        /* synthetic */ java.lang.Object b;
        final /* synthetic */ com.bxkj.student.v2.repository.sports.a c;
        int d;

        c(com.bxkj.student.v2.repository.sports.a r1, kotlin.coroutines.e<? super com.bxkj.student.v2.repository.sports.a.c> r2) {
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
                com.bxkj.student.v2.repository.sports.a r2 = r1.c
                r0 = 0
                java.lang.Object r2 = r2.d(r0, r1)
                return r2
        }
    }

    public a() {
            r0 = this;
            r0.<init>()
            return
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object a(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super java.util.List<l0.d>> r3) {
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
    public final java.lang.Object b(@org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super java.util.Map<java.lang.String, java.lang.Object>> r8) {
            r7 = this;
            boolean r0 = r8 instanceof com.bxkj.student.v2.repository.sports.a.C0155a
            if (r0 == 0) goto L14
            r0 = r8
            com.bxkj.student.v2.repository.sports.a$a r0 = (com.bxkj.student.v2.repository.sports.a.C0155a) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.c = r1
        L12:
            r4 = r0
            goto L1a
        L14:
            com.bxkj.student.v2.repository.sports.a$a r0 = new com.bxkj.student.v2.repository.sports.a$a
            r0.<init>(r7, r8)
            goto L12
        L1a:
            java.lang.Object r8 = r4.a
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
            int r1 = r4.c
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            kotlin.g0.n(r8)
            goto L49
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L33:
            kotlin.g0.n(r8)
            com.bxkj.student.v2.retrofit.e r8 = com.bxkj.student.v2.retrofit.e.a
            com.bxkj.student.v2.retrofit.b r1 = r8.c()
            r4.c = r2
            r2 = 0
            r3 = 0
            r5 = 3
            r6 = 0
            java.lang.Object r8 = com.bxkj.student.v2.retrofit.a.k(r1, r2, r3, r4, r5, r6)
            if (r8 != r0) goto L49
            return r0
        L49:
            com.bxkj.base.v2.http.result.ApiResult r8 = (com.bxkj.base.v2.http.result.ApiResult) r8
            if (r8 == 0) goto L54
            java.lang.Object r8 = r8.apiData()
            java.util.Map r8 = (java.util.Map) r8
            return r8
        L54:
            r8 = 0
            return r8
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object c(@org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super java.util.Map<java.lang.String, java.lang.Object>> r5) {
            r4 = this;
            boolean r0 = r5 instanceof com.bxkj.student.v2.repository.sports.a.b
            if (r0 == 0) goto L13
            r0 = r5
            com.bxkj.student.v2.repository.sports.a$b r0 = (com.bxkj.student.v2.repository.sports.a.b) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            com.bxkj.student.v2.repository.sports.a$b r0 = new com.bxkj.student.v2.repository.sports.a$b
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.g0.n(r5)
            goto L43
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.g0.n(r5)
            com.bxkj.student.v2.retrofit.e r5 = com.bxkj.student.v2.retrofit.e.a
            com.bxkj.student.v2.retrofit.b r5 = r5.c()
            r0.c = r3
            java.lang.Object r5 = r5.M(r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            com.bxkj.base.v2.http.result.ApiResult r5 = (com.bxkj.base.v2.http.result.ApiResult) r5
            if (r5 == 0) goto L4e
            java.lang.Object r5 = r5.apiData()
            java.util.Map r5 = (java.util.Map) r5
            return r5
        L4e:
            r5 = 0
            return r5
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object d(@org.jetbrains.annotations.NotNull java.lang.String r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super java.util.Map<java.lang.String, java.lang.Object>> r6) {
            r4 = this;
            boolean r0 = r6 instanceof com.bxkj.student.v2.repository.sports.a.c
            if (r0 == 0) goto L13
            r0 = r6
            com.bxkj.student.v2.repository.sports.a$c r0 = (com.bxkj.student.v2.repository.sports.a.c) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            com.bxkj.student.v2.repository.sports.a$c r0 = new com.bxkj.student.v2.repository.sports.a$c
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.a
            java.lang.String r5 = (java.lang.String) r5
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
            java.lang.Object r6 = r6.r(r5, r0)
            if (r6 != r1) goto L4d
            return r1
        L4d:
            com.bxkj.base.v2.http.result.ApiResult r6 = (com.bxkj.base.v2.http.result.ApiResult) r6
            if (r6 == 0) goto L58
            java.lang.Object r5 = r6.apiData()
            java.util.Map r5 = (java.util.Map) r5
            return r5
        L58:
            r5 = 0
            return r5
    }
}
