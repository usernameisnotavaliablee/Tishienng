package com.acse.ottn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class p1 extends okhttp3.EventListener {

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String f2567d = "HttpEventListener";

    /* renamed from: e, reason: collision with root package name */
    public static final okhttp3.EventListener.Factory f2568e = null;
    public final long a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2569b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.StringBuilder f2570c;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class a implements okhttp3.EventListener.Factory {
        public final java.util.concurrent.atomic.AtomicLong a;

        public a() {
                r3 = this;
                r3.<init>()
                java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
                r1 = 1
                r0.<init>(r1)
                r3.a = r0
                return
        }

        public okhttp3.EventListener create(okhttp3.Call r8) {
                r7 = this;
                java.util.concurrent.atomic.AtomicLong r0 = r7.a
                long r2 = r0.getAndIncrement()
                com.acse.ottn.p1 r1 = new com.acse.ottn.p1
                okhttp3.Request r8 = r8.request()
                okhttp3.HttpUrl r4 = r8.url()
                long r5 = java.lang.System.nanoTime()
                r1.<init>(r2, r4, r5)
                return r1
        }
    }

    static {
            com.acse.ottn.p1$a r0 = new com.acse.ottn.p1$a
            r0.<init>()
            com.acse.ottn.p1.f2568e = r0
            return
    }

    public p1(long r1, okhttp3.HttpUrl r3, long r4) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.f2569b = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            java.lang.String r3 = " "
            r4.append(r3)
            r4.append(r1)
            java.lang.String r1 = ":"
            r4.append(r1)
            r0.f2570c = r4
            return
    }

    public final void a(java.lang.String r7) {
            r6 = this;
            long r0 = java.lang.System.nanoTime()
            long r2 = r6.f2569b
            long r0 = r0 - r2
            java.lang.StringBuilder r2 = r6.f2570c
            java.util.Locale r3 = java.util.Locale.CHINA
            double r0 = (double) r0
            r4 = 4741671816366391296(0x41cdcd6500000000, double:1.0E9)
            double r0 = r0 / r4
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r4 = 0
            r1[r4] = r0
            r0 = 1
            r1[r0] = r7
            java.lang.String r0 = "%.3f-%s"
            java.lang.String r0 = java.lang.String.format(r3, r0, r1)
            r2.append(r0)
            java.lang.String r0 = ";"
            r2.append(r0)
            java.lang.String r0 = "callEnd"
            boolean r0 = r7.equalsIgnoreCase(r0)
            if (r0 != 0) goto L3f
            java.lang.String r0 = "callFailed"
            boolean r7 = r7.equalsIgnoreCase(r0)
            if (r7 == 0) goto L3e
            goto L3f
        L3e:
            return
        L3f:
            java.lang.StringBuilder r7 = r6.f2570c
            java.lang.String r7 = r7.toString()
            java.lang.String r0 = "HttpEventListener"
            com.acse.ottn.h2.a(r0, r7)
            return
    }

    public void callEnd(okhttp3.Call r1) {
            r0 = this;
            super.callEnd(r1)
            java.lang.String r1 = "callEnd"
            r0.a(r1)
            return
    }

    public void callFailed(okhttp3.Call r1, java.io.IOException r2) {
            r0 = this;
            super.callFailed(r1, r2)
            java.lang.String r1 = "callFailed"
            r0.a(r1)
            return
    }

    public void callStart(okhttp3.Call r1) {
            r0 = this;
            super.callStart(r1)
            java.lang.String r1 = "callStart"
            r0.a(r1)
            return
    }

    public void connectEnd(okhttp3.Call r1, java.net.InetSocketAddress r2, java.net.Proxy r3, @androidx.annotation.Nullable okhttp3.Protocol r4) {
            r0 = this;
            super.connectEnd(r1, r2, r3, r4)
            java.lang.String r1 = "connectEnd"
            r0.a(r1)
            return
    }

    public void connectFailed(okhttp3.Call r1, java.net.InetSocketAddress r2, java.net.Proxy r3, @androidx.annotation.Nullable okhttp3.Protocol r4, java.io.IOException r5) {
            r0 = this;
            super.connectFailed(r1, r2, r3, r4, r5)
            r1 = r0
            java.lang.String r2 = "connectFailed"
            r0.a(r2)
            return
    }

    public void connectStart(okhttp3.Call r1, java.net.InetSocketAddress r2, java.net.Proxy r3) {
            r0 = this;
            super.connectStart(r1, r2, r3)
            java.lang.String r1 = "connectStart"
            r0.a(r1)
            return
    }

    public void connectionAcquired(okhttp3.Call r1, okhttp3.Connection r2) {
            r0 = this;
            super.connectionAcquired(r1, r2)
            java.lang.String r1 = "connectionAcquired"
            r0.a(r1)
            return
    }

    public void connectionReleased(okhttp3.Call r1, okhttp3.Connection r2) {
            r0 = this;
            super.connectionReleased(r1, r2)
            java.lang.String r1 = "connectionReleased"
            r0.a(r1)
            return
    }

    public void dnsEnd(okhttp3.Call r1, java.lang.String r2, java.util.List<java.net.InetAddress> r3) {
            r0 = this;
            super.dnsEnd(r1, r2, r3)
            java.lang.String r1 = "dnsEnd"
            r0.a(r1)
            return
    }

    public void dnsStart(okhttp3.Call r1, java.lang.String r2) {
            r0 = this;
            super.dnsStart(r1, r2)
            java.lang.String r1 = "dnsStart"
            r0.a(r1)
            return
    }

    public void requestBodyEnd(okhttp3.Call r1, long r2) {
            r0 = this;
            super.requestBodyEnd(r1, r2)
            java.lang.String r1 = "requestBodyEnd"
            r0.a(r1)
            return
    }

    public void requestBodyStart(okhttp3.Call r1) {
            r0 = this;
            super.requestBodyStart(r1)
            java.lang.String r1 = "requestBodyStart"
            r0.a(r1)
            return
    }

    public void requestHeadersEnd(okhttp3.Call r1, okhttp3.Request r2) {
            r0 = this;
            super.requestHeadersEnd(r1, r2)
            java.lang.String r1 = "requestHeadersEnd"
            r0.a(r1)
            return
    }

    public void requestHeadersStart(okhttp3.Call r1) {
            r0 = this;
            super.requestHeadersStart(r1)
            java.lang.String r1 = "requestHeadersStart"
            r0.a(r1)
            return
    }

    public void responseBodyEnd(okhttp3.Call r1, long r2) {
            r0 = this;
            super.responseBodyEnd(r1, r2)
            java.lang.String r1 = "responseBodyEnd"
            r0.a(r1)
            return
    }

    public void responseBodyStart(okhttp3.Call r1) {
            r0 = this;
            super.responseBodyStart(r1)
            java.lang.String r1 = "responseBodyStart"
            r0.a(r1)
            return
    }

    public void responseHeadersEnd(okhttp3.Call r1, okhttp3.Response r2) {
            r0 = this;
            super.responseHeadersEnd(r1, r2)
            java.lang.String r1 = "responseHeadersEnd"
            r0.a(r1)
            return
    }

    public void responseHeadersStart(okhttp3.Call r1) {
            r0 = this;
            super.responseHeadersStart(r1)
            java.lang.String r1 = "responseHeadersStart"
            r0.a(r1)
            return
    }

    public void secureConnectEnd(okhttp3.Call r1, @androidx.annotation.Nullable okhttp3.Handshake r2) {
            r0 = this;
            super.secureConnectEnd(r1, r2)
            java.lang.String r1 = "secureConnectEnd"
            r0.a(r1)
            return
    }

    public void secureConnectStart(okhttp3.Call r1) {
            r0 = this;
            super.secureConnectStart(r1)
            java.lang.String r1 = "secureConnectStart"
            r0.a(r1)
            return
    }
}
