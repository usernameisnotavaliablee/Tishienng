package org.apache.commons.net;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class ProtocolCommandSupport implements java.io.Serializable {
    private static final long serialVersionUID = -8017692739988399978L;
    private final org.apache.commons.net.util.ListenerList __listeners;
    private final java.lang.Object __source;

    public ProtocolCommandSupport(java.lang.Object r2) {
            r1 = this;
            r1.<init>()
            org.apache.commons.net.util.ListenerList r0 = new org.apache.commons.net.util.ListenerList
            r0.<init>()
            r1.__listeners = r0
            r1.__source = r2
            return
    }

    public void addProtocolCommandListener(org.apache.commons.net.f r2) {
            r1 = this;
            org.apache.commons.net.util.ListenerList r0 = r1.__listeners
            r0.addListener(r2)
            return
    }

    public void fireCommandSent(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            org.apache.commons.net.ProtocolCommandEvent r0 = new org.apache.commons.net.ProtocolCommandEvent
            java.lang.Object r1 = r2.__source
            r0.<init>(r1, r3, r4)
            org.apache.commons.net.util.ListenerList r3 = r2.__listeners
            java.util.Iterator r3 = r3.iterator()
        Ld:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L1f
            java.lang.Object r4 = r3.next()
            java.util.EventListener r4 = (java.util.EventListener) r4
            org.apache.commons.net.f r4 = (org.apache.commons.net.f) r4
            r4.d(r0)
            goto Ld
        L1f:
            return
    }

    public void fireReplyReceived(int r3, java.lang.String r4) {
            r2 = this;
            org.apache.commons.net.ProtocolCommandEvent r0 = new org.apache.commons.net.ProtocolCommandEvent
            java.lang.Object r1 = r2.__source
            r0.<init>(r1, r3, r4)
            org.apache.commons.net.util.ListenerList r3 = r2.__listeners
            java.util.Iterator r3 = r3.iterator()
        Ld:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L1f
            java.lang.Object r4 = r3.next()
            java.util.EventListener r4 = (java.util.EventListener) r4
            org.apache.commons.net.f r4 = (org.apache.commons.net.f) r4
            r4.b(r0)
            goto Ld
        L1f:
            return
    }

    public int getListenerCount() {
            r1 = this;
            org.apache.commons.net.util.ListenerList r0 = r1.__listeners
            int r0 = r0.getListenerCount()
            return r0
    }

    public void removeProtocolCommandListener(org.apache.commons.net.f r2) {
            r1 = this;
            org.apache.commons.net.util.ListenerList r0 = r1.__listeners
            r0.removeListener(r2)
            return
    }
}
