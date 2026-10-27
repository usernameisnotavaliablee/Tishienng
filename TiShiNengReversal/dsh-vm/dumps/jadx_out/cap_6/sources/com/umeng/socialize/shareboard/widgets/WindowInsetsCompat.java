package com.umeng.socialize.shareboard.widgets;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
class WindowInsetsCompat {
    private static final com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.WindowInsetsCompatImpl IMPL = null;
    private final java.lang.Object mInsets;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @android.annotation.TargetApi(20)
    private static class WindowInsetsCompatApi20Impl extends com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.WindowInsetsCompatBaseImpl {
        WindowInsetsCompatApi20Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.WindowInsetsCompatBaseImpl, com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.WindowInsetsCompatImpl
        public com.umeng.socialize.shareboard.widgets.WindowInsetsCompat consumeSystemWindowInsets(java.lang.Object r2) {
                r1 = this;
                com.umeng.socialize.shareboard.widgets.WindowInsetsCompat r0 = new com.umeng.socialize.shareboard.widgets.WindowInsetsCompat
                android.view.WindowInsets r2 = (android.view.WindowInsets) r2
                android.view.WindowInsets r2 = r2.consumeSystemWindowInsets()
                r0.<init>(r2)
                return r0
        }

        @Override // com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.WindowInsetsCompatBaseImpl, com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.WindowInsetsCompatImpl
        public java.lang.Object getSourceWindowInsets(java.lang.Object r2) {
                r1 = this;
                android.view.WindowInsets r0 = new android.view.WindowInsets
                android.view.WindowInsets r2 = (android.view.WindowInsets) r2
                r0.<init>(r2)
                return r0
        }

        @Override // com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.WindowInsetsCompatBaseImpl, com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.WindowInsetsCompatImpl
        public int getSystemWindowInsetBottom(java.lang.Object r1) {
                r0 = this;
                android.view.WindowInsets r1 = (android.view.WindowInsets) r1
                int r1 = r1.getSystemWindowInsetBottom()
                return r1
        }

        @Override // com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.WindowInsetsCompatBaseImpl, com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.WindowInsetsCompatImpl
        public int getSystemWindowInsetLeft(java.lang.Object r1) {
                r0 = this;
                android.view.WindowInsets r1 = (android.view.WindowInsets) r1
                int r1 = r1.getSystemWindowInsetLeft()
                return r1
        }

        @Override // com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.WindowInsetsCompatBaseImpl, com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.WindowInsetsCompatImpl
        public int getSystemWindowInsetRight(java.lang.Object r1) {
                r0 = this;
                android.view.WindowInsets r1 = (android.view.WindowInsets) r1
                int r1 = r1.getSystemWindowInsetRight()
                return r1
        }

        @Override // com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.WindowInsetsCompatBaseImpl, com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.WindowInsetsCompatImpl
        public int getSystemWindowInsetTop(java.lang.Object r1) {
                r0 = this;
                android.view.WindowInsets r1 = (android.view.WindowInsets) r1
                int r1 = r1.getSystemWindowInsetTop()
                return r1
        }

        @Override // com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.WindowInsetsCompatBaseImpl, com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.WindowInsetsCompatImpl
        public boolean hasInsets(java.lang.Object r1) {
                r0 = this;
                android.view.WindowInsets r1 = (android.view.WindowInsets) r1
                boolean r1 = r1.hasInsets()
                return r1
        }

        @Override // com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.WindowInsetsCompatBaseImpl, com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.WindowInsetsCompatImpl
        public boolean hasSystemWindowInsets(java.lang.Object r1) {
                r0 = this;
                android.view.WindowInsets r1 = (android.view.WindowInsets) r1
                boolean r1 = r1.hasSystemWindowInsets()
                return r1
        }

        @Override // com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.WindowInsetsCompatBaseImpl, com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.WindowInsetsCompatImpl
        public boolean isRound(java.lang.Object r1) {
                r0 = this;
                android.view.WindowInsets r1 = (android.view.WindowInsets) r1
                boolean r1 = r1.isRound()
                return r1
        }

        @Override // com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.WindowInsetsCompatBaseImpl, com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.WindowInsetsCompatImpl
        public com.umeng.socialize.shareboard.widgets.WindowInsetsCompat replaceSystemWindowInsets(java.lang.Object r2, int r3, int r4, int r5, int r6) {
                r1 = this;
                com.umeng.socialize.shareboard.widgets.WindowInsetsCompat r0 = new com.umeng.socialize.shareboard.widgets.WindowInsetsCompat
                android.view.WindowInsets r2 = (android.view.WindowInsets) r2
                android.view.WindowInsets r2 = r2.replaceSystemWindowInsets(r3, r4, r5, r6)
                r0.<init>(r2)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @android.annotation.TargetApi(21)
    private static class WindowInsetsCompatApi21Impl extends com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.WindowInsetsCompatApi20Impl {
        WindowInsetsCompatApi21Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.WindowInsetsCompatBaseImpl, com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.WindowInsetsCompatImpl
        public com.umeng.socialize.shareboard.widgets.WindowInsetsCompat consumeStableInsets(java.lang.Object r2) {
                r1 = this;
                com.umeng.socialize.shareboard.widgets.WindowInsetsCompat r0 = new com.umeng.socialize.shareboard.widgets.WindowInsetsCompat
                android.view.WindowInsets r2 = (android.view.WindowInsets) r2
                android.view.WindowInsets r2 = r2.consumeStableInsets()
                r0.<init>(r2)
                return r0
        }

        @Override // com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.WindowInsetsCompatBaseImpl, com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.WindowInsetsCompatImpl
        public int getStableInsetBottom(java.lang.Object r1) {
                r0 = this;
                android.view.WindowInsets r1 = (android.view.WindowInsets) r1
                int r1 = r1.getStableInsetBottom()
                return r1
        }

        @Override // com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.WindowInsetsCompatBaseImpl, com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.WindowInsetsCompatImpl
        public int getStableInsetLeft(java.lang.Object r1) {
                r0 = this;
                android.view.WindowInsets r1 = (android.view.WindowInsets) r1
                int r1 = r1.getStableInsetLeft()
                return r1
        }

        @Override // com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.WindowInsetsCompatBaseImpl, com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.WindowInsetsCompatImpl
        public int getStableInsetRight(java.lang.Object r1) {
                r0 = this;
                android.view.WindowInsets r1 = (android.view.WindowInsets) r1
                int r1 = r1.getStableInsetRight()
                return r1
        }

        @Override // com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.WindowInsetsCompatBaseImpl, com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.WindowInsetsCompatImpl
        public int getStableInsetTop(java.lang.Object r1) {
                r0 = this;
                android.view.WindowInsets r1 = (android.view.WindowInsets) r1
                int r1 = r1.getStableInsetTop()
                return r1
        }

        @Override // com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.WindowInsetsCompatBaseImpl, com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.WindowInsetsCompatImpl
        public boolean hasStableInsets(java.lang.Object r1) {
                r0 = this;
                android.view.WindowInsets r1 = (android.view.WindowInsets) r1
                boolean r1 = r1.hasStableInsets()
                return r1
        }

        @Override // com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.WindowInsetsCompatBaseImpl, com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.WindowInsetsCompatImpl
        public boolean isConsumed(java.lang.Object r1) {
                r0 = this;
                android.view.WindowInsets r1 = (android.view.WindowInsets) r1
                boolean r1 = r1.isConsumed()
                return r1
        }

        @Override // com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.WindowInsetsCompatBaseImpl, com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.WindowInsetsCompatImpl
        public com.umeng.socialize.shareboard.widgets.WindowInsetsCompat replaceSystemWindowInsets(java.lang.Object r2, android.graphics.Rect r3) {
                r1 = this;
                com.umeng.socialize.shareboard.widgets.WindowInsetsCompat r0 = new com.umeng.socialize.shareboard.widgets.WindowInsetsCompat
                android.view.WindowInsets r2 = (android.view.WindowInsets) r2
                android.view.WindowInsets r2 = r2.replaceSystemWindowInsets(r3)
                r0.<init>(r2)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class WindowInsetsCompatBaseImpl implements com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.WindowInsetsCompatImpl {
        WindowInsetsCompatBaseImpl() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.WindowInsetsCompatImpl
        public com.umeng.socialize.shareboard.widgets.WindowInsetsCompat consumeStableInsets(java.lang.Object r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.WindowInsetsCompatImpl
        public com.umeng.socialize.shareboard.widgets.WindowInsetsCompat consumeSystemWindowInsets(java.lang.Object r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.WindowInsetsCompatImpl
        public java.lang.Object getSourceWindowInsets(java.lang.Object r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.WindowInsetsCompatImpl
        public int getStableInsetBottom(java.lang.Object r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.WindowInsetsCompatImpl
        public int getStableInsetLeft(java.lang.Object r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.WindowInsetsCompatImpl
        public int getStableInsetRight(java.lang.Object r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.WindowInsetsCompatImpl
        public int getStableInsetTop(java.lang.Object r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.WindowInsetsCompatImpl
        public int getSystemWindowInsetBottom(java.lang.Object r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.WindowInsetsCompatImpl
        public int getSystemWindowInsetLeft(java.lang.Object r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.WindowInsetsCompatImpl
        public int getSystemWindowInsetRight(java.lang.Object r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.WindowInsetsCompatImpl
        public int getSystemWindowInsetTop(java.lang.Object r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.WindowInsetsCompatImpl
        public boolean hasInsets(java.lang.Object r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.WindowInsetsCompatImpl
        public boolean hasStableInsets(java.lang.Object r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.WindowInsetsCompatImpl
        public boolean hasSystemWindowInsets(java.lang.Object r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.WindowInsetsCompatImpl
        public boolean isConsumed(java.lang.Object r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.WindowInsetsCompatImpl
        public boolean isRound(java.lang.Object r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.WindowInsetsCompatImpl
        public com.umeng.socialize.shareboard.widgets.WindowInsetsCompat replaceSystemWindowInsets(java.lang.Object r1, int r2, int r3, int r4, int r5) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.WindowInsetsCompatImpl
        public com.umeng.socialize.shareboard.widgets.WindowInsetsCompat replaceSystemWindowInsets(java.lang.Object r1, android.graphics.Rect r2) {
                r0 = this;
                r1 = 0
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private interface WindowInsetsCompatImpl {
        com.umeng.socialize.shareboard.widgets.WindowInsetsCompat consumeStableInsets(java.lang.Object r1);

        com.umeng.socialize.shareboard.widgets.WindowInsetsCompat consumeSystemWindowInsets(java.lang.Object r1);

        java.lang.Object getSourceWindowInsets(java.lang.Object r1);

        int getStableInsetBottom(java.lang.Object r1);

        int getStableInsetLeft(java.lang.Object r1);

        int getStableInsetRight(java.lang.Object r1);

        int getStableInsetTop(java.lang.Object r1);

        int getSystemWindowInsetBottom(java.lang.Object r1);

        int getSystemWindowInsetLeft(java.lang.Object r1);

        int getSystemWindowInsetRight(java.lang.Object r1);

        int getSystemWindowInsetTop(java.lang.Object r1);

        boolean hasInsets(java.lang.Object r1);

        boolean hasStableInsets(java.lang.Object r1);

        boolean hasSystemWindowInsets(java.lang.Object r1);

        boolean isConsumed(java.lang.Object r1);

        boolean isRound(java.lang.Object r1);

        com.umeng.socialize.shareboard.widgets.WindowInsetsCompat replaceSystemWindowInsets(java.lang.Object r1, int r2, int r3, int r4, int r5);

        com.umeng.socialize.shareboard.widgets.WindowInsetsCompat replaceSystemWindowInsets(java.lang.Object r1, android.graphics.Rect r2);
    }

    static {
            com.umeng.socialize.shareboard.widgets.WindowInsetsCompat$WindowInsetsCompatApi21Impl r0 = new com.umeng.socialize.shareboard.widgets.WindowInsetsCompat$WindowInsetsCompatApi21Impl
            r0.<init>()
            com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.IMPL = r0
            return
    }

    public WindowInsetsCompat(com.umeng.socialize.shareboard.widgets.WindowInsetsCompat r2) {
            r1 = this;
            r1.<init>()
            if (r2 != 0) goto L7
            r2 = 0
            goto Lf
        L7:
            com.umeng.socialize.shareboard.widgets.WindowInsetsCompat$WindowInsetsCompatImpl r0 = com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.IMPL
            java.lang.Object r2 = r2.mInsets
            java.lang.Object r2 = r0.getSourceWindowInsets(r2)
        Lf:
            r1.mInsets = r2
            return
    }

    WindowInsetsCompat(java.lang.Object r1) {
            r0 = this;
            r0.<init>()
            r0.mInsets = r1
            return
    }

    static java.lang.Object unwrap(com.umeng.socialize.shareboard.widgets.WindowInsetsCompat r0) {
            if (r0 != 0) goto L4
            r0 = 0
            return r0
        L4:
            java.lang.Object r0 = r0.mInsets
            return r0
    }

    static com.umeng.socialize.shareboard.widgets.WindowInsetsCompat wrap(java.lang.Object r1) {
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            com.umeng.socialize.shareboard.widgets.WindowInsetsCompat r0 = new com.umeng.socialize.shareboard.widgets.WindowInsetsCompat
            r0.<init>(r1)
            return r0
    }

    public com.umeng.socialize.shareboard.widgets.WindowInsetsCompat consumeStableInsets() {
            r2 = this;
            com.umeng.socialize.shareboard.widgets.WindowInsetsCompat$WindowInsetsCompatImpl r0 = com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.IMPL
            java.lang.Object r1 = r2.mInsets
            com.umeng.socialize.shareboard.widgets.WindowInsetsCompat r0 = r0.consumeStableInsets(r1)
            return r0
    }

    public com.umeng.socialize.shareboard.widgets.WindowInsetsCompat consumeSystemWindowInsets() {
            r2 = this;
            com.umeng.socialize.shareboard.widgets.WindowInsetsCompat$WindowInsetsCompatImpl r0 = com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.IMPL
            java.lang.Object r1 = r2.mInsets
            com.umeng.socialize.shareboard.widgets.WindowInsetsCompat r0 = r0.consumeSystemWindowInsets(r1)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L23
            java.lang.Class r2 = r4.getClass()
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L12
            goto L23
        L12:
            com.umeng.socialize.shareboard.widgets.WindowInsetsCompat r5 = (com.umeng.socialize.shareboard.widgets.WindowInsetsCompat) r5
            java.lang.Object r2 = r4.mInsets
            java.lang.Object r5 = r5.mInsets
            if (r2 != 0) goto L1e
            if (r5 != 0) goto L1d
            return r0
        L1d:
            return r1
        L1e:
            boolean r5 = r2.equals(r5)
            return r5
        L23:
            return r1
    }

    public int getStableInsetBottom() {
            r2 = this;
            com.umeng.socialize.shareboard.widgets.WindowInsetsCompat$WindowInsetsCompatImpl r0 = com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.IMPL
            java.lang.Object r1 = r2.mInsets
            int r0 = r0.getStableInsetBottom(r1)
            return r0
    }

    public int getStableInsetLeft() {
            r2 = this;
            com.umeng.socialize.shareboard.widgets.WindowInsetsCompat$WindowInsetsCompatImpl r0 = com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.IMPL
            java.lang.Object r1 = r2.mInsets
            int r0 = r0.getStableInsetLeft(r1)
            return r0
    }

    public int getStableInsetRight() {
            r2 = this;
            com.umeng.socialize.shareboard.widgets.WindowInsetsCompat$WindowInsetsCompatImpl r0 = com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.IMPL
            java.lang.Object r1 = r2.mInsets
            int r0 = r0.getStableInsetRight(r1)
            return r0
    }

    public int getStableInsetTop() {
            r2 = this;
            com.umeng.socialize.shareboard.widgets.WindowInsetsCompat$WindowInsetsCompatImpl r0 = com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.IMPL
            java.lang.Object r1 = r2.mInsets
            int r0 = r0.getStableInsetTop(r1)
            return r0
    }

    public int getSystemWindowInsetBottom() {
            r2 = this;
            com.umeng.socialize.shareboard.widgets.WindowInsetsCompat$WindowInsetsCompatImpl r0 = com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.IMPL
            java.lang.Object r1 = r2.mInsets
            int r0 = r0.getSystemWindowInsetBottom(r1)
            return r0
    }

    public int getSystemWindowInsetLeft() {
            r2 = this;
            com.umeng.socialize.shareboard.widgets.WindowInsetsCompat$WindowInsetsCompatImpl r0 = com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.IMPL
            java.lang.Object r1 = r2.mInsets
            int r0 = r0.getSystemWindowInsetLeft(r1)
            return r0
    }

    public int getSystemWindowInsetRight() {
            r2 = this;
            com.umeng.socialize.shareboard.widgets.WindowInsetsCompat$WindowInsetsCompatImpl r0 = com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.IMPL
            java.lang.Object r1 = r2.mInsets
            int r0 = r0.getSystemWindowInsetRight(r1)
            return r0
    }

    public int getSystemWindowInsetTop() {
            r2 = this;
            com.umeng.socialize.shareboard.widgets.WindowInsetsCompat$WindowInsetsCompatImpl r0 = com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.IMPL
            java.lang.Object r1 = r2.mInsets
            int r0 = r0.getSystemWindowInsetTop(r1)
            return r0
    }

    public boolean hasInsets() {
            r2 = this;
            com.umeng.socialize.shareboard.widgets.WindowInsetsCompat$WindowInsetsCompatImpl r0 = com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.IMPL
            java.lang.Object r1 = r2.mInsets
            boolean r0 = r0.hasInsets(r1)
            return r0
    }

    public boolean hasStableInsets() {
            r2 = this;
            com.umeng.socialize.shareboard.widgets.WindowInsetsCompat$WindowInsetsCompatImpl r0 = com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.IMPL
            java.lang.Object r1 = r2.mInsets
            boolean r0 = r0.hasStableInsets(r1)
            return r0
    }

    public boolean hasSystemWindowInsets() {
            r2 = this;
            com.umeng.socialize.shareboard.widgets.WindowInsetsCompat$WindowInsetsCompatImpl r0 = com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.IMPL
            java.lang.Object r1 = r2.mInsets
            boolean r0 = r0.hasSystemWindowInsets(r1)
            return r0
    }

    public int hashCode() {
            r1 = this;
            java.lang.Object r0 = r1.mInsets
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            int r0 = r0.hashCode()
            return r0
    }

    public boolean isConsumed() {
            r2 = this;
            com.umeng.socialize.shareboard.widgets.WindowInsetsCompat$WindowInsetsCompatImpl r0 = com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.IMPL
            java.lang.Object r1 = r2.mInsets
            boolean r0 = r0.isConsumed(r1)
            return r0
    }

    public boolean isRound() {
            r2 = this;
            com.umeng.socialize.shareboard.widgets.WindowInsetsCompat$WindowInsetsCompatImpl r0 = com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.IMPL
            java.lang.Object r1 = r2.mInsets
            boolean r0 = r0.isRound(r1)
            return r0
    }

    public com.umeng.socialize.shareboard.widgets.WindowInsetsCompat replaceSystemWindowInsets(int r7, int r8, int r9, int r10) {
            r6 = this;
            com.umeng.socialize.shareboard.widgets.WindowInsetsCompat$WindowInsetsCompatImpl r0 = com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.IMPL
            java.lang.Object r1 = r6.mInsets
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            com.umeng.socialize.shareboard.widgets.WindowInsetsCompat r7 = r0.replaceSystemWindowInsets(r1, r2, r3, r4, r5)
            return r7
    }

    public com.umeng.socialize.shareboard.widgets.WindowInsetsCompat replaceSystemWindowInsets(android.graphics.Rect r3) {
            r2 = this;
            com.umeng.socialize.shareboard.widgets.WindowInsetsCompat$WindowInsetsCompatImpl r0 = com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.IMPL
            java.lang.Object r1 = r2.mInsets
            com.umeng.socialize.shareboard.widgets.WindowInsetsCompat r3 = r0.replaceSystemWindowInsets(r1, r3)
            return r3
    }
}
