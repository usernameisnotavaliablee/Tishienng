package xyz.adscope.common.network.simple;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class ByteArrayBody implements xyz.adscope.common.network.ResponseBody {
    private java.lang.String a;
    private byte[] b;

    public ByteArrayBody(java.lang.String r1, byte[] r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    @Override // xyz.adscope.common.network.ResponseBody
    public byte[] byteArray() {
            r1 = this;
            byte[] r0 = r1.b
            return r0
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            r0 = 0
            r1.b = r0
            return
    }

    @Override // xyz.adscope.common.network.ResponseBody
    public java.io.InputStream stream() {
            r2 = this;
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream
            byte[] r1 = r2.b
            r0.<init>(r1)
            return r0
    }

    @Override // xyz.adscope.common.network.ResponseBody
    public java.lang.String string() {
            r3 = this;
            java.lang.String r0 = r3.a
            java.lang.String r1 = "charset"
            r2 = 0
            java.lang.String r0 = xyz.adscope.common.network.Headers.parseSubValue(r0, r1, r2)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L16
            byte[] r0 = r3.b
            java.lang.String r0 = xyz.adscope.common.network.util.IOUtils.toString(r0)
            return r0
        L16:
            byte[] r1 = r3.b
            java.lang.String r0 = xyz.adscope.common.network.util.IOUtils.toString(r1, r0)
            return r0
    }
}
