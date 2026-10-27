package com.amap.api.maps.model.particle;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class ParticleOverlayOptions extends com.amap.api.maps.model.BaseOptions implements android.os.Parcelable, java.lang.Cloneable {

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    public static final android.os.Parcelable.Creator<com.amap.api.maps.model.particle.ParticleOverlayOptions> CREATOR = null;
    private com.amap.api.maps.model.BitmapDescriptor bitmapDescriptor;
    private long duration;
    private boolean isParticleEmissionModuleUpdate;
    private boolean isParticleOverLifeModuleUpdate;
    private boolean isParticleShapeModuleUpdate;
    private boolean isStartColorUpdate;
    private boolean isStartSpeedUpdate;
    private boolean loop;
    private int maxParticles;
    private com.amap.api.maps.model.particle.ParticleEmissionModule particleEmissionModule;
    private long particleLifeTime;
    private com.amap.api.maps.model.particle.ParticleOverLifeModule particleOverLifeModule;
    private com.amap.api.maps.model.particle.ParticleShapeModule particleShapeModule;
    private java.lang.Object particleShapeModuleObject;
    private com.amap.api.maps.model.particle.ColorGenerate startColor;
    private java.lang.Object startColorObject;
    private int startParticleH;
    private int startParticleW;
    private com.amap.api.maps.model.particle.VelocityGenerate startSpeed;
    private java.lang.Object startSpeedObject;
    private boolean visibile;
    private float zIndex;


    static {
            com.amap.api.maps.model.particle.ParticleOverlayOptions$1 r0 = new com.amap.api.maps.model.particle.ParticleOverlayOptions$1
            r0.<init>()
            com.amap.api.maps.model.particle.ParticleOverlayOptions.CREATOR = r0
            return
    }

    public ParticleOverlayOptions() {
            r3 = this;
            r3.<init>()
            r0 = 1065353216(0x3f800000, float:1.0)
            r3.zIndex = r0
            r0 = 100
            r3.maxParticles = r0
            r0 = 1
            r3.loop = r0
            r1 = 5000(0x1388, double:2.4703E-320)
            r3.duration = r1
            r3.particleLifeTime = r1
            r1 = 0
            r3.startSpeed = r1
            r1 = 32
            r3.startParticleW = r1
            r3.startParticleH = r1
            r3.visibile = r0
            r0 = 0
            r3.isParticleEmissionModuleUpdate = r0
            r3.isParticleShapeModuleUpdate = r0
            r3.isStartSpeedUpdate = r0
            r3.isStartColorUpdate = r0
            r3.isParticleOverLifeModuleUpdate = r0
            java.lang.String r0 = "ParticleOptions"
            r3.type = r0
            return
    }

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    protected ParticleOverlayOptions(android.os.Parcel r5) {
            r4 = this;
            r4.<init>()
            r0 = 1065353216(0x3f800000, float:1.0)
            r4.zIndex = r0
            r0 = 100
            r4.maxParticles = r0
            r0 = 1
            r4.loop = r0
            r1 = 5000(0x1388, double:2.4703E-320)
            r4.duration = r1
            r4.particleLifeTime = r1
            r1 = 0
            r4.startSpeed = r1
            r1 = 32
            r4.startParticleW = r1
            r4.startParticleH = r1
            r4.visibile = r0
            r1 = 0
            r4.isParticleEmissionModuleUpdate = r1
            r4.isParticleShapeModuleUpdate = r1
            r4.isStartSpeedUpdate = r1
            r4.isStartColorUpdate = r1
            r4.isParticleOverLifeModuleUpdate = r1
            java.lang.Class<com.amap.api.maps.model.BitmapDescriptor> r2 = com.amap.api.maps.model.BitmapDescriptor.class
            java.lang.ClassLoader r2 = r2.getClassLoader()
            android.os.Parcelable r2 = r5.readParcelable(r2)
            com.amap.api.maps.model.BitmapDescriptor r2 = (com.amap.api.maps.model.BitmapDescriptor) r2
            r4.bitmapDescriptor = r2
            float r2 = r5.readFloat()
            r4.zIndex = r2
            int r2 = r5.readInt()
            r4.maxParticles = r2
            byte r2 = r5.readByte()
            if (r2 == 0) goto L4c
            r2 = 1
            goto L4d
        L4c:
            r2 = 0
        L4d:
            r4.loop = r2
            long r2 = r5.readLong()
            r4.duration = r2
            long r2 = r5.readLong()
            r4.particleLifeTime = r2
            int r2 = r5.readInt()
            r4.startParticleW = r2
            int r2 = r5.readInt()
            r4.startParticleH = r2
            byte r5 = r5.readByte()
            if (r5 == 0) goto L6e
            goto L6f
        L6e:
            r0 = 0
        L6f:
            r4.visibile = r0
            return
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public long getDuration() {
            r2 = this;
            long r0 = r2.duration
            return r0
    }

    public com.amap.api.maps.model.BitmapDescriptor getIcon() {
            r1 = this;
            com.amap.api.maps.model.BitmapDescriptor r0 = r1.bitmapDescriptor
            return r0
    }

    public int getMaxParticles() {
            r1 = this;
            int r0 = r1.maxParticles
            return r0
    }

    public com.amap.api.maps.model.particle.ParticleEmissionModule getParticleEmissionModule() {
            r1 = this;
            com.amap.api.maps.model.particle.ParticleEmissionModule r0 = r1.particleEmissionModule
            return r0
    }

    public long getParticleLifeTime() {
            r2 = this;
            long r0 = r2.particleLifeTime
            return r0
    }

    public com.amap.api.maps.model.particle.ParticleOverLifeModule getParticleOverLifeModule() {
            r1 = this;
            com.amap.api.maps.model.particle.ParticleOverLifeModule r0 = r1.particleOverLifeModule
            return r0
    }

    public com.amap.api.maps.model.particle.ParticleShapeModule getParticleShapeModule() {
            r1 = this;
            com.amap.api.maps.model.particle.ParticleShapeModule r0 = r1.particleShapeModule
            return r0
    }

    public com.amap.api.maps.model.particle.ColorGenerate getParticleStartColor() {
            r1 = this;
            com.amap.api.maps.model.particle.ColorGenerate r0 = r1.startColor
            return r0
    }

    public com.amap.api.maps.model.particle.VelocityGenerate getParticleStartSpeed() {
            r1 = this;
            com.amap.api.maps.model.particle.VelocityGenerate r0 = r1.startSpeed
            return r0
    }

    public int getStartParticleW() {
            r1 = this;
            int r0 = r1.startParticleW
            return r0
    }

    public float getZIndex() {
            r1 = this;
            float r0 = r1.zIndex
            return r0
    }

    public int getstartParticleH() {
            r1 = this;
            int r0 = r1.startParticleH
            return r0
    }

    public com.amap.api.maps.model.particle.ParticleOverlayOptions icon(com.amap.api.maps.model.BitmapDescriptor r1) {
            r0 = this;
            r0.bitmapDescriptor = r1     // Catch: java.lang.Throwable -> L2
        L2:
            return r0
    }

    public boolean isLoop() {
            r1 = this;
            boolean r0 = r1.loop
            return r0
    }

    public boolean isVisibile() {
            r1 = this;
            boolean r0 = r1.visibile
            return r0
    }

    public com.amap.api.maps.model.particle.ParticleOverlayOptions setDuration(long r1) {
            r0 = this;
            r0.duration = r1
            return r0
    }

    public com.amap.api.maps.model.particle.ParticleOverlayOptions setLoop(boolean r1) {
            r0 = this;
            r0.loop = r1
            return r0
    }

    public com.amap.api.maps.model.particle.ParticleOverlayOptions setMaxParticles(int r1) {
            r0 = this;
            r0.maxParticles = r1
            return r0
    }

    public com.amap.api.maps.model.particle.ParticleOverlayOptions setParticleEmissionModule(com.amap.api.maps.model.particle.ParticleEmissionModule r1) {
            r0 = this;
            r0.particleEmissionModule = r1
            r1 = 1
            r0.isParticleEmissionModuleUpdate = r1
            return r0
    }

    public com.amap.api.maps.model.particle.ParticleOverlayOptions setParticleLifeTime(long r1) {
            r0 = this;
            r0.particleLifeTime = r1
            return r0
    }

    public com.amap.api.maps.model.particle.ParticleOverlayOptions setParticleOverLifeModule(com.amap.api.maps.model.particle.ParticleOverLifeModule r1) {
            r0 = this;
            r0.particleOverLifeModule = r1
            r1 = 1
            r0.isParticleOverLifeModuleUpdate = r1
            return r0
    }

    public com.amap.api.maps.model.particle.ParticleOverlayOptions setParticleShapeModule(com.amap.api.maps.model.particle.ParticleShapeModule r1) {
            r0 = this;
            r0.particleShapeModule = r1
            r0.particleShapeModuleObject = r1
            r1 = 1
            r0.isParticleShapeModuleUpdate = r1
            return r0
    }

    public com.amap.api.maps.model.particle.ParticleOverlayOptions setParticleStartColor(com.amap.api.maps.model.particle.ColorGenerate r1) {
            r0 = this;
            r0.startColor = r1
            r0.startColorObject = r1
            r1 = 1
            r0.isStartColorUpdate = r1
            return r0
    }

    public com.amap.api.maps.model.particle.ParticleOverlayOptions setParticleStartSpeed(com.amap.api.maps.model.particle.VelocityGenerate r1) {
            r0 = this;
            r0.startSpeed = r1
            r0.startSpeedObject = r1
            r1 = 1
            r0.isStartSpeedUpdate = r1
            return r0
    }

    public com.amap.api.maps.model.particle.ParticleOverlayOptions setStartParticleSize(int r1, int r2) {
            r0 = this;
            r0.startParticleW = r1
            r0.startParticleH = r2
            return r0
    }

    public com.amap.api.maps.model.particle.ParticleOverlayOptions setVisible(boolean r1) {
            r0 = this;
            r0.visibile = r1
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r3, int r4) {
            r2 = this;
            com.amap.api.maps.model.BitmapDescriptor r0 = r2.bitmapDescriptor
            r3.writeParcelable(r0, r4)
            float r4 = r2.zIndex
            r3.writeFloat(r4)
            int r4 = r2.maxParticles
            r3.writeInt(r4)
            boolean r4 = r2.loop
            byte r4 = (byte) r4
            r3.writeByte(r4)
            long r0 = r2.duration
            r3.writeLong(r0)
            long r0 = r2.particleLifeTime
            r3.writeLong(r0)
            int r4 = r2.startParticleW
            r3.writeInt(r4)
            int r4 = r2.startParticleH
            r3.writeInt(r4)
            boolean r4 = r2.visibile
            byte r4 = (byte) r4
            r3.writeByte(r4)
            return
    }

    public com.amap.api.maps.model.particle.ParticleOverlayOptions zIndex(float r1) {
            r0 = this;
            r0.zIndex = r1
            return r0
    }
}
