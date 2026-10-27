package com.google.android.gms.common.api.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public interface IStatusCallback extends android.os.IInterface {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static abstract class Stub extends com.google.android.gms.internal.base.zab implements com.google.android.gms.common.api.internal.IStatusCallback {
        public Stub() {
                r1 = this;
                java.lang.String r0 = "com.google.android.gms.common.api.internal.IStatusCallback"
                r1.<init>(r0)
                return
        }

        @androidx.annotation.NonNull
        public static com.google.android.gms.common.api.internal.IStatusCallback asInterface(@androidx.annotation.NonNull android.os.IBinder r2) {
                if (r2 != 0) goto L4
                r2 = 0
                return r2
            L4:
                java.lang.String r0 = "com.google.android.gms.common.api.internal.IStatusCallback"
                android.os.IInterface r0 = r2.queryLocalInterface(r0)
                boolean r1 = r0 instanceof com.google.android.gms.common.api.internal.IStatusCallback
                if (r1 == 0) goto L11
                com.google.android.gms.common.api.internal.IStatusCallback r0 = (com.google.android.gms.common.api.internal.IStatusCallback) r0
                return r0
            L11:
                com.google.android.gms.common.api.internal.zaby r0 = new com.google.android.gms.common.api.internal.zaby
                r0.<init>(r2)
                return r0
        }

        @Override // com.google.android.gms.internal.base.zab
        protected final boolean zaa(int r1, @androidx.annotation.NonNull android.os.Parcel r2, @androidx.annotation.NonNull android.os.Parcel r3, int r4) throws android.os.RemoteException {
                r0 = this;
                r3 = 1
                if (r1 != r3) goto L12
                android.os.Parcelable$Creator<com.google.android.gms.common.api.Status> r1 = com.google.android.gms.common.api.Status.CREATOR
                android.os.Parcelable r1 = com.google.android.gms.internal.base.zac.zaa(r2, r1)
                com.google.android.gms.common.api.Status r1 = (com.google.android.gms.common.api.Status) r1
                com.google.android.gms.internal.base.zac.zab(r2)
                r0.onResult(r1)
                return r3
            L12:
                r1 = 0
                return r1
        }
    }

    void onResult(@androidx.annotation.NonNull com.google.android.gms.common.api.Status r1) throws android.os.RemoteException;
}
