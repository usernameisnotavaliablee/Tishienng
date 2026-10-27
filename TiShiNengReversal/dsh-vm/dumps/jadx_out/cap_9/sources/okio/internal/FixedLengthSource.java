package okio.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class FixedLengthSource extends okio.ForwardingSource {
    private long bytesReceived;
    private final long size;
    private final boolean truncate;

    public FixedLengthSource(@org.jetbrains.annotations.NotNull okio.Source r2, long r3, boolean r5) {
            r1 = this;
            java.lang.String r0 = "delegate"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>(r2)
            r1.size = r3
            r1.truncate = r5
            return
    }

    private final void truncateToSize(okio.Buffer r2, long r3) {
            r1 = this;
            okio.Buffer r0 = new okio.Buffer
            r0.<init>()
            r0.writeAll(r2)
            r2.write(r0, r3)
            r0.clear()
            return
    }

    @Override // okio.ForwardingSource, okio.Source
    public long read(@org.jetbrains.annotations.NotNull okio.Buffer r10, long r11) {
            r9 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.g0.p(r10, r0)
            long r0 = r9.bytesReceived
            long r2 = r9.size
            r4 = -1
            r6 = 0
            int r8 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r8 <= 0) goto L13
            r11 = r6
            goto L21
        L13:
            boolean r8 = r9.truncate
            if (r8 == 0) goto L21
            long r2 = r2 - r0
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 != 0) goto L1d
            return r4
        L1d:
            long r11 = java.lang.Math.min(r11, r2)
        L21:
            long r11 = super.read(r10, r11)
            int r0 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r0 == 0) goto L2e
            long r1 = r9.bytesReceived
            long r1 = r1 + r11
            r9.bytesReceived = r1
        L2e:
            long r1 = r9.bytesReceived
            long r3 = r9.size
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L38
            if (r0 == 0) goto L3c
        L38:
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L74
        L3c:
            int r0 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r0 <= 0) goto L51
            int r11 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r11 <= 0) goto L51
            long r11 = r10.size()
            long r0 = r9.bytesReceived
            long r2 = r9.size
            long r0 = r0 - r2
            long r11 = r11 - r0
            r9.truncateToSize(r10, r11)
        L51:
            java.io.IOException r10 = new java.io.IOException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "expected "
            r11.append(r12)
            long r0 = r9.size
            r11.append(r0)
            java.lang.String r12 = " bytes but got "
            r11.append(r12)
            long r0 = r9.bytesReceived
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        L74:
            return r11
    }
}
