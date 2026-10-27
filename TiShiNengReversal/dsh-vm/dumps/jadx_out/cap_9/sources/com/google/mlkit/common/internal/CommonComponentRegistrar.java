package com.google.mlkit.common.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class CommonComponentRegistrar implements com.google.firebase.components.ComponentRegistrar {
    public static final /* synthetic */ int zza = 0;

    public CommonComponentRegistrar() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @androidx.annotation.NonNull
    public final java.util.List getComponents() {
            r12 = this;
            com.google.firebase.components.Component<?> r0 = com.google.mlkit.common.sdkinternal.SharedPrefManager.COMPONENT
            java.lang.Class<com.google.mlkit.common.sdkinternal.model.ModelFileHelper> r1 = com.google.mlkit.common.sdkinternal.model.ModelFileHelper.class
            com.google.firebase.components.Component$Builder r1 = com.google.firebase.components.Component.builder(r1)
            java.lang.Class<com.google.mlkit.common.sdkinternal.MlKitContext> r2 = com.google.mlkit.common.sdkinternal.MlKitContext.class
            com.google.firebase.components.Dependency r3 = com.google.firebase.components.Dependency.required(r2)
            com.google.firebase.components.Component$Builder r1 = r1.add(r3)
            com.google.mlkit.common.internal.zza r3 = new com.google.mlkit.common.internal.zza
            r3.<init>()
            com.google.firebase.components.Component$Builder r1 = r1.factory(r3)
            com.google.firebase.components.Component r1 = r1.build()
            java.lang.Class<com.google.mlkit.common.sdkinternal.MlKitThreadPool> r3 = com.google.mlkit.common.sdkinternal.MlKitThreadPool.class
            com.google.firebase.components.Component$Builder r4 = com.google.firebase.components.Component.builder(r3)
            com.google.mlkit.common.internal.zzb r5 = new com.google.mlkit.common.internal.zzb
            r5.<init>()
            com.google.firebase.components.Component$Builder r4 = r4.factory(r5)
            com.google.firebase.components.Component r4 = r4.build()
            java.lang.Class<com.google.mlkit.common.model.RemoteModelManager> r5 = com.google.mlkit.common.model.RemoteModelManager.class
            com.google.firebase.components.Component$Builder r5 = com.google.firebase.components.Component.builder(r5)
            java.lang.Class<com.google.mlkit.common.model.RemoteModelManager$RemoteModelManagerRegistration> r6 = com.google.mlkit.common.model.RemoteModelManager.RemoteModelManagerRegistration.class
            com.google.firebase.components.Dependency r7 = com.google.firebase.components.Dependency.setOf(r6)
            com.google.firebase.components.Component$Builder r5 = r5.add(r7)
            com.google.mlkit.common.internal.zzc r7 = new com.google.mlkit.common.internal.zzc
            r7.<init>()
            com.google.firebase.components.Component$Builder r5 = r5.factory(r7)
            com.google.firebase.components.Component r5 = r5.build()
            java.lang.Class<com.google.mlkit.common.sdkinternal.ExecutorSelector> r7 = com.google.mlkit.common.sdkinternal.ExecutorSelector.class
            com.google.firebase.components.Component$Builder r7 = com.google.firebase.components.Component.builder(r7)
            com.google.firebase.components.Dependency r3 = com.google.firebase.components.Dependency.requiredProvider(r3)
            com.google.firebase.components.Component$Builder r3 = r7.add(r3)
            com.google.mlkit.common.internal.zzd r7 = new com.google.mlkit.common.internal.zzd
            r7.<init>()
            com.google.firebase.components.Component$Builder r3 = r3.factory(r7)
            com.google.firebase.components.Component r3 = r3.build()
            java.lang.Class<com.google.mlkit.common.sdkinternal.Cleaner> r7 = com.google.mlkit.common.sdkinternal.Cleaner.class
            com.google.firebase.components.Component$Builder r8 = com.google.firebase.components.Component.builder(r7)
            com.google.mlkit.common.internal.zze r9 = new com.google.mlkit.common.internal.zze
            r9.<init>()
            com.google.firebase.components.Component$Builder r8 = r8.factory(r9)
            com.google.firebase.components.Component r8 = r8.build()
            java.lang.Class<com.google.mlkit.common.sdkinternal.CloseGuard$Factory> r9 = com.google.mlkit.common.sdkinternal.CloseGuard.Factory.class
            com.google.firebase.components.Component$Builder r9 = com.google.firebase.components.Component.builder(r9)
            com.google.firebase.components.Dependency r7 = com.google.firebase.components.Dependency.required(r7)
            com.google.firebase.components.Component$Builder r7 = r9.add(r7)
            com.google.mlkit.common.internal.zzf r9 = new com.google.mlkit.common.internal.zzf
            r9.<init>()
            com.google.firebase.components.Component$Builder r7 = r7.factory(r9)
            com.google.firebase.components.Component r7 = r7.build()
            java.lang.Class<com.google.mlkit.common.internal.model.zzg> r9 = com.google.mlkit.common.internal.model.zzg.class
            com.google.firebase.components.Component$Builder r10 = com.google.firebase.components.Component.builder(r9)
            com.google.firebase.components.Dependency r2 = com.google.firebase.components.Dependency.required(r2)
            com.google.firebase.components.Component$Builder r2 = r10.add(r2)
            com.google.mlkit.common.internal.zzg r10 = new com.google.mlkit.common.internal.zzg
            r10.<init>()
            com.google.firebase.components.Component$Builder r2 = r2.factory(r10)
            com.google.firebase.components.Component r2 = r2.build()
            com.google.firebase.components.Component$Builder r6 = com.google.firebase.components.Component.intoSetBuilder(r6)
            com.google.firebase.components.Dependency r9 = com.google.firebase.components.Dependency.requiredProvider(r9)
            com.google.firebase.components.Component$Builder r6 = r6.add(r9)
            com.google.mlkit.common.internal.zzh r9 = new com.google.mlkit.common.internal.zzh
            r9.<init>()
            com.google.firebase.components.Component$Builder r6 = r6.factory(r9)
            com.google.firebase.components.Component r6 = r6.build()
            r11 = r7
            r7 = r2
            r2 = r4
            r4 = r3
            r3 = r5
            r5 = r8
            r8 = r6
            r6 = r11
            com.google.android.gms.internal.mlkit_common.zzaf r0 = com.google.android.gms.internal.mlkit_common.zzaf.zzi(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
    }
}
