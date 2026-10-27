package org.apache.commons.net.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class ListenerList implements java.io.Serializable, java.lang.Iterable<java.util.EventListener> {
    private static final long serialVersionUID = -1934227607974228213L;
    private final java.util.concurrent.CopyOnWriteArrayList<java.util.EventListener> __listeners;

    public ListenerList() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r1.__listeners = r0
            return
    }

    public void addListener(java.util.EventListener r2) {
            r1 = this;
            java.util.concurrent.CopyOnWriteArrayList<java.util.EventListener> r0 = r1.__listeners
            r0.add(r2)
            return
    }

    public int getListenerCount() {
            r1 = this;
            java.util.concurrent.CopyOnWriteArrayList<java.util.EventListener> r0 = r1.__listeners
            int r0 = r0.size()
            return r0
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<java.util.EventListener> iterator() {
            r1 = this;
            java.util.concurrent.CopyOnWriteArrayList<java.util.EventListener> r0 = r1.__listeners
            java.util.Iterator r0 = r0.iterator()
            return r0
    }

    public void removeListener(java.util.EventListener r2) {
            r1 = this;
            java.util.concurrent.CopyOnWriteArrayList<java.util.EventListener> r0 = r1.__listeners
            r0.remove(r2)
            return
    }
}
