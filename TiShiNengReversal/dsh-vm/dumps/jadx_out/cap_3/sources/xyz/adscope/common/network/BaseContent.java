package xyz.adscope.common.network;

import xyz.adscope.common.network.Content;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public abstract class BaseContent<T extends xyz.adscope.common.network.Content> implements xyz.adscope.common.network.Content {
    private xyz.adscope.common.network.ProgressBar<T> a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class AsyncProgressBar<T extends xyz.adscope.common.network.Content> implements xyz.adscope.common.network.ProgressBar<T> {
        private final xyz.adscope.common.network.ProgressBar<T> a;
        private final java.util.concurrent.Executor b;


        public AsyncProgressBar(xyz.adscope.common.network.ProgressBar<T> r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                xyz.adscope.common.network.KalleConfig r1 = xyz.adscope.common.network.Kalle.getConfig()
                java.util.concurrent.Executor r1 = r1.getMainExecutor()
                r0.b = r1
                return
        }

        static /* synthetic */ xyz.adscope.common.network.ProgressBar a(xyz.adscope.common.network.BaseContent.AsyncProgressBar r0) {
                xyz.adscope.common.network.ProgressBar<T extends xyz.adscope.common.network.Content> r0 = r0.a
                return r0
        }

        @Override // xyz.adscope.common.network.ProgressBar
        public /* bridge */ /* synthetic */ void progress(java.lang.Object r1, int r2) {
                r0 = this;
                xyz.adscope.common.network.Content r1 = (xyz.adscope.common.network.Content) r1
                r0.progress(r1, r2)
                return
        }

        public void progress(T r3, int r4) {
                r2 = this;
                java.util.concurrent.Executor r0 = r2.b
                xyz.adscope.common.network.BaseContent$AsyncProgressBar$1 r1 = new xyz.adscope.common.network.BaseContent$AsyncProgressBar$1
                r1.<init>(r2, r3, r4)
                r0.execute(r1)
                return
        }
    }

    public BaseContent() {
            r0 = this;
            r0.<init>()
            return
    }

    protected abstract void a(java.io.OutputStream r1);

    public void onProgress(xyz.adscope.common.network.ProgressBar<T> r2) {
            r1 = this;
            xyz.adscope.common.network.BaseContent$AsyncProgressBar r0 = new xyz.adscope.common.network.BaseContent$AsyncProgressBar
            r0.<init>(r2)
            r1.a = r0
            return
    }

    @Override // xyz.adscope.common.network.Content
    public final void writeTo(java.io.OutputStream r3) {
            r2 = this;
            xyz.adscope.common.network.ProgressBar<T extends xyz.adscope.common.network.Content> r0 = r2.a
            if (r0 == 0) goto Lf
            xyz.adscope.common.network.util.ProgressOutputStream r0 = new xyz.adscope.common.network.util.ProgressOutputStream
            xyz.adscope.common.network.ProgressBar<T extends xyz.adscope.common.network.Content> r1 = r2.a
            r0.<init>(r3, r2, r1)
            r2.a(r0)
            return
        Lf:
            r2.a(r3)
            return
    }
}
