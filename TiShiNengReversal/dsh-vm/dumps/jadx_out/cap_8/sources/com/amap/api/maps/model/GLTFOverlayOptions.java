package com.amap.api.maps.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class GLTFOverlayOptions extends com.amap.api.maps.model.BaseOptions implements android.os.Parcelable, java.lang.Cloneable {

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    public static final com.amap.api.maps.model.GLTFOverlayOptionsCreator CREATOR = null;
    private int currentAnimationIndex;
    private com.amap.api.maps.model.BitmapDescriptor infoWindowView;
    private boolean isClick;
    private boolean isClickable;
    private boolean isDraggable;
    private boolean isGlbFormat;
    private double mAltitude;
    private com.amap.api.maps.model.LatLng mLatLng;
    private byte[] mModelData;
    private double mScale;
    private java.util.List<com.amap.api.maps.model.GLTFResourceIterm> mUriResources;
    private double mXDegree;
    private double mYDegree;
    private double mZDegree;
    private float maxZoom;
    private float minZoom;
    private java.lang.String title;
    private float zIndex;

    static {
            com.amap.api.maps.model.GLTFOverlayOptionsCreator r0 = new com.amap.api.maps.model.GLTFOverlayOptionsCreator
            r0.<init>()
            com.amap.api.maps.model.GLTFOverlayOptions.CREATOR = r0
            return
    }

    public GLTFOverlayOptions() {
            r3 = this;
            r3.<init>()
            com.amap.api.maps.model.LatLng r0 = new com.amap.api.maps.model.LatLng
            r1 = 0
            r0.<init>(r1, r1)
            r3.mLatLng = r0
            r3.mZDegree = r1
            r3.mXDegree = r1
            r3.mYDegree = r1
            r3.mAltitude = r1
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r3.mScale = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.mUriResources = r0
            r0 = 0
            r3.isClickable = r0
            r3.isDraggable = r0
            r3.isClick = r0
            r3.currentAnimationIndex = r0
            r1 = 1077936128(0x40400000, float:3.0)
            r3.minZoom = r1
            r1 = 1101004800(0x41a00000, float:20.0)
            r3.maxZoom = r1
            r3.isGlbFormat = r0
            r0 = 0
            r3.zIndex = r0
            java.lang.String r0 = "GLTFOverlayOptions"
            r3.type = r0
            return
    }

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    protected GLTFOverlayOptions(android.os.Parcel r4) {
            r3 = this;
            r3.<init>()
            com.amap.api.maps.model.LatLng r0 = new com.amap.api.maps.model.LatLng
            r1 = 0
            r0.<init>(r1, r1)
            r3.mLatLng = r0
            r3.mZDegree = r1
            r3.mXDegree = r1
            r3.mYDegree = r1
            r3.mAltitude = r1
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r3.mScale = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.mUriResources = r0
            r0 = 0
            r3.isClickable = r0
            r3.isDraggable = r0
            r3.isClick = r0
            r3.currentAnimationIndex = r0
            r1 = 1077936128(0x40400000, float:3.0)
            r3.minZoom = r1
            r1 = 1101004800(0x41a00000, float:20.0)
            r3.maxZoom = r1
            r3.isGlbFormat = r0
            r1 = 0
            r3.zIndex = r1
            java.lang.Class<com.amap.api.maps.model.LatLng> r1 = com.amap.api.maps.model.LatLng.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            android.os.Parcelable r1 = r4.readParcelable(r1)
            com.amap.api.maps.model.LatLng r1 = (com.amap.api.maps.model.LatLng) r1
            r3.mLatLng = r1
            double r1 = r4.readDouble()
            r3.mZDegree = r1
            double r1 = r4.readDouble()
            r3.mXDegree = r1
            double r1 = r4.readDouble()
            r3.mYDegree = r1
            double r1 = r4.readDouble()
            r3.mAltitude = r1
            double r1 = r4.readDouble()
            r3.mScale = r1
            byte[] r1 = r3.mModelData
            r4.readByteArray(r1)
            java.lang.Class<com.amap.api.maps.model.GLTFResourceIterm> r1 = com.amap.api.maps.model.GLTFResourceIterm.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            java.util.ArrayList r1 = r4.readArrayList(r1)
            r3.mUriResources = r1
            r1 = 3
            boolean[] r1 = new boolean[r1]
            r4.readBooleanArray(r1)
            boolean r0 = r1[r0]
            r3.isClickable = r0
            r0 = 1
            boolean r0 = r1[r0]
            r3.isDraggable = r0
            r0 = 2
            boolean r0 = r1[r0]
            r3.isGlbFormat = r0
            java.lang.Class<com.amap.api.maps.model.BitmapDescriptor> r0 = com.amap.api.maps.model.BitmapDescriptor.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r0 = r4.readParcelable(r0)
            com.amap.api.maps.model.BitmapDescriptor r0 = (com.amap.api.maps.model.BitmapDescriptor) r0
            r3.infoWindowView = r0
            java.lang.String r0 = r4.readString()
            r3.title = r0
            int r0 = r4.readInt()
            r3.currentAnimationIndex = r0
            float r0 = r4.readFloat()
            r3.minZoom = r0
            float r0 = r4.readFloat()
            r3.maxZoom = r0
            float r4 = r4.readFloat()
            r3.zIndex = r4
            return
    }

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    GLTFOverlayOptions(com.amap.api.maps.model.LatLng r4, double r5, double r7, java.lang.String r9, java.util.List<com.amap.api.maps.model.GLTFResourceIterm> r10) {
            r3 = this;
            r3.<init>()
            com.amap.api.maps.model.LatLng r0 = new com.amap.api.maps.model.LatLng
            r1 = 0
            r0.<init>(r1, r1)
            r3.mLatLng = r0
            r3.mZDegree = r1
            r3.mXDegree = r1
            r3.mYDegree = r1
            r3.mAltitude = r1
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r3.mScale = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.mUriResources = r0
            r0 = 0
            r3.isClickable = r0
            r3.isDraggable = r0
            r3.isClick = r0
            r3.currentAnimationIndex = r0
            r1 = 1077936128(0x40400000, float:3.0)
            r3.minZoom = r1
            r1 = 1101004800(0x41a00000, float:20.0)
            r3.maxZoom = r1
            r3.isGlbFormat = r0
            r0 = 0
            r3.zIndex = r0
            r3.mLatLng = r4
            r3.mAltitude = r5
            r3.mScale = r7
            if (r9 == 0) goto L44
            byte[] r4 = r9.getBytes()
            r3.mModelData = r4
            goto L4c
        L44:
            java.lang.String r4 = ""
            byte[] r4 = r4.getBytes()
            r3.mModelData = r4
        L4c:
            r3.mUriResources = r10
            return
    }

    public com.amap.api.maps.model.GLTFOverlayOptions altitude(double r1) {
            r0 = this;
            r0.mAltitude = r1
            return r0
    }

    public com.amap.api.maps.model.GLTFOverlayOptions clone() {
            r3 = this;
            super.clone()     // Catch: java.lang.CloneNotSupportedException -> L4
            goto L5
        L4:
        L5:
            com.amap.api.maps.model.GLTFOverlayOptions r0 = new com.amap.api.maps.model.GLTFOverlayOptions
            r0.<init>()
            com.amap.api.maps.model.LatLng r1 = r3.mLatLng
            com.amap.api.maps.model.LatLng r1 = r1.clone()
            r0.mLatLng = r1
            double r1 = r3.mZDegree
            r0.mZDegree = r1
            double r1 = r3.mXDegree
            r0.mXDegree = r1
            double r1 = r3.mYDegree
            r0.mYDegree = r1
            double r1 = r3.mAltitude
            r0.mAltitude = r1
            double r1 = r3.mScale
            r0.mScale = r1
            byte[] r1 = r3.mModelData
            r0.mModelData = r1
            java.util.List<com.amap.api.maps.model.GLTFResourceIterm> r1 = r3.mUriResources
            r0.mUriResources = r1
            boolean r1 = r3.isClickable
            r0.isClickable = r1
            boolean r1 = r3.isDraggable
            r0.isDraggable = r1
            com.amap.api.maps.model.BitmapDescriptor r1 = r3.infoWindowView
            if (r1 == 0) goto L40
            com.amap.api.maps.model.BitmapDescriptor r1 = r1.clone()
            r0.infoWindowView = r1
        L40:
            java.lang.String r1 = r3.title
            if (r1 == 0) goto L46
            r0.title = r1
        L46:
            int r1 = r3.currentAnimationIndex
            r0.currentAnimationIndex = r1
            float r1 = r3.minZoom
            r0.minZoom = r1
            float r1 = r3.maxZoom
            r0.maxZoom = r1
            boolean r1 = r3.isGlbFormat
            r0.isGlbFormat = r1
            float r1 = r3.zIndex
            r0.zIndex = r1
            return r0
    }

    /* renamed from: clone, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ java.lang.Object m9clone() throws java.lang.CloneNotSupportedException {
            r1 = this;
            com.amap.api.maps.model.GLTFOverlayOptions r0 = r1.clone()
            return r0
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public double getAltitude() {
            r2 = this;
            double r0 = r2.mAltitude
            return r0
    }

    public int getCurrentAnimationIndex() {
            r1 = this;
            int r0 = r1.currentAnimationIndex
            return r0
    }

    public com.amap.api.maps.model.BitmapDescriptor getInfoWindowView() {
            r1 = this;
            com.amap.api.maps.model.BitmapDescriptor r0 = r1.infoWindowView
            return r0
    }

    public com.amap.api.maps.model.LatLng getLatLng() {
            r1 = this;
            com.amap.api.maps.model.LatLng r0 = r1.mLatLng
            return r0
    }

    public float getMaxZoom() {
            r1 = this;
            float r0 = r1.maxZoom
            return r0
    }

    public float getMinZoom() {
            r1 = this;
            float r0 = r1.minZoom
            return r0
    }

    public byte[] getModelData() {
            r1 = this;
            byte[] r0 = r1.mModelData
            return r0
    }

    public double getScale() {
            r2 = this;
            double r0 = r2.mScale
            return r0
    }

    public java.util.List<com.amap.api.maps.model.GLTFResourceIterm> getUriResources() {
            r1 = this;
            java.util.List<com.amap.api.maps.model.GLTFResourceIterm> r0 = r1.mUriResources
            return r0
    }

    public double getXDegree() {
            r2 = this;
            double r0 = r2.mXDegree
            return r0
    }

    public double getYDegree() {
            r2 = this;
            double r0 = r2.mYDegree
            return r0
    }

    public double getZDegree() {
            r2 = this;
            double r0 = r2.mZDegree
            return r0
    }

    public float getZIndex() {
            r1 = this;
            float r0 = r1.zIndex
            return r0
    }

    public void glbFormat(boolean r1) {
            r0 = this;
            r0.isGlbFormat = r1
            return
    }

    public void infoWindowView(com.amap.api.maps.model.BitmapDescriptor r1) {
            r0 = this;
            r0.infoWindowView = r1
            return
    }

    public boolean isClickable() {
            r1 = this;
            boolean r0 = r1.isClickable
            return r0
    }

    public boolean isDraggable() {
            r1 = this;
            boolean r0 = r1.isDraggable
            return r0
    }

    public boolean isGlbFormat() {
            r1 = this;
            boolean r0 = r1.isGlbFormat
            return r0
    }

    public boolean isInfoWindowShow() {
            r1 = this;
            boolean r0 = r1.isClick
            return r0
    }

    public com.amap.api.maps.model.GLTFOverlayOptions latLng(com.amap.api.maps.model.LatLng r1) {
            r0 = this;
            r0.mLatLng = r1
            return r0
    }

    public com.amap.api.maps.model.GLTFOverlayOptions modelData(byte[] r1) {
            r0 = this;
            if (r1 == 0) goto L4
            r0.mModelData = r1
        L4:
            return r0
    }

    public com.amap.api.maps.model.GLTFOverlayOptions rotationDegree(double r1, double r3, double r5) {
            r0 = this;
            r0.mXDegree = r1
            r0.mYDegree = r3
            r0.mZDegree = r5
            return r0
    }

    public com.amap.api.maps.model.GLTFOverlayOptions scale(double r1) {
            r0 = this;
            r0.mScale = r1
            return r0
    }

    public void setClickable(boolean r1) {
            r0 = this;
            r0.isClickable = r1
            return
    }

    public void setCurrentAnimationIndex(int r1) {
            r0 = this;
            r0.currentAnimationIndex = r1
            return
    }

    public void setDraggable(boolean r1) {
            r0 = this;
            r0.isDraggable = r1
            return
    }

    public void setZIndex(float r1) {
            r0 = this;
            r0.zIndex = r1
            return
    }

    public void setZoomRange(float r1, float r2) {
            r0 = this;
            r0.minZoom = r1
            r0.maxZoom = r2
            return
    }

    public void tapClick() {
            r1 = this;
            boolean r0 = r1.isClick
            r0 = r0 ^ 1
            r1.isClick = r0
            return
    }

    public com.amap.api.maps.model.GLTFOverlayOptions uriResources(java.util.List<com.amap.api.maps.model.GLTFResourceIterm> r1) {
            r0 = this;
            r0.mUriResources = r1
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r6, int r7) {
            r5 = this;
            com.amap.api.maps.model.LatLng r0 = r5.mLatLng
            r6.writeParcelable(r0, r7)
            double r0 = r5.mZDegree
            r6.writeDouble(r0)
            double r0 = r5.mXDegree
            r6.writeDouble(r0)
            double r0 = r5.mYDegree
            r6.writeDouble(r0)
            double r0 = r5.mAltitude
            r6.writeDouble(r0)
            double r0 = r5.mScale
            r6.writeDouble(r0)
            byte[] r0 = r5.mModelData
            r6.writeByteArray(r0)
            java.util.List<com.amap.api.maps.model.GLTFResourceIterm> r0 = r5.mUriResources
            r6.writeList(r0)
            boolean r0 = r5.isClickable
            boolean r1 = r5.isDraggable
            boolean r2 = r5.isGlbFormat
            r3 = 3
            boolean[] r3 = new boolean[r3]
            r4 = 0
            r3[r4] = r0
            r0 = 1
            r3[r0] = r1
            r0 = 2
            r3[r0] = r2
            r6.writeBooleanArray(r3)
            com.amap.api.maps.model.BitmapDescriptor r0 = r5.infoWindowView
            if (r0 == 0) goto L44
            r6.writeParcelable(r0, r7)
        L44:
            java.lang.String r7 = r5.title
            if (r7 == 0) goto L4b
            r6.writeString(r7)
        L4b:
            int r7 = r5.currentAnimationIndex
            r6.writeInt(r7)
            float r7 = r5.minZoom
            r6.writeFloat(r7)
            float r7 = r5.maxZoom
            r6.writeFloat(r7)
            float r7 = r5.zIndex
            r6.writeFloat(r7)
            return
    }
}
