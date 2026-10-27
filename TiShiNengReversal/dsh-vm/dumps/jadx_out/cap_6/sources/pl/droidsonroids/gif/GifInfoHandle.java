package pl.droidsonroids.gif;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class GifInfoHandle {
    private volatile long a;

    static {
            pl.droidsonroids.gif.n.b()
            return
    }

    GifInfoHandle() {
            r0 = this;
            r0.<init>()
            return
    }

    GifInfoHandle(android.content.res.AssetFileDescriptor r5) throws java.io.IOException {
            r4 = this;
            r4.<init>()
            java.io.FileDescriptor r0 = r5.getFileDescriptor()     // Catch: java.lang.Throwable -> L16
            long r1 = r5.getStartOffset()     // Catch: java.lang.Throwable -> L16
            r3 = 0
            long r0 = x(r0, r1, r3)     // Catch: java.lang.Throwable -> L16
            r4.a = r0     // Catch: java.lang.Throwable -> L16
            r5.close()     // Catch: java.io.IOException -> L15
        L15:
            return
        L16:
            r0 = move-exception
            r5.close()     // Catch: java.io.IOException -> L1a
        L1a:
            throw r0
    }

    GifInfoHandle(java.io.FileDescriptor r4) throws pl.droidsonroids.gif.GifIOException {
            r3 = this;
            r3.<init>()
            r0 = 0
            r2 = 1
            long r0 = x(r4, r0, r2)
            r3.a = r0
            return
    }

    GifInfoHandle(java.io.InputStream r3) throws pl.droidsonroids.gif.GifIOException {
            r2 = this;
            r2.<init>()
            boolean r0 = r3.markSupported()
            if (r0 == 0) goto L10
            long r0 = openStream(r3)
            r2.a = r0
            return
        L10:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "InputStream does not support marking"
            r3.<init>(r0)
            throw r3
    }

    GifInfoHandle(java.lang.String r3) throws pl.droidsonroids.gif.GifIOException {
            r2 = this;
            r2.<init>()
            long r0 = openFile(r3)
            r2.a = r0
            return
    }

    GifInfoHandle(java.nio.ByteBuffer r3) throws pl.droidsonroids.gif.GifIOException {
            r2 = this;
            r2.<init>()
            long r0 = openDirectByteBuffer(r3)
            r2.a = r0
            return
    }

    GifInfoHandle(byte[] r3) throws pl.droidsonroids.gif.GifIOException {
            r2 = this;
            r2.<init>()
            long r0 = openByteArray(r3)
            r2.a = r0
            return
    }

    private void O(@androidx.annotation.IntRange(from = 0) int r4) {
            r3 = this;
            long r0 = r3.a
            int r0 = getNumberOfFrames(r0)
            if (r4 < 0) goto Lb
            if (r4 >= r0) goto Lb
            return
        Lb:
            java.lang.IndexOutOfBoundsException r4 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Frame index is not in range <0;"
            r1.append(r2)
            r1.append(r0)
            r0 = 62
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r4.<init>(r0)
            throw r4
    }

    private static native void bindSurface(long r0, android.view.Surface r2, long[] r3);

    static native int createTempNativeFileDescriptor() throws pl.droidsonroids.gif.GifIOException;

    static native int extractNativeFileDescriptor(java.io.FileDescriptor r0, boolean r1) throws pl.droidsonroids.gif.GifIOException;

    private static native void free(long r0);

    private static native long getAllocationByteCount(long r0);

    private static native java.lang.String getComment(long r0);

    private static native int getCurrentFrameIndex(long r0);

    private static native int getCurrentLoop(long r0);

    private static native int getCurrentPosition(long r0);

    private static native int getDuration(long r0);

    private static native int getFrameDuration(long r0, int r2);

    private static native int getHeight(long r0);

    private static native int getLoopCount(long r0);

    private static native long getMetadataByteCount(long r0);

    private static native int getNativeErrorCode(long r0);

    private static native int getNumberOfFrames(long r0);

    private static native long[] getSavedState(long r0);

    private static native long getSourceLength(long r0);

    private static native int getWidth(long r0);

    private static native void glTexImage2D(long r0, int r2, int r3);

    private static native void glTexSubImage2D(long r0, int r2, int r3);

    private static native void initTexImageDescriptor(long r0);

    private static native boolean isAnimationCompleted(long r0);

    private static native boolean isOpaque(long r0);

    @androidx.annotation.RequiresApi(21)
    private static int m(java.io.FileDescriptor r1, boolean r2) throws pl.droidsonroids.gif.GifIOException, android.system.ErrnoException {
            int r0 = createTempNativeFileDescriptor()     // Catch: java.lang.Throwable -> Ld
            android.system.Os.dup2(r1, r0)     // Catch: java.lang.Throwable -> Ld
            if (r2 == 0) goto Lc
            android.system.Os.close(r1)
        Lc:
            return r0
        Ld:
            r0 = move-exception
            if (r2 == 0) goto L13
            android.system.Os.close(r1)
        L13:
            throw r0
    }

    static native long openByteArray(byte[] r0) throws pl.droidsonroids.gif.GifIOException;

    static native long openDirectByteBuffer(java.nio.ByteBuffer r0) throws pl.droidsonroids.gif.GifIOException;

    static native long openFile(java.lang.String r0) throws pl.droidsonroids.gif.GifIOException;

    static native long openNativeFileDescriptor(int r0, long r1) throws pl.droidsonroids.gif.GifIOException;

    static native long openStream(java.io.InputStream r0) throws pl.droidsonroids.gif.GifIOException;

    private static native void postUnbindSurface(long r0);

    private static native long renderFrame(long r0, android.graphics.Bitmap r2);

    private static native boolean reset(long r0);

    private static native long restoreRemainder(long r0);

    private static native int restoreSavedState(long r0, long[] r2, android.graphics.Bitmap r3);

    private static native void saveRemainder(long r0);

    private static native void seekToFrame(long r0, int r2, android.graphics.Bitmap r3);

    private static native void seekToFrameGL(long r0, int r2);

    private static native void seekToTime(long r0, int r2, android.graphics.Bitmap r3);

    private static native void setLoopCount(long r0, char r2);

    private static native void setOptions(long r0, char r2, boolean r3);

    private static native void setSpeedFactor(long r0, float r2);

    private static native void startDecoderThread(long r0);

    private static native void stopDecoderThread(long r0);

    private static long x(java.io.FileDescriptor r2, long r3, boolean r5) throws pl.droidsonroids.gif.GifIOException {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 27
            if (r0 <= r1) goto L1a
            int r2 = m(r2, r5)     // Catch: java.lang.Exception -> Lb
            goto L1e
        Lb:
            r2 = move-exception
            pl.droidsonroids.gif.GifIOException r3 = new pl.droidsonroids.gif.GifIOException
            pl.droidsonroids.gif.GifError r4 = pl.droidsonroids.gif.GifError.OPEN_FAILED
            int r4 = r4.errorCode
            java.lang.String r2 = r2.getMessage()
            r3.<init>(r4, r2)
            throw r3
        L1a:
            int r2 = extractNativeFileDescriptor(r2, r5)
        L1e:
            long r2 = openNativeFileDescriptor(r2, r3)
            return r2
    }

    static pl.droidsonroids.gif.GifInfoHandle y(android.content.ContentResolver r2, android.net.Uri r3) throws java.io.IOException {
            java.lang.String r0 = "file"
            java.lang.String r1 = r3.getScheme()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L16
            pl.droidsonroids.gif.GifInfoHandle r2 = new pl.droidsonroids.gif.GifInfoHandle
            java.lang.String r3 = r3.getPath()
            r2.<init>(r3)
            return r2
        L16:
            java.lang.String r0 = "r"
            android.content.res.AssetFileDescriptor r2 = r2.openAssetFileDescriptor(r3, r0)
            if (r2 == 0) goto L24
            pl.droidsonroids.gif.GifInfoHandle r3 = new pl.droidsonroids.gif.GifInfoHandle
            r3.<init>(r2)
            return r3
        L24:
            java.io.IOException r2 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Could not open AssetFileDescriptor for "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            throw r2
    }

    synchronized void A() {
            r2 = this;
            monitor-enter(r2)
            long r0 = r2.a     // Catch: java.lang.Throwable -> Lc
            free(r0)     // Catch: java.lang.Throwable -> Lc
            r0 = 0
            r2.a = r0     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r2)
            return
        Lc:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc
            throw r0
    }

    synchronized long B(android.graphics.Bitmap r3) {
            r2 = this;
            monitor-enter(r2)
            long r0 = r2.a     // Catch: java.lang.Throwable -> L9
            long r0 = renderFrame(r0, r3)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r2)
            return r0
        L9:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L9
            throw r3
    }

    synchronized boolean C() {
            r2 = this;
            monitor-enter(r2)
            long r0 = r2.a     // Catch: java.lang.Throwable -> L9
            boolean r0 = reset(r0)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r2)
            return r0
        L9:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L9
            throw r0
    }

    synchronized long D() {
            r2 = this;
            monitor-enter(r2)
            long r0 = r2.a     // Catch: java.lang.Throwable -> L9
            long r0 = restoreRemainder(r0)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r2)
            return r0
        L9:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L9
            throw r0
    }

    synchronized int E(long[] r3, android.graphics.Bitmap r4) {
            r2 = this;
            monitor-enter(r2)
            long r0 = r2.a     // Catch: java.lang.Throwable -> L9
            int r3 = restoreSavedState(r0, r3, r4)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r2)
            return r3
        L9:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L9
            throw r3
    }

    synchronized void F() {
            r2 = this;
            monitor-enter(r2)
            long r0 = r2.a     // Catch: java.lang.Throwable -> L8
            saveRemainder(r0)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r2)
            return
        L8:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L8
            throw r0
    }

    synchronized void G(@androidx.annotation.IntRange(from = 0, to = 2147483647L) int r3, android.graphics.Bitmap r4) {
            r2 = this;
            monitor-enter(r2)
            long r0 = r2.a     // Catch: java.lang.Throwable -> L8
            seekToFrame(r0, r3, r4)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r2)
            return
        L8:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L8
            throw r3
    }

    void H(@androidx.annotation.IntRange(from = 0) int r3) {
            r2 = this;
            r2.O(r3)
            long r0 = r2.a
            seekToFrameGL(r0, r3)
            return
    }

    synchronized void I(@androidx.annotation.IntRange(from = 0, to = 2147483647L) int r3, android.graphics.Bitmap r4) {
            r2 = this;
            monitor-enter(r2)
            long r0 = r2.a     // Catch: java.lang.Throwable -> L8
            seekToTime(r0, r3, r4)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r2)
            return
        L8:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L8
            throw r3
    }

    void J(@androidx.annotation.IntRange(from = 0, to = 65535) int r3) {
            r2 = this;
            if (r3 < 0) goto L13
            r0 = 65535(0xffff, float:9.1834E-41)
            if (r3 > r0) goto L13
            monitor-enter(r2)
            long r0 = r2.a     // Catch: java.lang.Throwable -> L10
            char r3 = (char) r3     // Catch: java.lang.Throwable -> L10
            setLoopCount(r0, r3)     // Catch: java.lang.Throwable -> L10
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L10
            return
        L10:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L10
            throw r3
        L13:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Loop count of range <0, 65535>"
            r3.<init>(r0)
            throw r3
    }

    void K(char r3, boolean r4) {
            r2 = this;
            long r0 = r2.a
            setOptions(r0, r3, r4)
            return
    }

    void L(@androidx.annotation.FloatRange(from = 0.0d, fromInclusive = false) float r3) {
            r2 = this;
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 <= 0) goto L1e
            boolean r0 = java.lang.Float.isNaN(r3)
            if (r0 != 0) goto L1e
            r0 = 805306368(0x30000000, float:4.656613E-10)
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 >= 0) goto L13
            r3 = 805306368(0x30000000, float:4.656613E-10)
        L13:
            monitor-enter(r2)
            long r0 = r2.a     // Catch: java.lang.Throwable -> L1b
            setSpeedFactor(r0, r3)     // Catch: java.lang.Throwable -> L1b
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1b
            return
        L1b:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1b
            throw r3
        L1e:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Speed factor is not positive"
            r3.<init>(r0)
            throw r3
    }

    void M() {
            r2 = this;
            long r0 = r2.a
            startDecoderThread(r0)
            return
    }

    void N() {
            r2 = this;
            long r0 = r2.a
            stopDecoderThread(r0)
            return
    }

    void a(android.view.Surface r3, long[] r4) {
            r2 = this;
            long r0 = r2.a
            bindSurface(r0, r3, r4)
            return
    }

    synchronized long b() {
            r2 = this;
            monitor-enter(r2)
            long r0 = r2.a     // Catch: java.lang.Throwable -> L9
            long r0 = getAllocationByteCount(r0)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r2)
            return r0
        L9:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L9
            throw r0
    }

    synchronized java.lang.String c() {
            r2 = this;
            monitor-enter(r2)
            long r0 = r2.a     // Catch: java.lang.Throwable -> L9
            java.lang.String r0 = getComment(r0)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r2)
            return r0
        L9:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L9
            throw r0
    }

    synchronized int d() {
            r2 = this;
            monitor-enter(r2)
            long r0 = r2.a     // Catch: java.lang.Throwable -> L9
            int r0 = getCurrentFrameIndex(r0)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r2)
            return r0
        L9:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L9
            throw r0
    }

    synchronized int e() {
            r2 = this;
            monitor-enter(r2)
            long r0 = r2.a     // Catch: java.lang.Throwable -> L9
            int r0 = getCurrentLoop(r0)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r2)
            return r0
        L9:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L9
            throw r0
    }

    synchronized int f() {
            r2 = this;
            monitor-enter(r2)
            long r0 = r2.a     // Catch: java.lang.Throwable -> L9
            int r0 = getCurrentPosition(r0)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r2)
            return r0
        L9:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L9
            throw r0
    }

    protected void finalize() throws java.lang.Throwable {
            r1 = this;
            r1.A()     // Catch: java.lang.Throwable -> L7
            super.finalize()
            return
        L7:
            r0 = move-exception
            super.finalize()
            throw r0
    }

    synchronized int g() {
            r2 = this;
            monitor-enter(r2)
            long r0 = r2.a     // Catch: java.lang.Throwable -> L9
            int r0 = getDuration(r0)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r2)
            return r0
        L9:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L9
            throw r0
    }

    synchronized int h(@androidx.annotation.IntRange(from = 0) int r3) {
            r2 = this;
            monitor-enter(r2)
            r2.O(r3)     // Catch: java.lang.Throwable -> Lc
            long r0 = r2.a     // Catch: java.lang.Throwable -> Lc
            int r3 = getFrameDuration(r0, r3)     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r2)
            return r3
        Lc:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc
            throw r3
    }

    synchronized int i() {
            r2 = this;
            monitor-enter(r2)
            long r0 = r2.a     // Catch: java.lang.Throwable -> L9
            int r0 = getHeight(r0)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r2)
            return r0
        L9:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L9
            throw r0
    }

    synchronized int j() {
            r2 = this;
            monitor-enter(r2)
            long r0 = r2.a     // Catch: java.lang.Throwable -> L9
            int r0 = getLoopCount(r0)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r2)
            return r0
        L9:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L9
            throw r0
    }

    synchronized long k() {
            r2 = this;
            monitor-enter(r2)
            long r0 = r2.a     // Catch: java.lang.Throwable -> L9
            long r0 = getMetadataByteCount(r0)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r2)
            return r0
        L9:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L9
            throw r0
    }

    synchronized int l() {
            r2 = this;
            monitor-enter(r2)
            long r0 = r2.a     // Catch: java.lang.Throwable -> L9
            int r0 = getNativeErrorCode(r0)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r2)
            return r0
        L9:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L9
            throw r0
    }

    synchronized int n() {
            r2 = this;
            monitor-enter(r2)
            long r0 = r2.a     // Catch: java.lang.Throwable -> L9
            int r0 = getNumberOfFrames(r0)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r2)
            return r0
        L9:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L9
            throw r0
    }

    synchronized long[] o() {
            r2 = this;
            monitor-enter(r2)
            long r0 = r2.a     // Catch: java.lang.Throwable -> L9
            long[] r0 = getSavedState(r0)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r2)
            return r0
        L9:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L9
            throw r0
    }

    synchronized long p() {
            r2 = this;
            monitor-enter(r2)
            long r0 = r2.a     // Catch: java.lang.Throwable -> L9
            long r0 = getSourceLength(r0)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r2)
            return r0
        L9:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L9
            throw r0
    }

    synchronized int q() {
            r2 = this;
            monitor-enter(r2)
            long r0 = r2.a     // Catch: java.lang.Throwable -> L9
            int r0 = getWidth(r0)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r2)
            return r0
        L9:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L9
            throw r0
    }

    void r(int r3, int r4) {
            r2 = this;
            long r0 = r2.a
            glTexImage2D(r0, r3, r4)
            return
    }

    void s(int r3, int r4) {
            r2 = this;
            long r0 = r2.a
            glTexSubImage2D(r0, r3, r4)
            return
    }

    void t() {
            r2 = this;
            long r0 = r2.a
            initTexImageDescriptor(r0)
            return
    }

    synchronized boolean u() {
            r2 = this;
            monitor-enter(r2)
            long r0 = r2.a     // Catch: java.lang.Throwable -> L9
            boolean r0 = isAnimationCompleted(r0)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r2)
            return r0
        L9:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L9
            throw r0
    }

    synchronized boolean v() {
            r2 = this;
            monitor-enter(r2)
            long r0 = r2.a     // Catch: java.lang.Throwable -> L9
            boolean r0 = isOpaque(r0)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r2)
            return r0
        L9:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L9
            throw r0
    }

    synchronized boolean w() {
            r5 = this;
            monitor-enter(r5)
            long r0 = r5.a     // Catch: java.lang.Throwable -> Le
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Lb
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            monitor-exit(r5)
            return r0
        Le:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> Le
            throw r0
    }

    synchronized void z() {
            r2 = this;
            monitor-enter(r2)
            long r0 = r2.a     // Catch: java.lang.Throwable -> L8
            postUnbindSurface(r0)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r2)
            return
        L8:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L8
            throw r0
    }
}
