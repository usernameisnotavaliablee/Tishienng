package com.google.mlkit.acceleration.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public interface AcceleratableDetectorOptions<OptionsT> {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.google.android.gms.common.annotation.KeepForSdk
    public static class KeyValueDecoder {
        private final java.util.Map zza;

        private KeyValueDecoder(java.lang.String r3) {
                r2 = this;
                r2.<init>()
                java.lang.String r0 = " && "
                com.google.android.gms.internal.mlkit_acceleration.zzaf r0 = com.google.android.gms.internal.mlkit_acceleration.zzaf.zzd(r0)
                com.google.android.gms.internal.mlkit_acceleration.zzaf r0 = r0.zzc()
                java.lang.String r1 = " == "
                com.google.android.gms.internal.mlkit_acceleration.zzac r0 = r0.zzb(r1)
                java.util.Map r3 = r0.zza(r3)
                r2.zza = r3
                return
        }

        @androidx.annotation.NonNull
        @com.google.android.gms.common.annotation.KeepForSdk
        public static com.google.mlkit.acceleration.internal.AcceleratableDetectorOptions.KeyValueDecoder newInstance(@androidx.annotation.NonNull java.lang.String r1) {
                com.google.mlkit.acceleration.internal.AcceleratableDetectorOptions$KeyValueDecoder r0 = new com.google.mlkit.acceleration.internal.AcceleratableDetectorOptions$KeyValueDecoder
                r0.<init>(r1)
                return r0
        }

        @androidx.annotation.Nullable
        private static java.lang.Integer zza(@androidx.annotation.Nullable java.lang.String r3) {
                r0 = 0
                if (r3 != 0) goto L4
                return r0
            L4:
                int r1 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.NumberFormatException -> Ld
                java.lang.Integer r3 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.NumberFormatException -> Ld
                return r3
            Ld:
                java.lang.String r1 = "AcceleratableOptions"
                r2 = 3
                boolean r1 = android.util.Log.isLoggable(r1, r2)
                if (r1 == 0) goto L1c
                java.lang.String r1 = "Value cannot be parsed to int: "
                r1.concat(r3)
            L1c:
                return r0
        }

        @androidx.annotation.Nullable
        @com.google.android.gms.common.annotation.KeepForSdk
        public java.lang.Boolean getBoolean(@androidx.annotation.NonNull java.lang.String r3) {
                r2 = this;
                java.lang.String r3 = r2.getString(r3)
                if (r3 != 0) goto L7
                goto L21
            L7:
                java.lang.Boolean r0 = java.lang.Boolean.TRUE
                java.lang.String r1 = r0.toString()
                boolean r1 = r1.equals(r3)
                if (r1 == 0) goto L14
                return r0
            L14:
                java.lang.Boolean r0 = java.lang.Boolean.FALSE
                java.lang.String r1 = r0.toString()
                boolean r3 = r1.equals(r3)
                if (r3 == 0) goto L21
                return r0
            L21:
                r3 = 0
                return r3
        }

        @androidx.annotation.Nullable
        @com.google.android.gms.common.annotation.KeepForSdk
        public java.lang.Integer getInt(@androidx.annotation.NonNull java.lang.String r1) {
                r0 = this;
                java.lang.String r1 = r0.getString(r1)
                java.lang.Integer r1 = zza(r1)
                return r1
        }

        @androidx.annotation.Nullable
        @com.google.android.gms.common.annotation.KeepForSdk
        public int[] getIntArray(@androidx.annotation.NonNull java.lang.String r5) {
                r4 = this;
                java.lang.String r5 = r4.getString(r5)
                r0 = 0
                if (r5 != 0) goto L8
                return r0
            L8:
                java.lang.String r1 = " , "
                com.google.android.gms.internal.mlkit_acceleration.zzaf r1 = com.google.android.gms.internal.mlkit_acceleration.zzaf.zzd(r1)
                com.google.android.gms.internal.mlkit_acceleration.zzp r2 = com.google.android.gms.internal.mlkit_acceleration.zzp.zzb()
                com.google.android.gms.internal.mlkit_acceleration.zzaf r1 = r1.zze(r2)
                com.google.android.gms.internal.mlkit_acceleration.zzaf r1 = r1.zzc()
                java.lang.Iterable r5 = r1.zzf(r5)
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                java.util.Iterator r5 = r5.iterator()
            L27:
                boolean r2 = r5.hasNext()
                if (r2 == 0) goto L3e
                java.lang.Object r2 = r5.next()
                java.lang.String r2 = (java.lang.String) r2
                java.lang.Integer r2 = zza(r2)
                if (r2 != 0) goto L3a
                return r0
            L3a:
                r1.add(r2)
                goto L27
            L3e:
                java.lang.Object[] r5 = r1.toArray()
                int r0 = r5.length
                int[] r1 = new int[r0]
                r2 = 0
            L46:
                if (r2 >= r0) goto L58
                r3 = r5[r2]
                r3.getClass()
                java.lang.Number r3 = (java.lang.Number) r3
                int r3 = r3.intValue()
                r1[r2] = r3
                int r2 = r2 + 1
                goto L46
            L58:
                return r1
        }

        @androidx.annotation.Nullable
        @com.google.android.gms.common.annotation.KeepForSdk
        public java.lang.String getString(@androidx.annotation.NonNull java.lang.String r2) {
                r1 = this;
                java.util.Map r0 = r1.zza
                java.lang.Object r2 = r0.get(r2)
                java.lang.String r2 = (java.lang.String) r2
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.google.android.gms.common.annotation.KeepForSdk
    public static class KeyValueEncoder {
        private final java.util.List zza;

        public KeyValueEncoder() {
                r1 = this;
                r1.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.zza = r0
                return
        }

        @androidx.annotation.NonNull
        @com.google.android.gms.common.annotation.KeepForSdk
        public static com.google.mlkit.acceleration.internal.AcceleratableDetectorOptions.KeyValueEncoder newInstance() {
                com.google.mlkit.acceleration.internal.AcceleratableDetectorOptions$KeyValueEncoder r0 = new com.google.mlkit.acceleration.internal.AcceleratableDetectorOptions$KeyValueEncoder
                r0.<init>()
                return r0
        }

        @androidx.annotation.NonNull
        @com.google.android.gms.common.annotation.KeepForSdk
        public com.google.mlkit.acceleration.internal.AcceleratableDetectorOptions.KeyValueEncoder addBoolean(@androidx.annotation.NonNull java.lang.String r2, boolean r3) {
                r1 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                r1.addString(r2, r3)
                return r1
        }

        @androidx.annotation.NonNull
        @com.google.android.gms.common.annotation.KeepForSdk
        public com.google.mlkit.acceleration.internal.AcceleratableDetectorOptions.KeyValueEncoder addInt(@androidx.annotation.NonNull java.lang.String r2, int r3) {
                r1 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                r1.addString(r2, r3)
                return r1
        }

        @androidx.annotation.NonNull
        @com.google.android.gms.common.annotation.KeepForSdk
        public com.google.mlkit.acceleration.internal.AcceleratableDetectorOptions.KeyValueEncoder addIntArray(@androidx.annotation.NonNull java.lang.String r4, @androidx.annotation.Nullable int[] r5) {
                r3 = this;
                if (r5 != 0) goto L3
                return r3
            L3:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r1 = 0
            L9:
                int r2 = r5.length
                if (r1 >= r2) goto L19
                r2 = r5[r1]
                r0.append(r2)
                java.lang.String r2 = " , "
                r0.append(r2)
                int r1 = r1 + 1
                goto L9
            L19:
                java.lang.String r5 = r0.toString()
                r3.addString(r4, r5)
                return r3
        }

        @androidx.annotation.NonNull
        @com.google.android.gms.common.annotation.KeepForSdk
        public com.google.mlkit.acceleration.internal.AcceleratableDetectorOptions.KeyValueEncoder addString(@androidx.annotation.NonNull java.lang.String r3, @androidx.annotation.Nullable java.lang.String r4) {
                r2 = this;
                if (r4 == 0) goto Lc
                java.util.List r0 = r2.zza
                android.util.Pair r1 = new android.util.Pair
                r1.<init>(r3, r4)
                r0.add(r1)
            Lc:
                return r2
        }

        @androidx.annotation.NonNull
        @com.google.android.gms.common.annotation.KeepForSdk
        public java.lang.String encode() {
                r4 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.util.List r1 = r4.zza
                java.util.Iterator r1 = r1.iterator()
            Lb:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L30
                java.lang.Object r2 = r1.next()
                android.util.Pair r2 = (android.util.Pair) r2
                java.lang.Object r3 = r2.first
                java.lang.String r3 = (java.lang.String) r3
                r0.append(r3)
                java.lang.String r3 = " == "
                r0.append(r3)
                java.lang.Object r2 = r2.second
                java.lang.String r2 = (java.lang.String) r2
                r0.append(r2)
                java.lang.String r2 = " && "
                r0.append(r2)
                goto Lb
            L30:
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    OptionsT cloneWithRunConfigAssigned(@androidx.annotation.NonNull java.lang.String r1, boolean r2);

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    OptionsT decode(@androidx.annotation.NonNull java.lang.String r1);

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    java.lang.String encode();

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    int[] getPreferredHardwareConfigs();

    @androidx.annotation.Nullable
    @com.google.android.gms.common.annotation.KeepForSdk
    java.lang.String getRunConfigName();

    @com.google.android.gms.common.annotation.KeepForSdk
    boolean isForBenchmark();
}
