package com.kwad.components.core.o.b.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class i implements com.kwad.components.offline.api.core.network.INetworkManager {
    private java.util.List<com.kwad.components.offline.api.core.network.INetworkChangeListener> RN;
    private com.kwad.sdk.core.NetworkMonitor.a RO;


    public i() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r1.RN = r0
            return
    }

    static /* synthetic */ java.util.List a(com.kwad.components.core.o.b.a.i r0) {
            java.util.List<com.kwad.components.offline.api.core.network.INetworkChangeListener> r0 = r0.RN
            return r0
    }

    private void ay(android.content.Context r3) {
            r2 = this;
            com.kwad.sdk.core.NetworkMonitor$a r0 = r2.RO
            if (r0 == 0) goto L5
            return
        L5:
            com.kwad.components.core.o.b.a.i$1 r0 = new com.kwad.components.core.o.b.a.i$1
            r0.<init>(r2, r3)
            r2.RO = r0
            com.kwad.sdk.core.NetworkMonitor r0 = com.kwad.sdk.core.NetworkMonitor.getInstance()
            com.kwad.sdk.core.NetworkMonitor$a r1 = r2.RO
            r0.a(r3, r1)
            return
    }

    @Override // com.kwad.components.offline.api.core.network.INetworkManager
    public final void addNetworkChangeListener(android.content.Context r1, com.kwad.components.offline.api.core.network.INetworkChangeListener r2) {
            r0 = this;
            if (r2 == 0) goto La
            r0.ay(r1)
            java.util.List<com.kwad.components.offline.api.core.network.INetworkChangeListener> r1 = r0.RN
            r1.add(r2)
        La:
            return
    }

    @Override // com.kwad.components.offline.api.core.network.INetworkManager
    public final int getNetworkType(android.content.Context r1) {
            r0 = this;
            int r1 = com.kwad.sdk.utils.ao.df(r1)
            return r1
    }

    @Override // com.kwad.components.offline.api.core.network.INetworkManager
    public final void removeNetworkChangeListener(android.content.Context r1, com.kwad.components.offline.api.core.network.INetworkChangeListener r2) {
            r0 = this;
            java.util.List<com.kwad.components.offline.api.core.network.INetworkChangeListener> r1 = r0.RN
            r1.remove(r2)
            return
    }
}
