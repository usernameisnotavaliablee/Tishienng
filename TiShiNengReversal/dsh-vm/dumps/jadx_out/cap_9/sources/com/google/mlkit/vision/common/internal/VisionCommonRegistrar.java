package com.google.mlkit.vision.common.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class VisionCommonRegistrar implements com.google.firebase.components.ComponentRegistrar {
    public static final /* synthetic */ int zza = 0;

    public VisionCommonRegistrar() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @androidx.annotation.NonNull
    public final java.util.List getComponents() {
            r2 = this;
            java.lang.Class<com.google.mlkit.vision.common.internal.MultiFlavorDetectorCreator> r0 = com.google.mlkit.vision.common.internal.MultiFlavorDetectorCreator.class
            com.google.firebase.components.Component$Builder r0 = com.google.firebase.components.Component.builder(r0)
            java.lang.Class<com.google.mlkit.vision.common.internal.MultiFlavorDetectorCreator$Registration> r1 = com.google.mlkit.vision.common.internal.MultiFlavorDetectorCreator.Registration.class
            com.google.firebase.components.Dependency r1 = com.google.firebase.components.Dependency.setOf(r1)
            com.google.firebase.components.Component$Builder r0 = r0.add(r1)
            com.google.mlkit.vision.common.internal.zzf r1 = com.google.mlkit.vision.common.internal.zzf.zza
            com.google.firebase.components.Component$Builder r0 = r0.factory(r1)
            com.google.firebase.components.Component r0 = r0.build()
            com.google.android.gms.internal.mlkit_vision_common.zzp r0 = com.google.android.gms.internal.mlkit_vision_common.zzp.zzi(r0)
            return r0
    }
}
