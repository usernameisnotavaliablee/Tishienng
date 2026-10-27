package io.netty.buffer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface PoolArenaMetric {
    java.util.List<io.netty.buffer.PoolChunkListMetric> chunkLists();

    long numActiveAllocations();

    long numActiveBytes();

    long numActiveHugeAllocations();

    long numActiveNormalAllocations();

    long numActiveSmallAllocations();

    long numActiveTinyAllocations();

    long numAllocations();

    int numChunkLists();

    long numDeallocations();

    long numHugeAllocations();

    long numHugeDeallocations();

    long numNormalAllocations();

    long numNormalDeallocations();

    long numSmallAllocations();

    long numSmallDeallocations();

    int numSmallSubpages();

    int numThreadCaches();

    long numTinyAllocations();

    long numTinyDeallocations();

    int numTinySubpages();

    java.util.List<io.netty.buffer.PoolSubpageMetric> smallSubpages();

    java.util.List<io.netty.buffer.PoolSubpageMetric> tinySubpages();
}
