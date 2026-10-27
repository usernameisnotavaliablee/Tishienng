package com.kwad.components.core.webview.jshandler;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class ba implements com.kwad.sdk.core.webview.c.a {
    private final android.os.Handler acR;
    private com.kwad.sdk.core.webview.c.c ack;
    private final com.kwad.components.core.webview.jshandler.ba.c aei;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.ksad.json.annotation.KsJson
    public static final class a extends com.kwad.sdk.core.response.a.a implements com.kwad.sdk.core.b {
        public java.lang.String displayLikeUserCount;
        public java.lang.String displayWatchingUserCount;
        public int likeUserCount;
        public long liveDuration;
        public int status;
        public long totalWatchingDuration;
        public int watchingUserCount;

        public a() {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "0"
                r1.displayWatchingUserCount = r0
                r1.displayLikeUserCount = r0
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class b {
        java.lang.ref.WeakReference<com.kwad.sdk.core.webview.c.c> aek;

        public b(com.kwad.sdk.core.webview.c.c r2) {
                r1 = this;
                r1.<init>()
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r0.<init>(r2)
                r1.aek = r0
                return
        }

        public final void a(com.kwad.components.core.webview.jshandler.ba.a r2) {
                r1 = this;
                java.lang.ref.WeakReference<com.kwad.sdk.core.webview.c.c> r0 = r1.aek
                java.lang.Object r0 = r0.get()
                com.kwad.sdk.core.webview.c.c r0 = (com.kwad.sdk.core.webview.c.c) r0
                if (r0 == 0) goto Ld
                r0.a(r2)
            Ld:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface c {
        void a(com.kwad.components.core.webview.jshandler.ba.b r1);
    }

    public ba(com.kwad.components.core.webview.jshandler.ba.c r3) {
            r2 = this;
            r2.<init>()
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            r2.acR = r0
            r2.aei = r3
            return
    }

    static /* synthetic */ com.kwad.sdk.core.webview.c.c a(com.kwad.components.core.webview.jshandler.ba r0) {
            com.kwad.sdk.core.webview.c.c r0 = r0.ack
            return r0
    }

    static /* synthetic */ com.kwad.components.core.webview.jshandler.ba.c b(com.kwad.components.core.webview.jshandler.ba r0) {
            com.kwad.components.core.webview.jshandler.ba$c r0 = r0.aei
            return r0
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(java.lang.String r1, @androidx.annotation.NonNull com.kwad.sdk.core.webview.c.c r2) {
            r0 = this;
            r0.ack = r2
            android.os.Handler r1 = r0.acR
            com.kwad.components.core.webview.jshandler.ba$1 r2 = new com.kwad.components.core.webview.jshandler.ba$1
            r2.<init>(r0)
            r1.post(r2)
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    @androidx.annotation.NonNull
    public final java.lang.String getKey() {
            r1 = this;
            java.lang.String r0 = "registerLiveListener"
            return r0
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
            r2 = this;
            r0 = 0
            r2.ack = r0
            android.os.Handler r1 = r2.acR
            r1.removeCallbacksAndMessages(r0)
            return
    }
}
