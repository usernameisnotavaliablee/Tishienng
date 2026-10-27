package com.amap.api.maps.model.particle;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class ParticleOverlay extends com.amap.api.maps.model.BaseOverlay {
    private java.lang.ref.WeakReference<com.amap.api.maps.interfaces.IGlOverlayLayer> glOverlayLayerRef;
    private com.amap.api.maps.model.particle.ParticleOverlayOptions options;

    public ParticleOverlay(com.amap.api.maps.interfaces.IGlOverlayLayer r1, com.amap.api.maps.model.particle.ParticleOverlayOptions r2, java.lang.String r3) {
            r0 = this;
            r0.<init>(r3)
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            r3.<init>(r1)
            r0.glOverlayLayerRef = r3
            r0.options = r2
            return
    }

    private void a() {
            r3 = this;
            java.lang.ref.WeakReference<com.amap.api.maps.interfaces.IGlOverlayLayer> r0 = r3.glOverlayLayerRef
            java.lang.Object r0 = r0.get()
            com.amap.api.maps.interfaces.IGlOverlayLayer r0 = (com.amap.api.maps.interfaces.IGlOverlayLayer) r0
            java.lang.String r1 = r3.overlayName
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L19
            if (r0 == 0) goto L19
            java.lang.String r1 = r3.overlayName
            com.amap.api.maps.model.particle.ParticleOverlayOptions r2 = r3.options
            r0.updateOption(r1, r2)
        L19:
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

    public int getCurrentParticleNum() {
            r3 = this;
            r0 = 0
            java.lang.ref.WeakReference<com.amap.api.maps.interfaces.IGlOverlayLayer> r1 = r3.glOverlayLayerRef     // Catch: java.lang.Throwable -> L11
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> L11
            com.amap.api.maps.interfaces.IGlOverlayLayer r1 = (com.amap.api.maps.interfaces.IGlOverlayLayer) r1     // Catch: java.lang.Throwable -> L11
            if (r1 == 0) goto L11
            java.lang.String r2 = r3.overlayName     // Catch: java.lang.Throwable -> L11
            int r0 = r1.getCurrentParticleNum(r2)     // Catch: java.lang.Throwable -> L11
        L11:
            return r0
    }

    public void setDuration(long r2) {
            r1 = this;
            com.amap.api.maps.model.particle.ParticleOverlayOptions r0 = r1.options     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto La
            r0.setDuration(r2)     // Catch: java.lang.Throwable -> La
            r1.a()     // Catch: java.lang.Throwable -> La
        La:
            return
    }

    public void setLoop(boolean r2) {
            r1 = this;
            com.amap.api.maps.model.particle.ParticleOverlayOptions r0 = r1.options     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto La
            r0.setLoop(r2)     // Catch: java.lang.Throwable -> La
            r1.a()     // Catch: java.lang.Throwable -> La
        La:
            return
    }

    public void setMaxParticles(int r2) {
            r1 = this;
            com.amap.api.maps.model.particle.ParticleOverlayOptions r0 = r1.options     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto La
            r0.setMaxParticles(r2)     // Catch: java.lang.Throwable -> La
            r1.a()     // Catch: java.lang.Throwable -> La
        La:
            return
    }

    public void setParticleEmission(com.amap.api.maps.model.particle.ParticleEmissionModule r2) {
            r1 = this;
            com.amap.api.maps.model.particle.ParticleOverlayOptions r0 = r1.options     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto La
            r0.setParticleEmissionModule(r2)     // Catch: java.lang.Throwable -> La
            r1.a()     // Catch: java.lang.Throwable -> La
        La:
            return
    }

    public void setParticleLifeTime(long r2) {
            r1 = this;
            com.amap.api.maps.model.particle.ParticleOverlayOptions r0 = r1.options     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto La
            r0.setParticleLifeTime(r2)     // Catch: java.lang.Throwable -> La
            r1.a()     // Catch: java.lang.Throwable -> La
        La:
            return
    }

    public void setParticleOverLifeModule(com.amap.api.maps.model.particle.ParticleOverLifeModule r2) {
            r1 = this;
            com.amap.api.maps.model.particle.ParticleOverlayOptions r0 = r1.options     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto La
            r0.setParticleOverLifeModule(r2)     // Catch: java.lang.Throwable -> La
            r1.a()     // Catch: java.lang.Throwable -> La
        La:
            return
    }

    public void setParticleShapeModule(com.amap.api.maps.model.particle.ParticleShapeModule r2) {
            r1 = this;
            com.amap.api.maps.model.particle.ParticleOverlayOptions r0 = r1.options     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto La
            r0.setParticleShapeModule(r2)     // Catch: java.lang.Throwable -> La
            r1.a()     // Catch: java.lang.Throwable -> La
        La:
            return
    }

    public void setParticleStartSpeed(com.amap.api.maps.model.particle.VelocityGenerate r2) {
            r1 = this;
            com.amap.api.maps.model.particle.ParticleOverlayOptions r0 = r1.options     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto La
            r0.setParticleStartSpeed(r2)     // Catch: java.lang.Throwable -> La
            r1.a()     // Catch: java.lang.Throwable -> La
        La:
            return
    }

    public void setStartColor(com.amap.api.maps.model.particle.ColorGenerate r2) {
            r1 = this;
            com.amap.api.maps.model.particle.ParticleOverlayOptions r0 = r1.options     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto La
            r0.setParticleStartColor(r2)     // Catch: java.lang.Throwable -> La
            r1.a()     // Catch: java.lang.Throwable -> La
        La:
            return
    }

    public void setStartParticleSize(int r2, int r3) {
            r1 = this;
            com.amap.api.maps.model.particle.ParticleOverlayOptions r0 = r1.options     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto La
            r0.setStartParticleSize(r2, r3)     // Catch: java.lang.Throwable -> La
            r1.a()     // Catch: java.lang.Throwable -> La
        La:
            return
    }

    public void setVisible(boolean r2) {
            r1 = this;
            com.amap.api.maps.model.particle.ParticleOverlayOptions r0 = r1.options     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto La
            r0.setVisible(r2)     // Catch: java.lang.Throwable -> La
            r1.a()     // Catch: java.lang.Throwable -> La
        La:
            return
    }
}
