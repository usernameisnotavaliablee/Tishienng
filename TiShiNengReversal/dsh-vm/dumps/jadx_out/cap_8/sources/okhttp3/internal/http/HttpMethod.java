package okhttp3.internal.http;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class HttpMethod {

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.internal.http.HttpMethod INSTANCE = null;

    static {
            okhttp3.internal.http.HttpMethod r0 = new okhttp3.internal.http.HttpMethod
            r0.<init>()
            okhttp3.internal.http.HttpMethod.INSTANCE = r0
            return
    }

    private HttpMethod() {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.jvm.JvmStatic
    public static final boolean invalidatesCache(@org.jetbrains.annotations.NotNull java.lang.String r1) {
            java.lang.String r0 = "method"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "POST"
            boolean r0 = kotlin.jvm.internal.g0.g(r1, r0)
            if (r0 != 0) goto L30
            java.lang.String r0 = "PATCH"
            boolean r0 = kotlin.jvm.internal.g0.g(r1, r0)
            if (r0 != 0) goto L30
            java.lang.String r0 = "PUT"
            boolean r0 = kotlin.jvm.internal.g0.g(r1, r0)
            if (r0 != 0) goto L30
            java.lang.String r0 = "DELETE"
            boolean r0 = kotlin.jvm.internal.g0.g(r1, r0)
            if (r0 != 0) goto L30
            java.lang.String r0 = "MOVE"
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r0)
            if (r1 == 0) goto L2e
            goto L30
        L2e:
            r1 = 0
            return r1
        L30:
            r1 = 1
            return r1
    }

    @kotlin.jvm.JvmStatic
    public static final boolean permitsRequestBody(@org.jetbrains.annotations.NotNull java.lang.String r1) {
            java.lang.String r0 = "method"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "GET"
            boolean r0 = kotlin.jvm.internal.g0.g(r1, r0)
            if (r0 != 0) goto L17
            java.lang.String r0 = "HEAD"
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r0)
            if (r1 != 0) goto L17
            r1 = 1
            return r1
        L17:
            r1 = 0
            return r1
    }

    @kotlin.jvm.JvmStatic
    public static final boolean requiresRequestBody(@org.jetbrains.annotations.NotNull java.lang.String r1) {
            java.lang.String r0 = "method"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "POST"
            boolean r0 = kotlin.jvm.internal.g0.g(r1, r0)
            if (r0 != 0) goto L38
            java.lang.String r0 = "PUT"
            boolean r0 = kotlin.jvm.internal.g0.g(r1, r0)
            if (r0 != 0) goto L38
            java.lang.String r0 = "PATCH"
            boolean r0 = kotlin.jvm.internal.g0.g(r1, r0)
            if (r0 != 0) goto L38
            java.lang.String r0 = "PROPPATCH"
            boolean r0 = kotlin.jvm.internal.g0.g(r1, r0)
            if (r0 != 0) goto L38
            java.lang.String r0 = "QUERY"
            boolean r0 = kotlin.jvm.internal.g0.g(r1, r0)
            if (r0 != 0) goto L38
            java.lang.String r0 = "REPORT"
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r0)
            if (r1 == 0) goto L36
            goto L38
        L36:
            r1 = 0
            return r1
        L38:
            r1 = 1
            return r1
    }

    public final boolean isCacheable(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "requestMethod"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "GET"
            boolean r0 = kotlin.jvm.internal.g0.g(r2, r0)
            if (r0 != 0) goto L18
            java.lang.String r0 = "QUERY"
            boolean r2 = kotlin.jvm.internal.g0.g(r2, r0)
            if (r2 == 0) goto L16
            goto L18
        L16:
            r2 = 0
            return r2
        L18:
            r2 = 1
            return r2
    }

    public final boolean redirectsToGet(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "method"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "PROPFIND"
            boolean r2 = kotlin.jvm.internal.g0.g(r2, r0)
            r2 = r2 ^ 1
            return r2
    }

    public final boolean redirectsWithBody(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "method"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "PROPFIND"
            boolean r2 = kotlin.jvm.internal.g0.g(r2, r0)
            return r2
    }
}
