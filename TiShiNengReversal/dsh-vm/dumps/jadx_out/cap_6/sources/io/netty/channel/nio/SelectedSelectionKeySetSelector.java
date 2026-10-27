package io.netty.channel.nio;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class SelectedSelectionKeySetSelector extends java.nio.channels.Selector {
    private final java.nio.channels.Selector delegate;
    private final io.netty.channel.nio.SelectedSelectionKeySet selectionKeys;

    SelectedSelectionKeySetSelector(java.nio.channels.Selector r1, io.netty.channel.nio.SelectedSelectionKeySet r2) {
            r0 = this;
            r0.<init>()
            r0.delegate = r1
            r0.selectionKeys = r2
            return
    }

    @Override // java.nio.channels.Selector, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            java.nio.channels.Selector r0 = r1.delegate
            r0.close()
            return
    }

    @Override // java.nio.channels.Selector
    public boolean isOpen() {
            r1 = this;
            java.nio.channels.Selector r0 = r1.delegate
            boolean r0 = r0.isOpen()
            return r0
    }

    @Override // java.nio.channels.Selector
    public java.util.Set<java.nio.channels.SelectionKey> keys() {
            r1 = this;
            java.nio.channels.Selector r0 = r1.delegate
            java.util.Set r0 = r0.keys()
            return r0
    }

    @Override // java.nio.channels.Selector
    public java.nio.channels.spi.SelectorProvider provider() {
            r1 = this;
            java.nio.channels.Selector r0 = r1.delegate
            java.nio.channels.spi.SelectorProvider r0 = r0.provider()
            return r0
    }

    @Override // java.nio.channels.Selector
    public int select() throws java.io.IOException {
            r1 = this;
            io.netty.channel.nio.SelectedSelectionKeySet r0 = r1.selectionKeys
            r0.reset()
            java.nio.channels.Selector r0 = r1.delegate
            int r0 = r0.select()
            return r0
    }

    @Override // java.nio.channels.Selector
    public int select(long r2) throws java.io.IOException {
            r1 = this;
            io.netty.channel.nio.SelectedSelectionKeySet r0 = r1.selectionKeys
            r0.reset()
            java.nio.channels.Selector r0 = r1.delegate
            int r2 = r0.select(r2)
            return r2
    }

    @Override // java.nio.channels.Selector
    public int selectNow() throws java.io.IOException {
            r1 = this;
            io.netty.channel.nio.SelectedSelectionKeySet r0 = r1.selectionKeys
            r0.reset()
            java.nio.channels.Selector r0 = r1.delegate
            int r0 = r0.selectNow()
            return r0
    }

    @Override // java.nio.channels.Selector
    public java.util.Set<java.nio.channels.SelectionKey> selectedKeys() {
            r1 = this;
            java.nio.channels.Selector r0 = r1.delegate
            java.util.Set r0 = r0.selectedKeys()
            return r0
    }

    @Override // java.nio.channels.Selector
    public java.nio.channels.Selector wakeup() {
            r1 = this;
            java.nio.channels.Selector r0 = r1.delegate
            java.nio.channels.Selector r0 = r0.wakeup()
            return r0
    }
}
