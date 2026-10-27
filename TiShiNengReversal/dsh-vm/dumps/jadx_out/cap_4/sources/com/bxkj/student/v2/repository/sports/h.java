package com.bxkj.student.v2.repository.sports;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class h {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.student.v2.repository.sports.SportsStatisticsRepository", f = "SportsStatisticsRepository.kt", i = {}, l = {12}, m = "getSportsStatistics", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        /* synthetic */ java.lang.Object a;
        final /* synthetic */ com.bxkj.student.v2.repository.sports.h b;
        int c;

        a(com.bxkj.student.v2.repository.sports.h r1, kotlin.coroutines.e<? super com.bxkj.student.v2.repository.sports.h.a> r2) {
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
                com.bxkj.student.v2.repository.sports.h r2 = r1.b
                java.lang.Object r2 = r2.a(r1)
                return r2
        }
    }

    public h() {
            r0 = this;
            r0.<init>()
            return
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object a(@org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super java.util.Map<java.lang.String, java.lang.Object>> r5) {
            r4 = this;
            boolean r0 = r5 instanceof com.bxkj.student.v2.repository.sports.h.a
            if (r0 == 0) goto L13
            r0 = r5
            com.bxkj.student.v2.repository.sports.h$a r0 = (com.bxkj.student.v2.repository.sports.h.a) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            com.bxkj.student.v2.repository.sports.h$a r0 = new com.bxkj.student.v2.repository.sports.h$a
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
            java.lang.Object r5 = r5.G(r0)
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
}
