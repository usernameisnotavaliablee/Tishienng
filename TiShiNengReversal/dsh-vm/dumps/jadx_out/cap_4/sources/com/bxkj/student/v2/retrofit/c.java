package com.bxkj.student.v2.retrofit;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nHttpResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpResult.kt\ncom/bxkj/student/v2/retrofit/HttpResult\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,155:1\n1#2:156\n*E\n"})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class c {

    @org.jetbrains.annotations.NotNull
    public static final com.bxkj.student.v2.retrofit.c a = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.student.v2.retrofit.HttpResult", f = "HttpResult.kt", i = {0, 0, 0, 1, 1, 1, 2, 2, 2}, l = {84, 84, 84}, m = "onError", n = {"e", "code", "msg", "e", "code", "msg", "e", "code", "msg"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
    static final class a extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object a;
        java.lang.Object b;
        java.lang.Object c;
        java.lang.Object d;
        /* synthetic */ java.lang.Object e;
        final /* synthetic */ com.bxkj.student.v2.retrofit.c f;
        int g;

        a(com.bxkj.student.v2.retrofit.c r1, kotlin.coroutines.e<? super com.bxkj.student.v2.retrofit.c.a> r2) {
                r0 = this;
                r0.f = r1
                r0.<init>(r2)
                return
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
                r1 = this;
                r1.e = r2
                int r2 = r1.g
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r2 | r0
                r1.g = r2
                com.bxkj.student.v2.retrofit.c r2 = r1.f
                r0 = 0
                java.lang.Object r2 = com.bxkj.student.v2.retrofit.c.a(r2, r0, r1)
                return r2
        }
    }

    static {
            com.bxkj.student.v2.retrofit.c r0 = new com.bxkj.student.v2.retrofit.c
            r0.<init>()
            com.bxkj.student.v2.retrofit.c.a = r0
            return
    }

    private c() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final /* synthetic */ java.lang.Object a(com.bxkj.student.v2.retrofit.c r0, java.lang.Exception r1, kotlin.coroutines.e r2) {
            java.lang.Object r0 = r0.b(r1, r2)
            return r0
    }

    private final java.lang.Object b(java.lang.Exception r13, kotlin.coroutines.e<? super java.lang.String> r14) {
            r12 = this;
            boolean r0 = r14 instanceof com.bxkj.student.v2.retrofit.c.a
            if (r0 == 0) goto L13
            r0 = r14
            com.bxkj.student.v2.retrofit.c$a r0 = (com.bxkj.student.v2.retrofit.c.a) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            com.bxkj.student.v2.retrofit.c$a r0 = new com.bxkj.student.v2.retrofit.c$a
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.e
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.g
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L5d
            if (r2 == r5) goto L48
            if (r2 == r4) goto L48
            if (r2 == r3) goto L33
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L33:
            java.lang.Object r13 = r0.d
            java.lang.Throwable r13 = (java.lang.Throwable) r13
            java.lang.Object r1 = r0.c
            kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref.ObjectRef) r1
            java.lang.Object r1 = r0.b
            kotlin.jvm.internal.Ref$IntRef r1 = (kotlin.jvm.internal.Ref.IntRef) r1
            java.lang.Object r0 = r0.a
            java.lang.Exception r0 = (java.lang.Exception) r0
            kotlin.g0.n(r14)
            goto L1d3
        L48:
            java.lang.Object r13 = r0.d
            kotlin.n1 r13 = (kotlin.n1) r13
            java.lang.Object r13 = r0.c
            kotlin.jvm.internal.Ref$ObjectRef r13 = (kotlin.jvm.internal.Ref.ObjectRef) r13
            java.lang.Object r13 = r0.b
            kotlin.jvm.internal.Ref$IntRef r13 = (kotlin.jvm.internal.Ref.IntRef) r13
            java.lang.Object r13 = r0.a
            java.lang.Exception r13 = (java.lang.Exception) r13
            kotlin.g0.n(r14)
            goto L243
        L5d:
            kotlin.g0.n(r14)
            r13.getClass()
            java.lang.String r14 = r13.toString()
            r2 = 0
            java.lang.Object[] r6 = new java.lang.Object[r2]
            com.orhanobut.logger.j.d(r14, r6)
            boolean r14 = r13 instanceof retrofit2.HttpException
            java.lang.String r6 = "】"
            if (r14 == 0) goto L229
            r14 = r13
            retrofit2.HttpException r14 = (retrofit2.HttpException) r14
            int r7 = r14.code()
            retrofit2.c0 r8 = r14.response()
            r9 = 0
            if (r8 == 0) goto L92
            okhttp3.Response r8 = r8.i()
            if (r8 == 0) goto L92
            okhttp3.Request r8 = r8.request()
            if (r8 == 0) goto L92
            okhttp3.HttpUrl r8 = r8.url()
            goto L93
        L92:
            r8 = r9
        L93:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "http code="
            r10.append(r11)
            r10.append(r7)
            java.lang.String r7 = " error url="
            r10.append(r7)
            r10.append(r8)
            java.lang.String r7 = r10.toString()
            java.lang.Object[] r8 = new java.lang.Object[r2]
            com.orhanobut.logger.j.d(r7, r8)
            int r7 = r14.code()
            r8 = 401(0x191, float:5.62E-43)
            if (r7 == r8) goto L21d
            r8 = 426(0x1aa, float:5.97E-43)
            if (r7 == r8) goto L1f6
            r2 = 500(0x1f4, float:7.0E-43)
            if (r7 == r2) goto L1f3
            r2 = 403(0x193, float:5.65E-43)
            if (r7 == r2) goto L1f0
            r2 = 404(0x194, float:5.66E-43)
            if (r7 == r2) goto L1ed
            r2 = 502(0x1f6, float:7.03E-43)
            if (r7 == r2) goto L1d4
            r2 = 503(0x1f7, float:7.05E-43)
            if (r7 == r2) goto L1d4
            kotlin.jvm.internal.Ref$IntRef r2 = new kotlin.jvm.internal.Ref$IntRef
            r2.<init>()
            int r14 = r14.code()
            r2.element = r14
            kotlin.jvm.internal.Ref$ObjectRef r14 = new kotlin.jvm.internal.Ref$ObjectRef
            r14.<init>()
            int r7 = r2.element
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r10 = "连接服务器错误，错误码【"
            r8.append(r10)
            r8.append(r7)
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            r14.element = r6
            r6 = r13
            retrofit2.HttpException r6 = (retrofit2.HttpException) r6     // Catch: java.lang.Throwable -> L107 java.lang.Exception -> L178
            retrofit2.c0 r6 = r6.response()     // Catch: java.lang.Throwable -> L107 java.lang.Exception -> L178
            if (r6 == 0) goto L10a
            okhttp3.ResponseBody r6 = r6.e()     // Catch: java.lang.Throwable -> L107 java.lang.Exception -> L178
            goto L10b
        L107:
            r4 = move-exception
            goto L1a6
        L10a:
            r6 = r9
        L10b:
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> L107 java.lang.Exception -> L178
            r7.<init>()     // Catch: java.lang.Throwable -> L107 java.lang.Exception -> L178
            com.google.gson.Gson r8 = new com.google.gson.Gson     // Catch: java.lang.Throwable -> L107 java.lang.Exception -> L178
            r8.<init>()     // Catch: java.lang.Throwable -> L107 java.lang.Exception -> L178
            if (r6 == 0) goto L11b
            java.lang.String r9 = r6.string()     // Catch: java.lang.Throwable -> L107 java.lang.Exception -> L178
        L11b:
            java.lang.Class r6 = r7.getClass()     // Catch: java.lang.Throwable -> L107 java.lang.Exception -> L178
            java.lang.Object r6 = r8.fromJson(r9, r6)     // Catch: java.lang.Throwable -> L107 java.lang.Exception -> L178
            java.lang.String r7 = "fromJson(...)"
            kotlin.jvm.internal.g0.o(r6, r7)     // Catch: java.lang.Throwable -> L107 java.lang.Exception -> L178
            r7 = r6
            java.util.Map r7 = (java.util.Map) r7     // Catch: java.lang.Throwable -> L107 java.lang.Exception -> L178
            com.bxkj.base.v2.common.utils.x r7 = com.bxkj.base.v2.common.utils.x.a     // Catch: java.lang.Throwable -> L107 java.lang.Exception -> L178
            r8 = r6
            java.util.Map r8 = (java.util.Map) r8     // Catch: java.lang.Throwable -> L107 java.lang.Exception -> L178
            java.lang.String r9 = "code"
            int r7 = r7.k(r8, r9)     // Catch: java.lang.Throwable -> L107 java.lang.Exception -> L178
            r2.element = r7     // Catch: java.lang.Throwable -> L107 java.lang.Exception -> L178
            java.util.Map r6 = (java.util.Map) r6     // Catch: java.lang.Throwable -> L107 java.lang.Exception -> L178
            java.lang.String r7 = "msg"
            java.lang.Object r6 = r6.get(r7)     // Catch: java.lang.Throwable -> L107 java.lang.Exception -> L178
            if (r6 != 0) goto L144
            java.lang.Object r6 = r14.element     // Catch: java.lang.Throwable -> L107 java.lang.Exception -> L178
        L144:
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L107 java.lang.Exception -> L178
            r14.element = r6     // Catch: java.lang.Throwable -> L107 java.lang.Exception -> L178
            kotlin.n1 r3 = kotlin.n1.a     // Catch: java.lang.Throwable -> L107 java.lang.Exception -> L178
            com.bxkj.base.v2.http.exception.ApiException r4 = new com.bxkj.base.v2.http.exception.ApiException
            int r6 = r2.element
            java.lang.Integer r6 = kotlin.coroutines.jvm.internal.a.f(r6)
            java.lang.Object r7 = r14.element
            java.lang.String r7 = (java.lang.String) r7
            r4.<init>(r6, r7)
            java.lang.Object r13 = kotlin.coroutines.jvm.internal.j.a(r13)
            r0.a = r13
            java.lang.Object r13 = kotlin.coroutines.jvm.internal.j.a(r2)
            r0.b = r13
            java.lang.Object r13 = kotlin.coroutines.jvm.internal.j.a(r14)
            r0.c = r13
            r0.d = r3
            r0.g = r5
            java.lang.Object r13 = r12.b(r4, r0)
            if (r13 != r1) goto L243
            goto L1d1
        L178:
            kotlin.n1 r3 = kotlin.n1.a     // Catch: java.lang.Throwable -> L107
            com.bxkj.base.v2.http.exception.ApiException r5 = new com.bxkj.base.v2.http.exception.ApiException
            int r6 = r2.element
            java.lang.Integer r6 = kotlin.coroutines.jvm.internal.a.f(r6)
            java.lang.Object r7 = r14.element
            java.lang.String r7 = (java.lang.String) r7
            r5.<init>(r6, r7)
            java.lang.Object r13 = kotlin.coroutines.jvm.internal.j.a(r13)
            r0.a = r13
            java.lang.Object r13 = kotlin.coroutines.jvm.internal.j.a(r2)
            r0.b = r13
            java.lang.Object r13 = kotlin.coroutines.jvm.internal.j.a(r14)
            r0.c = r13
            r0.d = r3
            r0.g = r4
            java.lang.Object r13 = r12.b(r5, r0)
            if (r13 != r1) goto L243
            goto L1d1
        L1a6:
            com.bxkj.base.v2.http.exception.ApiException r5 = new com.bxkj.base.v2.http.exception.ApiException
            int r6 = r2.element
            java.lang.Integer r6 = kotlin.coroutines.jvm.internal.a.f(r6)
            java.lang.Object r7 = r14.element
            java.lang.String r7 = (java.lang.String) r7
            r5.<init>(r6, r7)
            java.lang.Object r13 = kotlin.coroutines.jvm.internal.j.a(r13)
            r0.a = r13
            java.lang.Object r13 = kotlin.coroutines.jvm.internal.j.a(r2)
            r0.b = r13
            java.lang.Object r13 = kotlin.coroutines.jvm.internal.j.a(r14)
            r0.c = r13
            r0.d = r4
            r0.g = r3
            java.lang.Object r13 = r12.b(r5, r0)
            if (r13 != r1) goto L1d2
        L1d1:
            return r1
        L1d2:
            r13 = r4
        L1d3:
            throw r13
        L1d4:
            int r13 = r14.code()
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r0 = "服务器维护中,错误码【"
            r14.append(r0)
            r14.append(r13)
            r14.append(r6)
            java.lang.String r13 = r14.toString()
            return r13
        L1ed:
            java.lang.String r13 = "未发现服务,错误码【404】"
            return r13
        L1f0:
            java.lang.String r13 = "鉴权失败，请更新最新版APP"
            return r13
        L1f3:
            java.lang.String r13 = "服务器内部错误,错误码【500】"
            return r13
        L1f6:
            retrofit2.c0 r13 = r14.response()
            if (r13 == 0) goto L20d
            okhttp3.Response r13 = r13.i()
            if (r13 == 0) goto L20d
            okhttp3.Request r13 = r13.request()
            if (r13 == 0) goto L20d
            okhttp3.HttpUrl r13 = r13.url()
            goto L20e
        L20d:
            r13 = r9
        L20e:
            java.lang.String r13 = java.lang.String.valueOf(r13)
            java.lang.String r14 = "grant_type=refresh_token"
            boolean r13 = kotlin.text.u.l3(r13, r14, r2, r4, r9)
            if (r13 != 0) goto L243
            java.lang.String r13 = "用户名或密码错误"
            return r13
        L21d:
            com.bxkj.base.v2.data.b$a r13 = com.bxkj.base.v2.data.b.d
            com.bxkj.base.v2.data.b r13 = r13.a()
            r13.z0(r2)
            java.lang.String r13 = "登录失效,请重新登录"
            return r13
        L229:
            boolean r14 = r13 instanceof com.bxkj.base.v2.http.exception.ApiException
            if (r14 == 0) goto L25f
            com.bxkj.base.v2.http.exception.ApiException r13 = (com.bxkj.base.v2.http.exception.ApiException) r13
            java.lang.Integer r14 = r13.getCode()
            if (r14 != 0) goto L236
            goto L246
        L236:
            int r14 = r14.intValue()
            if (r14 != r5) goto L246
            java.lang.String r13 = r13.getMessage()
            if (r13 == 0) goto L243
            return r13
        L243:
            java.lang.String r13 = "其他错误"
            return r13
        L246:
            java.lang.Integer r13 = r13.getCode()
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r0 = "请求服务器错误，错误码【"
            r14.append(r0)
            r14.append(r13)
            r14.append(r6)
            java.lang.String r13 = r14.toString()
            return r13
        L25f:
            boolean r14 = r13 instanceof java.net.UnknownHostException
            if (r14 == 0) goto L266
            java.lang.String r13 = "请检查手机网络"
            return r13
        L266:
            boolean r14 = r13 instanceof java.net.ConnectException
            if (r14 == 0) goto L26d
            java.lang.String r13 = "网络连接失败"
            return r13
        L26d:
            boolean r14 = r13 instanceof java.net.SocketTimeoutException
            if (r14 == 0) goto L274
            java.lang.String r13 = "网络连接超时"
            return r13
        L274:
            boolean r14 = r13 instanceof org.json.JSONException
            java.lang.String r0 = "数据解析错误"
            if (r14 == 0) goto L27b
            return r0
        L27b:
            boolean r14 = r13 instanceof com.alibaba.fastjson.JSONException
            if (r14 == 0) goto L280
            return r0
        L280:
            boolean r14 = r13 instanceof com.google.gson.JsonParseException
            if (r14 == 0) goto L285
            return r0
        L285:
            boolean r14 = r13 instanceof java.io.IOException
            if (r14 == 0) goto L28c
            java.lang.String r13 = "服务器数据异常，请稍后再试"
            return r13
        L28c:
            boolean r14 = r13 instanceof android.database.sqlite.SQLiteFullException
            java.lang.String r0 = "手机内存已满，请清除部分空间后再进行操作"
            if (r14 == 0) goto L293
            return r0
        L293:
            boolean r14 = r13 instanceof net.sqlcipher.database.SQLiteFullException
            if (r14 == 0) goto L298
            return r0
        L298:
            com.tencent.bugly.crashreport.CrashReport.postCatchedException(r13)
            java.lang.String r13 = "系统内部错误,请升级或重启App后重试"
            return r13
    }
}
