package j2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final /* synthetic */ class d implements java.lang.Runnable {
    public final /* synthetic */ j2.b a;
    public final /* synthetic */ java.util.List b;

    public /* synthetic */ d(j2.b r1, java.util.List r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r2 = this;
            j2.b r0 = r2.a
            java.util.List r1 = r2.b
            com.oplus.omes.stdsco.urlcheck.UrlCheckClient.b(r0, r1)
            return
    }
}
