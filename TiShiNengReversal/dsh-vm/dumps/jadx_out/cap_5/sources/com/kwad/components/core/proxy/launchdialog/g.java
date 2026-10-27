package com.kwad.components.core.proxy.launchdialog;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public interface g {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class a implements com.kwad.components.core.proxy.launchdialog.g {
        private long WG;

        public a(long r1) {
                r0 = this;
                r0.<init>()
                r0.WG = r1
                return
        }

        public final boolean K(long r7) {
                r6 = this;
                long r0 = r6.WG
                r2 = 0
                r4 = 0
                int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r5 > 0) goto La
                return r4
            La:
                long r0 = java.lang.System.currentTimeMillis()
                long r0 = r0 - r7
                long r7 = r6.WG
                int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
                if (r2 < 0) goto L17
                r7 = 1
                return r7
            L17:
                return r4
        }

        public final java.lang.String toString() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "DurationMoreThanItem{mDuration="
                r0.<init>(r1)
                long r1 = r3.WG
                r0.append(r1)
                r1 = 125(0x7d, float:1.75E-43)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class b implements com.kwad.components.core.proxy.launchdialog.g {
        private androidx.lifecycle.Lifecycle.Event Wz;

        public b(androidx.lifecycle.Lifecycle.Event r1) {
                r0 = this;
                r0.<init>()
                r0.Wz = r1
                return
        }

        public final boolean b(androidx.lifecycle.Lifecycle.Event r2) {
                r1 = this;
                androidx.lifecycle.Lifecycle$Event r0 = r1.Wz
                boolean r2 = r0.equals(r2)
                return r2
        }

        public final java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "PageEventItem{mEvent="
                r0.<init>(r1)
                androidx.lifecycle.Lifecycle$Event r1 = r2.Wz
                r0.append(r1)
                r1 = 125(0x7d, float:1.75E-43)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }
}
