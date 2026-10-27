package com.google.android.gms.common.api;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "StatusCreator")
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class Status extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.api.Result, com.google.android.gms.common.internal.ReflectedParcelable {

    @androidx.annotation.NonNull
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.api.Status> CREATOR = null;

    @androidx.annotation.NonNull
    @com.google.android.gms.common.internal.ShowFirstParty
    @com.google.android.gms.common.annotation.KeepForSdk
    public static final com.google.android.gms.common.api.Status RESULT_CANCELED = null;

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static final com.google.android.gms.common.api.Status RESULT_DEAD_CLIENT = null;

    @androidx.annotation.NonNull
    @com.google.android.gms.common.internal.ShowFirstParty
    @com.google.android.gms.common.annotation.KeepForSdk
    public static final com.google.android.gms.common.api.Status RESULT_INTERNAL_ERROR = null;

    @androidx.annotation.NonNull
    @com.google.android.gms.common.internal.ShowFirstParty
    @com.google.android.gms.common.annotation.KeepForSdk
    public static final com.google.android.gms.common.api.Status RESULT_INTERRUPTED = null;

    @androidx.annotation.NonNull
    @com.google.android.gms.common.internal.ShowFirstParty
    @com.google.android.gms.common.annotation.KeepForSdk
    public static final com.google.android.gms.common.api.Status RESULT_SUCCESS = null;

    @androidx.annotation.NonNull
    @com.google.android.gms.common.internal.ShowFirstParty
    @com.google.android.gms.common.annotation.KeepForSdk
    public static final com.google.android.gms.common.api.Status RESULT_SUCCESS_CACHE = null;

    @androidx.annotation.NonNull
    @com.google.android.gms.common.internal.ShowFirstParty
    @com.google.android.gms.common.annotation.KeepForSdk
    public static final com.google.android.gms.common.api.Status RESULT_TIMEOUT = null;

    @androidx.annotation.NonNull
    @com.google.android.gms.common.internal.ShowFirstParty
    public static final com.google.android.gms.common.api.Status zza = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getStatusCode", id = 1)
    private final int zzb;

    @androidx.annotation.Nullable
    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getStatusMessage", id = 2)
    private final java.lang.String zzc;

    @androidx.annotation.Nullable
    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getPendingIntent", id = 3)
    private final android.app.PendingIntent zzd;

    @androidx.annotation.Nullable
    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getConnectionResult", id = 4)
    private final com.google.android.gms.common.ConnectionResult zze;

    static {
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r1 = -1
            r0.<init>(r1)
            com.google.android.gms.common.api.Status.RESULT_SUCCESS_CACHE = r0
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r1 = 0
            r0.<init>(r1)
            com.google.android.gms.common.api.Status.RESULT_SUCCESS = r0
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r1 = 14
            r0.<init>(r1)
            com.google.android.gms.common.api.Status.RESULT_INTERRUPTED = r0
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r1 = 8
            r0.<init>(r1)
            com.google.android.gms.common.api.Status.RESULT_INTERNAL_ERROR = r0
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r1 = 15
            r0.<init>(r1)
            com.google.android.gms.common.api.Status.RESULT_TIMEOUT = r0
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r1 = 16
            r0.<init>(r1)
            com.google.android.gms.common.api.Status.RESULT_CANCELED = r0
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r1 = 17
            r0.<init>(r1)
            com.google.android.gms.common.api.Status.zza = r0
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r1 = 18
            r0.<init>(r1)
            com.google.android.gms.common.api.Status.RESULT_DEAD_CLIENT = r0
            com.google.android.gms.common.api.zzb r0 = new com.google.android.gms.common.api.zzb
            r0.<init>()
            com.google.android.gms.common.api.Status.CREATOR = r0
            return
    }

    public Status(int r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public Status(int r2, @androidx.annotation.Nullable java.lang.String r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public Status(int r2, @androidx.annotation.Nullable java.lang.String r3, @androidx.annotation.Nullable android.app.PendingIntent r4) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r4, r0)
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    Status(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) int r1, @androidx.annotation.Nullable @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) java.lang.String r2, @androidx.annotation.Nullable @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) android.app.PendingIntent r3, @androidx.annotation.Nullable @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) com.google.android.gms.common.ConnectionResult r4) {
            r0 = this;
            r0.<init>()
            r0.zzb = r1
            r0.zzc = r2
            r0.zzd = r3
            r0.zze = r4
            return
    }

    public Status(@androidx.annotation.NonNull com.google.android.gms.common.ConnectionResult r2, @androidx.annotation.NonNull java.lang.String r3) {
            r1 = this;
            r0 = 17
            r1.<init>(r2, r3, r0)
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    @java.lang.Deprecated
    public Status(@androidx.annotation.NonNull com.google.android.gms.common.ConnectionResult r2, @androidx.annotation.NonNull java.lang.String r3, int r4) {
            r1 = this;
            android.app.PendingIntent r0 = r2.getResolution()
            r1.<init>(r4, r3, r0, r2)
            return
    }

    public boolean equals(@androidx.annotation.Nullable java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof com.google.android.gms.common.api.Status
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.google.android.gms.common.api.Status r4 = (com.google.android.gms.common.api.Status) r4
            int r0 = r3.zzb
            int r2 = r4.zzb
            if (r0 != r2) goto L2e
            java.lang.String r0 = r3.zzc
            java.lang.String r2 = r4.zzc
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r2)
            if (r0 == 0) goto L2e
            android.app.PendingIntent r0 = r3.zzd
            android.app.PendingIntent r2 = r4.zzd
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r2)
            if (r0 == 0) goto L2e
            com.google.android.gms.common.ConnectionResult r0 = r3.zze
            com.google.android.gms.common.ConnectionResult r4 = r4.zze
            boolean r4 = com.google.android.gms.common.internal.Objects.equal(r0, r4)
            if (r4 == 0) goto L2e
            r4 = 1
            return r4
        L2e:
            return r1
    }

    @androidx.annotation.Nullable
    public com.google.android.gms.common.ConnectionResult getConnectionResult() {
            r1 = this;
            com.google.android.gms.common.ConnectionResult r0 = r1.zze
            return r0
    }

    @androidx.annotation.Nullable
    public android.app.PendingIntent getResolution() {
            r1 = this;
            android.app.PendingIntent r0 = r1.zzd
            return r0
    }

    @Override // com.google.android.gms.common.api.Result
    @androidx.annotation.NonNull
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.gms.common.api.Status getStatus() {
            r0 = this;
            return r0
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public int getStatusCode() {
            r1 = this;
            int r0 = r1.zzb
            return r0
    }

    @androidx.annotation.Nullable
    public java.lang.String getStatusMessage() {
            r1 = this;
            java.lang.String r0 = r1.zzc
            return r0
    }

    public boolean hasResolution() {
            r1 = this;
            android.app.PendingIntent r0 = r1.zzd
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public int hashCode() {
            r6 = this;
            int r0 = r6.zzb
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = r6.zzc
            android.app.PendingIntent r2 = r6.zzd
            com.google.android.gms.common.ConnectionResult r3 = r6.zze
            r4 = 4
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r5 = 0
            r4[r5] = r0
            r0 = 1
            r4[r0] = r1
            r0 = 2
            r4[r0] = r2
            r0 = 3
            r4[r0] = r3
            int r0 = com.google.android.gms.common.internal.Objects.hashCode(r4)
            return r0
    }

    public boolean isCanceled() {
            r2 = this;
            int r0 = r2.zzb
            r1 = 16
            if (r0 != r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public boolean isInterrupted() {
            r2 = this;
            int r0 = r2.zzb
            r1 = 14
            if (r0 != r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @com.google.errorprone.annotations.CheckReturnValue
    public boolean isSuccess() {
            r1 = this;
            int r0 = r1.zzb
            if (r0 > 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public void startResolutionForResult(@androidx.annotation.NonNull android.app.Activity r9, int r10) throws android.content.IntentSender.SendIntentException {
            r8 = this;
            boolean r0 = r8.hasResolution()
            if (r0 != 0) goto L7
            return
        L7:
            android.app.PendingIntent r0 = r8.zzd
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            android.content.IntentSender r2 = r0.getIntentSender()
            r6 = 0
            r7 = 0
            r4 = 0
            r5 = 0
            r1 = r9
            r3 = r10
            r1.startIntentSenderForResult(r2, r3, r4, r5, r6, r7)
            return
    }

    public void startResolutionForResult(@androidx.annotation.NonNull androidx.activity.result.ActivityResultLauncher<androidx.activity.result.IntentSenderRequest> r3) {
            r2 = this;
            boolean r0 = r2.hasResolution()
            if (r0 != 0) goto L7
            return
        L7:
            android.app.PendingIntent r0 = r2.zzd
            androidx.activity.result.IntentSenderRequest$Builder r1 = new androidx.activity.result.IntentSenderRequest$Builder
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            android.content.IntentSender r0 = r0.getIntentSender()
            r1.<init>(r0)
            androidx.activity.result.IntentSenderRequest r0 = r1.build()
            r3.launch(r0)
            return
    }

    @androidx.annotation.NonNull
    public java.lang.String toString() {
            r3 = this;
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = com.google.android.gms.common.internal.Objects.toStringHelper(r3)
            java.lang.String r1 = "statusCode"
            java.lang.String r2 = r3.zza()
            r0.add(r1, r2)
            java.lang.String r1 = "resolution"
            android.app.PendingIntent r2 = r3.zzd
            r0.add(r1, r2)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@androidx.annotation.NonNull android.os.Parcel r5, int r6) {
            r4 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r5)
            r1 = 1
            int r2 = r4.getStatusCode()
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r5, r1, r2)
            java.lang.String r1 = r4.getStatusMessage()
            r2 = 2
            r3 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r2, r1, r3)
            r1 = 3
            android.app.PendingIntent r2 = r4.zzd
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r1, r2, r6, r3)
            r1 = 4
            com.google.android.gms.common.ConnectionResult r2 = r4.getConnectionResult()
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r1, r2, r6, r3)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r5, r0)
            return
    }

    @androidx.annotation.NonNull
    public final java.lang.String zza() {
            r1 = this;
            java.lang.String r0 = r1.zzc
            if (r0 == 0) goto L5
            return r0
        L5:
            int r0 = r1.zzb
            java.lang.String r0 = com.google.android.gms.common.api.CommonStatusCodes.getStatusCodeString(r0)
            return r0
    }
}
