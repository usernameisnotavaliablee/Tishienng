package io.netty.buffer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class PooledByteBufAllocatorMetric implements io.netty.buffer.ByteBufAllocatorMetric {
    private final io.netty.buffer.PooledByteBufAllocator allocator;

    PooledByteBufAllocatorMetric(io.netty.buffer.PooledByteBufAllocator r1) {
            r0 = this;
            r0.<init>()
            r0.allocator = r1
            return
    }

    public int chunkSize() {
            r1 = this;
            io.netty.buffer.PooledByteBufAllocator r0 = r1.allocator
            int r0 = r0.chunkSize()
            return r0
    }

    public java.util.List<io.netty.buffer.PoolArenaMetric> directArenas() {
            r1 = this;
            io.netty.buffer.PooledByteBufAllocator r0 = r1.allocator
            java.util.List r0 = r0.directArenas()
            return r0
    }

    public java.util.List<io.netty.buffer.PoolArenaMetric> heapArenas() {
            r1 = this;
            io.netty.buffer.PooledByteBufAllocator r0 = r1.allocator
            java.util.List r0 = r0.heapArenas()
            return r0
    }

    public int normalCacheSize() {
            r1 = this;
            io.netty.buffer.PooledByteBufAllocator r0 = r1.allocator
            int r0 = r0.normalCacheSize()
            return r0
    }

    public int numDirectArenas() {
            r1 = this;
            io.netty.buffer.PooledByteBufAllocator r0 = r1.allocator
            int r0 = r0.numDirectArenas()
            return r0
    }

    public int numHeapArenas() {
            r1 = this;
            io.netty.buffer.PooledByteBufAllocator r0 = r1.allocator
            int r0 = r0.numHeapArenas()
            return r0
    }

    public int numThreadLocalCaches() {
            r1 = this;
            io.netty.buffer.PooledByteBufAllocator r0 = r1.allocator
            int r0 = r0.numThreadLocalCaches()
            return r0
    }

    public int smallCacheSize() {
            r1 = this;
            io.netty.buffer.PooledByteBufAllocator r0 = r1.allocator
            int r0 = r0.smallCacheSize()
            return r0
    }

    public int tinyCacheSize() {
            r1 = this;
            io.netty.buffer.PooledByteBufAllocator r0 = r1.allocator
            int r0 = r0.tinyCacheSize()
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 256(0x100, float:3.59E-43)
            r0.<init>(r1)
            java.lang.String r1 = io.netty.util.internal.StringUtil.simpleClassName(r3)
            r0.append(r1)
            java.lang.String r1 = "(usedHeapMemory: "
            r0.append(r1)
            long r1 = r3.usedHeapMemory()
            r0.append(r1)
            java.lang.String r1 = "; usedDirectMemory: "
            r0.append(r1)
            long r1 = r3.usedDirectMemory()
            r0.append(r1)
            java.lang.String r1 = "; numHeapArenas: "
            r0.append(r1)
            int r1 = r3.numHeapArenas()
            r0.append(r1)
            java.lang.String r1 = "; numDirectArenas: "
            r0.append(r1)
            int r1 = r3.numDirectArenas()
            r0.append(r1)
            java.lang.String r1 = "; tinyCacheSize: "
            r0.append(r1)
            int r1 = r3.tinyCacheSize()
            r0.append(r1)
            java.lang.String r1 = "; smallCacheSize: "
            r0.append(r1)
            int r1 = r3.smallCacheSize()
            r0.append(r1)
            java.lang.String r1 = "; normalCacheSize: "
            r0.append(r1)
            int r1 = r3.normalCacheSize()
            r0.append(r1)
            java.lang.String r1 = "; numThreadLocalCaches: "
            r0.append(r1)
            int r1 = r3.numThreadLocalCaches()
            r0.append(r1)
            java.lang.String r1 = "; chunkSize: "
            r0.append(r1)
            int r1 = r3.chunkSize()
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // io.netty.buffer.ByteBufAllocatorMetric
    public long usedDirectMemory() {
            r2 = this;
            io.netty.buffer.PooledByteBufAllocator r0 = r2.allocator
            long r0 = r0.usedDirectMemory()
            return r0
    }

    @Override // io.netty.buffer.ByteBufAllocatorMetric
    public long usedHeapMemory() {
            r2 = this;
            io.netty.buffer.PooledByteBufAllocator r0 = r2.allocator
            long r0 = r0.usedHeapMemory()
            return r0
    }
}
