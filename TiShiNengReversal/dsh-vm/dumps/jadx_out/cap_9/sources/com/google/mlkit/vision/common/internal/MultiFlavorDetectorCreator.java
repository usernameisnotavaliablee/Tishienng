package com.google.mlkit.vision.common.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class MultiFlavorDetectorCreator {
    private final java.util.Map zza;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.google.android.gms.common.annotation.KeepForSdk
    public interface DetectorCreator<DetectorT extends com.google.mlkit.vision.common.internal.MultiFlavorDetectorCreator.MultiFlavorDetector, OptionsT extends com.google.mlkit.vision.common.internal.MultiFlavorDetectorCreator.DetectorOptions<DetectorT>> {
        @androidx.annotation.NonNull
        @com.google.android.gms.common.annotation.KeepForSdk
        DetectorT create(@androidx.annotation.NonNull OptionsT r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.google.android.gms.common.annotation.KeepForSdk
    public interface DetectorOptions<DetectorT> {
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.google.android.gms.common.annotation.KeepForSdk
    public interface MultiFlavorDetector {
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.google.android.gms.common.annotation.KeepForSdk
    public static class Registration {
        private final java.lang.Class zza;
        private final com.google.firebase.inject.Provider zzb;

        @com.google.mlkit.common.sdkinternal.ClientPriority
        private final int zzc;

        @com.google.android.gms.common.annotation.KeepForSdk
        public <DetectorT extends com.google.mlkit.vision.common.internal.MultiFlavorDetectorCreator.MultiFlavorDetector, OptionsT extends com.google.mlkit.vision.common.internal.MultiFlavorDetectorCreator.DetectorOptions<DetectorT>> Registration(@androidx.annotation.NonNull java.lang.Class<? extends OptionsT> r2, @androidx.annotation.NonNull com.google.firebase.inject.Provider<? extends com.google.mlkit.vision.common.internal.MultiFlavorDetectorCreator.DetectorCreator<DetectorT, OptionsT>> r3) {
                r1 = this;
                r0 = 100
                r1.<init>(r2, r3, r0)
                return
        }

        @com.google.android.gms.common.annotation.KeepForSdk
        public <DetectorT extends com.google.mlkit.vision.common.internal.MultiFlavorDetectorCreator.MultiFlavorDetector, OptionsT extends com.google.mlkit.vision.common.internal.MultiFlavorDetectorCreator.DetectorOptions<DetectorT>> Registration(@androidx.annotation.NonNull java.lang.Class<? extends OptionsT> r1, @androidx.annotation.NonNull com.google.firebase.inject.Provider<? extends com.google.mlkit.vision.common.internal.MultiFlavorDetectorCreator.DetectorCreator<DetectorT, OptionsT>> r2, @com.google.mlkit.common.sdkinternal.ClientPriority int r3) {
                r0 = this;
                r0.<init>()
                r0.zza = r1
                r0.zzb = r2
                r0.zzc = r3
                return
        }

        @com.google.mlkit.common.sdkinternal.ClientPriority
        final int zza() {
                r1 = this;
                int r0 = r1.zzc
                return r0
        }

        final com.google.firebase.inject.Provider zzb() {
                r1 = this;
                com.google.firebase.inject.Provider r0 = r1.zzb
                return r0
        }

        final java.lang.Class zzc() {
                r1 = this;
                java.lang.Class r0 = r1.zza
                return r0
        }
    }

    MultiFlavorDetectorCreator(java.util.Set r6) {
            r5 = this;
            r5.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r5.zza = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Iterator r6 = r6.iterator()
        L13:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L56
            java.lang.Object r1 = r6.next()
            com.google.mlkit.vision.common.internal.MultiFlavorDetectorCreator$Registration r1 = (com.google.mlkit.vision.common.internal.MultiFlavorDetectorCreator.Registration) r1
            java.lang.Class r2 = r1.zzc()
            java.util.Map r3 = r5.zza
            boolean r3 = r3.containsKey(r2)
            if (r3 == 0) goto L41
            int r3 = r1.zza()
            java.lang.Object r4 = r0.get(r2)
            java.lang.Integer r4 = (java.lang.Integer) r4
            java.lang.Object r4 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            if (r3 < r4) goto L13
        L41:
            java.util.Map r3 = r5.zza
            com.google.firebase.inject.Provider r4 = r1.zzb()
            r3.put(r2, r4)
            int r1 = r1.zza()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.put(r2, r1)
            goto L13
        L56:
            return
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static synchronized com.google.mlkit.vision.common.internal.MultiFlavorDetectorCreator getInstance() {
            java.lang.Class<com.google.mlkit.vision.common.internal.MultiFlavorDetectorCreator> r0 = com.google.mlkit.vision.common.internal.MultiFlavorDetectorCreator.class
            monitor-enter(r0)
            com.google.mlkit.common.sdkinternal.MlKitContext r1 = com.google.mlkit.common.sdkinternal.MlKitContext.getInstance()     // Catch: java.lang.Throwable -> L11
            java.lang.Class<com.google.mlkit.vision.common.internal.MultiFlavorDetectorCreator> r2 = com.google.mlkit.vision.common.internal.MultiFlavorDetectorCreator.class
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L11
            com.google.mlkit.vision.common.internal.MultiFlavorDetectorCreator r1 = (com.google.mlkit.vision.common.internal.MultiFlavorDetectorCreator) r1     // Catch: java.lang.Throwable -> L11
            monitor-exit(r0)
            return r1
        L11:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r1
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public <DetectorT extends com.google.mlkit.vision.common.internal.MultiFlavorDetectorCreator.MultiFlavorDetector, OptionsT extends com.google.mlkit.vision.common.internal.MultiFlavorDetectorCreator.DetectorOptions<DetectorT>> DetectorT create(@androidx.annotation.NonNull OptionsT r3) {
            r2 = this;
            java.util.Map r0 = r2.zza
            java.lang.Class r1 = r3.getClass()
            java.lang.Object r0 = r0.get(r1)
            com.google.firebase.inject.Provider r0 = (com.google.firebase.inject.Provider) r0
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            com.google.firebase.inject.Provider r0 = (com.google.firebase.inject.Provider) r0
            java.lang.Object r0 = r0.get()
            com.google.mlkit.vision.common.internal.MultiFlavorDetectorCreator$DetectorCreator r0 = (com.google.mlkit.vision.common.internal.MultiFlavorDetectorCreator.DetectorCreator) r0
            com.google.mlkit.vision.common.internal.MultiFlavorDetectorCreator$MultiFlavorDetector r3 = r0.create(r3)
            return r3
    }
}
