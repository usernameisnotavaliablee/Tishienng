package com.amap.api.maps.model.amap3dmodeltile;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class AMap3DModelTileOverlayOptions extends com.amap.api.maps.model.BaseOptions implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.maps.model.amap3dmodeltile.AMap3DModelTileOverlayOptions> CREATOR = null;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    private java.util.List<com.amap.api.maps.model.amap3dmodeltile.AMap3DTileBuildingColor> customBuildingColors;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    private java.util.List<com.amap.api.maps.model.amap3dmodeltile.AMap3DTileBuildingMaterialOptions> customBuildingMaterialOptions;
    private com.amap.api.maps.model.TileProvider tileProvider;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    private com.autonavi.base.ae.gmap.bean.TileProviderInner tileProviderInner;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    private boolean visible;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    private float zIndex;


    static {
            com.amap.api.maps.model.amap3dmodeltile.AMap3DModelTileOverlayOptions$1 r0 = new com.amap.api.maps.model.amap3dmodeltile.AMap3DModelTileOverlayOptions$1
            r0.<init>()
            com.amap.api.maps.model.amap3dmodeltile.AMap3DModelTileOverlayOptions.CREATOR = r0
            return
    }

    public AMap3DModelTileOverlayOptions() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.zIndex = r0
            r0 = 1
            r1.visible = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.customBuildingColors = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.customBuildingMaterialOptions = r0
            java.lang.String r0 = "AMap3DModelTileOverlayOptions"
            r1.type = r0
            return
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public java.util.List<com.amap.api.maps.model.amap3dmodeltile.AMap3DTileBuildingColor> getCustomBuildingColors() {
            r1 = this;
            java.util.List<com.amap.api.maps.model.amap3dmodeltile.AMap3DTileBuildingColor> r0 = r1.customBuildingColors
            return r0
    }

    public java.util.List<com.amap.api.maps.model.amap3dmodeltile.AMap3DTileBuildingMaterialOptions> getCustomBuildingMaterialOptions() {
            r1 = this;
            java.util.List<com.amap.api.maps.model.amap3dmodeltile.AMap3DTileBuildingMaterialOptions> r0 = r1.customBuildingMaterialOptions
            return r0
    }

    public com.autonavi.base.ae.gmap.bean.TileProviderInner getTileProviderInner() {
            r1 = this;
            com.autonavi.base.ae.gmap.bean.TileProviderInner r0 = r1.tileProviderInner
            return r0
    }

    public float getZIndex() {
            r1 = this;
            float r0 = r1.zIndex
            return r0
    }

    public void setCustomBuildingColors(java.util.List<com.amap.api.maps.model.amap3dmodeltile.AMap3DTileBuildingColor> r1) {
            r0 = this;
            r0.customBuildingColors = r1
            return
    }

    public void setCustomBuildingMaterialOptions(java.util.List<com.amap.api.maps.model.amap3dmodeltile.AMap3DTileBuildingMaterialOptions> r1) {
            r0 = this;
            r0.customBuildingMaterialOptions = r1
            return
    }

    public void setTileProvider(com.amap.api.maps.model.TileProvider r2) {
            r1 = this;
            r1.tileProvider = r2
            com.autonavi.base.ae.gmap.bean.TileProviderInner r0 = new com.autonavi.base.ae.gmap.bean.TileProviderInner
            r0.<init>(r2)
            r1.tileProviderInner = r0
            return
    }

    public void setVisible(boolean r1) {
            r0 = this;
            r0.visible = r1
            return
    }

    public void setZIndex(float r1) {
            r0 = this;
            r0.zIndex = r1
            return
    }

    public boolean visible() {
            r1 = this;
            boolean r0 = r1.visible
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r3, int r4) {
            r2 = this;
            com.autonavi.base.ae.gmap.bean.TileProviderInner r4 = r2.tileProviderInner
            r3.writeValue(r4)
            boolean r4 = r2.visible
            r0 = 1
            boolean[] r0 = new boolean[r0]
            r1 = 0
            r0[r1] = r4
            r3.writeBooleanArray(r0)
            float r4 = r2.zIndex
            r3.writeFloat(r4)
            java.util.List<com.amap.api.maps.model.amap3dmodeltile.AMap3DTileBuildingColor> r4 = r2.customBuildingColors
            r3.writeList(r4)
            java.util.List<com.amap.api.maps.model.amap3dmodeltile.AMap3DTileBuildingMaterialOptions> r4 = r2.customBuildingMaterialOptions
            r3.writeList(r4)
            return
    }
}
