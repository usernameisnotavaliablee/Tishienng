package com.amap.api.maps.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class TileOverlayOptions extends com.amap.api.maps.model.BaseOptions implements android.os.Parcelable {
    public static final com.amap.api.maps.model.TileOverlayOptionsCreator CREATOR = null;
    private com.amap.api.maps.model.TileProvider _tileProvider;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    private java.lang.String diskCacheDir;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    private boolean diskCacheEnabled;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    private long diskCacheSize;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    private com.autonavi.base.ae.gmap.bean.TileProviderInner mTileProvider;
    private final int mVersionCode;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    private boolean mVisible;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    private float mZIndex;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    private int memCacheSize;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    private boolean memoryCacheEnabled;

    static {
            com.amap.api.maps.model.TileOverlayOptionsCreator r0 = new com.amap.api.maps.model.TileOverlayOptionsCreator
            r0.<init>()
            com.amap.api.maps.model.TileOverlayOptions.CREATOR = r0
            return
    }

    public TileOverlayOptions() {
            r3 = this;
            r3.<init>()
            r0 = 1
            r3.mVisible = r0
            r1 = 5242880(0x500000, float:7.34684E-39)
            r3.memCacheSize = r1
            r1 = 20971520(0x1400000, double:1.03613076E-316)
            r3.diskCacheSize = r1
            r1 = 0
            r3.diskCacheDir = r1
            r3.memoryCacheEnabled = r0
            r3.diskCacheEnabled = r0
            r3.mVersionCode = r0
            java.lang.String r0 = "TileOverlayOptions"
            r3.type = r0
            return
    }

    TileOverlayOptions(int r3, boolean r4, float r5) {
            r2 = this;
            r2.<init>()
            r0 = 5242880(0x500000, float:7.34684E-39)
            r2.memCacheSize = r0
            r0 = 20971520(0x1400000, double:1.03613076E-316)
            r2.diskCacheSize = r0
            r0 = 0
            r2.diskCacheDir = r0
            r0 = 1
            r2.memoryCacheEnabled = r0
            r2.diskCacheEnabled = r0
            r2.mVersionCode = r3
            r2.mVisible = r4
            r2.mZIndex = r5
            java.lang.String r3 = "TileOverlayOptions"
            r2.type = r3
            return
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public final com.amap.api.maps.model.TileOverlayOptions diskCacheDir(java.lang.String r1) {
            r0 = this;
            r0.diskCacheDir = r1
            return r0
    }

    public final com.amap.api.maps.model.TileOverlayOptions diskCacheEnabled(boolean r1) {
            r0 = this;
            r0.diskCacheEnabled = r1
            return r0
    }

    public final com.amap.api.maps.model.TileOverlayOptions diskCacheSize(int r3) {
            r2 = this;
            int r3 = r3 * 1024
            long r0 = (long) r3
            r2.diskCacheSize = r0
            return r2
    }

    public final java.lang.String getDiskCacheDir() {
            r1 = this;
            java.lang.String r0 = r1.diskCacheDir
            return r0
    }

    public final boolean getDiskCacheEnabled() {
            r1 = this;
            boolean r0 = r1.diskCacheEnabled
            return r0
    }

    public final long getDiskCacheSize() {
            r2 = this;
            long r0 = r2.diskCacheSize
            return r0
    }

    public final int getMemCacheSize() {
            r1 = this;
            int r0 = r1.memCacheSize
            return r0
    }

    public final boolean getMemoryCacheEnabled() {
            r1 = this;
            boolean r0 = r1.memoryCacheEnabled
            return r0
    }

    public final com.amap.api.maps.model.TileProvider getTileProvider() {
            r1 = this;
            com.amap.api.maps.model.TileProvider r0 = r1._tileProvider
            return r0
    }

    protected final com.autonavi.base.ae.gmap.bean.TileProviderInner getTileProviderInner() {
            r1 = this;
            com.autonavi.base.ae.gmap.bean.TileProviderInner r0 = r1.mTileProvider
            return r0
    }

    public final float getZIndex() {
            r1 = this;
            float r0 = r1.mZIndex
            return r0
    }

    public final boolean isVisible() {
            r1 = this;
            boolean r0 = r1.mVisible
            return r0
    }

    public final com.amap.api.maps.model.TileOverlayOptions memCacheSize(int r1) {
            r0 = this;
            r0.memCacheSize = r1
            return r0
    }

    public final com.amap.api.maps.model.TileOverlayOptions memoryCacheEnabled(boolean r1) {
            r0 = this;
            r0.memoryCacheEnabled = r1
            return r0
    }

    public final com.amap.api.maps.model.TileOverlayOptions tileProvider(com.amap.api.maps.model.TileProvider r2) {
            r1 = this;
            r1._tileProvider = r2
            com.autonavi.base.ae.gmap.bean.TileProviderInner r0 = new com.autonavi.base.ae.gmap.bean.TileProviderInner
            r0.<init>(r2)
            r1.mTileProvider = r0
            return r1
    }

    public final com.amap.api.maps.model.TileOverlayOptions visible(boolean r1) {
            r0 = this;
            r0.mVisible = r1
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r3, int r4) {
            r2 = this;
            int r4 = r2.mVersionCode
            r3.writeInt(r4)
            com.autonavi.base.ae.gmap.bean.TileProviderInner r4 = r2.mTileProvider
            r3.writeValue(r4)
            boolean r4 = r2.mVisible
            byte r4 = (byte) r4
            r3.writeByte(r4)
            float r4 = r2.mZIndex
            r3.writeFloat(r4)
            int r4 = r2.memCacheSize
            r3.writeInt(r4)
            long r0 = r2.diskCacheSize
            r3.writeLong(r0)
            java.lang.String r4 = r2.diskCacheDir
            r3.writeString(r4)
            boolean r4 = r2.memoryCacheEnabled
            byte r4 = (byte) r4
            r3.writeByte(r4)
            boolean r4 = r2.diskCacheEnabled
            byte r4 = (byte) r4
            r3.writeByte(r4)
            return
    }

    public final com.amap.api.maps.model.TileOverlayOptions zIndex(float r1) {
            r0 = this;
            r0.mZIndex = r1
            return r0
    }
}
