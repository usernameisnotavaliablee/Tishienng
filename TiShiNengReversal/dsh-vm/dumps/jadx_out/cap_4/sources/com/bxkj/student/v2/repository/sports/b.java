package com.bxkj.student.v2.repository.sports;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class b {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.student.v2.repository.sports.RecordRepository", f = "RecordRepository.kt", i = {0, 0, 0, 0}, l = {17}, m = "v3GetSportsResult", n = {"status", "date", "isFeedback", "datePageIndex"}, s = {"L$0", "L$1", "L$2", "I$0"})
    static final class a extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object a;
        java.lang.Object b;
        java.lang.Object c;
        int d;
        /* synthetic */ java.lang.Object e;
        final /* synthetic */ com.bxkj.student.v2.repository.sports.b f;
        int g;

        a(com.bxkj.student.v2.repository.sports.b r1, kotlin.coroutines.e<? super com.bxkj.student.v2.repository.sports.b.a> r2) {
                r0 = this;
                r0.f = r1
                r0.<init>(r2)
                return
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r7) {
                r6 = this;
                r6.e = r7
                int r7 = r6.g
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r7 = r7 | r0
                r6.g = r7
                com.bxkj.student.v2.repository.sports.b r0 = r6.f
                r3 = 0
                r4 = 0
                r1 = 0
                r2 = 0
                r5 = r6
                java.lang.Object r7 = r0.g(r1, r2, r3, r4, r5)
                return r7
        }
    }

    public b() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ java.lang.Object h(com.bxkj.student.v2.repository.sports.b r6, java.lang.String r7, java.lang.String r8, int r9, java.lang.String r10, kotlin.coroutines.e r11, int r12, java.lang.Object r13) {
            r12 = r12 & 8
            if (r12 == 0) goto L5
            r10 = 0
        L5:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            java.lang.Object r6 = r0.g(r1, r2, r3, r4, r5)
            return r6
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object a(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r3) {
            r1 = this;
            com.bxkj.student.v2.common.db.AppDatabase$a r0 = com.bxkj.student.v2.common.db.AppDatabase.a
            com.bxkj.student.v2.common.db.AppDatabase r0 = r0.a()
            com.bxkj.student.v2.common.db.dao.g r0 = r0.x()
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
    public final java.lang.Object b(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super java.util.List<l0.b>> r3) {
            r1 = this;
            com.bxkj.student.v2.common.db.AppDatabase$a r0 = com.bxkj.student.v2.common.db.AppDatabase.a
            com.bxkj.student.v2.common.db.AppDatabase r0 = r0.a()
            com.bxkj.student.v2.common.db.dao.g r0 = r0.x()
            if (r0 == 0) goto L1a
            java.lang.Object r2 = r0.b(r2, r3)
            java.lang.Object r3 = kotlin.coroutines.intrinsics.a.l()
            if (r2 != r3) goto L17
            return r2
        L17:
            java.util.List r2 = (java.util.List) r2
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
    public final java.lang.Object d(@org.jetbrains.annotations.NotNull java.lang.String r9, long r10, long r12, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super java.util.List<l0.d>> r14) {
            r8 = this;
            com.bxkj.student.v2.common.db.AppDatabase$a r0 = com.bxkj.student.v2.common.db.AppDatabase.a
            com.bxkj.student.v2.common.db.AppDatabase r0 = r0.a()
            com.bxkj.student.v2.common.db.dao.y r1 = r0.z()
            if (r1 == 0) goto L15
            r2 = r9
            r3 = r10
            r5 = r12
            r7 = r14
            java.lang.Object r9 = r1.f(r2, r3, r5, r7)
            return r9
        L15:
            r9 = 0
            return r9
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object e(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super java.util.List<l0.d>> r3) {
            r1 = this;
            com.bxkj.student.v2.common.db.AppDatabase$a r0 = com.bxkj.student.v2.common.db.AppDatabase.a
            com.bxkj.student.v2.common.db.AppDatabase r0 = r0.a()
            com.bxkj.student.v2.common.db.dao.y r0 = r0.z()
            if (r0 == 0) goto L11
            java.lang.Object r2 = r0.h(r2, r3)
            return r2
        L11:
            r2 = 0
            return r2
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object f(@org.jetbrains.annotations.NotNull java.lang.String r9, long r10, long r12, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super java.util.List<k0.a>> r14) {
            r8 = this;
            com.bxkj.student.v2.common.db.AppDatabase$a r0 = com.bxkj.student.v2.common.db.AppDatabase.a
            com.bxkj.student.v2.common.db.AppDatabase r0 = r0.a()
            com.bxkj.student.v2.common.db.dao.y r1 = r0.z()
            if (r1 == 0) goto L15
            r2 = r9
            r3 = r10
            r5 = r12
            r7 = r14
            java.lang.Object r9 = r1.s(r2, r3, r5, r7)
            return r9
        L15:
            r9 = 0
            return r9
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object g(@org.jetbrains.annotations.NotNull java.lang.String r8, @org.jetbrains.annotations.NotNull java.lang.String r9, int r10, @org.jetbrains.annotations.Nullable java.lang.String r11, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super java.util.Map<java.lang.String, java.lang.Object>> r12) {
            r7 = this;
            boolean r0 = r12 instanceof com.bxkj.student.v2.repository.sports.b.a
            if (r0 == 0) goto L14
            r0 = r12
            com.bxkj.student.v2.repository.sports.b$a r0 = (com.bxkj.student.v2.repository.sports.b.a) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.g = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            com.bxkj.student.v2.repository.sports.b$a r0 = new com.bxkj.student.v2.repository.sports.b$a
            r0.<init>(r7, r12)
            goto L12
        L1a:
            java.lang.Object r12 = r6.e
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
            int r1 = r6.g
            r2 = 1
            if (r1 == 0) goto L3f
            if (r1 != r2) goto L37
            java.lang.Object r8 = r6.c
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r8 = r6.b
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r8 = r6.a
            java.lang.String r8 = (java.lang.String) r8
            kotlin.g0.n(r12)
            goto L69
        L37:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3f:
            kotlin.g0.n(r12)
            com.bxkj.student.v2.retrofit.e r12 = com.bxkj.student.v2.retrofit.e.a
            com.bxkj.student.v2.retrofit.b r1 = r12.c()
            java.lang.Object r12 = kotlin.coroutines.jvm.internal.j.a(r8)
            r6.a = r12
            java.lang.Object r12 = kotlin.coroutines.jvm.internal.j.a(r9)
            r6.b = r12
            java.lang.Object r12 = kotlin.coroutines.jvm.internal.j.a(r11)
            r6.c = r12
            r6.d = r10
            r6.g = r2
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            java.lang.Object r12 = r1.q(r2, r3, r4, r5, r6)
            if (r12 != r0) goto L69
            return r0
        L69:
            com.bxkj.base.v2.http.result.ApiResult r12 = (com.bxkj.base.v2.http.result.ApiResult) r12
            if (r12 == 0) goto L74
            java.lang.Object r8 = r12.apiData()
            java.util.Map r8 = (java.util.Map) r8
            return r8
        L74:
            r8 = 0
            return r8
    }
}
