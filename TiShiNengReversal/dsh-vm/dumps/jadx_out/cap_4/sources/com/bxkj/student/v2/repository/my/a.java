package com.bxkj.student.v2.repository.my;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class a {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.student.v2.repository.my.AboutUsRepository", f = "AboutUsRepository.kt", i = {}, l = {15}, m = "getPgyerAppVersion", n = {}, s = {})
    /* renamed from: com.bxkj.student.v2.repository.my.a$a, reason: collision with other inner class name */
    static final class C0152a extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        /* synthetic */ java.lang.Object a;
        final /* synthetic */ com.bxkj.student.v2.repository.my.a b;
        int c;

        C0152a(com.bxkj.student.v2.repository.my.a r1, kotlin.coroutines.e<? super com.bxkj.student.v2.repository.my.a.C0152a> r2) {
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
                com.bxkj.student.v2.repository.my.a r2 = r1.b
                java.lang.Object r2 = r2.a(r1)
                return r2
        }
    }

    public a() {
            r0 = this;
            r0.<init>()
            return
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object a(@org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super java.util.Map<java.lang.String, java.lang.Object>> r8) {
            r7 = this;
            boolean r0 = r8 instanceof com.bxkj.student.v2.repository.my.a.C0152a
            if (r0 == 0) goto L14
            r0 = r8
            com.bxkj.student.v2.repository.my.a$a r0 = (com.bxkj.student.v2.repository.my.a.C0152a) r0
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
            com.bxkj.student.v2.repository.my.a$a r0 = new com.bxkj.student.v2.repository.my.a$a
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
            java.lang.Object r8 = com.bxkj.student.v2.retrofit.a.i(r1, r2, r3, r4, r5, r6)
            if (r8 != r0) goto L49
            return r0
        L49:
            com.bxkj.base.v2.http.result.PgyerApiResult r8 = (com.bxkj.base.v2.http.result.PgyerApiResult) r8
            if (r8 == 0) goto L54
            java.lang.Object r8 = r8.apiData()
            java.util.Map r8 = (java.util.Map) r8
            return r8
        L54:
            r8 = 0
            return r8
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object b(@org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super com.bxkj.base.v2.http.result.OldApiResult<java.util.Map<java.lang.String, java.lang.Object>>> r5) {
            r4 = this;
            com.bxkj.student.v2.retrofit.e r0 = com.bxkj.student.v2.retrofit.e.a
            com.bxkj.student.v2.retrofit.b r0 = r0.c()
            com.bxkj.base.user.LoginUser r1 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r1 = r1.getSchoolId()
            b0.b r2 = b0.b.a
            com.bxkj.student.App$a r3 = com.bxkj.student.App.d
            com.bxkj.student.App r3 = r3.a()
            java.lang.String r2 = r2.f(r3)
            java.lang.Object r5 = r0.y(r1, r2, r5)
            return r5
    }
}
