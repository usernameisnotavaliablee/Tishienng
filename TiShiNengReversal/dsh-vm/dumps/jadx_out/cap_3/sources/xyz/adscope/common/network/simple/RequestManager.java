package xyz.adscope.common.network.simple;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class RequestManager {
    private static xyz.adscope.common.network.simple.RequestManager c;
    private final java.util.concurrent.Executor a;
    private final xyz.adscope.common.network.CancelerManager b;



    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class AsyncCallback<S, F> extends xyz.adscope.common.network.simple.Callback<S, F> {
        private final xyz.adscope.common.network.simple.Callback<S, F> a;
        private final java.util.concurrent.Executor b;






        AsyncCallback(xyz.adscope.common.network.simple.Callback<S, F> r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                xyz.adscope.common.network.KalleConfig r1 = xyz.adscope.common.network.Kalle.getConfig()
                java.util.concurrent.Executor r1 = r1.getMainExecutor()
                r0.b = r1
                return
        }

        static /* synthetic */ xyz.adscope.common.network.simple.Callback a(xyz.adscope.common.network.simple.RequestManager.AsyncCallback r0) {
                xyz.adscope.common.network.simple.Callback<S, F> r0 = r0.a
                return r0
        }

        @Override // xyz.adscope.common.network.simple.Callback
        public java.lang.reflect.Type getFailed() {
                r1 = this;
                xyz.adscope.common.network.simple.Callback<S, F> r0 = r1.a
                java.lang.reflect.Type r0 = r0.getFailed()
                return r0
        }

        @Override // xyz.adscope.common.network.simple.Callback
        public java.lang.reflect.Type getSucceed() {
                r1 = this;
                xyz.adscope.common.network.simple.Callback<S, F> r0 = r1.a
                java.lang.reflect.Type r0 = r0.getSucceed()
                return r0
        }

        @Override // xyz.adscope.common.network.simple.Callback
        public void onCancel() {
                r2 = this;
                xyz.adscope.common.network.simple.Callback<S, F> r0 = r2.a
                if (r0 != 0) goto L5
                return
            L5:
                java.util.concurrent.Executor r0 = r2.b
                xyz.adscope.common.network.simple.RequestManager$AsyncCallback$4 r1 = new xyz.adscope.common.network.simple.RequestManager$AsyncCallback$4
                r1.<init>(r2)
                r0.execute(r1)
                return
        }

        @Override // xyz.adscope.common.network.simple.Callback
        public void onEnd() {
                r2 = this;
                xyz.adscope.common.network.simple.Callback<S, F> r0 = r2.a
                if (r0 != 0) goto L5
                return
            L5:
                java.util.concurrent.Executor r0 = r2.b
                xyz.adscope.common.network.simple.RequestManager$AsyncCallback$5 r1 = new xyz.adscope.common.network.simple.RequestManager$AsyncCallback$5
                r1.<init>(r2)
                r0.execute(r1)
                return
        }

        @Override // xyz.adscope.common.network.simple.Callback
        public void onException(java.lang.Exception r3) {
                r2 = this;
                xyz.adscope.common.network.simple.Callback<S, F> r0 = r2.a
                if (r0 != 0) goto L5
                return
            L5:
                java.util.concurrent.Executor r0 = r2.b
                xyz.adscope.common.network.simple.RequestManager$AsyncCallback$3 r1 = new xyz.adscope.common.network.simple.RequestManager$AsyncCallback$3
                r1.<init>(r2, r3)
                r0.execute(r1)
                return
        }

        @Override // xyz.adscope.common.network.simple.Callback
        public void onResponse(xyz.adscope.common.network.simple.SimpleResponse<S, F> r3) {
                r2 = this;
                xyz.adscope.common.network.simple.Callback<S, F> r0 = r2.a
                if (r0 != 0) goto L5
                return
            L5:
                java.util.concurrent.Executor r0 = r2.b
                xyz.adscope.common.network.simple.RequestManager$AsyncCallback$2 r1 = new xyz.adscope.common.network.simple.RequestManager$AsyncCallback$2
                r1.<init>(r2, r3)
                r0.execute(r1)
                return
        }

        @Override // xyz.adscope.common.network.simple.Callback
        public void onStart() {
                r2 = this;
                xyz.adscope.common.network.simple.Callback<S, F> r0 = r2.a
                if (r0 != 0) goto L5
                return
            L5:
                java.util.concurrent.Executor r0 = r2.b
                xyz.adscope.common.network.simple.RequestManager$AsyncCallback$1 r1 = new xyz.adscope.common.network.simple.RequestManager$AsyncCallback$1
                r1.<init>(r2)
                r0.execute(r1)
                return
        }
    }

    private RequestManager() {
            r1 = this;
            r1.<init>()
            xyz.adscope.common.network.KalleConfig r0 = xyz.adscope.common.network.Kalle.getConfig()
            java.util.concurrent.Executor r0 = r0.getWorkExecutor()
            r1.a = r0
            xyz.adscope.common.network.CancelerManager r0 = new xyz.adscope.common.network.CancelerManager
            r0.<init>()
            r1.b = r0
            return
    }

    static /* synthetic */ xyz.adscope.common.network.CancelerManager a(xyz.adscope.common.network.simple.RequestManager r0) {
            xyz.adscope.common.network.CancelerManager r0 = r0.b
            return r0
    }

    public static xyz.adscope.common.network.simple.RequestManager getInstance() {
            xyz.adscope.common.network.simple.RequestManager r0 = xyz.adscope.common.network.simple.RequestManager.c
            if (r0 != 0) goto L19
            java.lang.Class<xyz.adscope.common.network.simple.RequestManager> r0 = xyz.adscope.common.network.simple.RequestManager.class
            monitor-enter(r0)
            xyz.adscope.common.network.simple.RequestManager r1 = xyz.adscope.common.network.simple.RequestManager.c     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            xyz.adscope.common.network.simple.RequestManager r1 = new xyz.adscope.common.network.simple.RequestManager     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            xyz.adscope.common.network.simple.RequestManager.c = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r1 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1
        L19:
            xyz.adscope.common.network.simple.RequestManager r0 = xyz.adscope.common.network.simple.RequestManager.c
            return r0
    }

    public void cancel(java.lang.Object r2) {
            r1 = this;
            xyz.adscope.common.network.CancelerManager r0 = r1.b
            r0.cancel(r2)
            return
    }

    public <S, F> xyz.adscope.common.network.Canceller perform(xyz.adscope.common.network.simple.SimpleBodyRequest r5, xyz.adscope.common.network.simple.Callback<S, F> r6) {
            r4 = this;
            xyz.adscope.common.network.simple.Work r0 = new xyz.adscope.common.network.simple.Work
            xyz.adscope.common.network.simple.BodyWorker r1 = new xyz.adscope.common.network.simple.BodyWorker
            java.lang.reflect.Type r2 = r6.getSucceed()
            java.lang.reflect.Type r3 = r6.getFailed()
            r1.<init>(r5, r2, r3)
            xyz.adscope.common.network.simple.RequestManager$2 r2 = new xyz.adscope.common.network.simple.RequestManager$2
            r2.<init>(r4, r6, r5)
            r0.<init>(r1, r2)
            xyz.adscope.common.network.CancelerManager r6 = r4.b
            r6.addCancel(r5, r0)
            java.util.concurrent.Executor r5 = r4.a
            r5.execute(r0)
            return r0
    }

    public <S, F> xyz.adscope.common.network.Canceller perform(xyz.adscope.common.network.simple.SimpleUrlRequest r5, xyz.adscope.common.network.simple.Callback<S, F> r6) {
            r4 = this;
            xyz.adscope.common.network.simple.Work r0 = new xyz.adscope.common.network.simple.Work
            xyz.adscope.common.network.simple.UrlWorker r1 = new xyz.adscope.common.network.simple.UrlWorker
            java.lang.reflect.Type r2 = r6.getSucceed()
            java.lang.reflect.Type r3 = r6.getFailed()
            r1.<init>(r5, r2, r3)
            xyz.adscope.common.network.simple.RequestManager$1 r2 = new xyz.adscope.common.network.simple.RequestManager$1
            r2.<init>(r4, r6, r5)
            r0.<init>(r1, r2)
            xyz.adscope.common.network.CancelerManager r6 = r4.b
            r6.addCancel(r5, r0)
            java.util.concurrent.Executor r5 = r4.a
            r5.execute(r0)
            return r0
    }

    public <S, F> xyz.adscope.common.network.simple.SimpleResponse<S, F> perform(xyz.adscope.common.network.simple.SimpleBodyRequest r2, java.lang.reflect.Type r3, java.lang.reflect.Type r4) {
            r1 = this;
            xyz.adscope.common.network.simple.BodyWorker r0 = new xyz.adscope.common.network.simple.BodyWorker
            r0.<init>(r2, r3, r4)
            xyz.adscope.common.network.simple.SimpleResponse r2 = r0.call()
            return r2
    }

    public <S, F> xyz.adscope.common.network.simple.SimpleResponse<S, F> perform(xyz.adscope.common.network.simple.SimpleUrlRequest r2, java.lang.reflect.Type r3, java.lang.reflect.Type r4) {
            r1 = this;
            xyz.adscope.common.network.simple.UrlWorker r0 = new xyz.adscope.common.network.simple.UrlWorker
            r0.<init>(r2, r3, r4)
            xyz.adscope.common.network.simple.SimpleResponse r2 = r0.call()
            return r2
    }
}
