package xyz.adscope.common.network.simple.cache;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class Cache implements java.io.Serializable {
    private java.lang.String a;
    private int b;
    private xyz.adscope.common.network.Headers c;
    private byte[] d;
    private long e;

    public Cache() {
            r0 = this;
            r0.<init>()
            return
    }

    public byte[] getBody() {
            r1 = this;
            byte[] r0 = r1.d
            return r0
    }

    public int getCode() {
            r1 = this;
            int r0 = r1.b
            return r0
    }

    public long getExpires() {
            r2 = this;
            long r0 = r2.e
            return r0
    }

    public xyz.adscope.common.network.Headers getHeaders() {
            r1 = this;
            xyz.adscope.common.network.Headers r0 = r1.c
            return r0
    }

    public java.lang.String getKey() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    public void setBody(byte[] r1) {
            r0 = this;
            r0.d = r1
            return
    }

    public void setCode(int r1) {
            r0 = this;
            r0.b = r1
            return
    }

    public void setExpires(long r1) {
            r0 = this;
            r0.e = r1
            return
    }

    public void setHeaders(xyz.adscope.common.network.Headers r1) {
            r0 = this;
            r0.c = r1
            return
    }

    public void setKey(java.lang.String r1) {
            r0 = this;
            r0.a = r1
            return
    }
}
