package pl.droidsonroids.gif;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class j {
    private final pl.droidsonroids.gif.GifInfoHandle a;

    public j(pl.droidsonroids.gif.l r2, @androidx.annotation.Nullable pl.droidsonroids.gif.h r3) throws java.io.IOException {
            r1 = this;
            r1.<init>()
            if (r3 != 0) goto La
            pl.droidsonroids.gif.h r3 = new pl.droidsonroids.gif.h
            r3.<init>()
        La:
            pl.droidsonroids.gif.GifInfoHandle r2 = r2.c()
            r1.a = r2
            char r0 = r3.a
            boolean r3 = r3.b
            r2.K(r0, r3)
            r2.t()
            return
    }

    public int a() {
            r1 = this;
            pl.droidsonroids.gif.GifInfoHandle r0 = r1.a
            int r0 = r0.d()
            return r0
    }

    public int b() {
            r1 = this;
            pl.droidsonroids.gif.GifInfoHandle r0 = r1.a
            int r0 = r0.g()
            return r0
    }

    public int c(@androidx.annotation.IntRange(from = 0) int r2) {
            r1 = this;
            pl.droidsonroids.gif.GifInfoHandle r0 = r1.a
            int r2 = r0.h(r2)
            return r2
    }

    public int d() {
            r1 = this;
            pl.droidsonroids.gif.GifInfoHandle r0 = r1.a
            int r0 = r0.i()
            return r0
    }

    public int e() {
            r1 = this;
            pl.droidsonroids.gif.GifInfoHandle r0 = r1.a
            int r0 = r0.n()
            return r0
    }

    public int f() {
            r1 = this;
            pl.droidsonroids.gif.GifInfoHandle r0 = r1.a
            int r0 = r0.q()
            return r0
    }

    protected final void finalize() throws java.lang.Throwable {
            r1 = this;
            r1.i()     // Catch: java.lang.Throwable -> L7
            super.finalize()
            return
        L7:
            r0 = move-exception
            super.finalize()
            throw r0
    }

    public void g(int r2, int r3) {
            r1 = this;
            pl.droidsonroids.gif.GifInfoHandle r0 = r1.a
            r0.r(r2, r3)
            return
    }

    public void h(int r2, int r3) {
            r1 = this;
            pl.droidsonroids.gif.GifInfoHandle r0 = r1.a
            r0.s(r2, r3)
            return
    }

    public void i() {
            r1 = this;
            pl.droidsonroids.gif.GifInfoHandle r0 = r1.a
            if (r0 == 0) goto L7
            r0.A()
        L7:
            return
    }

    public void j(@androidx.annotation.IntRange(from = 0) int r2) {
            r1 = this;
            pl.droidsonroids.gif.GifInfoHandle r0 = r1.a
            r0.H(r2)
            return
    }

    public void k(@androidx.annotation.FloatRange(from = 0.0d, fromInclusive = false) float r2) {
            r1 = this;
            pl.droidsonroids.gif.GifInfoHandle r0 = r1.a
            r0.L(r2)
            return
    }

    public void l() {
            r1 = this;
            pl.droidsonroids.gif.GifInfoHandle r0 = r1.a
            r0.M()
            return
    }

    public void m() {
            r1 = this;
            pl.droidsonroids.gif.GifInfoHandle r0 = r1.a
            r0.N()
            return
    }
}
