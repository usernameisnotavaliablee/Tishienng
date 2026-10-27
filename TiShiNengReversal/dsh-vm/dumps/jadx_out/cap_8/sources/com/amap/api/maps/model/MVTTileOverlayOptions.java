package com.amap.api.maps.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class MVTTileOverlayOptions extends com.amap.api.maps.model.BaseOptions implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.maps.model.MVTTileOverlayOptions> CREATOR = null;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    private java.lang.String layerId;
    private com.amap.api.maps.model.TileProvider tileProvider;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    private com.autonavi.base.ae.gmap.bean.TileProviderInner tileProviderInner;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    private boolean visible;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    private float zIndex;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class Builder {
        private java.lang.String id;
        private java.lang.String key;
        private java.lang.String url;
        private boolean visible;
        private float zIndex;

        public Builder() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.zIndex = r0
                r0 = 1
                r1.visible = r0
                return
        }

        public com.amap.api.maps.model.MVTTileOverlayOptions build() {
                r4 = this;
                com.amap.api.maps.model.MVTTileOverlayOptions r0 = new com.amap.api.maps.model.MVTTileOverlayOptions
                java.lang.String r1 = r4.url
                java.lang.String r2 = r4.key
                java.lang.String r3 = r4.id
                r0.<init>(r1, r2, r3)
                float r1 = r4.zIndex
                r0.setZIndex(r1)
                boolean r1 = r4.visible
                r0.setVisible(r1)
                return r0
        }

        public com.amap.api.maps.model.MVTTileOverlayOptions.Builder id(java.lang.String r1) {
                r0 = this;
                r0.id = r1
                return r0
        }

        public com.amap.api.maps.model.MVTTileOverlayOptions.Builder key(java.lang.String r1) {
                r0 = this;
                r0.key = r1
                return r0
        }

        public com.amap.api.maps.model.MVTTileOverlayOptions.Builder url(java.lang.String r1) {
                r0 = this;
                r0.url = r1
                return r0
        }

        public com.amap.api.maps.model.MVTTileOverlayOptions.Builder visible(boolean r1) {
                r0 = this;
                r0.visible = r1
                return r0
        }

        public com.amap.api.maps.model.MVTTileOverlayOptions.Builder zIndex(float r1) {
                r0 = this;
                r0.zIndex = r1
                return r0
        }
    }

    static {
            com.amap.api.maps.model.MVTTileOverlayOptions$1 r0 = new com.amap.api.maps.model.MVTTileOverlayOptions$1
            r0.<init>()
            com.amap.api.maps.model.MVTTileOverlayOptions.CREATOR = r0
            return
    }

    public MVTTileOverlayOptions(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "MVTTileOverlayOptions"
            r1.type = r0
            com.amap.api.maps.model.MVTTileProvider r0 = new com.amap.api.maps.model.MVTTileProvider
            r0.<init>(r2, r3, r4)
            r1.tileProvider = r0
            com.autonavi.base.ae.gmap.bean.TileProviderInner r2 = new com.autonavi.base.ae.gmap.bean.TileProviderInner
            r2.<init>(r0)
            r1.tileProviderInner = r2
            r1.layerId = r4
            return
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
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

    public void setTileProvider(com.amap.api.maps.model.TileProvider r1) {
            r0 = this;
            r0.tileProvider = r1
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
    public void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            com.autonavi.base.ae.gmap.bean.TileProviderInner r2 = r0.tileProviderInner
            r1.writeValue(r2)
            return
    }
}
