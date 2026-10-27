package okhttp3.internal.http;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class CallServerInterceptor implements okhttp3.Interceptor {

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.internal.http.CallServerInterceptor INSTANCE = null;

    static {
            okhttp3.internal.http.CallServerInterceptor r0 = new okhttp3.internal.http.CallServerInterceptor
            r0.<init>()
            okhttp3.internal.http.CallServerInterceptor.INSTANCE = r0
            return
    }

    private CallServerInterceptor() {
            r0 = this;
            r0.<init>()
            return
    }

    private final boolean shouldIgnoreAndWaitForRealResponse(int r3) {
            r2 = this;
            r0 = 100
            r1 = 1
            if (r3 != r0) goto L6
            return r1
        L6:
            r0 = 102(0x66, float:1.43E-43)
            if (r0 > r3) goto Lf
            r0 = 200(0xc8, float:2.8E-43)
            if (r3 >= r0) goto Lf
            return r1
        Lf:
            r3 = 0
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public okhttp3.Response intercept(@org.jetbrains.annotations.NotNull okhttp3.Interceptor.Chain r19) throws java.io.IOException {
            r18 = this;
            r0 = r19
            java.lang.String r1 = "close"
            java.lang.String r2 = "chain"
            kotlin.jvm.internal.g0.p(r0, r2)
            okhttp3.internal.http.RealInterceptorChain r0 = (okhttp3.internal.http.RealInterceptorChain) r0
            okhttp3.internal.connection.Exchange r2 = r0.getExchange$okhttp()
            kotlin.jvm.internal.g0.m(r2)
            okhttp3.Request r3 = r0.getRequest$okhttp()
            okhttp3.RequestBody r0 = r3.body()
            long r4 = java.lang.System.currentTimeMillis()
            java.lang.String r6 = r3.method()
            boolean r6 = okhttp3.internal.http.HttpMethod.permitsRequestBody(r6)
            r7 = 0
            r8 = 1
            if (r6 == 0) goto L2e
            if (r0 == 0) goto L2e
            r6 = 1
            goto L2f
        L2e:
            r6 = 0
        L2f:
            java.lang.String r9 = "Connection"
            java.lang.String r10 = r3.header(r9)
            java.lang.String r11 = "upgrade"
            boolean r10 = kotlin.text.u.a2(r11, r10, r8)
            r12 = 0
            r2.writeRequestHeaders(r3)     // Catch: java.io.IOException -> L5e
            if (r6 == 0) goto L9c
            java.lang.String r6 = "100-continue"
            java.lang.String r13 = "Expect"
            java.lang.String r13 = r3.header(r13)     // Catch: java.io.IOException -> L5e
            boolean r6 = kotlin.text.u.a2(r6, r13, r8)     // Catch: java.io.IOException -> L5e
            if (r6 == 0) goto L61
            r2.flushRequest()     // Catch: java.io.IOException -> L5e
            okhttp3.Response$Builder r6 = r2.readResponseHeaders(r8)     // Catch: java.io.IOException -> L5e
            r2.responseHeadersStart()     // Catch: java.io.IOException -> L5b
            r13 = 0
            goto L63
        L5b:
            r0 = move-exception
        L5c:
            r13 = 1
            goto Laf
        L5e:
            r0 = move-exception
            r6 = r12
            goto L5c
        L61:
            r6 = r12
            r13 = 1
        L63:
            if (r6 != 0) goto L8b
            boolean r14 = r0.isDuplex()     // Catch: java.io.IOException -> L7a
            if (r14 == 0) goto L7c
            r2.flushRequest()     // Catch: java.io.IOException -> L7a
            okio.Sink r14 = r2.createRequestBody(r3, r8)     // Catch: java.io.IOException -> L7a
            okio.BufferedSink r14 = okio.Okio.buffer(r14)     // Catch: java.io.IOException -> L7a
            r0.writeTo(r14)     // Catch: java.io.IOException -> L7a
            goto La1
        L7a:
            r0 = move-exception
            goto Laf
        L7c:
            okio.Sink r14 = r2.createRequestBody(r3, r7)     // Catch: java.io.IOException -> L7a
            okio.BufferedSink r14 = okio.Okio.buffer(r14)     // Catch: java.io.IOException -> L7a
            r0.writeTo(r14)     // Catch: java.io.IOException -> L7a
            r14.close()     // Catch: java.io.IOException -> L7a
            goto La1
        L8b:
            r2.noRequestBody()     // Catch: java.io.IOException -> L7a
            okhttp3.internal.connection.RealConnection r14 = r2.getConnection$okhttp()     // Catch: java.io.IOException -> L7a
            boolean r14 = r14.isMultiplexed$okhttp()     // Catch: java.io.IOException -> L7a
            if (r14 != 0) goto La1
            r2.noNewExchangesOnConnection()     // Catch: java.io.IOException -> L7a
            goto La1
        L9c:
            r2.noRequestBody()     // Catch: java.io.IOException -> L5e
            r6 = r12
            r13 = 1
        La1:
            if (r0 == 0) goto La9
            boolean r0 = r0.isDuplex()     // Catch: java.io.IOException -> L7a
            if (r0 != 0) goto Lac
        La9:
            r2.finishRequest()     // Catch: java.io.IOException -> L7a
        Lac:
            r0 = r6
            r6 = r12
            goto Lbe
        Laf:
            boolean r14 = r0 instanceof okhttp3.internal.http2.ConnectionShutdownException
            if (r14 != 0) goto L211
            boolean r14 = r2.getHasFailure$okhttp()
            if (r14 == 0) goto L20e
            r17 = r6
            r6 = r0
            r0 = r17
        Lbe:
            if (r0 != 0) goto Ld3
            okhttp3.Response$Builder r0 = r2.readResponseHeaders(r7)     // Catch: java.io.IOException -> Lce
            kotlin.jvm.internal.g0.m(r0)     // Catch: java.io.IOException -> Lce
            if (r13 == 0) goto Ld3
            r2.responseHeadersStart()     // Catch: java.io.IOException -> Lce
            r13 = 0
            goto Ld3
        Lce:
            r0 = move-exception
            r15 = r18
            goto L207
        Ld3:
            okhttp3.Response$Builder r0 = r0.request(r3)     // Catch: java.io.IOException -> Lce
            okhttp3.internal.connection.RealConnection r14 = r2.getConnection$okhttp()     // Catch: java.io.IOException -> Lce
            okhttp3.Handshake r14 = r14.handshake()     // Catch: java.io.IOException -> Lce
            okhttp3.Response$Builder r0 = r0.handshake(r14)     // Catch: java.io.IOException -> Lce
            okhttp3.Response$Builder r0 = r0.sentRequestAtMillis(r4)     // Catch: java.io.IOException -> Lce
            long r14 = java.lang.System.currentTimeMillis()     // Catch: java.io.IOException -> Lce
            okhttp3.Response$Builder r0 = r0.receivedResponseAtMillis(r14)     // Catch: java.io.IOException -> Lce
            okhttp3.Response r0 = r0.build()     // Catch: java.io.IOException -> Lce
            int r14 = r0.code()     // Catch: java.io.IOException -> Lce
            r15 = r18
        Lf9:
            boolean r16 = r15.shouldIgnoreAndWaitForRealResponse(r14)     // Catch: java.io.IOException -> L10c
            if (r16 == 0) goto L136
            okhttp3.Response$Builder r0 = r2.readResponseHeaders(r7)     // Catch: java.io.IOException -> L10c
            kotlin.jvm.internal.g0.m(r0)     // Catch: java.io.IOException -> L10c
            if (r13 == 0) goto L10f
            r2.responseHeadersStart()     // Catch: java.io.IOException -> L10c
            goto L10f
        L10c:
            r0 = move-exception
            goto L207
        L10f:
            okhttp3.Response$Builder r0 = r0.request(r3)     // Catch: java.io.IOException -> L10c
            okhttp3.internal.connection.RealConnection r14 = r2.getConnection$okhttp()     // Catch: java.io.IOException -> L10c
            okhttp3.Handshake r14 = r14.handshake()     // Catch: java.io.IOException -> L10c
            okhttp3.Response$Builder r0 = r0.handshake(r14)     // Catch: java.io.IOException -> L10c
            okhttp3.Response$Builder r0 = r0.sentRequestAtMillis(r4)     // Catch: java.io.IOException -> L10c
            long r7 = java.lang.System.currentTimeMillis()     // Catch: java.io.IOException -> L10c
            okhttp3.Response$Builder r0 = r0.receivedResponseAtMillis(r7)     // Catch: java.io.IOException -> L10c
            okhttp3.Response r0 = r0.build()     // Catch: java.io.IOException -> L10c
            int r14 = r0.code()     // Catch: java.io.IOException -> L10c
            r7 = 0
            r8 = 1
            goto Lf9
        L136:
            r2.responseHeadersEnd(r0)     // Catch: java.io.IOException -> L10c
            r3 = 101(0x65, float:1.42E-43)
            if (r14 != r3) goto L13f
            r3 = 1
            goto L140
        L13f:
            r3 = 0
        L140:
            if (r3 == 0) goto L155
            okhttp3.internal.connection.RealConnection r4 = r2.getConnection$okhttp()     // Catch: java.io.IOException -> L10c
            boolean r4 = r4.isMultiplexed$okhttp()     // Catch: java.io.IOException -> L10c
            if (r4 != 0) goto L14d
            goto L155
        L14d:
            java.net.ProtocolException r0 = new java.net.ProtocolException     // Catch: java.io.IOException -> L10c
            java.lang.String r1 = "Unexpected 101 code on HTTP/2 connection"
            r0.<init>(r1)     // Catch: java.io.IOException -> L10c
            throw r0     // Catch: java.io.IOException -> L10c
        L155:
            r4 = 2
            if (r3 == 0) goto L165
            java.lang.String r3 = okhttp3.Response.header$default(r0, r9, r12, r4, r12)     // Catch: java.io.IOException -> L10c
            r5 = 1
            boolean r3 = kotlin.text.u.a2(r11, r3, r5)     // Catch: java.io.IOException -> L10c
            if (r3 == 0) goto L165
            r7 = 1
            goto L166
        L165:
            r7 = 0
        L166:
            if (r10 == 0) goto L194
            if (r7 == 0) goto L194
            okhttp3.Response$Builder r3 = r0.newBuilder()     // Catch: java.io.IOException -> L10c
            okhttp3.internal.UnreadableResponseBody r5 = new okhttp3.internal.UnreadableResponseBody     // Catch: java.io.IOException -> L10c
            okhttp3.ResponseBody r7 = r0.body()     // Catch: java.io.IOException -> L10c
            okhttp3.MediaType r7 = r7.contentType()     // Catch: java.io.IOException -> L10c
            okhttp3.ResponseBody r0 = r0.body()     // Catch: java.io.IOException -> L10c
            long r10 = r0.contentLength()     // Catch: java.io.IOException -> L10c
            r5.<init>(r7, r10)     // Catch: java.io.IOException -> L10c
            okhttp3.Response$Builder r0 = r3.body(r5)     // Catch: java.io.IOException -> L10c
            okio.Socket r3 = r2.upgradeToSocket()     // Catch: java.io.IOException -> L10c
            okhttp3.Response$Builder r0 = r0.socket(r3)     // Catch: java.io.IOException -> L10c
            okhttp3.Response r0 = r0.build()     // Catch: java.io.IOException -> L10c
            goto L1ad
        L194:
            okhttp3.ResponseBody r3 = r2.openResponseBody(r0)     // Catch: java.io.IOException -> L10c
            okhttp3.Response$Builder r0 = r0.newBuilder()     // Catch: java.io.IOException -> L10c
            okhttp3.Response$Builder r0 = r0.body(r3)     // Catch: java.io.IOException -> L10c
            okhttp3.internal.http.CallServerInterceptor$intercept$1 r5 = new okhttp3.internal.http.CallServerInterceptor$intercept$1     // Catch: java.io.IOException -> L10c
            r5.<init>(r2, r3)     // Catch: java.io.IOException -> L10c
            okhttp3.Response$Builder r0 = r0.trailers(r5)     // Catch: java.io.IOException -> L10c
            okhttp3.Response r0 = r0.build()     // Catch: java.io.IOException -> L10c
        L1ad:
            okhttp3.Request r3 = r0.request()     // Catch: java.io.IOException -> L10c
            java.lang.String r3 = r3.header(r9)     // Catch: java.io.IOException -> L10c
            r5 = 1
            boolean r3 = kotlin.text.u.a2(r1, r3, r5)     // Catch: java.io.IOException -> L10c
            if (r3 != 0) goto L1c6
            java.lang.String r3 = okhttp3.Response.header$default(r0, r9, r12, r4, r12)     // Catch: java.io.IOException -> L10c
            boolean r1 = kotlin.text.u.a2(r1, r3, r5)     // Catch: java.io.IOException -> L10c
            if (r1 == 0) goto L1c9
        L1c6:
            r2.noNewExchangesOnConnection()     // Catch: java.io.IOException -> L10c
        L1c9:
            r1 = 204(0xcc, float:2.86E-43)
            if (r14 == r1) goto L1d1
            r1 = 205(0xcd, float:2.87E-43)
            if (r14 != r1) goto L1df
        L1d1:
            okhttp3.ResponseBody r1 = r0.body()     // Catch: java.io.IOException -> L10c
            long r1 = r1.contentLength()     // Catch: java.io.IOException -> L10c
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 > 0) goto L1e0
        L1df:
            return r0
        L1e0:
            java.net.ProtocolException r1 = new java.net.ProtocolException     // Catch: java.io.IOException -> L10c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L10c
            r2.<init>()     // Catch: java.io.IOException -> L10c
            java.lang.String r3 = "HTTP "
            r2.append(r3)     // Catch: java.io.IOException -> L10c
            r2.append(r14)     // Catch: java.io.IOException -> L10c
            java.lang.String r3 = " had non-zero Content-Length: "
            r2.append(r3)     // Catch: java.io.IOException -> L10c
            okhttp3.ResponseBody r0 = r0.body()     // Catch: java.io.IOException -> L10c
            long r3 = r0.contentLength()     // Catch: java.io.IOException -> L10c
            r2.append(r3)     // Catch: java.io.IOException -> L10c
            java.lang.String r0 = r2.toString()     // Catch: java.io.IOException -> L10c
            r1.<init>(r0)     // Catch: java.io.IOException -> L10c
            throw r1     // Catch: java.io.IOException -> L10c
        L207:
            if (r6 == 0) goto L20d
            kotlin.l.a(r6, r0)
            throw r6
        L20d:
            throw r0
        L20e:
            r15 = r18
            throw r0
        L211:
            r15 = r18
            throw r0
    }
}
