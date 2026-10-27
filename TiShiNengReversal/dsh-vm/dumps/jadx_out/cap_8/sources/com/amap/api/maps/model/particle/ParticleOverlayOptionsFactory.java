package com.amap.api.maps.model.particle;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class ParticleOverlayOptionsFactory {
    public static final int PARTICLE_TYPE_HAZE = 3;
    public static final int PARTICLE_TYPE_RAIN = 1;
    public static final int PARTICLE_TYPE_SNOWY = 2;
    public static final int PARTICLE_TYPE_SUNNY = 0;

    public ParticleOverlayOptionsFactory() {
            r0 = this;
            r0.<init>()
            return
    }

    private static java.util.List<com.amap.api.maps.model.particle.ParticleOverlayOptions> a() {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.amap.api.maps.model.particle.ParticleOverlayOptions r1 = new com.amap.api.maps.model.particle.ParticleOverlayOptions
            r1.<init>()
            r2 = 0
            r1.setLoop(r2)
            r2 = 1
            r1.setMaxParticles(r2)
            r3 = 10000(0x2710, double:4.9407E-320)
            r1.setDuration(r3)
            com.amap.api.maps.model.particle.ParticleEmissionModule r5 = new com.amap.api.maps.model.particle.ParticleEmissionModule
            r6 = 10000(0x2710, float:1.4013E-41)
            r5.<init>(r2, r6)
            r1.setParticleEmissionModule(r5)
            com.amap.api.maps.model.particle.SinglePointParticleShape r5 = new com.amap.api.maps.model.particle.SinglePointParticleShape
            r6 = 1056964608(0x3f000000, float:0.5)
            r7 = 0
            r5.<init>(r6, r6, r7, r2)
            r1.setParticleShapeModule(r5)
            r1.setParticleLifeTime(r3)
            com.amap.api.maps.model.particle.RandomVelocityBetweenTwoConstants r8 = new com.amap.api.maps.model.particle.RandomVelocityBetweenTwoConstants
            r13 = 0
            r14 = 0
            r9 = -1054867456(0xffffffffc1200000, float:-10.0)
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            r12 = -1046478848(0xffffffffc1a00000, float:-20.0)
            r8.<init>(r9, r10, r11, r12, r13, r14)
            r1.setParticleStartSpeed(r8)
            java.lang.String r5 = "map_custom/particle/fog.png"
            com.amap.api.maps.model.BitmapDescriptor r5 = com.amap.api.maps.model.BitmapDescriptorFactory.fromAsset(r5)
            if (r5 == 0) goto L5b
            r1.icon(r5)
            int r6 = r5.getWidth()
            int r6 = r6 * 5
            int r5 = r5.getWidth()
            int r5 = r5 * 5
            r1.setStartParticleSize(r6, r5)
        L5b:
            r0.add(r1)
            com.amap.api.maps.model.particle.ParticleOverlayOptions r1 = new com.amap.api.maps.model.particle.ParticleOverlayOptions
            r1.<init>()
            r5 = 1000(0x3e8, float:1.401E-42)
            r1.setMaxParticles(r5)
            r1.setDuration(r3)
            com.amap.api.maps.model.particle.ParticleEmissionModule r5 = new com.amap.api.maps.model.particle.ParticleEmissionModule
            r6 = 30
            r7 = 2500(0x9c4, float:3.503E-42)
            r5.<init>(r6, r7)
            r1.setParticleEmissionModule(r5)
            r1.setLoop(r2)
            com.amap.api.maps.model.particle.RectParticleShape r8 = new com.amap.api.maps.model.particle.RectParticleShape
            r12 = 1065353216(0x3f800000, float:1.0)
            r13 = 1
            r9 = 1056964608(0x3f000000, float:0.5)
            r10 = 1056964608(0x3f000000, float:0.5)
            r11 = 1065353216(0x3f800000, float:1.0)
            r8.<init>(r9, r10, r11, r12, r13)
            r1.setParticleShapeModule(r8)
            r1.setParticleLifeTime(r3)
            com.amap.api.maps.model.particle.RandomVelocityBetweenTwoConstants r9 = new com.amap.api.maps.model.particle.RandomVelocityBetweenTwoConstants
            r14 = 1120403456(0x42c80000, float:100.0)
            r15 = 1065353216(0x3f800000, float:1.0)
            r10 = -1027080192(0xffffffffc2c80000, float:-100.0)
            r11 = -1027080192(0xffffffffc2c80000, float:-100.0)
            r12 = -1082130432(0xffffffffbf800000, float:-1.0)
            r13 = -1018691584(0xffffffffc3480000, float:-200.0)
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r1.setParticleStartSpeed(r9)
            java.lang.String r2 = "map_custom/particle/haze.png"
            com.amap.api.maps.model.BitmapDescriptor r2 = com.amap.api.maps.model.BitmapDescriptorFactory.fromAsset(r2)
            if (r2 == 0) goto Lb8
            r1.icon(r2)
            int r3 = r2.getWidth()
            int r2 = r2.getHeight()
            r1.setStartParticleSize(r3, r2)
        Lb8:
            com.amap.api.maps.model.particle.RandomColorBetWeenTwoConstants r4 = new com.amap.api.maps.model.particle.RandomColorBetWeenTwoConstants
            r11 = 1132396544(0x437f0000, float:255.0)
            r12 = 1132396544(0x437f0000, float:255.0)
            r5 = 1132396544(0x437f0000, float:255.0)
            r6 = 1132396544(0x437f0000, float:255.0)
            r7 = 1132396544(0x437f0000, float:255.0)
            r8 = 1120665600(0x42cc0000, float:102.0)
            r9 = 1132396544(0x437f0000, float:255.0)
            r10 = 1132396544(0x437f0000, float:255.0)
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            r1.setParticleStartColor(r4)
            r0.add(r1)
            return r0
    }

    private static com.amap.api.maps.model.particle.ParticleOverlayOptions b() {
            com.amap.api.maps.model.particle.ParticleOverlayOptions r0 = new com.amap.api.maps.model.particle.ParticleOverlayOptions
            r0.<init>()
            r1 = 1000(0x3e8, float:1.401E-42)
            r0.setMaxParticles(r1)
            r2 = 5000(0x1388, double:2.4703E-320)
            r0.setDuration(r2)
            com.amap.api.maps.model.particle.ParticleEmissionModule r2 = new com.amap.api.maps.model.particle.ParticleEmissionModule
            r3 = 20
            r2.<init>(r3, r1)
            r0.setParticleEmissionModule(r2)
            r1 = 1
            r0.setLoop(r1)
            com.amap.api.maps.model.particle.RectParticleShape r2 = new com.amap.api.maps.model.particle.RectParticleShape
            r6 = 1036831949(0x3dcccccd, float:0.1)
            r7 = 1
            r3 = 0
            r4 = 0
            r5 = 1065353216(0x3f800000, float:1.0)
            r2.<init>(r3, r4, r5, r6, r7)
            r0.setParticleShapeModule(r2)
            r1 = 10000(0x2710, double:4.9407E-320)
            r0.setParticleLifeTime(r1)
            com.amap.api.maps.model.particle.RandomVelocityBetweenTwoConstants r3 = new com.amap.api.maps.model.particle.RandomVelocityBetweenTwoConstants
            r8 = 1128792064(0x43480000, float:200.0)
            r9 = 0
            r4 = -1035468800(0xffffffffc2480000, float:-50.0)
            r5 = 1120403456(0x42c80000, float:100.0)
            r6 = 0
            r7 = 1112014848(0x42480000, float:50.0)
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r0.setParticleStartSpeed(r3)
            java.lang.String r1 = "map_custom/particle/snow.png"
            com.amap.api.maps.model.BitmapDescriptor r1 = com.amap.api.maps.model.BitmapDescriptorFactory.fromAsset(r1)
            if (r1 == 0) goto L5a
            r0.icon(r1)
            int r2 = r1.getWidth()
            int r1 = r1.getHeight()
            r0.setStartParticleSize(r2, r1)
        L5a:
            return r0
    }

    private static com.amap.api.maps.model.particle.ParticleOverlayOptions c() {
            com.amap.api.maps.model.particle.ParticleOverlayOptions r0 = new com.amap.api.maps.model.particle.ParticleOverlayOptions
            r0.<init>()
            r1 = 1000(0x3e8, float:1.401E-42)
            r0.setMaxParticles(r1)
            r2 = 5000(0x1388, double:2.4703E-320)
            r0.setDuration(r2)
            com.amap.api.maps.model.particle.ParticleEmissionModule r4 = new com.amap.api.maps.model.particle.ParticleEmissionModule
            r5 = 100
            r4.<init>(r5, r1)
            r0.setParticleEmissionModule(r4)
            r1 = 1
            r0.setLoop(r1)
            r0.setParticleLifeTime(r2)
            com.amap.api.maps.model.particle.RandomVelocityBetweenTwoConstants r4 = new com.amap.api.maps.model.particle.RandomVelocityBetweenTwoConstants
            r9 = 1148846080(0x447a0000, float:1000.0)
            r10 = 0
            r5 = 1092616192(0x41200000, float:10.0)
            r6 = 1148846080(0x447a0000, float:1000.0)
            r7 = 0
            r8 = 1120403456(0x42c80000, float:100.0)
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r0.setParticleStartSpeed(r4)
            com.amap.api.maps.model.particle.RectParticleShape r5 = new com.amap.api.maps.model.particle.RectParticleShape
            r9 = 1036831949(0x3dcccccd, float:0.1)
            r10 = 1
            r6 = 0
            r8 = 1065353216(0x3f800000, float:1.0)
            r5.<init>(r6, r7, r8, r9, r10)
            r0.setParticleShapeModule(r5)
            java.lang.String r1 = "map_custom/particle/rain.png"
            com.amap.api.maps.model.BitmapDescriptor r1 = com.amap.api.maps.model.BitmapDescriptorFactory.fromAsset(r1)
            if (r1 == 0) goto L5b
            r0.icon(r1)
            int r2 = r1.getWidth()
            int r2 = r2 * 2
            int r1 = r1.getHeight()
            int r1 = r1 * 2
            r0.setStartParticleSize(r2, r1)
        L5b:
            return r0
    }

    private static java.util.List<com.amap.api.maps.model.particle.ParticleOverlayOptions> d() {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.amap.api.maps.model.particle.ParticleOverlayOptions r1 = new com.amap.api.maps.model.particle.ParticleOverlayOptions
            r1.<init>()
            r2 = 1
            r1.setMaxParticles(r2)
            r3 = 10000(0x2710, double:4.9407E-320)
            r1.setDuration(r3)
            com.amap.api.maps.model.particle.ParticleEmissionModule r5 = new com.amap.api.maps.model.particle.ParticleEmissionModule
            r6 = 2500(0x9c4, float:3.503E-42)
            r5.<init>(r2, r6)
            r1.setParticleEmissionModule(r5)
            r1.setLoop(r2)
            com.amap.api.maps.model.particle.SinglePointParticleShape r5 = new com.amap.api.maps.model.particle.SinglePointParticleShape
            r7 = 0
            r5.<init>(r7, r7, r7)
            r1.setParticleShapeModule(r5)
            r1.setParticleLifeTime(r3)
            com.amap.api.maps.model.particle.RandomVelocityBetweenTwoConstants r8 = new com.amap.api.maps.model.particle.RandomVelocityBetweenTwoConstants
            r13 = 0
            r14 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r8.<init>(r9, r10, r11, r12, r13, r14)
            r1.setParticleStartSpeed(r8)
            com.amap.api.maps.model.particle.ParticleOverLifeModule r5 = new com.amap.api.maps.model.particle.ParticleOverLifeModule
            r5.<init>()
            r1.setParticleOverLifeModule(r5)
            java.lang.String r5 = "map_custom/particle/sun_0.png"
            com.amap.api.maps.model.BitmapDescriptor r5 = com.amap.api.maps.model.BitmapDescriptorFactory.fromAsset(r5)
            r1.icon(r5)
            r5 = 1000(0x3e8, float:1.401E-42)
            r1.setStartParticleSize(r5, r5)
            r0.add(r1)
            com.amap.api.maps.model.particle.ParticleOverlayOptions r1 = new com.amap.api.maps.model.particle.ParticleOverlayOptions
            r1.<init>()
            r1.setMaxParticles(r2)
            r1.setDuration(r3)
            com.amap.api.maps.model.particle.ParticleEmissionModule r8 = new com.amap.api.maps.model.particle.ParticleEmissionModule
            r8.<init>(r2, r6)
            r1.setParticleEmissionModule(r8)
            r1.setLoop(r2)
            com.amap.api.maps.model.particle.SinglePointParticleShape r2 = new com.amap.api.maps.model.particle.SinglePointParticleShape
            r2.<init>(r7, r7, r7)
            r1.setParticleShapeModule(r2)
            r1.setParticleLifeTime(r3)
            com.amap.api.maps.model.particle.RandomVelocityBetweenTwoConstants r8 = new com.amap.api.maps.model.particle.RandomVelocityBetweenTwoConstants
            r8.<init>(r9, r10, r11, r12, r13, r14)
            r1.setParticleStartSpeed(r8)
            com.amap.api.maps.model.particle.ParticleOverLifeModule r2 = new com.amap.api.maps.model.particle.ParticleOverLifeModule
            r2.<init>()
            com.amap.api.maps.model.particle.ConstantRotationOverLife r3 = new com.amap.api.maps.model.particle.ConstantRotationOverLife
            r4 = 1110704128(0x42340000, float:45.0)
            r3.<init>(r4)
            r2.setRotateOverLife(r3)
            r1.setParticleOverLifeModule(r2)
            java.lang.String r2 = "map_custom/particle/sun_1.png"
            com.amap.api.maps.model.BitmapDescriptor r2 = com.amap.api.maps.model.BitmapDescriptorFactory.fromAsset(r2)
            r1.icon(r2)
            r1.setStartParticleSize(r5, r5)
            r0.add(r1)
            return r0
    }

    public static java.util.List<com.amap.api.maps.model.particle.ParticleOverlayOptions> defaultOptions(int r2) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r2 == 0) goto L29
            r1 = 1
            if (r2 == r1) goto L21
            r1 = 2
            if (r2 == r1) goto L19
            r1 = 3
            if (r2 == r1) goto L11
            return r0
        L11:
            java.util.List r2 = a()
            r0.addAll(r2)
            return r0
        L19:
            com.amap.api.maps.model.particle.ParticleOverlayOptions r2 = b()
            r0.add(r2)
            return r0
        L21:
            com.amap.api.maps.model.particle.ParticleOverlayOptions r2 = c()
            r0.add(r2)
            return r0
        L29:
            java.util.List r2 = d()
            r0.addAll(r2)
            return r0
    }
}
