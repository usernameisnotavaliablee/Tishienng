package xyz.adscope.common.network;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class CancelerManager {
    private final java.util.Map<xyz.adscope.common.network.Request, xyz.adscope.common.network.Canceller> a;

    public CancelerManager() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.a = r0
            return
    }

    public void addCancel(xyz.adscope.common.network.Request r2, xyz.adscope.common.network.Canceller r3) {
            r1 = this;
            java.util.Map<xyz.adscope.common.network.Request, xyz.adscope.common.network.Canceller> r0 = r1.a
            r0.put(r2, r3)
            return
    }

    public void cancel(java.lang.Object r4) {
            r3 = this;
            java.util.Map<xyz.adscope.common.network.Request, xyz.adscope.common.network.Canceller> r0 = r3.a
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L34
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            xyz.adscope.common.network.Request r2 = (xyz.adscope.common.network.Request) r2
            java.lang.Object r2 = r2.tag()
            if (r4 == r2) goto L2a
            if (r4 == 0) goto La
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto La
        L2a:
            java.lang.Object r1 = r1.getValue()
            xyz.adscope.common.network.Canceller r1 = (xyz.adscope.common.network.Canceller) r1
            r1.cancel()
            goto La
        L34:
            return
    }

    public void removeCancel(xyz.adscope.common.network.Request r2) {
            r1 = this;
            java.util.Map<xyz.adscope.common.network.Request, xyz.adscope.common.network.Canceller> r0 = r1.a
            r0.remove(r2)
            return
    }
}
