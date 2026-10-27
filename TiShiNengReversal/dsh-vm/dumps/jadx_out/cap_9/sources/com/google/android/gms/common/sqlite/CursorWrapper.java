package com.google.android.gms.common.sqlite;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class CursorWrapper extends android.database.CursorWrapper implements android.database.CrossProcessCursor {
    private android.database.AbstractWindowedCursor zza;

    @com.google.android.gms.common.annotation.KeepForSdk
    public CursorWrapper(@androidx.annotation.NonNull android.database.Cursor r3) {
            r2 = this;
            r2.<init>(r3)
            r0 = 0
        L4:
            r1 = 10
            if (r0 >= r1) goto L15
            boolean r1 = r3 instanceof android.database.CursorWrapper
            if (r1 == 0) goto L15
            android.database.CursorWrapper r3 = (android.database.CursorWrapper) r3
            android.database.Cursor r3 = r3.getWrappedCursor()
            int r0 = r0 + 1
            goto L4
        L15:
            boolean r0 = r3 instanceof android.database.AbstractWindowedCursor
            if (r0 == 0) goto L1e
            android.database.AbstractWindowedCursor r3 = (android.database.AbstractWindowedCursor) r3
            r2.zza = r3
            return
        L1e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getName()
            java.lang.String r1 = "Unknown type: "
            java.lang.String r3 = r1.concat(r3)
            r0.<init>(r3)
            throw r0
    }

    @Override // android.database.CrossProcessCursor
    @com.google.android.gms.common.annotation.KeepForSdk
    public void fillWindow(int r2, @androidx.annotation.NonNull android.database.CursorWindow r3) {
            r1 = this;
            android.database.AbstractWindowedCursor r0 = r1.zza
            r0.fillWindow(r2, r3)
            return
    }

    @Override // android.database.CrossProcessCursor
    @androidx.annotation.Nullable
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    @com.google.android.gms.common.annotation.KeepForSdk
    public android.database.CursorWindow getWindow() {
            r1 = this;
            android.database.AbstractWindowedCursor r0 = r1.zza
            android.database.CursorWindow r0 = r0.getWindow()
            return r0
    }

    @Override // android.database.CursorWrapper
    @androidx.annotation.NonNull
    public final /* synthetic */ android.database.Cursor getWrappedCursor() {
            r1 = this;
            android.database.AbstractWindowedCursor r0 = r1.zza
            return r0
    }

    @Override // android.database.CrossProcessCursor
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final boolean onMove(int r2, int r3) {
            r1 = this;
            android.database.AbstractWindowedCursor r0 = r1.zza
            boolean r2 = r0.onMove(r2, r3)
            return r2
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void setWindow(@androidx.annotation.Nullable android.database.CursorWindow r2) {
            r1 = this;
            android.database.AbstractWindowedCursor r0 = r1.zza
            r0.setWindow(r2)
            return
    }
}
