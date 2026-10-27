package retrofit2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class c0<T> {
    private final okhttp3.Response a;

    @javax.annotation.Nullable
    private final T b;

    @javax.annotation.Nullable
    private final okhttp3.ResponseBody c;

    private c0(okhttp3.Response r1, @javax.annotation.Nullable T r2, @javax.annotation.Nullable okhttp3.ResponseBody r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            return
    }

    public static <T> retrofit2.c0<T> c(int r5, okhttp3.ResponseBody r6) {
            java.lang.String r0 = "body == null"
            java.util.Objects.requireNonNull(r6, r0)
            r0 = 400(0x190, float:5.6E-43)
            if (r5 < r0) goto L4b
            okhttp3.Response$Builder r0 = new okhttp3.Response$Builder
            r0.<init>()
            retrofit2.n$c r1 = new retrofit2.n$c
            okhttp3.MediaType r2 = r6.contentType()
            long r3 = r6.contentLength()
            r1.<init>(r2, r3)
            okhttp3.Response$Builder r0 = r0.body(r1)
            okhttp3.Response$Builder r5 = r0.code(r5)
            java.lang.String r0 = "Response.error()"
            okhttp3.Response$Builder r5 = r5.message(r0)
            okhttp3.Protocol r0 = okhttp3.Protocol.HTTP_1_1
            okhttp3.Response$Builder r5 = r5.protocol(r0)
            okhttp3.Request$Builder r0 = new okhttp3.Request$Builder
            r0.<init>()
            java.lang.String r1 = "http://localhost/"
            okhttp3.Request$Builder r0 = r0.url(r1)
            okhttp3.Request r0 = r0.build()
            okhttp3.Response$Builder r5 = r5.request(r0)
            okhttp3.Response r5 = r5.build()
            retrofit2.c0 r5 = d(r6, r5)
            return r5
        L4b:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "code < 400: "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r6.<init>(r5)
            throw r6
    }

    public static <T> retrofit2.c0<T> d(okhttp3.ResponseBody r2, okhttp3.Response r3) {
            java.lang.String r0 = "body == null"
            java.util.Objects.requireNonNull(r2, r0)
            java.lang.String r0 = "rawResponse == null"
            java.util.Objects.requireNonNull(r3, r0)
            boolean r0 = r3.isSuccessful()
            if (r0 != 0) goto L17
            retrofit2.c0 r0 = new retrofit2.c0
            r1 = 0
            r0.<init>(r3, r1, r2)
            return r0
        L17:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "rawResponse should not be successful response"
            r2.<init>(r3)
            throw r2
    }

    public static <T> retrofit2.c0<T> j(int r2, @javax.annotation.Nullable T r3) {
            r0 = 200(0xc8, float:2.8E-43)
            if (r2 < r0) goto L39
            r0 = 300(0x12c, float:4.2E-43)
            if (r2 >= r0) goto L39
            okhttp3.Response$Builder r0 = new okhttp3.Response$Builder
            r0.<init>()
            okhttp3.Response$Builder r2 = r0.code(r2)
            java.lang.String r0 = "Response.success()"
            okhttp3.Response$Builder r2 = r2.message(r0)
            okhttp3.Protocol r0 = okhttp3.Protocol.HTTP_1_1
            okhttp3.Response$Builder r2 = r2.protocol(r0)
            okhttp3.Request$Builder r0 = new okhttp3.Request$Builder
            r0.<init>()
            java.lang.String r1 = "http://localhost/"
            okhttp3.Request$Builder r0 = r0.url(r1)
            okhttp3.Request r0 = r0.build()
            okhttp3.Response$Builder r2 = r2.request(r0)
            okhttp3.Response r2 = r2.build()
            retrofit2.c0 r2 = m(r3, r2)
            return r2
        L39:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "code < 200 or >= 300: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r3.<init>(r2)
            throw r3
    }

    public static <T> retrofit2.c0<T> k(@javax.annotation.Nullable T r3) {
            okhttp3.Response$Builder r0 = new okhttp3.Response$Builder
            r0.<init>()
            r1 = 200(0xc8, float:2.8E-43)
            okhttp3.Response$Builder r0 = r0.code(r1)
            java.lang.String r1 = "OK"
            okhttp3.Response$Builder r0 = r0.message(r1)
            okhttp3.Protocol r1 = okhttp3.Protocol.HTTP_1_1
            okhttp3.Response$Builder r0 = r0.protocol(r1)
            okhttp3.Request$Builder r1 = new okhttp3.Request$Builder
            r1.<init>()
            java.lang.String r2 = "http://localhost/"
            okhttp3.Request$Builder r1 = r1.url(r2)
            okhttp3.Request r1 = r1.build()
            okhttp3.Response$Builder r0 = r0.request(r1)
            okhttp3.Response r0 = r0.build()
            retrofit2.c0 r3 = m(r3, r0)
            return r3
    }

    public static <T> retrofit2.c0<T> l(@javax.annotation.Nullable T r2, okhttp3.Headers r3) {
            java.lang.String r0 = "headers == null"
            java.util.Objects.requireNonNull(r3, r0)
            okhttp3.Response$Builder r0 = new okhttp3.Response$Builder
            r0.<init>()
            r1 = 200(0xc8, float:2.8E-43)
            okhttp3.Response$Builder r0 = r0.code(r1)
            java.lang.String r1 = "OK"
            okhttp3.Response$Builder r0 = r0.message(r1)
            okhttp3.Protocol r1 = okhttp3.Protocol.HTTP_1_1
            okhttp3.Response$Builder r0 = r0.protocol(r1)
            okhttp3.Response$Builder r3 = r0.headers(r3)
            okhttp3.Request$Builder r0 = new okhttp3.Request$Builder
            r0.<init>()
            java.lang.String r1 = "http://localhost/"
            okhttp3.Request$Builder r0 = r0.url(r1)
            okhttp3.Request r0 = r0.build()
            okhttp3.Response$Builder r3 = r3.request(r0)
            okhttp3.Response r3 = r3.build()
            retrofit2.c0 r2 = m(r2, r3)
            return r2
    }

    public static <T> retrofit2.c0<T> m(@javax.annotation.Nullable T r2, okhttp3.Response r3) {
            java.lang.String r0 = "rawResponse == null"
            java.util.Objects.requireNonNull(r3, r0)
            boolean r0 = r3.isSuccessful()
            if (r0 == 0) goto L12
            retrofit2.c0 r0 = new retrofit2.c0
            r1 = 0
            r0.<init>(r3, r2, r1)
            return r0
        L12:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "rawResponse must be successful response"
            r2.<init>(r3)
            throw r2
    }

    @javax.annotation.Nullable
    public T a() {
            r1 = this;
            T r0 = r1.b
            return r0
    }

    public int b() {
            r1 = this;
            okhttp3.Response r0 = r1.a
            int r0 = r0.code()
            return r0
    }

    @javax.annotation.Nullable
    public okhttp3.ResponseBody e() {
            r1 = this;
            okhttp3.ResponseBody r0 = r1.c
            return r0
    }

    public okhttp3.Headers f() {
            r1 = this;
            okhttp3.Response r0 = r1.a
            okhttp3.Headers r0 = r0.headers()
            return r0
    }

    public boolean g() {
            r1 = this;
            okhttp3.Response r0 = r1.a
            boolean r0 = r0.isSuccessful()
            return r0
    }

    public java.lang.String h() {
            r1 = this;
            okhttp3.Response r0 = r1.a
            java.lang.String r0 = r0.message()
            return r0
    }

    public okhttp3.Response i() {
            r1 = this;
            okhttp3.Response r0 = r1.a
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            okhttp3.Response r0 = r1.a
            java.lang.String r0 = r0.toString()
            return r0
    }
}
