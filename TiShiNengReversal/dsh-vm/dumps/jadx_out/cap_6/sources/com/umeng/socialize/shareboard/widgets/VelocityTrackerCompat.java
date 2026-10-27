package com.umeng.socialize.shareboard.widgets;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
class VelocityTrackerCompat {
    private static final com.umeng.socialize.shareboard.widgets.VelocityTrackerCompat.VelocityTrackerVersionImpl IMPL = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.umeng.socialize.shareboard.widgets.VelocityTrackerCompat$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class BaseVelocityTrackerVersionImpl implements com.umeng.socialize.shareboard.widgets.VelocityTrackerCompat.VelocityTrackerVersionImpl {
        private BaseVelocityTrackerVersionImpl() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ BaseVelocityTrackerVersionImpl(com.umeng.socialize.shareboard.widgets.VelocityTrackerCompat.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.umeng.socialize.shareboard.widgets.VelocityTrackerCompat.VelocityTrackerVersionImpl
        public float getXVelocity(android.view.VelocityTracker r1, int r2) {
                r0 = this;
                float r1 = r1.getXVelocity()
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class HoneycombVelocityTrackerVersionImpl implements com.umeng.socialize.shareboard.widgets.VelocityTrackerCompat.VelocityTrackerVersionImpl {
        private HoneycombVelocityTrackerVersionImpl() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ HoneycombVelocityTrackerVersionImpl(com.umeng.socialize.shareboard.widgets.VelocityTrackerCompat.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.umeng.socialize.shareboard.widgets.VelocityTrackerCompat.VelocityTrackerVersionImpl
        public float getXVelocity(android.view.VelocityTracker r1, int r2) {
                r0 = this;
                float r1 = r1.getXVelocity(r2)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    interface VelocityTrackerVersionImpl {
        float getXVelocity(android.view.VelocityTracker r1, int r2);
    }

    static {
            com.umeng.socialize.shareboard.widgets.VelocityTrackerCompat$HoneycombVelocityTrackerVersionImpl r0 = new com.umeng.socialize.shareboard.widgets.VelocityTrackerCompat$HoneycombVelocityTrackerVersionImpl
            r1 = 0
            r0.<init>(r1)
            com.umeng.socialize.shareboard.widgets.VelocityTrackerCompat.IMPL = r0
            return
    }

    VelocityTrackerCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    static float getXVelocity(android.view.VelocityTracker r1, int r2) {
            com.umeng.socialize.shareboard.widgets.VelocityTrackerCompat$VelocityTrackerVersionImpl r0 = com.umeng.socialize.shareboard.widgets.VelocityTrackerCompat.IMPL
            float r1 = r0.getXVelocity(r1, r2)
            return r1
    }
}
