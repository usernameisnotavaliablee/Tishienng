package com.devlin_n.videoplayer.player;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class c {
    private static com.devlin_n.videoplayer.player.c b;
    private java.lang.ref.WeakReference<com.devlin_n.videoplayer.player.IjkVideoView> a;

    private c() {
            r0 = this;
            r0.<init>()
            return
    }

    public static synchronized com.devlin_n.videoplayer.player.c b() {
            java.lang.Class<com.devlin_n.videoplayer.player.c> r0 = com.devlin_n.videoplayer.player.c.class
            monitor-enter(r0)
            com.devlin_n.videoplayer.player.c r1 = com.devlin_n.videoplayer.player.c.b     // Catch: java.lang.Throwable -> Lf
            if (r1 != 0) goto L11
            com.devlin_n.videoplayer.player.c r1 = new com.devlin_n.videoplayer.player.c     // Catch: java.lang.Throwable -> Lf
            r1.<init>()     // Catch: java.lang.Throwable -> Lf
            com.devlin_n.videoplayer.player.c.b = r1     // Catch: java.lang.Throwable -> Lf
            goto L11
        Lf:
            r1 = move-exception
            goto L15
        L11:
            com.devlin_n.videoplayer.player.c r1 = com.devlin_n.videoplayer.player.c.b     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)
            return r1
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r1
    }

    public com.devlin_n.videoplayer.player.IjkVideoView a() {
            r1 = this;
            java.lang.ref.WeakReference<com.devlin_n.videoplayer.player.IjkVideoView> r0 = r1.a
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.lang.Object r0 = r0.get()
            com.devlin_n.videoplayer.player.IjkVideoView r0 = (com.devlin_n.videoplayer.player.IjkVideoView) r0
            return r0
    }

    public boolean c() {
            r1 = this;
            java.lang.ref.WeakReference<com.devlin_n.videoplayer.player.IjkVideoView> r0 = r1.a
            if (r0 == 0) goto L1a
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L1a
            java.lang.ref.WeakReference<com.devlin_n.videoplayer.player.IjkVideoView> r0 = r1.a
            java.lang.Object r0 = r0.get()
            com.devlin_n.videoplayer.player.IjkVideoView r0 = (com.devlin_n.videoplayer.player.IjkVideoView) r0
            boolean r0 = r0.X()
            if (r0 == 0) goto L1a
            r0 = 1
            return r0
        L1a:
            r0 = 0
            return r0
    }

    public void d() {
            r1 = this;
            java.lang.ref.WeakReference<com.devlin_n.videoplayer.player.IjkVideoView> r0 = r1.a
            if (r0 == 0) goto L18
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L18
            java.lang.ref.WeakReference<com.devlin_n.videoplayer.player.IjkVideoView> r0 = r1.a
            java.lang.Object r0 = r0.get()
            com.devlin_n.videoplayer.player.IjkVideoView r0 = (com.devlin_n.videoplayer.player.IjkVideoView) r0
            r0.Z()
            r0 = 0
            r1.a = r0
        L18:
            return
    }

    public void e(com.devlin_n.videoplayer.player.IjkVideoView r2) {
            r1 = this;
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r1.a = r0
            return
    }
}
