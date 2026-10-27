package xyz.adscope.common.network.exception;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class DownloadError extends xyz.adscope.common.network.exception.ReadException {
    private int a;
    private xyz.adscope.common.network.Headers b;

    public DownloadError(int r1, xyz.adscope.common.network.Headers r2, java.lang.String r3) {
            r0 = this;
            r0.<init>(r3)
            r0.a = r1
            r0.b = r2
            return
    }

    public DownloadError(int r1, xyz.adscope.common.network.Headers r2, java.lang.Throwable r3) {
            r0 = this;
            r0.<init>(r3)
            r0.a = r1
            r0.b = r2
            return
    }

    public int getCode() {
            r1 = this;
            int r0 = r1.a
            return r0
    }

    public xyz.adscope.common.network.Headers getHeaders() {
            r1 = this;
            xyz.adscope.common.network.Headers r0 = r1.b
            return r0
    }
}
