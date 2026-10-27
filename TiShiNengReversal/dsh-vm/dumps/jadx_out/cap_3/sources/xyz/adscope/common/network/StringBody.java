package xyz.adscope.common.network;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class StringBody extends xyz.adscope.common.network.BaseContent<xyz.adscope.common.network.StringBody> implements xyz.adscope.common.network.RequestBody {
    private final java.lang.String b;
    private final java.nio.charset.Charset c;
    private final java.lang.String d;

    public StringBody(java.lang.String r2) {
            r1 = this;
            xyz.adscope.common.network.KalleConfig r0 = xyz.adscope.common.network.Kalle.getConfig()
            java.nio.charset.Charset r0 = r0.getCharset()
            r1.<init>(r2, r0)
            return
    }

    public StringBody(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            xyz.adscope.common.network.KalleConfig r0 = xyz.adscope.common.network.Kalle.getConfig()
            java.nio.charset.Charset r0 = r0.getCharset()
            r1.<init>(r2, r0, r3)
            return
    }

    public StringBody(java.lang.String r2, java.nio.charset.Charset r3) {
            r1 = this;
            java.lang.String r0 = "application/octet-stream"
            r1.<init>(r2, r3, r0)
            return
    }

    public StringBody(java.lang.String r1, java.nio.charset.Charset r2, java.lang.String r3) {
            r0 = this;
            r0.<init>()
            r0.b = r1
            r0.c = r2
            r0.d = r3
            return
    }

    @Override // xyz.adscope.common.network.BaseContent
    protected void a(java.io.OutputStream r3) {
            r2 = this;
            java.lang.String r0 = r2.b
            java.nio.charset.Charset r1 = r2.c
            xyz.adscope.common.network.util.IOUtils.write(r3, r0, r1)
            return
    }

    @Override // xyz.adscope.common.network.Content
    public long contentLength() {
            r2 = this;
            java.lang.String r0 = r2.b
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto Lb
            r0 = 0
            return r0
        Lb:
            java.lang.String r0 = r2.b
            java.nio.charset.Charset r1 = r2.c
            byte[] r0 = xyz.adscope.common.network.util.IOUtils.toByteArray(r0, r1)
            int r0 = r0.length
            long r0 = (long) r0
            return r0
    }

    @Override // xyz.adscope.common.network.Content
    public java.lang.String contentType() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.d
            r0.append(r1)
            java.lang.String r1 = "; charset="
            r0.append(r1)
            java.nio.charset.Charset r1 = r2.c
            java.lang.String r1 = r1.name()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.b
            return r0
    }
}
