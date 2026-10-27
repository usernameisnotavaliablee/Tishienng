package com.kwad.components.ad.j;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class c {
    public c() {
            r1 = this;
            r1.<init>()
            return
    }

    @androidx.annotation.Nullable
    public static com.kwad.components.offline.api.core.adlive.IAdLiveOfflineView a(com.kwad.components.core.o.a.b.a r0, android.content.Context r1, int r2) {
            com.kwad.components.offline.api.core.adlive.IAdLiveOfflineView r0 = r0.getView(r1, r2)     // Catch: java.lang.Throwable -> L5
            return r0
        L5:
            r0 = move-exception
            com.kwad.sdk.core.d.c.printStackTrace(r0)
            com.kwad.sdk.service.ServiceProvider.reportSdkCaughtException(r0)
            r0 = 0
            return r0
    }
}
