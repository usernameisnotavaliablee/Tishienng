package com.kwad.components.ad.reward.l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public abstract class b extends java.util.Observable implements com.kwad.components.ad.reward.l.c, com.kwad.sdk.core.b {
    private boolean AY;
    protected java.lang.String AZ;
    protected java.lang.String Ba;

    public b() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.AY = r0
            return
    }

    private boolean kG() {
            r1 = this;
            boolean r0 = r1.AY
            return r0
    }

    private void kH() {
            r1 = this;
            r1.setChanged()
            boolean r0 = r1.AY
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.notifyObservers(r0)
            return
    }

    public boolean isCompleted() {
            r1 = this;
            boolean r0 = r1.kG()
            return r0
    }

    public final void kC() {
            r1 = this;
            boolean r0 = r1.AY
            if (r0 != 0) goto La
            r0 = 1
            r1.AY = r0
            r1.kH()
        La:
            return
    }

    public final void kD() {
            r1 = this;
            boolean r0 = r1.AY
            if (r0 == 0) goto La
            r0 = 0
            r1.AY = r0
            r1.kH()
        La:
            return
    }

    @Override // com.kwad.components.ad.reward.l.c
    public final java.lang.String kE() {
            r1 = this;
            java.lang.String r0 = r1.AZ
            return r0
    }

    @Override // com.kwad.components.ad.reward.l.c
    public final java.lang.String kF() {
            r1 = this;
            java.lang.String r0 = r1.Ba
            return r0
    }

    public void parseJson(@androidx.annotation.Nullable org.json.JSONObject r2) {
            r1 = this;
            java.lang.String r0 = "selfCompleted"
            boolean r2 = r2.optBoolean(r0)     // Catch: java.lang.Throwable -> L8
            r1.AY = r2     // Catch: java.lang.Throwable -> L8
        L8:
            return
    }

    public org.json.JSONObject toJson() {
            r3 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "selfCompleted"
            boolean r2 = r3.AY
            com.kwad.sdk.utils.aa.putValue(r0, r1, r2)
            return r0
    }
}
