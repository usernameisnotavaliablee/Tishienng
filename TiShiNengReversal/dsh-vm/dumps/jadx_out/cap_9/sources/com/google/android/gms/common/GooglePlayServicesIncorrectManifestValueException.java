package com.google.android.gms.common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.gms.common.annotation.KeepName
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class GooglePlayServicesIncorrectManifestValueException extends com.google.android.gms.common.GooglePlayServicesManifestException {
    public GooglePlayServicesIncorrectManifestValueException(int r4) {
            r3 = this;
            int r0 = com.google.android.gms.common.GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = " but found "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = ".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r3.<init>(r4, r0)
            return
    }
}
