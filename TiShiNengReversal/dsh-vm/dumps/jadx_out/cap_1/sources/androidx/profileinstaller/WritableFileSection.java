package androidx.profileinstaller;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class WritableFileSection {
    final byte[] mContents;
    final int mExpectedInflateSize;
    final boolean mNeedsCompression;
    final androidx.profileinstaller.FileSectionType mType;

    WritableFileSection(@androidx.annotation.NonNull androidx.profileinstaller.FileSectionType r1, int r2, @androidx.annotation.NonNull byte[] r3, boolean r4) {
            r0 = this;
            r0.<init>()
            r0.mType = r1
            r0.mExpectedInflateSize = r2
            r0.mContents = r3
            r0.mNeedsCompression = r4
            return
    }
}
