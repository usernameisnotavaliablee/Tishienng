package okhttp3.internal.http;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nGzipRequestBody.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GzipRequestBody.kt\nokhttp3/internal/http/GzipRequestBody\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,37:1\n1#2:38\n*E\n"})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class GzipRequestBody extends okhttp3.RequestBody {

    @org.jetbrains.annotations.NotNull
    private final okhttp3.RequestBody delegate;

    public GzipRequestBody(@org.jetbrains.annotations.NotNull okhttp3.RequestBody r2) {
            r1 = this;
            java.lang.String r0 = "delegate"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.delegate = r2
            return
    }

    public long contentLength() {
            r2 = this;
            r0 = -1
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public okhttp3.MediaType contentType() {
            r1 = this;
            okhttp3.RequestBody r0 = r1.delegate
            okhttp3.MediaType r0 = r0.contentType()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final okhttp3.RequestBody getDelegate() {
            r1 = this;
            okhttp3.RequestBody r0 = r1.delegate
            return r0
    }

    public boolean isOneShot() {
            r1 = this;
            okhttp3.RequestBody r0 = r1.delegate
            boolean r0 = r0.isOneShot()
            return r0
    }

    public void writeTo(@org.jetbrains.annotations.NotNull okio.BufferedSink r3) {
            r2 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.g0.p(r3, r0)
            okio.GzipSink r0 = new okio.GzipSink
            r0.<init>(r3)
            okio.BufferedSink r3 = okio.Okio.buffer(r0)
            okhttp3.RequestBody r0 = r2.delegate
            r0.writeTo(r3)     // Catch: java.lang.Throwable -> L1a
            kotlin.n1 r0 = kotlin.n1.a     // Catch: java.lang.Throwable -> L1a
            r0 = 0
            kotlin.io.b.a(r3, r0)
            return
        L1a:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L1c
        L1c:
            r1 = move-exception
            kotlin.io.b.a(r3, r0)
            throw r1
    }
}
