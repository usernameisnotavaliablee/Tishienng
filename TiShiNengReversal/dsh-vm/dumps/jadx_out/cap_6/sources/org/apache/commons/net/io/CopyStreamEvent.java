package org.apache.commons.net.io;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class CopyStreamEvent extends java.util.EventObject {
    public static final long UNKNOWN_STREAM_SIZE = -1;
    private static final long serialVersionUID = -964927635655051867L;
    private final int bytesTransferred;
    private final long streamSize;
    private final long totalBytesTransferred;

    public CopyStreamEvent(java.lang.Object r1, long r2, int r4, long r5) {
            r0 = this;
            r0.<init>(r1)
            r0.bytesTransferred = r4
            r0.totalBytesTransferred = r2
            r0.streamSize = r5
            return
    }

    public int getBytesTransferred() {
            r1 = this;
            int r0 = r1.bytesTransferred
            return r0
    }

    public long getStreamSize() {
            r2 = this;
            long r0 = r2.streamSize
            return r0
    }

    public long getTotalBytesTransferred() {
            r2 = this;
            long r0 = r2.totalBytesTransferred
            return r0
    }

    @Override // java.util.EventObject
    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r3.getClass()
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r1 = "[source="
            r0.append(r1)
            java.lang.Object r1 = r3.source
            r0.append(r1)
            java.lang.String r1 = ", total="
            r0.append(r1)
            long r1 = r3.totalBytesTransferred
            r0.append(r1)
            java.lang.String r1 = ", bytes="
            r0.append(r1)
            int r1 = r3.bytesTransferred
            r0.append(r1)
            java.lang.String r1 = ", size="
            r0.append(r1)
            long r1 = r3.streamSize
            r0.append(r1)
            java.lang.String r1 = "]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
