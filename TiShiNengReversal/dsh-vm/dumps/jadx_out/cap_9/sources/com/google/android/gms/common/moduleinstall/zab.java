package com.google.android.gms.common.moduleinstall;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class zab implements android.os.Parcelable.Creator {
    public zab() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r6) {
            r5 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r6)
            r1 = 0
        L5:
            int r2 = r6.dataPosition()
            if (r2 >= r0) goto L23
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r6)
            int r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r2)
            r4 = 1
            if (r3 == r4) goto L1a
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r6, r2)
            goto L5
        L1a:
            android.os.Parcelable$Creator r1 = android.app.PendingIntent.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r6, r2, r1)
            android.app.PendingIntent r1 = (android.app.PendingIntent) r1
            goto L5
        L23:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r6, r0)
            com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse r6 = new com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse
            r6.<init>(r1)
            return r6
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse[] r1 = new com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse[r1]
            return r1
    }
}
