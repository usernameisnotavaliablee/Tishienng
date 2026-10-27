package okhttp3;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nCompressionInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompressionInterceptor.kt\nokhttp3/CompressionInterceptor\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,96:1\n11561#2:97\n11896#2,3:98\n*S KotlinDebug\n*F\n+ 1 CompressionInterceptor.kt\nokhttp3/CompressionInterceptor\n*L\n39#1:97\n39#1:98,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class CompressionInterceptor implements okhttp3.Interceptor {

    @org.jetbrains.annotations.NotNull
    private final java.lang.String acceptEncoding;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.CompressionInterceptor.DecompressionAlgorithm[] algorithms;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface DecompressionAlgorithm {
        @org.jetbrains.annotations.NotNull
        okio.Source decompress(@org.jetbrains.annotations.NotNull okio.BufferedSource r1);

        @org.jetbrains.annotations.NotNull
        java.lang.String getEncoding();
    }

    public CompressionInterceptor(@org.jetbrains.annotations.NotNull okhttp3.CompressionInterceptor.DecompressionAlgorithm... r11) {
            r10 = this;
            java.lang.String r0 = "algorithms"
            kotlin.jvm.internal.g0.p(r11, r0)
            r10.<init>()
            r10.algorithms = r11
            java.util.ArrayList r1 = new java.util.ArrayList
            int r0 = r11.length
            r1.<init>(r0)
            int r0 = r11.length
            r2 = 0
        L12:
            if (r2 >= r0) goto L20
            r3 = r11[r2]
            java.lang.String r3 = r3.getEncoding()
            r1.add(r3)
            int r2 = r2 + 1
            goto L12
        L20:
            r8 = 62
            r9 = 0
            java.lang.String r2 = ", "
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            java.lang.String r11 = kotlin.collections.f0.r3(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.acceptEncoding = r11
            return
    }

    @org.jetbrains.annotations.NotNull
    public final okhttp3.Response decompress$okhttp(@org.jetbrains.annotations.NotNull okhttp3.Response r6) {
            r5 = this;
            java.lang.String r0 = "response"
            kotlin.jvm.internal.g0.p(r6, r0)
            boolean r0 = okhttp3.internal.http.HttpHeaders.promisesBody(r6)
            if (r0 != 0) goto Lc
            return r6
        Lc:
            okhttp3.ResponseBody r0 = r6.body()
            r1 = 2
            java.lang.String r2 = "Content-Encoding"
            r3 = 0
            java.lang.String r1 = okhttp3.Response.header$default(r6, r2, r3, r1, r3)
            if (r1 != 0) goto L1b
            goto L21
        L1b:
            okhttp3.CompressionInterceptor$DecompressionAlgorithm r1 = r5.lookupDecompressor$okhttp(r1)
            if (r1 != 0) goto L22
        L21:
            return r6
        L22:
            okio.BufferedSource r3 = r0.source()
            okio.Source r1 = r1.decompress(r3)
            okio.BufferedSource r1 = okio.Okio.buffer(r1)
            okhttp3.Response$Builder r6 = r6.newBuilder()
            okhttp3.Response$Builder r6 = r6.removeHeader(r2)
            java.lang.String r2 = "Content-Length"
            okhttp3.Response$Builder r6 = r6.removeHeader(r2)
            okhttp3.ResponseBody$Companion r2 = okhttp3.ResponseBody.Companion
            okhttp3.MediaType r0 = r0.contentType()
            r3 = -1
            okhttp3.ResponseBody r0 = r2.create(r1, r0, r3)
            okhttp3.Response$Builder r6 = r6.body(r0)
            okhttp3.Response r6 = r6.build()
            return r6
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getAcceptEncoding$okhttp() {
            r1 = this;
            java.lang.String r0 = r1.acceptEncoding
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final okhttp3.CompressionInterceptor.DecompressionAlgorithm[] getAlgorithms() {
            r1 = this;
            okhttp3.CompressionInterceptor$DecompressionAlgorithm[] r0 = r1.algorithms
            return r0
    }

    @Override // okhttp3.Interceptor
    @org.jetbrains.annotations.NotNull
    public okhttp3.Response intercept(@org.jetbrains.annotations.NotNull okhttp3.Interceptor.Chain r4) {
            r3 = this;
            java.lang.String r0 = "chain"
            kotlin.jvm.internal.g0.p(r4, r0)
            okhttp3.CompressionInterceptor$DecompressionAlgorithm[] r0 = r3.algorithms
            int r0 = r0.length
            if (r0 != 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            if (r0 != 0) goto L36
            okhttp3.Request r0 = r4.request()
            java.lang.String r1 = "Accept-Encoding"
            java.lang.String r0 = r0.header(r1)
            if (r0 != 0) goto L36
            okhttp3.Request r0 = r4.request()
            okhttp3.Request$Builder r0 = r0.newBuilder()
            java.lang.String r2 = r3.acceptEncoding
            okhttp3.Request$Builder r0 = r0.header(r1, r2)
            okhttp3.Request r0 = r0.build()
            okhttp3.Response r4 = r4.proceed(r0)
            okhttp3.Response r4 = r3.decompress$okhttp(r4)
            return r4
        L36:
            okhttp3.Request r0 = r4.request()
            okhttp3.Response r4 = r4.proceed(r0)
            return r4
    }

    @org.jetbrains.annotations.Nullable
    public final okhttp3.CompressionInterceptor.DecompressionAlgorithm lookupDecompressor$okhttp(@org.jetbrains.annotations.NotNull java.lang.String r7) {
            r6 = this;
            java.lang.String r0 = "encoding"
            kotlin.jvm.internal.g0.p(r7, r0)
            okhttp3.CompressionInterceptor$DecompressionAlgorithm[] r0 = r6.algorithms
            int r1 = r0.length
            r2 = 0
        L9:
            if (r2 >= r1) goto L1c
            r3 = r0[r2]
            java.lang.String r4 = r3.getEncoding()
            r5 = 1
            boolean r4 = kotlin.text.u.a2(r4, r7, r5)
            if (r4 == 0) goto L19
            return r3
        L19:
            int r2 = r2 + 1
            goto L9
        L1c:
            r7 = 0
            return r7
    }
}
