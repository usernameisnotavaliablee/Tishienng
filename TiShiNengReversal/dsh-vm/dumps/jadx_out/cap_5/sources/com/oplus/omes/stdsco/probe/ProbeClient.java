package com.oplus.omes.stdsco.probe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class ProbeClient {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a implements java.lang.Runnable {
        final /* synthetic */ android.content.Context a;
        final /* synthetic */ com.oplus.omes.stdsco.probe.a b;

        a(android.content.Context r1, com.oplus.omes.stdsco.probe.a r2) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                android.content.Context r0 = r2.a
                java.lang.String r0 = com.oplus.omes.stdsco.probe.ProbeClient.getProbeRespStr(r0)
                com.oplus.omes.stdsco.probe.a r1 = r2.b
                if (r1 != 0) goto Lb
                return
            Lb:
                if (r0 == 0) goto L11
                r1.onSuccess(r0)
                return
            L11:
                java.lang.String r0 = "error"
                r1.onError(r0)
                return
        }
    }

    public ProbeClient() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void a(android.content.Context r2, com.oplus.omes.stdsco.probe.a r3) {
            java.lang.Thread r0 = new java.lang.Thread
            com.oplus.omes.stdsco.probe.ProbeClient$a r1 = new com.oplus.omes.stdsco.probe.ProbeClient$a
            r1.<init>(r2, r3)
            r0.<init>(r1)
            r0.start()
            return
    }

    public static native java.lang.String getProbeRespStr(java.lang.Object r0);
}
