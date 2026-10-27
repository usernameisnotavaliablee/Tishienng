package net.sqlcipher;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class DefaultCursorWindowAllocation implements net.sqlcipher.CursorWindowAllocation {
    private long WindowAllocationUnbounded;
    private long initialAllocationSize;

    public DefaultCursorWindowAllocation() {
            r2 = this;
            r2.<init>()
            r0 = 1048576(0x100000, double:5.180654E-318)
            r2.initialAllocationSize = r0
            r0 = 0
            r2.WindowAllocationUnbounded = r0
            return
    }

    @Override // net.sqlcipher.CursorWindowAllocation
    public long getGrowthPaddingSize() {
            r2 = this;
            long r0 = r2.initialAllocationSize
            return r0
    }

    @Override // net.sqlcipher.CursorWindowAllocation
    public long getInitialAllocationSize() {
            r2 = this;
            long r0 = r2.initialAllocationSize
            return r0
    }

    @Override // net.sqlcipher.CursorWindowAllocation
    public long getMaxAllocationSize() {
            r2 = this;
            long r0 = r2.WindowAllocationUnbounded
            return r0
    }
}
