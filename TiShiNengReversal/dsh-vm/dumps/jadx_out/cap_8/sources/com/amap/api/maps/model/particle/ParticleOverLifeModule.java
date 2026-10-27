package com.amap.api.maps.model.particle;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class ParticleOverLifeModule {

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    private static final int TYPE_COLOR = 3;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    private static final int TYPE_ROTATE = 1;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    private static final int TYPE_SCALE = 2;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    private static final int TYPE_VEL = 0;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    private com.amap.api.maps.model.particle.ColorGenerate colorGenerate;
    private java.lang.Object colorGenerateObject;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    private boolean isNeedReloadColorGenerate;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    private boolean isNeedReloadRotationOverLife;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    private boolean isNeedReloadSizeOverLife;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    private boolean isNeedReloadVelocityGenerate;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    private com.amap.api.maps.model.particle.VelocityGenerate overLife;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    private com.amap.api.maps.model.particle.RotationOverLife rotateOverLife;
    private java.lang.Object rotateOverLifeObject;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    private com.amap.api.maps.model.particle.SizeOverLife sizeOverLife;
    private java.lang.Object sizeOverLifeObject;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    private com.amap.api.maps.model.particle.VelocityGenerate velocityOverLife;
    private java.lang.Object velocityOverLifeObject;

    public ParticleOverLifeModule() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.overLife = r0
            r1.velocityOverLife = r0
            r0 = 0
            r1.isNeedReloadVelocityGenerate = r0
            r1.isNeedReloadRotationOverLife = r0
            r1.isNeedReloadSizeOverLife = r0
            r1.isNeedReloadColorGenerate = r0
            return
    }

    public void setColorGenerate(com.amap.api.maps.model.particle.ColorGenerate r1) {
            r0 = this;
            r0.colorGenerate = r1
            r0.colorGenerateObject = r1
            r1 = 1
            r0.isNeedReloadColorGenerate = r1
            return
    }

    public void setRotateOverLife(com.amap.api.maps.model.particle.RotationOverLife r1) {
            r0 = this;
            r0.rotateOverLife = r1
            r0.rotateOverLifeObject = r1
            r1 = 1
            r0.isNeedReloadRotationOverLife = r1
            return
    }

    public void setSizeOverLife(com.amap.api.maps.model.particle.SizeOverLife r1) {
            r0 = this;
            r0.sizeOverLife = r1
            r0.sizeOverLifeObject = r1
            r1 = 1
            r0.isNeedReloadSizeOverLife = r1
            return
    }

    public void setVelocityOverLife(com.amap.api.maps.model.particle.VelocityGenerate r1) {
            r0 = this;
            r0.overLife = r1
            r0.velocityOverLife = r1
            r0.velocityOverLifeObject = r1
            r1 = 1
            r0.isNeedReloadVelocityGenerate = r1
            return
    }
}
