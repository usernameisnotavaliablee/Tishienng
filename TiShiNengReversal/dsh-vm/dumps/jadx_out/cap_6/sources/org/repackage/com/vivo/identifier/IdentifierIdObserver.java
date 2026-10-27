package org.repackage.com.vivo.identifier;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class IdentifierIdObserver extends android.database.ContentObserver {
    private static final java.lang.String a = "VMS_SDK_Observer";
    private java.lang.String b;
    private int c;
    private org.repackage.com.vivo.identifier.IdentifierIdClient d;

    IdentifierIdObserver(org.repackage.com.vivo.identifier.IdentifierIdClient r2, int r3, java.lang.String r4) {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            r1.d = r2
            r1.c = r3
            r1.b = r4
            return
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean r3) {
            r2 = this;
            org.repackage.com.vivo.identifier.IdentifierIdClient r3 = r2.d
            if (r3 == 0) goto Lb
            int r0 = r2.c
            java.lang.String r1 = r2.b
            r3.a(r0, r1)
        Lb:
            return
    }
}
