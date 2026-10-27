package pl.droidsonroids.gif;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class GifAnimationMetaData implements java.io.Serializable, android.os.Parcelable {
    public static final android.os.Parcelable.Creator<pl.droidsonroids.gif.GifAnimationMetaData> CREATOR = null;
    private static final long serialVersionUID = 5692363926580237325L;
    private final int mDuration;
    private final int mHeight;
    private final int mImageCount;
    private final int mLoopCount;
    private final long mMetadataBytesCount;
    private final long mPixelsBytesCount;
    private final int mWidth;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a implements android.os.Parcelable.Creator<pl.droidsonroids.gif.GifAnimationMetaData> {
        a() {
                r0 = this;
                r0.<init>()
                return
        }

        public pl.droidsonroids.gif.GifAnimationMetaData a(android.os.Parcel r3) {
                r2 = this;
                pl.droidsonroids.gif.GifAnimationMetaData r0 = new pl.droidsonroids.gif.GifAnimationMetaData
                r1 = 0
                r0.<init>(r3, r1)
                return r0
        }

        public pl.droidsonroids.gif.GifAnimationMetaData[] b(int r1) {
                r0 = this;
                pl.droidsonroids.gif.GifAnimationMetaData[] r1 = new pl.droidsonroids.gif.GifAnimationMetaData[r1]
                return r1
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ pl.droidsonroids.gif.GifAnimationMetaData createFromParcel(android.os.Parcel r1) {
                r0 = this;
                pl.droidsonroids.gif.GifAnimationMetaData r1 = r0.a(r1)
                return r1
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ pl.droidsonroids.gif.GifAnimationMetaData[] newArray(int r1) {
                r0 = this;
                pl.droidsonroids.gif.GifAnimationMetaData[] r1 = r0.b(r1)
                return r1
        }
    }

    static {
            pl.droidsonroids.gif.GifAnimationMetaData$a r0 = new pl.droidsonroids.gif.GifAnimationMetaData$a
            r0.<init>()
            pl.droidsonroids.gif.GifAnimationMetaData.CREATOR = r0
            return
    }

    public GifAnimationMetaData(@androidx.annotation.Nullable android.content.ContentResolver r1, @androidx.annotation.NonNull android.net.Uri r2) throws java.io.IOException {
            r0 = this;
            pl.droidsonroids.gif.GifInfoHandle r1 = pl.droidsonroids.gif.GifInfoHandle.y(r1, r2)
            r0.<init>(r1)
            return
    }

    public GifAnimationMetaData(@androidx.annotation.NonNull android.content.res.AssetFileDescriptor r2) throws java.io.IOException {
            r1 = this;
            pl.droidsonroids.gif.GifInfoHandle r0 = new pl.droidsonroids.gif.GifInfoHandle
            r0.<init>(r2)
            r1.<init>(r0)
            return
    }

    public GifAnimationMetaData(@androidx.annotation.NonNull android.content.res.AssetManager r1, @androidx.annotation.NonNull java.lang.String r2) throws java.io.IOException {
            r0 = this;
            android.content.res.AssetFileDescriptor r1 = r1.openFd(r2)
            r0.<init>(r1)
            return
    }

    public GifAnimationMetaData(@androidx.annotation.NonNull android.content.res.Resources r1, @androidx.annotation.DrawableRes @androidx.annotation.RawRes int r2) throws android.content.res.Resources.NotFoundException, java.io.IOException {
            r0 = this;
            android.content.res.AssetFileDescriptor r1 = r1.openRawResourceFd(r2)
            r0.<init>(r1)
            return
    }

    private GifAnimationMetaData(android.os.Parcel r3) {
            r2 = this;
            r2.<init>()
            int r0 = r3.readInt()
            r2.mLoopCount = r0
            int r0 = r3.readInt()
            r2.mDuration = r0
            int r0 = r3.readInt()
            r2.mHeight = r0
            int r0 = r3.readInt()
            r2.mWidth = r0
            int r0 = r3.readInt()
            r2.mImageCount = r0
            long r0 = r3.readLong()
            r2.mMetadataBytesCount = r0
            long r0 = r3.readLong()
            r2.mPixelsBytesCount = r0
            return
    }

    /* synthetic */ GifAnimationMetaData(android.os.Parcel r1, pl.droidsonroids.gif.GifAnimationMetaData.a r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public GifAnimationMetaData(@androidx.annotation.NonNull java.io.File r1) throws java.io.IOException {
            r0 = this;
            java.lang.String r1 = r1.getPath()
            r0.<init>(r1)
            return
    }

    public GifAnimationMetaData(@androidx.annotation.NonNull java.io.FileDescriptor r2) throws java.io.IOException {
            r1 = this;
            pl.droidsonroids.gif.GifInfoHandle r0 = new pl.droidsonroids.gif.GifInfoHandle
            r0.<init>(r2)
            r1.<init>(r0)
            return
    }

    public GifAnimationMetaData(@androidx.annotation.NonNull java.io.InputStream r2) throws java.io.IOException {
            r1 = this;
            pl.droidsonroids.gif.GifInfoHandle r0 = new pl.droidsonroids.gif.GifInfoHandle
            r0.<init>(r2)
            r1.<init>(r0)
            return
    }

    public GifAnimationMetaData(@androidx.annotation.NonNull java.lang.String r2) throws java.io.IOException {
            r1 = this;
            pl.droidsonroids.gif.GifInfoHandle r0 = new pl.droidsonroids.gif.GifInfoHandle
            r0.<init>(r2)
            r1.<init>(r0)
            return
    }

    public GifAnimationMetaData(@androidx.annotation.NonNull java.nio.ByteBuffer r2) throws java.io.IOException {
            r1 = this;
            pl.droidsonroids.gif.GifInfoHandle r0 = new pl.droidsonroids.gif.GifInfoHandle
            r0.<init>(r2)
            r1.<init>(r0)
            return
    }

    private GifAnimationMetaData(pl.droidsonroids.gif.GifInfoHandle r3) {
            r2 = this;
            r2.<init>()
            int r0 = r3.j()
            r2.mLoopCount = r0
            int r0 = r3.g()
            r2.mDuration = r0
            int r0 = r3.q()
            r2.mWidth = r0
            int r0 = r3.i()
            r2.mHeight = r0
            int r0 = r3.n()
            r2.mImageCount = r0
            long r0 = r3.k()
            r2.mMetadataBytesCount = r0
            long r0 = r3.b()
            r2.mPixelsBytesCount = r0
            r3.A()
            return
    }

    public GifAnimationMetaData(@androidx.annotation.NonNull byte[] r2) throws java.io.IOException {
            r1 = this;
            pl.droidsonroids.gif.GifInfoHandle r0 = new pl.droidsonroids.gif.GifInfoHandle
            r0.<init>(r2)
            r1.<init>(r0)
            return
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public long getAllocationByteCount() {
            r2 = this;
            long r0 = r2.mPixelsBytesCount
            return r0
    }

    @pl.droidsonroids.gif.annotations.Beta
    public long getDrawableAllocationByteCount(@androidx.annotation.Nullable pl.droidsonroids.gif.e r5, @androidx.annotation.IntRange(from = 1, to = 65535) int r6) {
            r4 = this;
            r0 = 1
            r1 = 65535(0xffff, float:9.1834E-41)
            if (r6 < r0) goto L2c
            if (r6 > r1) goto L2c
            int r6 = r6 * r6
            if (r5 == 0) goto L1c
            android.graphics.Bitmap r0 = r5.f
            boolean r0 = r0.isRecycled()
            if (r0 != 0) goto L1c
            android.graphics.Bitmap r5 = r5.f
            int r5 = r5.getAllocationByteCount()
        L1a:
            long r0 = (long) r5
            goto L26
        L1c:
            int r5 = r4.mWidth
            int r0 = r4.mHeight
            int r5 = r5 * r0
            int r5 = r5 * 4
            int r5 = r5 / r6
            goto L1a
        L26:
            long r2 = r4.mPixelsBytesCount
            long r5 = (long) r6
            long r2 = r2 / r5
            long r2 = r2 + r0
            return r2
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Sample size "
            r0.append(r2)
            r0.append(r6)
            java.lang.String r6 = " out of range <1, "
            r0.append(r6)
            r0.append(r1)
            java.lang.String r6 = ">"
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r5.<init>(r6)
            throw r5
    }

    public int getDuration() {
            r1 = this;
            int r0 = r1.mDuration
            return r0
    }

    public int getHeight() {
            r1 = this;
            int r0 = r1.mHeight
            return r0
    }

    public int getLoopCount() {
            r1 = this;
            int r0 = r1.mLoopCount
            return r0
    }

    public long getMetadataAllocationByteCount() {
            r2 = this;
            long r0 = r2.mMetadataBytesCount
            return r0
    }

    public int getNumberOfFrames() {
            r1 = this;
            int r0 = r1.mImageCount
            return r0
    }

    public int getWidth() {
            r1 = this;
            int r0 = r1.mWidth
            return r0
    }

    public boolean isAnimated() {
            r2 = this;
            int r0 = r2.mImageCount
            r1 = 1
            if (r0 <= r1) goto La
            int r0 = r2.mDuration
            if (r0 <= 0) goto La
            return r1
        La:
            r0 = 0
            return r0
    }

    @androidx.annotation.NonNull
    public java.lang.String toString() {
            r8 = this;
            int r0 = r8.mLoopCount
            if (r0 != 0) goto L7
            java.lang.String r0 = "Infinity"
            goto Lb
        L7:
            java.lang.String r0 = java.lang.Integer.toString(r0)
        Lb:
            java.util.Locale r1 = java.util.Locale.ENGLISH
            int r2 = r8.mWidth
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r3 = r8.mHeight
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r4 = r8.mImageCount
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            int r5 = r8.mDuration
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6 = 5
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r7 = 0
            r6[r7] = r2
            r2 = 1
            r6[r2] = r3
            r2 = 2
            r6[r2] = r4
            r2 = 3
            r6[r2] = r0
            r0 = 4
            r6[r0] = r5
            java.lang.String r0 = "GIF: size: %dx%d, frames: %d, loops: %s, duration: %d"
            java.lang.String r0 = java.lang.String.format(r1, r0, r6)
            boolean r1 = r8.isAnimated()
            if (r1 == 0) goto L54
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Animated "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L54:
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r3, int r4) {
            r2 = this;
            int r4 = r2.mLoopCount
            r3.writeInt(r4)
            int r4 = r2.mDuration
            r3.writeInt(r4)
            int r4 = r2.mHeight
            r3.writeInt(r4)
            int r4 = r2.mWidth
            r3.writeInt(r4)
            int r4 = r2.mImageCount
            r3.writeInt(r4)
            long r0 = r2.mMetadataBytesCount
            r3.writeLong(r0)
            long r0 = r2.mPixelsBytesCount
            r3.writeLong(r0)
            return
    }
}
