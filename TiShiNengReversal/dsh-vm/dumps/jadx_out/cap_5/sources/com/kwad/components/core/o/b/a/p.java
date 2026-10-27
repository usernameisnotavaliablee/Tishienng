package com.kwad.components.core.o.b.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class p implements com.kwad.components.offline.api.core.api.ISensorManagerProxy {
    public p() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.kwad.components.offline.api.core.api.ISensorManagerProxy
    public final android.hardware.SensorManager checkAndObtainSensorManager(android.content.Context r2) {
            r1 = this;
            com.kwad.sdk.utils.bk r0 = com.kwad.sdk.utils.bk.RC()
            android.hardware.SensorManager r2 = r0.checkAndObtainSensorManager(r2)
            return r2
    }

    @Override // com.kwad.components.offline.api.core.api.ISensorManagerProxy
    public final android.hardware.Sensor getDefaultSensor(android.content.Context r2, int r3) {
            r1 = this;
            com.kwad.sdk.utils.bk r0 = com.kwad.sdk.utils.bk.RC()
            android.hardware.Sensor r2 = r0.getDefaultSensor(r2, r3)
            return r2
    }

    @Override // com.kwad.components.offline.api.core.api.ISensorManagerProxy
    public final boolean registerListener(android.content.Context r2, android.hardware.SensorEventListener r3, android.hardware.Sensor r4, int r5) {
            r1 = this;
            com.kwad.sdk.utils.bk r0 = com.kwad.sdk.utils.bk.RC()
            boolean r2 = r0.registerListener(r2, r3, r4, r5)
            return r2
    }

    @Override // com.kwad.components.offline.api.core.api.ISensorManagerProxy
    public final void unregisterListener(android.hardware.SensorEventListener r2) {
            r1 = this;
            com.kwad.sdk.utils.bk r0 = com.kwad.sdk.utils.bk.RC()
            r0.unregisterListener(r2)
            return
    }
}
