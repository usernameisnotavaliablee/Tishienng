package xyz.adscope.common.network.download;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class BodyDownload extends xyz.adscope.common.network.BodyRequest implements xyz.adscope.common.network.download.Download {
    private final java.lang.String l;
    private final java.lang.String m;
    private final xyz.adscope.common.network.download.Download.ProgressBar n;
    private final xyz.adscope.common.network.download.Download.Policy o;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: xyz.adscope.common.network.download.BodyDownload$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class Api extends xyz.adscope.common.network.BodyRequest.Api<xyz.adscope.common.network.download.BodyDownload.Api> {
        private java.lang.String l;
        private java.lang.String m;
        private xyz.adscope.common.network.download.Download.ProgressBar n;
        private xyz.adscope.common.network.download.Download.Policy o;

        private Api(xyz.adscope.common.network.Url r1, xyz.adscope.common.network.RequestMethod r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        /* synthetic */ Api(xyz.adscope.common.network.Url r1, xyz.adscope.common.network.RequestMethod r2, xyz.adscope.common.network.download.BodyDownload.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        static /* synthetic */ java.lang.String a(xyz.adscope.common.network.download.BodyDownload.Api r0) {
                java.lang.String r0 = r0.l
                return r0
        }

        static /* synthetic */ java.lang.String b(xyz.adscope.common.network.download.BodyDownload.Api r0) {
                java.lang.String r0 = r0.m
                return r0
        }

        static /* synthetic */ xyz.adscope.common.network.download.Download.ProgressBar c(xyz.adscope.common.network.download.BodyDownload.Api r0) {
                xyz.adscope.common.network.download.Download$ProgressBar r0 = r0.n
                return r0
        }

        static /* synthetic */ xyz.adscope.common.network.download.Download.Policy d(xyz.adscope.common.network.download.BodyDownload.Api r0) {
                xyz.adscope.common.network.download.Download$Policy r0 = r0.o
                return r0
        }

        public xyz.adscope.common.network.download.BodyDownload.Api directory(java.lang.String r1) {
                r0 = this;
                r0.l = r1
                return r0
        }

        public xyz.adscope.common.network.download.BodyDownload.Api fileName(java.lang.String r1) {
                r0 = this;
                r0.m = r1
                return r0
        }

        public xyz.adscope.common.network.download.BodyDownload.Api onProgress(xyz.adscope.common.network.download.Download.ProgressBar r1) {
                r0 = this;
                r0.n = r1
                return r0
        }

        public java.lang.String perform() {
                r3 = this;
                xyz.adscope.common.network.download.BodyWorker r0 = new xyz.adscope.common.network.download.BodyWorker
                xyz.adscope.common.network.download.BodyDownload r1 = new xyz.adscope.common.network.download.BodyDownload
                r2 = 0
                r1.<init>(r3, r2)
                r0.<init>(r1)
                java.lang.String r0 = r0.call2()
                return r0
        }

        public xyz.adscope.common.network.Canceller perform(xyz.adscope.common.network.download.Callback r4) {
                r3 = this;
                xyz.adscope.common.network.download.DownloadManager r0 = xyz.adscope.common.network.download.DownloadManager.getInstance()
                xyz.adscope.common.network.download.BodyDownload r1 = new xyz.adscope.common.network.download.BodyDownload
                r2 = 0
                r1.<init>(r3, r2)
                xyz.adscope.common.network.Canceller r4 = r0.perform(r1, r4)
                return r4
        }

        public xyz.adscope.common.network.download.BodyDownload.Api policy(xyz.adscope.common.network.download.Download.Policy r1) {
                r0 = this;
                r0.o = r1
                return r0
        }
    }

    private BodyDownload(xyz.adscope.common.network.download.BodyDownload.Api r2) {
            r1 = this;
            r1.<init>(r2)
            java.lang.String r0 = xyz.adscope.common.network.download.BodyDownload.Api.a(r2)
            r1.l = r0
            java.lang.String r0 = xyz.adscope.common.network.download.BodyDownload.Api.b(r2)
            r1.m = r0
            xyz.adscope.common.network.download.Download$ProgressBar r0 = xyz.adscope.common.network.download.BodyDownload.Api.c(r2)
            if (r0 != 0) goto L18
            xyz.adscope.common.network.download.Download$ProgressBar r0 = xyz.adscope.common.network.download.Download.ProgressBar.DEFAULT
            goto L1c
        L18:
            xyz.adscope.common.network.download.Download$ProgressBar r0 = xyz.adscope.common.network.download.BodyDownload.Api.c(r2)
        L1c:
            r1.n = r0
            xyz.adscope.common.network.download.Download$Policy r0 = xyz.adscope.common.network.download.BodyDownload.Api.d(r2)
            if (r0 != 0) goto L27
            xyz.adscope.common.network.download.Download$Policy r2 = xyz.adscope.common.network.download.Download.Policy.DEFAULT
            goto L2b
        L27:
            xyz.adscope.common.network.download.Download$Policy r2 = xyz.adscope.common.network.download.BodyDownload.Api.d(r2)
        L2b:
            r1.o = r2
            return
    }

    /* synthetic */ BodyDownload(xyz.adscope.common.network.download.BodyDownload.Api r1, xyz.adscope.common.network.download.BodyDownload.AnonymousClass1 r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public static xyz.adscope.common.network.download.BodyDownload.Api newApi(xyz.adscope.common.network.Url r2, xyz.adscope.common.network.RequestMethod r3) {
            xyz.adscope.common.network.download.BodyDownload$Api r0 = new xyz.adscope.common.network.download.BodyDownload$Api
            r1 = 0
            r0.<init>(r2, r3, r1)
            return r0
    }

    @Override // xyz.adscope.common.network.download.Download
    public java.lang.String directory() {
            r1 = this;
            java.lang.String r0 = r1.l
            return r0
    }

    @Override // xyz.adscope.common.network.download.Download
    public java.lang.String fileName() {
            r1 = this;
            java.lang.String r0 = r1.m
            return r0
    }

    @Override // xyz.adscope.common.network.download.Download
    public xyz.adscope.common.network.download.Download.Policy policy() {
            r1 = this;
            xyz.adscope.common.network.download.Download$Policy r0 = r1.o
            return r0
    }

    @Override // xyz.adscope.common.network.download.Download
    public xyz.adscope.common.network.download.Download.ProgressBar progressBar() {
            r1 = this;
            xyz.adscope.common.network.download.Download$ProgressBar r0 = r1.n
            return r0
    }
}
