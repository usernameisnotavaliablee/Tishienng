package pl.droidsonroids.gif;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class d {
    private final pl.droidsonroids.gif.GifInfoHandle a;

    public d(@androidx.annotation.NonNull pl.droidsonroids.gif.l r2) throws java.io.IOException {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public d(@androidx.annotation.NonNull pl.droidsonroids.gif.l r2, @androidx.annotation.Nullable pl.droidsonroids.gif.h r3) throws java.io.IOException {
            r1 = this;
            r1.<init>()
            pl.droidsonroids.gif.GifInfoHandle r2 = r2.c()
            r1.a = r2
            if (r3 == 0) goto L12
            char r0 = r3.a
            boolean r3 = r3.b
            r2.K(r0, r3)
        L12:
            return
    }

    private void a(android.graphics.Bitmap r4) {
            r3 = this;
            boolean r0 = r4.isRecycled()
            if (r0 != 0) goto L4a
            int r0 = r4.getWidth()
            pl.droidsonroids.gif.GifInfoHandle r1 = r3.a
            int r1 = r1.q()
            if (r0 < r1) goto L42
            int r0 = r4.getHeight()
            pl.droidsonroids.gif.GifInfoHandle r1 = r3.a
            int r1 = r1.i()
            if (r0 < r1) goto L42
            android.graphics.Bitmap$Config r0 = r4.getConfig()
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888
            if (r0 != r1) goto L27
            return
        L27:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Only Config.ARGB_8888 is supported. Current bitmap config: "
            r1.append(r2)
            android.graphics.Bitmap$Config r4 = r4.getConfig()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L42:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Bitmap ia too small, size must be greater than or equal to GIF size"
            r4.<init>(r0)
            throw r4
        L4a:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Bitmap is recycled"
            r4.<init>(r0)
            throw r4
    }

    public long b() {
            r2 = this;
            pl.droidsonroids.gif.GifInfoHandle r0 = r2.a
            long r0 = r0.b()
            return r0
    }

    public java.lang.String c() {
            r1 = this;
            pl.droidsonroids.gif.GifInfoHandle r0 = r1.a
            java.lang.String r0 = r0.c()
            return r0
    }

    public int d() {
            r1 = this;
            pl.droidsonroids.gif.GifInfoHandle r0 = r1.a
            int r0 = r0.g()
            return r0
    }

    public int e(@androidx.annotation.IntRange(from = 0) int r2) {
            r1 = this;
            pl.droidsonroids.gif.GifInfoHandle r0 = r1.a
            int r2 = r0.h(r2)
            return r2
    }

    public int f() {
            r1 = this;
            pl.droidsonroids.gif.GifInfoHandle r0 = r1.a
            int r0 = r0.i()
            return r0
    }

    public int g() {
            r1 = this;
            pl.droidsonroids.gif.GifInfoHandle r0 = r1.a
            int r0 = r0.j()
            return r0
    }

    public int h() {
            r1 = this;
            pl.droidsonroids.gif.GifInfoHandle r0 = r1.a
            int r0 = r0.n()
            return r0
    }

    public long i() {
            r2 = this;
            pl.droidsonroids.gif.GifInfoHandle r0 = r2.a
            long r0 = r0.p()
            return r0
    }

    public int j() {
            r1 = this;
            pl.droidsonroids.gif.GifInfoHandle r0 = r1.a
            int r0 = r0.q()
            return r0
    }

    public boolean k() {
            r2 = this;
            pl.droidsonroids.gif.GifInfoHandle r0 = r2.a
            int r0 = r0.n()
            r1 = 1
            if (r0 <= r1) goto L10
            int r0 = r2.d()
            if (r0 <= 0) goto L10
            return r1
        L10:
            r0 = 0
            return r0
    }

    public void l() {
            r1 = this;
            pl.droidsonroids.gif.GifInfoHandle r0 = r1.a
            r0.A()
            return
    }

    public void m(@androidx.annotation.IntRange(from = 0, to = 2147483647L) int r2, @androidx.annotation.NonNull android.graphics.Bitmap r3) {
            r1 = this;
            r1.a(r3)
            pl.droidsonroids.gif.GifInfoHandle r0 = r1.a
            r0.G(r2, r3)
            return
    }

    public void n(@androidx.annotation.IntRange(from = 0, to = 2147483647L) int r2, @androidx.annotation.NonNull android.graphics.Bitmap r3) {
            r1 = this;
            r1.a(r3)
            pl.droidsonroids.gif.GifInfoHandle r0 = r1.a
            r0.I(r2, r3)
            return
    }
}
