package com.google.android.gms.signin;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class SignInOptions implements com.google.android.gms.common.api.Api.ApiOptions.Optional {

    @androidx.annotation.NonNull
    public static final com.google.android.gms.signin.SignInOptions zaa = null;
    private final boolean zab;
    private final boolean zac;

    @androidx.annotation.Nullable
    private final java.lang.String zad;
    private final boolean zae;

    @androidx.annotation.Nullable
    private final java.lang.String zaf;

    @androidx.annotation.Nullable
    private final java.lang.String zag;
    private final boolean zah;

    @androidx.annotation.Nullable
    private final java.lang.Long zai;

    @androidx.annotation.Nullable
    private final java.lang.Long zaj;

    static {
            com.google.android.gms.signin.SignInOptions r0 = new com.google.android.gms.signin.SignInOptions
            r9 = 0
            r10 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            com.google.android.gms.signin.SignInOptions.zaa = r0
            return
    }

    /* synthetic */ SignInOptions(boolean r1, boolean r2, java.lang.String r3, boolean r4, java.lang.String r5, java.lang.String r6, boolean r7, java.lang.Long r8, java.lang.Long r9, com.google.android.gms.signin.zaf r10) {
            r0 = this;
            r0.<init>()
            r1 = 0
            r0.zab = r1
            r0.zac = r1
            r2 = 0
            r0.zad = r2
            r0.zae = r1
            r0.zah = r1
            r0.zaf = r2
            r0.zag = r2
            r0.zai = r2
            r0.zaj = r2
            return
    }

    public final boolean equals(@androidx.annotation.Nullable java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r4 != r3) goto L4
            return r0
        L4:
            boolean r4 = r4 instanceof com.google.android.gms.signin.SignInOptions
            r1 = 0
            if (r4 != 0) goto La
            return r1
        La:
            r4 = 0
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r4, r4)
            if (r2 == 0) goto L2a
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r4, r4)
            if (r2 == 0) goto L2a
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r4, r4)
            if (r2 == 0) goto L2a
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r4, r4)
            if (r2 == 0) goto L2a
            boolean r4 = com.google.android.gms.common.internal.Objects.equal(r4, r4)
            if (r4 == 0) goto L2a
            return r0
        L2a:
            return r1
    }

    public final int hashCode() {
            r4 = this;
            r0 = 9
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r2 = 0
            r0[r2] = r1
            r2 = 1
            r0[r2] = r1
            r2 = 2
            r3 = 0
            r0[r2] = r3
            r2 = 3
            r0[r2] = r1
            r2 = 4
            r0[r2] = r1
            r1 = 5
            r0[r1] = r3
            r1 = 6
            r0[r1] = r3
            r1 = 7
            r0[r1] = r3
            r1 = 8
            r0[r1] = r3
            int r0 = com.google.android.gms.common.internal.Objects.hashCode(r0)
            return r0
    }
}
