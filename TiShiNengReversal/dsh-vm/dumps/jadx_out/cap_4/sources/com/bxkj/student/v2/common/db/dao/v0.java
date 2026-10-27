package com.bxkj.student.v2.common.db.dao;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final /* synthetic */ class v0 {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.student.v2.common.db.dao.SportsSetDao", f = "SportsSetDao.kt", i = {0, 0}, l = {21}, m = "getSportsSet$suspendImpl", n = {"$this", "type"}, s = {"L$0", "L$1"})
    static final class a extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object a;
        java.lang.Object b;
        /* synthetic */ java.lang.Object c;
        final /* synthetic */ com.bxkj.student.v2.common.db.dao.w0 d;
        int e;

        a(com.bxkj.student.v2.common.db.dao.w0 r1, kotlin.coroutines.e<? super com.bxkj.student.v2.common.db.dao.v0.a> r2) {
                r0 = this;
                r0.d = r1
                r0.<init>(r2)
                return
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
                r1 = this;
                r1.c = r2
                int r2 = r1.e
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r2 | r0
                r1.e = r2
                com.bxkj.student.v2.common.db.dao.w0 r2 = r1.d
                r0 = 0
                java.lang.Object r2 = com.bxkj.student.v2.common.db.dao.v0.c(r2, r0, r1)
                return r2
        }
    }

    public v0() {
            r1 = this;
            r1.<init>()
            return
    }

    @org.jetbrains.annotations.Nullable
    public static java.lang.Object a(com.bxkj.student.v2.common.db.dao.w0 r0, @org.jetbrains.annotations.NotNull java.lang.String r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.e r2) {
            java.lang.Object r0 = c(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ java.lang.Object b(com.bxkj.student.v2.common.db.dao.w0 r0, java.lang.String r1, kotlin.coroutines.e r2) {
            java.lang.Object r0 = a(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ java.lang.Object c(com.bxkj.student.v2.common.db.dao.w0 r4, java.lang.String r5, kotlin.coroutines.e<? super java.lang.String> r6) {
            boolean r0 = r6 instanceof com.bxkj.student.v2.common.db.dao.v0.a
            if (r0 == 0) goto L13
            r0 = r6
            com.bxkj.student.v2.common.db.dao.v0$a r0 = (com.bxkj.student.v2.common.db.dao.v0.a) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            com.bxkj.student.v2.common.db.dao.v0$a r0 = new com.bxkj.student.v2.common.db.dao.v0$a
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r4 = r0.b
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r4 = r0.a
            com.bxkj.student.v2.common.db.dao.w0 r4 = (com.bxkj.student.v2.common.db.dao.w0) r4
            kotlin.g0.n(r6)
            goto L5b
        L31:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L39:
            kotlin.g0.n(r6)
            com.bxkj.base.v2.data.b$a r6 = com.bxkj.base.v2.data.b.d
            com.bxkj.base.v2.data.b r6 = r6.a()
            java.lang.String r6 = r6.R()
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.j.a(r4)
            r0.a = r2
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.j.a(r5)
            r0.b = r2
            r0.e = r3
            java.lang.Object r6 = r4.a(r6, r5, r0)
            if (r6 != r1) goto L5b
            return r1
        L5b:
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto L6f
            java.lang.Object r4 = kotlin.collections.f0.L2(r6)
            l0.e r4 = (l0.e) r4
            if (r4 == 0) goto L6f
            java.lang.String r4 = r4.f()
            if (r4 != 0) goto L6e
            goto L6f
        L6e:
            return r4
        L6f:
            java.lang.String r4 = ""
            return r4
    }
}
