package com.umeng.socialize.shareboard.widgets;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
class KeyEventCompat {
    private static final com.umeng.socialize.shareboard.widgets.KeyEventCompat.KeyEventVersionImpl IMPL = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.umeng.socialize.shareboard.widgets.KeyEventCompat$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class BaseKeyEventVersionImpl implements com.umeng.socialize.shareboard.widgets.KeyEventCompat.KeyEventVersionImpl {
        private static final int META_ALL_MASK = 247;
        private static final int META_MODIFIER_MASK = 247;

        private BaseKeyEventVersionImpl() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ BaseKeyEventVersionImpl(com.umeng.socialize.shareboard.widgets.KeyEventCompat.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        private static int metaStateFilterDirectionalModifiers(int r3, int r4, int r5, int r6, int r7) {
                r0 = r4 & r5
                r1 = 0
                r2 = 1
                if (r0 == 0) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                r6 = r6 | r7
                r4 = r4 & r6
                if (r4 == 0) goto Le
                r1 = 1
            Le:
                if (r0 == 0) goto L1d
                if (r1 != 0) goto L15
                int r4 = ~r6
            L13:
                r3 = r3 & r4
                return r3
            L15:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r4 = "bad arguments"
                r3.<init>(r4)
                throw r3
            L1d:
                if (r1 == 0) goto L21
                int r4 = ~r5
                goto L13
            L21:
                return r3
        }

        private int normalizeMetaState(int r2) {
                r1 = this;
                r0 = r2 & 192(0xc0, float:2.69E-43)
                if (r0 == 0) goto L6
                r2 = r2 | 1
            L6:
                r0 = r2 & 48
                if (r0 == 0) goto Lc
                r2 = r2 | 2
            Lc:
                r2 = r2 & 247(0xf7, float:3.46E-43)
                return r2
        }

        @Override // com.umeng.socialize.shareboard.widgets.KeyEventCompat.KeyEventVersionImpl
        public boolean metaStateHasModifiers(int r5, int r6) {
                r4 = this;
                int r5 = r4.normalizeMetaState(r5)
                r5 = r5 & 247(0xf7, float:3.46E-43)
                r0 = 64
                r1 = 128(0x80, float:1.8E-43)
                r2 = 1
                int r5 = metaStateFilterDirectionalModifiers(r5, r6, r2, r0, r1)
                r0 = 16
                r1 = 32
                r3 = 2
                int r5 = metaStateFilterDirectionalModifiers(r5, r6, r3, r0, r1)
                if (r5 != r6) goto L1b
                return r2
            L1b:
                r5 = 0
                return r5
        }

        @Override // com.umeng.socialize.shareboard.widgets.KeyEventCompat.KeyEventVersionImpl
        public boolean metaStateHasNoModifiers(int r1) {
                r0 = this;
                int r1 = r0.normalizeMetaState(r1)
                r1 = r1 & 247(0xf7, float:3.46E-43)
                if (r1 != 0) goto La
                r1 = 1
                return r1
            La:
                r1 = 0
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @android.annotation.TargetApi(11)
    private static class HoneycombKeyEventVersionImpl extends com.umeng.socialize.shareboard.widgets.KeyEventCompat.BaseKeyEventVersionImpl {
        private HoneycombKeyEventVersionImpl() {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                return
        }

        /* synthetic */ HoneycombKeyEventVersionImpl(com.umeng.socialize.shareboard.widgets.KeyEventCompat.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.umeng.socialize.shareboard.widgets.KeyEventCompat.BaseKeyEventVersionImpl, com.umeng.socialize.shareboard.widgets.KeyEventCompat.KeyEventVersionImpl
        public boolean metaStateHasModifiers(int r1, int r2) {
                r0 = this;
                boolean r1 = android.view.KeyEvent.metaStateHasModifiers(r1, r2)
                return r1
        }

        @Override // com.umeng.socialize.shareboard.widgets.KeyEventCompat.BaseKeyEventVersionImpl, com.umeng.socialize.shareboard.widgets.KeyEventCompat.KeyEventVersionImpl
        public boolean metaStateHasNoModifiers(int r1) {
                r0 = this;
                boolean r1 = android.view.KeyEvent.metaStateHasNoModifiers(r1)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    interface KeyEventVersionImpl {
        boolean metaStateHasModifiers(int r1, int r2);

        boolean metaStateHasNoModifiers(int r1);
    }

    static {
            com.umeng.socialize.shareboard.widgets.KeyEventCompat$HoneycombKeyEventVersionImpl r0 = new com.umeng.socialize.shareboard.widgets.KeyEventCompat$HoneycombKeyEventVersionImpl
            r1 = 0
            r0.<init>(r1)
            com.umeng.socialize.shareboard.widgets.KeyEventCompat.IMPL = r0
            return
    }

    KeyEventCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean hasModifiers(android.view.KeyEvent r1, int r2) {
            com.umeng.socialize.shareboard.widgets.KeyEventCompat$KeyEventVersionImpl r0 = com.umeng.socialize.shareboard.widgets.KeyEventCompat.IMPL
            int r1 = r1.getMetaState()
            boolean r1 = r0.metaStateHasModifiers(r1, r2)
            return r1
    }

    public static boolean hasNoModifiers(android.view.KeyEvent r1) {
            com.umeng.socialize.shareboard.widgets.KeyEventCompat$KeyEventVersionImpl r0 = com.umeng.socialize.shareboard.widgets.KeyEventCompat.IMPL
            int r1 = r1.getMetaState()
            boolean r1 = r0.metaStateHasNoModifiers(r1)
            return r1
    }
}
