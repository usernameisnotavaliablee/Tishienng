package com.amap.api.maps.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class CrossOverlay {
    public static final int UPDATE_TYPE_DATA = 0;
    com.autonavi.amap.mapcore.interfaces.ICrossVectorOverlay a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface GenerateCrossImageListener {
        void onGenerateComplete(android.graphics.Bitmap r1, int r2);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface OnCrossVectorUpdateListener {
        void onUpdate(int r1, com.amap.api.maps.model.CrossOverlay.UpdateItem r2);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class UpdateItem {
        public int dataUpdateFlag;

        public UpdateItem() {
                r1 = this;
                r1.<init>()
                r0 = -1
                r1.dataUpdateFlag = r0
                return
        }
    }

    public CrossOverlay(com.amap.api.maps.model.CrossOverlayOptions r1, com.autonavi.amap.mapcore.interfaces.ICrossVectorOverlay r2) {
            r0 = this;
            r0.<init>()
            r0.a = r2
            return
    }

    public void remove() {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.ICrossVectorOverlay r0 = r1.a
            if (r0 == 0) goto L7
            r0.remove()     // Catch: java.lang.Throwable -> L7
        L7:
            return
    }

    public void setAttribute(com.autonavi.base.ae.gmap.gloverlay.AVectorCrossAttr r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.ICrossVectorOverlay r0 = r1.a     // Catch: java.lang.Throwable -> L5
            r0.setAttribute(r2)     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    public int setData(byte[] r2) {
            r1 = this;
            if (r2 == 0) goto L9
            com.autonavi.amap.mapcore.interfaces.ICrossVectorOverlay r0 = r1.a
            if (r0 == 0) goto L9
            r0.setData(r2)     // Catch: java.lang.Throwable -> L9
        L9:
            r2 = 0
            return r2
    }

    public void setGenerateCrossImageListener(com.amap.api.maps.model.CrossOverlay.GenerateCrossImageListener r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.ICrossVectorOverlay r0 = r1.a
            if (r0 == 0) goto L7
            r0.setGenerateCrossImageListener(r2)     // Catch: java.lang.Throwable -> L7
        L7:
            return
    }

    public void setImageMode(boolean r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.ICrossVectorOverlay r0 = r1.a
            if (r0 == 0) goto L7
            r0.setImageMode(r2)     // Catch: java.lang.Throwable -> L7
        L7:
            return
    }

    public void setOnCrossVectorUpdateListener(com.amap.api.maps.model.CrossOverlay.OnCrossVectorUpdateListener r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.ICrossVectorOverlay r0 = r1.a
            if (r0 == 0) goto L7
            r0.setOnCrossVectorUpdateListener(r2)     // Catch: java.lang.Throwable -> L7
        L7:
            return
    }

    public void setVisible(boolean r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.ICrossVectorOverlay r0 = r1.a
            if (r0 == 0) goto L7
            r0.setVisible(r2)     // Catch: java.lang.Throwable -> L7
        L7:
            return
    }
}
