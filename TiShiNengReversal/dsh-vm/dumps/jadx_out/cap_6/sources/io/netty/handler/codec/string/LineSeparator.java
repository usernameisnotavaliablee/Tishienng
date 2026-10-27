package io.netty.handler.codec.string;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class LineSeparator {
    public static final io.netty.handler.codec.string.LineSeparator DEFAULT = null;
    public static final io.netty.handler.codec.string.LineSeparator UNIX = null;
    public static final io.netty.handler.codec.string.LineSeparator WINDOWS = null;
    private final java.lang.String value;

    static {
            io.netty.handler.codec.string.LineSeparator r0 = new io.netty.handler.codec.string.LineSeparator
            java.lang.String r1 = io.netty.util.internal.StringUtil.NEWLINE
            r0.<init>(r1)
            io.netty.handler.codec.string.LineSeparator.DEFAULT = r0
            io.netty.handler.codec.string.LineSeparator r0 = new io.netty.handler.codec.string.LineSeparator
            java.lang.String r1 = "\n"
            r0.<init>(r1)
            io.netty.handler.codec.string.LineSeparator.UNIX = r0
            io.netty.handler.codec.string.LineSeparator r0 = new io.netty.handler.codec.string.LineSeparator
            java.lang.String r1 = "\r\n"
            r0.<init>(r1)
            io.netty.handler.codec.string.LineSeparator.WINDOWS = r0
            return
    }

    public LineSeparator(java.lang.String r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "lineSeparator"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            java.lang.String r2 = (java.lang.String) r2
            r1.value = r2
            return
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof io.netty.handler.codec.string.LineSeparator
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            io.netty.handler.codec.string.LineSeparator r4 = (io.netty.handler.codec.string.LineSeparator) r4
            java.lang.String r1 = r3.value
            java.lang.String r4 = r4.value
            if (r1 == 0) goto L17
            boolean r4 = r1.equals(r4)
            return r4
        L17:
            if (r4 != 0) goto L1a
            return r0
        L1a:
            return r2
    }

    public int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.value
            if (r0 == 0) goto L9
            int r0 = r0.hashCode()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = r2.value
            java.nio.charset.Charset r1 = io.netty.util.CharsetUtil.UTF_8
            byte[] r0 = r0.getBytes(r1)
            java.lang.String r0 = io.netty.buffer.ByteBufUtil.hexDump(r0)
            return r0
    }

    public java.lang.String value() {
            r1 = this;
            java.lang.String r0 = r1.value
            return r0
    }
}
