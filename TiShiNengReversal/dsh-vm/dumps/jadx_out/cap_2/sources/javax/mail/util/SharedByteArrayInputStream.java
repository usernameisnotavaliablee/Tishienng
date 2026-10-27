package javax.mail.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class SharedByteArrayInputStream extends java.io.ByteArrayInputStream implements javax.mail.internet.SharedInputStream {
    protected int start;

    public SharedByteArrayInputStream(byte[] r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0.start = r1
            return
    }

    public SharedByteArrayInputStream(byte[] r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r0.start = r2
            return
    }

    @Override // javax.mail.internet.SharedInputStream
    public long getPosition() {
            r2 = this;
            int r0 = r2.pos
            int r1 = r2.start
            int r0 = r0 - r1
            long r0 = (long) r0
            return r0
    }

    @Override // javax.mail.internet.SharedInputStream
    public java.io.InputStream newStream(long r5, long r7) {
            r4 = this;
            r0 = 0
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 < 0) goto L20
            r0 = -1
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 != 0) goto L12
            int r7 = r4.count
            int r8 = r4.start
            int r7 = r7 - r8
            long r7 = (long) r7
        L12:
            javax.mail.util.SharedByteArrayInputStream r0 = new javax.mail.util.SharedByteArrayInputStream
            byte[] r1 = r4.buf
            int r2 = r4.start
            int r3 = (int) r5
            int r2 = r2 + r3
            long r7 = r7 - r5
            int r5 = (int) r7
            r0.<init>(r1, r2, r5)
            return r0
        L20:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "start < 0"
            r5.<init>(r6)
            throw r5
    }
}
