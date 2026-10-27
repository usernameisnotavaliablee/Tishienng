package net.sqlcipher;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class CustomCursorWindowAllocation implements net.sqlcipher.CursorWindowAllocation {
    private long growthPaddingSize;
    private long initialAllocationSize;
    private long maxAllocationSize;

    public CustomCursorWindowAllocation(long r1, long r3, long r5) {
            r0 = this;
            r0.<init>()
            r0.initialAllocationSize = r1
            r0.growthPaddingSize = r3
            r0.maxAllocationSize = r5
            return
    }

    @Override // net.sqlcipher.CursorWindowAllocation
    public long getGrowthPaddingSize() {
            r2 = this;
            long r0 = r2.growthPaddingSize
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
            long r0 = r2.maxAllocationSize
            return r0
    }
}
