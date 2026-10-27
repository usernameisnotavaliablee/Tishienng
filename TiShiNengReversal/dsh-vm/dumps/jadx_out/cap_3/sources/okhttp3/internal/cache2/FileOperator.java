package okhttp3.internal.cache2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class FileOperator {

    @org.jetbrains.annotations.NotNull
    private final java.nio.channels.FileChannel fileChannel;

    public FileOperator(@org.jetbrains.annotations.NotNull java.nio.channels.FileChannel r2) {
            r1 = this;
            java.lang.String r0 = "fileChannel"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.fileChannel = r2
            return
    }

    public final void read(long r10, @org.jetbrains.annotations.NotNull okio.Buffer r12, long r13) {
            r9 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.g0.p(r12, r0)
            r0 = 0
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 < 0) goto L1c
            r4 = r10
            r6 = r13
        Ld:
            int r10 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r10 <= 0) goto L1b
            java.nio.channels.FileChannel r3 = r9.fileChannel
            r8 = r12
            long r10 = r3.transferTo(r4, r6, r8)
            long r4 = r4 + r10
            long r6 = r6 - r10
            goto Ld
        L1b:
            return
        L1c:
            java.lang.IndexOutOfBoundsException r10 = new java.lang.IndexOutOfBoundsException
            r10.<init>()
            throw r10
    }

    public final void write(long r12, @org.jetbrains.annotations.NotNull okio.Buffer r14, long r15) throws java.io.IOException {
            r11 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.g0.p(r14, r0)
            r0 = 0
            int r2 = (r15 > r0 ? 1 : (r15 == r0 ? 0 : -1))
            if (r2 < 0) goto L24
            long r2 = r14.size()
            int r4 = (r15 > r2 ? 1 : (r15 == r2 ? 0 : -1))
            if (r4 > 0) goto L24
            r7 = r12
            r9 = r15
        L15:
            int r12 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r12 <= 0) goto L23
            java.nio.channels.FileChannel r5 = r11.fileChannel
            r6 = r14
            long r12 = r5.transferFrom(r6, r7, r9)
            long r7 = r7 + r12
            long r9 = r9 - r12
            goto L15
        L23:
            return
        L24:
            java.lang.IndexOutOfBoundsException r12 = new java.lang.IndexOutOfBoundsException
            r12.<init>()
            throw r12
    }
}
