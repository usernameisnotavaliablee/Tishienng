package com.google.android.gms.common.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class zaz extends com.google.android.gms.dynamic.RemoteCreator {
    private static final com.google.android.gms.common.internal.zaz zaa = null;

    static {
            com.google.android.gms.common.internal.zaz r0 = new com.google.android.gms.common.internal.zaz
            r0.<init>()
            com.google.android.gms.common.internal.zaz.zaa = r0
            return
    }

    private zaz() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.common.ui.SignInButtonCreatorImpl"
            r1.<init>(r0)
            return
    }

    public static android.view.View zaa(android.content.Context r4, int r5, int r6) throws com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException {
            com.google.android.gms.common.internal.zaz r0 = com.google.android.gms.common.internal.zaz.zaa
            com.google.android.gms.common.internal.zax r1 = new com.google.android.gms.common.internal.zax     // Catch: java.lang.Exception -> L1e
            r2 = 1
            r3 = 0
            r1.<init>(r2, r5, r6, r3)     // Catch: java.lang.Exception -> L1e
            com.google.android.gms.dynamic.IObjectWrapper r2 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r4)     // Catch: java.lang.Exception -> L1e
            java.lang.Object r4 = r0.getRemoteCreatorInstance(r4)     // Catch: java.lang.Exception -> L1e
            com.google.android.gms.common.internal.zam r4 = (com.google.android.gms.common.internal.zam) r4     // Catch: java.lang.Exception -> L1e
            com.google.android.gms.dynamic.IObjectWrapper r4 = r4.zae(r2, r1)     // Catch: java.lang.Exception -> L1e
            java.lang.Object r4 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r4)     // Catch: java.lang.Exception -> L1e
            android.view.View r4 = (android.view.View) r4     // Catch: java.lang.Exception -> L1e
            return r4
        L1e:
            r4 = move-exception
            com.google.android.gms.dynamic.RemoteCreator$RemoteCreatorException r0 = new com.google.android.gms.dynamic.RemoteCreator$RemoteCreatorException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Could not get button with size "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = " and color "
            r1.append(r5)
            r1.append(r6)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5, r4)
            throw r0
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    public final /* synthetic */ java.lang.Object getRemoteCreator(android.os.IBinder r3) {
            r2 = this;
            if (r3 != 0) goto L4
            r3 = 0
            return r3
        L4:
            java.lang.String r0 = "com.google.android.gms.common.internal.ISignInButtonCreator"
            android.os.IInterface r0 = r3.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.common.internal.zam
            if (r1 == 0) goto L11
            com.google.android.gms.common.internal.zam r0 = (com.google.android.gms.common.internal.zam) r0
            return r0
        L11:
            com.google.android.gms.common.internal.zam r0 = new com.google.android.gms.common.internal.zam
            r0.<init>(r3)
            return r0
    }
}
