package xyz.adscope.common.network.connect.http;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class Call {
    private static final java.util.concurrent.Executor e = null;
    private final xyz.adscope.common.network.Request a;
    private xyz.adscope.common.network.connect.http.ConnectInterceptor b;
    private boolean c;
    private boolean d;


    static {
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newCachedThreadPool()
            xyz.adscope.common.network.connect.http.Call.e = r0
            return
    }

    public Call(xyz.adscope.common.network.Request r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public void asyncCancel() {
            r2 = this;
            java.util.concurrent.Executor r0 = xyz.adscope.common.network.connect.http.Call.e
            xyz.adscope.common.network.connect.http.Call$1 r1 = new xyz.adscope.common.network.connect.http.Call$1
            r1.<init>(r2)
            r0.execute(r1)
            return
    }

    public void cancel() {
            r1 = this;
            boolean r0 = r1.d
            if (r0 != 0) goto Le
            r0 = 1
            r1.d = r0
            xyz.adscope.common.network.connect.http.ConnectInterceptor r0 = r1.b
            if (r0 == 0) goto Le
            r0.cancel()
        Le:
            return
    }

    public xyz.adscope.common.network.Response execute() {
            r5 = this;
            boolean r0 = r5.d
            java.lang.String r1 = "The request has been cancelled."
            if (r0 != 0) goto L3b
            r0 = 1
            r5.c = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            xyz.adscope.common.network.KalleConfig r2 = xyz.adscope.common.network.Kalle.getConfig()
            java.util.List r2 = r2.getInterceptor()
            r0.<init>(r2)
            xyz.adscope.common.network.connect.http.ConnectInterceptor r2 = new xyz.adscope.common.network.connect.http.ConnectInterceptor
            r2.<init>()
            r5.b = r2
            r0.add(r2)
            xyz.adscope.common.network.connect.http.AppChain r2 = new xyz.adscope.common.network.connect.http.AppChain
            xyz.adscope.common.network.Request r3 = r5.a
            r4 = 0
            r2.<init>(r0, r4, r3, r5)
            xyz.adscope.common.network.Request r0 = r5.a     // Catch: java.lang.Exception -> L2f
            xyz.adscope.common.network.Response r0 = r2.proceed(r0)     // Catch: java.lang.Exception -> L2f
            return r0
        L2f:
            r0 = move-exception
            boolean r2 = r5.d
            if (r2 == 0) goto L3a
            java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException
            r0.<init>(r1)
            throw r0
        L3a:
            throw r0
        L3b:
            java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException
            r0.<init>(r1)
            throw r0
    }

    public boolean isCanceled() {
            r1 = this;
            boolean r0 = r1.d
            return r0
    }

    public boolean isExecuted() {
            r1 = this;
            boolean r0 = r1.c
            return r0
    }
}
