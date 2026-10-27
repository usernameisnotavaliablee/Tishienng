package com.kwad.components.offline.c;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class a implements com.kwad.components.core.o.a.d.a {
    private final com.kwad.components.offline.api.obiwan.IObiwanOfflineCompo ajX;

    public a(@androidx.annotation.NonNull com.kwad.components.offline.api.obiwan.IObiwanOfflineCompo r1) {
            r0 = this;
            r0.<init>()
            r0.ajX = r1
            return
    }

    @Override // com.kwad.sdk.components.b
    public final java.lang.Class getComponentsType() {
            r1 = this;
            java.lang.Class<com.kwad.components.offline.c.a> r0 = com.kwad.components.offline.c.a.class
            return r0
    }

    public final com.kwad.components.offline.api.obiwan.IObiwanLogcat getLog() {
            r1 = this;
            com.kwad.components.offline.api.obiwan.IObiwanOfflineCompo r0 = r1.ajX
            com.kwad.components.offline.api.obiwan.IObiwanLogcat r0 = r0.getLog()
            return r0
    }

    @Override // com.kwad.sdk.components.b
    public final void init(android.content.Context r1) {
            r0 = this;
            return
    }

    @Override // com.kwad.sdk.components.b
    public final int priority() {
            r1 = this;
            com.kwad.components.offline.api.obiwan.IObiwanOfflineCompo r0 = r1.ajX
            int r0 = r0.priority()
            return r0
    }

    public final void updateConfigs() {
            r1 = this;
            com.kwad.components.offline.api.obiwan.IObiwanOfflineCompo r0 = r1.ajX
            r0.updateConfigs()
            return
    }
}
