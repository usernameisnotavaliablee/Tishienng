package okhttp3.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.JvmName(name = "Internal")
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class Internal {
    public Internal() {
            r1 = this;
            r1.<init>()
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.Headers.Builder addHeaderLenient(@org.jetbrains.annotations.NotNull okhttp3.Headers.Builder r1, @org.jetbrains.annotations.NotNull java.lang.String r2) {
            java.lang.String r0 = "builder"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "line"
            kotlin.jvm.internal.g0.p(r2, r0)
            okhttp3.Headers$Builder r1 = r1.addLenient$okhttp(r2)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.Headers.Builder addHeaderLenient(@org.jetbrains.annotations.NotNull okhttp3.Headers.Builder r1, @org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull java.lang.String r3) {
            java.lang.String r0 = "builder"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "value"
            kotlin.jvm.internal.g0.p(r3, r0)
            okhttp3.Headers$Builder r1 = r1.addLenient$okhttp(r2, r3)
            return r1
    }

    public static final void applyConnectionSpec(@org.jetbrains.annotations.NotNull okhttp3.ConnectionSpec r1, @org.jetbrains.annotations.NotNull javax.net.ssl.SSLSocket r2, boolean r3) {
            java.lang.String r0 = "connectionSpec"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "sslSocket"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.apply$okhttp(r2, r3)
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.ConnectionPool buildConnectionPool(@org.jetbrains.annotations.NotNull okhttp3.internal.connection.ConnectionListener r10, @org.jetbrains.annotations.NotNull okhttp3.internal.concurrent.TaskRunner r11) {
            java.lang.String r0 = "connectionListener"
            kotlin.jvm.internal.g0.p(r10, r0)
            java.lang.String r0 = "taskRunner"
            kotlin.jvm.internal.g0.p(r11, r0)
            okhttp3.ConnectionPool r1 = new okhttp3.ConnectionPool
            r8 = 7
            r9 = 0
            r2 = 0
            r3 = 0
            r5 = 0
            r7 = r10
            r6 = r11
            r1.<init>(r2, r3, r5, r6, r7, r8, r9)
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public static final okhttp3.Response cacheGet(@org.jetbrains.annotations.NotNull okhttp3.Cache r1, @org.jetbrains.annotations.NotNull okhttp3.Request r2) {
            java.lang.String r0 = "cache"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "request"
            kotlin.jvm.internal.g0.p(r2, r0)
            okhttp3.Response r1 = r1.get$okhttp(r2)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final java.nio.charset.Charset charsetOrUtf8(@org.jetbrains.annotations.Nullable okhttp3.MediaType r2) {
            if (r2 == 0) goto Lc
            r0 = 1
            r1 = 0
            java.nio.charset.Charset r2 = okhttp3.MediaType.charset$default(r2, r1, r0, r1)
            if (r2 != 0) goto Lb
            goto Lc
        Lb:
            return r2
        Lc:
            java.nio.charset.Charset r2 = kotlin.text.e.b
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.Pair<java.nio.charset.Charset, okhttp3.MediaType> chooseCharset(@org.jetbrains.annotations.Nullable okhttp3.MediaType r3) {
            java.nio.charset.Charset r0 = kotlin.text.e.b
            if (r3 == 0) goto L25
            r1 = 1
            r2 = 0
            java.nio.charset.Charset r1 = okhttp3.MediaType.charset$default(r3, r2, r1, r2)
            if (r1 != 0) goto L24
            okhttp3.MediaType$Companion r1 = okhttp3.MediaType.Companion
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r3)
            java.lang.String r3 = "; charset=utf-8"
            r2.append(r3)
            java.lang.String r3 = r2.toString()
            okhttp3.MediaType r3 = r1.parse(r3)
            goto L25
        L24:
            r0 = r1
        L25:
            kotlin.Pair r3 = kotlin.o0.a(r0, r3)
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String cookieToString(@org.jetbrains.annotations.NotNull okhttp3.Cookie r1, boolean r2) {
            java.lang.String r0 = "cookie"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r1 = r1.toString$okhttp(r2)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String[] effectiveCipherSuites(@org.jetbrains.annotations.NotNull okhttp3.ConnectionSpec r1, @org.jetbrains.annotations.NotNull java.lang.String[] r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "socketEnabledCipherSuites"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String[] r0 = r1.getCipherSuitesAsString$okhttp()
            if (r0 == 0) goto L1f
            java.lang.String[] r1 = r1.getCipherSuitesAsString$okhttp()
            okhttp3.CipherSuite$Companion r0 = okhttp3.CipherSuite.Companion
            java.util.Comparator r0 = r0.getORDER_BY_NAME$okhttp()
            java.lang.String[] r1 = okhttp3.internal._UtilCommonKt.intersect(r1, r2, r0)
            return r1
        L1f:
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.internal.connection.RealConnection getConnection(@org.jetbrains.annotations.NotNull okhttp3.Response r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            okhttp3.internal.connection.Exchange r1 = r1.exchange()
            kotlin.jvm.internal.g0.m(r1)
            okhttp3.internal.connection.RealConnection r1 = r1.getConnection$okhttp()
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public static final okhttp3.Cookie parseCookie(long r1, @org.jetbrains.annotations.NotNull okhttp3.HttpUrl r3, @org.jetbrains.annotations.NotNull java.lang.String r4) {
            java.lang.String r0 = "url"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "setCookie"
            kotlin.jvm.internal.g0.p(r4, r0)
            okhttp3.Cookie$Companion r0 = okhttp3.Cookie.Companion
            okhttp3.Cookie r1 = r0.parse$okhttp(r1, r3, r4)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.OkHttpClient.Builder taskRunnerInternal(@org.jetbrains.annotations.NotNull okhttp3.OkHttpClient.Builder r1, @org.jetbrains.annotations.NotNull okhttp3.internal.concurrent.TaskRunner r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "taskRunner"
            kotlin.jvm.internal.g0.p(r2, r0)
            okhttp3.OkHttpClient$Builder r1 = r1.taskRunner$okhttp(r2)
            return r1
    }
}
