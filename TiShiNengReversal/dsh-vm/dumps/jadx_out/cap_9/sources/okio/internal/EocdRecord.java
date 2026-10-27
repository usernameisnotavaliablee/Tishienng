package okio.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class EocdRecord {
    private final long centralDirectoryOffset;
    private final int commentByteCount;
    private final long entryCount;

    public EocdRecord(long r1, long r3, int r5) {
            r0 = this;
            r0.<init>()
            r0.entryCount = r1
            r0.centralDirectoryOffset = r3
            r0.commentByteCount = r5
            return
    }

    public final long getCentralDirectoryOffset() {
            r2 = this;
            long r0 = r2.centralDirectoryOffset
            return r0
    }

    public final int getCommentByteCount() {
            r1 = this;
            int r0 = r1.commentByteCount
            return r0
    }

    public final long getEntryCount() {
            r2 = this;
            long r0 = r2.entryCount
            return r0
    }
}
