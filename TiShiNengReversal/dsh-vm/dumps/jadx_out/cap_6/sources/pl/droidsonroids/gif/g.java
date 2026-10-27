package pl.droidsonroids.gif;

import pl.droidsonroids.gif.g;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class g<T extends pl.droidsonroids.gif.g<T>> {
    private pl.droidsonroids.gif.l a;
    private pl.droidsonroids.gif.e b;
    private java.util.concurrent.ScheduledThreadPoolExecutor c;
    private boolean d;
    private final pl.droidsonroids.gif.h e;

    public g() {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.d = r0
            pl.droidsonroids.gif.h r0 = new pl.droidsonroids.gif.h
            r0.<init>()
            r1.e = r0
            return
    }

    public pl.droidsonroids.gif.e a() throws java.io.IOException {
            r5 = this;
            pl.droidsonroids.gif.l r0 = r5.a
            if (r0 == 0) goto L11
            pl.droidsonroids.gif.e r1 = r5.b
            java.util.concurrent.ScheduledThreadPoolExecutor r2 = r5.c
            boolean r3 = r5.d
            pl.droidsonroids.gif.h r4 = r5.e
            pl.droidsonroids.gif.e r0 = r0.a(r1, r2, r3, r4)
            return r0
        L11:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Source is not set"
            r0.<init>(r1)
            throw r0
    }

    public T b(android.content.ContentResolver r2, android.net.Uri r3) {
            r1 = this;
            pl.droidsonroids.gif.l$j r0 = new pl.droidsonroids.gif.l$j
            r0.<init>(r2, r3)
            r1.a = r0
            pl.droidsonroids.gif.g r2 = r1.t()
            return r2
    }

    public T c(android.content.res.AssetFileDescriptor r2) {
            r1 = this;
            pl.droidsonroids.gif.l$b r0 = new pl.droidsonroids.gif.l$b
            r0.<init>(r2)
            r1.a = r0
            pl.droidsonroids.gif.g r2 = r1.t()
            return r2
    }

    public T d(android.content.res.AssetManager r2, java.lang.String r3) {
            r1 = this;
            pl.droidsonroids.gif.l$c r0 = new pl.droidsonroids.gif.l$c
            r0.<init>(r2, r3)
            r1.a = r0
            pl.droidsonroids.gif.g r2 = r1.t()
            return r2
    }

    public T e(android.content.res.Resources r2, int r3) {
            r1 = this;
            pl.droidsonroids.gif.l$i r0 = new pl.droidsonroids.gif.l$i
            r0.<init>(r2, r3)
            r1.a = r0
            pl.droidsonroids.gif.g r2 = r1.t()
            return r2
    }

    public T f(java.io.File r2) {
            r1 = this;
            pl.droidsonroids.gif.l$g r0 = new pl.droidsonroids.gif.l$g
            r0.<init>(r2)
            r1.a = r0
            pl.droidsonroids.gif.g r2 = r1.t()
            return r2
    }

    public T g(java.io.FileDescriptor r2) {
            r1 = this;
            pl.droidsonroids.gif.l$f r0 = new pl.droidsonroids.gif.l$f
            r0.<init>(r2)
            r1.a = r0
            pl.droidsonroids.gif.g r2 = r1.t()
            return r2
    }

    public T h(java.io.InputStream r2) {
            r1 = this;
            pl.droidsonroids.gif.l$h r0 = new pl.droidsonroids.gif.l$h
            r0.<init>(r2)
            r1.a = r0
            pl.droidsonroids.gif.g r2 = r1.t()
            return r2
    }

    public T i(java.lang.String r2) {
            r1 = this;
            pl.droidsonroids.gif.l$g r0 = new pl.droidsonroids.gif.l$g
            r0.<init>(r2)
            r1.a = r0
            pl.droidsonroids.gif.g r2 = r1.t()
            return r2
    }

    public T j(java.nio.ByteBuffer r2) {
            r1 = this;
            pl.droidsonroids.gif.l$e r0 = new pl.droidsonroids.gif.l$e
            r0.<init>(r2)
            r1.a = r0
            pl.droidsonroids.gif.g r2 = r1.t()
            return r2
    }

    public T k(byte[] r2) {
            r1 = this;
            pl.droidsonroids.gif.l$d r0 = new pl.droidsonroids.gif.l$d
            r0.<init>(r2)
            r1.a = r0
            pl.droidsonroids.gif.g r2 = r1.t()
            return r2
    }

    public java.util.concurrent.ScheduledThreadPoolExecutor l() {
            r1 = this;
            java.util.concurrent.ScheduledThreadPoolExecutor r0 = r1.c
            return r0
    }

    public pl.droidsonroids.gif.l m() {
            r1 = this;
            pl.droidsonroids.gif.l r0 = r1.a
            return r0
    }

    public pl.droidsonroids.gif.e n() {
            r1 = this;
            pl.droidsonroids.gif.e r0 = r1.b
            return r0
    }

    public pl.droidsonroids.gif.h o() {
            r1 = this;
            pl.droidsonroids.gif.h r0 = r1.e
            return r0
    }

    public boolean p() {
            r1 = this;
            boolean r0 = r1.d
            return r0
    }

    @pl.droidsonroids.gif.annotations.Beta
    public T q(@androidx.annotation.Nullable pl.droidsonroids.gif.h r2) {
            r1 = this;
            pl.droidsonroids.gif.h r0 = r1.e
            r0.b(r2)
            pl.droidsonroids.gif.g r2 = r1.t()
            return r2
    }

    public T r(boolean r1) {
            r0 = this;
            r0.d = r1
            pl.droidsonroids.gif.g r1 = r0.t()
            return r1
    }

    public T s(@androidx.annotation.IntRange(from = 1, to = 65535) int r2) {
            r1 = this;
            pl.droidsonroids.gif.h r0 = r1.e
            r0.d(r2)
            pl.droidsonroids.gif.g r2 = r1.t()
            return r2
    }

    protected abstract T t();

    public T u(boolean r1) {
            r0 = this;
            pl.droidsonroids.gif.g r1 = r0.r(r1)
            return r1
    }

    public T v(java.util.concurrent.ScheduledThreadPoolExecutor r1) {
            r0 = this;
            r0.c = r1
            pl.droidsonroids.gif.g r1 = r0.t()
            return r1
    }

    public T w(int r2) {
            r1 = this;
            java.util.concurrent.ScheduledThreadPoolExecutor r0 = new java.util.concurrent.ScheduledThreadPoolExecutor
            r0.<init>(r2)
            r1.c = r0
            pl.droidsonroids.gif.g r2 = r1.t()
            return r2
    }

    public T x(pl.droidsonroids.gif.e r1) {
            r0 = this;
            r0.b = r1
            pl.droidsonroids.gif.g r1 = r0.t()
            return r1
    }
}
