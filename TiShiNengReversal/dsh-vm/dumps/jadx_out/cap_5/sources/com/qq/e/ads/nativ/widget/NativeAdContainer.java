package com.qq.e.ads.nativ.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class NativeAdContainer extends android.widget.FrameLayout {
    private com.qq.e.ads.nativ.widget.ViewStatusListener a;
    private com.qq.e.ads.nativ.widget.NativeAdContainer.ViewStatus b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.qq.e.ads.nativ.widget.NativeAdContainer$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = null;

        static {
                com.qq.e.ads.nativ.widget.NativeAdContainer$ViewStatus[] r0 = com.qq.e.ads.nativ.widget.NativeAdContainer.ViewStatus.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.qq.e.ads.nativ.widget.NativeAdContainer.AnonymousClass1.a = r0
                com.qq.e.ads.nativ.widget.NativeAdContainer$ViewStatus r1 = com.qq.e.ads.nativ.widget.NativeAdContainer.ViewStatus.ATTACHED     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.qq.e.ads.nativ.widget.NativeAdContainer.AnonymousClass1.a     // Catch: java.lang.NoSuchFieldError -> L1d
                com.qq.e.ads.nativ.widget.NativeAdContainer$ViewStatus r1 = com.qq.e.ads.nativ.widget.NativeAdContainer.ViewStatus.DETACHED     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                return
        }

        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private enum ViewStatus extends java.lang.Enum<com.qq.e.ads.nativ.widget.NativeAdContainer.ViewStatus> {
        public static final com.qq.e.ads.nativ.widget.NativeAdContainer.ViewStatus ATTACHED = null;
        public static final com.qq.e.ads.nativ.widget.NativeAdContainer.ViewStatus DETACHED = null;
        public static final com.qq.e.ads.nativ.widget.NativeAdContainer.ViewStatus INIT = null;
        private static final /* synthetic */ com.qq.e.ads.nativ.widget.NativeAdContainer.ViewStatus[] a = null;

        static {
                com.qq.e.ads.nativ.widget.NativeAdContainer$ViewStatus r0 = new com.qq.e.ads.nativ.widget.NativeAdContainer$ViewStatus
                java.lang.String r1 = "INIT"
                r2 = 0
                r0.<init>(r1, r2)
                com.qq.e.ads.nativ.widget.NativeAdContainer.ViewStatus.INIT = r0
                com.qq.e.ads.nativ.widget.NativeAdContainer$ViewStatus r0 = new com.qq.e.ads.nativ.widget.NativeAdContainer$ViewStatus
                java.lang.String r1 = "ATTACHED"
                r2 = 1
                r0.<init>(r1, r2)
                com.qq.e.ads.nativ.widget.NativeAdContainer.ViewStatus.ATTACHED = r0
                com.qq.e.ads.nativ.widget.NativeAdContainer$ViewStatus r0 = new com.qq.e.ads.nativ.widget.NativeAdContainer$ViewStatus
                java.lang.String r1 = "DETACHED"
                r2 = 2
                r0.<init>(r1, r2)
                com.qq.e.ads.nativ.widget.NativeAdContainer.ViewStatus.DETACHED = r0
                com.qq.e.ads.nativ.widget.NativeAdContainer$ViewStatus[] r0 = a()
                com.qq.e.ads.nativ.widget.NativeAdContainer.ViewStatus.a = r0
                return
        }

        ViewStatus(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        private static /* synthetic */ com.qq.e.ads.nativ.widget.NativeAdContainer.ViewStatus[] a() {
                r0 = 3
                com.qq.e.ads.nativ.widget.NativeAdContainer$ViewStatus[] r0 = new com.qq.e.ads.nativ.widget.NativeAdContainer.ViewStatus[r0]
                com.qq.e.ads.nativ.widget.NativeAdContainer$ViewStatus r1 = com.qq.e.ads.nativ.widget.NativeAdContainer.ViewStatus.INIT
                r2 = 0
                r0[r2] = r1
                com.qq.e.ads.nativ.widget.NativeAdContainer$ViewStatus r1 = com.qq.e.ads.nativ.widget.NativeAdContainer.ViewStatus.ATTACHED
                r2 = 1
                r0[r2] = r1
                com.qq.e.ads.nativ.widget.NativeAdContainer$ViewStatus r1 = com.qq.e.ads.nativ.widget.NativeAdContainer.ViewStatus.DETACHED
                r2 = 2
                r0[r2] = r1
                return r0
        }

        public static com.qq.e.ads.nativ.widget.NativeAdContainer.ViewStatus valueOf(java.lang.String r1) {
                java.lang.Class<com.qq.e.ads.nativ.widget.NativeAdContainer$ViewStatus> r0 = com.qq.e.ads.nativ.widget.NativeAdContainer.ViewStatus.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.qq.e.ads.nativ.widget.NativeAdContainer$ViewStatus r1 = (com.qq.e.ads.nativ.widget.NativeAdContainer.ViewStatus) r1
                return r1
        }

        public static com.qq.e.ads.nativ.widget.NativeAdContainer.ViewStatus[] values() {
                com.qq.e.ads.nativ.widget.NativeAdContainer$ViewStatus[] r0 = com.qq.e.ads.nativ.widget.NativeAdContainer.ViewStatus.a
                java.lang.Object r0 = r0.clone()
                com.qq.e.ads.nativ.widget.NativeAdContainer$ViewStatus[] r0 = (com.qq.e.ads.nativ.widget.NativeAdContainer.ViewStatus[]) r0
                return r0
        }
    }

    static {
            return
    }

    public NativeAdContainer(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            com.qq.e.ads.nativ.widget.NativeAdContainer$ViewStatus r1 = com.qq.e.ads.nativ.widget.NativeAdContainer.ViewStatus.INIT
            r0.b = r1
            return
    }

    public NativeAdContainer(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            com.qq.e.ads.nativ.widget.NativeAdContainer$ViewStatus r1 = com.qq.e.ads.nativ.widget.NativeAdContainer.ViewStatus.INIT
            r0.b = r1
            return
    }

    public NativeAdContainer(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            com.qq.e.ads.nativ.widget.NativeAdContainer$ViewStatus r1 = com.qq.e.ads.nativ.widget.NativeAdContainer.ViewStatus.INIT
            r0.b = r1
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent r2) {
            r1 = this;
            com.qq.e.ads.nativ.widget.ViewStatusListener r0 = r1.a
            if (r0 == 0) goto L7
            r0.onDispatchTouchEvent(r2)
        L7:
            boolean r2 = super.dispatchTouchEvent(r2)
            return r2
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
            r1 = this;
            super.onAttachedToWindow()
            com.qq.e.ads.nativ.widget.NativeAdContainer$ViewStatus r0 = com.qq.e.ads.nativ.widget.NativeAdContainer.ViewStatus.ATTACHED
            r1.b = r0
            com.qq.e.ads.nativ.widget.ViewStatusListener r0 = r1.a
            if (r0 == 0) goto Le
            r0.onAttachToWindow()
        Le:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
            r1 = this;
            super.onDetachedFromWindow()
            com.qq.e.ads.nativ.widget.NativeAdContainer$ViewStatus r0 = com.qq.e.ads.nativ.widget.NativeAdContainer.ViewStatus.DETACHED
            r1.b = r0
            com.qq.e.ads.nativ.widget.ViewStatusListener r0 = r1.a
            if (r0 == 0) goto Le
            r0.onDetachFromWindow()
        Le:
            return
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean r2) {
            r1 = this;
            super.onWindowFocusChanged(r2)
            com.qq.e.ads.nativ.widget.ViewStatusListener r0 = r1.a
            if (r0 == 0) goto La
            r0.onWindowFocusChanged(r2)
        La:
            return
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int r2) {
            r1 = this;
            super.onWindowVisibilityChanged(r2)
            com.qq.e.ads.nativ.widget.ViewStatusListener r0 = r1.a
            if (r0 == 0) goto La
            r0.onWindowVisibilityChanged(r2)
        La:
            return
    }

    public void setViewStatusListener(com.qq.e.ads.nativ.widget.ViewStatusListener r2) {
            r1 = this;
            r1.a = r2
            if (r2 == 0) goto L20
            int[] r2 = com.qq.e.ads.nativ.widget.NativeAdContainer.AnonymousClass1.a
            com.qq.e.ads.nativ.widget.NativeAdContainer$ViewStatus r0 = r1.b
            int r0 = r0.ordinal()
            r2 = r2[r0]
            r0 = 1
            if (r2 == r0) goto L1b
            r0 = 2
            if (r2 == r0) goto L15
            goto L20
        L15:
            com.qq.e.ads.nativ.widget.ViewStatusListener r2 = r1.a
            r2.onDetachFromWindow()
            return
        L1b:
            com.qq.e.ads.nativ.widget.ViewStatusListener r2 = r1.a
            r2.onAttachToWindow()
        L20:
            return
    }
}
