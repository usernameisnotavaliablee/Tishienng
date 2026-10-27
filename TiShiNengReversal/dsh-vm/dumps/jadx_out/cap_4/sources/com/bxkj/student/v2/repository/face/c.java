package com.bxkj.student.v2.repository.face;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class c {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.student.v2.repository.face.FaceDetectRepository", f = "FaceDetectRepository.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {45, 70}, m = "faceDetectV2", n = {"identify", "type", "runType", "filePath", "coordinates", "timeStamp", "paramMap", "exception", "identify", "type", "runType", "filePath", "coordinates", "timeStamp", "paramMap", "jsonParam", "timestamp", "aesEncrypt", "key", "data", "file", "requestBody", "exception"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "L$12", "L$13", "I$0"})
    static final class a extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object a;
        java.lang.Object b;
        java.lang.Object c;
        java.lang.Object d;
        java.lang.Object e;
        java.lang.Object f;
        java.lang.Object g;
        java.lang.Object h;
        java.lang.Object i;
        java.lang.Object j;
        java.lang.Object k;

        /* renamed from: l, reason: collision with root package name */
        java.lang.Object f1394l;

        /* renamed from: m, reason: collision with root package name */
        java.lang.Object f1395m;

        /* renamed from: n, reason: collision with root package name */
        java.lang.Object f1396n;

        /* renamed from: o, reason: collision with root package name */
        int f1397o;

        /* renamed from: p, reason: collision with root package name */
        /* synthetic */ java.lang.Object f1398p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ com.bxkj.student.v2.repository.face.c f1399q;

        /* renamed from: r, reason: collision with root package name */
        int f1400r;

        a(com.bxkj.student.v2.repository.face.c r1, kotlin.coroutines.e<? super com.bxkj.student.v2.repository.face.c.a> r2) {
                r0 = this;
                r0.f1399q = r1
                r0.<init>(r2)
                return
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r10) {
                r9 = this;
                r9.f1398p = r10
                int r10 = r9.f1400r
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r10 = r10 | r0
                r9.f1400r = r10
                com.bxkj.student.v2.repository.face.c r0 = r9.f1399q
                r6 = 0
                r7 = 0
                r1 = 0
                r2 = 0
                r3 = 0
                r4 = 0
                r5 = 0
                r8 = r9
                java.lang.Object r10 = r0.a(r1, r2, r3, r4, r5, r6, r7, r8)
                return r10
        }
    }

    public c() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ java.lang.Object b(com.bxkj.student.v2.repository.face.c r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, int r17, kotlin.coroutines.e r18, int r19, java.lang.Object r20) {
            r0 = r19 & 64
            if (r0 == 0) goto L11
            r0 = 0
            r8 = 0
        L6:
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r9 = r18
            goto L14
        L11:
            r8 = r17
            goto L6
        L14:
            java.lang.Object r10 = r1.a(r2, r3, r4, r5, r6, r7, r8, r9)
            return r10
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object a(@org.jetbrains.annotations.NotNull java.lang.String r19, @org.jetbrains.annotations.NotNull java.lang.String r20, @org.jetbrains.annotations.NotNull java.lang.String r21, @org.jetbrains.annotations.NotNull java.lang.String r22, @org.jetbrains.annotations.Nullable java.lang.String r23, @org.jetbrains.annotations.Nullable java.lang.String r24, int r25, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r26) {
            r18 = this;
            r0 = r26
            boolean r1 = r0 instanceof com.bxkj.student.v2.repository.face.c.a
            if (r1 == 0) goto L17
            r1 = r0
            com.bxkj.student.v2.repository.face.c$a r1 = (com.bxkj.student.v2.repository.face.c.a) r1
            int r2 = r1.f1400r
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f1400r = r2
            r2 = r18
            goto L1e
        L17:
            com.bxkj.student.v2.repository.face.c$a r1 = new com.bxkj.student.v2.repository.face.c$a
            r2 = r18
            r1.<init>(r2, r0)
        L1e:
            java.lang.Object r0 = r1.f1398p
            java.lang.Object r3 = kotlin.coroutines.intrinsics.a.l()
            int r4 = r1.f1400r
            r5 = 0
            r6 = 2
            r7 = 1
            if (r4 == 0) goto Lb0
            if (r4 == r7) goto L74
            if (r4 != r6) goto L6c
            java.lang.Object r3 = r1.f1396n
            okhttp3.MultipartBody r3 = (okhttp3.MultipartBody) r3
            java.lang.Object r3 = r1.f1395m
            java.io.File r3 = (java.io.File) r3
            java.lang.Object r3 = r1.f1394l
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r3 = r1.k
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r3 = r1.j
            java.lang.String[] r3 = (java.lang.String[]) r3
            java.lang.Object r3 = r1.i
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r3 = r1.h
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r3 = r1.g
            java.util.Map r3 = (java.util.Map) r3
            java.lang.Object r3 = r1.f
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r3 = r1.e
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r3 = r1.d
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r3 = r1.c
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r3 = r1.b
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r1 = r1.a
            java.lang.String r1 = (java.lang.String) r1
            kotlin.g0.n(r0)
            goto L28b
        L6c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L74:
            int r4 = r1.f1397o
            java.lang.Object r8 = r1.g
            java.util.Map r8 = (java.util.Map) r8
            java.lang.Object r9 = r1.f
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r10 = r1.e
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r11 = r1.d
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r12 = r1.c
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r13 = r1.b
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r14 = r1.a
            java.lang.String r14 = (java.lang.String) r14
            kotlin.g0.n(r0)     // Catch: java.lang.Exception -> La0
            r17 = r8
            r8 = r4
            r4 = r10
            r10 = r12
            r12 = r9
            r9 = r13
            r13 = r17
            goto L133
        La0:
            r0 = move-exception
            r26 = r8
            r8 = r4
            r4 = r10
            r10 = r12
            r12 = r9
            r9 = r13
            r13 = r26
        Laa:
            r26 = 2
        Lac:
            r16 = 1
            goto L1a7
        Lb0:
            kotlin.g0.n(r0)
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap
            r8.<init>()
            b0.a r0 = b0.a.a
            java.util.Map r0 = r0.a()
            r8.putAll(r0)
            java.lang.String r0 = "identify"
            r4 = r19
            r8.put(r0, r4)
            java.lang.String r0 = "type"
            r9 = r20
            r8.put(r0, r9)
            java.lang.String r0 = "runType"
            r10 = r21
            r8.put(r0, r10)
            java.lang.String r0 = "coordinates"
            r11 = r23
            r8.put(r0, r11)
            java.lang.String r0 = "timeStamp"
            r12 = r24
            r8.put(r0, r12)
            java.lang.String r0 = "exception"
            java.lang.String r13 = java.lang.String.valueOf(r25)
            r8.put(r0, r13)
            com.bxkj.student.v2.common.db.AppDatabase$a r0 = com.bxkj.student.v2.common.db.AppDatabase.a     // Catch: java.lang.Exception -> L196
            com.bxkj.student.v2.common.db.AppDatabase r0 = r0.a()     // Catch: java.lang.Exception -> L196
            com.bxkj.student.v2.common.db.dao.b r0 = r0.w()     // Catch: java.lang.Exception -> L196
            if (r0 == 0) goto L19a
            java.lang.Object r13 = kotlin.coroutines.jvm.internal.j.a(r4)     // Catch: java.lang.Exception -> L196
            r1.a = r13     // Catch: java.lang.Exception -> L196
            java.lang.Object r13 = kotlin.coroutines.jvm.internal.j.a(r9)     // Catch: java.lang.Exception -> L196
            r1.b = r13     // Catch: java.lang.Exception -> L196
            java.lang.Object r13 = kotlin.coroutines.jvm.internal.j.a(r10)     // Catch: java.lang.Exception -> L196
            r1.c = r13     // Catch: java.lang.Exception -> L196
            r13 = r22
            r1.d = r13     // Catch: java.lang.Exception -> L192
            java.lang.Object r14 = kotlin.coroutines.jvm.internal.j.a(r11)     // Catch: java.lang.Exception -> L192
            r1.e = r14     // Catch: java.lang.Exception -> L192
            java.lang.Object r14 = kotlin.coroutines.jvm.internal.j.a(r12)     // Catch: java.lang.Exception -> L192
            r1.f = r14     // Catch: java.lang.Exception -> L192
            r1.g = r8     // Catch: java.lang.Exception -> L192
            r14 = r25
            r1.f1397o = r14     // Catch: java.lang.Exception -> L184
            r1.f1400r = r7     // Catch: java.lang.Exception -> L184
            java.lang.Object r0 = r0.f(r1)     // Catch: java.lang.Exception -> L184
            if (r0 != r3) goto L12b
            goto L28a
        L12b:
            r17 = r14
            r14 = r4
            r4 = r11
            r11 = r13
            r13 = r8
            r8 = r17
        L133:
            l0.a r0 = (l0.a) r0     // Catch: java.lang.Exception -> L17c
            if (r0 == 0) goto L17f
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L17c
            r15.<init>()     // Catch: java.lang.Exception -> L17c
            r26 = 2
            java.lang.String r6 = "获取环境信息成功="
            r15.append(r6)     // Catch: java.lang.Exception -> L179
            r15.append(r0)     // Catch: java.lang.Exception -> L179
            java.lang.String r6 = r15.toString()     // Catch: java.lang.Exception -> L179
            java.lang.Object[] r15 = new java.lang.Object[r5]     // Catch: java.lang.Exception -> L179
            com.orhanobut.logger.j.d(r6, r15)     // Catch: java.lang.Exception -> L179
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap     // Catch: java.lang.Exception -> L179
            r6.<init>()     // Catch: java.lang.Exception -> L179
            java.lang.String r15 = "deviceId"
            r16 = 1
            java.lang.String r7 = r0.f()     // Catch: java.lang.Exception -> L177
            r6.put(r15, r7)     // Catch: java.lang.Exception -> L177
            java.lang.String r7 = "oppo"
            java.lang.String r15 = r0.g()     // Catch: java.lang.Exception -> L177
            r6.put(r7, r15)     // Catch: java.lang.Exception -> L177
            java.lang.String r7 = "safe"
            java.lang.String r0 = r0.h()     // Catch: java.lang.Exception -> L177
            r6.put(r7, r0)     // Catch: java.lang.Exception -> L177
            java.lang.String r0 = "environment"
            r13.put(r0, r6)     // Catch: java.lang.Exception -> L177
            goto L1b0
        L177:
            r0 = move-exception
            goto L1a7
        L179:
            r0 = move-exception
            goto Lac
        L17c:
            r0 = move-exception
            goto Laa
        L17f:
            r26 = 2
            r16 = 1
            goto L1b0
        L184:
            r0 = move-exception
        L185:
            r26 = 2
            r16 = 1
            r17 = r14
            r14 = r4
            r4 = r11
            r11 = r13
            r13 = r8
            r8 = r17
            goto L1a7
        L192:
            r0 = move-exception
        L193:
            r14 = r25
            goto L185
        L196:
            r0 = move-exception
            r13 = r22
            goto L193
        L19a:
            r13 = r22
            r14 = r25
            r17 = r14
            r14 = r4
            r4 = r11
            r11 = r13
            r13 = r8
            r8 = r17
            goto L17f
        L1a7:
            java.lang.String r0 = com.bxkj.base.v2.common.ext.e.a(r0)
            java.lang.Object[] r5 = new java.lang.Object[r5]
            com.orhanobut.logger.j.e(r0, r5)
        L1b0:
            com.google.gson.Gson r0 = new com.google.gson.Gson
            r0.<init>()
            java.lang.String r0 = r0.toJson(r13)
            com.orhanobut.logger.j.h(r0)
            long r5 = java.lang.System.currentTimeMillis()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            b0.b r6 = b0.b.a
            com.bxkj.student.App$a r7 = com.bxkj.student.App.d
            com.bxkj.student.App r7 = r7.a()
            com.bxkj.base.v2.data.b$a r15 = com.bxkj.base.v2.data.b.d
            com.bxkj.base.v2.data.b r15 = r15.a()
            java.lang.String r15 = r15.g()
            kotlin.jvm.internal.g0.m(r0)
            java.lang.String[] r6 = r6.b(r7, r15, r5, r0)
            r7 = r6[r16]
            r15 = r6[r26]
            r19 = r0
            java.io.File r0 = new java.io.File
            r0.<init>(r11)
            okhttp3.MultipartBody$Builder r2 = new okhttp3.MultipartBody$Builder
            r20 = r4
            r4 = 0
            r21 = r6
            r6 = 1
            r2.<init>(r4, r6, r4)
            okhttp3.MediaType r4 = okhttp3.MultipartBody.FORM
            okhttp3.MultipartBody$Builder r2 = r2.setType(r4)
            java.lang.String r4 = "key"
            okhttp3.MultipartBody$Builder r2 = r2.addFormDataPart(r4, r7)
            java.lang.String r4 = "param"
            okhttp3.MultipartBody$Builder r2 = r2.addFormDataPart(r4, r15)
            java.lang.String r4 = r0.getName()
            okhttp3.RequestBody$Companion r6 = okhttp3.RequestBody.Companion
            r22 = r7
            okhttp3.MediaType$Companion r7 = okhttp3.MediaType.Companion
            r23 = r9
            java.lang.String r9 = "image/png"
            okhttp3.MediaType r7 = r7.get(r9)
            okhttp3.RequestBody r6 = r6.create(r0, r7)
            java.lang.String r7 = "file"
            okhttp3.MultipartBody$Builder r2 = r2.addFormDataPart(r7, r4, r6)
            okhttp3.MultipartBody r2 = r2.build()
            com.bxkj.student.v2.retrofit.e r4 = com.bxkj.student.v2.retrofit.e.a
            com.bxkj.student.v2.retrofit.b r4 = r4.c()
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.j.a(r14)
            r1.a = r6
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.j.a(r23)
            r1.b = r6
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.j.a(r10)
            r1.c = r6
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.j.a(r11)
            r1.d = r6
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.j.a(r20)
            r1.e = r6
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.j.a(r12)
            r1.f = r6
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.j.a(r13)
            r1.g = r6
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.j.a(r19)
            r1.h = r6
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.j.a(r5)
            r1.i = r6
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.j.a(r21)
            r1.j = r6
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.j.a(r22)
            r1.k = r6
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.j.a(r15)
            r1.f1394l = r6
            java.lang.Object r0 = kotlin.coroutines.jvm.internal.j.a(r0)
            r1.f1395m = r0
            java.lang.Object r0 = kotlin.coroutines.jvm.internal.j.a(r2)
            r1.f1396n = r0
            r1.f1397o = r8
            r6 = 2
            r1.f1400r = r6
            java.lang.Object r0 = r4.o(r5, r2, r1)
            if (r0 != r3) goto L28b
        L28a:
            return r3
        L28b:
            com.bxkj.base.v2.http.result.ApiResult r0 = (com.bxkj.base.v2.http.result.ApiResult) r0
            if (r0 == 0) goto L295
            java.lang.Object r0 = r0.apiData()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
        L295:
            kotlin.n1 r0 = kotlin.n1.a
            return r0
    }
}
