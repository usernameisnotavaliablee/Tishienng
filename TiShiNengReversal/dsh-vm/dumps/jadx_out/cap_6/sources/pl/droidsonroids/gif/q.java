package pl.droidsonroids.gif;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
class q extends pl.droidsonroids.gif.s {
    q(pl.droidsonroids.gif.e r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // pl.droidsonroids.gif.s
    public void a() {
            r7 = this;
            pl.droidsonroids.gif.e r0 = r7.a
            pl.droidsonroids.gif.GifInfoHandle r1 = r0.g
            android.graphics.Bitmap r0 = r0.f
            long r0 = r1.B(r0)
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L6a
            pl.droidsonroids.gif.e r4 = r7.a
            long r5 = android.os.SystemClock.uptimeMillis()
            long r5 = r5 + r0
            r4.c = r5
            pl.droidsonroids.gif.e r4 = r7.a
            boolean r4 = r4.isVisible()
            if (r4 == 0) goto L3e
            pl.droidsonroids.gif.e r4 = r7.a
            boolean r4 = r4.b
            if (r4 == 0) goto L3e
            pl.droidsonroids.gif.e r4 = r7.a
            boolean r5 = r4.l
            if (r5 != 0) goto L3e
            java.util.concurrent.ScheduledThreadPoolExecutor r4 = r4.a
            r4.remove(r7)
            pl.droidsonroids.gif.e r4 = r7.a
            java.util.concurrent.ScheduledThreadPoolExecutor r5 = r4.a
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.ScheduledFuture r0 = r5.schedule(r7, r0, r6)
            r4.p = r0
        L3e:
            pl.droidsonroids.gif.e r0 = r7.a
            java.util.concurrent.ConcurrentLinkedQueue<pl.droidsonroids.gif.a> r0 = r0.h
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L73
            pl.droidsonroids.gif.e r0 = r7.a
            int r0 = r0.h()
            pl.droidsonroids.gif.e r1 = r7.a
            pl.droidsonroids.gif.GifInfoHandle r1 = r1.g
            int r1 = r1.n()
            int r1 = r1 + (-1)
            if (r0 != r1) goto L73
            pl.droidsonroids.gif.e r0 = r7.a
            pl.droidsonroids.gif.m r1 = r0.m
            int r0 = r0.i()
            pl.droidsonroids.gif.e r4 = r7.a
            long r4 = r4.c
            r1.sendEmptyMessageAtTime(r0, r4)
            goto L73
        L6a:
            pl.droidsonroids.gif.e r0 = r7.a
            r4 = -9223372036854775808
            r0.c = r4
            r1 = 0
            r0.b = r1
        L73:
            pl.droidsonroids.gif.e r0 = r7.a
            boolean r0 = r0.isVisible()
            if (r0 == 0) goto L8d
            pl.droidsonroids.gif.e r0 = r7.a
            pl.droidsonroids.gif.m r0 = r0.m
            r1 = -1
            boolean r0 = r0.hasMessages(r1)
            if (r0 != 0) goto L8d
            pl.droidsonroids.gif.e r0 = r7.a
            pl.droidsonroids.gif.m r0 = r0.m
            r0.sendEmptyMessageAtTime(r1, r2)
        L8d:
            return
    }
}
