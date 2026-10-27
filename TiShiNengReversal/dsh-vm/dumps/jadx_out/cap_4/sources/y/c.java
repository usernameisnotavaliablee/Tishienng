package y;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nRequestInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RequestInterceptor.kt\ncom/bxkj/base/v2/http/interceptor/RequestInterceptor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,204:1\n1869#2,2:205\n216#3,2:207\n1#4:209\n*S KotlinDebug\n*F\n+ 1 RequestInterceptor.kt\ncom/bxkj/base/v2/http/interceptor/RequestInterceptor\n*L\n63#1:205,2\n116#1:207,2\n*E\n"})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class c implements okhttp3.Interceptor {
    public c() {
            r0 = this;
            r0.<init>()
            return
    }

    private final java.lang.String a(java.lang.String r2, java.lang.String r3, boolean r4) {
            r1 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r2 = "="
            r0.append(r2)
            if (r4 == 0) goto L1d
            java.lang.String r2 = "UTF-8"
            java.lang.String r2 = java.net.URLEncoder.encode(r3, r2)     // Catch: java.io.UnsupportedEncodingException -> L19
            r0.append(r2)     // Catch: java.io.UnsupportedEncodingException -> L19
            goto L20
        L19:
            r0.append(r3)
            goto L20
        L1d:
            r0.append(r3)
        L20:
            java.lang.String r2 = r0.toString()
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String b(@org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> r4) {
            r3 = this;
            java.lang.String r0 = "map"
            kotlin.jvm.internal.g0.p(r4, r0)
            b0.b r0 = b0.b.a
            com.bxkj.base.BaseApp r1 = com.bxkj.base.BaseApp.c()
            java.lang.String r2 = "getApp(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            com.bxkj.base.v2.data.b$a r2 = com.bxkj.base.v2.data.b.d
            com.bxkj.base.v2.data.b r2 = r2.a()
            java.lang.String r2 = r2.g()
            java.lang.String r4 = r0.h(r1, r2, r4)
            return r4
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String c(@org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> r9) {
            r8 = this;
            java.lang.String r0 = "map"
            kotlin.jvm.internal.g0.p(r9, r0)
            java.util.Set r0 = r9.keySet()
            java.util.List r0 = kotlin.collections.f0.a6(r0)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.List r0 = kotlin.collections.f0.v5(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r2 = r0.size()
            int r2 = r2 + (-1)
            r3 = 0
            r4 = 0
        L20:
            r5 = 0
            if (r4 >= r2) goto L40
            java.lang.Object r6 = r0.get(r4)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r9.get(r6)
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L35
            java.lang.String r5 = r8.a(r6, r7, r3)
        L35:
            r1.append(r5)
            java.lang.String r5 = "&"
            r1.append(r5)
            int r4 = r4 + 1
            goto L20
        L40:
            int r2 = r0.size()
            int r2 = r2 + (-1)
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r9 = r9.get(r0)
            java.lang.String r9 = (java.lang.String) r9
            if (r9 == 0) goto L58
            java.lang.String r5 = r8.a(r0, r9, r3)
        L58:
            r1.append(r5)
            java.lang.String r9 = r1.toString()
            java.lang.String r9 = cn.bluemobi.dylan.http.MD5Utils.md5(r9)
            java.lang.String r0 = "UTF-8"
            java.lang.String r9 = java.net.URLEncoder.encode(r9, r0)     // Catch: java.io.UnsupportedEncodingException -> L6f
            java.lang.String r0 = "encode(...)"
            kotlin.jvm.internal.g0.o(r9, r0)     // Catch: java.io.UnsupportedEncodingException -> L6f
            return r9
        L6f:
            java.lang.String r9 = ""
            return r9
    }

    @org.jetbrains.annotations.NotNull
    public okhttp3.Response intercept(@org.jetbrains.annotations.NotNull okhttp3.Interceptor.Chain r23) {
            r22 = this;
            r0 = r22
            r1 = r23
            java.lang.String r2 = "chain"
            kotlin.jvm.internal.g0.p(r1, r2)
            okhttp3.Request r2 = r1.request()
            okhttp3.Request$Builder r3 = r2.newBuilder()
            com.bxkj.base.v2.data.b$a r4 = com.bxkj.base.v2.data.b.d
            com.bxkj.base.v2.data.b r5 = r4.a()
            java.lang.String r5 = r5.g()
            okhttp3.HttpUrl r6 = r2.url()
            java.lang.String r6 = r6.toString()
            b0.b r7 = b0.b.a
            com.bxkj.base.BaseApp r8 = com.bxkj.base.BaseApp.c()
            java.lang.String r9 = "getApp(...)"
            kotlin.jvm.internal.g0.o(r8, r9)
            java.lang.String r10 = "7e9c6f977d2da2dbe67cd1005eaaf6e1"
            java.lang.String r8 = r7.l(r8, r10)
            r10 = 0
            boolean r6 = kotlin.text.u.Y1(r6, r8, r10)
            r8 = 2
            r11 = 0
            if (r6 != 0) goto L113
            okhttp3.HttpUrl r6 = r2.url()
            java.lang.String r6 = r6.toString()
            com.bxkj.base.BaseApp r12 = com.bxkj.base.BaseApp.c()
            kotlin.jvm.internal.g0.o(r12, r9)
            java.lang.String r13 = "e5c6b9630a11efdfa31a4cfa4b227688"
            java.lang.String r12 = r7.l(r12, r13)
            boolean r6 = kotlin.text.u.i3(r6, r12, r10)
            if (r6 != 0) goto L113
            okhttp3.HttpUrl r6 = r2.url()
            java.lang.String r6 = r6.toString()
            com.bxkj.base.BaseApp r12 = com.bxkj.base.BaseApp.c()
            kotlin.jvm.internal.g0.o(r12, r9)
            java.lang.String r13 = "e8ed1c044ac961926d8f79bd70dee316"
            java.lang.String r12 = r7.l(r12, r13)
            boolean r6 = kotlin.text.u.i3(r6, r12, r10)
            if (r6 != 0) goto L113
            okhttp3.HttpUrl r6 = r2.url()
            java.lang.String r6 = r6.toString()
            com.bxkj.base.BaseApp r12 = com.bxkj.base.BaseApp.c()
            kotlin.jvm.internal.g0.o(r12, r9)
            java.lang.String r13 = "16dd77786f3c3e1ac964437c978434ef"
            java.lang.String r12 = r7.l(r12, r13)
            boolean r6 = kotlin.text.u.i3(r6, r12, r10)
            if (r6 != 0) goto L113
            okhttp3.HttpUrl r6 = r2.url()
            java.lang.String r6 = r6.toString()
            java.lang.String r12 = "https://device.jpush.cn/v3/aliases"
            boolean r6 = kotlin.text.u.i3(r6, r12, r10)
            if (r6 != 0) goto L113
            com.bxkj.base.v2.data.b r6 = r4.a()
            boolean r6 = r6.Y()
            if (r6 == 0) goto Ld5
            okhttp3.HttpUrl r6 = r2.url()
            java.lang.String r6 = r6.toString()
            com.bxkj.base.BaseApp r12 = com.bxkj.base.BaseApp.c()
            kotlin.jvm.internal.g0.o(r12, r9)
            java.lang.String r13 = "785796286eb58ca15168713af4fce70c"
            java.lang.String r12 = r7.l(r12, r13)
            boolean r6 = kotlin.text.u.l3(r6, r12, r10, r8, r11)
            if (r6 != 0) goto Ld5
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r12 = "Bearer "
            r6.append(r12)
            r6.append(r5)
            java.lang.String r6 = r6.toString()
            goto L10e
        Ld5:
            com.bxkj.base.v2.data.b r6 = r4.a()
            java.lang.String r6 = r6.J()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r6)
            java.lang.String r6 = ":pig"
            r12.append(r6)
            java.lang.String r6 = r12.toString()
            java.nio.charset.Charset r12 = kotlin.text.e.b
            byte[] r6 = r6.getBytes(r12)
            java.lang.String r12 = "getBytes(...)"
            kotlin.jvm.internal.g0.o(r6, r12)
            java.lang.String r6 = cn.bluemobi.dylan.base.utils.b.b(r6)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "Basic  "
            r12.append(r13)
            r12.append(r6)
            java.lang.String r6 = r12.toString()
        L10e:
            java.lang.String r12 = "Authorization"
            r3.addHeader(r12, r6)
        L113:
            com.bxkj.base.v2.data.b r6 = r4.a()
            java.lang.String r6 = r6.J()
            java.lang.String r12 = "school"
            r3.addHeader(r12, r6)
            com.bxkj.base.v2.data.b r6 = r4.a()
            java.lang.String r6 = r6.J()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "host="
            r12.append(r13)
            r12.append(r6)
            java.lang.String r6 = r12.toString()
            java.lang.String r12 = "Cookie"
            r3.addHeader(r12, r6)
            com.bxkj.base.v2.common.utils.f r6 = com.bxkj.base.v2.common.utils.f.a
            com.bxkj.base.BaseApp r12 = com.bxkj.base.BaseApp.c()
            kotlin.jvm.internal.g0.o(r12, r9)
            java.lang.String r6 = r6.d(r12)
            java.lang.String r12 = "uniqueCode"
            r3.addHeader(r12, r6)
            okhttp3.HttpUrl r6 = r2.url()
            java.lang.String r6 = r6.toString()
            java.lang.String r12 = "https://m.boxkj.com/"
            boolean r6 = kotlin.text.u.H2(r6, r12, r10, r8, r11)
            if (r6 == 0) goto L167
            java.lang.String r6 = "channel"
            java.lang.String r13 = "Android"
            r3.addHeader(r6, r13)
        L167:
            long r13 = java.lang.System.currentTimeMillis()
            java.lang.String r6 = java.lang.String.valueOf(r13)
            okhttp3.Headers r13 = r2.headers()
            java.util.Set r13 = r13.names()
            java.lang.String r14 = "timestamp"
            boolean r13 = r13.contains(r14)
            if (r13 == 0) goto L18b
            okhttp3.Headers r6 = r2.headers()
            java.lang.String r6 = r6.get(r14)
            java.lang.String r6 = java.lang.String.valueOf(r6)
        L18b:
            com.bxkj.base.BaseApp r13 = com.bxkj.base.BaseApp.c()
            kotlin.jvm.internal.g0.o(r13, r9)
            com.bxkj.base.v2.data.b r4 = r4.a()
            java.lang.String r4 = r4.j()
            java.lang.String r4 = r7.d(r13, r4, r5, r6)
            com.bxkj.base.BaseApp r13 = com.bxkj.base.BaseApp.c()
            kotlin.jvm.internal.g0.o(r13, r9)
            java.lang.String r5 = r7.e(r13, r5, r6)
            java.lang.String r7 = r2.method()
            java.lang.String r9 = "GET"
            r13 = 1
            boolean r7 = kotlin.text.u.a2(r7, r9, r13)
            java.lang.String r9 = ""
            java.lang.String r15 = "sign"
            java.lang.String r13 = "appSecret"
            java.lang.String r8 = "appId"
            if (r7 == 0) goto L20e
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
            r7.<init>()
            okhttp3.HttpUrl r10 = r2.url()
            java.util.Set r10 = r10.queryParameterNames()
            java.util.Iterator r10 = r10.iterator()
        L1cf:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L1fa
            java.lang.Object r11 = r10.next()
            java.lang.String r11 = (java.lang.String) r11
            okhttp3.HttpUrl r12 = r2.url()
            java.lang.String r16 = r12.queryParameter(r11)
            if (r16 == 0) goto L1f5
            r20 = 4
            r21 = 0
            java.lang.String r17 = "\n"
            java.lang.String r18 = ""
            r19 = 0
            java.lang.String r12 = kotlin.text.u.x2(r16, r17, r18, r19, r20, r21)
            if (r12 != 0) goto L1f6
        L1f5:
            r12 = r9
        L1f6:
            r7.put(r11, r12)
            goto L1cf
        L1fa:
            r7.put(r8, r4)
            r7.put(r13, r5)
            r3.header(r14, r6)
            java.lang.String r4 = r0.b(r7)
            r3.addHeader(r15, r4)
            r18 = r2
            goto L36a
        L20e:
            okhttp3.RequestBody r7 = r2.body()
            boolean r7 = r7 instanceof okhttp3.FormBody
            if (r7 == 0) goto L2ac
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
            r7.<init>()
            okhttp3.HttpUrl r9 = r2.url()
            java.lang.String r9 = r9.toString()
            r18 = r2
            r2 = 2
            boolean r2 = kotlin.text.u.H2(r9, r12, r10, r2, r11)
            java.lang.String r9 = "null cannot be cast to non-null type okhttp3.FormBody"
            if (r2 == 0) goto L278
            okhttp3.FormBody$Builder r2 = new okhttp3.FormBody$Builder
            r4 = 1
            r2.<init>(r11, r4, r11)
            okhttp3.RequestBody r4 = r18.body()
            kotlin.jvm.internal.g0.n(r4, r9)
            okhttp3.FormBody r4 = (okhttp3.FormBody) r4
            int r5 = r4.size()
        L241:
            if (r10 >= r5) goto L254
            java.lang.String r9 = r4.name(r10)
            java.lang.String r11 = r4.value(r10)
            r7.put(r9, r11)
            r2.add(r9, r11)
            int r10 = r10 + 1
            goto L241
        L254:
            java.lang.String r4 = "move"
            r7.put(r8, r4)
            java.lang.String r4 = "e8167ef026cbc5e456ab837d9d6d9254"
            r7.put(r13, r4)
            r7.put(r14, r6)
            java.lang.String r4 = r0.c(r7)
            r2.add(r14, r6)
            r2.add(r15, r4)
            java.lang.String r4 = r18.method()
            okhttp3.FormBody r2 = r2.build()
            r3.method(r4, r2)
            goto L36a
        L278:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            okhttp3.RequestBody r7 = r18.body()
            kotlin.jvm.internal.g0.n(r7, r9)
            okhttp3.FormBody r7 = (okhttp3.FormBody) r7
            int r9 = r7.size()
        L28a:
            if (r10 >= r9) goto L29a
            java.lang.String r11 = r7.name(r10)
            java.lang.String r12 = r7.value(r10)
            r2.put(r11, r12)
            int r10 = r10 + 1
            goto L28a
        L29a:
            r2.put(r8, r4)
            r2.put(r13, r5)
            r3.header(r14, r6)
            java.lang.String r2 = r0.b(r2)
            r3.addHeader(r15, r2)
            goto L36a
        L2ac:
            r18 = r2
            okhttp3.RequestBody r2 = r18.body()
            boolean r2 = r2 instanceof okhttp3.MultipartBody
            if (r2 == 0) goto L30b
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            okhttp3.RequestBody r7 = r18.body()
            java.lang.String r9 = "null cannot be cast to non-null type okhttp3.MultipartBody"
            kotlin.jvm.internal.g0.n(r7, r9)
            okhttp3.MultipartBody r7 = (okhttp3.MultipartBody) r7
            kotlin.Pair r7 = com.bxkj.base.v2.common.ext.h.a(r7)
            java.lang.Object r9 = r7.component1()
            java.util.Map r9 = (java.util.Map) r9
            java.lang.Object r7 = r7.component2()
            java.util.Map r7 = (java.util.Map) r7
            java.util.Set r7 = r9.entrySet()
            java.util.Iterator r7 = r7.iterator()
        L2de:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L2fa
            java.lang.Object r9 = r7.next()
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9
            java.lang.Object r10 = r9.getKey()
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r9 = r9.getValue()
            java.lang.String r9 = (java.lang.String) r9
            r2.put(r10, r9)
            goto L2de
        L2fa:
            r2.put(r8, r4)
            r2.put(r13, r5)
            r3.header(r14, r6)
            java.lang.String r2 = r0.b(r2)
            r3.addHeader(r15, r2)
            goto L36a
        L30b:
            okhttp3.RequestBody r2 = r18.body()
            if (r2 == 0) goto L31c
            okhttp3.MediaType r2 = r2.contentType()
            if (r2 == 0) goto L31c
            java.lang.String r2 = r2.type()
            goto L31d
        L31c:
            r2 = r11
        L31d:
            java.lang.String r7 = "application"
            boolean r2 = kotlin.jvm.internal.g0.g(r2, r7)
            if (r2 == 0) goto L36a
            okhttp3.RequestBody r2 = r18.body()
            if (r2 == 0) goto L335
            okhttp3.MediaType r2 = r2.contentType()
            if (r2 == 0) goto L335
            java.lang.String r11 = r2.subtype()
        L335:
            java.lang.String r2 = "json"
            boolean r2 = kotlin.jvm.internal.g0.g(r11, r2)
            if (r2 == 0) goto L36a
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            okhttp3.RequestBody r7 = r18.body()
            if (r7 == 0) goto L35a
            okio.Buffer r10 = new okio.Buffer
            r10.<init>()
            r7.writeTo(r10)
            java.lang.String r7 = r10.readUtf8()
            java.lang.Object r7 = r2.put(r7, r9)
            java.lang.String r7 = (java.lang.String) r7
        L35a:
            r2.put(r8, r4)
            r2.put(r13, r5)
            r3.header(r14, r6)
            java.lang.String r2 = r0.b(r2)
            r3.addHeader(r15, r2)
        L36a:
            okhttp3.HttpUrl r2 = r18.url()
            java.lang.String r2 = r2.toString()
            java.lang.String r2 = java.net.URLDecoder.decode(r2)
            java.lang.String r4 = "decode(...)"
            kotlin.jvm.internal.g0.o(r2, r4)
            r3.url(r2)
            okhttp3.Request r2 = r3.build()
            okhttp3.Response r1 = r1.proceed(r2)
            return r1
    }
}
