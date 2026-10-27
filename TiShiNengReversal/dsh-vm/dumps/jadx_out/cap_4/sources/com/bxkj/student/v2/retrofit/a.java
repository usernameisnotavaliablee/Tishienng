package com.bxkj.student.v2.retrofit;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final /* synthetic */ class a {
    static {
            com.bxkj.student.v2.retrofit.b$a r0 = com.bxkj.student.v2.retrofit.b.a
            return
    }

    public a() {
            r1 = this;
            r1.<init>()
            return
    }

    public static /* synthetic */ java.lang.Object a(com.bxkj.student.v2.retrofit.b r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, kotlin.coroutines.e r13, int r14, java.lang.Object r15) {
            if (r15 != 0) goto L26
            r15 = r14 & 2
            if (r15 == 0) goto L8
            java.lang.String r9 = "server"
        L8:
            r2 = r9
            r9 = r14 & 4
            if (r9 == 0) goto Lf
            java.lang.String r10 = "refresh_token"
        Lf:
            r3 = r10
            r9 = r14 & 8
            if (r9 == 0) goto L16
            java.lang.String r11 = "app"
        L16:
            r4 = r11
            r9 = r14 & 16
            if (r9 == 0) goto L1d
            java.lang.String r12 = "stuApp"
        L1d:
            r0 = r7
            r1 = r8
            r5 = r12
            r6 = r13
            java.lang.Object r7 = r0.w(r1, r2, r3, r4, r5, r6)
            return r7
        L26:
            java.lang.UnsupportedOperationException r7 = new java.lang.UnsupportedOperationException
            java.lang.String r8 = "Super calls with default arguments not supported in this target, function: autoLogin"
            r7.<init>(r8)
            throw r7
    }

    public static /* synthetic */ java.lang.Object b(com.bxkj.student.v2.retrofit.b r0, java.lang.String r1, java.lang.String r2, kotlin.coroutines.e r3, int r4, java.lang.Object r5) {
            if (r5 != 0) goto L22
            r4 = r4 & 2
            if (r4 == 0) goto L1d
            com.bxkj.base.v2.data.b$a r2 = com.bxkj.base.v2.data.b.d
            com.bxkj.base.v2.data.b r4 = r2.a()
            boolean r4 = r4.Y()
            if (r4 == 0) goto L1b
            com.bxkj.base.v2.data.b r2 = r2.a()
            java.lang.String r2 = r2.R()
            goto L1d
        L1b:
            java.lang.String r2 = ""
        L1d:
            java.lang.Object r0 = r0.i(r1, r2, r3)
            return r0
        L22:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: clickArticle"
            r0.<init>(r1)
            throw r0
    }

    public static /* synthetic */ java.lang.Object c(com.bxkj.student.v2.retrofit.b r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, kotlin.coroutines.e r5, int r6, java.lang.Object r7) {
            if (r7 != 0) goto L41
            r7 = r6 & 1
            if (r7 == 0) goto L10
            com.bxkj.base.v2.data.b$a r2 = com.bxkj.base.v2.data.b.d
            com.bxkj.base.v2.data.b r2 = r2.a()
            java.lang.String r2 = r2.R()
        L10:
            r7 = r6 & 2
            if (r7 == 0) goto L36
            java.lang.String r3 = "371eb09af9255d557b1e697e:911a7768ee6863f19c1765ac"
            java.nio.charset.Charset r7 = kotlin.text.e.b
            byte[] r3 = r3.getBytes(r7)
            java.lang.String r7 = "getBytes(...)"
            kotlin.jvm.internal.g0.o(r3, r7)
            java.lang.String r3 = cn.bluemobi.dylan.base.utils.b.b(r3)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "Basic "
            r7.append(r0)
            r7.append(r3)
            java.lang.String r3 = r7.toString()
        L36:
            r6 = r6 & 4
            if (r6 == 0) goto L3c
            java.lang.String r4 = "application/json"
        L3c:
            java.lang.Object r1 = r1.p(r2, r3, r4, r5)
            return r1
        L41:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Super calls with default arguments not supported in this target, function: deleteServerAlis"
            r1.<init>(r2)
            throw r1
    }

    public static /* synthetic */ java.lang.Object d(com.bxkj.student.v2.retrofit.b r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, kotlin.coroutines.e r6, int r7, java.lang.Object r8) {
            if (r8 != 0) goto L32
            r8 = r7 & 1
            if (r8 == 0) goto L8
            java.lang.String r2 = "4"
        L8:
            r8 = r7 & 2
            if (r8 == 0) goto L16
            com.bxkj.base.v2.data.b$a r3 = com.bxkj.base.v2.data.b.d
            com.bxkj.base.v2.data.b r3 = r3.a()
            java.lang.String r3 = r3.m()
        L16:
            r8 = r7 & 4
            r0 = 0
            if (r8 == 0) goto L1c
            r4 = r0
        L1c:
            r7 = r7 & 8
            if (r7 == 0) goto L27
            r7 = r0
            r5 = r3
            r8 = r6
            r3 = r1
            r6 = r4
        L25:
            r4 = r2
            goto L2d
        L27:
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            goto L25
        L2d:
            java.lang.Object r1 = r3.B(r4, r5, r6, r7, r8)
            return r1
        L32:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Super calls with default arguments not supported in this target, function: getBanner"
            r1.<init>(r2)
            throw r1
    }

    public static /* synthetic */ java.lang.Object e(com.bxkj.student.v2.retrofit.b r0, java.lang.String r1, kotlin.coroutines.e r2, int r3, java.lang.Object r4) {
            if (r4 != 0) goto Ld
            r3 = r3 & 1
            if (r3 == 0) goto L8
            java.lang.String r1 = "2"
        L8:
            java.lang.Object r0 = r0.a(r1, r2)
            return r0
        Ld:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: getClassifyMenu"
            r0.<init>(r1)
            throw r0
    }

    public static /* synthetic */ java.lang.Object f(com.bxkj.student.v2.retrofit.b r0, java.lang.String r1, kotlin.coroutines.e r2, int r3, java.lang.Object r4) {
            if (r4 != 0) goto L1e
            r3 = r3 & 1
            if (r3 == 0) goto L19
            com.bxkj.base.v2.data.b$a r1 = com.bxkj.base.v2.data.b.d
            com.bxkj.base.v2.data.b r1 = r1.a()
            com.bxkj.base.v2.data.UserType r1 = r1.T()
            com.bxkj.base.v2.data.UserType r3 = com.bxkj.base.v2.data.UserType.STUDENT
            if (r1 != r3) goto L17
            java.lang.String r1 = "1"
            goto L19
        L17:
            java.lang.String r1 = "10"
        L19:
            java.lang.Object r0 = r0.N(r1, r2)
            return r0
        L1e:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: getHomeMenu"
            r0.<init>(r1)
            throw r0
    }

    public static /* synthetic */ java.lang.Object g(com.bxkj.student.v2.retrofit.b r0, java.lang.String r1, kotlin.coroutines.e r2, int r3, java.lang.Object r4) {
            if (r4 != 0) goto Ld
            r3 = r3 & 1
            if (r3 == 0) goto L8
            java.lang.String r1 = "1"
        L8:
            java.lang.Object r0 = r0.F(r1, r2)
            return r0
        Ld:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: getLatestUnreadNotice"
            r0.<init>(r1)
            throw r0
    }

    public static /* synthetic */ java.lang.Object h(com.bxkj.student.v2.retrofit.b r0, java.lang.String r1, kotlin.coroutines.e r2, int r3, java.lang.Object r4) {
            if (r4 != 0) goto L1e
            r3 = r3 & 1
            if (r3 == 0) goto L19
            com.bxkj.base.v2.data.b$a r1 = com.bxkj.base.v2.data.b.d
            com.bxkj.base.v2.data.b r1 = r1.a()
            com.bxkj.base.v2.data.UserType r1 = r1.T()
            com.bxkj.base.v2.data.UserType r3 = com.bxkj.base.v2.data.UserType.STUDENT
            if (r1 != r3) goto L17
            java.lang.String r1 = "5"
            goto L19
        L17:
            java.lang.String r1 = "7"
        L19:
            java.lang.Object r0 = r0.e(r1, r2)
            return r0
        L1e:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: getMyMenu"
            r0.<init>(r1)
            throw r0
    }

    public static /* synthetic */ java.lang.Object i(com.bxkj.student.v2.retrofit.b r0, java.lang.String r1, java.lang.String r2, kotlin.coroutines.e r3, int r4, java.lang.Object r5) {
            if (r5 != 0) goto L13
            r5 = r4 & 1
            if (r5 == 0) goto L8
            java.lang.String r1 = "ca38c0581692da070fa829cc06556a8a"
        L8:
            r4 = r4 & 2
            if (r4 == 0) goto Le
            java.lang.String r2 = "53d0109dcd490c9f0ab7ddefa3a95568"
        Le:
            java.lang.Object r0 = r0.j(r1, r2, r3)
            return r0
        L13:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: getPgyerAppVersion"
            r0.<init>(r1)
            throw r0
    }

    public static /* synthetic */ java.lang.Object j(com.bxkj.student.v2.retrofit.b r0, java.lang.String r1, java.lang.String r2, kotlin.coroutines.e r3, int r4, java.lang.Object r5) {
            if (r5 != 0) goto L25
            r5 = r4 & 1
            if (r5 == 0) goto L13
            com.bxkj.base.user.LoginUser r1 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r1 = r1.getSchoolId()
            java.lang.String r5 = "getSchoolId(...)"
            kotlin.jvm.internal.g0.o(r1, r5)
        L13:
            r4 = r4 & 2
            if (r4 == 0) goto L20
            java.lang.String r2 = com.bxkj.base.util.b0.d()
            java.lang.String r4 = "getDeviceName(...)"
            kotlin.jvm.internal.g0.o(r2, r4)
        L20:
            java.lang.Object r0 = r0.n(r1, r2, r3)
            return r0
        L25:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: getSchoolInfo"
            r0.<init>(r1)
            throw r0
    }

    public static /* synthetic */ java.lang.Object k(com.bxkj.student.v2.retrofit.b r0, java.lang.String r1, java.lang.String r2, kotlin.coroutines.e r3, int r4, java.lang.Object r5) {
            if (r5 != 0) goto L23
            r5 = r4 & 1
            if (r5 == 0) goto L10
            com.bxkj.base.v2.data.b$a r1 = com.bxkj.base.v2.data.b.d
            com.bxkj.base.v2.data.b r1 = r1.a()
            java.lang.String r1 = r1.J()
        L10:
            r4 = r4 & 2
            if (r4 == 0) goto L1e
            com.bxkj.base.v2.data.b$a r2 = com.bxkj.base.v2.data.b.d
            com.bxkj.base.v2.data.b r2 = r2.a()
            java.lang.String r2 = r2.S()
        L1e:
            java.lang.Object r0 = r0.f(r1, r2, r3)
            return r0
        L23:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: getShareCircleUrl"
            r0.<init>(r1)
            throw r0
    }

    public static /* synthetic */ java.lang.Object l(com.bxkj.student.v2.retrofit.b r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, kotlin.coroutines.e r15, int r16, java.lang.Object r17) {
            if (r17 != 0) goto L41
            r0 = r16 & 4
            if (r0 == 0) goto L8
            java.lang.String r11 = "password"
        L8:
            r3 = r11
            r11 = r16 & 8
            if (r11 == 0) goto Lf
            java.lang.String r12 = "app"
        Lf:
            r4 = r12
            r11 = r16 & 16
            if (r11 == 0) goto L16
            java.lang.String r13 = "stuApp"
        L16:
            r5 = r13
            r11 = r16 & 32
            if (r11 == 0) goto L37
            java.lang.String r11 = com.bxkj.base.util.b0.d()
            java.lang.String r12 = com.bxkj.base.util.b0.e()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r11)
            java.lang.String r11 = "-"
            r13.append(r11)
            r13.append(r12)
            java.lang.String r14 = r13.toString()
        L37:
            r0 = r8
            r1 = r9
            r2 = r10
            r6 = r14
            r7 = r15
            java.lang.Object r8 = r0.D(r1, r2, r3, r4, r5, r6, r7)
            return r8
        L41:
            java.lang.UnsupportedOperationException r8 = new java.lang.UnsupportedOperationException
            java.lang.String r9 = "Super calls with default arguments not supported in this target, function: login"
            r8.<init>(r9)
            throw r8
    }

    public static /* synthetic */ java.lang.Object m(com.bxkj.student.v2.retrofit.b r0, java.lang.String r1, java.lang.String r2, java.lang.String r3, kotlin.coroutines.e r4, int r5, java.lang.Object r6) {
            if (r6 != 0) goto L13
            r6 = r5 & 2
            if (r6 == 0) goto L8
            java.lang.String r2 = "password"
        L8:
            r5 = r5 & 4
            if (r5 == 0) goto Le
            java.lang.String r3 = "oldtsn"
        Le:
            java.lang.Object r0 = r0.x(r1, r2, r3, r4)
            return r0
        L13:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: loginFromOldSystemToNew"
            r0.<init>(r1)
            throw r0
    }

    public static /* synthetic */ java.lang.Object n(com.bxkj.student.v2.retrofit.b r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, kotlin.coroutines.e r11, int r12, java.lang.Object r13) {
            if (r13 != 0) goto L1f
            r13 = r12 & 2
            if (r13 == 0) goto L8
            java.lang.String r8 = "123456"
        L8:
            r2 = r8
            r8 = r12 & 4
            if (r8 == 0) goto Lf
            java.lang.String r9 = "password"
        Lf:
            r3 = r9
            r8 = r12 & 8
            if (r8 == 0) goto L16
            java.lang.String r10 = "app"
        L16:
            r0 = r6
            r1 = r7
            r4 = r10
            r5 = r11
            java.lang.Object r6 = r0.c(r1, r2, r3, r4, r5)
            return r6
        L1f:
            java.lang.UnsupportedOperationException r6 = new java.lang.UnsupportedOperationException
            java.lang.String r7 = "Super calls with default arguments not supported in this target, function: loginThird"
            r6.<init>(r7)
            throw r6
    }

    public static /* synthetic */ java.lang.Object o(com.bxkj.student.v2.retrofit.b r0, java.lang.String r1, java.lang.String r2, kotlin.coroutines.e r3, int r4, java.lang.Object r5) {
            if (r5 != 0) goto L14
            r4 = r4 & 2
            if (r4 == 0) goto Lf
            java.lang.String r2 = com.bxkj.base.util.b0.d()
            java.lang.String r4 = "getDeviceName(...)"
            kotlin.jvm.internal.g0.o(r2, r4)
        Lf:
            java.lang.Object r0 = r0.s(r1, r2, r3)
            return r0
        L14:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: searchSchool"
            r0.<init>(r1)
            throw r0
    }

    public static /* synthetic */ java.lang.Object p(com.bxkj.student.v2.retrofit.b r6, java.lang.String r7, java.lang.String r8, int r9, java.lang.String r10, kotlin.coroutines.e r11, int r12, java.lang.Object r13) {
            if (r13 != 0) goto L12
            r12 = r12 & 8
            if (r12 == 0) goto L7
            r10 = 0
        L7:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            java.lang.Object r6 = r0.q(r1, r2, r3, r4, r5)
            return r6
        L12:
            java.lang.UnsupportedOperationException r6 = new java.lang.UnsupportedOperationException
            java.lang.String r7 = "Super calls with default arguments not supported in this target, function: v3GetSportsRecord"
            r6.<init>(r7)
            throw r6
    }
}
