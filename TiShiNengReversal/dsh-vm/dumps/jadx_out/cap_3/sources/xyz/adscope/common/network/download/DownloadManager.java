package xyz.adscope.common.network.download;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class DownloadManager {
    private static xyz.adscope.common.network.download.DownloadManager c;
    private final java.util.concurrent.Executor a;
    private final xyz.adscope.common.network.CancelerManager b;



    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class AsyncCallback implements xyz.adscope.common.network.download.Callback {
        private final xyz.adscope.common.network.download.Callback a;
        private final java.util.concurrent.Executor b;






        AsyncCallback(xyz.adscope.common.network.download.Callback r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                xyz.adscope.common.network.KalleConfig r1 = xyz.adscope.common.network.Kalle.getConfig()
                java.util.concurrent.Executor r1 = r1.getMainExecutor()
                r0.b = r1
                return
        }

        static /* synthetic */ xyz.adscope.common.network.download.Callback a(xyz.adscope.common.network.download.DownloadManager.AsyncCallback r0) {
                xyz.adscope.common.network.download.Callback r0 = r0.a
                return r0
        }

        @Override // xyz.adscope.common.network.download.Callback
        public void onCancel() {
                r2 = this;
                xyz.adscope.common.network.download.Callback r0 = r2.a
                if (r0 != 0) goto L5
                return
            L5:
                java.util.concurrent.Executor r0 = r2.b
                xyz.adscope.common.network.download.DownloadManager$AsyncCallback$4 r1 = new xyz.adscope.common.network.download.DownloadManager$AsyncCallback$4
                r1.<init>(r2)
                r0.execute(r1)
                return
        }

        @Override // xyz.adscope.common.network.download.Callback
        public void onEnd() {
                r2 = this;
                xyz.adscope.common.network.download.Callback r0 = r2.a
                if (r0 != 0) goto L5
                return
            L5:
                java.util.concurrent.Executor r0 = r2.b
                xyz.adscope.common.network.download.DownloadManager$AsyncCallback$5 r1 = new xyz.adscope.common.network.download.DownloadManager$AsyncCallback$5
                r1.<init>(r2)
                r0.execute(r1)
                return
        }

        @Override // xyz.adscope.common.network.download.Callback
        public void onException(java.lang.Exception r3) {
                r2 = this;
                xyz.adscope.common.network.download.Callback r0 = r2.a
                if (r0 != 0) goto L5
                return
            L5:
                java.util.concurrent.Executor r0 = r2.b
                xyz.adscope.common.network.download.DownloadManager$AsyncCallback$3 r1 = new xyz.adscope.common.network.download.DownloadManager$AsyncCallback$3
                r1.<init>(r2, r3)
                r0.execute(r1)
                return
        }

        @Override // xyz.adscope.common.network.download.Callback
        public void onFinish(java.lang.String r3) {
                r2 = this;
                xyz.adscope.common.network.download.Callback r0 = r2.a
                if (r0 != 0) goto L5
                return
            L5:
                java.util.concurrent.Executor r0 = r2.b
                xyz.adscope.common.network.download.DownloadManager$AsyncCallback$2 r1 = new xyz.adscope.common.network.download.DownloadManager$AsyncCallback$2
                r1.<init>(r2, r3)
                r0.execute(r1)
                return
        }

        @Override // xyz.adscope.common.network.download.Callback
        public void onStart() {
                r2 = this;
                xyz.adscope.common.network.download.Callback r0 = r2.a
                if (r0 != 0) goto L5
                return
            L5:
                java.util.concurrent.Executor r0 = r2.b
                xyz.adscope.common.network.download.DownloadManager$AsyncCallback$1 r1 = new xyz.adscope.common.network.download.DownloadManager$AsyncCallback$1
                r1.<init>(r2)
                r0.execute(r1)
                return
        }
    }

    private DownloadManager() {
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

    static /* synthetic */ xyz.adscope.common.network.CancelerManager a(xyz.adscope.common.network.download.DownloadManager r0) {
            xyz.adscope.common.network.CancelerManager r0 = r0.b
            return r0
    }

    public static xyz.adscope.common.network.download.DownloadManager getInstance() {
            xyz.adscope.common.network.download.DownloadManager r0 = xyz.adscope.common.network.download.DownloadManager.c
            if (r0 != 0) goto L19
            java.lang.Class<xyz.adscope.common.network.download.DownloadManager> r0 = xyz.adscope.common.network.download.DownloadManager.class
            monitor-enter(r0)
            xyz.adscope.common.network.download.DownloadManager r1 = xyz.adscope.common.network.download.DownloadManager.c     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            xyz.adscope.common.network.download.DownloadManager r1 = new xyz.adscope.common.network.download.DownloadManager     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            xyz.adscope.common.network.download.DownloadManager.c = r1     // Catch: java.lang.Throwable -> L13
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
            xyz.adscope.common.network.download.DownloadManager r0 = xyz.adscope.common.network.download.DownloadManager.c
            return r0
    }

    public void cancel(java.lang.Object r2) {
            r1 = this;
            xyz.adscope.common.network.CancelerManager r0 = r1.b
            r0.cancel(r2)
            return
    }

    public java.lang.String perform(xyz.adscope.common.network.download.BodyDownload r2) {
            r1 = this;
            xyz.adscope.common.network.download.BodyWorker r0 = new xyz.adscope.common.network.download.BodyWorker
            r0.<init>(r2)
            java.lang.String r2 = r0.call2()
            return r2
    }

    public java.lang.String perform(xyz.adscope.common.network.download.UrlDownload r2) {
            r1 = this;
            xyz.adscope.common.network.download.UrlWorker r0 = new xyz.adscope.common.network.download.UrlWorker
            r0.<init>(r2)
            java.lang.String r2 = r0.call2()
            return r2
    }

    public xyz.adscope.common.network.Canceller perform(xyz.adscope.common.network.download.BodyDownload r4, xyz.adscope.common.network.download.Callback r5) {
            r3 = this;
            xyz.adscope.common.network.download.Work r0 = new xyz.adscope.common.network.download.Work
            xyz.adscope.common.network.download.BodyWorker r1 = new xyz.adscope.common.network.download.BodyWorker
            r1.<init>(r4)
            xyz.adscope.common.network.download.DownloadManager$2 r2 = new xyz.adscope.common.network.download.DownloadManager$2
            r2.<init>(r3, r5, r4)
            r0.<init>(r1, r2)
            xyz.adscope.common.network.CancelerManager r5 = r3.b
            r5.addCancel(r4, r0)
            java.util.concurrent.Executor r4 = r3.a
            r4.execute(r0)
            return r0
    }

    public xyz.adscope.common.network.Canceller perform(xyz.adscope.common.network.download.UrlDownload r4, xyz.adscope.common.network.download.Callback r5) {
            r3 = this;
            xyz.adscope.common.network.download.Work r0 = new xyz.adscope.common.network.download.Work
            xyz.adscope.common.network.download.UrlWorker r1 = new xyz.adscope.common.network.download.UrlWorker
            r1.<init>(r4)
            xyz.adscope.common.network.download.DownloadManager$1 r2 = new xyz.adscope.common.network.download.DownloadManager$1
            r2.<init>(r3, r5, r4)
            r0.<init>(r1, r2)
            xyz.adscope.common.network.CancelerManager r5 = r3.b
            r5.addCancel(r4, r0)
            java.util.concurrent.Executor r4 = r3.a
            r4.execute(r0)
            return r0
    }
}
