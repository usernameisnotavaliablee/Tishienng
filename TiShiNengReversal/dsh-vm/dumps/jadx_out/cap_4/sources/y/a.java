package y;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nHttpLogInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpLogInterceptor.kt\ncom/bxkj/base/v2/http/interceptor/HttpLogInterceptor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,137:1\n1878#2,3:138\n216#3,2:141\n216#3,2:143\n*S KotlinDebug\n*F\n+ 1 HttpLogInterceptor.kt\ncom/bxkj/base/v2/http/interceptor/HttpLogInterceptor\n*L\n33#1:138,3\n103#1:141,2\n114#1:143,2\n*E\n"})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class a implements okhttp3.Interceptor {

    @org.jetbrains.annotations.NotNull
    private final java.lang.StringBuilder a;

    public a() {
            r1 = this;
            r1.<init>()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1.a = r0
            return
    }

    private final void a(okhttp3.Request r10) {
            r9 = this;
            okhttp3.RequestBody r0 = r10.body()
            boolean r0 = r0 instanceof okhttp3.FormBody
            java.lang.String r1 = "\u3000\u3000\u3000\u3000\u3000"
            java.lang.String r2 = "\n"
            r3 = -1
            java.lang.String r4 = "="
            if (r0 == 0) goto L4b
            okhttp3.RequestBody r10 = r10.body()
            okhttp3.FormBody r10 = (okhttp3.FormBody) r10
            kotlin.jvm.internal.g0.m(r10)
            int r0 = r10.size()
            r5 = 0
        L1d:
            if (r5 >= r0) goto L13f
            java.lang.String r6 = r10.encodedName(r5)
            java.lang.String r7 = r10.value(r5)
            java.lang.StringBuilder r8 = r9.a
            int r8 = r8.indexOf(r4)
            if (r8 == r3) goto L39
            java.lang.StringBuilder r8 = r9.a
            r8.append(r2)
            java.lang.StringBuilder r8 = r9.a
            r8.append(r1)
        L39:
            java.lang.StringBuilder r8 = r9.a
            r8.append(r6)
            java.lang.StringBuilder r6 = r9.a
            r6.append(r4)
            java.lang.StringBuilder r6 = r9.a
            r6.append(r7)
            int r5 = r5 + 1
            goto L1d
        L4b:
            okhttp3.RequestBody r0 = r10.body()
            boolean r0 = r0 instanceof okhttp3.MultipartBody
            if (r0 == 0) goto Lf1
            okhttp3.RequestBody r10 = r10.body()
            okhttp3.MultipartBody r10 = (okhttp3.MultipartBody) r10
            if (r10 == 0) goto L13f
            kotlin.Pair r10 = com.bxkj.base.v2.common.ext.h.a(r10)
            if (r10 == 0) goto L13f
            java.lang.Object r0 = r10.component1()
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Object r10 = r10.component2()
            java.util.Map r10 = (java.util.Map) r10
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L75:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto Laf
            java.lang.Object r5 = r0.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r6 = r5.getKey()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r5 = r5.getValue()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.StringBuilder r7 = r9.a
            int r7 = r7.indexOf(r4)
            if (r7 == r3) goto L9f
            java.lang.StringBuilder r7 = r9.a
            r7.append(r2)
            java.lang.StringBuilder r7 = r9.a
            r7.append(r1)
        L9f:
            java.lang.StringBuilder r7 = r9.a
            r7.append(r6)
            java.lang.StringBuilder r6 = r9.a
            r6.append(r4)
            java.lang.StringBuilder r6 = r9.a
            r6.append(r5)
            goto L75
        Laf:
            java.util.Set r10 = r10.entrySet()
            java.util.Iterator r10 = r10.iterator()
        Lb7:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L13f
            java.lang.Object r0 = r10.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r5 = r0.getKey()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.StringBuilder r6 = r9.a
            int r6 = r6.indexOf(r4)
            if (r6 == r3) goto Le1
            java.lang.StringBuilder r6 = r9.a
            r6.append(r2)
            java.lang.StringBuilder r6 = r9.a
            r6.append(r1)
        Le1:
            java.lang.StringBuilder r6 = r9.a
            r6.append(r5)
            java.lang.StringBuilder r5 = r9.a
            r5.append(r4)
            java.lang.StringBuilder r5 = r9.a
            r5.append(r0)
            goto Lb7
        Lf1:
            okhttp3.RequestBody r0 = r10.body()
            r1 = 0
            if (r0 == 0) goto L103
            okhttp3.MediaType r0 = r0.contentType()
            if (r0 == 0) goto L103
            java.lang.String r0 = r0.type()
            goto L104
        L103:
            r0 = r1
        L104:
            java.lang.String r2 = "application"
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r2)
            if (r0 == 0) goto L13f
            okhttp3.RequestBody r0 = r10.body()
            if (r0 == 0) goto L11c
            okhttp3.MediaType r0 = r0.contentType()
            if (r0 == 0) goto L11c
            java.lang.String r1 = r0.subtype()
        L11c:
            java.lang.String r0 = "json"
            boolean r0 = kotlin.jvm.internal.g0.g(r1, r0)
            if (r0 == 0) goto L13f
            okhttp3.RequestBody r10 = r10.body()
            if (r10 == 0) goto L13f
            okio.Buffer r0 = new okio.Buffer
            r0.<init>()
            r10.writeTo(r0)
            java.lang.String r10 = r0.readUtf8()
            java.lang.StringBuilder r0 = r9.a
            java.lang.String r10 = com.bxkj.base.v2.common.ext.u.b(r10)
            r0.append(r10)
        L13f:
            return
    }

    @org.jetbrains.annotations.NotNull
    public okhttp3.Response intercept(@org.jetbrains.annotations.NotNull okhttp3.Interceptor.Chain r11) {
            r10 = this;
            java.lang.String r0 = "\n"
            java.lang.String r1 = "chain"
            kotlin.jvm.internal.g0.p(r11, r1)
            java.lang.StringBuilder r1 = r10.a     // Catch: java.lang.Exception -> L17f
            r2 = 0
            r1.setLength(r2)     // Catch: java.lang.Exception -> L17f
            okhttp3.Request r1 = r11.request()     // Catch: java.lang.Exception -> L17f
            java.lang.StringBuilder r3 = r10.a     // Catch: java.lang.Exception -> L17f
            java.lang.String r4 = "请求地址："
            r3.append(r4)     // Catch: java.lang.Exception -> L17f
            java.lang.StringBuilder r3 = r10.a     // Catch: java.lang.Exception -> L17f
            okhttp3.HttpUrl r4 = r1.url()     // Catch: java.lang.Exception -> L17f
            r3.append(r4)     // Catch: java.lang.Exception -> L17f
            java.lang.StringBuilder r3 = r10.a     // Catch: java.lang.Exception -> L17f
            r3.append(r0)     // Catch: java.lang.Exception -> L17f
            java.lang.StringBuilder r3 = r10.a     // Catch: java.lang.Exception -> L17f
            java.lang.String r4 = "请求头：\u3000"
            r3.append(r4)     // Catch: java.lang.Exception -> L17f
            okhttp3.Headers r3 = r1.headers()     // Catch: java.lang.Exception -> L17f
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Exception -> L17f
            r4 = 0
        L36:
            boolean r5 = r3.hasNext()     // Catch: java.lang.Exception -> L17f
            if (r5 == 0) goto L76
            java.lang.Object r5 = r3.next()     // Catch: java.lang.Exception -> L17f
            int r6 = r4 + 1
            if (r4 >= 0) goto L47
            kotlin.collections.f0.b0()     // Catch: java.lang.Exception -> L17f
        L47:
            kotlin.Pair r5 = (kotlin.Pair) r5     // Catch: java.lang.Exception -> L17f
            if (r4 <= 0) goto L57
            java.lang.StringBuilder r4 = r10.a     // Catch: java.lang.Exception -> L17f
            r4.append(r0)     // Catch: java.lang.Exception -> L17f
            java.lang.StringBuilder r4 = r10.a     // Catch: java.lang.Exception -> L17f
            java.lang.String r7 = "\u3000\u3000\u3000\u3000\u3000"
            r4.append(r7)     // Catch: java.lang.Exception -> L17f
        L57:
            java.lang.StringBuilder r4 = r10.a     // Catch: java.lang.Exception -> L17f
            java.lang.Object r7 = r5.getFirst()     // Catch: java.lang.Exception -> L17f
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Exception -> L17f
            r4.append(r7)     // Catch: java.lang.Exception -> L17f
            java.lang.StringBuilder r4 = r10.a     // Catch: java.lang.Exception -> L17f
            java.lang.String r7 = ":"
            r4.append(r7)     // Catch: java.lang.Exception -> L17f
            java.lang.StringBuilder r4 = r10.a     // Catch: java.lang.Exception -> L17f
            java.lang.Object r5 = r5.getSecond()     // Catch: java.lang.Exception -> L17f
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Exception -> L17f
            r4.append(r5)     // Catch: java.lang.Exception -> L17f
            r4 = r6
            goto L36
        L76:
            java.lang.StringBuilder r3 = r10.a     // Catch: java.lang.Exception -> L17f
            r3.append(r0)     // Catch: java.lang.Exception -> L17f
            okhttp3.Request$Builder r3 = r1.newBuilder()     // Catch: java.lang.Exception -> L17f
            okhttp3.Request r3 = r3.build()     // Catch: java.lang.Exception -> L17f
            okhttp3.Response r3 = r11.proceed(r3)     // Catch: java.lang.Exception -> L17f
            java.lang.String r4 = "POST"
            java.lang.String r5 = r1.method()     // Catch: java.lang.Exception -> L17f
            boolean r4 = kotlin.jvm.internal.g0.g(r4, r5)     // Catch: java.lang.Exception -> L17f
            r5 = 0
            if (r4 == 0) goto Lfb
            java.lang.StringBuilder r4 = r10.a     // Catch: java.lang.Exception -> L17f
            java.lang.String r6 = "请求参数："
            r4.append(r6)     // Catch: java.lang.Exception -> L17f
            r10.a(r1)     // Catch: java.lang.Exception -> L17f
            java.lang.StringBuilder r4 = r10.a     // Catch: java.lang.Exception -> L17f
            r4.append(r0)     // Catch: java.lang.Exception -> L17f
            java.lang.StringBuilder r4 = r10.a     // Catch: java.lang.Exception -> L17f
            java.lang.String r6 = "请求大小："
            r4.append(r6)     // Catch: java.lang.Exception -> L17f
            java.lang.StringBuilder r4 = r10.a     // Catch: java.lang.Exception -> L17f
            okhttp3.RequestBody r6 = r1.body()     // Catch: java.lang.Exception -> L17f
            if (r6 == 0) goto Lbb
            long r6 = r6.contentLength()     // Catch: java.lang.Exception -> L17f
            java.lang.String r6 = com.bxkj.base.v2.common.ext.g.a(r6)     // Catch: java.lang.Exception -> L17f
            goto Lbc
        Lbb:
            r6 = r5
        Lbc:
            r4.append(r6)     // Catch: java.lang.Exception -> L17f
            java.lang.StringBuilder r4 = r10.a     // Catch: java.lang.Exception -> L17f
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> L17f
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L17f
            com.orhanobut.logger.j.d(r4, r6)     // Catch: java.lang.Exception -> L17f
            java.lang.StringBuilder r4 = r10.a     // Catch: java.lang.Exception -> L17f
            r4.setLength(r2)     // Catch: java.lang.Exception -> L17f
            java.lang.StringBuilder r4 = r10.a     // Catch: java.lang.Exception -> L17f
            java.lang.String r6 = "响应地址："
            r4.append(r6)     // Catch: java.lang.Exception -> L17f
            java.lang.StringBuilder r4 = r10.a     // Catch: java.lang.Exception -> L17f
            okhttp3.Request r6 = r3.request()     // Catch: java.lang.Exception -> L17f
            okhttp3.HttpUrl r6 = r6.url()     // Catch: java.lang.Exception -> L17f
            r4.append(r6)     // Catch: java.lang.Exception -> L17f
            java.lang.StringBuilder r4 = r10.a     // Catch: java.lang.Exception -> L17f
            r4.append(r0)     // Catch: java.lang.Exception -> L17f
            java.lang.StringBuilder r4 = r10.a     // Catch: java.lang.Exception -> L17f
            java.lang.String r6 = "响应参数："
            r4.append(r6)     // Catch: java.lang.Exception -> L17f
            okhttp3.Request r4 = r3.request()     // Catch: java.lang.Exception -> L17f
            r10.a(r4)     // Catch: java.lang.Exception -> L17f
            java.lang.StringBuilder r4 = r10.a     // Catch: java.lang.Exception -> L17f
            r4.append(r0)     // Catch: java.lang.Exception -> L17f
        Lfb:
            java.lang.StringBuilder r4 = r10.a     // Catch: java.lang.Exception -> L17f
            java.lang.String r6 = "响应耗时："
            r4.append(r6)     // Catch: java.lang.Exception -> L17f
            java.lang.StringBuilder r4 = r10.a     // Catch: java.lang.Exception -> L17f
            long r6 = r3.receivedResponseAtMillis()     // Catch: java.lang.Exception -> L17f
            long r8 = r3.sentRequestAtMillis()     // Catch: java.lang.Exception -> L17f
            long r6 = r6 - r8
            java.lang.String r6 = com.bxkj.base.v2.common.ext.g.c(r6)     // Catch: java.lang.Exception -> L17f
            r4.append(r6)     // Catch: java.lang.Exception -> L17f
            java.lang.StringBuilder r4 = r10.a     // Catch: java.lang.Exception -> L17f
            r4.append(r0)     // Catch: java.lang.Exception -> L17f
            okhttp3.ResponseBody r4 = r3.body()     // Catch: java.lang.Exception -> L17f
            java.lang.String r4 = r4.string()     // Catch: java.lang.Exception -> L17f
            okhttp3.ResponseBody r6 = r3.body()     // Catch: java.lang.Exception -> L17f
            okhttp3.MediaType r6 = r6.contentType()     // Catch: java.lang.Exception -> L17f
            okhttp3.Response$Builder r3 = r3.newBuilder()     // Catch: java.lang.Exception -> L17f
            okhttp3.ResponseBody$Companion r7 = okhttp3.ResponseBody.Companion     // Catch: java.lang.Exception -> L17f
            okhttp3.ResponseBody r6 = r7.create(r6, r4)     // Catch: java.lang.Exception -> L17f
            okhttp3.Response$Builder r3 = r3.body(r6)     // Catch: java.lang.Exception -> L17f
            okhttp3.Response r3 = r3.build()     // Catch: java.lang.Exception -> L17f
            java.lang.StringBuilder r6 = r10.a     // Catch: java.lang.Exception -> L17f
            java.lang.String r7 = "响应大小："
            r6.append(r7)     // Catch: java.lang.Exception -> L17f
            java.lang.StringBuilder r6 = r10.a     // Catch: java.lang.Exception -> L17f
            okhttp3.RequestBody r1 = r1.body()     // Catch: java.lang.Exception -> L17f
            if (r1 == 0) goto L152
            long r7 = r1.contentLength()     // Catch: java.lang.Exception -> L17f
            java.lang.String r5 = com.bxkj.base.v2.common.ext.g.a(r7)     // Catch: java.lang.Exception -> L17f
        L152:
            r6.append(r5)     // Catch: java.lang.Exception -> L17f
            java.lang.StringBuilder r1 = r10.a     // Catch: java.lang.Exception -> L17f
            r1.append(r0)     // Catch: java.lang.Exception -> L17f
            java.lang.StringBuilder r1 = r10.a     // Catch: java.lang.Exception -> L17f
            java.lang.String r5 = "响应数据："
            r1.append(r5)     // Catch: java.lang.Exception -> L17f
            java.lang.StringBuilder r1 = r10.a     // Catch: java.lang.Exception -> L17f
            r1.append(r0)     // Catch: java.lang.Exception -> L17f
            java.lang.StringBuilder r0 = r10.a     // Catch: java.lang.Exception -> L17f
            java.lang.String r1 = com.bxkj.base.v2.common.utils.i.a(r4)     // Catch: java.lang.Exception -> L17f
            java.lang.String r1 = com.bxkj.base.v2.common.ext.u.b(r1)     // Catch: java.lang.Exception -> L17f
            r0.append(r1)     // Catch: java.lang.Exception -> L17f
            java.lang.StringBuilder r0 = r10.a     // Catch: java.lang.Exception -> L17f
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L17f
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L17f
            com.orhanobut.logger.j.d(r0, r1)     // Catch: java.lang.Exception -> L17f
            return r3
        L17f:
            okhttp3.Request r0 = r11.request()
            okhttp3.Response r11 = r11.proceed(r0)
            return r11
    }
}
