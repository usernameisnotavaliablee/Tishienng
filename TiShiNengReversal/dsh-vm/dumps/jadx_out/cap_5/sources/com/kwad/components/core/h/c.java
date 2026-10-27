package com.kwad.components.core.h;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class c implements com.kwad.sdk.core.imageloader.core.listener.ImageLoadingListener {
    private com.kwad.components.core.h.b QF;

    @androidx.annotation.Nullable
    private com.kwad.components.core.h.a QG;
    private int QH;
    private int QI;
    private long QJ;
    private java.util.List<com.kwad.components.core.video.i> QK;
    private long jY;






    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.kwad.components.core.h.c$6, reason: invalid class name */
    static /* synthetic */ class AnonymousClass6 {
        static final /* synthetic */ int[] $SwitchMap$com$kwad$sdk$core$imageloader$core$assist$FailReason$FailType = null;

        static {
                com.kwad.sdk.core.imageloader.core.assist.FailReason$FailType[] r0 = com.kwad.sdk.core.imageloader.core.assist.FailReason.FailType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.kwad.components.core.h.c.AnonymousClass6.$SwitchMap$com$kwad$sdk$core$imageloader$core$assist$FailReason$FailType = r0
                com.kwad.sdk.core.imageloader.core.assist.FailReason$FailType r1 = com.kwad.sdk.core.imageloader.core.assist.FailReason.FailType.IO_ERROR     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.kwad.components.core.h.c.AnonymousClass6.$SwitchMap$com$kwad$sdk$core$imageloader$core$assist$FailReason$FailType     // Catch: java.lang.NoSuchFieldError -> L1d
                com.kwad.sdk.core.imageloader.core.assist.FailReason$FailType r1 = com.kwad.sdk.core.imageloader.core.assist.FailReason.FailType.DECODING_ERROR     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.kwad.components.core.h.c.AnonymousClass6.$SwitchMap$com$kwad$sdk$core$imageloader$core$assist$FailReason$FailType     // Catch: java.lang.NoSuchFieldError -> L28
                com.kwad.sdk.core.imageloader.core.assist.FailReason$FailType r1 = com.kwad.sdk.core.imageloader.core.assist.FailReason.FailType.NETWORK_DENIED     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = com.kwad.components.core.h.c.AnonymousClass6.$SwitchMap$com$kwad$sdk$core$imageloader$core$assist$FailReason$FailType     // Catch: java.lang.NoSuchFieldError -> L33
                com.kwad.sdk.core.imageloader.core.assist.FailReason$FailType r1 = com.kwad.sdk.core.imageloader.core.assist.FailReason.FailType.OUT_OF_MEMORY     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = com.kwad.components.core.h.c.AnonymousClass6.$SwitchMap$com$kwad$sdk$core$imageloader$core$assist$FailReason$FailType     // Catch: java.lang.NoSuchFieldError -> L3e
                com.kwad.sdk.core.imageloader.core.assist.FailReason$FailType r1 = com.kwad.sdk.core.imageloader.core.assist.FailReason.FailType.UNKNOWN     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                return
        }

        public AnonymousClass6() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    public c() {
            r3 = this;
            r3.<init>()
            r0 = 1
            r3.QH = r0
            r0 = 16
            r3.QI = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r3.QK = r0
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            com.kwad.components.core.h.a r1 = new com.kwad.components.core.h.a
            android.os.Handler r2 = new android.os.Handler
            r2.<init>(r0)
            r1.<init>(r2)
            r3.QG = r1
            com.kwad.components.core.h.c$1 r0 = new com.kwad.components.core.h.c$1
            r0.<init>(r3)
            r1.a(r0)
            return
    }

    static /* synthetic */ int a(com.kwad.components.core.h.c r0, com.kwad.sdk.core.imageloader.core.assist.FailReason.FailType r1) {
            int r0 = a(r1)
            return r0
    }

    private static int a(com.kwad.sdk.core.imageloader.core.assist.FailReason.FailType r1) {
            int[] r0 = com.kwad.components.core.h.c.AnonymousClass6.$SwitchMap$com$kwad$sdk$core$imageloader$core$assist$FailReason$FailType
            int r1 = r1.ordinal()
            r1 = r0[r1]
            r0 = 1
            if (r1 == r0) goto L1c
            r0 = 2
            if (r1 == r0) goto L1a
            r0 = 3
            if (r1 == r0) goto L18
            r0 = 4
            if (r1 == r0) goto L16
            r1 = -1
            return r1
        L16:
            r1 = -5
            return r1
        L18:
            r1 = -4
            return r1
        L1a:
            r1 = -3
            return r1
        L1c:
            r1 = -2
            return r1
    }

    static /* synthetic */ long a(com.kwad.components.core.h.c r2) {
            long r0 = r2.QJ
            return r0
    }

    static /* synthetic */ long a(com.kwad.components.core.h.c r0, long r1) {
            r0.jY = r1
            return r1
    }

    static /* synthetic */ void a(com.kwad.components.core.h.c r0, com.kwad.sdk.g.a r1) {
            r0.b(r1)
            return
    }

    static /* synthetic */ long b(com.kwad.components.core.h.c r2) {
            long r0 = r2.jY
            return r0
    }

    private <T> void b(com.kwad.sdk.g.a<com.kwad.components.core.video.i> r3) {
            r2 = this;
            if (r3 == 0) goto L1a
            java.util.List<com.kwad.components.core.video.i> r0 = r2.QK
            if (r0 == 0) goto L1a
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1a
            java.lang.Object r1 = r0.next()
            com.kwad.components.core.video.i r1 = (com.kwad.components.core.video.i) r1
            r3.accept(r1)
            goto La
        L1a:
            return
    }

    private void ql() {
            r3 = this;
            com.kwad.components.core.h.b r0 = r3.QF
            if (r0 == 0) goto Lc
            int r1 = r3.QH
            int r2 = r3.QI
            r1 = r1 | r2
            r0.setImageGravity(r1)
        Lc:
            return
    }

    public final void E(long r1) {
            r0 = this;
            r0.QJ = r1
            return
    }

    public final void c(com.kwad.components.core.video.i r2) {
            r1 = this;
            if (r2 == 0) goto L7
            java.util.List<com.kwad.components.core.video.i> r0 = r1.QK
            r0.add(r2)
        L7:
            return
    }

    public final void d(com.kwad.components.core.video.i r2) {
            r1 = this;
            if (r2 == 0) goto L7
            java.util.List<com.kwad.components.core.video.i> r0 = r1.QK
            r0.remove(r2)
        L7:
            return
    }

    public final void destroy() {
            r2 = this;
            java.util.List<com.kwad.components.core.video.i> r0 = r2.QK
            r0.clear()
            com.kwad.components.core.h.b r0 = r2.QF
            if (r0 == 0) goto L1c
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == 0) goto L1c
            com.kwad.components.core.h.b r0 = r2.QF
            android.view.ViewParent r0 = r0.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            com.kwad.components.core.h.b r1 = r2.QF
            r0.removeView(r1)
        L1c:
            r0 = 0
            r2.QF = r0
            com.kwad.components.core.h.a r1 = r2.QG
            if (r1 == 0) goto L28
            r1.destroy()
            r2.QG = r0
        L28:
            return
    }

    public final android.widget.FrameLayout getImagePlayerView(android.content.Context r2) {
            r1 = this;
            com.kwad.components.core.h.b r0 = r1.QF
            if (r0 != 0) goto Lb
            com.kwad.components.core.h.b r0 = new com.kwad.components.core.h.b
            r0.<init>(r2)
            r1.QF = r0
        Lb:
            com.kwad.components.core.h.b r2 = r1.QF
            return r2
    }

    public final long getPlayDuration() {
            r2 = this;
            long r0 = r2.jY
            return r0
    }

    @Override // com.kwad.sdk.core.imageloader.core.listener.ImageLoadingListener
    public final boolean onDecode(java.lang.String r1, java.io.InputStream r2, com.kwad.sdk.core.imageloader.core.decode.DecodedResult r3) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // com.kwad.sdk.core.imageloader.core.listener.ImageLoadingListener
    public final void onLoadingCancelled(java.lang.String r1, android.view.View r2) {
            r0 = this;
            return
    }

    @Override // com.kwad.sdk.core.imageloader.core.listener.ImageLoadingListener
    public final void onLoadingComplete(java.lang.String r1, android.view.View r2, com.kwad.sdk.core.imageloader.core.decode.DecodedResult r3) {
            r0 = this;
            return
    }

    @Override // com.kwad.sdk.core.imageloader.core.listener.ImageLoadingListener
    public final void onLoadingFailed(java.lang.String r1, android.view.View r2, com.kwad.sdk.core.imageloader.core.assist.FailReason r3) {
            r0 = this;
            com.kwad.components.core.h.c$5 r1 = new com.kwad.components.core.h.c$5
            r1.<init>(r0, r3)
            r0.b(r1)
            return
    }

    @Override // com.kwad.sdk.core.imageloader.core.listener.ImageLoadingListener
    public final void onLoadingStarted(java.lang.String r1, android.view.View r2) {
            r0 = this;
            return
    }

    public final void pause() {
            r1 = this;
            com.kwad.components.core.h.a r0 = r1.QG
            if (r0 == 0) goto L7
            r0.pause()
        L7:
            com.kwad.components.core.h.c$2 r0 = new com.kwad.components.core.h.c$2
            r0.<init>(r1)
            r1.b(r0)
            return
    }

    public final void play() {
            r1 = this;
            com.kwad.components.core.h.a r0 = r1.QG
            if (r0 == 0) goto L7
            r0.start()
        L7:
            return
    }

    public final void resume() {
            r1 = this;
            com.kwad.components.core.h.a r0 = r1.QG
            if (r0 == 0) goto Lf
            r0.resume()
            com.kwad.components.core.h.c$3 r0 = new com.kwad.components.core.h.c$3
            r0.<init>(r1)
            r1.b(r0)
        Lf:
            return
    }

    public final void setHorizontalGravity(int r1) {
            r0 = this;
            int r1 = com.kwad.components.core.b.c.ax(r1)
            r0.QI = r1
            r0.ql()
            return
    }

    public final void setImageScaleType(android.widget.ImageView.ScaleType r2) {
            r1 = this;
            com.kwad.components.core.h.b r0 = r1.QF
            if (r0 == 0) goto L7
            r0.setImageScaleType(r2)
        L7:
            return
    }

    public final void setRadius(float r2, float r3, float r4, float r5) {
            r1 = this;
            com.kwad.components.core.h.b r0 = r1.QF
            if (r0 == 0) goto L7
            r0.setRadius(r2, r3, r4, r5)
        L7:
            return
    }

    public final void setSpeed(float r2) {
            r1 = this;
            com.kwad.components.core.h.a r0 = r1.QG
            if (r0 == 0) goto L7
            r0.setSpeed(r2)
        L7:
            return
    }

    public final void setURLs(java.util.List<java.lang.String> r2) {
            r1 = this;
            if (r2 == 0) goto L17
            int r0 = r2.size()
            if (r0 != 0) goto L9
            goto L17
        L9:
            r0 = 0
            java.lang.Object r2 = r2.get(r0)
            java.lang.String r2 = (java.lang.String) r2
            com.kwad.components.core.h.b r0 = r1.QF
            if (r0 == 0) goto L17
            r0.a(r2, r1)
        L17:
            return
    }

    public final void setVerticalGravity(int r1) {
            r0 = this;
            int r1 = com.kwad.components.core.b.c.aw(r1)
            r0.QI = r1
            r0.ql()
            return
    }

    public final void skipToEnd() {
            r1 = this;
            com.kwad.components.core.h.c$4 r0 = new com.kwad.components.core.h.c$4
            r0.<init>(r1)
            r1.b(r0)
            return
    }

    public final void stop() {
            r1 = this;
            com.kwad.components.core.h.a r0 = r1.QG
            if (r0 == 0) goto L7
            r0.stop()
        L7:
            return
    }
}
