package io.netty.channel;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class WriteBufferWaterMark {
    public static final io.netty.channel.WriteBufferWaterMark DEFAULT = null;
    private static final int DEFAULT_HIGH_WATER_MARK = 65536;
    private static final int DEFAULT_LOW_WATER_MARK = 32768;
    private final int high;
    private final int low;

    static {
            io.netty.channel.WriteBufferWaterMark r0 = new io.netty.channel.WriteBufferWaterMark
            r1 = 65536(0x10000, float:9.1835E-41)
            r2 = 0
            r3 = 32768(0x8000, float:4.5918E-41)
            r0.<init>(r3, r1, r2)
            io.netty.channel.WriteBufferWaterMark.DEFAULT = r0
            return
    }

    public WriteBufferWaterMark(int r2, int r3) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r3, r0)
            return
    }

    WriteBufferWaterMark(int r3, int r4, boolean r5) {
            r2 = this;
            r2.<init>()
            if (r5 == 0) goto L2c
            java.lang.String r5 = "low"
            io.netty.util.internal.ObjectUtil.checkPositiveOrZero(r3, r5)
            if (r4 < r3) goto Ld
            goto L2c
        Ld:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "write buffer's high water mark cannot be less than  low water mark ("
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = "): "
            r0.append(r3)
            r0.append(r4)
            java.lang.String r3 = r0.toString()
            r5.<init>(r3)
            throw r5
        L2c:
            r2.low = r3
            r2.high = r4
            return
    }

    public int high() {
            r1 = this;
            int r0 = r1.high
            return r0
    }

    public int low() {
            r1 = this;
            int r0 = r1.low
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 55
            r0.<init>(r1)
            java.lang.String r1 = "WriteBufferWaterMark(low: "
            r0.append(r1)
            int r1 = r2.low
            r0.append(r1)
            java.lang.String r1 = ", high: "
            r0.append(r1)
            int r1 = r2.high
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
