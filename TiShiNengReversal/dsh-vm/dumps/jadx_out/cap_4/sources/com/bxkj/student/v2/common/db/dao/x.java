package com.bxkj.student.v2.common.db.dao;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final /* synthetic */ class x {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.student.v2.common.db.dao.SportsDao", f = "SportsDao.kt", i = {0, 0, 0, 1, 1, 1, 1, 1, 1}, l = {116, 126}, m = "setFaceOutIndex$suspendImpl", n = {"$this", "identity", "newFaceOutIndex", "$this", "identity", "newFaceOutIndex", "currentFaceOutIndex", "currentIndexes", "updatedValue"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5"})
    static final class a extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object a;
        java.lang.Object b;
        java.lang.Object c;
        java.lang.Object d;
        java.lang.Object e;
        java.lang.Object f;
        /* synthetic */ java.lang.Object g;
        final /* synthetic */ com.bxkj.student.v2.common.db.dao.y h;
        int i;

        a(com.bxkj.student.v2.common.db.dao.y r1, kotlin.coroutines.e<? super com.bxkj.student.v2.common.db.dao.x.a> r2) {
                r0 = this;
                r0.h = r1
                r0.<init>(r2)
                return
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
                r1 = this;
                r1.g = r2
                int r2 = r1.i
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r2 | r0
                r1.i = r2
                com.bxkj.student.v2.common.db.dao.y r2 = r1.h
                r0 = 0
                java.lang.Object r2 = com.bxkj.student.v2.common.db.dao.x.c(r2, r0, r0, r1)
                return r2
        }
    }

    public x() {
            r1 = this;
            r1.<init>()
            return
    }

    @org.jetbrains.annotations.Nullable
    public static java.lang.Object a(com.bxkj.student.v2.common.db.dao.y r0, @org.jetbrains.annotations.NotNull java.lang.String r1, @org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.e r3) {
            java.lang.Object r0 = c(r0, r1, r2, r3)
            return r0
    }

    public static /* synthetic */ java.lang.Object b(com.bxkj.student.v2.common.db.dao.y r0, java.lang.String r1, java.lang.String r2, kotlin.coroutines.e r3) {
            java.lang.Object r0 = a(r0, r1, r2, r3)
            return r0
    }

    public static /* synthetic */ java.lang.Object c(com.bxkj.student.v2.common.db.dao.y r19, java.lang.String r20, java.lang.String r21, kotlin.coroutines.e<? super kotlin.n1> r22) {
            r0 = r19
            r1 = r20
            r2 = r22
            boolean r3 = r2 instanceof com.bxkj.student.v2.common.db.dao.x.a
            if (r3 == 0) goto L19
            r3 = r2
            com.bxkj.student.v2.common.db.dao.x$a r3 = (com.bxkj.student.v2.common.db.dao.x.a) r3
            int r4 = r3.i
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.i = r4
            goto L1e
        L19:
            com.bxkj.student.v2.common.db.dao.x$a r3 = new com.bxkj.student.v2.common.db.dao.x$a
            r3.<init>(r0, r2)
        L1e:
            java.lang.Object r2 = r3.g
            java.lang.Object r4 = kotlin.coroutines.intrinsics.a.l()
            int r5 = r3.i
            r6 = 2
            r7 = 1
            if (r5 == 0) goto L69
            if (r5 == r7) goto L53
            if (r5 != r6) goto L4b
            java.lang.Object r0 = r3.f
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r3.e
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r0 = r3.d
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r3.c
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r3.b
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r3.a
            com.bxkj.student.v2.common.db.dao.y r0 = (com.bxkj.student.v2.common.db.dao.y) r0
            kotlin.g0.n(r2)
            goto Lec
        L4b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L53:
            java.lang.Object r0 = r3.c
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r1 = r3.b
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r5 = r3.a
            com.bxkj.student.v2.common.db.dao.y r5 = (com.bxkj.student.v2.common.db.dao.y) r5
            kotlin.g0.n(r2)
            r18 = r2
            r2 = r0
            r0 = r5
            r5 = r18
            goto L7d
        L69:
            kotlin.g0.n(r2)
            r3.a = r0
            r3.b = r1
            r2 = r21
            r3.c = r2
            r3.i = r7
            java.lang.Object r5 = r0.m(r1, r3)
            if (r5 != r4) goto L7d
            goto Leb
        L7d:
            java.lang.String r5 = (java.lang.String) r5
            if (r5 != 0) goto L83
            java.lang.String r5 = ""
        L83:
            r7 = r5
            int r5 = r7.length()
            if (r5 != 0) goto L90
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            goto La4
        L90:
            java.lang.String r5 = "、"
            java.lang.String[] r8 = new java.lang.String[]{r5}
            r11 = 6
            r12 = 0
            r9 = 0
            r10 = 0
            java.util.List r5 = kotlin.text.u.m5(r7, r8, r9, r10, r11, r12)
            java.util.Collection r5 = (java.util.Collection) r5
            java.util.List r5 = kotlin.collections.f0.d6(r5)
        La4:
            boolean r8 = r5.contains(r2)
            if (r8 != 0) goto Lef
            r5.add(r2)
            r9 = r5
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            r16 = 62
            r17 = 0
            java.lang.String r10 = "、"
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            java.lang.String r8 = kotlin.collections.f0.r3(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            java.lang.Object r9 = kotlin.coroutines.jvm.internal.j.a(r0)
            r3.a = r9
            java.lang.Object r9 = kotlin.coroutines.jvm.internal.j.a(r1)
            r3.b = r9
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.j.a(r2)
            r3.c = r2
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.j.a(r7)
            r3.d = r2
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.j.a(r5)
            r3.e = r2
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.j.a(r8)
            r3.f = r2
            r3.i = r6
            java.lang.Object r0 = r0.a(r1, r8, r3)
            if (r0 != r4) goto Lec
        Leb:
            return r4
        Lec:
            kotlin.n1 r0 = kotlin.n1.a
            return r0
        Lef:
            kotlin.n1 r0 = kotlin.n1.a
            return r0
    }
}
