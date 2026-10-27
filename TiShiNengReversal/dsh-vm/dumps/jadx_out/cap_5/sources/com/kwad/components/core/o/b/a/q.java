package com.kwad.components.core.o.b.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class q implements com.kwad.components.offline.api.core.api.IVibratorUtil {
    public q() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.kwad.components.offline.api.core.api.IVibratorUtil
    public final void cancelVibrate(android.content.Context r1, android.os.Vibrator r2) {
            r0 = this;
            com.kwad.sdk.utils.bw.b(r1, r2)
            return
    }

    @Override // com.kwad.components.offline.api.core.api.IVibratorUtil
    public final void vibrate(android.content.Context r1, android.os.Vibrator r2, long r3) {
            r0 = this;
            com.kwad.sdk.utils.bw.vibrate(r1, r2, r3)
            return
    }
}
