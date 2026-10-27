package okhttp3;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class EventListener {

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.EventListener.Companion Companion = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final okhttp3.EventListener NONE = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class AggregateEventListener extends okhttp3.EventListener {

        @org.jetbrains.annotations.NotNull
        private final okhttp3.EventListener[] eventListeners;

        public AggregateEventListener(@org.jetbrains.annotations.NotNull okhttp3.EventListener[] r2) {
                r1 = this;
                java.lang.String r0 = "eventListeners"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.<init>()
                r1.eventListeners = r2
                return
        }

        @Override // okhttp3.EventListener
        public void cacheConditionalHit(@org.jetbrains.annotations.NotNull okhttp3.Call r5, @org.jetbrains.annotations.NotNull okhttp3.Response r6) {
                r4 = this;
                java.lang.String r0 = "call"
                kotlin.jvm.internal.g0.p(r5, r0)
                java.lang.String r0 = "cachedResponse"
                kotlin.jvm.internal.g0.p(r6, r0)
                okhttp3.EventListener[] r0 = r4.eventListeners
                int r1 = r0.length
                r2 = 0
            Le:
                if (r2 >= r1) goto L18
                r3 = r0[r2]
                r3.cacheConditionalHit(r5, r6)
                int r2 = r2 + 1
                goto Le
            L18:
                return
        }

        @Override // okhttp3.EventListener
        public void cacheHit(@org.jetbrains.annotations.NotNull okhttp3.Call r5, @org.jetbrains.annotations.NotNull okhttp3.Response r6) {
                r4 = this;
                java.lang.String r0 = "call"
                kotlin.jvm.internal.g0.p(r5, r0)
                java.lang.String r0 = "response"
                kotlin.jvm.internal.g0.p(r6, r0)
                okhttp3.EventListener[] r0 = r4.eventListeners
                int r1 = r0.length
                r2 = 0
            Le:
                if (r2 >= r1) goto L18
                r3 = r0[r2]
                r3.cacheHit(r5, r6)
                int r2 = r2 + 1
                goto Le
            L18:
                return
        }

        @Override // okhttp3.EventListener
        public void cacheMiss(@org.jetbrains.annotations.NotNull okhttp3.Call r5) {
                r4 = this;
                java.lang.String r0 = "call"
                kotlin.jvm.internal.g0.p(r5, r0)
                okhttp3.EventListener[] r0 = r4.eventListeners
                int r1 = r0.length
                r2 = 0
            L9:
                if (r2 >= r1) goto L13
                r3 = r0[r2]
                r3.cacheMiss(r5)
                int r2 = r2 + 1
                goto L9
            L13:
                return
        }

        @Override // okhttp3.EventListener
        public void callEnd(@org.jetbrains.annotations.NotNull okhttp3.Call r5) {
                r4 = this;
                java.lang.String r0 = "call"
                kotlin.jvm.internal.g0.p(r5, r0)
                okhttp3.EventListener[] r0 = r4.eventListeners
                int r1 = r0.length
                r2 = 0
            L9:
                if (r2 >= r1) goto L13
                r3 = r0[r2]
                r3.callEnd(r5)
                int r2 = r2 + 1
                goto L9
            L13:
                return
        }

        @Override // okhttp3.EventListener
        public void callFailed(@org.jetbrains.annotations.NotNull okhttp3.Call r5, @org.jetbrains.annotations.NotNull java.io.IOException r6) {
                r4 = this;
                java.lang.String r0 = "call"
                kotlin.jvm.internal.g0.p(r5, r0)
                java.lang.String r0 = "ioe"
                kotlin.jvm.internal.g0.p(r6, r0)
                okhttp3.EventListener[] r0 = r4.eventListeners
                int r1 = r0.length
                r2 = 0
            Le:
                if (r2 >= r1) goto L18
                r3 = r0[r2]
                r3.callFailed(r5, r6)
                int r2 = r2 + 1
                goto Le
            L18:
                return
        }

        @Override // okhttp3.EventListener
        public void callStart(@org.jetbrains.annotations.NotNull okhttp3.Call r5) {
                r4 = this;
                java.lang.String r0 = "call"
                kotlin.jvm.internal.g0.p(r5, r0)
                okhttp3.EventListener[] r0 = r4.eventListeners
                int r1 = r0.length
                r2 = 0
            L9:
                if (r2 >= r1) goto L13
                r3 = r0[r2]
                r3.callStart(r5)
                int r2 = r2 + 1
                goto L9
            L13:
                return
        }

        @Override // okhttp3.EventListener
        public void canceled(@org.jetbrains.annotations.NotNull okhttp3.Call r5) {
                r4 = this;
                java.lang.String r0 = "call"
                kotlin.jvm.internal.g0.p(r5, r0)
                okhttp3.EventListener[] r0 = r4.eventListeners
                int r1 = r0.length
                r2 = 0
            L9:
                if (r2 >= r1) goto L13
                r3 = r0[r2]
                r3.canceled(r5)
                int r2 = r2 + 1
                goto L9
            L13:
                return
        }

        @Override // okhttp3.EventListener
        public void connectEnd(@org.jetbrains.annotations.NotNull okhttp3.Call r5, @org.jetbrains.annotations.NotNull java.net.InetSocketAddress r6, @org.jetbrains.annotations.NotNull java.net.Proxy r7, @org.jetbrains.annotations.Nullable okhttp3.Protocol r8) {
                r4 = this;
                java.lang.String r0 = "call"
                kotlin.jvm.internal.g0.p(r5, r0)
                java.lang.String r0 = "inetSocketAddress"
                kotlin.jvm.internal.g0.p(r6, r0)
                java.lang.String r0 = "proxy"
                kotlin.jvm.internal.g0.p(r7, r0)
                okhttp3.EventListener[] r0 = r4.eventListeners
                int r1 = r0.length
                r2 = 0
            L13:
                if (r2 >= r1) goto L1d
                r3 = r0[r2]
                r3.connectEnd(r5, r6, r7, r8)
                int r2 = r2 + 1
                goto L13
            L1d:
                return
        }

        @Override // okhttp3.EventListener
        public void connectFailed(@org.jetbrains.annotations.NotNull okhttp3.Call r10, @org.jetbrains.annotations.NotNull java.net.InetSocketAddress r11, @org.jetbrains.annotations.NotNull java.net.Proxy r12, @org.jetbrains.annotations.Nullable okhttp3.Protocol r13, @org.jetbrains.annotations.NotNull java.io.IOException r14) {
                r9 = this;
                java.lang.String r0 = "call"
                kotlin.jvm.internal.g0.p(r10, r0)
                java.lang.String r0 = "inetSocketAddress"
                kotlin.jvm.internal.g0.p(r11, r0)
                java.lang.String r0 = "proxy"
                kotlin.jvm.internal.g0.p(r12, r0)
                java.lang.String r0 = "ioe"
                kotlin.jvm.internal.g0.p(r14, r0)
                okhttp3.EventListener[] r0 = r9.eventListeners
                int r1 = r0.length
                r2 = 0
            L18:
                if (r2 >= r1) goto L27
                r3 = r0[r2]
                r4 = r10
                r5 = r11
                r6 = r12
                r7 = r13
                r8 = r14
                r3.connectFailed(r4, r5, r6, r7, r8)
                int r2 = r2 + 1
                goto L18
            L27:
                return
        }

        @Override // okhttp3.EventListener
        public void connectStart(@org.jetbrains.annotations.NotNull okhttp3.Call r5, @org.jetbrains.annotations.NotNull java.net.InetSocketAddress r6, @org.jetbrains.annotations.NotNull java.net.Proxy r7) {
                r4 = this;
                java.lang.String r0 = "call"
                kotlin.jvm.internal.g0.p(r5, r0)
                java.lang.String r0 = "inetSocketAddress"
                kotlin.jvm.internal.g0.p(r6, r0)
                java.lang.String r0 = "proxy"
                kotlin.jvm.internal.g0.p(r7, r0)
                okhttp3.EventListener[] r0 = r4.eventListeners
                int r1 = r0.length
                r2 = 0
            L13:
                if (r2 >= r1) goto L1d
                r3 = r0[r2]
                r3.connectStart(r5, r6, r7)
                int r2 = r2 + 1
                goto L13
            L1d:
                return
        }

        @Override // okhttp3.EventListener
        public void connectionAcquired(@org.jetbrains.annotations.NotNull okhttp3.Call r5, @org.jetbrains.annotations.NotNull okhttp3.Connection r6) {
                r4 = this;
                java.lang.String r0 = "call"
                kotlin.jvm.internal.g0.p(r5, r0)
                java.lang.String r0 = "connection"
                kotlin.jvm.internal.g0.p(r6, r0)
                okhttp3.EventListener[] r0 = r4.eventListeners
                int r1 = r0.length
                r2 = 0
            Le:
                if (r2 >= r1) goto L18
                r3 = r0[r2]
                r3.connectionAcquired(r5, r6)
                int r2 = r2 + 1
                goto Le
            L18:
                return
        }

        @Override // okhttp3.EventListener
        public void connectionReleased(@org.jetbrains.annotations.NotNull okhttp3.Call r5, @org.jetbrains.annotations.NotNull okhttp3.Connection r6) {
                r4 = this;
                java.lang.String r0 = "call"
                kotlin.jvm.internal.g0.p(r5, r0)
                java.lang.String r0 = "connection"
                kotlin.jvm.internal.g0.p(r6, r0)
                okhttp3.EventListener[] r0 = r4.eventListeners
                int r1 = r0.length
                r2 = 0
            Le:
                if (r2 >= r1) goto L18
                r3 = r0[r2]
                r3.connectionReleased(r5, r6)
                int r2 = r2 + 1
                goto Le
            L18:
                return
        }

        @Override // okhttp3.EventListener
        public void dispatcherQueueEnd(@org.jetbrains.annotations.NotNull okhttp3.Call r5, @org.jetbrains.annotations.NotNull okhttp3.Dispatcher r6) {
                r4 = this;
                java.lang.String r0 = "call"
                kotlin.jvm.internal.g0.p(r5, r0)
                java.lang.String r0 = "dispatcher"
                kotlin.jvm.internal.g0.p(r6, r0)
                okhttp3.EventListener[] r0 = r4.eventListeners
                int r1 = r0.length
                r2 = 0
            Le:
                if (r2 >= r1) goto L18
                r3 = r0[r2]
                r3.dispatcherQueueEnd(r5, r6)
                int r2 = r2 + 1
                goto Le
            L18:
                return
        }

        @Override // okhttp3.EventListener
        public void dispatcherQueueStart(@org.jetbrains.annotations.NotNull okhttp3.Call r5, @org.jetbrains.annotations.NotNull okhttp3.Dispatcher r6) {
                r4 = this;
                java.lang.String r0 = "call"
                kotlin.jvm.internal.g0.p(r5, r0)
                java.lang.String r0 = "dispatcher"
                kotlin.jvm.internal.g0.p(r6, r0)
                okhttp3.EventListener[] r0 = r4.eventListeners
                int r1 = r0.length
                r2 = 0
            Le:
                if (r2 >= r1) goto L18
                r3 = r0[r2]
                r3.dispatcherQueueStart(r5, r6)
                int r2 = r2 + 1
                goto Le
            L18:
                return
        }

        @Override // okhttp3.EventListener
        public void dnsEnd(@org.jetbrains.annotations.NotNull okhttp3.Call r5, @org.jetbrains.annotations.NotNull java.lang.String r6, @org.jetbrains.annotations.NotNull java.util.List<java.net.InetAddress> r7) {
                r4 = this;
                java.lang.String r0 = "call"
                kotlin.jvm.internal.g0.p(r5, r0)
                java.lang.String r0 = "domainName"
                kotlin.jvm.internal.g0.p(r6, r0)
                java.lang.String r0 = "inetAddressList"
                kotlin.jvm.internal.g0.p(r7, r0)
                okhttp3.EventListener[] r0 = r4.eventListeners
                int r1 = r0.length
                r2 = 0
            L13:
                if (r2 >= r1) goto L1d
                r3 = r0[r2]
                r3.dnsEnd(r5, r6, r7)
                int r2 = r2 + 1
                goto L13
            L1d:
                return
        }

        @Override // okhttp3.EventListener
        public void dnsStart(@org.jetbrains.annotations.NotNull okhttp3.Call r5, @org.jetbrains.annotations.NotNull java.lang.String r6) {
                r4 = this;
                java.lang.String r0 = "call"
                kotlin.jvm.internal.g0.p(r5, r0)
                java.lang.String r0 = "domainName"
                kotlin.jvm.internal.g0.p(r6, r0)
                okhttp3.EventListener[] r0 = r4.eventListeners
                int r1 = r0.length
                r2 = 0
            Le:
                if (r2 >= r1) goto L18
                r3 = r0[r2]
                r3.dnsStart(r5, r6)
                int r2 = r2 + 1
                goto Le
            L18:
                return
        }

        @Override // okhttp3.EventListener
        public void followUpDecision(@org.jetbrains.annotations.NotNull okhttp3.Call r5, @org.jetbrains.annotations.NotNull okhttp3.Response r6, @org.jetbrains.annotations.Nullable okhttp3.Request r7) {
                r4 = this;
                java.lang.String r0 = "call"
                kotlin.jvm.internal.g0.p(r5, r0)
                java.lang.String r0 = "networkResponse"
                kotlin.jvm.internal.g0.p(r6, r0)
                okhttp3.EventListener[] r0 = r4.eventListeners
                int r1 = r0.length
                r2 = 0
            Le:
                if (r2 >= r1) goto L18
                r3 = r0[r2]
                r3.followUpDecision(r5, r6, r7)
                int r2 = r2 + 1
                goto Le
            L18:
                return
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.EventListener[] getEventListeners() {
                r1 = this;
                okhttp3.EventListener[] r0 = r1.eventListeners
                return r0
        }

        @Override // okhttp3.EventListener
        public void proxySelectEnd(@org.jetbrains.annotations.NotNull okhttp3.Call r5, @org.jetbrains.annotations.NotNull okhttp3.HttpUrl r6, @org.jetbrains.annotations.NotNull java.util.List<java.net.Proxy> r7) {
                r4 = this;
                java.lang.String r0 = "call"
                kotlin.jvm.internal.g0.p(r5, r0)
                java.lang.String r0 = "url"
                kotlin.jvm.internal.g0.p(r6, r0)
                java.lang.String r0 = "proxies"
                kotlin.jvm.internal.g0.p(r7, r0)
                okhttp3.EventListener[] r0 = r4.eventListeners
                int r1 = r0.length
                r2 = 0
            L13:
                if (r2 >= r1) goto L1d
                r3 = r0[r2]
                r3.proxySelectEnd(r5, r6, r7)
                int r2 = r2 + 1
                goto L13
            L1d:
                return
        }

        @Override // okhttp3.EventListener
        public void proxySelectStart(@org.jetbrains.annotations.NotNull okhttp3.Call r5, @org.jetbrains.annotations.NotNull okhttp3.HttpUrl r6) {
                r4 = this;
                java.lang.String r0 = "call"
                kotlin.jvm.internal.g0.p(r5, r0)
                java.lang.String r0 = "url"
                kotlin.jvm.internal.g0.p(r6, r0)
                okhttp3.EventListener[] r0 = r4.eventListeners
                int r1 = r0.length
                r2 = 0
            Le:
                if (r2 >= r1) goto L18
                r3 = r0[r2]
                r3.proxySelectStart(r5, r6)
                int r2 = r2 + 1
                goto Le
            L18:
                return
        }

        @Override // okhttp3.EventListener
        public void requestBodyEnd(@org.jetbrains.annotations.NotNull okhttp3.Call r5, long r6) {
                r4 = this;
                java.lang.String r0 = "call"
                kotlin.jvm.internal.g0.p(r5, r0)
                okhttp3.EventListener[] r0 = r4.eventListeners
                int r1 = r0.length
                r2 = 0
            L9:
                if (r2 >= r1) goto L13
                r3 = r0[r2]
                r3.requestBodyEnd(r5, r6)
                int r2 = r2 + 1
                goto L9
            L13:
                return
        }

        @Override // okhttp3.EventListener
        public void requestBodyStart(@org.jetbrains.annotations.NotNull okhttp3.Call r5) {
                r4 = this;
                java.lang.String r0 = "call"
                kotlin.jvm.internal.g0.p(r5, r0)
                okhttp3.EventListener[] r0 = r4.eventListeners
                int r1 = r0.length
                r2 = 0
            L9:
                if (r2 >= r1) goto L13
                r3 = r0[r2]
                r3.requestBodyStart(r5)
                int r2 = r2 + 1
                goto L9
            L13:
                return
        }

        @Override // okhttp3.EventListener
        public void requestFailed(@org.jetbrains.annotations.NotNull okhttp3.Call r5, @org.jetbrains.annotations.NotNull java.io.IOException r6) {
                r4 = this;
                java.lang.String r0 = "call"
                kotlin.jvm.internal.g0.p(r5, r0)
                java.lang.String r0 = "ioe"
                kotlin.jvm.internal.g0.p(r6, r0)
                okhttp3.EventListener[] r0 = r4.eventListeners
                int r1 = r0.length
                r2 = 0
            Le:
                if (r2 >= r1) goto L18
                r3 = r0[r2]
                r3.requestFailed(r5, r6)
                int r2 = r2 + 1
                goto Le
            L18:
                return
        }

        @Override // okhttp3.EventListener
        public void requestHeadersEnd(@org.jetbrains.annotations.NotNull okhttp3.Call r5, @org.jetbrains.annotations.NotNull okhttp3.Request r6) {
                r4 = this;
                java.lang.String r0 = "call"
                kotlin.jvm.internal.g0.p(r5, r0)
                java.lang.String r0 = "request"
                kotlin.jvm.internal.g0.p(r6, r0)
                okhttp3.EventListener[] r0 = r4.eventListeners
                int r1 = r0.length
                r2 = 0
            Le:
                if (r2 >= r1) goto L18
                r3 = r0[r2]
                r3.requestHeadersEnd(r5, r6)
                int r2 = r2 + 1
                goto Le
            L18:
                return
        }

        @Override // okhttp3.EventListener
        public void requestHeadersStart(@org.jetbrains.annotations.NotNull okhttp3.Call r5) {
                r4 = this;
                java.lang.String r0 = "call"
                kotlin.jvm.internal.g0.p(r5, r0)
                okhttp3.EventListener[] r0 = r4.eventListeners
                int r1 = r0.length
                r2 = 0
            L9:
                if (r2 >= r1) goto L13
                r3 = r0[r2]
                r3.requestHeadersStart(r5)
                int r2 = r2 + 1
                goto L9
            L13:
                return
        }

        @Override // okhttp3.EventListener
        public void responseBodyEnd(@org.jetbrains.annotations.NotNull okhttp3.Call r5, long r6) {
                r4 = this;
                java.lang.String r0 = "call"
                kotlin.jvm.internal.g0.p(r5, r0)
                okhttp3.EventListener[] r0 = r4.eventListeners
                int r1 = r0.length
                r2 = 0
            L9:
                if (r2 >= r1) goto L13
                r3 = r0[r2]
                r3.responseBodyEnd(r5, r6)
                int r2 = r2 + 1
                goto L9
            L13:
                return
        }

        @Override // okhttp3.EventListener
        public void responseBodyStart(@org.jetbrains.annotations.NotNull okhttp3.Call r5) {
                r4 = this;
                java.lang.String r0 = "call"
                kotlin.jvm.internal.g0.p(r5, r0)
                okhttp3.EventListener[] r0 = r4.eventListeners
                int r1 = r0.length
                r2 = 0
            L9:
                if (r2 >= r1) goto L13
                r3 = r0[r2]
                r3.responseBodyStart(r5)
                int r2 = r2 + 1
                goto L9
            L13:
                return
        }

        @Override // okhttp3.EventListener
        public void responseFailed(@org.jetbrains.annotations.NotNull okhttp3.Call r5, @org.jetbrains.annotations.NotNull java.io.IOException r6) {
                r4 = this;
                java.lang.String r0 = "call"
                kotlin.jvm.internal.g0.p(r5, r0)
                java.lang.String r0 = "ioe"
                kotlin.jvm.internal.g0.p(r6, r0)
                okhttp3.EventListener[] r0 = r4.eventListeners
                int r1 = r0.length
                r2 = 0
            Le:
                if (r2 >= r1) goto L18
                r3 = r0[r2]
                r3.responseFailed(r5, r6)
                int r2 = r2 + 1
                goto Le
            L18:
                return
        }

        @Override // okhttp3.EventListener
        public void responseHeadersEnd(@org.jetbrains.annotations.NotNull okhttp3.Call r5, @org.jetbrains.annotations.NotNull okhttp3.Response r6) {
                r4 = this;
                java.lang.String r0 = "call"
                kotlin.jvm.internal.g0.p(r5, r0)
                java.lang.String r0 = "response"
                kotlin.jvm.internal.g0.p(r6, r0)
                okhttp3.EventListener[] r0 = r4.eventListeners
                int r1 = r0.length
                r2 = 0
            Le:
                if (r2 >= r1) goto L18
                r3 = r0[r2]
                r3.responseHeadersEnd(r5, r6)
                int r2 = r2 + 1
                goto Le
            L18:
                return
        }

        @Override // okhttp3.EventListener
        public void responseHeadersStart(@org.jetbrains.annotations.NotNull okhttp3.Call r5) {
                r4 = this;
                java.lang.String r0 = "call"
                kotlin.jvm.internal.g0.p(r5, r0)
                okhttp3.EventListener[] r0 = r4.eventListeners
                int r1 = r0.length
                r2 = 0
            L9:
                if (r2 >= r1) goto L13
                r3 = r0[r2]
                r3.responseHeadersStart(r5)
                int r2 = r2 + 1
                goto L9
            L13:
                return
        }

        @Override // okhttp3.EventListener
        public void retryDecision(@org.jetbrains.annotations.NotNull okhttp3.Call r5, @org.jetbrains.annotations.NotNull java.io.IOException r6, boolean r7) {
                r4 = this;
                java.lang.String r0 = "call"
                kotlin.jvm.internal.g0.p(r5, r0)
                java.lang.String r0 = "exception"
                kotlin.jvm.internal.g0.p(r6, r0)
                okhttp3.EventListener[] r0 = r4.eventListeners
                int r1 = r0.length
                r2 = 0
            Le:
                if (r2 >= r1) goto L18
                r3 = r0[r2]
                r3.retryDecision(r5, r6, r7)
                int r2 = r2 + 1
                goto Le
            L18:
                return
        }

        @Override // okhttp3.EventListener
        public void satisfactionFailure(@org.jetbrains.annotations.NotNull okhttp3.Call r5, @org.jetbrains.annotations.NotNull okhttp3.Response r6) {
                r4 = this;
                java.lang.String r0 = "call"
                kotlin.jvm.internal.g0.p(r5, r0)
                java.lang.String r0 = "response"
                kotlin.jvm.internal.g0.p(r6, r0)
                okhttp3.EventListener[] r0 = r4.eventListeners
                int r1 = r0.length
                r2 = 0
            Le:
                if (r2 >= r1) goto L18
                r3 = r0[r2]
                r3.satisfactionFailure(r5, r6)
                int r2 = r2 + 1
                goto Le
            L18:
                return
        }

        @Override // okhttp3.EventListener
        public void secureConnectEnd(@org.jetbrains.annotations.NotNull okhttp3.Call r5, @org.jetbrains.annotations.Nullable okhttp3.Handshake r6) {
                r4 = this;
                java.lang.String r0 = "call"
                kotlin.jvm.internal.g0.p(r5, r0)
                okhttp3.EventListener[] r0 = r4.eventListeners
                int r1 = r0.length
                r2 = 0
            L9:
                if (r2 >= r1) goto L13
                r3 = r0[r2]
                r3.secureConnectEnd(r5, r6)
                int r2 = r2 + 1
                goto L9
            L13:
                return
        }

        @Override // okhttp3.EventListener
        public void secureConnectStart(@org.jetbrains.annotations.NotNull okhttp3.Call r5) {
                r4 = this;
                java.lang.String r0 = "call"
                kotlin.jvm.internal.g0.p(r5, r0)
                okhttp3.EventListener[] r0 = r4.eventListeners
                int r1 = r0.length
                r2 = 0
            L9:
                if (r2 >= r1) goto L13
                r3 = r0[r2]
                r3.secureConnectStart(r5)
                int r2 = r2 + 1
                goto L9
            L13:
                return
        }
    }

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
    public interface Factory {
        @org.jetbrains.annotations.NotNull
        okhttp3.EventListener create(@org.jetbrains.annotations.NotNull okhttp3.Call r1);
    }

    static {
            okhttp3.EventListener$Companion r0 = new okhttp3.EventListener$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.EventListener.Companion = r0
            okhttp3.EventListener$Companion$NONE$1 r0 = new okhttp3.EventListener$Companion$NONE$1
            r0.<init>()
            okhttp3.EventListener.NONE = r0
            return
    }

    public EventListener() {
            r0 = this;
            r0.<init>()
            return
    }

    public void cacheConditionalHit(@org.jetbrains.annotations.NotNull okhttp3.Call r2, @org.jetbrains.annotations.NotNull okhttp3.Response r3) {
            r1 = this;
            java.lang.String r0 = "call"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r2 = "cachedResponse"
            kotlin.jvm.internal.g0.p(r3, r2)
            return
    }

    public void cacheHit(@org.jetbrains.annotations.NotNull okhttp3.Call r2, @org.jetbrains.annotations.NotNull okhttp3.Response r3) {
            r1 = this;
            java.lang.String r0 = "call"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r2 = "response"
            kotlin.jvm.internal.g0.p(r3, r2)
            return
    }

    public void cacheMiss(@org.jetbrains.annotations.NotNull okhttp3.Call r2) {
            r1 = this;
            java.lang.String r0 = "call"
            kotlin.jvm.internal.g0.p(r2, r0)
            return
    }

    public void callEnd(@org.jetbrains.annotations.NotNull okhttp3.Call r2) {
            r1 = this;
            java.lang.String r0 = "call"
            kotlin.jvm.internal.g0.p(r2, r0)
            return
    }

    public void callFailed(@org.jetbrains.annotations.NotNull okhttp3.Call r2, @org.jetbrains.annotations.NotNull java.io.IOException r3) {
            r1 = this;
            java.lang.String r0 = "call"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r2 = "ioe"
            kotlin.jvm.internal.g0.p(r3, r2)
            return
    }

    public void callStart(@org.jetbrains.annotations.NotNull okhttp3.Call r2) {
            r1 = this;
            java.lang.String r0 = "call"
            kotlin.jvm.internal.g0.p(r2, r0)
            return
    }

    public void canceled(@org.jetbrains.annotations.NotNull okhttp3.Call r2) {
            r1 = this;
            java.lang.String r0 = "call"
            kotlin.jvm.internal.g0.p(r2, r0)
            return
    }

    public void connectEnd(@org.jetbrains.annotations.NotNull okhttp3.Call r1, @org.jetbrains.annotations.NotNull java.net.InetSocketAddress r2, @org.jetbrains.annotations.NotNull java.net.Proxy r3, @org.jetbrains.annotations.Nullable okhttp3.Protocol r4) {
            r0 = this;
            java.lang.String r4 = "call"
            kotlin.jvm.internal.g0.p(r1, r4)
            java.lang.String r1 = "inetSocketAddress"
            kotlin.jvm.internal.g0.p(r2, r1)
            java.lang.String r1 = "proxy"
            kotlin.jvm.internal.g0.p(r3, r1)
            return
    }

    public void connectFailed(@org.jetbrains.annotations.NotNull okhttp3.Call r1, @org.jetbrains.annotations.NotNull java.net.InetSocketAddress r2, @org.jetbrains.annotations.NotNull java.net.Proxy r3, @org.jetbrains.annotations.Nullable okhttp3.Protocol r4, @org.jetbrains.annotations.NotNull java.io.IOException r5) {
            r0 = this;
            java.lang.String r4 = "call"
            kotlin.jvm.internal.g0.p(r1, r4)
            java.lang.String r1 = "inetSocketAddress"
            kotlin.jvm.internal.g0.p(r2, r1)
            java.lang.String r1 = "proxy"
            kotlin.jvm.internal.g0.p(r3, r1)
            java.lang.String r1 = "ioe"
            kotlin.jvm.internal.g0.p(r5, r1)
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
            return
    }

    public void connectionAcquired(@org.jetbrains.annotations.NotNull okhttp3.Call r2, @org.jetbrains.annotations.NotNull okhttp3.Connection r3) {
            r1 = this;
            java.lang.String r0 = "call"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r2 = "connection"
            kotlin.jvm.internal.g0.p(r3, r2)
            return
    }

    public void connectionReleased(@org.jetbrains.annotations.NotNull okhttp3.Call r2, @org.jetbrains.annotations.NotNull okhttp3.Connection r3) {
            r1 = this;
            java.lang.String r0 = "call"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r2 = "connection"
            kotlin.jvm.internal.g0.p(r3, r2)
            return
    }

    public void dispatcherQueueEnd(@org.jetbrains.annotations.NotNull okhttp3.Call r2, @org.jetbrains.annotations.NotNull okhttp3.Dispatcher r3) {
            r1 = this;
            java.lang.String r0 = "call"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r2 = "dispatcher"
            kotlin.jvm.internal.g0.p(r3, r2)
            return
    }

    public void dispatcherQueueStart(@org.jetbrains.annotations.NotNull okhttp3.Call r2, @org.jetbrains.annotations.NotNull okhttp3.Dispatcher r3) {
            r1 = this;
            java.lang.String r0 = "call"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r2 = "dispatcher"
            kotlin.jvm.internal.g0.p(r3, r2)
            return
    }

    public void dnsEnd(@org.jetbrains.annotations.NotNull okhttp3.Call r2, @org.jetbrains.annotations.NotNull java.lang.String r3, @org.jetbrains.annotations.NotNull java.util.List<java.net.InetAddress> r4) {
            r1 = this;
            java.lang.String r0 = "call"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r2 = "domainName"
            kotlin.jvm.internal.g0.p(r3, r2)
            java.lang.String r2 = "inetAddressList"
            kotlin.jvm.internal.g0.p(r4, r2)
            return
    }

    public void dnsStart(@org.jetbrains.annotations.NotNull okhttp3.Call r2, @org.jetbrains.annotations.NotNull java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "call"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r2 = "domainName"
            kotlin.jvm.internal.g0.p(r3, r2)
            return
    }

    public void followUpDecision(@org.jetbrains.annotations.NotNull okhttp3.Call r1, @org.jetbrains.annotations.NotNull okhttp3.Response r2, @org.jetbrains.annotations.Nullable okhttp3.Request r3) {
            r0 = this;
            java.lang.String r3 = "call"
            kotlin.jvm.internal.g0.p(r1, r3)
            java.lang.String r1 = "networkResponse"
            kotlin.jvm.internal.g0.p(r2, r1)
            return
    }

    @org.jetbrains.annotations.NotNull
    public final okhttp3.EventListener plus(@org.jetbrains.annotations.NotNull okhttp3.EventListener r5) {
            r4 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.g0.p(r5, r0)
            okhttp3.EventListener r0 = okhttp3.EventListener.NONE
            if (r4 != r0) goto La
            return r5
        La:
            boolean r1 = r4 instanceof okhttp3.EventListener.AggregateEventListener
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L18
            r1 = r4
            okhttp3.EventListener$AggregateEventListener r1 = (okhttp3.EventListener.AggregateEventListener) r1
            okhttp3.EventListener[] r1 = r1.getEventListeners()
            goto L1c
        L18:
            okhttp3.EventListener[] r1 = new okhttp3.EventListener[r3]
            r1[r2] = r4
        L1c:
            if (r5 != r0) goto L1f
            return r4
        L1f:
            boolean r0 = r5 instanceof okhttp3.EventListener.AggregateEventListener
            if (r0 == 0) goto L2a
            okhttp3.EventListener$AggregateEventListener r5 = (okhttp3.EventListener.AggregateEventListener) r5
            okhttp3.EventListener[] r5 = r5.getEventListeners()
            goto L2f
        L2a:
            okhttp3.EventListener[] r0 = new okhttp3.EventListener[r3]
            r0[r2] = r5
            r5 = r0
        L2f:
            okhttp3.EventListener$AggregateEventListener r0 = new okhttp3.EventListener$AggregateEventListener
            java.lang.Object[] r5 = kotlin.collections.n.y3(r1, r5)
            okhttp3.EventListener[] r5 = (okhttp3.EventListener[]) r5
            r0.<init>(r5)
            return r0
    }

    public void proxySelectEnd(@org.jetbrains.annotations.NotNull okhttp3.Call r2, @org.jetbrains.annotations.NotNull okhttp3.HttpUrl r3, @org.jetbrains.annotations.NotNull java.util.List<java.net.Proxy> r4) {
            r1 = this;
            java.lang.String r0 = "call"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r2 = "url"
            kotlin.jvm.internal.g0.p(r3, r2)
            java.lang.String r2 = "proxies"
            kotlin.jvm.internal.g0.p(r4, r2)
            return
    }

    public void proxySelectStart(@org.jetbrains.annotations.NotNull okhttp3.Call r2, @org.jetbrains.annotations.NotNull okhttp3.HttpUrl r3) {
            r1 = this;
            java.lang.String r0 = "call"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r2 = "url"
            kotlin.jvm.internal.g0.p(r3, r2)
            return
    }

    public void requestBodyEnd(@org.jetbrains.annotations.NotNull okhttp3.Call r1, long r2) {
            r0 = this;
            java.lang.String r2 = "call"
            kotlin.jvm.internal.g0.p(r1, r2)
            return
    }

    public void requestBodyStart(@org.jetbrains.annotations.NotNull okhttp3.Call r2) {
            r1 = this;
            java.lang.String r0 = "call"
            kotlin.jvm.internal.g0.p(r2, r0)
            return
    }

    public void requestFailed(@org.jetbrains.annotations.NotNull okhttp3.Call r2, @org.jetbrains.annotations.NotNull java.io.IOException r3) {
            r1 = this;
            java.lang.String r0 = "call"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r2 = "ioe"
            kotlin.jvm.internal.g0.p(r3, r2)
            return
    }

    public void requestHeadersEnd(@org.jetbrains.annotations.NotNull okhttp3.Call r2, @org.jetbrains.annotations.NotNull okhttp3.Request r3) {
            r1 = this;
            java.lang.String r0 = "call"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r2 = "request"
            kotlin.jvm.internal.g0.p(r3, r2)
            return
    }

    public void requestHeadersStart(@org.jetbrains.annotations.NotNull okhttp3.Call r2) {
            r1 = this;
            java.lang.String r0 = "call"
            kotlin.jvm.internal.g0.p(r2, r0)
            return
    }

    public void responseBodyEnd(@org.jetbrains.annotations.NotNull okhttp3.Call r1, long r2) {
            r0 = this;
            java.lang.String r2 = "call"
            kotlin.jvm.internal.g0.p(r1, r2)
            return
    }

    public void responseBodyStart(@org.jetbrains.annotations.NotNull okhttp3.Call r2) {
            r1 = this;
            java.lang.String r0 = "call"
            kotlin.jvm.internal.g0.p(r2, r0)
            return
    }

    public void responseFailed(@org.jetbrains.annotations.NotNull okhttp3.Call r2, @org.jetbrains.annotations.NotNull java.io.IOException r3) {
            r1 = this;
            java.lang.String r0 = "call"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r2 = "ioe"
            kotlin.jvm.internal.g0.p(r3, r2)
            return
    }

    public void responseHeadersEnd(@org.jetbrains.annotations.NotNull okhttp3.Call r2, @org.jetbrains.annotations.NotNull okhttp3.Response r3) {
            r1 = this;
            java.lang.String r0 = "call"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r2 = "response"
            kotlin.jvm.internal.g0.p(r3, r2)
            return
    }

    public void responseHeadersStart(@org.jetbrains.annotations.NotNull okhttp3.Call r2) {
            r1 = this;
            java.lang.String r0 = "call"
            kotlin.jvm.internal.g0.p(r2, r0)
            return
    }

    public void retryDecision(@org.jetbrains.annotations.NotNull okhttp3.Call r1, @org.jetbrains.annotations.NotNull java.io.IOException r2, boolean r3) {
            r0 = this;
            java.lang.String r3 = "call"
            kotlin.jvm.internal.g0.p(r1, r3)
            java.lang.String r1 = "exception"
            kotlin.jvm.internal.g0.p(r2, r1)
            return
    }

    public void satisfactionFailure(@org.jetbrains.annotations.NotNull okhttp3.Call r2, @org.jetbrains.annotations.NotNull okhttp3.Response r3) {
            r1 = this;
            java.lang.String r0 = "call"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r2 = "response"
            kotlin.jvm.internal.g0.p(r3, r2)
            return
    }

    public void secureConnectEnd(@org.jetbrains.annotations.NotNull okhttp3.Call r1, @org.jetbrains.annotations.Nullable okhttp3.Handshake r2) {
            r0 = this;
            java.lang.String r2 = "call"
            kotlin.jvm.internal.g0.p(r1, r2)
            return
    }

    public void secureConnectStart(@org.jetbrains.annotations.NotNull okhttp3.Call r2) {
            r1 = this;
            java.lang.String r0 = "call"
            kotlin.jvm.internal.g0.p(r2, r0)
            return
    }
}
