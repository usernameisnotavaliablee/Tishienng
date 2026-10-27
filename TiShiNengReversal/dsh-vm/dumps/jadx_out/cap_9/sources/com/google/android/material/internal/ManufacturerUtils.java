package com.google.android.material.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class ManufacturerUtils {
    private static final java.lang.String LGE = "lge";
    private static final java.lang.String MEIZU = "meizu";
    private static final java.lang.String SAMSUNG = "samsung";

    private ManufacturerUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    private static java.lang.String getManufacturer() {
            java.lang.String r0 = android.os.Build.MANUFACTURER
            if (r0 == 0) goto Lb
            java.util.Locale r1 = java.util.Locale.ENGLISH
            java.lang.String r0 = r0.toLowerCase(r1)
            return r0
        Lb:
            java.lang.String r0 = ""
            return r0
    }

    public static boolean isDateInputKeyboardMissingSeparatorCharacters() {
            boolean r0 = isLGEDevice()
            if (r0 != 0) goto Lf
            boolean r0 = isSamsungDevice()
            if (r0 == 0) goto Ld
            goto Lf
        Ld:
            r0 = 0
            return r0
        Lf:
            r0 = 1
            return r0
    }

    public static boolean isLGEDevice() {
            java.lang.String r0 = getManufacturer()
            java.lang.String r1 = "lge"
            boolean r0 = r0.equals(r1)
            return r0
    }

    public static boolean isMeizuDevice() {
            java.lang.String r0 = getManufacturer()
            java.lang.String r1 = "meizu"
            boolean r0 = r0.equals(r1)
            return r0
    }

    public static boolean isSamsungDevice() {
            java.lang.String r0 = getManufacturer()
            java.lang.String r1 = "samsung"
            boolean r0 = r0.equals(r1)
            return r0
    }
}
