package pl.droidsonroids.gif;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class o implements android.graphics.drawable.Drawable.Callback {
    private final java.util.concurrent.CopyOnWriteArrayList<pl.droidsonroids.gif.o.a> a;
    private final boolean b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class a extends java.lang.ref.WeakReference<android.graphics.drawable.Drawable.Callback> {
        a(android.graphics.drawable.Drawable.Callback r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                r1 = 0
                if (r5 == 0) goto L1d
                java.lang.Class<pl.droidsonroids.gif.o$a> r2 = pl.droidsonroids.gif.o.a.class
                java.lang.Class r3 = r5.getClass()
                if (r2 == r3) goto L10
                goto L1d
            L10:
                java.lang.Object r2 = r4.get()
                pl.droidsonroids.gif.o$a r5 = (pl.droidsonroids.gif.o.a) r5
                java.lang.Object r5 = r5.get()
                if (r2 != r5) goto L1d
                return r0
            L1d:
                return r1
        }

        public int hashCode() {
                r1 = this;
                java.lang.Object r0 = r1.get()
                android.graphics.drawable.Drawable$Callback r0 = (android.graphics.drawable.Drawable.Callback) r0
                if (r0 == 0) goto Ld
                int r0 = r0.hashCode()
                return r0
            Ld:
                r0 = 0
                return r0
        }
    }

    public o() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    public o(boolean r2) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r1.a = r0
            r1.b = r2
            return
    }

    public void a(android.graphics.drawable.Drawable.Callback r4) {
            r3 = this;
            r0 = 0
        L1:
            java.util.concurrent.CopyOnWriteArrayList<pl.droidsonroids.gif.o$a> r1 = r3.a
            int r1 = r1.size()
            if (r0 >= r1) goto L21
            java.util.concurrent.CopyOnWriteArrayList<pl.droidsonroids.gif.o$a> r1 = r3.a
            java.lang.Object r1 = r1.get(r0)
            pl.droidsonroids.gif.o$a r1 = (pl.droidsonroids.gif.o.a) r1
            java.lang.Object r2 = r1.get()
            android.graphics.drawable.Drawable$Callback r2 = (android.graphics.drawable.Drawable.Callback) r2
            if (r2 != 0) goto L1e
            java.util.concurrent.CopyOnWriteArrayList<pl.droidsonroids.gif.o$a> r2 = r3.a
            r2.remove(r1)
        L1e:
            int r0 = r0 + 1
            goto L1
        L21:
            java.util.concurrent.CopyOnWriteArrayList<pl.droidsonroids.gif.o$a> r0 = r3.a
            pl.droidsonroids.gif.o$a r1 = new pl.droidsonroids.gif.o$a
            r1.<init>(r4)
            r0.addIfAbsent(r1)
            return
    }

    public void b(android.graphics.drawable.Drawable.Callback r4) {
            r3 = this;
            r0 = 0
        L1:
            java.util.concurrent.CopyOnWriteArrayList<pl.droidsonroids.gif.o$a> r1 = r3.a
            int r1 = r1.size()
            if (r0 >= r1) goto L23
            java.util.concurrent.CopyOnWriteArrayList<pl.droidsonroids.gif.o$a> r1 = r3.a
            java.lang.Object r1 = r1.get(r0)
            pl.droidsonroids.gif.o$a r1 = (pl.droidsonroids.gif.o.a) r1
            java.lang.Object r2 = r1.get()
            android.graphics.drawable.Drawable$Callback r2 = (android.graphics.drawable.Drawable.Callback) r2
            if (r2 == 0) goto L1b
            if (r2 != r4) goto L20
        L1b:
            java.util.concurrent.CopyOnWriteArrayList<pl.droidsonroids.gif.o$a> r2 = r3.a
            r2.remove(r1)
        L20:
            int r0 = r0 + 1
            goto L1
        L23:
            return
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@androidx.annotation.NonNull android.graphics.drawable.Drawable r4) {
            r3 = this;
            r0 = 0
        L1:
            java.util.concurrent.CopyOnWriteArrayList<pl.droidsonroids.gif.o$a> r1 = r3.a
            int r1 = r1.size()
            if (r0 >= r1) goto L33
            java.util.concurrent.CopyOnWriteArrayList<pl.droidsonroids.gif.o$a> r1 = r3.a
            java.lang.Object r1 = r1.get(r0)
            pl.droidsonroids.gif.o$a r1 = (pl.droidsonroids.gif.o.a) r1
            java.lang.Object r2 = r1.get()
            android.graphics.drawable.Drawable$Callback r2 = (android.graphics.drawable.Drawable.Callback) r2
            if (r2 == 0) goto L2b
            boolean r1 = r3.b
            if (r1 == 0) goto L27
            boolean r1 = r2 instanceof android.view.View
            if (r1 == 0) goto L27
            android.view.View r2 = (android.view.View) r2
            r2.invalidate()
            goto L30
        L27:
            r2.invalidateDrawable(r4)
            goto L30
        L2b:
            java.util.concurrent.CopyOnWriteArrayList<pl.droidsonroids.gif.o$a> r2 = r3.a
            r2.remove(r1)
        L30:
            int r0 = r0 + 1
            goto L1
        L33:
            return
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(@androidx.annotation.NonNull android.graphics.drawable.Drawable r4, @androidx.annotation.NonNull java.lang.Runnable r5, long r6) {
            r3 = this;
            r0 = 0
        L1:
            java.util.concurrent.CopyOnWriteArrayList<pl.droidsonroids.gif.o$a> r1 = r3.a
            int r1 = r1.size()
            if (r0 >= r1) goto L25
            java.util.concurrent.CopyOnWriteArrayList<pl.droidsonroids.gif.o$a> r1 = r3.a
            java.lang.Object r1 = r1.get(r0)
            pl.droidsonroids.gif.o$a r1 = (pl.droidsonroids.gif.o.a) r1
            java.lang.Object r2 = r1.get()
            android.graphics.drawable.Drawable$Callback r2 = (android.graphics.drawable.Drawable.Callback) r2
            if (r2 == 0) goto L1d
            r2.scheduleDrawable(r4, r5, r6)
            goto L22
        L1d:
            java.util.concurrent.CopyOnWriteArrayList<pl.droidsonroids.gif.o$a> r2 = r3.a
            r2.remove(r1)
        L22:
            int r0 = r0 + 1
            goto L1
        L25:
            return
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(@androidx.annotation.NonNull android.graphics.drawable.Drawable r4, @androidx.annotation.NonNull java.lang.Runnable r5) {
            r3 = this;
            r0 = 0
        L1:
            java.util.concurrent.CopyOnWriteArrayList<pl.droidsonroids.gif.o$a> r1 = r3.a
            int r1 = r1.size()
            if (r0 >= r1) goto L25
            java.util.concurrent.CopyOnWriteArrayList<pl.droidsonroids.gif.o$a> r1 = r3.a
            java.lang.Object r1 = r1.get(r0)
            pl.droidsonroids.gif.o$a r1 = (pl.droidsonroids.gif.o.a) r1
            java.lang.Object r2 = r1.get()
            android.graphics.drawable.Drawable$Callback r2 = (android.graphics.drawable.Drawable.Callback) r2
            if (r2 == 0) goto L1d
            r2.unscheduleDrawable(r4, r5)
            goto L22
        L1d:
            java.util.concurrent.CopyOnWriteArrayList<pl.droidsonroids.gif.o$a> r2 = r3.a
            r2.remove(r1)
        L22:
            int r0 = r0 + 1
            goto L1
        L25:
            return
    }
}
