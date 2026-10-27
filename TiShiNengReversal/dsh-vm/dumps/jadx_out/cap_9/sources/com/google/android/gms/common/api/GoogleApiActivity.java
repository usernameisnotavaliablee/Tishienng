package com.google.android.gms.common.api;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.gms.common.annotation.KeepName
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class GoogleApiActivity extends android.app.Activity implements android.content.DialogInterface.OnCancelListener {

    @androidx.annotation.VisibleForTesting
    protected int zaa;

    static {
            r0 = 27291(0x6a9b, float:3.8243E-41)
            com.stub.StubApp.interface11(r0)
            return
    }

    public GoogleApiActivity() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.zaa = r0
            return
    }

    @androidx.annotation.NonNull
    public static android.content.Intent zaa(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.NonNull android.app.PendingIntent r3, int r4, boolean r5) {
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.google.android.gms.common.api.GoogleApiActivity> r1 = com.google.android.gms.common.api.GoogleApiActivity.class
            r0.<init>(r2, r1)
            java.lang.String r2 = "pending_intent"
            r0.putExtra(r2, r3)
            java.lang.String r2 = "failing_client_id"
            r0.putExtra(r2, r4)
            java.lang.String r2 = "notify_manager"
            r0.putExtra(r2, r5)
            return r0
    }

    private final void zab() {
            r11 = this;
            android.content.Intent r0 = r11.getIntent()
            android.os.Bundle r0 = r0.getExtras()
            if (r0 != 0) goto Le
            r11.finish()
            return
        Le:
            java.lang.String r1 = "pending_intent"
            java.lang.Object r1 = r0.get(r1)
            android.app.PendingIntent r1 = (android.app.PendingIntent) r1
            java.lang.String r2 = "error_code"
            java.lang.Object r2 = r0.get(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r1 != 0) goto L27
            if (r2 == 0) goto L23
            goto L27
        L23:
            r11.finish()
            return
        L27:
            r3 = 1
            if (r1 == 0) goto L95
            android.content.IntentSender r5 = r1.getIntentSender()     // Catch: android.content.IntentSender.SendIntentException -> L3c android.content.ActivityNotFoundException -> L41
            r9 = 0
            r10 = 0
            r6 = 1
            r7 = 0
            r8 = 0
            r4 = r11
            r4.startIntentSenderForResult(r5, r6, r7, r8, r9, r10)     // Catch: android.content.ActivityNotFoundException -> L3a android.content.IntentSender.SendIntentException -> L3d
            r4.zaa = r3     // Catch: android.content.ActivityNotFoundException -> L3a android.content.IntentSender.SendIntentException -> L3d
            return
        L3a:
            goto L43
        L3c:
            r4 = r11
        L3d:
            r11.finish()
            return
        L41:
            r4 = r11
            goto L3a
        L43:
            java.lang.String r2 = "notify_manager"
            boolean r0 = r0.getBoolean(r2, r3)
            if (r0 == 0) goto L66
            com.google.android.gms.common.api.internal.GoogleApiManager r0 = com.google.android.gms.common.api.internal.GoogleApiManager.zak(r11)
            com.google.android.gms.common.ConnectionResult r1 = new com.google.android.gms.common.ConnectionResult
            r2 = 22
            r5 = 0
            r1.<init>(r2, r5)
            android.content.Intent r2 = r11.getIntent()
            java.lang.String r5 = "failing_client_id"
            r6 = -1
            int r2 = r2.getIntExtra(r5, r6)
            r0.zax(r1, r2)
            goto L8f
        L66:
            java.lang.String r0 = r1.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Activity not found while launching "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = "."
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = android.os.Build.FINGERPRINT
            java.lang.String r2 = "generic"
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L8f
            java.lang.String r1 = " This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store."
            r0.concat(r1)
        L8f:
            r4.zaa = r3
            r11.finish()
            return
        L95:
            r4 = r11
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            com.google.android.gms.common.GoogleApiAvailability r1 = com.google.android.gms.common.GoogleApiAvailability.getInstance()
            r2 = 2
            r1.showErrorDialogFragment(r11, r0, r2, r11)
            r4.zaa = r3
            return
    }

    @Override // android.app.Activity
    protected final void onActivityResult(int r4, int r5, @androidx.annotation.NonNull android.content.Intent r6) {
            r3 = this;
            super.onActivityResult(r4, r5, r6)
            r0 = 0
            r1 = 1
            if (r4 != r1) goto L3c
            android.content.Intent r4 = r3.getIntent()
            java.lang.String r2 = "notify_manager"
            boolean r4 = r4.getBooleanExtra(r2, r1)
            r3.zaa = r0
            r3.setResult(r5, r6)
            if (r4 == 0) goto L44
            com.google.android.gms.common.api.internal.GoogleApiManager r4 = com.google.android.gms.common.api.internal.GoogleApiManager.zak(r3)
            r6 = -1
            if (r5 == r6) goto L38
            if (r5 == 0) goto L22
            goto L44
        L22:
            com.google.android.gms.common.ConnectionResult r5 = new com.google.android.gms.common.ConnectionResult
            r0 = 13
            r1 = 0
            r5.<init>(r0, r1)
            android.content.Intent r0 = r3.getIntent()
            java.lang.String r1 = "failing_client_id"
            int r6 = r0.getIntExtra(r1, r6)
            r4.zax(r5, r6)
            goto L44
        L38:
            r4.zay()
            goto L44
        L3c:
            r1 = 2
            if (r4 != r1) goto L44
            r3.zaa = r0
            r3.setResult(r5, r6)
        L44:
            r3.finish()
            return
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(@androidx.annotation.NonNull android.content.DialogInterface r1) {
            r0 = this;
            r1 = 0
            r0.zaa = r1
            r0.setResult(r1)
            r0.finish()
            return
    }

    @Override // android.app.Activity
    protected native void onCreate(@androidx.annotation.Nullable android.os.Bundle r1);

    @Override // android.app.Activity
    protected final void onSaveInstanceState(@androidx.annotation.NonNull android.os.Bundle r3) {
            r2 = this;
            java.lang.String r0 = "resolution"
            int r1 = r2.zaa
            r3.putInt(r0, r1)
            super.onSaveInstanceState(r3)
            return
    }
}
