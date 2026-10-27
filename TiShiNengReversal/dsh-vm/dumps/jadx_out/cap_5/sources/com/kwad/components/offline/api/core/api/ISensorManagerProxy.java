package com.kwad.components.offline.api.core.api;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public interface ISensorManagerProxy {
    android.hardware.SensorManager checkAndObtainSensorManager(android.content.Context r1);

    android.hardware.Sensor getDefaultSensor(android.content.Context r1, int r2);

    boolean registerListener(android.content.Context r1, android.hardware.SensorEventListener r2, android.hardware.Sensor r3, int r4);

    void unregisterListener(android.hardware.SensorEventListener r1);
}
