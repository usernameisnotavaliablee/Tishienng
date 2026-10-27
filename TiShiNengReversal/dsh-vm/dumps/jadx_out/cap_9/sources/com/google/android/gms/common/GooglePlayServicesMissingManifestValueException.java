package com.google.android.gms.common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.gms.common.annotation.KeepName
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class GooglePlayServicesMissingManifestValueException extends com.google.android.gms.common.GooglePlayServicesManifestException {
    public GooglePlayServicesMissingManifestValueException() {
            r2 = this;
            r0 = 0
            java.lang.String r1 = "A required meta-data tag in your app's AndroidManifest.xml does not exist.  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />"
            r2.<init>(r0, r1)
            return
    }
}
