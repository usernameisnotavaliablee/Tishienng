package com.kwad.components.ad.adbit;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class a {

    @androidx.annotation.NonNull
    public org.json.JSONObject bB;

    @androidx.annotation.NonNull
    public java.util.Map<java.lang.String, java.lang.String> bC;

    public a(@androidx.annotation.NonNull org.json.JSONObject r1, @androidx.annotation.NonNull java.util.Map<java.lang.String, java.lang.String> r2) {
            r0 = this;
            r0.<init>()
            r0.bB = r1
            r0.bC = r2
            return
    }

    public final java.lang.String O() {
            r4 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = r4.bC
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L24
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            org.json.JSONObject r2 = r4.bB
            java.util.Map<java.lang.String, java.lang.String> r3 = r4.bC
            java.lang.Object r3 = r3.get(r1)
            java.lang.String r3 = (java.lang.String) r3
            com.kwad.sdk.utils.aa.putValue(r2, r1, r3)
            goto La
        L24:
            org.json.JSONObject r0 = r4.bB
            java.lang.String r0 = r0.toString()
            return r0
    }
}
