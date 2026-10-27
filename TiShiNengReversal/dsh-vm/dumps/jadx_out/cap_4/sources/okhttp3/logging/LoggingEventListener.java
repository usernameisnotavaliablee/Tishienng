package okhttp3.logging;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class LoggingEventListener extends okhttp3.EventListener {

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.logging.LoggingEventListener.Companion Companion = null;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.logging.HttpLoggingInterceptor.Logger logger;
    private long startNs;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.v r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class Factory implements okhttp3.EventListener.Factory {

        @org.jetbrains.annotations.NotNull
        private final okhttp3.logging.HttpLoggingInterceptor.Logger logger;

        @kotlin.jvm.JvmOverloads
        public Factory() {
                r2 = this;
                r0 = 0
                r1 = 1
                r2.<init>(r0, r1, r0)
                return
        }

        @kotlin.jvm.JvmOverloads
        public Factory(@org.jetbrains.annotations.NotNull okhttp3.logging.HttpLoggingInterceptor.Logger r2) {
                r1 = this;
                java.lang.String r0 = "logger"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.<init>()
                r1.logger = r2
                return
        }

        public /* synthetic */ Factory(okhttp3.logging.HttpLoggingInterceptor.Logger r1, int r2, kotlin.jvm.internal.v r3) {
                r0 = this;
                r2 = r2 & 1
                if (r2 == 0) goto L6
                okhttp3.logging.HttpLoggingInterceptor$Logger r1 = okhttp3.logging.HttpLoggingInterceptor.Logger.DEFAULT
            L6:
                r0.<init>(r1)
                return
        }

        @org.jetbrains.annotations.NotNull
        public okhttp3.EventListener create(@org.jetbrains.annotations.NotNull okhttp3.Call r3) {
                r2 = this;
                java.lang.String r0 = "call"
                kotlin.jvm.internal.g0.p(r3, r0)
                okhttp3.logging.LoggingEventListener r3 = new okhttp3.logging.LoggingEventListener
                okhttp3.logging.HttpLoggingInterceptor$Logger r0 = r2.logger
                r1 = 0
                r3.<init>(r0, r1)
                return r3
        }
    }

    static {
            okhttp3.logging.LoggingEventListener$Companion r0 = new okhttp3.logging.LoggingEventListener$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.logging.LoggingEventListener.Companion = r0
            return
    }

    private LoggingEventListener(okhttp3.logging.HttpLoggingInterceptor.Logger r1) {
            r0 = this;
            r0.<init>()
            r0.logger = r1
            return
    }

    public /* synthetic */ LoggingEventListener(okhttp3.logging.HttpLoggingInterceptor.Logger r1, kotlin.jvm.internal.v r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private final void logWithTime(java.lang.String r6) {
            r5 = this;
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r1 = java.lang.System.nanoTime()
            long r3 = r5.startNs
            long r1 = r1 - r3
            long r0 = r0.toMillis(r1)
            okhttp3.logging.HttpLoggingInterceptor$Logger r2 = r5.logger
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r4 = 91
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = " ms] "
            r3.append(r0)
            r3.append(r6)
            java.lang.String r6 = r3.toString()
            r2.log(r6)
            return
    }

    public void cacheConditionalHit(@org.jetbrains.annotations.NotNull okhttp3.Call r2, @org.jetbrains.annotations.NotNull okhttp3.Response r3) {
            r1 = this;
            java.lang.String r0 = "call"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r2 = "cachedResponse"
            kotlin.jvm.internal.g0.p(r3, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "cacheConditionalHit: "
            r2.append(r0)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.logWithTime(r2)
            return
    }

    public void cacheHit(@org.jetbrains.annotations.NotNull okhttp3.Call r2, @org.jetbrains.annotations.NotNull okhttp3.Response r3) {
            r1 = this;
            java.lang.String r0 = "call"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r2 = "response"
            kotlin.jvm.internal.g0.p(r3, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "cacheHit: "
            r2.append(r0)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.logWithTime(r2)
            return
    }

    public void cacheMiss(@org.jetbrains.annotations.NotNull okhttp3.Call r2) {
            r1 = this;
            java.lang.String r0 = "call"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r2 = "cacheMiss"
            r1.logWithTime(r2)
            return
    }

    public void callEnd(@org.jetbrains.annotations.NotNull okhttp3.Call r2) {
            r1 = this;
            java.lang.String r0 = "call"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r2 = "callEnd"
            r1.logWithTime(r2)
            return
    }

    public void callFailed(@org.jetbrains.annotations.NotNull okhttp3.Call r2, @org.jetbrains.annotations.NotNull java.io.IOException r3) {
            r1 = this;
            java.lang.String r0 = "call"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r2 = "ioe"
            kotlin.jvm.internal.g0.p(r3, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "callFailed: "
            r2.append(r0)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.logWithTime(r2)
            return
    }

    public void callStart(@org.jetbrains.annotations.NotNull okhttp3.Call r3) {
            r2 = this;
            java.lang.String r0 = "call"
            kotlin.jvm.internal.g0.p(r3, r0)
            long r0 = java.lang.System.nanoTime()
            r2.startNs = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "callStart: "
            r0.append(r1)
            okhttp3.Request r3 = r3.request()
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.logWithTime(r3)
            return
    }

    public void canceled(@org.jetbrains.annotations.NotNull okhttp3.Call r2) {
            r1 = this;
            java.lang.String r0 = "call"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r2 = "canceled"
            r1.logWithTime(r2)
            return
    }

    public void connectEnd(@org.jetbrains.annotations.NotNull okhttp3.Call r2, @org.jetbrains.annotations.NotNull java.net.InetSocketAddress r3, @org.jetbrains.annotations.NotNull java.net.Proxy r4, @org.jetbrains.annotations.Nullable okhttp3.Protocol r5) {
            r1 = this;
            java.lang.String r0 = "call"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r2 = "inetSocketAddress"
            kotlin.jvm.internal.g0.p(r3, r2)
            java.lang.String r2 = "proxy"
            kotlin.jvm.internal.g0.p(r4, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "connectEnd: "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            r1.logWithTime(r2)
            return
    }

    public void connectFailed(@org.jetbrains.annotations.NotNull okhttp3.Call r2, @org.jetbrains.annotations.NotNull java.net.InetSocketAddress r3, @org.jetbrains.annotations.NotNull java.net.Proxy r4, @org.jetbrains.annotations.Nullable okhttp3.Protocol r5, @org.jetbrains.annotations.NotNull java.io.IOException r6) {
            r1 = this;
            java.lang.String r0 = "call"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r2 = "inetSocketAddress"
            kotlin.jvm.internal.g0.p(r3, r2)
            java.lang.String r2 = "proxy"
            kotlin.jvm.internal.g0.p(r4, r2)
            java.lang.String r2 = "ioe"
            kotlin.jvm.internal.g0.p(r6, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "connectFailed: "
            r2.append(r3)
            r2.append(r5)
            r3 = 32
            r2.append(r3)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            r1.logWithTime(r2)
            return
    }

    public void connectStart(@org.jetbrains.annotations.NotNull okhttp3.Call r2, @org.jetbrains.annotations.NotNull java.net.InetSocketAddress r3, @org.jetbrains.annotations.NotNull java.net.Proxy r4) {
            r1 = this;
            java.lang.String r0 = "call"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r2 = "inetSocketAddress"
            kotlin.jvm.internal.g0.p(r3, r2)
            java.lang.String r2 = "proxy"
            kotlin.jvm.internal.g0.p(r4, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "connectStart: "
            r2.append(r0)
            r2.append(r3)
            r3 = 32
            r2.append(r3)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.logWithTime(r2)
            return
    }

    public void connectionAcquired(@org.jetbrains.annotations.NotNull okhttp3.Call r2, @org.jetbrains.annotations.NotNull okhttp3.Connection r3) {
            r1 = this;
            java.lang.String r0 = "call"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r2 = "connection"
            kotlin.jvm.internal.g0.p(r3, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "connectionAcquired: "
            r2.append(r0)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.logWithTime(r2)
            return
    }

    public void connectionReleased(@org.jetbrains.annotations.NotNull okhttp3.Call r2, @org.jetbrains.annotations.NotNull okhttp3.Connection r3) {
            r1 = this;
            java.lang.String r0 = "call"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r2 = "connection"
            kotlin.jvm.internal.g0.p(r3, r2)
            java.lang.String r2 = "connectionReleased"
            r1.logWithTime(r2)
            return
    }

    public void dispatcherQueueEnd(@org.jetbrains.annotations.NotNull okhttp3.Call r3, @org.jetbrains.annotations.NotNull okhttp3.Dispatcher r4) {
            r2 = this;
            java.lang.String r0 = "call"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "dispatcher"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "dispatcherQueueEnd: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = " queuedCallsCount="
            r0.append(r3)
            int r3 = r4.queuedCallsCount()
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.logWithTime(r3)
            return
    }

    public void dispatcherQueueStart(@org.jetbrains.annotations.NotNull okhttp3.Call r3, @org.jetbrains.annotations.NotNull okhttp3.Dispatcher r4) {
            r2 = this;
            java.lang.String r0 = "call"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "dispatcher"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "dispatcherQueueStart: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = " queuedCallsCount="
            r0.append(r3)
            int r3 = r4.queuedCallsCount()
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.logWithTime(r3)
            return
    }

    public void dnsEnd(@org.jetbrains.annotations.NotNull okhttp3.Call r2, @org.jetbrains.annotations.NotNull java.lang.String r3, @org.jetbrains.annotations.NotNull java.util.List<? extends java.net.InetAddress> r4) {
            r1 = this;
            java.lang.String r0 = "call"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r2 = "domainName"
            kotlin.jvm.internal.g0.p(r3, r2)
            java.lang.String r2 = "inetAddressList"
            kotlin.jvm.internal.g0.p(r4, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "dnsEnd: "
            r2.append(r3)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.logWithTime(r2)
            return
    }

    public void dnsStart(@org.jetbrains.annotations.NotNull okhttp3.Call r2, @org.jetbrains.annotations.NotNull java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "call"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r2 = "domainName"
            kotlin.jvm.internal.g0.p(r3, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "dnsStart: "
            r2.append(r0)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.logWithTime(r2)
            return
    }

    public void proxySelectEnd(@org.jetbrains.annotations.NotNull okhttp3.Call r2, @org.jetbrains.annotations.NotNull okhttp3.HttpUrl r3, @org.jetbrains.annotations.NotNull java.util.List<? extends java.net.Proxy> r4) {
            r1 = this;
            java.lang.String r0 = "call"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r2 = "url"
            kotlin.jvm.internal.g0.p(r3, r2)
            java.lang.String r2 = "proxies"
            kotlin.jvm.internal.g0.p(r4, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "proxySelectEnd: "
            r2.append(r3)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.logWithTime(r2)
            return
    }

    public void proxySelectStart(@org.jetbrains.annotations.NotNull okhttp3.Call r2, @org.jetbrains.annotations.NotNull okhttp3.HttpUrl r3) {
            r1 = this;
            java.lang.String r0 = "call"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r2 = "url"
            kotlin.jvm.internal.g0.p(r3, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "proxySelectStart: "
            r2.append(r0)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.logWithTime(r2)
            return
    }

    public void requestBodyEnd(@org.jetbrains.annotations.NotNull okhttp3.Call r2, long r3) {
            r1 = this;
            java.lang.String r0 = "call"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "requestBodyEnd: byteCount="
            r2.append(r0)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.logWithTime(r2)
            return
    }

    public void requestBodyStart(@org.jetbrains.annotations.NotNull okhttp3.Call r2) {
            r1 = this;
            java.lang.String r0 = "call"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r2 = "requestBodyStart"
            r1.logWithTime(r2)
            return
    }

    public void requestFailed(@org.jetbrains.annotations.NotNull okhttp3.Call r2, @org.jetbrains.annotations.NotNull java.io.IOException r3) {
            r1 = this;
            java.lang.String r0 = "call"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r2 = "ioe"
            kotlin.jvm.internal.g0.p(r3, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "requestFailed: "
            r2.append(r0)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.logWithTime(r2)
            return
    }

    public void requestHeadersEnd(@org.jetbrains.annotations.NotNull okhttp3.Call r2, @org.jetbrains.annotations.NotNull okhttp3.Request r3) {
            r1 = this;
            java.lang.String r0 = "call"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r2 = "request"
            kotlin.jvm.internal.g0.p(r3, r2)
            java.lang.String r2 = "requestHeadersEnd"
            r1.logWithTime(r2)
            return
    }

    public void requestHeadersStart(@org.jetbrains.annotations.NotNull okhttp3.Call r2) {
            r1 = this;
            java.lang.String r0 = "call"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r2 = "requestHeadersStart"
            r1.logWithTime(r2)
            return
    }

    public void responseBodyEnd(@org.jetbrains.annotations.NotNull okhttp3.Call r2, long r3) {
            r1 = this;
            java.lang.String r0 = "call"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "responseBodyEnd: byteCount="
            r2.append(r0)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.logWithTime(r2)
            return
    }

    public void responseBodyStart(@org.jetbrains.annotations.NotNull okhttp3.Call r2) {
            r1 = this;
            java.lang.String r0 = "call"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r2 = "responseBodyStart"
            r1.logWithTime(r2)
            return
    }

    public void responseFailed(@org.jetbrains.annotations.NotNull okhttp3.Call r2, @org.jetbrains.annotations.NotNull java.io.IOException r3) {
            r1 = this;
            java.lang.String r0 = "call"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r2 = "ioe"
            kotlin.jvm.internal.g0.p(r3, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "responseFailed: "
            r2.append(r0)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.logWithTime(r2)
            return
    }

    public void responseHeadersEnd(@org.jetbrains.annotations.NotNull okhttp3.Call r2, @org.jetbrains.annotations.NotNull okhttp3.Response r3) {
            r1 = this;
            java.lang.String r0 = "call"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r2 = "response"
            kotlin.jvm.internal.g0.p(r3, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "responseHeadersEnd: "
            r2.append(r0)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.logWithTime(r2)
            return
    }

    public void responseHeadersStart(@org.jetbrains.annotations.NotNull okhttp3.Call r2) {
            r1 = this;
            java.lang.String r0 = "call"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r2 = "responseHeadersStart"
            r1.logWithTime(r2)
            return
    }

    public void satisfactionFailure(@org.jetbrains.annotations.NotNull okhttp3.Call r2, @org.jetbrains.annotations.NotNull okhttp3.Response r3) {
            r1 = this;
            java.lang.String r0 = "call"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r2 = "response"
            kotlin.jvm.internal.g0.p(r3, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "satisfactionFailure: "
            r2.append(r0)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.logWithTime(r2)
            return
    }

    public void secureConnectEnd(@org.jetbrains.annotations.NotNull okhttp3.Call r2, @org.jetbrains.annotations.Nullable okhttp3.Handshake r3) {
            r1 = this;
            java.lang.String r0 = "call"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "secureConnectEnd: "
            r2.append(r0)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.logWithTime(r2)
            return
    }

    public void secureConnectStart(@org.jetbrains.annotations.NotNull okhttp3.Call r2) {
            r1 = this;
            java.lang.String r0 = "call"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r2 = "secureConnectStart"
            r1.logWithTime(r2)
            return
    }
}
