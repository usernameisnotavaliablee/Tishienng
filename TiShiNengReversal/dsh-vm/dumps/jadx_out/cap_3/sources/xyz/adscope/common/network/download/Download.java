package xyz.adscope.common.network.download;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public interface Download {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface Policy {
        public static final xyz.adscope.common.network.download.Download.Policy DEFAULT = null;


        static {
                xyz.adscope.common.network.download.Download$Policy$1 r0 = new xyz.adscope.common.network.download.Download$Policy$1
                r0.<init>()
                xyz.adscope.common.network.download.Download.Policy.DEFAULT = r0
                return
        }

        boolean allowDownload(int r1, xyz.adscope.common.network.Headers r2);

        boolean isRange();

        boolean oldAvailable(java.lang.String r1, int r2, xyz.adscope.common.network.Headers r3);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface ProgressBar {
        public static final xyz.adscope.common.network.download.Download.ProgressBar DEFAULT = null;


        static {
                xyz.adscope.common.network.download.Download$ProgressBar$1 r0 = new xyz.adscope.common.network.download.Download$ProgressBar$1
                r0.<init>()
                xyz.adscope.common.network.download.Download.ProgressBar.DEFAULT = r0
                return
        }

        void onProgress(int r1, long r2, long r4);
    }

    java.lang.String directory();

    java.lang.String fileName();

    xyz.adscope.common.network.Headers headers();

    xyz.adscope.common.network.download.Download.Policy policy();

    xyz.adscope.common.network.download.Download.ProgressBar progressBar();

    xyz.adscope.common.network.Url url();
}
