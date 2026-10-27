package com.umeng.socialize.shareboard.widgets;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
class ViewCompat {
    private static final long FAKE_FRAME_TIME = 10;
    private static final com.umeng.socialize.shareboard.widgets.ViewCompat.ViewCompatImpl IMPL = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.umeng.socialize.shareboard.widgets.ViewCompat$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class Api24ViewCompatImpl extends com.umeng.socialize.shareboard.widgets.ViewCompat.MarshmallowViewCompatImpl {
        private Api24ViewCompatImpl() {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                return
        }

        /* synthetic */ Api24ViewCompatImpl(com.umeng.socialize.shareboard.widgets.ViewCompat.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class BaseViewCompatImpl implements com.umeng.socialize.shareboard.widgets.ViewCompat.ViewCompatImpl {
        BaseViewCompatImpl() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.umeng.socialize.shareboard.widgets.ViewCompat.ViewCompatImpl
        public boolean canScrollHorizontally(android.view.View r1, int r2) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // com.umeng.socialize.shareboard.widgets.ViewCompat.ViewCompatImpl
        public com.umeng.socialize.shareboard.widgets.WindowInsetsCompat dispatchApplyWindowInsets(android.view.View r1, com.umeng.socialize.shareboard.widgets.WindowInsetsCompat r2) {
                r0 = this;
                return r2
        }

        long getFrameTime() {
                r2 = this;
                r0 = 10
                return r0
        }

        @Override // com.umeng.socialize.shareboard.widgets.ViewCompat.ViewCompatImpl
        public com.umeng.socialize.shareboard.widgets.WindowInsetsCompat onApplyWindowInsets(android.view.View r1, com.umeng.socialize.shareboard.widgets.WindowInsetsCompat r2) {
                r0 = this;
                return r2
        }

        @Override // com.umeng.socialize.shareboard.widgets.ViewCompat.ViewCompatImpl
        public void postInvalidateOnAnimation(android.view.View r1) {
                r0 = this;
                r1.invalidate()
                return
        }

        @Override // com.umeng.socialize.shareboard.widgets.ViewCompat.ViewCompatImpl
        public void postOnAnimation(android.view.View r3, java.lang.Runnable r4) {
                r2 = this;
                long r0 = r2.getFrameTime()
                r3.postDelayed(r4, r0)
                return
        }

        @Override // com.umeng.socialize.shareboard.widgets.ViewCompat.ViewCompatImpl
        public void setOnApplyWindowInsetsListener(android.view.View r1, com.umeng.socialize.shareboard.widgets.ViewCompat.OnApplyWindowInsetsListener r2) {
                r0 = this;
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @android.annotation.TargetApi(11)
    static class HCViewCompatImpl extends com.umeng.socialize.shareboard.widgets.ViewCompat.BaseViewCompatImpl {
        HCViewCompatImpl() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.umeng.socialize.shareboard.widgets.ViewCompat.BaseViewCompatImpl
        long getFrameTime() {
                r2 = this;
                long r0 = android.animation.ValueAnimator.getFrameDelay()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class ICSMr1ViewCompatImpl extends com.umeng.socialize.shareboard.widgets.ViewCompat.ICSViewCompatImpl {
        ICSMr1ViewCompatImpl() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @android.annotation.TargetApi(14)
    static class ICSViewCompatImpl extends com.umeng.socialize.shareboard.widgets.ViewCompat.HCViewCompatImpl {
        ICSViewCompatImpl() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.umeng.socialize.shareboard.widgets.ViewCompat.BaseViewCompatImpl, com.umeng.socialize.shareboard.widgets.ViewCompat.ViewCompatImpl
        public boolean canScrollHorizontally(android.view.View r1, int r2) {
                r0 = this;
                boolean r1 = r1.canScrollHorizontally(r2)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @android.annotation.TargetApi(16)
    static class JBViewCompatImpl extends com.umeng.socialize.shareboard.widgets.ViewCompat.ICSMr1ViewCompatImpl {
        JBViewCompatImpl() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.umeng.socialize.shareboard.widgets.ViewCompat.BaseViewCompatImpl, com.umeng.socialize.shareboard.widgets.ViewCompat.ViewCompatImpl
        public void postInvalidateOnAnimation(android.view.View r1) {
                r0 = this;
                r1.postInvalidateOnAnimation()
                return
        }

        @Override // com.umeng.socialize.shareboard.widgets.ViewCompat.BaseViewCompatImpl, com.umeng.socialize.shareboard.widgets.ViewCompat.ViewCompatImpl
        public void postOnAnimation(android.view.View r1, java.lang.Runnable r2) {
                r0 = this;
                r1.postOnAnimation(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class JbMr1ViewCompatImpl extends com.umeng.socialize.shareboard.widgets.ViewCompat.JBViewCompatImpl {
        private JbMr1ViewCompatImpl() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ JbMr1ViewCompatImpl(com.umeng.socialize.shareboard.widgets.ViewCompat.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class JbMr2ViewCompatImpl extends com.umeng.socialize.shareboard.widgets.ViewCompat.JbMr1ViewCompatImpl {
        private JbMr2ViewCompatImpl() {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                return
        }

        /* synthetic */ JbMr2ViewCompatImpl(com.umeng.socialize.shareboard.widgets.ViewCompat.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class KitKatViewCompatImpl extends com.umeng.socialize.shareboard.widgets.ViewCompat.JbMr2ViewCompatImpl {
        private KitKatViewCompatImpl() {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                return
        }

        /* synthetic */ KitKatViewCompatImpl(com.umeng.socialize.shareboard.widgets.ViewCompat.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @android.annotation.TargetApi(20)
    private static class LollipopViewCompatImpl extends com.umeng.socialize.shareboard.widgets.ViewCompat.KitKatViewCompatImpl {



        private LollipopViewCompatImpl() {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                return
        }

        /* synthetic */ LollipopViewCompatImpl(com.umeng.socialize.shareboard.widgets.ViewCompat.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        private static java.lang.Object dispatchApplyWindowInsets(android.view.View r1, java.lang.Object r2) {
                r0 = r2
                android.view.WindowInsets r0 = (android.view.WindowInsets) r0
                android.view.WindowInsets r1 = r1.dispatchApplyWindowInsets(r0)
                if (r1 == r0) goto Le
                android.view.WindowInsets r2 = new android.view.WindowInsets
                r2.<init>(r1)
            Le:
                return r2
        }

        private static java.lang.Object onApplyWindowInsets(android.view.View r1, java.lang.Object r2) {
                r0 = r2
                android.view.WindowInsets r0 = (android.view.WindowInsets) r0
                android.view.WindowInsets r1 = r1.onApplyWindowInsets(r0)
                if (r1 == r0) goto Le
                android.view.WindowInsets r2 = new android.view.WindowInsets
                r2.<init>(r1)
            Le:
                return r2
        }

        @Override // com.umeng.socialize.shareboard.widgets.ViewCompat.BaseViewCompatImpl, com.umeng.socialize.shareboard.widgets.ViewCompat.ViewCompatImpl
        public com.umeng.socialize.shareboard.widgets.WindowInsetsCompat dispatchApplyWindowInsets(android.view.View r1, com.umeng.socialize.shareboard.widgets.WindowInsetsCompat r2) {
                r0 = this;
                java.lang.Object r2 = com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.unwrap(r2)
                java.lang.Object r1 = dispatchApplyWindowInsets(r1, r2)
                com.umeng.socialize.shareboard.widgets.WindowInsetsCompat r1 = com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.wrap(r1)
                return r1
        }

        @Override // com.umeng.socialize.shareboard.widgets.ViewCompat.BaseViewCompatImpl, com.umeng.socialize.shareboard.widgets.ViewCompat.ViewCompatImpl
        public com.umeng.socialize.shareboard.widgets.WindowInsetsCompat onApplyWindowInsets(android.view.View r1, com.umeng.socialize.shareboard.widgets.WindowInsetsCompat r2) {
                r0 = this;
                java.lang.Object r2 = com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.unwrap(r2)
                java.lang.Object r1 = onApplyWindowInsets(r1, r2)
                com.umeng.socialize.shareboard.widgets.WindowInsetsCompat r1 = com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.wrap(r1)
                return r1
        }

        @Override // com.umeng.socialize.shareboard.widgets.ViewCompat.BaseViewCompatImpl, com.umeng.socialize.shareboard.widgets.ViewCompat.ViewCompatImpl
        public void setOnApplyWindowInsetsListener(android.view.View r2, com.umeng.socialize.shareboard.widgets.ViewCompat.OnApplyWindowInsetsListener r3) {
                r1 = this;
                if (r3 != 0) goto L7
                r3 = 0
                r2.setOnApplyWindowInsetsListener(r3)
                return
            L7:
                com.umeng.socialize.shareboard.widgets.ViewCompat$LollipopViewCompatImpl$1 r0 = new com.umeng.socialize.shareboard.widgets.ViewCompat$LollipopViewCompatImpl$1
                r0.<init>(r1, r3)
                com.umeng.socialize.shareboard.widgets.ViewCompat$LollipopViewCompatImpl$2 r3 = new com.umeng.socialize.shareboard.widgets.ViewCompat$LollipopViewCompatImpl$2
                r3.<init>(r1, r0)
                r2.setOnApplyWindowInsetsListener(r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class MarshmallowViewCompatImpl extends com.umeng.socialize.shareboard.widgets.ViewCompat.LollipopViewCompatImpl {
        private MarshmallowViewCompatImpl() {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                return
        }

        /* synthetic */ MarshmallowViewCompatImpl(com.umeng.socialize.shareboard.widgets.ViewCompat.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    interface OnApplyWindowInsetsListener {
        com.umeng.socialize.shareboard.widgets.WindowInsetsCompat onApplyWindowInsets(android.view.View r1, com.umeng.socialize.shareboard.widgets.WindowInsetsCompat r2);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    interface OnApplyWindowInsetsListenerBridge {
        java.lang.Object onApplyWindowInsets(android.view.View r1, java.lang.Object r2);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    interface ViewCompatImpl {
        boolean canScrollHorizontally(android.view.View r1, int r2);

        com.umeng.socialize.shareboard.widgets.WindowInsetsCompat dispatchApplyWindowInsets(android.view.View r1, com.umeng.socialize.shareboard.widgets.WindowInsetsCompat r2);

        com.umeng.socialize.shareboard.widgets.WindowInsetsCompat onApplyWindowInsets(android.view.View r1, com.umeng.socialize.shareboard.widgets.WindowInsetsCompat r2);

        void postInvalidateOnAnimation(android.view.View r1);

        void postOnAnimation(android.view.View r1, java.lang.Runnable r2);

        void setOnApplyWindowInsetsListener(android.view.View r1, com.umeng.socialize.shareboard.widgets.ViewCompat.OnApplyWindowInsetsListener r2);
    }

    static {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            r2 = 0
            if (r0 < r1) goto Lf
            com.umeng.socialize.shareboard.widgets.ViewCompat$Api24ViewCompatImpl r0 = new com.umeng.socialize.shareboard.widgets.ViewCompat$Api24ViewCompatImpl
            r0.<init>(r2)
            com.umeng.socialize.shareboard.widgets.ViewCompat.IMPL = r0
            return
        Lf:
            r1 = 23
            if (r0 < r1) goto L1b
            com.umeng.socialize.shareboard.widgets.ViewCompat$MarshmallowViewCompatImpl r0 = new com.umeng.socialize.shareboard.widgets.ViewCompat$MarshmallowViewCompatImpl
            r0.<init>(r2)
            com.umeng.socialize.shareboard.widgets.ViewCompat.IMPL = r0
            return
        L1b:
            com.umeng.socialize.shareboard.widgets.ViewCompat$LollipopViewCompatImpl r0 = new com.umeng.socialize.shareboard.widgets.ViewCompat$LollipopViewCompatImpl
            r0.<init>(r2)
            com.umeng.socialize.shareboard.widgets.ViewCompat.IMPL = r0
            return
    }

    ViewCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    static boolean canScrollHorizontally(android.view.View r1, int r2) {
            com.umeng.socialize.shareboard.widgets.ViewCompat$ViewCompatImpl r0 = com.umeng.socialize.shareboard.widgets.ViewCompat.IMPL
            boolean r1 = r0.canScrollHorizontally(r1, r2)
            return r1
    }

    public static com.umeng.socialize.shareboard.widgets.WindowInsetsCompat dispatchApplyWindowInsets(android.view.View r1, com.umeng.socialize.shareboard.widgets.WindowInsetsCompat r2) {
            com.umeng.socialize.shareboard.widgets.ViewCompat$ViewCompatImpl r0 = com.umeng.socialize.shareboard.widgets.ViewCompat.IMPL
            com.umeng.socialize.shareboard.widgets.WindowInsetsCompat r1 = r0.dispatchApplyWindowInsets(r1, r2)
            return r1
    }

    public static com.umeng.socialize.shareboard.widgets.WindowInsetsCompat onApplyWindowInsets(android.view.View r1, com.umeng.socialize.shareboard.widgets.WindowInsetsCompat r2) {
            com.umeng.socialize.shareboard.widgets.ViewCompat$ViewCompatImpl r0 = com.umeng.socialize.shareboard.widgets.ViewCompat.IMPL
            com.umeng.socialize.shareboard.widgets.WindowInsetsCompat r1 = r0.onApplyWindowInsets(r1, r2)
            return r1
    }

    static void postInvalidateOnAnimation(android.view.View r1) {
            com.umeng.socialize.shareboard.widgets.ViewCompat$ViewCompatImpl r0 = com.umeng.socialize.shareboard.widgets.ViewCompat.IMPL
            r0.postInvalidateOnAnimation(r1)
            return
    }

    static void postOnAnimation(android.view.View r1, java.lang.Runnable r2) {
            com.umeng.socialize.shareboard.widgets.ViewCompat$ViewCompatImpl r0 = com.umeng.socialize.shareboard.widgets.ViewCompat.IMPL
            r0.postOnAnimation(r1, r2)
            return
    }

    public static void setOnApplyWindowInsetsListener(android.view.View r1, com.umeng.socialize.shareboard.widgets.ViewCompat.OnApplyWindowInsetsListener r2) {
            com.umeng.socialize.shareboard.widgets.ViewCompat$ViewCompatImpl r0 = com.umeng.socialize.shareboard.widgets.ViewCompat.IMPL
            r0.setOnApplyWindowInsetsListener(r1, r2)
            return
    }
}
