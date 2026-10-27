package com.google.android.gms.common.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public interface IAccountAccessor extends android.os.IInterface {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static abstract class Stub extends com.google.android.gms.internal.common.zzb implements com.google.android.gms.common.internal.IAccountAccessor {
        public Stub() {
                r1 = this;
                java.lang.String r0 = "com.google.android.gms.common.internal.IAccountAccessor"
                r1.<init>(r0)
                return
        }

        @androidx.annotation.NonNull
        public static com.google.android.gms.common.internal.IAccountAccessor asInterface(@androidx.annotation.NonNull android.os.IBinder r2) {
                if (r2 != 0) goto L4
                r2 = 0
                return r2
            L4:
                java.lang.String r0 = "com.google.android.gms.common.internal.IAccountAccessor"
                android.os.IInterface r0 = r2.queryLocalInterface(r0)
                boolean r1 = r0 instanceof com.google.android.gms.common.internal.IAccountAccessor
                if (r1 == 0) goto L11
                com.google.android.gms.common.internal.IAccountAccessor r0 = (com.google.android.gms.common.internal.IAccountAccessor) r0
                return r0
            L11:
                com.google.android.gms.common.internal.zzw r0 = new com.google.android.gms.common.internal.zzw
                r0.<init>(r2)
                return r0
        }

        @Override // com.google.android.gms.internal.common.zzb
        protected final boolean zza(int r1, @androidx.annotation.NonNull android.os.Parcel r2, @androidx.annotation.NonNull android.os.Parcel r3, int r4) throws android.os.RemoteException {
                r0 = this;
                r2 = 2
                if (r1 != r2) goto Lf
                android.accounts.Account r1 = r0.zzb()
                r3.writeNoException()
                com.google.android.gms.internal.common.zzc.zzd(r3, r1)
                r1 = 1
                return r1
            Lf:
                r1 = 0
                return r1
        }
    }

    @androidx.annotation.NonNull
    android.accounts.Account zzb() throws android.os.RemoteException;
}
