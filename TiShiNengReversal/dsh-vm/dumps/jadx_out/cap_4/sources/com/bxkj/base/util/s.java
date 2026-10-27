package com.bxkj.base.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class s {
    private static volatile com.bxkj.base.util.s b = null;
    private static java.lang.String c = null;
    private static java.lang.String d = "TAG.Util.MediaPlay";
    private android.media.MediaPlayer a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements android.media.MediaPlayer.OnPreparedListener {
        final /* synthetic */ com.bxkj.base.util.s a;

        a(com.bxkj.base.util.s r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(android.media.MediaPlayer r1) {
                r0 = this;
                com.bxkj.base.util.s.c()
                r1.getDuration()
                r1.start()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b implements android.media.MediaPlayer.OnCompletionListener {
        final /* synthetic */ com.bxkj.base.util.s a;

        b(com.bxkj.base.util.s r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(android.media.MediaPlayer r2) {
                r1 = this;
                java.lang.String r2 = ""
                com.bxkj.base.util.s.d(r2)
                com.bxkj.base.util.s r2 = r1.a
                android.media.MediaPlayer r2 = com.bxkj.base.util.s.a(r2)
                if (r2 == 0) goto L16
                com.bxkj.base.util.s r2 = r1.a
                android.media.MediaPlayer r2 = com.bxkj.base.util.s.a(r2)
                r2.release()
            L16:
                com.bxkj.base.util.s r2 = r1.a
                android.media.MediaPlayer r2 = com.bxkj.base.util.s.a(r2)
                if (r2 == 0) goto L24
                com.bxkj.base.util.s r2 = r1.a
                r0 = 0
                com.bxkj.base.util.s.b(r2, r0)
            L24:
                return
        }
    }

    static {
            return
    }

    private s() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* bridge */ /* synthetic */ android.media.MediaPlayer a(com.bxkj.base.util.s r0) {
            android.media.MediaPlayer r0 = r0.a
            return r0
    }

    static /* bridge */ /* synthetic */ void b(com.bxkj.base.util.s r0, android.media.MediaPlayer r1) {
            r0.a = r1
            return
    }

    static /* bridge */ /* synthetic */ java.lang.String c() {
            java.lang.String r0 = com.bxkj.base.util.s.d
            return r0
    }

    static /* bridge */ /* synthetic */ void d(java.lang.String r0) {
            com.bxkj.base.util.s.c = r0
            return
    }

    public static com.bxkj.base.util.s e() {
            com.bxkj.base.util.s r0 = com.bxkj.base.util.s.b
            if (r0 != 0) goto L19
            java.lang.Class<com.bxkj.base.util.s> r0 = com.bxkj.base.util.s.class
            monitor-enter(r0)
            com.bxkj.base.util.s r1 = com.bxkj.base.util.s.b     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.bxkj.base.util.s r1 = new com.bxkj.base.util.s     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.bxkj.base.util.s.b = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r1 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1
        L19:
            com.bxkj.base.util.s r0 = com.bxkj.base.util.s.b
            return r0
    }

    public void f(android.content.Context r2, java.lang.String r3) {
            r1 = this;
            android.media.MediaPlayer r0 = r1.a
            if (r0 == 0) goto L8
            r1.h()
            return
        L8:
            r1.g(r2, r3)
            return
    }

    public void g(android.content.Context r2, java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = com.bxkj.base.util.s.c
            boolean r0 = android.text.TextUtils.equals(r3, r0)
            if (r0 == 0) goto L9
            return
        L9:
            r1.h()
            com.bxkj.base.util.s.c = r3
            android.media.MediaPlayer r0 = r1.a
            if (r0 != 0) goto L1c
            android.net.Uri r0 = android.net.Uri.parse(r3)
            android.media.MediaPlayer r2 = android.media.MediaPlayer.create(r2, r0)
            r1.a = r2
        L1c:
            android.media.MediaPlayer r2 = r1.a     // Catch: java.io.IOException -> L40
            r2.reset()     // Catch: java.io.IOException -> L40
            android.media.MediaPlayer r2 = r1.a     // Catch: java.io.IOException -> L40
            r2.setDataSource(r3)     // Catch: java.io.IOException -> L40
            android.media.MediaPlayer r2 = r1.a     // Catch: java.io.IOException -> L40
            r2.prepareAsync()     // Catch: java.io.IOException -> L40
            android.media.MediaPlayer r2 = r1.a     // Catch: java.io.IOException -> L40
            com.bxkj.base.util.s$a r3 = new com.bxkj.base.util.s$a     // Catch: java.io.IOException -> L40
            r3.<init>(r1)     // Catch: java.io.IOException -> L40
            r2.setOnPreparedListener(r3)     // Catch: java.io.IOException -> L40
            android.media.MediaPlayer r2 = r1.a     // Catch: java.io.IOException -> L40
            com.bxkj.base.util.s$b r3 = new com.bxkj.base.util.s$b     // Catch: java.io.IOException -> L40
            r3.<init>(r1)     // Catch: java.io.IOException -> L40
            r2.setOnCompletionListener(r3)     // Catch: java.io.IOException -> L40
            return
        L40:
            r2 = move-exception
            r2.getMessage()
            return
    }

    public void h() {
            r1 = this;
            java.lang.String r0 = ""
            com.bxkj.base.util.s.c = r0
            android.media.MediaPlayer r0 = r1.a     // Catch: java.lang.Exception -> Lc
            if (r0 == 0) goto Le
            r0.stop()     // Catch: java.lang.Exception -> Lc
            goto Le
        Lc:
            r0 = move-exception
            goto L1d
        Le:
            android.media.MediaPlayer r0 = r1.a     // Catch: java.lang.Exception -> Lc
            if (r0 == 0) goto L15
            r0.release()     // Catch: java.lang.Exception -> Lc
        L15:
            android.media.MediaPlayer r0 = r1.a     // Catch: java.lang.Exception -> Lc
            if (r0 == 0) goto L1c
            r0 = 0
            r1.a = r0     // Catch: java.lang.Exception -> Lc
        L1c:
            return
        L1d:
            r0.toString()
            return
    }
}
