package com.google.android.gms.internal.mlkit_acceleration;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class zzbz {
    private static final java.util.regex.Pattern zza = null;

    static {
            java.lang.String r0 = "(angle_\\(samsung_xclipse_[0-9]*\\)_on_vulkan).*$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.gms.internal.mlkit_acceleration.zzbz.zza = r0
            return
    }

    public zzbz() {
            r1 = this;
            r1.<init>()
            return
    }

    public static final boolean zza(com.google.android.gms.internal.mlkit_acceleration.zzbw r7, com.google.android.gms.internal.mlkit_acceleration.zzby r8, com.google.android.gms.internal.mlkit_acceleration.zzhv r9) {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r1 = "tflite.android_sdk_version"
            java.lang.String r2 = r7.zza()
            r0.put(r1, r2)
            java.lang.String r1 = "tflite.device_model"
            java.lang.String r2 = r7.zzd()
            r0.put(r1, r2)
            java.lang.String r1 = "tflite.device_name"
            java.lang.String r2 = r7.zzb()
            r0.put(r1, r2)
            java.lang.String r1 = "tflite.manufacturer"
            java.lang.String r7 = r7.zzc()
            r0.put(r1, r7)
            java.lang.String r7 = r8.zzc()
            java.lang.String r1 = "tflite.gpu_model"
            r0.put(r1, r7)
            int r7 = r8.zza()
            r2 = 10
            java.lang.String r7 = java.lang.Integer.toString(r7, r2)
            int r8 = r8.zzb()
            java.lang.String r8 = java.lang.Integer.toString(r8, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r7)
            java.lang.String r7 = "."
            r2.append(r7)
            r2.append(r8)
            java.lang.String r7 = r2.toString()
            java.lang.String r8 = "tflite.opengl_es_version"
            r0.put(r8, r7)
            java.util.Set r7 = r0.entrySet()
            java.util.Iterator r7 = r7.iterator()
        L65:
            boolean r8 = r7.hasNext()
            r2 = 0
            if (r8 == 0) goto Lca
            java.lang.Object r8 = r7.next()
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            java.lang.Object r3 = r8.getValue()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = "[ -]"
            java.lang.String r5 = "_"
            java.lang.String r3 = r3.replaceAll(r4, r5)
            int r4 = r3.length()
        L84:
            if (r2 >= r4) goto Lae
            char r5 = r3.charAt(r2)
            boolean r5 = com.google.android.gms.internal.mlkit_acceleration.zzj.zza(r5)
            if (r5 == 0) goto Lab
            char[] r3 = r3.toCharArray()
        L94:
            if (r2 >= r4) goto La6
            char r5 = r3[r2]
            boolean r6 = com.google.android.gms.internal.mlkit_acceleration.zzj.zza(r5)
            if (r6 == 0) goto La3
            r5 = r5 ^ 32
            char r5 = (char) r5
            r3[r2] = r5
        La3:
            int r2 = r2 + 1
            goto L94
        La6:
            java.lang.String r3 = java.lang.String.valueOf(r3)
            goto Lae
        Lab:
            int r2 = r2 + 1
            goto L84
        Lae:
            java.lang.Object r2 = r8.getKey()
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto Lc6
            java.util.regex.Pattern r2 = com.google.android.gms.internal.mlkit_acceleration.zzbz.zza
            java.util.regex.Matcher r2 = r2.matcher(r3)
            java.lang.String r3 = "$1"
            java.lang.String r3 = r2.replaceAll(r3)
        Lc6:
            r8.setValue(r3)
            goto L65
        Lca:
            com.google.android.gms.internal.mlkit_acceleration.zzbu.zza(r0, r9)
            java.lang.String r7 = "tflite.gpu.status"
            java.lang.Object r7 = r0.get(r7)
            java.lang.String r7 = (java.lang.String) r7
            if (r7 != 0) goto Ld8
            goto Le2
        Ld8:
            java.lang.String r8 = "SUPPORTED"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto Le2
            r7 = 1
            return r7
        Le2:
            return r2
    }
}
