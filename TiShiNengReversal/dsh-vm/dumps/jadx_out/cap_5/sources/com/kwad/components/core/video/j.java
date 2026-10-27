package com.kwad.components.core.video;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class j {
    private volatile boolean abc;
    private long abd;
    private com.kwad.components.core.video.j.a abe;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class a {
        private long abf;
        private int abg;

        public a() {
                r2 = this;
                r2.<init>()
                r0 = 0
                r2.abf = r0
                r0 = 0
                r2.abg = r0
                return
        }

        public final void accumulate(long r3) {
                r2 = this;
                long r0 = r2.abf
                long r0 = r0 + r3
                r2.abf = r0
                int r3 = r2.abg
                int r3 = r3 + 1
                r2.abg = r3
                return
        }

        public final void reset() {
                r2 = this;
                r0 = 0
                r2.abf = r0
                r0 = 0
                r2.abg = r0
                return
        }

        public final int ui() {
                r1 = this;
                int r0 = r1.abg
                return r0
        }

        public final long uj() {
                r2 = this;
                long r0 = r2.abf
                return r0
        }
    }

    public j() {
            r1 = this;
            r1.<init>()
            com.kwad.components.core.video.j$a r0 = new com.kwad.components.core.video.j$a
            r0.<init>()
            r1.abe = r0
            return
    }

    public final void reset() {
            r2 = this;
            r0 = 0
            r2.abc = r0
            r0 = 0
            r2.abd = r0
            com.kwad.components.core.video.j$a r0 = r2.abe
            r0.reset()
            return
    }

    public final void ud() {
            r2 = this;
            boolean r0 = r2.abc
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r2.abc = r0
            long r0 = android.os.SystemClock.elapsedRealtime()
            r2.abd = r0
            java.lang.String r0 = "videoStartBlock"
            com.kwad.sdk.core.video.a.a.a.eE(r0)
            return
    }

    public final void ue() {
            r4 = this;
            boolean r0 = r4.abc
            if (r0 == 0) goto L29
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r2 = r4.abd
            long r0 = r0 - r2
            com.kwad.components.core.video.j$a r2 = r4.abe
            r2.accumulate(r0)
            r2 = 0
            r4.abc = r2
            java.lang.String r2 = "videoEndBlock"
            com.kwad.sdk.core.video.a.a.a.eE(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "videoBlockTime_"
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.kwad.sdk.core.video.a.a.a.eE(r0)
        L29:
            return
    }

    public final boolean uf() {
            r1 = this;
            boolean r0 = r1.abc
            return r0
    }

    @androidx.annotation.NonNull
    public final com.kwad.components.core.video.j.a ug() {
            r5 = this;
            boolean r0 = r5.abc
            if (r0 == 0) goto L13
            com.kwad.components.core.video.j$a r0 = r5.abe
            long r1 = android.os.SystemClock.elapsedRealtime()
            long r3 = r5.abd
            long r1 = r1 - r3
            r0.accumulate(r1)
            r0 = 0
            r5.abc = r0
        L13:
            com.kwad.components.core.video.j$a r0 = r5.abe
            return r0
    }

    public final long uh() {
            r2 = this;
            long r0 = r2.abd
            return r0
    }
}
