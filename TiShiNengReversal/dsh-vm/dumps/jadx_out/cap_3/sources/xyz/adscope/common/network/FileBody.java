package xyz.adscope.common.network;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class FileBody extends xyz.adscope.common.network.BaseContent<xyz.adscope.common.network.FileBody> implements xyz.adscope.common.network.RequestBody {
    private final java.io.File b;

    public FileBody(java.io.File r1) {
            r0 = this;
            r0.<init>()
            r0.b = r1
            return
    }

    @Override // xyz.adscope.common.network.BaseContent
    protected void a(java.io.OutputStream r3) {
            r2 = this;
            java.io.FileInputStream r0 = new java.io.FileInputStream
            java.io.File r1 = r2.b
            r0.<init>(r1)
            xyz.adscope.common.network.util.IOUtils.write(r0, r3)
            xyz.adscope.common.network.util.IOUtils.closeQuietly(r0)
            return
    }

    @Override // xyz.adscope.common.network.Content
    public long contentLength() {
            r2 = this;
            java.io.File r0 = r2.b
            long r0 = r0.length()
            return r0
    }

    @Override // xyz.adscope.common.network.Content
    public java.lang.String contentType() {
            r2 = this;
            java.io.File r0 = r2.b
            java.lang.String r0 = r0.getName()
            java.lang.String r0 = android.webkit.MimeTypeMap.getFileExtensionFromUrl(r0)
            android.webkit.MimeTypeMap r1 = android.webkit.MimeTypeMap.getSingleton()
            java.lang.String r0 = r1.getMimeTypeFromExtension(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L1a
            java.lang.String r0 = "application/octet-stream"
        L1a:
            return r0
    }
}
