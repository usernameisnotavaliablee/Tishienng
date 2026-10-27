package pl.droidsonroids.gif;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class e extends android.graphics.drawable.Drawable implements android.graphics.drawable.Animatable, android.widget.MediaController.MediaPlayerControl {
    final java.util.concurrent.ScheduledThreadPoolExecutor a;
    volatile boolean b;
    long c;
    private final android.graphics.Rect d;
    protected final android.graphics.Paint e;
    final android.graphics.Bitmap f;
    final pl.droidsonroids.gif.GifInfoHandle g;
    final java.util.concurrent.ConcurrentLinkedQueue<pl.droidsonroids.gif.a> h;
    private android.content.res.ColorStateList i;
    private android.graphics.PorterDuffColorFilter j;
    private android.graphics.PorterDuff.Mode k;
    final boolean l;
    final pl.droidsonroids.gif.m m;
    private final pl.droidsonroids.gif.q n;
    private final android.graphics.Rect o;
    java.util.concurrent.ScheduledFuture<?> p;

    /* renamed from: q, reason: collision with root package name */
    private int f70q;
    private int r;
    private j5.b s;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends pl.droidsonroids.gif.s {
        final /* synthetic */ pl.droidsonroids.gif.e b;

        a(pl.droidsonroids.gif.e r1, pl.droidsonroids.gif.e r2) {
                r0 = this;
                r0.b = r1
                r0.<init>(r2)
                return
        }

        @Override // pl.droidsonroids.gif.s
        public void a() {
                r1 = this;
                pl.droidsonroids.gif.e r0 = r1.b
                pl.droidsonroids.gif.GifInfoHandle r0 = r0.g
                boolean r0 = r0.C()
                if (r0 == 0) goto Lf
                pl.droidsonroids.gif.e r0 = r1.b
                r0.start()
            Lf:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends pl.droidsonroids.gif.s {
        final /* synthetic */ int b;
        final /* synthetic */ pl.droidsonroids.gif.e c;

        b(pl.droidsonroids.gif.e r1, pl.droidsonroids.gif.e r2, int r3) {
                r0 = this;
                r0.c = r1
                r0.b = r3
                r0.<init>(r2)
                return
        }

        @Override // pl.droidsonroids.gif.s
        public void a() {
                r4 = this;
                pl.droidsonroids.gif.e r0 = r4.c
                pl.droidsonroids.gif.GifInfoHandle r1 = r0.g
                int r2 = r4.b
                android.graphics.Bitmap r0 = r0.f
                r1.I(r2, r0)
                pl.droidsonroids.gif.e r0 = r4.a
                pl.droidsonroids.gif.m r0 = r0.m
                r1 = -1
                r2 = 0
                r0.sendEmptyMessageAtTime(r1, r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c extends pl.droidsonroids.gif.s {
        final /* synthetic */ int b;
        final /* synthetic */ pl.droidsonroids.gif.e c;

        c(pl.droidsonroids.gif.e r1, pl.droidsonroids.gif.e r2, int r3) {
                r0 = this;
                r0.c = r1
                r0.b = r3
                r0.<init>(r2)
                return
        }

        @Override // pl.droidsonroids.gif.s
        public void a() {
                r4 = this;
                pl.droidsonroids.gif.e r0 = r4.c
                pl.droidsonroids.gif.GifInfoHandle r1 = r0.g
                int r2 = r4.b
                android.graphics.Bitmap r0 = r0.f
                r1.G(r2, r0)
                pl.droidsonroids.gif.e r0 = r4.c
                pl.droidsonroids.gif.m r0 = r0.m
                r1 = -1
                r2 = 0
                r0.sendEmptyMessageAtTime(r1, r2)
                return
        }
    }

    public e(@androidx.annotation.Nullable android.content.ContentResolver r2, @androidx.annotation.NonNull android.net.Uri r3) throws java.io.IOException {
            r1 = this;
            pl.droidsonroids.gif.GifInfoHandle r2 = pl.droidsonroids.gif.GifInfoHandle.y(r2, r3)
            r3 = 0
            r0 = 1
            r1.<init>(r2, r3, r3, r0)
            return
    }

    public e(@androidx.annotation.NonNull android.content.res.AssetFileDescriptor r3) throws java.io.IOException {
            r2 = this;
            pl.droidsonroids.gif.GifInfoHandle r0 = new pl.droidsonroids.gif.GifInfoHandle
            r0.<init>(r3)
            r3 = 0
            r1 = 1
            r2.<init>(r0, r3, r3, r1)
            return
    }

    public e(@androidx.annotation.NonNull android.content.res.AssetManager r1, @androidx.annotation.NonNull java.lang.String r2) throws java.io.IOException {
            r0 = this;
            android.content.res.AssetFileDescriptor r1 = r1.openFd(r2)
            r0.<init>(r1)
            return
    }

    public e(@androidx.annotation.NonNull android.content.res.Resources r2, @androidx.annotation.DrawableRes @androidx.annotation.RawRes int r3) throws android.content.res.Resources.NotFoundException, java.io.IOException {
            r1 = this;
            android.content.res.AssetFileDescriptor r0 = r2.openRawResourceFd(r3)
            r1.<init>(r0)
            float r2 = pl.droidsonroids.gif.k.b(r2, r3)
            pl.droidsonroids.gif.GifInfoHandle r3 = r1.g
            int r3 = r3.i()
            float r3 = (float) r3
            float r3 = r3 * r2
            int r3 = (int) r3
            r1.r = r3
            pl.droidsonroids.gif.GifInfoHandle r3 = r1.g
            int r3 = r3.q()
            float r3 = (float) r3
            float r3 = r3 * r2
            int r2 = (int) r3
            r1.f70q = r2
            return
    }

    public e(@androidx.annotation.NonNull java.io.File r1) throws java.io.IOException {
            r0 = this;
            java.lang.String r1 = r1.getPath()
            r0.<init>(r1)
            return
    }

    public e(@androidx.annotation.NonNull java.io.FileDescriptor r3) throws java.io.IOException {
            r2 = this;
            pl.droidsonroids.gif.GifInfoHandle r0 = new pl.droidsonroids.gif.GifInfoHandle
            r0.<init>(r3)
            r3 = 0
            r1 = 1
            r2.<init>(r0, r3, r3, r1)
            return
    }

    public e(@androidx.annotation.NonNull java.io.InputStream r3) throws java.io.IOException {
            r2 = this;
            pl.droidsonroids.gif.GifInfoHandle r0 = new pl.droidsonroids.gif.GifInfoHandle
            r0.<init>(r3)
            r3 = 0
            r1 = 1
            r2.<init>(r0, r3, r3, r1)
            return
    }

    public e(@androidx.annotation.NonNull java.lang.String r3) throws java.io.IOException {
            r2 = this;
            pl.droidsonroids.gif.GifInfoHandle r0 = new pl.droidsonroids.gif.GifInfoHandle
            r0.<init>(r3)
            r3 = 0
            r1 = 1
            r2.<init>(r0, r3, r3, r1)
            return
    }

    public e(@androidx.annotation.NonNull java.nio.ByteBuffer r3) throws java.io.IOException {
            r2 = this;
            pl.droidsonroids.gif.GifInfoHandle r0 = new pl.droidsonroids.gif.GifInfoHandle
            r0.<init>(r3)
            r3 = 0
            r1 = 1
            r2.<init>(r0, r3, r3, r1)
            return
    }

    e(pl.droidsonroids.gif.GifInfoHandle r6, pl.droidsonroids.gif.e r7, java.util.concurrent.ScheduledThreadPoolExecutor r8, boolean r9) {
            r5 = this;
            r5.<init>()
            r0 = 1
            r5.b = r0
            r1 = -9223372036854775808
            r5.c = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r5.d = r1
            android.graphics.Paint r1 = new android.graphics.Paint
            r2 = 6
            r1.<init>(r2)
            r5.e = r1
            java.util.concurrent.ConcurrentLinkedQueue r1 = new java.util.concurrent.ConcurrentLinkedQueue
            r1.<init>()
            r5.h = r1
            pl.droidsonroids.gif.q r1 = new pl.droidsonroids.gif.q
            r1.<init>(r5)
            r5.n = r1
            r5.l = r9
            if (r8 == 0) goto L2c
            goto L30
        L2c:
            pl.droidsonroids.gif.i r8 = pl.droidsonroids.gif.i.a()
        L30:
            r5.a = r8
            r5.g = r6
            r8 = 0
            r9 = 0
            if (r7 == 0) goto L6a
            pl.droidsonroids.gif.GifInfoHandle r2 = r7.g
            monitor-enter(r2)
            pl.droidsonroids.gif.GifInfoHandle r3 = r7.g     // Catch: java.lang.Throwable -> L64
            boolean r3 = r3.w()     // Catch: java.lang.Throwable -> L64
            if (r3 != 0) goto L66
            pl.droidsonroids.gif.GifInfoHandle r3 = r7.g     // Catch: java.lang.Throwable -> L64
            int r3 = r3.i()     // Catch: java.lang.Throwable -> L64
            int r4 = r6.i()     // Catch: java.lang.Throwable -> L64
            if (r3 < r4) goto L66
            pl.droidsonroids.gif.GifInfoHandle r3 = r7.g     // Catch: java.lang.Throwable -> L64
            int r3 = r3.q()     // Catch: java.lang.Throwable -> L64
            int r4 = r6.q()     // Catch: java.lang.Throwable -> L64
            if (r3 < r4) goto L66
            r7.I()     // Catch: java.lang.Throwable -> L64
            android.graphics.Bitmap r9 = r7.f     // Catch: java.lang.Throwable -> L64
            r9.eraseColor(r8)     // Catch: java.lang.Throwable -> L64
            goto L66
        L64:
            r6 = move-exception
            goto L68
        L66:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L64
            goto L6a
        L68:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L64
            throw r6
        L6a:
            if (r9 != 0) goto L7d
            int r7 = r6.q()
            int r9 = r6.i()
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r7 = android.graphics.Bitmap.createBitmap(r7, r9, r2)
            r5.f = r7
            goto L7f
        L7d:
            r5.f = r9
        L7f:
            android.graphics.Bitmap r7 = r5.f
            boolean r9 = r6.v()
            r9 = r9 ^ r0
            r7.setHasAlpha(r9)
            android.graphics.Rect r7 = new android.graphics.Rect
            int r9 = r6.q()
            int r0 = r6.i()
            r7.<init>(r8, r8, r9, r0)
            r5.o = r7
            pl.droidsonroids.gif.m r7 = new pl.droidsonroids.gif.m
            r7.<init>(r5)
            r5.m = r7
            r1.a()
            int r7 = r6.q()
            r5.f70q = r7
            int r6 = r6.i()
            r5.r = r6
            return
    }

    protected e(@androidx.annotation.NonNull pl.droidsonroids.gif.l r1, @androidx.annotation.Nullable pl.droidsonroids.gif.e r2, @androidx.annotation.Nullable java.util.concurrent.ScheduledThreadPoolExecutor r3, boolean r4, @androidx.annotation.NonNull pl.droidsonroids.gif.h r5) throws java.io.IOException {
            r0 = this;
            pl.droidsonroids.gif.GifInfoHandle r1 = r1.b(r5)
            r0.<init>(r1, r2, r3, r4)
            return
    }

    public e(@androidx.annotation.NonNull byte[] r3) throws java.io.IOException {
            r2 = this;
            pl.droidsonroids.gif.GifInfoHandle r0 = new pl.droidsonroids.gif.GifInfoHandle
            r0.<init>(r3)
            r3 = 0
            r1 = 1
            r2.<init>(r0, r3, r3, r1)
            return
    }

    private void I() {
            r2 = this;
            r0 = 0
            r2.b = r0
            pl.droidsonroids.gif.m r0 = r2.m
            r1 = -1
            r0.removeMessages(r1)
            pl.droidsonroids.gif.GifInfoHandle r0 = r2.g
            r0.A()
            return
    }

    private android.graphics.PorterDuffColorFilter K(android.content.res.ColorStateList r3, android.graphics.PorterDuff.Mode r4) {
            r2 = this;
            if (r3 == 0) goto L14
            if (r4 != 0) goto L5
            goto L14
        L5:
            int[] r0 = r2.getState()
            r1 = 0
            int r3 = r3.getColorForState(r0, r1)
            android.graphics.PorterDuffColorFilter r0 = new android.graphics.PorterDuffColorFilter
            r0.<init>(r3, r4)
            return r0
        L14:
            r3 = 0
            return r3
    }

    private void b() {
            r2 = this;
            java.util.concurrent.ScheduledFuture<?> r0 = r2.p
            if (r0 == 0) goto L8
            r1 = 0
            r0.cancel(r1)
        L8:
            pl.droidsonroids.gif.m r0 = r2.m
            r1 = -1
            r0.removeMessages(r1)
            return
    }

    @androidx.annotation.Nullable
    public static pl.droidsonroids.gif.e c(@androidx.annotation.NonNull android.content.res.Resources r1, @androidx.annotation.DrawableRes @androidx.annotation.RawRes int r2) {
            pl.droidsonroids.gif.e r0 = new pl.droidsonroids.gif.e     // Catch: java.io.IOException -> L6
            r0.<init>(r1, r2)     // Catch: java.io.IOException -> L6
            return r0
        L6:
            r1 = 0
            return r1
    }

    private void z() {
            r6 = this;
            boolean r0 = r6.l
            if (r0 == 0) goto L30
            boolean r0 = r6.b
            if (r0 == 0) goto L30
            long r0 = r6.c
            r2 = -9223372036854775808
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L30
            long r4 = android.os.SystemClock.uptimeMillis()
            long r0 = r0 - r4
            r4 = 0
            long r0 = java.lang.Math.max(r4, r0)
            r6.c = r2
            java.util.concurrent.ScheduledThreadPoolExecutor r2 = r6.a
            pl.droidsonroids.gif.q r3 = r6.n
            r2.remove(r3)
            java.util.concurrent.ScheduledThreadPoolExecutor r2 = r6.a
            pl.droidsonroids.gif.q r3 = r6.n
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.ScheduledFuture r0 = r2.schedule(r3, r0, r4)
            r6.p = r0
        L30:
            return
    }

    public void A(@androidx.annotation.IntRange(from = 0, to = 2147483647L) int r4) {
            r3 = this;
            if (r4 < 0) goto L19
            pl.droidsonroids.gif.GifInfoHandle r0 = r3.g
            monitor-enter(r0)
            pl.droidsonroids.gif.GifInfoHandle r1 = r3.g     // Catch: java.lang.Throwable -> L16
            android.graphics.Bitmap r2 = r3.f     // Catch: java.lang.Throwable -> L16
            r1.I(r4, r2)     // Catch: java.lang.Throwable -> L16
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            pl.droidsonroids.gif.m r4 = r3.m
            r0 = -1
            r1 = 0
            r4.sendEmptyMessageAtTime(r0, r1)
            return
        L16:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            throw r4
        L19:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Position is not positive"
            r4.<init>(r0)
            throw r4
    }

    public void B(@androidx.annotation.IntRange(from = 0, to = 2147483647L) int r3) {
            r2 = this;
            if (r3 < 0) goto Ld
            java.util.concurrent.ScheduledThreadPoolExecutor r0 = r2.a
            pl.droidsonroids.gif.e$c r1 = new pl.droidsonroids.gif.e$c
            r1.<init>(r2, r2, r3)
            r0.execute(r1)
            return
        Ld:
            java.lang.IndexOutOfBoundsException r3 = new java.lang.IndexOutOfBoundsException
            java.lang.String r0 = "Frame index is not positive"
            r3.<init>(r0)
            throw r3
    }

    public android.graphics.Bitmap C(@androidx.annotation.IntRange(from = 0, to = 2147483647L) int r5) {
            r4 = this;
            if (r5 < 0) goto L1d
            pl.droidsonroids.gif.GifInfoHandle r0 = r4.g
            monitor-enter(r0)
            pl.droidsonroids.gif.GifInfoHandle r1 = r4.g     // Catch: java.lang.Throwable -> L1a
            android.graphics.Bitmap r2 = r4.f     // Catch: java.lang.Throwable -> L1a
            r1.G(r5, r2)     // Catch: java.lang.Throwable -> L1a
            android.graphics.Bitmap r5 = r4.g()     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            pl.droidsonroids.gif.m r0 = r4.m
            r1 = -1
            r2 = 0
            r0.sendEmptyMessageAtTime(r1, r2)
            return r5
        L1a:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            throw r5
        L1d:
            java.lang.IndexOutOfBoundsException r5 = new java.lang.IndexOutOfBoundsException
            java.lang.String r0 = "Frame index is not positive"
            r5.<init>(r0)
            throw r5
    }

    public android.graphics.Bitmap D(@androidx.annotation.IntRange(from = 0, to = 2147483647L) int r5) {
            r4 = this;
            if (r5 < 0) goto L1d
            pl.droidsonroids.gif.GifInfoHandle r0 = r4.g
            monitor-enter(r0)
            pl.droidsonroids.gif.GifInfoHandle r1 = r4.g     // Catch: java.lang.Throwable -> L1a
            android.graphics.Bitmap r2 = r4.f     // Catch: java.lang.Throwable -> L1a
            r1.I(r5, r2)     // Catch: java.lang.Throwable -> L1a
            android.graphics.Bitmap r5 = r4.g()     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            pl.droidsonroids.gif.m r0 = r4.m
            r1 = -1
            r2 = 0
            r0.sendEmptyMessageAtTime(r1, r2)
            return r5
        L1a:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            throw r5
        L1d:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Position is not positive"
            r5.<init>(r0)
            throw r5
    }

    public void E(@androidx.annotation.FloatRange(from = 0.0d) float r2) {
            r1 = this;
            j5.a r0 = new j5.a
            r0.<init>(r2)
            r1.s = r0
            android.graphics.Rect r2 = r1.d
            r0.b(r2)
            return
    }

    public void F(@androidx.annotation.IntRange(from = 0, to = 65535) int r2) {
            r1 = this;
            pl.droidsonroids.gif.GifInfoHandle r0 = r1.g
            r0.J(r2)
            return
    }

    public void G(@androidx.annotation.FloatRange(from = 0.0d, fromInclusive = false) float r2) {
            r1 = this;
            pl.droidsonroids.gif.GifInfoHandle r0 = r1.g
            r0.L(r2)
            return
    }

    public void H(@androidx.annotation.Nullable j5.b r2) {
            r1 = this;
            r1.s = r2
            if (r2 == 0) goto L9
            android.graphics.Rect r0 = r1.d
            r2.b(r0)
        L9:
            return
    }

    void J(long r5) {
            r4 = this;
            boolean r0 = r4.l
            r1 = 0
            if (r0 == 0) goto Lf
            r4.c = r1
            pl.droidsonroids.gif.m r5 = r4.m
            r6 = -1
            r5.sendEmptyMessageAtTime(r6, r1)
            return
        Lf:
            r4.b()
            java.util.concurrent.ScheduledThreadPoolExecutor r0 = r4.a
            pl.droidsonroids.gif.q r3 = r4.n
            long r5 = java.lang.Math.max(r5, r1)
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.ScheduledFuture r5 = r0.schedule(r3, r5, r1)
            r4.p = r5
            return
    }

    public void a(@androidx.annotation.NonNull pl.droidsonroids.gif.a r2) {
            r1 = this;
            java.util.concurrent.ConcurrentLinkedQueue<pl.droidsonroids.gif.a> r0 = r1.h
            r0.add(r2)
            return
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canPause() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekBackward() {
            r2 = this;
            int r0 = r2.p()
            r1 = 1
            if (r0 <= r1) goto L8
            return r1
        L8:
            r0 = 0
            return r0
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekForward() {
            r2 = this;
            int r0 = r2.p()
            r1 = 1
            if (r0 <= r1) goto L8
            return r1
        L8:
            r0 = 0
            return r0
    }

    public long d() {
            r4 = this;
            pl.droidsonroids.gif.GifInfoHandle r0 = r4.g
            long r0 = r0.b()
            android.graphics.Bitmap r2 = r4.f
            int r2 = r2.getAllocationByteCount()
            long r2 = (long) r2
            long r0 = r0 + r2
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@androidx.annotation.NonNull android.graphics.Canvas r6) {
            r5 = this;
            android.graphics.PorterDuffColorFilter r0 = r5.j
            if (r0 == 0) goto L15
            android.graphics.Paint r0 = r5.e
            android.graphics.ColorFilter r0 = r0.getColorFilter()
            if (r0 != 0) goto L15
            android.graphics.Paint r0 = r5.e
            android.graphics.PorterDuffColorFilter r1 = r5.j
            r0.setColorFilter(r1)
            r0 = 1
            goto L16
        L15:
            r0 = 0
        L16:
            j5.b r1 = r5.s
            if (r1 != 0) goto L26
            android.graphics.Bitmap r1 = r5.f
            android.graphics.Rect r2 = r5.o
            android.graphics.Rect r3 = r5.d
            android.graphics.Paint r4 = r5.e
            r6.drawBitmap(r1, r2, r3, r4)
            goto L2d
        L26:
            android.graphics.Paint r2 = r5.e
            android.graphics.Bitmap r3 = r5.f
            r1.a(r6, r2, r3)
        L2d:
            if (r0 == 0) goto L35
            android.graphics.Paint r6 = r5.e
            r0 = 0
            r6.setColorFilter(r0)
        L35:
            return
    }

    @androidx.annotation.Nullable
    public java.lang.String e() {
            r1 = this;
            pl.droidsonroids.gif.GifInfoHandle r0 = r1.g
            java.lang.String r0 = r0.c()
            return r0
    }

    @androidx.annotation.FloatRange(from = 0.0d)
    public float f() {
            r2 = this;
            j5.b r0 = r2.s
            boolean r1 = r0 instanceof j5.a
            if (r1 == 0) goto Ld
            j5.a r0 = (j5.a) r0
            float r0 = r0.d()
            return r0
        Ld:
            r0 = 0
            return r0
    }

    public android.graphics.Bitmap g() {
            r3 = this;
            android.graphics.Bitmap r0 = r3.f
            android.graphics.Bitmap$Config r1 = r0.getConfig()
            android.graphics.Bitmap r2 = r3.f
            boolean r2 = r2.isMutable()
            android.graphics.Bitmap r0 = r0.copy(r1, r2)
            android.graphics.Bitmap r1 = r3.f
            boolean r1 = r1.hasAlpha()
            r0.setHasAlpha(r1)
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
            r1 = this;
            android.graphics.Paint r0 = r1.e
            int r0 = r0.getAlpha()
            return r0
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getAudioSessionId() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getBufferPercentage() {
            r1 = this;
            r0 = 100
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.ColorFilter getColorFilter() {
            r1 = this;
            android.graphics.Paint r0 = r1.e
            android.graphics.ColorFilter r0 = r0.getColorFilter()
            return r0
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getCurrentPosition() {
            r1 = this;
            pl.droidsonroids.gif.GifInfoHandle r0 = r1.g
            int r0 = r0.f()
            return r0
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getDuration() {
            r1 = this;
            pl.droidsonroids.gif.GifInfoHandle r0 = r1.g
            int r0 = r0.g()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
            r1 = this;
            int r0 = r1.r
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
            r1 = this;
            int r0 = r1.f70q
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
            r2 = this;
            pl.droidsonroids.gif.GifInfoHandle r0 = r2.g
            boolean r0 = r0.v()
            if (r0 == 0) goto L15
            android.graphics.Paint r0 = r2.e
            int r0 = r0.getAlpha()
            r1 = 255(0xff, float:3.57E-43)
            if (r0 >= r1) goto L13
            goto L15
        L13:
            r0 = -1
            return r0
        L15:
            r0 = -2
            return r0
    }

    public int h() {
            r1 = this;
            pl.droidsonroids.gif.GifInfoHandle r0 = r1.g
            int r0 = r0.d()
            return r0
    }

    public int i() {
            r2 = this;
            pl.droidsonroids.gif.GifInfoHandle r0 = r2.g
            int r0 = r0.e()
            if (r0 == 0) goto L13
            pl.droidsonroids.gif.GifInfoHandle r1 = r2.g
            int r1 = r1.j()
            if (r0 >= r1) goto L11
            goto L13
        L11:
            int r0 = r0 + (-1)
        L13:
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
            r0 = this;
            super.invalidateSelf()
            r0.z()
            return
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean isPlaying() {
            r1 = this;
            boolean r0 = r1.b
            return r0
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
            r1 = this;
            boolean r0 = r1.b
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
            r1 = this;
            boolean r0 = super.isStateful()
            if (r0 != 0) goto L13
            android.content.res.ColorStateList r0 = r1.i
            if (r0 == 0) goto L11
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L11
            goto L13
        L11:
            r0 = 0
            return r0
        L13:
            r0 = 1
            return r0
    }

    @androidx.annotation.NonNull
    public pl.droidsonroids.gif.GifError j() {
            r1 = this;
            pl.droidsonroids.gif.GifInfoHandle r0 = r1.g
            int r0 = r0.l()
            pl.droidsonroids.gif.GifError r0 = pl.droidsonroids.gif.GifError.fromCode(r0)
            return r0
    }

    public int k() {
            r2 = this;
            android.graphics.Bitmap r0 = r2.f
            int r0 = r0.getRowBytes()
            android.graphics.Bitmap r1 = r2.f
            int r1 = r1.getHeight()
            int r0 = r0 * r1
            return r0
    }

    public int l(@androidx.annotation.IntRange(from = 0) int r2) {
            r1 = this;
            pl.droidsonroids.gif.GifInfoHandle r0 = r1.g
            int r2 = r0.h(r2)
            return r2
    }

    public long m() {
            r2 = this;
            pl.droidsonroids.gif.GifInfoHandle r0 = r2.g
            long r0 = r0.p()
            return r0
    }

    public int n() {
            r1 = this;
            pl.droidsonroids.gif.GifInfoHandle r0 = r1.g
            int r0 = r0.j()
            return r0
    }

    public long o() {
            r2 = this;
            pl.droidsonroids.gif.GifInfoHandle r0 = r2.g
            long r0 = r0.k()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(android.graphics.Rect r2) {
            r1 = this;
            android.graphics.Rect r0 = r1.d
            r0.set(r2)
            j5.b r0 = r1.s
            if (r0 == 0) goto Lc
            r0.b(r2)
        Lc:
            return
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] r2) {
            r1 = this;
            android.content.res.ColorStateList r2 = r1.i
            if (r2 == 0) goto L10
            android.graphics.PorterDuff$Mode r0 = r1.k
            if (r0 == 0) goto L10
            android.graphics.PorterDuffColorFilter r2 = r1.K(r2, r0)
            r1.j = r2
            r2 = 1
            return r2
        L10:
            r2 = 0
            return r2
    }

    public int p() {
            r1 = this;
            pl.droidsonroids.gif.GifInfoHandle r0 = r1.g
            int r0 = r0.n()
            return r0
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void pause() {
            r0 = this;
            r0.stop()
            return
    }

    @androidx.annotation.NonNull
    public final android.graphics.Paint q() {
            r1 = this;
            android.graphics.Paint r0 = r1.e
            return r0
    }

    public int r(@androidx.annotation.IntRange(from = 0) int r2, @androidx.annotation.IntRange(from = 0) int r3) {
            r1 = this;
            pl.droidsonroids.gif.GifInfoHandle r0 = r1.g
            int r0 = r0.q()
            if (r2 >= r0) goto L1f
            pl.droidsonroids.gif.GifInfoHandle r0 = r1.g
            int r0 = r0.i()
            if (r3 >= r0) goto L17
            android.graphics.Bitmap r0 = r1.f
            int r2 = r0.getPixel(r2, r3)
            return r2
        L17:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "y must be < height"
            r2.<init>(r3)
            throw r2
        L1f:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "x must be < width"
            r2.<init>(r3)
            throw r2
    }

    public void s(@androidx.annotation.NonNull int[] r9) {
            r8 = this;
            android.graphics.Bitmap r0 = r8.f
            pl.droidsonroids.gif.GifInfoHandle r1 = r8.g
            int r3 = r1.q()
            pl.droidsonroids.gif.GifInfoHandle r1 = r8.g
            int r6 = r1.q()
            pl.droidsonroids.gif.GifInfoHandle r1 = r8.g
            int r7 = r1.i()
            r2 = 0
            r4 = 0
            r5 = 0
            r1 = r9
            r0.getPixels(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void seekTo(@androidx.annotation.IntRange(from = 0, to = 2147483647L) int r3) {
            r2 = this;
            if (r3 < 0) goto Ld
            java.util.concurrent.ScheduledThreadPoolExecutor r0 = r2.a
            pl.droidsonroids.gif.e$b r1 = new pl.droidsonroids.gif.e$b
            r1.<init>(r2, r2, r3)
            r0.execute(r1)
            return
        Ld:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Position is not positive"
            r3.<init>(r0)
            throw r3
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(@androidx.annotation.IntRange(from = 0, to = 255) int r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.e
            r0.setAlpha(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@androidx.annotation.Nullable android.graphics.ColorFilter r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.e
            r0.setColorFilter(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.e
            r0.setDither(r2)
            r1.invalidateSelf()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.e
            r0.setFilterBitmap(r2)
            r1.invalidateSelf()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            r1.i = r2
            android.graphics.PorterDuff$Mode r0 = r1.k
            android.graphics.PorterDuffColorFilter r2 = r1.K(r2, r0)
            r1.j = r2
            r1.invalidateSelf()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(@androidx.annotation.Nullable android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            r1.k = r2
            android.content.res.ColorStateList r0 = r1.i
            android.graphics.PorterDuffColorFilter r2 = r1.K(r0, r2)
            r1.j = r2
            r1.invalidateSelf()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean r3, boolean r4) {
            r2 = this;
            boolean r0 = super.setVisible(r3, r4)
            boolean r1 = r2.l
            if (r1 != 0) goto L1a
            if (r3 == 0) goto L15
            if (r4 == 0) goto Lf
            r2.y()
        Lf:
            if (r0 == 0) goto L1a
            r2.start()
            return r0
        L15:
            if (r0 == 0) goto L1a
            r2.stop()
        L1a:
            return r0
    }

    @Override // android.graphics.drawable.Animatable, android.widget.MediaController.MediaPlayerControl
    public void start() {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.b     // Catch: java.lang.Throwable -> L7
            if (r0 == 0) goto L9
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L7
            return
        L7:
            r0 = move-exception
            goto L17
        L9:
            r0 = 1
            r2.b = r0     // Catch: java.lang.Throwable -> L7
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L7
            pl.droidsonroids.gif.GifInfoHandle r0 = r2.g
            long r0 = r0.D()
            r2.J(r0)
            return
        L17:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L7
            throw r0
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.b     // Catch: java.lang.Throwable -> L7
            if (r0 != 0) goto L9
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L7
            return
        L7:
            r0 = move-exception
            goto L16
        L9:
            r0 = 0
            r1.b = r0     // Catch: java.lang.Throwable -> L7
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L7
            r1.b()
            pl.droidsonroids.gif.GifInfoHandle r0 = r1.g
            r0.F()
            return
        L16:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L7
            throw r0
    }

    @androidx.annotation.Nullable
    public j5.b t() {
            r1 = this;
            j5.b r0 = r1.s
            return r0
    }

    @androidx.annotation.NonNull
    public java.lang.String toString() {
            r7 = this;
            java.util.Locale r0 = java.util.Locale.ENGLISH
            pl.droidsonroids.gif.GifInfoHandle r1 = r7.g
            int r1 = r1.q()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            pl.droidsonroids.gif.GifInfoHandle r2 = r7.g
            int r2 = r2.i()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            pl.droidsonroids.gif.GifInfoHandle r3 = r7.g
            int r3 = r3.n()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            pl.droidsonroids.gif.GifInfoHandle r4 = r7.g
            int r4 = r4.l()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5 = 4
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r6 = 0
            r5[r6] = r1
            r1 = 1
            r5[r1] = r2
            r1 = 2
            r5[r1] = r3
            r1 = 3
            r5[r1] = r4
            java.lang.String r1 = "GIF: size: %dx%d, frames: %d, error: %d"
            java.lang.String r0 = java.lang.String.format(r0, r1, r5)
            return r0
    }

    public boolean u() {
            r1 = this;
            pl.droidsonroids.gif.GifInfoHandle r0 = r1.g
            boolean r0 = r0.u()
            return r0
    }

    public boolean v() {
            r1 = this;
            pl.droidsonroids.gif.GifInfoHandle r0 = r1.g
            boolean r0 = r0.w()
            return r0
    }

    public void w() {
            r1 = this;
            r1.I()
            android.graphics.Bitmap r0 = r1.f
            r0.recycle()
            return
    }

    public boolean x(pl.droidsonroids.gif.a r2) {
            r1 = this;
            java.util.concurrent.ConcurrentLinkedQueue<pl.droidsonroids.gif.a> r0 = r1.h
            boolean r2 = r0.remove(r2)
            return r2
    }

    public void y() {
            r2 = this;
            java.util.concurrent.ScheduledThreadPoolExecutor r0 = r2.a
            pl.droidsonroids.gif.e$a r1 = new pl.droidsonroids.gif.e$a
            r1.<init>(r2, r2)
            r0.execute(r1)
            return
    }
}
