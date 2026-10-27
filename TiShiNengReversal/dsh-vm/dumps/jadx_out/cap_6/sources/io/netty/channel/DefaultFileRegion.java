package io.netty.channel;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class DefaultFileRegion extends io.netty.util.AbstractReferenceCounted implements io.netty.channel.FileRegion {
    private static final io.netty.util.internal.logging.InternalLogger logger = null;
    private final long count;
    private final java.io.File f;
    private java.nio.channels.FileChannel file;
    private final long position;
    private long transferred;

    static {
            java.lang.Class<io.netty.channel.DefaultFileRegion> r0 = io.netty.channel.DefaultFileRegion.class
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r0)
            io.netty.channel.DefaultFileRegion.logger = r0
            return
    }

    public DefaultFileRegion(java.io.File r2, long r3, long r5) {
            r1 = this;
            r1.<init>()
            if (r2 == 0) goto L16
            java.lang.String r0 = "position"
            io.netty.util.internal.ObjectUtil.checkPositiveOrZero(r3, r0)
            java.lang.String r0 = "count"
            io.netty.util.internal.ObjectUtil.checkPositiveOrZero(r5, r0)
            r1.position = r3
            r1.count = r5
            r1.f = r2
            return
        L16:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "f"
            r2.<init>(r3)
            throw r2
    }

    public DefaultFileRegion(java.nio.channels.FileChannel r2, long r3, long r5) {
            r1 = this;
            r1.<init>()
            if (r2 == 0) goto L19
            java.lang.String r0 = "position"
            io.netty.util.internal.ObjectUtil.checkPositiveOrZero(r3, r0)
            java.lang.String r0 = "count"
            io.netty.util.internal.ObjectUtil.checkPositiveOrZero(r5, r0)
            r1.file = r2
            r1.position = r3
            r1.count = r5
            r2 = 0
            r1.f = r2
            return
        L19:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "file"
            r2.<init>(r3)
            throw r2
    }

    static void validate(io.netty.channel.DefaultFileRegion r6, long r7) throws java.io.IOException {
            java.nio.channels.FileChannel r0 = r6.file
            long r0 = r0.size()
            long r2 = r6.count
            long r2 = r2 - r7
            long r4 = r6.position
            long r4 = r4 + r2
            long r4 = r4 + r7
            int r7 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r7 > 0) goto L12
            return
        L12:
            java.io.IOException r7 = new java.io.IOException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r2 = "Underlying file size "
            r8.append(r2)
            r8.append(r0)
            java.lang.String r0 = " smaller then requested count "
            r8.append(r0)
            long r0 = r6.count
            r8.append(r0)
            java.lang.String r6 = r8.toString()
            r7.<init>(r6)
            throw r7
    }

    @Override // io.netty.channel.FileRegion
    public long count() {
            r2 = this;
            long r0 = r2.count
            return r0
    }

    protected void deallocate() {
            r3 = this;
            java.nio.channels.FileChannel r0 = r3.file
            if (r0 != 0) goto L5
            goto L1c
        L5:
            r1 = 0
            r3.file = r1
            r0.close()     // Catch: java.io.IOException -> Lc
            return
        Lc:
            r0 = move-exception
            io.netty.util.internal.logging.InternalLogger r1 = io.netty.channel.DefaultFileRegion.logger
            boolean r1 = r1.isWarnEnabled()
            if (r1 == 0) goto L1c
            io.netty.util.internal.logging.InternalLogger r1 = io.netty.channel.DefaultFileRegion.logger
            java.lang.String r2 = "Failed to close a file."
            r1.warn(r2, r0)
        L1c:
            return
    }

    public boolean isOpen() {
            r1 = this;
            java.nio.channels.FileChannel r0 = r1.file
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public void open() throws java.io.IOException {
            r3 = this;
            boolean r0 = r3.isOpen()
            if (r0 != 0) goto L1b
            int r0 = r3.refCnt()
            if (r0 <= 0) goto L1b
            java.io.RandomAccessFile r0 = new java.io.RandomAccessFile
            java.io.File r1 = r3.f
            java.lang.String r2 = "r"
            r0.<init>(r1, r2)
            java.nio.channels.FileChannel r0 = r0.getChannel()
            r3.file = r0
        L1b:
            return
    }

    @Override // io.netty.channel.FileRegion
    public long position() {
            r2 = this;
            long r0 = r2.position
            return r0
    }

    @Override // io.netty.channel.FileRegion
    public io.netty.channel.FileRegion retain() {
            r0 = this;
            super.retain()
            return r0
    }

    @Override // io.netty.channel.FileRegion
    public io.netty.channel.FileRegion retain(int r1) {
            r0 = this;
            super.retain(r1)
            return r0
    }

    /* renamed from: retain, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted m97retain() {
            r1 = this;
            io.netty.channel.FileRegion r0 = r1.retain()
            return r0
    }

    /* renamed from: retain, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted m98retain(int r1) {
            r0 = this;
            io.netty.channel.FileRegion r1 = r0.retain(r1)
            return r1
    }

    @Override // io.netty.channel.FileRegion
    public io.netty.channel.FileRegion touch() {
            r0 = this;
            return r0
    }

    @Override // io.netty.channel.FileRegion
    public io.netty.channel.FileRegion touch(java.lang.Object r1) {
            r0 = this;
            return r0
    }

    /* renamed from: touch, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted m99touch() {
            r1 = this;
            io.netty.channel.FileRegion r0 = r1.touch()
            return r0
    }

    /* renamed from: touch, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted m100touch(java.lang.Object r1) {
            r0 = this;
            io.netty.channel.FileRegion r1 = r0.touch(r1)
            return r1
    }

    @Override // io.netty.channel.FileRegion
    public long transferTo(java.nio.channels.WritableByteChannel r9, long r10) throws java.io.IOException {
            r8 = this;
            long r0 = r8.count
            long r5 = r0 - r10
            r0 = 0
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 < 0) goto L3b
            int r3 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r3 < 0) goto L3b
            if (r2 != 0) goto L11
            return r0
        L11:
            int r2 = r8.refCnt()
            if (r2 == 0) goto L34
            r8.open()
            java.nio.channels.FileChannel r2 = r8.file
            long r3 = r8.position
            long r3 = r3 + r10
            r7 = r9
            long r2 = r2.transferTo(r3, r5, r7)
            int r9 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r9 <= 0) goto L2e
            long r9 = r8.transferred
            long r9 = r9 + r2
            r8.transferred = r9
            return r2
        L2e:
            if (r9 != 0) goto L33
            validate(r8, r10)
        L33:
            return r2
        L34:
            io.netty.util.IllegalReferenceCountException r9 = new io.netty.util.IllegalReferenceCountException
            r10 = 0
            r9.<init>(r10)
            throw r9
        L3b:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "position out of range: "
            r0.append(r1)
            r0.append(r10)
            java.lang.String r10 = " (expected: 0 - "
            r0.append(r10)
            long r10 = r8.count
            r1 = 1
            long r10 = r10 - r1
            r0.append(r10)
            r10 = 41
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            r9.<init>(r10)
            throw r9
    }

    @Override // io.netty.channel.FileRegion
    @java.lang.Deprecated
    public long transfered() {
            r2 = this;
            long r0 = r2.transferred
            return r0
    }

    @Override // io.netty.channel.FileRegion
    public long transferred() {
            r2 = this;
            long r0 = r2.transferred
            return r0
    }
}
