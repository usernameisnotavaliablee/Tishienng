package xyz.adscope.common.network.download;

import xyz.adscope.common.network.download.Download;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class Work<T extends xyz.adscope.common.network.download.Download> extends java.util.concurrent.FutureTask<java.lang.String> implements xyz.adscope.common.network.Canceller {
    private xyz.adscope.common.network.download.BasicWorker<T> a;
    private final xyz.adscope.common.network.download.Callback b;

    Work(xyz.adscope.common.network.download.BasicWorker<T> r1, xyz.adscope.common.network.download.Callback r2) {
            r0 = this;
            r0.<init>(r1)
            r0.a = r1
            r0.b = r2
            return
    }

    @Override // xyz.adscope.common.network.Canceller
    public void cancel() {
            r1 = this;
            r0 = 1
            r1.cancel(r0)
            xyz.adscope.common.network.download.BasicWorker<T extends xyz.adscope.common.network.download.Download> r0 = r1.a
            r0.cancel()
            return
    }

    @Override // java.util.concurrent.FutureTask
    protected void done() {
            r3 = this;
            xyz.adscope.common.network.download.Callback r0 = r3.b     // Catch: java.lang.Exception -> Lc java.util.concurrent.ExecutionException -> Le java.util.concurrent.CancellationException -> L4b
            java.lang.Object r1 = r3.get()     // Catch: java.lang.Exception -> Lc java.util.concurrent.ExecutionException -> Le java.util.concurrent.CancellationException -> L4b
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> Lc java.util.concurrent.ExecutionException -> Le java.util.concurrent.CancellationException -> L4b
            r0.onFinish(r1)     // Catch: java.lang.Exception -> Lc java.util.concurrent.ExecutionException -> Le java.util.concurrent.CancellationException -> L4b
            goto L50
        Lc:
            r0 = move-exception
            goto L10
        Le:
            r0 = move-exception
            goto L22
        L10:
            boolean r1 = r3.isCancelled()
            if (r1 == 0) goto L1c
            xyz.adscope.common.network.download.Callback r0 = r3.b
            r0.onCancel()
            goto L50
        L1c:
            xyz.adscope.common.network.download.Callback r1 = r3.b
            r1.onException(r0)
            goto L50
        L22:
            java.lang.Throwable r0 = r0.getCause()
            boolean r1 = r3.isCancelled()
            if (r1 == 0) goto L32
            xyz.adscope.common.network.download.Callback r0 = r3.b
            r0.onCancel()
            goto L50
        L32:
            if (r0 == 0) goto L40
            boolean r1 = r0 instanceof java.lang.Exception
            if (r1 == 0) goto L40
            xyz.adscope.common.network.download.Callback r1 = r3.b
            java.lang.Exception r0 = (java.lang.Exception) r0
            r1.onException(r0)
            goto L50
        L40:
            xyz.adscope.common.network.download.Callback r1 = r3.b
            java.lang.Exception r2 = new java.lang.Exception
            r2.<init>(r0)
            r1.onException(r2)
            goto L50
        L4b:
            xyz.adscope.common.network.download.Callback r0 = r3.b
            r0.onCancel()
        L50:
            xyz.adscope.common.network.download.Callback r0 = r3.b
            r0.onEnd()
            return
    }

    @Override // java.util.concurrent.FutureTask, java.util.concurrent.RunnableFuture, java.lang.Runnable
    public void run() {
            r1 = this;
            xyz.adscope.common.network.download.Callback r0 = r1.b
            r0.onStart()
            super.run()
            return
    }
}
