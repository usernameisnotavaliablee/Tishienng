package com.google.android.gms.common.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class ViewUtils {
    private ViewUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.Nullable
    @com.google.android.gms.common.annotation.KeepForSdk
    public static java.lang.String getXmlAttributeString(@androidx.annotation.NonNull java.lang.String r0, @androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.NonNull android.util.AttributeSet r3, boolean r4, boolean r5, @androidx.annotation.NonNull java.lang.String r6) {
            if (r3 != 0) goto L4
            r0 = 0
            goto L8
        L4:
            java.lang.String r0 = r3.getAttributeValue(r0, r1)
        L8:
            if (r0 == 0) goto L4d
            java.lang.String r1 = "@string/"
            boolean r1 = r0.startsWith(r1)
            if (r1 == 0) goto L4d
            if (r4 == 0) goto L4d
            r1 = 8
            java.lang.String r1 = r0.substring(r1)
            java.lang.String r3 = r2.getPackageName()
            android.util.TypedValue r4 = new android.util.TypedValue
            r4.<init>()
            android.content.res.Resources r2 = r2.getResources()     // Catch: android.content.res.Resources.NotFoundException -> L40
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: android.content.res.Resources.NotFoundException -> L40
            r5.<init>()     // Catch: android.content.res.Resources.NotFoundException -> L40
            r5.append(r3)     // Catch: android.content.res.Resources.NotFoundException -> L40
            java.lang.String r3 = ":string/"
            r5.append(r3)     // Catch: android.content.res.Resources.NotFoundException -> L40
            r5.append(r1)     // Catch: android.content.res.Resources.NotFoundException -> L40
            java.lang.String r1 = r5.toString()     // Catch: android.content.res.Resources.NotFoundException -> L40
            r3 = 1
            r2.getValue(r1, r4, r3)     // Catch: android.content.res.Resources.NotFoundException -> L40
            goto L41
        L40:
        L41:
            java.lang.CharSequence r1 = r4.string
            if (r1 == 0) goto L4a
            java.lang.String r0 = r1.toString()
            goto L4d
        L4a:
            r4.toString()
        L4d:
            return r0
    }
}
