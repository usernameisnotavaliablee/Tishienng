package com.autonavi.base.ae.gmap.gloverlay;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class GLOverlay {
    protected boolean isNightStyle;
    protected int mCode;
    protected int mEngineID;
    protected com.autonavi.base.amap.api.mapcore.IAMapDelegate mGLMapView;
    boolean mIsInBundle;
    protected int mItemPriority;
    protected long mNativeInstance;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum EAMapOverlayTpye extends java.lang.Enum<com.autonavi.base.ae.gmap.gloverlay.GLOverlay.EAMapOverlayTpye> {
        private static final /* synthetic */ com.autonavi.base.ae.gmap.gloverlay.GLOverlay.EAMapOverlayTpye[] $VALUES = null;
        public static final com.autonavi.base.ae.gmap.gloverlay.GLOverlay.EAMapOverlayTpye AMAPOVERLAY_ARROW = null;
        public static final com.autonavi.base.ae.gmap.gloverlay.GLOverlay.EAMapOverlayTpye AMAPOVERLAY_VECTOR = null;
        public static final com.autonavi.base.ae.gmap.gloverlay.GLOverlay.EAMapOverlayTpye AMAPROUTE_OVERLAY = null;
        private int id;

        static {
                com.autonavi.base.ae.gmap.gloverlay.GLOverlay$EAMapOverlayTpye r0 = new com.autonavi.base.ae.gmap.gloverlay.GLOverlay$EAMapOverlayTpye
                r1 = 4
                java.lang.String r2 = "AMAPOVERLAY_ARROW"
                r3 = 0
                r0.<init>(r2, r3, r1)
                com.autonavi.base.ae.gmap.gloverlay.GLOverlay.EAMapOverlayTpye.AMAPOVERLAY_ARROW = r0
                com.autonavi.base.ae.gmap.gloverlay.GLOverlay$EAMapOverlayTpye r1 = new com.autonavi.base.ae.gmap.gloverlay.GLOverlay$EAMapOverlayTpye
                r2 = 5
                java.lang.String r4 = "AMAPOVERLAY_VECTOR"
                r5 = 1
                r1.<init>(r4, r5, r2)
                com.autonavi.base.ae.gmap.gloverlay.GLOverlay.EAMapOverlayTpye.AMAPOVERLAY_VECTOR = r1
                com.autonavi.base.ae.gmap.gloverlay.GLOverlay$EAMapOverlayTpye r2 = new com.autonavi.base.ae.gmap.gloverlay.GLOverlay$EAMapOverlayTpye
                r4 = 16
                java.lang.String r6 = "AMAPROUTE_OVERLAY"
                r7 = 2
                r2.<init>(r6, r7, r4)
                com.autonavi.base.ae.gmap.gloverlay.GLOverlay.EAMapOverlayTpye.AMAPROUTE_OVERLAY = r2
                r4 = 3
                com.autonavi.base.ae.gmap.gloverlay.GLOverlay$EAMapOverlayTpye[] r4 = new com.autonavi.base.ae.gmap.gloverlay.GLOverlay.EAMapOverlayTpye[r4]
                r4[r3] = r0
                r4[r5] = r1
                r4[r7] = r2
                com.autonavi.base.ae.gmap.gloverlay.GLOverlay.EAMapOverlayTpye.$VALUES = r4
                return
        }

        EAMapOverlayTpye(java.lang.String r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.id = r3
                return
        }

        public static com.autonavi.base.ae.gmap.gloverlay.GLOverlay.EAMapOverlayTpye valueOf(java.lang.String r1) {
                java.lang.Class<com.autonavi.base.ae.gmap.gloverlay.GLOverlay$EAMapOverlayTpye> r0 = com.autonavi.base.ae.gmap.gloverlay.GLOverlay.EAMapOverlayTpye.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.autonavi.base.ae.gmap.gloverlay.GLOverlay$EAMapOverlayTpye r1 = (com.autonavi.base.ae.gmap.gloverlay.GLOverlay.EAMapOverlayTpye) r1
                return r1
        }

        public static com.autonavi.base.ae.gmap.gloverlay.GLOverlay.EAMapOverlayTpye[] values() {
                com.autonavi.base.ae.gmap.gloverlay.GLOverlay$EAMapOverlayTpye[] r0 = com.autonavi.base.ae.gmap.gloverlay.GLOverlay.EAMapOverlayTpye.$VALUES
                java.lang.Object r0 = r0.clone()
                com.autonavi.base.ae.gmap.gloverlay.GLOverlay$EAMapOverlayTpye[] r0 = (com.autonavi.base.ae.gmap.gloverlay.GLOverlay.EAMapOverlayTpye[]) r0
                return r0
        }

        public final int getId() {
                r1 = this;
                int r0 = r1.id
                return r0
        }
    }

    public GLOverlay(int r2, com.autonavi.base.amap.api.mapcore.IAMapDelegate r3, int r4) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.isNightStyle = r0
            r1.mIsInBundle = r0
            r1.mEngineID = r2
            r1.mGLMapView = r3
            r1.mCode = r4
            r2 = 0
            r1.mNativeInstance = r2
            r1.mItemPriority = r0
            return
    }

    private static native int nativeGetCount(long r0);

    private static native int nativeGetOverlayPriority(long r0);

    private static native int nativeGetSubType(long r0);

    private static native int nativeGetType(long r0);

    private static native boolean nativeIsClickable(long r0);

    private static native boolean nativeIsVisible(long r0);

    private static native void nativeRemoveAll(long r0);

    private static native void nativeRemoveItem(long r0, int r2);

    private static native void nativeSetClickable(long r0, boolean r2);

    private static native void nativeSetMaxDisplayLevel(long r0, float r2);

    private static native void nativeSetMinDisplayLevel(long r0, float r2);

    private static native void nativeSetOverlayOnTop(long r0, boolean r2);

    private static native void nativeSetOverlayPriority(long r0, int r2);

    private static native void nativeSetOverlayPriorityOnly(long r0, int r2);

    protected static native void nativeSetVisible(long r0, boolean r2);

    public void clearFocus() {
            r0 = this;
            return
    }

    public int getCode() {
            r1 = this;
            int r0 = r1.mCode
            return r0
    }

    public boolean getIsInBundle() {
            r1 = this;
            boolean r0 = r1.mIsInBundle
            return r0
    }

    public long getNativeInstatnce() {
            r2 = this;
            long r0 = r2.mNativeInstance
            return r0
    }

    public int getOverlayPriority() {
            r2 = this;
            long r0 = r2.mNativeInstance
            int r0 = nativeGetOverlayPriority(r0)
            return r0
    }

    public int getSize() {
            r5 = this;
            long r0 = r5.mNativeInstance
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto La
            r0 = 0
            return r0
        La:
            int r0 = nativeGetCount(r0)
            return r0
    }

    public int getSubType() {
            r5 = this;
            long r0 = r5.mNativeInstance
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto La
            r0 = -1
            return r0
        La:
            int r0 = nativeGetSubType(r0)
            return r0
    }

    public int getType() {
            r5 = this;
            long r0 = r5.mNativeInstance
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto La
            r0 = -1
            return r0
        La:
            int r0 = nativeGetType(r0)
            return r0
    }

    public boolean isClickable() {
            r5 = this;
            long r0 = r5.mNativeInstance
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto La
            r0 = 0
            return r0
        La:
            boolean r0 = nativeIsClickable(r0)
            return r0
    }

    public boolean isVisible() {
            r5 = this;
            long r0 = r5.mNativeInstance
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto La
            r0 = 0
            return r0
        La:
            boolean r0 = nativeIsVisible(r0)
            return r0
    }

    void releaseInstance() {
            r5 = this;
            long r0 = r5.mNativeInstance
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto La
            r5.mNativeInstance = r2
        La:
            return
    }

    public void removeAll() {
            r5 = this;
            long r0 = r5.mNativeInstance
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L9
            return
        L9:
            nativeRemoveAll(r0)
            return
    }

    public void removeItem(int r6) {
            r5 = this;
            long r0 = r5.mNativeInstance
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L9
            return
        L9:
            nativeRemoveItem(r0, r6)
            return
    }

    public void setClickable(boolean r6) {
            r5 = this;
            long r0 = r5.mNativeInstance
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L9
            return
        L9:
            nativeSetClickable(r0, r6)
            return
    }

    public void setMaxDisplayLevel(float r3) {
            r2 = this;
            long r0 = r2.mNativeInstance
            nativeSetMaxDisplayLevel(r0, r3)
            return
    }

    public void setMinDisplayLevel(float r3) {
            r2 = this;
            long r0 = r2.mNativeInstance
            nativeSetMinDisplayLevel(r0, r3)
            return
    }

    public void setOverlayItemPriority(int r1) {
            r0 = this;
            r0.mItemPriority = r1
            return
    }

    public void setOverlayOnTop(boolean r3) {
            r2 = this;
            long r0 = r2.mNativeInstance
            nativeSetOverlayOnTop(r0, r3)
            return
    }

    public void setOverlayPriority(int r3) {
            r2 = this;
            long r0 = r2.mNativeInstance
            nativeSetOverlayPriority(r0, r3)
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r3 = r2.mGLMapView
            if (r3 == 0) goto L20
            com.autonavi.base.ae.gmap.GLMapEngine r3 = r3.getGLMapEngine()
            if (r3 == 0) goto L20
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r3 = r2.mGLMapView
            com.autonavi.base.ae.gmap.GLMapEngine r3 = r3.getGLMapEngine()
            int r0 = r2.mEngineID
            com.autonavi.base.ae.gmap.gloverlay.GLOverlayBundle r3 = r3.getOverlayBundle(r0)
            if (r3 == 0) goto L20
            r3.sortOverlay()
        L20:
            return
    }

    public void setOverlayPriorityOnly(int r6) {
            r5 = this;
            long r0 = r5.mNativeInstance
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L9
            return
        L9:
            nativeSetOverlayPriorityOnly(r0, r6)
            return
    }

    public void setVisible(boolean r6) {
            r5 = this;
            long r0 = r5.mNativeInstance
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L9
            return
        L9:
            nativeSetVisible(r0, r6)
            return
    }

    public void useNightStyle(boolean r1) {
            r0 = this;
            r0.isNightStyle = r1
            return
    }
}
