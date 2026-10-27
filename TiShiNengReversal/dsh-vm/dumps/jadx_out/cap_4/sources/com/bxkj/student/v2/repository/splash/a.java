package com.bxkj.student.v2.repository.splash;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class a {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.student.v2.repository.splash.SelectSchoolRepository", f = "SelectSchoolRepository.kt", i = {0}, l = {14}, m = "searchSchool", n = {"name"}, s = {"L$0"})
    /* renamed from: com.bxkj.student.v2.repository.splash.a$a, reason: collision with other inner class name */
    static final class C0153a extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object a;
        /* synthetic */ java.lang.Object b;
        final /* synthetic */ com.bxkj.student.v2.repository.splash.a c;
        int d;

        C0153a(com.bxkj.student.v2.repository.splash.a r1, kotlin.coroutines.e<? super com.bxkj.student.v2.repository.splash.a.C0153a> r2) {
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
                com.bxkj.student.v2.repository.splash.a r2 = r1.c
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
    public final java.lang.Object a(@org.jetbrains.annotations.NotNull java.lang.String r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super java.util.List<java.util.Map<java.lang.String, java.lang.Object>>> r9) {
            r7 = this;
            boolean r0 = r9 instanceof com.bxkj.student.v2.repository.splash.a.C0153a
            if (r0 == 0) goto L14
            r0 = r9
            com.bxkj.student.v2.repository.splash.a$a r0 = (com.bxkj.student.v2.repository.splash.a.C0153a) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.d = r1
        L12:
            r4 = r0
            goto L1a
        L14:
            com.bxkj.student.v2.repository.splash.a$a r0 = new com.bxkj.student.v2.repository.splash.a$a
            r0.<init>(r7, r9)
            goto L12
        L1a:
            java.lang.Object r9 = r4.b
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
            int r1 = r4.d
            r2 = 1
            if (r1 == 0) goto L37
            if (r1 != r2) goto L2f
            java.lang.Object r8 = r4.a
            java.lang.String r8 = (java.lang.String) r8
            kotlin.g0.n(r9)
            goto L53
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            kotlin.g0.n(r9)
            com.bxkj.student.v2.retrofit.e r9 = com.bxkj.student.v2.retrofit.e.a
            com.bxkj.student.v2.retrofit.b r1 = r9.c()
            java.lang.Object r9 = kotlin.coroutines.jvm.internal.j.a(r8)
            r4.a = r9
            r4.d = r2
            r3 = 0
            r5 = 2
            r6 = 0
            r2 = r8
            java.lang.Object r9 = com.bxkj.student.v2.retrofit.a.o(r1, r2, r3, r4, r5, r6)
            if (r9 != r0) goto L53
            return r0
        L53:
            com.bxkj.base.v2.http.result.OldApiResult r9 = (com.bxkj.base.v2.http.result.OldApiResult) r9
            if (r9 == 0) goto L5e
            java.lang.Object r8 = r9.apiData()
            java.util.List r8 = (java.util.List) r8
            return r8
        L5e:
            r8 = 0
            return r8
    }
}
