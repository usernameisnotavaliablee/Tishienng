package com.amap.api.maps.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class BuildingOverlay extends com.amap.api.maps.model.BaseOverlay {
    private com.amap.api.maps.model.BuildingOverlay.BuildingOverlayTotalOptions buildingOverlayTotalOptions;
    private java.lang.ref.WeakReference<com.amap.api.maps.interfaces.IGlOverlayLayer> glOverlayLayerRef;
    private com.amap.api.maps.model.BuildingOverlayOptions mDefaultOptions;
    private java.util.List<com.amap.api.maps.model.BuildingOverlayOptions> optionList;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    protected class BuildingOverlayTotalOptions extends com.amap.api.maps.model.BaseOptions {
        final /* synthetic */ com.amap.api.maps.model.BuildingOverlay a;
        public java.util.List<com.amap.api.maps.model.BuildingOverlayOptions> allOptionList;
        public boolean isVisible;
        private float zIndex;

        public BuildingOverlayTotalOptions(com.amap.api.maps.model.BuildingOverlay r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                r1 = 1
                r0.isVisible = r1
                r1 = 0
                r0.zIndex = r1
                java.lang.String r1 = "BuildingOptions"
                r0.type = r1
                return
        }

        static /* synthetic */ float a(com.amap.api.maps.model.BuildingOverlay.BuildingOverlayTotalOptions r0) {
                float r0 = r0.zIndex
                return r0
        }

        static /* synthetic */ float a(com.amap.api.maps.model.BuildingOverlay.BuildingOverlayTotalOptions r0, float r1) {
                r0.zIndex = r1
                return r1
        }
    }

    public BuildingOverlay(com.amap.api.maps.interfaces.IGlOverlayLayer r8, java.lang.String r9) {
            r7 = this;
            r7.<init>(r9)
            com.amap.api.maps.model.BuildingOverlay$BuildingOverlayTotalOptions r9 = new com.amap.api.maps.model.BuildingOverlay$BuildingOverlayTotalOptions
            r9.<init>(r7)
            r7.buildingOverlayTotalOptions = r9
            java.lang.ref.WeakReference r9 = new java.lang.ref.WeakReference
            r9.<init>(r8)
            r7.glOverlayLayerRef = r9
            com.amap.api.maps.model.BuildingOverlay$BuildingOverlayTotalOptions r8 = r7.buildingOverlayTotalOptions
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            r8.allOptionList = r9
            com.amap.api.maps.model.BuildingOverlayOptions r8 = r7.mDefaultOptions     // Catch: java.lang.Throwable -> L8e
            if (r8 != 0) goto L8e
            com.amap.api.maps.model.BuildingOverlayOptions r8 = new com.amap.api.maps.model.BuildingOverlayOptions     // Catch: java.lang.Throwable -> L8e
            r8.<init>()     // Catch: java.lang.Throwable -> L8e
            r7.mDefaultOptions = r8     // Catch: java.lang.Throwable -> L8e
            r9 = 1
            r8.setVisible(r9)     // Catch: java.lang.Throwable -> L8e
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L8e
            r8.<init>()     // Catch: java.lang.Throwable -> L8e
            com.amap.api.maps.model.LatLng r0 = new com.amap.api.maps.model.LatLng     // Catch: java.lang.Throwable -> L8e
            r1 = -4582838351751754547(0xc0667ccccccccccd, double:-179.9)
            r3 = 4635674723317553562(0x405539999999999a, double:84.9)
            r0.<init>(r3, r1)     // Catch: java.lang.Throwable -> L8e
            r8.add(r0)     // Catch: java.lang.Throwable -> L8e
            com.amap.api.maps.model.LatLng r0 = new com.amap.api.maps.model.LatLng     // Catch: java.lang.Throwable -> L8e
            r5 = 4640533685103021261(0x40667ccccccccccd, double:179.9)
            r0.<init>(r3, r5)     // Catch: java.lang.Throwable -> L8e
            r8.add(r0)     // Catch: java.lang.Throwable -> L8e
            com.amap.api.maps.model.LatLng r0 = new com.amap.api.maps.model.LatLng     // Catch: java.lang.Throwable -> L8e
            r3 = -4587697313537222246(0xc05539999999999a, double:-84.9)
            r0.<init>(r3, r5)     // Catch: java.lang.Throwable -> L8e
            r8.add(r0)     // Catch: java.lang.Throwable -> L8e
            com.amap.api.maps.model.LatLng r0 = new com.amap.api.maps.model.LatLng     // Catch: java.lang.Throwable -> L8e
            r0.<init>(r3, r1)     // Catch: java.lang.Throwable -> L8e
            r8.add(r0)     // Catch: java.lang.Throwable -> L8e
            com.amap.api.maps.model.BuildingOverlayOptions r0 = r7.mDefaultOptions     // Catch: java.lang.Throwable -> L8e
            r0.setBuildingLatlngs(r8)     // Catch: java.lang.Throwable -> L8e
            com.amap.api.maps.model.BuildingOverlayOptions r8 = r7.mDefaultOptions     // Catch: java.lang.Throwable -> L8e
            r0 = -65536(0xffffffffffff0000, float:NaN)
            r8.setBuildingTopColor(r0)     // Catch: java.lang.Throwable -> L8e
            com.amap.api.maps.model.BuildingOverlayOptions r8 = r7.mDefaultOptions     // Catch: java.lang.Throwable -> L8e
            r0 = -12303292(0xffffffffff444444, float:-2.6088314E38)
            r8.setBuildingSideColor(r0)     // Catch: java.lang.Throwable -> L8e
            com.amap.api.maps.model.BuildingOverlayOptions r8 = r7.mDefaultOptions     // Catch: java.lang.Throwable -> L8e
            r8.setVisible(r9)     // Catch: java.lang.Throwable -> L8e
            com.amap.api.maps.model.BuildingOverlayOptions r8 = r7.mDefaultOptions     // Catch: java.lang.Throwable -> L8e
            r0 = 1065353216(0x3f800000, float:1.0)
            r8.setZIndex(r0)     // Catch: java.lang.Throwable -> L8e
            com.amap.api.maps.model.BuildingOverlay$BuildingOverlayTotalOptions r8 = r7.buildingOverlayTotalOptions     // Catch: java.lang.Throwable -> L8e
            java.util.List<com.amap.api.maps.model.BuildingOverlayOptions> r8 = r8.allOptionList     // Catch: java.lang.Throwable -> L8e
            com.amap.api.maps.model.BuildingOverlayOptions r0 = r7.mDefaultOptions     // Catch: java.lang.Throwable -> L8e
            r8.add(r0)     // Catch: java.lang.Throwable -> L8e
            r7.a(r9)     // Catch: java.lang.Throwable -> L8e
        L8e:
            return
    }

    private void a() {
            r3 = this;
            java.lang.ref.WeakReference<com.amap.api.maps.interfaces.IGlOverlayLayer> r0 = r3.glOverlayLayerRef     // Catch: java.lang.Throwable -> L19
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L19
            com.amap.api.maps.interfaces.IGlOverlayLayer r0 = (com.amap.api.maps.interfaces.IGlOverlayLayer) r0     // Catch: java.lang.Throwable -> L19
            java.lang.String r1 = r3.overlayName     // Catch: java.lang.Throwable -> L19
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L19
            if (r1 != 0) goto L19
            if (r0 == 0) goto L19
            java.lang.String r1 = r3.overlayName     // Catch: java.lang.Throwable -> L19
            com.amap.api.maps.model.BuildingOverlay$BuildingOverlayTotalOptions r2 = r3.buildingOverlayTotalOptions     // Catch: java.lang.Throwable -> L19
            r0.updateOption(r1, r2)     // Catch: java.lang.Throwable -> L19
        L19:
            return
    }

    private void a(boolean r3) {
            r2 = this;
            monitor-enter(r2)     // Catch: java.lang.Exception -> L40
            r0 = 0
            if (r3 == 0) goto L10
            com.amap.api.maps.model.BuildingOverlay$BuildingOverlayTotalOptions r3 = r2.buildingOverlayTotalOptions     // Catch: java.lang.Throwable -> Le
            java.util.List<com.amap.api.maps.model.BuildingOverlayOptions> r3 = r3.allOptionList     // Catch: java.lang.Throwable -> Le
            com.amap.api.maps.model.BuildingOverlayOptions r1 = r2.mDefaultOptions     // Catch: java.lang.Throwable -> Le
            r3.set(r0, r1)     // Catch: java.lang.Throwable -> Le
            goto L2b
        Le:
            r3 = move-exception
            goto L3e
        L10:
            com.amap.api.maps.model.BuildingOverlay$BuildingOverlayTotalOptions r3 = r2.buildingOverlayTotalOptions     // Catch: java.lang.Throwable -> Le
            java.util.List<com.amap.api.maps.model.BuildingOverlayOptions> r3 = r3.allOptionList     // Catch: java.lang.Throwable -> Le
            java.util.List<com.amap.api.maps.model.BuildingOverlayOptions> r1 = r2.optionList     // Catch: java.lang.Throwable -> Le
            r3.removeAll(r1)     // Catch: java.lang.Throwable -> Le
            com.amap.api.maps.model.BuildingOverlay$BuildingOverlayTotalOptions r3 = r2.buildingOverlayTotalOptions     // Catch: java.lang.Throwable -> Le
            java.util.List<com.amap.api.maps.model.BuildingOverlayOptions> r3 = r3.allOptionList     // Catch: java.lang.Throwable -> Le
            com.amap.api.maps.model.BuildingOverlayOptions r1 = r2.mDefaultOptions     // Catch: java.lang.Throwable -> Le
            r3.set(r0, r1)     // Catch: java.lang.Throwable -> Le
            com.amap.api.maps.model.BuildingOverlay$BuildingOverlayTotalOptions r3 = r2.buildingOverlayTotalOptions     // Catch: java.lang.Throwable -> Le
            java.util.List<com.amap.api.maps.model.BuildingOverlayOptions> r3 = r3.allOptionList     // Catch: java.lang.Throwable -> Le
            java.util.List<com.amap.api.maps.model.BuildingOverlayOptions> r0 = r2.optionList     // Catch: java.lang.Throwable -> Le
            r3.addAll(r0)     // Catch: java.lang.Throwable -> Le
        L2b:
            java.lang.ref.WeakReference<com.amap.api.maps.interfaces.IGlOverlayLayer> r3 = r2.glOverlayLayerRef     // Catch: java.lang.Throwable -> Le
            java.lang.Object r3 = r3.get()     // Catch: java.lang.Throwable -> Le
            com.amap.api.maps.interfaces.IGlOverlayLayer r3 = (com.amap.api.maps.interfaces.IGlOverlayLayer) r3     // Catch: java.lang.Throwable -> Le
            if (r3 == 0) goto L3c
            java.lang.String r0 = r2.overlayName     // Catch: java.lang.Throwable -> Le
            com.amap.api.maps.model.BuildingOverlay$BuildingOverlayTotalOptions r1 = r2.buildingOverlayTotalOptions     // Catch: java.lang.Throwable -> Le
            r3.updateOption(r0, r1)     // Catch: java.lang.Throwable -> Le
        L3c:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Le
            return
        L3e:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Le
            throw r3     // Catch: java.lang.Exception -> L40
        L40:
            return
    }

    public void destroy() {
            r2 = this;
            java.lang.ref.WeakReference<com.amap.api.maps.interfaces.IGlOverlayLayer> r0 = r2.glOverlayLayerRef     // Catch: java.lang.Throwable -> Lf
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> Lf
            com.amap.api.maps.interfaces.IGlOverlayLayer r0 = (com.amap.api.maps.interfaces.IGlOverlayLayer) r0     // Catch: java.lang.Throwable -> Lf
            if (r0 == 0) goto Lf
            java.lang.String r1 = r2.overlayName     // Catch: java.lang.Throwable -> Lf
            r0.removeOverlay(r1)     // Catch: java.lang.Throwable -> Lf
        Lf:
            return
    }

    public java.util.List<com.amap.api.maps.model.BuildingOverlayOptions> getCustomOptions() {
            r1 = this;
            java.util.List<com.amap.api.maps.model.BuildingOverlayOptions> r0 = r1.optionList
            return r0
    }

    public com.amap.api.maps.model.BuildingOverlayOptions getDefaultOptions() {
            r1 = this;
            com.amap.api.maps.model.BuildingOverlayOptions r0 = r1.mDefaultOptions
            return r0
    }

    public java.lang.String getId() {
            r1 = this;
            java.lang.String r0 = r1.overlayName
            return r0
    }

    public float getZIndex() {
            r1 = this;
            com.amap.api.maps.model.BuildingOverlay$BuildingOverlayTotalOptions r0 = r1.buildingOverlayTotalOptions
            if (r0 == 0) goto L9
            float r0 = com.amap.api.maps.model.BuildingOverlay.BuildingOverlayTotalOptions.a(r0)
            return r0
        L9:
            r0 = 0
            return r0
    }

    public boolean isVisible() {
            r1 = this;
            com.amap.api.maps.model.BuildingOverlay$BuildingOverlayTotalOptions r0 = r1.buildingOverlayTotalOptions
            if (r0 == 0) goto L7
            boolean r0 = r0.isVisible
            return r0
        L7:
            r0 = 0
            return r0
    }

    public void setCustomOptions(java.util.List<com.amap.api.maps.model.BuildingOverlayOptions> r2) {
            r1 = this;
            if (r2 == 0) goto L14
            int r0 = r2.size()
            if (r0 <= 0) goto L14
            monitor-enter(r1)
            r1.optionList = r2     // Catch: java.lang.Throwable -> L11
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L11
            r2 = 0
            r1.a(r2)
            return
        L11:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L11
            throw r2
        L14:
            return
    }

    public void setDefaultOptions(com.amap.api.maps.model.BuildingOverlayOptions r1) {
            r0 = this;
            if (r1 == 0) goto Le
            monitor-enter(r0)
            r0.mDefaultOptions = r1     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            r1 = 1
            r0.a(r1)
            return
        Lb:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r1
        Le:
            return
    }

    public void setVisible(boolean r2) {
            r1 = this;
            com.amap.api.maps.model.BuildingOverlay$BuildingOverlayTotalOptions r0 = r1.buildingOverlayTotalOptions
            if (r0 == 0) goto L9
            r0.isVisible = r2
            r1.a()
        L9:
            return
    }

    public void setZIndex(float r2) {
            r1 = this;
            com.amap.api.maps.model.BuildingOverlayOptions r0 = r1.mDefaultOptions
            if (r0 == 0) goto L7
            r0.setZIndex(r2)
        L7:
            com.amap.api.maps.model.BuildingOverlay$BuildingOverlayTotalOptions r0 = r1.buildingOverlayTotalOptions
            if (r0 == 0) goto L11
            com.amap.api.maps.model.BuildingOverlay.BuildingOverlayTotalOptions.a(r0, r2)
            r1.a()
        L11:
            return
    }
}
